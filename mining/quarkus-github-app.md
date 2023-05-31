# quarkus-github-app 
 
# Bad smells
I found 202 bad smells with 113 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 110 | true |
| CatchMayIgnoreException | 16 | false |
| CdiInjectionPointsInspection | 9 | false |
| OptionalUsedAsFieldOrParameterType | 8 | false |
| StringConcatenationInsideStringBufferAppend | 8 | false |
| Deprecation | 6 | false |
| JavadocReference | 5 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| RedundantCast | 4 | false |
| FieldMayBeFinal | 4 | false |
| JavadocLinkAsPlainText | 3 | false |
| JavadocDeclaration | 3 | false |
| UnusedAssignment | 3 | false |
| DeprecatedIsStillUsed | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| SimplifyOptionalCallChains | 2 | false |
| CdiManagedBeanInconsistencyInspection | 1 | false |
| SuspiciousSystemArraycopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SortedCollectionWithNonComparableKeys | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| SuspiciousToArrayCall | 1 | false |
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
    public @interface Edited {

        String NAME = Actions.EDITED;
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
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
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
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
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
    public @interface Deleted {

        String NAME = Actions.DELETED;
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
    public @interface Locked {

        String NAME = Actions.LOCKED;
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
    public @interface Reopened {

        String NAME = Actions.REOPENED;
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
    public @interface Edited {

        String NAME = Actions.EDITED;
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
    public @interface Answered {

        String NAME = Actions.ANSWERED;
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
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
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
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
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
    public @interface Edited {

        String NAME = Actions.EDITED;
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
    ReactionStrategy reactionStrategy() default ReactionStrategy.ALL;

    public enum ExecutionErrorStrategy {

        NONE(false),
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
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
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
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
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
    public @interface Created {

        String NAME = Actions.CREATED;
```

## RuleId[id=CdiManagedBeanInconsistencyInspection]
### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

@Singleton
public class PayloadSignatureChecker {

    private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `DynamicGraphQLClient`
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubClientProvider.java`
#### Snippet
```java
 * <strong>NOTE:</strong> You generally will not need this bean when processing events,
 * as clients can be automatically injected into event listener methods,
 * simply by adding a parameter of type {@link GitHub} or {@link DynamicGraphQLClient} to the listener method.
 * This provider is mostly useful for non-event use cases (e.g. cron jobs).
 */
```

### JavadocReference
Cannot resolve symbol `DynamicGraphQLClient`
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubClientProvider.java`
#### Snippet
```java

    /**
     * Gets the {@link DynamicGraphQLClient GraphQL GitHub client} for a given application installation.
     * <p>
     * The client will remain functional a few minutes at best,
```

### JavadocReference
Cannot resolve symbol `DynamicGraphQLClient`
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubClientProvider.java`
#### Snippet
```java
     * <strong>NOTE:</strong> You generally will not need this method when processing events,
     * as this client can be automatically injected into event listener methods,
     * simply by adding a parameter of type {@link DynamicGraphQLClient} to the listener method.
     * This method can still be useful for non-event use cases (e.g. cron jobs),
     * to retrieve installation clients after having {@link GHApp#listInstallations() list application installations}
```

### JavadocReference
Cannot resolve symbol `onClose()`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
    /**
     * Stops without reconnecting.
     * Executes {@link EventStreamListener#onClose()} on listeners
     *
     * @return This client instance
```

### JavadocReference
Cannot resolve symbol `onReconnect()`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     * If client looses connection then automatically reconnects.
     * Multiple calls will not start multiple listening
     * but calls {@link EventStreamListener#onReconnect()} on listeners
     *
     * @return This client instance
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

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    private final Map<String, EventDispatchingConfiguration> eventConfigurations = new TreeMap<>();

    private final Map<DotName, TreeSet<EventDispatchingMethod>> methods = new TreeMap<>();

    public Map<String, EventDispatchingConfiguration> getEventConfigurations() {
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

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `body` in enum 'HttpRequestMethod'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpRequestMethod.java`
#### Snippet
```java
    DELETE(false);

    private boolean body;

    HttpRequestMethod(boolean body) {
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        }

        allEventDefinitions.addAll(mainEventDefinitions);

        for (EventDefinition mainEventDefinition : mainEventDefinitions) {
```

## RuleId[id=Deprecation]
### Deprecation
'getRoot()' is deprecated
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
 * or failing that apply whatever default behavior is configured globally (e.g. return {@code null}, ...).
 * <p>
 * For {@code GHObject#root()} and {@link GHObject#getRoot()}, this will return the {@link GitHub} client mock.
 * <p>
 * For other getters, if there is a mocked behavior, this will apply that behavior.
```

### Deprecation
'org.kohsuke.github.HttpConnector' is deprecated
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                // Configure the client mocks to be offline, because we don't want to send HTTP requests.
                settings -> settings.useConstructor("https://api.github.invalid",
                        new GitHubConnectorHttpConnectorAdapter(HttpConnector.OFFLINE), RateLimitHandler.WAIT,
                        AbuseLimitHandler.WAIT, null, AuthorizationProvider.ANONYMOUS)
                        .defaultAnswer(new GitHubMockDefaultAnswer(defaultAnswers, this::repository)));
```

### Deprecation
'org.kohsuke.github.RateLimitHandler' is deprecated
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                // Configure the client mocks to be offline, because we don't want to send HTTP requests.
                settings -> settings.useConstructor("https://api.github.invalid",
                        new GitHubConnectorHttpConnectorAdapter(HttpConnector.OFFLINE), RateLimitHandler.WAIT,
                        AbuseLimitHandler.WAIT, null, AuthorizationProvider.ANONYMOUS)
                        .defaultAnswer(new GitHubMockDefaultAnswer(defaultAnswers, this::repository)));
```

### Deprecation
'WAIT' is deprecated
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                // Configure the client mocks to be offline, because we don't want to send HTTP requests.
                settings -> settings.useConstructor("https://api.github.invalid",
                        new GitHubConnectorHttpConnectorAdapter(HttpConnector.OFFLINE), RateLimitHandler.WAIT,
                        AbuseLimitHandler.WAIT, null, AuthorizationProvider.ANONYMOUS)
                        .defaultAnswer(new GitHubMockDefaultAnswer(defaultAnswers, this::repository)));
```

### Deprecation
'org.kohsuke.github.AbuseLimitHandler' is deprecated
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                settings -> settings.useConstructor("https://api.github.invalid",
                        new GitHubConnectorHttpConnectorAdapter(HttpConnector.OFFLINE), RateLimitHandler.WAIT,
                        AbuseLimitHandler.WAIT, null, AuthorizationProvider.ANONYMOUS)
                        .defaultAnswer(new GitHubMockDefaultAnswer(defaultAnswers, this::repository)));
        graphQLClients = new MockMap<>(DynamicGraphQLClient.class);
```

### Deprecation
'WAIT' is deprecated
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                settings -> settings.useConstructor("https://api.github.invalid",
                        new GitHubConnectorHttpConnectorAdapter(HttpConnector.OFFLINE), RateLimitHandler.WAIT,
                        AbuseLimitHandler.WAIT, null, AuthorizationProvider.ANONYMOUS)
                        .defaultAnswer(new GitHubMockDefaultAnswer(defaultAnswers, this::repository)));
        graphQLClients = new MockMap<>(DynamicGraphQLClient.class);
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

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubFileDownloader.java`
#### Snippet
```java

    @Inject
    LaunchMode launchMode;

    @SuppressWarnings("deprecation")
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java

    @Inject
    LaunchMode launchMode;

    @Override
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    @Inject
    CheckedConfigProvider(GitHubAppRuntimeConfig gitHubAppRuntimeConfig, LaunchMode launchMode) {
        this.gitHubAppRuntimeConfig = gitHubAppRuntimeConfig;
        this.launchMode = launchMode;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

    @Inject
    SmeeIoForwarder(CheckedConfigProvider checkedConfigProvider, HttpConfiguration httpConfiguration,
            ObjectMapper objectMapper) {
        if (!checkedConfigProvider.webhookProxyUrl().isPresent()) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
    @Inject
    SmeeIoForwarder(CheckedConfigProvider checkedConfigProvider, HttpConfiguration httpConfiguration,
            ObjectMapper objectMapper) {
        if (!checkedConfigProvider.webhookProxyUrl().isPresent()) {
            this.eventStreamClient = null;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

    @Inject
    ObjectMapper jsonObjectMapper;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    @Inject
    PayloadSignatureChecker payloadSignatureChecker;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    @Inject
    HttpConfiguration httpConfig;

    Path tmpDirectory;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    @Inject
    LaunchMode launchMode;

    @Inject
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`"true".equals(replayed) ? true : false` can be simplified to '"true".equals(replayed)'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        String repository = extractRepository(body);
        GitHubEvent gitHubEvent = new GitHubEvent(installationId, checkedConfigProvider.appName().orElse(null), deliveryId,
                repository, event, action, routingContext.body().asString(), body, "true".equals(replayed) ? true : false);

        if (launchMode == LaunchMode.DEVELOPMENT && replayRouteInstance.isResolvable()) {
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java

/**
 * Extracted from Ant - https://github.com/apache/ant with a few adjustments.
 * Will require some improvements regarding escaping.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java

/**
 * Slightly adjusted version of code found here: https://stackoverflow.com/a/55339208 .
 */
public class PrivateKeyUtil {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    /**
     * The bridge methods added for binary compatibility in the GitHub API are causing issues with Mockito
     * and more specifically with Byte Buddy (see https://github.com/raphw/byte-buddy/issues/1162).
     * They don't bring much to the plate for new applications that are regularly updated so let's remove them altogether.
     */
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'appName'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final Long installationId;

    private final Optional<String> appName;

    private final String deliveryId;
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

## RuleId[id=SimplifyOptionalCallChains]
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

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        // Add the qualifiers as beans
        String[] subscriberAnnotations = allEventDefinitions.stream().map(d -> d.getAnnotation().toString())
                .toArray(String[]::new);
        additionalBeans.produce(new AdditionalBeanBuildItem(subscriberAnnotations));

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
IOException is not declared to be thrown by method fetchConfigFile
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubConfigFileProvider.java`
#### Snippet
```java
     * @param type The type to deserialize the file to.
     * @return The configuration file wrapped in an {@link java.util.Optional}, or {@link Optional#empty()} if it is missing.
     * @throws java.io.IOException If the configuration file cannot be retrieved.
     * @throws IllegalStateException If the configuration file cannot be deserialized to the given type.
     * @see ConfigFile
```

### JavadocDeclaration
IOException is not declared to be thrown by method fetchConfigFile
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubConfigFileProvider.java`
#### Snippet
```java
     * @param type The type to deserialize the file to.
     * @return The configuration file wrapped in an {@link java.util.Optional}, or {@link Optional#empty()} if it is missing.
     * @throws java.io.IOException If the configuration file cannot be retrieved.
     * @throws IllegalStateException If the configuration file cannot be deserialized to the given type.
     * @see ConfigFile
```

### JavadocDeclaration
`@return` tag description is missing
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java
     * Returns if client is currently listening for SSE events
     *
     * @return
     */
    public boolean isRunning() {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `eventPayload` to `GHEventPayload.Create` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
        }
        if (eventPayload instanceof GHEventPayload.Create) {
            return Optional.of(((GHEventPayload.Create) eventPayload).getRepository().getHtmlUrl().toString());
        }
        if (eventPayload instanceof GHEventPayload.Delete) {
```

### RedundantCast
Casting `eventPayload` to `GHEventPayload.Delete` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
        }
        if (eventPayload instanceof GHEventPayload.Delete) {
            return Optional.of(((GHEventPayload.Delete) eventPayload).getRepository().getHtmlUrl().toString());
        }
        if (eventPayload instanceof GHEventPayload.Deployment) {
```

### RedundantCast
Casting `eventPayload` to `GHEventPayload.Public` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
        }
        if (eventPayload instanceof GHEventPayload.Public) {
            return Optional.of(((GHEventPayload.Public) eventPayload).getRepository().getHtmlUrl().toString());
        }
        if (eventPayload instanceof GHEventPayload.Push) {
```

### RedundantCast
Casting `eventPayload` to `GHEventPayload.Repository` is redundant
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
        }
        if (eventPayload instanceof GHEventPayload.Repository) {
            return Optional.of(((GHEventPayload.Repository) eventPayload).getRepository().getHtmlUrl().toString());
        }
        if (eventPayload instanceof GHEventPayload.Status) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `body` may be 'final'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpRequestMethod.java`
#### Snippet
```java
    DELETE(false);

    private boolean body;

    HttpRequestMethod(boolean body) {
```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java
public final class GitHubAppTestingResource implements QuarkusTestResourceLifecycleManager {

    private io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource delegate = new io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource();

    @Override
```

### FieldMayBeFinal
Field `sb` may be 'final'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

        running = client.sendAsync(request.build(), BodyHandlers.ofByteArrayConsumer(new Consumer<Optional<byte[]>>() {
            StringBuilder sb = new StringBuilder(), data = new StringBuilder();
            String event = null;

```

### FieldMayBeFinal
Field `data` may be 'final'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/sse/HttpEventStreamClient.java`
#### Snippet
```java

        running = client.sendAsync(request.build(), BodyHandlers.ofByteArrayConsumer(new Consumer<Optional<byte[]>>() {
            StringBuilder sb = new StringBuilder(), data = new StringBuilder();
            String event = null;

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

