# quarkus-github-app 
 
# Bad smells
I found 325 bad smells with 116 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 110 | true |
| PublicFieldAccessedInSynchronizedContext | 53 | false |
| BoundedWildcard | 25 | false |
| CatchMayIgnoreException | 16 | false |
| EmptyMethod | 16 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| RedundantFieldInitialization | 9 | false |
| OptionalUsedAsFieldOrParameterType | 8 | false |
| StringConcatenationInsideStringBufferAppend | 8 | false |
| ReturnNull | 7 | false |
| AssignmentToMethodParameter | 6 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| Convert2MethodRef | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| AbstractMethodCallInConstructor | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| UnusedAssignment | 3 | false |
| OptionalContainsCollection | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| SimplifyOptionalCallChains | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| RedundantImplements | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| SynchronizeOnThis | 2 | false |
| MarkedForRemoval | 1 | false |
| SuspiciousSystemArraycopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| WhileLoopSpinsOnField | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| NestedAssignment | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| Convert2Lambda | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
    CommandOptions defaultCommandOptions() default @CommandOptions;

    public enum ParseErrorStrategy {

        NONE(false, false, false),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
    ReactionStrategy reactionStrategy() default ReactionStrategy.ALL;

    public enum ExecutionErrorStrategy {

        NONE(false),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
    }

    public enum CommandScope {

        ISSUES,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
     * will be used
     */
    public enum ReactionStrategy {

        NONE(false, false, false),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamListener.java`
#### Snippet
```java
     * @param throwable Error that occurred
     */
    public void onError(HttpEventStreamClient client, Throwable throwable);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamListener.java`
#### Snippet
```java
     * @param event Event that has been received
     */
    public void onEvent(HttpEventStreamClient client, HttpEventStreamClient.Event event);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamListener.java`
#### Snippet
```java
     * @param lastEventID ID of last event that was received
     */
    public void onReconnect(HttpEventStreamClient client, HttpResponse<Void> response, boolean hasReceivedEvents,
            long lastEventID);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamListener.java`
#### Snippet
```java
     * @param response Last response received from server (may be null)
     */
    public void onClose(HttpEventStreamClient client, HttpResponse<Void> response);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CommitComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/DeploymentStatus.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Queued {

        String NAME = Actions.QUEUED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Dismissed {

        String NAME = Actions.DISMISSED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Submitted {

        String NAME = Actions.SUBMITTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface CategoryChanged {

        String NAME = Actions.CATEGORY_CHANGED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unanswered {

        String NAME = Actions.UNANSWERED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Pinned {

        String NAME = Actions.PINNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpinned {

        String NAME = Actions.UNPINNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Answered {

        String NAME = Actions.ANSWERED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Published {

        String NAME = Actions.PUBLISHED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Prereleased {

        String NAME = Actions.PRERELEASED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpublished {

        String NAME = Actions.UNPUBLISHED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Released {

        String NAME = Actions.RELEASED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Assigned {

        String NAME = Actions.ASSIGNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Demilestoned {

        String NAME = Actions.DEMILESTONED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Milestoned {

        String NAME = Actions.MILESTONED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Pinned {

        String NAME = Actions.PINNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpinned {

        String NAME = Actions.UNPINNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Closed {

        String NAME = Actions.CLOSED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unassigned {

        String NAME = Actions.UNASSIGNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reopened {

        String NAME = Actions.REOPENED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Opened {

        String NAME = Actions.OPENED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reopened {

        String NAME = Actions.REOPENED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReviewRequestRemoved {

        String NAME = Actions.REVIEW_REQUEST_REMOVED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Closed {

        String NAME = Actions.CLOSED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Assigned {

        String NAME = Actions.ASSIGNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unassigned {

        String NAME = Actions.UNASSIGNED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReviewRequested {

        String NAME = Actions.REVIEW_REQUESTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReadyForReview {

        String NAME = Actions.READY_FOR_REVIEW;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Opened {

        String NAME = Actions.OPENED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Synchronize {

        String NAME = Actions.SYNCHRONIZE;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Rerequested {

        String NAME = Actions.REREQUESTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Deployment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface RequestedAction {

        String NAME = Actions.REQUESTED_ACTION;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Rerequested {

        String NAME = Actions.REREQUESTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Restored {

        String NAME = Actions.RESTORED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Converted {

        String NAME = Actions.CONVERTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reordered {

        String NAME = Actions.REORDERED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Publicized {

        String NAME = Actions.PUBLICIZED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unarchived {

        String NAME = Actions.UNARCHIVED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Renamed {

        String NAME = Actions.RENAMED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Privatized {

        String NAME = Actions.PRIVATIZED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Removed {

        String NAME = Actions.REMOVED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Added {

        String NAME = Actions.ADDED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Suspend {

        String NAME = Actions.SUSPEND;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unsuspend {

        String NAME = Actions.UNSUSPEND;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface NewPermissionsAccepted {

        String NAME = Actions.NEW_PERMISSIONS_ACCEPTED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'ReflectiveClassBuildItem(boolean, boolean, java.lang.String...)' is deprecated and marked for removal
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
            Map<DotName, ClassInfo> allCommands = getAllCommands(index.getIndex(), cliAnnotationInstance);
            for (ClassInfo commandClassInfo : allCommands.values()) {
                reflectiveClasses.produce(new ReflectiveClassBuildItem(true, true, commandClassInfo.toString()));
            }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PrivateKeyUtil` has only 'static' members, and lacks a 'private' constructor
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
 * Slightly adjusted version of code found here: https://stackoverflow.com/a/55339208 .
 */
public class PrivateKeyUtil {

    private static final String PKCS_1_PEM_HEADER = "-----BEGIN RSA PRIVATE KEY-----";
```

### UtilityClassWithoutPrivateConstructor
Class `GitHubAppCommandAirlineDotNames` has only 'static' members, and lacks a 'private' constructor
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineDotNames.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.IssueComment;

class GitHubAppCommandAirlineDotNames {

    static final DotName DEPENDENT = DotName.createSimple(Dependent.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `Reactions` has only 'static' members, and lacks a 'private' constructor
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
import org.kohsuke.github.ReactionContent;

public final class Reactions {

    private static final Logger LOGGER = Logger.getLogger(Reactions.class);
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
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

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `byte[]`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            }

        running = client.sendAsync(request.build(), BodyHandlers.ofByteArrayConsumer(new Consumer<Optional<byte[]>>() {
            StringBuilder sb = new StringBuilder(), data = new StringBuilder();
            String event = null;
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

            @Override
            public void accept(Optional<byte[]> t) {
                if (t.isPresent()) {
                    hasReceivedEvents.set(true);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'GitHubAppTestingResource' is still used
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java
 */
@Deprecated
public final class GitHubAppTestingResource implements QuarkusTestResourceLifecycleManager {

    private io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource delegate = new io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource();
```

### DeprecatedIsStillUsed
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
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

### Convert2MethodRef
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public boolean requiresGraphQLClient() {
            return method.parameterTypes().stream().map(t -> t.name()).anyMatch(n -> DYNAMIC_GRAPHQL_CLIENT.equals(n));
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public boolean requiresGraphQLClient() {
            return method.parameterTypes().stream().map(t -> t.name()).anyMatch(n -> DYNAMIC_GRAPHQL_CLIENT.equals(n));
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        annotationsTransformer
                .produce(new AnnotationsTransformerBuildItem(new VetoUserDefinedEventListeningClassesAnnotationsTransformer(
                        allEventDefinitions.stream().map(d -> d.getAnnotation()).collect(Collectors.toSet()))));

        // Add the qualifiers as beans
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
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

### AbstractMethodCallInConstructor
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

### AbstractMethodCallInConstructor
Call to 'abstract' method `getCommandTeamConfigs()` during object construction
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        this.commandConfigs = getCommandConfigs();
        this.commandPermissionConfigs = getCommandPermissionConfigs();
        this.commandTeamConfigs = getCommandTeamConfigs();
    }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'clientSpy' in a Serializable class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
public final class GHObjectSpyDefaultAnswer implements Answer<Object>, Serializable {

    private final GitHub clientSpy;
    private final GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy;
    private final DefaultableMocking<? extends GHObject> ghObjectMocking;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'ghObjectMocking' in a Serializable class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
    private final GitHub clientSpy;
    private final GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy;
    private final DefaultableMocking<? extends GHObject> ghObjectMocking;

    public GHObjectSpyDefaultAnswer(GitHub clientSpy,
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'clientSpy' in a Serializable class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java
public final class GHEventPayloadSpyDefaultAnswer implements Answer<Object>, Serializable {

    private final GitHub clientSpy;
    private final Function<GHObject, DefaultableMocking<? extends GHObject>> defaultableMockingProvider;

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                        try {
                            listener.onError(HttpEventStreamClient.this, u);
                        } catch (Exception e) {
                        }
                    for (EventStreamListener listener : listeners)
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                        try {
                            listener.onError(HttpEventStreamClient.this, u);
                        } catch (Exception e) {
                        }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                            try {
                                Thread.sleep(retryCooldown);
                            } catch (Exception e) {
                            }
                        start();
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                                            try {
                                                l.onError(HttpEventStreamClient.this, ex);
                                            } catch (Exception ex1) {
                                            }
                                        for (EventStreamListener l : listeners)
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                                            try {
                                                l.onError(HttpEventStreamClient.this, ex);
                                            } catch (Exception ex1) {
                                            }
                                    }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                                            try {
                                                l.onError(HttpEventStreamClient.this, ex);
                                            } catch (Exception ex1) {
                                            }
                                        for (EventStreamListener l : listeners)
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                                            try {
                                                l.onError(HttpEventStreamClient.this, ex);
                                            } catch (Exception ex1) {
                                            }
                                    }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                                        try {
                                            l.onError(HttpEventStreamClient.this, ex);
                                        } catch (Exception ex1) {
                                        }
                                }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                                        try {
                                            l.onError(HttpEventStreamClient.this, ex);
                                        } catch (Exception ex1) {
                                        }
                                }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            try {
                running.join();
            } catch (Exception e) {
            }
        lastEventID = 1;
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                    try {
                        l.onError(this, ex);
                    } catch (Exception ex1) {
                    }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                        try {
                            l.onError(this, ex);
                        } catch (Exception ex1) {
                        }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                        try {
                            l.onError(this, ex);
                        } catch (Exception ex1) {
                        }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            try {
                listener.onStartLast((running != null && running.isDone()) ? running.get() : null, request);
            } catch (InterruptedException | ExecutionException e1) {
            }

```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            try {
                listener.onClose(this, response);
            } catch (Exception e) {
            }
        for (EventStreamListener listener : listeners)
```

### CatchMayIgnoreException
Empty `catch` block
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            try {
                listener.onClose(this, response);
            } catch (Exception e) {
            }
        return this;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder signatureError` can be replaced with 'String'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        if (checkedConfigProvider.webhookSecret().isPresent() && !launchMode.isDevOrTest()) {
            if (!payloadSignatureChecker.matches(bodyBytes, hubSignature)) {
                StringBuilder signatureError = new StringBuilder("Invalid signature for delivery: ").append(deliveryId)
                        .append("\n");
                signatureError.append("› Signature: ").append(hubSignature);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        @Override
        public String toString() {
            return new StringBuilder(getClass().getSimpleName()).append("{id=").append(id).append("; event=\"").append(event)
                    .append("\"; data=\"").append(data).append("\"}").toString();
        }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        request.setHeader("Cache-Control", "no-cache");
        if (lastEventID > 0)
            request.setHeader("Last-Event-ID", lastEventID + "");
        if (timeout >= 0)
            request.timeout(Duration.ofMillis(timeout));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
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

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Event` may be 'static'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     * @since 2020-12-22
     */
    public class Event {
        private final long id;
        private final String event;
```

### InnerClassMayBeStatic
Inner class `InternalEventStreamAdapter` may be 'static'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    }

    protected abstract class InternalEventStreamAdapter extends EventStreamAdapter {
        public void onStartFirst(HttpResponse<Void> lastResponse) {
        }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `EventStreamAdapter` has no concrete subclass
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamAdapter.java`
#### Snippet
```java
 * @since 2020-12-22
 */
public abstract class EventStreamAdapter implements EventStreamListener {

    @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractCommandDispatcher` has no concrete subclass
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
import io.quarkiverse.githubapp.command.airline.runtime.util.Reactions;

public abstract class AbstractCommandDispatcher<C> {

    private static final Logger LOGGER = Logger.getLogger(AbstractCommandDispatcher.class);
```

### AbstractClassNeverImplemented
Abstract class `InternalEventStreamAdapter` has no concrete subclass
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    }

    protected abstract class InternalEventStreamAdapter extends EventStreamAdapter {
        public void onStartFirst(HttpResponse<Void> lastResponse) {
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
    @Override
    public <T> Optional<T> fetchConfigFile(GHRepository repository, String ref, String path, ConfigFile.Source source,
            Class<T> type) {
        GHRepository configGHRepository = getConfigRepository(repository, source, path);

```

### BoundedWildcard
Can generalize to `? super String`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java
    private static final String ENABLED_KEY = "quarkiverse-github-app-testing.enabled";

    public static void enable(Map<String, String> configProperties) {
        configProperties.put(ENABLED_KEY, "true");
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java
    private static final String ENABLED_KEY = "quarkiverse-github-app-testing.enabled";

    public static void enable(Map<String, String> configProperties) {
        configProperties.put(ENABLED_KEY, "true");
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    <T extends GHObject> MockMap<Long, T> nonRepositoryMockMap(Class<T> type) {
        if (GHRepository.class.equals(type)) {
            throw new IllegalArgumentException("Type must not be GHRepository -- there is a bug in the testing helper.");
```

### BoundedWildcard
Can generalize to `? super GeneratedBeanBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
    private boolean empty = true;

    public IndexedGeneratedBeansBuildProducer(BuildProducer<GeneratedBeanBuildItem> delegate) {
        this.delegate = delegate;
        this.indexer = new Indexer();
```

### BoundedWildcard
Can generalize to `? extends M`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private static final MockMaker mockMaker = Plugins.getMockMaker();

    public static <M> DefaultableMocking<M> create(Class<M> clazz, Object id, Consumer<MockSettings> mockSettingsContributor) {
        StubDetectingInvocationListener listener = new StubDetectingInvocationListener();
        MockSettings mockSettings = Mockito.withSettings().name(clazz.getSimpleName() + "#" + id)
```

### BoundedWildcard
Can generalize to `? super MockSettings`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private static final MockMaker mockMaker = Plugins.getMockMaker();

    public static <M> DefaultableMocking<M> create(Class<M> clazz, Object id, Consumer<MockSettings> mockSettingsContributor) {
        StubDetectingInvocationListener listener = new StubDetectingInvocationListener();
        MockSettings mockSettings = Mockito.withSettings().name(clazz.getSimpleName() + "#" + id)
```

### BoundedWildcard
Can generalize to `? super String`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
    private final Function<String, GHRepository> repositoryMockProvider;

    public GitHubMockDefaultAnswer(Answer<Object> delegate, Function<String, GHRepository> repositoryMockProvider) {
        this.delegate = delegate;
        this.repositoryMockProvider = repositoryMockProvider;
```

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? super AdditionalIndexedClassesBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void indexAnnotations(BuildProducer<AdditionalIndexedClassesBuildItem> additionalIndexedClasses) {
        // adding the *Options annotations
        additionalIndexedClasses
```

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? super AnnotationsTransformerBuildItem`
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    public void beanConfig(CombinedIndexBuildItem index,
            BuildProducer<BeanDefiningAnnotationBuildItem> beanDefiningAnnotations,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
        beanDefiningAnnotations.produce(new BeanDefiningAnnotationBuildItem(COMMAND, DEPENDENT));

```

### BoundedWildcard
Can generalize to `? super ReflectiveClassBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            LaunchModeBuildItem launchMode,
            DispatchingConfiguration dispatchingConfiguration,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses) {
        String dispatcherClassName = GitHubEvent.class.getName() + "DispatcherImpl";

```

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? extends EventDefinition`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    private static DispatchingConfiguration getDispatchingConfiguration(
            IndexView index, Collection<EventDefinition> allEventDefinitions) {
        DispatchingConfiguration configuration = new DispatchingConfiguration();

```

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? super AdditionalBeanBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    void additionalBeans(CombinedIndexBuildItem index, BuildProducer<AdditionalBeanBuildItem> additionalBeans) {
        AdditionalBeanBuildItem.Builder additionalBeanBuildItemBuilder = new AdditionalBeanBuildItem.Builder().addBeanClasses(
                GitHubService.class,
```

### BoundedWildcard
Can generalize to `? super BytecodeTransformerBuildItem`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    void removeCompatibilityBridgeMethodsFromGitHubApi(
            CombinedIndexBuildItem combinedIndex,
            BuildProducer<BytecodeTransformerBuildItem> bytecodeTransformers) {
        Map<String, Set<String>> bridgeMethodsByClassName = new HashMap<>();

```

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
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

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            return;
        for (String key : keys)
            this.headers.remove(key.trim().toLowerCase());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized String getHeader(String key) {
        return key != null ? this.headers.get(key.trim().toLowerCase()) : null;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (EventStreamListener l : listener)
            if (l != null)
                this.listeners.remove(l);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (EventStreamListener l : listener)
            if (l != null)
                this.listeners.add(l);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `listeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized void removeAllListeners() {
        listeners.clear();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        if (headers == null)
            return;
        this.headers.clear();
        addHeaders(headers);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized Map<String, String> getHeaders() {
        return new TreeMap<>(headers);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            throw new NullPointerException("Key cannot be null or blank");
        if (value != null && !value.isBlank())
            this.headers.put(key.trim().toLowerCase(), value);
        else
            this.headers.remove(key.trim().toLowerCase());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            this.headers.put(key.trim().toLowerCase(), value);
        else
            this.headers.remove(key.trim().toLowerCase());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        if (key == null)
            return null;
        return this.headers.remove(key.trim().toLowerCase());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalListeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized HttpEventStreamClient start() {
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartFirst((running != null && running.isDone()) ? running.get() : null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartFirst((running != null && running.isDone()) ? running.get() : null);
            } catch (InterruptedException | ExecutionException ex) {
                for (InternalEventStreamAdapter l : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartFirst((running != null && running.isDone()) ? running.get() : null);
            } catch (InterruptedException | ExecutionException ex) {
                for (InternalEventStreamAdapter l : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartFirst((running != null && running.isDone()) ? running.get() : null);
            } catch (InterruptedException | ExecutionException ex) {
                for (InternalEventStreamAdapter l : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalListeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                listener.onStartFirst((running != null && running.isDone()) ? running.get() : null);
            } catch (InterruptedException | ExecutionException ex) {
                for (InternalEventStreamAdapter l : internalListeners)
                    try {
                        l.onError(this, ex);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                    }
            }
        if (running != null) {
            final long leid = lastEventID;
            if (resetEventIDonReconnect)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastEventID` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            }
        if (running != null) {
            final long leid = lastEventID;
            if (resetEventIDonReconnect)
                lastEventID = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resetEventIDonReconnect` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        if (running != null) {
            final long leid = lastEventID;
            if (resetEventIDonReconnect)
                lastEventID = 0;
            for (InternalEventStreamAdapter listener : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastEventID` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            final long leid = lastEventID;
            if (resetEventIDonReconnect)
                lastEventID = 0;
            for (InternalEventStreamAdapter listener : internalListeners)
                try {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalListeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            if (resetEventIDonReconnect)
                lastEventID = 0;
            for (InternalEventStreamAdapter listener : internalListeners)
                try {
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            for (InternalEventStreamAdapter listener : internalListeners)
                try {
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
                } catch (Exception ex) {
                    for (EventStreamListener l : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            for (InternalEventStreamAdapter listener : internalListeners)
                try {
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
                } catch (Exception ex) {
                    for (EventStreamListener l : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalListeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
                } catch (Exception ex) {
                    for (EventStreamListener l : internalListeners)
                        try {
                            l.onError(this, ex);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `listeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                        }
                }
            for (EventStreamListener listener : listeners)
                try {
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            for (EventStreamListener listener : listeners)
                try {
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
                } catch (Exception ex) {
                    for (EventStreamListener l : listeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            for (EventStreamListener listener : listeners)
                try {
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
                } catch (Exception ex) {
                    for (EventStreamListener l : listeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `listeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                    listener.onReconnect(this, running.isDone() ? running.get() : null, hasReceivedEvents.get(), leid);
                } catch (Exception ex) {
                    for (EventStreamListener l : listeners)
                        try {
                            l.onError(this, ex);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `client` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        hasReceivedEvents.set(false);

        if (client == null)
            client = HttpClient.newHttpClient();
        HttpRequest.Builder request = HttpRequest.newBuilder(uri);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `client` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

        if (client == null)
            client = HttpClient.newHttpClient();
        HttpRequest.Builder request = HttpRequest.newBuilder(uri);
        switch (method) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uri` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        if (client == null)
            client = HttpClient.newHttpClient();
        HttpRequest.Builder request = HttpRequest.newBuilder(uri);
        switch (method) {
            case GET:
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `method` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            client = HttpClient.newHttpClient();
        HttpRequest.Builder request = HttpRequest.newBuilder(uri);
        switch (method) {
            case GET:
                request.GET();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `requestBody` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                break;
            case POST:
                request.POST(requestBody);
                break;
            case PUT:
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `requestBody` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                break;
            case PUT:
                request.PUT(requestBody);
                break;
            case DELETE:
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `version` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                break;
        }
        if (version != null)
            request.version(version);
        for (Entry<String, String> entry : headers.entrySet())
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `version` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        }
        if (version != null)
            request.version(version);
        for (Entry<String, String> entry : headers.entrySet())
            request.setHeader(entry.getKey(), entry.getValue());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        if (version != null)
            request.version(version);
        for (Entry<String, String> entry : headers.entrySet())
            request.setHeader(entry.getKey(), entry.getValue());
        request.setHeader("Accept", "text/event-stream");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastEventID` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        request.setHeader("Accept", "text/event-stream");
        request.setHeader("Cache-Control", "no-cache");
        if (lastEventID > 0)
            request.setHeader("Last-Event-ID", lastEventID + "");
        if (timeout >= 0)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastEventID` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        request.setHeader("Cache-Control", "no-cache");
        if (lastEventID > 0)
            request.setHeader("Last-Event-ID", lastEventID + "");
        if (timeout >= 0)
            request.timeout(Duration.ofMillis(timeout));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `timeout` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        if (lastEventID > 0)
            request.setHeader("Last-Event-ID", lastEventID + "");
        if (timeout >= 0)
            request.timeout(Duration.ofMillis(timeout));

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `timeout` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            request.setHeader("Last-Event-ID", lastEventID + "");
        if (timeout >= 0)
            request.timeout(Duration.ofMillis(timeout));

        for (InternalEventStreamAdapter listener : internalListeners)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalListeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            request.timeout(Duration.ofMillis(timeout));

        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartLast((running != null && running.isDone()) ? running.get() : null, request);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartLast((running != null && running.isDone()) ? running.get() : null, request);
            } catch (InterruptedException | ExecutionException e1) {
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartLast((running != null && running.isDone()) ? running.get() : null, request);
            } catch (InterruptedException | ExecutionException e1) {
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onStartLast((running != null && running.isDone()) ? running.get() : null, request);
            } catch (InterruptedException | ExecutionException e1) {
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            }

        running = client.sendAsync(request.build(), BodyHandlers.ofByteArrayConsumer(new Consumer<Optional<byte[]>>() {
            StringBuilder sb = new StringBuilder(), data = new StringBuilder();
            String event = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `client` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            }

        running = client.sendAsync(request.build(), BodyHandlers.ofByteArrayConsumer(new Consumer<Optional<byte[]>>() {
            StringBuilder sb = new StringBuilder(), data = new StringBuilder();
            String event = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            }
        }));
        running.handleAsync(new BiFunction<HttpResponse<Void>, Throwable, Void>() {

            @Override
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized void clearHeaders() {
        this.headers.clear();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.headers` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            return;
        for (Entry<String, String> entry : headers.entrySet())
            this.headers.put(entry.getKey().trim().toLowerCase(), entry.getValue());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized HttpEventStreamClient stop() {
        CompletableFuture<HttpResponse<Void>> run = running;
        running = null;
        HttpResponse<Void> response = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    public synchronized HttpEventStreamClient stop() {
        CompletableFuture<HttpResponse<Void>> run = running;
        running = null;
        HttpResponse<Void> response = null;
        if (run != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalListeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                    run.cancel(true);
        }
        for (InternalEventStreamAdapter listener : internalListeners)
            try {
                listener.onClose(this, response);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `listeners` accessed in synchronized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            } catch (Exception e) {
            }
        for (EventStreamListener listener : listeners)
            try {
                listener.onClose(this, response);
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'appId'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> appId;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'webhookSecret'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> webhookSecret;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'appName'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> appName;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'privateKey'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
    @ConfigItem
    @ConvertWith(PrivateKeyConverter.class)
    Optional<PrivateKey> privateKey;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'webhookProxyUrl'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> webhookProxyUrl;

    /**
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'repository'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final String deliveryId;

    private final Optional<String> repository;

    private final String event;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'appName'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final Long installationId;

    private final Optional<String> appName;

    private final String deliveryId;
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public HttpEventStreamClient join() {
        while (running != null)
            try {
                running.join();
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
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

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
    SmeeIoForwarder(CheckedConfigProvider checkedConfigProvider, HttpConfiguration httpConfiguration,
            ObjectMapper objectMapper) {
        if (!checkedConfigProvider.webhookProxyUrl().isPresent()) {
            this.eventStreamClient = null;
            return;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

    PayloadSignatureChecker(CheckedConfigProvider checkedConfigProvider) {
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
            sharedMac = null;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");

            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
```

### DynamicRegexReplaceableByCompiledPattern
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
Qualifier `org.kohsuke.github` is unnecessary and can be removed
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubConfigFileProvider.java`
#### Snippet
```java

/**
 * A provider of configuration files fetched from {@link org.kohsuke.github.GHRepository GitHub repositories}.
 * <p>
 * Inject as a CDI bean.
```

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
Qualifier `org.kohsuke.github` is unnecessary and can be removed
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubClientProvider.java`
#### Snippet
```java

/**
 * A provider of {@link org.kohsuke.github.GitHub GitHub clients} for the GitHub app.
 * <p>
 * Inject as a CDI bean.
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
                    sb.append(new String(t.get(), StandardCharsets.UTF_8));
                    int index;
                    while ((index = sb.indexOf("\n\n")) >= 0) {
                        String[] lines = sb.substring(0, index).split("\n");
                        sb.delete(0, index + 2); // delete first block including "\n\n"
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamAdapter.java`
#### Snippet
```java
    @Override
    public void onError(HttpEventStreamClient client, Throwable throwable) {
        throwable.printStackTrace();
    }

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected final AtomicInteger reconnectWithoutEvents = new AtomicInteger(0); // internal use

    protected HttpClient client = null;
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `timeout` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
    protected long timeout, retryCooldown;
    protected int maxReconnectsWithoutEvents;
    protected final AtomicBoolean hasReceivedEvents = new AtomicBoolean(false); // internal use
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listeners` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
    protected HashSet<InternalEventStreamAdapter> internalListeners = new HashSet<>();
    protected CompletableFuture<HttpResponse<Void>> running = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `method` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

    protected URI uri;
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `uri` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    }

    protected URI uri;
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `requestBody` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected URI uri;
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastEventID` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

    protected HttpClient client = null;
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `version` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
    protected long timeout, retryCooldown;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `internalListeners` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected boolean resetEventIDonReconnect;
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
    protected HashSet<InternalEventStreamAdapter> internalListeners = new HashSet<>();
    protected CompletableFuture<HttpResponse<Void>> running = null;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `resetEventIDonReconnect` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HttpClient client = null;
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
    protected HashSet<InternalEventStreamAdapter> internalListeners = new HashSet<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `running` is accessed in both synchronized and unsynchronized contexts
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
    protected HashSet<InternalEventStreamAdapter> internalListeners = new HashSet<>();
    protected CompletableFuture<HttpResponse<Void>> running = null;

    /**
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new BiFunction, Throwable, Void\>() can be replaced with lambda
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
            }
        }));
        running.handleAsync(new BiFunction<HttpResponse<Void>, Throwable, Void>() {

            @Override
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `docs/modules/ROOT/examples/command/airline/CdiBean.java`
#### Snippet
```java
public class CdiBean {

    public void doSomething() {
    }
}
```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
    }

```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### EmptyMethod
All implementations of this method are empty
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### EmptyMethod
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### EmptyMethod
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### EmptyMethod
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### EmptyMethod
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### EmptyMethod
All implementations of this method are empty
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### EmptyMethod
All implementations of this method are empty
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/EventStreamListener.java`
#### Snippet
```java
     * @param response Last response received from server (may be null)
     */
    public void onClose(HttpEventStreamClient client, HttpResponse<Void> response);
}

```

### EmptyMethod
The method is empty
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

    protected abstract class InternalEventStreamAdapter extends EventStreamAdapter {
        public void onStartFirst(HttpResponse<Void> lastResponse) {
        }

```

### EmptyMethod
The method is empty
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        }

        public void onStartLast(HttpResponse<Void> lastResponse, HttpRequest.Builder builder) {
        }
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java

    private static class StubDetectingInvocationListener implements InvocationListener {
        private boolean lastInvocationWasMocked = false;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected final AtomicInteger reconnectWithoutEvents = new AtomicInteger(0); // internal use

    protected HttpClient client = null;
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected URI uri;
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

    protected HttpClient client = null;
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
    protected long timeout, retryCooldown;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
        running = client.sendAsync(request.build(), BodyHandlers.ofByteArrayConsumer(new Consumer<Optional<byte[]>>() {
            StringBuilder sb = new StringBuilder(), data = new StringBuilder();
            String event = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HashSet<EventStreamListener> listeners = new HashSet<>();
    protected HashSet<InternalEventStreamAdapter> internalListeners = new HashSet<>();
    protected CompletableFuture<HttpResponse<Void>> running = null;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            // OpenSSL / PKCS#1 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `keyDataString`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replaceAll("\\s+", "");

            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
```

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java

@Priority(DEFAULT_QUARKUS_CONVERTER_PRIORITY)
public class PrivateKeyConverter implements Converter<PrivateKey>, Serializable {

    public PrivateKeyConverter() {
```

### RedundantImplements
Redundant interface declaration `GitHubMockContext`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;

public final class GitHubMockContextImpl implements GitHubMockContext, GitHubMockSetupContext, GitHubMockVerificationContext {

    final GitHubService service;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java

        if (privateKeyValue.isEmpty()) {
            return null;
        }

```

### ReturnNull
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

### ReturnNull
Return of `null`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        JsonObject repository = body.getJsonObject("repository");
        if (repository == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
                    + issueCommentPayload.getIssue().getNumber() + "#" + issueCommentPayload.getComment().getId());

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                }

                return null;
            }

```

### ReturnNull
Return of `null`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     */
    public synchronized String getHeader(String key) {
        return key != null ? this.headers.get(key.trim().toLowerCase()) : null;
    }

```

### ReturnNull
Return of `null`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    public synchronized String removeHeader(String key) {
        if (key == null)
            return null;
        return this.headers.remove(key.trim().toLowerCase());
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
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

### ZeroLengthArrayInitialization
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
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

### SynchronizeOnThis
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

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `client` initializer `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected final AtomicInteger reconnectWithoutEvents = new AtomicInteger(0); // internal use

    protected HttpClient client = null;
    protected long lastEventID = 0;
    protected boolean resetEventIDonReconnect;
```

### UnusedAssignment
Variable `requestBody` initializer `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected URI uri;
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
```

### UnusedAssignment
Variable `version` initializer `null` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    protected HttpRequestMethod method = HttpRequestMethod.GET;
    protected BodyPublisher requestBody = null;
    protected HttpClient.Version version = null;
    protected TreeMap<String, String> headers = new TreeMap<>();
    protected long timeout, retryCooldown;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            String fileName = DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "-" + event + "-"
                    + (!isBlank(action) ? action + "-" : "") + deliveryId + ".json";
            Files.write(checkedConfigProvider.debug().payloadDirectory.get().resolve(fileName), bodyBytes);
        }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
            Optional<String> context = PayloadHelper.getContext(payload);
            if (context.isPresent()) {
                errorMessage.append("› Context:    " + PayloadHelper.getContext(payload).get() + "\n");
            }
        }
```

### OptionalGetWithoutIsPresent
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
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

### StringConcatenationInsideStringBufferAppend
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

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

                if (!help.isBlank()) {
                    message.append("\n\nHelp:\n\n").append("```\n" + help.trim() + "\n```");
                }
            } catch (IOException e) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
    public void handleError(GitHubEvent gitHubEvent, GHEventPayload payload, Throwable t) {
        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append("Error handling delivery " + gitHubEvent.getDeliveryId() + "\n");
        if (gitHubEvent.getRepository().isPresent()) {
            errorMessage.append("› Repository: " + gitHubEvent.getRepository().get() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
        errorMessage.append("Error handling delivery " + gitHubEvent.getDeliveryId() + "\n");
        if (gitHubEvent.getRepository().isPresent()) {
            errorMessage.append("› Repository: " + gitHubEvent.getRepository().get() + "\n");
        }
        errorMessage.append("› Event:      " + gitHubEvent.getEventAction() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
            errorMessage.append("› Repository: " + gitHubEvent.getRepository().get() + "\n");
        }
        errorMessage.append("› Event:      " + gitHubEvent.getEventAction() + "\n");

        if (payload != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
            Optional<String> context = PayloadHelper.getContext(payload);
            if (context.isPresent()) {
                errorMessage.append("› Context:    " + PayloadHelper.getContext(payload).get() + "\n");
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java

        if (gitHubEvent.getAppName().isPresent()) {
            errorMessage.append("› Redeliver:  " + String.format(REDELIVERY_URL, gitHubEvent.getAppName().get()) + "\n");
        }

```
