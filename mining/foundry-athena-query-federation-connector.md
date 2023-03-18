# foundry-athena-query-federation-connector 
 
# Bad smells
I found 7 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 3 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ReturnNull | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| BoundedWildcard | 1 | false |
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/S3Spiller.java`
#### Snippet
```java
    @Override
    public ConstraintEvaluator getConstraintEvaluator() {
        return null;
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.joda.time` is unnecessary, and can be replaced with an import
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/FilterValueConverter.java`
#### Snippet
```java
    public FilterValue visit(ArrowType.Date _type) {
        if (value instanceof Date) {
            org.joda.time.Days days = org.joda.time.Days.daysBetween(
                    BlockUtils.EPOCH, new org.joda.time.DateTime(((Date) value).getTime()));
            return FilterValue.numberFilter(days.getDays());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.joda.time` is unnecessary, and can be replaced with an import
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/FilterValueConverter.java`
#### Snippet
```java
    public FilterValue visit(ArrowType.Date _type) {
        if (value instanceof Date) {
            org.joda.time.Days days = org.joda.time.Days.daysBetween(
                    BlockUtils.EPOCH, new org.joda.time.DateTime(((Date) value).getTime()));
            return FilterValue.numberFilter(days.getDays());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.joda.time` is unnecessary, and can be replaced with an import
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/FilterValueConverter.java`
#### Snippet
```java
        if (value instanceof Date) {
            org.joda.time.Days days = org.joda.time.Days.daysBetween(
                    BlockUtils.EPOCH, new org.joda.time.DateTime(((Date) value).getTime()));
            return FilterValue.numberFilter(days.getDays());
        } else if (value instanceof LocalDate) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `FoundryAthenaObjectMapper` has no concrete subclass
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/FoundryAthenaObjectMapper.java`
#### Snippet
```java
import com.palantir.conjure.java.serialization.ObjectMappers;

abstract class FoundryAthenaObjectMapper {

    private static final ObjectMapper OBJECT_MAPPER = ObjectMappers.newClientObjectMapper();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `foundry-athena-query-federation-connector/src/main/java/com/palantir/foundry/athena/connector/FoundryAuthProvider.java`
#### Snippet
```java
    private final String secretName;

    FoundryAuthProvider(Function<String, String> secretSupplier, String secretName) {
        this.secretSupplier = secretSupplier;
        this.secretName = secretName;
```

