# cassandra 
 
# Bad smells
I found 91 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DanglingJavadoc | 87 | false |
| ConfusingMainMethod | 4 | false |
## RuleId[id=ConfusingMainMethod]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
#

/** Basic unit of data within a ColumnFamily.
 * @param name, the name by which this column is set and retrieved.  Maximum 64KB long.
 * @param value. The data associated with the name.  Maximum 2GB long, but in practice you should limit it to small numbers of MB (since Thrift must read the full value into memory to operate on it).
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** A named list of columns.
 * @param name. see Column.name.
 * @param columns. A collection of standard Columns.  The columns within a super column are defined in an adhoc manner.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    Methods for fetching rows/records from Cassandra will return either a single instance of ColumnOrSuperColumn or a list
    of ColumnOrSuperColumns (get_slice()). If you're looking up a SuperColumn (or list of SuperColumns) then the resulting
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
#

/** A specific column was requested that does not exist. */
exception NotFoundException {
}
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** Invalid request could mean keyspace or column family does not exist, required parameters are missing, or a parameter is malformed. 
    why contains an associated error message.
*/
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** Not all the replicas required could be created and/or read. */
exception UnavailableException {
}
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** RPC timeout was exceeded.  either a node failed mid-operation, or load was too high, or the requested op was too large. */
exception TimedOutException {
    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
/** RPC timeout was exceeded.  either a node failed mid-operation, or load was too high, or the requested op was too large. */
exception TimedOutException {
    /**
     * if a write operation was acknowledged by some replicas but not by enough to
     * satisfy the required ConsistencyLevel, the number of successful
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    1: optional i32 acknowledged_by

    /** 
     * in case of atomic_batch_mutate method this field tells if the batch 
     * was written to the batchlog.  
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    2: optional bool acknowledged_by_batchlog

    /** 
     * for the CAS method, this field tells if we timed out during the paxos
     * protocol, as opposed to during the commit of our update
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** invalid authentication request (invalid keyspace, user does not exist, or credentials invalid) */
exception AuthenticationException {
    1: required string why
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** invalid authorization request (user does not have access to keyspace) */
exception AuthorizationException {
    1: required string why
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
 * NOTE: This up outdated exception left for backward compatibility reasons,
 * no actual schema agreement validation is done starting from Cassandra 1.2
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** The ColumnPath is the path to a single column in Cassandra. It might make sense to think of ColumnPath and
 * ColumnParent in terms of a directory structure.
 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    A slice range is a structure that stores basic range, ordering and limit information for a query that will return
    multiple columns. It could be thought of as Cassandra's version of LIMIT and ORDER BY
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    A SlicePredicate is similar to a mathematic predicate (see http://en.wikipedia.org/wiki/Predicate_(mathematical_logic)),
    which is described as "a property that the elements of a set have in common."
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
 * @deprecated use a KeyRange with row_filter in get_range_slices instead
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java


/**
The semantics of start keys and tokens are slightly different.
Keys are start-inclusive; tokens are start-exclusive.  Token
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    A KeySlice is key followed by the data it maps to. A collection of KeySlice is returned by the get_range_slice operation.

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
 * Note that the timestamp is only optional in case of counter deletion.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    A Mutation is either an insert (represented by filling column_or_supercolumn) or a deletion (represented by filling the deletion attribute).
    @param column_or_supercolumn. An insert to a column or supercolumn (possibly counter column or supercolumn)
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    A TokenRange describes part of the Cassandra ring, it is a mapping from a range to
    endpoints responsible for that range.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    Authentication requests can contain any data, dependent on the IAuthenticator used
*/
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
    Describes a trigger.
    `options` should include at least 'class' param.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /* All of the following are now ignored and unsupplied. */

    /** @deprecated */
    9: optional double row_cache_size,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    9: optional double row_cache_size,
    /** @deprecated */
    11: optional double key_cache_size,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    11: optional double key_cache_size,
    /** @deprecated */
    19: optional i32 row_cache_save_period_in_seconds,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    19: optional i32 row_cache_save_period_in_seconds,
    /** @deprecated */
    20: optional i32 key_cache_save_period_in_seconds,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    20: optional i32 key_cache_save_period_in_seconds,
    /** @deprecated */
    21: optional i32 memtable_flush_after_mins,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    21: optional i32 memtable_flush_after_mins,
    /** @deprecated */
    22: optional i32 memtable_throughput_in_mb,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    22: optional i32 memtable_throughput_in_mb,
    /** @deprecated */
    23: optional double memtable_operations_in_millions,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    23: optional double memtable_operations_in_millions,
    /** @deprecated */
    24: optional bool replicate_on_write,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    24: optional bool replicate_on_write,
    /** @deprecated */
    25: optional double merge_shards_chance,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    25: optional double merge_shards_chance,
    /** @deprecated */
    27: optional string row_cache_provider,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    27: optional string row_cache_provider,
    /** @deprecated */
    31: optional i32 row_cache_keys_to_save,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    31: optional i32 row_cache_keys_to_save,
    /** @deprecated */
    38: optional bool populate_io_cache_on_flush,
    /** @deprecated */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    /** @deprecated */
    38: optional bool populate_io_cache_on_flush,
    /** @deprecated */
    41: optional i32 index_interval,
}
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    3: optional map<string,string> strategy_options,

    /** @deprecated ignored */
    4: optional i32 replication_factor,

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** Represents input splits used by hadoop ColumnFamilyRecordReaders */
struct CfSplit {
    1: required string start_token,
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/** The ColumnSlice is used to select a set of columns from inside a row. 
 * If start or finish are unspecified they will default to the start-of
 * end-of value.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
 * Used to perform multiple slices on a single row key in one rpc operation
 * @param key. The row key to be multi sliced
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
}

/**
 * A pair of a row (key) and selection of columns, used in calls to multiget_multislice() specifying which rows should
 * be queried and which columns within said rows.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  # retrieval methods

  /**
    Get the Column or SuperColumn at the given column_path. If no value is present, NotFoundException is thrown. (This is
    the only method that can throw an exception under non-failure conditions.)
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                      throws (1:InvalidRequestException ire, 2:NotFoundException nfe, 3:UnavailableException ue, 4:TimedOutException te),

  /**
    Get the group of columns contained by column_parent (either a ColumnFamily name or a ColumnFamily/SuperColumn name
    pair) specified by the given SlicePredicate. If no matching values are found, an empty list is returned.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                            throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    returns the number of columns matching <code>predicate</code> for a particular <code>key</code>, 
    <code>ColumnFamily</code> and optionally <code>SuperColumn</code>.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
      throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Performs a get_slice for column_parent and predicate for the given keys in parallel.
  */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                                        throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Performs multiple get_slice commands in parallel for the given column_parent. Differently from multiget_slice,
    users may specify more than one <code>KeyPredicate</code> for each distinct key in the <code>request</code>.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                                        throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Perform a get_count in parallel on the given list<binary> keys. The return value maps keys to the count found.
  */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
      throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   returns a subset of columns for a contiguous range of keys.
  */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                 throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   returns a range of columns, wrapping to the next rows if necessary to collect max_results.
  */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                 throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Returns the subset of columns specified in SlicePredicate for the rows matching the IndexClause
    @deprecated use get_range_slices instead with range.row_filter specified
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  # modification methods

  /**
   * Insert a Column at the given column_parent.column_family and optional column_parent.super_column.
   */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   * Increment or decrement a counter.
   */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   * Atomic compare and set.
   *
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   * Atomic put unless exists.
   *
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Remove data from the row specified by key at the granularity specified by column_path, and the given timestamp. Note
    that all the values in column_path besides column_path.column_family are truly optional: you can remove the entire
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   * Remove a counter at the specified location.
   * Note that counters have limited support for deletes: if you remove a counter, you must wait to issue any following update
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
      throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Mutate many columns or super columns for many row keys. See also: Mutation.

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
    Atomically mutate many columns or super columns for many row keys. See also: Mutation.

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1:InvalidRequestException ire, 2:UnavailableException ue, 3:TimedOutException te),

  /**
   Truncate will mark and entire column family as deleted.
   From the user's perspective a successful call to truncate will result complete data deletion from cfname.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1: InvalidRequestException ire, 2: UnavailableException ue, 3: TimedOutException te),

  /**
  * Select multiple slices of a key in a single RPC operation
  */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  // rather than user data.  The nodeprobe program provides usage examples.
  
  /** 
   * for each schema version present in the cluster, returns a list of nodes at that version.
   * hosts that do not respond will be under the key DatabaseDescriptor.INITIAL_VERSION. 
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
       throws (1: InvalidRequestException ire),

  /** list the defined keyspaces in this cluster */
  list<KsDef> describe_keyspaces()
    throws (1:InvalidRequestException ire),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire),

  /** get the cluster name */
  string describe_cluster_name(),

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  string describe_cluster_name(),

  /** get the thrift api version */
  string describe_version(),

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  string describe_version(),

  /** get the token ring: a map of ranges to host addresses,
      represented as a set of TokenRange instead of a map from range
      to list of endpoints, because you can't use Thrift structs as
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java


  /** same as describe_ring, but considers only nodes in the local DC */
  list<TokenRange> describe_local_ring(1:required string keyspace)
                   throws (1:InvalidRequestException ire),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                   throws (1:InvalidRequestException ire),

  /** get the mapping between token->node ip
      without taking replication into consideration
      https://issues.apache.org/jira/browse/CASSANDRA-4092 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
                    throws (1:InvalidRequestException ire),

  /** returns the list of host ids as seen by this node. */
  list<string> get_host_ids(),

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java

  
  /** returns the partitioner used by this cluster */
  string describe_partitioner(),

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  string describe_partitioner(),

  /** returns the snitch used by this cluster */
  string describe_snitch(),

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
  string describe_snitch(),

  /** describe specified keyspace */
  KsDef describe_keyspace(1:required string keyspace)
    throws (1:NotFoundException nfe, 2:InvalidRequestException ire),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:NotFoundException nfe, 2:InvalidRequestException ire),

  /** experimental API for hadoop/parallel query support.  
      may change violently and without warning. 

```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire),

  /** Enables tracing for the next query in this connection and returns the UUID for that trace session
      The next query will be traced idependently of trace probability and the returned UUID can be used to query the trace keyspace */
  binary trace_next_query(),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire), 

  /** adds a column family. returns the new schema id. */
  string system_add_column_family(1:required CfDef cf_def)
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
    
  /** drops a column family. returns the new schema id. */
  string system_drop_column_family(1:required string column_family)
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde), 
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde), 
  
  /** adds a keyspace and any column families that are part of it. returns the new schema id. */
  string system_add_keyspace(1:required KsDef ks_def)
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
  
  /** drops a keyspace and any column families that are part of it. returns the new schema id. */
  string system_drop_keyspace(1:required string keyspace)
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
  
  /** updates properties of a keyspace. returns the new schema id. */
  string system_update_keyspace(1:required KsDef ks_def)
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
        
  /** updates properties of a column family. returns the new schema id. */
  string system_update_column_family(1:required CfDef cf_def)
    throws (1:InvalidRequestException ire, 2:SchemaDisagreementException sde),
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java


  /**
   * @deprecated Throws InvalidRequestException since 2.2. Please use the CQL3 version instead.
   */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
            4:SchemaDisagreementException sde)

  /**
   * Executes a CQL3 (Cassandra Query Language) statement and returns a
   * CqlResult containing the results.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java


  /**
   * @deprecated Throws InvalidRequestException since 2.2. Please use the CQL3 version instead.
   */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
    throws (1:InvalidRequestException ire)

  /**
   * Prepare a CQL3 (Cassandra Query Language) statement by compiling and returning
   * - the type of CQL statement
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java


  /**
   * @deprecated Throws InvalidRequestException since 2.2. Please use the CQL3 version instead.
   */
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
            4:SchemaDisagreementException sde)

  /**
   * Executes a prepared CQL3 (Cassandra Query Language) statement by passing an id token, a list of variables
   * to bind, and the consistency level, and returns a CqlResult containing the results.
```

### DanglingJavadoc
Dangling Javadoc comment
in `interface/cassandra.thrift`
#### Snippet
```java
            4:SchemaDisagreementException sde)

  /**
   * @deprecated This is now a no-op. Please use the CQL3 specific methods instead.
   */
```

