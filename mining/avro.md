# avro 
 
# Bad smells
I found 1310 bad smells with 80 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessarySuperQualifier | 180 | false |
| AssignmentToMethodParameter | 157 | false |
| ReturnNull | 97 | false |
| BoundedWildcard | 73 | false |
| ZeroLengthArrayInitialization | 50 | false |
| UnnecessaryFullyQualifiedName | 49 | false |
| SystemOutErr | 46 | false |
| RedundantFieldInitialization | 44 | false |
| MissortedModifiers | 38 | false |
| NestedAssignment | 30 | false |
| AccessStaticViaInstance | 28 | false |
| PublicFieldAccessedInSynchronizedContext | 27 | false |
| ConstantValue | 25 | false |
| StaticInitializerReferencesSubClass | 24 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 22 | false |
| EnumSwitchStatementWhichMissesCases | 21 | false |
| RedundantSuppression | 21 | false |
| PointlessArithmeticExpression | 17 | false |
| DuplicateBranchesInSwitch | 17 | false |
| NonShortCircuitBoolean | 17 | false |
| UtilityClassWithoutPrivateConstructor | 16 | true |
| UnusedAssignment | 15 | false |
| SizeReplaceableByIsEmpty | 14 | true |
| NonProtectedConstructorInAbstractClass | 13 | true |
| ReplaceAssignmentWithOperatorAssignment | 12 | false |
| DeprecatedIsStillUsed | 12 | false |
| DynamicRegexReplaceableByCompiledPattern | 12 | false |
| UnnecessaryLocalVariable | 10 | true |
| UnnecessarySemicolon | 9 | false |
| CatchMayIgnoreException | 9 | false |
| ProtectedMemberInFinalClass | 9 | true |
| AssignmentToForLoopParameter | 9 | false |
| SynchronizeOnNonFinalField | 9 | false |
| UnnecessaryModifier | 8 | true |
| IgnoreResultOfCall | 8 | false |
| MethodOverridesStaticMethod | 7 | false |
| AbstractClassNeverImplemented | 6 | false |
| EqualsAndHashcode | 6 | false |
| SynchronizeOnThis | 6 | false |
| DataFlowIssue | 6 | false |
| StringOperationCanBeSimplified | 6 | false |
| WrapperTypeMayBePrimitive | 5 | false |
| ShiftOutOfRange | 5 | false |
| NonSerializableFieldInSerializableClass | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| StringEqualsEmptyString | 5 | false |
| NegativeIntConstantInLongContext | 4 | false |
| ClassNameSameAsAncestorName | 4 | false |
| PointlessBitwiseExpression | 4 | false |
| RedundantImplements | 4 | false |
| InstanceofCatchParameter | 4 | false |
| NonFinalFieldOfException | 4 | false |
| IOResource | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| OptionalUsedAsFieldOrParameterType | 4 | false |
| StaticCallOnSubclass | 3 | false |
| ObjectNotify | 3 | false |
| UnnecessaryQualifierForThis | 3 | false |
| RedundantStringFormatCall | 3 | false |
| RedundantCollectionOperation | 3 | false |
| UnnecessaryBoxing | 3 | false |
| ObsoleteCollection | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| CallToStringConcatCanBeReplacedByOperator | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| UnnecessaryInitCause | 2 | false |
| MissingDeprecatedAnnotation | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| CopyConstructorMissesField | 2 | false |
| RedundantFileCreation | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| Java8ListReplaceAll | 1 | false |
| TrivialStringConcatenation | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| InfiniteLoopStatement | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| ArrayEquality | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| FieldMayBeStatic | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| Java8MapApi | 1 | false |
| Convert2Lambda | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| WaitNotInLoop | 1 | false |
| ThreadStartInConstruction | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (schema.getType()) { case RECORD: return conversion.toRecord(fromClass.cast(dat...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'UNION', and 'NULL'
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
    try {
      Class<T> fromClass = conversion.getConvertedType();
      switch (schema.getType()) {
      case RECORD:
        return conversion.toRecord(fromClass.cast(datum), schema, type);
      case ENUM:
        return conversion.toEnumSymbol(fromClass.cast(datum), schema, type);
      case ARRAY:
        return conversion.toArray(fromClass.cast(datum), schema, type);
      case MAP:
        return conversion.toMap(fromClass.cast(datum), schema, type);
      case FIXED:
        return conversion.toFixed(fromClass.cast(datum), schema, type);
      case STRING:
        return conversion.toCharSequence(fromClass.cast(datum), schema, type);
      case BYTES:
        return conversion.toBytes(fromClass.cast(datum), schema, type);
      case INT:
        return conversion.toInt(fromClass.cast(datum), schema, type);
      case LONG:
        return conversion.toLong(fromClass.cast(datum), schema, type);
      case FLOAT:
        return conversion.toFloat(fromClass.cast(datum), schema, type);
      case DOUBLE:
        return conversion.toDouble(fromClass.cast(datum), schema, type);
      case BOOLEAN:
        return conversion.toBoolean(fromClass.cast(datum), schema, type);
      }
      return datum;
    } catch (ClassCastException e) {
```

### EnumSwitchStatementWhichMissesCases
`switch (schema.getType()) { case RECORD: return conversion.fromRecord((IndexedRecord) ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'UNION', and 'NULL'
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java

    try {
      switch (schema.getType()) {
      case RECORD:
        return conversion.fromRecord((IndexedRecord) datum, schema, type);
      case ENUM:
        return conversion.fromEnumSymbol((GenericEnumSymbol) datum, schema, type);
      case ARRAY:
        return conversion.fromArray((Collection) datum, schema, type);
      case MAP:
        return conversion.fromMap((Map<?, ?>) datum, schema, type);
      case FIXED:
        return conversion.fromFixed((GenericFixed) datum, schema, type);
      case STRING:
        return conversion.fromCharSequence((CharSequence) datum, schema, type);
      case BYTES:
        return conversion.fromBytes((ByteBuffer) datum, schema, type);
      case INT:
        return conversion.fromInt((Integer) datum, schema, type);
      case LONG:
        return conversion.fromLong((Long) datum, schema, type);
      case FLOAT:
        return conversion.fromFloat((Float) datum, schema, type);
      case DOUBLE:
        return conversion.fromDouble((Double) datum, schema, type);
      case BOOLEAN:
        return conversion.fromBoolean((Boolean) datum, schema, type);
      }
      return datum;
    } catch (ClassCastException e) {
```

### EnumSwitchStatementWhichMissesCases
`switch (r.getType()) { case LONG: switch (wt) { case INT: return tr...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
        throw new IllegalArgumentException("Only use when reader and writer are different.");
      Schema.Type wt = w.getType();
      switch (r.getType()) {

      case LONG:
        switch (wt) {
        case INT:
          return true;
        }
        break;
      case FLOAT:
        switch (wt) {
        case INT:
        case LONG:
          return true;
        }
        break;
      case DOUBLE:
        switch (wt) {
        case INT:
        case LONG:
        case FLOAT:
          return true;
        }
        break;
      case BYTES:
      case STRING:
        switch (wt) {
        case STRING:
        case BYTES:
          return true;
        }
        break;
      }
      return false;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (wt) { case INT: return true; }` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java

      case LONG:
        switch (wt) {
        case INT:
          return true;
        }
        break;
      case FLOAT:
```

### EnumSwitchStatementWhichMissesCases
`switch (wt) { case INT: case LONG: return true; }` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
        break;
      case FLOAT:
        switch (wt) {
        case INT:
        case LONG:
          return true;
        }
        break;
      case DOUBLE:
```

### EnumSwitchStatementWhichMissesCases
`switch (wt) { case INT: case LONG: case FLOAT: return true; ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
        break;
      case DOUBLE:
        switch (wt) {
        case INT:
        case LONG:
        case FLOAT:
          return true;
        }
        break;
      case BYTES:
```

### EnumSwitchStatementWhichMissesCases
`switch (wt) { case STRING: case BYTES: return true; }` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
      case BYTES:
      case STRING:
        switch (wt) {
        case STRING:
        case BYTES:
          return true;
        }
        break;
      }
```

### EnumSwitchStatementWhichMissesCases
`switch (vt) { case INT: switch (b.getType()) { case LONG: case...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
      j = 0;
      for (Schema b : r.getTypes()) {
        switch (vt) {
        case INT:
          switch (b.getType()) {
          case LONG:
          case DOUBLE:
          case FLOAT:
            return j;
          }
          break;
        case LONG:
          switch (b.getType()) {
          case DOUBLE:
          case FLOAT:
            return j;
          }
          break;
        case FLOAT:
          switch (b.getType()) {
          case DOUBLE:
            return j;
          }
          break;
        case STRING:
          switch (b.getType()) {
          case BYTES:
            return j;
          }
          break;
        case BYTES:
          switch (b.getType()) {
          case STRING:
            return j;
          }
          break;
        }
        j++;
      }
```

### EnumSwitchStatementWhichMissesCases
`switch (b.getType()) { case LONG: case DOUBLE: case FLOAT: ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
        switch (vt) {
        case INT:
          switch (b.getType()) {
          case LONG:
          case DOUBLE:
          case FLOAT:
            return j;
          }
          break;
        case LONG:
```

### EnumSwitchStatementWhichMissesCases
`switch (b.getType()) { case DOUBLE: case FLOAT: return j; ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
          break;
        case LONG:
          switch (b.getType()) {
          case DOUBLE:
          case FLOAT:
            return j;
          }
          break;
        case FLOAT:
```

### EnumSwitchStatementWhichMissesCases
`switch (b.getType()) { case DOUBLE: return j; }` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
          break;
        case FLOAT:
          switch (b.getType()) {
          case DOUBLE:
            return j;
          }
          break;
        case STRING:
```

### EnumSwitchStatementWhichMissesCases
`switch (b.getType()) { case BYTES: return j; }` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
          break;
        case STRING:
          switch (b.getType()) {
          case BYTES:
            return j;
          }
          break;
        case BYTES:
```

### EnumSwitchStatementWhichMissesCases
`switch (b.getType()) { case STRING: return j; }` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
          break;
        case BYTES:
          switch (b.getType()) {
          case STRING:
            return j;
          }
          break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (schema.getType()) { case STRING: stringClass = getPropAsClass(schema, SpecificData...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'UNION', 'FIXED', ...
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificDatumReader.java`
#### Snippet
```java
  protected Class findStringClass(Schema schema) {
    Class stringClass = null;
    switch (schema.getType()) {
    case STRING:
      stringClass = getPropAsClass(schema, SpecificData.CLASS_PROP);
      break;
    case MAP:
      stringClass = getPropAsClass(schema, SpecificData.KEY_CLASS_PROP);
      break;
    }
    if (stringClass != null)
      return stringClass;
```

### EnumSwitchStatementWhichMissesCases
`switch (s.getType()) { case ENUM: return model.createEnum(s.getEnumSymbols().get((Integer)...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ARRAY', 'MAP', 'UNION', 'STRING', ...
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnReader.java`
#### Snippet
```java
    Object v = values[column].nextValue();

    switch (s.getType()) {
    case ENUM:
      return model.createEnum(s.getEnumSymbols().get((Integer) v), s);
    case FIXED:
      return model.createFixed(null, ((ByteBuffer) v).array(), s);
    }

    return v;
```

### EnumSwitchStatementWhichMissesCases
`switch (s.getType()) { case STRING: if (value instanceof Utf8) // convert Utf8 to String ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ARRAY', 'MAP', 'UNION', 'BYTES', ...
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
  private void writeValue(Object value, Schema s, int column) throws IOException {

    switch (s.getType()) {
    case STRING:
      if (value instanceof Utf8) // convert Utf8 to String
        value = value.toString();
      break;
    case ENUM:
      if (value instanceof Enum)
        value = ((Enum) value).ordinal();
      else
        value = s.getEnumOrdinal(value.toString());
      break;
    case FIXED:
      value = ((GenericFixed) value).bytes();
      break;
    }
    writer.writeValue(value, column);
  }
```

### EnumSwitchStatementWhichMissesCases
`switch (s.getType()) { case ARRAY: if (!o1.getClass().isArray()) break; Sche...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'MAP', 'UNION', 'FIXED', ...
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
  @Override
  protected int compare(Object o1, Object o2, Schema s, boolean equals) {
    switch (s.getType()) {
    case ARRAY:
      if (!o1.getClass().isArray())
        break;
      Schema elementType = s.getElementType();
      int l1 = java.lang.reflect.Array.getLength(o1);
      int l2 = java.lang.reflect.Array.getLength(o2);
      int l = Math.min(l1, l2);
      for (int i = 0; i < l; i++) {
        int compare = compare(java.lang.reflect.Array.get(o1, i), java.lang.reflect.Array.get(o2, i), elementType,
            equals);
        if (compare != 0)
          return compare;
      }
      return Integer.compare(l1, l2);
    case BYTES:
      if (!o1.getClass().isArray())
        break;
      byte[] b1 = (byte[]) o1;
      byte[] b2 = (byte[]) o2;
      return BinaryData.compareBytes(b1, 0, b1.length, b2, 0, b2.length);
    }
    return super.compare(o1, o2, s, equals);
  }
```

### EnumSwitchStatementWhichMissesCases
`switch (from.getType()) { // only named types. case RECORD: case ENUM: case FIXED: ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'ARRAY', 'MAP', 'UNION', 'STRING', 'BYTES', ...
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/schema/Schemas.java`
#### Snippet
```java

  public static void copyAliases(final Schema from, final Schema to) {
    switch (from.getType()) { // only named types.
    case RECORD:
    case ENUM:
    case FIXED:
      Set<String> aliases = from.getAliases();
      for (String alias : aliases) {
        to.addAlias(alias);
      }
    }
  }

```

### EnumSwitchStatementWhichMissesCases
`switch (s.getType()) { case STRING: result = Schema.create(Schema.Type.STRING); if (...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'ENUM', 'FIXED', 'BYTES', 'INT', 'LONG', ...
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
      return seen.get(s); // break loops
    Schema result = s;
    switch (s.getType()) {
    case STRING:
      result = Schema.create(Schema.Type.STRING);
      if (s.getLogicalType() == null) {
        GenericData.setStringType(result, stringType);
      }
      break;
    case RECORD:
      result = Schema.createRecord(s.getFullName(), s.getDoc(), null, s.isError());
      for (String alias : s.getAliases())
        result.addAlias(alias, null); // copy aliases
      seen.put(s, result);
      List<Field> newFields = new ArrayList<>(s.getFields().size());
      for (Field f : s.getFields()) {
        Schema fSchema = addStringType(f.schema(), seen);
        Field newF = new Field(f, fSchema);
        newFields.add(newF);
      }
      result.setFields(newFields);
      break;
    case ARRAY:
      Schema e = addStringType(s.getElementType(), seen);
      result = Schema.createArray(e);
      break;
    case MAP:
      Schema v = addStringType(s.getValueType(), seen);
      result = Schema.createMap(v);
      GenericData.setStringType(result, stringType);
      break;
    case UNION:
      List<Schema> types = new ArrayList<>(s.getTypes().size());
      for (Schema branch : s.getTypes())
        types.add(addStringType(branch, seen));
      result = Schema.createUnion(types);
      break;
    }
    result.addAllProps(s);
    if (s.getLogicalType() != null) {
```

### EnumSwitchStatementWhichMissesCases
`switch (f.getType()) { case ENUM: value = ((EnumValueDescriptor) value).getName(); ...` statement on enum type 'com.google.protobuf.Descriptors.FieldDescriptor.Type' misses cases: 'DOUBLE', 'FLOAT', 'INT64', 'UINT64', 'INT32', ...
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtobufData.java`
#### Snippet
```java
    if (f.hasDefaultValue()) { // parse spec'd default value
      Object value = f.getDefaultValue();
      switch (f.getType()) {
      case ENUM:
        value = ((EnumValueDescriptor) value).getName();
        break;
      }
      String json = toString(value);
      try {
```

### EnumSwitchStatementWhichMissesCases
`switch (schema.getType()) { case RECORD: if (seen.containsKey(schema)) return; // ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'ENUM', 'FIXED', 'STRING', 'BYTES', 'INT', ...
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
          aliases.put(alias, namedSchema.name);
    }
    switch (schema.getType()) {
    case RECORD:
      if (seen.containsKey(schema))
        return; // break loops
      seen.put(schema, schema);
      RecordSchema record = (RecordSchema) schema;
      for (Field field : schema.getFields()) {
        if (field.aliases != null)
          for (String fieldAlias : field.aliases) {
            Map<String, String> recordAliases = fieldAliases.computeIfAbsent(record.name, k -> new HashMap<>());
            recordAliases.put(fieldAlias, field.name);
          }
        getAliases(field.schema, seen, aliases, fieldAliases);
      }
      if (record.aliases != null && fieldAliases.containsKey(record.name))
        for (Name recordAlias : record.aliases)
          fieldAliases.put(recordAlias, fieldAliases.get(record.name));
      break;
    case ARRAY:
      getAliases(schema.getElementType(), seen, aliases, fieldAliases);
      break;
    case MAP:
      getAliases(schema.getValueType(), seen, aliases, fieldAliases);
      break;
    case UNION:
      for (Schema s : schema.getTypes())
        getAliases(s, seen, aliases, fieldAliases);
      break;
    }
  }

```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java

      List<String> exargs = null;
      Boolean cached = false;

      if (line.hasOption("exec_args")) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileReadTool.java`
#### Snippet
```java

    OptionSet optionSet = optionParser.parse(args.toArray(new String[0]));
    Boolean pretty = optionSet.has(prettyOption);
    List<String> nargs = new ArrayList<>((List<String>) optionSet.nonOptionArguments());

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `lang/java/tools/src/main/java/org/apache/avro/tool/BinaryFragmentToJsonTool.java`
#### Snippet
```java

    OptionSet optionSet = optionParser.parse(args.toArray(new String[0]));
    Boolean noPretty = optionSet.has(noPrettyOption);
    List<String> nargs = (List<String>) optionSet.nonOptionArguments();
    String schemaFile = schemaFileOption.value(optionSet);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `lang/java/perf/src/main/java/org/apache/avro/perf/Perf.java`
#### Snippet
```java
    }

    final Integer measurementIterations = Integer.valueOf(cmd.getOptionValue("mi", "3"));
    final Integer warmupIterations = Integer.valueOf(cmd.getOptionValue("wi", "3"));

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `lang/java/perf/src/main/java/org/apache/avro/perf/Perf.java`
#### Snippet
```java

    final Integer measurementIterations = Integer.valueOf(cmd.getOptionValue("mi", "3"));
    final Integer warmupIterations = Integer.valueOf(cmd.getOptionValue("wi", "3"));

    final ChainedOptionsBuilder runOpt = new OptionsBuilder().mode(Mode.Throughput).timeout(TimeValue.seconds(60))
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `javaSourceDirectories` are read, but never written to
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java
   *            default-value="${basedir}/src/main/java"
   */
  private File[] javaSourceDirectories;

  /**
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java

  public interface ExecutionStep {
    public void execute(Object record, Decoder decoder) throws IOException;
  }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java
  public interface FieldReader extends DatumReader<Object> {
    @Override
    public Object read(Object reuse, Decoder decoder) throws IOException;

    public default boolean canReuse() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java
  public interface ReusingFieldReader extends FieldReader {
    @Override
    public default boolean canReuse() {
      return true;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java
    public Object read(Object reuse, Decoder decoder) throws IOException;

    public default boolean canReuse() {
      return false;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java

  public interface InstanceSupplier {
    public Object newInstance(Object oldInstance, Schema schema);
  }
}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ValueType.java`
#### Snippet
```java
  private final String name;

  private ValueType() {
    this.name = this.name().toLowerCase();
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java
  private static final ByteBuffer EMPTY = ByteBuffer.allocate(0);

  private static enum Status {
    START, CONTINUE, FAIL, COMPLETE
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    private final String name;

    private Type() {
      this.name = this.name().toLowerCase(Locale.ENGLISH);
    }
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`7 * 1` can be replaced with '7'
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
  public static int size(int n) {
    n = (n << 1) ^ (n >> 31); // move sign to low-order bit
    if (n <= (1 << (7 * 1)) - 1)
      return 1;
    if (n <= (1 << (7 * 2)) - 1)
```

### PointlessArithmeticExpression
`7 * 1` can be replaced with '7'
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
  public static int size(long n) {
    n = (n << 1) ^ (n >> 63); // move sign to low-order bit
    if (n <= (1 << (7 * 1)) - 1)
      return 1;
    if (n <= (1 << (7 * 2)) - 1)
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeBytes(state.testData[i + 0]);
      e.writeBytes(state.testData[i + 1]);
      e.writeBytes(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/DoubleTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeDouble(state.testData[i + 0]);
      e.writeDouble(state.testData[i + 1]);
      e.writeDouble(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeString(state.testData[i + 0]);
      e.writeString(state.testData[i + 1]);
      e.writeString(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/FloatTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeFloat(state.testData[i + 0]);
      e.writeFloat(state.testData[i + 1]);
      e.writeFloat(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i += 4) {
        // half fit in 1, half in 2
        testData[i + 0] = super.getRandom().nextLong() % 0x7FL;
        // half fit in <=3, half in 4
        testData[i + 1] = super.getRandom().nextLong() % 0x1FFFFFL;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeLong(state.testData[i + 0]);
      e.writeLong(state.testData[i + 1]);
      e.writeLong(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BooleanTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeBoolean(state.testData[i + 0]);
      e.writeBoolean(state.testData[i + 1]);
      e.writeBoolean(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.startItem();
      e.writeFloat(state.testData[i + 0]);
      e.writeFloat(state.testData[i + 1]);
      e.writeFloat(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeLong(state.testData[i + 0]);
      e.writeLong(state.testData[i + 1]);
      e.writeLong(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i += 4) {
        // fits in 1 byte
        testData[i + 0] = super.getRandom().nextInt(50);

        // fits in 2 bytes
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
    final Encoder e = state.encoder;
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      e.writeInt(state.testData[i + 0]);
      e.writeInt(state.testData[i + 1]);
      e.writeInt(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i += 4) {
        // fits in 1 byte
        testData[i + 0] = super.getRandom().nextInt(50);

        // fits in 2 bytes
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
      e.startItem();
      e.writeString(state.utf);
      e.writeFloat(state.testData[i + 0]);
      e.writeFloat(state.testData[i + 1]);
      e.writeFloat(state.testData[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
    GenericDatumWriter<Object> writer = new GenericDatumWriter<>(state.schema);
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      writer.write(state.testData[i + 0], e);
      writer.write(state.testData[i + 1], e);
      writer.write(state.testData[i + 2], e);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ExtendedEnumTest.java`
#### Snippet
```java
    GenericDatumWriter<Object> writer = new GenericDatumWriter<>(state.schema);
    for (int i = 0; i < state.getBatchSize(); i += 4) {
      writer.write(state.testData[i + 0], e);
      writer.write(state.testData[i + 1], e);
      writer.write(state.testData[i + 2], e);
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `addCacheFile()` declared in class 'org.apache.hadoop.mapreduce.filecache.DistributedCache' but referenced via subclass 'org.apache.hadoop.filecache.DistributedCache'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherJob.java`
#### Snippet
```java
    // determine whether the executable should be added to the cache.
    if (job.getBoolean(TETHER_EXEC_CACHED, false)) {
      DistributedCache.addCacheFile(getExecutable(job), job);
    }
  }
```

### StaticCallOnSubclass
Static method `getLocalCacheFiles()` declared in class 'org.apache.hadoop.mapreduce.filecache.DistributedCache' but referenced via subclass 'org.apache.hadoop.filecache.DistributedCache'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
    if (job.getBoolean(TetherJob.TETHER_EXEC_CACHED, false)) {
      // we want to use the cached executable
      Path[] localFiles = DistributedCache.getLocalCacheFiles(job);
      if (localFiles == null) { // until MAPREDUCE-476
        URI[] files = DistributedCache.getCacheFiles(job);
```

### StaticCallOnSubclass
Static method `getCacheFiles()` declared in class 'org.apache.hadoop.mapreduce.filecache.DistributedCache' but referenced via subclass 'org.apache.hadoop.filecache.DistributedCache'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
      Path[] localFiles = DistributedCache.getLocalCacheFiles(job);
      if (localFiles == null) { // until MAPREDUCE-476
        URI[] files = DistributedCache.getCacheFiles(job);
        localFiles = new Path[] { new Path(files[0].toString()) };
      }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
  /** Skip a binary-encoded long, returning the position after it. */
  public static int skipLong(final byte[] bytes, int start) {
    while ((bytes[start++] & 0x80) != 0) {
    }
    return start;
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol DOUBLE = new Symbol.Terminal("double");
  public static final Symbol STRING = new Symbol.Terminal("string");
  public static final Symbol BYTES = new Symbol.Terminal("bytes");
  public static final Symbol FIXED = new Symbol.Terminal("fixed");
  public static final Symbol ENUM = new Symbol.Terminal("enum");
```

### StaticInitializerReferencesSubClass
Referencing subclass WriterUnionAction from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol ITEM_END = new Symbol.Terminal("item-end");

  public static final Symbol WRITER_UNION_ACTION = writerUnionAction();

  /* a pseudo terminal used by parsers */
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol ARRAY_END = new Symbol.Terminal("array-end");
  public static final Symbol MAP_START = new Symbol.Terminal("map-start");
  public static final Symbol MAP_END = new Symbol.Terminal("map-end");
  public static final Symbol ITEM_END = new Symbol.Terminal("item-end");

```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

  public static final Symbol ARRAY_START = new Symbol.Terminal("array-start");
  public static final Symbol ARRAY_END = new Symbol.Terminal("array-end");
  public static final Symbol MAP_START = new Symbol.Terminal("map-start");
  public static final Symbol MAP_END = new Symbol.Terminal("map-end");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol ARRAY_START = new Symbol.Terminal("array-start");
  public static final Symbol ARRAY_END = new Symbol.Terminal("array-end");
  public static final Symbol MAP_START = new Symbol.Terminal("map-start");
  public static final Symbol MAP_END = new Symbol.Terminal("map-end");
  public static final Symbol ITEM_END = new Symbol.Terminal("item-end");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol FLOAT = new Symbol.Terminal("float");
  public static final Symbol DOUBLE = new Symbol.Terminal("double");
  public static final Symbol STRING = new Symbol.Terminal("string");
  public static final Symbol BYTES = new Symbol.Terminal("bytes");
  public static final Symbol FIXED = new Symbol.Terminal("fixed");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol BOOLEAN = new Symbol.Terminal("boolean");
  public static final Symbol INT = new Symbol.Terminal("int");
  public static final Symbol LONG = new Symbol.Terminal("long");
  public static final Symbol FLOAT = new Symbol.Terminal("float");
  public static final Symbol DOUBLE = new Symbol.Terminal("double");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol NULL = new Symbol.Terminal("null");
  public static final Symbol BOOLEAN = new Symbol.Terminal("boolean");
  public static final Symbol INT = new Symbol.Terminal("int");
  public static final Symbol LONG = new Symbol.Terminal("long");
  public static final Symbol FLOAT = new Symbol.Terminal("float");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol FIXED = new Symbol.Terminal("fixed");
  public static final Symbol ENUM = new Symbol.Terminal("enum");
  public static final Symbol UNION = new Symbol.Terminal("union");

  public static final Symbol ARRAY_START = new Symbol.Terminal("array-start");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol LONG = new Symbol.Terminal("long");
  public static final Symbol FLOAT = new Symbol.Terminal("float");
  public static final Symbol DOUBLE = new Symbol.Terminal("double");
  public static final Symbol STRING = new Symbol.Terminal("string");
  public static final Symbol BYTES = new Symbol.Terminal("bytes");
```

### StaticInitializerReferencesSubClass
Referencing subclass ImplicitAction from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol FIELD_END = new ImplicitAction(true);

  public static final Symbol DEFAULT_END_ACTION = new ImplicitAction(true);
  public static final Symbol MAP_KEY_MARKER = new Symbol.Terminal("map-key-marker");
}
```

### StaticInitializerReferencesSubClass
Referencing subclass ImplicitAction from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

  public static final Symbol RECORD_START = new ImplicitAction(false);
  public static final Symbol RECORD_END = new ImplicitAction(true);
  public static final Symbol UNION_END = new ImplicitAction(true);
  public static final Symbol FIELD_END = new ImplicitAction(true);
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
   * The terminal symbols for the grammar.
   */
  public static final Symbol NULL = new Symbol.Terminal("null");
  public static final Symbol BOOLEAN = new Symbol.Terminal("boolean");
  public static final Symbol INT = new Symbol.Terminal("int");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol BYTES = new Symbol.Terminal("bytes");
  public static final Symbol FIXED = new Symbol.Terminal("fixed");
  public static final Symbol ENUM = new Symbol.Terminal("enum");
  public static final Symbol UNION = new Symbol.Terminal("union");

```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol STRING = new Symbol.Terminal("string");
  public static final Symbol BYTES = new Symbol.Terminal("bytes");
  public static final Symbol FIXED = new Symbol.Terminal("fixed");
  public static final Symbol ENUM = new Symbol.Terminal("enum");
  public static final Symbol UNION = new Symbol.Terminal("union");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
   */
  public static final Symbol NULL = new Symbol.Terminal("null");
  public static final Symbol BOOLEAN = new Symbol.Terminal("boolean");
  public static final Symbol INT = new Symbol.Terminal("int");
  public static final Symbol LONG = new Symbol.Terminal("long");
```

### StaticInitializerReferencesSubClass
Referencing subclass ImplicitAction from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol RECORD_END = new ImplicitAction(true);
  public static final Symbol UNION_END = new ImplicitAction(true);
  public static final Symbol FIELD_END = new ImplicitAction(true);

  public static final Symbol DEFAULT_END_ACTION = new ImplicitAction(true);
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

  /* a pseudo terminal used by parsers */
  public static final Symbol FIELD_ACTION = new Symbol.Terminal("field-action");

  public static final Symbol RECORD_START = new ImplicitAction(false);
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol MAP_START = new Symbol.Terminal("map-start");
  public static final Symbol MAP_END = new Symbol.Terminal("map-end");
  public static final Symbol ITEM_END = new Symbol.Terminal("item-end");

  public static final Symbol WRITER_UNION_ACTION = writerUnionAction();
```

### StaticInitializerReferencesSubClass
Referencing subclass ImplicitAction from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol RECORD_START = new ImplicitAction(false);
  public static final Symbol RECORD_END = new ImplicitAction(true);
  public static final Symbol UNION_END = new ImplicitAction(true);
  public static final Symbol FIELD_END = new ImplicitAction(true);

```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

  public static final Symbol DEFAULT_END_ACTION = new ImplicitAction(true);
  public static final Symbol MAP_KEY_MARKER = new Symbol.Terminal("map-key-marker");
}

```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol UNION = new Symbol.Terminal("union");

  public static final Symbol ARRAY_START = new Symbol.Terminal("array-start");
  public static final Symbol ARRAY_END = new Symbol.Terminal("array-end");
  public static final Symbol MAP_START = new Symbol.Terminal("map-start");
```

### StaticInitializerReferencesSubClass
Referencing subclass Terminal from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol INT = new Symbol.Terminal("int");
  public static final Symbol LONG = new Symbol.Terminal("long");
  public static final Symbol FLOAT = new Symbol.Terminal("float");
  public static final Symbol DOUBLE = new Symbol.Terminal("double");
  public static final Symbol STRING = new Symbol.Terminal("string");
```

### StaticInitializerReferencesSubClass
Referencing subclass ImplicitAction from superclass Symbol initializer might lead to class loading deadlock
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
  public static final Symbol FIELD_ACTION = new Symbol.Terminal("field-action");

  public static final Symbol RECORD_START = new ImplicitAction(false);
  public static final Symbol RECORD_END = new ImplicitAction(true);
  public static final Symbol UNION_END = new ImplicitAction(true);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (27 lines)
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/Pair.java`
#### Snippet
```java
  }

  // private static final String[][] TABLE = new String[][] {
  // {"Object", "getSchema({0})"},
  // {"GenericContainer", "{0}.getSchema()"},
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
  private JsonParser in;
  private static JsonFactory jsonFactory = new JsonFactory();
  Stack<ReorderBuffer> reorderBuffers = new Stack<>();
  ReorderBuffer currentReorderBuffer;

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
  private JsonParser in;
  private static JsonFactory jsonFactory = new JsonFactory();
  Stack<ReorderBuffer> reorderBuffers = new Stack<>();
  ReorderBuffer currentReorderBuffer;

```

## RuleId[id=Java8ListReplaceAll]
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
   */
  protected static List<String> escapeStringArray(List<String> input) {
    for (int i = 0; i < input.size(); i++) {
      input.set(i, "\"" + input.get(i).replace("\"", "\\\"") + "\"");
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
          return result.mergedWith(typeMismatch(reader, writer, location));
        case BOOLEAN:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case INT:
          return result.mergedWith(typeMismatch(reader, writer, location));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
          return result.mergedWith(typeMismatch(reader, writer, location));
        case INT:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case LONG: {
          return (writer.getType() == Type.INT) ? result : result.mergedWith(typeMismatch(reader, writer, location));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java

        case ARRAY:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case MAP:
          return result.mergedWith(typeMismatch(reader, writer, location));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
          return result.mergedWith(typeMismatch(reader, writer, location));
        case MAP:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case FIXED:
          return result.mergedWith(typeMismatch(reader, writer, location));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
          return result.mergedWith(typeMismatch(reader, writer, location));
        case FIXED:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case ENUM:
          return result.mergedWith(typeMismatch(reader, writer, location));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
          return result.mergedWith(typeMismatch(reader, writer, location));
        case ENUM:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case RECORD:
          return result.mergedWith(typeMismatch(reader, writer, location));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
          return result.mergedWith(typeMismatch(reader, writer, location));
        case RECORD:
          return result.mergedWith(typeMismatch(reader, writer, location));
        case UNION: {
          for (final Schema readerBranch : reader.getTypes()) {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
      return ValueType.STRING;
    case ENUM:
      return ValueType.INT;
    case FIXED:
      return ValueType.BYTES;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
      return ValueType.INT;
    case FIXED:
      return ValueType.BYTES;
    default:
      throw new TrevniRuntimeException("Unknown schema: " + s);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return ByteBuffer.wrap(bytesCopy, 0, length);
    case DOUBLE:
      return value; // immutable
    case ENUM:
      return createEnum(value.toString(), schema);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return createFixed(null, ((GenericFixed) value).bytes(), schema);
    case FLOAT:
      return value; // immutable
    case INT:
      return value; // immutable
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return value; // immutable
    case INT:
      return value; // immutable
    case LONG:
      return value; // immutable
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return value; // immutable
    case LONG:
      return value; // immutable
    case MAP:
      Map<Object, Object> mapValue = (Map) value;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/tools/src/main/java/org/apache/avro/tool/TrevniToJsonTool.java`
#### Snippet
```java
      break;
    case FIXED32:
      generator.writeNumber((Integer) value);
      break;
    case FIXED64:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/tools/src/main/java/org/apache/avro/tool/TrevniToJsonTool.java`
#### Snippet
```java
      break;
    case FIXED64:
      generator.writeNumber((Long) value);
      break;
    case FLOAT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
      return hasErrors(symbol, symbol.production, visited);
    case TERMINAL:
      return false;
    default:
      throw new RuntimeException("unknown symbol kind: " + symbol.kind);
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/schema/Schemas.java`
#### Snippet
```java
      break;
    case SKIP_SUBTREE:
      throw new UnsupportedOperationException("Invalid action " + action + " for " + schema);
    case SKIP_SIBLINGS:
      while (!dq.isEmpty() && dq.getLast() instanceof Schema) {
```

## RuleId[id=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    LOG.info("got task complete");
    complete = true;
    notify();
  }

```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    LOG.info("got input port from child: inputport=" + inputPort);
    this.inputPort = inputPort;
    notify();
  }

```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    LOG.warn("Failing: " + message);
    error = message;
    notify();
  }

```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `Segment` on 'this' is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
          @SuppressWarnings("unchecked")
          Entry<K, V> newEntry = new Entry<>((K) key, value);
          Reference<K, V> newReference = Segment.this.referenceManager.createReference(newEntry, hash, head);
          Segment.this.references[index] = newReference;
          Segment.this.count.incrementAndGet();
```

### UnnecessaryQualifierForThis
Qualifier `Segment` on 'this' is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
          Entry<K, V> newEntry = new Entry<>((K) key, value);
          Reference<K, V> newReference = Segment.this.referenceManager.createReference(newEntry, hash, head);
          Segment.this.references[index] = newReference;
          Segment.this.count.incrementAndGet();
        };
```

### UnnecessaryQualifierForThis
Qualifier `Segment` on 'this' is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
          Reference<K, V> newReference = Segment.this.referenceManager.createReference(newEntry, hash, head);
          Segment.this.references[index] = newReference;
          Segment.this.count.incrementAndGet();
        };
        return task.execute(ref, entry, entries);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`0 == string.length()` can be replaced with 'string.isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryEncoder.java`
#### Snippet
```java
  @Override
  public void writeString(String string) throws IOException {
    if (0 == string.length()) {
      writeZero();
      return;
```

### SizeReplaceableByIsEmpty
`args.size() == 0` can be replaced with 'args.isEmpty()'
in `lang/java/tools/src/main/java/org/apache/avro/tool/InduceSchemaTool.java`
#### Snippet
```java
  @Override
  public int run(InputStream in, PrintStream out, PrintStream err, List<String> args) throws Exception {
    if (args.size() == 0 || args.size() > 2) {
      System.err.println("Usage: [colon-delimited-classpath] classname");
      return 1;
```

### SizeReplaceableByIsEmpty
`nargs.size() > 0` can be replaced with '!nargs.isEmpty()'
in `lang/java/tools/src/main/java/org/apache/avro/tool/RecodecTool.java`
#### Snippet
```java
    InputStream input = in;
    boolean inputNeedsClosing = false;
    if (nargs.size() > 0 && !nargs.get(0).equals("-")) {
      input = Util.openFromFS(nargs.get(0));
      inputNeedsClosing = true;
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `lang/java/tools/src/main/java/org/apache/avro/tool/TrevniToJsonTool.java`
#### Snippet
```java
        Object value = in.nextValue();
        List<ColumnMetaData> children = column.getChildren();
        if (children.size() == 0) {
          primitiveToJson(column, value);
        } else {
```

### SizeReplaceableByIsEmpty
`m.size() > 0` can be replaced with '!m.isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
    if (datum instanceof Map) {
      Map m = (Map) datum;
      if (m.size() > 0) {
        Class keyClass = m.keySet().iterator().next().getClass();
        return !isStringable(keyClass) && !isStringType(keyClass);
```

### SizeReplaceableByIsEmpty
`headValues.size() > 0` can be replaced with '!headValues.isEmpty()'
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileReadTool.java`
#### Snippet
```java
      headCount = DEFAULT_HEAD_COUNT;
      List<String> headValues = optionSet.valuesOf(headOption);
      if (headValues.size() > 0) {
        // if the value parses to int, assume it's meant to go with --head
        // otherwise assume it was an optionSet.nonOptionArgument and add back to the
```

### SizeReplaceableByIsEmpty
`fileSet.size() > 0` can be replaced with '!fileSet.isEmpty()'
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    }

    if (fileSet.size() > 0) {
      System.err.println("Input files to compile:");
      for (File file : fileSet) {
```

### SizeReplaceableByIsEmpty
`namedOutput.length() == 0` can be replaced with 'namedOutput.isEmpty()'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  private static void checkTokenName(String namedOutput) {
    if (namedOutput == null || namedOutput.length() == 0) {
      throw new IllegalArgumentException("Name cannot be NULL or empty");
    }
```

### SizeReplaceableByIsEmpty
`aparams[i].length() > 0` can be replaced with '!aparams\[i\].isEmpty()'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
      for (int i = 0; i < aparams.length; i++) {
        aparams[i] = aparams[i].trim();
        if (aparams[i].length() > 0) {
          command.add(aparams[i]);
        }
```

### SizeReplaceableByIsEmpty
`namedOutput.length() == 0` can be replaced with 'namedOutput.isEmpty()'
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  private static void checkTokenName(String namedOutput) {
    if (namedOutput == null || namedOutput.length() == 0) {
      throw new IllegalArgumentException("Name cannot be NULL or empty");
    }
```

### SizeReplaceableByIsEmpty
`filesets.size() == 0` can be replaced with 'filesets.isEmpty()'
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/ProtocolTask.java`
#### Snippet
```java
  @Override
  public void execute() {
    if (src == null && filesets.size() == 0)
      throw new BuildException("No file or fileset specified.");

```

### SizeReplaceableByIsEmpty
`f.aliases.size() != 0` can be replaced with '!f.aliases.isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        if (f.order() != Field.Order.ASCENDING)
          gen.writeStringField("order", f.order().name);
        if (f.aliases != null && f.aliases.size() != 0) {
          gen.writeFieldName("aliases");
          gen.writeStartArray();
```

### SizeReplaceableByIsEmpty
`aliases.size() == 0` can be replaced with 'aliases.isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    getAliases(reader, seen, aliases, fieldAliases);

    if (aliases.size() == 0 && fieldAliases.size() == 0)
      return writer; // no aliases

```

### SizeReplaceableByIsEmpty
`fieldAliases.size() == 0` can be replaced with 'fieldAliases.isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    getAliases(reader, seen, aliases, fieldAliases);

    if (aliases.size() == 0 && fieldAliases.size() == 0)
      return writer; // no aliases

```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `noAdj &= (i == adj[i])`
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
      noAdj = (adj.length <= rsymCount);
      for (int i = 0; noAdj && i < count; i++) {
        noAdj &= (i == adj[i]);
      }
      this.noAdjustmentsNeeded = noAdj;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= (i == readerOrder[i].pos())`
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
      boolean result = true;
      for (int i = 0; result && i < readerOrder.length; i++) {
        result &= (i == readerOrder[i].pos());
      }
      return result;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "b", b, false)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
    private boolean validate(FieldAccess access) throws Exception {
      boolean valid = true;
      valid &= validField(access, "b", b, false);
      valid &= validField(access, "by", by, (byte) 0xaf);
      valid &= validField(access, "c", c, 'C');
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "by", by, (byte) 0xaf)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      boolean valid = true;
      valid &= validField(access, "b", b, false);
      valid &= validField(access, "by", by, (byte) 0xaf);
      valid &= validField(access, "c", c, 'C');
      valid &= validField(access, "s", s, (short) 321);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "c", c, 'C')`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "b", b, false);
      valid &= validField(access, "by", by, (byte) 0xaf);
      valid &= validField(access, "c", c, 'C');
      valid &= validField(access, "s", s, (short) 321);
      valid &= validField(access, "i", i, 111);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "s", s, (short) 321)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "by", by, (byte) 0xaf);
      valid &= validField(access, "c", c, 'C');
      valid &= validField(access, "s", s, (short) 321);
      valid &= validField(access, "i", i, 111);
      valid &= validField(access, "l", l, 54321L);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "i", i, 111)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "c", c, 'C');
      valid &= validField(access, "s", s, (short) 321);
      valid &= validField(access, "i", i, 111);
      valid &= validField(access, "l", l, 54321L);
      valid &= validField(access, "f", f, 0.2f);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "l", l, 54321L)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "s", s, (short) 321);
      valid &= validField(access, "i", i, 111);
      valid &= validField(access, "l", l, 54321L);
      valid &= validField(access, "f", f, 0.2f);
      valid &= validField(access, "d", d, 0.4d);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "f", f, 0.2f)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "i", i, 111);
      valid &= validField(access, "l", l, 54321L);
      valid &= validField(access, "f", f, 0.2f);
      valid &= validField(access, "d", d, 0.4d);
      valid &= validField(access, "o", o, new Object());
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "d", d, 0.4d)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "l", l, 54321L);
      valid &= validField(access, "f", f, 0.2f);
      valid &= validField(access, "d", d, 0.4d);
      valid &= validField(access, "o", o, new Object());
      valid &= validField(access, "i2", i2, -555);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "o", o, new Object())`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "f", f, 0.2f);
      valid &= validField(access, "d", d, 0.4d);
      valid &= validField(access, "o", o, new Object());
      valid &= validField(access, "i2", i2, -555);
      return valid;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= validField(access, "i2", i2, -555)`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      valid &= validField(access, "d", d, 0.4d);
      valid &= validField(access, "o", o, new Object());
      valid &= validField(access, "i2", i2, -555);
      return valid;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `valid &= !original.equals(a.get(this))`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      boolean valid = original.equals(a.get(this));
      a.set(this, toSet);
      valid &= !original.equals(a.get(this));
      return valid;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `noAdj &= ((adjustments[i] instanceof Integer) && i == (Integer) adjustments[i])`
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
        noAdj = (adjustments.length <= rsymCount);
        for (int i = 0; noAdj && i < count; i++)
          noAdj &= ((adjustments[i] instanceof Integer) && i == (Integer) adjustments[i]);
      }
      this.noAdjustments = noAdj;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `noReorder &= (i == fields[i].pos())`
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
      boolean noReorder = true;
      for (int i = 0; noReorder && i < fields.length; i++)
        noReorder &= (i == fields[i].pos());
      this.noReorder = noReorder;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= isCustomCodable(f.schema(), seen)`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
    case RECORD:
      for (Schema.Field f : schema.getFields())
        result &= isCustomCodable(f.schema(), seen);
      break;
    case MAP:
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= isCustomCodable(s, seen)`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
        return false;
      for (Schema s : types)
        result &= isCustomCodable(s, seen);
      break;
    default:
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `lang/java/avro/src/main/java/org/apache/avro/util/RandomData.java`
#### Snippet
```java
      int length = (random.nextInt(5) + 2) - d;
      @SuppressWarnings("rawtypes")
      GenericArray<Object> array = new GenericData.Array(length <= 0 ? 0 : length, schema);
      for (int i = 0; i < length; i++)
        array.add(generate(schema.getElementType(), random, d + 1));
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `lang/java/avro/src/main/java/org/apache/avro/util/RandomData.java`
#### Snippet
```java
    case MAP:
      length = (random.nextInt(5) + 2) - d;
      Map<Object, Object> map = new HashMap<>(length <= 0 ? 0 : length);
      for (int i = 0; i < length; i++) {
        map.put(randomString(random, 40), generate(schema.getValueType(), random, d + 1));
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
      Schema schema = fileReader.getSchema();
      String codecStr = fileReader.getMetaString(DataFileConstants.CODEC);
      CodecFactory codecFactory = CodecFactory.fromString("" + codecStr);
      List<String> metas = fileReader.getMetaKeys();
      if (recoverPrior || recoverAfter) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `EncoderFactoryAccessor` has no concrete subclass
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/Accessor.java`
#### Snippet
```java
  }

  public abstract static class EncoderFactoryAccessor {
    protected abstract JsonEncoder jsonEncoder(EncoderFactory factory, Schema schema, JsonGenerator gen)
        throws IOException;
```

### AbstractClassNeverImplemented
Abstract class `SpecificErrorBuilderBase` has no concrete subclass
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificErrorBuilderBase.java`
#### Snippet
```java
 * thread-safe.
 */
abstract public class SpecificErrorBuilderBase<T extends SpecificExceptionBase> extends RecordBuilderBase<T>
    implements ErrorBuilder<T> {
  private Constructor<T> errorConstructor;
```

### AbstractClassNeverImplemented
Abstract class `SpecificFixed` has no concrete subclass
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificFixed.java`
#### Snippet
```java

/** Base class for generated fixed-sized data classes. */
public abstract class SpecificFixed implements GenericFixed, Comparable<SpecificFixed>, Externalizable {

  private byte[] bytes;
```

### AbstractClassNeverImplemented
Abstract class `SpecificExceptionBase` has no concrete subclass
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificExceptionBase.java`
#### Snippet
```java

/** Base class for specific exceptions. */
public abstract class SpecificExceptionBase extends AvroRemoteException implements SpecificRecord, Externalizable {

  public SpecificExceptionBase() {
```

### AbstractClassNeverImplemented
Abstract class `AvroGrpcClient` has no concrete subclass
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcClient.java`
#### Snippet
```java

/** Component that sets up a gRPC client for Avro's IDL and Serialization. */
public abstract class AvroGrpcClient {

  private AvroGrpcClient() {
```

### AbstractClassNeverImplemented
Abstract class `AvroGrpcServer` has no concrete subclass
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcServer.java`
#### Snippet
```java
 * Provides components to set up a gRPC Server for Avro's IDL and serialization.
 */
public abstract class AvroGrpcServer {

  private AvroGrpcServer() {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaNormalization.java`
#### Snippet
```java
  }

  private static Appendable build(Map<String, String> env, Schema s, Appendable o) throws IOException {
    boolean firstTime = true;
    Schema.Type st = s.getType();
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `lang/java/avro/src/main/java/org/apache/avro/ValidateAll.java`
#### Snippet
```java

  @Override
  public void validate(Schema toValidate, Iterable<Schema> schemasInOrder) throws SchemaValidationException {
    for (Schema existing : schemasInOrder) {
      strategy.validate(toValidate, existing);
```

### BoundedWildcard
Can generalize to `? super String`
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
  }

  public void forEachProperty(BiConsumer<String, Object> consumer) {
    for (Map.Entry<String, JsonNode> entry : this.props.entrySet()) {
      final Object value = JacksonUtils.toObject(entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `lang/java/avro/src/main/java/org/apache/avro/Protocol.java`
#### Snippet
```java

  /** Set the types of this protocol. */
  public void setTypes(Collection<Schema> newTypes) {
    types = new Schema.Names();
    for (Schema s : newTypes)
```

### BoundedWildcard
Can generalize to `? super LitS`
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/ValidatingGrammarGenerator.java`
#### Snippet
```java
   * @return The start symbol for the schema
   */
  public Symbol generate(Schema sc, Map<LitS, Symbol> seen) {
    switch (sc.getType()) {
    case NULL:
```

### BoundedWildcard
Can generalize to `? super SeenPair`
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
  }

  private static boolean unionEquiv(Schema write, Schema read, Map<SeenPair, Boolean> seen) {
    final Schema.Type wt = write.getType();
    if (wt != read.getType()) {
```

### BoundedWildcard
Can generalize to `? extends R`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    private final PropBuilder<?> assembler;

    private NestedCompletion(PropBuilder<?> assembler, Completion<R> context) {
      this.context = context;
      this.assembler = assembler;
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    private final List<Schema> schemas;

    private UnionCompletion(Completion<R> context, NameContext names, List<Schema> schemas) {
      this.context = context;
      this.names = names;
```

### BoundedWildcard
Can generalize to `? extends R`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    private final Completion<R> context;

    private NullableCompletion(Completion<R> context) {
      this.context = context;
    }
```

### BoundedWildcard
Can generalize to `? extends R`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    private final Schema record;

    private FieldAssembler(Completion<R> context, NameContext names, Schema record) {
      this.context = context;
      this.names = names;
```

### BoundedWildcard
Can generalize to `? extends R`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    private final Schema immutable;

    protected PrimitiveBuilder(Completion<R> context, NameContext names, Schema.Type type) {
      this.context = context;
      this.immutable = names.getFullname(type.getName());
```

### BoundedWildcard
Can generalize to `? super D`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileWriter.java`
#### Snippet
```java

  /** Construct a writer, not yet open. */
  public DataFileWriter(DatumWriter<D> dout) {
    this.dout = dout;
  }
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/avro/src/main/java/org/apache/avro/util/ByteBufferOutputStream.java`
#### Snippet
```java

  /** Prepend a list of ByteBuffers to this stream. */
  public void prepend(List<ByteBuffer> lists) {
    for (Buffer buffer : lists) {
      buffer.position(buffer.limit());
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/avro/src/main/java/org/apache/avro/util/ByteBufferOutputStream.java`
#### Snippet
```java

  /** Append a list of ByteBuffers to this stream. */
  public void append(List<ByteBuffer> lists) {
    for (Buffer buffer : lists) {
      buffer.position(buffer.limit());
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/avro/src/main/java/org/apache/avro/util/ByteBufferInputStream.java`
#### Snippet
```java
  private int current;

  public ByteBufferInputStream(List<ByteBuffer> buffers) {
    this.buffers = buffers;
  }
```

### BoundedWildcard
Can generalize to `? super K`
in `lang/java/avro/src/main/java/org/apache/avro/util/MapUtil.java`
#### Snippet
```java
   *      "https://bugs.openjdk.java.net/browse/JDK-8161372">JDK-8161372</a>
   */
  public static <K, V> V computeIfAbsent(ConcurrentMap<K, V> map, K key, Function<K, V> mappingFunction) {
    V value = map.get(key);
    if (value != null) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `lang/java/avro/src/main/java/org/apache/avro/util/MapUtil.java`
#### Snippet
```java
   *      "https://bugs.openjdk.java.net/browse/JDK-8161372">JDK-8161372</a>
   */
  public static <K, V> V computeIfAbsent(ConcurrentMap<K, V> map, K key, Function<K, V> mappingFunction) {
    V value = map.get(key);
    if (value != null) {
```

### BoundedWildcard
Can generalize to `? super Class`
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/ClassValueCache.java`
#### Snippet
```java
  };

  public ClassValueCache(Function<Class<?>, R> ifAbsent) {
    this.ifAbsent = ifAbsent;
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/ClassValueCache.java`
#### Snippet
```java
  };

  public ClassValueCache(Function<Class<?>, R> ifAbsent) {
    this.ifAbsent = ifAbsent;
  }
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
    private final Function<Schema, Class> findStringClass;

    public ReaderCache(Function<Schema, Class> findStringClass) {
      this.findStringClass = findStringClass;
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
      @Override
      @Nullable
      protected V execute(@Nullable Reference<K, V> ref, @Nullable Entry<K, V> entry, @Nullable Entries<V> entries) {
        if (entry != null) {
          V oldValue = entry.getValue();
```

### BoundedWildcard
Can generalize to `? super V`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
    Boolean result = doTask(key, new Task<Boolean>(TaskOption.RESTRUCTURE_BEFORE, TaskOption.SKIP_IF_EMPTY) {
      @Override
      protected Boolean execute(@Nullable Reference<K, V> ref, @Nullable Entry<K, V> entry) {
        if (entry != null && ObjectUtils.nullSafeEquals(entry.getValue(), oldValue)) {
          entry.setValue(newValue);
```

### BoundedWildcard
Can generalize to `? extends V`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
      @Override
      @Nullable
      protected V execute(@Nullable Reference<K, V> ref, @Nullable Entry<K, V> entry) {
        if (entry != null) {
          if (ref != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
  /** Create the schema for a Java type. */
  @SuppressWarnings(value = "unchecked")
  protected Schema createSchema(java.lang.reflect.Type type, Map<String, Schema> names) {
    if (type instanceof Class && CharSequence.class.isAssignableFrom((Class) type))
      return Schema.create(Type.STRING);
```

### BoundedWildcard
Can generalize to `? super String`
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileReadTool.java`
#### Snippet
```java
  }

  private static long getHeadCount(OptionSet optionSet, OptionSpec<String> headOption, List<String> nargs) {
    long headCount = Long.MAX_VALUE;
    if (optionSet.has(headOption)) {
```

### BoundedWildcard
Can generalize to `? super Class`
in `lang/java/android/src/main/java/org/apache/avro/util/internal/ClassValueCache.java`
#### Snippet
```java
   *                 class instance.
   */
  public ClassValueCache(Function<Class<?>, R> ifAbsent) {
    this.ifAbsent = ifAbsent;
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `lang/java/android/src/main/java/org/apache/avro/util/internal/ClassValueCache.java`
#### Snippet
```java
   *                 class instance.
   */
  public ClassValueCache(Function<Class<?>, R> ifAbsent) {
    this.ifAbsent = ifAbsent;
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerializer.java`
#### Snippet
```java
   * @param datumWriter  The datum writer to use for serialization.
   */
  public AvroSerializer(Schema writerSchema, DatumWriter<T> datumWriter) {
    if (null == writerSchema) {
      throw new IllegalArgumentException("Writer schema may not be null");
```

### BoundedWildcard
Can generalize to `? extends File`
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
   * @return Unique array of files
   */
  private static File[] determineInputs(List<File> inputs, FilenameFilter filter) {
    Set<File> fileSet = new LinkedHashSet<>(); // preserve order and uniqueness

```

### BoundedWildcard
Can generalize to `? super OUT`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMapper.java`
#### Snippet
```java
  /** Called with each map input datum. By default, collects inputs. */
  @SuppressWarnings("unchecked")
  public void map(IN datum, AvroCollector<OUT> collector, Reporter reporter) throws IOException {
    collector.collect((OUT) datum);
  }
```

### BoundedWildcard
Can generalize to `? super ByteBuffer`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroTextOutputFormat.java`
#### Snippet
```java
    private final byte[] keyValueSeparator;

    public AvroTextRecordWriter(DataFileWriter<ByteBuffer> writer, byte[] keyValueSeparator) {
      this.writer = writer;
      this.keyValueSeparator = keyValueSeparator;
```

### BoundedWildcard
Can generalize to `? super KO`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/MapCollector.java`
#### Snippet
```java
  private boolean isMapOnly;

  public MapCollector(OutputCollector<KO, VO> collector, boolean isMapOnly) {
    this.collector = collector;
    this.isMapOnly = isMapOnly;
```

### BoundedWildcard
Can generalize to `? super VO`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/MapCollector.java`
#### Snippet
```java
  private boolean isMapOnly;

  public MapCollector(OutputCollector<KO, VO> collector, boolean isMapOnly) {
    this.collector = collector;
    this.isMapOnly = isMapOnly;
```

### BoundedWildcard
Can generalize to `? super T`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroSerialization.java`
#### Snippet
```java
    private BinaryEncoder encoder;

    public AvroWrapperSerializer(DatumWriter<T> writer) {
      this.writer = writer;
    }
```

### BoundedWildcard
Can generalize to `? super AvroKey`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopCombiner.java`
#### Snippet
```java
    private OutputCollector<AvroKey<K>, AvroValue<V>> collector;

    public PairCollector(OutputCollector<AvroKey<K>, AvroValue<V>> collector) {
      this.collector = collector;
    }
```

### BoundedWildcard
Can generalize to `? super AvroValue`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopCombiner.java`
#### Snippet
```java
    private OutputCollector<AvroKey<K>, AvroValue<V>> collector;

    public PairCollector(OutputCollector<AvroKey<K>, AvroValue<V>> collector) {
      this.collector = collector;
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroReducer.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void reduce(K key, Iterable<V> values, AvroCollector<OUT> collector, Reporter reporter) throws IOException {
    if (outputPair == null)
      outputPair = new Pair<>(AvroJob.getOutputSchema(getConf()));
```

### BoundedWildcard
Can generalize to `? super OUT`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroReducer.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void reduce(K key, Iterable<V> values, AvroCollector<OUT> collector, Reporter reporter) throws IOException {
    if (outputPair == null)
      outputPair = new Pair<>(AvroJob.getOutputSchema(getConf()));
```

### BoundedWildcard
Can generalize to `? super AvroWrapper`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopReducer.java`
#### Snippet
```java
    private OutputCollector<AvroWrapper<OUT>, NullWritable> out;

    public ReduceCollector(OutputCollector<AvroWrapper<OUT>, NullWritable> out) {
      this.out = out;
    }
```

### BoundedWildcard
Can generalize to `? super NullWritable`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopReducer.java`
#### Snippet
```java
    private OutputCollector<AvroWrapper<OUT>, NullWritable> out;

    public ReduceCollector(OutputCollector<AvroWrapper<OUT>, NullWritable> out) {
      this.out = out;
    }
```

### BoundedWildcard
Can generalize to `? super TetherData`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  public static final long TIMEOUT = 10 * 1000;

  public TetherOutputService(OutputCollector<TetherData, NullWritable> collector, Reporter reporter) {
    this.reporter = reporter;
    this.collector = collector;
```

### BoundedWildcard
Can generalize to `? super NullWritable`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  public static final long TIMEOUT = 10 * 1000;

  public TetherOutputService(OutputCollector<TetherData, NullWritable> collector, Reporter reporter) {
    this.reporter = reporter;
    this.collector = collector;
```

### BoundedWildcard
Can generalize to `? super T`
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcClient.java`
#### Snippet
```java
      private final Callback<T> callback;

      CallbackToResponseStreamObserverAdpater(Callback<T> callback) {
        this.callback = callback;
      }
```

### BoundedWildcard
Can generalize to `? super K`
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroKeyValueRecordWriter.java`
#### Snippet
```java
   * @throws IOException If the record writer cannot be opened.
   */
  public AvroKeyValueRecordWriter(AvroDatumConverter<K, ?> keyConverter, AvroDatumConverter<V, ?> valueConverter,
      GenericData dataModel, CodecFactory compressionCodec, OutputStream outputStream, int syncInterval)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? super V`
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroKeyValueRecordWriter.java`
#### Snippet
```java
   * @throws IOException If the record writer cannot be opened.
   */
  public AvroKeyValueRecordWriter(AvroDatumConverter<K, ?> keyConverter, AvroDatumConverter<V, ?> valueConverter,
      GenericData dataModel, CodecFactory compressionCodec, OutputStream outputStream, int syncInterval)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/schema/Schemas.java`
#### Snippet
```java

  private static boolean visitNonTerminal(final SchemaVisitor visitor, final Schema schema, final Deque<Object> dq,
      final Iterable<Schema> itSupp) {
    SchemaVisitorAction action = visitor.visitNonTerminal(schema);
    switch (action) {
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/idl/ResolvingVisitor.java`
#### Snippet
```java
  private final Schema root;

  public ResolvingVisitor(final Schema root, final IdentityHashMap<Schema, Schema> replace,
      final Function<String, Schema> symbolTable) {
    this.replace = replace;
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/DatagramTransceiver.java`
#### Snippet
```java

  @Override
  public synchronized void writeBuffers(List<ByteBuffer> buffers) throws IOException {
    ((Buffer) buffer).clear();
    for (ByteBuffer b : buffers) {
```

### BoundedWildcard
Can generalize to `? super T`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/CallFuture.java`
#### Snippet
```java
   * @param chainedCallback the chained Callback to set.
   */
  public CallFuture(Callback<T> chainedCallback) {
    this.chainedCallback = chainedCallback;
  }
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketTransceiver.java`
#### Snippet
```java

  @Override
  public synchronized void writeBuffers(List<ByteBuffer> buffers) throws IOException {
    if (buffers == null)
      return; // no data to write
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/HttpTransceiver.java`
#### Snippet
```java
  }

  static int getLength(List<ByteBuffer> buffers) {
    int length = 0;
    for (ByteBuffer buffer : buffers) {
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/HttpTransceiver.java`
#### Snippet
```java
  }

  static void writeBuffers(List<ByteBuffer> buffers, OutputStream out) throws IOException {
    for (ByteBuffer buffer : buffers) {
      writeLength(buffer.limit(), out); // length-prefix
```

### BoundedWildcard
Can generalize to `? super List`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Transceiver.java`
#### Snippet
```java
   * messages using callbacks.
   */
  public void transceive(List<ByteBuffer> request, Callback<List<ByteBuffer>> callback) throws IOException {
    // The default implementation works synchronously
    try {
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
   * Helper to get the size of an RPC payload.
   */
  private int getPayloadSize(List<ByteBuffer> payload) {
    if (payload == null) {
      return 0;
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
  }

  private boolean isCustomCodable(Schema schema, Set<Schema> seen) {
    if (!seen.add(schema))
      return true;
```

### BoundedWildcard
Can generalize to `? super Conversion`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
  }

  private void collectUsedTypes(Schema schema, Set<Conversion<?>> conversionResults,
      Set<LogicalType> logicalTypeResults, Set<Schema> seenSchemas) {
    if (seenSchemas.contains(schema)) {
```

### BoundedWildcard
Can generalize to `? super LogicalType`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java

  private void collectUsedTypes(Schema schema, Set<Conversion<?>> conversionResults,
      Set<LogicalType> logicalTypeResults, Set<Schema> seenSchemas) {
    if (seenSchemas.contains(schema)) {
      return;
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java

  private void collectUsedTypes(Schema schema, Set<Conversion<?>> conversionResults,
      Set<LogicalType> logicalTypeResults, Set<Schema> seenSchemas) {
    if (seenSchemas.contains(schema)) {
      return;
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java

  // annotate map and string schemas with string type
  private Schema addStringType(Schema s, Map<Schema, Schema> seen) {
    if (seen.containsKey(s))
      return seen.get(s); // break loops
```

### BoundedWildcard
Can generalize to `? extends T`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/Histogram.java`
#### Snippet
```java
    private TreeMap<T, Integer> index = new TreeMap<>();

    public TreeMapSegmenter(SortedSet<T> leftEndpoints) {
      if (leftEndpoints.isEmpty()) {
        throw new IllegalArgumentException("Endpoints must not be empty: " + leftEndpoints);
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java

  @Override
  public synchronized void writeBuffers(List<ByteBuffer> buffers) throws IOException {
    if (buffers == null)
      return; // no data to write
```

### BoundedWildcard
Can generalize to `? super T`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Requestor.java`
#### Snippet
```java
     * @param callback the callback to set.
     */
    public TransceiverCallback(Request request, Callback<T> callback) {
      this.request = request;
      this.callback = callback;
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static Schema applyAliases(Schema s, Map<Schema, Schema> seen, Map<Name, Name> aliases,
      Map<Name, Map<String, String>> fieldAliases) {

```

### BoundedWildcard
Can generalize to `? extends Field`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java

    @Override
    public void setFields(List<Field> fields) {
      if (this.fields != null) {
        throw new AvroRuntimeException("Fields are already set");
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  // Use at your own risk. This method should be removed with AVRO-2832.
  @Deprecated
  public String toString(Collection<Schema> referencedSchemas, boolean pretty) {
    Schema.Names names = new Schema.Names();
    if (referencedSchemas != null) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    }

    public LockableArrayList(List<E> types) {
      super(types);
    }
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static void getAliases(Schema schema, Map<Schema, Schema> seen, Map<Name, Name> aliases,
      Map<Name, Map<String, String>> fieldAliases) {
    if (schema instanceof NamedSchema) {
```

### BoundedWildcard
Can generalize to `? super Schema`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static void getAliases(Schema schema, Map<Schema, Schema> seen, Map<Name, Name> aliases,
      Map<Name, Map<String, String>> fieldAliases) {
    if (schema instanceof NamedSchema) {
```

### BoundedWildcard
Can generalize to `? super Name`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static void getAliases(Schema schema, Map<Schema, Schema> seen, Map<Name, Name> aliases,
      Map<Name, Map<String, String>> fieldAliases) {
    if (schema instanceof NamedSchema) {
```

### BoundedWildcard
Can generalize to `? super Name`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static void getAliases(Schema schema, Map<Schema, Schema> seen, Map<Name, Name> aliases,
      Map<Name, Map<String, String>> fieldAliases) {
    if (schema instanceof NamedSchema) {
```

### BoundedWildcard
Can generalize to `? super Name`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java

  private static void getAliases(Schema schema, Map<Schema, Schema> seen, Map<Name, Name> aliases,
      Map<Name, Map<String, String>> fieldAliases) {
    if (schema instanceof NamedSchema) {
      NamedSchema namedSchema = (NamedSchema) schema;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static String getFieldAlias(Name record, String field, Map<Name, Map<String, String>> fieldAliases) {
    Map<String, String> recordAliases = fieldAliases.get(record);
    if (recordAliases == null)
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
     * parser.
     */
    public Parser addTypes(Map<String, Schema> types) {
      for (Schema s : types.values())
        names.add(s);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaNormalization.java`
#### Snippet
```java
  }

  final static long EMPTY64 = 0xc15d213aa4d7a795L;

  /* An inner class ensures that FP_TABLE initialized only when needed. */
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/file/XZCodec.java`
#### Snippet
```java
/** * Implements xz compression and decompression. */
public class XZCodec extends Codec {
  public final static int DEFAULT_COMPRESSION = 6;
  private static final int DEFAULT_BUFFER_SIZE = 8192;

```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/file/ZstandardCodec.java`
#### Snippet
```java

public class ZstandardCodec extends Codec {
  public final static int DEFAULT_COMPRESSION = 3;
  public final static boolean DEFAULT_USE_BUFFERPOOL = false;
  private static final int DEFAULT_BUFFER_SIZE = 8192;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/file/ZstandardCodec.java`
#### Snippet
```java
public class ZstandardCodec extends Codec {
  public final static int DEFAULT_COMPRESSION = 3;
  public final static boolean DEFAULT_USE_BUFFERPOOL = false;
  private static final int DEFAULT_BUFFER_SIZE = 8192;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
   * reader's (and thus there is no reader schema to resolve to).
   */
  public static abstract class Action {
    /** Helps us traverse faster. */
    public enum Type {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
  }

  private static abstract class NestedCompletion<R> extends Completion<R> {
    private final Completion<R> context;
    private final PropBuilder<?> assembler;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
  }

  public final static class RecordBuilder<R> extends NamespacedBuilder<R, RecordBuilder<R>> {
    private RecordBuilder(Completion<R> context, NameContext names, String name) {
      super(context, names, name);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
   * Optional parameters for a field are namespace, doc, order, and aliases.
   */
  public final static class FieldBuilder<R> extends NamedBuilder<FieldBuilder<R>> {
    private final FieldAssembler<R> fields;
    private Schema.Field.Order order = Schema.Field.Order.ASCENDING;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
   * An abstraction for sharing code amongst all primitive type builders.
   */
  private static abstract class PrimitiveBuilder<R, P extends PrimitiveBuilder<R, P>> extends PropBuilder<P> {
    private final Completion<R> context;
    private final Schema immutable;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
  }

  public final static class FieldAssembler<R> {
    private final List<Field> fields = new ArrayList<>();
    private final Completion<R> context;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
   * string key-value properties.
   */
  public static abstract class PropBuilder<S extends PropBuilder<S>> {
    private Map<String, JsonNode> props = null;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
   * for all Avro types that have namespaces (Fixed, Record, and Enum).
   */
  public static abstract class NamespacedBuilder<R, S extends NamespacedBuilder<R, S>> extends NamedBuilder<S> {
    private final Completion<R> context;
    private String namespace;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
  }

  public final static class GenericDefault<R> {
    private final FieldBuilder<R> field;
    private final Schema schema;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
   * optional.
   */
  public static abstract class NamedBuilder<S extends NamedBuilder<S>> extends PropBuilder<S> {
    private final String name;
    private final NameContext names;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java

  /** Abstract base class for field defaults. **/
  public static abstract class FieldDefault<R, S extends FieldDefault<R, S>> extends Completion<S> {
    private final FieldBuilder<R> field;
    private Schema schema;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeFloatField extends UnsafeCachedField {
    protected UnsafeFloatField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeShortField extends UnsafeCachedField {
    protected UnsafeShortField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeCustomEncodedField extends UnsafeCachedField {

    private CustomEncoding<?> encoding;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeDoubleField extends UnsafeCachedField {
    protected UnsafeDoubleField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeObjectField extends UnsafeCachedField {
    protected UnsafeObjectField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeByteField extends UnsafeCachedField {
    protected UnsafeByteField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeIntField extends UnsafeCachedField {
    UnsafeIntField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeLongField extends UnsafeCachedField {
    protected UnsafeLongField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeBooleanField extends UnsafeCachedField {
    protected UnsafeBooleanField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java
  }

  final static class UnsafeCharField extends UnsafeCachedField {
    protected UnsafeCharField(Field f) {
      super(f);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificErrorBuilderBase.java`
#### Snippet
```java
 * thread-safe.
 */
abstract public class SpecificErrorBuilderBase<T extends SpecificExceptionBase> extends RecordBuilderBase<T>
    implements ErrorBuilder<T> {
  private Constructor<T> errorConstructor;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificRecordBuilderBase.java`
#### Snippet
```java
 * thread-safe.
 */
abstract public class SpecificRecordBuilderBase<T extends SpecificRecord> extends RecordBuilderBase<T> {

  /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroTrevniOutputFormat.java`
#### Snippet
```java

  /** The file name extension for trevni files. */
  public final static String EXT = ".trv";

  public static final String META_PREFIX = "trevni.meta.";
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/mapreduce/AvroTrevniRecordWriterBase.java`
#### Snippet
```java
   * @throws IOException
   */
  abstract protected Schema initSchema(TaskAttemptContext context);

  /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/mapreduce/AvroTrevniRecordWriterBase.java`
#### Snippet
```java

  /** trevni file extension */
  public final static String EXT = ".trv";

  /** prefix of job configs that we care about */
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java

  @Override
  public boolean replace(@Nullable K key, final @Nullable V oldValue, final @Nullable V newValue) {
    Boolean result = doTask(key, new Task<Boolean>(TaskOption.RESTRUCTURE_BEFORE, TaskOption.SKIP_IF_EMPTY) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java

  @Override
  public boolean replace(@Nullable K key, final @Nullable V oldValue, final @Nullable V newValue) {
    Boolean result = doTask(key, new Task<Boolean>(TaskOption.RESTRUCTURE_BEFORE, TaskOption.SKIP_IF_EMPTY) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
  @Override
  @Nullable
  public V replace(@Nullable K key, final @Nullable V value) {
    return doTask(key, new Task<V>(TaskOption.RESTRUCTURE_BEFORE, TaskOption.SKIP_IF_EMPTY) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java

  @Override
  public boolean remove(@Nullable Object key, final @Nullable Object value) {
    Boolean result = doTask(key, new Task<Boolean>(TaskOption.RESTRUCTURE_AFTER, TaskOption.SKIP_IF_EMPTY) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroOutputFormat.java`
#### Snippet
```java

  /** The file name extension for avro data files. */
  public final static String EXT = ".avro";

  /** The configuration key for Avro deflate level. */
```

### MissortedModifiers
Missorted modifiers `final static`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/Stopwatch.java`
#### Snippet
```java

  /** Default System time source. */
  public final static Ticks SYSTEM_TICKS = new SystemTicks();

  private Ticks ticks;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketServer.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(SaslServer.class);

  private static abstract class SaslServerFactory {
    protected abstract SaslServer getServer() throws SaslException;
  }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static abstract class NamedSchema extends Schema {
    final Name name;
    final String doc;
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
  public static int encodeDouble(double d, byte[] buf, int pos) {
    final long bits = Double.doubleToRawLongBits(d);
    int first = (int) (bits & 0xFFFFFFFF);
    int second = (int) ((bits >>> 32) & 0xFFFFFFFF);
    // the compiler seems to execute this order the best, likely due to
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    final long bits = Double.doubleToRawLongBits(d);
    int first = (int) (bits & 0xFFFFFFFF);
    int second = (int) ((bits >>> 32) & 0xFFFFFFFF);
    // the compiler seems to execute this order the best, likely due to
    // register allocation -- the lifetime of constants is minimized.
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
  public void writeFixed64(long l) throws IOException {
    ensure(8);
    int first = (int) (l & 0xFFFFFFFF);
    int second = (int) ((l >>> 32) & 0xFFFFFFFF);
    buf[count] = (byte) ((first) & 0xFF);
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    ensure(8);
    int first = (int) (l & 0xFFFFFFFF);
    int second = (int) ((l >>> 32) & 0xFFFFFFFF);
    buf[count] = (byte) ((first) & 0xFF);
    buf[count + 4] = (byte) ((second) & 0xFF);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ByteArrayInputStream.skip()` is ignored
in `lang/java/avro/src/main/java/org/apache/avro/file/SeekableByteArrayInput.java`
#### Snippet
```java
  public void seek(long p) throws IOException {
    this.reset();
    this.skip(p);
  }

```

### IgnoreResultOfCall
Result of `SeekableInputStream.read()` is ignored
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java
    byte[] magic = new byte[4];
    in.seek(0); // seek to 0 to read magic header
    in.read(magic);
    if (!Arrays.equals(MAGIC, magic))
      throw new InvalidAvroMagicException("Not a data file.");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `lang/java/tools/src/main/java/org/apache/avro/tool/IdlToSchemataTool.java`
#### Snippet
```java
    String dirname = (args.size() == 2) ? args.get(1) : "";
    File outputDirectory = new File(dirname);
    outputDirectory.mkdirs();
    return outputDirectory;
  }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
    long logLength = TaskLog.getTaskLogLength(job);
    command = TaskLog.captureOutAndError(null, command, stdout, stderr, logLength, false);
    stdout.getParentFile().mkdirs();
    stderr.getParentFile().mkdirs();

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
    command = TaskLog.captureOutAndError(null, command, stdout, stderr, logLength, false);
    stdout.getParentFile().mkdirs();
    stderr.getParentFile().mkdirs();

    // add output server's port to env
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcUtils.java`
#### Snippet
```java
    try {
      if (stream instanceof KnownLength && stream.available() > 0) {
        stream.skip(stream.available());
      } else {
        // don't expect this for an inputStream provided by gRPC but just to be on safe
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java
      String fileName = getOutputFileName(klass);
      File outputFile = new File(fileName);
      outputFile.getParentFile().mkdirs();
      try (PrintWriter writer = new PrintWriter(fileName, encoding)) {
        if (klass.isInterface()) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
      if (src != null && f.exists() && f.lastModified() >= src.lastModified())
        return f; // already up to date: ignore
      f.getParentFile().mkdirs();
      Writer fw = null;
      FileOutputStream fos = null;
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `lang/java/avro/src/main/java/org/apache/avro/util/MapUtil.java`
#### Snippet
```java
      return value;
    }
    return map.computeIfAbsent(key, mappingFunction::apply);
  }

```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Options opts = new Options();

    Option helpopt = OptionBuilder.hasArg(false).withDescription("print this message").create("help");

    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Options opts = new Options();

    Option helpopt = OptionBuilder.hasArg(false).withDescription("print this message").create("help");

    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option helpopt = OptionBuilder.hasArg(false).withDescription("print this message").create("help");

    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");

    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.isRequired()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option helpopt = OptionBuilder.hasArg(false).withDescription("print this message").create("help");

    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");

    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option helpopt = OptionBuilder.hasArg(false).withDescription("print this message").create("help");

    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");

    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");

    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");

    Option pargs = OptionBuilder.hasArg().withDescription(
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.isRequired()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");

    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");

    Option pargs = OptionBuilder.hasArg().withDescription(
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option inopt = OptionBuilder.hasArg().isRequired().withDescription("comma-separated input paths").create("in");

    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");

    Option pargs = OptionBuilder.hasArg().withDescription(
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");

    Option pargs = OptionBuilder.hasArg().withDescription(
        "A string containing the command line arguments to pass to the tethered process. String should be enclosed in quotes")
        .create("exec_args");

    Option popt = OptionBuilder.hasArg().isRequired().withDescription("executable program, usually in HDFS")
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    Option outopt = OptionBuilder.hasArg().isRequired().withDescription("The output path.").create("out");

    Option pargs = OptionBuilder.hasArg().withDescription(
        "A string containing the command line arguments to pass to the tethered process. String should be enclosed in quotes")
        .create("exec_args");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("exec_args");

    Option popt = OptionBuilder.hasArg().isRequired().withDescription("executable program, usually in HDFS")
        .create("program");

    Option outscopt = OptionBuilder.withType(File.class).hasArg().isRequired()
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.isRequired()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("exec_args");

    Option popt = OptionBuilder.hasArg().isRequired().withDescription("executable program, usually in HDFS")
        .create("program");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("exec_args");

    Option popt = OptionBuilder.hasArg().isRequired().withDescription("executable program, usually in HDFS")
        .create("program");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("program");

    Option outscopt = OptionBuilder.withType(File.class).hasArg().isRequired()
        .withDescription("schema file for output of reducer").create("outschema");

    Option outscmapopt = OptionBuilder.withType(File.class).hasArg()
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("program");

    Option outscopt = OptionBuilder.withType(File.class).hasArg().isRequired()
        .withDescription("schema file for output of reducer").create("outschema");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.isRequired()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("program");

    Option outscopt = OptionBuilder.withType(File.class).hasArg().isRequired()
        .withDescription("schema file for output of reducer").create("outschema");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("program");

    Option outscopt = OptionBuilder.withType(File.class).hasArg().isRequired()
        .withDescription("schema file for output of reducer").create("outschema");

    Option outscmapopt = OptionBuilder.withType(File.class).hasArg()
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .withDescription("schema file for output of reducer").create("outschema");

    Option outscmapopt = OptionBuilder.withType(File.class).hasArg()
        .withDescription("(optional) map output schema file,  if different from outschema").create("outschemamap");

    Option redopt = OptionBuilder.withType(Integer.class).hasArg().withDescription("(optional) number of reducers")
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .withDescription("schema file for output of reducer").create("outschema");

    Option outscmapopt = OptionBuilder.withType(File.class).hasArg()
        .withDescription("(optional) map output schema file,  if different from outschema").create("outschemamap");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .withDescription("schema file for output of reducer").create("outschema");

    Option outscmapopt = OptionBuilder.withType(File.class).hasArg()
        .withDescription("(optional) map output schema file,  if different from outschema").create("outschemamap");

    Option redopt = OptionBuilder.withType(Integer.class).hasArg().withDescription("(optional) number of reducers")
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .withDescription("(optional) map output schema file,  if different from outschema").create("outschemamap");

    Option redopt = OptionBuilder.withType(Integer.class).hasArg().withDescription("(optional) number of reducers")
        .create("reduces");

    Option cacheopt = OptionBuilder.withType(Boolean.class).hasArg()
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .withDescription("(optional) map output schema file,  if different from outschema").create("outschemamap");

    Option redopt = OptionBuilder.withType(Integer.class).hasArg().withDescription("(optional) number of reducers")
        .create("reduces");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .withDescription("(optional) map output schema file,  if different from outschema").create("outschemamap");

    Option redopt = OptionBuilder.withType(Integer.class).hasArg().withDescription("(optional) number of reducers")
        .create("reduces");

```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("reduces");

    Option cacheopt = OptionBuilder.withType(Boolean.class).hasArg()
        .withDescription(
            "(optional) boolean indicating whether or not the executable should be distributed via distributed cache")
        .create("exec_cached");

    Option protoopt = OptionBuilder.hasArg()
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("reduces");

    Option cacheopt = OptionBuilder.withType(Boolean.class).hasArg()
        .withDescription(
            "(optional) boolean indicating whether or not the executable should be distributed via distributed cache")
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("reduces");

    Option cacheopt = OptionBuilder.withType(Boolean.class).hasArg()
        .withDescription(
            "(optional) boolean indicating whether or not the executable should be distributed via distributed cache")
        .create("exec_cached");
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("exec_cached");

    Option protoopt = OptionBuilder.hasArg()
        .withDescription("(optional) specifies the transport protocol 'http' or 'sasl'").create("protocol");

    opts.addOption(redopt);
```

### AccessStaticViaInstance
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
        .create("exec_cached");

    Option protoopt = OptionBuilder.hasArg()
        .withDescription("(optional) specifies the transport protocol 'http' or 'sasl'").create("protocol");

    opts.addOption(redopt);
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
   * @param <V> the value type
   */
  protected static final class Entry<K, V> implements Map.Entry<K, V> {

    @Nullable
```

### ClassNameSameAsAncestorName
Class name `Iterator` is the same as one of its superclass' names
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroKeyValue.java`
#### Snippet
```java
   * @param <V> The value type.
   */
  public static class Iterator<K, V> implements java.util.Iterator<AvroKeyValue<K, V>> {
    /** The wrapped iterator. */
    private final java.util.Iterator<? extends GenericRecord> mGenericIterator;
```

### ClassNameSameAsAncestorName
Class name `Reader` is the same as one of its superclass' names
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
   * A reader for SequenceFiles that may contain Avro data.
   */
  public static class Reader extends SequenceFile.Reader {
    /**
     * A helper class to encapsulate the options that can be used to construct a
```

### ClassNameSameAsAncestorName
Class name `Writer` is the same as one of its superclass' names
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
   * A writer for an uncompressed SequenceFile that supports Avro data.
   */
  public static class Writer extends SequenceFile.Writer {
    /**
     * A helper class to encapsulate the options that can be used to construct a
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
columnCount \* 8: integer multiplication implicitly cast to long
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ColumnFileWriter.java`
#### Snippet
```java
  private long[] computeStarts(long start) throws IOException {
    long[] result = new long[columnCount];
    start += columnCount * 8; // room for starts
    for (int column = 0; column < columnCount; column++) {
      result[column] = start;
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< (7 \* 9): integer shift implicitly cast to long
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 8)) - 1)
      return 8;
    if (n <= (1 << (7 * 9)) - 1)
      return 9;
    return 10;
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader.java`
#### Snippet
```java
      long length = in.length();
      long remaining = length - position;
      if (remaining > skip) {
        in.seek(skip);
        return in.tell() - position;
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java

  BlockingBinaryEncoder configure(OutputStream out, int blockBufferSize, int binaryEncoderBufferSize) {
    super.configure(out, binaryEncoderBufferSize);
    pos = 0;
    stackTop = 0;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    /** Configure this fixed type's size, and end its configuration. **/
    public R size(int size) {
      Schema schema = Schema.createFixed(name(), super.doc(), space(), size);
      completeSchema(schema);
      return context().complete(schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/util/NonCopyingByteArrayOutputStream.java`
#### Snippet
```java
   */
  public ByteBuffer asByteBuffer() {
    return ByteBuffer.wrap(super.buf, 0, super.count);
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/util/NonCopyingByteArrayOutputStream.java`
#### Snippet
```java
   */
  public ByteBuffer asByteBuffer() {
    return ByteBuffer.wrap(super.buf, 0, super.count);
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final byte[] data = new byte[super.getRandom().nextInt(70)];
        super.getRandom().nextBytes(data);
        encoder.writeBytes(data);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i++) {
        final byte[] data = new byte[super.getRandom().nextInt(70)];
        super.getRandom().nextBytes(data);
        encoder.writeBytes(data);
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new byte[getBatchSize()][];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        final byte[] data = new byte[super.getRandom().nextInt(70)];
        super.getRandom().nextBytes(data);
        testData[i] = data;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i++) {
        final byte[] data = new byte[super.getRandom().nextInt(70)];
        super.getRandom().nextBytes(data);
        testData[i] = data;
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BytesTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/DoubleTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/DoubleTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/DoubleTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeDouble(super.getRandom().nextDouble());
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/DoubleTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new double[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/DoubleTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        testData[i] = super.getRandom().nextDouble();
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java

    private String randomString() {
      final char[] data = new char[super.getRandom().nextInt(70)];
      for (int j = 0; j < data.length; j++) {
        data[j] = (char) ('a' + super.getRandom().nextInt('z' - 'a'));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java
      final char[] data = new char[super.getRandom().nextInt(70)];
      for (int j = 0; j < data.length; j++) {
        data[j] = (char) ('a' + super.getRandom().nextInt('z' - 'a'));
      }
      return new String(data);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java

    private String randomString() {
      final char[] data = new char[super.getRandom().nextInt(70)];
      for (int j = 0; j < data.length; j++) {
        data[j] = (char) ('a' + super.getRandom().nextInt('z' - 'a'));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java
      final char[] data = new char[super.getRandom().nextInt(70)];
      for (int j = 0; j < data.length; j++) {
        data[j] = (char) ('a' + super.getRandom().nextInt('z' - 'a'));
      }
      return new String(data);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/StringTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new String[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/FloatTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/FloatTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeFloat(super.getRandom().nextFloat());
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/FloatTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new float[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/FloatTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        testData[i] = super.getRandom().nextFloat();
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/FloatTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i += 4) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i += 4) {
        // half fit in 1, half in 2
        encoder.writeLong(super.getRandom().nextLong() % 0x7FL);

        // half fit in <=3, half in 4
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java

        // half fit in <=3, half in 4
        encoder.writeLong(super.getRandom().nextLong() % 0x1FFFFFL);

        // half in <=5, half in 6
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java

        // half in <=5, half in 6
        encoder.writeLong(super.getRandom().nextLong() % 0x3FFFFFFFFL);

        // half in <=8, half in 9
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java

        // half in <=8, half in 9
        encoder.writeLong(super.getRandom().nextLong() % 0x1FFFFFFFFFFFFL);
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new long[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i += 4) {
        // half fit in 1, half in 2
        testData[i + 0] = super.getRandom().nextLong() % 0x7FL;
        // half fit in <=3, half in 4
        testData[i + 1] = super.getRandom().nextLong() % 0x1FFFFFL;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
        testData[i + 0] = super.getRandom().nextLong() % 0x7FL;
        // half fit in <=3, half in 4
        testData[i + 1] = super.getRandom().nextLong() % 0x1FFFFFL;
        // half in <=5, half in 6
        testData[i + 2] = super.getRandom().nextLong() % 0x3FFFFFFFFL;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
        testData[i + 1] = super.getRandom().nextLong() % 0x1FFFFFL;
        // half in <=5, half in 6
        testData[i + 2] = super.getRandom().nextLong() % 0x3FFFFFFFFL;
        // half in <=8, half in 9
        testData[i + 3] = super.getRandom().nextLong() % 0x1FFFFFFFFFFFFL;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/LongTest.java`
#### Snippet
```java
        testData[i + 2] = super.getRandom().nextLong() % 0x3FFFFFFFFL;
        // half in <=8, half in 9
        testData[i + 3] = super.getRandom().nextLong() % 0x1FFFFFFFFFFFFL;
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BooleanTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BooleanTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeBoolean(super.getRandom().nextBoolean());
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BooleanTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BooleanTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new boolean[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/BooleanTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        testData[i] = super.getRandom().nextBoolean();
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final int items = getBatchSize() / 4;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i += 4) {
        encoder.startItem();
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
        encoder.startItem();
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
      }
      encoder.writeArrayEnd();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new float[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ArrayTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        testData[i] = super.getRandom().nextFloat();
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i += 4) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i += 4) {
        // fits in 1 byte
        encoder.writeInt(super.getRandom().nextInt(50));

        // fits in 2 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java

        // fits in 2 bytes
        encoder.writeInt(super.getRandom().nextInt(5000));

        // fits in 3 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java

        // fits in 3 bytes
        encoder.writeInt(super.getRandom().nextInt(500000));

        // most in 4 bytes, some in 5 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java

        // most in 4 bytes, some in 5 bytes
        encoder.writeInt(super.getRandom().nextInt(150000000));
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new int[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i += 4) {
        // fits in 1 byte
        testData[i + 0] = super.getRandom().nextInt(50);

        // fits in 2 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java

        // fits in 2 bytes
        testData[i + 1] = super.getRandom().nextInt(5000);

        // fits in 3 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java

        // fits in 3 bytes
        testData[i + 2] = super.getRandom().nextInt(500000);

        // most in 4 bytes, some in 5 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/SmallLongTest.java`
#### Snippet
```java

        // most in 4 bytes, some in 5 bytes
        testData[i + 3] = super.getRandom().nextInt(150000000);
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i += 4) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i += 4) {
        // fits in 1 byte
        encoder.writeInt(super.getRandom().nextInt(50));

        // fits in 2 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java

        // fits in 2 bytes
        encoder.writeInt(super.getRandom().nextInt(5000));

        // fits in 3 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java

        // fits in 3 bytes
        encoder.writeInt(super.getRandom().nextInt(500000));

        // most in 4 bytes, some in 5 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java

        // most in 4 bytes, some in 5 bytes
        encoder.writeInt(super.getRandom().nextInt(150000000));
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new int[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i += 4) {
        // fits in 1 byte
        testData[i + 0] = super.getRandom().nextInt(50);

        // fits in 2 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java

        // fits in 2 bytes
        testData[i + 1] = super.getRandom().nextInt(5000);

        // fits in 3 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java

        // fits in 3 bytes
        testData[i + 2] = super.getRandom().nextInt(500000);

        // most in 4 bytes, some in 5 bytes
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/IntTest.java`
#### Snippet
```java

        // most in 4 bytes, some in 5 bytes
        testData[i + 3] = super.getRandom().nextInt(150000000);
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      final int items = getBatchSize() / 4;

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
        encoder.startItem();
        encoder.writeString("This is a map key");
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
        encoder.writeString("This is a map key");
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
        encoder.writeFloat(super.getRandom().nextFloat());
      }
      encoder.writeMapEnd();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new float[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/MapTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        testData[i] = super.getRandom().nextFloat();
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithOutOfOrderTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().resolvingDecoder(writerSchema, readerSchema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithOutOfOrderTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithOutOfOrderTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BasicRecord r = new BasicRecord(super.getRandom());
        encoder.writeDouble(r.f1);
        encoder.writeDouble(r.f2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithDefaultTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().resolvingDecoder(writerSchema, readerSchema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithDefaultTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithDefaultTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BasicRecord r = new BasicRecord(super.getRandom());
        encoder.writeDouble(r.f1);
        encoder.writeDouble(r.f2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ResolvingRecordTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().resolvingDecoder(writerSchema, readerSchema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ResolvingRecordTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ResolvingRecordTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BasicRecord r = new BasicRecord(super.getRandom());
        encoder.writeDouble(r.f1);
        encoder.writeDouble(r.f2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithPromotionTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().resolvingDecoder(writerSchema, readerSchema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithPromotionTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordWithPromotionTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BasicRecord r = new BasicRecord(super.getRandom());
        encoder.writeDouble(r.f1);
        encoder.writeDouble(r.f2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ValidatingRecordTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new BasicRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ValidatingRecordTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        testData[i] = new BasicRecord(super.getRandom());
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ValidatingRecordTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ValidatingRecordTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BasicRecord r = new BasicRecord(super.getRandom());
        encoder.writeDouble(r.f1);
        encoder.writeDouble(r.f2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/ValidatingRecordTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(this.schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
        final GenericRecord rec = new GenericData.Record(this.schema);

        final int val = super.getRandom().nextInt(1000000);
        final Integer v = (val < 750000 ? Integer.valueOf(val) : null);
        rec.put("f", v);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i++) {
        final GenericRecord rec = new GenericData.Record(this.schema);
        final int val = super.getRandom().nextInt(1000000);
        final Integer v = (val < 750000 ? Integer.valueOf(val) : null);
        rec.put("f", v);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ExtendedEnumTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ExtendedEnumTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i++) {
        final GenericRecord rec = new GenericData.Record(this.schema);
        final int tag = super.getRandom().nextInt(2);

        rec.put("f", GenericData.get().createEnum(enumSchema.getEnumSymbols().get(tag), enumSchema));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ExtendedEnumTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ExtendedEnumTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i++) {
        final GenericRecord rec = new GenericData.Record(this.schema);
        final int tag = super.getRandom().nextInt(2);

        rec.put("f", GenericData.get().createEnum(enumSchema.getEnumSymbols().get(tag), enumSchema));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/ExtendedEnumTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BasicRecord r = new BasicRecord(super.getRandom());
        encoder.writeDouble(r.f1);
        encoder.writeDouble(r.f2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/record/RecordTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(readerSchema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithOutOfOrderTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithOutOfOrderTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.writerSchema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithOutOfOrderTest.java`
#### Snippet
```java
      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.writerSchema);

      final Random r = super.getRandom();
      for (int i = 0; i < getBatchSize(); i++) {
        final GenericRecord rec = new GenericData.Record(writerSchema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericTest.java`
#### Snippet
```java
      this.testData = new GenericRecord[getBatchSize()];

      final Random r = super.getRandom();
      for (int i = 0; i < testData.length; i++) {
        final GenericRecord rec = new GenericData.Record(schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final Random r = super.getRandom();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericTest.java`
#### Snippet
```java
      Encoder encoder = super.newEncoder(true, baos);

      final Random r = super.getRandom();
      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeDouble(r.nextDouble());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithPromotionTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = super.newDecoder(this.testData);
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithPromotionTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.writerSchema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithPromotionTest.java`
#### Snippet
```java
      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.writerSchema);

      final Random r = super.getRandom();
      for (int i = 0; i < getBatchSize(); i++) {
        final GenericRecord rec = new GenericData.Record(writerSchema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedFakeTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedFakeTest.java`
#### Snippet
```java
      this.testData = new GenericRecord[getBatchSize()];

      final Random r = super.getRandom();
      Schema doubleSchema = schema.getFields().get(0).schema();
      for (int i = 0; i < testData.length; i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedFakeTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final Random r = super.getRandom();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedFakeTest.java`
#### Snippet
```java
      Encoder encoder = super.newEncoder(true, baos);

      final Random r = super.getRandom();
      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeDouble(r.nextDouble());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedFakeTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      for (int i = 0; i < getBatchSize(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeString(randomString(super.getRandom()));
        encoder.writeString(randomString(super.getRandom()));
        encoder.writeString(randomString(super.getRandom()));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeString(randomString(super.getRandom()));
        encoder.writeString(randomString(super.getRandom()));
        encoder.writeString(randomString(super.getRandom()));
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
        encoder.writeString(randomString(super.getRandom()));
        encoder.writeString(randomString(super.getRandom()));
        encoder.writeString(randomString(super.getRandom()));
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
      for (int i = 0; i < testData.length; i++) {
        GenericRecord rec = new GenericData.Record(readerSchema);
        rec.put(0, randomString(super.getRandom()));
        rec.put(1, randomString(super.getRandom()));
        rec.put(2, randomString(super.getRandom()));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
        GenericRecord rec = new GenericData.Record(readerSchema);
        rec.put(0, randomString(super.getRandom()));
        rec.put(1, randomString(super.getRandom()));
        rec.put(2, randomString(super.getRandom()));
        testData[i] = rec;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
        rec.put(0, randomString(super.getRandom()));
        rec.put(1, randomString(super.getRandom()));
        rec.put(2, randomString(super.getRandom()));
        testData[i] = rec;
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericStringTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(readerSchema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedTest.java`
#### Snippet
```java
      this.testData = new GenericRecord[getBatchSize()];

      final Random r = super.getRandom();
      Schema doubleSchema = schema.getFields().get(0).schema();
      for (int i = 0; i < testData.length; i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final Random r = super.getRandom();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericNestedTest.java`
#### Snippet
```java
      Encoder encoder = super.newEncoder(true, baos);

      final Random r = super.getRandom();
      for (int i = 0; i < getBatchSize(); i++) {
        encoder.writeDouble(r.nextDouble());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithDefaultTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);

      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithDefaultTest.java`
#### Snippet
```java
      final GenericDatumWriter<Object> writer = new GenericDatumWriter<>(this.schema);

      final Random r = super.getRandom();
      for (int i = 0; i < getBatchSize(); i++) {
        final GenericRecord rec = new GenericData.Record(schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithDefaultTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithDefaultTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.testData = new GenericRecord[getBatchSize()];

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/generic/GenericWithDefaultTest.java`
#### Snippet
```java
      this.testData = new GenericRecord[getBatchSize()];

      final Random r = super.getRandom();
      for (int i = 0; i < testData.length; i++) {
        final GenericRecord rec = new GenericData.Record(schema);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLargeFloatArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new float[getBatchSize()][];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLargeFloatArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLargeFloatArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<float[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectNestedObjectArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<BasicRecord[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectNestedObjectArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new ObjectArrayWrapper[getBatchSize()];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectNestedObjectArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectFloatArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectFloatArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectFloatArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<float[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLargeFloatArrayBlockedTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<float[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLargeFloatArrayBlockedTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(254, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new float[getBatchSize()][];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLargeFloatArrayBlockedTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectNestedFloatArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectNestedFloatArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new NativeArrayWrapper[getBatchSize()];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectNestedFloatArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<float[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectDoubleArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectDoubleArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<double[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectDoubleArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLongArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new long[getBatchSize()][];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectRecordTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectRecordTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new BasicRecord[getBatchSize()];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectRecordTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<BasicRecord> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLongArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectLongArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<long[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectIntArrayTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectIntArrayTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<int[]> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectIntArrayTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectBigRecordTest.java`
#### Snippet
```java
    public void doSetupTrial() throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Encoder encoder = super.newEncoder(true, baos);
      ReflectDatumWriter<BigRecord> writer = new ReflectDatumWriter<>(schema);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectBigRecordTest.java`
#### Snippet
```java

      for (int i = 0; i < getBatchSize(); i++) {
        final BigRecord r = new BigRecord(super.getRandom());
        writer.write(r, encoder);
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectBigRecordTest.java`
#### Snippet
```java
    @Setup(Level.Invocation)
    public void doSetupInvocation() throws Exception {
      this.decoder = DecoderFactory.get().validatingDecoder(schema, super.newDecoder(this.testData));
    }
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectBigRecordTest.java`
#### Snippet
```java
    @Setup(Level.Trial)
    public void doSetupTrial() throws Exception {
      this.encoder = super.newEncoder(false, getNullOutputStream());
      this.datumWriter = new ReflectDatumWriter<>(schema);
      this.testData = new BigRecord[getBatchSize()];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/reflect/ReflectBigRecordTest.java`
#### Snippet
```java

      for (int i = 0; i < testData.length; i++) {
        this.testData[i] = new BigRecord(super.getRandom());
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        name = new Name(o, "");
      }
      return super.get(name);
    }

```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketServer.java`
#### Snippet
```java
        try {
          this.xc = getTransceiver(channel);
          while (true) {
            xc.writeBuffers(responder.respond(xc.readBuffers(), xc));
          }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
    bv.type = null;
    bv.state = BlockedValue.State.ROOT;
    bv.start = bv.lastFullItem = 0;
    bv.items = 1;

```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
      this.type = null;
      this.state = BlockedValue.State.ROOT;
      this.start = this.lastFullItem = 0;
      this.items = 1; // Makes various assertions work out
    }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java

    assert s.items == 1;
    s.start = s.lastFullItem = 0;
    s.state = BlockedValue.State.OVERFLOW;

```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
    // Reset top of stack to be in REGULAR mode
    s.state = BlockedValue.State.REGULAR;
    s.start = s.lastFullItem = 0;
    s.items = 0;
    assert check();
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
    bv.type = Schema.Type.ARRAY;
    bv.state = BlockedValue.State.REGULAR;
    bv.start = bv.lastFullItem = pos;
    bv.items = 0;

```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
    bv.type = Schema.Type.MAP;
    bv.state = BlockedValue.State.REGULAR;
    bv.start = bv.lastFullItem = pos;
    bv.items = 0;

```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      pos = (int) (pos + length);
    } else {
      limit = pos = 0;
      length -= remaining;
      source.skipSourceBytes(length);
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/file/BZip2Codec.java`
#### Snippet
```java

      int readCount = -1;
      while ((readCount = inputStream.read(buffer, compressedData.position(), buffer.length)) > 0) {
        baos.write(buffer, 0, readCount);
      }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
          header.metaKeyList.add(key);
        }
      } while ((l = vin.mapNext()) != 0);
    }
    vin.readFixed(header.sync); // read sync
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java
          meta.put(key, bb);
        }
      } while ((l = vin.mapNext()) != 0);
    }

```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/message/BinaryMessageDecoder.java`
#### Snippet
```java
    int pos = 0;
    int bytesRead;
    while ((bytes.length - pos) > 0 && (bytesRead = stream.read(bytes, pos, bytes.length - pos)) > 0) {
      pos += bytesRead;
    }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
          }
        }
      } while ((l = in.mapNext()) > 0);
    }
    return map;
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
        }
        base += l;
      } while ((l = in.arrayNext()) > 0);
      return pruneArray(array);
    } else {
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          index++;
        }
      } while ((l = in.arrayNext()) > 0);
    } else {
      do {
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          index++;
        }
      } while ((l = in.arrayNext()) > 0);
    }
    return array;
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          c.add(element);
        }
      } while ((l = in.arrayNext()) > 0);
    } else {
      do {
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          c.add(element);
        }
      } while ((l = in.arrayNext()) > 0);
    }
    return c;
```

### NestedAssignment
Result of assignment expression used
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/schema/Schemas.java`
#### Snippet
```java
    dq.addLast(start);
    Object current;
    while ((current = dq.pollLast()) != null) {
      if (current instanceof Supplier) {
        // we are executing a non terminal post visit.
```

### NestedAssignment
Result of assignment expression used
in `lang/java/trevni/core/src/main/java/org/apache/trevni/BZip2Codec.java`
#### Snippet
```java
      int readCount = -1;

      while ((readCount = inputStream.read(buffer, compressedData.position(), buffer.length)) > 0) {
        baos.write(buffer, 0, readCount);
      }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ColumnValues.java`
#### Snippet
```java
  public T nextValue() throws IOException {
    arrayLength--;
    return previous = values.readValue(type);
  }

```

### NestedAssignment
Result of assignment expression used
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ColumnValues.java`
#### Snippet
```java
      throw new TrevniRuntimeException("Column is not array: " + column.metaData.getName());
    assert arrayLength == 0;
    return arrayLength = values.readLength();
  }

```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    public Name(String name, String space) {
      if (name == null) { // anonymous
        this.name = this.space = this.full = null;
        return;
      }
```

### NestedAssignment
Result of assignment expression used
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    public Name(String name, String space) {
      if (name == null) { // anonymous
        this.name = this.space = this.full = null;
        return;
      }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`pos = (int) (pos + length)` could be simplified to 'pos += length'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    int remaining = limit - pos;
    if (length <= remaining) {
      pos = (int) (pos + length);
    } else {
      limit = pos = 0;
```

### ReplaceAssignmentWithOperatorAssignment
`position = (int) (position + length)` could be simplified to 'position += length'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      long remaining = (long) max - position;
      if (remaining >= length) {
        position = (int) (position + length);
        ba.setPos(position);
        return length;
```

### ReplaceAssignmentWithOperatorAssignment
`pos = (int) (pos + n)` could be simplified to 'pos += n'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      int remaining = lim - pos;
      if (remaining > n) {
        pos = (int) (pos + n);
        ba.setPos(pos);
        return n;
```

### ReplaceAssignmentWithOperatorAssignment
`pos = pos + len` could be simplified to 'pos += len'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      if (remaining >= len) {
        System.arraycopy(buf, pos, b, off, len);
        pos = pos + len;
        ba.setPos(pos);
        return len;
```

### ReplaceAssignmentWithOperatorAssignment
`pos = pos + remaining` could be simplified to 'pos += remaining'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
        // flush buffer to array
        System.arraycopy(buf, pos, b, off, remaining);
        pos = pos + remaining;
        ba.setPos(pos);
        // get the rest from the stream (skip array)
```

### ReplaceAssignmentWithOperatorAssignment
`count = count + streamReader.getBlockCount()` could be simplified to 'count += streamReader.getBlockCount()'
in `lang/java/tools/src/main/java/org/apache/avro/tool/RecordCountTool.java`
#### Snippet
```java
    try (DataFileStream<Object> streamReader = new DataFileStream<>(inStream, new GenericDatumReader<>())) {
      while (streamReader.hasNext()) {
        count = count + streamReader.getBlockCount();
        streamReader.nextBlock();
      }
```

### ReplaceAssignmentWithOperatorAssignment
`sampleCounter = sampleCounter + samplerate` could be simplified to 'sampleCounter += samplerate'
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    while (written < count && reader.hasNext()) {
      reuse = reader.next(reuse);
      sampleCounter = sampleCounter + samplerate;
      if (sampleCounter >= 1) {
        writer.append(reuse);
```

### ReplaceAssignmentWithOperatorAssignment
`totalCopied = totalCopied + written` could be simplified to 'totalCopied += written'
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
      }
    }
    totalCopied = totalCopied + written;
    if (written < count && hasNextInput()) { // goto next file
      nextInput();
```

### ReplaceAssignmentWithOperatorAssignment
`written = written + writeRecords(count - written, samplerate)` could be simplified to 'written += writeRecords(count - written, samplerate)'
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    if (written < count && hasNextInput()) { // goto next file
      nextInput();
      written = written + writeRecords(count - written, samplerate);
    }
    return written;
```

### ReplaceAssignmentWithOperatorAssignment
`skipped = skipped + skip(skip)` could be simplified to 'skipped += skip(skip)'
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    if ((0 < skip) && hasNextInput()) { // goto next file
      nextInput();
      skipped = skipped + skip(skip);
    }
    return skipped;
```

### ReplaceAssignmentWithOperatorAssignment
`size = size + bb.limit()` could be simplified to 'size += bb.limit()'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    int size = 0;
    for (ByteBuffer bb : payload) {
      size = size + bb.limit();
    }

```

### ReplaceAssignmentWithOperatorAssignment
`pos = pos + 1` could be simplified to 'pos += 1'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/Histogram.java`
#### Snippet
```java
        @Override
        public String next() {
          pos = pos + 1;
          T left = cur;
          cur = it.hasNext() ? it.next() : null;
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
        } catch (Exception e) {
          e.printStackTrace(err);
          return 1;
        }
      }
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `blockStart` is accessed in both synchronized and unsynchronized contexts
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java

  private long blockCount; // # entries in block
  private long blockStart;
  private byte[] sync = new byte[SYNC_SIZE];
  private byte[] syncBuffer = new byte[SYNC_SIZE];
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `in` is accessed in both synchronized and unsynchronized contexts
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java
  private Schema schema;
  private DatumReader<D> reader;
  private DataFileReader.SeekableInputStream in;
  private BinaryDecoder vin;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `blockCount` is accessed in both synchronized and unsynchronized contexts
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java
  private Map<String, byte[]> meta = new HashMap<>();

  private long blockCount; // # entries in block
  private long blockStart;
  private byte[] sync = new byte[SYNC_SIZE];
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mark` is accessed in both synchronized and unsynchronized contexts
in `lang/java/avro/src/main/java/org/apache/avro/util/ReusableByteBufferInputStream.java`
#### Snippet
```java
  private ByteBuffer byteBuffer = EMPTY_BUFFER;
  private Buffer buffer = byteBuffer;
  private int mark = 0;

  public void setByteBuffer(ByteBuffer buf) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `lang/java/avro/src/main/java/org/apache/avro/util/ReusableByteBufferInputStream.java`
#### Snippet
```java
  // due to ByteBuffer overriding several methods
  private ByteBuffer byteBuffer = EMPTY_BUFFER;
  private Buffer buffer = byteBuffer;
  private int mark = 0;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `backingStore` is accessed in both synchronized and unsynchronized contexts
in `lang/java/avro/src/main/java/org/apache/avro/util/WeakIdentityHashMap.java`
#### Snippet
```java
public class WeakIdentityHashMap<K, V> implements Map<K, V> {
  private final ReferenceQueue<K> queue = new ReferenceQueue<>();
  private Map<IdentityWeakReference, V> backingStore = new HashMap<>();

  public WeakIdentityHashMap() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `conf` is accessed in both synchronized and unsynchronized contexts
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
  // instance code, to be used from Mapper/Reducer code

  private JobConf conf;
  private OutputFormat outputFormat;
  private Set<String> namedOutputs;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordWriters` is accessed in both synchronized and unsynchronized contexts
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
  private OutputFormat outputFormat;
  private Set<String> namedOutputs;
  private Map<String, RecordWriter> recordWriters;
  private boolean countersEnabled;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `error` is accessed in both synchronized and unsynchronized contexts
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  private int inputPort;
  private boolean complete;
  private String error;

  private static final Logger LOG = LoggerFactory.getLogger(TetherOutputService.class);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mReader` is accessed in both synchronized and unsynchronized contexts
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroSequenceFileInputFormat.java`
#### Snippet
```java
   */
  protected class AvroSequenceFileRecordReader extends RecordReader<K, V> {
    private SequenceFile.Reader mReader;
    private long mStart;
    private long mEnd;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `channel` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
   */
  private final ReentrantReadWriteLock stateLock = new ReentrantReadWriteLock();
  private Channel channel; // Synchronized on stateLock
  private Protocol remote; // Synchronized on stateLock

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `remote` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
  private final ReentrantReadWriteLock stateLock = new ReentrantReadWriteLock();
  private Channel channel; // Synchronized on stateLock
  private Protocol remote; // Synchronized on stateLock

  NettyTransceiver() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordWriters` is accessed in both synchronized and unsynchronized contexts
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
  private TaskInputOutputContext<?, ?, ?, ?> context;
  private Set<String> namedOutputs;
  private Map<String, RecordWriter<?, ?>> recordWriters;
  private boolean countersEnabled;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `context` is accessed in both synchronized and unsynchronized contexts
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
  // instance code, to be used from Mapper/Reducer code

  private TaskInputOutputContext<?, ?, ?, ?> context;
  private Set<String> namedOutputs;
  private Map<String, RecordWriter<?, ?>> recordWriters;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `remote` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/DatagramTransceiver.java`
#### Snippet
```java

  private DatagramChannel channel;
  private SocketAddress remote;
  private ByteBuffer buffer = ByteBuffer.allocate(MAX_SIZE);

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `channel` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketTransceiver.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(SocketTransceiver.class);

  private SocketChannel channel;
  private ByteBuffer header = ByteBuffer.allocate(4);

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `url` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/HttpTransceiver.java`
#### Snippet
```java
  static final String CONTENT_TYPE = "avro/binary";

  private URL url;
  private Proxy proxy;
  private HttpURLConnection connection;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `timeout` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/HttpTransceiver.java`
#### Snippet
```java
  private Proxy proxy;
  private HttpURLConnection connection;
  private int timeout;

  public HttpTransceiver(URL url) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sasl` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java
  }

  private SaslParticipant sasl;
  private SocketChannel channel;
  private boolean dataIsWrapped;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `writeHeader` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java

  private ByteBuffer readHeader = ByteBuffer.allocate(4);
  private ByteBuffer writeHeader = ByteBuffer.allocate(4);
  private ByteBuffer zeroHeader = ByteBuffer.allocate(4).putInt(0);

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `saslResponsePiggybacked` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java
  private SocketChannel channel;
  private boolean dataIsWrapped;
  private boolean saslResponsePiggybacked;

  private Protocol remote;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataIsWrapped` is accessed in both synchronized and unsynchronized contexts
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java
  private SaslParticipant sasl;
  private SocketChannel channel;
  private boolean dataIsWrapped;
  private boolean saslResponsePiggybacked;

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
  private static class ReorderBuffer {
    public Map<String, TokenBuffer> savedFields = new HashMap<>();
    public JsonParser origParser = null;
  }

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
  // "detach source" code and source access to the buffer, but
  // hurts performance.
  private byte[] buf = null;
  private int minPos = 0;
  private int pos = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
  protected final int maxBytesLength;

  private ByteSource source = null;
  // we keep the buffer and its state variables in this class and not in a
  // container class for performance reasons. This improves performance
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    private int position;
    private int max;
    private boolean compacted = false;

    private ByteArrayByteSource(byte[] data, int start, int len) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
  private static class InputStreamByteSource extends ByteSource {
    private InputStream in;
    protected boolean isEof = false;

    private InputStreamByteSource(InputStream in) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
  private byte[] buf = null;
  private int minPos = 0;
  private int pos = 0;
  private int limit = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
  // hurts performance.
  private byte[] buf = null;
  private int minPos = 0;
  private int pos = 0;
  private int limit = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    private int pos;
    private int limit;
    boolean detached = false;

    private BufferAccessor(BinaryDecoder decoder) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
  private int minPos = 0;
  private int pos = 0;
  private int limit = 0;

  byte[] getBuf() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    }

    private String enumDefault = null;

    private static <R> EnumBuilder<R> create(Completion<R> context, NameContext names, String name) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
   */
  public static abstract class PropBuilder<S extends PropBuilder<S>> {
    private Map<String, JsonNode> props = null;

    protected PropBuilder() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
    private long numEntries;
    private int blockSize;
    private int offset = 0;
    private boolean flushOnWrite = true;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
   * Secondary decoder, for datums. (Different than vin for block segments.)
   */
  BinaryDecoder datumIn = null;

  ByteBuffer blockBuffer;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
  private DatumReader<D> reader;
  private long blockSize;
  private boolean availableBlock = false;
  private Header header;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
  }

  private DataBlock block = null;

  /** True if more entries remain in this file. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/util/ReusableByteBufferInputStream.java`
#### Snippet
```java
  private ByteBuffer byteBuffer = EMPTY_BUFFER;
  private Buffer buffer = byteBuffer;
  private int mark = 0;

  public void setByteBuffer(ByteBuffer buf) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
  private Schema actual;
  private Schema expected;
  private DatumReader<D> fastDatumReader = null;

  private ResolvingDecoder creatorResolver = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
  private DatumReader<D> fastDatumReader = null;

  private ResolvingDecoder creatorResolver = null;
  private final Thread creator;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroTrevniOutputFormat.java`
#### Snippet
```java

    return new RecordWriter<AvroWrapper<T>, NullWritable>() {
      private int part = 0;

      private AvroColumnWriter<T> writer = new AvroColumnWriter<>(schema, meta, ReflectData.get());
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/mapreduce/AvroTrevniRecordWriterBase.java`
#### Snippet
```java
   * file has exceeded the block size
   */
  protected int part = 0;

  /** Trevni file writer */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
  public static final String FAST_READER_PROP = "org.apache.avro.fastread";
  private boolean fastReaderEnabled = "true".equalsIgnoreCase(System.getProperty(FAST_READER_PROP));
  private FastReaderBuilder fastReaderBuilder = null;

  public GenericData setFastReaderEnabled(boolean flag) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
    public Iterator<T> iterator() {
      return new Iterator<T>() {
        private int position = 0;

        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
  final Map<String, Tool> tools;

  int maxLen = 0;

  Main() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
   * disabled.
   */
  private boolean defaultGenerated = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransportCodec.java`
#### Snippet
```java
   */
  public static class NettyFrameDecoder extends ByteToMessageDecoder {
    private boolean packHeaderRead = false;
    private int listSize;
    private NettyDataPack dataPack;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroUtf8InputFormat.java`
#### Snippet
```java
  }

  private CompressionCodecFactory compressionCodecs = null;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/SequenceFileReader.java`
#### Snippet
```java
  private SequenceFile.Reader reader;
  private Schema schema;
  private boolean ready = false; // true iff done & key are current
  private boolean done = false; // true iff at EOF
  private Writable key, spareKey, value;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/SequenceFileReader.java`
#### Snippet
```java
  private Schema schema;
  private boolean ready = false; // true iff done & key are current
  private boolean done = false; // true iff at EOF
  private Writable key, spareKey, value;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroInputStream.java`
#### Snippet
```java
  protected static class CountingOutputStream extends OutputStream {
    private final OutputStream target;
    private int writtenCount = 0;

    public CountingOutputStream(OutputStream target) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ColumnValues.java`
#### Snippet
```java
  private InputBuffer values;
  private int block = -1;
  private long row = 0;
  private T previous;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter property="gettersReturnOptional"
   */
  protected boolean gettersReturnOptional = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter property="createOptionalGetters"
   */
  protected boolean createOptionalGetters = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter property="optionalGettersForNullableFieldsOnly"
   */
  protected boolean optionalGettersForNullableFieldsOnly = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/CallFuture.java`
#### Snippet
```java
  private final CountDownLatch latch = new CountDownLatch(1);
  private final Callback<T> chainedCallback;
  private T result = null;
  private Throwable error = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/CallFuture.java`
#### Snippet
```java
  private final Callback<T> chainedCallback;
  private T result = null;
  private Throwable error = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Ipc.java`
#### Snippet
```java
  } // no public ctor

  static boolean warned = false;

  /** Create a client {@link Transceiver} connecting to the provided URI. */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
  private String templateDir;
  private FieldVisibility fieldVisibility = FieldVisibility.PRIVATE;
  private boolean createOptionalGetters = false;
  private boolean gettersReturnOptional = false;
  private boolean optionalGettersForNullableFieldsOnly = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
  private FieldVisibility fieldVisibility = FieldVisibility.PRIVATE;
  private boolean createOptionalGetters = false;
  private boolean gettersReturnOptional = false;
  private boolean optionalGettersForNullableFieldsOnly = false;
  private boolean createSetters = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
  private boolean createOptionalGetters = false;
  private boolean gettersReturnOptional = false;
  private boolean optionalGettersForNullableFieldsOnly = false;
  private boolean createSetters = true;
  private boolean createAllArgsConstructor = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
  private boolean createAllArgsConstructor = true;
  private String outputCharacterEncoding;
  private boolean enableDecimalLogicalType = false;
  private String suffix = ".java";
  private List<Object> additionalVelocityTools = Collections.emptyList();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/Histogram.java`
#### Snippet
```java
        Iterator<T> it = index.keySet().iterator();
        T cur = it.next(); // there's always at least one element
        int pos = 0;

        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/Histogram.java`
#### Snippet
```java

  private class EntryIterator implements Iterable<Entry<B>>, Iterator<Entry<B>> {
    int i = 0;
    Iterator<B> bucketNameIterator = segmenter.getBuckets();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java

  private final Type type;
  private LogicalType logicalType = null;

  Schema(Type type) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  static class LockableArrayList<E> extends ArrayList<E> {
    private static final long serialVersionUID = 1L;
    private boolean locked = false;

    public LockableArrayList() {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static class EnumSchema extends NamedSchema {
    private final List<String> symbols;
    private final Map<String, Integer> ordinals;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static class MapSchema extends Schema {
    private final Schema valueType;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static class UnionSchema extends Schema {
    private final List<Schema> types;
    private final Map<String, Integer> indexByName;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static class FixedSchema extends NamedSchema {
    private final int size;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  }

  private static class ArraySchema extends Schema {
    private final Schema elementType;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java

  @SuppressWarnings(value = "unchecked")
  private static class RecordSchema extends NamedSchema {
    private List<Field> fields;
    private Map<String, Field> fieldMap;
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`bits & 0xFFFFFFFF` can be replaced with 'bits'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
  public static int encodeDouble(double d, byte[] buf, int pos) {
    final long bits = Double.doubleToRawLongBits(d);
    int first = (int) (bits & 0xFFFFFFFF);
    int second = (int) ((bits >>> 32) & 0xFFFFFFFF);
    // the compiler seems to execute this order the best, likely due to
```

### PointlessBitwiseExpression
`(bits >>> 32) & 0xFFFFFFFF` can be replaced with '(bits \>\>\> 32)'
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    final long bits = Double.doubleToRawLongBits(d);
    int first = (int) (bits & 0xFFFFFFFF);
    int second = (int) ((bits >>> 32) & 0xFFFFFFFF);
    // the compiler seems to execute this order the best, likely due to
    // register allocation -- the lifetime of constants is minimized.
```

### PointlessBitwiseExpression
`l & 0xFFFFFFFF` can be replaced with 'l'
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
  public void writeFixed64(long l) throws IOException {
    ensure(8);
    int first = (int) (l & 0xFFFFFFFF);
    int second = (int) ((l >>> 32) & 0xFFFFFFFF);
    buf[count] = (byte) ((first) & 0xFF);
```

### PointlessBitwiseExpression
`(l >>> 32) & 0xFFFFFFFF` can be replaced with '(l \>\>\> 32)'
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    ensure(8);
    int first = (int) (l & 0xFFFFFFFF);
    int second = (int) ((l >>> 32) & 0xFFFFFFFF);
    buf[count] = (byte) ((first) & 0xFF);
    buf[count + 4] = (byte) ((second) & 0xFF);
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Parser.ActionHandler`
in `lang/java/avro/src/main/java/org/apache/avro/io/ValidatingDecoder.java`
#### Snippet
```java
 * @see DecoderFactory
 */
public class ValidatingDecoder extends ParsingDecoder implements Parser.ActionHandler {
  protected Decoder in;

```

### RedundantImplements
Redundant interface declaration `Parser.ActionHandler`
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
 * JsonDecoder is not thread-safe.
 */
public class JsonDecoder extends ParsingDecoder implements Parser.ActionHandler {
  private JsonParser in;
  private static JsonFactory jsonFactory = new JsonFactory();
```

### RedundantImplements
Redundant interface declaration `Closeable`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java

/** Read files written by Avro version 1.2. */
public class DataFileReader12<D> implements FileReader<D>, Closeable {
  private static final byte VERSION = 0;
  static final byte[] MAGIC = new byte[] { (byte) 'O', (byte) 'b', (byte) 'j', VERSION };
```

### RedundantImplements
Redundant interface declaration `Closeable`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/FsInput.java`
#### Snippet
```java

/** Adapt an {@link FSDataInputStream} to {@link SeekableInput}. */
public class FsInput implements Closeable, SeekableInput {
  private final FSDataInputStream stream;
  private final long len;
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `SpecificExceptionBase` does not end with 'Exception'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificExceptionBase.java`
#### Snippet
```java

/** Base class for specific exceptions. */
public abstract class SpecificExceptionBase extends AvroRemoteException implements SpecificRecord, Externalizable {

  public SpecificExceptionBase() {
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
      return schemaTypeCache.computeIfAbsent(type, t -> createSchema(t, new HashMap<>()));
    } catch (Exception e) {
      throw (e instanceof AvroRuntimeException) ? (AvroRuntimeException) e : new AvroRuntimeException(e);
    }
  }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
      workerGroup.shutdownGracefully();

      if (e instanceof IOException)
        throw (IOException) e;
      if (e instanceof RuntimeException)
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
      if (e instanceof IOException)
        throw (IOException) e;
      if (e instanceof RuntimeException)
        throw (RuntimeException) e;
      // all that's left is Error
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/specific/SpecificRequestor.java`
#### Snippet
```java

        // Next, check for RuntimeExceptions:
        if (e instanceof RuntimeException) {
          throw e;
        }
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java
    String filename = avroOutputDirectory.getPath() + File.separator + klass.getName().replace(".", File.separator);
    if (klass.isInterface()) {
      return filename.concat(".avpr");
    } else {
      return filename.concat(".avsc");
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java
      return filename.concat(".avpr");
    } else {
      return filename.concat(".avsc");
    }
  }
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
    for (int i = 0, n = fixups.size(); i < n; i += 1) {
      Fixup fixup = fixups.get(i);
      if (fixup.symbols == toCopy) {
        fixups.add(new Fixup(out, fixup.pos + outPos));
      }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `unionSchema` of exception class
in `lang/java/avro/src/main/java/org/apache/avro/UnresolvedUnionException.java`
#### Snippet
```java
public class UnresolvedUnionException extends AvroRuntimeException {
  private Object unresolvedDatum;
  private Schema unionSchema;

  public UnresolvedUnionException(Schema unionSchema, Object unresolvedDatum) {
```

### NonFinalFieldOfException
Non-final field `unresolvedDatum` of exception class
in `lang/java/avro/src/main/java/org/apache/avro/UnresolvedUnionException.java`
#### Snippet
```java
/** Thrown when the expected contents of a union cannot be resolved. */
public class UnresolvedUnionException extends AvroRuntimeException {
  private Object unresolvedDatum;
  private Schema unionSchema;

```

### NonFinalFieldOfException
Non-final field `chainOfFields` of exception class
in `lang/java/avro/src/main/java/org/apache/avro/AvroMissingFieldException.java`
#### Snippet
```java
/** Avro exception in case of missing fields. */
public class AvroMissingFieldException extends AvroRuntimeException {
  private List<Field> chainOfFields = new ArrayList<>(8);

  public AvroMissingFieldException(String message, Field field) {
```

### NonFinalFieldOfException
Non-final field `value` of exception class
in `lang/java/avro/src/main/java/org/apache/avro/AvroRemoteException.java`
#### Snippet
```java
/** Base class for exceptions thrown to client by server. */
public class AvroRemoteException extends Exception {
  private Object value;

  protected AvroRemoteException() {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java

    public HashData() {
      this.decoder = new BinaryDecoder(new byte[0], 0, 0);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java

    public Decoders() {
      this.d1 = new BinaryDecoder(new byte[0], 0, 0);
      this.d2 = new BinaryDecoder(new byte[0], 0, 0);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    public Decoders() {
      this.d1 = new BinaryDecoder(new byte[0], 0, 0);
      this.d2 = new BinaryDecoder(new byte[0], 0, 0);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
    this.buf = new byte[blockBufferSize];
    this.pos = 0;
    blockStack = new BlockedValue[0];
    expandStack();
    BlockedValue bv = blockStack[++stackTop];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/data/RecordBuilderBase.java`
#### Snippet
```java
    this.schema = schema;
    this.data = data;
    fields = schema.getFields().toArray(new Field[0]);
    fieldSetFlags = new boolean[fields.length];
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/data/RecordBuilderBase.java`
#### Snippet
```java
    this.schema = other.schema;
    this.data = data;
    fields = schema.getFields().toArray(new Field[0]);
    fieldSetFlags = Arrays.copyOf(other.fieldSetFlags, other.fieldSetFlags.length);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/util/ReusableByteArrayInputStream.java`
#### Snippet
```java
public class ReusableByteArrayInputStream extends ByteArrayInputStream {
  public ReusableByteArrayInputStream() {
    super(new byte[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/ResolvingGrammarGenerator.java`
#### Snippet
```java
        seen.put(s, result);
        int i = production.length;
        production[--i] = Symbol.fieldOrderAction(s.getFields().toArray(new Schema.Field[0]));
        for (Field f : s.getFields()) {
          production[--i] = simpleGen(f.schema(), seen);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroTrevniInputFormat.java`
#### Snippet
```java
      if (file.getPath().getName().endsWith(AvroTrevniOutputFormat.EXT))
        result.add(file);
    return result.toArray(new FileStatus[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
  /** Return columns for the schema. */
  public ColumnMetaData[] getColumns() {
    return columns.toArray(new ColumnMetaData[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/RecodecTool.java`
#### Snippet
```java
    OptionSpec<String> codecOpt = Util.compressionCodecOptionWithDefault(optParser, DataFileConstants.NULL_CODEC);
    OptionSpec<Integer> levelOpt = Util.compressionLevelOption(optParser);
    OptionSet opts = optParser.parse(args.toArray(new String[0]));

    List<String> nargs = (List<String>) opts.nonOptionArguments();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/JsonToBinaryFragmentTool.java`
#### Snippet
```java
        .ofType(String.class);

    OptionSet optionSet = optionParser.parse(args.toArray(new String[0]));
    List<String> nargs = (List<String>) optionSet.nonOptionArguments();
    String schemaFile = schemaFileOption.value(optionSet);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/ToTextTool.java`
#### Snippet
```java

    OptionParser p = new OptionParser();
    OptionSet opts = p.parse(args.toArray(new String[0]));
    if (opts.nonOptionArguments().size() != 2) {
      err.println("Expected 2 args: from_file to_file (filenames or '-' for stdin/stdout");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/FromTextTool.java`
#### Snippet
```java
    OptionSpec<String> codec = Util.compressionCodecOption(p);

    OptionSet opts = p.parse(args.toArray(new String[0]));

    List<String> nargs = (List<String>) opts.nonOptionArguments();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/SchemaNormalizationTool.java`
#### Snippet
```java
  public int run(InputStream stdin, PrintStream out, PrintStream err, List<String> args) throws Exception {
    OptionParser p = new OptionParser();
    OptionSet opts = p.parse(args.toArray(new String[0]));

    if (opts.nonOptionArguments().size() != 2) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
    OptionParser p = new OptionParser();
    OptionSpec<String> keyOption = p.accepts("key", "Metadata key").withOptionalArg().ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));
    String keyName = keyOption.value(opts);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
  public int run(InputStream ins, PrintStream outs, PrintStream err, List<String> args) throws Exception {

    String[] argarry = args.toArray(new String[0]);
    Options opts = new Options();

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/CreateRandomFileTool.java`
#### Snippet
```java
    OptionSpec<Long> seedOpt = p.accepts("seed", "Seed for random").withOptionalArg().ofType(Long.class);

    OptionSet opts = p.parse(args.toArray(new String[0]));
    if (opts.nonOptionArguments().size() != 1) {
      err.println("Usage: outFile (filename or '-' for stdout)");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/RecordCountTool.java`
#### Snippet
```java
  public int run(InputStream stdin, PrintStream out, PrintStream err, List<String> args) throws Exception {
    OptionParser optionParser = new OptionParser();
    OptionSet optionSet = optionParser.parse(args.toArray(new String[0]));
    List<String> nargs = (List<String>) optionSet.nonOptionArguments();

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
      c = c.getSuperclass();
    } while (c != null);
    fieldsList = fields.values().toArray(new Field[0]);
    return fieldsList;
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileReadTool.java`
#### Snippet
```java
        .ofType(String.class);

    OptionSet optionSet = optionParser.parse(args.toArray(new String[0]));
    Boolean pretty = optionSet.has(prettyOption);
    List<String> nargs = new ArrayList<>((List<String>) optionSet.nonOptionArguments());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcSendTool.java`
#### Snippet
```java
    OptionSpec<String> data = p.accepts("data", "JSON-encoded request parameters.").withRequiredArg()
        .ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));
    args = (List<String>) opts.nonOptionArguments();

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileWriteTool.java`
#### Snippet
```java
    OptionSpec<String> file = p.accepts("schema-file", "Schema File").withOptionalArg().ofType(String.class);
    OptionSpec<String> inschema = p.accepts("schema", "Schema").withOptionalArg().ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));

    List<String> nargs = (List<String>) opts.nonOptionArguments();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/ToTrevniTool.java`
#### Snippet
```java
    OptionSpec<String> codec = p.accepts("codec", "Compression codec").withRequiredArg().defaultsTo("null")
        .ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));
    if (opts.nonOptionArguments().size() != 2) {
      err.println("Usage: inFile outFile (filenames or '-' for stdin/stdout)");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/BinaryFragmentToJsonTool.java`
#### Snippet
```java
        .ofType(String.class);

    OptionSet optionSet = optionParser.parse(args.toArray(new String[0]));
    Boolean noPretty = optionSet.has(noPrettyOption);
    List<String> nargs = (List<String>) optionSet.nonOptionArguments();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/SchemaFingerprintTool.java`
#### Snippet
```java
        .withRequiredArg().ofType(String.class).defaultsTo("CRC-64-AVRO");

    final OptionSet opts = optParser.parse(args.toArray(new String[0]));
    final Schema.Parser parser = new Schema.Parser();
    final List<String> nargs = (List<String>) opts.nonOptionArguments();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcReceiveTool.java`
#### Snippet
```java
        .ofType(String.class);
    OptionSpec<String> data = p.accepts("data", "JSON-encoded response datum.").withRequiredArg().ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));
    args = (List<String>) opts.nonOptionArguments();

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
        .withRequiredArg().ofType(Double.class).defaultsTo(Double.valueOf(1));

    OptionSet opts = optParser.parse(args.toArray(new String[0]));
    List<String> nargs = (List<String>) opts.nonOptionArguments();
    if (nargs.size() < 2) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransportCodec.java`
#### Snippet
```java
        bbs.add(b);
      }
      out.add(wrappedBuffer(bbs.toArray(new ByteBuffer[0])));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
        // sort files in directory to compile deterministically
        // independent of system/ locale
        Collections.addAll(fileSet, files != null ? sortFiles(files) : new File[0]);
      }
      // otherwise, just add the file.
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    }

    return fileSet.toArray(new File[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerialization.java`
#### Snippet
```java
    if (!serializations.contains(AvroSerialization.class.getName())) {
      serializations.add(AvroSerialization.class.getName());
      conf.setStrings("io.serializations", serializations.toArray(new String[0]));
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroAsTextInputFormat.java`
#### Snippet
```java
        if (file.getPath().getName().endsWith(AvroOutputFormat.EXT))
          result.add(file);
      return result.toArray(new FileStatus[0]);
    } else {
      return super.listStatus(job);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/DelegatingInputFormat.java`
#### Snippet
```java
        }

        FileInputFormat.setInputPaths(confCopy, paths.toArray(new Path[0]));

        // Get splits for each input path and tag with InputFormat
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/DelegatingInputFormat.java`
#### Snippet
```java
    }

    return splits.toArray(new InputSplit[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroInputFormat.java`
#### Snippet
```java
        if (file.getPath().getName().endsWith(AvroOutputFormat.EXT))
          result.add(file);
      status = result.toArray(new FileStatus[0]);
    }
    return status;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroJob.java`
#### Snippet
```java
    if (!serializations.contains(AvroSerialization.class.getName())) {
      serializations.add(AvroSerialization.class.getName());
      job.setStrings("io.serializations", serializations.toArray(new String[0]));
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherInputFormat.java`
#### Snippet
```java
        if (file.getPath().getName().endsWith(AvroOutputFormat.EXT))
          result.add(file);
      return result.toArray(new FileStatus[0]);
    } else {
      return super.listStatus(job);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherJob.java`
#### Snippet
```java
    if (!serializations.contains(TetherKeySerialization.class.getName())) {
      serializations.add(TetherKeySerialization.class.getName());
      job.setStrings("io.serializations", serializations.toArray(new String[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/IDLProtocolMojo.java`
#### Snippet
```java
      }

      URLClassLoader projPathLoader = new URLClassLoader(runtimeUrls.toArray(new URL[0]),
          Thread.currentThread().getContextClassLoader());
      try (Idl parser = new Idl(new File(sourceDirectory, filename), projPathLoader)) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter property="customLogicalTypeFactories"
   */
  protected String[] customLogicalTypeFactories = new String[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter property="velocityToolsClassesNames"
   */
  protected String[] velocityToolsClassesNames = new String[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter property="customConversions"
   */
  protected String[] customConversions = new String[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
    final List<URL> urls = appendElements(project.getRuntimeClasspathElements());
    urls.addAll(appendElements(project.getTestClasspathElements()));
    return new URLClassLoader(urls.toArray(new URL[0]), Thread.currentThread().getContextClassLoader());
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter
   */
  protected String[] testExcludes = new String[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
   * @parameter
   */
  protected String[] excludes = new String[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
    final Object value = props.getObjectProp("javaAnnotation");
    if (value == null)
      return new String[0];
    if (value instanceof String)
      return new String[] { value.toString() };
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
        annots.add(o.toString());
      }
      return annots.toArray(new String[0]);
    }
    return new String[0];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
      return annots.toArray(new String[0]);
    }
    return new String[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java
    writes.add(zeroHeader);

    writeFully(writes.toArray(new ByteBuffer[0]));
  }

```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcSendTool.java`
#### Snippet
```java
    Message message = protocol.getMessages().get(messageName);
    if (message == null) {
      err.println(String.format("No message named '%s' found in protocol '%s'.", messageName, protocol));
      return 1;
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcReceiveTool.java`
#### Snippet
```java
      if (!message.equals(expectedMessage)) {
        out.println(
            String.format("Expected message '%s' but received '%s'.", expectedMessage.getName(), message.getName()));
        latch.countDown();
        throw new IllegalArgumentException("Unexpected message.");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcReceiveTool.java`
#### Snippet
```java
    expectedMessage = protocol.getMessages().get(messageName);
    if (expectedMessage == null) {
      err.println(String.format("No message named '%s' found in protocol '%s'.", messageName, protocol));
      return 1;
    }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  public synchronized boolean waitForFinish() throws InterruptedException {
    while (!isFinished())
      wait();
    return error != null;
  }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    LOG.info("got task complete");
    complete = true;
    notify();
  }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    } catch (Throwable e) {
      LOG.warn("Error: " + e, e);
      synchronized (this) {
        error = e.toString();
      }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    if (inputPort == 0) {
      LOG.info("waiting for input port from child");
      wait(TIMEOUT);
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    LOG.info("got input port from child: inputport=" + inputPort);
    this.inputPort = inputPort;
    notify();
  }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    LOG.warn("Failing: " + message);
    error = message;
    notify();
  }

```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumWriter.java`
#### Snippet
```java
    out.writeArrayStart();
    out.setItemCount(size);
    for (Iterator<? extends Object> it = getArrayElements(datum); it.hasNext();) {
      out.startItem();
      try {
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `PathTracingException` ends with 'Exception'
in `lang/java/avro/src/main/java/org/apache/avro/path/PathTracingException.java`
#### Snippet
```java
 *            {@link #summarize(Schema)}ed out of this class
 */
public interface PathTracingException<T extends Throwable> {
  /**
   * appends a path element to the trace. expected to be called in reverse-order
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `json` initializer `null` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
    for (Entry<String, ?> a : propMap.entrySet()) {
      Object v = a.getValue();
      JsonNode json = null;
      if (v instanceof String) {
        json = TextNode.valueOf((String) v);
```

### UnusedAssignment
The value changed at `len++` is never used
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
        | ((buf[pos + len++] & 0xff) << 24);
    int n2 = (buf[pos + len++] & 0xff) | ((buf[pos + len++] & 0xff) << 8) | ((buf[pos + len++] & 0xff) << 16)
        | ((buf[pos + len++] & 0xff) << 24);
    if ((pos + 8) > limit) {
      throw new EOFException();
```

### UnusedAssignment
The value changed at `len++` is never used
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    int len = 1;
    int n = (buf[pos] & 0xff) | ((buf[pos + len++] & 0xff) << 8) | ((buf[pos + len++] & 0xff) << 16)
        | ((buf[pos + len++] & 0xff) << 24);
    if ((pos + 4) > limit) {
      throw new EOFException();
```

### UnusedAssignment
Variable `readCount` initializer `-1` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/file/BZip2Codec.java`
#### Snippet
```java
    try (BZip2CompressorInputStream inputStream = new BZip2CompressorInputStream(bais)) {

      int readCount = -1;
      while ((readCount = inputStream.read(buffer, compressedData.position(), buffer.length)) > 0) {
        baos.write(buffer, 0, readCount);
```

### UnusedAssignment
Variable `sync` initializer `new byte[SYNC_SIZE]` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java
  private long blockCount; // # entries in block
  private long blockStart;
  private byte[] sync = new byte[SYNC_SIZE];
  private byte[] syncBuffer = new byte[SYNC_SIZE];

```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
    CommandLineParser parser = new GnuParser();

    CommandLine line = null;
    HelpFormatter formatter = new HelpFormatter();

```

### UnusedAssignment
Variable `blockSize` initializer `0` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
    int recordsWritten = 0;
    long position = fileReader.previousSync();
    long blockSize = 0;
    long blockCount = 0;
    boolean fileWritten = false;
```

### UnusedAssignment
Variable `blockCount` initializer `0` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
    long position = fileReader.previousSync();
    long blockSize = 0;
    long blockCount = 0;
    boolean fileWritten = false;
    try {
```

### UnusedAssignment
Variable `arg` initializer `0` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      args.remove(args.indexOf("-addExtraOptionalGetters"));
    }
    int arg = 0;

    if (args.contains("-optionalGetters")) {
```

### UnusedAssignment
Variable `executable` initializer `""` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
    List<String> command = new ArrayList<>();

    String executable = "";
    if (job.getBoolean(TetherJob.TETHER_EXEC_CACHED, false)) {
      // we want to use the cached executable
```

### UnusedAssignment
Variable `methodResponse` initializer `null` is redundant
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcServer.java`
#### Snippet
```java
    @Override
    public void invoke(Object[] request, StreamObserver<Object> responseObserver) {
      Object methodResponse = null;
      try {
        methodResponse = method.invoke(getServiceImpl(), request);
```

### UnusedAssignment
Variable `readCount` initializer `-1` is redundant
in `lang/java/trevni/core/src/main/java/org/apache/trevni/BZip2Codec.java`
#### Snippet
```java
      byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

      int readCount = -1;

      while ((readCount = inputStream.read(buffer, compressedData.position(), buffer.length)) > 0) {
```

### UnusedAssignment
The value changed at `len++` is never used
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
    int len = 1;
    int n = (buf[pos] & 0xff) | ((buf[pos + len++] & 0xff) << 8) | ((buf[pos + len++] & 0xff) << 16)
        | ((buf[pos + len++] & 0xff) << 24);
    if ((pos + 4) > limit)
      throw new EOFException();
```

### UnusedAssignment
Variable `payload` initializer `null` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Responder.java`
#### Snippet
```java
    Exception error = null;
    RPCContext context = new RPCContext();
    List<ByteBuffer> payload = null;
    List<ByteBuffer> handshake = null;
    boolean wasConnected = connection != null && connection.isConnected();
```

### UnusedAssignment
Variable `keys` initializer `null` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java

    // Get set of all seen messages
    Set<Message> keys = null;
    synchronized (this.statsPlugin.methodTimings) {
      keys = this.statsPlugin.methodTimings.keySet();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `n == 0` is always `true`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
          // infinite loop waiting for -1 with some classes others
          // spuriously will return 0 on occasion without EOF
          if (n == 0) {
            if (readZero) {
              isEof = true;
```

### ConstantValue
Condition `n == 0` is always `true`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
        // infinite loop waiting for -1 with some classes others
        // spuriously will return 0 on occasion without EOF
        if (n == 0) {
          if (readZero) {
            isEof = true;
```

### ConstantValue
Value `DEFAULT_ZSTANDARD_BUFFERPOOL` is always 'false'
in `lang/java/avro/src/main/java/org/apache/avro/file/CodecFactory.java`
#### Snippet
```java
    addCodec(DataFileConstants.BZIP2_CODEC, bzip2Codec());
    addCodec(DataFileConstants.XZ_CODEC, xzCodec(DEFAULT_XZ_LEVEL));
    addCodec(DataFileConstants.ZSTANDARD_CODEC, zstandardCodec(DEFAULT_ZSTANDARD_LEVEL, DEFAULT_ZSTANDARD_BUFFERPOOL));
    addCodec(DataFileConstants.SNAPPY_CODEC, snappyCodec());
  }
```

### ConstantValue
Condition `noAdj` at the left side of assignment expression is always `true`. Can be simplified
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
      noAdj = (adj.length <= rsymCount);
      for (int i = 0; noAdj && i < count; i++) {
        noAdj &= (i == adj[i]);
      }
      this.noAdjustmentsNeeded = noAdj;
```

### ConstantValue
Condition `result` at the left side of assignment expression is always `true`. Can be simplified
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
      boolean result = true;
      for (int i = 0; result && i < readerOrder.length; i++) {
        result &= (i == readerOrder[i].pos());
      }
      return result;
```

### ConstantValue
Condition `reversePath == null` is always `false`
in `lang/java/avro/src/main/java/org/apache/avro/path/TracingClassCastException.java`
#### Snippet
```java
    sb.append("value ").append(SchemaUtil.describe(datum));
    sb.append(" cannot be cast to expected type ").append(SchemaUtil.describe(expected));
    if (reversePath == null || reversePath.isEmpty()) {
      // very simple "shallow" NPE, no nesting at all, or custom coders used means we
      // have no data
```

### ConstantValue
Condition `reversePath == null` is always `false`
in `lang/java/avro/src/main/java/org/apache/avro/path/TracingNullPointException.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("null value for (non-nullable) ");
    if (reversePath == null || reversePath.isEmpty()) {
      // very simple "shallow" NPE, no nesting at all, or custom coders used means we
      // have no data
```

### ConstantValue
Condition `valid` at the left side of assignment expression is always `true`. Can be simplified
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
    private boolean validate(FieldAccess access) throws Exception {
      boolean valid = true;
      valid &= validField(access, "b", b, false);
      valid &= validField(access, "by", by, (byte) 0xaf);
      valid &= validField(access, "c", c, 'C');
```

### ConstantValue
Condition `ch >= '\u0000'` is always `true`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      default:
        // Reference: https://www.unicode.org/versions/Unicode5.1.0/
        if ((ch >= '\u0000' && ch <= '\u001F') || (ch >= '\u007F' && ch <= '\u009F')
            || (ch >= '\u2000' && ch <= '\u20FF')) {
          String hex = Integer.toHexString(ch);
```

### ConstantValue
Condition `m2.size() != m2.size()` is always `false`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
    }

    if (m2.size() != m2.size()) {
      return 1;
    }
```

### ConstantValue
Condition `noAdj` at the left side of assignment expression is always `true`. Can be simplified
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
        noAdj = (adjustments.length <= rsymCount);
        for (int i = 0; noAdj && i < count; i++)
          noAdj &= ((adjustments[i] instanceof Integer) && i == (Integer) adjustments[i]);
      }
      this.noAdjustments = noAdj;
```

### ConstantValue
Condition `noReorder` at the left side of assignment expression is always `true`. Can be simplified
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
      boolean noReorder = true;
      for (int i = 0; noReorder && i < fields.length; i++)
        noReorder &= (i == fields[i].pos());
      this.noReorder = noReorder;
    }
```

### ConstantValue
Value `recoverPrior` is always 'false'
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
        }
      } else {
        return innerRecover(fileReader, null, out, err, recoverPrior, recoverAfter, null, null);
      }

```

### ConstantValue
Value `recoverAfter` is always 'false'
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
        }
      } else {
        return innerRecover(fileReader, null, out, err, recoverPrior, recoverAfter, null, null);
      }

```

### ConstantValue
Condition `c == null` is always `false`
in `lang/java/thrift/src/main/java/org/apache/avro/thrift/ThriftDatumReader.java`
#### Snippet
```java
    try {
      Class c = ClassUtils.forName(SpecificData.getClassName(schema));
      if (c == null)
        return super.createEnum(symbol, schema); // punt to generic
      return Enum.valueOf(c, symbol);
```

### ConstantValue
Condition `c == null` is always `false`
in `lang/java/thrift/src/main/java/org/apache/avro/thrift/ThriftData.java`
#### Snippet
```java
    try {
      Class c = ClassUtils.forName(SpecificData.getClassName(schema));
      if (c == null)
        return super.newRecord(old, schema); // punt to generic
      if (c.isInstance(old))
```

### ConstantValue
Condition `!nullValue` is always `true` when reached
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroTextOutputFormat.java`
#### Snippet
```java
      } else if (!nullKey && nullValue) {
        writer.append(toByteBuffer(key));
      } else if (nullKey && !nullValue) {
        writer.append(toByteBuffer(value));
      } else {
```

### ConstantValue
Value `nullValue` is always 'false'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroTextOutputFormat.java`
#### Snippet
```java
      } else if (!nullKey && nullValue) {
        writer.append(toByteBuffer(key));
      } else if (nullKey && !nullValue) {
        writer.append(toByteBuffer(value));
      } else {
```

### ConstantValue
Condition `n <= (1 << (7 * 5)) - 1` is always `false`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 4)) - 1)
      return 4;
    if (n <= (1 << (7 * 5)) - 1)
      return 5;
    if (n <= (1 << (7 * 6)) - 1)
```

### ConstantValue
Condition `n <= (1 << (7 * 6)) - 1` is always `false`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 5)) - 1)
      return 5;
    if (n <= (1 << (7 * 6)) - 1)
      return 6;
    if (n <= (1 << (7 * 7)) - 1)
```

### ConstantValue
Condition `n <= (1 << (7 * 7)) - 1` is always `false`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 6)) - 1)
      return 6;
    if (n <= (1 << (7 * 7)) - 1)
      return 7;
    if (n <= (1 << (7 * 8)) - 1)
```

### ConstantValue
Condition `n <= (1 << (7 * 8)) - 1` is always `false`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 7)) - 1)
      return 7;
    if (n <= (1 << (7 * 8)) - 1)
      return 8;
    if (n <= (1 << (7 * 9)) - 1)
```

### ConstantValue
Condition `name != null` is always `true`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        List<Field> fields = new ArrayList<>();
        result = new RecordSchema(name, doc, isTypeError);
        if (name != null)
          names.add(result);
        JsonNode fieldsNode = schema.get("fields");
```

### ConstantValue
Condition `name != null` is always `true`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
          defaultSymbol = enumDefault.textValue();
        result = new EnumSchema(name, doc, symbols, defaultSymbol);
        if (name != null)
          names.add(result);
      } else if (type.equals("array")) { // array
```

### ConstantValue
Condition `name != null` is always `true`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
          throw new SchemaParseException("Invalid or no size: " + schema);
        result = new FixedSchema(name, doc, sizeNode.intValue());
        if (name != null)
          names.add(result);
      } else { // For unions with self reference
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java

  /** Return the singleton instance. */
  public static SpecificData get() {
    return INSTANCE;
  }
```

### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java

    /** Return the singleton instance. */
    public static AllowNull get() {
      return INSTANCE;
    }
```

### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java

  /** Return the singleton instance. */
  public static ReflectData get() {
    return INSTANCE;
  }
```

### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `lang/java/thrift/src/main/java/org/apache/avro/thrift/ThriftData.java`
#### Snippet
```java

  /** Return the singleton instance. */
  public static ThriftData get() {
    return INSTANCE;
  }
```

### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/SequenceFileReader.java`
#### Snippet
```java

    /** Return the singleton instance. */
    public static WritableData get() {
      return INSTANCE;
    }
```

### MethodOverridesStaticMethod
Method `getClient()` tries to override a static method of a superclass
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/reflect/ReflectRequestor.java`
#### Snippet
```java

  /** Create a proxy instance whose methods invoke RPCs. */
  public static <T> T getClient(Class<T> iface, Transceiver transceiver) throws IOException {
    return getClient(iface, transceiver, new ReflectData(iface.getClassLoader()));
  }
```

### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtobufData.java`
#### Snippet
```java

  /** Return the singleton instance. */
  public static ProtobufData get() {
    return INSTANCE;
  }
```

## RuleId[id=IOResource]
### IOResource
'DataFileReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileWriter.java`
#### Snippet
```java
  public DataFileWriter<D> appendTo(SeekableInput in, OutputStream out) throws IOException {
    assertNotOpen();
    DataFileReader<D> reader = new DataFileReader<>(in, new GenericDatumReader<>());
    this.schema = reader.getSchema();
    this.sync = reader.getHeader().sync;
```

### IOResource
'DataFileWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputFormat.java`
#### Snippet
```java
    Schema schema = AvroJob.getOutputSchema(job);

    final DataFileWriter writer = new DataFileWriter(new GenericDatumWriter());

    if (FileOutputFormat.getCompressOutput(job)) {
```

### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputFile.java`
#### Snippet
```java
  /** Construct for the given file. */
  public InputFile(File file) throws IOException {
    this.channel = new FileInputStream(file).getChannel();
  }

```

### IOResource
'ByteBufferOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Responder.java`
#### Snippet
```java
      writeError(Protocol.SYSTEM_ERRORS, new Utf8(e.toString()), out);
      if (null == handshake) {
        handshake = new ByteBufferOutputStream().getBufferList();
      }
    }
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `batchSize` may be 'static'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/BasicState.java`
#### Snippet
```java

  private final Random random = new Random(13L);
  private final int batchSize = BATCH_SIZE;

  private BinaryDecoder reuseDecoder;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Conversions` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
import java.util.UUID;

public class Conversions {

  public static class UUIDConversion extends Conversion<UUID> {
```

### UtilityClassWithoutPrivateConstructor
Class `LogicalTypes` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/LogicalTypes.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class LogicalTypes {

  private static final Logger LOG = LoggerFactory.getLogger(LogicalTypes.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ZstandardLoader` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/file/ZstandardLoader.java`
#### Snippet
```java
 * we get NoClassDefFoundError when we try and use the Codec's compress
 * or decompress methods rather than when we instantiate it */
final class ZstandardLoader {

  static InputStream input(InputStream compressed, boolean useBufferPool) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `Resolver` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/Resolver.java`
#### Snippet
```java
 * as an example of how to use this class.
 */
public class Resolver {
  /**
   * Returns a {@link Resolver.Action} tree for resolving the writer schema
```

### UtilityClassWithoutPrivateConstructor
Class `Accessor` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/Accessor.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.JsonNode;

public class Accessor {
  public abstract static class JsonPropertiesAccessor {
    protected abstract void addProp(JsonProperties props, String name, JsonNode value);
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadLocalWithInitial` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/ThreadLocalWithInitial.java`
#### Snippet
```java
 * an android environment, where this method is not available until API 26.
 */
public class ThreadLocalWithInitial {

  /** Delegate a ThreadLocal instance with the supplier. */
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayAccessor` has only 'static' members, and lacks a 'private' constructor
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
 * faster than using reflection-based operations on arrays.
 */
class ArrayAccessor {

  static void writeArray(boolean[] data, Encoder out) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `TrevniUtil` has only 'static' members, and lacks a 'private' constructor
in `lang/java/tools/src/main/java/org/apache/avro/tool/TrevniUtil.java`
#### Snippet
```java

/** Static utility methods for tools. */
class TrevniUtil {

  static Input input(String filename) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java

/** Static utility methods for tools. */
class Util {
  /**
   * Returns stdin if filename is "-", else opens the File in the owning
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadLocalWithInitial` has only 'static' members, and lacks a 'private' constructor
in `lang/java/android/src/main/java/org/apache/avro/util/internal/ThreadLocalWithInitial.java`
#### Snippet
```java
 * an android environment, where this method is not available until API 26.
 */
public class ThreadLocalWithInitial {

  /** Delegate a ThreadLocal instance with the supplier. */
```

### UtilityClassWithoutPrivateConstructor
Class `HadoopCodecFactory` has only 'static' members, and lacks a 'private' constructor
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/file/HadoopCodecFactory.java`
#### Snippet
```java
 * </ul>
 */
public class HadoopCodecFactory {

  private static final Map<String, String> HADOOP_AVRO_NAME_MAP = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `SortedKeyValueFile` has only 'static' members, and lacks a 'private' constructor
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/file/SortedKeyValueFile.java`
#### Snippet
```java
 * </p>
 */
public class SortedKeyValueFile {
  private static final Logger LOG = LoggerFactory.getLogger(SortedKeyValueFile.class);

```

### UtilityClassWithoutPrivateConstructor
Class `AvroMultipleInputs` has only 'static' members, and lacks a 'private' constructor
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleInputs.java`
#### Snippet
```java
 * </p>
 */
public class AvroMultipleInputs {

  private static final Logger LOG = LoggerFactory.getLogger(AvroMultipleInputs.class);
```

### UtilityClassWithoutPrivateConstructor
Class `DocCommentHelper` has only 'static' members, and lacks a 'private' constructor
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/idl/DocCommentHelper.java`
#### Snippet
```java
 * the method {@link Idl#CompilationUnit()} (either directly or indirectly).
 */
public class DocCommentHelper {
  /**
   * Pattern to match the common whitespace indents in a multi-line String.
```

### UtilityClassWithoutPrivateConstructor
Class `Perf` has only 'static' members, and lacks a 'private' constructor
in `lang/java/perf/src/main/java/org/apache/avro/perf/Perf.java`
#### Snippet
```java
 * decoding.
 */
public final class Perf {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ProtoConversions` has only 'static' members, and lacks a 'private' constructor
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtoConversions.java`
#### Snippet
```java
import org.apache.avro.Schema;

public class ProtoConversions {

  private static final int THOUSAND = 1000;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileWriter.java`
#### Snippet
```java

    public BufferedFileOutputStream(OutputStream out) throws IOException {
      super(null);
      this.out = new PositionFilter(out);
    }
```

### DataFlowIssue
Argument `versionInput` might be null
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
    System.err.print("Version ");
    try (InputStream versionInput = Main.class.getClassLoader().getResourceAsStream("VERSION.txt")) {
      printStream(versionInput);
    }
    System.err.print(" of ");
```

### DataFlowIssue
Condition `parameterTypes[parameterTypes.length - 1] instanceof Class` is redundant and can be replaced with a null check
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcClient.java`
#### Snippet
```java
    private Object invokeUnaryMethod(Method method, Object[] args) throws Exception {
      Type[] parameterTypes = method.getParameterTypes();
      if ((parameterTypes.length > 0) && (parameterTypes[parameterTypes.length - 1] instanceof Class)
          && Callback.class.isAssignableFrom(((Class<?>) parameterTypes[parameterTypes.length - 1]))) {
        // get the callback argument from the end
```

### DataFlowIssue
Condition `parameterTypes[parameterTypes.length - 1] instanceof Class` is redundant and can be replaced with a null check
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/specific/SpecificRequestor.java`
#### Snippet
```java
        // Check if this is a callback-based RPC:
        Type[] parameterTypes = method.getParameterTypes();
        if ((parameterTypes.length > 0) && (parameterTypes[parameterTypes.length - 1] instanceof Class)
            && Callback.class.isAssignableFrom(((Class<?>) parameterTypes[parameterTypes.length - 1]))) {
          // Extract the Callback from the end of of the argument list
```

### DataFlowIssue
Dereference of `name` may produce `NullPointerException`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
      if (aliases.containsKey(name))
        name = aliases.get(name);
      result = Schema.createRecord(name.full, s.getDoc(), null, s.isError());
      seen.put(s, result);
      List<Field> newFields = new ArrayList<>();
```

### DataFlowIssue
Casting `schema` to `RecordSchema` may produce `ClassCastException`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        return; // break loops
      seen.put(schema, schema);
      RecordSchema record = (RecordSchema) schema;
      for (Field field : schema.getFields()) {
        if (field.aliases != null)
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java

    /** Used internally to tag a reader/writer schema pair and prevent recursion. */
    RECURSION_IN_PROGRESS;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
  public enum SchemaIncompatibilityType {
    NAME_MISMATCH, FIXED_SIZE_MISMATCH, MISSING_ENUM_SYMBOLS, READER_FIELD_MISSING_DEFAULT_VALUE, TYPE_MISMATCH,
    MISSING_UNION_BRANCH;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
  public enum StringType {
    CharSequence, String, Utf8
  };

  public static final String STRING_PROP = "avro.java.string";
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
    /** non-terminal action symbol which is explicitly consumed */
    EXPLICIT_ACTION
  };

  /// The kind of this symbol.
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
  public enum Protocol {
    HTTP, SASL, NONE
  };

  // which protocol we are using
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/schema/SchemaVisitorAction.java`
#### Snippet
```java
   * Skip visiting the siblings of this schema.
   */
  SKIP_SIBLINGS;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtoConversions.java`
#### Snippet
```java
  private enum TimestampPrecise {
    Millis, Micros
  };

  public static class TimestampMillisConversion extends Conversion<Timestamp> {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    public String name() {
      return name;
    };

    /** The position of this field within the record. */
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
      return name;
    }
  };

  private final Type type;
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/file/SortedKeyValueFile.java`
#### Snippet
```java
     * @throws IOException If there is an error.
     */
    private <K> NavigableMap<K, Long> loadIndexFile(Configuration conf, Path path, Schema keySchema)
        throws IOException {
      DatumReader<GenericRecord> datumReader = model
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `lang/java/tools/src/main/java/org/apache/avro/tool/IdlToSchemataTool.java`
#### Snippet
```java
    if (args.isEmpty() || args.size() > 2 || isRequestingHelp(args)) {
      err.println("Usage: idl2schemata [idl] [outdir]");
      err.println("");
      err.println("If an output directory is not specified, " + "outputs to current directory.");
      return -1;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  @Override
  public void status(String message) {
    reporter.setStatus(message.toString());
  }

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  @Override
  public void count(String group, String name, long amount) {
    reporter.getCounter(group.toString(), name.toString()).increment(amount);
  }

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
  @Override
  public void count(String group, String name, long amount) {
    reporter.getCounter(group.toString(), name.toString()).increment(amount);
  }

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
      }
      executable = localFiles[0].toString();
      FileUtil.chmod(executable.toString(), "a+x");
    } else {
      executable = job.get(TetherJob.TETHER_EXEC);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java

  private String renderActiveRpc(RPCContext rpc, Stopwatch stopwatch) throws IOException {
    String out = new String();
    out += rpc.getMessage().getName() + ": " + formatMillis(StatsPlugin.nanosToMillis(stopwatch.elapsedNanos()));
    return out;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'EnumLabelsAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public EnumLabelsAction(List<String> symbols) {
      super(symbols.size());
      this.symbols = symbols;
```

### DeprecatedIsStillUsed
Deprecated member 'FieldAdjustAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public FieldAdjustAction(int rindex, String fname, Set<String> aliases) {
      this.rindex = rindex;
      this.fname = fname;
```

### DeprecatedIsStillUsed
Deprecated member 'EnumAdjustAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public EnumAdjustAction(int rsymCount, Object[] adjustments) {
      super(rsymCount);
      this.adjustments = adjustments;
```

### DeprecatedIsStillUsed
Deprecated member 'IntCheckAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public IntCheckAction(int size) {
      super(Kind.EXPLICIT_ACTION);
      this.size = size;
```

### DeprecatedIsStillUsed
Deprecated member 'FieldOrderAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public FieldOrderAction(Schema.Field[] fields) {
      this.fields = fields;
      boolean noReorder = true;
```

### DeprecatedIsStillUsed
Deprecated member 'SkipAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public SkipAction(Symbol symToSkip) {
      super(true);
      this.symToSkip = symToSkip;
```

### DeprecatedIsStillUsed
Deprecated member 'UnionAdjustAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public UnionAdjustAction(int rindex, Symbol symToParse) {
      this.rindex = rindex;
      this.symToParse = symToParse;
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultStartAction' is still used
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java

    @Deprecated
    public DefaultStartAction(byte[] contents) {
      this.contents = contents;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'KEY_CLASS_PROP' is still used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
  /** @deprecated Replaced by {@link SpecificData#KEY_CLASS_PROP} */
  @Deprecated
  static final String KEY_CLASS_PROP = "java-key-class";
  /** @deprecated Replaced by {@link SpecificData#ELEMENT_PROP} */
  @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'ELEMENT_PROP' is still used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
  /** @deprecated Replaced by {@link SpecificData#ELEMENT_PROP} */
  @Deprecated
  static final String ELEMENT_PROP = "java-element-class";

  private static final Map<String, Class> CLASS_CACHE = new ConcurrentHashMap<>();
```

### DeprecatedIsStillUsed
Deprecated member 'CLASS_PROP' is still used
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
  /** @deprecated Replaced by {@link SpecificData#CLASS_PROP} */
  @Deprecated
  static final String CLASS_PROP = "java-class";
  /** @deprecated Replaced by {@link SpecificData#KEY_CLASS_PROP} */
  @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'getCollector' is still used
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public AvroCollector getCollector(String namedOutput, Reporter reporter) throws IOException {
    return getCollector(namedOutput, null, reporter, namedOutput, null);
  }
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `get()` overloads a compatible method of a superclass, when overriding might have been intended
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    }

    public Schema get(String o) {
      Type primitive = PRIMITIVES.get(o);
      if (primitive != null) {
```

## RuleId[id=ShiftOutOfRange]
### ShiftOutOfRange
Shift operation `<<` by overly large constant value 35
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 4)) - 1)
      return 4;
    if (n <= (1 << (7 * 5)) - 1)
      return 5;
    if (n <= (1 << (7 * 6)) - 1)
```

### ShiftOutOfRange
Shift operation `<<` by overly large constant value 42
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 5)) - 1)
      return 5;
    if (n <= (1 << (7 * 6)) - 1)
      return 6;
    if (n <= (1 << (7 * 7)) - 1)
```

### ShiftOutOfRange
Shift operation `<<` by overly large constant value 49
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 6)) - 1)
      return 6;
    if (n <= (1 << (7 * 7)) - 1)
      return 7;
    if (n <= (1 << (7 * 8)) - 1)
```

### ShiftOutOfRange
Shift operation `<<` by overly large constant value 56
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 7)) - 1)
      return 7;
    if (n <= (1 << (7 * 8)) - 1)
      return 8;
    if (n <= (1 << (7 * 9)) - 1)
```

### ShiftOutOfRange
Shift operation `<<` by overly large constant value 63
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if (n <= (1 << (7 * 8)) - 1)
      return 8;
    if (n <= (1 << (7 * 9)) - 1)
      return 9;
    return 10;
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Removal by index can be replaced with removal by object
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    if (args.contains("-noSetters")) {
      compilerOpts.createSetters = false;
      args.remove(args.indexOf("-noSetters"));
    }

```

### RedundantCollectionOperation
Removal by index can be replaced with removal by object
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    if (args.contains("-addExtraOptionalGetters")) {
      compilerOpts.addExtraOptionalGetters = true;
      args.remove(args.indexOf("-addExtraOptionalGetters"));
    }
    int arg = 0;
```

### RedundantCollectionOperation
Removal by index can be replaced with removal by object
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    if (args.contains("-string")) {
      compilerOpts.stringType = StringType.String;
      args.remove(args.indexOf("-string"));
    }

```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getSchema()` during object construction
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificFixed.java`
#### Snippet
```java

  public SpecificFixed() {
    bytes(new byte[getSchema().getFixedSize()]);
  }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `initSchema()` during object construction
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/mapreduce/AvroTrevniRecordWriterBase.java`
#### Snippet
```java
  public AvroTrevniRecordWriterBase(TaskAttemptContext context) throws IOException {

    schema = initSchema(context);
    meta = filterMetadata(context.getConfiguration());
    writer = new AvroColumnWriter<>(schema, meta, ReflectData.get());
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'unresolvedDatum' in a Serializable class
in `lang/java/avro/src/main/java/org/apache/avro/UnresolvedUnionException.java`
#### Snippet
```java
/** Thrown when the expected contents of a union cannot be resolved. */
public class UnresolvedUnionException extends AvroRuntimeException {
  private Object unresolvedDatum;
  private Schema unionSchema;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `lang/java/avro/src/main/java/org/apache/avro/AvroRemoteException.java`
#### Snippet
```java
/** Base class for exceptions thrown to client by server. */
public class AvroRemoteException extends Exception {
  private Object value;

  protected AvroRemoteException() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'datum' in a Serializable class
in `lang/java/avro/src/main/java/org/apache/avro/path/TracingClassCastException.java`
#### Snippet
```java
public class TracingClassCastException extends ClassCastException implements PathTracingException<ClassCastException> {
  private final ClassCastException cause;
  private final Object datum;
  private final Schema expected;
  private final boolean customCoderUsed;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'statsPlugin' in a Serializable class
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
 */
public class StatsServlet extends HttpServlet {
  private final StatsPlugin statsPlugin;
  private VelocityEngine velocityEngine;
  private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'velocityEngine' in a Serializable class
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
public class StatsServlet extends HttpServlet {
  private final StatsPlugin statsPlugin;
  private VelocityEngine velocityEngine;
  private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
        defaultValue = field.get(typeValue);
      }
    } catch (Exception e) {

    }
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcReceiveTool.java`
#### Snippet
```java
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        latch.countDown();
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroJob.java`
#### Snippet
```java
      job.set(BINARY_PREFIX + key,
          URLEncoder.encode(new String(value, StandardCharsets.ISO_8859_1), StandardCharsets.ISO_8859_1.name()));
    } catch (UnsupportedEncodingException e) {
    }
  }
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
      try {
        clientTransceiver.close();
      } catch (IOException e) {
      } // ignore
    if (subprocess != null)
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
        this.subprocess.exitValue();
        hasexited = true;
      } catch (IllegalThreadStateException e) {
      }
      if (hasexited) {
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketServer.java`
#### Snippet
```java
            xc.writeBuffers(responder.respond(xc.readBuffers(), xc));
          }
        } catch (EOFException | ClosedChannelException e) {
        } finally {
          xc.close();
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketServer.java`
#### Snippet
```java
      try {
        channel.close();
      } catch (IOException e) {
      }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/specific/SpecificRequestor.java`
#### Snippet
```java
        try {
          protocol = Class.forName(interfaces[0].getName()).getSimpleName();
        } catch (ClassNotFoundException e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/specific/SpecificRequestor.java`
#### Snippet
```java
          try {
            remote = ((Requestor) handler).getTransceiver().getRemoteName();
          } catch (IOException e) {
          }
        }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeObjectField extends UnsafeCachedField {
    protected UnsafeObjectField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeCharField extends UnsafeCachedField {
    protected UnsafeCharField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeShortField extends UnsafeCachedField {
    protected UnsafeShortField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeByteField extends UnsafeCachedField {
    protected UnsafeByteField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeBooleanField extends UnsafeCachedField {
    protected UnsafeBooleanField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeFloatField extends UnsafeCachedField {
    protected UnsafeFloatField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeDoubleField extends UnsafeCachedField {
    protected UnsafeDoubleField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/FieldAccessUnsafe.java`
#### Snippet
```java

  final static class UnsafeLongField extends UnsafeCachedField {
    protected UnsafeLongField(Field f) {
      super(f);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
  private static final class AccessorTestClass {
    private boolean b = true;
    protected byte by = 0xf;
    public char c = 'c';
    short s = 123;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
        in.close();
      } catch (IOException e) {
        System.err.println("could not close InputStream " + in.toString());
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
        out.close();
      } catch (IOException e) {
        System.err.println("could not close OutputStream " + out.toString());
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleInputs.java`
#### Snippet
```java
    addInputPath(conf, path, inputSchema);

    String mapperMapping = path.toString() + ";" + mapperClass.getName();
    LOG.info(mapperMapping);
    String mappers = conf.get(MAPPERS_KEY);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
    }
    LOG.info("TetheredProcess.startSubprocess: command: " + imsg);
    LOG.info("Tetheredprocess.startSubprocess: stdout logged to: " + stdout.toString());
    LOG.info("Tetheredprocess.startSubprocess: stderr logged to: " + stderr.toString());

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java`
#### Snippet
```java
    LOG.info("TetheredProcess.startSubprocess: command: " + imsg);
    LOG.info("Tetheredprocess.startSubprocess: stdout logged to: " + stdout.toString());
    LOG.info("Tetheredprocess.startSubprocess: stderr logged to: " + stderr.toString());

    // start child process
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `c`
in `lang/java/avro/src/main/java/org/apache/avro/io/ValidatingDecoder.java`
#### Snippet
```java
    parser.advance(Symbol.MAP_START);
    for (long c = in.skipMap(); c != 0; c = in.skipMap()) {
      while (c-- > 0) {
        parser.skipRepeater();
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `c`
in `lang/java/avro/src/main/java/org/apache/avro/io/ValidatingDecoder.java`
#### Snippet
```java
    parser.advance(Symbol.ARRAY_START);
    for (long c = in.skipArray(); c != 0; c = in.skipArray()) {
      while (c-- > 0) {
        parser.skipRepeater();
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader.java`
#### Snippet
```java
      final byte cb = (byte) b;
      while (j > 0 && sync[j] != cb) {
        j = pm[j - 1];
      }
      if (sync[j] == cb) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader.java`
#### Snippet
```java
      }
      if (sync[j] == cb) {
        j++;
      }
      if (j == SYNC_SIZE) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
          l.add(new Fixup(out, j));
        }
        j += p.length;
      } else {
        out[j++] = s;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/java/avro/src/main/java/org/apache/avro/io/parsing/Symbol.java`
#### Snippet
```java
        j += p.length;
      } else {
        out[j++] = s;
      }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
    // two characters form the hex value.
    for (int i = 0, j = 0; i < l; i++) {
      out[j++] = DIGITS_LOWER[(0xF0 & data[i]) >>> 4];
      out[j++] = DIGITS_LOWER[0x0F & data[i]];
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
    for (int i = 0, j = 0; i < l; i++) {
      out[j++] = DIGITS_LOWER[(0xF0 & data[i]) >>> 4];
      out[j++] = DIGITS_LOWER[0x0F & data[i]];
    }
    return new String(out);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
          && i != stringLength - 1 && Character.isLowSurrogate(string.charAt(i + 1))) {
        p = string.codePointAt(i);
        i++;
      }
      if (p <= 0x007F) {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `BufferedFileOutputStream` may be 'static'
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileWriter.java`
#### Snippet
```java
  }

  private class BufferedFileOutputStream extends BufferedOutputStream {
    private long position; // start of buffer

```

### InnerClassMayBeStatic
Inner class `TetherDataSerializer` may be 'static'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherKeySerialization.java`
#### Snippet
```java
  }

  private class TetherDataSerializer implements Serializer<TetherData> {

    private OutputStream out;
```

### InnerClassMayBeStatic
Inner class `TetherDataDeserializer` may be 'static'
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherKeySerialization.java`
#### Snippet
```java
  private static final DecoderFactory FACTORY = DecoderFactory.get();

  private class TetherDataDeserializer implements Deserializer<TetherData> {
    private BinaryDecoder decoder;

```

### InnerClassMayBeStatic
Inner class `RenderableMessage` may be 'static'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
   * key-value string attributes.
   */
  public class RenderableMessage { // Velocity brakes if not public
    public String name;
    public int numCalls;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `length` declared in one 'switch' branch and used in another
in `lang/java/avro/src/main/java/org/apache/avro/util/RandomData.java`
#### Snippet
```java
      return new GenericData.EnumSymbol(schema, symbols.get(random.nextInt(symbols.size())));
    case ARRAY:
      int length = (random.nextInt(5) + 2) - d;
      @SuppressWarnings("rawtypes")
      GenericArray<Object> array = new GenericData.Array(length <= 0 ? 0 : length, schema);
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
    private NameContext(HashMap<String, Schema> schemas, String namespace) {
      this.schemas = schemas;
      this.namespace = "".equals(namespace) ? null : namespace;
    }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
          space = namespace;
        }
        if (space != null && !"".equals(space)) {
          return space + "." + name;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
    String namespace = schema.getNamespace();
    String name = schema.getName();
    if (namespace == null || "".equals(namespace))
      return name;

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Responder.java`
#### Snippet
```java
      context.setRequestCallMeta(META_READER.read(null, in));
      String messageName = in.readString(null).toString();
      if (messageName.equals("")) // a handshake ping
        return handshake;
      Message rm = remote.getMessages().get(messageName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        this.name = validateName(name.substring(lastDot + 1));
      }
      if ("".equals(space))
        space = null;
      this.space = space;
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileWriter.java`
#### Snippet
```java
        // the file in case of an error
        // occurred during the write
        count = 0;
      }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stopping` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
    ChannelFuture channelFutureToCancel = null;
    synchronized (channelFutureLock) {
      if (stopping && channelFuture != null) {
        channelFutureToCancel = channelFuture;
        channelFuture = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
    ChannelFuture channelFutureToCancel = null;
    synchronized (channelFutureLock) {
      if (stopping && channelFuture != null) {
        channelFutureToCancel = channelFuture;
        channelFuture = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
    synchronized (channelFutureLock) {
      if (stopping && channelFuture != null) {
        channelFutureToCancel = channelFuture;
        channelFuture = null;
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
      if (stopping && channelFuture != null) {
        channelFutureToCancel = channelFuture;
        channelFuture = null;
      }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stopping` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
        if (!isChannelReady(channel)) {
          synchronized (channelFutureLock) {
            if (!stopping) {
              LOG.debug("Connecting to {}", remoteAddr);
              channelFuture = bootstrap.connect(remoteAddr);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
            if (!stopping) {
              LOG.debug("Connecting to {}", remoteAddr);
              channelFuture = bootstrap.connect(remoteAddr);
            }
          }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java

            synchronized (channelFutureLock) {
              if (!channelFuture.isSuccess()) {
                remote = null;
                throw new IOException("Error connecting to " + remoteAddr, channelFuture.cause());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
              if (!channelFuture.isSuccess()) {
                remote = null;
                throw new IOException("Error connecting to " + remoteAddr, channelFuture.cause());
              }
              channel = channelFuture.channel();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
                throw new IOException("Error connecting to " + remoteAddr, channelFuture.cause());
              }
              channel = channelFuture.channel();
              channelFuture = null;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `channelFuture` accessed in synchronized context
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
              }
              channel = channelFuture.channel();
              channelFuture = null;
            }
          }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.pos` accessed in synchronized context
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBytes.java`
#### Snippet
```java
  @Override
  public synchronized int read(long pos, byte[] b, int start, int len) throws IOException {
    this.pos = (int) pos;
    return read(b, start, len);
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sendPayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    publish(context, t);

    synchronized (sendPayloads) {
      IntegerHistogram<?> h = sendPayloads.get(context.getMessage());
      if (h == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sendPayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java

    synchronized (sendPayloads) {
      IntegerHistogram<?> h = sendPayloads.get(context.getMessage());
      if (h == null) {
        h = createNewIntegerHistogram();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sendPayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
      if (h == null) {
        h = createNewIntegerHistogram();
        sendPayloads.put(context.getMessage(), h);
      }
      h.add(getPayloadSize(context.getResponsePayload()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `receivePayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    this.activeRpcs.put(context, t);

    synchronized (receivePayloads) {
      IntegerHistogram<?> h = receivePayloads.get(context.getMessage());
      if (h == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `receivePayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java

    synchronized (receivePayloads) {
      IntegerHistogram<?> h = receivePayloads.get(context.getMessage());
      if (h == null) {
        h = createNewIntegerHistogram();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `receivePayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
      if (h == null) {
        h = createNewIntegerHistogram();
        receivePayloads.put(context.getMessage(), h);
      }
      h.add(getPayloadSize(context.getRequestPayload()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `receivePayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    publish(context, t);

    synchronized (receivePayloads) {
      IntegerHistogram<?> h = receivePayloads.get(context.getMessage());
      if (h == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `receivePayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java

    synchronized (receivePayloads) {
      IntegerHistogram<?> h = receivePayloads.get(context.getMessage());
      if (h == null) {
        h = createNewIntegerHistogram();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `receivePayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
      if (h == null) {
        h = createNewIntegerHistogram();
        receivePayloads.put(context.getMessage(), h);
      }
      h.add(getPayloadSize(context.getRequestPayload()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `methodTimings` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    if (message == null)
      throw new IllegalArgumentException();
    synchronized (methodTimings) {
      FloatHistogram<?> h = methodTimings.get(context.getMessage());
      if (h == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `methodTimings` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
      throw new IllegalArgumentException();
    synchronized (methodTimings) {
      FloatHistogram<?> h = methodTimings.get(context.getMessage());
      if (h == null) {
        h = createNewFloatHistogram();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `methodTimings` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
      if (h == null) {
        h = createNewFloatHistogram();
        methodTimings.put(context.getMessage(), h);
      }
      h.add(nanosToMillis(t.elapsedNanos()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sendPayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    this.activeRpcs.put(context, t);

    synchronized (sendPayloads) {
      IntegerHistogram<?> h = sendPayloads.get(context.getMessage());
      if (h == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sendPayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java

    synchronized (sendPayloads) {
      IntegerHistogram<?> h = sendPayloads.get(context.getMessage());
      if (h == null) {
        h = createNewIntegerHistogram();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sendPayloads` accessed in synchronized context
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
      if (h == null) {
        h = createNewIntegerHistogram();
        sendPayloads.put(context.getMessage(), h);
      }
      h.add(getPayloadSize(context.getRequestPayload()));
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/data/RecordBuilderBase.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  protected Object defaultValue(Field field) throws IOException {
    return data.deepCopy(field.schema(), data.getDefaultValue(field));
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/file/BZip2Codec.java`
#### Snippet
```java
        compressedData.remaining());

    @SuppressWarnings("resource")
    NonCopyingByteArrayOutputStream baos = new NonCopyingByteArrayOutputStream(DEFAULT_BUFFER_SIZE);

    try (BZip2CompressorInputStream inputStream = new BZip2CompressorInputStream(bais)) {
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  protected Object peekArray(Object array) {
    return (array instanceof GenericArray) ? ((GenericArray) array).peek() : null;
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  protected Object newArray(Object old, int size, Schema schema) {
    return data.newArray(old, size, schema);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  protected Object newMap(Object old, int size) {
    return data.newMap(old, size);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  protected Object newInstanceFromString(Class c, String s) {
    return this.getReaderCache().newInstanceFromString(c, s);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumWriter.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  protected int getMapSize(Object map) {
    return ((Map) map).size();
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
  /** Create the schema for a Java type. */
  @SuppressWarnings(value = "unchecked")
  protected Schema createSchema(java.lang.reflect.Type type, Map<String, Schema> names) {
    if (type instanceof Class && CharSequence.class.isAssignableFrom((Class) type))
      return Schema.create(Type.STRING);
```

### RedundantSuppression
Redundant suppression
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static Object newInstance(Class c, Schema s) {
    boolean useSchema = SchemaConstructable.class.isAssignableFrom(c);
    Object result;
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public AvroCollector getCollector(String namedOutput, Reporter reporter) throws IOException {
    return getCollector(namedOutput, null, reporter, namedOutput, null);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopCombiner.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  protected AvroReducer<K, V, Pair<K, V>> getReducer(JobConf conf) {
    return ReflectionUtils.newInstance(conf.getClass(AvroJob.COMBINER, AvroReducer.class, AvroReducer.class), conf);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopMapper.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public void configure(JobConf conf) {
    this.mapper = ReflectionUtils.newInstance(conf.getClass(AvroJob.MAPPER, AvroMapper.class, AvroMapper.class), conf);
    this.isMapOnly = conf.getNumReduceTasks() == 0;
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopReducer.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  protected AvroReducer<K, V, OUT> getReducer(JobConf conf) {
    return ReflectionUtils.newInstance(conf.getClass(AvroJob.REDUCER, AvroReducer.class, AvroReducer.class), conf);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherMapRunner.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public void run(RecordReader<TetherData, NullWritable> recordReader,
      OutputCollector<TetherData, NullWritable> collector, Reporter reporter) throws IOException {
    try {
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static void addNamedOutput(Job job, String namedOutput, Class<? extends OutputFormat> outputFormatClass,
      Schema keySchema) {
    addNamedOutput(job, namedOutput, outputFormatClass, keySchema, null);
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static void addNamedOutput(Job job, String namedOutput, Class<? extends OutputFormat> outputFormatClass,
      Schema keySchema, Schema valueSchema) {
    checkNamedOutputName(job, namedOutput, true);
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void write(String namedOutput, Object key) throws IOException, InterruptedException {
    write(namedOutput, key, NullWritable.get(), namedOutput);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void write(String namedOutput, Object key, Object value) throws IOException, InterruptedException {
    write(namedOutput, key, value, namedOutput);
  }
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public long sync(String namedOutput, String baseOutputPath) throws IOException, InterruptedException {
    checkNamedOutputName(context, namedOutput, false);
    checkBaseOutputPath(baseOutputPath);
```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
  // MultithreadedMapper.
  @SuppressWarnings("unchecked")
  private synchronized RecordWriter getRecordWriter(TaskAttemptContext taskContext, String baseFileName)
      throws IOException, InterruptedException {

```

### RedundantSuppression
Redundant suppression
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void close() throws IOException, InterruptedException {
    for (RecordWriter writer : recordWriters.values()) {
      writer.close(context);
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `lang/java/avro/src/main/java/org/apache/avro/path/TracingAvroTypeException.java`
#### Snippet
```java
    }
    AvroTypeException summary = new AvroTypeException(sb.toString());
    summary.initCause(cause);
    return summary;
  }
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumWriter.java`
#### Snippet
```java
  protected AvroTypeException addAvroTypeMsg(AvroTypeException e, String s) {
    AvroTypeException result = new AvroTypeException(e.getMessage() + s);
    result.initCause(e.getCause() == null ? e : e.getCause());
    return result;
  }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java

        final int val = super.getRandom().nextInt(1000000);
        final Integer v = (val < 750000 ? Integer.valueOf(val) : null);
        rec.put("f", v);

```

### UnnecessaryBoxing
Unnecessary boxing
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/basic/UnchangedUnionTest.java`
#### Snippet
```java
        final GenericRecord rec = new GenericData.Record(this.schema);
        final int val = super.getRandom().nextInt(1000000);
        final Integer v = (val < 750000 ? Integer.valueOf(val) : null);
        rec.put("f", v);

```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
              && (Type.FLOAT.equals(fieldSchema.getType()) || Type.DOUBLE.equals(fieldSchema.getType()))
              && defaultValue.isTextual())
            defaultValue = new DoubleNode(Double.valueOf(defaultValue.textValue()));
          Field f = new Field(fieldName, fieldSchema, fieldDoc, defaultValue, true, order);
          Iterator<String> i = field.fieldNames();
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `sendPayloads`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    publish(context, t);

    synchronized (sendPayloads) {
      IntegerHistogram<?> h = sendPayloads.get(context.getMessage());
      if (h == null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `receivePayloads`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    this.activeRpcs.put(context, t);

    synchronized (receivePayloads) {
      IntegerHistogram<?> h = receivePayloads.get(context.getMessage());
      if (h == null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `receivePayloads`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    publish(context, t);

    synchronized (receivePayloads) {
      IntegerHistogram<?> h = receivePayloads.get(context.getMessage());
      if (h == null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `methodTimings`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    if (message == null)
      throw new IllegalArgumentException();
    synchronized (methodTimings) {
      FloatHistogram<?> h = methodTimings.get(context.getMessage());
      if (h == null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `sendPayloads`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsPlugin.java`
#### Snippet
```java
    this.activeRpcs.put(context, t);

    synchronized (sendPayloads) {
      IntegerHistogram<?> h = sendPayloads.get(context.getMessage());
      if (h == null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.statsPlugin.methodTimings`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
    // Get set of all seen messages
    Set<Message> keys = null;
    synchronized (this.statsPlugin.methodTimings) {
      keys = this.statsPlugin.methodTimings.keySet();

```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.statsPlugin.methodTimings`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
    RenderableMessage out = new RenderableMessage(message.getName());

    synchronized (this.statsPlugin.methodTimings) {
      FloatHistogram<?> hist = this.statsPlugin.methodTimings.get(message);
      out.numCalls = hist.getCount();
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.statsPlugin.sendPayloads`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
    }

    synchronized (this.statsPlugin.sendPayloads) {
      IntegerHistogram<?> hist = this.statsPlugin.sendPayloads.get(message);
      HashMap<String, String> latencyBar = new HashMap<>();
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.statsPlugin.receivePayloads`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
    }

    synchronized (this.statsPlugin.receivePayloads) {
      IntegerHistogram<?> hist = this.statsPlugin.receivePayloads.get(message);
      HashMap<String, String> latencyBar = new HashMap<>();
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'encoding'
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java

  private static class CompilerOptions {
    Optional<String> encoding;
    StringType stringType;
    Optional<FieldVisibility> fieldVisibility;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fieldVisibility'
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    Optional<String> encoding;
    StringType stringType;
    Optional<FieldVisibility> fieldVisibility;
    boolean useLogicalDecimal;
    boolean createSetters;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalGettersType'
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    boolean createSetters;
    boolean addExtraOptionalGetters;
    Optional<OptionalGettersType> optionalGettersType;
    Optional<String> templateDir;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'templateDir'
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
    boolean addExtraOptionalGetters;
    Optional<OptionalGettersType> optionalGettersType;
    Optional<String> templateDir;
  }

```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `lang/java/avro/src/main/java/org/apache/avro/util/RandomData.java`
#### Snippet
```java
    Schema sch = new Schema.Parser().parse(new File(args[0]));
    try (DataFileWriter<Object> writer = new DataFileWriter<>(new GenericDatumWriter<>())) {
      writer.setCodec(CodecFactory.fromString(args.length >= 4 ? args[3] : "null"));
      writer.setMeta("user_metadata", "someByteArray".getBytes(StandardCharsets.UTF_8));
      writer.create(sch, new File(args[1]));
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
  private int limit; // end of valid buffer data

  private CharsetDecoder utf8 = Charset.forName("UTF-8").newDecoder();

  private int bitCount; // position in booleans
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/avro/src/main/java/org/apache/avro/Protocol.java`
#### Snippet
```java

  public static void main(String[] args) throws Exception {
    System.out.println(Protocol.parse(new File(args[0])));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/avro/src/main/java/org/apache/avro/util/RandomData.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length < 3 || args.length > 4) {
      System.out.println("Usage: RandomData <schemafile> <outputfile> <count> [codec]");
      System.exit(-1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/InduceSchemaTool.java`
#### Snippet
```java
  public int run(InputStream in, PrintStream out, PrintStream err, List<String> args) throws Exception {
    if (args.size() == 0 || args.size() > 2) {
      System.err.println("Usage: [colon-delimited-classpath] classname");
      return 1;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/InduceSchemaTool.java`
#### Snippet
```java
    Class<?> klass = classLoader.loadClass(className);
    if (klass.isInterface()) {
      System.out.println(ReflectData.get().getProtocol(klass).toString(true));
    } else {
      System.out.println(ReflectData.get().getSchema(klass).toString(true));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/InduceSchemaTool.java`
#### Snippet
```java
      System.out.println(ReflectData.get().getProtocol(klass).toString(true));
    } else {
      System.out.println(ReflectData.get().getSchema(klass).toString(true));
    }
    return 0;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
    byte[] buffer = new byte[1024];
    for (int i = in.read(buffer); i != -1; i = in.read(buffer))
      System.err.write(buffer, 0, i);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
        break;
      }
      System.err.println(line);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
      Tool tool = tools.get(args[0]);
      if (tool != null) {
        return tool.run(System.in, System.out, System.err, Arrays.asList(args).subList(1, args.length));
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
      Tool tool = tools.get(args[0]);
      if (tool != null) {
        return tool.run(System.in, System.out, System.err, Arrays.asList(args).subList(1, args.length));
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
      }
    }
    System.err.print("Version ");
    try (InputStream versionInput = Main.class.getClassLoader().getResourceAsStream("VERSION.txt")) {
      printStream(versionInput);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
      printStream(versionInput);
    }
    System.err.print(" of ");
    try (InputStream noticeInput = Main.class.getClassLoader().getResourceAsStream("META-INF/NOTICE")) {
      printHead(noticeInput, 5);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
      printHead(noticeInput, 5);
    }
    System.err.println("----------------");

    System.err.println("Available tools:");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
    System.err.println("----------------");

    System.err.println("Available tools:");
    for (Tool k : tools.values()) {
      System.err.printf("%" + maxLen + "s  %s\n", k.getName(), k.getShortDescription());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Main.java`
#### Snippet
```java
    System.err.println("Available tools:");
    for (Tool k : tools.values()) {
      System.err.printf("%" + maxLen + "s  %s\n", k.getName(), k.getShortDescription());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/FromTextTool.java`
#### Snippet
```java
        if (b == '\n') { // newline
          if (!returnSeen) {
            System.out.println("Writing line = " + line.position());
            ((Buffer) line).flip();
            writer.append(line);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/TetherTool.java`
#### Snippet
```java
      }
    } catch (Exception exp) {
      System.out.println("Unexpected exception: " + exp.getMessage());
      formatter.printHelp("tether", opts);
      return -1;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
        in.close();
      } catch (IOException e) {
        System.err.println("could not close InputStream " + in.toString());
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
   */
  static void close(OutputStream out) {
    if (!System.out.equals(out)) {
      try {
        out.close();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
        out.close();
      } catch (IOException e) {
        System.err.println("could not close OutputStream " + out.toString());
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    inFiles = Util.getFiles(nargs.subList(0, nargs.size() - 1));

    System.out.println("List of input files:");
    for (Path p : inFiles) {
      System.out.println(p);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    System.out.println("List of input files:");
    for (Path p : inFiles) {
      System.out.println(p);
    }
    currentInput = -1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java

    if (limit < 0) {
      System.out.println("limit has to be non-negative");
      this.printHelp(out);
      return 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    }
    if (offset < 0) {
      System.out.println("offset has to be non-negative");
      this.printHelp(out);
      return 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    }
    if (samplerate < 0 || samplerate > 1) {
      System.out.println("samplerate has to be a number between 0 and 1");
      this.printHelp(out);
      return 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    skip(offset);
    writeRecords(limit, samplerate);
    System.out.println(totalCopied + " records written.");

    writer.flush();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java

    if (fileSet.size() > 0) {
      System.err.println("Input files to compile:");
      for (File file : fileSet) {
        System.err.println("  " + file);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println("Input files to compile:");
      for (File file : fileSet) {
        System.err.println("  " + file);
      }
    } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      }
    } else {
      System.err.println("No input files found.");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
  public int run(InputStream in, PrintStream out, PrintStream err, List<String> origArgs) throws Exception {
    if (origArgs.size() < 3) {
      System.err
          .println("Usage: [-encoding <outputencoding>] [-string] [-bigDecimal] [-fieldVisibility <visibilityType>] "
              + "[-noSetters] [-addExtraOptionalGetters] [-optionalGetters <optionalGettersType>] "
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
              + "[-noSetters] [-addExtraOptionalGetters] [-optionalGetters <optionalGettersType>] "
              + "[-templateDir <templateDir>] (schema|protocol) input... outputdir");
      System.err.println(" input - input files or directories");
      System.err.println(" outputdir - directory to write generated java");
      System.err.println(" -encoding <outputencoding> - set the encoding of " + "output file(s)");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
              + "[-templateDir <templateDir>] (schema|protocol) input... outputdir");
      System.err.println(" input - input files or directories");
      System.err.println(" outputdir - directory to write generated java");
      System.err.println(" -encoding <outputencoding> - set the encoding of " + "output file(s)");
      System.err.println(" -string - use java.lang.String instead of Utf8");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println(" input - input files or directories");
      System.err.println(" outputdir - directory to write generated java");
      System.err.println(" -encoding <outputencoding> - set the encoding of " + "output file(s)");
      System.err.println(" -string - use java.lang.String instead of Utf8");
      System.err.println(" -fieldVisibility [private|public] - use either and default private");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println(" outputdir - directory to write generated java");
      System.err.println(" -encoding <outputencoding> - set the encoding of " + "output file(s)");
      System.err.println(" -string - use java.lang.String instead of Utf8");
      System.err.println(" -fieldVisibility [private|public] - use either and default private");
      System.err.println(" -noSetters - do not generate setters");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println(" -encoding <outputencoding> - set the encoding of " + "output file(s)");
      System.err.println(" -string - use java.lang.String instead of Utf8");
      System.err.println(" -fieldVisibility [private|public] - use either and default private");
      System.err.println(" -noSetters - do not generate setters");
      System.err
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println(" -string - use java.lang.String instead of Utf8");
      System.err.println(" -fieldVisibility [private|public] - use either and default private");
      System.err.println(" -noSetters - do not generate setters");
      System.err
          .println(" -addExtraOptionalGetters - generate extra getters with this format: 'getOptional<FieldName>'");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println(" -fieldVisibility [private|public] - use either and default private");
      System.err.println(" -noSetters - do not generate setters");
      System.err
          .println(" -addExtraOptionalGetters - generate extra getters with this format: 'getOptional<FieldName>'");
      System.err.println(
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err
          .println(" -addExtraOptionalGetters - generate extra getters with this format: 'getOptional<FieldName>'");
      System.err.println(
          " -optionalGetters [all_fields|only_nullable_fields]- generate getters returning Optional<T> for all fields or only for nullable fields");
      System.err
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err.println(
          " -optionalGetters [all_fields|only_nullable_fields]- generate getters returning Optional<T> for all fields or only for nullable fields");
      System.err
          .println(" -bigDecimal - use java.math.BigDecimal for " + "decimal type instead of java.nio.ByteBuffer");
      System.err.println(" -templateDir - directory with custom Velocity templates");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      System.err
          .println(" -bigDecimal - use java.math.BigDecimal for " + "decimal type instead of java.nio.ByteBuffer");
      System.err.println(" -templateDir - directory with custom Velocity templates");
      return 1;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
            .of(OptionalGettersType.valueOf(args.get(arg).toUpperCase(Locale.ENGLISH)));
      } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
        System.err.println("Expected one of" + Arrays.toString(OptionalGettersType.values()));
        return 1;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
        compilerOpts.fieldVisibility = Optional.of(FieldVisibility.valueOf(args.get(arg).toUpperCase(Locale.ENGLISH)));
      } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
        System.err.println("Expected one of" + Arrays.toString(FieldVisibility.values()));
        return 1;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/tools/src/main/java/org/apache/avro/tool/SpecificCompilerTool.java`
#### Snippet
```java
      }
    } else {
      System.err.println("Expected \"schema\" or \"protocol\".");
      return 1;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SchemaTask.java`
#### Snippet
```java
  public static void main(String[] args) throws IOException {
    if (args.length < 2) {
      System.err.println("Usage: SchemaTask <schema.avsc>... <output-folder>");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/perf/src/main/java/org/apache/avro/perf/Perf.java`
#### Snippet
```java
    if (cmd.hasOption("help")) {
      final HelpFormatter formatter = new HelpFormatter();
      final PrintWriter pw = new PrintWriter(System.out);
      formatter.printUsage(pw, 80, "Perf", options);
      pw.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/DatagramServer.java`
#### Snippet
```java
    DatagramServer server = new DatagramServer(null, new InetSocketAddress(0));
    server.start();
    System.out.println("started");
    server.join();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketServer.java`
#### Snippet
```java
    SocketServer server = new SocketServer(responder, new InetSocketAddress(0));
    server.start();
    System.out.println("server started on port: " + server.getPort());
    server.join();
  }
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public AvroCollector getCollector(String namedOutput, Reporter reporter) throws IOException {
    return getCollector(namedOutput, null, reporter, namedOutput, null);
  }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketTransceiver.java`
#### Snippet
```java
 * @deprecated use {@link SaslSocketTransceiver} instead.
 */
public class SocketTransceiver extends Transceiver {
  private static final Logger LOG = LoggerFactory.getLogger(SocketTransceiver.class);

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof GenericDatumReader.IdentitySchemaKey)'
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
    @Override
    public boolean equals(Object obj) {
      if (obj == null || !(obj instanceof GenericDatumReader.IdentitySchemaKey)) {
        return false;
      }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
        }
        // Apply JSON pointer escaping.
        s.append(coordinate.replace("~", "~0").replace("/", "~1"));
      }
      return s.toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
        }
        // Apply JSON pointer escaping.
        s.append(coordinate.replace("~", "~0").replace("/", "~1"));
      }
      return s.toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
  // escape TAB, NL and CR in keys, so that output can be reliably parsed
  static String escapeKey(String key) {
    key = key.replace("\\", "\\\\"); // escape backslashes first
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
  static String escapeKey(String key) {
    key = key.replace("\\", "\\\\"); // escape backslashes first
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
    key = key.replace("\r", "\\r"); // CR
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
    key = key.replace("\\", "\\\\"); // escape backslashes first
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
    key = key.replace("\r", "\\r"); // CR
    return key;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
    key = key.replace("\r", "\\r"); // CR
    return key;
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java

  private String getOutputFileName(Class klass) {
    String filename = avroOutputDirectory.getPath() + File.separator + klass.getName().replace(".", File.separator);
    if (klass.isInterface()) {
      return filename.concat(".avpr");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java
    }

    return namespacedFileName.replace(File.separator, ".").replaceFirst("\\.java$", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
   */
  public static String javaEscape(String o) {
    return o.replace("\\", "\\\\").replace("\"", "\\\"");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
   */
  public static String javaEscape(String o) {
    return o.replace("\\", "\\\\").replace("\"", "\\\"");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
   */
  public static String escapeForJavadoc(String s) {
    return s.replace("*/", "*&#47;");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
  protected static List<String> escapeStringArray(List<String> input) {
    for (int i = 0; i < input.size(); i++) {
      input.set(i, "\"" + input.get(i).replace("\"", "\\\"") + "\"");
    }
    return input;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
   * @param datum      The object to be converted.
   * @param schema     The schema of datum. Cannot be null if datum is not null.
   * @param type       The {@link org.apache.avro.LogicalType} of datum. Cannot be
   *                   null if datum is not null.
   * @param conversion The tool used to finish the conversion. Cannot be null if
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
   * @param datum      The object to be converted.
   * @param schema     The schema of datum. Cannot be null if datum is not null.
   * @param type       The {@link org.apache.avro.LogicalType} of datum. Cannot be
   *                   null if datum is not null.
   * @param conversion The tool used to finish the conversion. Cannot be null if
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
 * <td><code>string</code></td>
 * <td>String</td>
 * <td>{@link java.lang.String}</td>
 * </tr>
 * <tr>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
 * <td><code>record</code></td>
 * <td>Object</td>
 * <td>{@link java.util.Map}</td>
 * </tr>
 * <tr>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
 * <td><code>enum</code></td>
 * <td>String</td>
 * <td>{@link java.lang.String}</td>
 * </tr>
 * <tr>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
 * <td><code>map</code></td>
 * <td>Object</td>
 * <td>{@link java.util.Map}</td>
 * </tr>
 * <tr>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java

            @Override
            public java.util.Map.Entry<String, JsonNode> next() {
              return it.next();
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.util` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/io/Encoder.java`
#### Snippet
```java
  /**
   * Write a Unicode character string. If the CharSequence is an
   * {@link org.apache.avro.util.Utf8} it writes this directly, otherwise the
   * CharSequence is converted to a String via toString() and written.
   * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.util` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/io/Encoder.java`
#### Snippet
```java
  /**
   * Write a Unicode character string. The default implementation converts the
   * String to a {@link org.apache.avro.util.Utf8}. Some Encoder implementations
   * may want to do something different as a performance optimization.
   * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java

  /**
   * Returns an {@link java.io.InputStream} that is aware of any buffering that
   * may occur in this BinaryDecoder. Readers that need to interleave decoding
   * Avro data with other reads must access this InputStream to do so unless the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
   * Not all implementations of BinaryDecoder support isEnd(). Implementations
   * that do not support isEnd() will throw a
   * {@link java.lang.UnsupportedOperationException}.
   *
   * @throws IOException If the first byte cannot be read for any reason other
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.file` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/file/SyncableFileOutputStream.java`
#### Snippet
```java
 * instance of this class can be used with {@linkplain DataFileWriter} to
 * guarantee that Avro Container Files are persisted to disk on supported
 * platforms using the {@linkplain org.apache.avro.file.DataFileWriter#fSync()}
 * method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/reflect/MapEntry.java`
#### Snippet
```java
/**
 * Class to make Avro immune from the naming variations of key/value fields
 * among several {@link java.util.Map.Entry} implementations. If objects of this
 * class are used instead of the regular ones obtained by
 * {@link Map#entrySet()}, then we need not worry about the actual field-names
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.reflect` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/reflect/AvroEncode.java`
#### Snippet
```java
/**
 * Expert: Fields with this annotation are encoded using the given custom
 * encoder. This annotation overrides {@link org.apache.avro.reflect.Stringable
 * Stringable} and {@link org.apache.avro.reflect.Nullable Nullable}. Since no
 * validation is performed, invalid custom encodings may result in an unreadable
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.reflect` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/reflect/AvroEncode.java`
#### Snippet
```java
 * Expert: Fields with this annotation are encoded using the given custom
 * encoder. This annotation overrides {@link org.apache.avro.reflect.Stringable
 * Stringable} and {@link org.apache.avro.reflect.Nullable Nullable}. Since no
 * validation is performed, invalid custom encodings may result in an unreadable
 * file. Use of {@link org.apache.avro.io.ValidatingEncoder} is recommended.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/reflect/Union.java`
#### Snippet
```java
 * parameters this determines the reflected message parameter type. If applied
 * to a method, this determines its return type. A null schema may be specified
 * with {@link java.lang.Void}.
 */
@Retention(RetentionPolicy.RUNTIME)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
   * Called by the default implementation of {@link #readMap} to read a key value.
   * The default implementation returns delegates to
   * {@link #readString(Object, org.apache.avro.io.Decoder)}.
   */
  protected Object readMapKey(Object old, Schema expected, Decoder in) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   * transient.
   */
  protected Set<Class> stringableClasses = new HashSet<>(Arrays.asList(java.math.BigDecimal.class,
      java.math.BigInteger.class, java.net.URI.class, java.net.URL.class, java.io.File.class));

```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   */
  protected Set<Class> stringableClasses = new HashSet<>(Arrays.asList(java.math.BigDecimal.class,
      java.math.BigInteger.class, java.net.URI.class, java.net.URL.class, java.io.File.class));

  /** For subclasses. Applications normally use {@link SpecificData#get()}. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   */
  protected Set<Class> stringableClasses = new HashSet<>(Arrays.asList(java.math.BigDecimal.class,
      java.math.BigInteger.class, java.net.URI.class, java.net.URL.class, java.io.File.class));

  /** For subclasses. Applications normally use {@link SpecificData#get()}. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   */
  protected Set<Class> stringableClasses = new HashSet<>(Arrays.asList(java.math.BigDecimal.class,
      java.math.BigInteger.class, java.net.URI.class, java.net.URL.class, java.io.File.class));

  /** For subclasses. Applications normally use {@link SpecificData#get()}. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   */
  protected Set<Class> stringableClasses = new HashSet<>(Arrays.asList(java.math.BigDecimal.class,
      java.math.BigInteger.class, java.net.URI.class, java.net.URL.class, java.io.File.class));

  /** For subclasses. Applications normally use {@link SpecificData#get()}. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
   * Create an instance of a class. If the class implements
   * {@link SchemaConstructable}, call a constructor with a
   * {@link org.apache.avro.Schema} parameter, otherwise use a no-arg constructor.
   */
  @SuppressWarnings("unchecked")
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `lang/java/tools/src/main/java/org/apache/avro/tool/RecordCountTool.java`
#### Snippet
```java
  }

  private long countRecords(InputStream inStream) throws java.io.IOException {
    long count = 0L;
    try (DataFileStream<Object> streamReader = new DataFileStream<>(inStream, new GenericDatumReader<>())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.io` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroKeyComparator.java`
#### Snippet
```java

/**
 * The {@link org.apache.hadoop.io.RawComparator} used by jobs configured with
 * {@link org.apache.avro.mapreduce.AvroJob}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapreduce` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroKeyComparator.java`
#### Snippet
```java
/**
 * The {@link org.apache.hadoop.io.RawComparator} used by jobs configured with
 * {@link org.apache.avro.mapreduce.AvroJob}.
 *
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerializer.java`
#### Snippet
```java
 * Keys and values containing Avro types are more efficiently serialized outside
 * of the WritableSerialization model, so they are wrapped in
 * {@link org.apache.avro.mapred.AvroWrapper} objects and serialization is
 * handled by this class.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroDeserializer.java`
#### Snippet
```java
 * Keys and values containing Avro types are more efficiently serialized outside
 * of the WritableSerialization model, so they are wrapper in
 * {@link org.apache.avro.mapred.AvroWrapper} objects and deserialization is
 * handled by this class.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.io.serializer` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerialization.java`
#### Snippet
```java

/**
 * The {@link org.apache.hadoop.io.serializer.Serialization} used by jobs
 * configured with {@link org.apache.avro.mapreduce.AvroJob}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
       * <p>
       * The key class will automatically be set to
       * {@link org.apache.avro.mapred.AvroKey}, so there is no need to call
       * {@link #withKeyClass(Class)} when using this method.
       * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
       * <p>
       * If the values will be Avro data, use
       * {@link #withValueSchema(org.apache.avro.Schema)} to specify the writer
       * schema. The value class will be automatically set to
       * {@link org.apache.avro.mapred.AvroValue}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
       * {@link #withValueSchema(org.apache.avro.Schema)} to specify the writer
       * schema. The value class will be automatically set to
       * {@link org.apache.avro.mapred.AvroValue}.
       * </p>
       *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
       * <p>
       * The value class will automatically be set to
       * {@link org.apache.avro.mapred.AvroValue}, so there is no need to call
       * {@link #withValueClass(Class)} when using this method.
       * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
       * <p>
       * If the keys will be Avro data, use
       * {@link #withKeySchema(org.apache.avro.Schema)} to specify the writer schema.
       * The key class will be automatically set to
       * {@link org.apache.avro.mapred.AvroKey}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java
       * {@link #withKeySchema(org.apache.avro.Schema)} to specify the writer schema.
       * The key class will be automatically set to
       * {@link org.apache.avro.mapred.AvroKey}.
       * </p>
       *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.io` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSequenceFile.java`
#### Snippet
```java

/**
 * A wrapper around a Hadoop {@link org.apache.hadoop.io.SequenceFile} that also
 * supports reading and writing Avro data.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapred` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/HadoopMapper.java`
#### Snippet
```java

/**
 * Bridge between a {@link org.apache.hadoop.mapred.Mapper} and an
 * {@link AvroMapper}. Outputs are written directly when a job is map-only, but
 * are otherwise assumed to be pairs that are split.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/SequenceFileReader.java`
#### Snippet
```java

    @Override
    public Schema getSchema(java.lang.reflect.Type type) {
      if (WRITABLE_SCHEMAS.containsKey(type))
        return WRITABLE_SCHEMAS.get(type);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroMultipleOutputs.java`
#### Snippet
```java
   * their <code>close()</code>
   *
   * @throws java.io.IOException thrown if any of the MultipleOutput files could
   *                             not be closed properly.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/Pair.java`
#### Snippet
```java
      return value;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index: " + i);
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/Pair.java`
#### Snippet
```java
      break;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index: " + i);
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary, and can be replaced with an import
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroOutputFormatBase.java`
#### Snippet
```java
   */
  protected static int getSyncInterval(TaskAttemptContext context) {
    return context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.SYNC_INTERVAL_KEY,
        DataFileConstants.DEFAULT_SYNC_INTERVAL);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary, and can be replaced with an import
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroOutputFormatBase.java`
#### Snippet
```java
    if (FileOutputFormat.getCompressOutput(context)) {
      // Default to deflate compression.
      int deflateLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.DEFLATE_LEVEL_KEY,
          CodecFactory.DEFAULT_DEFLATE_LEVEL);
      int xzLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.XZ_LEVEL_KEY,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary, and can be replaced with an import
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroOutputFormatBase.java`
#### Snippet
```java
      int deflateLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.DEFLATE_LEVEL_KEY,
          CodecFactory.DEFAULT_DEFLATE_LEVEL);
      int xzLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.XZ_LEVEL_KEY,
          CodecFactory.DEFAULT_XZ_LEVEL);
      int zstdLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.ZSTD_LEVEL_KEY,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary, and can be replaced with an import
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroOutputFormatBase.java`
#### Snippet
```java
      int xzLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.XZ_LEVEL_KEY,
          CodecFactory.DEFAULT_XZ_LEVEL);
      int zstdLevel = context.getConfiguration().getInt(org.apache.avro.mapred.AvroOutputFormat.ZSTD_LEVEL_KEY,
          DEFAULT_ZSTANDARD_LEVEL);
      boolean zstdBufferPool = context.getConfiguration()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary, and can be replaced with an import
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroOutputFormatBase.java`
#### Snippet
```java
          DEFAULT_ZSTANDARD_LEVEL);
      boolean zstdBufferPool = context.getConfiguration()
          .getBoolean(org.apache.avro.mapred.AvroOutputFormat.ZSTD_BUFFERPOOL_KEY, DEFAULT_ZSTANDARD_BUFFERPOOL);

      String outputCodec = context.getConfiguration().get(AvroJob.CONF_OUTPUT_CODEC);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.mapred` is unnecessary, and can be replaced with an import
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroOutputFormatBase.java`
#### Snippet
```java
    Path path = new Path(getWorkPathFromCommitter(context),
        getUniqueFile(context, context.getConfiguration().get("avro.mo.config.namedOutput", "part"),
            org.apache.avro.mapred.AvroOutputFormat.EXT));
    return path.getFileSystem(context.getConfiguration()).create(path);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/AbstractAvroMojo.java`
#### Snippet
```java
  /**
   * A set of fully qualified class names of custom
   * {@link org.apache.avro.LogicalTypes.LogicalTypeFactory} implementations to
   * add to the compiler. The classes must be on the classpath at compile time and
   * whenever the Java objects are serialized.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.ipc` is unnecessary and can be removed
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/specific/SpecificRequestor.java`
#### Snippet
```java
import org.apache.avro.specific.SpecificDatumWriter;

/** {@link org.apache.avro.ipc.Requestor Requestor} for generated interfaces. */
public class SpecificRequestor extends Requestor implements InvocationHandler {
  SpecificData data;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyServer.java`
#### Snippet
```java
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    closed.countDown();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/stats/StatsServlet.java`
#### Snippet
```java
      writeStats(resp.getWriter());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherKeyComparator.java`
#### Snippet
```java
    ByteBuffer b1 = x.buffer(), b2 = y.buffer();
    int diff = BinaryData.compare(b1.array(), b1.position(), b2.array(), b2.position(), schema);
    return diff == 0 ? -1 : diff;
  }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SpecificFixed()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificFixed.java`
#### Snippet
```java
  }

  public SpecificFixed(byte[] bytes) {
    bytes(bytes);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SpecificFixed()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificFixed.java`
#### Snippet
```java
  private byte[] bytes;

  public SpecificFixed() {
    bytes(new byte[getSchema().getFixedSize()]);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SpecificExceptionBase()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificExceptionBase.java`
#### Snippet
```java
  }

  public SpecificExceptionBase(Object value) {
    super(value);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SpecificExceptionBase()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificExceptionBase.java`
#### Snippet
```java
  }

  public SpecificExceptionBase(Throwable value) {
    super(value);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SpecificExceptionBase()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificExceptionBase.java`
#### Snippet
```java
public abstract class SpecificExceptionBase extends AvroRemoteException implements SpecificRecord, Externalizable {

  public SpecificExceptionBase() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SpecificExceptionBase()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificExceptionBase.java`
#### Snippet
```java
  }

  public SpecificExceptionBase(Object value, Throwable cause) {
    super(value, cause);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AvroTrevniRecordWriterBase()` of an abstract class should not be declared 'public'
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/mapreduce/AvroTrevniRecordWriterBase.java`
#### Snippet
```java
   *                form the job configuration
   */
  public AvroTrevniRecordWriterBase(TaskAttemptContext context) throws IOException {

    schema = initSchema(context);
```

### NonProtectedConstructorInAbstractClass
Constructor `Task()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
    private final EnumSet<TaskOption> options;

    public Task(TaskOption... options) {
      this.options = (options.length == 0 ? EnumSet.noneOf(TaskOption.class) : EnumSet.of(options[0], options));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BasicState()` of an abstract class should not be declared 'public'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/BasicState.java`
#### Snippet
```java
  private BinaryEncoder reuseBlockingEncoder;

  public BasicState() {
    this.reuseDecoder = null;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BasicArrayState()` of an abstract class should not be declared 'public'
in `lang/java/perf/src/main/java/org/apache/avro/perf/test/BasicArrayState.java`
#### Snippet
```java
  public final int arraySize;

  public BasicArrayState(final int arraySize) {
    super();
    this.arraySize = arraySize;
```

### NonProtectedConstructorInAbstractClass
Constructor `GenericResponder()` of an abstract class should not be declared 'public'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/generic/GenericResponder.java`
#### Snippet
```java
  private GenericData data;

  public GenericResponder(Protocol local) {
    this(local, GenericData.get());

```

### NonProtectedConstructorInAbstractClass
Constructor `GenericResponder()` of an abstract class should not be declared 'public'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/generic/GenericResponder.java`
#### Snippet
```java
  }

  public GenericResponder(Protocol local, GenericData data) {
    super(local);
    this.data = data;
```

### NonProtectedConstructorInAbstractClass
Constructor `NamedSchema()` of an abstract class should not be declared 'public'
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    Set<Name> aliases;

    public NamedSchema(Type type, Name name, String doc) {
      super(type);
      this.name = name;
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
    Class<?> type = conversion.getConvertedType();
    Map<String, Conversion<?>> conversions = conversionsByClass.get(type);
    if (conversions == null) {
      conversions = new LinkedHashMap<>();
      conversionsByClass.put(type, conversions);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyServer.java`
#### Snippet
```java
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, final NettyDataPack dataPack) throws Exception {
      callerGroup.submit(new Runnable() {
        @Override
        public void run() {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
      if (valueScale != scale) {
        try {
          value = value.setScale(scale, RoundingMode.UNNECESSARY);
          scaleAdjusted = true;
        } catch (ArithmeticException aex) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
    @Override
    public ByteBuffer toBytes(BigDecimal value, Schema schema, LogicalType type) {
      value = validate((LogicalTypes.Decimal) type, value);

      return ByteBuffer.wrap(value.unscaledValue().toByteArray());
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
    @Override
    public GenericFixed toFixed(BigDecimal value, Schema schema, LogicalType type) {
      value = validate((LogicalTypes.Decimal) type, value);

      byte fillByte = (byte) (value.signum() < 0 ? 0xFF : 0x00);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
  public static int encodeInt(int n, byte[] buf, int pos) {
    // move sign to low-order bit, and flip others if negative
    n = (n << 1) ^ (n >> 31);
    int start = pos;
    if ((n & ~0x7F) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    int start = pos;
    if ((n & ~0x7F) != 0) {
      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
      n >>>= 7;
      if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    if ((n & ~0x7F) != 0) {
      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
      n >>>= 7;
      if (n > 0x7F) {
        buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
      n >>>= 7;
      if (n > 0x7F) {
        buf[pos++] = (byte) ((n | 0x80) & 0xFF);
        n >>>= 7;
        if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
      if (n > 0x7F) {
        buf[pos++] = (byte) ((n | 0x80) & 0xFF);
        n >>>= 7;
        if (n > 0x7F) {
          buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
        n >>>= 7;
        if (n > 0x7F) {
          buf[pos++] = (byte) ((n | 0x80) & 0xFF);
          n >>>= 7;
          if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
        if (n > 0x7F) {
          buf[pos++] = (byte) ((n | 0x80) & 0xFF);
          n >>>= 7;
          if (n > 0x7F) {
            buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
          n >>>= 7;
          if (n > 0x7F) {
            buf[pos++] = (byte) ((n | 0x80) & 0xFF);
            n >>>= 7;
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
          if (n > 0x7F) {
            buf[pos++] = (byte) ((n | 0x80) & 0xFF);
            n >>>= 7;
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
      }
    }
    buf[pos++] = (byte) n;
    return pos - start;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
  /** Skip a binary-encoded long, returning the position after it. */
  public static int skipLong(final byte[] bytes, int start) {
    while ((bytes[start++] & 0x80) != 0) {
    }
    return start;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
  public static int encodeLong(long n, byte[] buf, int pos) {
    // move sign to low-order bit, and flip others if negative
    n = (n << 1) ^ (n >> 63);
    int start = pos;
    if ((n & ~0x7FL) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    int start = pos;
    if ((n & ~0x7FL) != 0) {
      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
      n >>>= 7;
      if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
    if ((n & ~0x7FL) != 0) {
      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
      n >>>= 7;
      if (n > 0x7F) {
        buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
      n >>>= 7;
      if (n > 0x7F) {
        buf[pos++] = (byte) ((n | 0x80) & 0xFF);
        n >>>= 7;
        if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
      if (n > 0x7F) {
        buf[pos++] = (byte) ((n | 0x80) & 0xFF);
        n >>>= 7;
        if (n > 0x7F) {
          buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
        n >>>= 7;
        if (n > 0x7F) {
          buf[pos++] = (byte) ((n | 0x80) & 0xFF);
          n >>>= 7;
          if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
        if (n > 0x7F) {
          buf[pos++] = (byte) ((n | 0x80) & 0xFF);
          n >>>= 7;
          if (n > 0x7F) {
            buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
          n >>>= 7;
          if (n > 0x7F) {
            buf[pos++] = (byte) ((n | 0x80) & 0xFF);
            n >>>= 7;
            if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
          if (n > 0x7F) {
            buf[pos++] = (byte) ((n | 0x80) & 0xFF);
            n >>>= 7;
            if (n > 0x7F) {
              buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
            n >>>= 7;
            if (n > 0x7F) {
              buf[pos++] = (byte) ((n | 0x80) & 0xFF);
              n >>>= 7;
              if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
            if (n > 0x7F) {
              buf[pos++] = (byte) ((n | 0x80) & 0xFF);
              n >>>= 7;
              if (n > 0x7F) {
                buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
              n >>>= 7;
              if (n > 0x7F) {
                buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                n >>>= 7;
                if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
              if (n > 0x7F) {
                buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                n >>>= 7;
                if (n > 0x7F) {
                  buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
                n >>>= 7;
                if (n > 0x7F) {
                  buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                  n >>>= 7;
                  if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
                if (n > 0x7F) {
                  buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                  n >>>= 7;
                  if (n > 0x7F) {
                    buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
                  n >>>= 7;
                  if (n > 0x7F) {
                    buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                    n >>>= 7;
                    if (n > 0x7F) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
                  if (n > 0x7F) {
                    buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                    n >>>= 7;
                    if (n > 0x7F) {
                      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
                    n >>>= 7;
                    if (n > 0x7F) {
                      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                      n >>>= 7;
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
                    if (n > 0x7F) {
                      buf[pos++] = (byte) ((n | 0x80) & 0xFF);
                      n >>>= 7;
                    }
                  }
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryData.java`
#### Snippet
```java
      }
    }
    buf[pos++] = (byte) n;
    return pos - start;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `lang/java/avro/src/main/java/org/apache/avro/io/DirectBinaryDecoder.java`
#### Snippet
```java
        throw new EOFException();
      }
      length -= n;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/avro/src/main/java/org/apache/avro/io/DirectBinaryDecoder.java`
#### Snippet
```java
        throw new EOFException();
      }
      start += n;
      length -= n;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `lang/java/avro/src/main/java/org/apache/avro/io/DirectBinaryDecoder.java`
#### Snippet
```java
      }
      start += n;
      length -= n;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `lang/java/avro/src/main/java/org/apache/avro/io/BlockingBinaryEncoder.java`
#### Snippet
```java
          if (buf.length <= len) {
            super.writeFixed(b, off, len);
            len = 0;
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `lang/java/avro/src/main/java/org/apache/avro/io/EncoderFactory.java`
#### Snippet
```java
  public EncoderFactory configureBlockSize(int size) {
    if (size < MIN_BLOCK_BUFFER_SIZE)
      size = MIN_BLOCK_BUFFER_SIZE;
    if (size > MAX_BLOCK_BUFFER_SIZE)
      size = MAX_BLOCK_BUFFER_SIZE;
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `lang/java/avro/src/main/java/org/apache/avro/io/EncoderFactory.java`
#### Snippet
```java
      size = MIN_BLOCK_BUFFER_SIZE;
    if (size > MAX_BLOCK_BUFFER_SIZE)
      size = MAX_BLOCK_BUFFER_SIZE;
    this.binaryBlockSize = size;
    return this;
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `lang/java/avro/src/main/java/org/apache/avro/io/EncoderFactory.java`
#### Snippet
```java
  public EncoderFactory configureBufferSize(int size) {
    if (size < 32)
      size = 32;
    if (size > 16 * 1024 * 1024)
      size = 16 * 1024 * 1024;
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `lang/java/avro/src/main/java/org/apache/avro/io/EncoderFactory.java`
#### Snippet
```java
      size = 32;
    if (size > 16 * 1024 * 1024)
      size = 16 * 1024 * 1024;
    this.binaryBufferSize = size;
    return this;
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `lang/java/avro/src/main/java/org/apache/avro/io/DecoderFactory.java`
#### Snippet
```java
  public DecoderFactory configureDecoderBufferSize(int size) {
    if (size < 32)
      size = 32;
    if (size > 16 * 1024 * 1024)
      size = 16 * 1024 * 1024;
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `lang/java/avro/src/main/java/org/apache/avro/io/DecoderFactory.java`
#### Snippet
```java
      size = 32;
    if (size > 16 * 1024 * 1024)
      size = 16 * 1024 * 1024;
    this.binaryDecoderBufferSize = size;
    return this;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    } else {
      limit = pos = 0;
      length -= remaining;
      source.skipSourceBytes(length);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      // read the rest of the buffer
      System.arraycopy(buf, pos, bytes, start, remaining);
      start += remaining;
      length -= remaining;
      pos = limit;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      System.arraycopy(buf, pos, bytes, start, remaining);
      start += remaining;
      length -= remaining;
      pos = limit;
      // finish from the byte source
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
          throw new EOFException();
        }
        len -= read;
        off += read;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
        }
        len -= read;
        off += read;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    int len = 1;
    int b = buf[pos] & 0xff;
    l ^= (b & 0x7fL) << 28;
    if (b > 0x7f) {
      b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
    if (b > 0x7f) {
      b = buf[pos + len++] & 0xff;
      l ^= (b & 0x7fL) << 35;
      if (b > 0x7f) {
        b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
      if (b > 0x7f) {
        b = buf[pos + len++] & 0xff;
        l ^= (b & 0x7fL) << 42;
        if (b > 0x7f) {
          b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
        if (b > 0x7f) {
          b = buf[pos + len++] & 0xff;
          l ^= (b & 0x7fL) << 49;
          if (b > 0x7f) {
            b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
          if (b > 0x7f) {
            b = buf[pos + len++] & 0xff;
            l ^= (b & 0x7fL) << 56;
            if (b > 0x7f) {
              b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
            if (b > 0x7f) {
              b = buf[pos + len++] & 0xff;
              l ^= (b & 0x7fL) << 63;
              if (b > 0x7f) {
                throw new InvalidNumberEncodingException("Invalid long encoding");
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
        long n = in.skip(length);
        if (n > 0) {
          length -= n;
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `lang/java/avro/src/main/java/org/apache/avro/io/BinaryDecoder.java`
#### Snippet
```java
          }
          leftToCopy -= read;
          off += read;
        }
      } catch (EOFException eof) {
```

### AssignmentToMethodParameter
Assignment to method parameter `space`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaBuilder.java`
#### Snippet
```java
      if (lastDot < 0) { // short name
        if (space == null) {
          space = namespace;
        }
        if (space != null && !"".equals(space)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `magic`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
    this.header = new Header();
    this.vin = DecoderFactory.get().binaryDecoder(in, vin);
    magic = (magic == null) ? readMagic() : magic;
    validateMagic(magic);

```

### AssignmentToMethodParameter
Assignment to method parameter `reuse`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
    }
    if (reuse == null || reuse.data.length < (int) blockSize) {
      reuse = new DataBlock(blockRemaining, (int) blockSize);
    } else {
      reuse.numEntries = blockRemaining;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `lang/java/avro/src/main/java/org/apache/avro/util/ByteBufferOutputStream.java`
#### Snippet
```java
    while (len > remaining) {
      buffer.put(b, off, remaining);
      len -= remaining;
      off += remaining;
      buffer = ByteBuffer.allocate(BUFFER_SIZE);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `lang/java/avro/src/main/java/org/apache/avro/util/ByteBufferOutputStream.java`
#### Snippet
```java
      buffer.put(b, off, remaining);
      len -= remaining;
      off += remaining;
      buffer = ByteBuffer.allocate(BUFFER_SIZE);
      buffers.add(buffer);
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
      int limit = index + (int) l;
      if (array.length < limit) {
        array = Arrays.copyOf(array, limit);
      }
      while (index < limit) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
        index++;
      }
    } while ((l = in.arrayNext()) > 0);
    return array;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          index++;
        }
      } while ((l = in.arrayNext()) > 0);
    } else {
      do {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          index++;
        }
      } while ((l = in.arrayNext()) > 0);
    }
    return array;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          c.add(element);
        }
      } while ((l = in.arrayNext()) > 0);
    } else {
      do {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
          c.add(element);
        }
      } while ((l = in.arrayNext()) > 0);
    }
    return c;
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumWriter.java`
#### Snippet
```java
  protected void write(Schema schema, Object datum, Encoder out) throws IOException {
    if (datum instanceof Byte)
      datum = ((Byte) datum).intValue();
    else if (datum instanceof Short)
      datum = ((Short) datum).intValue();
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumWriter.java`
#### Snippet
```java
      datum = ((Byte) datum).intValue();
    else if (datum instanceof Short)
      datum = ((Short) datum).intValue();
    else if (datum instanceof Character)
      datum = (int) (char) (Character) datum;
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumWriter.java`
#### Snippet
```java
      datum = ((Short) datum).intValue();
    else if (datum instanceof Character)
      datum = (int) (char) (Character) datum;
    else if (datum instanceof Map && ReflectData.isNonStringMapSchema(schema)) {
      // Maps with non-string keys are written as arrays.
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumWriter.java`
#### Snippet
```java
        entryList.add(new MapEntry(e.getKey(), e.getValue()));
      }
      datum = entryList;
    } else if (datum instanceof Optional) {
      datum = ((Optional) datum).orElse(null);
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumWriter.java`
#### Snippet
```java
      datum = entryList;
    } else if (datum instanceof Optional) {
      datum = ((Optional) datum).orElse(null);
    }
    try {
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificDatumWriter.java`
#### Snippet
```java
  protected void writeString(Schema schema, Object datum, Encoder out) throws IOException {
    if (!(datum instanceof CharSequence) && getSpecificData().isStringable(datum.getClass())) {
      datum = datum.toString(); // convert to string
    }
    writeString(datum, out);
```

### AssignmentToMethodParameter
Assignment to method parameter `old`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificDatumReader.java`
#### Snippet
```java
    SpecificData data = getSpecificData();
    if (data.useCustomCoders()) {
      old = data.newRecord(old, expected);
      if (old instanceof SpecificRecordBase) {
        SpecificRecordBase d = (SpecificRecordBase) old;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
    case STRING:
      if (value instanceof Utf8) // convert Utf8 to String
        value = value.toString();
      break;
    case ENUM:
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
    case ENUM:
      if (value instanceof Enum)
        value = ((Enum) value).ordinal();
      else
        value = s.getEnumOrdinal(value.toString());
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
        value = ((Enum) value).ordinal();
      else
        value = s.getEnumOrdinal(value.toString());
      break;
    case FIXED:
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
      break;
    case FIXED:
      value = ((GenericFixed) value).bytes();
      break;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
    case RECORD:
      for (Field f : s.getFields())
        column = write(model.getField(o, f.name(), f.pos()), f.schema(), column);
      return column;
    case ARRAY:
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
        if (!selected) {
          writer.writeLength(0, column);
          column += arrayWidths[column];
        } else {
          writer.writeLength(1, column);
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
          writer.writeLength(1, column);
          if (isSimple(branch)) {
            writeValue(o, branch, column++);
          } else {
            writer.writeValue(null, column);
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnWriter.java`
#### Snippet
```java
          } else {
            writer.writeValue(null, column);
            column = write(o, branch, column + 1);
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
    if (isSimple(s)) {
      if (path == null)
        path = s.getFullName();
      addColumn(path, simpleValueType(s), parent, isArray);
      return;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
    switch (s.getType()) {
    case MAP:
      path = path == null ? ">" : path + ">";
      int start = columns.size();
      ColumnMetaData p = addColumn(path, ValueType.NULL, parent, true);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
      break;
    case ARRAY:
      path = path == null ? "[]" : path + "[]";
      addArrayColumn(path, s.getElementType(), parent);
      break;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java
  private void addArrayColumn(String path, Schema element, ColumnMetaData parent) {
    if (path == null)
      path = element.getFullName();
    if (isSimple(element)) { // optimize simple arrays
      addColumn(path, simpleValueType(element), parent, true);
```

### AssignmentToMethodParameter
Assignment to method parameter `ref`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
          while (ref != null) {
            toPurge.add(ref);
            ref = this.referenceManager.pollForPurge();
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `ref`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
        // Restructure
        for (int i = 0; i < this.references.length; i++) {
          ref = this.references[i];
          if (!resizing) {
            restructured[i] = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `ref`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
              }
            }
            ref = ref.getNext();
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `word`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
  protected static String unmangle(String word) {
    while (word.endsWith("$")) {
      word = word.substring(0, word.length() - 1);
    }
    return word;
```

### AssignmentToMethodParameter
Assignment to method parameter `symbol`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
      return super.createEnum(symbol, schema); // punt to generic
    if (RESERVED_WORDS.contains(symbol))
      symbol += "$";
    return Enum.valueOf(c, symbol);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `lang/java/tools/src/main/java/org/apache/avro/tool/ConcatTool.java`
#### Snippet
```java
    if (args.size() > 1) {
      output = Util.fileOrStdout(args.get(args.size() - 1), out);
      args = args.subList(0, args.size() - 1);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
  // escape TAB, NL and CR in keys, so that output can be reliably parsed
  static String escapeKey(String key) {
    key = key.replace("\\", "\\\\"); // escape backslashes first
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
  static String escapeKey(String key) {
    key = key.replace("\\", "\\\\"); // escape backslashes first
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
    key = key.replace("\r", "\\r"); // CR
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
    key = key.replace("\\", "\\\\"); // escape backslashes first
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
    key = key.replace("\r", "\\r"); // CR
    return key;
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileGetMetaTool.java`
#### Snippet
```java
    key = key.replace("\t", "\\t"); // TAB
    key = key.replace("\n", "\\n"); // NL
    key = key.replace("\r", "\\r"); // CR
    return key;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `lang/java/tools/src/main/java/org/apache/avro/tool/CreateRandomFileTool.java`
#### Snippet
```java
      return 1;
    }
    args = (List<String>) opts.nonOptionArguments();

    String schemastr = inschema.value(opts);
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
    if (c != null) {
      while (c.isAnonymousClass()) {
        c = c.getSuperclass();
      }
      simpleName = c.getSimpleName();
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcSendTool.java`
#### Snippet
```java
        .ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));
    args = (List<String>) opts.nonOptionArguments();

    if (args.size() != 3) {
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `lang/java/tools/src/main/java/org/apache/avro/tool/ToTrevniTool.java`
#### Snippet
```java
      return 1;
    }
    args = (List<String>) opts.nonOptionArguments();

    DataFileStream<Object> reader = new DataFileStream(Util.fileOrStdin(args.get(0), stdin),
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `lang/java/tools/src/main/java/org/apache/avro/tool/RpcReceiveTool.java`
#### Snippet
```java
    OptionSpec<String> data = p.accepts("data", "JSON-encoded response datum.").withRequiredArg().ofType(String.class);
    OptionSet opts = p.parse(args.toArray(new String[0]));
    args = (List<String>) opts.nonOptionArguments();

    if (args.size() != 3) {
```

### AssignmentToMethodParameter
Assignment to method parameter `skip`
in `lang/java/tools/src/main/java/org/apache/avro/tool/CatTool.java`
#### Snippet
```java
    while (0 < skip && reader.hasNext()) {
      reader.next(reuse);
      skip--;
      skipped++;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `avroWrapperToReuse`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroDeserializer.java`
#### Snippet
```java
    // Create a new Avro wrapper if there isn't one to reuse.
    if (null == avroWrapperToReuse) {
      avroWrapperToReuse = createAvroWrapper();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `wrapper`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroSerialization.java`
#### Snippet
```java
      T datum = reader.read(wrapper == null ? null : wrapper.datum(), decoder);
      if (wrapper == null) {
        wrapper = isKey ? new AvroKey<>(datum) : new AvroValue<>(datum);
      } else {
        wrapper.datum(datum);
```

### AssignmentToMethodParameter
Assignment to method parameter `datum`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherKeySerialization.java`
#### Snippet
```java
    public TetherData deserialize(TetherData datum) throws IOException {
      if (datum == null)
        datum = new TetherData();
      datum.buffer(decoder.readBytes(datum.buffer()));
      return datum;
```

### AssignmentToMethodParameter
Assignment to method parameter `proto`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherJob.java`
#### Snippet
```java
   */
  public static void setProtocol(JobConf job, String proto) throws IOException {
    proto = proto.trim().toLowerCase();

    if (!(proto.equals("http") || proto.equals("sasl"))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `connectTimeoutMillis`
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
    // Set up.
    if (connectTimeoutMillis == null) {
      connectTimeoutMillis = DEFAULT_CONNECTION_TIMEOUT_MILLIS;
    }
    this.connectTimeoutMillis = connectTimeoutMillis;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ColumnFileWriter.java`
#### Snippet
```java
  private long[] computeStarts(long start) throws IOException {
    long[] result = new long[columnCount];
    start += columnCount * 8; // room for starts
    for (int column = 0; column < columnCount; column++) {
      result[column] = start;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/ColumnFileWriter.java`
#### Snippet
```java
    for (int column = 0; column < columnCount; column++) {
      result[column] = start;
      start += columns[column].size();
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java

      System.arraycopy(buf, pos, bytes, start, buffered); // consume buffer
      start += buffered;
      len -= buffered;
      pos += buffered;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
      System.arraycopy(buf, pos, bytes, start, buffered); // consume buffer
      start += buffered;
      len -= buffered;
      pos += buffered;
      if (len > buf.length) { // bigger than buffer
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
        do {
          int read = readInput(bytes, start, len); // read directly into result
          len -= read;
          start += read;
        } while (len > 0);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
          int read = readInput(bytes, start, len); // read directly into result
          len -= read;
          start += read;
        } while (len > 0);
        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
    int len = 1;
    int b = buf[pos] & 0xff;
    l ^= (b & 0x7fL) << 28;
    if (b > 0x7f) {
      b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
    if (b > 0x7f) {
      b = buf[pos + len++] & 0xff;
      l ^= (b & 0x7fL) << 35;
      if (b > 0x7f) {
        b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
      if (b > 0x7f) {
        b = buf[pos + len++] & 0xff;
        l ^= (b & 0x7fL) << 42;
        if (b > 0x7f) {
          b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
        if (b > 0x7f) {
          b = buf[pos + len++] & 0xff;
          l ^= (b & 0x7fL) << 49;
          if (b > 0x7f) {
            b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
          if (b > 0x7f) {
            b = buf[pos + len++] & 0xff;
            l ^= (b & 0x7fL) << 56;
            if (b > 0x7f) {
              b = buf[pos + len++] & 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
            if (b > 0x7f) {
              b = buf[pos + len++] & 0xff;
              l ^= (b & 0x7fL) << 63;
              if (b > 0x7f) {
                throw new IOException("Invalid long encoding");
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
  public void writeLong(long n) throws IOException {
    ensure(10);
    n = (n << 1) ^ (n >> 63); // move sign to low-order bit
    if ((n & ~0x7FL) != 0) {
      buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if ((n & ~0x7FL) != 0) {
      buf[count++] = (byte) ((n | 0x80) & 0xFF);
      n >>>= 7;
      if (n > 0x7F) {
        buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
      if (n > 0x7F) {
        buf[count++] = (byte) ((n | 0x80) & 0xFF);
        n >>>= 7;
        if (n > 0x7F) {
          buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
        if (n > 0x7F) {
          buf[count++] = (byte) ((n | 0x80) & 0xFF);
          n >>>= 7;
          if (n > 0x7F) {
            buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
          if (n > 0x7F) {
            buf[count++] = (byte) ((n | 0x80) & 0xFF);
            n >>>= 7;
            if (n > 0x7F) {
              buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
            if (n > 0x7F) {
              buf[count++] = (byte) ((n | 0x80) & 0xFF);
              n >>>= 7;
              if (n > 0x7F) {
                buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
              if (n > 0x7F) {
                buf[count++] = (byte) ((n | 0x80) & 0xFF);
                n >>>= 7;
                if (n > 0x7F) {
                  buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
                if (n > 0x7F) {
                  buf[count++] = (byte) ((n | 0x80) & 0xFF);
                  n >>>= 7;
                  if (n > 0x7F) {
                    buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
                  if (n > 0x7F) {
                    buf[count++] = (byte) ((n | 0x80) & 0xFF);
                    n >>>= 7;
                    if (n > 0x7F) {
                      buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
                    if (n > 0x7F) {
                      buf[count++] = (byte) ((n | 0x80) & 0xFF);
                      n >>>= 7;
                    }
                  }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
  public void writeInt(int n) {
    ensure(5);
    n = (n << 1) ^ (n >> 31); // move sign to low-order bit
    if ((n & ~0x7F) != 0) {
      buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
    if ((n & ~0x7F) != 0) {
      buf[count++] = (byte) ((n | 0x80) & 0xFF);
      n >>>= 7;
      if (n > 0x7F) {
        buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
      if (n > 0x7F) {
        buf[count++] = (byte) ((n | 0x80) & 0xFF);
        n >>>= 7;
        if (n > 0x7F) {
          buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
        if (n > 0x7F) {
          buf[count++] = (byte) ((n | 0x80) & 0xFF);
          n >>>= 7;
          if (n > 0x7F) {
            buf[count++] = (byte) ((n | 0x80) & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java
          if (n > 0x7F) {
            buf[count++] = (byte) ((n | 0x80) & 0xFF);
            n >>>= 7;
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java

  public static int size(int n) {
    n = (n << 1) ^ (n >> 31); // move sign to low-order bit
    if (n <= (1 << (7 * 1)) - 1)
      return 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/OutputBuffer.java`
#### Snippet
```java

  public static int size(long n) {
    n = (n << 1) ^ (n >> 63); // move sign to low-order bit
    if (n <= (1 << (7 * 1)) - 1)
      return 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java

  OutputFile compile(Schema schema) {
    schema = addStringType(schema); // annotate schema as needed
    String output = "";
    VelocityContext context = new VelocityContext();
```

### AssignmentToMethodParameter
Assignment to method parameter `protocol`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java

  OutputFile compileInterface(Protocol protocol) {
    protocol = addStringType(protocol); // annotate protocol as needed
    VelocityContext context = new VelocityContext();
    context.put("protocol", protocol);
```

### AssignmentToMethodParameter
Assignment to method parameter `error`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/generic/GenericResponder.java`
#### Snippet
```java
  public void writeError(Schema schema, Object error, Encoder out) throws IOException {
    if (error instanceof AvroRemoteException)
      error = ((AvroRemoteException) error).getValue();
    getDatumWriter(schema).write(error, out);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `error`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/reflect/ReflectResponder.java`
#### Snippet
```java
  public void writeError(Schema schema, Object error, Encoder out) throws IOException {
    if (error instanceof CharSequence)
      error = error.toString(); // system error: convert
    super.writeError(schema, error, out);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `containing`
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtobufData.java`
#### Snippet
```java
        inner.insert(0, containing.getName() + "$");
      }
      containing = containing.getContainingType();
    }
    String d1 = (!outer.isEmpty() || inner.length() != 0 ? "." : "");
```

### AssignmentToMethodParameter
Assignment to method parameter `space`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        this.name = validateName(name);
      } else { // qualified name
        space = name.substring(0, lastDot); // get space from name
        this.name = validateName(name.substring(lastDot + 1));
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `space`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
      }
      if ("".equals(space))
        space = null;
      this.space = space;
      this.full = (this.space == null) ? this.name : this.space + "." + this.name;
```

### AssignmentToMethodParameter
Assignment to method parameter `space`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
        this.aliases = new LinkedHashSet<>();
      if (space == null)
        space = this.name.space;
      aliases.add(new Name(name, space));
    }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `recordReader`
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java
    // to prevent endless loops on recursive types
    RecordReader recordReader = getRecordReaderFromCache(action.reader, action.writer);
    synchronized (recordReader) {
      // only need to initialize once
      if (recordReader.getInitializationStage() == Stage.NEW) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
  public static <T> Object convertToRawType(Object datum, Schema schema, LogicalType type, Conversion<T> conversion) {
    if (datum == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/Conversions.java`
#### Snippet
```java
  public static Object convertToLogicalType(Object datum, Schema schema, LogicalType type, Conversion<?> conversion) {
    if (datum == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/LogicalTypes.java`
#### Snippet
```java

    if (typeName == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/LogicalTypes.java`
#### Snippet
```java
      LOG.warn("Ignoring invalid logical type for name: {}", typeName);
      // ignore invalid types
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/ValidatingEncoder.java`
#### Snippet
```java
  @Override
  public Symbol doAction(Symbol input, Symbol top) throws IOException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/JsonProperties.java`
#### Snippet
```java
  public String getProp(String name) {
    JsonNode value = getJsonProp(name);
    return value != null && value.isTextual() ? value.textValue() : null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/ResolvingDecoder.java`
#### Snippet
```java
  public Symbol doAction(Symbol input, Symbol top) throws IOException {
    if (top instanceof Symbol.FieldOrderAction) {
      return input == Symbol.FIELD_ACTION ? top : null;
    }
    if (top instanceof Symbol.ResolvingAction) {
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/ResolvingDecoder.java`
#### Snippet
```java
      throw new AvroTypeException("Unknown action: " + top);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/ResolvingDecoder.java`
#### Snippet
```java
  public final Schema.Field[] readFieldOrderIfDiff() throws IOException {
    Symbol.FieldOrderAction top = (Symbol.FieldOrderAction) parser.advance(Symbol.FIELD_ACTION);
    return (top.noReorder ? null : top.fields);
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonEncoder.java`
#### Snippet
```java
      throw new AvroTypeException("Unknown action symbol " + top);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/SchemaCompatibility.java`
#### Snippet
```java
    switch (writerFields.size()) {
    case 0:
      return null;
    case 1:
      return writerFields.get(0);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/Protocol.java`
#### Snippet
```java
    JsonNode nameNode = json.get("doc");
    if (nameNode == null)
      return null; // no doc defined
    return nameNode.textValue();
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/ValidatingDecoder.java`
#### Snippet
```java
  @Override
  public Symbol doAction(Symbol input, Symbol top) throws IOException {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
            in = tokenBuffer.asParser();
            in.nextToken();
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
          in.nextToken();
          if (name.equals(fn) || fa.aliases.contains(fn)) {
            return null;
          } else {
            if (currentReorderBuffer == null) {
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java
      throw new AvroTypeException("Unknown action symbol " + top);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java
      return ((SpecificRecordBase) record)::getConversion;
    } else {
      return index -> null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/io/FastReaderBuilder.java`
#### Snippet
```java
      return (old, decoder) -> {
        decoder.readNull();
        return null;
      };
    case BOOLEAN:
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/file/CodecFactory.java`
#### Snippet
```java
      return REGISTERED.put(name, c);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/file/CodecFactory.java`
#### Snippet
```java
    } catch (Throwable t) {
      LOG.debug("Snappy was not available", t);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileStream.java`
#### Snippet
```java
    byte[] value = getMeta(key);
    if (value == null) {
      return null;
    }
    return new String(value, StandardCharsets.UTF_8);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java
    byte[] value = getMeta(key);
    if (value == null) {
      return null;
    }
    return new String(value, StandardCharsets.UTF_8);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/file/DataFileReader12.java`
#### Snippet
```java

      if (in.tell() == in.length()) // at eof
        return null;

      skipSync(); // skip a sync
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/ByteBufferInputStream.java`
#### Snippet
```java
      current++;
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/RandomData.java`
#### Snippet
```java
      return random.nextBoolean();
    case NULL:
      return null;
    default:
      throw new RuntimeException("Unknown type: " + schema);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/JacksonUtils.java`
#### Snippet
```java
    }
    if (jsonNode == null) {
      return null;
    } else if (jsonNode.isNull()) {
      return JsonProperties.NULL_VALUE;
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/JacksonUtils.java`
#### Snippet
```java
      return m;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/internal/JacksonUtils.java`
#### Snippet
```java
  public static JsonNode toJsonNode(Object datum) {
    if (datum == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ArrayAccessor.java`
#### Snippet
```java
    if (elementType == short.class)
      return readArray((short[]) array, l, in);
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
    case NULL:
      in.readNull();
      return null;
    default:
      throw new AvroRuntimeException("Unknown type: " + expected);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericDatumReader.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  protected Object peekArray(Object array) {
    return (array instanceof GenericArray) ? ((GenericArray) array).peek() : null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectDatumReader.java`
#### Snippet
```java
  @Override
  protected Object peekArray(Object array) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
    } catch (Throwable t) {
      // if anything goes wrong, don't provide a Supplier
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
    } catch (Throwable t) {
      // if something goes wrong, do not provide a Function instance
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectionUtil.java`
#### Snippet
```java
      return () -> supplierFunction.apply(argument);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificRecordBase.java`
#### Snippet
```java
  public Conversion<?> getConversion(int field) {
    // for backward-compatibility. no older specific classes have conversions.
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificDatumReader.java`
#### Snippet
```java
    String name = schema.getProp(prop);
    if (name == null)
      return null;
    try {
      return ClassUtils.forName(getData().getClassLoader(), name);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
      }
      if (this.count.get() == 0) {
        return null;
      }
      // Use a local copy to protect against other threads writing
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
    Reference<K, V> ref = getReference(key, Restructure.WHEN_NECESSARY);
    Entry<K, V> entry = (ref != null ? ref.get() : null);
    return (entry != null ? entry.getValue() : null);
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
    @Nullable
    protected T execute(@Nullable Reference<K, V> ref, @Nullable Entry<K, V> entry) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
        currRef = currRef.getNext();
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
        Assert.state(entries != null, "No entries segment");
        entries.add(value);
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
          return oldValue;
        }
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/util/springframework/ConcurrentReferenceHashMap.java`
#### Snippet
```java
          return entry.value;
        }
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
  public Conversion<Object> getConversionFor(LogicalType logicalType) {
    if (logicalType == null) {
      return null;
    }
    return (Conversion<Object>) conversions.get(logicalType.getName());
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
    if (json.isNull() && (field.schema().getType() == Type.NULL
        || (field.schema().getType() == Type.UNION && field.schema().getTypes().get(0).getType() == Type.NULL))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
  private Object deepCopyRaw(Schema schema, Object value) {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return mapCopy;
    case NULL:
      return null;
    case RECORD:
      Object oldState = getRecordState(value, schema);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
  public <T> T deepCopy(Schema schema, T value) {
    if (value == null)
      return null;
    LogicalType logicalType = schema.getLogicalType();
    if (logicalType == null) // not a logical type -- use raw copy
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
   */
  protected Object getRecordState(Object record, Schema schema) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
    @Override
    public T peek() {
      return (size < elements.length) ? (T) elements[size] : null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return (Conversion<T>) conversions.values().iterator().next();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java`
#### Snippet
```java
      return (Conversion<T>) conversions.get(logicalType.getName());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
      String name = schema.getFullName();
      if (name == null)
        return null;
      Class<?> c = MapUtil.computeIfAbsent(classCache, name, n -> {
        try {
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/specific/SpecificData.java`
#### Snippet
```java
        }
      });
      return c == NO_CLASS ? null : c;
    case ARRAY:
      return List.class;
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
    String name = schema.getProp(prop);
    if (name == null)
      return null;
    Class c = CLASS_CACHE.get(name);
    if (c != null)
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
      return data.getAccessorsFor(s);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
      return data.getAccessorFor(fieldName);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
        return new ClassAccessorData(c);
      }
      return null;
    }
  };
```

### ReturnNull
Return of `null`
in `lang/java/thrift/src/main/java/org/apache/avro/thrift/ThriftData.java`
#### Snippet
```java
    if (struct.isSet(f))
      return struct.getFieldValue(f);
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroKeyValue.java`
#### Snippet
```java
      GenericRecord genericRecord = mGenericIterator.next();
      if (null == genericRecord) {
        return null;
      }
      return new AvroKeyValue<>(genericRecord);
```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerialization.java`
#### Snippet
```java
  public static Schema getValueReaderSchema(Configuration conf) {
    String json = conf.get(CONF_VALUE_READER_SCHEMA);
    return null == json ? null : new Schema.Parser().parse(json);
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerialization.java`
#### Snippet
```java
  public static Schema getKeyWriterSchema(Configuration conf) {
    String json = conf.get(CONF_KEY_WRITER_SCHEMA);
    return null == json ? null : new Schema.Parser().parse(json);
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerialization.java`
#### Snippet
```java
  public static Schema getValueWriterSchema(Configuration conf) {
    String json = conf.get(CONF_VALUE_WRITER_SCHEMA);
    return null == json ? null : new Schema.Parser().parse(json);
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroSerialization.java`
#### Snippet
```java
  public static Schema getKeyReaderSchema(Configuration conf) {
    String json = conf.get(CONF_KEY_READER_SCHEMA);
    return null == json ? null : new Schema.Parser().parse(json);
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/io/AvroDatumConverterFactory.java`
#### Snippet
```java
    @Override
    public Object convert(NullWritable input) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/file/SortedKeyValueFile.java`
#### Snippet
```java
      if (null == indexEntry) {
        LOG.debug("Key {} was not found in the index (it is before the first entry)", key);
        return null;
      }
      LOG.debug("Key was found in the index, seeking to syncpoint {}", indexEntry.getValue());
```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/file/SortedKeyValueFile.java`
#### Snippet
```java
          // We've passed it.
          LOG.debug("Searched beyond the point where key {} would appear in the file", key);
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/hadoop/file/SortedKeyValueFile.java`
#### Snippet
```java
      // We've reached the end of the file.
      LOG.debug("Searched to the end of the file but did not find key {}", key);
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/AvroJob.java`
#### Snippet
```java
  public static Schema getInputSchema(Configuration job) {
    String schemaString = job.get(INPUT_SCHEMA);
    return schemaString != null ? new Schema.Parser().parse(schemaString) : null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroJob.java`
#### Snippet
```java
  public static Schema getInputKeySchema(Configuration conf) {
    String schemaString = conf.get(CONF_INPUT_KEY_SCHEMA);
    return schemaString != null ? new Schema.Parser().parse(schemaString) : null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroJob.java`
#### Snippet
```java
  public static Schema getInputValueSchema(Configuration conf) {
    String schemaString = conf.get(CONF_INPUT_VALUE_SCHEMA);
    return schemaString != null ? new Schema.Parser().parse(schemaString) : null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroJob.java`
#### Snippet
```java
  public static Schema getOutputValueSchema(Configuration conf) {
    String schemaString = conf.get(CONF_OUTPUT_VALUE_SCHEMA);
    return schemaString != null ? new Schema.Parser().parse(schemaString) : null;
  }
}
```

### ReturnNull
Return of `null`
in `lang/java/mapred/src/main/java/org/apache/avro/mapreduce/AvroJob.java`
#### Snippet
```java
  public static Schema getOutputKeySchema(Configuration conf) {
    String schemaString = conf.get(CONF_OUTPUT_KEY_SCHEMA);
    return schemaString != null ? new Schema.Parser().parse(schemaString) : null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/ipc-netty/src/main/java/org/apache/avro/ipc/netty/NettyTransceiver.java`
#### Snippet
```java
    } catch (InterruptedException | ExecutionException e) {
      LOG.debug("failed to get the response", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/idl/DocCommentHelper.java`
#### Snippet
```java
    DocComment docComment = DOC.get();
    DOC.remove();
    return docComment == null ? null : docComment.text;
  }

```

### ReturnNull
Return of `null`
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroResponseMarshaller.java`
#### Snippet
```java
    try {
      if (message.isOneWay())
        return null;
      BinaryDecoder in = DECODER_FACTORY.binaryDecoder(stream, null);
      if (!in.readBoolean()) {
```

### ReturnNull
Return of `null`
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcClient.java`
#### Snippet
```java
        Callback<?> callback = (Callback<?>) args[args.length - 1];
        unaryRequest(method.getName(), finalArgs, callback);
        return null;
      } else {
        return unaryRequest(method.getName(), args);
```

### ReturnNull
Return of `null`
in `lang/java/ipc-jetty/src/main/java/org/apache/avro/ipc/jetty/StaticServlet.java`
#### Snippet
```java
    URL resource = getClass().getClassLoader().getResource("org/apache/avro/ipc/stats/static/" + filename);
    if (resource == null) {
      return null;
    }
    return Resource.newResource(resource);
```

### ReturnNull
Return of `null`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/MetaData.java`
#### Snippet
```java
      value = defaults.get(key);
    if (value == null)
      return null;
    return new String(value, StandardCharsets.UTF_8);
  }
```

### ReturnNull
Return of `null`
in `lang/java/trevni/core/src/main/java/org/apache/trevni/InputBuffer.java`
#### Snippet
```java
    switch (type) {
    case NULL:
      return null;
    case BOOLEAN:
      return (T) Boolean.valueOf(readBoolean());
```

### ReturnNull
Return of `null`
in `lang/java/maven-plugin/src/main/java/org/apache/avro/mojo/InduceMojo.java`
#### Snippet
```java
    String namespacedFileName = fileName.substring(index + indentifier.length());
    if (!namespacedFileName.endsWith(".java")) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketServer.java`
#### Snippet
```java
    public byte[] evaluateResponse(byte[] response) throws SaslException {
      this.user = new String(response, StandardCharsets.UTF_8);
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketServer.java`
#### Snippet
```java
    @Override
    public Object getNegotiatedProperty(String propName) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Responder.java`
#### Snippet
```java

      if (m.isOneWay() && wasConnected) // no response data
        return null;

      out.writeBoolean(error != null);
```

### ReturnNull
Return of `null`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
      return conversion.getConvertedType().getName();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/compiler/src/main/java/org/apache/avro/compiler/specific/SpecificCompiler.java`
#### Snippet
```java
      return schema.getLogicalType();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SaslSocketTransceiver.java`
#### Snippet
```java
    @Override
    public Object getNegotiatedProperty(String propName) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Requestor.java`
#### Snippet
```java

    if (future == null) // the message is one-way, so return immediately
      return null;
    try { // the message is two-way, wait for the result
      return future.get();
```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Requestor.java`
#### Snippet
```java

      if (lm.isOneWay() && t.isConnected())
        return null; // one-way w/ handshake

      RPCContext context = request.getContext();
```

### ReturnNull
Return of `null`
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/specific/SpecificRequestor.java`
#### Snippet
```java
          Callback<?> callback = (Callback<?>) args[args.length - 1];
          request(method.getName(), finalArgs, callback);
          return null;
        } else {
          return request(method.getName(), args);
```

### ReturnNull
Return of `null`
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtobufData.java`
#### Snippet
```java
    case MESSAGE:
      if (!f.isRepeated() && !m.hasField(f))
        return null;
    default:
      return m.getField(f);
```

### ReturnNull
Return of `null`
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtobufData.java`
#### Snippet
```java
  private JsonNode getDefault(FieldDescriptor f) {
    if (f.isRequired()) // no default
      return null;

    if (f.isRepeated()) // empty array as repeated fields' default value
```

### ReturnNull
Return of `null`
in `lang/java/protobuf/src/main/java/org/apache/avro/protobuf/ProtobufData.java`
#### Snippet
```java
      return getConversionByClass(clazz);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
    JsonNode aliasesNode = node.get("aliases");
    if (aliasesNode == null)
      return null;
    if (!aliasesNode.isArray())
      throw new SchemaParseException("aliases not an array: " + node);
```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
   */
  public String getDoc() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
#### Snippet
```java
  private static String getOptionalText(JsonNode container, String key) {
    JsonNode jsonNode = container.get(key);
    return jsonNode != null ? jsonNode.textValue() : null;
  }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/io/JsonDecoder.java`
#### Snippet
```java

  private byte[] readByteArray() throws IOException {
    byte[] result = in.getText().getBytes(StandardCharsets.ISO_8859_1);
    return result;
  }
```

### UnnecessaryLocalVariable
Local variable `writeSchema1` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/message/RawMessageDecoder.java`
#### Snippet
```java
   */
  public RawMessageDecoder(GenericData model, Schema writeSchema, Schema readSchema) {
    Schema writeSchema1 = writeSchema;
    Schema readSchema1 = readSchema;
    this.reader = model.createDatumReader(writeSchema1, readSchema1);
```

### UnnecessaryLocalVariable
Local variable `readSchema1` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/message/RawMessageDecoder.java`
#### Snippet
```java
  public RawMessageDecoder(GenericData model, Schema writeSchema, Schema readSchema) {
    Schema writeSchema1 = writeSchema;
    Schema readSchema1 = readSchema;
    this.reader = model.createDatumReader(writeSchema1, readSchema1);
  }
```

### UnnecessaryLocalVariable
Local variable `writeSchema` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/message/RawMessageEncoder.java`
#### Snippet
```java
   */
  public RawMessageEncoder(GenericData model, Schema schema, boolean shouldCopy) {
    Schema writeSchema = schema;
    this.copyOutputBytes = shouldCopy;
    this.writer = model.createDatumWriter(writeSchema);
```

### UnnecessaryLocalVariable
Local variable `schema1` is redundant
in `lang/java/trevni/avro/src/main/java/org/apache/trevni/avro/AvroColumnator.java`
#### Snippet
```java

  public AvroColumnator(Schema schema) {
    Schema schema1 = schema;
    columnize(null, schema, null, false);
  }
```

### UnnecessaryLocalVariable
Local variable `datum` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/Util.java`
#### Snippet
```java
  static Object jsonToGenericDatum(Schema schema, String jsonData) throws IOException {
    GenericDatumReader<Object> reader = new GenericDatumReader<>(schema);
    Object datum = reader.read(null, DecoderFactory.get().jsonDecoder(schema, jsonData));
    return datum;
  }
```

### UnnecessaryLocalVariable
Local variable `arraySchema` is redundant
in `lang/java/avro/src/main/java/org/apache/avro/reflect/ReflectData.java`
#### Snippet
```java
    Schema elementSchema = Schema.createRecord(name, null, null, false);
    elementSchema.setFields(Arrays.asList(keyField, valueField));
    Schema arraySchema = Schema.createArray(elementSchema);
    return arraySchema;
  }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/DataFileRepairTool.java`
#### Snippet
```java
          }
          fileWriter.setCodec(codecFactory);
          int result = innerRecover(fileReader, fileWriter, out, err, recoverPrior, recoverAfter, schema, outfile);
          return result;
        } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `p` is redundant
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroGrpcUtils.java`
#### Snippet
```java
  public static Protocol getProtocol(Class iface) {
    try {
      Protocol p = (Protocol) (iface.getDeclaredField("PROTOCOL").get(null));
      return p;
    } catch (NoSuchFieldException e) {
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `lang/java/grpc/src/main/java/org/apache/avro/grpc/AvroResponseMarshaller.java`
#### Snippet
```java
      BinaryDecoder in = DECODER_FACTORY.binaryDecoder(stream, null);
      if (!in.readBoolean()) {
        Object response = new SpecificDatumReader(message.getResponse()).read(null, in);
        return response;
      } else {
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'types' and 'md5'
in `lang/java/avro/src/main/java/org/apache/avro/Protocol.java`
#### Snippet
```java
   * {@code props}.
   */
  public Protocol(Protocol p) {
    this(p.getName(), p.getDoc(), p.getNamespace());
    putAll(p);
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'message' and 'requestBytes'
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/Requestor.java`
#### Snippet
```java
     * @param other Request from which to copy fields.
     */
    public Request(Request other) {
      this.messageName = other.messageName;
      this.request = other.request;
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetherOutputService.java`
#### Snippet
```java
    if (inputPort == 0) {
      LOG.info("waiting for input port from child");
      wait(TIMEOUT);
    }

```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/TrevniUtil.java`
#### Snippet
```java
      return new BufferedOutputStream(fs.create(new Path(filename)));
    } else {
      return new BufferedOutputStream(new FileOutputStream(new File(filename)));
    }
  }
```

### RedundantFileCreation
`new File` is redundant
in `lang/java/tools/src/main/java/org/apache/avro/tool/TrevniUtil.java`
#### Snippet
```java
      return new BufferedInputStream(fs.open(new Path(filename)));
    } else {
      return new BufferedInputStream(new FileInputStream(new File(filename)));
    }
  }
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `lang/java/ipc/src/main/java/org/apache/avro/ipc/SocketServer.java`
#### Snippet
```java
      thread.setName("Connection to " + channel.socket().getRemoteSocketAddress());
      thread.setDaemon(true);
      thread.start();
    }

```

