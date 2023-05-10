# foundry-athena-query-federation-connector 
 
# Bad smells
I found 5 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| AutoCloseableResource | 1 | false |
| JavadocReference | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'maxNumStreamingRetries'
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/FoundryAthenaClients.java`
#### Snippet
```java
    private final Supplier<FoundryAthenaRecordServiceBlocking> recordService;

    FoundryAthenaClients(URI baseUrl, OptionalInt maxNumStreamingRetries) {
        ReloadingFactory dialogueClients = DialogueClients.create(Refreshable.only(ServicesConfigBlock.builder()
                        .from(ServicesConfigBlockDefaults.INSTANCE)
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Range' used without 'try'-with-resources statement
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/ConstraintConverter.java`
#### Snippet
```java
            return isNull;
        } else if (valueSet.isSingleValue()) {
            Range range = valueSet.getOrderedRanges().iterator().next();
            return Filter.value(ValueFilter.of(
                    columnName, FilterType.EQUAL_TO, convertValue(range.getType(), range.getSingleValue())));
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Filter`
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/ConstraintConverter.java`
#### Snippet
```java

/**
 * Utility for converting Athena constraints (as defined by a {@link ValueSet} to a {@link Filter} that can be
 * evaluated server-side.
 */
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/PeekableArrowStreamReader.java`
#### Snippet
```java
        // check that there are still bytes in the stream
        in.mark(BUFFER_SIZE);
        int bytesRead = in.readNBytes(BUFFER_SIZE).length;
        in.reset();
        return bytesRead > 0;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/PeekableArrowStreamReader.java`
#### Snippet
```java
        in.mark(BUFFER_SIZE);
        int bytesRead = in.readNBytes(BUFFER_SIZE).length;
        in.reset();
        return bytesRead > 0;
    }
```

