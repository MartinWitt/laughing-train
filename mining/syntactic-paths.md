# syntactic-paths 
 
# Bad smells
I found 3 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 3 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `syntactic-paths/src/main/java/com/palantir/util/syntacticpath/Path.java`
#### Snippet
```java

        if (normal.size == 0) {
            return null;
        } else if (normal.size == 1) {
            return getRoot(); // null if path is relative
```

### ReturnNull
Return of `null`
in `syntactic-paths/src/main/java/com/palantir/util/syntacticpath/Path.java`
#### Snippet
```java
            return ROOT_PATH;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `syntactic-paths/src/main/java/com/palantir/util/syntacticpath/Path.java`
#### Snippet
```java

        if (normal.segments.isEmpty()) {
            return null;
        }

```

