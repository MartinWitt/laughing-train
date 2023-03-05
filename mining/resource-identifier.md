# resource-identifier 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 6 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java
    private static ResourceIdentifier tryOf(String rid) {
        if (rid == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java

        if (!rid.startsWith(RID_PREFIX)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java
        int serviceIndex = getServiceIndex(rid, RID_PREFIX_LENGTH);
        if (serviceIndex < 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java
        int instanceIndex = getInstanceIndex(rid, serviceIndex + 1);
        if (instanceIndex < 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java
        int typeIndex = getTypeIndex(rid, instanceIndex + 1);
        if (typeIndex < 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java
        int locatorIndex = getLocatorIndex(rid, typeIndex + 1);
        if (locatorIndex != INDEX_END) {
            return null;
        }

```

