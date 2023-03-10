# gradle-git-version 
 
# Bad smells
I found 20 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 8 | false |
| UnnecessaryLocalVariable | 4 | true |
| DataFlowIssue | 2 | false |
| SystemOutErr | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NestedAssignment | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| UnusedAssignment | 1 | false |
| CodeBlock2Expr | 1 | true |
## RuleId[id=SystemOutErr]
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

## RuleId[id=ReturnNull]
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
        String gitHashFull = getGitHashFull();
        if (gitHashFull == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
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
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        } catch (IOException | InterruptedException | RuntimeException e) {
            log.debug("Native git rev-parse HEAD failed", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        } catch (IOException | InterruptedException | RuntimeException e) {
            log.debug("Native git command {} failed.\n", command, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        } catch (IOException | InterruptedException | RuntimeException e) {
            log.debug("Native git status --porcelain failed", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
            String branch = runGitCmd("branch", "--show-current");
            if (branch.isEmpty()) {
                return null;
            }
            return branch;
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        } catch (IOException | InterruptedException | RuntimeException e) {
            log.debug("Native git branch --show-current failed", e);
            return null;
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `versionDetails` is redundant
in `src/main/java/com/palantir/gradle/gitversion/GitVersionCacheService.java`
#### Snippet
```java
        GitVersionArgs gitVersionArgs = GitVersionArgs.fromGroovyClosure(args);
        String key = gitDir.toPath() + "|" + gitVersionArgs.getPrefix();
        VersionDetails versionDetails =
                versionDetailsMap.computeIfAbsent(key, _k -> createVersionDetails(gitDir, gitVersionArgs));
        return versionDetails;
```

### UnnecessaryLocalVariable
Local variable `gitVersion` is redundant
in `src/main/java/com/palantir/gradle/gitversion/GitVersionCacheService.java`
#### Snippet
```java
        GitVersionArgs gitVersionArgs = GitVersionArgs.fromGroovyClosure(args);
        String key = gitDir.toPath() + "|" + gitVersionArgs.getPrefix();
        String gitVersion = versionDetailsMap
                .computeIfAbsent(key, _k -> createVersionDetails(gitDir, gitVersionArgs))
                .getVersion();
```

### UnnecessaryLocalVariable
Local variable `nativeGitDescribe` is redundant
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
    private String expensiveComputeRawDescription() {

        String nativeGitDescribe = nativeGitInvoker.describe(args.getPrefix());

        return nativeGitDescribe;
```

### UnnecessaryLocalVariable
Local variable `processedDescription` is redundant
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
    private String description() {
        String rawDescription = expensiveComputeRawDescription();
        String processedDescription =
                rawDescription == null ? null : rawDescription.replaceFirst("^" + args.getPrefix(), "");
        return processedDescription;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
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

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `description()` might be null
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
        }

        Matcher match = Pattern.compile("(.*)-([0-9]+)-g.?[0-9a-fA-F]{3,}").matcher(description());
        return match.matches() ? match.group(1) : null;
    }
```

### DataFlowIssue
Argument `description()` might be null
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
        }

        Matcher match = Pattern.compile("(.*)-([0-9]+)-g.?[0-9a-fA-F]{3,}").matcher(description());
        Preconditions.checkState(match.matches(), "Cannot get commit distance for description: '%s'", description());
        return Integer.parseInt(match.group(2));
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `GitVersionCacheService` has no concrete subclass
in `src/main/java/com/palantir/gradle/gitversion/GitVersionCacheService.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public abstract class GitVersionCacheService implements BuildService<BuildServiceParameters.None> {

    private static final Logger log = LoggerFactory.getLogger(GitVersionCacheService.class);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java

        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
```

## RuleId[id=CodeBlock2Expr]
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

