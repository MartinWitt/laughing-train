# Change Log
The following bad smells are refactored:
## JUnit4-@Test
The JUnit 4 `@Test` annotation should be replaced with JUnit 5 `@Test` annotation.
## JUnit4Assertion
The JUnit4 assertion should be replaced with JUnit5 Assertions.
## Junit4-@BeforeClass
The JUnit 4 `@BeforeClass` annotation should be replaced with JUnit 5 `@BeforeAll` annotation.
## Junit4-@Ignore
The JUnit 4 `@Ignore` annotation should be replaced with JUnit 5 `@Disabled` annotation.

## The following has changed in the code:
### Junit4-@BeforeClass
- Replaced `@BeforeClass` annotation with `@BeforeAll` at method `setup`
### JUnit4-@Test
- Replaced junit 4 test annotation with junit 5 test annotation in `checkGithubIssueAnnotations`
- Replaced junit 4 test annotation with junit 5 test annotation in `checkUnresolvedBugAnnotations`
- Replaced junit 4 test annotation with junit 5 test annotation in `checkThatUnresolvedBugTestFail`
### Junit4-@Ignore
- Replaced `@Ignore` annotation with `@Disabled` at method `checkGithubIssueAnnotations`
### JUnit4Assertion
- Transformed junit4 assert to junit 5 assertion in `checkGithubIssueAnnotations`
- Transformed junit4 assert to junit 5 assertion in `checkUnresolvedBugAnnotations`
- Transformed junit4 assert to junit 5 assertion in `checkThatUnresolvedBugTestFail`
