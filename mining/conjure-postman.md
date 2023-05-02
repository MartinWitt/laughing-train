# conjure-postman 
 
# Bad smells
I found 4 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SwitchStatementWithTooFewBranches | 1 | false |
| RegExpSimplifiable | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| FieldMayBeFinal | 1 | false |
## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/BodyParameterTypeVisitor.java`
#### Snippet
```java
            @Override
            public Optional<PostmanRequest.Body> visitPrimitive(PrimitiveType value) {
                switch (value.get()) {
                    case BINARY:
                        return Optional.of(PostmanRequest.FileBody.builder().build());
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\"]` can be simplified to '"'
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/TemplateTypeVisitor.java`
#### Snippet
```java
        String key = "{{KEY}}";
        if (keyTemplate instanceof TextNode) {
            key = keyTemplate.toString().replaceAll("[\"]", "");
        }
        return objectMapper.createObjectNode().set(key, value.getValueType().accept(this));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `conjure-postman/src/main/java/com/palantir/conjure/postman/cli/ConjurePostmanCli.java`
#### Snippet
```java
            writer.write(generator.generate(conjureDefinition));
        } catch (IOException e) {
            throw new RuntimeException(String.format("Error parsing definition: %s", e.toString()));
        }
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `config` may be 'final'
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanCollectionGenerator.java`
#### Snippet
```java
    private static final String POSTMAN_SCHEMA = "https://schema.getpostman.com/json/collection/v2.1.0/collection.json";

    private GeneratorConfiguration config;

    public PostmanCollectionGenerator(GeneratorConfiguration config) {
```

