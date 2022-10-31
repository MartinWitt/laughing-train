# quarkiverse/quarkus-github-app
# Bad smells
I found 1485 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| unused | 421 | false |
| UnqualifiedFieldAccess | 273 | false |
| PublicMethodWithoutLogging | 209 | false |
| DuplicateStringLiteralInspection | 104 | false |
| ClassWithoutLogger | 102 | false |
| ParameterHidingMemberVariable | 98 | false |
| PackageVisibleInnerClass | 80 | false |
| RedundantThrows | 50 | false |
| CollectionsMustHaveInitialCapacity | 22 | false |
| CallToSuspiciousStringMethod | 22 | false |
| TypeMayBeWeakened | 20 | false |
| MethodCallInLoopCondition | 14 | false |
| UseOfAnotherObjectsPrivateField | 14 | false |
| AssignmentToNull | 8 | false |
| ConfusingElse | 7 | false |
| Deprecation | 6 | false |
| UnusedReturnValue | 5 | false |
| ClassIndependentOfModule | 5 | false |
| ClassOnlyUsedInOneModule | 3 | false |
| ClassWithOnlyPrivateConstructors | 3 | false |
| HashCodeUsesNonFinalVariable | 2 | false |
| ProtectedField | 2 | false |
| ReturnOfInnerClass | 2 | false |
| UncheckedExceptionClass | 2 | false |
| ConstantConditions | 2 | false |
| ParametersPerConstructor | 2 | false |
| SynchronizeOnThis | 2 | false |
| MarkerInterface | 1 | false |
| MethodCount | 1 | false |
| AnonymousClassComplexity | 1 | false |
| BooleanVariableAlwaysNegated | 1 | false |
| NestingDepth | 1 | false |
## HashCodeUsesNonFinalVariable
### HashCodeUsesNonFinalVariable
Non-final field `someProperty` accessed in 'hashCode()'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(someProperty, someProperty);
    }

```

### HashCodeUsesNonFinalVariable
Non-final field `someProperty` accessed in 'hashCode()'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(someProperty, someProperty);
    }

```

## ProtectedField
### ProtectedField
Protected field `verbose`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }

```

### ProtectedField
Protected field `verbose`
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }

```

## DuplicateStringLiteralInspection
### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.PermissionCli.WriteCommand'
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    }

    @Command(name = "write-command") // <2>
    static class WriteCommand implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
    }

    @Command(name = "command1")
    static class Command1 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CliOptionsParseErrorStrategyCli.ParseErrorStrategyCliCommand', 'command.airline.CliOptionsDefaultCommandOptionsCli.DefaultCommandOptionsCliCommand', 'command.airline.TeamPermissionCli.MyTeamCommand', 'command.airline.CliOptionsAliasesCli.AliasesCliCommand'
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorMessageCli.java`
#### Snippet
```java
    // end::parse-error-message[]

    @Command(name = "command")
    static class ParseErrorMessageCliCommand implements Runnable {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand2', 'command.airline.HelpCli.Command2', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command2', 'command.airline.PayloadInjectionCli.Command2'
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    }

    @Command(name = "command2")
    static class Command2 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    }

    @Command(name = "command1")
    static class Command1 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CliOptionsDefaultCommandOptionsCli.DefaultCommandOptionsCliCommand', 'command.airline.TeamPermissionCli.MyTeamCommand', 'command.airline.CliOptionsParseErrorMessageCli.ParseErrorMessageCliCommand', 'command.airline.CliOptionsAliasesCli.AliasesCliCommand'
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorStrategyCli.java`
#### Snippet
```java
    // end::parse-error-strategy[]

    @Command(name = "command")
    static class ParseErrorStrategyCliCommand implements Runnable {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CliOptionsParseErrorStrategyCli.ParseErrorStrategyCliCommand', 'command.airline.CliOptionsDefaultCommandOptionsCli.DefaultCommandOptionsCliCommand', 'command.airline.CliOptionsParseErrorMessageCli.ParseErrorMessageCliCommand', 'command.airline.CliOptionsAliasesCli.AliasesCliCommand'
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    }

    @Command(name = "command")
    @Team({ "my-team1", "my-team2" }) // <1>
    static class MyTeamCommand implements Commands {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CliOptionsParseErrorStrategyCli.ParseErrorStrategyCliCommand', 'command.airline.TeamPermissionCli.MyTeamCommand', 'command.airline.CliOptionsParseErrorMessageCli.ParseErrorMessageCliCommand', 'command.airline.CliOptionsAliasesCli.AliasesCliCommand'
in `docs/modules/ROOT/examples/command/airline/CliOptionsDefaultCommandOptionsCli.java`
#### Snippet
```java
    // end::default-command-options[]

    @Command(name = "command")
    static class DefaultCommandOptionsCliCommand implements Runnable {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.GitHubAppProcessor'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
import io.quarkus.runtime.annotations.ConvertWith;

@ConfigRoot(name = "github-app", phase = ConfigPhase.RUN_TIME)
public class GitHubAppRuntimeConfig {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.config.CheckedConfigProvider'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

        if (launchMode == LaunchMode.TEST) {
            errorMessage = "Missing value for configuration properties: " + missingPropertyKeys + "."
                    + " This configuration is necessary to create the GitHub clients."
                    + " It is optional in tests only if GitHub clients are being mocked using quarkus-github-app-testing"
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.config.CheckedConfigProvider'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
                    + " (see https://quarkiverse.github.io/quarkiverse-docs/quarkus-github-app/dev/testing.html).";
        } else {
            errorMessage = "Missing value for configuration properties: " + missingPropertyKeys + "."
                    + " This configuration is required in " + (launchMode == LaunchMode.NORMAL ? "prod" : "dev")
                    + " mode.";
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.TeamCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @team two-teams");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.TeamCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @team team1");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.github.GitHubConfigFileProviderImpl'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

            if (sourceRepository == null) {
                throw new IllegalStateException("Unable to get the source repository for fork " + ghRepository.getFullName()
                        + ": unable to read config file " + path);
            }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.github.GitHubConfigFileProviderImpl'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
            if (sourceRepository == null) {
                throw new IllegalStateException("Unable to get the source repository for fork " + ghRepository.getFullName()
                        + ": unable to read config file " + path);
            }

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.github.GitHubConfigFileProviderImpl'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
            return sourceRepository;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to get the source repository for fork " + ghRepository.getFullName()
                    + ": unable to read config file " + path, e);
        }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.github.GitHubConfigFileProviderImpl'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
        } catch (IOException e) {
            throw new IllegalStateException("Unable to get the source repository for fork " + ghRepository.getFullName()
                    + ": unable to read config file " + path, e);
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand2', 'command.airline.HelpCli.Command2', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command2', 'command.airline.GitHubInjectionCli.Command2'
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
    }

    @Command(name = "command2")
    static class Command2 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1'  
... (3 more)
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
    }

    @Command(name = "command1")
    static class Command1 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.replay.ReplayEventRouteAvailableInDevModeTest', 'io.quarkiverse.githubapp.deployment.replay.ReplayEventRouteUnavailableTest'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
    private final BroadcastProcessor<ReplayEvent> broadcastProcessor = BroadcastProcessor.create();

    @Route(path = "/replay/events", produces = ReactiveRoutes.EVENT_STREAM)
    Multi<ReplayEvent> replayEvents(RoutingContext context) {
        return Multi.createBy()
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            throw new RuntimeException("Execution error");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
public class ExecutionErrorStrategyCli {

    @Command(name = "command1")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE)
    static class TestCommand1 implements TestCommand {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.Routes', 'io.quarkiverse.githubapp.deployment.OptionalConfigFileTest'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
final class EventSenderOptionsImpl implements EventSenderOptions {

    private static final MediaType DEFAULT_MEDIA_TYPE = MediaType.get("application/json");

    private final GitHubAppTestingContext testingContext;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ServiceInjectionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java
            assertThat(gitHub).isInstanceOf(GitHub.class);

            issueCommentPayload.getIssue().comment("hello from @service-injection test");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.Routes'
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
import org.kohsuke.github.GHEventPayload;

@Event(name = "installation", payload = GHEventPayload.Installation.class)
@Target({ PARAMETER, TYPE })
@Retention(RUNTIME)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CompositionCli.VerboseModule'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
    public static class VerboseModule {

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CompositionCli.VerboseModule'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
    public static class VerboseModule {

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CompositionCli'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
import io.quarkiverse.githubapp.it.command.airline.CompositionCli.TestCompositionCommand;

@Cli(name = "@composition", commands = { TestCompositionCommand.class })
public class CompositionCli {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CompositionCli.TestCompositionCommand', 'io.quarkiverse.githubapp.it.command.airline.CompositionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
                issueCommentPayload.getIssue().comment("hello from @composition test");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CompositionCli.TestCompositionCommand', 'io.quarkiverse.githubapp.it.command.airline.CompositionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
                issueCommentPayload.getIssue().comment("hello from @composition test");
            }
        }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultPermissionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-permission test-no-permission");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.PermissionCli.TestAdminPermissionCommand'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
    }

    @Command(name = "test-admin-permission")
    @Permission(GHPermissionType.ADMIN)
    static class TestAdminPermissionCommand implements PermissionCommand {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultPermissionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-permission test-read-permission");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultPermissionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-permission test-admin-permission");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.PermissionCli.TestNoPermissionCommand'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
public class DefaultPermissionCli {

    @Command(name = "test-no-permission")
    static class TestNoPermissionCommand implements PermissionCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.PermissionOverrideCli.WriteCommand'
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    }

    @Command(name = "write-command")
    @Permission(GHPermissionType.WRITE) // <1>
    static class WriteCommand implements Commands {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CliOptionsParseErrorStrategyCli.ParseErrorStrategyCliCommand', 'command.airline.CliOptionsDefaultCommandOptionsCli.DefaultCommandOptionsCliCommand', 'command.airline.TeamPermissionCli.MyTeamCommand', 'command.airline.CliOptionsParseErrorMessageCli.ParseErrorMessageCliCommand'
in `docs/modules/ROOT/examples/command/airline/CliOptionsAliasesCli.java`
#### Snippet
```java
    // end::aliases[]

    @Command(name = "command")
    static class AliasesCliCommand implements Runnable {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand2', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command2', 'command.airline.GitHubInjectionCli.Command2', 'command.airline.PayloadInjectionCli.Command2'
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
    }

    @Command(name = "command2", description = "Do command2 with style")
    static class Command2 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1'  
... (3 more)
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
    }

    @Command(name = "command1", description = "Do command1 with style") // <2>
    static class Command1 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.GitHubAppProcessor'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
                    // Stubbed GitHub clients are always offline
                    return true;
                case "getRepository":
                    return repositoryMockProvider.apply(invocation.getArgument(0, String.class));
            }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ConfigFileProviderCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

        void run(GHEventPayload.IssueComment issueCommentPayload,
                @ConfigFile("config-file-reader.yml") MyConfigBean myConfigBean) throws IOException;
    }

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
    }

    @Command(name = "command1")
    static class TestGroup1Command1 implements DefaultCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default group1 command1");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand2', 'command.airline.HelpCli.Command2', 'command.airline.GitHubInjectionCli.Command2', 'command.airline.PayloadInjectionCli.Command2'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
    }

    @Command(name = "command2")
    static class TestGroup1Command2 implements DefaultCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default basic");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default group1 command2");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.github.GitHubFileDownloader'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubFileDownloader.java`
#### Snippet
```java
            // Note that you will have a GHFileNotFoundException if the file exists but you don't have the 'Contents' permission.
            if (launchMode.isDevOrTest()) {
                LOG.warn("Unable to read file " + fullPath + " for repository " + ghRepository.getFullName()
                        + ". Either the file does not exist or the 'Contents' permission has not been set for the application.");
            }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.github.GitHubFileDownloader'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubFileDownloader.java`
#### Snippet
```java
        } catch (IOException e) {
            throw new IllegalStateException(
                    "Error downloading file " + fullPath + " for repository " + ghRepository.getFullName(), e);
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.OptionalConfigFileTest'
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
import org.kohsuke.github.GHEventPayload;

@Event(name = "label", payload = GHEventPayload.Label.class)
@Target({ PARAMETER, TYPE })
@Retention(RUNTIME)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.app.CatchAllEventListenerTest', 'io.quarkiverse.githubapp.it.testingframework.TestingFrameworkExplicitResourceTest', 'io.quarkiverse.githubapp.it.testingframework.TestingFrameworkTest'
in `integration-tests/app/src/main/java/io/quarkiverse/githubapp/it/app/CatchAllEventListener.java`
#### Snippet
```java

    void onEvent(@Issue GHEventPayload.Issue payload) throws IOException {
        payload.getIssue().addLabels("someValue");
    }
}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
public class ParseErrorStrategyCli {

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.Routes'
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
import org.kohsuke.github.GHEventPayload;

@Event(name = "repository", payload = GHEventPayload.Repository.class)
@Target({ PARAMETER, TYPE })
@Retention(RUNTIME)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.testingframework.TestingFrameworkExplicitResourceTest', 'io.quarkiverse.githubapp.it.testingframework.IssueEventListener', 'io.quarkiverse.githubapp.it.testingframework.TestingFrameworkTest'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/PullRequestEventListener.java`
#### Snippet
```java

    void onEvent(@PullRequest.Opened GHEventPayload.PullRequest payload,
            @ConfigFile("config.yml") MyConfigFile configFile) throws IOException {
        behavior.execute(payload, configFile);
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.testingframework.PullRequestEventListener', 'io.quarkiverse.githubapp.it.testingframework.TestingFrameworkExplicitResourceTest', 'io.quarkiverse.githubapp.it.testingframework.TestingFrameworkTest'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/IssueEventListener.java`
#### Snippet
```java

    void onEvent(@Issue.Opened GHEventPayload.Issue payload,
            @ConfigFile("config.yml") MyConfigFile configFile) throws IOException {
        behavior.execute(payload, configFile);
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultTeamCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-team no-teams");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultTeamCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-team team2");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
public class ParseErrorCli {

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
public class ParseErrorCli {

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
public class CommandLineParseErrorCli {

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorCli.TestCommand1'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
public class CommandLineParseErrorCli {

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-command-options command2");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.HelpCli.Command2', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command2', 'command.airline.GitHubInjectionCli.Command2', 'command.airline.PayloadInjectionCli.Command2'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
    }

    @Command(name = "command2")
    @CommandOptions(scope = CommandScope.ISSUES_AND_PULL_REQUESTS)
    static class TestCommand2 implements TestCommand {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
public class DefaultCommandOptionsCli {

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-command-options command1");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
public class ParseErrorStrategyNoneCli {

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ArcSubclassesCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc subclass-command1");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ArcSubclassesCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc application-scoped-command2");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ArcSubclassesCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc subclass-command2");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ArcSubclassesCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc application-scoped-command1");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            throw new RuntimeException("Execution error");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java
public class ExecutionErrorCli {

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.junit.GitHubMockContextImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    <T extends GHObject> MockMap<Long, T> nonRepositoryMockMap(Class<T> type) {
        if (GHRepository.class.equals(type)) {
            throw new IllegalArgumentException("Type must not be GHRepository -- there is a bug in the testing helper.");
        }
        return (MockMap<Long, T>) nonRepositoryGHObjectMockMaps.computeIfAbsent(type,
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.CdiInjectionCli.Command1', 'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1'  
... (3 more)
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
public class HelpCli {

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorCli.TestCommand1'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
public class HelpCli {

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.Routes', 'io.quarkiverse.githubapp.testing.internal.EventSenderOptionsImpl', 'io.quarkiverse.githubapp.deployment.OptionalConfigFileTest'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    }

    @Route(path = "/", type = HandlerType.BLOCKING, methods = HttpMethod.POST, consumes = "application/json", produces = "application/json")
    public void handleRequest(RoutingContext routingContext,
            RoutingExchange routingExchange,
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.Routes', 'io.quarkiverse.githubapp.testing.internal.EventSenderOptionsImpl', 'io.quarkiverse.githubapp.deployment.OptionalConfigFileTest'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    }

    @Route(path = "/", type = HandlerType.BLOCKING, methods = HttpMethod.POST, consumes = "application/json", produces = "application/json")
    public void handleRequest(RoutingContext routingContext,
            RoutingExchange routingExchange,
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.event.Installation'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        Long installationId;

        JsonObject installation = body.getJsonObject("installation");
        if (installation != null) {
            installationId = installation.getLong("id");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.event.Repository'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    private static String extractRepository(JsonObject body) {
        JsonObject repository = body.getJsonObject("repository");
        if (repository == null) {
            return null;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.PermissionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @permission test-admin-permission");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultPermissionCli.TestNoPermissionCommand'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
public class PermissionCli {

    @Command(name = "test-no-permission")
    static class TestNoPermissionCommand implements PermissionCommand {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.DefaultPermissionCli.TestAdminPermissionCommand'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
    }

    @Command(name = "test-admin-permission")
    @Permission(GHPermissionType.ADMIN)
    static class TestAdminPermissionCommand implements PermissionCommand {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.PermissionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @permission test-write-permission");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.PermissionCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @permission test-no-permission");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ReactiveStrategyCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy progress-error");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ReactiveStrategyCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy all");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ReactiveStrategyCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy none");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ReactiveStrategyCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy progress");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'command.airline.InjectMetadataCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyNoneCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ParseErrorStrategyCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCli.TestGroup1Command1', 'io.quarkiverse.githubapp.it.command.airline.CommandLineParseErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.DefaultCommandOptionsCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorCli.TestCommand1', 'io.quarkiverse.githubapp.it.command.airline.ExecutionErrorStrategyCli.TestCommand1', 'command.airline.GitHubInjectionCli.Command1', 'io.quarkiverse.githubapp.it.command.airline.HelpCli.TestCommand1'  
... (3 more)
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
    }

    @Command(name = "command1")
    static class Command1 implements Commands {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.CompositionCli'
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

// tag::include[]
@Cli(name = "@composition", commands = { TestCompositionCommand.class })
public class CompositionCli {

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.CompositionCli.VerboseModule'
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
    public static class VerboseModule {

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.CompositionCli.VerboseModule'
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
    public static class VerboseModule {

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
        protected boolean verbose = false;
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.CompositionCli.TestCompositionCommand', 'io.quarkiverse.githubapp.it.command.airline.CompositionCliTest'
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
                issueCommentPayload.getIssue().comment("hello from @composition test");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.CompositionCli.TestCompositionCommand', 'io.quarkiverse.githubapp.it.command.airline.CompositionCliTest'
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
                issueCommentPayload.getIssue().comment("hello from @composition test");
            }
        }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ReactiveStrategyOverrideCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy-override override");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.it.command.airline.ReactiveStrategyOverrideCliTest'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy-override no-override");
        }
    }
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.GitHubAppProcessor'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        }

        MethodCreator dispatchMethodCreator = commandDispatcherClassCreator.getMethodCreator("dispatch",
                void.class.getName(), parameterTypes.toArray());
        for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.command.airline.deployment.GitHubAppCommandAirlineProcessor'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

        ResultHandle commandExecutionContextOptional = dispatchMethodCreator.invokeSpecialMethod(
                MethodDescriptor.ofMethod(AbstractCommandDispatcher.class, "getCommand", Optional.class,
                        GHEventPayload.IssueComment.class),
                dispatchMethodCreator.getThis(), issueCommentPayloadRh);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.command.airline.deployment.GitHubAppCommandAirlineProcessor'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
                        commandExecutionContextOptional);
        ResultHandle commandRh = commandExecutionContextOptionalIsPresentTrue
                .invokeVirtualMethod(MethodDescriptor.ofMethod(CommandExecutionContext.class, "getCommand", Object.class),
                        commandExecutionContextRh);
        ResultHandle ackReactionRh = commandExecutionContextOptionalIsPresentTrue
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.runtime.config.GitHubAppRuntimeConfig'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    private static final Logger LOG = Logger.getLogger(GitHubAppProcessor.class);

    private static final String FEATURE = "github-app";

    private static final String EVENT_EMITTER_FIELD = "eventEmitter";
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.command.airline.deployment.GitHubAppCommandAirlineProcessor'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

        MethodCreator dispatchMethodCreator = dispatcherClassCreator.getMethodCreator(
                "dispatch",
                void.class,
                GitHubEvent.class);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.GitHubAppProcessor'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                gitHubEventRh);
        ResultHandle dispatchedPayloadRh = dispatchMethodCreator.invokeVirtualMethod(
                MethodDescriptor.ofMethod(GitHubEvent.class, "getPayload", String.class),
                gitHubEventRh);

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.GitHubAppProcessor'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                ResultHandle multiplexedEventRh = methodCreator.getMethodParam(parameterMapping.get(payloadParameterPosition));
                ResultHandle payloadRh = methodCreator.invokeVirtualMethod(
                        MethodDescriptor.ofMethod(MultiplexedEvent.class, "getPayload", GHEventPayload.class),
                        multiplexedEventRh);

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.testing.mockito.internal.GitHubMockDefaultAnswer'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                        ResultHandle configFileReaderRh = tryBlock.getMethodParam(parameterTypes.size() - 1);
                        ResultHandle ghRepositoryRh = tryBlock.invokeStaticMethod(MethodDescriptor
                                .ofMethod(PayloadHelper.class, "getRepository", GHRepository.class, GHEventPayload.class),
                                payloadRh);
                        ResultHandle configObject = tryBlock.invokeVirtualMethod(
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'io.quarkiverse.githubapp.deployment.GitHubAppProcessor'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                                multiplexedEventRh),
                        catchBlock.invokeVirtualMethod(
                                MethodDescriptor.ofMethod(MultiplexedEvent.class, "getPayload", GHEventPayload.class),
                                multiplexedEventRh),
                        catchBlock.getCaughtException());
```

## AssignmentToNull
### AssignmentToNull
'null' assigned to variable `this.gitHubEvent`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java
    public ReplayEvent() {
        this.event = "ping";
        this.gitHubEvent = null;
    }

```

### AssignmentToNull
'null' assigned to variable `this.payload`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
    public ErrorHandlerBridgeFunction(GitHubEvent gitHubEvent) {
        this.gitHubEvent = gitHubEvent;
        this.payload = null;
    }

```

### AssignmentToNull
'null' assigned to variable `secretKeySpec`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    PayloadSignatureChecker(CheckedConfigProvider checkedConfigProvider) {
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
            sharedMac = null;
            supportsClone = false;
```

### AssignmentToNull
'null' assigned to variable `sharedMac`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
            sharedMac = null;
            supportsClone = false;
            return;
```

### AssignmentToNull
'null' assigned to variable `this.eventSource`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
            ObjectMapper objectMapper) {
        if (!checkedConfigProvider.webhookProxyUrl().isPresent()) {
            this.eventSource = null;
            return;
        }
```

### AssignmentToNull
'null' assigned to variable `instance`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java

    public static void reset() {
        instance = null;
    }

```

### AssignmentToNull
'null' assigned to variable `testingContext.errorHandler.captured`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        testingContext.mocks.initEventStubs(installationId);

        testingContext.errorHandler.captured = null;
        AssertionError callAssertionError = null;
        try {
```

### AssignmentToNull
'null' assigned to variable `ackReaction`
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
                ackReaction = Reactions.createReaction(issueCommentPayload, ReactionContent.ROCKET);
            } else {
                ackReaction = null;
            }

```

## CollectionsMustHaveInitialCapacity
### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java

    @Arguments
    public List<String> command = new ArrayList<>();

    public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingResource.java`
#### Snippet
```java
    @Override
    public Map<String, String> start() {
        Map<String, String> configProperties = new HashMap<>();
        GitHubAppTestingCallback.enable(configProperties);
        return configProperties;
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java
    @Override
    public Map<String, String> start() {
        Map<String, String> configProperties = new HashMap<>();
        GitHubAppTestingCallback.enable(configProperties);
        return configProperties;
```

### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public Set<EventAnnotationLiteral> getEventAnnotationLiterals() {
            Set<EventAnnotationLiteral> literals = new HashSet<>();
            for (EventAnnotation eventAnnotation : eventAnnotations.values()) {
                literals.add(new EventAnnotationLiteral(eventAnnotation.getName(),
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
        int state = normal;
        final StringTokenizer tok = new StringTokenizer(toProcess, "\"' ", true);
        final ArrayList<String> result = new ArrayList<>();
        final StringBuilder current = new StringBuilder();
        boolean lastTokenHasBeenQuoted = false;
```

### CollectionsMustHaveInitialCapacity
`new ConcurrentHashMap<>()` without initial capacity
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
    GitHubConfigFileProvider gitHubConfigFileProvider;

    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    public Object getConfigObject(GHRepository ghRepository, String path, ConfigFile.Source source, Class<?> type) {
```

### CollectionsMustHaveInitialCapacity
`new LinkedHashMap<>()` without initial capacity
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    private final MockMap<Object, DynamicGraphQLClient> graphQLClients;
    private final MockMap<String, GHRepository> repositories;
    private final Map<Class<?>, MockMap<Long, ? extends GHObject>> nonRepositoryGHObjectMockMaps = new LinkedHashMap<>();
    private final Answers defaultAnswers;

```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    final GitHubFileDownloader fileDownloader;

    private final List<MockMap<?, ?>> allMockMaps = new ArrayList<>();
    private final MockMap<Long, GitHub> clients;
    private final MockMap<Object, DynamicGraphQLClient> graphQLClients;
```

### CollectionsMustHaveInitialCapacity
`new LinkedHashMap<>()` without initial capacity
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        private final Class<T> clazz;
        private final Consumer<MockSettings> mockSettingsContributor;
        private final Map<ID, DefaultableMocking<T>> map = new LinkedHashMap<>();

        private MockMap(Class<T> clazz) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    @Override
    public Object[] ghObjects() {
        List<GHObject> result = new ArrayList<>();
        for (MockMap<?, ?> mockMap : allMockMaps) {
            if (!GHObject.class.isAssignableFrom(mockMap.clazz)) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    private static List<String> getAliases(AnnotationInstance cliAnnotationInstance) {
        List<String> cliAliases = new ArrayList<>();
        cliAliases.add(cliAnnotationInstance.value("name").asString());

```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    private static Map<DotName, ClassInfo> getAllCommands(IndexView index, AnnotationInstance annotationInstance) {
        Map<DotName, ClassInfo> allCommands = new HashMap<>();

        AnnotationValue commandsValue = annotationInstance.value("commands");
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        }

        List<String> parameterTypes = new ArrayList<>();
        originalMethodParameterTypes.stream().map(t -> t.name().toString())
                .forEach(parameterTypes::add);
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        TryBlock tryBlock = commandExecutionContextOptionalIsPresentTrue.tryBlock();

        List<ResultHandle> runMethodParameters = new ArrayList<>();
        for (int i = 0; i < originalMethodParameterTypes.size(); i++) {
            runMethodParameters.add(commandExecutionContextOptionalIsPresentTrue.getMethodParam(i));
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                Class<?>[] literalParameterTypes = new Class<?>[eventAnnotation.getValues().size()];
                Arrays.fill(literalParameterTypes, String.class);
                List<ResultHandle> literalParameters = new ArrayList<>();
                for (AnnotationValue eventAnnotationValue : eventAnnotation.getValues()) {
                    literalParameters.add(eventMatchesCreator.load(eventAnnotationValue.asString()));
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
        List<IndexView> indexes = new ArrayList<>();
        indexes.add(combinedIndex.getIndex());
        additionalEventDispatchingIndexes.forEach(i -> indexes.add(i.getIndex()));
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<ReflectiveHierarchyBuildItem> reflectiveHierarchies) {
        List<IndexView> indexes = new ArrayList<>();
        indexes.add(combinedIndex.getIndex());
        additionalEventDispatchingIndexes.forEach(i -> indexes.add(i.getIndex()));
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                        .collect(Collectors.groupingBy(ai -> ai.target().asMethodParameter().position()));

                List<ResultHandle> parametersRh = new ArrayList<>();
                for (short i = 0; i < originalConstructor.parameterTypes().size(); i++) {
                    parametersRh.add(constructorCreator.getMethodParam(i));
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                }

                List<String> parameterTypes = new ArrayList<>();
                List<Type> originalMethodParameterTypes = originalMethod.parameterTypes();

```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

                short j = 0;
                Map<Short, Short> parameterMapping = new HashMap<>();
                for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
                    List<AnnotationInstance> originalMethodAnnotations = originalMethodParameterAnnotationMapping
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    private static Collection<EventDefinition> getAllEventDefinitions(IndexView index) {
        Collection<EventDefinition> mainEventDefinitions = new ArrayList<>();
        Collection<EventDefinition> allEventDefinitions = new ArrayList<>();

```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    private static Collection<EventDefinition> getAllEventDefinitions(IndexView index) {
        Collection<EventDefinition> mainEventDefinitions = new ArrayList<>();
        Collection<EventDefinition> allEventDefinitions = new ArrayList<>();

        for (AnnotationInstance eventInstance : index.getAnnotations(EVENT)) {
```

## MarkerInterface
### MarkerInterface
Marker interface `GitHubMockVerificationContext`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockVerificationContext.java`
#### Snippet
```java
package io.quarkiverse.githubapp.testing.dsl;

public interface GitHubMockVerificationContext extends GitHubMockContext {

}
```

## ClassOnlyUsedInOneModule
### ClassOnlyUsedInOneModule
Class `CatchAllEventListener` has only dependencies on and/or dependents in module 'quarkus-github-app-events'
in `integration-tests/app/src/main/java/io/quarkiverse/githubapp/it/app/CatchAllEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.Issue;

public class CatchAllEventListener {

    void onEvent(@Issue GHEventPayload.Issue payload) throws IOException {
```

### ClassOnlyUsedInOneModule
Class `GitHubAppRecorder` has only dependencies on and/or dependents in module 'quarkus-github-app-deployment'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/GitHubAppRecorder.java`
#### Snippet
```java

@Recorder
public class GitHubAppRecorder {

    public Handler<RoutingContext> replayUiHandler(String replayUiFinalDestination, String replayUiPath,
```

### ClassOnlyUsedInOneModule
Class `Multiplexer` has only dependencies on and/or dependents in module 'quarkus-github-app-deployment'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Multiplexer.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Multiplexer {
}

```

## TypeMayBeWeakened
### TypeMayBeWeakened
Type of variable `keySpec` may be weakened to 'java.security.spec.KeySpec'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
    private static PrivateKey readPkcs8PrivateKey(byte[] pkcs8Bytes) throws GeneralSecurityException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", "SunRsaSign");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pkcs8Bytes);
        try {
            return keyFactory.generatePrivate(keySpec);
```

### TypeMayBeWeakened
Type of field `missingPropertyKeys` may be weakened to 'java.util.Collection'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    private final LaunchMode launchMode;

    private final Set<String> missingPropertyKeys = new TreeSet<>();

    @Inject
```

### TypeMayBeWeakened
Type of parameter `secretKeySpec` may be weakened to 'java.security.Key'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public static Mac createNewMacInstance(SecretKeySpec secretKeySpec) {
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
```

### TypeMayBeWeakened
Type of parameter `extensions` may be weakened to 'java.lang.Iterable'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
    }

    private static boolean matchExtensions(String path, Collection<String> extensions) {
        for (String extension : extensions) {
            if (path.endsWith(extension)) {
```

### TypeMayBeWeakened
Type of field `recordedEvents` may be weakened to 'java.util.Queue'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
     * The past events are recorded here so that, when you connect/reconnect, you get the past events.
     */
    private final ConcurrentLinkedQueue<ReplayEvent> recordedEvents = new ConcurrentLinkedQueue<>();

    private final BroadcastProcessor<ReplayEvent> broadcastProcessor = BroadcastProcessor.create();
```

### TypeMayBeWeakened
Type of variable `result` may be weakened to 'java.util.List'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
        int state = normal;
        final StringTokenizer tok = new StringTokenizer(toProcess, "\"' ", true);
        final ArrayList<String> result = new ArrayList<>();
        final StringBuilder current = new StringBuilder();
        boolean lastTokenHasBeenQuoted = false;
```

### TypeMayBeWeakened
Type of field `allMockMaps` may be weakened to 'java.util.Collection'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    final GitHubFileDownloader fileDownloader;

    private final List<MockMap<?, ?>> allMockMaps = new ArrayList<>();
    private final MockMap<Long, GitHub> clients;
    private final MockMap<Object, DynamicGraphQLClient> graphQLClients;
```

### TypeMayBeWeakened
Type of variable `result` may be weakened to 'java.util.Collection'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    @Override
    public Object[] ghObjects() {
        List<GHObject> result = new ArrayList<>();
        for (MockMap<?, ?> mockMap : allMockMaps) {
            if (!GHObject.class.isAssignableFrom(mockMap.clazz)) {
```

### TypeMayBeWeakened
Type of parameter `bytecodeCreator` may be weakened to 'io.quarkus.gizmo.BytecodeCreator'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    }

    private static ResultHandle getCommandPermissionConfig(MethodCreator bytecodeCreator,
            AnnotationInstance permissionAnnotation) {
        ResultHandle permissionRh;
```

### TypeMayBeWeakened
Type of parameter `allCommands` may be weakened to 'java.lang.Iterable'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    private static void generateCommandDispatcherGetCommandTeamConfigsMethod(ClassCreator commandDispatcherClassCreator,
            Collection<ClassInfo> allCommands) {
        MethodCreator getCommandTeamConfigsMethodCreator = commandDispatcherClassCreator.getMethodCreator(
                "getCommandTeamConfigs",
```

### TypeMayBeWeakened
Type of parameter `allCommands` may be weakened to 'java.lang.Iterable'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    private static void generateCommandDispatcherGetCommandPermissionConfigsMethod(ClassCreator commandDispatcherClassCreator,
            Collection<ClassInfo> allCommands) {
        MethodCreator getCommandPermissionConfigsMethodCreator = commandDispatcherClassCreator.getMethodCreator(
                "getCommandPermissionConfigs",
```

### TypeMayBeWeakened
Type of parameter `allCommands` may be weakened to 'java.lang.Iterable'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    private static void generateCommandDispatcherGetCommandConfigsMethod(ClassCreator commandDispatcherClassCreator,
            IndexView index,
            Collection<ClassInfo> allCommands) {
        MethodCreator getCommandConfigsMethodCreator = commandDispatcherClassCreator.getMethodCreator("getCommandConfigs",
                Map.class.getName());
```

### TypeMayBeWeakened
Type of parameter `gitHubApiClassesWithBridgeMethods` may be weakened to 'java.lang.Iterable'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    void removeCompatibilityBridgeMethodsFromGitHubApi(
            BuildProducer<BytecodeTransformerBuildItem> bytecodeTransformers,
            List<GitHubApiClassWithBridgeMethodsBuildItem> gitHubApiClassesWithBridgeMethods) {
        for (GitHubApiClassWithBridgeMethodsBuildItem gitHubApiClassWithBridgeMethods : gitHubApiClassesWithBridgeMethods) {
            bytecodeTransformers.produce(new BytecodeTransformerBuildItem.Builder()
```

### TypeMayBeWeakened
Type of variable `literalParameters` may be weakened to 'java.util.Collection'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                Class<?>[] literalParameterTypes = new Class<?>[eventAnnotation.getValues().size()];
                Arrays.fill(literalParameterTypes, String.class);
                List<ResultHandle> literalParameters = new ArrayList<>();
                for (AnnotationValue eventAnnotationValue : eventAnnotation.getValues()) {
                    literalParameters.add(eventMatchesCreator.load(eventAnnotationValue.asString()));
```

### TypeMayBeWeakened
Type of parameter `shutdownContext` may be weakened to 'io.quarkus.runtime.ShutdownContext'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            WebJarResultsBuildItem webJarResults,
            HttpRootPathBuildItem httpRootPath,
            ShutdownContextBuildItem shutdownContext,
            BuildProducer<RouteBuildItem> routes,
            BuildProducer<NotFoundPageDisplayableEndpointBuildItem> displayableEndpoints) throws IOException {
```

### TypeMayBeWeakened
Type of parameter `additionalEventDispatchingIndexes` may be weakened to 'java.lang.Iterable'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    @BuildStep
    void generateClasses(CombinedIndexBuildItem combinedIndex, LaunchModeBuildItem launchMode,
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<AdditionalBeanBuildItem> additionalBeans,
            BuildProducer<GeneratedBeanBuildItem> generatedBeans,
```

### TypeMayBeWeakened
Type of parameter `additionalEventDispatchingIndexes` may be weakened to 'java.lang.Iterable'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    @BuildStep
    void registerForReflection(CombinedIndexBuildItem combinedIndex,
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
            BuildProducer<ReflectiveHierarchyBuildItem> reflectiveHierarchies) {
```

### TypeMayBeWeakened
Type of variable `parametersRh` may be weakened to 'java.util.Collection'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                        .collect(Collectors.groupingBy(ai -> ai.target().asMethodParameter().position()));

                List<ResultHandle> parametersRh = new ArrayList<>();
                for (short i = 0; i < originalConstructor.parameterTypes().size(); i++) {
                    parametersRh.add(constructorCreator.getMethodParam(i));
```

### TypeMayBeWeakened
Type of variable `parameterTypes` may be weakened to 'java.util.Collection'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                }

                List<String> parameterTypes = new ArrayList<>();
                List<Type> originalMethodParameterTypes = originalMethod.parameterTypes();

```

### TypeMayBeWeakened
Type of parameter `allEventDefinitions` may be weakened to 'java.lang.Iterable'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    private static DispatchingConfiguration getDispatchingConfiguration(
            IndexView index, Collection<EventDefinition> allEventDefinitions) {
        DispatchingConfiguration configuration = new DispatchingConfiguration();

```

## MethodCallInLoopCondition
### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
                return valuesLengthCompare;
            }
            for (int i = 0; i < values.size(); i++) {
                // we only support string for now, we can adjust later
                int valueCompare = values.get(i).asString().compareTo(other.values.get(i).asString());
```

### MethodCallInLoopCondition
Call to method `hasMoreTokens()` in loop condition
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
        boolean lastTokenHasBeenQuoted = false;

        while (tok.hasMoreTokens()) {
            String nextTok = tok.nextToken();
            switch (state) {
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    private static <T> ResultHandle toResultHandle(BytecodeCreator bytecodeCreator, List<String> list) {
        ResultHandle arrayRh = bytecodeCreator.newArray(String.class, list.size());
        for (int i = 0; i < list.size(); i++) {
            bytecodeCreator.writeArrayValue(arrayRh, i, bytecodeCreator.load(list.get(i)));
        }
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        boolean originalMethodHasIssueCommentPayloadParameter = false;

        for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
            if (GH_EVENT_PAYLOAD_ISSUE_COMMENT.equals(originalMethodParameterTypes.get(i).name())) {
                issueCommentPayloadPosition = i;
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        MethodCreator dispatchMethodCreator = commandDispatcherClassCreator.getMethodCreator("dispatch",
                void.class.getName(), parameterTypes.toArray());
        for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
            List<AnnotationInstance> annotations = originalMethodParameterAnnotationMapping.getOrDefault(i,
                    Collections.emptyList());
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

        List<ResultHandle> runMethodParameters = new ArrayList<>();
        for (int i = 0; i < originalMethodParameterTypes.size(); i++) {
            runMethodParameters.add(commandExecutionContextOptionalIsPresentTrue.getMethodParam(i));
        }
```

### MethodCallInLoopCondition
Call to method `getAttributes()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                constructorCreator.invokeSpecialMethod(MethodDescriptor.ofConstructor(AnnotationLiteral.class),
                        constructorCreator.getThis());
                for (int i = 0; i < eventAnnotationLiteral.getAttributes().size(); i++) {
                    constructorCreator.writeInstanceField(
                            FieldDescriptor.of(literalClassName, eventAnnotationLiteral.getAttributes().get(i), String.class),
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                constructorCreator.invokeSpecialMethod(MethodDescriptor.ofConstructor(AnnotationLiteral.class),
                        constructorCreator.getThis());
                for (int i = 0; i < eventAnnotationLiteral.getAttributes().size(); i++) {
                    constructorCreator.writeInstanceField(
                            FieldDescriptor.of(literalClassName, eventAnnotationLiteral.getAttributes().get(i), String.class),
```

### MethodCallInLoopCondition
Call to method `parameterTypes()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

                List<ResultHandle> parametersRh = new ArrayList<>();
                for (short i = 0; i < originalConstructor.parameterTypes().size(); i++) {
                    parametersRh.add(constructorCreator.getMethodParam(i));

```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

                List<ResultHandle> parametersRh = new ArrayList<>();
                for (short i = 0; i < originalConstructor.parameterTypes().size(); i++) {
                    parametersRh.add(constructorCreator.getMethodParam(i));

```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                // detect the parameter that is a payload
                short payloadParameterPosition = 0;
                for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
                    List<AnnotationInstance> parameterAnnotations = originalMethodParameterAnnotationMapping.getOrDefault(i,
                            Collections.emptyList());
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                short j = 0;
                Map<Short, Short> parameterMapping = new HashMap<>();
                for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
                    List<AnnotationInstance> originalMethodAnnotations = originalMethodParameterAnnotationMapping
                            .getOrDefault(i, Collections.emptyList());
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

                // copy annotations except for @ConfigFile
                for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
                    List<AnnotationInstance> parameterAnnotations = originalMethodParameterAnnotationMapping.getOrDefault(i,
                            Collections.emptyList());
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                // generate the code of the method
                for (short originalMethodParameterIndex = 0; originalMethodParameterIndex < originalMethodParameterTypes
                        .size(); originalMethodParameterIndex++) {
                    List<AnnotationInstance> parameterAnnotations = originalMethodParameterAnnotationMapping.getOrDefault(
                            originalMethodParameterIndex,
```

## CallToSuspiciousStringMethod
### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
            Help.help(global, command, helpOs);

            issueCommentPayload.getIssue().comment("```\n" + helpOs.toString(StandardCharsets.UTF_8).trim() + "\n```");
        } catch (IOException e) {
            throw new RuntimeException("Error generating usage documentation for " + String.join(" ", command), e);
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

    public static String getFilePath(String path) {
        String trimmedPath = path.trim();

        if (trimmedPath.contains(PARENT_DIRECTORY)) {
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
        @Override
        public void onMessage(String event, MessageEvent messageEvent) throws Exception {
            if (EMPTY_MESSAGE.equals(messageEvent.getData())) {
                return;
            }
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java
    @Override
    public PrivateKey convert(final String value) {
        String privateKeyValue = value.trim();

        if (privateKeyValue.isEmpty()) {
```

### CallToSuspiciousStringMethod
`String.compareTo()` called in internationalized context
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            for (int i = 0; i < values.size(); i++) {
                // we only support string for now, we can adjust later
                int valueCompare = values.get(i).asString().compareTo(other.values.get(i).asString());
                if (valueCompare != 0) {
                    return valueCompare;
```

### CallToSuspiciousStringMethod
`String.compareTo()` called in internationalized context
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            }

            int methodNameComparator = method.toString().compareTo(other.method.toString());
            if (methodNameComparator != 0) {
                return methodNameComparator;
```

### CallToSuspiciousStringMethod
`String.compareTo()` called in internationalized context
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            }

            return eventSubscriberInstance.toString(false).compareTo(other.eventSubscriberInstance.toString(false));
        }
    }
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
            switch (state) {
                case inQuote:
                    if ("'".equals(nextTok)) {
                        lastTokenHasBeenQuoted = true;
                        state = normal;
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
                    break;
                case inDoubleQuote:
                    if ("\"".equals(nextTok)) {
                        lastTokenHasBeenQuoted = true;
                        state = normal;
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
                    break;
                default:
                    if ("'".equals(nextTok)) {
                        state = inQuote;
                    } else if ("\"".equals(nextTok)) {
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
                    if ("'".equals(nextTok)) {
                        state = inQuote;
                    } else if ("\"".equals(nextTok)) {
                        state = inDoubleQuote;
                    } else if (" ".equals(nextTok)) {
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
                    } else if ("\"".equals(nextTok)) {
                        state = inDoubleQuote;
                    } else if (" ".equals(nextTok)) {
                        if (lastTokenHasBeenQuoted || current.length() > 0) {
                            result.add(current.toString());
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
    private String getCacheKey(GHRepository ghRepository, String path,
            ConfigFile.Source source) {
        String fullPath = GitHubConfigFileProviderImpl.getFilePath(path.trim());
        ConfigFile.Source effectiveSource = checkedConfigProvider.getEffectiveSource(source);
        // we should only handle the config files of one repository in a given ConfigFileReader
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        String repository = extractRepository(body);
        GitHubEvent gitHubEvent = new GitHubEvent(installationId, checkedConfigProvider.appName().orElse(null), deliveryId,
                repository, event, action, routingContext.body().asString(), body, "true".equals(replayed) ? true : false);

        if (launchMode == LaunchMode.DEVELOPMENT && replayRouteInstance.isResolvable()) {
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java

        if (method.getParameterCount() == 0) {
            if (method.getName().equals("root") || method.getName().equals("getRoot")) {
                return clientSpy;
            }
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java

        if (method.getParameterCount() == 0) {
            if (method.getName().equals("root") || method.getName().equals("getRoot")) {
                return clientSpy;
            }
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

                if (!help.isBlank()) {
                    message.append("\n\nHelp:\n\n").append("```\n" + help.trim() + "\n```");
                }
            } catch (IOException e) {
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    private boolean matches(String cli) {
        for (String alias : cliConfig.getAliases()) {
            if (alias.equals(cli)) {
                return true;
            }
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        Optional<String> firstLineOptional = body.trim().lines().findFirst();
        if (firstLineOptional.isEmpty() || firstLineOptional.get().isBlank()) {
            return Optional.empty();
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        String firstLine = firstLineOptional.get().trim();
        String cliName = firstLine.split(" ", 2)[0];

```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

            List<MethodInfo> runMethods = candidateClassInfo.methods().stream()
                    .filter(mi -> RUN_METHOD.equals(mi.name()))
                    .collect(Collectors.toList());

```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                eventMatchesCreator.writeArrayValue(annotationLiteralArrayRh, 0, annotationLiteralRh);

                if (Actions.ALL.equals(action)) {
                    fireAsyncAction(eventMatchesCreator, launchMode.getLaunchMode(), dispatcherClassCreator.getClassName(),
                            gitHubEventRh, multiplexedEventRh, annotationLiteralArrayRh);
```

## ClassWithoutLogger
### ClassWithoutLogger
Class `PermissionOverrideCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { WriteCommand.class, AdminCommand.class })
@Permission(GHPermissionType.WRITE) // <1>
public class PermissionOverrideCli {

    interface Commands {
```

### ClassWithoutLogger
Class `CommandOptionsCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { CommandOnlyForIssues.class })
public class CommandOptionsCli {

    interface Commands {
```

### ClassWithoutLogger
Class `InjectMetadataCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class })
public class InjectMetadataCli {

    interface Commands {
```

### ClassWithoutLogger
Class `CliOptionsParseErrorMessageCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorMessageCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { ParseErrorMessageCliCommand.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.COMMENT_MESSAGE, parseErrorMessage = "Your custom message") // <1>
public class CliOptionsParseErrorMessageCli {
    // end::parse-error-message[]

```

### ClassWithoutLogger
Class `GitHubInjectionCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class, Command2.class })
public class GitHubInjectionCli {

    interface Commands {
```

### ClassWithoutLogger
Class `CliOptionsParseErrorStrategyCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorStrategyCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { ParseErrorStrategyCliCommand.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.NONE) // <1>
public class CliOptionsParseErrorStrategyCli {
    // end::parse-error-strategy[]

```

### ClassWithoutLogger
Class `TeamPermissionCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { MyTeamCommand.class })
public class TeamPermissionCli {

    interface Commands {
```

### ClassWithoutLogger
Class `CliOptionsDefaultCommandOptionsCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CliOptionsDefaultCommandOptionsCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { DefaultCommandOptionsCliCommand.class })
@CliOptions(defaultCommandOptions = @CommandOptions(scope = CommandScope.ISSUES)) // <1>
public class CliOptionsDefaultCommandOptionsCli {
    // end::default-command-options[]

```

### ClassWithoutLogger
Class `MyFirstCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/MyFirstCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { RetestCommand.class }) // <1>
public class MyFirstCli {

    @Command(name = "retest") // <2>
```

### ClassWithoutLogger
Class `CachedInstallationToken` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/CachedInstallationToken.java`
#### Snippet
```java
import java.util.Date;

class CachedInstallationToken {

    private final String token;
```

### ClassWithoutLogger
Class `GitHubAppRuntimeConfig` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java

@ConfigRoot(name = "github-app", phase = ConfigPhase.RUN_TIME)
public class GitHubAppRuntimeConfig {

    /**
```

### ClassWithoutLogger
Class `ReplayEvent` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java
import io.quarkus.vertx.web.ReactiveRoutes;

public class ReplayEvent implements ReactiveRoutes.ServerSentEvent<GitHubEvent> {

    static final ReplayEvent PING = new ReplayEvent();
```

### ClassWithoutLogger
Class `AbstractHelpCommand` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
import com.github.rvesse.airline.model.GlobalMetadata;

public class AbstractHelpCommand {

    @AirlineInject
```

### ClassWithoutLogger
Class `PrivateKeyUtil` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
 * Slightly adjusted version of code found here: https://stackoverflow.com/a/55339208 .
 */
public class PrivateKeyUtil {

    private static final String PKCS_1_PEM_HEADER = "-----BEGIN RSA PRIVATE KEY-----";
```

### ClassWithoutLogger
Class `CheckedConfigProvider` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
@Singleton
@Startup
public class CheckedConfigProvider {

    private static final Logger LOG = Logger.getLogger(GitHubEvent.class.getPackageName());
```

### ClassWithoutLogger
Class `ErrorHandlerBridgeFunction` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
import io.quarkus.arc.Arc;

public class ErrorHandlerBridgeFunction implements Function<Throwable, Void> {

    private final GitHubEvent gitHubEvent;
```

### ClassWithoutLogger
Class `GroupCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", groups = { @Group(name = "remote", commands = { ListCommand.class, ShowCommand.class }) }) // <1>
public class GroupCli {

    interface Commands {
```

### ClassWithoutLogger
Class `TeamCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java

@Cli(name = "@team", commands = { TestTeam1Command.class, TestTwoTeamsCommand.class })
public class TeamCli {

    @Command(name = "team1")
```

### ClassWithoutLogger
Class `GitHubConfigFileProviderImpl` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

@ApplicationScoped
public class GitHubConfigFileProviderImpl implements GitHubConfigFileProvider {

    private static final List<String> YAML_EXTENSIONS = Arrays.asList(".yml", ".yaml");
```

### ClassWithoutLogger
Class `PayloadSignatureChecker` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

@Singleton
public class PayloadSignatureChecker {

    private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
```

### ClassWithoutLogger
Class `SmeeIoForwarder` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
@ApplicationScoped
@Startup
public class SmeeIoForwarder {

    private static final String EMPTY_MESSAGE = "{}";
```

### ClassWithoutLogger
Class `PayloadInjectionCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class, Command2.class })
public class PayloadInjectionCli {

    interface Commands { // <1>
```

### ClassWithoutLogger
Class `ArgumentsCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { CommandWithArguments.class })
public class ArgumentsCli {

    interface Commands {
```

### ClassWithoutLogger
Class `ArcCommandFactory` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/ArcCommandFactory.java`
#### Snippet
```java
import io.quarkus.arc.Arc;

public class ArcCommandFactory<T> implements CommandFactory<T> {

    @Override
```

### ClassWithoutLogger
Class `PrivateKeyConverter` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java

@Priority(DEFAULT_QUARKUS_CONVERTER_PRIORITY)
public class PrivateKeyConverter implements Converter<PrivateKey>, Serializable {

    public PrivateKeyConverter() {
```

### ClassWithoutLogger
Class `CommandConfig` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java
import io.quarkiverse.githubapp.command.airline.CommandOptions.ReactionStrategy;

public class CommandConfig {

    private final CommandScope scope;
```

### ClassWithoutLogger
Class `CdiInjectionCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

@Cli(name = "@cdi-injection", commands = { TestCommand.class })
public class CdiInjectionCli {

    @Command(name = "test")
```

### ClassWithoutLogger
Class `GHEventPayloadSpyDefaultAnswer` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java
 * if that return value is a {@link GHObject}.
 */
public final class GHEventPayloadSpyDefaultAnswer implements Answer<Object>, Serializable {

    private final GitHub clientSpy;
```

### ClassWithoutLogger
Class `GitHubAppTestingContext` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java
import io.quarkiverse.githubapp.testing.GitHubAppTest;

public final class GitHubAppTestingContext {

    private static GitHubAppTestingContext instance;
```

### ClassWithoutLogger
Class `ReplayEventsRoute` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
@Singleton
@IfBuildProfile("dev")
public class ReplayEventsRoute {

    /**
```

### ClassWithoutLogger
Class `GitHubAppCommandAirlineDotNames` does not declare a logger
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineDotNames.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.IssueComment;

class GitHubAppCommandAirlineDotNames {

    static final DotName DEPENDENT = DotName.createSimple(Dependent.class.getName());
```

### ClassWithoutLogger
Class `GitHubAppTestingResource` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingResource.java`
#### Snippet
```java
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public final class GitHubAppTestingResource implements QuarkusTestResourceLifecycleManager {

    @Override
```

### ClassWithoutLogger
Class `GitHubAppTestingResource` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java
 */
@Deprecated
public final class GitHubAppTestingResource implements QuarkusTestResourceLifecycleManager {

    private io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource delegate = new io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource();
```

### ClassWithoutLogger
Class `PayloadHelper` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
import org.kohsuke.github.GHRepository;

public final class PayloadHelper {

    public static GHRepository getRepository(GHEventPayload eventPayload) {
```

### ClassWithoutLogger
Class `HideAirlineInjectAnnotationsTransformer` does not declare a logger
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/HideAirlineInjectAnnotationsTransformer.java`
#### Snippet
```java
import io.quarkus.arc.processor.DotNames;

public class HideAirlineInjectAnnotationsTransformer implements AnnotationsTransformer {

    private final IndexView index;
```

### ClassWithoutLogger
Class `ExecutionErrorStrategyCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java

@Cli(name = "@execution-error-strategy", commands = { TestCommand1.class })
public class ExecutionErrorStrategyCli {

    @Command(name = "command1")
```

### ClassWithoutLogger
Class `CapturingErrorHandler` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/CapturingErrorHandler.java`
#### Snippet
```java

// For some reason we need to extend DefaultErrorHandler to mock the ErrorHandler... don't ask me why.
public class CapturingErrorHandler extends DefaultErrorHandler {
    public Throwable captured;

```

### ClassWithoutLogger
Class `EventSenderOptionsImpl` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
import okhttp3.RequestBody;

final class EventSenderOptionsImpl implements EventSenderOptions {

    private static final MediaType DEFAULT_MEDIA_TYPE = MediaType.get("application/json");
```

### ClassWithoutLogger
Class `EventDefinition` does not declare a logger
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java
import org.jboss.jandex.DotName;

class EventDefinition {

    private final DotName annotation;
```

### ClassWithoutLogger
Class `ServiceInjectionCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java

@Cli(name = "@service-injection", commands = { TestCommand.class })
public class ServiceInjectionCli {

    @Command(name = "test")
```

### ClassWithoutLogger
Class `DefaultableMocking` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
import org.mockito.stubbing.Answer;

public final class DefaultableMocking<M> {

    private static final MockMaker mockMaker = Plugins.getMockMaker();
```

### ClassWithoutLogger
Class `CompositionCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

@Cli(name = "@composition", commands = { TestCompositionCommand.class })
public class CompositionCli {

    @Command(name = "test")
```

### ClassWithoutLogger
Class `EventContextSpecificationImpl` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java
import io.quarkiverse.githubapp.testing.dsl.TestedAction;

public final class EventContextSpecificationImpl implements EventContextSpecification {
    private final GitHubAppTestingContext testingContext;

```

### ClassWithoutLogger
Class `MultiplexedEvent` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;

public class MultiplexedEvent {

    private final GitHubEvent gitHubEvent;
```

### ClassWithoutLogger
Class `DefaultPermissionCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
        TestAdminPermissionCommand.class })
@Permission(GHPermissionType.WRITE)
public class DefaultPermissionCli {

    @Command(name = "test-no-permission")
```

### ClassWithoutLogger
Class `GitHubAppTesting` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTesting.java`
#### Snippet
```java
import io.quarkiverse.githubapp.testing.internal.GitHubAppTestingContext;

public final class GitHubAppTesting {

    private GitHubAppTesting() {
```

### ClassWithoutLogger
Class `CliConfig` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
import io.quarkiverse.githubapp.command.airline.CliOptions.ParseErrorStrategy;

public class CliConfig {

    private final List<String> aliases;
```

### ClassWithoutLogger
Class `Reactions` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
import org.kohsuke.github.ReactionContent;

public final class Reactions {

    private static final Logger LOGGER = Logger.getLogger(Reactions.class);
```

### ClassWithoutLogger
Class `IndexedGeneratedBeansBuildProducer` does not declare a logger
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
import io.quarkus.deployment.annotations.BuildProducer;

class IndexedGeneratedBeansBuildProducer implements BuildProducer<GeneratedBeanBuildItem> {

    private final BuildProducer<GeneratedBeanBuildItem> delegate;
```

### ClassWithoutLogger
Class `PermissionCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { WriteCommand.class })
public class PermissionCli {

    interface Commands {
```

### ClassWithoutLogger
Class `CdiBean` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CdiBean.java`
#### Snippet
```java

@ApplicationScoped
public class CdiBean {

    public void doSomething() {
```

### ClassWithoutLogger
Class `HelpCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { Command1.class, Command2.class,
        HelpCommand.class }, description = "Your helpful bot doing all sorts of things") // <1>
public class HelpCli {

    interface Commands {
```

### ClassWithoutLogger
Class `CliOptionsAliasesCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CliOptionsAliasesCli.java`
#### Snippet
```java
@Cli(name = "@quarkus-bot", commands = { AliasesCliCommand.class })
@CliOptions(aliases = { "@quarkusbot", "@bot" }) // <1>
public class CliOptionsAliasesCli {
    // end::aliases[]

```

### ClassWithoutLogger
Class `GitHubMockDefaultAnswer` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
 * </ul>
 */
public final class GitHubMockDefaultAnswer implements Answer<Object>, Serializable {

    private final Answer<Object> delegate;
```

### ClassWithoutLogger
Class `ConfigFileReaderCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

@Cli(name = "@config-file-reader", commands = { TestCommand.class })
public class ConfigFileReaderCli {

    @Command(name = "test")
```

### ClassWithoutLogger
Class `DefaultCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
                @Group(name = "group1", commands = { TestGroup1Command1.class, TestGroup1Command2.class }) })
@CliOptions(aliases = "@other-alias")
public class DefaultCli {

    @Command(name = "basic")
```

### ClassWithoutLogger
Class `Headers` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Headers.java`
#### Snippet
```java
package io.quarkiverse.githubapp.runtime;

public final class Headers {

    public static final String X_REQUEST_ID = "X-Request-ID";
```

### ClassWithoutLogger
Class `GitHubFileDownloader` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubFileDownloader.java`
#### Snippet
```java

@ApplicationScoped
public class GitHubFileDownloader {

    private static final Logger LOG = Logger.getLogger(GitHubFileDownloader.class);
```

### ClassWithoutLogger
Class `JwtTokenCreator` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/JwtTokenCreator.java`
#### Snippet
```java

@Singleton
public class JwtTokenCreator {

    public String createJwtToken(String githubAppId, PrivateKey privateKey, long ttlSeconds)
```

### ClassWithoutLogger
Class `CatchAllEventListener` does not declare a logger
in `integration-tests/app/src/main/java/io/quarkiverse/githubapp/it/app/CatchAllEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.Issue;

public class CatchAllEventListener {

    void onEvent(@Issue GHEventPayload.Issue payload) throws IOException {
```

### ClassWithoutLogger
Class `DispatchingConfiguration` does not declare a logger
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
import org.jboss.jandex.MethodInfo;

class DispatchingConfiguration {

    private final Map<String, EventDispatchingConfiguration> eventConfigurations = new TreeMap<>();
```

### ClassWithoutLogger
Class `MyConfigFile` does not declare a logger
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
import java.util.Objects;

public class MyConfigFile {

    public String someProperty;
```

### ClassWithoutLogger
Class `ParseErrorStrategyCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
@Cli(name = "@parse-error-strategy", commands = { TestCommand1.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.COMMENT_MESSAGE, parseErrorMessage = "test parse error message: %s")
public class ParseErrorStrategyCli {

    @Command(name = "command1")
```

### ClassWithoutLogger
Class `PullRequestEventListener` does not declare a logger
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/PullRequestEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.it.testingframework.config.MyConfigFile;

class PullRequestEventListener {

    public static Behavior behavior;
```

### ClassWithoutLogger
Class `IssueEventListener` does not declare a logger
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/IssueEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.it.testingframework.config.MyConfigFile;

class IssueEventListener {

    public static Behavior behavior;
```

### ClassWithoutLogger
Class `DefaultTeamCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
@Cli(name = "@default-team", commands = { TestNoTeamsCommand.class, TestTeam2Command.class })
@Team("my-team-1")
public class DefaultTeamCli {

    @Command(name = "no-teams")
```

### ClassWithoutLogger
Class `GitHubEvent` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
import io.vertx.core.json.JsonObject;

public class GitHubEvent {

    private final Long installationId;
```

### ClassWithoutLogger
Class `Actions` does not declare a logger
in `events/src/main/java/io/quarkiverse/githubapp/event/Actions.java`
#### Snippet
```java
package io.quarkiverse.githubapp.event;

public final class Actions {

    public static final String ALL = "*";
```

### ClassWithoutLogger
Class `UtilsProducer` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/UtilsProducer.java`
#### Snippet
```java

@Singleton
public class UtilsProducer {

    @Produces
```

### ClassWithoutLogger
Class `ParseErrorCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java

@Cli(name = "@parse-error", description = "Default parse error behavior", commands = { TestCommand1.class })
public class ParseErrorCli {

    @Command(name = "command1", description = "Command 1")
```

### ClassWithoutLogger
Class `CommandLineParseErrorCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java

@Cli(name = "@command-line-parse-error", commands = { TestCommand1.class })
public class CommandLineParseErrorCli {

    @Command(name = "command1", description = "Command 1")
```

### ClassWithoutLogger
Class `BackgroundProcessor` does not declare a logger
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java

@ApplicationScoped
public class BackgroundProcessor {

    public static Behavior behavior;
```

### ClassWithoutLogger
Class `CommandTeamConfig` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandTeamConfig.java`
#### Snippet
```java
import java.util.Set;

public class CommandTeamConfig {

    private final Set<String> teams;
```

### ClassWithoutLogger
Class `Commandline` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
 * Will require some improvements regarding escaping.
 */
public final class Commandline {

    private Commandline() {
```

### ClassWithoutLogger
Class `ValidatableEventHandlingImpl` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/ValidatableEventHandlingImpl.java`
#### Snippet
```java
import io.quarkiverse.githubapp.testing.dsl.ValidatableEventHandling;

final class ValidatableEventHandlingImpl implements ValidatableEventHandling {

    private final GitHubAppTestingContext testingContext;
```

### ClassWithoutLogger
Class `DefaultCommandOptionsCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
@Cli(name = "@default-command-options", commands = { TestCommand1.class, TestCommand2.class })
@CliOptions(defaultCommandOptions = @CommandOptions(scope = CommandScope.ISSUES))
public class DefaultCommandOptionsCli {

    @Command(name = "command1")
```

### ClassWithoutLogger
Class `ParseErrorStrategyNoneCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
@Cli(name = "@parse-error-strategy-none", commands = { TestCommand1.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.NONE)
public class ParseErrorStrategyNoneCli {

    @Command(name = "command1")
```

### ClassWithoutLogger
Class `RequestScopeCachingGitHubConfigFileProvider` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java

@RequestScoped
public class RequestScopeCachingGitHubConfigFileProvider {

    @Inject
```

### ClassWithoutLogger
Class `ArcSubclassesCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
        TestSubclassCommand1.class, TestSubclassCommand2.class })
@CliOptions(defaultCommandOptions = @CommandOptions(scope = CommandScope.ISSUES))
public class ArcSubclassesCli {

    @Command(name = "application-scoped-command1")
```

### ClassWithoutLogger
Class `ExecutionErrorCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java

@Cli(name = "@execution-error", commands = { TestCommand1.class })
public class ExecutionErrorCli {

    @Command(name = "command1")
```

### ClassWithoutLogger
Class `EventHandlingResponseImpl` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventHandlingResponseImpl.java`
#### Snippet
```java
import io.quarkiverse.githubapp.testing.dsl.EventHandlingResponse;

final class EventHandlingResponseImpl implements EventHandlingResponse {

    private final GitHubAppTestingContext testingContext;
```

### ClassWithoutLogger
Class `MockitoUtils` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/MockitoUtils.java`
#### Snippet
```java
import java.util.function.Supplier;

public class MockitoUtils {

    private MockitoUtils() {
```

### ClassWithoutLogger
Class `AdditionalEventDispatchingClassesIndexBuildItem` does not declare a logger
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/AdditionalEventDispatchingClassesIndexBuildItem.java`
#### Snippet
```java
import io.quarkus.builder.item.MultiBuildItem;

public final class AdditionalEventDispatchingClassesIndexBuildItem extends MultiBuildItem {

    private final IndexView index;
```

### ClassWithoutLogger
Class `GitHubAppDotNames` does not declare a logger
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppDotNames.java`
#### Snippet
```java
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;

final class GitHubAppDotNames {

    static final DotName EVENT = DotName.createSimple(Event.class.getName());
```

### ClassWithoutLogger
Class `VetoUserDefinedEventListeningClassesAnnotationsTransformer` does not declare a logger
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/VetoUserDefinedEventListeningClassesAnnotationsTransformer.java`
#### Snippet
```java
import io.quarkus.arc.processor.DotNames;

class VetoUserDefinedEventListeningClassesAnnotationsTransformer implements AnnotationsTransformer {

    private final Set<DotName> eventDefinitionAnnotations;
```

### ClassWithoutLogger
Class `GitHubAppTestingCallback` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java
import io.quarkus.test.junit.callback.QuarkusTestAfterConstructCallback;

public final class GitHubAppTestingCallback
        implements QuarkusTestAfterConstructCallback {

```

### ClassWithoutLogger
Class `CommandPermissionConfig` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandPermissionConfig.java`
#### Snippet
```java
import org.kohsuke.github.GHPermissionType;

public class CommandPermissionConfig {

    private final GHPermissionType permission;
```

### ClassWithoutLogger
Class `GitHubMockContextImpl` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;

public final class GitHubMockContextImpl implements GitHubMockContext, GitHubMockSetupContext, GitHubMockVerificationContext {

    final GitHubService service;
```

### ClassWithoutLogger
Class `Routes` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

@Singleton
public class Routes {

    private static final Logger LOG = Logger.getLogger(GitHubEvent.class.getPackageName());
```

### ClassWithoutLogger
Class `HelpCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

@Cli(name = "@help", description = "Testing help generation", commands = { TestCommand1.class, HelpCommand.class })
public class HelpCli {

    @Command(name = "command1", description = "Command 1")
```

### ClassWithoutLogger
Class `DefaultErrorHandler` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
@ApplicationScoped
@DefaultBean
public class DefaultErrorHandler implements ErrorHandler {

    private static final Logger LOG = Logger.getLogger(GitHubEvent.class.getPackageName());
```

### ClassWithoutLogger
Class `PermissionCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
@Cli(name = "@permission", commands = { TestNoPermissionCommand.class, TestWritePermissionCommand.class,
        TestAdminPermissionCommand.class })
public class PermissionCli {

    @Command(name = "test-no-permission")
```

### ClassWithoutLogger
Class `ReactionStrategyCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
@Cli(name = "@reaction-strategy", commands = { TestNoneCommand.class, TestProgressCommand.class, TestProgressErrorCommand.class,
        TestAllCommand.class })
public class ReactionStrategyCli {

    @Command(name = "none")
```

### ClassWithoutLogger
Class `GHObjectSpyDefaultAnswer` does not declare a logger
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
 * For all other methods, this will just call the mocked behavior.
 */
public final class GHObjectSpyDefaultAnswer implements Answer<Object>, Serializable {

    private final GitHub clientSpy;
```

### ClassWithoutLogger
Class `AbstractCommandDispatcher` does not declare a logger
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
import io.quarkiverse.githubapp.command.airline.runtime.util.Reactions;

public abstract class AbstractCommandDispatcher<C> {

    private static final Logger LOGGER = Logger.getLogger(AbstractCommandDispatcher.class);
```

### ClassWithoutLogger
Class `GitHubAppRecorder` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/GitHubAppRecorder.java`
#### Snippet
```java

@Recorder
public class GitHubAppRecorder {

    public Handler<RoutingContext> replayUiHandler(String replayUiFinalDestination, String replayUiPath,
```

### ClassWithoutLogger
Class `CompositionCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@composition", commands = { TestCompositionCommand.class })
public class CompositionCli {

    @Command(name = "test")
```

### ClassWithoutLogger
Class `CdiInjectionCli` does not declare a logger
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class })
public class CdiInjectionCli {

    interface Commands {
```

### ClassWithoutLogger
Class `ReactionStrategyOverrideCli` does not declare a logger
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
@Cli(name = "@reaction-strategy-override", commands = { TestNoOverrideCommand.class, TestOverrideCommand.class })
@CliOptions(defaultCommandOptions = @CommandOptions(reactionStrategy = ReactionStrategy.NONE))
public class ReactionStrategyOverrideCli {

    @Command(name = "no-override")
```

### ClassWithoutLogger
Class `GitHubAppCommandAirlineProcessor` does not declare a logger
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
import io.quarkus.gizmo.TryBlock;

class GitHubAppCommandAirlineProcessor {

    private static final String FEATURE = "github-app-command-airline";
```

### ClassWithoutLogger
Class `GitHubService` does not declare a logger
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

@ApplicationScoped
public class GitHubService implements GitHubClientProvider {

    private static final String AUTHORIZATION_HEADER = "Authorization";
```

### ClassWithoutLogger
Class `GitHubAppProcessor` does not declare a logger
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
import io.vertx.ext.web.RoutingContext;

class GitHubAppProcessor {

    private static final Logger LOG = Logger.getLogger(GitHubAppProcessor.class);
```

## MethodCount
### MethodCount
`GitHubAppCommandAirlineProcessor` has too many methods (method count = 22)
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
import io.quarkus.gizmo.TryBlock;

class GitHubAppCommandAirlineProcessor {

    private static final String FEATURE = "github-app-command-airline";
```

## ReturnOfInnerClass
### ReturnOfInnerClass
Return of instance of anonymous class
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    @Override
    public GitHubMockConfigFileSetupContext configFile(GHRepository repository, String pathInRepository) {
        return new GitHubMockConfigFileSetupContext() {

            private String ref;
```

### ReturnOfInnerClass
Return of instance of non-static inner class `MockMap`
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
            throw new IllegalArgumentException("Type must not be GHRepository -- there is a bug in the testing helper.");
        }
        return (MockMap<Long, T>) nonRepositoryGHObjectMockMaps.computeIfAbsent(type,
                clazz -> new MockMap<>(type));
    }
```

## UnusedReturnValue
### UnusedReturnValue
Return value of the method is never used
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    }

    private static ResultHandle createReaction(BytecodeCreator bytecodeCreator, ResultHandle issueCommentPayloadRh,
            ReactionContent reactionContent) {
        return bytecodeCreator.invokeStaticMethod(
```

### UnusedReturnValue
Return value of the method is never used
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        }

        public EventDispatchingConfiguration addEventAnnotation(String action, AnnotationInstance annotationInstance,
                List<AnnotationValue> values) {
            eventAnnotations.put(action, new EventAnnotation(annotationInstance.name(), values));
```

### UnusedReturnValue
Return value of the method is never used
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    }

    private static ResultHandle fireAsyncAction(BytecodeCreator bytecodeCreator, LaunchMode launchMode, String className,
            ResultHandle gitHubEventRh, ResultHandle multiplexedEventRh, ResultHandle annotationLiteralArrayRh) {
        ResultHandle cdiEventRh = bytecodeCreator.invokeInterfaceMethod(EVENT_SELECT,
```

### UnusedReturnValue
Return value of the method is never used
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/ValidatableEventHandling.java`
#### Snippet
```java

public interface ValidatableEventHandling {
    <T extends Throwable> ValidatableEventHandling github(GitHubMockVerification<T> verification) throws T;
}

```

### UnusedReturnValue
Return value of the method is never used
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    }

    private static Object call(Object self, InvocationOnMock invocation) throws Throwable {
        Object[] argumentsForJava = unexpandArguments(invocation);
        return invocation.getMethod().invoke(self, argumentsForJava);
```

## AnonymousClassComplexity
### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 5)
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    @Override
    public GitHubMockConfigFileSetupContext configFile(GHRepository repository, String pathInRepository) {
        return new GitHubMockConfigFileSetupContext() {

            private String ref;
```

## UncheckedExceptionClass
### UncheckedExceptionClass
Unchecked exception class `CommandExecutionException`
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandExecutionException.java`
#### Snippet
```java
package io.quarkiverse.githubapp.command.airline.runtime;

public class CommandExecutionException extends RuntimeException {

    public CommandExecutionException(String message, Exception cause) {
```

### UncheckedExceptionClass
Unchecked exception class `GitHubAppConfigurationException`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppConfigurationException.java`
#### Snippet
```java
package io.quarkiverse.githubapp.runtime.config;

public class GitHubAppConfigurationException extends RuntimeException {

    GitHubAppConfigurationException(String message) {
```

## Deprecation
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

## ConstantConditions
### ConstantConditions
Method invocation `getToken` may produce `NullPointerException`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
        DynamicGraphQLClient graphQLClient = DynamicGraphQLClientBuilder.newBuilder()
                .url(checkedConfigProvider.instanceEndpoint() + "/graphql")
                .header(AUTHORIZATION_HEADER, String.format(AUTHORIZATION_HEADER_BEARER, installationToken.getToken()))
                .build();

```

### ConstantConditions
Method invocation `getToken` may produce `NullPointerException`
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        final GitHubBuilder gitHubBuilder = new GitHubBuilder()
                .withAppInstallationToken(installationToken.getToken())
                .withEndpoint(checkedConfigProvider.instanceEndpoint());

```

## RedundantThrows
### RedundantThrows
The declared exception `IOException` is never thrown
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
    public List<String> command = new ArrayList<>();

    public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
        try {
            ByteArrayOutputStream helpOs = new ByteArrayOutputStream();
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    @BuildStep
    void replayUiDeployment(LaunchModeBuildItem launchMode,
            BuildProducer<WebJarBuildItem> webJars) throws IOException {
        if (launchMode.getLaunchMode() != LaunchMode.DEVELOPMENT) {
            return;
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
            ShutdownContextBuildItem shutdownContext,
            BuildProducer<RouteBuildItem> routes,
            BuildProducer<NotFoundPageDisplayableEndpointBuildItem> displayableEndpoints) throws IOException {
        if (launchMode.getLaunchMode() != LaunchMode.DEVELOPMENT) {
            return;
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            cdiBean.doSomething();
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something with the gitHub client
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something with the gitHub client
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // ...
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            throw new RuntimeException("Execution error");
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            throw new RuntimeException("Execution error");
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### RedundantThrows
The declared exception `IOException` is never thrown in any method implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

    private DynamicGraphQLClient createInstallationGraphQLClient(long installationId)
            throws IOException, ExecutionException, InterruptedException {
        CachedInstallationToken installationToken = installationTokenCache.get(installationId);

```

### RedundantThrows
The declared exception `Exception` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        @Override
        public CachedInstallationToken load(Long installationId) throws Exception {
            try {
                GHAppInstallationToken installationToken = createApplicationGitHub().getApp()
```

### RedundantThrows
The declared exception `GeneralSecurityException` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/JwtTokenCreator.java`
#### Snippet
```java

    public String createJwtToken(String githubAppId, PrivateKey privateKey, long ttlSeconds)
            throws GeneralSecurityException, IOException {
        // Let's set the JWT Claims
        var jwtClaimsBuilder = Jwt.issuer(githubAppId);
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/JwtTokenCreator.java`
#### Snippet
```java

    public String createJwtToken(String githubAppId, PrivateKey privateKey, long ttlSeconds)
            throws GeneralSecurityException, IOException {
        // Let's set the JWT Claims
        var jwtClaimsBuilder = Jwt.issuer(githubAppId);
```

### RedundantThrows
The declared exception `Exception` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onOpen() throws Exception {
        }

```

### RedundantThrows
The declared exception `Exception` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onClosed() throws Exception {
        }

```

### RedundantThrows
The declared exception `Exception` is never thrown
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onComment(String comment) throws Exception {
        }

```

## ParametersPerConstructor
### ParametersPerConstructor
`CliConfig()` has too many parameters (num parameters = 6)
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    }

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### ParametersPerConstructor
`GitHubEvent()` has too many parameters (num parameters = 9)
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

## ClassWithOnlyPrivateConstructors
### ClassWithOnlyPrivateConstructors
Class `SimpleEventHandler` with only 'private' constructors should be declared 'final'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
    }

    private static class SimpleEventHandler implements EventHandler {

        private final OkHttpClient client;
```

### ClassWithOnlyPrivateConstructors
Class `MockitoUtils` with only 'private' constructors should be declared 'final'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/MockitoUtils.java`
#### Snippet
```java
import java.util.function.Supplier;

public class MockitoUtils {

    private MockitoUtils() {
```

### ClassWithOnlyPrivateConstructors
Class `RunMethod` with only 'private' constructors should be declared 'final'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
    }

    private static class RunMethod {

        private final ClassInfo clazz;
```

## PublicMethodWithoutLogging
### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorMessageCli.java`
#### Snippet
```java

        @Override
        public void run() {
        }
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // ...
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something with the gitHub client
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something with the gitHub client
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorStrategyCli.java`
#### Snippet
```java

        @Override
        public void run() {
        }
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CliOptionsDefaultCommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run() {
        }
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/MyFirstCli.java`
#### Snippet
```java

        @Override
        public void run() { // <4>
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `client()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockContext.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true)
    default GitHub client(long installationId) {
        return installationClient(installationId);
    }
```

### PublicMethodWithoutLogging
'public' method `graphQLClient()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockContext.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true)
    default DynamicGraphQLClient graphQLClient(long installationId) {
        return installationGraphQLClient(installationId);
    }
```

### PublicMethodWithoutLogging
'public' method `configFileFromClasspath()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockSetupContext.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true)
    default void configFileFromClasspath(String pathInRepository, String pathInClasspath) throws IOException {
        configFile(pathInRepository).fromClasspath(pathInClasspath);
    }
```

### PublicMethodWithoutLogging
'public' method `configFileFromString()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockSetupContext.java`
#### Snippet
```java
     */
    @Deprecated
    default void configFileFromString(String pathInRepository, String configFile) {
        configFile(pathInRepository).fromString(configFile);
    }
```

### PublicMethodWithoutLogging
'public' method `event()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java

    @Override
    public String event() {
        return event;
    }
```

### PublicMethodWithoutLogging
'public' method `data()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java

    @Override
    public GitHubEvent data() {
        return gitHubEvent;
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
    public List<String> command = new ArrayList<>();

    public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
        try {
            ByteArrayOutputStream helpOs = new ByteArrayOutputStream();
```

### PublicMethodWithoutLogging
'public' method `loadKey()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
    private static final String PKCS_8_PEM_FOOTER = "-----END PRIVATE KEY-----";

    public static PrivateKey loadKey(String keyDataString) throws GeneralSecurityException {
        if (keyDataString.contains(PKCS_1_PEM_HEADER)) {
            // OpenSSL / PKCS#1 Base64 PEM encoded file
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java

    @Override
    public Void apply(Throwable t) {
        Arc.container().instance(ErrorHandler.class).get().handleError(gitHubEvent, payload, t);
        return null;
```

### PublicMethodWithoutLogging
'public' method `getEffectiveSource()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public ConfigFile.Source getEffectiveSource(ConfigFile.Source source) {
        if (source == ConfigFile.Source.DEFAULT) {
            return gitHubAppRuntimeConfig.readConfigFilesFromSourceRepository ? ConfigFile.Source.SOURCE_REPOSITORY
```

### PublicMethodWithoutLogging
'public' method `privateKey()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public PrivateKey privateKey() {
        if (launchMode == LaunchMode.TEST) {
            checkConfig();
```

### PublicMethodWithoutLogging
'public' method `webhookSecret()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public Optional<String> webhookSecret() {
        return gitHubAppRuntimeConfig.webhookSecret;
    }
```

### PublicMethodWithoutLogging
'public' method `appName()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public Optional<String> appName() {
        return gitHubAppRuntimeConfig.appName;
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `instanceEndpoint()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public String instanceEndpoint() {
        return gitHubAppRuntimeConfig.instanceEndpoint;
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `checkConfig()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public void checkConfig() {
        if (missingPropertyKeys.isEmpty()) {
            return;
```

### PublicMethodWithoutLogging
'public' method `webhookProxyUrl()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public Optional<String> webhookProxyUrl() {
        return gitHubAppRuntimeConfig.webhookProxyUrl;
    }
```

### PublicMethodWithoutLogging
'public' method `debug()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public Debug debug() {
        return gitHubAppRuntimeConfig.debug;
    }
```

### PublicMethodWithoutLogging
'public' method `appId()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    }

    public String appId() {
        if (launchMode == LaunchMode.TEST) {
            checkConfig();
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @team two-teams");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @team team1");
        }
```

### PublicMethodWithoutLogging
'public' method `hex()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public static String hex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte aByte : bytes) {
```

### PublicMethodWithoutLogging
'public' method `supportsClone()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public static boolean supportsClone(Mac mac) {
        try {
            mac.clone();
```

### PublicMethodWithoutLogging
'public' method `matches()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public boolean matches(byte[] payload, String headerSignature) {
        if (secretKeySpec == null || sharedMac == null) {
            throw new IllegalStateException("Payload signature checking is disabled, this method should not be called");
```

### PublicMethodWithoutLogging
'public' method `getMacInstance()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public Mac getMacInstance() {
        if (supportsClone) {
            try {
```

### PublicMethodWithoutLogging
'public' method `createNewMacInstance()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public static Mac createNewMacInstance(SecretKeySpec secretKeySpec) {
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
```

### PublicMethodWithoutLogging
'public' method `fetchConfigFile()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> fetchConfigFile(GHRepository repository, String path, ConfigFile.Source source, Class<T> type) {
        return fetchConfigFile(repository, null, path, source, type);
    }
```

### PublicMethodWithoutLogging
'public' method `getFilePath()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
    }

    public static String getFilePath(String path) {
        String trimmedPath = path.trim();

```

### PublicMethodWithoutLogging
'public' method `fetchConfigFile()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> fetchConfigFile(GHRepository repository, String ref, String path, ConfigFile.Source source,
            Class<T> type) {
        GHRepository configGHRepository = getConfigRepository(repository, source, path);
```

### PublicMethodWithoutLogging
'public' method `onError()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onError(Throwable t) {
        }
    }
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onMessage(String event, MessageEvent messageEvent) throws Exception {
            if (EMPTY_MESSAGE.equals(messageEvent.getData())) {
                return;
```

### PublicMethodWithoutLogging
'public' method `onClosed()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onClosed() throws Exception {
        }

```

### PublicMethodWithoutLogging
'public' method `onOpen()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onOpen() throws Exception {
        }

```

### PublicMethodWithoutLogging
'public' method `onComment()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

        @Override
        public void onComment(String comment) throws Exception {
        }

```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (issueCommentPayload.getIssue().isPullRequest()) {
                GHPullRequest pullRequest = issueCommentPayload.getRepository()
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException { // <3>
            issueCommentPayload.getIssue().comment("Ack");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("Hello " + String.join(", ", usernames)); // <2>
        }
```

### PublicMethodWithoutLogging
'public' method `createInstance()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/ArcCommandFactory.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public T createInstance(Class<?> type) {
        T instance = (T) Arc.container().instance(type).get();

```

### PublicMethodWithoutLogging
'public' method `convert()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/PrivateKeyConverter.java`
#### Snippet
```java

    @Override
    public PrivateKey convert(final String value) {
        String privateKeyValue = value.trim();

```

### PublicMethodWithoutLogging
'public' method `hello()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java
        public static final String HELLO = "hello from service1";

        public String hello() {
            return HELLO;
        }
```

### PublicMethodWithoutLogging
'public' method `clock()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java
        @Produces
        @ApplicationScoped
        public Clock clock() {
            return Clock.system(ZoneOffset.UTC);
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, Service2 service2) throws IOException {
            issueCommentPayload.getIssue()
                    .comment(service1.hello() + " - " + service2.hello() + " - " + globalMetadata.getName());
```

### PublicMethodWithoutLogging
'public' method `hello()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java
        public static final String HELLO = "hello from service2";

        public String hello() {
            return HELLO;
        }
```

### PublicMethodWithoutLogging
'public' method `answer()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java

    @Override
    public Object answer(InvocationOnMock invocation) throws Throwable {
        Object original = invocation.callRealMethod();
        if (!(original instanceof GHObject)) {
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java
    }

    public static GitHubAppTestingContext get() {
        return instance;
    }
```

### PublicMethodWithoutLogging
'public' method `set()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java
    private static GitHubAppTestingContext instance;

    public static void set(Object testInstance) {
        GitHubAppTest annotation = testInstance.getClass().getAnnotation(GitHubAppTest.class);
        Answers defaultAnswer = Answers.RETURNS_DEFAULTS;
```

### PublicMethodWithoutLogging
'public' method `reset()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java
    }

    public static void reset() {
        instance = null;
    }
```

### PublicMethodWithoutLogging
'public' method `pushEvent()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
    }

    public void pushEvent(GitHubEvent gitHubEvent) {
        ReplayEvent replayEvent = new ReplayEvent(gitHubEvent);

```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingResource.java`
#### Snippet
```java

    @Override
    public Map<String, String> start() {
        Map<String, String> configProperties = new HashMap<>();
        GitHubAppTestingCallback.enable(configProperties);
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingResource.java`
#### Snippet
```java

    @Override
    public void stop() {
        // Nothing to do
    }
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java

    @Override
    public void stop() {
        // Nothing to do
    }
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java

    @Override
    public Map<String, String> start() {
        Map<String, String> configProperties = new HashMap<>();
        GitHubAppTestingCallback.enable(configProperties);
```

### PublicMethodWithoutLogging
'public' method `appliesTo()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/HideAirlineInjectAnnotationsTransformer.java`
#### Snippet
```java

    @Override
    public boolean appliesTo(Kind kind) {
        return Kind.FIELD == kind;
    }
```

### PublicMethodWithoutLogging
'public' method `transform()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/HideAirlineInjectAnnotationsTransformer.java`
#### Snippet
```java

    @Override
    public void transform(TransformationContext transformationContext) {
        FieldInfo fieldInfo = transformationContext.getTarget().asField();

```

### PublicMethodWithoutLogging
'public' method `getContext()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
    }

    public static Optional<String> getContext(GHEventPayload eventPayload) {
        if (eventPayload instanceof GHEventPayload.CheckRun) {
            return Optional.of(((GHEventPayload.CheckRun) eventPayload).getCheckRun().getDetailsUrl().toString());
```

### PublicMethodWithoutLogging
'public' method `getRepository()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
public final class PayloadHelper {

    public static GHRepository getRepository(GHEventPayload eventPayload) {
        GHRepository repository = eventPayload.getRepository();

```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            throw new RuntimeException("Execution error");
        }
```

### PublicMethodWithoutLogging
'public' method `handleError()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/CapturingErrorHandler.java`
#### Snippet
```java

    @Override
    public void handleError(GitHubEvent gitHubEvent, GHEventPayload payload, Throwable t) {
        captured = t;
    }
```

### PublicMethodWithoutLogging
'public' method `payloadFromString()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions payloadFromString(String payload, String contentType) {
        return payloadFromString(payload, MediaType.get(contentType));
    }
```

### PublicMethodWithoutLogging
'public' method `event()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventHandlingResponseImpl event(GHEvent event, boolean ignoreExceptions) {
        OkHttpClient httpClient = clientBuilder.build();
        Call call = httpClient.newCall(new Request.Builder()
```

### PublicMethodWithoutLogging
'public' method `payloadFromClasspath()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions payloadFromClasspath(String path, String contentType) throws IOException {
        return payloadFromClasspath(path, MediaType.get(contentType));
    }
```

### PublicMethodWithoutLogging
'public' method `event()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventHandlingResponseImpl event(GHEvent event) {
        return event(event, false);
    }
```

### PublicMethodWithoutLogging
'public' method `requestId()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
```

### PublicMethodWithoutLogging
'public' method `payloadFromString()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions payloadFromString(String payload) {
        return payloadFromString(payload, DEFAULT_MEDIA_TYPE);
    }
```

### PublicMethodWithoutLogging
'public' method `deliveryId()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions deliveryId(UUID deliveryId) {
        this.deliveryId = deliveryId;
        return this;
```

### PublicMethodWithoutLogging
'public' method `payloadFromClasspath()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptionsImpl payloadFromClasspath(String path) throws IOException {
        return payloadFromClasspath(path, DEFAULT_MEDIA_TYPE);
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub)
                throws IOException {
            assertThat(issueCommentPayload).isInstanceOf(GHEventPayload.IssueComment.class);
```

### PublicMethodWithoutLogging
'public' method `invoke()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java

                    @Override
                    public Object invoke() throws Throwable {
                        return invocationOnMockProxy.callRealMethod();
                    }
```

### PublicMethodWithoutLogging
'public' method `isInvokable()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
                new RealMethod() {
                    @Override
                    public boolean isInvokable() {
                        return true;
                    }
```

### PublicMethodWithoutLogging
'public' method `mock()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    }

    public M mock() {
        return mock;
    }
```

### PublicMethodWithoutLogging
'public' method `create()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private static final MockMaker mockMaker = Plugins.getMockMaker();

    public static <M> DefaultableMocking<M> create(Class<M> clazz, Object id, Consumer<MockSettings> mockSettingsContributor) {
        StubDetectingInvocationListener listener = new StubDetectingInvocationListener();
        MockSettings mockSettings = Mockito.withSettings().name(clazz.getSimpleName() + "#" + id)
```

### PublicMethodWithoutLogging
'public' method `reportInvocation()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java

        @Override
        public void reportInvocation(MethodInvocationReport methodInvocationReport) {
            lastInvocationWasMocked = methodInvocationReport.getLocationOfStubbing() != null;
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
```

### PublicMethodWithoutLogging
'public' method `github()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java

    @Override
    public <T extends Throwable> EventContextSpecificationImpl github(GitHubMockSetup<T> gitHubMockSetup) throws T {
        gitHubMockSetup.setup(testingContext.mocks);
        return this;
```

### PublicMethodWithoutLogging
'public' method `when()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java

    @Override
    public <T extends Throwable> EventHandlingResponseImpl when(TestedAction<T> action) throws T {
        action.run();
        return new EventHandlingResponseImpl(testingContext);
```

### PublicMethodWithoutLogging
'public' method `when()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptionsImpl when() {
        return new EventSenderOptionsImpl(testingContext);
    }
```

### PublicMethodWithoutLogging
'public' method `getGitHubGraphQLClient()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    }

    public DynamicGraphQLClient getGitHubGraphQLClient() {
        if (gitHubGraphQLClient == null) {
            throw new IllegalStateException("The GraphQL client has not been initialized and should not be accessed.");
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-permission test-no-permission");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-permission test-read-permission");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-permission test-admin-permission");
        }
```

### PublicMethodWithoutLogging
'public' method `given()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTesting.java`
#### Snippet
```java
    }

    public static EventContextSpecification given() {
        return new EventContextSpecificationImpl(GitHubAppTestingContext.get());
    }
```

### PublicMethodWithoutLogging
'public' method `when()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTesting.java`
#### Snippet
```java
    }

    public static EventSenderOptions when() {
        return given().when();
    }
```

### PublicMethodWithoutLogging
'public' method `deleteReaction()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
    }

    public static void deleteReaction(GHEventPayload.IssueComment issueCommentPayload, GHReaction reaction) {
        if (reaction == null) {
            return;
```

### PublicMethodWithoutLogging
'public' method `createReaction()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
    private static final Logger LOGGER = Logger.getLogger(Reactions.class);

    public static GHReaction createReaction(GHEventPayload.IssueComment issueCommentPayload, ReactionContent reactionContent) {
        try {
            return issueCommentPayload.getComment().createReaction(reactionContent);
```

### PublicMethodWithoutLogging
'public' method `getIndex()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
    }

    public IndexView getIndex() {
        return indexer.complete();
    }
```

### PublicMethodWithoutLogging
'public' method `produce()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java

    @Override
    public void produce(GeneratedBeanBuildItem generatedBean) {
        delegate.produce(generatedBean);
        try {
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java

        @Override
        public void run() throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `doSomething()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CdiBean.java`
#### Snippet
```java
public class CdiBean {

    public void doSomething() {
    }
}
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CliOptionsAliasesCli.java`
#### Snippet
```java

        @Override
        public void run() {
        }
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            // do something
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException {
            super.run(issueCommentPayload); // <4>
        }
```

### PublicMethodWithoutLogging
'public' method `answer()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java

    @Override
    public Object answer(InvocationOnMock invocation) throws Throwable {
        Method method = invocation.getMethod();
        if (method.getParameterCount() == 1) {
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload, MyConfigBean myConfigBean) throws IOException {
            issueCommentPayload.getIssue().comment(myConfigBean.getHello());
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default group1 command1");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default basic");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default command-with-arguments " + String.join(",", arguments));
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default group1 command2");
        }
```

### PublicMethodWithoutLogging
'public' method `getFileContent()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubFileDownloader.java`
#### Snippet
```java

    @SuppressWarnings("deprecation")
    public Optional<String> getFileContent(GHRepository ghRepository, String ref, String fullPath) {
        try {
            GHContent ghContent = ghRepository.getFileContent(fullPath, ref);
```

### PublicMethodWithoutLogging
'public' method `createJwtToken()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/JwtTokenCreator.java`
#### Snippet
```java
public class JwtTokenCreator {

    public String createJwtToken(String githubAppId, PrivateKey privateKey, long ttlSeconds)
            throws GeneralSecurityException, IOException {
        // Let's set the JWT Claims
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        @Override
        public int compareTo(EventAnnotation other) {
            int nameCompareTo = name.compareTo(other.name);
            if (nameCompareTo != 0) {
```

### PublicMethodWithoutLogging
'public' method `addEventAnnotation()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        }

        public EventDispatchingConfiguration addEventAnnotation(String action, AnnotationInstance annotationInstance,
                List<AnnotationValue> values) {
            eventAnnotations.put(action, new EventAnnotation(annotationInstance.name(), values));
```

### PublicMethodWithoutLogging
'public' method `hashCode()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        @Override
        public int hashCode() {
            return Objects.hash(name, attributes);
        }
```

### PublicMethodWithoutLogging
'public' method `requiresGraphQLClient()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    public boolean requiresGraphQLClient() {
        for (EventDispatchingMethod eventDispatchingMethod : methods.values().stream().flatMap(Set::stream)
                .collect(Collectors.toList())) {
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        @Override
        public int compareTo(EventDispatchingMethod other) {
            int classNameCompareTo = method.declaringClass().name().compareTo(other.method.declaringClass().name());
            if (classNameCompareTo != 0) {
```

### PublicMethodWithoutLogging
'public' method `getEventAnnotationLiterals()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        }

        public Set<EventAnnotationLiteral> getEventAnnotationLiterals() {
            Set<EventAnnotationLiteral> literals = new HashSet<>();
            for (EventAnnotation eventAnnotation : eventAnnotations.values()) {
```

### PublicMethodWithoutLogging
'public' method `getOrCreateEventConfiguration()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    public EventDispatchingConfiguration getOrCreateEventConfiguration(String event, String payloadType) {
        return eventConfigurations.computeIfAbsent(event, et -> new EventDispatchingConfiguration(event, payloadType));
    }
```

### PublicMethodWithoutLogging
'public' method `requiresGraphQLClient()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        }

        public boolean requiresGraphQLClient() {
            return method.parameterTypes().stream().map(t -> t.name()).anyMatch(n -> DYNAMIC_GRAPHQL_CLIENT.equals(n));
        }
```

### PublicMethodWithoutLogging
'public' method `equals()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
```

### PublicMethodWithoutLogging
'public' method `addEventDispatchingMethod()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    public void addEventDispatchingMethod(EventDispatchingMethod eventDispatchingMethod) {
        methods.computeIfAbsent(eventDispatchingMethod.getMethod().declaringClass().name(), k -> new TreeSet<>())
                .add(eventDispatchingMethod);
```

### PublicMethodWithoutLogging
'public' method `hashCode()` has no logging call
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return Objects.hash(someProperty, someProperty);
    }
```

### PublicMethodWithoutLogging
'public' method `equals()` has no logging call
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
```

### PublicMethodWithoutLogging
'public' method `toString()` has no logging call
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java

    @Override
    public String toString() {
        return "MyConfigFile{" +
                "someProperty='" + someProperty + '\'' +
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-team no-teams");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-team team2");
        }
```

### PublicMethodWithoutLogging
'public' method `toString()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    @Override
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
```

### PublicMethodWithoutLogging
'public' method `getEventAction()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    }

    public String getEventAction() {
        StringBuilder sb = new StringBuilder();
        if (event != null && !event.isBlank()) {
```

### PublicMethodWithoutLogging
'public' method `yamlObjectMapper()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/UtilsProducer.java`
#### Snippet
```java
    @Singleton
    @Yaml
    public ObjectMapper yamlObjectMapper() {
        ObjectMapper yamlObjectMapper = new ObjectMapper(new YAMLFactory());
        yamlObjectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### PublicMethodWithoutLogging
'public' method `process()` has no logging call
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java
    GitHubConfigFileProvider configFileProvider;

    public void process() throws IOException {
        behavior.execute(clientProvider, configFileProvider);
    }
```

### PublicMethodWithoutLogging
'public' method `translateCommandline()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Commandline.java`
#### Snippet
```java
     *         An empty or null toProcess parameter results in a zero sized array.
     */
    public static List<String> translateCommandline(String toProcess) {
        if (toProcess == null || toProcess.isEmpty()) {
            //no command? no string
```

### PublicMethodWithoutLogging
'public' method `github()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/ValidatableEventHandlingImpl.java`
#### Snippet
```java

    @Override
    public <T extends Throwable> ValidatableEventHandling github(GitHubMockVerification<T> verification) throws T {
        verification.verify(testingContext.mocks);
        return this;
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-command-options command2");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default-command-options command1");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### PublicMethodWithoutLogging
'public' method `getConfigObject()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    public Object getConfigObject(GHRepository ghRepository, String path, ConfigFile.Source source, Class<?> type) {
        String cacheKey = getCacheKey(ghRepository, path, source);

```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            throw new RuntimeException("Execution error");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc subclass-command1");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc application-scoped-command2");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc subclass-command2");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @arc application-scoped-command1");
        }
```

### PublicMethodWithoutLogging
'public' method `then()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventHandlingResponseImpl.java`
#### Snippet
```java

    @Override
    public ValidatableEventHandlingImpl then() {
        return new ValidatableEventHandlingImpl(testingContext);
    }
```

### PublicMethodWithoutLogging
'public' method `doWithMockedClassClassLoader()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/MockitoUtils.java`
#### Snippet
```java
    }

    public static <T> T doWithMockedClassClassLoader(Class<?> mockedClass, Supplier<T> action) {
        ClassLoader mockedClassClassLoader = mockedClass.getClassLoader();
        ClassLoader old = Thread.currentThread().getContextClassLoader();
```

### PublicMethodWithoutLogging
'public' method `doWithMockedClassClassLoader()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/MockitoUtils.java`
#### Snippet
```java
    }

    public static void doWithMockedClassClassLoader(Class<?> mockedClass, Runnable action) {
        doWithMockedClassClassLoader(mockedClass, () -> {
            action.run();
```

### PublicMethodWithoutLogging
'public' method `appliesTo()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/VetoUserDefinedEventListeningClassesAnnotationsTransformer.java`
#### Snippet
```java

    @Override
    public boolean appliesTo(Kind kind) {
        return Kind.CLASS.equals(kind);
    }
```

### PublicMethodWithoutLogging
'public' method `transform()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/VetoUserDefinedEventListeningClassesAnnotationsTransformer.java`
#### Snippet
```java

    @Override
    public void transform(TransformationContext transformationContext) {
        Set<DotName> annotations = transformationContext.getTarget().asClass().annotationsMap().keySet();

```

### PublicMethodWithoutLogging
'public' method `enable()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java
    private static final String ENABLED_KEY = "quarkiverse-github-app-testing.enabled";

    public static void enable(Map<String, String> configProperties) {
        configProperties.put(ENABLED_KEY, "true");
    }
```

### PublicMethodWithoutLogging
'public' method `afterConstruct()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingCallback.java`
#### Snippet
```java

    @Override
    public void afterConstruct(Object testInstance) {
        if (!isEnabled()) {
            GitHubAppTestingContext.reset();
```

### PublicMethodWithoutLogging
'public' method `pullRequest()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GHPullRequest pullRequest(long id) {
        return ghObject(GHPullRequest.class, id);
    }
```

### PublicMethodWithoutLogging
'public' method `repository()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GHRepository repository(String fullName) {
        return repositories.getOrCreate(fullName).mock();
    }
```

### PublicMethodWithoutLogging
'public' method `configFile()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GitHubMockConfigFileSetupContext configFile(String pathInRepository) {
        return configFile(null, pathInRepository);
    }
```

### PublicMethodWithoutLogging
'public' method `installationGraphQLClient()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public DynamicGraphQLClient installationGraphQLClient(long installationId) {
        return graphQLClients.getOrCreate(installationId)
                .mock();
```

### PublicMethodWithoutLogging
'public' method `ghObject()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public <T extends GHObject> T ghObject(Class<T> type, long id) {
        return nonRepositoryMockMap(type).getOrCreate(id).mock();
    }
```

### PublicMethodWithoutLogging
'public' method `team()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GHTeam team(long id) {
        return ghObject(GHTeam.class, id);
    }
```

### PublicMethodWithoutLogging
'public' method `ghObjects()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public Object[] ghObjects() {
        List<GHObject> result = new ArrayList<>();
        for (MockMap<?, ?> mockMap : allMockMaps) {
```

### PublicMethodWithoutLogging
'public' method `applicationClient()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GitHub applicationClient() {
        return applicationOrInstallationClient(null);
    }
```

### PublicMethodWithoutLogging
'public' method `configFile()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GitHubMockConfigFileSetupContext configFile(GHRepository repository, String pathInRepository) {
        return new GitHubMockConfigFileSetupContext() {

```

### PublicMethodWithoutLogging
'public' method `withRef()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

            @Override
            public GitHubMockConfigFileSetupContext withRef(String ref) {
                this.ref = ref;
                return this;
```

### PublicMethodWithoutLogging
'public' method `fromString()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

            @Override
            public void fromString(String configFile) {
                when(fileDownloader.getFileContent(repository == null ? any() : same(repository),
                        ref == null ? isNull() : eq(ref), eq(GitHubConfigFileProviderImpl.getFilePath(pathInRepository))))
```

### PublicMethodWithoutLogging
'public' method `fromClasspath()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

            @Override
            public void fromClasspath(String pathInClasspath) throws IOException {
                fromString(GitHubAppTestingContext.get().getFromClasspath(pathInClasspath));
            }
```

### PublicMethodWithoutLogging
'public' method `issue()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GHIssue issue(long id) {
        return ghObject(GHIssue.class, id);
    }
```

### PublicMethodWithoutLogging
'public' method `issueComment()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GHIssueComment issueComment(long id) {
        return ghObject(GHIssueComment.class, id);
    }
```

### PublicMethodWithoutLogging
'public' method `installationClient()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GitHub installationClient(long installationId) {
        return applicationOrInstallationClient(installationId);
    }
```

### PublicMethodWithoutLogging
'public' method `applicationOrInstallationClient()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    // By convention, the application client has a null ID.
    public GitHub applicationOrInstallationClient(Long idOrNull) {
        return clients.getOrCreate(idOrNull).mock();
    }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            // do nothing
        }
```

### PublicMethodWithoutLogging
'public' method `handleRequest()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    @Route(path = "/", type = HandlerType.BLOCKING, methods = HttpMethod.POST, consumes = "application/json", produces = "application/json")
    public void handleRequest(RoutingContext routingContext,
            RoutingExchange routingExchange,
            @Header(X_REQUEST_ID) String requestId,
```

### PublicMethodWithoutLogging
'public' method `extractInstallationId()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    }

    public Long extractInstallationId(JsonObject body) {
        Long installationId;

```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    Path tmpDirectory;

    public void init(@Observes StartupEvent startupEvent) throws IOException {
        if (checkedConfigProvider.debug().payloadDirectory.isPresent()) {
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
```

### PublicMethodWithoutLogging
'public' method `addMessage()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        }

        public boolean addMessage() {
            return message;
        }
```

### PublicMethodWithoutLogging
'public' method `reactionOnError()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        }

        public boolean reactionOnError() {
            return reactionOnError;
        }
```

### PublicMethodWithoutLogging
'public' method `reactionOnProgress()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        }

        public boolean reactionOnProgress() {
            return reactionOnProgress;
        }
```

### PublicMethodWithoutLogging
'public' method `isInScope()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        ISSUES_AND_PULL_REQUESTS;

        public boolean isInScope(boolean isPullRequest) {
            if (isPullRequest) {
                return this == ISSUES_AND_PULL_REQUESTS || this == PULL_REQUESTS;
```

### PublicMethodWithoutLogging
'public' method `reactionOnNormalFlow()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        }

        public boolean reactionOnNormalFlow() {
            return reactionOnNormalFlow;
        }
```

### PublicMethodWithoutLogging
'public' method `handleError()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java

    @Override
    public void handleError(GitHubEvent gitHubEvent, GHEventPayload payload, Throwable t) {
        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append("Error handling delivery " + gitHubEvent.getDeliveryId() + "\n");
```

### PublicMethodWithoutLogging
'public' method `includeErrors()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        }

        public boolean includeErrors() {
            return errors;
        }
```

### PublicMethodWithoutLogging
'public' method `includeHelp()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        }

        public boolean includeHelp() {
            return help;
        }
```

### PublicMethodWithoutLogging
'public' method `addMessage()` has no logging call
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        }

        public boolean addMessage() {
            return message;
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @permission test-admin-permission");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @permission test-write-permission");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @permission test-no-permission");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy progress-error");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy all");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy none");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy progress");
        }
```

### PublicMethodWithoutLogging
'public' method `answer()` has no logging call
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java

    @Override
    public Object answer(InvocationOnMock invocation) throws Throwable {
        Method method = invocation.getMethod();

```

### PublicMethodWithoutLogging
'public' method `replayUiHandler()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/GitHubAppRecorder.java`
#### Snippet
```java
public class GitHubAppRecorder {

    public Handler<RoutingContext> replayUiHandler(String replayUiFinalDestination, String replayUiPath,
            List<FileSystemStaticHandler.StaticWebRootConfiguration> webRootConfigurations,
            ShutdownContext shutdownContext) {
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java

        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            cdiBean.doSomething();
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy-override override");
        }
```

### PublicMethodWithoutLogging
'public' method `run()` has no logging call
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java

        @Override
        public void run(IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @reaction-strategy-override no-override");
        }
```

### PublicMethodWithoutLogging
'public' method `generate()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void generate(CombinedIndexBuildItem index,
            BuildProducer<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingClassesIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
```

### PublicMethodWithoutLogging
'public' method `beanConfig()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void beanConfig(CombinedIndexBuildItem index,
            BuildProducer<BeanDefiningAnnotationBuildItem> beanDefiningAnnotations,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
```

### PublicMethodWithoutLogging
'public' method `indexAnnotations()` has no logging call
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void indexAnnotations(BuildProducer<AdditionalIndexedClassesBuildItem> additionalIndexedClasses) {
        // adding the *Options annotations
        additionalIndexedClasses
```

### PublicMethodWithoutLogging
'public' method `expireAfterRead()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

                    @Override
                    public long expireAfterRead(Long installationId, CachedInstallationToken cachedInstallationGitHub,
                            long currentTime, long currentDuration) {
                        return currentDuration;
```

### PublicMethodWithoutLogging
'public' method `getApplicationClient()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
    // TODO even if we have a cache for the other one, we should probably also keep this one around for a few minutes
    @Override
    public GitHub getApplicationClient() {
        return createApplicationGitHub();
    }
```

### PublicMethodWithoutLogging
'public' method `getInstallationClient()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

    @Override
    public GitHub getInstallationClient(long installationId) {
        try {
            return createInstallationClient(installationId);
```

### PublicMethodWithoutLogging
'public' method `load()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        @Override
        public CachedInstallationToken load(Long installationId) throws Exception {
            try {
                GHAppInstallationToken installationToken = createApplicationGitHub().getApp()
```

### PublicMethodWithoutLogging
'public' method `getInstallationGraphQLClient()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

    @Override
    public DynamicGraphQLClient getInstallationGraphQLClient(long installationId) {
        try {
            return createInstallationGraphQLClient(installationId);
```

### PublicMethodWithoutLogging
'public' method `expireAfterUpdate()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

                    @Override
                    public long expireAfterUpdate(Long installationId, CachedInstallationToken cachedInstallationGitHub,
                            long currentTime, long currentDuration) {
                        // TODO, should we implement that too?
```

### PublicMethodWithoutLogging
'public' method `expireAfterCreate()` has no logging call
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
                .expireAfter(new Expiry<Long, CachedInstallationToken>() {
                    @Override
                    public long expireAfterCreate(Long installationId, CachedInstallationToken cachedInstallationGitHub,
                            long currentTime) {
                        long millis = cachedInstallationGitHub.getExpiresAt()
```

### PublicMethodWithoutLogging
'public' method `visitMethod()` has no logging call
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            if (methodsWithBridges.contains(name) && ((access & Opcodes.ACC_BRIDGE) != 0)
                    && ((access & Opcodes.ACC_SYNTHETIC) != 0)) {
```

## BooleanVariableAlwaysNegated
### BooleanVariableAlwaysNegated
Boolean variable `originalMethodHasIssueCommentPayloadParameter` is always inverted
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

        short issueCommentPayloadPosition = -1;
        boolean originalMethodHasIssueCommentPayloadParameter = false;

        for (short i = 0; i < originalMethodParameterTypes.size(); i++) {
```

## UnqualifiedFieldAccess
### UnqualifiedFieldAccess
Instance field access `expiresAt` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/CachedInstallationToken.java`
#### Snippet
```java

    public Instant getExpiresAt() {
        return expiresAt;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `token` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/CachedInstallationToken.java`
#### Snippet
```java

    public String getToken() {
        return token;
    }

```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java
    @Override
    public String event() {
        return event;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `gitHubEvent` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java
    @Override
    public GitHubEvent data() {
        return gitHubEvent;
    }

```

### UnqualifiedFieldAccess
Instance field access `global` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
        try {
            ByteArrayOutputStream helpOs = new ByteArrayOutputStream();
            Help.help(global, command, helpOs);

            issueCommentPayload.getIssue().comment("```\n" + helpOs.toString(StandardCharsets.UTF_8).trim() + "\n```");
```

### UnqualifiedFieldAccess
Instance field access `command` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
        try {
            ByteArrayOutputStream helpOs = new ByteArrayOutputStream();
            Help.help(global, command, helpOs);

            issueCommentPayload.getIssue().comment("```\n" + helpOs.toString(StandardCharsets.UTF_8).trim() + "\n```");
```

### UnqualifiedFieldAccess
Instance field access `command` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
            issueCommentPayload.getIssue().comment("```\n" + helpOs.toString(StandardCharsets.UTF_8).trim() + "\n```");
        } catch (IOException e) {
            throw new RuntimeException("Error generating usage documentation for " + String.join(" ", command), e);
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `gitHubEvent` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
    @Override
    public Void apply(Throwable t) {
        Arc.container().instance(ErrorHandler.class).get().handleError(gitHubEvent, payload, t);
        return null;
    }
```

### UnqualifiedFieldAccess
Instance field access `payload` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
    @Override
    public Void apply(Throwable t) {
        Arc.container().instance(ErrorHandler.class).get().handleError(gitHubEvent, payload, t);
        return null;
    }
```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
    public ConfigFile.Source getEffectiveSource(ConfigFile.Source source) {
        if (source == ConfigFile.Source.DEFAULT) {
            return gitHubAppRuntimeConfig.readConfigFilesFromSourceRepository ? ConfigFile.Source.SOURCE_REPOSITORY
                    : ConfigFile.Source.CURRENT_REPOSITORY;
        }
```

### UnqualifiedFieldAccess
Instance field access `missingPropertyKeys` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

        if (gitHubAppRuntimeConfig.appId.isEmpty()) {
            missingPropertyKeys.add("quarkus.github-app.app-id (QUARKUS_GITHUB_APP_APP_ID)");
        }
        if (gitHubAppRuntimeConfig.privateKey.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `missingPropertyKeys` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
        }
        if (gitHubAppRuntimeConfig.privateKey.isEmpty()) {
            missingPropertyKeys.add("quarkus.github-app.private-key (QUARKUS_GITHUB_APP_PRIVATE_KEY)");
        }
        if (launchMode == LaunchMode.NORMAL && gitHubAppRuntimeConfig.webhookSecret.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `missingPropertyKeys` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
        }
        if (launchMode == LaunchMode.NORMAL && gitHubAppRuntimeConfig.webhookSecret.isEmpty()) {
            missingPropertyKeys.add("quarkus.github-app.webhook-secret (QUARKUS_GITHUB_APP_WEBHOOK_SECRET)");
        }

```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public PrivateKey privateKey() {
        if (launchMode == LaunchMode.TEST) {
            checkConfig();
        }
```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

        // The optional will never be empty; using orElseThrow instead of get to avoid IDE warnings.
        return gitHubAppRuntimeConfig.privateKey.orElseThrow();
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public Optional<String> webhookSecret() {
        return gitHubAppRuntimeConfig.webhookSecret;
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public Optional<String> appName() {
        return gitHubAppRuntimeConfig.appName;
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public String instanceEndpoint() {
        return gitHubAppRuntimeConfig.instanceEndpoint;
    }

```

### UnqualifiedFieldAccess
Instance field access `missingPropertyKeys` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public void checkConfig() {
        if (missingPropertyKeys.isEmpty()) {
            return;
        }
```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
        String errorMessage;

        if (launchMode == LaunchMode.TEST) {
            errorMessage = "Missing value for configuration properties: " + missingPropertyKeys + "."
                    + " This configuration is necessary to create the GitHub clients."
```

### UnqualifiedFieldAccess
Instance field access `missingPropertyKeys` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

        if (launchMode == LaunchMode.TEST) {
            errorMessage = "Missing value for configuration properties: " + missingPropertyKeys + "."
                    + " This configuration is necessary to create the GitHub clients."
                    + " It is optional in tests only if GitHub clients are being mocked using quarkus-github-app-testing"
```

### UnqualifiedFieldAccess
Instance field access `missingPropertyKeys` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
                    + " (see https://quarkiverse.github.io/quarkiverse-docs/quarkus-github-app/dev/testing.html).";
        } else {
            errorMessage = "Missing value for configuration properties: " + missingPropertyKeys + "."
                    + " This configuration is required in " + (launchMode == LaunchMode.NORMAL ? "prod" : "dev")
                    + " mode.";
```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java
        } else {
            errorMessage = "Missing value for configuration properties: " + missingPropertyKeys + "."
                    + " This configuration is required in " + (launchMode == LaunchMode.NORMAL ? "prod" : "dev")
                    + " mode.";
        }
```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public Optional<String> webhookProxyUrl() {
        return gitHubAppRuntimeConfig.webhookProxyUrl;
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public Debug debug() {
        return gitHubAppRuntimeConfig.debug;
    }

```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    public String appId() {
        if (launchMode == LaunchMode.TEST) {
            checkConfig();
        }
```

### UnqualifiedFieldAccess
Instance field access `gitHubAppRuntimeConfig` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

        // The optional will never be empty; using orElseThrow instead of get to avoid IDE warnings.
        return gitHubAppRuntimeConfig.appId.orElseThrow();
    }

```

### UnqualifiedFieldAccess
Instance field access `secretKeySpec` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    PayloadSignatureChecker(CheckedConfigProvider checkedConfigProvider) {
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
            sharedMac = null;
            supportsClone = false;
```

### UnqualifiedFieldAccess
Instance field access `sharedMac` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
            sharedMac = null;
            supportsClone = false;
            return;
```

### UnqualifiedFieldAccess
Instance field access `supportsClone` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
            secretKeySpec = null;
            sharedMac = null;
            supportsClone = false;
            return;
        }
```

### UnqualifiedFieldAccess
Instance field access `secretKeySpec` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
        }

        secretKeySpec = new SecretKeySpec(checkedConfigProvider.webhookSecret().get().getBytes(UTF_8),
                HMAC_SHA256_ALGORITHM);
        sharedMac = createNewMacInstance(secretKeySpec);
```

### UnqualifiedFieldAccess
Instance field access `sharedMac` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
        secretKeySpec = new SecretKeySpec(checkedConfigProvider.webhookSecret().get().getBytes(UTF_8),
                HMAC_SHA256_ALGORITHM);
        sharedMac = createNewMacInstance(secretKeySpec);
        supportsClone = supportsClone(sharedMac);
    }
```

### UnqualifiedFieldAccess
Instance field access `secretKeySpec` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
        secretKeySpec = new SecretKeySpec(checkedConfigProvider.webhookSecret().get().getBytes(UTF_8),
                HMAC_SHA256_ALGORITHM);
        sharedMac = createNewMacInstance(secretKeySpec);
        supportsClone = supportsClone(sharedMac);
    }
```

### UnqualifiedFieldAccess
Instance field access `supportsClone` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
                HMAC_SHA256_ALGORITHM);
        sharedMac = createNewMacInstance(secretKeySpec);
        supportsClone = supportsClone(sharedMac);
    }

```

### UnqualifiedFieldAccess
Instance field access `sharedMac` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
                HMAC_SHA256_ALGORITHM);
        sharedMac = createNewMacInstance(secretKeySpec);
        supportsClone = supportsClone(sharedMac);
    }

```

### UnqualifiedFieldAccess
Instance field access `secretKeySpec` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

    public boolean matches(byte[] payload, String headerSignature) {
        if (secretKeySpec == null || sharedMac == null) {
            throw new IllegalStateException("Payload signature checking is disabled, this method should not be called");
        }
```

### UnqualifiedFieldAccess
Instance field access `sharedMac` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

    public boolean matches(byte[] payload, String headerSignature) {
        if (secretKeySpec == null || sharedMac == null) {
            throw new IllegalStateException("Payload signature checking is disabled, this method should not be called");
        }
```

### UnqualifiedFieldAccess
Instance field access `supportsClone` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java

    public Mac getMacInstance() {
        if (supportsClone) {
            try {
                return (Mac) sharedMac.clone();
```

### UnqualifiedFieldAccess
Instance field access `sharedMac` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
        if (supportsClone) {
            try {
                return (Mac) sharedMac.clone();
            } catch (CloneNotSupportedException e) {
                // should never happen but let's fallback anyway
```

### UnqualifiedFieldAccess
Instance field access `secretKeySpec` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
            }
        }
        return createNewMacInstance(secretKeySpec);
    }

```

### UnqualifiedFieldAccess
Instance field access `yamlObjectMapper` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
    private ObjectMapper getObjectMapper(String path) {
        if (matchExtensions(path, YAML_EXTENSIONS)) {
            return yamlObjectMapper;
        }
        if (matchExtensions(path, JSON_EXTENSIONS)) {
```

### UnqualifiedFieldAccess
Instance field access `jsonObjectMapper` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
        }
        if (matchExtensions(path, JSON_EXTENSIONS)) {
            return jsonObjectMapper;
        }
        throw new IllegalArgumentException("File extension not supported for config file " + path);
```

### UnqualifiedFieldAccess
Instance field access `gitHubFileDownloader` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java
        String fullPath = getFilePath(path);

        Optional<String> contentOptional = gitHubFileDownloader.getFileContent(configGHRepository, ref, fullPath);
        if (contentOptional.isEmpty()) {
            return Optional.empty();
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubConfigFileProviderImpl.java`
#### Snippet
```java

    private GHRepository getConfigRepository(GHRepository ghRepository, ConfigFile.Source source, String path) {
        ConfigFile.Source effectiveSource = checkedConfigProvider.getEffectiveSource(source);

        if (effectiveSource == ConfigFile.Source.CURRENT_REPOSITORY) {
```

### UnqualifiedFieldAccess
Instance field access `eventSource` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java

    void stopEventSource(@Observes ShutdownEvent shutdownEvent) {
        if (eventSource != null) {
            eventSource.close();
        }
```

### UnqualifiedFieldAccess
Instance field access `eventSource` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
    void stopEventSource(@Observes ShutdownEvent shutdownEvent) {
        if (eventSource != null) {
            eventSource.close();
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `objectMapper` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
            }

            JsonNode rootNode = objectMapper.readTree(messageEvent.getData());
            JsonNode body = rootNode.get("body");

```

### UnqualifiedFieldAccess
Instance field access `localUrl` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
            if (body != null) {
                Request.Builder requestBuilder = new Request.Builder()
                        .url(localUrl)
                        .post(RequestBody.create(JSON, objectMapper.writeValueAsString(rootNode.get("body"))));

```

### UnqualifiedFieldAccess
Instance field access `objectMapper` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
                Request.Builder requestBuilder = new Request.Builder()
                        .url(localUrl)
                        .post(RequestBody.create(JSON, objectMapper.writeValueAsString(rootNode.get("body"))));

                for (String forwardedHeader : FORWARDED_HEADERS) {
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
                }

                try (Response response = client.newCall(requestBuilder.build()).execute()) {
                }
            }
```

### UnqualifiedFieldAccess
Instance field access `usernames` is not qualified with 'this'
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("Hello " + String.join(", ", usernames)); // <2>
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `executionErrorStrategy` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java

    public ExecutionErrorStrategy getExecutionErrorStrategy() {
        return executionErrorStrategy;
    }

```

### UnqualifiedFieldAccess
Instance field access `reactionStrategy` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java

    public ReactionStrategy getReactionStrategy() {
        return reactionStrategy;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `scope` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java

    public CommandScope getScope() {
        return scope;
    }

```

### UnqualifiedFieldAccess
Instance field access `executionErrorMessage` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java

    public String getExecutionErrorMessage() {
        return executionErrorMessage;
    }

```

### UnqualifiedFieldAccess
Instance field access `service1` is not qualified with 'this'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java
        public void run(GHEventPayload.IssueComment issueCommentPayload, Service2 service2) throws IOException {
            issueCommentPayload.getIssue()
                    .comment(service1.hello() + " - " + service2.hello() + " - " + globalMetadata.getName());
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `globalMetadata` is not qualified with 'this'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java
        public void run(GHEventPayload.IssueComment issueCommentPayload, Service2 service2) throws IOException {
            issueCommentPayload.getIssue()
                    .comment(service1.hello() + " - " + service2.hello() + " - " + globalMetadata.getName());
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `defaultableMockingProvider` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java
        Class<? extends GHObject> type = castOriginal.getClass();
        return MockitoUtils.doWithMockedClassClassLoader(type, () -> {
            DefaultableMocking<? extends GHObject> mocking = defaultableMockingProvider.apply(castOriginal);
            return Mockito.mock(type, withSettings().stubOnly()
                    .withoutAnnotations()
```

### UnqualifiedFieldAccess
Instance field access `clientSpy` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java
                    .withoutAnnotations()
                    .spiedInstance(original)
                    .defaultAnswer(new GHObjectSpyDefaultAnswer(clientSpy, this, mocking)));
        });
    }
```

### UnqualifiedFieldAccess
Instance field access `testInstance` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java

    String getFromClasspath(String path) throws IOException {
        try (InputStream stream = testInstance.getClass().getResourceAsStream(path)) {
            if (stream == null) {
                throw new IllegalArgumentException("No such file in classpath: '" + path + "'");
```

### UnqualifiedFieldAccess
Instance field access `recordedEvents` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
        ReplayEvent replayEvent = new ReplayEvent(gitHubEvent);

        recordedEvents.add(replayEvent);
        broadcastProcessor.onNext(replayEvent);
    }
```

### UnqualifiedFieldAccess
Instance field access `broadcastProcessor` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java

        recordedEvents.add(replayEvent);
        broadcastProcessor.onNext(replayEvent);
    }
}
```

### UnqualifiedFieldAccess
Instance field access `recordedEvents` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
        return Multi.createBy()
                .merging().streams(
                        Multi.createFrom().iterable(recordedEvents),
                        broadcastProcessor.onOverflow().drop(),
                        Multi.createFrom().ticks().every(Duration.ofMillis(100)).onOverflow()
```

### UnqualifiedFieldAccess
Instance field access `broadcastProcessor` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
                .merging().streams(
                        Multi.createFrom().iterable(recordedEvents),
                        broadcastProcessor.onOverflow().drop(),
                        Multi.createFrom().ticks().every(Duration.ofMillis(100)).onOverflow()
                                .drop().map(x -> ReplayEvent.PING));
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/HideAirlineInjectAnnotationsTransformer.java`
#### Snippet
```java
        }

        ClassInfo fieldClass = index.getClassByName(fieldType.asClassType().name());

        if (fieldClass == null) {
```

### UnqualifiedFieldAccess
Instance field access `captured` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/CapturingErrorHandler.java`
#### Snippet
```java
    @Override
    public void handleError(GitHubEvent gitHubEvent, GHEventPayload payload, Throwable t) {
        captured = t;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    private EventSenderOptionsImpl payloadFromClasspath(String path, MediaType contentType) throws IOException {
        return payloadFromString(testingContext.getFromClasspath(path), contentType);
    }

```

### UnqualifiedFieldAccess
Instance field access `clientBuilder` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        Duration forever = Duration.ofDays(1);
        // For debugging
        clientBuilder
                .readTimeout(forever)
                .callTimeout(forever)
```

### UnqualifiedFieldAccess
Instance field access `clientBuilder` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
    @Override
    public EventHandlingResponseImpl event(GHEvent event, boolean ignoreExceptions) {
        OkHttpClient httpClient = clientBuilder.build();
        Call call = httpClient.newCall(new Request.Builder()
                .url(buildUrl())
```

### UnqualifiedFieldAccess
Instance field access `requestBody` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        Call call = httpClient.newCall(new Request.Builder()
                .url(buildUrl())
                .post(requestBody)
                .addHeader(Headers.X_REQUEST_ID, (requestId == null ? UUID.randomUUID() : requestId).toString())
                .addHeader(Headers.X_GITHUB_DELIVERY, (deliveryId == null ? UUID.randomUUID() : deliveryId).toString())
```

### UnqualifiedFieldAccess
Instance field access `requestId` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
                .url(buildUrl())
                .post(requestBody)
                .addHeader(Headers.X_REQUEST_ID, (requestId == null ? UUID.randomUUID() : requestId).toString())
                .addHeader(Headers.X_GITHUB_DELIVERY, (deliveryId == null ? UUID.randomUUID() : deliveryId).toString())
                .addHeader(Headers.X_GITHUB_EVENT, symbol(event))
```

### UnqualifiedFieldAccess
Instance field access `requestId` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
                .url(buildUrl())
                .post(requestBody)
                .addHeader(Headers.X_REQUEST_ID, (requestId == null ? UUID.randomUUID() : requestId).toString())
                .addHeader(Headers.X_GITHUB_DELIVERY, (deliveryId == null ? UUID.randomUUID() : deliveryId).toString())
                .addHeader(Headers.X_GITHUB_EVENT, symbol(event))
```

### UnqualifiedFieldAccess
Instance field access `deliveryId` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
                .post(requestBody)
                .addHeader(Headers.X_REQUEST_ID, (requestId == null ? UUID.randomUUID() : requestId).toString())
                .addHeader(Headers.X_GITHUB_DELIVERY, (deliveryId == null ? UUID.randomUUID() : deliveryId).toString())
                .addHeader(Headers.X_GITHUB_EVENT, symbol(event))
                .build());
```

### UnqualifiedFieldAccess
Instance field access `deliveryId` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
                .post(requestBody)
                .addHeader(Headers.X_REQUEST_ID, (requestId == null ? UUID.randomUUID() : requestId).toString())
                .addHeader(Headers.X_GITHUB_DELIVERY, (deliveryId == null ? UUID.randomUUID() : deliveryId).toString())
                .addHeader(Headers.X_GITHUB_EVENT, symbol(event))
                .build());
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        // otherwise tests might throw a UnnecessaryStubbingException when using Mockito's "strict-stubs" mode
        // and testing background processing instead of events.
        testingContext.mocks.initEventStubs(installationId);

        testingContext.errorHandler.captured = null;
```

### UnqualifiedFieldAccess
Instance field access `installationId` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        // otherwise tests might throw a UnnecessaryStubbingException when using Mockito's "strict-stubs" mode
        // and testing background processing instead of events.
        testingContext.mocks.initEventStubs(installationId);

        testingContext.errorHandler.captured = null;
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        testingContext.mocks.initEventStubs(installationId);

        testingContext.errorHandler.captured = null;
        AssertionError callAssertionError = null;
        try {
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        }
        AssertionError handlingAssertionError = null;
        if (testingContext.errorHandler.captured != null) {
            // For some reason quarkus-github-app wraps the exceptions in CompletionException.
            // Unwrap the exceptions, as it's not what users expect.
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
            // For some reason quarkus-github-app wraps the exceptions in CompletionException.
            // Unwrap the exceptions, as it's not what users expect.
            Throwable unwrappedCaptured = unwrapCompletionException(testingContext.errorHandler.captured);
            handlingAssertionError = new AssertionError("The event handler threw an exception: "
                    + unwrappedCaptured.getMessage(),
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
            throw callAssertionError;
        }
        return new EventHandlingResponseImpl(testingContext);
    }

```

### UnqualifiedFieldAccess
Instance field access `installationId` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
    private EventSenderOptionsImpl payloadFromString(String payload, MediaType contentType) {
        JsonObject payloadAsJsonObject = new JsonObject(payload);
        installationId = Arc.container().instance(Routes.class).get().extractInstallationId(payloadAsJsonObject);
        requestBody = RequestBody.create(contentType, payload);
        return this;
```

### UnqualifiedFieldAccess
Instance field access `requestBody` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        JsonObject payloadAsJsonObject = new JsonObject(payload);
        installationId = Arc.container().instance(Routes.class).get().extractInstallationId(payloadAsJsonObject);
        requestBody = RequestBody.create(contentType, payload);
        return this;
    }
```

### UnqualifiedFieldAccess
Instance field access `annotation` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java

    DotName getAnnotation() {
        return annotation;
    }

```

### UnqualifiedFieldAccess
Instance field access `payloadType` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java

    public DotName getPayloadType() {
        return payloadType;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `action` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java

    String getAction() {
        return action;
    }

```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java

    String getEvent() {
        return event;
    }

```

### UnqualifiedFieldAccess
Instance field access `listener` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    Object callMockOrDefault(InvocationOnMock invocationOnMockProxy, Answer<?> defaultAnswer) throws Throwable {
        Object result = callMock(invocationOnMockProxy);
        if (listener.lastInvocationWasMocked) {
            return result;
        } else {
```

### UnqualifiedFieldAccess
Instance field access `mock` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
            return result;
        } else {
            call(Mockito.verify(mock, Mockito.atLeastOnce()), invocationOnMockProxy);
            return defaultAnswer.answer(invocationOnMockProxy);
        }
```

### UnqualifiedFieldAccess
Instance field access `mock` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    Object callMock(InvocationOnMock invocationOnMockProxy) throws Throwable {
        Object[] argumentsForJava = unexpandArguments(invocationOnMockProxy);
        MockHandler<?> handler = mockMaker.getHandler(mock);
        // Ideally we should use Mockito.framework().getInvocationFactory().createInvocation(...),
        // which is API and not an internal method like the one below,
```

### UnqualifiedFieldAccess
Instance field access `mock` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
        // but unfortunately that method doesn't allow us to set the location explicitly,
        // and we need to in order for the outer mock call to be ignored in Mockito error messages.
        Invocation invocationOnMock = DefaultInvocationFactory.createInvocation(mock, invocationOnMockProxy.getMethod(),
                argumentsForJava,
                new RealMethod() {
```

### UnqualifiedFieldAccess
Instance field access `mock` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java

    public M mock() {
        return mock;
    }

```

### UnqualifiedFieldAccess
Instance field access `lastInvocationWasMocked` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
        @Override
        public void reportInvocation(MethodInvocationReport methodInvocationReport) {
            lastInvocationWasMocked = methodInvocationReport.getLocationOfStubbing() != null;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `verboseModule` is not qualified with 'this'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java
    @Override
    public <T extends Throwable> EventContextSpecificationImpl github(GitHubMockSetup<T> gitHubMockSetup) throws T {
        gitHubMockSetup.setup(testingContext.mocks);
        return this;
    }
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java
    public <T extends Throwable> EventHandlingResponseImpl when(TestedAction<T> action) throws T {
        action.run();
        return new EventHandlingResponseImpl(testingContext);
    }
}
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java
    @Override
    public EventSenderOptionsImpl when() {
        return new EventSenderOptionsImpl(testingContext);
    }

```

### UnqualifiedFieldAccess
Instance field access `payload` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java

    public GHEventPayload getPayload() {
        return payload;
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHub` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java

    public GitHub getGitHub() {
        return gitHub;
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHubEvent` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java

    public GitHubEvent getGitHubEvent() {
        return gitHubEvent;
    }

```

### UnqualifiedFieldAccess
Instance field access `gitHubGraphQLClient` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java

    public DynamicGraphQLClient getGitHubGraphQLClient() {
        if (gitHubGraphQLClient == null) {
            throw new IllegalStateException("The GraphQL client has not been initialized and should not be accessed.");
        }
```

### UnqualifiedFieldAccess
Instance field access `gitHubGraphQLClient` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
        }

        return gitHubGraphQLClient;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `defaultCommandTeamConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public CommandTeamConfig getDefaultCommandTeamConfig() {
        return defaultCommandTeamConfig;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `defaultCommandPermissionConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public CommandPermissionConfig getDefaultCommandPermissionConfig() {
        return defaultCommandPermissionConfig;
    }

```

### UnqualifiedFieldAccess
Instance field access `defaultCommandConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public CommandConfig getDefaultCommandConfig() {
        return defaultCommandConfig;
    }

```

### UnqualifiedFieldAccess
Instance field access `parseErrorStrategy` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public ParseErrorStrategy getParseErrorStrategy() {
        return parseErrorStrategy;
    }

```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public List<String> getAliases() {
        return aliases;
    }

```

### UnqualifiedFieldAccess
Instance field access `parseErrorMessage` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public String getParseErrorMessage() {
        return parseErrorMessage;
    }

```

### UnqualifiedFieldAccess
Instance field access `indexer` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java

    public IndexView getIndex() {
        return indexer.complete();
    }

```

### UnqualifiedFieldAccess
Instance field access `delegate` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
    @Override
    public void produce(GeneratedBeanBuildItem generatedBean) {
        delegate.produce(generatedBean);
        try {
            indexer.index(new ByteArrayInputStream(generatedBean.getData()));
```

### UnqualifiedFieldAccess
Instance field access `indexer` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
        delegate.produce(generatedBean);
        try {
            indexer.index(new ByteArrayInputStream(generatedBean.getData()));
        } catch (IOException e) {
            throw new IllegalStateException("Unable to index generated class " + generatedBean.getName());
```

### UnqualifiedFieldAccess
Instance field access `empty` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
            throw new IllegalStateException("Unable to index generated class " + generatedBean.getName());
        }
        empty = false;
    }

```

### UnqualifiedFieldAccess
Instance field access `empty` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java

    public boolean isEmpty() {
        return empty;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `repositoryMockProvider` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
                    return true;
                case "getRepository":
                    return repositoryMockProvider.apply(invocation.getArgument(0, String.class));
            }
        }
```

### UnqualifiedFieldAccess
Instance field access `delegate` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
            }
        }
        return delegate.answer(invocation);
    }
}
```

### UnqualifiedFieldAccess
Instance field access `hello` is not qualified with 'this'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

        public String getHello() {
            return hello;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `arguments` is not qualified with 'this'
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            issueCommentPayload.getIssue().comment("hello from @default command-with-arguments " + String.join(",", arguments));
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubFileDownloader.java`
#### Snippet
```java
            // The config being not found can be perfectly acceptable, we log a warning in dev and test modes.
            // Note that you will have a GHFileNotFoundException if the file exists but you don't have the 'Contents' permission.
            if (launchMode.isDevOrTest()) {
                LOG.warn("Unable to read file " + fullPath + " for repository " + ghRepository.getFullName()
                        + ". Either the file does not exist or the 'Contents' permission has not been set for the application.");
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public DotName getName() {
            return name;
        }

```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        @Override
        public int compareTo(EventAnnotation other) {
            int nameCompareTo = name.compareTo(other.name);
            if (nameCompareTo != 0) {
                return nameCompareTo;
```

### UnqualifiedFieldAccess
Instance field access `values` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
                return nameCompareTo;
            }
            int valuesLengthCompare = Integer.compare(values.size(), other.values.size());
            if (valuesLengthCompare != 0) {
                return valuesLengthCompare;
```

### UnqualifiedFieldAccess
Instance field access `values` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
                return valuesLengthCompare;
            }
            for (int i = 0; i < values.size(); i++) {
                // we only support string for now, we can adjust later
                int valueCompare = values.get(i).asString().compareTo(other.values.get(i).asString());
```

### UnqualifiedFieldAccess
Instance field access `values` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            for (int i = 0; i < values.size(); i++) {
                // we only support string for now, we can adjust later
                int valueCompare = values.get(i).asString().compareTo(other.values.get(i).asString());
                if (valueCompare != 0) {
                    return valueCompare;
```

### UnqualifiedFieldAccess
Instance field access `eventAnnotations` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        public EventDispatchingConfiguration addEventAnnotation(String action, AnnotationInstance annotationInstance,
                List<AnnotationValue> values) {
            eventAnnotations.put(action, new EventAnnotation(annotationInstance.name(), values));
            return this;
        }
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(name, attributes);
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `attributes` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(name, attributes);
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `values` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public List<AnnotationValue> getValues() {
            return values;
        }

```

### UnqualifiedFieldAccess
Instance field access `payloadType` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public String getPayloadType() {
            return payloadType;
        }

```

### UnqualifiedFieldAccess
Instance field access `attributes` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public List<String> getAttributes() {
            return attributes;
        }

```

### UnqualifiedFieldAccess
Instance field access `eventAnnotations` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        public Set<EventAnnotationLiteral> getEventAnnotationLiterals() {
            Set<EventAnnotationLiteral> literals = new HashSet<>();
            for (EventAnnotation eventAnnotation : eventAnnotations.values()) {
                literals.add(new EventAnnotationLiteral(eventAnnotation.getName(),
                        eventAnnotation.getValues().stream().map(av -> av.name()).collect(Collectors.toList())));
```

### UnqualifiedFieldAccess
Instance field access `eventConfigurations` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

    public EventDispatchingConfiguration getOrCreateEventConfiguration(String event, String payloadType) {
        return eventConfigurations.computeIfAbsent(event, et -> new EventDispatchingConfiguration(event, payloadType));
    }

```

### UnqualifiedFieldAccess
Instance field access `methods` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

    public Map<DotName, TreeSet<EventDispatchingMethod>> getMethods() {
        return methods;
    }

```

### UnqualifiedFieldAccess
Instance field access `eventConfigurations` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

    public Map<String, EventDispatchingConfiguration> getEventConfigurations() {
        return eventConfigurations;
    }

```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public DotName getName() {
            return name;
        }

```

### UnqualifiedFieldAccess
Instance field access `methods` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

    public void addEventDispatchingMethod(EventDispatchingMethod eventDispatchingMethod) {
        methods.computeIfAbsent(eventDispatchingMethod.getMethod().declaringClass().name(), k -> new TreeSet<>())
                .add(eventDispatchingMethod);
    }
```

### UnqualifiedFieldAccess
Instance field access `method` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public MethodInfo getMethod() {
            return method;
        }

```

### UnqualifiedFieldAccess
Instance field access `methods` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

    public boolean requiresGraphQLClient() {
        for (EventDispatchingMethod eventDispatchingMethod : methods.values().stream().flatMap(Set::stream)
                .collect(Collectors.toList())) {
            if (eventDispatchingMethod.requiresGraphQLClient()) {
```

### UnqualifiedFieldAccess
Instance field access `method` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        @Override
        public int compareTo(EventDispatchingMethod other) {
            int classNameCompareTo = method.declaringClass().name().compareTo(other.method.declaringClass().name());
            if (classNameCompareTo != 0) {
                return classNameCompareTo;
```

### UnqualifiedFieldAccess
Instance field access `method` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            }

            int methodNameComparator = method.toString().compareTo(other.method.toString());
            if (methodNameComparator != 0) {
                return methodNameComparator;
```

### UnqualifiedFieldAccess
Instance field access `eventSubscriberInstance` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            }

            return eventSubscriberInstance.toString(false).compareTo(other.eventSubscriberInstance.toString(false));
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `eventAnnotations` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public TreeMap<String, EventAnnotation> getEventAnnotations() {
            return eventAnnotations;
        }

```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public String getEvent() {
            return event;
        }

```

### UnqualifiedFieldAccess
Instance field access `method` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public boolean requiresGraphQLClient() {
            return method.parameterTypes().stream().map(t -> t.name()).anyMatch(n -> DYNAMIC_GRAPHQL_CLIENT.equals(n));
        }

```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            EventAnnotationLiteral other = (EventAnnotationLiteral) obj;

            return Objects.equals(name, other.name) &&
                    Objects.equals(attributes, other.attributes);
        }
```

### UnqualifiedFieldAccess
Instance field access `attributes` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

            return Objects.equals(name, other.name) &&
                    Objects.equals(attributes, other.attributes);
        }

```

### UnqualifiedFieldAccess
Instance field access `eventSubscriberInstance` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

        public AnnotationInstance getEventSubscriberInstance() {
            return eventSubscriberInstance;
        }

```

### UnqualifiedFieldAccess
Instance field access `someProperty` is not qualified with 'this'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(someProperty, someProperty);
    }

```

### UnqualifiedFieldAccess
Instance field access `someProperty` is not qualified with 'this'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(someProperty, someProperty);
    }

```

### UnqualifiedFieldAccess
Instance field access `someProperty` is not qualified with 'this'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
            return false;
        MyConfigFile that = (MyConfigFile) o;
        return Objects.equals(someProperty, that.someProperty);
    }

```

### UnqualifiedFieldAccess
Instance field access `someProperty` is not qualified with 'this'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    public String toString() {
        return "MyConfigFile{" +
                "someProperty='" + someProperty + '\'' +
                '}';
    }
```

### UnqualifiedFieldAccess
Instance field access `installationId` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
```

### UnqualifiedFieldAccess
Instance field access `deliveryId` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
```

### UnqualifiedFieldAccess
Instance field access `repository` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
}
```

### UnqualifiedFieldAccess
Instance field access `action` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
}
```

### UnqualifiedFieldAccess
Instance field access `payload` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
}
```

### UnqualifiedFieldAccess
Instance field access `replayed` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    public String toString() {
        return "GitHubEvent [installationId=" + installationId + ", deliveryId=" + deliveryId + ", repository=" + repository
                + ", event=" + event + ", action=" + action + ", payload=" + payload + ", replayed=" + replayed + "]";
    }
}
```

### UnqualifiedFieldAccess
Instance field access `deliveryId` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public String getDeliveryId() {
        return deliveryId;
    }

```

### UnqualifiedFieldAccess
Instance field access `appName` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public Optional<String> getAppName() {
        return appName;
    }

```

### UnqualifiedFieldAccess
Instance field access `replayed` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public boolean isReplayed() {
        return replayed;
    }

```

### UnqualifiedFieldAccess
Instance field access `parsedPayload` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public JsonObject getParsedPayload() {
        return parsedPayload;
    }

```

### UnqualifiedFieldAccess
Instance field access `payload` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public String getPayload() {
        return payload;
    }

```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public String getEvent() {
        return event;
    }

```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    public String getEventAction() {
        StringBuilder sb = new StringBuilder();
        if (event != null && !event.isBlank()) {
            sb.append(event);
        }
```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    public String getEventAction() {
        StringBuilder sb = new StringBuilder();
        if (event != null && !event.isBlank()) {
            sb.append(event);
        }
```

### UnqualifiedFieldAccess
Instance field access `event` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        if (event != null && !event.isBlank()) {
            sb.append(event);
        }
        if (action != null && !action.isBlank()) {
```

### UnqualifiedFieldAccess
Instance field access `action` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
            sb.append(event);
        }
        if (action != null && !action.isBlank()) {
            sb.append(".").append(action);
        }
```

### UnqualifiedFieldAccess
Instance field access `action` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
            sb.append(event);
        }
        if (action != null && !action.isBlank()) {
            sb.append(".").append(action);
        }
```

### UnqualifiedFieldAccess
Instance field access `action` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
        }
        if (action != null && !action.isBlank()) {
            sb.append(".").append(action);
        }
        return sb.toString();
```

### UnqualifiedFieldAccess
Instance field access `repository` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public Optional<String> getRepository() {
        return repository;
    }

```

### UnqualifiedFieldAccess
Instance field access `action` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public String getAction() {
        return action;
    }

```

### UnqualifiedFieldAccess
Instance field access `installationId` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public Long getInstallationId() {
        return installationId;
    }

```

### UnqualifiedFieldAccess
Instance field access `clientProvider` is not qualified with 'this'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java

    public void process() throws IOException {
        behavior.execute(clientProvider, configFileProvider);
    }

```

### UnqualifiedFieldAccess
Instance field access `configFileProvider` is not qualified with 'this'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java

    public void process() throws IOException {
        behavior.execute(clientProvider, configFileProvider);
    }

```

### UnqualifiedFieldAccess
Instance field access `teams` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandTeamConfig.java`
#### Snippet
```java

    public Set<String> getTeams() {
        return teams;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/ValidatableEventHandlingImpl.java`
#### Snippet
```java
    @Override
    public <T extends Throwable> ValidatableEventHandling github(GitHubMockVerification<T> verification) throws T {
        verification.verify(testingContext.mocks);
        return this;
    }
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
            ConfigFile.Source source) {
        String fullPath = GitHubConfigFileProviderImpl.getFilePath(path.trim());
        ConfigFile.Source effectiveSource = checkedConfigProvider.getEffectiveSource(source);
        // we should only handle the config files of one repository in a given ConfigFileReader
        // as it's request scoped but let's be on the safe side
```

### UnqualifiedFieldAccess
Instance field access `cache` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
        String cacheKey = getCacheKey(ghRepository, path, source);

        Object cachedObject = cache.get(cacheKey);
        if (cachedObject != null) {
            return cachedObject;
```

### UnqualifiedFieldAccess
Instance field access `cache` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
        }

        return cache.computeIfAbsent(cacheKey,
                k -> gitHubConfigFileProvider.fetchConfigFile(ghRepository, path, source, type).orElse(null));
    }
```

### UnqualifiedFieldAccess
Instance field access `gitHubConfigFileProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java

        return cache.computeIfAbsent(cacheKey,
                k -> gitHubConfigFileProvider.fetchConfigFile(ghRepository, path, source, type).orElse(null));
    }

```

### UnqualifiedFieldAccess
Instance field access `testingContext` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventHandlingResponseImpl.java`
#### Snippet
```java
    @Override
    public ValidatableEventHandlingImpl then() {
        return new ValidatableEventHandlingImpl(testingContext);
    }
}
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/AdditionalEventDispatchingClassesIndexBuildItem.java`
#### Snippet
```java

    public IndexView getIndex() {
        return index;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `eventDefinitionAnnotations` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/VetoUserDefinedEventListeningClassesAnnotationsTransformer.java`
#### Snippet
```java
        }

        for (DotName eventDefiningAnnotation : eventDefinitionAnnotations) {
            if (!annotations.contains(eventDefiningAnnotation)) {
                continue;
```

### UnqualifiedFieldAccess
Instance field access `permission` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandPermissionConfig.java`
#### Snippet
```java

    public GHPermissionType getPermission() {
        return permission;
    }
}
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

        private DefaultableMocking<T> getOrCreate(ID id) {
            return map.computeIfAbsent(id, this::create);
        }

```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        reset();

        when(service.getApplicationClient())
                .thenAnswer(invocation -> applicationClient());

```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                .thenAnswer(invocation -> applicationClient());

        when(service.getInstallationClient(anyLong()))
                .thenAnswer(invocation -> installationClient(invocation.getArgument(0, Long.class)));

```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                .thenAnswer(invocation -> installationClient(invocation.getArgument(0, Long.class)));

        when(service.getInstallationGraphQLClient(anyLong()))
                .thenAnswer(invocation -> installationGraphQLClient(invocation.getArgument(0, Long.class)));
    }
```

### UnqualifiedFieldAccess
Instance field access `repositories` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    @Override
    public GHRepository repository(String fullName) {
        return repositories.getOrCreate(fullName).mock();
    }

```

### UnqualifiedFieldAccess
Instance field access `graphQLClients` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    @Override
    public DynamicGraphQLClient installationGraphQLClient(long installationId) {
        return graphQLClients.getOrCreate(installationId)
                .mock();
    }
```

### UnqualifiedFieldAccess
Instance field access `allMockMaps` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    public Object[] ghObjects() {
        List<GHObject> result = new ArrayList<>();
        for (MockMap<?, ?> mockMap : allMockMaps) {
            if (!GHObject.class.isAssignableFrom(mockMap.clazz)) {
                continue;
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    void reset() {
        Mockito.reset(service);
        Mockito.reset(fileDownloader);
        for (MockMap<?, ?> mockMap : allMockMaps) {
```

### UnqualifiedFieldAccess
Instance field access `fileDownloader` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    void reset() {
        Mockito.reset(service);
        Mockito.reset(fileDownloader);
        for (MockMap<?, ?> mockMap : allMockMaps) {
            mockMap.map.clear();
```

### UnqualifiedFieldAccess
Instance field access `allMockMaps` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        Mockito.reset(service);
        Mockito.reset(fileDownloader);
        for (MockMap<?, ?> mockMap : allMockMaps) {
            mockMap.map.clear();
        }
```

### UnqualifiedFieldAccess
Instance field access `fileDownloader` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
            @Override
            public void fromString(String configFile) {
                when(fileDownloader.getFileContent(repository == null ? any() : same(repository),
                        ref == null ? isNull() : eq(ref), eq(GitHubConfigFileProviderImpl.getFilePath(pathInRepository))))
                        .thenReturn(Optional.of(configFile));
```

### UnqualifiedFieldAccess
Instance field access `ref` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
            public void fromString(String configFile) {
                when(fileDownloader.getFileContent(repository == null ? any() : same(repository),
                        ref == null ? isNull() : eq(ref), eq(GitHubConfigFileProviderImpl.getFilePath(pathInRepository))))
                        .thenReturn(Optional.of(configFile));
            }
```

### UnqualifiedFieldAccess
Instance field access `ref` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
            public void fromString(String configFile) {
                when(fileDownloader.getFileContent(repository == null ? any() : same(repository),
                        ref == null ? isNull() : eq(ref), eq(GitHubConfigFileProviderImpl.getFilePath(pathInRepository))))
                        .thenReturn(Optional.of(configFile));
            }
```

### UnqualifiedFieldAccess
Instance field access `defaultAnswers` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
            this.clazz = clazz;
            this.mockSettingsContributor = mockSettings -> {
                mockSettings.defaultAnswer(defaultAnswers);
                mockSettingsContributor.accept(mockSettings);
            };
```

### UnqualifiedFieldAccess
Instance field access `nonRepositoryGHObjectMockMaps` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
            throw new IllegalArgumentException("Type must not be GHRepository -- there is a bug in the testing helper.");
        }
        return (MockMap<Long, T>) nonRepositoryGHObjectMockMaps.computeIfAbsent(type,
                clazz -> new MockMap<>(type));
    }
```

### UnqualifiedFieldAccess
Instance field access `clazz` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

        private DefaultableMocking<T> create(Object id) {
            return MockitoUtils.doWithMockedClassClassLoader(clazz,
                    () -> DefaultableMocking.create(clazz, id, mockSettingsContributor));
        }
```

### UnqualifiedFieldAccess
Instance field access `clazz` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        private DefaultableMocking<T> create(Object id) {
            return MockitoUtils.doWithMockedClassClassLoader(clazz,
                    () -> DefaultableMocking.create(clazz, id, mockSettingsContributor));
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `mockSettingsContributor` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        private DefaultableMocking<T> create(Object id) {
            return MockitoUtils.doWithMockedClassClassLoader(clazz,
                    () -> DefaultableMocking.create(clazz, id, mockSettingsContributor));
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `repositories` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        Class<? extends GHObject> type = original.getClass();
        if (GHRepository.class.equals(type)) {
            return repositories.getOrCreate(((GHRepository) original).getFullName());
        } else {
            return nonRepositoryMockMap(type).getOrCreate(original.getId());
```

### UnqualifiedFieldAccess
Instance field access `clients` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    // By convention, the application client has a null ID.
    public GitHub applicationOrInstallationClient(Long idOrNull) {
        return clients.getOrCreate(idOrNull).mock();
    }

```

### UnqualifiedFieldAccess
Instance field access `fileDownloader` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    GitHubMockContextImpl(Answers defaultAnswers) {
        this.defaultAnswers = defaultAnswers;
        fileDownloader = MockitoUtils.doWithMockedClassClassLoader(GitHubFileDownloader.class,
                () -> Mockito.mock(GitHubFileDownloader.class));
        service = MockitoUtils.doWithMockedClassClassLoader(GitHubFileDownloader.class,
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        fileDownloader = MockitoUtils.doWithMockedClassClassLoader(GitHubFileDownloader.class,
                () -> Mockito.mock(GitHubFileDownloader.class));
        service = MockitoUtils.doWithMockedClassClassLoader(GitHubFileDownloader.class,
                () -> Mockito.mock(GitHubService.class, withSettings().stubOnly()));
        repositories = new MockMap<>(GHRepository.class);
```

### UnqualifiedFieldAccess
Instance field access `repositories` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        service = MockitoUtils.doWithMockedClassClassLoader(GitHubFileDownloader.class,
                () -> Mockito.mock(GitHubService.class, withSettings().stubOnly()));
        repositories = new MockMap<>(GHRepository.class);
        clients = new MockMap<>(GitHub.class,
                // Configure the client mocks to be offline, because we don't want to send HTTP requests.
```

### UnqualifiedFieldAccess
Instance field access `clients` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                () -> Mockito.mock(GitHubService.class, withSettings().stubOnly()));
        repositories = new MockMap<>(GHRepository.class);
        clients = new MockMap<>(GitHub.class,
                // Configure the client mocks to be offline, because we don't want to send HTTP requests.
                settings -> settings.useConstructor("https://api.github.invalid",
```

### UnqualifiedFieldAccess
Instance field access `graphQLClients` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                        AbuseLimitHandler.WAIT, null, AuthorizationProvider.ANONYMOUS)
                        .defaultAnswer(new GitHubMockDefaultAnswer(defaultAnswers, this::repository)));
        graphQLClients = new MockMap<>(DynamicGraphQLClient.class);
    }

```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            @Header(X_QUARKIVERSE_GITHUB_APP_REPLAYED) String replayed) throws IOException {

        if (!launchMode.isDevOrTest() && (isBlank(deliveryId) || isBlank(hubSignature))) {
            routingExchange.response().setStatusCode(400).end();
            return;
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        String action = body.getString("action");

        if (!isBlank(deliveryId) && checkedConfigProvider.debug().payloadDirectory.isPresent()) {
            String fileName = DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "-" + event + "-"
                    + (!isBlank(action) ? action + "-" : "") + deliveryId + ".json";
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            String fileName = DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "-" + event + "-"
                    + (!isBlank(action) ? action + "-" : "") + deliveryId + ".json";
            Files.write(checkedConfigProvider.debug().payloadDirectory.get().resolve(fileName), bodyBytes);
        }

```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        Long installationId = extractInstallationId(body);
        String repository = extractRepository(body);
        GitHubEvent gitHubEvent = new GitHubEvent(installationId, checkedConfigProvider.appName().orElse(null), deliveryId,
                repository, event, action, routingContext.body().asString(), body, "true".equals(replayed) ? true : false);

```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
                repository, event, action, routingContext.body().asString(), body, "true".equals(replayed) ? true : false);

        if (launchMode == LaunchMode.DEVELOPMENT && replayRouteInstance.isResolvable()) {
            replayRouteInstance.get().pushEvent(gitHubEvent);
        }
```

### UnqualifiedFieldAccess
Instance field access `replayRouteInstance` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
                repository, event, action, routingContext.body().asString(), body, "true".equals(replayed) ? true : false);

        if (launchMode == LaunchMode.DEVELOPMENT && replayRouteInstance.isResolvable()) {
            replayRouteInstance.get().pushEvent(gitHubEvent);
        }
```

### UnqualifiedFieldAccess
Instance field access `replayRouteInstance` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

        if (launchMode == LaunchMode.DEVELOPMENT && replayRouteInstance.isResolvable()) {
            replayRouteInstance.get().pushEvent(gitHubEvent);
        }

```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        }

        if (checkedConfigProvider.webhookSecret().isPresent() && !launchMode.isDevOrTest()) {
            if (!payloadSignatureChecker.matches(bodyBytes, hubSignature)) {
                StringBuilder signatureError = new StringBuilder("Invalid signature for delivery: ").append(deliveryId)
```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        }

        if (checkedConfigProvider.webhookSecret().isPresent() && !launchMode.isDevOrTest()) {
            if (!payloadSignatureChecker.matches(bodyBytes, hubSignature)) {
                StringBuilder signatureError = new StringBuilder("Invalid signature for delivery: ").append(deliveryId)
```

### UnqualifiedFieldAccess
Instance field access `payloadSignatureChecker` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

        if (checkedConfigProvider.webhookSecret().isPresent() && !launchMode.isDevOrTest()) {
            if (!payloadSignatureChecker.matches(bodyBytes, hubSignature)) {
                StringBuilder signatureError = new StringBuilder("Invalid signature for delivery: ").append(deliveryId)
                        .append("\n");
```

### UnqualifiedFieldAccess
Instance field access `gitHubEventEmitter` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        }

        gitHubEventEmitter.fire(gitHubEvent);

        routingExchange.ok().end();
```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        }

        if (launchMode == LaunchMode.TEST || launchMode == LaunchMode.DEVELOPMENT) {
            long defaultInstallationId = 1L;
            LOG.infof(
```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
        }

        if (launchMode == LaunchMode.TEST || launchMode == LaunchMode.DEVELOPMENT) {
            long defaultInstallationId = 1L;
            LOG.infof(
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    public void init(@Observes StartupEvent startupEvent) throws IOException {
        if (checkedConfigProvider.debug().payloadDirectory.isPresent()) {
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
            LOG.warn("Payloads saved to: "
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    public void init(@Observes StartupEvent startupEvent) throws IOException {
        if (checkedConfigProvider.debug().payloadDirectory.isPresent()) {
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
            LOG.warn("Payloads saved to: "
                    + checkedConfigProvider.debug().payloadDirectory.get().toAbsolutePath().toString());
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
            Files.createDirectories(checkedConfigProvider.debug().payloadDirectory.get());
            LOG.warn("Payloads saved to: "
                    + checkedConfigProvider.debug().payloadDirectory.get().toAbsolutePath().toString());
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `message` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java

        public boolean addMessage() {
            return message;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `reactionOnError` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java

        public boolean reactionOnError() {
            return reactionOnError;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `reactionOnProgress` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java

        public boolean reactionOnProgress() {
            return reactionOnProgress;
        }

```

### UnqualifiedFieldAccess
Instance field access `reactionOnNormalFlow` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java

        public boolean reactionOnNormalFlow() {
            return reactionOnNormalFlow;
        }

```

### UnqualifiedFieldAccess
Instance field access `launchMode` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/DefaultErrorHandler.java`
#### Snippet
```java
        }

        if (launchMode.isDevOrTest()) {
            errorMessage.append("? Payload:\n")
                    .append("----\n")
```

### UnqualifiedFieldAccess
Instance field access `errors` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java

        public boolean includeErrors() {
            return errors;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `help` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java

        public boolean includeHelp() {
            return help;
        }

```

### UnqualifiedFieldAccess
Instance field access `message` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java

        public boolean addMessage() {
            return message;
        }

```

### UnqualifiedFieldAccess
Instance field access `clientSpy` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
        if (method.getParameterCount() == 0) {
            if (method.getName().equals("root") || method.getName().equals("getRoot")) {
                return clientSpy;
            }
            if (method.getName().startsWith("get") || method.getName().startsWith("is")) {
```

### UnqualifiedFieldAccess
Instance field access `ghObjectMocking` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
            }
            if (method.getName().startsWith("get") || method.getName().startsWith("is")) {
                return ghObjectMocking.callMockOrDefault(invocation, callRealMethodAndSpy);
            }
        }
```

### UnqualifiedFieldAccess
Instance field access `callRealMethodAndSpy` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
            }
            if (method.getName().startsWith("get") || method.getName().startsWith("is")) {
                return ghObjectMocking.callMockOrDefault(invocation, callRealMethodAndSpy);
            }
        }
```

### UnqualifiedFieldAccess
Instance field access `ghObjectMocking` is not qualified with 'this'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
        }

        return ghObjectMocking.callMock(invocation);
    }
}
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    private void handleParseError(IssueComment issueCommentPayload, String command,
            ParseResult<C> parseResult, String error) {
        if (!cliConfig.getParseErrorStrategy().addMessage()) {
            return;
        }
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

        StringBuilder message = new StringBuilder();
        message.append(String.format(cliConfig.getParseErrorMessage(), command));

        if (cliConfig.getParseErrorStrategy().includeErrors()) {
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        message.append(String.format(cliConfig.getParseErrorMessage(), command));

        if (cliConfig.getParseErrorStrategy().includeErrors()) {
            message.append("\n\nErrors:\n");
            if (error != null) {
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        if (error == null && cliConfig.getParseErrorStrategy().includeHelp()) {
            try {
                ByteArrayOutputStream helpOs = new ByteArrayOutputStream();
```

### UnqualifiedFieldAccess
Instance field access `cli` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
                    Help.help(parseResult.getState().getCommand(), helpOs);
                } else {
                    Help.help(cli.getMetadata(), Collections.emptyList(), helpOs);
                }

```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

    private boolean matches(String cli) {
        for (String alias : cliConfig.getAliases()) {
            if (alias.equals(cli)) {
                return true;
```

### UnqualifiedFieldAccess
Instance field access `commandConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

        public CommandConfig getCommandConfig() {
            return commandConfig;
        }

```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    private CommandConfig getBestCommandConfigInErrorState(ParseResult<C> parseResult) {
        if (parseResult.getState().getCommand() == null) {
            return cliConfig.getDefaultCommandConfig();
        }

```

### UnqualifiedFieldAccess
Instance field access `commandConfigs` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        return commandConfigs.getOrDefault(parseResult.getState().getCommand().getType().getName(),
                cliConfig.getDefaultCommandConfig());
    }
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

        return commandConfigs.getOrDefault(parseResult.getState().getCommand().getType().getName(),
                cliConfig.getDefaultCommandConfig());
    }

```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
            handleParseError(issueCommentPayload, firstLine, null, e.getMessage());

            if (cliConfig.getDefaultCommandConfig().getReactionStrategy().reactionOnError()) {
                Reactions.createReaction(issueCommentPayload, ReactionContent.CONFUSED);
            }
```

### UnqualifiedFieldAccess
Instance field access `cli` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        ParseResult<C> parseResult = cli.parseWithResult(commandLine);

        if (parseResult.wasSuccessful()) {
```

### UnqualifiedFieldAccess
Instance field access `commandConfigs` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
            String commandClassName = parseResult.getState().getCommand().getType().getName();

            CommandConfig commandConfig = commandConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandConfig());
            if (!commandConfig.getScope().isInScope(issueCommentPayload.getIssue().isPullRequest())) {
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

            CommandConfig commandConfig = commandConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandConfig());
            if (!commandConfig.getScope().isInScope(issueCommentPayload.getIssue().isPullRequest())) {
                return Optional.empty();
```

### UnqualifiedFieldAccess
Instance field access `commandPermissionConfigs` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
            }

            CommandPermissionConfig commandPermissionConfig = commandPermissionConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandPermissionConfig());
            CommandTeamConfig commandTeamConfig = commandTeamConfigs.getOrDefault(commandClassName,
```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

            CommandPermissionConfig commandPermissionConfig = commandPermissionConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandPermissionConfig());
            CommandTeamConfig commandTeamConfig = commandTeamConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandTeamConfig());
```

### UnqualifiedFieldAccess
Instance field access `commandTeamConfigs` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
            CommandPermissionConfig commandPermissionConfig = commandPermissionConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandPermissionConfig());
            CommandTeamConfig commandTeamConfig = commandTeamConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandTeamConfig());

```

### UnqualifiedFieldAccess
Instance field access `cliConfig` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
                    cliConfig.getDefaultCommandPermissionConfig());
            CommandTeamConfig commandTeamConfig = commandTeamConfigs.getOrDefault(commandClassName,
                    cliConfig.getDefaultCommandTeamConfig());

            if (!hasPermission(commandPermissionConfig, commandTeamConfig, issueCommentPayload.getRepository(),
```

### UnqualifiedFieldAccess
Instance field access `command` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

        public C getCommand() {
            return command;
        }

```

### UnqualifiedFieldAccess
Instance field access `commandLine` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

        public String getCommandLine() {
            return commandLine;
        }

```

### UnqualifiedFieldAccess
Instance field access `ackReaction` is not qualified with 'this'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java

        public GHReaction getAckReaction() {
            return ackReaction;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `verboseModule` is not qualified with 'this'
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
```

### UnqualifiedFieldAccess
Instance field access `cdiBean` is not qualified with 'this'
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            cdiBean.doSomething();
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `clazz` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

        public ClassInfo getClazz() {
            return clazz;
        }

```

### UnqualifiedFieldAccess
Instance field access `method` is not qualified with 'this'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

        public MethodInfo getMethod() {
            return method;
        }
    }
```

### UnqualifiedFieldAccess
Instance field access `installationTokenCache` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
    private DynamicGraphQLClient createInstallationGraphQLClient(long installationId)
            throws IOException, ExecutionException, InterruptedException {
        CachedInstallationToken installationToken = installationTokenCache.get(installationId);

        DynamicGraphQLClient graphQLClient = DynamicGraphQLClientBuilder.newBuilder()
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        DynamicGraphQLClient graphQLClient = DynamicGraphQLClientBuilder.newBuilder()
                .url(checkedConfigProvider.instanceEndpoint() + "/graphql")
                .header(AUTHORIZATION_HEADER, String.format(AUTHORIZATION_HEADER_BEARER, installationToken.getToken()))
                .build();
```

### UnqualifiedFieldAccess
Instance field access `installationTokenCache` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
                    try {
                        // this time we invalidate the token entirely and go for a new token
                        installationTokenCache.invalidate(installationId);
                        return createInstallationClient(installationId);
                    } catch (IOException e3) {
```

### UnqualifiedFieldAccess
Instance field access `jwtTokenCreator` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        try {
            jwtToken = jwtTokenCreator.createJwtToken(checkedConfigProvider.appId(), checkedConfigProvider.privateKey(), 540);
        } catch (GeneralSecurityException | IOException e) {
            throw new IllegalStateException("Unable to generate the JWT token", e);
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        try {
            jwtToken = jwtTokenCreator.createJwtToken(checkedConfigProvider.appId(), checkedConfigProvider.privateKey(), 540);
        } catch (GeneralSecurityException | IOException e) {
            throw new IllegalStateException("Unable to generate the JWT token", e);
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

        try {
            jwtToken = jwtTokenCreator.createJwtToken(checkedConfigProvider.appId(), checkedConfigProvider.privateKey(), 540);
        } catch (GeneralSecurityException | IOException e) {
            throw new IllegalStateException("Unable to generate the JWT token", e);
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
            final GitHubBuilder gitHubBuilder = new GitHubBuilder()
                    .withJwtToken(jwtToken)
                    .withEndpoint(checkedConfigProvider.instanceEndpoint());

            return gitHubBuilder.build();
```

### UnqualifiedFieldAccess
Instance field access `installationTokenCache` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
                    try {
                        // this time we invalidate the token entirely and go for a new token
                        installationTokenCache.invalidate(installationId);
                        return createInstallationGraphQLClient(installationId);
                    } catch (IOException | ExecutionException | InterruptedException e3) {
```

### UnqualifiedFieldAccess
Instance field access `installationTokenCache` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

    private GitHub createInstallationClient(long installationId) throws IOException {
        CachedInstallationToken installationToken = installationTokenCache.get(installationId);

        final GitHubBuilder gitHubBuilder = new GitHubBuilder()
```

### UnqualifiedFieldAccess
Instance field access `checkedConfigProvider` is not qualified with 'this'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java
        final GitHubBuilder gitHubBuilder = new GitHubBuilder()
                .withAppInstallationToken(installationToken.getToken())
                .withEndpoint(checkedConfigProvider.instanceEndpoint());

        GitHub gitHub = gitHubBuilder.build();
```

### UnqualifiedFieldAccess
Instance field access `methodsWithBridges` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            if (methodsWithBridges.contains(name) && ((access & Opcodes.ACC_BRIDGE) != 0)
                    && ((access & Opcodes.ACC_SYNTHETIC) != 0)) {

```

### UnqualifiedFieldAccess
Instance field access `className` is not qualified with 'this'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                    && ((access & Opcodes.ACC_SYNTHETIC) != 0)) {

                LOG.debugf("Class %1$s - Removing method %2$s %3$s(%4$s)", className,
                        org.objectweb.asm.Type.getReturnType(descriptor), name,
                        Arrays.toString(org.objectweb.asm.Type.getArgumentTypes(descriptor)));
```

## NestingDepth
### NestingDepth
`generateMultiplexers` is overly nested (maximum nesting depth = 6)
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
     * </ul>
     */
    private static void generateMultiplexers(ClassOutput beanClassOutput,
            IndexView index,
            DispatchingConfiguration dispatchingConfiguration,
```

## ConfusingElse
### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java

            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
        } else if (keyDataString.contains(PKCS_8_PEM_HEADER)) {
            // PKCS#8 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_8_PEM_HEADER, "");
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replaceAll("\\s+", "");
            return readPkcs8PrivateKey(Base64.getDecoder().decode(keyDataString));
        } else {
            throw new IllegalArgumentException("Private key format not supported");
        }
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
        if (captured instanceof CompletionException && captured.getCause() != null) {
            return captured.getCause();
        } else {
            return captured;
        }
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
        if (listener.lastInvocationWasMocked) {
            return result;
        } else {
            call(Mockito.verify(mock, Mockito.atLeastOnce()), invocationOnMockProxy);
            return defaultAnswer.answer(invocationOnMockProxy);
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        if (GHRepository.class.equals(type)) {
            return repositories.getOrCreate(((GHRepository) original).getFullName());
        } else {
            return nonRepositoryMockMap(type).getOrCreate(original.getId());
        }
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
            if (isPullRequest) {
                return this == ISSUES_AND_PULL_REQUESTS || this == PULL_REQUESTS;
            } else {
                return this == ISSUES_AND_PULL_REQUESTS || this == ISSUES;
            }
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
                    fireAsyncCompletionStageRH);
            return bytecodeCreator.invokeVirtualMethod(COMPLETABLE_FUTURE_JOIN, toFutureRH);
        } else {
            return fireAsyncCompletionStageRH;
        }
```

## ParameterHidingMemberVariable
### ParameterHidingMemberVariable
Parameter `token` hides field in class 'CachedInstallationToken'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/CachedInstallationToken.java`
#### Snippet
```java
    private final Instant expiresAt;

    CachedInstallationToken(String token, Date expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt.toInstant();
```

### ParameterHidingMemberVariable
Parameter `expiresAt` hides field in class 'CachedInstallationToken'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/CachedInstallationToken.java`
#### Snippet
```java
    private final Instant expiresAt;

    CachedInstallationToken(String token, Date expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt.toInstant();
```

### ParameterHidingMemberVariable
Parameter `gitHubEvent` hides field in class 'ReplayEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java
    }

    public ReplayEvent(GitHubEvent gitHubEvent) {
        this.event = "github-event";
        this.gitHubEvent = gitHubEvent;
```

### ParameterHidingMemberVariable
Parameter `gitHubEvent` hides field in class 'ErrorHandlerBridgeFunction'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
    private final GHEventPayload payload;

    public ErrorHandlerBridgeFunction(GitHubEvent gitHubEvent) {
        this.gitHubEvent = gitHubEvent;
        this.payload = null;
```

### ParameterHidingMemberVariable
Parameter `gitHubEvent` hides field in class 'ErrorHandlerBridgeFunction'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
    }

    public ErrorHandlerBridgeFunction(GitHubEvent gitHubEvent, GHEventPayload payload) {
        this.gitHubEvent = gitHubEvent;
        this.payload = payload;
```

### ParameterHidingMemberVariable
Parameter `payload` hides field in class 'ErrorHandlerBridgeFunction'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/error/ErrorHandlerBridgeFunction.java`
#### Snippet
```java
    }

    public ErrorHandlerBridgeFunction(GitHubEvent gitHubEvent, GHEventPayload payload) {
        this.gitHubEvent = gitHubEvent;
        this.payload = payload;
```

### ParameterHidingMemberVariable
Parameter `gitHubAppRuntimeConfig` hides field in class 'CheckedConfigProvider'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    @Inject
    CheckedConfigProvider(GitHubAppRuntimeConfig gitHubAppRuntimeConfig, LaunchMode launchMode) {
        this.gitHubAppRuntimeConfig = gitHubAppRuntimeConfig;
        this.launchMode = launchMode;
```

### ParameterHidingMemberVariable
Parameter `launchMode` hides field in class 'CheckedConfigProvider'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    @Inject
    CheckedConfigProvider(GitHubAppRuntimeConfig gitHubAppRuntimeConfig, LaunchMode launchMode) {
        this.gitHubAppRuntimeConfig = gitHubAppRuntimeConfig;
        this.launchMode = launchMode;
```

### ParameterHidingMemberVariable
Parameter `localUrl` hides field in class 'SimpleEventHandler'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
        private final ObjectMapper objectMapper;

        private SimpleEventHandler(String localUrl, OkHttpClient client, ObjectMapper objectMapper) {
            this.client = client;
            this.localUrl = localUrl;
```

### ParameterHidingMemberVariable
Parameter `client` hides field in class 'SimpleEventHandler'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
        private final ObjectMapper objectMapper;

        private SimpleEventHandler(String localUrl, OkHttpClient client, ObjectMapper objectMapper) {
            this.client = client;
            this.localUrl = localUrl;
```

### ParameterHidingMemberVariable
Parameter `objectMapper` hides field in class 'SimpleEventHandler'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
        private final ObjectMapper objectMapper;

        private SimpleEventHandler(String localUrl, OkHttpClient client, ObjectMapper objectMapper) {
            this.client = client;
            this.localUrl = localUrl;
```

### ParameterHidingMemberVariable
Parameter `scope` hides field in class 'CommandConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java
    private final ReactionStrategy reactionStrategy;

    public CommandConfig(CommandScope scope, ExecutionErrorStrategy executionErrorStrategy, String executionErrorMessage,
            ReactionStrategy reactionStrategy) {
        this.scope = scope;
```

### ParameterHidingMemberVariable
Parameter `executionErrorStrategy` hides field in class 'CommandConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java
    private final ReactionStrategy reactionStrategy;

    public CommandConfig(CommandScope scope, ExecutionErrorStrategy executionErrorStrategy, String executionErrorMessage,
            ReactionStrategy reactionStrategy) {
        this.scope = scope;
```

### ParameterHidingMemberVariable
Parameter `executionErrorMessage` hides field in class 'CommandConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java
    private final ReactionStrategy reactionStrategy;

    public CommandConfig(CommandScope scope, ExecutionErrorStrategy executionErrorStrategy, String executionErrorMessage,
            ReactionStrategy reactionStrategy) {
        this.scope = scope;
```

### ParameterHidingMemberVariable
Parameter `reactionStrategy` hides field in class 'CommandConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandConfig.java`
#### Snippet
```java

    public CommandConfig(CommandScope scope, ExecutionErrorStrategy executionErrorStrategy, String executionErrorMessage,
            ReactionStrategy reactionStrategy) {
        this.scope = scope;
        this.executionErrorStrategy = executionErrorStrategy;
```

### ParameterHidingMemberVariable
Parameter `clientSpy` hides field in class 'GHEventPayloadSpyDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java
    private final Function<GHObject, DefaultableMocking<? extends GHObject>> defaultableMockingProvider;

    public GHEventPayloadSpyDefaultAnswer(GitHub clientSpy,
            Function<GHObject, DefaultableMocking<? extends GHObject>> defaultableMockingProvider) {
        this.clientSpy = clientSpy;
```

### ParameterHidingMemberVariable
Parameter `defaultableMockingProvider` hides field in class 'GHEventPayloadSpyDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHEventPayloadSpyDefaultAnswer.java`
#### Snippet
```java

    public GHEventPayloadSpyDefaultAnswer(GitHub clientSpy,
            Function<GHObject, DefaultableMocking<? extends GHObject>> defaultableMockingProvider) {
        this.clientSpy = clientSpy;
        this.defaultableMockingProvider = defaultableMockingProvider;
```

### ParameterHidingMemberVariable
Parameter `testInstance` hides field in class 'GitHubAppTestingContext'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java
    public final CapturingErrorHandler errorHandler = new CapturingErrorHandler();

    private GitHubAppTestingContext(Object testInstance, GitHubMockContextImpl mocks) {
        this.testInstance = testInstance;
        this.mocks = mocks;
```

### ParameterHidingMemberVariable
Parameter `mocks` hides field in class 'GitHubAppTestingContext'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubAppTestingContext.java`
#### Snippet
```java
    public final CapturingErrorHandler errorHandler = new CapturingErrorHandler();

    private GitHubAppTestingContext(Object testInstance, GitHubMockContextImpl mocks) {
        this.testInstance = testInstance;
        this.mocks = mocks;
```

### ParameterHidingMemberVariable
Parameter `index` hides field in class 'HideAirlineInjectAnnotationsTransformer'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/HideAirlineInjectAnnotationsTransformer.java`
#### Snippet
```java
    private final IndexView index;

    HideAirlineInjectAnnotationsTransformer(IndexView index) {
        this.index = index;
    }
```

### ParameterHidingMemberVariable
Parameter `testingContext` hides field in class 'EventSenderOptionsImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java
    private RequestBody requestBody;

    EventSenderOptionsImpl(GitHubAppTestingContext testingContext) {
        this.testingContext = testingContext;
        Duration forever = Duration.ofDays(1);
```

### ParameterHidingMemberVariable
Parameter `requestId` hides field in class 'EventSenderOptionsImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
```

### ParameterHidingMemberVariable
Parameter `deliveryId` hides field in class 'EventSenderOptionsImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventSenderOptionsImpl.java`
#### Snippet
```java

    @Override
    public EventSenderOptions deliveryId(UUID deliveryId) {
        this.deliveryId = deliveryId;
        return this;
```

### ParameterHidingMemberVariable
Parameter `annotation` hides field in class 'EventDefinition'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java
    private final DotName payloadType;

    EventDefinition(DotName annotation, String event, String action, DotName payloadType) {
        this.annotation = annotation;
        this.event = event;
```

### ParameterHidingMemberVariable
Parameter `event` hides field in class 'EventDefinition'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java
    private final DotName payloadType;

    EventDefinition(DotName annotation, String event, String action, DotName payloadType) {
        this.annotation = annotation;
        this.event = event;
```

### ParameterHidingMemberVariable
Parameter `action` hides field in class 'EventDefinition'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java
    private final DotName payloadType;

    EventDefinition(DotName annotation, String event, String action, DotName payloadType) {
        this.annotation = annotation;
        this.event = event;
```

### ParameterHidingMemberVariable
Parameter `payloadType` hides field in class 'EventDefinition'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java
    private final DotName payloadType;

    EventDefinition(DotName annotation, String event, String action, DotName payloadType) {
        this.annotation = annotation;
        this.event = event;
```

### ParameterHidingMemberVariable
Parameter `mock` hides field in class 'DefaultableMocking'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private final StubDetectingInvocationListener listener;

    private DefaultableMocking(M mock, StubDetectingInvocationListener listener) {
        this.mock = mock;
        this.listener = listener;
```

### ParameterHidingMemberVariable
Parameter `listener` hides field in class 'DefaultableMocking'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    private final StubDetectingInvocationListener listener;

    private DefaultableMocking(M mock, StubDetectingInvocationListener listener) {
        this.mock = mock;
        this.listener = listener;
```

### ParameterHidingMemberVariable
Parameter `testingContext` hides field in class 'EventContextSpecificationImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventContextSpecificationImpl.java`
#### Snippet
```java
    private final GitHubAppTestingContext testingContext;

    public EventContextSpecificationImpl(GitHubAppTestingContext testingContext) {
        this.testingContext = testingContext;
        // Support multiple assertions in the same test method
```

### ParameterHidingMemberVariable
Parameter `gitHubEvent` hides field in class 'MultiplexedEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    private final DynamicGraphQLClient gitHubGraphQLClient;

    public MultiplexedEvent(GitHubEvent gitHubEvent, GHEventPayload payload, GitHub gitHub,
            DynamicGraphQLClient gitHubGraphQLClient) {
        this.gitHubEvent = gitHubEvent;
```

### ParameterHidingMemberVariable
Parameter `payload` hides field in class 'MultiplexedEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    private final DynamicGraphQLClient gitHubGraphQLClient;

    public MultiplexedEvent(GitHubEvent gitHubEvent, GHEventPayload payload, GitHub gitHub,
            DynamicGraphQLClient gitHubGraphQLClient) {
        this.gitHubEvent = gitHubEvent;
```

### ParameterHidingMemberVariable
Parameter `gitHub` hides field in class 'MultiplexedEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    private final DynamicGraphQLClient gitHubGraphQLClient;

    public MultiplexedEvent(GitHubEvent gitHubEvent, GHEventPayload payload, GitHub gitHub,
            DynamicGraphQLClient gitHubGraphQLClient) {
        this.gitHubEvent = gitHubEvent;
```

### ParameterHidingMemberVariable
Parameter `gitHubGraphQLClient` hides field in class 'MultiplexedEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java

    public MultiplexedEvent(GitHubEvent gitHubEvent, GHEventPayload payload, GitHub gitHub,
            DynamicGraphQLClient gitHubGraphQLClient) {
        this.gitHubEvent = gitHubEvent;
        this.payload = payload;
```

### ParameterHidingMemberVariable
Parameter `aliases` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    }

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### ParameterHidingMemberVariable
Parameter `parseErrorStrategy` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    }

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### ParameterHidingMemberVariable
Parameter `parseErrorMessage` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    }

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### ParameterHidingMemberVariable
Parameter `defaultCommandConfig` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
        this.aliases = aliases;
```

### ParameterHidingMemberVariable
Parameter `defaultCommandPermissionConfig` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
        this.aliases = aliases;
```

### ParameterHidingMemberVariable
Parameter `defaultCommandTeamConfig` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
        this.aliases = aliases;
        this.parseErrorStrategy = parseErrorStrategy;
```

### ParameterHidingMemberVariable
Parameter `aliases` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    private final CommandTeamConfig defaultCommandTeamConfig;

    public CliConfig(List<String> aliases, CommandConfig defaultCommandConfig,
            CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### ParameterHidingMemberVariable
Parameter `defaultCommandConfig` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    private final CommandTeamConfig defaultCommandTeamConfig;

    public CliConfig(List<String> aliases, CommandConfig defaultCommandConfig,
            CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### ParameterHidingMemberVariable
Parameter `defaultCommandPermissionConfig` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java

    public CliConfig(List<String> aliases, CommandConfig defaultCommandConfig,
            CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
        this.aliases = aliases;
```

### ParameterHidingMemberVariable
Parameter `defaultCommandTeamConfig` hides field in class 'CliConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    public CliConfig(List<String> aliases, CommandConfig defaultCommandConfig,
            CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
        this.aliases = aliases;
        this.parseErrorStrategy = CliOptions.DEFAULT_PARSE_ERROR_STRATEGY;
```

### ParameterHidingMemberVariable
Parameter `delegate` hides field in class 'IndexedGeneratedBeansBuildProducer'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
    private boolean empty = true;

    public IndexedGeneratedBeansBuildProducer(BuildProducer<GeneratedBeanBuildItem> delegate) {
        this.delegate = delegate;
        this.indexer = new Indexer();
```

### ParameterHidingMemberVariable
Parameter `delegate` hides field in class 'GitHubMockDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
    private final Function<String, GHRepository> repositoryMockProvider;

    public GitHubMockDefaultAnswer(Answer<Object> delegate, Function<String, GHRepository> repositoryMockProvider) {
        this.delegate = delegate;
        this.repositoryMockProvider = repositoryMockProvider;
```

### ParameterHidingMemberVariable
Parameter `repositoryMockProvider` hides field in class 'GitHubMockDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GitHubMockDefaultAnswer.java`
#### Snippet
```java
    private final Function<String, GHRepository> repositoryMockProvider;

    public GitHubMockDefaultAnswer(Answer<Object> delegate, Function<String, GHRepository> repositoryMockProvider) {
        this.delegate = delegate;
        this.repositoryMockProvider = repositoryMockProvider;
```

### ParameterHidingMemberVariable
Parameter `name` hides field in class 'EventAnnotation'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final List<AnnotationValue> values;

        EventAnnotation(DotName name, List<AnnotationValue> values) {
            this.name = name;
            this.values = values;
```

### ParameterHidingMemberVariable
Parameter `values` hides field in class 'EventAnnotation'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final List<AnnotationValue> values;

        EventAnnotation(DotName name, List<AnnotationValue> values) {
            this.name = name;
            this.values = values;
```

### ParameterHidingMemberVariable
Parameter `name` hides field in class 'EventAnnotationLiteral'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final List<String> attributes;

        EventAnnotationLiteral(DotName name, List<String> attributes) {
            this.name = name;
            this.attributes = attributes;
```

### ParameterHidingMemberVariable
Parameter `attributes` hides field in class 'EventAnnotationLiteral'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final List<String> attributes;

        EventAnnotationLiteral(DotName name, List<String> attributes) {
            this.name = name;
            this.attributes = attributes;
```

### ParameterHidingMemberVariable
Parameter `eventSubscriberInstance` hides field in class 'EventDispatchingMethod'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final MethodInfo method;

        EventDispatchingMethod(AnnotationInstance eventSubscriberInstance, MethodInfo method) {
            this.eventSubscriberInstance = eventSubscriberInstance;
            this.method = method;
```

### ParameterHidingMemberVariable
Parameter `method` hides field in class 'EventDispatchingMethod'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final MethodInfo method;

        EventDispatchingMethod(AnnotationInstance eventSubscriberInstance, MethodInfo method) {
            this.eventSubscriberInstance = eventSubscriberInstance;
            this.method = method;
```

### ParameterHidingMemberVariable
Parameter `event` hides field in class 'EventDispatchingConfiguration'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final TreeMap<String, EventAnnotation> eventAnnotations = new TreeMap<>();

        EventDispatchingConfiguration(String event, String payloadType) {
            this.event = event;
            this.payloadType = payloadType;
```

### ParameterHidingMemberVariable
Parameter `payloadType` hides field in class 'EventDispatchingConfiguration'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final TreeMap<String, EventAnnotation> eventAnnotations = new TreeMap<>();

        EventDispatchingConfiguration(String event, String payloadType) {
            this.event = event;
            this.payloadType = payloadType;
```

### ParameterHidingMemberVariable
Parameter `someProperty` hides field in class 'MyConfigFile'
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    }

    public MyConfigFile(String someProperty) {
        this.someProperty = someProperty;
    }
```

### ParameterHidingMemberVariable
Parameter `installationId` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

### ParameterHidingMemberVariable
Parameter `appName` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

### ParameterHidingMemberVariable
Parameter `deliveryId` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

### ParameterHidingMemberVariable
Parameter `repository` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

### ParameterHidingMemberVariable
Parameter `event` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

### ParameterHidingMemberVariable
Parameter `action` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    private final boolean replayed;

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
```

### ParameterHidingMemberVariable
Parameter `payload` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
        this.appName = Optional.ofNullable(appName);
```

### ParameterHidingMemberVariable
Parameter `parsedPayload` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
        this.appName = Optional.ofNullable(appName);
```

### ParameterHidingMemberVariable
Parameter `replayed` hides field in class 'GitHubEvent'
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java

    public GitHubEvent(Long installationId, String appName, String deliveryId, String repository, String event, String action,
            String payload, JsonObject parsedPayload, boolean replayed) {
        this.installationId = installationId;
        this.appName = Optional.ofNullable(appName);
```

### ParameterHidingMemberVariable
Parameter `teams` hides field in class 'CommandTeamConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandTeamConfig.java`
#### Snippet
```java
    private final Set<String> teams;

    public CommandTeamConfig(String[] teams) {
        this.teams = teams != null ? new HashSet<>(Arrays.asList(teams)) : Collections.emptySet();
    }
```

### ParameterHidingMemberVariable
Parameter `testingContext` hides field in class 'ValidatableEventHandlingImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/ValidatableEventHandlingImpl.java`
#### Snippet
```java
    private final GitHubAppTestingContext testingContext;

    ValidatableEventHandlingImpl(GitHubAppTestingContext testingContext) {
        this.testingContext = testingContext;
    }
```

### ParameterHidingMemberVariable
Parameter `testingContext` hides field in class 'EventHandlingResponseImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/EventHandlingResponseImpl.java`
#### Snippet
```java
    private final GitHubAppTestingContext testingContext;

    EventHandlingResponseImpl(GitHubAppTestingContext testingContext) {
        this.testingContext = testingContext;
    }
```

### ParameterHidingMemberVariable
Parameter `index` hides field in class 'AdditionalEventDispatchingClassesIndexBuildItem'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/AdditionalEventDispatchingClassesIndexBuildItem.java`
#### Snippet
```java
    private final IndexView index;

    public AdditionalEventDispatchingClassesIndexBuildItem(IndexView index) {
        this.index = index;
    }
```

### ParameterHidingMemberVariable
Parameter `eventDefinitionAnnotations` hides field in class 'VetoUserDefinedEventListeningClassesAnnotationsTransformer'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/VetoUserDefinedEventListeningClassesAnnotationsTransformer.java`
#### Snippet
```java
    private final Set<DotName> eventDefinitionAnnotations;

    VetoUserDefinedEventListeningClassesAnnotationsTransformer(Set<DotName> eventDefinitionAnnotations) {
        this.eventDefinitionAnnotations = eventDefinitionAnnotations;
    }
```

### ParameterHidingMemberVariable
Parameter `permission` hides field in class 'CommandPermissionConfig'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandPermissionConfig.java`
#### Snippet
```java
    private final GHPermissionType permission;

    public CommandPermissionConfig(GHPermissionType permission) {
        this.permission = permission;
    }
```

### ParameterHidingMemberVariable
Parameter `clazz` hides field in class 'MockMap'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        private final Map<ID, DefaultableMocking<T>> map = new LinkedHashMap<>();

        private MockMap(Class<T> clazz) {
            this(clazz, mockSettings -> {
            });
```

### ParameterHidingMemberVariable
Parameter `ref` hides field in class 'null'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

            @Override
            public GitHubMockConfigFileSetupContext withRef(String ref) {
                this.ref = ref;
                return this;
```

### ParameterHidingMemberVariable
Parameter `clazz` hides field in class 'MockMap'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        }

        private MockMap(Class<T> clazz, Consumer<MockSettings> mockSettingsContributor) {
            this.clazz = clazz;
            this.mockSettingsContributor = mockSettings -> {
```

### ParameterHidingMemberVariable
Parameter `mockSettingsContributor` hides field in class 'MockMap'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        }

        private MockMap(Class<T> clazz, Consumer<MockSettings> mockSettingsContributor) {
            this.clazz = clazz;
            this.mockSettingsContributor = mockSettings -> {
```

### ParameterHidingMemberVariable
Parameter `defaultAnswers` hides field in class 'GitHubMockContextImpl'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    private final Answers defaultAnswers;

    GitHubMockContextImpl(Answers defaultAnswers) {
        this.defaultAnswers = defaultAnswers;
        fileDownloader = MockitoUtils.doWithMockedClassClassLoader(GitHubFileDownloader.class,
```

### ParameterHidingMemberVariable
Parameter `message` hides field in class 'ExecutionErrorStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        private final boolean message;

        ExecutionErrorStrategy(boolean message) {
            this.message = message;
        }
```

### ParameterHidingMemberVariable
Parameter `reactionOnProgress` hides field in class 'ReactionStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        private final boolean reactionOnError;

        ReactionStrategy(boolean reactionOnProgress, boolean reactionOnNormalFlow, boolean reactionOnError) {
            this.reactionOnProgress = reactionOnProgress;
            this.reactionOnNormalFlow = reactionOnNormalFlow;
```

### ParameterHidingMemberVariable
Parameter `reactionOnNormalFlow` hides field in class 'ReactionStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        private final boolean reactionOnError;

        ReactionStrategy(boolean reactionOnProgress, boolean reactionOnNormalFlow, boolean reactionOnError) {
            this.reactionOnProgress = reactionOnProgress;
            this.reactionOnNormalFlow = reactionOnNormalFlow;
```

### ParameterHidingMemberVariable
Parameter `reactionOnError` hides field in class 'ReactionStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        private final boolean reactionOnError;

        ReactionStrategy(boolean reactionOnProgress, boolean reactionOnNormalFlow, boolean reactionOnError) {
            this.reactionOnProgress = reactionOnProgress;
            this.reactionOnNormalFlow = reactionOnNormalFlow;
```

### ParameterHidingMemberVariable
Parameter `message` hides field in class 'ParseErrorStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        private final boolean errors;

        ParseErrorStrategy(boolean message, boolean help, boolean errors) {
            this.message = message;
            this.help = help;
```

### ParameterHidingMemberVariable
Parameter `help` hides field in class 'ParseErrorStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        private final boolean errors;

        ParseErrorStrategy(boolean message, boolean help, boolean errors) {
            this.message = message;
            this.help = help;
```

### ParameterHidingMemberVariable
Parameter `errors` hides field in class 'ParseErrorStrategy'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        private final boolean errors;

        ParseErrorStrategy(boolean message, boolean help, boolean errors) {
            this.message = message;
            this.help = help;
```

### ParameterHidingMemberVariable
Parameter `clientSpy` hides field in class 'GHObjectSpyDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
    private final DefaultableMocking<? extends GHObject> ghObjectMocking;

    public GHObjectSpyDefaultAnswer(GitHub clientSpy,
            GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy,
            DefaultableMocking<? extends GHObject> ghObjectMocking) {
```

### ParameterHidingMemberVariable
Parameter `callRealMethodAndSpy` hides field in class 'GHObjectSpyDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java

    public GHObjectSpyDefaultAnswer(GitHub clientSpy,
            GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy,
            DefaultableMocking<? extends GHObject> ghObjectMocking) {
        this.clientSpy = clientSpy;
```

### ParameterHidingMemberVariable
Parameter `ghObjectMocking` hides field in class 'GHObjectSpyDefaultAnswer'
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/GHObjectSpyDefaultAnswer.java`
#### Snippet
```java
    public GHObjectSpyDefaultAnswer(GitHub clientSpy,
            GHEventPayloadSpyDefaultAnswer callRealMethodAndSpy,
            DefaultableMocking<? extends GHObject> ghObjectMocking) {
        this.clientSpy = clientSpy;
        this.callRealMethodAndSpy = callRealMethodAndSpy;
```

### ParameterHidingMemberVariable
Parameter `cliConfig` hides field in class 'AbstractCommandDispatcher'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    private final Map<String, CommandTeamConfig> commandTeamConfigs;

    protected AbstractCommandDispatcher(Class<?> cliClass, CliConfig cliConfig) {
        ParserBuilder<C> parserBuilder = new ParserBuilder<C>();
        parserBuilder.withCommandFactory(new ArcCommandFactory<>());
```

### ParameterHidingMemberVariable
Parameter `cli` hides field in class 'AbstractCommandDispatcher'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    }

    private boolean matches(String cli) {
        for (String alias : cliConfig.getAliases()) {
            if (alias.equals(cli)) {
```

### ParameterHidingMemberVariable
Parameter `commandLine` hides field in class 'CommandExecutionContext'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        private final CommandConfig commandConfig;

        public CommandExecutionContext(String commandLine, C command, CommandConfig commandConfig, GHReaction ackReaction) {
            this.commandLine = commandLine;
            this.command = command;
```

### ParameterHidingMemberVariable
Parameter `command` hides field in class 'CommandExecutionContext'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        private final CommandConfig commandConfig;

        public CommandExecutionContext(String commandLine, C command, CommandConfig commandConfig, GHReaction ackReaction) {
            this.commandLine = commandLine;
            this.command = command;
```

### ParameterHidingMemberVariable
Parameter `commandConfig` hides field in class 'CommandExecutionContext'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        private final CommandConfig commandConfig;

        public CommandExecutionContext(String commandLine, C command, CommandConfig commandConfig, GHReaction ackReaction) {
            this.commandLine = commandLine;
            this.command = command;
```

### ParameterHidingMemberVariable
Parameter `ackReaction` hides field in class 'CommandExecutionContext'
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        private final CommandConfig commandConfig;

        public CommandExecutionContext(String commandLine, C command, CommandConfig commandConfig, GHReaction ackReaction) {
            this.commandLine = commandLine;
            this.command = command;
```

### ParameterHidingMemberVariable
Parameter `clazz` hides field in class 'RunMethod'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        private final MethodInfo method;

        private RunMethod(ClassInfo clazz, MethodInfo method) {
            this.clazz = clazz;
            this.method = method;
```

### ParameterHidingMemberVariable
Parameter `method` hides field in class 'RunMethod'
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        private final MethodInfo method;

        private RunMethod(ClassInfo clazz, MethodInfo method) {
            this.clazz = clazz;
            this.method = method;
```

### ParameterHidingMemberVariable
Parameter `checkedConfigProvider` hides field in class 'GitHubService'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

    @Inject
    public GitHubService(CheckedConfigProvider checkedConfigProvider, JwtTokenCreator jwtTokenCreator) {
        this.checkedConfigProvider = checkedConfigProvider;
        this.jwtTokenCreator = jwtTokenCreator;
```

### ParameterHidingMemberVariable
Parameter `jwtTokenCreator` hides field in class 'GitHubService'
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/GitHubService.java`
#### Snippet
```java

    @Inject
    public GitHubService(CheckedConfigProvider checkedConfigProvider, JwtTokenCreator jwtTokenCreator) {
        this.checkedConfigProvider = checkedConfigProvider;
        this.jwtTokenCreator = jwtTokenCreator;
```

### ParameterHidingMemberVariable
Parameter `className` hides field in class 'RemoveBridgeMethodsClassVisitor'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        private final Set<String> methodsWithBridges;

        public RemoveBridgeMethodsClassVisitor(ClassVisitor visitor, String className, Set<String> methodsWithBridges) {
            super(Gizmo.ASM_API_VERSION, visitor);

```

### ParameterHidingMemberVariable
Parameter `methodsWithBridges` hides field in class 'RemoveBridgeMethodsClassVisitor'
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        private final Set<String> methodsWithBridges;

        public RemoveBridgeMethodsClassVisitor(ClassVisitor visitor, String className, Set<String> methodsWithBridges) {
            super(Gizmo.ASM_API_VERSION, visitor);

```

## UseOfAnotherObjectsPrivateField
### UseOfAnotherObjectsPrivateField
Direct access to non-public field `lastInvocationWasMocked` of another object
in `testing/src/main/java/io/quarkiverse/githubapp/testing/mockito/internal/DefaultableMocking.java`
#### Snippet
```java
    Object callMockOrDefault(InvocationOnMock invocationOnMockProxy, Answer<?> defaultAnswer) throws Throwable {
        Object result = callMock(invocationOnMockProxy);
        if (listener.lastInvocationWasMocked) {
            return result;
        } else {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `verbose` of another object
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        @Override
        public int compareTo(EventAnnotation other) {
            int nameCompareTo = name.compareTo(other.name);
            if (nameCompareTo != 0) {
                return nameCompareTo;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `values` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
                return nameCompareTo;
            }
            int valuesLengthCompare = Integer.compare(values.size(), other.values.size());
            if (valuesLengthCompare != 0) {
                return valuesLengthCompare;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `values` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            for (int i = 0; i < values.size(); i++) {
                // we only support string for now, we can adjust later
                int valueCompare = values.get(i).asString().compareTo(other.values.get(i).asString());
                if (valueCompare != 0) {
                    return valueCompare;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `method` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        @Override
        public int compareTo(EventDispatchingMethod other) {
            int classNameCompareTo = method.declaringClass().name().compareTo(other.method.declaringClass().name());
            if (classNameCompareTo != 0) {
                return classNameCompareTo;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `method` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            }

            int methodNameComparator = method.toString().compareTo(other.method.toString());
            if (methodNameComparator != 0) {
                return methodNameComparator;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `eventSubscriberInstance` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            }

            return eventSubscriberInstance.toString(false).compareTo(other.eventSubscriberInstance.toString(false));
        }
    }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
            EventAnnotationLiteral other = (EventAnnotationLiteral) obj;

            return Objects.equals(name, other.name) &&
                    Objects.equals(attributes, other.attributes);
        }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `attributes` of another object
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java

            return Objects.equals(name, other.name) &&
                    Objects.equals(attributes, other.attributes);
        }

```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `map` of another object
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        Mockito.reset(fileDownloader);
        for (MockMap<?, ?> mockMap : allMockMaps) {
            mockMap.map.clear();
        }
    }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `clazz` of another object
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
        List<GHObject> result = new ArrayList<>();
        for (MockMap<?, ?> mockMap : allMockMaps) {
            if (!GHObject.class.isAssignableFrom(mockMap.clazz)) {
                continue;
            }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `map` of another object
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
                continue;
            }
            for (DefaultableMocking<?> mocking : mockMap.map.values()) {
                result.add((GHObject) mocking.mock());
            }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `verbose` of another object
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
        @Override
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (verboseModule.verbose) {
                issueCommentPayload.getIssue().comment("hello from @composition test - verbose");
            } else {
```

## SynchronizeOnThis
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

## PackageVisibleInnerClass
### PackageVisibleInnerClass
Package-visible nested class `WriteCommand`
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java

    @Command(name = "write-command") // <2>
    static class WriteCommand implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
public class PermissionOverrideCli {

    interface Commands {

        void run() throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `AdminCommand`
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    @Command(name = "admin-command")
    @Permission(GHPermissionType.ADMIN) // <3>
    static class AdminCommand implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
public class InjectMetadataCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `Command1`
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @AirlineInject // <1>
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
public class CommandOptionsCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `CommandWithCustomExecutionErrorMessage`
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "execution-error-message")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE, executionErrorMessage = "Your custom error message") // <1>
    static class CommandWithCustomExecutionErrorMessage implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `CommandWithCustomExecutionErrorStrategy`
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "execution-error-strategy")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE) // <1>
    static class CommandWithCustomExecutionErrorStrategy implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `CommandOnlyForIssues`
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "only-for-issues")
    @CommandOptions(scope = CommandScope.ISSUES) // <1>
    static class CommandOnlyForIssues implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `CommandWithCustomReactionStrategy`
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "reaction-strategy")
    @CommandOptions(reactionStrategy = ReactionStrategy.NONE)
    static class CommandWithCustomReactionStrategy implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `CommandOnlyForPullRequests`
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "only-for-pull-requests")
    @CommandOptions(scope = CommandScope.PULL_REQUESTS) // <1>
    static class CommandOnlyForPullRequests implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `ParseErrorMessageCliCommand`
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorMessageCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class ParseErrorMessageCliCommand implements Runnable {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
public class GitHubInjectionCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
```

### PackageVisibleInnerClass
Package-visible nested class `Command2`
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

    @Command(name = "command2")
    static class Command2 implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Command1`
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `ParseErrorStrategyCliCommand`
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorStrategyCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class ParseErrorStrategyCliCommand implements Runnable {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `MyTeamCommand`
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    @Command(name = "command")
    @Team({ "my-team1", "my-team2" }) // <1>
    static class MyTeamCommand implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
public class TeamPermissionCli {

    interface Commands {

        void run() throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `DefaultCommandOptionsCliCommand`
in `docs/modules/ROOT/examples/command/airline/CliOptionsDefaultCommandOptionsCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class DefaultCommandOptionsCliCommand implements Runnable {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `RetestCommand`
in `docs/modules/ROOT/examples/command/airline/MyFirstCli.java`
#### Snippet
```java

    @Command(name = "retest") // <2>
    static class RetestCommand implements Runnable { // <3>

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
public class GroupCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `ListCommand`
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

    @Command(name = "list") // <2>
    static class ListCommand implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `ShowCommand`
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

    @Command(name = "show") // <3>
    static class ShowCommand implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestTeam1Command`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
    @Command(name = "team1")
    @Team("my-team-1")
    static class TestTeam1Command implements TeamCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestTwoTeamsCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
    @Command(name = "two-teams")
    @Team({ "my-team-1", "my-team-2" })
    static class TestTwoTeamsCommand implements TeamCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
public class PayloadInjectionCli {

    interface Commands { // <1>

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException; // <2>
```

### PackageVisibleInnerClass
Package-visible nested class `Command2`
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java

    @Command(name = "command2")
    static class Command2 implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Command1`
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java
public class ArgumentsCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `CommandWithArguments`
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java

    @Command(name = "add-users")
    static class CommandWithArguments implements Commands {

        @Arguments(description = "List of GitHub usernames") // <1>
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCommand implements CdiInjectionCommand {

        @AirlineInject
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
    @Command(name = "command1")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE)
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCommand implements ServiceInjectionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCompositionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCompositionCommand implements DefaultCommand {

        @AirlineModule
```

### PackageVisibleInnerClass
Package-visible nested class `TestReadPermissionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
    @Command(name = "test-read-permission")
    @Permission(GHPermissionType.READ)
    static class TestReadPermissionCommand implements PermissionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestAdminPermissionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
    @Command(name = "test-admin-permission")
    @Permission(GHPermissionType.ADMIN)
    static class TestAdminPermissionCommand implements PermissionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestNoPermissionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java

    @Command(name = "test-no-permission")
    static class TestNoPermissionCommand implements PermissionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
public class PermissionCli {

    interface Commands {

        void run() throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `WriteCommand`
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    @Command(name = "write-command")
    @Permission(GHPermissionType.WRITE) // <1>
    static class WriteCommand implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `HelpCommand`
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "help", description = "Print help")
    static class HelpCommand extends AbstractHelpCommand implements Commands { // <3>

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
public class HelpCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `Command2`
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "command2", description = "Do command2 with style")
    static class Command2 implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `Command1`
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Do command1 with style") // <2>
    static class Command1 implements Commands {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `AliasesCliCommand`
in `docs/modules/ROOT/examples/command/airline/CliOptionsAliasesCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class AliasesCliCommand implements Runnable {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCommand implements ConfigFileReaderCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestGroup1Command1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestGroup1Command1 implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestBasicCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "basic")
    static class TestBasicCommand implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestGroup1Command2`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "command2")
    static class TestGroup1Command2 implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommandWithArguments`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "command-with-arguments")
    static class TestCommandWithArguments implements DefaultCommand {

        @Arguments(title = "username")
```

### PackageVisibleInnerClass
Package-visible nested class `EventAnnotationLiteral`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    static class EventAnnotationLiteral {

        private final DotName name;
```

### PackageVisibleInnerClass
Package-visible nested class `EventDispatchingConfiguration`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    static class EventDispatchingConfiguration {

        private final String event;
```

### PackageVisibleInnerClass
Package-visible nested class `EventDispatchingMethod`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    static class EventDispatchingMethod implements Comparable<EventDispatchingMethod> {

        private final AnnotationInstance eventSubscriberInstance;
```

### PackageVisibleInnerClass
Package-visible nested class `EventAnnotation`
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
    }

    static class EventAnnotation implements Comparable<EventAnnotation> {

        private final DotName name;
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestTeam2Command`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
    @Command(name = "team2")
    @Team("my-team-2")
    static class TestTeam2Command implements TeamCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestNoTeamsCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java

    @Command(name = "no-teams")
    static class TestNoTeamsCommand implements TeamCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand2`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "command2")
    @CommandOptions(scope = CommandScope.ISSUES_AND_PULL_REQUESTS)
    static class TestCommand2 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestSubclassCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @Command(name = "subclass-command1")
    @DoNothing
    static class TestSubclassCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestApplicationScopedCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @Command(name = "application-scoped-command1")
    @ApplicationScoped
    static class TestApplicationScopedCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestApplicationScopedCommand2`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @CommandOptions(scope = CommandScope.ISSUES_AND_PULL_REQUESTS)
    @ApplicationScoped
    static class TestApplicationScopedCommand2 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestSubclassCommand2`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @CommandOptions(scope = CommandScope.ISSUES_AND_PULL_REQUESTS)
    @DoNothing
    static class TestSubclassCommand2 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCommand1`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `HelpCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "help", description = "Push a message with help")
    static class HelpCommand extends AbstractHelpCommand implements TestCommand {
    }

```

### PackageVisibleInnerClass
Package-visible nested class `TestWritePermissionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
    @Command(name = "test-write-permission")
    @Permission(GHPermissionType.WRITE)
    static class TestWritePermissionCommand implements PermissionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestNoPermissionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java

    @Command(name = "test-no-permission")
    static class TestNoPermissionCommand implements PermissionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestAdminPermissionCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
    @Command(name = "test-admin-permission")
    @Permission(GHPermissionType.ADMIN)
    static class TestAdminPermissionCommand implements PermissionCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestAllCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "all")
    @CommandOptions(reactionStrategy = ReactionStrategy.ALL)
    static class TestAllCommand implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestNoneCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "none")
    @CommandOptions(reactionStrategy = ReactionStrategy.NONE)
    static class TestNoneCommand implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestProgressCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "progress")
    @CommandOptions(reactionStrategy = ReactionStrategy.ON_PROGRESS)
    static class TestProgressCommand implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestProgressErrorCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "progress-error")
    @CommandOptions(reactionStrategy = ReactionStrategy.ON_PROGRESS_ON_ERROR)
    static class TestProgressErrorCommand implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestCompositionCommand`
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCompositionCommand implements DefaultCommand {

        @AirlineModule // <1>
```

### PackageVisibleInnerClass
Package-visible nested class `Commands`
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
public class CdiInjectionCli {

    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
```

### PackageVisibleInnerClass
Package-visible nested class `Command1`
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @Inject
```

### PackageVisibleInnerClass
Package-visible nested class `TestOverrideCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
    @Command(name = "override")
    @CommandOptions(reactionStrategy = ReactionStrategy.ALL)
    static class TestOverrideCommand implements DefaultCommand {

        @Override
```

### PackageVisibleInnerClass
Package-visible nested class `TestNoOverrideCommand`
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java

    @Command(name = "no-override")
    static class TestNoOverrideCommand implements DefaultCommand {

        @Override
```

## unused
### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void beanConfig(CombinedIndexBuildItem index,
            BuildProducer<BeanDefiningAnnotationBuildItem> beanDefiningAnnotations,
            BuildProducer<AnnotationsTransformerBuildItem> annotationsTransformer) {
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void indexAnnotations(BuildProducer<AdditionalIndexedClassesBuildItem> additionalIndexedClasses) {
        // adding the *Options annotations
        additionalIndexedClasses
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java

    @BuildStep
    public void generate(CombinedIndexBuildItem index,
            BuildProducer<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingClassesIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
        private final MethodInfo method;

        private RunMethod(ClassInfo clazz, MethodInfo method) {
            this.clazz = clazz;
            this.method = method;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/HideAirlineInjectAnnotationsTransformer.java`
#### Snippet
```java
    private final IndexView index;

    HideAirlineInjectAnnotationsTransformer(IndexView index) {
        this.index = index;
    }
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/IndexedGeneratedBeansBuildProducer.java`
#### Snippet
```java
    private boolean empty = true;

    public IndexedGeneratedBeansBuildProducer(BuildProducer<GeneratedBeanBuildItem> delegate) {
        this.delegate = delegate;
        this.indexer = new Indexer();
```

### unused
Field is never assigned.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java

    @AirlineInject
    public GlobalMetadata<?> global;

    @Arguments
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
     * The aliases of the command. They will be recognized as triggering this particular command set.
     */
    String[] aliases() default {};

    /**
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
     * The error strategy when an error occurs parsing the command.
     */
    ParseErrorStrategy parseErrorStrategy() default ParseErrorStrategy.COMMENT_MESSAGE_HELP_ERRORS;

    /**
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
     * The error message when an error occurs parsing the command.
     */
    String parseErrorMessage() default DEFAULT_PARSE_ERROR_MESSAGE;

    /**
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
     * Default options applied to all this command set, except if they are overridden at the command level.
     */
    CommandOptions defaultCommandOptions() default @CommandOptions;

    public enum ParseErrorStrategy {
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CliOptions.java`
#### Snippet
```java
        private final boolean errors;

        ParseErrorStrategy(boolean message, boolean help, boolean errors) {
            this.message = message;
            this.help = help;
```

### unused
Method is never used.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
     * Whether the command should target issues, pull requests or both.
     */
    CommandScope scope() default CommandScope.ISSUES_AND_PULL_REQUESTS;

    /**
```

### unused
Method is never used.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
     * The error strategy when an error occurs executing the command.
     */
    ExecutionErrorStrategy executionErrorStrategy() default ExecutionErrorStrategy.NONE;

    /**
```

### unused
Method is never used.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
     * The error message when an error occurs executing the command.
     */
    String executionErrorMessage() default DEFAULT_EXECUTION_ERROR_MESSAGE;

    /**
```

### unused
Method is never used.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
     * The reaction strategy used to provide feedback via comment reactions.
     */
    ReactionStrategy reactionStrategy() default ReactionStrategy.ALL;

    public enum ExecutionErrorStrategy {
```

### unused
Method is never used.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/CommandOptions.java`
#### Snippet
```java
        }

        public boolean reactionOnNormalFlow() {
            return reactionOnNormalFlow;
        }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/Permission.java`
#### Snippet
```java
public @interface Permission {

    GHPermissionType value();
}

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/Team.java`
#### Snippet
```java
     * The slug of the teams (i.e. what is in the URL of the team page).
     */
    String[] value();
}

```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    private final Map<String, CommandTeamConfig> commandTeamConfigs;

    protected AbstractCommandDispatcher(Class<?> cliClass, CliConfig cliConfig) {
        ParserBuilder<C> parserBuilder = new ParserBuilder<C>();
        parserBuilder.withCommandFactory(new ArcCommandFactory<>());
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    protected abstract Map<String, CommandTeamConfig> getCommandTeamConfigs();

    protected Optional<CommandExecutionContext<C>> getCommand(GHEventPayload.IssueComment issueCommentPayload) {
        String body = issueCommentPayload.getComment().getBody();

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
    }

    protected void handleExecutionError(GHEventPayload.IssueComment issueCommentPayload,
            CommandExecutionContext<C> commandExecutionContext) {
        CommandConfig commandConfig = commandExecutionContext.getCommandConfig();
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        private final CommandConfig commandConfig;

        public CommandExecutionContext(String commandLine, C command, CommandConfig commandConfig, GHReaction ackReaction) {
            this.commandLine = commandLine;
            this.command = command;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        public C getCommand() {
            return command;
        }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/AbstractCommandDispatcher.java`
#### Snippet
```java
        }

        public GHReaction getAckReaction() {
            return ackReaction;
        }
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    private final CommandTeamConfig defaultCommandTeamConfig;

    public CliConfig(List<String> aliases, CommandConfig defaultCommandConfig,
            CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CliConfig.java`
#### Snippet
```java
    }

    public CliConfig(List<String> aliases, ParseErrorStrategy parseErrorStrategy, String parseErrorMessage,
            CommandConfig defaultCommandConfig, CommandPermissionConfig defaultCommandPermissionConfig,
            CommandTeamConfig defaultCommandTeamConfig) {
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandExecutionException.java`
#### Snippet
```java
public class CommandExecutionException extends RuntimeException {

    public CommandExecutionException(String message, Exception cause) {
        super(message, cause);
    }
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandPermissionConfig.java`
#### Snippet
```java
    private final GHPermissionType permission;

    public CommandPermissionConfig(GHPermissionType permission) {
        this.permission = permission;
    }
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/CommandTeamConfig.java`
#### Snippet
```java
    private final Set<String> teams;

    public CommandTeamConfig(String[] teams) {
        this.teams = teams != null ? new HashSet<>(Arrays.asList(teams)) : Collections.emptySet();
    }
```

### unused
Method is never used.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
    }

    public static void deleteReaction(GHEventPayload.IssueComment issueCommentPayload, GHReaction reaction) {
        if (reaction == null) {
            return;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/AdditionalEventDispatchingClassesIndexBuildItem.java`
#### Snippet
```java
    private final IndexView index;

    public AdditionalEventDispatchingClassesIndexBuildItem(IndexView index) {
        this.index = index;
    }
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final TreeMap<String, EventAnnotation> eventAnnotations = new TreeMap<>();

        EventDispatchingConfiguration(String event, String payloadType) {
            this.event = event;
            this.payloadType = payloadType;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final List<AnnotationValue> values;

        EventAnnotation(DotName name, List<AnnotationValue> values) {
            this.name = name;
            this.values = values;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final List<String> attributes;

        EventAnnotationLiteral(DotName name, List<String> attributes) {
            this.name = name;
            this.attributes = attributes;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
        private final MethodInfo method;

        EventDispatchingMethod(AnnotationInstance eventSubscriberInstance, MethodInfo method) {
            this.eventSubscriberInstance = eventSubscriberInstance;
            this.method = method;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/EventDefinition.java`
#### Snippet
```java
    private final DotName payloadType;

    EventDefinition(DotName annotation, String event, String action, DotName payloadType) {
        this.annotation = annotation;
        this.event = event;
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    void registerForReflection(CombinedIndexBuildItem combinedIndex,
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<ReflectiveClassBuildItem> reflectiveClasses,
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    void additionalBeans(CombinedIndexBuildItem index, BuildProducer<AdditionalBeanBuildItem> additionalBeans) {
        AdditionalBeanBuildItem.Builder additionalBeanBuildItemBuilder = new AdditionalBeanBuildItem.Builder().addBeanClasses(
                GitHubService.class,
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
     */
    @BuildStep
    void removeCompatibilityBridgeMethodsFromGitHubApi(
            BuildProducer<BytecodeTransformerBuildItem> bytecodeTransformers,
            List<GitHubApiClassWithBridgeMethodsBuildItem> gitHubApiClassesWithBridgeMethods) {
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    void generateClasses(CombinedIndexBuildItem combinedIndex, LaunchModeBuildItem launchMode,
            List<AdditionalEventDispatchingClassesIndexBuildItem> additionalEventDispatchingIndexes,
            BuildProducer<AdditionalBeanBuildItem> additionalBeans,
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    @BuildStep
    void replayUiDeployment(LaunchModeBuildItem launchMode,
            BuildProducer<WebJarBuildItem> webJars) throws IOException {
        if (launchMode.getLaunchMode() != LaunchMode.DEVELOPMENT) {
```

### unused
Method is never used.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    void replayUi(GitHubAppRecorder recorder,
            LaunchModeBuildItem launchMode,
            WebJarResultsBuildItem webJarResults,
```

### unused
Parameter `gitHubEventRh` is not used
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java

    private static ResultHandle fireAsyncAction(BytecodeCreator bytecodeCreator, LaunchMode launchMode, String className,
            ResultHandle gitHubEventRh, ResultHandle multiplexedEventRh, ResultHandle annotationLiteralArrayRh) {
        ResultHandle cdiEventRh = bytecodeCreator.invokeInterfaceMethod(EVENT_SELECT,
                bytecodeCreator.readInstanceField(
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/GitHubAppProcessor.java`
#### Snippet
```java
        private final Set<String> methodsWithBridges;

        public RemoveBridgeMethodsClassVisitor(ClassVisitor visitor, String className, Set<String> methodsWithBridges) {
            super(Gizmo.ASM_API_VERSION, visitor);

```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/VetoUserDefinedEventListeningClassesAnnotationsTransformer.java`
#### Snippet
```java
    private final Set<DotName> eventDefinitionAnnotations;

    VetoUserDefinedEventListeningClassesAnnotationsTransformer(Set<DotName> eventDefinitionAnnotations) {
        this.eventDefinitionAnnotations = eventDefinitionAnnotations;
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
Field is never assigned.
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java

        @Arguments(description = "List of GitHub usernames") // <1>
        List<String> usernames;

        @Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
    }

```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
    }

```

### unused
Parameter `gitHub` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException; // <1>
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException;
    }

```

### unused
Parameter `gitHub` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub) throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
    interface Commands {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
Field has no usages.
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java

        @AirlineInject // <1>
        GlobalMetadata<InjectMetadataCli> globalMetadata;

        @AirlineInject // <1>
```

### unused
Field has no usages.
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java

        @AirlineInject // <1>
        CommandMetadata commandMetadata;

        @Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
    interface Commands { // <1>

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException; // <2>
    }

```

### unused
Variable `pullRequest` is never used
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
        public void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException {
            if (issueCommentPayload.getIssue().isPullRequest()) {
                GHPullRequest pullRequest = issueCommentPayload.getRepository()
                        .getPullRequest(issueCommentPayload.getIssue().getNumber()); // <4>

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    interface Commands {

        void run() throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
public @interface CheckRun {

    String value() default Actions.ALL;

    @CheckRun(Completed.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface RequestedAction {

        String NAME = Actions.REQUESTED_ACTION;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Rerequested {

        String NAME = Actions.REREQUESTED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
public @interface CheckSuite {

    String value() default Actions.ALL;

    @CheckSuite(Completed.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CheckSuite.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Rerequested {

        String NAME = Actions.REREQUESTED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/CommitComment.java`
#### Snippet
```java
public @interface CommitComment {

    String value() default Actions.ALL;

    @CommitComment(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/CommitComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Create.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Create {

}
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Delete.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Delete {

}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Deployment.java`
#### Snippet
```java
public @interface Deployment {

    String value() default Actions.ALL;

    @Deployment(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Deployment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/DeploymentStatus.java`
#### Snippet
```java
public @interface DeploymentStatus {

    String value() default Actions.ALL;

    @DeploymentStatus(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/DeploymentStatus.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
public @interface Discussion {

    String value() default Actions.ALL;

    @Discussion(Answered.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Answered {

        String NAME = Actions.ANSWERED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface CategoryChanged {

        String NAME = Actions.CATEGORY_CHANGED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Pinned {

        String NAME = Actions.PINNED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unanswered {

        String NAME = Actions.UNANSWERED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Discussion.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpinned {

        String NAME = Actions.UNPINNED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Event.java`
#### Snippet
```java
public @interface Event {

    String name();

    Class<? extends GHEventPayload> payload();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Event.java`
#### Snippet
```java
    String name();

    Class<? extends GHEventPayload> payload();
}

```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Fork.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Fork {

}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
public @interface Installation {

    String value() default Actions.ALL;

    @Installation(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface NewPermissionsAccepted {

        String NAME = Actions.NEW_PERMISSIONS_ACCEPTED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Suspend {

        String NAME = Actions.SUSPEND;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Installation.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unsuspend {

        String NAME = Actions.UNSUSPEND;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
public @interface InstallationRepositories {

    String value() default Actions.ALL;

    @InstallationRepositories(Added.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Added {

        String NAME = Actions.ADDED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/InstallationRepositories.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Removed {

        String NAME = Actions.REMOVED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
public @interface Issue {

    String value() default Actions.ALL;

    @Issue(Assigned.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Assigned {

        String NAME = Actions.ASSIGNED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Closed {

        String NAME = Actions.CLOSED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Demilestoned {

        String NAME = Actions.DEMILESTONED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Milestoned {

        String NAME = Actions.MILESTONED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Pinned {

        String NAME = Actions.PINNED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reopened {

        String NAME = Actions.REOPENED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unassigned {

        String NAME = Actions.UNASSIGNED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Issue.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpinned {

        String NAME = Actions.UNPINNED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
public @interface IssueComment {

    String value() default Actions.ALL;

    @IssueComment(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/IssueComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Label.java`
#### Snippet
```java
public @interface Label {

    String value() default Actions.ALL;

    @Label(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Ping.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Ping {

}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
public @interface ProjectsV2Item {

    String value() default Actions.ALL;

    @ProjectsV2Item(Archived.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Converted {

        String NAME = Actions.CONVERTED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reordered {

        String NAME = Actions.REORDERED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/ProjectsV2Item.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Restored {

        String NAME = Actions.RESTORED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Public.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Public {

}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
public @interface PullRequest {

    String value() default Actions.ALL;

    @PullRequest(Assigned.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Assigned {

        String NAME = Actions.ASSIGNED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Closed {

        String NAME = Actions.CLOSED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Labeled {

        String NAME = Actions.LABELED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Locked {

        String NAME = Actions.LOCKED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReadyForReview {

        String NAME = Actions.READY_FOR_REVIEW;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Reopened {

        String NAME = Actions.REOPENED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReviewRequested {

        String NAME = Actions.REVIEW_REQUESTED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface ReviewRequestRemoved {

        String NAME = Actions.REVIEW_REQUEST_REMOVED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Synchronize {

        String NAME = Actions.SYNCHRONIZE;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unassigned {

        String NAME = Actions.UNASSIGNED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlabeled {

        String NAME = Actions.UNLABELED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequest.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unlocked {

        String NAME = Actions.UNLOCKED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
public @interface PullRequestReview {

    String value() default Actions.ALL;

    @PullRequestReview(Dismissed.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Dismissed {

        String NAME = Actions.DISMISSED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReview.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Submitted {

        String NAME = Actions.SUBMITTED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
public @interface PullRequestReviewComment {

    String value() default Actions.ALL;

    @PullRequestReviewComment(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/PullRequestReviewComment.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Push.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Push {

}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
public @interface Release {

    String value() default Actions.ALL;

    @Release(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Prereleased {

        String NAME = Actions.PRERELEASED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Published {

        String NAME = Actions.PUBLISHED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Released {

        String NAME = Actions.RELEASED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Release.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unpublished {

        String NAME = Actions.UNPUBLISHED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
public @interface Repository {

    String value() default Actions.ALL;

    @Repository(Archived.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Archived {

        String NAME = Actions.ARCHIVED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Edited {

        String NAME = Actions.EDITED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Privatized {

        String NAME = Actions.PRIVATIZED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Publicized {

        String NAME = Actions.PUBLICIZED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Renamed {

        String NAME = Actions.RENAMED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Transferred {

        String NAME = Actions.TRANSFERRED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Repository.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Unarchived {

        String NAME = Actions.UNARCHIVED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
public @interface Star {

    String value() default Actions.ALL;

    @Star(Created.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Created {

        String NAME = Actions.CREATED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Star.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Deleted {

        String NAME = Actions.DELETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/Status.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Status {

}
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowDispatch.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface WorkflowDispatch {

}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
public @interface WorkflowJob {

    String value() default Actions.ALL;

    @WorkflowJob(Completed.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Queued {

        String NAME = Actions.QUEUED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowJob.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
public @interface WorkflowRun {

    String value() default Actions.ALL;

    @WorkflowRun(Completed.NAME)
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Completed {

        String NAME = Actions.COMPLETED;
```

### unused
Interface is not implemented.
in `events/src/main/java/io/quarkiverse/githubapp/event/WorkflowRun.java`
#### Snippet
```java
    @Retention(RUNTIME)
    @Qualifier
    public @interface Requested {

        String NAME = Actions.REQUESTED;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/app/src/main/java/io/quarkiverse/githubapp/it/app/CatchAllEventListener.java`
#### Snippet
```java
public class CatchAllEventListener {

    void onEvent(@Issue GHEventPayload.Issue payload) throws IOException {
        payload.getIssue().addLabels("someValue");
    }
```

### unused
Interface is not implemented.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    }

    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java

        @AroundInvoke
        Object logInvocation(InvocationContext context) {
            // do nothing specific, we just want an interceptor

```

### unused
Field is never assigned.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

        @AirlineInject
        GlobalMetadata<CdiInjectionCommand> globalMetadata;

        @Inject
```

### unused
Field has no usages.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

        @Inject
        Clock clock;

        @Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java
    public interface CdiInjectionCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload, Service2 service2) throws IOException;
    }

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java
    public interface ConfigFileReaderCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload,
                @ConfigFile("config-file-reader.yml") MyConfigBean myConfigBean) throws IOException;
    }
```

### unused
Field is never assigned.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java
    public static class MyConfigBean {

        private String hello;

        public String getHello() {
```

### unused
Field is never assigned.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

        @Arguments(title = "username")
        private List<String> arguments;

        @Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Method is never used.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
    public interface PermissionCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
    public interface TeamCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Parameter `issueCommentPayload` is not used in any implementation
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
    public interface TestCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
    public interface PermissionCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
    public interface DefaultCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java
    public interface ServiceInjectionCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload, GitHub gitHub)
                throws IOException;
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
    public interface TeamCommand {

        void run(GHEventPayload.IssueComment issueCommentPayload) throws IOException;
    }
}
```

### unused
Class is not instantiated.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java

@ApplicationScoped
public class BackgroundProcessor {

    public static Behavior behavior;
```

### unused
Field has 2 usages, but they are not reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java
public class BackgroundProcessor {

    public static Behavior behavior;

    @Inject
```

### unused
Interface has an implementation but

* it is never instantiated OR
* no instantiations are reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/BackgroundProcessor.java`
#### Snippet
```java
    }

    public interface Behavior {
        void execute(GitHubClientProvider clientProvider, GitHubConfigFileProvider configFileProvider) throws IOException;
    }
```

### unused
Class is not instantiated.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/IssueEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.it.testingframework.config.MyConfigFile;

class IssueEventListener {

    public static Behavior behavior;
```

### unused
Field has 13 usages, but they are not reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/IssueEventListener.java`
#### Snippet
```java
class IssueEventListener {

    public static Behavior behavior;

    void onEvent(@Issue.Opened GHEventPayload.Issue payload,
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/IssueEventListener.java`
#### Snippet
```java
    public static Behavior behavior;

    void onEvent(@Issue.Opened GHEventPayload.Issue payload,
            @ConfigFile("config.yml") MyConfigFile configFile) throws IOException {
        behavior.execute(payload, configFile);
```

### unused
Interface has 18 direct or indirect implementations but

* ---they are never instantiated OR
* ---no instantiations are reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/IssueEventListener.java`
#### Snippet
```java
    }

    public interface Behavior {
        void execute(GHEventPayload.Issue payload, MyConfigFile configFile) throws IOException;
    }
```

### unused
Class is not instantiated.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/PullRequestEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.it.testingframework.config.MyConfigFile;

class PullRequestEventListener {

    public static Behavior behavior;
```

### unused
Field has 3 usages, but they are not reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/PullRequestEventListener.java`
#### Snippet
```java
class PullRequestEventListener {

    public static Behavior behavior;

    void onEvent(@PullRequest.Opened GHEventPayload.PullRequest payload,
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/PullRequestEventListener.java`
#### Snippet
```java
    public static Behavior behavior;

    void onEvent(@PullRequest.Opened GHEventPayload.PullRequest payload,
            @ConfigFile("config.yml") MyConfigFile configFile) throws IOException {
        behavior.execute(payload, configFile);
```

### unused
Interface has 3 direct or indirect implementations but

* ---they are never instantiated OR
* ---no instantiations are reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/PullRequestEventListener.java`
#### Snippet
```java
    }

    public interface Behavior {
        void execute(GHEventPayload.PullRequest payload, MyConfigFile configFile) throws IOException;
    }
```

### unused
Class has 5 instantiations, but they are not reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
import java.util.Objects;

public class MyConfigFile {

    public String someProperty;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    public String someProperty;

    public MyConfigFile() {

    }
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `integration-tests/testing-framework/src/main/java/io/quarkiverse/githubapp/it/testingframework/config/MyConfigFile.java`
#### Snippet
```java
    }

    public MyConfigFile(String someProperty) {
        this.someProperty = someProperty;
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/ConfigFile.java`
#### Snippet
```java
     *         {@code /}).
     */
    String value();

    /**
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/ConfigFile.java`
#### Snippet
```java
     * @see Source
     */
    Source source() default Source.DEFAULT;

    /**
```

### unused
Method is never used as a member of this interface, but only as a member of the implementation class(es). The project will stay compilable if the method is removed from the interface.
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubClientProvider.java`
#### Snippet
```java
     * @return The client for the given installation.
     */
    DynamicGraphQLClient getInstallationGraphQLClient(long installationId);

}
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    }

    public Long getInstallationId() {
        return installationId;
    }
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    }

    public String getEvent() {
        return event;
    }
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    }

    public String getAction() {
        return action;
    }
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    }

    public String getPayload() {
        return payload;
    }
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/GitHubEvent.java`
#### Snippet
```java
    }

    public boolean isReplayed() {
        return replayed;
    }
```

### unused
Field has no usages.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Headers.java`
#### Snippet
```java
    public static final String X_GITHUB_DELIVERY = "X-GitHub-Delivery";
    public static final String X_QUARKIVERSE_GITHUB_APP_REPLAYED = "X-Quarkiverse-GitHub-App-Replayed";
    public static final String X_QUARKIVERSE_GITHUB_APP_ORIGINAL_DELIVERY = "X-Quarkiverse-GitHub-App-Original-Delivery";

    public static final String[] FORWARDED_HEADERS = {
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    }

    public GitHubEvent getGitHubEvent() {
        return gitHubEvent;
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    }

    public GHEventPayload getPayload() {
        return payload;
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    }

    public GitHub getGitHub() {
        return gitHub;
    }
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/MultiplexedEvent.java`
#### Snippet
```java
    }

    public DynamicGraphQLClient getGitHubGraphQLClient() {
        if (gitHubGraphQLClient == null) {
            throw new IllegalStateException("The GraphQL client has not been initialized and should not be accessed.");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java
    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    public Object getConfigObject(GHRepository ghRepository, String path, ConfigFile.Source source, Class<?> type) {
        String cacheKey = getCacheKey(ghRepository, path, source);

```

### unused
Field has no usages.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    @Inject
    HttpConfiguration httpConfig;

    Path tmpDirectory;
```

### unused
Field has no usages.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    HttpConfiguration httpConfig;

    Path tmpDirectory;

    public void init(@Observes StartupEvent startupEvent) throws IOException {
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java

    @Route(path = "/", type = HandlerType.BLOCKING, methods = HttpMethod.POST, consumes = "application/json", produces = "application/json")
    public void handleRequest(RoutingContext routingContext,
            RoutingExchange routingExchange,
            @Header(X_REQUEST_ID) String requestId,
```

### unused
Parameter `requestId` is not used
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Routes.java`
#### Snippet
```java
    public void handleRequest(RoutingContext routingContext,
            RoutingExchange routingExchange,
            @Header(X_REQUEST_ID) String requestId,
            @Header(X_HUB_SIGNATURE_256) String hubSignature,
            @Header(X_GITHUB_DELIVERY) String deliveryId,
```

### unused
Constructor is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/CheckedConfigProvider.java`
#### Snippet
```java

    @Inject
    CheckedConfigProvider(GitHubAppRuntimeConfig gitHubAppRuntimeConfig, LaunchMode launchMode) {
        this.gitHubAppRuntimeConfig = gitHubAppRuntimeConfig;
        this.launchMode = launchMode;
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> appId;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> appName;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem(defaultValue = "false")
    boolean readConfigFilesFromSourceRepository;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
    @ConfigItem
    @ConvertWith(PrivateKeyConverter.class)
    Optional<PrivateKey> privateKey;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> webhookSecret;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Optional<String> webhookProxyUrl;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem(defaultValue = "https://api.github.com")
    String instanceEndpoint;

    /**
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
     */
    @ConfigItem
    Debug debug;

    @ConfigGroup
```

### unused
Field is never assigned.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java
         */
        @ConfigItem
        public Optional<Path> payloadDirectory;
    }
}
```

### unused
Method is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/github/PayloadHelper.java`
#### Snippet
```java
public final class PayloadHelper {

    public static GHRepository getRepository(GHEventPayload eventPayload) {
        GHRepository repository = eventPayload.getRepository();

```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEvent.java`
#### Snippet
```java
    private final GitHubEvent gitHubEvent;

    public ReplayEvent() {
        this.event = "ping";
        this.gitHubEvent = null;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java

    @Route(path = "/replay/events", produces = ReactiveRoutes.EVENT_STREAM)
    Multi<ReplayEvent> replayEvents(RoutingContext context) {
        return Multi.createBy()
                .merging().streams(
```

### unused
Parameter `context` is not used
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java

    @Route(path = "/replay/events", produces = ReactiveRoutes.EVENT_STREAM)
    Multi<ReplayEvent> replayEvents(RoutingContext context) {
        return Multi.createBy()
                .merging().streams(
```

### unused
Constructor is never used.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    private final boolean supportsClone;

    PayloadSignatureChecker(CheckedConfigProvider checkedConfigProvider) {
        if (!checkedConfigProvider.webhookSecret().isPresent()) {
            secretKeySpec = null;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/signing/PayloadSignatureChecker.java`
#### Snippet
```java
    }

    public boolean matches(byte[] payload, String headerSignature) {
        if (secretKeySpec == null || sharedMac == null) {
            throw new IllegalStateException("Payload signature checking is disabled, this method should not be called");
```

### unused
Variable `response` is never used
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/smee/SmeeIoForwarder.java`
#### Snippet
```java
                }

                try (Response response = client.newCall(requestBuilder.build()).execute()) {
                }
            }
```

### unused
Method has 18 usages, but they are not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTesting.java`
#### Snippet
```java
    }

    public static EventContextSpecification given() {
        return new EventContextSpecificationImpl(GitHubAppTestingContext.get());
    }
```

### unused
Method has 37 usages, but they are not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTesting.java`
#### Snippet
```java
    }

    public static EventSenderOptions when() {
        return given().when();
    }
```

### unused
Field has no usages.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/GitHubAppTestingResource.java`
#### Snippet
```java
public final class GitHubAppTestingResource implements QuarkusTestResourceLifecycleManager {

    private io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource delegate = new io.quarkiverse.githubapp.testing.internal.GitHubAppTestingResource();

    @Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventContextSpecification.java`
#### Snippet
```java

public interface EventContextSpecification {
    <T extends Throwable> EventContextSpecification github(GitHubMockSetup<T> gitHubMockSetup) throws T;

    EventSenderOptions when();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventContextSpecification.java`
#### Snippet
```java
    <T extends Throwable> EventContextSpecification github(GitHubMockSetup<T> gitHubMockSetup) throws T;

    EventSenderOptions when();

    <T extends Throwable> EventHandlingResponse when(TestedAction<T> action) throws T;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventHandlingResponse.java`
#### Snippet
```java

public interface EventHandlingResponse {
    ValidatableEventHandling then();
}

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java

public interface EventSenderOptions {
    EventSenderOptions requestId(UUID requestId);

    EventSenderOptions deliveryId(UUID deliveryId);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventSenderOptions requestId(UUID requestId);

    EventSenderOptions deliveryId(UUID deliveryId);

    EventSenderOptions payloadFromString(String payload);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventSenderOptions deliveryId(UUID deliveryId);

    EventSenderOptions payloadFromString(String payload);

    EventSenderOptions payloadFromString(String payload, String contentType);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventSenderOptions payloadFromString(String payload);

    EventSenderOptions payloadFromString(String payload, String contentType);

    EventSenderOptions payloadFromClasspath(String path) throws IOException;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventSenderOptions payloadFromString(String payload, String contentType);

    EventSenderOptions payloadFromClasspath(String path) throws IOException;

    EventSenderOptions payloadFromClasspath(String path, String contentType) throws IOException;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventSenderOptions payloadFromClasspath(String path) throws IOException;

    EventSenderOptions payloadFromClasspath(String path, String contentType) throws IOException;

    EventHandlingResponse event(GHEvent event);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventSenderOptions payloadFromClasspath(String path, String contentType) throws IOException;

    EventHandlingResponse event(GHEvent event);

    EventHandlingResponse event(GHEvent event, boolean ignoreExceptions);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/EventSenderOptions.java`
#### Snippet
```java
    EventHandlingResponse event(GHEvent event);

    EventHandlingResponse event(GHEvent event, boolean ignoreExceptions);
}

```

### unused
Method is never used as a member of this interface, but only as a member of the implementation class(es). The project will stay compilable if the method is removed from the interface.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockContext.java`
#### Snippet
```java
    GHTeam team(long id);

    <T extends GHObject> T ghObject(Class<T> type, long id);

    Object[] ghObjects();
```

### unused
Interface has 26 direct or indirect implementations but

* ---they are never instantiated OR
* ---no instantiations are reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockSetup.java`
#### Snippet
```java

@FunctionalInterface
public interface GitHubMockSetup<T extends Throwable> {

    void setup(GitHubMockSetupContext mocks) throws T;
```

### unused
Interface has 76 direct or indirect implementations but

* ---they are never instantiated OR
* ---no instantiations are reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/GitHubMockVerification.java`
#### Snippet
```java

@FunctionalInterface
public interface GitHubMockVerification<T extends Throwable> {

    void verify(GitHubMockVerificationContext mocks) throws T;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/dsl/ValidatableEventHandling.java`
#### Snippet
```java

public interface ValidatableEventHandling {
    <T extends Throwable> ValidatableEventHandling github(GitHubMockVerification<T> verification) throws T;
}

```

### unused
Method is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public GHIssue issue(long id) {
        return ghObject(GHIssue.class, id);
    }
```

### unused
Method is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java

    @Override
    public Object[] ghObjects() {
        List<GHObject> result = new ArrayList<>();
        for (MockMap<?, ?> mockMap : allMockMaps) {
```

### unused
Method is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    }

    void init() {
        reset();

```

### unused
Method is not reachable from entry points.
in `testing/src/main/java/io/quarkiverse/githubapp/testing/internal/GitHubMockContextImpl.java`
#### Snippet
```java
    }

    void initEventStubs(long installationId) {
        GitHub clientMock = installationClient(installationId);
        MockitoUtils.doWithMockedClassClassLoader(GitHub.class, () -> {
```

### unused
No class references has been found. Class static initializer is not reachable.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineDotNames.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.IssueComment;

class GitHubAppCommandAirlineDotNames {

    static final DotName DEPENDENT = DotName.createSimple(Dependent.class.getName());
```

### unused
Class is not instantiated.
in `command-airline/deployment/src/main/java/io/quarkiverse/githubapp/command/airline/deployment/GitHubAppCommandAirlineProcessor.java`
#### Snippet
```java
import io.quarkus.gizmo.TryBlock;

class GitHubAppCommandAirlineProcessor {

    private static final String FEATURE = "github-app-command-airline";
```

### unused
Class and 2 its implementations are never instantiated.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/AbstractHelpCommand.java`
#### Snippet
```java
import com.github.rvesse.airline.model.GlobalMetadata;

public class AbstractHelpCommand {

    @AirlineInject
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/ArcCommandFactory.java`
#### Snippet
```java
import io.quarkus.arc.Arc;

public class ArcCommandFactory<T> implements CommandFactory<T> {

    @Override
```

### unused
No class references has been found. Class static initializer is not reachable.
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/runtime/util/Reactions.java`
#### Snippet
```java
import org.kohsuke.github.ReactionContent;

public final class Reactions {

    private static final Logger LOGGER = Logger.getLogger(Reactions.class);
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `deployment/src/main/java/io/quarkiverse/githubapp/deployment/DispatchingConfiguration.java`
#### Snippet
```java
import org.jboss.jandex.MethodInfo;

class DispatchingConfiguration {

    private final Map<String, EventDispatchingConfiguration> eventConfigurations = new TreeMap<>();
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { CommandWithArguments.class })
public class ArgumentsCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/ArgumentsCli.java`
#### Snippet
```java

    @Command(name = "add-users")
    static class CommandWithArguments implements Commands {

        @Arguments(description = "List of GitHub usernames") // <1>
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CdiBean.java`
#### Snippet
```java

@ApplicationScoped
public class CdiBean {

    public void doSomething() {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class })
public class CdiInjectionCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CdiInjectionCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @Inject
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsAliasesCli.java`
#### Snippet
```java
@Cli(name = "@quarkus-bot", commands = { AliasesCliCommand.class })
@CliOptions(aliases = { "@quarkusbot", "@bot" }) // <1>
public class CliOptionsAliasesCli {
    // end::aliases[]

```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsAliasesCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class AliasesCliCommand implements Runnable {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsDefaultCommandOptionsCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { DefaultCommandOptionsCliCommand.class })
@CliOptions(defaultCommandOptions = @CommandOptions(scope = CommandScope.ISSUES)) // <1>
public class CliOptionsDefaultCommandOptionsCli {
    // end::default-command-options[]

```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsDefaultCommandOptionsCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class DefaultCommandOptionsCliCommand implements Runnable {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorMessageCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { ParseErrorMessageCliCommand.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.COMMENT_MESSAGE, parseErrorMessage = "Your custom message") // <1>
public class CliOptionsParseErrorMessageCli {
    // end::parse-error-message[]

```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorMessageCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class ParseErrorMessageCliCommand implements Runnable {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorStrategyCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { ParseErrorStrategyCliCommand.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.NONE) // <1>
public class CliOptionsParseErrorStrategyCli {
    // end::parse-error-strategy[]

```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CliOptionsParseErrorStrategyCli.java`
#### Snippet
```java

    @Command(name = "command")
    static class ParseErrorStrategyCliCommand implements Runnable {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { CommandOnlyForIssues.class })
public class CommandOptionsCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "only-for-issues")
    @CommandOptions(scope = CommandScope.ISSUES) // <1>
    static class CommandOnlyForIssues implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "only-for-pull-requests")
    @CommandOptions(scope = CommandScope.PULL_REQUESTS) // <1>
    static class CommandOnlyForPullRequests implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "execution-error-strategy")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE) // <1>
    static class CommandWithCustomExecutionErrorStrategy implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "execution-error-message")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE, executionErrorMessage = "Your custom error message") // <1>
    static class CommandWithCustomExecutionErrorMessage implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "reaction-strategy")
    @CommandOptions(reactionStrategy = ReactionStrategy.NONE)
    static class CommandWithCustomReactionStrategy implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@composition", commands = { TestCompositionCommand.class })
public class CompositionCli {

    @Command(name = "test")
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCompositionCommand implements DefaultCommand {

        @AirlineModule // <1>
```

### unused
Class has 2 instantiations, but they are not reachable from entry points.
in `docs/modules/ROOT/examples/command/airline/CompositionCli.java`
#### Snippet
```java
    }

    public static class VerboseModule {

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class, Command2.class })
public class GitHubInjectionCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/GitHubInjectionCli.java`
#### Snippet
```java

    @Command(name = "command2")
    static class Command2 implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", groups = { @Group(name = "remote", commands = { ListCommand.class, ShowCommand.class }) }) // <1>
public class GroupCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

    @Command(name = "list") // <2>
    static class ListCommand implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/GroupCli.java`
#### Snippet
```java

    @Command(name = "show") // <3>
    static class ShowCommand implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { Command1.class, Command2.class,
        HelpCommand.class }, description = "Your helpful bot doing all sorts of things") // <1>
public class HelpCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Do command1 with style") // <2>
    static class Command1 implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "command2", description = "Do command2 with style")
    static class Command2 implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "help", description = "Print help")
    static class HelpCommand extends AbstractHelpCommand implements Commands { // <3>

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class })
public class InjectMetadataCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/InjectMetadataCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @AirlineInject // <1>
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/MyFirstCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { RetestCommand.class }) // <1>
public class MyFirstCli {

    @Command(name = "retest") // <2>
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/MyFirstCli.java`
#### Snippet
```java

    @Command(name = "retest") // <2>
    static class RetestCommand implements Runnable { // <3>

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { Command1.class, Command2.class })
public class PayloadInjectionCli {

    interface Commands { // <1>
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class Command1 implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PayloadInjectionCli.java`
#### Snippet
```java

    @Command(name = "command2")
    static class Command2 implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { WriteCommand.class })
public class PermissionCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PermissionCli.java`
#### Snippet
```java
    @Command(name = "write-command")
    @Permission(GHPermissionType.WRITE) // <1>
    static class WriteCommand implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
@Cli(name = "@bot", commands = { WriteCommand.class, AdminCommand.class })
@Permission(GHPermissionType.WRITE) // <1>
public class PermissionOverrideCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java

    @Command(name = "write-command") // <2>
    static class WriteCommand implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/PermissionOverrideCli.java`
#### Snippet
```java
    @Command(name = "admin-command")
    @Permission(GHPermissionType.ADMIN) // <3>
    static class AdminCommand implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
// tag::include[]
@Cli(name = "@bot", commands = { MyTeamCommand.class })
public class TeamPermissionCli {

    interface Commands {
```

### unused
Class is not instantiated.
in `docs/modules/ROOT/examples/command/airline/TeamPermissionCli.java`
#### Snippet
```java
    @Command(name = "command")
    @Team({ "my-team1", "my-team2" }) // <1>
    static class MyTeamCommand implements Commands {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/app/src/main/java/io/quarkiverse/githubapp/it/app/CatchAllEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.Issue;

public class CatchAllEventListener {

    void onEvent(@Issue GHEventPayload.Issue payload) throws IOException {
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
        TestSubclassCommand1.class, TestSubclassCommand2.class })
@CliOptions(defaultCommandOptions = @CommandOptions(scope = CommandScope.ISSUES))
public class ArcSubclassesCli {

    @Command(name = "application-scoped-command1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @Command(name = "subclass-command1")
    @DoNothing
    static class TestSubclassCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @CommandOptions(scope = CommandScope.ISSUES_AND_PULL_REQUESTS)
    @DoNothing
    static class TestSubclassCommand2 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ArcSubclassesCli.java`
#### Snippet
```java
    @Priority(2020)
    @Interceptor
    public static class LoggingInterceptor {

        @AroundInvoke
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

@Cli(name = "@cdi-injection", commands = { TestCommand.class })
public class CdiInjectionCli {

    @Command(name = "test")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCommand implements CdiInjectionCommand {

        @AirlineInject
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

    @Singleton
    public static class Service1 {

        public static final String HELLO = "hello from service1";
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CdiInjectionCli.java`
#### Snippet
```java

    @Singleton
    public static class Service2 {

        public static final String HELLO = "hello from service2";
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java

@Cli(name = "@command-line-parse-error", commands = { TestCommand1.class })
public class CommandLineParseErrorCli {

    @Command(name = "command1", description = "Command 1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CommandLineParseErrorCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

@Cli(name = "@composition", commands = { TestCompositionCommand.class })
public class CompositionCli {

    @Command(name = "test")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCompositionCommand implements DefaultCommand {

        @AirlineModule
```

### unused
Class has 2 instantiations, but they are not reachable from entry points.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/CompositionCli.java`
#### Snippet
```java
    }

    public static class VerboseModule {

        @Option(name = { "-v", "--verbose" }, description = "Enables verbose mode")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

@Cli(name = "@config-file-reader", commands = { TestCommand.class })
public class ConfigFileReaderCli {

    @Command(name = "test")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCommand implements ConfigFileReaderCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ConfigFileReaderCli.java`
#### Snippet
```java
    }

    public static class MyConfigBean {

        private String hello;
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java
                @Group(name = "group1", commands = { TestGroup1Command1.class, TestGroup1Command2.class }) })
@CliOptions(aliases = "@other-alias")
public class DefaultCli {

    @Command(name = "basic")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "basic")
    static class TestBasicCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "command-with-arguments")
    static class TestCommandWithArguments implements DefaultCommand {

        @Arguments(title = "username")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestGroup1Command1 implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCli.java`
#### Snippet
```java

    @Command(name = "command2")
    static class TestGroup1Command2 implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
@Cli(name = "@default-command-options", commands = { TestCommand1.class, TestCommand2.class })
@CliOptions(defaultCommandOptions = @CommandOptions(scope = CommandScope.ISSUES))
public class DefaultCommandOptionsCli {

    @Command(name = "command1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultCommandOptionsCli.java`
#### Snippet
```java
    @Command(name = "command2")
    @CommandOptions(scope = CommandScope.ISSUES_AND_PULL_REQUESTS)
    static class TestCommand2 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
        TestAdminPermissionCommand.class })
@Permission(GHPermissionType.WRITE)
public class DefaultPermissionCli {

    @Command(name = "test-no-permission")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java

    @Command(name = "test-no-permission")
    static class TestNoPermissionCommand implements PermissionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
    @Command(name = "test-read-permission")
    @Permission(GHPermissionType.READ)
    static class TestReadPermissionCommand implements PermissionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultPermissionCli.java`
#### Snippet
```java
    @Command(name = "test-admin-permission")
    @Permission(GHPermissionType.ADMIN)
    static class TestAdminPermissionCommand implements PermissionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
@Cli(name = "@default-team", commands = { TestNoTeamsCommand.class, TestTeam2Command.class })
@Team("my-team-1")
public class DefaultTeamCli {

    @Command(name = "no-teams")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java

    @Command(name = "no-teams")
    static class TestNoTeamsCommand implements TeamCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/DefaultTeamCli.java`
#### Snippet
```java
    @Command(name = "team2")
    @Team("my-team-2")
    static class TestTeam2Command implements TeamCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java

@Cli(name = "@execution-error", commands = { TestCommand1.class })
public class ExecutionErrorCli {

    @Command(name = "command1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java

@Cli(name = "@execution-error-strategy", commands = { TestCommand1.class })
public class ExecutionErrorStrategyCli {

    @Command(name = "command1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ExecutionErrorStrategyCli.java`
#### Snippet
```java
    @Command(name = "command1")
    @CommandOptions(executionErrorStrategy = ExecutionErrorStrategy.COMMENT_MESSAGE)
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

@Cli(name = "@help", description = "Testing help generation", commands = { TestCommand1.class, HelpCommand.class })
public class HelpCli {

    @Command(name = "command1", description = "Command 1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/HelpCli.java`
#### Snippet
```java

    @Command(name = "help", description = "Push a message with help")
    static class HelpCommand extends AbstractHelpCommand implements TestCommand {
    }

```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java

@Cli(name = "@parse-error", description = "Default parse error behavior", commands = { TestCommand1.class })
public class ParseErrorCli {

    @Command(name = "command1", description = "Command 1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorCli.java`
#### Snippet
```java

    @Command(name = "command1", description = "Command 1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java
@Cli(name = "@parse-error-strategy", commands = { TestCommand1.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.COMMENT_MESSAGE, parseErrorMessage = "test parse error message: %s")
public class ParseErrorStrategyCli {

    @Command(name = "command1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java
@Cli(name = "@parse-error-strategy-none", commands = { TestCommand1.class })
@CliOptions(parseErrorStrategy = ParseErrorStrategy.NONE)
public class ParseErrorStrategyNoneCli {

    @Command(name = "command1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ParseErrorStrategyNoneCli.java`
#### Snippet
```java

    @Command(name = "command1")
    static class TestCommand1 implements TestCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
@Cli(name = "@permission", commands = { TestNoPermissionCommand.class, TestWritePermissionCommand.class,
        TestAdminPermissionCommand.class })
public class PermissionCli {

    @Command(name = "test-no-permission")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java

    @Command(name = "test-no-permission")
    static class TestNoPermissionCommand implements PermissionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
    @Command(name = "test-write-permission")
    @Permission(GHPermissionType.WRITE)
    static class TestWritePermissionCommand implements PermissionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/PermissionCli.java`
#### Snippet
```java
    @Command(name = "test-admin-permission")
    @Permission(GHPermissionType.ADMIN)
    static class TestAdminPermissionCommand implements PermissionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
@Cli(name = "@reaction-strategy", commands = { TestNoneCommand.class, TestProgressCommand.class, TestProgressErrorCommand.class,
        TestAllCommand.class })
public class ReactionStrategyCli {

    @Command(name = "none")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "none")
    @CommandOptions(reactionStrategy = ReactionStrategy.NONE)
    static class TestNoneCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "progress")
    @CommandOptions(reactionStrategy = ReactionStrategy.ON_PROGRESS)
    static class TestProgressCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "progress-error")
    @CommandOptions(reactionStrategy = ReactionStrategy.ON_PROGRESS_ON_ERROR)
    static class TestProgressErrorCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyCli.java`
#### Snippet
```java
    @Command(name = "all")
    @CommandOptions(reactionStrategy = ReactionStrategy.ALL)
    static class TestAllCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
@Cli(name = "@reaction-strategy-override", commands = { TestNoOverrideCommand.class, TestOverrideCommand.class })
@CliOptions(defaultCommandOptions = @CommandOptions(reactionStrategy = ReactionStrategy.NONE))
public class ReactionStrategyOverrideCli {

    @Command(name = "no-override")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java

    @Command(name = "no-override")
    static class TestNoOverrideCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ReactionStrategyOverrideCli.java`
#### Snippet
```java
    @Command(name = "override")
    @CommandOptions(reactionStrategy = ReactionStrategy.ALL)
    static class TestOverrideCommand implements DefaultCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java

@Cli(name = "@service-injection", commands = { TestCommand.class })
public class ServiceInjectionCli {

    @Command(name = "test")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/ServiceInjectionCli.java`
#### Snippet
```java

    @Command(name = "test")
    static class TestCommand implements ServiceInjectionCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java

@Cli(name = "@team", commands = { TestTeam1Command.class, TestTwoTeamsCommand.class })
public class TeamCli {

    @Command(name = "team1")
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
    @Command(name = "team1")
    @Team("my-team-1")
    static class TestTeam1Command implements TeamCommand {

        @Override
```

### unused
Class is not instantiated.
in `integration-tests/command-airline/src/main/java/io/quarkiverse/githubapp/it/command/airline/TeamCli.java`
#### Snippet
```java
    @Command(name = "two-teams")
    @Team({ "my-team-1", "my-team-2" })
    static class TestTwoTeamsCommand implements TeamCommand {

        @Override
```

### unused
Class is not instantiated.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/GitHubAppRecorder.java`
#### Snippet
```java

@Recorder
public class GitHubAppRecorder {

    public Handler<RoutingContext> replayUiHandler(String replayUiFinalDestination, String replayUiPath,
```

### unused
Class is not instantiated.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/RequestScopeCachingGitHubConfigFileProvider.java`
#### Snippet
```java

@RequestScoped
public class RequestScopeCachingGitHubConfigFileProvider {

    @Inject
```

### unused
Class is not instantiated.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java

@ConfigRoot(name = "github-app", phase = ConfigPhase.RUN_TIME)
public class GitHubAppRuntimeConfig {

    /**
```

### unused
Class is not instantiated.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/config/GitHubAppRuntimeConfig.java`
#### Snippet
```java

    @ConfigGroup
    public static class Debug {

        /**
```

### unused
Class is not instantiated.
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/replay/ReplayEventsRoute.java`
#### Snippet
```java
@Singleton
@IfBuildProfile("dev")
public class ReplayEventsRoute {

    /**
```

## ClassIndependentOfModule
### ClassIndependentOfModule
Class `Permission` has no dependencies or dependents in its module
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/Permission.java`
#### Snippet
```java
@Retention(RUNTIME)
@Documented
public @interface Permission {

    GHPermissionType value();
```

### ClassIndependentOfModule
Class `Team` has no dependencies or dependents in its module
in `command-airline/runtime/src/main/java/io/quarkiverse/githubapp/command/airline/Team.java`
#### Snippet
```java
@Retention(RUNTIME)
@Documented
public @interface Team {

    /**
```

### ClassIndependentOfModule
Class `CatchAllEventListener` has no dependencies or dependents in its module
in `integration-tests/app/src/main/java/io/quarkiverse/githubapp/it/app/CatchAllEventListener.java`
#### Snippet
```java
import io.quarkiverse.githubapp.event.Issue;

public class CatchAllEventListener {

    void onEvent(@Issue GHEventPayload.Issue payload) throws IOException {
```

### ClassIndependentOfModule
Class `GitHubAppRecorder` has no dependencies or dependents in its module
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/GitHubAppRecorder.java`
#### Snippet
```java

@Recorder
public class GitHubAppRecorder {

    public Handler<RoutingContext> replayUiHandler(String replayUiFinalDestination, String replayUiPath,
```

### ClassIndependentOfModule
Class `Multiplexer` has no dependencies or dependents in its module
in `runtime/src/main/java/io/quarkiverse/githubapp/runtime/Multiplexer.java`
#### Snippet
```java
@Retention(RUNTIME)
@Qualifier
public @interface Multiplexer {
}

```

