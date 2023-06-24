# gradle-git-version 
 
# Bad smells
I found 10 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryLocalVariable | 3 | true |
| DataFlowIssue | 2 | false |
| TrivialIf | 2 | false |
| UnusedAssignment | 1 | false |
| NullableProblems | 1 | false |
| FieldMayBeFinal | 1 | false |
## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `processedDescription` is redundant
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
    private String description() {
        String rawDescription = nativeGitInvoker.describe(args.getPrefix());
        String processedDescription =
                rawDescription == null ? null : rawDescription.replaceFirst("^" + args.getPrefix(), "");
        return processedDescription;
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/gitversion/GitVersionPlugin.java`
#### Snippet
```java
            @Override
            @SuppressWarnings("BanSystemOut")
            public void execute(Task _task) {
                System.out.println(project.getVersion());
            }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `nativeGitInvoker` may be 'final'
in `src/main/java/com/palantir/gradle/gitversion/VersionDetailsImpl.java`
#### Snippet
```java
    private final GitVersionArgs args;

    private Git nativeGitInvoker;

    VersionDetailsImpl(File gitDir, GitVersionArgs args) {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        try {
            String result = runGitCmd("status", "--porcelain");
            if (result.isEmpty()) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/palantir/gradle/gitversion/Git.java`
#### Snippet
```java
        try {
            String userEmail = runGitCmd("config", "user.email");
            if (userEmail.isEmpty()) {
                return false;
            }
```

