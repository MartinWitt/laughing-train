# conjure-postman 
 
# Bad smells
I found 16 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DynamicRegexReplaceableByCompiledPattern | 7 | false |
| AbstractClassNeverImplemented | 2 | false |
| EmptyMethod | 1 | false |
| RegExpSimplifiable | 1 | false |
| ReturnNull | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| OptionalContainsCollection | 1 | false |
## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/api/PostmanItem.java`
#### Snippet
```java
    @Value.Parameter
    @JsonProperty
    String name();

    @JsonProperty
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/TemplateTypeVisitor.java`
#### Snippet
```java
            public JsonNode visitUnion(UnionDefinition value) {
                if (value.getUnion().isEmpty()) {
                    return null;
                } else {
                    if (seenTypeStack.contains(value.getTypeName())) {
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanCollectionGenerator.java`
#### Snippet
```java
        String productDescription = String.format("# %s %s", config.productName(), config.productVersion());
        if (config.productDescription().isPresent()) {
            productDescription = productDescription.concat(
                    String.format("\n\n%s", config.productDescription().get()));
        }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`docs.size() > 0` can be replaced with '!docs.isEmpty()'
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanRequestGenerator.java`
#### Snippet
```java
        });

        return docs.size() > 0 ? Optional.of(String.join("\n\n", docs)) : Optional.empty();
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanCollectionGenerator.java`
#### Snippet
```java

        String formattedApiBaseVariable = PostmanUrl.formatApiBase(config.productName());
        String formattedApiBaseName = formattedApiBaseVariable.replaceAll("[{}]", "");
        config.apiPath()
                .ifPresent(apiPath -> collection.addVariable(PostmanVariable.builder()
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/writer/PostmanCollectionFileWriter.java`
#### Snippet
```java
        return Paths.get(String.format(
                "%s.postman_collection.json",
                collection.info().name().replaceAll(" ", "-").toLowerCase()));
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/TemplateTypeVisitor.java`
#### Snippet
```java
        String key = "{{KEY}}";
        if (keyTemplate instanceof TextNode) {
            key = keyTemplate.toString().replaceAll("[\"]", "");
        }
        return objectMapper.createObjectNode().set(key, value.getValueType().accept(this));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/TemplateTypeVisitor.java`
#### Snippet
```java
                    return new TextNode(String.format(
                            "{{ %s(%s) }}",
                            value.getTypeName().getName(), wrapped.toString().replaceAll("[\"{}]", "")));
                }
                return wrapped;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/TemplateTypeVisitor.java`
#### Snippet
```java
        if (wrapped instanceof TextNode) {
            return new TextNode(
                    String.format("{{ Optional<%s> }}", wrapped.toString().replaceAll("[\"{}]", "")));
        }
        return wrapped;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanRequestGenerator.java`
#### Snippet
```java
                .resolve(endpointDefinition.getHttpPath().get())
                .toString();
        return path.replaceAll("\\{", ":").replaceAll("}", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanRequestGenerator.java`
#### Snippet
```java
                .resolve(endpointDefinition.getHttpPath().get())
                .toString();
        return path.replaceAll("\\{", ":").replaceAll("}", "");
    }

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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CliConfiguration` has no concrete subclass
in `conjure-postman/src/main/java/com/palantir/conjure/postman/cli/CliConfiguration.java`
#### Snippet
```java

@Value.Immutable
public abstract class CliConfiguration {
    public static final String PRODUCT_NAME = "productName";
    public static final String PRODUCT_DESCRIPTION = "productDescription";
```

### AbstractClassNeverImplemented
Abstract class `UuidProvider` has no concrete subclass
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/UuidProvider.java`
#### Snippet
```java
import java.util.UUID;

public abstract class UuidProvider {

    /*
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`>
in `conjure-postman-core/src/main/java/com/palantir/conjure/postman/api/PostmanAuth.java`
#### Snippet
```java

    @JsonProperty
    default Optional<List<Map<String, String>>> bearer() {
        return Optional.of(ImmutableList.of(ImmutableMap.<String, String>builder()
                .put("key", "token")
```

