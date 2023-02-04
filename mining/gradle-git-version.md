# gradle-git-version 
 
# Bad smells
I found 18 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 9 | false |
| ConstantValue | 2 | false |
| RedundantFieldInitialization | 1 | false |
| SystemOutErr | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NestedAssignment | 1 | false |
| BoundedWildcard | 1 | false |
| UnusedAssignment | 1 | false |
| CodeBlock2Expr | 1 | true |
## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
    private final Git git;
    private final GitVersionArgs args;
    private volatile String maybeCachedDescription = null;

    VersionDetailsImpl(Git git, GitVersionArgs args) {
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/palantir/gradle/gitversion/GitVersionPlugin.java`
#### Snippet
```java
            @SuppressWarnings("BanSystemOut")
            public void execute(Task _task) {
                System.out.println(project.getVersion());
            }
        });
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/RefWithTagNameComparator.java`
#### Snippet
```java
            return identity.getWhen().toInstant();
        } catch (IOException | RuntimeException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
        ObjectId objectId = git.getRepository().findRef(Constants.HEAD).getObjectId();
        if (objectId == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
        if (isRepoEmpty()) {
            log.debug("Repository is empty");
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
        String gitHashFull = getGitHashFull();
        if (gitHashFull == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java

        Matcher match = Pattern.compile("(.*)-([0-9]+)-g.?[0-9a-fA-F]{3,}").matcher(description());
        return match.matches() ? match.group(1) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
        Ref ref = git.getRepository().findRef(git.getRepository().getBranch());
        if (ref == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/NativeGitDescribe.java`
#### Snippet
```java
    public String describe(String prefix) {
        if (!gitCommandExists()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/NativeGitDescribe.java`
#### Snippet
```java
        } catch (IOException | InterruptedException | RuntimeException e) {
            log.debug("Native git describe failed", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/JGitDescribe.java`
#### Snippet
```java
        } catch (IOException | RuntimeException e) {
            log.debug("JGit describe failed", e);
            return null;
        }
    }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/gitversion/GitVersionArgs.java`
#### Snippet
```java

        Preconditions.checkState(
                prefix.matches(PREFIX_REGEX),
                "Specified prefix `%s` does not match the allowed format regex `%s`.",
                prefix,
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/palantir/gradle/gitversion/NativeGitDescribe.java`
#### Snippet
```java
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/palantir/gradle/gitversion/JGitDescribe.java`
#### Snippet
```java

    private static void updateCommitHashMap(
            Map<String, RefWithTagName> map,
            RefWithTagNameComparator comparator,
            ObjectId objectId,
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/com/palantir/gradle/gitversion/NativeGitDescribe.java`
#### Snippet
```java

        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/gitversion/TimingVersionDetails.java`
#### Snippet
```java
        return (VersionDetails) Proxy.newProxyInstance(
                VersionDetails.class.getClassLoader(), new Class[] {VersionDetails.class}, (_proxy, method, args) -> {
                    return timer.record(method.getName(), () -> {
                        try {
                            return method.invoke(versionDetails, args);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `!isTag2Annotated` is always `true` when reached
in `src/main/java/com/palantir/gradle/gitversion/RefWithTagNameComparator.java`
#### Snippet
```java

        // Both tags are unannotated, compare names
        if (!isTag1Annotated && !isTag2Annotated) {
            return tag1.getRef().getName().compareTo(tag2.getRef().getName());
        }
```

### ConstantValue
Value `isTag2Annotated` is always 'false'
in `src/main/java/com/palantir/gradle/gitversion/RefWithTagNameComparator.java`
#### Snippet
```java

        // Both tags are unannotated, compare names
        if (!isTag1Annotated && !isTag2Annotated) {
            return tag1.getRef().getName().compareTo(tag2.getRef().getName());
        }
```

