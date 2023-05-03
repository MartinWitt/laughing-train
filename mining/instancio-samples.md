# instancio-samples 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ApplicantAvro`
in `instancio-models-sample/src/main/java/org/example/ApplicantToAvroMapper.java`
#### Snippet
```java

    /**
     * Maps an {@link Applicant} to {@link ApplicantAvro}.
     * <p>
     * Rejects applicants who are not 18-25 years old or with grades lower than B.
```

