# debugger-agent 
 
# Bad smells
I found 4 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IOStreamConstructor | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| CommentedOutCode | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      try {
        file = new File(new URI(uri));
        stream = new FileInputStream(file);
        // use ISO 8859-1 character encoding
        properties.load(stream);
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      InstrumentPoint point = addPoint((String)entry.getKey(), (String)entry.getValue());
      if (point != null) {
        classNames.add(point.myClassName.replaceAll("/", "\\."));
      }
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      // Trying to reinstrument java.lang.Thread
      // fails with dcevm, does not work with other vms :(
      //for (Class aClass : instrumentation.getAllLoadedClasses()) {
      //  String name = aClass.getName().replaceAll("\\.", "/");
      //  if (myCapturePoints.containsKey(name) || myInsertPoints.containsKey(name)) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ReentrantLock.tryLock()` is ignored
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
      if (shouldSynchronized) {
        try {
          myLock.tryLock(10, TimeUnit.MINUTES);
        }
        catch (InterruptedException e) {
```

