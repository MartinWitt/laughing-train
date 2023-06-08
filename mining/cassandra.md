# cassandra 
 
# Bad smells
I found 13 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConfusingMainMethod | 12 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/ddm_create_table_with_udf.cql`
#### Snippet
```java
   RETURNS text
   LANGUAGE java
   AS 'return "redacted";

CREATE TABLE patients (
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/function_udfcontext.cql`
#### Snippet
```java
    RETURNS custom_type
    LANGUAGE java
    AS $$
        UDTValue udt = udfContext.newReturnUDTValue();
        udt.setString("txt", "some string");
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/create_function.cql`
#### Snippet
```java
    RETURNS text
    LANGUAGE java
    AS $$
        // some Java code
    $$;
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/create_function.cql`
#### Snippet
```java
    RETURNS text
    LANGUAGE java
    AS $$
        // some Java code
    $$;
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/function_dollarsign.cql`
#### Snippet
```java
    RETURNS int
    LANGUAGE java
    AS $$ return arg; $$;

SELECT some_function(column) FROM atable ...;
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/function_dollarsign.cql`
#### Snippet
```java
    RETURNS text
    LANGUAGE java
    AS $$ return udtarg.getString("txt"); $$;

```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/uda.cql`
#### Snippet
```java
    RETURNS tuple
    LANGUAGE java
    AS $$
        if (val != null) {
            state.setInt(0, state.getInt(0)+1);
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `doc/modules/cassandra/examples/CQL/uda.cql`
#### Snippet
```java
    RETURNS double
    LANGUAGE java
    AS $$
        double r = 0;
        if (state.getInt(0) == 0) return null;
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `pylib/cqlshlib/test/test_keyspace_init.cql`
#### Snippet
```java
    RETURNS text
    LANGUAGE java
    AS 'return "Iron Maiden";';

CREATE FUNCTION fBestsong ( input double )
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `pylib/cqlshlib/test/test_keyspace_init.cql`
#### Snippet
```java
    RETURNS text
    LANGUAGE java
    AS 'return "Revelations";';

CREATE FUNCTION fMax(current int, candidate int)
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `pylib/cqlshlib/test/test_keyspace_init.cql`
#### Snippet
```java
    RETURNS int
    LANGUAGE java
    AS 'if (current == null) return candidate; else return Math.max(current, candidate);' ;

CREATE FUNCTION fMin(current int, candidate int)
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `pylib/cqlshlib/test/test_keyspace_init.cql`
#### Snippet
```java
    RETURNS int
    LANGUAGE java
    AS 'if (current == null) return candidate; else return Math.min(current, candidate);' ;

CREATE AGGREGATE aggMax(int)
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `r` initializer `0` is redundant
in `doc/modules/cassandra/examples/CQL/uda.cql`
#### Snippet
```java
    LANGUAGE java
    AS $$
        double r = 0;
        if (state.getInt(0) == 0) return null;
        r = state.getLong(1);
```

