# encrypted-config-value 
 
# Bad smells
I found 3 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 2 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `privatePath` is redundant
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyFileUtils.java`
#### Snippet
```java
     */
    private static Path privatePath(Path path) {
        Path privatePath = path.resolveSibling(path.getFileName() + ".private");
        return privatePath;
    }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyFileUtils.java`
#### Snippet
```java

    public static KeyWithType keyWithTypeFromPath(Path keyPath) throws IOException {
        byte[] contents = Files.readAllBytes(keyPath);
        return KeyWithType.fromString(new String(contents, StandardCharsets.UTF_8));
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyFileUtils.java`
#### Snippet
```java
    public static void keyWithTypeToFile(KeyWithType kwt, Path path) throws IOException {
        byte[] serialized = kwt.toString().getBytes(StandardCharsets.UTF_8);
        Files.write(path, serialized, StandardOpenOption.CREATE_NEW);
    }

```

