# goethe 
 
# Bad smells
I found 4 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 3 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `goethe/src/main/java/com/palantir/goethe/GoetheMain.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Class name argument is required");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `goethe/src/main/java/com/palantir/goethe/GoetheMain.java`
#### Snippet
```java
        String input = new String(ByteStreams.toByteArray(System.in), StandardCharsets.UTF_8);
        try {
            System.out.print(new DirectFormatterFacade().formatSource(className, input));
        } catch (GoetheException e) {
            System.err.println(e.getMessage());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `goethe/src/main/java/com/palantir/goethe/GoetheMain.java`
#### Snippet
```java
            System.out.print(new DirectFormatterFacade().formatSource(className, input));
        } catch (GoetheException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `goethe/src/main/java/com/palantir/goethe/Goethe.java`
#### Snippet
```java
        try {
            filerSourceFile =
                    filer.createSourceFile(className(file), file.typeSpec.originatingElements.toArray(new Element[0]));
            try (Writer writer = filerSourceFile.openWriter()) {
                writer.write(formatted);
```

