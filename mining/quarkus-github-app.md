# quarkiverse/quarkus-github-app
# Bad smells
I found 215 bad smells with 107 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryModifier] | 106 | true |
| RuleId[ruleID=BoundedWildcard] | 25 | false |
| RuleId[ruleID=EmptyMethod] | 13 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 8 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 8 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 6 | false |
| RuleId[ruleID=ReturnNull] | 5 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 5 | false |
| RuleId[ruleID=Convert2MethodRef] | 4 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 4 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 3 | false |
| RuleId[ruleID=AbstractMethodCallInConstructor] | 3 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 3 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 3 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 2 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=SimplifyOptionalCallChains] | 2 | false |
| RuleId[ruleID=RedundantImplements] | 2 | false |
| RuleId[ruleID=SynchronizeOnThis] | 2 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 2 | false |
| RuleId[ruleID=EmptyTryBlock] | 1 | false |
| RuleId[ruleID=SuspiciousSystemArraycopy] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=AbstractClassNeverImplemented] | 1 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
    CommandOptions defaultCommandOptions() default @CommandOptions;

    public enum ParseErrorStrategy {

        NONE(false, false, false),
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/DeploymentStatus.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reordered {

        String NAME = Actions.REORDERED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Restored {

        String NAME = Actions.RESTORED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Converted {

        String NAME = Actions.CONVERTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Deployment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface RequestedAction {

        String NAME = Actions.REQUESTED_ACTION;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Rerequested {

        String NAME = Actions.REREQUESTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Submitted {

        String NAME = Actions.SUBMITTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Dismissed {

        String NAME = Actions.DISMISSED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
    }

    public enum CommandScope {

        ISSUES,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
     * will be used
     */
    public enum ReactionStrategy {

        NONE(false, false, false),
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
    ReactionStrategy reactionStrategy() default ReactionStrategy.ALL;

    public enum ExecutionErrorStrategy {

        NONE(false),
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CommitComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Milestoned {

        String NAME = Actions.MILESTONED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Opened {

        String NAME = Actions.OPENED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpinned {

        String NAME = Actions.UNPINNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Demilestoned {

        String NAME = Actions.DEMILESTONED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Assigned {

        String NAME = Actions.ASSIGNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reopened {

        String NAME = Actions.REOPENED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Pinned {

        String NAME = Actions.PINNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unassigned {

        String NAME = Actions.UNASSIGNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Closed {

        String NAME = Actions.CLOSED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Rerequested {

        String NAME = Actions.REREQUESTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Renamed {

        String NAME = Actions.RENAMED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unarchived {

        String NAME = Actions.UNARCHIVED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Privatized {

        String NAME = Actions.PRIVATIZED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Publicized {

        String NAME = Actions.PUBLICIZED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Queued {

        String NAME = Actions.QUEUED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpinned {

        String NAME = Actions.UNPINNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Pinned {

        String NAME = Actions.PINNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Answered {

        String NAME = Actions.ANSWERED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unanswered {

        String NAME = Actions.UNANSWERED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface CategoryChanged {

        String NAME = Actions.CATEGORY_CHANGED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reopened {

        String NAME = Actions.REOPENED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReadyForReview {

        String NAME = Actions.READY_FOR_REVIEW;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Assigned {

        String NAME = Actions.ASSIGNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Synchronize {

        String NAME = Actions.SYNCHRONIZE;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Closed {

        String NAME = Actions.CLOSED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReviewRequested {

        String NAME = Actions.REVIEW_REQUESTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Opened {

        String NAME = Actions.OPENED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unassigned {

        String NAME = Actions.UNASSIGNED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReviewRequestRemoved {

        String NAME = Actions.REVIEW_REQUEST_REMOVED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Removed {

        String NAME = Actions.REMOVED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Added {

        String NAME = Actions.ADDED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface NewPermissionsAccepted {

        String NAME = Actions.NEW_PERMISSIONS_ACCEPTED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Suspend {

        String NAME = Actions.SUSPEND;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unsuspend {

        String NAME = Actions.UNSUSPEND;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Prereleased {

        String NAME = Actions.PRERELEASED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Released {

        String NAME = Actions.RELEASED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Published {

        String NAME = Actions.PUBLISHED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpublished {

        String NAME = Actions.UNPUBLISHED;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Reactions` has only 'static' members, and lacks a 'private' constructor
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
import org.kohsuke.github.ReactionContent;

public final class Reactions {

    private static final Logger LOGGER = Logger.getLogger(Reactions.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GitHubAppCommandAirlineDotNames` has only 'static' members, and lacks a 'private' constructor
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineDotNames.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.IssueComment;

class GitHubAppCommandAirlineDotNames {

    static final DotName DEPENDENT = DotName.createSimple(Dependent.class.getName());
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PrivateKeyUtil` has only 'static' members, and lacks a 'private' constructor
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
 * Slightly adjusted version of code found here: https://stackoverflow.com/a/55339208 .
 */
public class PrivateKeyUtil {

    private static final String PKCS_1_PEM_HEADER = "-----BEGIN RSA PRIVATE KEY-----";
```

## RuleId[ruleID=EmptyTryBlock]
### RuleId[ruleID=EmptyTryBlock]
Empty `try` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
                }

                try (Response response = client.newCall(requestBuilder.build()).execute()) {
                }
            }
```

## RuleId[ruleID=SuspiciousSystemArraycopy]
### RuleId[ruleID=SuspiciousSystemArraycopy]
`varArgs` is not of an array type
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
                Object varArgs = Array.newInstance(parameters[i].getType().getComponentType(), varArgSize);
                if (varArgSize > 0) {
                    System.arraycopy(argumentsWithExpandedVarArgs, i, varArgs, 0, varArgSize);
                }
                unexpandedArguments[i] = varArgs;
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `runtime/src/main/java/io/quarkiverse/githubapp/ConfigFile.java`
#### Snippet
```java
         * Always retrieve the configuration file from the repository from which an event was sent.
         */
        CURRENT_REPOSITORY;
    }
}
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'configFileFromString' is still used
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockSetupContext.java`
#### Snippet
```java
     */
    @Deprecated
    default void configFileFromString(String pathInRepository, String configFile) {
        configFile(pathInRepository).fromString(configFile);
    }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'GitHubAppTestingResource' is still used
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java
 */
@Deprecated
public final class GitHubAppTestingResource implements QuarkusTestResourceLifecycleManager {

    private io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource delegate = new io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource();
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public boolean requiresGraphQLClient() {
            return method.parameterTypes().stream().map(t -> t.name()).anyMatch(n -> DYNAMIC_GRAPHQL_CLIENT.equals(n));
        }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public boolean requiresGraphQLClient() {
            return method.parameterTypes().stream().map(t -> t.name()).anyMatch(n -> DYNAMIC_GRAPHQL_CLIENT.equals(n));
        }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            for (EventAnnotation eventAnnotation : eventAnnotations.values()) {
                literals.add(new EventAnnotationLiteral(eventAnnotation.getName(),
                        eventAnnotation.getValues().stream().map(av -> av.name()).collect(Collectors.toList())));
            }
            return literals;
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        annotationsTransformer
                .produce(new AnnotationsTransformerBuildItem(new VetoUserDefinedEventListeningClassesAnnotationsTransformer(
                        allEventDefinitions.stream().map(d -> d.getAnnotation()).collect(Collectors.toSet()))));

        // Add the qualifiers as beans
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getCommandConfigs()` during object construction
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        this.cli = new Cli<>(MetadataLoader.loadGlobal(cliClass, parserBuilder.build()));
        this.cliConfig = cliConfig;
        this.commandConfigs = getCommandConfigs();
        this.commandPermissionConfigs = getCommandPermissionConfigs();
        this.commandTeamConfigs = getCommandTeamConfigs();
```

### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getCommandPermissionConfigs()` during object construction
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        this.cliConfig = cliConfig;
        this.commandConfigs = getCommandConfigs();
        this.commandPermissionConfigs = getCommandPermissionConfigs();
        this.commandTeamConfigs = getCommandTeamConfigs();
    }
```

### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getCommandTeamConfigs()` during object construction
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        this.commandConfigs = getCommandConfigs();
        this.commandPermissionConfigs = getCommandPermissionConfigs();
        this.commandTeamConfigs = getCommandTeamConfigs();
    }

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'ghObjectMocking' in a Serializable class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
    private final GitHub clientSpy;
    private final GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy;
    private final DefaultableMocking<? extends GHObject> ghObjectMocking;

    public GHObjectSpyDefaultAnswer(GitHub clientSpy,
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'clientSpy' in a Serializable class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
public final class GHObjectSpyDefaultAnswer implements Answer<Object>, Serializable {

    private final GitHub clientSpy;
    private final GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy;
    private final DefaultableMocking<? extends GHObject> ghObjectMocking;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'clientSpy' in a Serializable class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java
public final class GHEventPayloadSpyDefaultAnswer implements Answer<Object>, Serializable {

    private final GitHub clientSpy;
    private final Function<GHObject, DefaultableMocking<? extends GHObject>> defaultableMockingProvider;

```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder signatureError` can be replaced with 'String'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        if (checkedConfigProvider.webhookSecret().isPresent() && !launchMode.isDevOrTest()) {
            if (!payloadSignatureChecker.matches(bodyBytes, hubSignature)) {
                StringBuilder signatureError = new StringBuilder("Invalid signature for delivery: ").append(deliveryId)
                        .append("\n");
                signatureError.append("? Signature: ").append(hubSignature);
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
            LOG.warn("Payloads saved to: "
                    + checkedConfigProvider.debug().payloadDirectory.get().toAbsolutePath().toString());
        }
    }
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
    @Override
    public <T> Optional<T> fetchConfigFile(GHRepository repository, String ref, String path, ConfigFile.Source source,
            Class<T> type) {
        GHRepository configGHRepository = getConfigRepository(repository, source, path);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java
    private static final String ENABLED_KEY = "quarkiverse-github-app-testing.enabled";

    public static void enable(Map<String, String> configProperties) {
        configProperties.put(ENABLED_KEY, "true");
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java
    private static final String ENABLED_KEY = "quarkiverse-github-app-testing.enabled";

    public static void enable(Map<String, String> configProperties) {
        configProperties.put(ENABLED_KEY, "true");
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    <T extends GHObject> MockMap<Long, T> nonRepositoryMockMap(Class<T> type) {
        if (GHRepository.class.equals(type)) {
            throw new IllegalArgumentException("Type must not be GHRepository -- there is a bug in the testing helper.");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
    private final Function<String, GHRepository> repositoryMockProvider;

    public GitHubMockDefaultAnswer(Answer<Object> delegate, Function<String, GHRepository> repositoryMockProvider) {
        this.delegate = delegate;
        this.repositoryMockProvider = repositoryMockProvider;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GeneratedBeanBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
    private boolean empty = true;

    public IndexedGeneratedBeansBuildProducer(BuildProducer<GeneratedBeanBuildItem> delegate) {
        this.delegate = delegate;
        this.indexer = new Indexer();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends M`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private static final MockMaker mockMaker = Plugins.getMockMaker();

    public static <M> DefaultableMocking<M> create(Class<M> clazz, Object id, Consumer<MockSettings> mockSettingsContributor) {
        StubDetectingInvocationListener listener = new StubDetectingInvocationListener();
        MockSettings mockSettings = Mockito.withSettings().name(clazz.getSimpleName() + "#" + id)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MockSettings`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private static final MockMaker mockMaker = Plugins.getMockMaker();

    public static <M> DefaultableMocking<M> create(Class<M> clazz, Object id, Consumer<MockSettings> mockSettingsContributor) {
        StubDetectingInvocationListener listener = new StubDetectingInvocationListener();
        MockSettings mockSettings = Mockito.withSettings().name(clazz.getSimpleName() + "#" + id)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super BeanDefiningAnnotationBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    @BuildStep
    public void beanConfig(CombinedIndexBuildItem index,
            BuildProducer<BeanDefiningAnnotationBuildItem> beanDefiningAnnotations,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
        beanDefiningAnnotations.produce(new BeanDefiningAnnotationBuildItem(COMMAND, DEPENDENT));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AnnotationsTransformerBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    public void beanConfig(CombinedIndexBuildItem index,
            BuildProducer<BeanDefiningAnnotationBuildItem> beanDefiningAnnotations,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
        beanDefiningAnnotations.produce(new BeanDefiningAnnotationBuildItem(COMMAND, DEPENDENT));

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AdditionalEventDispatchingClassesIndexBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    @BuildStep
    public void generate(CombinedIndexBuildItem index,
            BuildProducer<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingClassesIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<GeneratedBeanBuildItem> generatedBeans) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReflectiveClassBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    public void generate(CombinedIndexBuildItem index,
            BuildProducer<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingClassesIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<GeneratedBeanBuildItem> generatedBeans) {
        validate(index.getIndex());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AdditionalIndexedClassesBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void indexAnnotations(BuildProducer<AdditionalIndexedClassesBuildItem> additionalIndexedClasses) {
        // adding the *Options annotations
        additionalIndexedClasses
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReflectiveClassBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            LaunchModeBuildItem launchMode,
            DispatchingConfiguration dispatchingConfiguration,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses) {
        String dispatcherClassName = GitHubEvent.class.getName() + "DispatcherImpl";

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends EventDefinition`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    private static DispatchingConfiguration getDispatchingConfiguration(
            IndexView index, Collection<EventDefinition> allEventDefinitions) {
        DispatchingConfiguration configuration = new DispatchingConfiguration();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super BytecodeTransformerBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    @BuildStep
    void removeCompatibilityBridgeMethodsFromGitHubApi(
            BuildProducer<BytecodeTransformerBuildItem> bytecodeTransformers,
            List<GitHubApiClassWithBridgeMethodsBuildItem> gitHubApiClassesWithBridgeMethods) {
        for (GitHubApiClassWithBridgeMethodsBuildItem gitHubApiClassWithBridgeMethods : gitHubApiClassesWithBridgeMethods) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReflectiveClassBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    void registerForReflection(CombinedIndexBuildItem combinedIndex,
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<ReflectiveHierarchyBuildItem> reflectiveHierarchies) {
        List<IndexView> indexes = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReflectiveHierarchyBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<ReflectiveHierarchyBuildItem> reflectiveHierarchies) {
        List<IndexView> indexes = new ArrayList<>();
        indexes.add(combinedIndex.getIndex());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super WebJarBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    @BuildStep
    void replayUiDeployment(LaunchModeBuildItem launchMode,
            BuildProducer<WebJarBuildItem> webJars) throws IOException {
        if (launchMode.getLaunchMode() != LaunchMode.DEVELOPMENT) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AdditionalBeanBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    void additionalBeans(CombinedIndexBuildItem index, BuildProducer<AdditionalBeanBuildItem> additionalBeans) {
        AdditionalBeanBuildItem.Builder additionalBeanBuildItemBuilder = new AdditionalBeanBuildItem.Builder().addBeanClasses(
                GitHubService.class,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RouteBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            HttpRootPathBuildItem httpRootPath,
            ShutdownContextBuildItem shutdownContext,
            BuildProducer<RouteBuildItem> routes,
            BuildProducer<NotFoundPageDisplayableEndpointBuildItem> displayableEndpoints) throws IOException {
        if (launchMode.getLaunchMode() != LaunchMode.DEVELOPMENT) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super NotFoundPageDisplayableEndpointBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            ShutdownContextBuildItem shutdownContext,
            BuildProducer<RouteBuildItem> routes,
            BuildProducer<NotFoundPageDisplayableEndpointBuildItem> displayableEndpoints) throws IOException {
        if (launchMode.getLaunchMode() != LaunchMode.DEVELOPMENT) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AdditionalBeanBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    void generateClasses(CombinedIndexBuildItem combinedIndex, LaunchModeBuildItem launchMode,
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<AdditionalBeanBuildItem> additionalBeans,
            BuildProducer<GeneratedBeanBuildItem> generatedBeans,
            BuildProducer<GeneratedClassBuildItem> generatedClasses,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AnnotationsTransformerBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            BuildProducer<GeneratedClassBuildItem> generatedClasses,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
        List<IndexView> indexes = new ArrayList<>();
        indexes.add(combinedIndex.getIndex());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReflectiveClassBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            IndexView index,
            DispatchingConfiguration dispatchingConfiguration,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses) {
        for (Entry<DotName, TreeSet<EventDispatchingMethod>> eventDispatchingMethodsEntry : dispatchingConfiguration
                .getMethods().entrySet()) {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractCommandDispatcher` has no concrete subclass
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
import io.quarkiverse.githubapp.command.airline.runtime.util.Reactions;

public abstract class AbstractCommandDispatcher<C> {

    private static final Logger LOGGER = Logger.getLogger(AbstractCommandDispatcher.class);
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'webhookProxyUrl'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> webhookProxyUrl;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'appName'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> appName;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'webhookSecret'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> webhookSecret;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'privateKey'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
    @ConfigItem
    @ConvertWith(PrivateKeyConverter.class)
    Optional<PrivateKey> privateKey;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'payloadDirectory'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
         */
        @ConfigItem
        public Optional<Path> payloadDirectory;
    }
}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'appId'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> appId;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'repository'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final String deliveryId;

    private final Optional<String> repository;

    private final String event;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'appName'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final Long installationId;

    private final Optional<String> appName;

    private final String deliveryId;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");

            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_8_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_8_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");
            return readPkcs8PrivateKey(Base64.getDecoder().decode(keyDataString));
        } else {
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            super.run(issueCommentPayload); // <4>
        }
    }
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
    SmeeIoForwarder(CheckedConfigProvider checkedConfigProvider, HttpConfiguration httpConfiguration,
            ObjectMapper objectMapper) {
        if (!checkedConfigProvider.webhookProxyUrl().isPresent()) {
            this.eventSource = null;
            return;
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

    PayloadSignatureChecker(CheckedConfigProvider checkedConfigProvider) {
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
            sharedMac = null;
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubConfigFileProvider.java`
#### Snippet
```java
     * @param source Which repository to extract the file from in the case of forked repositories.
     * @param type The type to deserialize the file to.
     * @return The configuration file wrapped in an {@link java.util.Optional}, or {@link Optional#empty()} if it is missing.
     * @throws java.io.IOException If the configuration file cannot be retrieved.
     * @throws IllegalStateException If the configuration file cannot be deserialized to the given type.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubConfigFileProvider.java`
#### Snippet
```java
     * @param source Which repository to extract the file from in the case of forked repositories.
     * @param type The type to deserialize the file to.
     * @return The configuration file wrapped in an {@link java.util.Optional}, or {@link Optional#empty()} if it is missing.
     * @throws java.io.IOException If the configuration file cannot be retrieved.
     * @throws IllegalStateException If the configuration file cannot be deserialized to the given type.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.kohsuke.github` is unnecessary and can be removed
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubConfigFileProvider.java`
#### Snippet
```java

/**
 * A provider of configuration files fetched from {@link org.kohsuke.github.GHRepository GitHub repositories}.
 * <p>
 * Inject as a CDI bean.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.kohsuke.github` is unnecessary and can be removed
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubClientProvider.java`
#### Snippet
```java

/**
 * A provider of {@link org.kohsuke.github.GitHub GitHub clients} for the GitHub app.
 * <p>
 * Inject as a CDI bean.
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `docs/modules/ROOT/examples/command/airline/CdiBean.java`
#### Snippet
```java
public class CdiBean {

    public void doSomething() {
    }
}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java

    private static class StubDetectingInvocationListener implements InvocationListener {
        private boolean lastInvocationWasMocked = false;

        @Override
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
        if (keyDataString.contains(PKCS_1_PEM_HEADER)) {
            // OpenSSL / PKCS#1 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            // OpenSSL / PKCS#1 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");

            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
        } else if (keyDataString.contains(PKCS_8_PEM_HEADER)) {
            // PKCS#8 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_8_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_8_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            // PKCS#8 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_8_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_8_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");
            return readPkcs8PrivateKey(Base64.getDecoder().decode(keyDataString));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_8_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_8_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");
            return readPkcs8PrivateKey(Base64.getDecoder().decode(keyDataString));
        } else {
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `GitHubMockContext`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;

public final class GitHubMockContextImpl implements GitHubMockContext, GitHubMockSetupContext, GitHubMockVerificationContext {

    final GitHubService service;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java

@Priority(DEFAULT_QUARKUS_CONVERTER_PRIORITY)
public class PrivateKeyConverter implements Converter<PrivateKey>, Serializable {

    public PrivateKeyConverter() {
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
                    + issueCommentPayload.getIssue().getNumber() + "#" + issueCommentPayload.getComment().getId());

            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        JsonObject repository = body.getJsonObject("repository");
        if (repository == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/MockitoUtils.java`
#### Snippet
```java
        doWithMockedClassClassLoader(mockedClass, () -> {
            action.run();
            return null;
        });
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java

        if (privateKeyValue.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                        Arrays.toString(org.objectweb.asm.Type.getArgumentTypes(descriptor)));

                return null;
            }

```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
            return createInstallationGraphQLClient(installationId);
        } catch (IOException | ExecutionException | InterruptedException e1) {
            synchronized (this) {
                try {
                    // retry in a synchronized in case the token is invalidated in another thread
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
            return createInstallationClient(installationId);
        } catch (IOException e1) {
            synchronized (this) {
                try {
                    // retry in a synchronized in case the token is invalidated in another thread
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppConfigurationException.java`
#### Snippet
```java
    GitHubAppConfigurationException(String message) {
        super(message);
        setStackTrace(new StackTraceElement[0]);
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        }
        tryBlock.invokeInterfaceMethod(runMethod.getMethod(), commandRh,
                runMethodParameters.toArray(new ResultHandle[0]));
        deleteReaction(tryBlock, issueCommentPayloadRh, ackReactionRh);
        BranchResult reactionOnNormalFlow = tryBlock.ifTrue(tryBlock.invokeVirtualMethod(
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
            Optional<String> context = PayloadHelper.getContext(payload);
            if (context.isPresent()) {
                errorMessage.append("? Context:    " + PayloadHelper.getContext(payload).get() + "\n");
            }
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            String fileName = DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "-" + event + "-"
                    + (!isBlank(action) ? action + "-" : "") + deliveryId + ".json";
            Files.write(checkedConfigProvider.debug().payloadDirectory.get().resolve(fileName), bodyBytes);
        }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    public void init(@Observes StartupEvent startupEvent) throws IOException {
        if (checkedConfigProvider.debug().payloadDirectory.isPresent()) {
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
            LOG.warn("Payloads saved to: "
                    + checkedConfigProvider.debug().payloadDirectory.get().toAbsolutePath().toString());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
            LOG.warn("Payloads saved to: "
                    + checkedConfigProvider.debug().payloadDirectory.get().toAbsolutePath().toString());
        }
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                    } else if (parameterAnnotations.stream().anyMatch(ai -> ai.name().equals(CONFIG_FILE))) {
                        AnnotationInstance configFileAnnotationInstance = parameterAnnotations.stream()
                                .filter(ai -> ai.name().equals(CONFIG_FILE)).findFirst().get();
                        String configObjectType = originalMethodParameterTypes.get(originalMethodParameterIndex).name()
                                .toString();
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
    public void handleError(GitHubEvent gitHubEvent, GHEventPayload payload, Throwable t) {
        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append("Error handling delivery " + gitHubEvent.getDeliveryId() + "\n");
        if (gitHubEvent.getRepository().isPresent()) {
            errorMessage.append("? Repository: " + gitHubEvent.getRepository().get() + "\n");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
        errorMessage.append("Error handling delivery " + gitHubEvent.getDeliveryId() + "\n");
        if (gitHubEvent.getRepository().isPresent()) {
            errorMessage.append("? Repository: " + gitHubEvent.getRepository().get() + "\n");
        }
        errorMessage.append("? Event:      " + gitHubEvent.getEventAction() + "\n");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
            errorMessage.append("? Repository: " + gitHubEvent.getRepository().get() + "\n");
        }
        errorMessage.append("? Event:      " + gitHubEvent.getEventAction() + "\n");

        if (payload != null) {
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
            Optional<String> context = PayloadHelper.getContext(payload);
            if (context.isPresent()) {
                errorMessage.append("? Context:    " + PayloadHelper.getContext(payload).get() + "\n");
            }
        }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java

        if (gitHubEvent.getAppName().isPresent()) {
            errorMessage.append("? Redeliver:  " + String.format(REDELIVERY_URL, gitHubEvent.getAppName().get()) + "\n");
        }

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
            message.append("\n\nErrors:\n");
            if (error != null) {
                message.append("\n- " + error);
            }
            if (parseResult != null) {
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
            if (parseResult != null) {
                for (ParseException parseError : parseResult.getErrors()) {
                    message.append("\n- " + parseError.getMessage());
                }
            }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

                if (!help.isBlank()) {
                    message.append("\n\nHelp:\n\n").append("```\n" + help.trim() + "\n```");
                }
            } catch (IOException e) {
```

