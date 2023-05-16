# Artemis 
 
# Bad smells
I found 497 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalGetWithoutIsPresent | 91 | false |
| NullableProblems | 54 | false |
| DataFlowIssue | 51 | false |
| SpringBootApplicationYaml | 41 | false |
| DuplicatedCode | 28 | false |
| JavadocLinkAsPlainText | 23 | false |
| UastIncorrectHttpHeaderInspection | 18 | false |
| MismatchedJavadocCode | 17 | false |
| JavadocDeclaration | 17 | false |
| PackageDirectoryMismatch | 14 | false |
| SlowListContainsAll | 13 | false |
| UNCHECKED_WARNING | 11 | false |
| Deprecation | 10 | false |
| IgnoreResultOfCall | 10 | false |
| FieldCanBeLocal | 7 | false |
| ConstantValue | 7 | false |
| JavadocReference | 7 | false |
| RegExpRedundantEscape | 6 | false |
| OptionalIsPresent | 6 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| SpringTransactionalMethodCallsInspection | 5 | false |
| UnnecessaryStringEscape | 4 | true |
| SpringJavaInjectionPointsAutowiringInspection | 4 | false |
| SimplifyStreamApiCallChains | 4 | false |
| PlaceholderCountMatchesArgumentCount | 4 | false |
| AutoCloseableResource | 4 | false |
| UnusedSymbol | 4 | false |
| EmptyStatementBody | 3 | false |
| CommentedOutCode | 2 | false |
| RegExpSimplifiable | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| SpringDataMethodInconsistencyInspection | 2 | false |
| SpringDataRepositoryMethodParametersInspection | 1 | false |
| RefusedBequest | 1 | false |
| NumberEquality | 1 | false |
| RedundantMethodOverride | 1 | false |
| SpringDataRepositoryMethodReturnTypeInspection | 1 | false |
| MVCPathVariableInspection | 1 | false |
| FuseStreamOperations | 1 | false |
| UnusedAssignment | 1 | false |
| RemoveExplicitTypeArguments | 1 | false |
| KotlinConstantConditions | 1 | false |
| RedundantLabeledSwitchRuleCodeBlock | 1 | false |
| DanglingJavadoc | 1 | false |
| ImplicitSubclassInspection | 1 | false |
| RedundantCast | 1 | false |
| FieldMayBeFinal | 1 | false |
| SpringJavaAutowiredFieldsWarningInspection | 1 | false |
| BusyWait | 1 | false |
| CopyConstructorMissesField | 1 | false |
## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExerciseResource.java`
#### Snippet
```java
        if (exercise.isExamExercise()) {
            Exam exam = exercise.getExerciseGroup().getExam();
            if (authCheckService.isAtLeastEditorForExercise(exercise, user)) {
                // instructors editors and admins should always be able to see exam exercises
                // continue
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
        StudentParticipation participation = participationService.startExercise(exercise, participant, true);

        if (exercise.isExamExercise() && exercise instanceof ProgrammingExercise) {
            // TODO: this programming exercise was started during an exam (the instructor did not invoke "prepare exercise start" before the exam or it failed in this case)
            // 1) check that now is between exam start and individual exam end
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
        }
        catch (HttpClientErrorException e) {
            if (e.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                // ignore the error if the group does not exist
            }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

## RuleId[id=SpringDataRepositoryMethodParametersInspection]
### SpringDataRepositoryMethodParametersInspection
Expected parameter types: **Collection\<Conversation\>**
in `src/main/java/de/tum/in/www1/artemis/repository/metis/PostRepository.java`
#### Snippet
```java
    @Transactional // ok because of delete
    @Modifying
    void deleteAllByConversationIn(Set<OneToOneChat> oneToOneChats);

    @Transactional // ok because of delete
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/de/tum/in/www1/artemis/web/websocket/QuizSubmissionWebsocketService.java`
#### Snippet
```java
            // send updated submission over websocket (use a thread to prevent that the outbound channel blocks the inbound channel (e.g. due a slow client))
            // to improve the performance, this is currently deactivated: slow clients might lead to bottlenecks so that more important messages can not be distributed any more
            // new Thread(() -> sendSubmissionToUser(username, exerciseId, quizSubmission)).start();

            // log.info("WS.Inbound: Sent quiz submission (async) back to user {} in quiz {} after {} µs ", principal.getName(), exerciseId, (System.nanoTime() - start) / 1000);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
            // students should not see statistics
            // TODO: this would be useful, but leads to problems when the quiz schedule service wants to access the statistics again later on
            // quizExercise.setQuizPointStatistic(null);
            // quizExercise.getQuizQuestions().forEach(quizQuestion -> quizQuestion.setQuizQuestionStatistic(null));
        }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileResource.java`
#### Snippet
```java

        // Use regular expression to match and extract the file name with ".png" format
        Pattern pattern = Pattern.compile(".*\\/([^/]+\\.png)$");
        Matcher matcher = pattern.matcher(directoryPath);

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/de/tum/in/www1/artemis/web/rest/ClientForwardResource.java`
#### Snippet
```java
     * @return Forward Instruction for Browser
     */
    @RequestMapping({ "/{path:[^\\.]*}", "/{path:^(?!websocket).*}/**/{path:[^\\.]*}" })
    public String forward() {
        return "forward:/";
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/de/tum/in/www1/artemis/web/rest/ClientForwardResource.java`
#### Snippet
```java
     * @return Forward Instruction for Browser
     */
    @RequestMapping({ "/{path:[^\\.]*}", "/{path:^(?!websocket).*}/**/{path:[^\\.]*}" })
    public String forward() {
        return "forward:/";
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
        for (String key : principal.getAttributes().keySet()) {
            final String escapedKey = Pattern.quote(key);
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
    }

```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExerciseTestCase.java`
#### Snippet
```java
     * @return a clone of the object.
     */
    public ProgrammingExerciseTestCase clone() {
        ProgrammingExerciseTestCase clone = new ProgrammingExerciseTestCase().testName(this.getTestName()).weight(this.getWeight()).active(this.isActive())
                .bonusPoints(this.getBonusPoints()).bonusMultiplier(this.getBonusMultiplier()).visibility(visibility).exercise(this.exercise);
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExamResource.java`
#### Snippet
```java
        File zipFile = archive.toFile();
        InputStreamResource resource = new InputStreamResource(new FileInputStream(zipFile));
        return ResponseEntity.ok().contentLength(zipFile.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", zipFile.getName()).body(resource);
    }

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/UserJWTController.java`
#### Snippet
```java
        catch (CaptchaRequiredException ex) {
            log.warn("CAPTCHA required in JIRA during login for user {}", loginVM.getUsername());
            return ResponseEntity.status(HttpStatus.FORBIDDEN).header("X-artemisApp-error", ex.getMessage()).build();
        }
    }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/UserJWTController.java`
#### Snippet
```java
            // If the exception is not caught a 401 is returned.
            // That does not match the actual reason and would trigger authentication in the client
            return ResponseEntity.status(HttpStatus.FORBIDDEN).header("X-artemisApp-error", e.getMessage()).build();
        }

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
                programmingExercise.getId(), programmingExercise.getTitle(), formatDurationFrom(start));

        return ResponseEntity.ok().contentLength(zipFile.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", zipFile.getName()).body(resource);
    }

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
                formatDurationFrom(start));

        return ResponseEntity.ok().contentLength(finalZipFile.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", finalZipFile.getName()).body(resource);
    }

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
                formatDurationFrom(startTime));

        return ResponseEntity.ok().contentLength(zipFile.get().length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", zipFile.get().getName()).body(resource);
    }

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java

        InputStreamResource resource = new InputStreamResource(new FileInputStream(zipFile));
        return ResponseEntity.ok().contentLength(zipFile.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", zipFile.getName()).body(resource);
    }
}
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
        File zipFile = archive.toFile();
        InputStreamResource resource = new InputStreamResource(new FileInputStream(zipFile));
        return ResponseEntity.ok().contentLength(zipFile.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", zipFile.getName()).body(resource);
    }

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileResource.java`
#### Snippet
```java
                mimeType = fileTypeMap.getContentType(filename);
            }
            var response = ResponseEntity.ok().headers(headers).contentType(MediaType.parseMediaType(mimeType)).header("filename", filename);
            if (cache) {
                var cacheControl = CacheControl.maxAge(Duration.ofDays(DAYS_TO_CACHE)).cachePublic();
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/ResponseUtil.java`
#### Snippet
```java
        try {
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
            return ResponseEntity.ok().contentLength(file.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).header("filename", file.getName()).body(resource);
        }
        catch (FileNotFoundException e) {
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/HeaderUtil.java`
#### Snippet
```java
    public static HttpHeaders createFailureAlert(String applicationName, boolean enableTranslation, String entityName, String errorKey, String defaultMessage) {
        HttpHeaders headers = tech.jhipster.web.util.HeaderUtil.createFailureAlert(applicationName, enableTranslation, entityName, errorKey, defaultMessage);
        headers.add("X-" + applicationName + "-message", defaultMessage);
        return headers;
    }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/HeaderUtil.java`
#### Snippet
```java
    public static HttpHeaders createFailureAlert(String applicationName, boolean enableTranslation, String entityName, String errorKey, String defaultMessage) {
        HttpHeaders headers = tech.jhipster.web.util.HeaderUtil.createFailureAlert(applicationName, enableTranslation, entityName, errorKey, defaultMessage);
        headers.add("X-" + applicationName + "-message", defaultMessage);
        return headers;
    }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooAuthorizationInterceptor.java`
#### Snippet
```java
        }

        request.getHeaders().set("X-Atlassian-Token", "no-check");

        // certain Bamboo requests do not support token based authentication, we have to use basic auth then or we need to use cookie authentication
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/AbstractGitLabAuthorizationInterceptor.java`
#### Snippet
```java
public abstract class AbstractGitLabAuthorizationInterceptor implements ClientHttpRequestInterceptor {

    private static final String GITLAB_AUTHORIZATION_HEADER_NAME = "Private-Token";

    @Value("${artemis.version-control.token}")
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
            if (e.getStatusCode().value() == 401 || e.getStatusCode().value() == 403) {
                // If JIRA requires a CAPTCHA. Communicate this to the client
                if (e.getResponseHeaders() != null && e.getResponseHeaders().containsKey("X-Authentication-Denied-Reason")) {
                    String authenticationDeniedReason = e.getResponseHeaders().get("X-Authentication-Denied-Reason").get(0);
                    if (authenticationDeniedReason.toLowerCase().contains("captcha")) {
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
                // If JIRA requires a CAPTCHA. Communicate this to the client
                if (e.getResponseHeaders() != null && e.getResponseHeaders().containsKey("X-Authentication-Denied-Reason")) {
                    String authenticationDeniedReason = e.getResponseHeaders().get("X-Authentication-Denied-Reason").get(0);
                    if (authenticationDeniedReason.toLowerCase().contains("captcha")) {
                        throw new CaptchaRequiredException("CAPTCHA required");
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
            final var response = restTemplate.exchange(jenkinsURL.toString() + "/crumbIssuer/api/json", HttpMethod.GET, entity, JsonNode.class);
            final var sessionId = response.getHeaders().get("Set-Cookie").get(0);
            headersToAuthenticate.add("Jenkins-Crumb", response.getBody().get("crumb").asText());
            headersToAuthenticate.add("Cookie", sessionId);
        }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/de/tum/in/www1/artemis/security/jwt/AtheneTrackingTokenProvider.java`
#### Snippet
```java
     */
    public void addTokenToResponseEntity(ResponseEntity.BodyBuilder bodyBuilder, Result result) {
        bodyBuilder.header("X-Athene-Tracking-Authorization", createToken(result));
    }
}
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Deprecated configuration property 'jhipster.logging.logstash.queue-size'
in `src/main/resources/config/application-prod.yml`
#### Snippet
```java
            host: localhost
            port: 5000
            queue-size: 512
    audit-events:
        retention-period: 120 # Number of days before audit events are deleted.
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.username-pattern'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    # This enables definition of alternative attribute keys when using multiple IdPs. E.g. username: '{uid}{user_id}'.
    # User template pattern:
    username-pattern: '{first_name}_{last_name}'
    first-name-pattern: '{first_name}'
    last-name-pattern: '{last_name}'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.first-name-pattern'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    # User template pattern:
    username-pattern: '{first_name}_{last_name}'
    first-name-pattern: '{first_name}'
    last-name-pattern: '{last_name}'
    email-pattern: '{email}'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.last-name-pattern'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    username-pattern: '{first_name}_{last_name}'
    first-name-pattern: '{first_name}'
    last-name-pattern: '{last_name}'
    email-pattern: '{email}'
    registration-number-pattern: '{uid}'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.email-pattern'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    first-name-pattern: '{first_name}'
    last-name-pattern: '{last_name}'
    email-pattern: '{email}'
    registration-number-pattern: '{uid}'
    lang-key-pattern: 'en' # can be a pattern or fixed to en/de
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.registration-number-pattern'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    last-name-pattern: '{last_name}'
    email-pattern: '{email}'
    registration-number-pattern: '{uid}'
    lang-key-pattern: 'en' # can be a pattern or fixed to en/de
    # It is also possible to only extract parts of the attribute values.
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.lang-key-pattern'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    email-pattern: '{email}'
    registration-number-pattern: '{uid}'
    lang-key-pattern: 'en' # can be a pattern or fixed to en/de
    # It is also possible to only extract parts of the attribute values.
    # For each attribute key exactly one regular expression can optionally be defined that is used to extract only parts
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.value-extraction-patterns'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    # E.g. when receiving 'pre1234post' from the SAML2 service in the 'uid'-example below, only '1234' will be used when
    # replacing '{uid}' in one of the user attributes defined above.
    value-extraction-patterns:
        #- key: 'first_name'
        #  value_pattern: 'somePrefix(?<value>.+)someSuffix'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'saml2.identity-providers'
in `src/main/resources/config/application-saml2.yml`
#### Snippet
```java
    # A list of identity provides (IdP). Metadata location can be a local path (or classpath) or url.
    # If your IdP does not publish its metadata you can generate it here: https://www.samltool.com/idp_metadata.php
    identity-providers:
        #- metadata: https://idp_host/.../metadata
        #  registration-id: IdPName
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'jenkins.internal-urls.ci-url'
in `src/main/resources/config/application-jenkins.yml`
#### Snippet
```java
    internal-urls:
        # Override the ci url used e.g. in Gitlab as the webhook url.
        ci-url: # http://jenkins:8080
        # Overrides the vcs url used e.g. as the Gitlab checkout url in Jenkins build plans
        vcs-url: # http://gitlab:80
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'jenkins.internal-urls.vcs-url'
in `src/main/resources/config/application-jenkins.yml`
#### Snippet
```java
        ci-url: # http://jenkins:8080
        # Overrides the vcs url used e.g. as the Gitlab checkout url in Jenkins build plans
        vcs-url: # http://gitlab:80

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'jhipster.cors.allowed-origin-patterns'
in `src/main/resources/config/application-dev.yml`
#### Snippet
```java
    # CORS is only enabled by default with the "dev" profile, so BrowserSync can access the API
    cors:
        allowed-origin-patterns: "*"
        allowed-methods: "*"
        allowed-headers: "*"
```

### SpringBootApplicationYaml
Deprecated configuration property 'jhipster.logging.logstash.queue-size'
in `src/main/resources/config/application-dev.yml`
#### Snippet
```java
            host: localhost
            port: 5000
            queue-size: 512
    audit-events:
        retention-period: 120 # Number of days before audit events are deleted.
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.user-management.password-reset.credential-provider'
in `src/main/resources/config/application-artemis.yml`
#### Snippet
```java
        use-external: true
        password-reset:
            credential-provider: <provider> # The credential provider which users can log in though (e.g. TUMonline)
            links: # The password reset links for different languages
                en: '<link>'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.user-management.password-reset.links.en'
in `src/main/resources/config/application-artemis.yml`
#### Snippet
```java
            credential-provider: <provider> # The credential provider which users can log in though (e.g. TUMonline)
            links: # The password reset links for different languages
                en: '<link>'
                de: '<link>'
        external:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.user-management.password-reset.links.de'
in `src/main/resources/config/application-artemis.yml`
#### Snippet
```java
            links: # The password reset links for different languages
                en: '<link>'
                de: '<link>'
        external:
            url: https://jira.ase.in.tum.de
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.version'
in `src/main/resources/config/application.yml`
#### Snippet
```java

artemis:
    version: #project.version#
    file-upload-path: uploads
    submission-export-path: exports
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags'
in `src/main/resources/config/application.yml`
#### Snippet
```java
        # definitions.
        build:
            default-docker-flags:
                - flag: --cpus
                  value: 2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[0\].flag'
in `src/main/resources/config/application.yml`
#### Snippet
```java
        build:
            default-docker-flags:
                - flag: --cpus
                  value: 2
                # Set `memory-swap` and `memory` to the same value to turn off SWAP.
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[0\].value'
in `src/main/resources/config/application.yml`
#### Snippet
```java
            default-docker-flags:
                - flag: --cpus
                  value: 2
                # Set `memory-swap` and `memory` to the same value to turn off SWAP.
                # See -> https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[1\].flag'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                # Set `memory-swap` and `memory` to the same value to turn off SWAP.
                # See -> https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details
                - flag: --memory
                  value: 2g
                - flag: --memory-swap
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[1\].value'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                # See -> https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details
                - flag: --memory
                  value: 2g
                - flag: --memory-swap
                  value: 2g
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[2\].flag'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                - flag: --memory
                  value: 2g
                - flag: --memory-swap
                  value: 2g
                - flag: --pids-limit
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[2\].value'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                  value: 2g
                - flag: --memory-swap
                  value: 2g
                - flag: --pids-limit
                  value: 1000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[3\].flag'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                - flag: --memory-swap
                  value: 2g
                - flag: --pids-limit
                  value: 1000
            images:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.default-docker-flags\[3\].value'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                  value: 2g
                - flag: --pids-limit
                  value: 1000
            images:
                java:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.java.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                java:
                    # possible overrides: maven, gradle
                    default: "ls1tum/artemis-maven-template:java17-16"
                kotlin:
                    # possible overrides: maven, gradle
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.kotlin.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                kotlin:
                    # possible overrides: maven, gradle
                    default: "ls1tum/artemis-maven-template:java17-16"
                empty:
                    default: "ls1tum/artemis-maven-template:java17-16"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.empty.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    default: "ls1tum/artemis-maven-template:java17-16"
                empty:
                    default: "ls1tum/artemis-maven-template:java17-16"
                python:
                    default: "ls1tum/artemis-python-docker:latest"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.python.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    default: "ls1tum/artemis-maven-template:java17-16"
                python:
                    default: "ls1tum/artemis-python-docker:latest"
                c:
                    # possible overrides: gcc, fact
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.c.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                c:
                    # possible overrides: gcc, fact
                    default: "ls1tum/artemis-c-docker:latest"
                    fact: "sharingcodeability/fact:latest"
                haskell:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.c.fact'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    # possible overrides: gcc, fact
                    default: "ls1tum/artemis-c-docker:latest"
                    fact: "sharingcodeability/fact:latest"
                haskell:
                    default: "ghcr.io/uni-passau-artemis/artemis-haskell:v19.33.0"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.haskell.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    fact: "sharingcodeability/fact:latest"
                haskell:
                    default: "ghcr.io/uni-passau-artemis/artemis-haskell:v19.33.0"
                vhdl:
                    default: "tizianleonhardt/era-artemis-vhdl:latest"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.vhdl.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    default: "ghcr.io/uni-passau-artemis/artemis-haskell:v19.33.0"
                vhdl:
                    default: "tizianleonhardt/era-artemis-vhdl:latest"
                assembler:
                    default: "tizianleonhardt/era-artemis-assembler:latest"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.assembler.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    default: "tizianleonhardt/era-artemis-vhdl:latest"
                assembler:
                    default: "tizianleonhardt/era-artemis-assembler:latest"
                swift:
                    # possible overrides: xcode
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.swift.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                swift:
                    # possible overrides: xcode
                    default: "ls1tum/artemis-swift-swiftlint-docker:latest"
                ocaml:
                    default: "ls1tum/artemis-ocaml-docker:v1"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'artemis.continuous-integration.build.images.ocaml.default'
in `src/main/resources/config/application.yml`
#### Snippet
```java
                    default: "ls1tum/artemis-swift-swiftlint-docker:latest"
                ocaml:
                    default: "ls1tum/artemis-ocaml-docker:v1"

management:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.health.config.enabled'
in `src/main/resources/config/application.yml`
#### Snippet
```java
            enabled: false # Disabled to prevent periodic health checks that lead to null pointer exceptions if the ldap is not configured or not active
        config:
            enabled: false # Disabled because we do not use a Spring Cloud Config Server
    metrics:
        export:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.config.import-check.enabled'
in `src/main/resources/config/application.yml`
#### Snippet
```java
        config:
            import-check:
                enabled: false
    data:
        jpa:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.hazelcast.phone.home.enabled'
in `src/main/resources/config/application.yml`
#### Snippet
```java
        phone:
            home:
                enabled: false
    autoconfigure:
        # These AutoConfiguration are excluded as they include metrics which are not evaluated and only cause unnecessary network load
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'hazelcast.phone.home.enabled'
in `src/main/resources/config/application.yml`
#### Snippet
```java
    phone:
        home:
            enabled: false

springdoc:
```

## RuleId[id=SpringJavaInjectionPointsAutowiringInspection]
### SpringJavaInjectionPointsAutowiringInspection
Cannot find bean qualified with @LiquibaseDataSource
in `src/main/java/de/tum/in/www1/artemis/config/LiquibaseConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SpringLiquibase liquibase(@LiquibaseDataSource ObjectProvider<DataSource> liquibaseDataSource, LiquibaseProperties liquibaseProperties,
            ObjectProvider<DataSource> dataSourceObjectProvider, DataSourceProperties dataSourceProperties) {

```

### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'JavaMailSender' type found.
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java
    private static final String WEEKLY_SUMMARY_NEW_EXERCISES = "weeklySummaryNewExercises";

    public MailService(JHipsterProperties jHipsterProperties, JavaMailSender javaMailSender, MessageSource messageSource, SpringTemplateEngine templateEngine,
            TimeService timeService) {
        this.jHipsterProperties = jHipsterProperties;
```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizProcessCacheTask.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    @Autowired // ok
    transient QuizScheduleService quizScheduleService;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizStartTask.java`
#### Snippet
```java
    final Long quizExerciseId;

    @Autowired // ok
    transient QuizScheduleService quizScheduleService;

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`{1}` is redundant
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
public class TutorialGroupResource {

    private static final String TITLE_REGEX = "^[a-zA-Z0-9]{1}[a-zA-Z0-9- ]{0,19}$";

    public static final String ENTITY_NAME = "tutorialGroup";
```

### RegExpSimplifiable
`{1}` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/ChannelService.java`
#### Snippet
```java
    public static final String CHANNEL_ENTITY_NAME = "messages.channel";

    private static final String CHANNEL_NAME_REGEX = "^[a-z0-9$]{1}[a-z0-9-]{0,20}$";

    private final ConversationParticipantRepository conversationParticipantRepository;
```

## RuleId[id=Deprecation]
### Deprecation
'org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter' is deprecated
in `src/main/java/de/tum/in/www1/artemis/config/SecurityConfiguration.java`
#### Snippet
```java
// as that would break the SAML2 login functionality. For more information, see
// https://github.com/ls1intum/Artemis/pull/5721.
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AuthenticationManagerBuilder authenticationManagerBuilder;
```

### Deprecation
'org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter' is deprecated
in `src/main/java/de/tum/in/www1/artemis/config/SAML2Configuration.java`
#### Snippet
```java
 * Describes the security configuration for SAML2.
 * <p>
 * Since this {@link WebSecurityConfigurerAdapter} is annotated with {@link Order} and {@link SecurityConfiguration}
 * is not, this configuration is evaluated first when the SAML2 Profile is active.
 */
```

### Deprecation
'org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter' is deprecated
in `src/main/java/de/tum/in/www1/artemis/config/SAML2Configuration.java`
#### Snippet
```java
// as that would break the SAML2 login functionality. For more information, see
// https://github.com/ls1intum/Artemis/pull/5721.
public class SAML2Configuration extends WebSecurityConfigurerAdapter {

    private final Logger log = LoggerFactory.getLogger(SAML2Configuration.class);
```

### Deprecation
'IMPLICIT' is deprecated
in `src/main/java/de/tum/in/www1/artemis/domain/lti/Lti13ClientRegistration.java`
#### Snippet
```java

    public Lti13ClientRegistration(String serverUrl, Course course, String clientRegistrationId) {
        this.setGrantTypes(Arrays.asList(AuthorizationGrantType.CLIENT_CREDENTIALS.getValue(), AuthorizationGrantType.IMPLICIT.getValue()));
        this.setResponseTypes(List.of("id_token"));
        this.setClientName("Artemis - " + course.getShortName());
```

### Deprecation
'IMPLICIT' is deprecated
in `src/main/java/de/tum/in/www1/artemis/service/OnlineCourseConfigurationService.java`
#### Snippet
```java
                    .redirectUri(artemisServerUrl + CustomLti13Configurer.LTI13_LOGIN_REDIRECT_PROXY_PATH) //
                    .scope("openid") //
                    .authorizationGrantType(AuthorizationGrantType.IMPLICIT) //
                    .build();
        }
```

### Deprecation
'copyPattern(java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                    final List<StaticCodeAnalysisTool> staticCodeAnalysisTools = StaticCodeAnalysisTool.getToolsForProgrammingLanguage(ProgrammingLanguage.C);
                    final Artifact[] artifacts = staticCodeAnalysisTools.stream()
                            .map(tool -> new Artifact().name(tool.getArtifactLabel()).location("target").copyPattern(tool.getFilePattern()).shared(false)).toArray(Artifact[]::new);
                    defaultJob.artifacts(artifacts);
                    final var scaTasks = readScriptTasksFromTemplate(programmingLanguage, Optional.empty(), null, false, true);
```

### Deprecation
'copyPattern(java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                    final List<StaticCodeAnalysisTool> staticCodeAnalysisTools = StaticCodeAnalysisTool.getToolsForProgrammingLanguage(ProgrammingLanguage.SWIFT);
                    final Artifact[] artifacts = staticCodeAnalysisTools.stream()
                            .map(tool -> new Artifact().name(tool.getArtifactLabel()).location("target").copyPattern(tool.getFilePattern()).shared(false)).toArray(Artifact[]::new);
                    defaultJob.artifacts(artifacts);
                    final var scaTasks = readScriptTasksFromTemplate(programmingLanguage, subDirectory, null, false, true);
```

### Deprecation
'copyPattern(java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                // If a testwise coverage should be performed, a custom profile is used for the execution
                goals += " -Pcoverage";
                artifacts.add(new Artifact().name("testwiseCoverageReport").location("target/tia/reports").copyPattern("tiaTests.json"));
            }

```

### Deprecation
'copyPattern(java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
            if (recordTestwiseCoverage) {
                testCommand += " tiaTests --run-all-tests";
                artifacts.add(new Artifact().name("testwiseCoverageReport").location("build/reports/testwise-coverage/tiaTests").copyPattern("tiaTests.json"));
            }
            defaultTasks.add(new ScriptTask().inlineBody(testCommand).description("Tests"));
```

### Deprecation
'copyPattern(java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
        List<StaticCodeAnalysisTool> staticCodeAnalysisTools = StaticCodeAnalysisTool.getToolsForProgrammingLanguage(ProgrammingLanguage.JAVA);
        var scaArtifacts = staticCodeAnalysisTools.stream()
                .map(tool -> new Artifact().name(tool.getArtifactLabel()).location("target").copyPattern(tool.getFilePattern()).shared(false)).toList();

        if (isMavenProject) {
```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/de/tum/in/www1/artemis/domain/BuildPlan.java`
#### Snippet
```java

    public Optional<ProgrammingExercise> getProgrammingExerciseById(Long exerciseId) {
        return programmingExercises.stream().filter(programmingExercise -> programmingExercise.getId() == exerciseId).findFirst();
    }
}
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java

    @Override
    public ResponseEntity<Problem> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, @NotNull NativeWebRequest request) {
        BindingResult result = ex.getBindingResult();
        List<FieldErrorVM> fieldErrors = result.getFieldErrors().stream().map(f -> new FieldErrorVM(f.getObjectName().replaceFirst("DTO$", ""), f.getField(), f.getCode()))
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
     */
    @Override
    public ResponseEntity<Problem> process(@Nullable ResponseEntity<Problem> entity, @NotNull NativeWebRequest request) {
        if (entity == null) {
            return null;
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/PublicResourcesConfiguration.java`
#### Snippet
```java

    @Override
    public void addResourceHandlers(@NotNull ResourceHandlerRegistry registry) {
        // Enable static resource serving in general from "/public" from both classpath and hosts filesystem
        addResourceHandlerForPath(registry);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/DateTimeFormatConfiguration.java`
#### Snippet
```java

    @Override
    public void addFormatters(FormatterRegistry registry) {
        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
        registrar.setUseIsoFormat(true);
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/config/auth/AtheneAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().set(HttpHeaders.AUTHORIZATION, secret);
        return execution.execute(request, body);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/auth/AtheneAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().set(HttpHeaders.AUTHORIZATION, secret);
        return execution.execute(request, body);
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/config/auth/JiraAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
            request.getHeaders().setBasicAuth(JIRA_USER, JIRA_PASSWORD, StandardCharsets.UTF_8);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/auth/JiraAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
            request.getHeaders().setBasicAuth(JIRA_USER, JIRA_PASSWORD, StandardCharsets.UTF_8);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/auth/JiraAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
            request.getHeaders().setBasicAuth(JIRA_USER, JIRA_PASSWORD, StandardCharsets.UTF_8);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            public void afterHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler, Exception exception) {
                if (exception != null) {
                    log.warn("Exception occurred in WS.afterHandshake", exception);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            public void afterHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler, Exception exception) {
                if (exception != null) {
                    log.warn("Exception occurred in WS.afterHandshake", exception);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            public void afterHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler, Exception exception) {
                if (exception != null) {
                    log.warn("Exception occurred in WS.afterHandshake", exception);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            public boolean beforeHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler,
                    @NotNull Map<String, Object> attributes) {
                if (request instanceof ServletServerHttpRequest servletRequest) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            public boolean beforeHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler,
                    @NotNull Map<String, Object> attributes) {
                if (request instanceof ServletServerHttpRequest servletRequest) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            public boolean beforeHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler,
                    @NotNull Map<String, Object> attributes) {
                if (request instanceof ServletServerHttpRequest servletRequest) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
            @Override
            public boolean beforeHandshake(@NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response, @NotNull WebSocketHandler wsHandler,
                    @NotNull Map<String, Object> attributes) {
                if (request instanceof ServletServerHttpRequest servletRequest) {
                    attributes.put(IP_ADDRESS, servletRequest.getRemoteAddress());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
    @NotNull
    @Override
    protected MappingJackson2MessageConverter createJacksonConverter() {
        // NOTE: We need to adapt the default messageConverter for WebSocket messages
        // with a messageConverter that uses the same ObjectMapper that our REST endpoints use.
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
         */
        @Override
        public Message<?> preSend(@NotNull Message<?> message, @NotNull MessageChannel channel) {
            StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(message);
            Principal principal = headerAccessor.getUser();
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
         */
        @Override
        public Message<?> preSend(@NotNull Message<?> message, @NotNull MessageChannel channel) {
            StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(message);
            Principal principal = headerAccessor.getUser();
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            protected Principal determineUser(@NotNull ServerHttpRequest request, @NotNull WebSocketHandler wsHandler, @NotNull Map<String, Object> attributes) {
                Principal principal = request.getPrincipal();
                if (principal == null) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            protected Principal determineUser(@NotNull ServerHttpRequest request, @NotNull WebSocketHandler wsHandler, @NotNull Map<String, Object> attributes) {
                Principal principal = request.getPrincipal();
                if (principal == null) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

            @Override
            protected Principal determineUser(@NotNull ServerHttpRequest request, @NotNull WebSocketHandler wsHandler, @NotNull Map<String, Object> attributes) {
                Principal principal = request.getPrincipal();
                if (principal == null) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java

    @Override
    protected void configureMessageBroker(@NotNull MessageBrokerRegistry config) {
        // Try to create a TCP client that will connect to the message broker (or the message brokers if multiple exists).
        // If tcpClient is null, there is no valid address specified in the config. This could be due to a development setup or a mistake in the config.
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/GradingScale.java`
#### Snippet
```java
    }

    public void setPresentationsWeight(Double presentationsWeight) {
        this.presentationsWeight = presentationsWeight;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/GradingScale.java`
#### Snippet
```java
    }

    public Integer getPresentationsNumber() {
        return presentationsNumber;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/GradingScale.java`
#### Snippet
```java
    }

    public void setPresentationsNumber(Integer presentationsNumber) {
        this.presentationsNumber = presentationsNumber;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/GradingScale.java`
#### Snippet
```java
    }

    public Double getPresentationsWeight() {
        return presentationsWeight;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/de/tum/in/www1/artemis/domain/Submission.java`
#### Snippet
```java

    @Override
    public int compareTo(Submission other) {
        if (getSubmissionDate() == null || other.getSubmissionDate() == null || Objects.equals(getSubmissionDate(), other.getSubmissionDate())) {
            // this case should not happen, but in the rare case we can compare the ids (in tests, the submission dates might be identical as ms are not stored in the database)
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/de/tum/in/www1/artemis/domain/Result.java`
#### Snippet
```java

    @Override
    public int compareTo(Result other) {
        if (getCompletionDate() == null || other.getCompletionDate() == null || Objects.equals(getCompletionDate(), other.getCompletionDate())) {
            // this case should not happen, but in the rare case we can compare the ids (in tests, the submission dates might be identical as ms are not stored in the database)
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    }

    public ZonedDateTime getHideNotificationsUntil() {
        return hideNotificationsUntil;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    }

    public void setHideNotificationsUntil(ZonedDateTime hideNotificationsUntil) {
        this.hideNotificationsUntil = hideNotificationsUntil;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/monitoring/ExamMonitoringDistributedCache.java`
#### Snippet
```java

        @Override
        public @NotNull ExamMonitoringDistributedCache read(ObjectDataInput input) throws IOException {
            Long examId = input.readLong();
            return new ExamMonitoringDistributedCache(examId);
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizExerciseDistributedCache.java`
#### Snippet
```java

        @Override
        public QuizExerciseDistributedCache read(ObjectDataInput in) throws IOException {
            Long exerciseId = in.readLong();
            List<ScheduledTaskHandler> quizStart = in.readObject();
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (request.getHeaders().getAccept().isEmpty()) {
            request.getHeaders().setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (request.getHeaders().getAccept().isEmpty()) {
            request.getHeaders().setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (request.getHeaders().getAccept().isEmpty()) {
            request.getHeaders().setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/AbstractGitLabAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().add(GITLAB_AUTHORIZATION_HEADER_NAME, gitlabPrivateToken);
        return execution.execute(request, body);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/AbstractGitLabAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().add(GITLAB_AUTHORIZATION_HEADER_NAME, gitlabPrivateToken);
        return execution.execute(request, body);
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().setBasicAuth(username, password);
        if (useCrumb) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().setBasicAuth(username, password);
        if (useCrumb) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().setBasicAuth(username, password);
        if (useCrumb) {
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (request.getHeaders().getAccept().isEmpty()) {
            request.getHeaders().setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (request.getHeaders().getAccept().isEmpty()) {
            request.getHeaders().setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketAuthorizationInterceptor.java`
#### Snippet
```java
    @NotNull
    @Override
    public ClientHttpResponse intercept(HttpRequest request, @NotNull byte[] body, @NotNull ClientHttpRequestExecution execution) throws IOException {
        if (request.getHeaders().getAccept().isEmpty()) {
            request.getHeaders().setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/security/SpringSecurityAuditorAware.java`
#### Snippet
```java

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(SecurityUtils.getCurrentUserLogin().orElse(Constants.SYSTEM_ACCOUNT));
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13LaunchFilter.java`
#### Snippet
```java

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (!this.requestMatcher.matches(request)) {
            filterChain.doFilter(request, response);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13LaunchFilter.java`
#### Snippet
```java

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (!this.requestMatcher.matches(request)) {
            filterChain.doFilter(request, response);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13LaunchFilter.java`
#### Snippet
```java

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (!this.requestMatcher.matches(request)) {
            filterChain.doFilter(request, response);
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/repository/PersistenceAuditEventRepository.java`
#### Snippet
```java
    @NotNull
    @EntityGraph(type = LOAD, attributePaths = { "data" })
    Page<PersistentAuditEvent> findAll(@NotNull Pageable pageable);

    @NotNull
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/repository/PersistenceAuditEventRepository.java`
#### Snippet
```java
    @NotNull
    @EntityGraph(type = LOAD, attributePaths = { "data" })
    Page<PersistentAuditEvent> findAll(@NotNull Pageable pageable);

    @NotNull
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/repository/PersistenceAuditEventRepository.java`
#### Snippet
```java
    @NotNull
    @EntityGraph(type = LOAD, attributePaths = { "data" })
    Optional<PersistentAuditEvent> findById(@NotNull Long auditEventId);
}

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/repository/PersistenceAuditEventRepository.java`
#### Snippet
```java
    @NotNull
    @EntityGraph(type = LOAD, attributePaths = { "data" })
    Optional<PersistentAuditEvent> findById(@NotNull Long auditEventId);
}

```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/de/tum/in/www1/artemis/repository/ParticipantScoreRepository.java`
#### Snippet
```java
    @Override
    @EntityGraph(type = LOAD, attributePaths = { "exercise", "lastResult", "lastRatedResult" })
    List<ParticipantScore> findAll();

    @EntityGraph(type = LOAD, attributePaths = { "exercise", "lastResult", "lastRatedResult" })
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/de/tum/in/www1/artemis/repository/tutorialgroups/TutorialGroupRegistrationRepository.java`
#### Snippet
```java
    @Transactional
    @Modifying
    void deleteById(@NotNull Long tutorialGroupRegistrationId);

    @Modifying
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/web/rest/AndroidAppSiteAssociationResource.java`
#### Snippet
```java
    /**
     * Provides the assetlinks json content for the Android client deeplink link feature.
     * More information on the json content can be found <a href="URL#https://developer.android.com/training/app-links/verify-android-applinks">here</a>
     *
     * @return assetslinks as json
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/web/rest/AppleAppSiteAssociationResource.java`
#### Snippet
```java
    /**
     * Provides the apple-app-site-association json content for the iOS client universal link feature.
     * More information on the json content can be found <a href="URL#https://developer.apple.com/documentation/xcode/supporting-associated-domains">here</a>
     *
     * @return apple-app-site-association as json
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
/**
 * Controller advice to translate the server side exceptions to client-friendly json structures. The error response follows RFC7807 - Problem Details for HTTP APIs
 * (https://tools.ietf.org/html/rfc7807)
 */
@ControllerAdvice
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/VcsRepositoryUrl.java`
#### Snippet
```java
     *
     * Examples:
     * https://bitbucket.ase.in.tum.de/scm/eist20l06e03/eist20l06e03-ab123cd.git --> eist20l06e03/eist20l06e03-ab123cd
     * ssh://git@bitbucket.ase.in.tum.de:7999/eist20l06e03/eist20l06e03-ab123cd.git --> eist20l06e03/eist20l06e03-ab123cd
     * file:C:/Users/Admin/AppData/Local/Temp/studentOriginRepo1644180397872264950 --> studentOriginRepo1644180397872264950
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/LearningGoalProgress.java`
#### Snippet
```java
    /**
     * This class is used to create a composite primary key (user_id, learning_goal_id).
     * See also https://www.baeldung.com/spring-jpa-embedded-method-parameters
     */
    @Embeddable
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
     * If multiple brokers are configured, the client will connect to the first one and fail over to the next one in case a broker goes down.
     * If the last broker goes down, the first one is retried.
     * Also see https://github.com/spring-projects/spring-framework/issues/17057 and
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#websocket-stomp-handle-broker-relay-configure
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
     * If the last broker goes down, the first one is retried.
     * Also see https://github.com/spring-projects/spring-framework/issues/17057 and
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#websocket-stomp-handle-broker-relay-configure
     *
     * @return a TCP client with a round-robin use
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/ShortAnswerSubmittedText.java`
#### Snippet
```java

    /**
     * This function checks if the submittedText (typos included) matches the solution. https://github.com/xdrop/fuzzywuzzy
     *
     * @param submittedText for a short answer question
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/lecture/LectureUnitCompletion.java`
#### Snippet
```java
    /**
     * This class is used to create a composite primary key (user_id, lecture_unit_id).
     * See also https://www.baeldung.com/spring-jpa-embedded-method-parameters
     */
    @Embeddable
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/enumeration/TextAssessmentEventType.java`
#### Snippet
```java
 * system in text exercises
 * More detailed info in the documentation:
 * https://docs.artemis.cit.tum.de/dev/setup/#configure-text-assessment-analytics-service
 */
public enum TextAssessmentEventType {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/notification/NotificationTargetFactory.java`
#### Snippet
```java
     *
     * @param notification which transient target property will be used for creating the URL
     * @param baseUrl      the prefix (depends on current set up (e.g. "http://localhost:9000/courses"))
     * @return viable URL to the notification related page
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/domain/notification/NotificationTargetFactory.java`
#### Snippet
```java
     *
     * @param post    which information will be needed to create the URL
     * @param baseUrl the prefix (depends on current set up (e.g. "http://localhost:9000/courses"))
     * @return viable URL to the notification related page
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/UrlService.java`
#### Snippet
```java
     * Gets the project key from the given URL
     *
     * Example: https://ga42xab@bitbucket.ase.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga42xab.git --> EIST2016RME
     *
     * @param url The complete repository url (including protocol, host and the complete path)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/UrlService.java`
#### Snippet
```java
     * Gets the repository slug from the given URL
     *
     * Example 1: https://ga42xab@bitbucket.ase.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga42xab.git --> RMEXERCISE-ga42xab
     * Example 2: https://ga63fup@repobruegge.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga63fup.git --> RMEXERCISE-ga63fup
     * Example 3: https://artemistest2gitlab.ase.in.tum.de/TESTADAPTER/testadapter-exercise.git --> testadapter-exercise
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/UrlService.java`
#### Snippet
```java
     *
     * Example 1: https://ga42xab@bitbucket.ase.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga42xab.git --> RMEXERCISE-ga42xab
     * Example 2: https://ga63fup@repobruegge.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga63fup.git --> RMEXERCISE-ga63fup
     * Example 3: https://artemistest2gitlab.ase.in.tum.de/TESTADAPTER/testadapter-exercise.git --> testadapter-exercise
     * Example 4: https://turdiu@artemistest2gitlab.ase.in.tum.de/FTCSCAGRADING1/ftcscagrading1-turdiu.git --> ftcscagrading1-turdiu
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/UrlService.java`
#### Snippet
```java
     * Example 1: https://ga42xab@bitbucket.ase.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga42xab.git --> RMEXERCISE-ga42xab
     * Example 2: https://ga63fup@repobruegge.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga63fup.git --> RMEXERCISE-ga63fup
     * Example 3: https://artemistest2gitlab.ase.in.tum.de/TESTADAPTER/testadapter-exercise.git --> testadapter-exercise
     * Example 4: https://turdiu@artemistest2gitlab.ase.in.tum.de/FTCSCAGRADING1/ftcscagrading1-turdiu.git --> ftcscagrading1-turdiu
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/UrlService.java`
#### Snippet
```java
     * Example 2: https://ga63fup@repobruegge.in.tum.de/scm/EIST2016RME/RMEXERCISE-ga63fup.git --> RMEXERCISE-ga63fup
     * Example 3: https://artemistest2gitlab.ase.in.tum.de/TESTADAPTER/testadapter-exercise.git --> testadapter-exercise
     * Example 4: https://turdiu@artemistest2gitlab.ase.in.tum.de/FTCSCAGRADING1/ftcscagrading1-turdiu.git --> ftcscagrading1-turdiu
     *
     * @param url The complete repository url (including protocol, host and the complete path)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/UrlService.java`
#### Snippet
```java
     * Gets the project key + repository slug from the given URL
     *
     * Example: https://artemistest2gitlab.ase.in.tum.de/TESTADAPTER/testadapter-exercise.git --> TESTADAPTER/testadapter-exercise
     *
     * @param url The complete repository url (including protocol, host and the complete path)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     * because the optional will be empty, and therefore `isPresent()` will return false This is due how `filter` works: If a value is present, apply the provided mapping function
     * to it, and if the result is non-null, return an Optional describing the result. Otherwise, return an empty Optional.
     * https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#filter-java.util.function.Predicate
     *
     * @param exercise the exercise that needs to be checked
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/OracleGenerator.java`
#### Snippet
```java
 * The oracle is saved in the form of a JSON file in test.json.
 * The structure oracle is used in the structural tests and contains information on the expected structural elements that the student has to implement.
 * The generator uses the qdox framework (https://github.com/paul-hammant/qdox).
 * It extracts first the needed elements by doing a so-called diff of each element e.g. the difference between the solution of an exercise and its template.
 * The generator uses separate data structures that contain the elements of these diffs and then creates JSON representations of them.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
     * If there were changes to at least one of the repositories a new report will be created.
     * This method should not be called twice for the same programming exercise at the same time, as this will result in
     * the creation of 2 reports. See https://github.com/ls1intum/Artemis/pull/4893 for more information about it.
     *
     * @param programmingExercise The programming exercise
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/security/SecurityUtils.java`
#### Snippet
```java
     * is not automatically generated but manually specified, the Spring Data JPA expects the user performing the request to be authenticated. If the request to the JpaRepository
     * is made because of a REST-call from a server that is not authenticated within Spring, an InvalidDataAccessApiUsageException is raised. This method is a workaround for this
     * behaviour. See https://jira.spring.io/browse/DATAJPA-1357 for more details.
     */
    public static void setAuthorizationObject() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/de/tum/in/www1/artemis/repository/specs/PostSpecs.java`
#### Snippet
```java
     * @return specification that adds the keyword GROUP BY to the query since DISTINCT and ORDER BY keywords are
     *         incompatible with each other at server tests
     *         https://github.com/h2database/h2database/issues/408
     */
    public static Specification<Post> distinct() {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    private final GradingCriterionRepository gradingCriterionRepository;

    private final Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService;

    private final CourseRepository courseRepository;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/web/websocket/QuizSubmissionWebsocketService.java`
#### Snippet
```java
    private final QuizExerciseService quizExerciseService;

    private final ParticipationService participationService;

    private final QuizSubmissionService quizSubmissionService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/web/websocket/QuizSubmissionWebsocketService.java`
#### Snippet
```java
    private final SimpMessageSendingOperations messagingTemplate;

    private final UserRepository userRepository;

    public QuizSubmissionWebsocketService(QuizExerciseService quizExerciseService, ParticipationService participationService, SimpMessageSendingOperations messagingTemplate,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/web/websocket/QuizSubmissionWebsocketService.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(QuizSubmissionWebsocketService.class);

    private final QuizExerciseService quizExerciseService;

    private final ParticipationService participationService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java

    // Translation that can not be done via i18n Resource Bundle (for Thymeleaf) but has to be set in this service via Java
    private final String newAnnouncementEN = "New announcement \"%s\" in course \"%s\"";

    private final String newAnnouncementDE = "Neue Ankündigung \"%s\" im Kurs \"%s\"";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java
    private final String newAnnouncementEN = "New announcement \"%s\" in course \"%s\"";

    private final String newAnnouncementDE = "Neue Ankündigung \"%s\" im Kurs \"%s\"";

    // time related variables
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/ChannelService.java`
#### Snippet
```java
    private final ChannelRepository channelRepository;

    private final UserRepository userRepository;

    private final ConversationService conversationService;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Optional.empty()` is ignored
in `src/main/java/de/tum/in/www1/artemis/web/rest/metis/conversation/ChannelResource.java`
#### Snippet
```java
        tutorialGroupChannelManagementService.getTutorialGroupBelongingToChannel(channel).ifPresentOrElse(tutorialGroup -> {
            throw new BadRequestAlertException("The channel belongs to tutorial group " + tutorialGroup.getTitle(), CHANNEL_ENTITY_NAME, "channel.tutorialGroup.mismatch");
        }, Optional::empty);

        var usersToNotify = conversationParticipantRepository.findConversationParticipantByConversationId(channel.getId()).stream().map(ConversationParticipant::getUser)
```

### IgnoreResultOfCall
Result of `LocalTime.parse()` is ignored
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupDateUtil.java`
#### Snippet
```java

        try {
            LocalTime.parse(timeString);
            return true;
        }
```

### IgnoreResultOfCall
Result of `LocalDate.parse()` is ignored
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupDateUtil.java`
#### Snippet
```java

        try {
            LocalDate.parse(dateString);
            return true;
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/ModelingSubmissionExportService.java`
#### Snippet
```java
        if (((ModelingSubmission) submission).getModel() == null) {
            if (!file.exists()) {
                file.createNewFile(); // create empty file if submission is empty
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java

        if (!dir.exists()) {
            dir.mkdirs();
        }
        Files.copy(file.getInputStream(), savedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionExportService.java`
#### Snippet
```java
        if (((TextSubmission) submission).getText() == null) {
            if (!file.exists()) {
                file.createNewFile(); // create empty file if submission is empty
            }
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionExportService.java`
#### Snippet
```java

        if (!submissionExportFile.exists()) {
            submissionExportFile.createNewFile();
        }

```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java

        if (targetPath.endsWith("gradlew")) {
            targetPath.toFile().setExecutable(true);
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/TextPlagiarismDetectionService.java`
#### Snippet
```java
            final var submissionsFolderName = "./tmp/submissions";
            final var submissionFolderFile = new File(submissionsFolderName);
            submissionFolderFile.mkdirs();

            final List<TextSubmission> textSubmissions = textSubmissionsForComparison(textExercise, minimumScore, minimumSize);
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportFromFileService.java`
#### Snippet
```java
                new NotFileFilter(new NameFileFilter(".git")));
        try (var files = Files.walk(repository.getLocalPath())) {
            files.filter(file -> "gradlew".equals(file.getFileName().toString())).forEach(file -> file.toFile().setExecutable(true));
        }
        repository.setContent(null);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `initialize()` is identical to its super method
in `src/main/java/de/tum/in/www1/artemis/validation/TeamAssignmentConfigValidator.java`
#### Snippet
```java
public class TeamAssignmentConfigValidator implements ConstraintValidator<TeamAssignmentConfigConstraints, TeamAssignmentConfig> {

    public void initialize(TeamAssignmentConfigConstraints constraint) {
    }

```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/service/LectureUnitService.java`
#### Snippet
```java
        Optional<LectureUnitCompletion> existingCompletion = lectureUnitCompletionRepository.findByLectureUnitIdAndUserId(lectureUnit.getId(), user.getId());
        if (completed) {
            if (!existingCompletion.isPresent()) {
                // Create a completion status for this lecture unit (only if it does not exist)
                LectureUnitCompletion completion = new LectureUnitCompletion();
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java

            final var folderJob = jenkinsServer.getFolderJob(job);
            if (!folderJob.isPresent()) {
                return null;
            }
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/web/rest/lecture/LectureUnitResource.java`
#### Snippet
```java

        // Ensure that all received lecture unit ids are already part of the lecture
        if (!lectureUnits.stream().map(LectureUnit::getId).toList().containsAll(orderedLectureUnitIds)) {
            throw new ConflictException("Received lecture unit is not part of the lecture", "LectureUnit", "lectureMismatch");
        }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java
            return false;
        }
        return solutionList.containsAll(templateList);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java

        // Otherwise, check if the list of the parameters of the solution executable contains all the parameters in the template executable.
        return solutionParams.containsAll(templateParams);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
        UMLContainerElement otherElement = (UMLContainerElement) obj;

        return otherElement.subElements.size() == subElements.size() && otherElement.subElements.containsAll(subElements) && subElements.containsAll(otherElement.subElements);
    }
}
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
        UMLContainerElement otherElement = (UMLContainerElement) obj;

        return otherElement.subElements.size() == subElements.size() && otherElement.subElements.containsAll(subElements) && subElements.containsAll(otherElement.subElements);
    }
}
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivity.java`
#### Snippet
```java
        UMLActivity otherActivity = (UMLActivity) obj;

        return otherActivity.childElements.size() == childElements.size() && otherActivity.childElements.containsAll(childElements)
                && childElements.containsAll(otherActivity.childElements);
    }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivity.java`
#### Snippet
```java

        return otherActivity.childElements.size() == childElements.size() && otherActivity.childElements.containsAll(childElements)
                && childElements.containsAll(otherActivity.childElements);
    }
}
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
        UMLMethod otherMethod = (UMLMethod) obj;

        if (otherMethod.getParameters().size() != getParameters().size() || !otherMethod.getParameters().containsAll(getParameters())
                || !getParameters().containsAll(otherMethod.getParameters())) {
            return false;
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java

        if (otherMethod.getParameters().size() != getParameters().size() || !otherMethod.getParameters().containsAll(getParameters())
                || !getParameters().containsAll(otherMethod.getParameters())) {
            return false;
        }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        if (!otherClass.getAttributes().containsAll(getAttributes()) || !getAttributes().containsAll(otherClass.getAttributes())) {
            return false;
        }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        if (!otherClass.getAttributes().containsAll(getAttributes()) || !getAttributes().containsAll(otherClass.getAttributes())) {
            return false;
        }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        return otherClass.getMethods().containsAll(getMethods()) && getMethods().containsAll(otherClass.getMethods());
    }
}
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        return otherClass.getMethods().containsAll(getMethods()) && getMethods().containsAll(otherClass.getMethods());
    }
}
```

## RuleId[id=PackageDirectoryMismatch]
### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing constructor and members
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

//TODO: declare strategy interface
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}


```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

class Policy(private val context: Context) {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

class QuickSort : SortStrategy {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

interface SortStrategy {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

class MergeSort : SortStrategy {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}

fun main() {
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

## RuleId[id=SpringDataRepositoryMethodReturnTypeInspection]
### SpringDataRepositoryMethodReturnTypeInspection
'Notification' domain type or valid projection interface expected here
in `src/main/java/de/tum/in/www1/artemis/repository/GroupNotificationRepository.java`
#### Snippet
```java
public interface GroupNotificationRepository extends JpaRepository<Notification, Long> {

    List<GroupNotification> findAllByCourseId(Long courseId);
}

```

## RuleId[id=MVCPathVariableInspection]
### MVCPathVariableInspection
Path variable 'path' is not consumed
in `src/main/java/de/tum/in/www1/artemis/web/rest/ClientForwardResource.java`
#### Snippet
```java
     */
    @RequestMapping({ "/{path:[^\\.]*}", "/{path:^(?!websocket).*}/**/{path:[^\\.]*}" })
    public String forward() {
        return "forward:/";
    }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
        PostContextFilter postContextFilter = new PostContextFilter();
        postContextFilter.setCourseId(courseId);
        List<Post> coursePosts = this.getCoursePosts(postContextFilter, false, null).stream().collect(Collectors.toCollection(ArrayList::new));

        // sort course posts by calculated similarity scores
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `sortCriterion` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/repository/specs/MessageSpecs.java`
#### Snippet
```java
        return ((root, query, criteriaBuilder) -> {

            Expression<?> sortCriterion = null;

            // sort by creation date
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `userLogins == null` is always `false`
in `src/main/java/de/tum/in/www1/artemis/web/rest/metis/conversation/GroupChatResource.java`
#### Snippet
```java
        var course = courseRepository.findByIdElseThrow(courseId);
        checkMessagingEnabledElseThrow(course);
        if (userLogins == null || userLogins.isEmpty()) {
            throw new BadRequestAlertException("No user logins provided", GROUP_CHAT_ENTITY_NAME, "userLoginsEmpty");
        }
```

### ConstantValue
Condition `userLogins == null` is always `false`
in `src/main/java/de/tum/in/www1/artemis/web/rest/metis/conversation/GroupChatResource.java`
#### Snippet
```java
        var course = courseRepository.findByIdElseThrow(courseId);
        checkMessagingEnabledElseThrow(course);
        if (userLogins == null || userLogins.isEmpty()) {
            throw new BadRequestAlertException("No user logins provided", GROUP_CHAT_ENTITY_NAME, "userLoginsEmpty");
        }
```

### ConstantValue
Condition `participant instanceof User user` is always `true`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ParticipantScoreScheduleService.java`
#### Snippet
```java
                    return teamScore;
                }
                else if (participant instanceof User user) {
                    var studentScore = new StudentScore();
                    studentScore.setUser(user);
```

### ConstantValue
Condition `buildPlan.isBuilding()` is always `true` when reached
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            return BuildStatus.QUEUED;
        }
        else if (buildPlan.isActive() && buildPlan.isBuilding()) {
            return BuildStatus.BUILDING;
        }
```

### ConstantValue
Value `vcsRepositoryUrl` is always 'null'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsInternalUrlService.java`
#### Snippet
```java
        if (vcsRepositoryUrl == null) {
            log.warn("Cannot replace url to internal url {} because the url is null.", internalVcsUrl);
            return vcsRepositoryUrl;
        }

```

### ConstantValue
Condition `searchText.substring(1) != null` is always `true` when reached
in `src/main/java/de/tum/in/www1/artemis/repository/specs/MessageSpecs.java`
#### Snippet
```java
            }
            // search by text or #message
            else if (searchText.startsWith("#") && (searchText.substring(1) != null && !searchText.substring(1).isBlank())) {
                // if searchText starts with a # and is followed by a message id, filter for message with id
                return criteriaBuilder.equal(root.get(Post_.ID), Integer.parseInt(searchText.substring(1)));
```

### ConstantValue
Condition `searchText.substring(1) != null` is always `true` when reached
in `src/main/java/de/tum/in/www1/artemis/repository/specs/PostSpecs.java`
#### Snippet
```java
            }
            // search by text or #post
            else if (searchText.startsWith("#") && (searchText.substring(1) != null && !searchText.substring(1).isBlank())) {
                // if searchText starts with a # and is followed by a post id, filter for post with id
                return criteriaBuilder.equal(root.get(Post_.ID), Integer.parseInt(searchText.substring(1)));
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
        String lastCommitHash = null;
        try {
            Commit commit = versionControlService.get().getLastCommitDetails(requestBody);
            lastCommitHash = commit.getCommitHash();
            log.info("create new programmingSubmission with commitHash: {} for exercise {}", lastCommitHash, exerciseId);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
        if (programmingExerciseParticipation.getBuildPlanId() != null) {
            // If a build is already queued/running for the given participation, we just return. Note: We don't check that the running build belongs to the failed submission.
            ContinuousIntegrationService.BuildStatus buildStatus = continuousIntegrationService.get().getBuildStatus(programmingExerciseParticipation);
            if (buildStatus == ContinuousIntegrationService.BuildStatus.BUILDING || buildStatus == ContinuousIntegrationService.BuildStatus.QUEUED) {
                // We inform the user through the websocket that the submission is still in progress (build is running/queued, result should arrive soon).
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
        String planKey;
        try {
            planKey = continuousIntegrationService.get().getPlanKey(requestBody);
        }
        catch (ContinuousIntegrationException cISException) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
        // Create a participation and a submitted empty submission if they do not exist yet
        StudentParticipation participation = participationService.createParticipationWithEmptySubmissionIfNotExisting(exercise, student.get(), SubmissionType.EXTERNAL);
        Submission submission = participationRepository.findByIdWithLegalSubmissionsElseThrow(participation.getId()).findLatestSubmission().get();
        result.setParticipation(participation);
        result.setSubmission(submission);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
     */
    private void validateStaticCodeAnalysisSettings(ProgrammingExercise programmingExercise) {
        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get()
                .getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());
        programmingExercise.validateStaticCodeAnalysisSettings(programmingLanguageFeature);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findByIdElseThrow(exerciseId);
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, null);
        var programmingLanguageFeature = programmingLanguageFeatureService.get().getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());
        if (!programmingLanguageFeature.plagiarismCheckSupported()) {
            throw new BadRequestAlertException("Artemis does not support plagiarism checks for the programming language " + programmingExercise.getProgrammingLanguage(),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, null);
        ProgrammingLanguage language = programmingExercise.getProgrammingLanguage();
        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get().getProgrammingLanguageFeatures(language);

        if (!programmingLanguageFeature.plagiarismCheckSupported()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExerciseResource.java`
#### Snippet
```java
        if (exercise instanceof ProgrammingExercise programmingExercise) {
            // TODO: instead fetch the policy without programming exercise, should be faster
            SubmissionPolicy policy = programmingExerciseRepository.findWithSubmissionPolicyById(programmingExercise.getId()).get().getSubmissionPolicy();
            programmingExercise.setSubmissionPolicy(policy);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingAssessmentResource.java`
#### Snippet
```java
        newManualResult.setId(existingManualResult.getId());
        // load assessor
        existingManualResult = resultRepository.findWithEagerSubmissionAndFeedbackAndAssessorById(existingManualResult.getId()).get();

        // make sure that the participation and submission cannot be manipulated on the client side
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
        if (programmingExerciseResetOptionsDTO.recreateBuildPlans()) {
            authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, user);
            continuousIntegrationService.get().recreateBuildPlansForExercise(programmingExercise);
        }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    public ResponseEntity<BuildLogStatisticsDTO> getBuildLogStatistics(@PathVariable Long exerciseId) {
        log.debug("REST request to get build log statistics for ProgrammingExercise with id : {}", exerciseId);
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(exerciseId).get();
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, null);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
     */
    private void checkProgrammingExerciseForError(ProgrammingExercise exercise) {
        if (!continuousIntegrationService.get().checkIfBuildPlanExists(exercise.getProjectKey(), exercise.getTemplateBuildPlanId())) {
            throw new BadRequestAlertException("The Template Build Plan ID seems to be invalid.", "Exercise", ProgrammingExerciseResourceErrorKeys.INVALID_TEMPLATE_BUILD_PLAN_ID);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
            throw new BadRequestAlertException("The Template Build Plan ID seems to be invalid.", "Exercise", ProgrammingExerciseResourceErrorKeys.INVALID_TEMPLATE_BUILD_PLAN_ID);
        }
        if (exercise.getVcsTemplateRepositoryUrl() == null || !versionControlService.get().repositoryUrlIsValid(exercise.getVcsTemplateRepositoryUrl())) {
            throw new BadRequestAlertException("The Template Repository URL seems to be invalid.", "Exercise",
                    ProgrammingExerciseResourceErrorKeys.INVALID_TEMPLATE_REPOSITORY_URL);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
        checkAccessPermissionOwner(participation, user);

        return continuousIntegrationService.get().retrieveLatestArtifact(participation);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
                else if (participation.getSubmissions() != null && !participation.getSubmissions().isEmpty()) {
                    participation.setSubmissions(Set
                            .of(participation.getSubmissions().stream().filter(submission -> submission.getType() != SubmissionType.ILLEGAL).max(Comparator.naturalOrder()).get()));
                }
            });
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
        participation = participationService.resumeProgrammingExercise(participation);
        // Note: in this case we might need an empty commit to make sure the build plan works correctly for subsequent student commits
        continuousIntegrationService.get().performEmptySetupCommit(participation);
        addLatestResultToParticipation(participation);
        participation.getExercise().filterSensitiveInformation();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/TestRepositoryResource.java`
#### Snippet
```java
    String getOrRetrieveBranchOfDomainObject(Long exerciseId) {
        ProgrammingExercise exercise = programmingExerciseRepository.findByIdElseThrow(exerciseId);
        return versionControlService.get().getOrRetrieveBranchOfExercise(exercise);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        }
        else if (participation instanceof ProgrammingExerciseStudentParticipation studentParticipation) {
            return versionControlService.get().getOrRetrieveBranchOfStudentParticipation(studentParticipation);
        }
        else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        else {
            ProgrammingExercise programmingExercise = programmingExerciseRepository.getProgrammingExerciseFromParticipation(programmingParticipation);
            return versionControlService.get().getOrRetrieveBranchOfExercise(programmingExercise);
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        }
        else {
            String branch = versionControlService.get().getOrRetrieveBranchOfParticipation(programmingParticipation);
            return gitService.getOrCheckoutRepository(repositoryUrl, pullOnGet, branch);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipantScoreService.java`
#### Snippet
```java
        Set<Exercise> teamExercises = exercises.stream().filter(Exercise::isTeamMode).collect(Collectors.toSet());

        Course course = exercises.stream().findAny().get().getCourseViaExerciseGroupOrCourseMember();

        // For every student we want to calculate the score
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
        List<ConsistencyErrorDTO> result = new ArrayList<>();

        if (!versionControlService.get().checkIfProjectExists(programmingExercise.getProjectKey(), programmingExercise.getProjectName())) {
            result.add(new ConsistencyErrorDTO(programmingExercise, ConsistencyErrorDTO.ErrorType.VCS_PROJECT_MISSING));
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
        List<ConsistencyErrorDTO> result = new ArrayList<>();

        if (!continuousIntegrationService.get().checkIfBuildPlanExists(programmingExercise.getProjectKey(), programmingExercise.getTemplateBuildPlanId())) {
            result.add(new ConsistencyErrorDTO(programmingExercise, ConsistencyErrorDTO.ErrorType.TEMPLATE_BUILD_PLAN_MISSING));
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/TutorParticipationService.java`
#### Snippet
```java

            // Return the highest priority error (the closest instructor feedback match)
            return matchingInstructorFeedback.stream().map(feedback -> tutorFeedbackMatchesInstructorFeedback(tutorFeedback, feedback).get()).max(Comparator.naturalOrder());
        }
        else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
        }
        else {
            return participation.isOwnedBy(SecurityUtils.getCurrentUserLogin().get());
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java

    public TextSubmission findOneWithEagerResultFeedbackAndTextBlocks(Long submissionId) {
        return textSubmissionRepository.findWithEagerResultsAndFeedbackAndTextBlocksById(submissionId).get();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private ProgrammingExerciseStudentParticipation configureRepositoryWebHook(ProgrammingExerciseStudentParticipation participation) {
        if (!participation.getInitializationState().hasCompletedState(InitializationState.INITIALIZED)) {
            versionControlService.get().addWebHookForParticipation(participation);
        }
        return participation;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            // do not allow the student to access the repository if this is an exam exercise that has not started yet
            boolean allowAccess = !exercise.isExamExercise() || ZonedDateTime.now().isAfter(exercise.getParticipationStartDate());
            versionControlService.get().configureRepository(exercise, participation, allowAccess);
            participation.setInitializationState(InitializationState.REPO_CONFIGURED);
            return programmingExerciseStudentParticipationRepository.saveAndFlush(participation);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            // create a new participation only if no participation can be found
            if (exercise instanceof ProgrammingExercise) {
                participation = new ProgrammingExerciseStudentParticipation(versionControlService.get().getDefaultBranchOfArtemis());
            }
            else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
                // restrict access for the student
                try {
                    versionControlService.get().setRepositoryPermissionsToReadOnly(programmingParticipation.getVcsRepositoryUrl(), programmingExercise.getProjectKey(),
                            programmingParticipation.getStudents());
                }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            final var targetPlanName = participation.addPracticePrefixIfTestRun(username.toUpperCase());
            // the next action includes recovery, which means if the build plan has already been copied, we simply retrieve the build plan id and do not copy it again
            final var buildPlanId = continuousIntegrationService.get().copyBuildPlan(projectKey, planName, projectKey, buildProjectName, targetPlanName, true);
            participation.setBuildPlanId(buildPlanId);
            participation.setInitializationState(InitializationState.BUILD_PLAN_COPIED);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // create a new participation only if no participation can be found
        if (exercise instanceof ProgrammingExercise) {
            participation = new ProgrammingExerciseStudentParticipation(versionControlService.get().getDefaultBranchOfArtemis());
        }
        else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // ignore participations without repository URL
        if (participation.getRepositoryUrl() != null) {
            versionControlService.get().deleteRepository(participation.getVcsRepositoryUrl());
            gitService.deleteLocalRepository(participation.getVcsRepositoryUrl());
            participation.setRepositoryUrl(null);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            // NOTE: we have to get the repository slug of the template participation here, because not all exercises (in particular old ones) follow the naming conventions
            final var templateRepoName = urlService.getRepositorySlugFromRepositoryUrl(sourceURL);
            String templateBranch = versionControlService.get().getOrRetrieveBranchOfExercise(programmingExercise);
            // the next action includes recovery, which means if the repository has already been copied, we simply retrieve the repository url and do not copy it again
            var newRepoUrl = versionControlService.get().copyRepository(projectKey, templateRepoName, templateBranch, projectKey, repoName);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (optionalStudentParticipation.isEmpty()) {
            // create a new participation only if no participation can be found
            participation = new ProgrammingExerciseStudentParticipation(versionControlService.get().getDefaultBranchOfArtemis());
            participation.setInitializationState(InitializationState.UNINITIALIZED);
            participation.setExercise(exercise);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (!participation.getInitializationState().hasCompletedState(InitializationState.BUILD_PLAN_CONFIGURED)) {
            try {
                String branch = versionControlService.get().getOrRetrieveBranchOfStudentParticipation(participation);
                continuousIntegrationService.get().configureBuildPlan(participation, branch);
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            try {
                String branch = versionControlService.get().getOrRetrieveBranchOfStudentParticipation(participation);
                continuousIntegrationService.get().configureBuildPlan(participation, branch);
            }
            catch (ContinuousIntegrationException ex) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // Step 2c) we might need to perform an empty commit (as a workaround, depending on the CI system) here, because it should not trigger a new programming submission
        // (when the web hook was already initialized, see below)
        continuousIntegrationService.get().performEmptySetupCommit(participation);
        // Note: we configure the repository webhook last, so that the potential empty commit does not trigger a new programming submission (see empty-commit-necessary)
        // Step 3) configure the web hook of the student repository
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            if (deleteBuildPlan && buildPlanId != null) {
                final var projectKey = programmingExerciseParticipation.getProgrammingExercise().getProjectKey();
                continuousIntegrationService.get().deleteBuildPlan(projectKey, buildPlanId);
            }
            if (deleteRepository && programmingExerciseParticipation.getRepositoryUrl() != null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            if (deleteRepository && programmingExerciseParticipation.getRepositoryUrl() != null) {
                try {
                    versionControlService.get().deleteRepository(repositoryUrl);
                }
                catch (Exception ex) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (participation.getBuildPlanId() != null) {
            final var projectKey = ((ProgrammingExercise) participation.getExercise()).getProjectKey();
            continuousIntegrationService.get().deleteBuildPlan(projectKey, participation.getBuildPlanId());

            // If a graded participation gets cleaned up after the deadline set the state back to finished. Otherwise, the participation is initialized
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
        List<TextFeedbackConflictRequestDTO> textFeedbackConflictRequestDTOS = feedbackList.stream().flatMap(feedback -> {
            Optional<TextBlock> textBlock = textBlockRepository
                    .findById(textBlocks.stream().filter(block -> block.getId().equals(feedback.getReference())).findFirst().get().getId());
            if (textBlock.isPresent() && textBlock.get().getCluster() != null && feedback.getDetailText() != null) {
                return Stream.of(new TextFeedbackConflictRequestDTO(textBlock.get().getId(), textBlock.get().getText(), textBlock.get().getCluster().getId(), feedback.getId(),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
        newUser.setInternal(isInternal);

        final var authority = authorityRepository.findById(STUDENT.getAuthority()).get();
        // needs to be mutable --> new HashSet<>(Set.of(...))
        final var authorities = new HashSet<>(Set.of(authority));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
    private Map<Long, Double> calculateAchievedPointsForExercises(List<StudentParticipation> participationsOfStudent, Course course, PlagiarismMapping plagiarismMapping) {
        return participationsOfStudent.stream().collect(Collectors.toMap(participation -> participation.getExercise().getId(), participation -> {
            PlagiarismCase plagiarismCase = plagiarismMapping.getPlagiarismCase(participation.getStudent().get().getId(), participation.getExercise().getId());
            double plagiarismPointDeductionPercentage = plagiarismCase != null ? plagiarismCase.getVerdictPointDeduction() : 0.0;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
            // Adding student results information to DTO
            List<StudentParticipation> participationsOfStudent = studentParticipations.stream()
                    .filter(studentParticipation -> studentParticipation.getStudent().get().getId().equals(studentExam.getUser().getId())).toList();
            var studentResult = calculateStudentResultWithGrade(studentExam, participationsOfStudent, exam, gradingScale, true, submittedAnswerCounts, plagiarismMapping,
                    examBonusCalculator);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
        Set<ExerciseGroup> mandatoryExerciseGroups = exam.getExerciseGroups().stream().filter(ExerciseGroup::getIsMandatory).collect(Collectors.toSet());
        for (ExerciseGroup exerciseGroup : mandatoryExerciseGroups) {
            Exercise groupRepresentativeExercise = exerciseGroup.getExercises().stream().findAny().get();
            if (groupRepresentativeExercise.getIncludedInOverallScore().equals(IncludedInOverallScore.INCLUDED_COMPLETELY)) {
                pointsReachableByMandatoryExercises += groupRepresentativeExercise.getMaxPoints();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
        Double pointsReachable = 0.0;
        for (ExerciseGroup exerciseGroup : exam.getExerciseGroups()) {
            Exercise groupRepresentativeExercise = exerciseGroup.getExercises().stream().findAny().get();
            if (groupRepresentativeExercise.getIncludedInOverallScore().equals(IncludedInOverallScore.INCLUDED_COMPLETELY)) {
                pointsReachable += groupRepresentativeExercise.getMaxPoints();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/auth/ChannelAuthorizationService.java`
#### Snippet
```java
        var userToCheck = getUserIfNecessary(user);
        var channel = channelRepository.findById(channelId);
        return isChannelModerator(channelId, userToCheck.getId()) || authorizationCheckService.isAtLeastInstructorInCourse(channel.get().getCourse(), userToCheck);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/auth/ChannelAuthorizationService.java`
#### Snippet
```java
        var isJoinRequest = userLoginsToCheck.size() == 1 && userLoginsToCheck.get(0).equals(userToCheck.getLogin());
        var channelFromDb = channelRepository.findById(channel.getId());
        var isAtLeastInstructor = authorizationCheckService.isAtLeastInstructorInCourse(channelFromDb.get().getCourse(), userToCheck);
        var isChannelModerator = isChannelModerator(channel.getId(), userToCheck.getId());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/athene/AtheneService.java`
#### Snippet
```java

        // Get knowledge of exercise
        TextAssessmentKnowledge textAssessmentKnowledge = textExerciseRepository.findById(exerciseId).get().getKnowledge();
        // Map textBlocks to submissions
        List<TextBlock> textBlocks = new ArrayList<>();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            String newBranch, List<String> triggeredByRepositories) throws BambooException {
        final var vcsRepoName = urlService.getRepositorySlugFromRepositoryUrlString(newRepoUrl);
        continuousIntegrationUpdateService.get().updatePlanRepository(buildProjectKey, buildPlanKey, ciRepoName, repoProjectKey, vcsRepoName, newBranch, triggeredByRepositories);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
        List<VcsRepository<?, ?>> planRepositories = new ArrayList<>();
        planRepositories.add(
                createBuildPlanRepository(ASSIGNMENT_REPO_NAME, projectKey, repositoryName, versionControlService.get().getDefaultBranchOfRepository(projectKey, repositoryName)));
        planRepositories.add(createBuildPlanRepository(TEST_REPO_NAME, projectKey, vcsTestRepositorySlug,
                versionControlService.get().getDefaultBranchOfRepository(projectKey, vcsTestRepositorySlug)));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java
    public void configureBuildPlanForParticipation(ProgrammingExerciseParticipation participation) {
        // Refetch the programming exercise with the template participation and assign it to programmingExerciseParticipation to make sure it is initialized (and not a proxy)
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(participation.getProgrammingExercise().getId()).get();
        participation.setProgrammingExercise(programmingExercise);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    private URI getSshUri(VcsRepositoryUrl vcsRepositoryUrl) throws URISyntaxException {
        URI templateUri = new URI(sshUrlTemplate.get());
        // Example Bitbucket: ssh://git@bitbucket.ase.in.tum.de:7999/se2021w07h02/se2021w07h02-ga27yox.git
        // Example Gitlab: ssh://git@gitlab.ase.in.tum.de:2222/se2021w07h02/se2021w07h02-ga27yox.git
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                return lookup(hostName, port, userName);
            }
        }).setSshDirectory(new java.io.File(gitSshPrivateKeyPath.get())).setHomeDirectory(new java.io.File(System.getProperty("user.home"))).build(new JGitKeyCache());

        sshCallback = transport -> {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
    public void lockStudentRepository(ProgrammingExercise programmingExercise, ProgrammingExerciseStudentParticipation participation) {
        if (participation.getInitializationState().hasCompletedState(InitializationState.REPO_CONFIGURED)) {
            versionControlService.get().setRepositoryPermissionsToReadOnly(participation.getVcsRepositoryUrl(), programmingExercise.getProjectKey(), participation.getStudents());
        }
        else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        TemplateProgrammingExerciseParticipation templateParticipation = new TemplateProgrammingExerciseParticipation();
        templateParticipation.setBuildPlanId(newExercise.generateBuildPlanId(BuildPlanType.TEMPLATE));
        templateParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(newExercise.getProjectKey(), exerciseRepoName).toString());
        templateParticipation.setProgrammingExercise(newExercise);
        newExercise.setTemplateParticipation(templateParticipation);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        newExercise.setSolutionParticipation(solutionParticipation);
        solutionParticipation.setBuildPlanId(newExercise.generateBuildPlanId(BuildPlanType.SOLUTION));
        solutionParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(newExercise.getProjectKey(), solutionRepoName).toString());
        solutionParticipation.setProgrammingExercise(newExercise);
        solutionParticipationRepository.save(solutionParticipation);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        if (participation.getInitializationState().hasCompletedState(InitializationState.REPO_CONFIGURED)) {
            // TODO: this calls protect branches which might not be necessary if the branches have already been protected during "start exercise" which is typically the case
            versionControlService.get().configureRepository(programmingExercise, participation, true);
        }
        else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
                    // Note: in this case we do not need an empty commit: when we trigger the build manually (below), subsequent commits will work correctly
                }
                continuousIntegrationTriggerService.get().triggerBuild(participation);
                // TODO: this is a workaround, in the future we should use the participation to notify the client and avoid using the submission
                programmingMessagingService.notifyUserAboutSubmission(submission.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
                // Note: in this case we do not need an empty commit: when we trigger the build manually (below), subsequent commits will work correctly
            }
            continuousIntegrationTriggerService.get().triggerBuild(programmingExerciseParticipation);
            programmingMessagingService.notifyUserAboutSubmission(submission);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
        ProgrammingSubmission submission = createSubmissionWithCommitHashAndSubmissionType(participation, commitHash, submissionType);
        try {
            continuousIntegrationTriggerService.get().triggerBuild((ProgrammingExerciseParticipation) submission.getParticipation());
            programmingMessagingService.notifyUserAboutSubmission(submission);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
    public void setTestCasesChangedAndTriggerTestCaseUpdate(long programmingExerciseId) throws EntityNotFoundException {
        setTestCasesChanged(programmingExerciseId, true);
        var programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(programmingExerciseId).get();

        try {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java

        try {
            continuousIntegrationTriggerService.get().triggerBuild(programmingExercise.getSolutionParticipation());
            continuousIntegrationTriggerService.get().triggerBuild(programmingExercise.getTemplateParticipation());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java
        // Set values we don't want to copy to null
        setupExerciseForImport(newExercise);
        newExercise.setBranch(versionControlService.get().getDefaultBranchOfArtemis());

        // Note: same order as when creating an exercise
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java
    private void setupTestRepository(ProgrammingExercise newExercise) {
        final var testRepoName = newExercise.generateRepositoryName(RepositoryType.TESTS);
        newExercise.setTestRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(newExercise.getProjectKey(), testRepoName).toString());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            // we can find this out by looking into the requestBody, e.g. changes=[{ref={id=refs/heads/BitbucketStationSupplies, displayId=BitbucketStationSupplies, type=BRANCH}
            // if the branch is different from main, throw an IllegalArgumentException, but make sure the REST call still returns 200 to Bitbucket
            commit = versionControlService.get().getLastCommitDetails(requestBody);
            log.info("NotifyPush invoked due to the commit {} by {} with {} in branch {}", commit.getCommitHash(), commit.getAuthorName(), commit.getAuthorEmail(),
                    commit.getBranch());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            // Note: in this case we do not need an empty commit: when we trigger the build manually (below), subsequent commits will work correctly
            try {
                continuousIntegrationTriggerService.get().triggerBuild(programmingExerciseParticipation);
            }
            catch (ContinuousIntegrationException ex) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // First, create a new project for our imported exercise
        versionControlService.get().createProjectForExercise(newExercise);
        // Copy all repositories
        String templateRepoName = urlService.getRepositorySlugFromRepositoryUrlString(templateExercise.getTemplateRepositoryUrl());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
            AuxiliaryRepository newAuxiliaryRepository = newRepositories.get(i);
            AuxiliaryRepository oldAuxiliaryRepository = oldRepositories.get(i);
            String auxiliaryBranch = versionControlService.get().getOrRetrieveBranchOfExercise(newExercise);
            continuousIntegrationService.get().updatePlanRepository(targetExerciseProjectKey, participation.getBuildPlanId(), newAuxiliaryRepository.getName(),
                    targetExerciseProjectKey, newAuxiliaryRepository.getRepositoryUrl(), oldAuxiliaryRepository.getRepositoryUrl(), auxiliaryBranch, List.of());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
            AuxiliaryRepository oldAuxiliaryRepository = oldRepositories.get(i);
            String auxiliaryBranch = versionControlService.get().getOrRetrieveBranchOfExercise(newExercise);
            continuousIntegrationService.get().updatePlanRepository(targetExerciseProjectKey, participation.getBuildPlanId(), newAuxiliaryRepository.getName(),
                    targetExerciseProjectKey, newAuxiliaryRepository.getRepositoryUrl(), oldAuxiliaryRepository.getRepositoryUrl(), auxiliaryBranch, List.of());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
     */
    private void adjustProjectName(Map<String, String> replacements, String projectKey, String repositoryName, User user) throws GitAPIException, IOException {
        final var repositoryUrl = versionControlService.get().getCloneRepositoryUrl(projectKey, repositoryName);
        Repository repository = gitService.getOrCheckoutRepository(repositoryUrl, true);
        fileService.replaceVariablesInFileRecursive(repository.getLocalPath().toAbsolutePath().toString(), replacements, List.of("gradle-wrapper.jar"));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
            SolutionProgrammingExerciseParticipation solutionParticipation, String targetExerciseProjectKey, String oldExerciseRepoUrl, String oldSolutionRepoUrl,
            String oldTestRepoUrl, List<AuxiliaryRepository> oldBuildPlanAuxiliaryRepositories) {
        String newExerciseBranch = versionControlService.get().getOrRetrieveBranchOfExercise(newExercise);

        // update 2 repositories for the BASE build plan --> adapt the triggers so that only the assignment repo (and not the tests' repo) will trigger the BASE build plan
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // update 2 repositories for the BASE build plan --> adapt the triggers so that only the assignment repo (and not the tests' repo) will trigger the BASE build plan
        continuousIntegrationService.get().updatePlanRepository(targetExerciseProjectKey, templateParticipation.getBuildPlanId(), ASSIGNMENT_REPO_NAME, targetExerciseProjectKey,
                newExercise.getTemplateRepositoryUrl(), oldExerciseRepoUrl, newExerciseBranch, List.of(ASSIGNMENT_REPO_NAME));

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        try {
            continuousIntegrationTriggerService.get().triggerBuild(templateParticipation);
            continuousIntegrationTriggerService.get().triggerBuild(solutionParticipation);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
        final var targetKey = newExercise.getProjectKey();
        final var targetName = newExercise.getCourseViaExerciseGroupOrCourseMember().getShortName().toUpperCase() + " " + newExercise.getTitle();
        continuousIntegrationService.get().createProjectForExercise(newExercise);
        continuousIntegrationService.get().copyBuildPlan(templateKey, templatePlanName, targetKey, targetName, templatePlanName, false);
        continuousIntegrationService.get().copyBuildPlan(templateKey, solutionPlanName, targetKey, targetName, solutionPlanName, true);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            RepositoryExportOptionsDTO repositoryExportOptions) {
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationTeamAssignmentConfigCategoriesById(programmingExerciseId)
                .get();

        Path outputDir = fileService.getUniquePath(repoDownloadClonePath);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

        templateParticipation.setBuildPlanId(templatePlanId); // Set build plan id to newly created BaseBuild plan
        templateParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(projectKey, exerciseRepoName).toString());
        solutionParticipation.setBuildPlanId(solutionPlanId);
        solutionParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(projectKey, solutionRepoName).toString());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        var solutionRepoUrl = programmingExercise.getVcsSolutionRepositoryUrl();

        continuousIntegrationService.get().createProjectForExercise(programmingExercise);
        // template build plan
        continuousIntegrationService.get().createBuildPlanForExercise(programmingExercise, TEMPLATE.getName(), exerciseRepoUrl, testsRepoUrl, solutionRepoUrl);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        submissionPolicyService.validateSubmissionPolicyCreation(programmingExercise);

        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get()
                .getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        log.debug("Project Key: {}", projectKey);
        log.debug("Project Name: {}", projectName);
        boolean projectExists = versionControlService.get().checkIfProjectExists(projectKey, projectName);
        if (projectExists) {
            return true;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            return true;
        }
        String errorMessageCis = continuousIntegrationService.get().checkIfProjectExists(projectKey, projectName);
        return errorMessageCis != null;
        // means the project does not exist in version control server and does not exist in continuous integration server
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        String projectKey = programmingExercise.getProjectKey();
        String projectName = programmingExercise.getProjectName();
        boolean projectExists = versionControlService.get().checkIfProjectExists(projectKey, projectName);
        if (projectExists) {
            var errorMessageVcs = "Project already exists on the Version Control Server: " + projectName + ". Please choose a different title and short name!";
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            throw new BadRequestAlertException(errorMessageVcs, "ProgrammingExercise", "vcsProjectExists");
        }
        String errorMessageCis = continuousIntegrationService.get().checkIfProjectExists(projectKey, projectName);
        if (errorMessageCis != null) {
            throw new BadRequestAlertException(errorMessageCis, "ProgrammingExercise", "ciProjectExists");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        }

        continuousIntegrationService.get().giveProjectPermissions(exercise.getProjectKey(), adminGroups,
                List.of(CIPermission.CREATE, CIPermission.READ, CIPermission.CREATEREPOSITORY, CIPermission.ADMIN));
        if (teachingAssistantGroup != null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
    private void setURLsForAuxiliaryRepositoriesOfExercise(ProgrammingExercise programmingExercise) {
        programmingExercise.getAuxiliaryRepositories().forEach(repo -> repo.setRepositoryUrl(
                versionControlService.get().getCloneRepositoryUrl(programmingExercise.getProjectKey(), programmingExercise.generateRepositoryName(repo.getName())).toString()));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
     */
    public void validateStaticCodeAnalysisSettings(ProgrammingExercise programmingExercise) {
        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get()
                .getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());
        programmingExercise.validateStaticCodeAnalysisSettings(programmingLanguageFeature);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        final var templateBuildPlanId = programmingExercise.getTemplateBuildPlanId();
        if (templateBuildPlanId != null) {
            continuousIntegrationService.get().deleteBuildPlan(programmingExercise.getProjectKey(), templateBuildPlanId);
        }
        final var solutionBuildPlanId = programmingExercise.getSolutionBuildPlanId();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        final var solutionBuildPlanId = programmingExercise.getSolutionBuildPlanId();
        if (solutionBuildPlanId != null) {
            continuousIntegrationService.get().deleteBuildPlan(programmingExercise.getProjectKey(), solutionBuildPlanId);
        }
        continuousIntegrationService.get().deleteProject(programmingExercise.getProjectKey());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            continuousIntegrationService.get().deleteBuildPlan(programmingExercise.getProjectKey(), solutionBuildPlanId);
        }
        continuousIntegrationService.get().deleteProject(programmingExercise.getProjectKey());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        final User exerciseCreator = userRepository.getUser();

        programmingExercise.setBranch(versionControlService.get().getDefaultBranchOfArtemis());
        programmingExerciseRepositoryService.createRepositoriesForNewExercise(programmingExercise);
        initParticipations(programmingExercise);
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/CoverageReportResource.java`
#### Snippet
```java

        var optionalReportWithFileReports = testwiseCoverageService.getFullCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(exercise);
        if (optionalReportWithFileReports.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/CoverageReportResource.java`
#### Snippet
```java

        var optionalReportWithoutFileReports = testwiseCoverageService.getCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(exercise);
        if (optionalReportWithoutFileReports.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/service/hestia/TestwiseCoverageService.java`
#### Snippet
```java
    public Optional<CoverageReport> getFullCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(ProgrammingExercise programmingExercise) {
        var optionalLazyReport = getCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(programmingExercise);
        if (optionalLazyReport.isEmpty()) {
            return Optional.empty();
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java

            final var folderJob = jenkinsServer.getFolderJob(job);
            if (!folderJob.isPresent()) {
                return null;
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
            tutorialGroupScheduleRepository.delete(oldSchedule.get());
        }
        else if (newSchedule.isPresent()) { // new schedule present but not old schedule -> create new schedule
            saveScheduleAndGenerateScheduledSessions(tutorialGroupsConfiguration, tutorialGroup, newSchedule.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/repository/ExamRepository.java`
#### Snippet
```java
    default Set<Exercise> findAllExercisesByExamId(long examId) {
        var exam = findWithExerciseGroupsAndExercisesById(examId);
        if (exam.isEmpty()) {
            return Set.of();
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'de.tum.in.www1.artemis.domain.plagiarism.PlagiarismSubmission\>' to 'de.tum.in.www1.artemis.domain.plagiarism.PlagiarismSubmission'
in `src/main/java/de/tum/in/www1/artemis/domain/plagiarism/PlagiarismComparison.java`
#### Snippet
```java
     */
    public void setSubmissionB(PlagiarismSubmission<?> submissionB) {
        this.submissionB = (PlagiarismSubmission<E>) submissionB;
        if (this.submissionB != null) {
            // Important: make sure to maintain the custom bidirectional association
```

### UNCHECKED_WARNING
Unchecked cast: 'de.tum.in.www1.artemis.domain.plagiarism.PlagiarismSubmission\>' to 'de.tum.in.www1.artemis.domain.plagiarism.PlagiarismSubmission'
in `src/main/java/de/tum/in/www1/artemis/domain/plagiarism/PlagiarismComparison.java`
#### Snippet
```java
     */
    public void setSubmissionA(PlagiarismSubmission<?> submissionA) {
        this.submissionA = (PlagiarismSubmission<E>) submissionA;
        if (this.submissionA != null) {
            // Important: make sure to maintain the custom bidirectional association
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Optional' to 'java.util.Optional'
in `src/main/java/de/tum/in/www1/artemis/domain/participation/Participation.java`
#### Snippet
```java
        }

        return (Optional<T>) submissions.stream().max(Comparator.naturalOrder());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'de.tum.in.www1.artemis.domain.Submission' to 'T'
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
            var participations = this.studentParticipationRepository.findAllByParticipationExerciseIdAndResultAssessorAndCorrectionRoundIgnoreTestRuns(exerciseId, tutor);
            submissions = participations.stream().map(StudentParticipation::findLatestLegalOrIllegalSubmission).filter(Optional::isPresent).map(Optional::get)
                    .map(submission -> (T) submission)
                    .filter(submission -> submission.getResults().size() - 1 >= correctionRound && submission.getResults().get(correctionRound) != null)
                    .collect(Collectors.toCollection(ArrayList::new));
```

### UNCHECKED_WARNING
Unchecked cast: 'de.tum.in.www1.artemis.domain.Submission' to 'T'
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
        participations.stream().peek(participation -> participation.getExercise().setStudentParticipations(null)).map(StudentParticipation::findLatestSubmission)
                // filter out non submitted submissions if the flag is set to true
                .filter(submission -> submission.isPresent() && (!submittedOnly || submission.get().isSubmitted())).forEach(submission -> submissions.add((T) submission.get()));
        return submissions;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/GroupNotificationService.java`
#### Snippet
```java
                        (Course) typeSpecificInformation);
                // Post Reply Types
                case NEW_REPLY_FOR_EXERCISE_POST, NEW_REPLY_FOR_LECTURE_POST, NEW_REPLY_FOR_COURSE_POST -> createNotification((Post) ((List<Posting>) notificationSubject).get(0),
                        (AnswerPost) ((List<Posting>) notificationSubject).get(1), author, group, notificationType, (Course) typeSpecificInformation);
                // General Types
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/GroupNotificationService.java`
#### Snippet
```java
                // Post Reply Types
                case NEW_REPLY_FOR_EXERCISE_POST, NEW_REPLY_FOR_LECTURE_POST, NEW_REPLY_FOR_COURSE_POST -> createNotification((Post) ((List<Posting>) notificationSubject).get(0),
                        (AnswerPost) ((List<Posting>) notificationSubject).get(1), author, group, notificationType, (Course) typeSpecificInformation);
                // General Types
                case ATTACHMENT_CHANGE -> createNotification((Attachment) notificationSubject, author, group, notificationType, (String) typeSpecificInformation);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/GroupNotificationService.java`
#### Snippet
```java
                // Archive Types
                case COURSE_ARCHIVE_STARTED, COURSE_ARCHIVE_FINISHED, COURSE_ARCHIVE_FAILED -> createNotification((Course) notificationSubject, author, group, notificationType,
                        (List<String>) typeSpecificInformation);
                case EXAM_ARCHIVE_STARTED, EXAM_ARCHIVE_FINISHED, EXAM_ARCHIVE_FAILED -> createNotification((Exam) notificationSubject, author, group, notificationType,
                        (List<String>) typeSpecificInformation);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/GroupNotificationService.java`
#### Snippet
```java
                        (List<String>) typeSpecificInformation);
                case EXAM_ARCHIVE_STARTED, EXAM_ARCHIVE_FINISHED, EXAM_ARCHIVE_FAILED -> createNotification((Exam) notificationSubject, author, group, notificationType,
                        (List<String>) typeSpecificInformation);
                // Critical Types
                case DUPLICATE_TEST_CASE, ILLEGAL_SUBMISSION -> createNotification((Exercise) notificationSubject, author, group, notificationType,
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/SingleUserNotificationService.java`
#### Snippet
```java
        var singleUserNotification = switch (notificationType) {
            // Post Types
            case NEW_REPLY_FOR_EXERCISE_POST, NEW_REPLY_FOR_LECTURE_POST, NEW_REPLY_FOR_COURSE_POST -> createNotification((Post) ((List<Posting>) notificationSubject).get(0),
                    (AnswerPost) ((List<Posting>) notificationSubject).get(1), notificationType, (Course) typeSpecificInformation);
            // Exercise related
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/SingleUserNotificationService.java`
#### Snippet
```java
            // Post Types
            case NEW_REPLY_FOR_EXERCISE_POST, NEW_REPLY_FOR_LECTURE_POST, NEW_REPLY_FOR_COURSE_POST -> createNotification((Post) ((List<Posting>) notificationSubject).get(0),
                    (AnswerPost) ((List<Posting>) notificationSubject).get(1), notificationType, (Course) typeSpecificInformation);
            // Exercise related
            case EXERCISE_SUBMISSION_ASSESSED, FILE_SUBMISSION_SUCCESSFUL -> createNotification((Exercise) notificationSubject, notificationType, (User) typeSpecificInformation);
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `createdDate` is inaccessible from here
in `src/main/java/de/tum/in/www1/artemis/domain/ComplaintResponse.java`
#### Snippet
```java
 * A ComplaintResponse.
 *
 * The createdDate in {@link AbstractAuditingEntity#createdDate} has a special meaning in this entity as it is used to calculate the lock status. See also
 * {@link ComplaintResponse#isCurrentlyLocked()}
 */
```

### JavadocReference
Symbol `submissionLimit` is inaccessible from here
in `src/main/java/de/tum/in/www1/artemis/domain/submissionpolicy/LockRepositoryPolicy.java`
#### Snippet
```java
 * Configures a Lock Repository Policy.<br>
 * The Lock Repository Policy locks a participation repository after the participant submits
 * {@link SubmissionPolicy#submissionLimit} amount of times.<br>
 * The number of submissions in one participation is determined based on multiple factors.
 * More information on submission counts can be found at {@link SubmissionPolicyService#getParticipationSubmissionCount(Participation)}.
```

### JavadocReference
Symbol `getParticipationSubmissionCount(Participation)` is inaccessible from here
in `src/main/java/de/tum/in/www1/artemis/domain/submissionpolicy/LockRepositoryPolicy.java`
#### Snippet
```java
 * {@link SubmissionPolicy#submissionLimit} amount of times.<br>
 * The number of submissions in one participation is determined based on multiple factors.
 * More information on submission counts can be found at {@link SubmissionPolicyService#getParticipationSubmissionCount(Participation)}.
 */
@Entity
```

### JavadocReference
Symbol `submissionLimit` is inaccessible from here
in `src/main/java/de/tum/in/www1/artemis/domain/submissionpolicy/SubmissionPenaltyPolicy.java`
#### Snippet
```java
 * Configures a Submission Penalty Policy.<br>
 * The Submission Penalty Policy imposes a permanent {@link SubmissionPenaltyPolicy#exceedingPenalty} on the achievable
 * participation score for every submission exceeding the {@link SubmissionPolicy#submissionLimit}. The {@link SubmissionPenaltyPolicy#exceedingPenalty}
 * increases with the submissions exceeding the limit in a linear way.<br>
 * The number of submissions in one participation is determined based on multiple factors.
```

### JavadocReference
Symbol `getParticipationSubmissionCount(Participation)` is inaccessible from here
in `src/main/java/de/tum/in/www1/artemis/domain/submissionpolicy/SubmissionPenaltyPolicy.java`
#### Snippet
```java
 * increases with the submissions exceeding the limit in a linear way.<br>
 * The number of submissions in one participation is determined based on multiple factors.
 * More information on submission counts can be found at {@link SubmissionPolicyService#getParticipationSubmissionCount(Participation)}.
 */
@Entity
```

### JavadocReference
Symbol `setAverageAttendance` is inaccessible from here
in `src/main/java/de/tum/in/www1/artemis/domain/tutorialgroups/TutorialGroup.java`
#### Snippet
```java
     * This field represents the average attendance of this tutorial group
     * <p>
     * For more information on how this is calculated check out {@link de.tum.in.www1.artemis.service.tutorialgroups.TutorialGroupService#setAverageAttendance}
     */
    @Transient
```

### JavadocReference
Cannot resolve symbol `copyTextExerciseBasis(TextExercise)`
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
     * Imports a text exercise creating a new entity, copying all basic values and saving it in the database.
     * All basic include everything except Student-, Tutor participations, and student questions. <br>
     * This method calls {@link #copyTextExerciseBasis(TextExercise)} to set up the basis of the exercise
     * {@link #copyExampleSubmission(Exercise, Exercise, Map)} for a hard copy of the example submissions.
     *
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/AttachmentResource.java`
#### Snippet
```java
        }
        Attachment result = attachmentRepository.save(attachment);
        this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(result.getLink()));
        return ResponseEntity.created(new URI("/api/attachments/" + result.getId())).body(result);
    }
```

### DataFlowIssue
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/AttachmentResource.java`
#### Snippet
```java

        Attachment result = attachmentRepository.save(attachment);
        this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(result.getLink()));
        if (notificationText != null) {
            groupNotificationService.notifyStudentGroupAboutAttachmentChange(result, notificationText);
```

### DataFlowIssue
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/AttachmentResource.java`
#### Snippet
```java
            relatedEntity = "lecture " + attachment.getLecture().getTitle();
            try {
                this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(attachment.getLink()));
            }
            catch (RuntimeException exception) {
```

### DataFlowIssue
Method invocation `split` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadSubmissionResource.java`
#### Snippet
```java
    private static void checkFilePattern(MultipartFile file, FileUploadExercise exercise) {
        // Check the pattern
        final String[] splittedFileName = file.getOriginalFilename().split("\\.");
        final String fileSuffix = splittedFileName[splittedFileName.length - 1].toLowerCase();
        final String filePattern = String.join("|", exercise.getFilePattern().toLowerCase().replaceAll("\\s", "").split(","));
```

### DataFlowIssue
Method invocation `getSubmission` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
        final var response = super.saveExampleAssessment(exampleSubmissionId, textAssessment.getFeedbacks());
        if (response.getStatusCode().is2xxSuccessful()) {
            final Submission submission = response.getBody().getSubmission();
            final var textSubmission = textSubmissionService.findOneWithEagerResultFeedbackAndTextBlocks(submission.getId());
            saveTextBlocks(textAssessment.getTextBlocks(), textSubmission, textExerciseRepository.findByIdElseThrow(exerciseId), response.getBody().getFeedbacks());
```

### DataFlowIssue
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java

        if (response.getStatusCode().is2xxSuccessful()) {
            saveTextBlocks(textAssessment.getTextBlocks(), textSubmission, exercise, response.getBody().getFeedbacks());

            // call feedback conflict service
```

### DataFlowIssue
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            // call feedback conflict service
            if (exercise.isAutomaticAssessmentEnabled() && automaticTextAssessmentConflictService.isPresent()) {
                this.automaticTextAssessmentConflictService.get().asyncCheckFeedbackConsistency(textAssessment.getTextBlocks(), textSubmission.getLatestResult().getFeedbacks(),
                        exercise.getId());
            }
```

### DataFlowIssue
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java

        if (response.getStatusCode().is2xxSuccessful()) {
            saveTextBlocks(textAssessment.getTextBlocks(), textSubmission, (TextExercise) result.getParticipation().getExercise(), response.getBody().getFeedbacks());
        }

```

### DataFlowIssue
Argument `participation` might be null
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
            // set view
            var view = quizExercise.viewForStudentsInQuizExercise(quizBatch.get());
            MappingJacksonValue value = new MappingJacksonValue(participation);
            value.setSerializationView(view);
            return value;
```

### DataFlowIssue
Argument `e.getMessage()` might be null
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
        }
        else {
            return new HttpEntity<>(e.getMessage());
        }
    }
```

### DataFlowIssue
Method invocation `getRequestURI` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
        }
        ProblemBuilder builder = Problem.builder().withType(Problem.DEFAULT_TYPE.equals(problem.getType()) ? ErrorConstants.DEFAULT_TYPE : problem.getType())
                .withStatus(problem.getStatus()).withTitle(problem.getTitle()).with(PATH_KEY, request.getNativeRequest(HttpServletRequest.class).getRequestURI());

        if (problem instanceof ConstraintViolationProblem) {
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
            throw new BadRequestException("You can not activate a session that is cancelled by a overlapping with a free period");
        }
        checkEntityIdMatchesPathIds(sessionToActivate, Optional.ofNullable(courseId), Optional.ofNullable(tutorialGroupId), Optional.ofNullable(sessionId));
        tutorialGroupService.isAllowedToModifySessionsOfTutorialGroup(sessionToActivate.getTutorialGroup(), null);
        sessionToActivate.setStatus(TutorialGroupSessionStatus.ACTIVE);
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        var responsibleUser = userRepository.getUserWithGroupsAndAuthorities();
        authorizationCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.INSTRUCTOR, tutorialGroupFromDatabase.getCourse(), responsibleUser);
        checkEntityIdMatchesPathIds(tutorialGroupFromDatabase, Optional.ofNullable(courseId), Optional.ofNullable(tutorialGroupId));
        Set<StudentDTO> notFoundStudentDtos = tutorialGroupService.registerMultipleStudents(tutorialGroupFromDatabase, studentDtos,
                TutorialGroupRegistrationType.INSTRUCTOR_REGISTRATION, responsibleUser);
```

### DataFlowIssue
Function may return null, but it's not allowed here
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        authorizationCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.INSTRUCTOR, courseFromDatabase, null);
        var registrations = tutorialGroupService.importRegistrations(courseFromDatabase, importDTOs);
        var sortedRegistrations = registrations.stream().sorted(Comparator.comparing(TutorialGroupRegistrationImportDTO::title)).toList();
        return ResponseEntity.ok().body(sortedRegistrations);
    }
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        var oldTutorialGroup = this.tutorialGroupRepository.findByIdWithTeachingAssistantAndRegistrationsElseThrow(tutorialGroupId);
        updatedTutorialGroup.setCourse(oldTutorialGroup.getCourse());
        checkEntityIdMatchesPathIds(oldTutorialGroup, Optional.ofNullable(courseId), Optional.ofNullable(tutorialGroupId));
        var responsibleUser = userRepository.getUserWithGroupsAndAuthorities();
        authorizationCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.INSTRUCTOR, oldTutorialGroup.getCourse(), responsibleUser);
```

### DataFlowIssue
Unboxing of `tutorialGroupUpdateDTO.updateTutorialGroupChannelName()` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        if (!oldTutorialGroup.getTitle().equals(updatedTutorialGroup.getTitle())) {
            checkTitleIsValid(updatedTutorialGroup);
            if (configuration.getUseTutorialGroupChannels() && tutorialGroupUpdateDTO.updateTutorialGroupChannelName()) {
                tutorialGroupChannelManagementService.updateNameOfTutorialGroupChannel(updatedTutorialGroup);
            }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/config/WebConfigurer.java`
#### Snippet
```java
     */
    private String resolvePathPrefix() {
        String fullExecutablePath = decode(this.getClass().getResource("").getPath(), StandardCharsets.UTF_8);
        String rootPath = Path.of(".").toUri().normalize().getPath();
        String extractedPath = fullExecutablePath.replace(rootPath, "");
```

### DataFlowIssue
Argument `getStartTime()` might be null
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizBatch.java`
#### Snippet
```java
    public Long getRemainingTime() {
        return isStarted()
                ? getQuizExercise() == null ? 0 : ChronoUnit.SECONDS.between(ZonedDateTime.now(), ChronoUnit.SECONDS.addTo(getStartTime(), getQuizExercise().getDuration()))
                : null;
    }
```

### DataFlowIssue
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/AttachmentUnitService.java`
#### Snippet
```java
    private void evictCache(MultipartFile file, AttachmentUnit attachmentUnit) {
        if (file != null && !file.isEmpty()) {
            this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(attachmentUnit.getAttachment().getLink()));
        }
    }
```

### DataFlowIssue
Method invocation `setSubmission` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
        }

        submissions.forEach(submission -> submission.getLatestResult().setSubmission(null));
        return submissions;
    }
```

### DataFlowIssue
Method invocation `getAssessor` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
            // if disabled, please switch tutorAssessUnique within the tests
            submissionsWithoutResult = submissionsWithoutResult.stream()
                    .filter(submission -> !submission.getResultForCorrectionRound(correctionRound - 1).getAssessor().equals(userRepository.getUser())).toList();
        }

```

### DataFlowIssue
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
    private void updateFeedbackReferencesWithNewTextBlockIds(Set<TextBlock> originalTextBlocks, TextSubmission newSubmission) {
        Result newResult = newSubmission.getLatestResult();
        List<Feedback> newFeedbackList = newResult.getFeedbacks();
        Set<TextBlock> newSubmissionTextBlocks = newSubmission.getBlocks();

```

### DataFlowIssue
Argument `originalSubmission.getLatestResult()` might be null
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
            newSubmission = submissionRepository.saveAndFlush(newSubmission);
            newSubmission.setBlocks(copyTextBlocks(((TextSubmission) originalSubmission).getBlocks(), newSubmission));
            newSubmission.addResult(copyExampleResult(originalSubmission.getLatestResult(), newSubmission, gradingInstructionCopyTracker));
            newSubmission = submissionRepository.saveAndFlush(newSubmission);
            newSubmission = textSubmissionRepository.findByIdWithEagerResultsAndFeedbackAndTextBlocksElseThrow(newSubmission.getId());
```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        final var submissionId = submission.getId();
        var filename = file.getOriginalFilename();
        if (filename.contains("\\")) {
            // this can happen on Windows computers, then we want to take the last element of the file path
            var components = filename.split("\\\\");
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            programmingParticipation = copyRepository(programmingExercise, programmingExercise.getVcsTemplateRepositoryUrl(), programmingParticipation);
            programmingParticipation = configureRepository(programmingExercise, programmingParticipation);
            programmingParticipation = configureRepositoryWebHook(programmingParticipation);
            participation = programmingParticipation;
            if (programmingExercise.getBuildAndTestStudentSubmissionsAfterDueDate() != null || programmingExercise.getAssessmentType() != AssessmentType.AUTOMATIC
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // Note: we configure the repository webhook last, so that the potential empty commit does not trigger a new programming submission (see empty-commit-necessary)
        // Step 3) configure the web hook of the student repository
        participation = configureRepositoryWebHook(participation);
        // Step 4a) Set the InitializationState to initialized to indicate, the programming exercise is ready
        participation.setInitializationState(InitializationState.INITIALIZED);
```

### DataFlowIssue
Method invocation `getScore` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java
            StudentParticipation studentParticipation = exercise.getStudentParticipations().stream()
                    .filter(participation -> participation.getStudent().orElseThrow().equals(recipientStudent)).findFirst().orElseThrow();
            Double score = studentParticipation.findLatestResult().getScore();
            context.setVariable(ASSESSED_SCORE, score);
            context.setVariable(RELATIVE_SCORE, exercise.getMaxPoints() / score);
```

### DataFlowIssue
Argument `status` might be null
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
                log.warn("Unable to add exam exercise start status to distributed cache because it is null");
            }
            messagingTemplate.convertAndSend(EXAM_EXERCISE_START_STATUS_TOPIC.formatted(examId), status);
        }
        catch (Exception e) {
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
        UMLAttribute otherAttribute = (UMLAttribute) obj;

        return Objects.equals(otherAttribute.getAttributeType(), getAttributeType()) && Objects.equals(otherAttribute.getParentElement().getName(), getParentElement().getName());
    }
}
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
        UMLAttribute otherAttribute = (UMLAttribute) obj;

        return Objects.equals(otherAttribute.getAttributeType(), getAttributeType()) && Objects.equals(otherAttribute.getParentElement().getName(), getParentElement().getName());
    }
}
```

### DataFlowIssue
Method invocation `getSimilarityID` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
     */
    private boolean parentsSimilar(UMLAttribute referenceAttribute) {
        if (parentElement.getSimilarityID() != -1 && referenceAttribute.getParentElement().getSimilarityID() != -1) {
            return parentElement.getSimilarityID() == referenceAttribute.getParentElement().getSimilarityID();
        }
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
        }

        return Objects.equals(otherMethod.getReturnType(), getReturnType()) && Objects.equals(otherMethod.getParentElement().getName(), getParentElement().getName());
    }
}
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
        }

        return Objects.equals(otherMethod.getReturnType(), getReturnType()) && Objects.equals(otherMethod.getParentElement().getName(), getParentElement().getName());
    }
}
```

### DataFlowIssue
Method invocation `getSimilarityID` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java

            if (element instanceof UMLAttribute attribute) {
                context = new Context(attribute.getParentElement().getSimilarityID());
            }
            else if (element instanceof UMLMethod method) {
```

### DataFlowIssue
Method invocation `getSimilarityID` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java
            }
            else if (element instanceof UMLMethod method) {
                context = new Context(method.getParentElement().getSimilarityID());
            }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/athene/AtheneHealthIndicator.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.getForObject(atheneUrl + "/queueStatus", JsonNode.class);
            var isUp = status.get("total").isNumber();
            health = new ConnectorHealth(isUp);
        }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java

        // Note: Content-Type might contain additional elements such as the UTF-8 encoding, therefore we now use contains instead of equals
        if (response.getHeaders().containsKey("Content-Type") && response.getHeaders().get("Content-Type").get(0).contains("text/html")) {
            // This is an "Index of" HTML page.
            String html = new String(response.getBody(), StandardCharsets.UTF_8);
```

### DataFlowIssue
Argument `response.getBody()` might be null
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
        if (response.getHeaders().containsKey("Content-Type") && response.getHeaders().get("Content-Type").get(0).contains("text/html")) {
            // This is an "Index of" HTML page.
            String html = new String(response.getBody(), StandardCharsets.UTF_8);
            Pattern pattern = Pattern.compile("href=\"(.*?)\"", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(html);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.exchange(serverUrl + "/rest/api/latest/server", HttpMethod.GET, null, JsonNode.class);
            health = status.getBody().get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.getForObject(jiraUrl + "/status", JsonNode.class);
            health = status.get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
                // If JIRA requires a CAPTCHA. Communicate this to the client
                if (e.getResponseHeaders() != null && e.getResponseHeaders().containsKey("X-Authentication-Denied-Reason")) {
                    String authenticationDeniedReason = e.getResponseHeaders().get("X-Authentication-Denied-Reason").get(0);
                    if (authenticationDeniedReason.toLowerCase().contains("captcha")) {
                        throw new CaptchaRequiredException("CAPTCHA required");
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
            case C -> {
                // Default tasks:
                final Optional<Path> projectTypeSubdirectory = Optional.of(Path.of(projectType.name().toLowerCase()));
                final var tasks = readScriptTasksFromTemplate(programmingLanguage, projectTypeSubdirectory, null, sequentialBuildRuns, false);
                tasks.add(0, checkoutTask);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java
            var uri = UriComponentsBuilder.fromHttpUrl(serverUrl.toString()).pathSegment("job", projectKey, "job", planKey, "lastBuild", "api", "json").build().toUri();
            var response = restTemplate.getForObject(uri, JsonNode.class);
            var isJobBuilding = response.get("building").asBoolean();
            return isJobBuilding ? ContinuousIntegrationService.BuildStatus.BUILDING : ContinuousIntegrationService.BuildStatus.INACTIVE;
        }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
        try {
            final var response = restTemplate.exchange(jenkinsURL.toString() + "/crumbIssuer/api/json", HttpMethod.GET, entity, JsonNode.class);
            final var sessionId = response.getHeaders().get("Set-Cookie").get(0);
            headersToAuthenticate.add("Jenkins-Crumb", response.getBody().get("crumb").asText());
            headersToAuthenticate.add("Cookie", sessionId);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
            final var response = restTemplate.exchange(jenkinsURL.toString() + "/crumbIssuer/api/json", HttpMethod.GET, entity, JsonNode.class);
            final var sessionId = response.getHeaders().get("Set-Cookie").get(0);
            headersToAuthenticate.add("Jenkins-Crumb", response.getBody().get("crumb").asText());
            headersToAuthenticate.add("Cookie", sessionId);
        }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabService.java`
#### Snippet
```java
            final var uri = Endpoints.HEALTH.buildEndpoint(gitlabServerUrl.toString()).build().toUri();
            final var healthResponse = shortTimeoutRestTemplate.getForObject(uri, JsonNode.class);
            final var status = healthResponse.get("status").asText();
            if (!status.equals("ok")) {
                return new ConnectorHealth(false, Map.of("status", status, "url", gitlabServerUrl));
```

### DataFlowIssue
Dereference of `targetRepo.getLocalPath().toFile().listFiles(filter)` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        // Replace everything but the files corresponding to git (such as the .git folder or the .gitignore file)
        FilenameFilter filter = (dir, name) -> !dir.isDirectory() || !name.contains(".git");
        for (java.io.File file : targetRepo.getLocalPath().toFile().listFiles(filter)) {
            FileSystemUtils.deleteRecursively(file);
        }
```

### DataFlowIssue
Dereference of `sourceRepo.getLocalPath().toFile().listFiles(filter)` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
            FileSystemUtils.deleteRecursively(file);
        }
        for (java.io.File file : sourceRepo.getLocalPath().toFile().listFiles(filter)) {
            if (file.isDirectory()) {
                FileUtils.copyDirectory(file, targetRepo.getLocalPath().resolve(file.toPath().getFileName()).toFile());
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketService.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.getForObject(bitbucketServerUrl + "/status", JsonNode.class);
            health = status.get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
```

### DataFlowIssue
Argument `projectType` might be null
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseRepositoryService.java`
#### Snippet
```java
            throws IOException {
        final ProjectType projectType = programmingExercise.getProjectType();
        final Path projectTypeTemplatePath = ProgrammingExerciseService.getProgrammingLanguageProjectTypePath(programmingExercise.getProgrammingLanguage(), projectType)
                .resolve(TEST_DIR);
        final Path projectTypeProjectTemplatePath = projectTypeTemplatePath.resolve("projectTemplate");
```

### DataFlowIssue
Argument `projectType` might be null
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseRepositoryService.java`
#### Snippet
```java
    private void overwriteProjectTypeSpecificFiles(final RepositoryResources resources, final ProgrammingExercise programmingExercise, final Path packagePath) throws IOException {
        final ProjectType projectType = programmingExercise.getProjectType();
        final Path projectTypeTemplatePath = ProgrammingExerciseService.getProgrammingLanguageProjectTypePath(programmingExercise.getProgrammingLanguage(), projectType)
                .resolve(TEST_DIR);

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `src/main/java/de/tum/in/www1/artemis/web/rest/LearningGoalResource.java`
#### Snippet
```java
        // Remove the competency from the old lecture units
        var lectureUnitsToRemoveFromDb = lectureUnitRepository.findAllByIdWithLearningGoalsBidirectional(lectureUnitsToRemove.stream().map(LectureUnit::getId).toList());
        lectureUnitRepository.saveAll(lectureUnitsToRemoveFromDb.stream().filter(lectureUnit -> !(lectureUnit instanceof ExerciseUnit)).map(lectureUnit -> {
            lectureUnit.getLearningGoals().remove(learningGoal);
            return lectureUnit;
```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `src/main/java/de/tum/in/www1/artemis/web/rest/LearningGoalResource.java`
#### Snippet
```java
        }).collect(Collectors.toSet()));
        exerciseRepository.saveAll(lectureUnitsToRemoveFromDb.stream().filter(lectureUnit -> lectureUnit instanceof ExerciseUnit)
                .map(lectureUnit -> ((ExerciseUnit) lectureUnit).getExercise()).map(exercise -> {
                    exercise.getLearningGoals().remove(learningGoal);
                    return exercise;
```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `src/main/java/de/tum/in/www1/artemis/web/rest/LearningGoalResource.java`
#### Snippet
```java
        // Set completion status and remove exercise units (redundant as we also return all exercises)
        learningGoal.setLectureUnits(learningGoal.getLectureUnits().stream().filter(lectureUnit -> !(lectureUnit instanceof ExerciseUnit))
                .filter(lectureUnit -> authorizationCheckService.isAllowedToSeeLectureUnit(lectureUnit, user)).map(lectureUnit -> {
                    lectureUnit.setCompleted(lectureUnit.isCompletedFor(user));
                    return lectureUnit;
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
            // protect sample solution, grading instructions, etc.
            plagiarismCasePosts.stream().map(Post::getExercise).filter(Objects::nonNull).forEach(Exercise::filterSensitiveInformation);
            plagiarismCasePosts.stream().forEach(post -> post.setCourse(course));

            return plagiarismCasePosts;
```

## RuleId[id=RemoveExplicitTypeArguments]
### RemoveExplicitTypeArguments
Remove explicit type arguments
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
    fun performSort(a: Array<Int>) {
        val n = a.size
        val aux = Array<Int>(n) { 0 }
        sort(a, aux, 0, n)
    }
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
        catch (IllegalArgumentException ex) {
            log.error(
                    "Exception encountered when trying to extract the commit hash from the request body: processing submission for participation {} failed with request object {}: {}",
                    participationId, requestBody, ex);
            throw new BadRequestAlertException("Exception encountered when trying to extract the commit hash from the request body " + ex.getMessage(), "ProgrammingSubmission",
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
        }
        catch (EntityNotFoundException ex) {
            log.error("Participation with id {} is not a ProgrammingExerciseParticipation: processing submission for participation {} failed with request object {}: {}",
                    participationId, participationId, requestBody, ex);
            throw ex;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionExportService.java`
#### Snippet
```java
        }
        catch (IOException e) {
            log.error("Failed to export student submissions for exercise {} to {}: {}", exerciseId, outputDir, e);
            return Optional.empty();
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
        }
        catch (GitAPIException ex) {
            log.error("Could not combine repository {} due to exception: {}", repo, ex);
            throw ex;
        }
```

## RuleId[id=KotlinConstantConditions]
### KotlinConstantConditions
Condition 'spaceIsImportant' is always true when reached
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
            println("Time is important –> Merge Sort!")
            context.sortAlgorithm = MergeSort()
        } else if (timeIsImportant && spaceIsImportant) {
            println("Time & Space are important –> Quick Sort!")
            context.sortAlgorithm = QuickSort()
```

## RuleId[id=RedundantLabeledSwitchRuleCodeBlock]
### RedundantLabeledSwitchRuleCodeBlock
Labeled rule's code block is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/notification/SingleUserNotificationFactory.java`
#### Snippet
```java
            case CONVERSATION_CREATE_ONE_TO_ONE_CHAT -> {
                // text is null because the notification is not shown
                yield new SingleUserNotification(user, title, null, false, new String[] {})
                        .transientAndStringTarget(createConversationCreationTarget(conversation, conversation.getCourse().getId()));
            }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/domain/notification/SingleUserNotificationFactory.java`
#### Snippet
```java
            case TUTORIAL_GROUP_REGISTRATION_STUDENT -> {
                var student = users.stream().findAny().orElseThrow();
                notification = new SingleUserNotification(student, title, TUTORIAL_GROUP_REGISTRATION_STUDENT_TEXT, true,
                        new String[] { tutorialGroup.getCourse().getTitle(), tutorialGroup.getTitle(), responsibleForAction.getName() });
                notification.setTransientAndStringTarget(createTutorialGroupTarget(tutorialGroup, tutorialGroup.getCourse().getId(), false, true));
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/domain/notification/SingleUserNotificationFactory.java`
#### Snippet
```java
            case TUTORIAL_GROUP_REGISTRATION_TUTOR -> {
                if (tutorialGroup.getTeachingAssistant() == null) {
                    throw new IllegalArgumentException("The tutorial group " + tutorialGroup.getTitle() + " does not have a tutor to which a notification could be sent.");
                }
                var student = users.stream().findAny();
                var studentName = student.isPresent() ? student.get().getName() : "";

                notification = new SingleUserNotification(tutorialGroup.getTeachingAssistant(), title, TUTORIAL_GROUP_REGISTRATION_TUTOR_TEXT, true,
                        new String[] { tutorialGroup.getCourse().getTitle(), studentName, tutorialGroup.getTitle(), responsibleForAction.getName() });
                notification.setTransientAndStringTarget(createTutorialGroupTarget(tutorialGroup, tutorialGroup.getCourse().getId(), true, true));
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/domain/notification/SingleUserNotificationFactory.java`
#### Snippet
```java
            case TUTORIAL_GROUP_ASSIGNED -> {
                var tutorToContact = users.stream().findAny().get();
                notification = new SingleUserNotification(tutorToContact, title, TUTORIAL_GROUP_ASSIGNED_TEXT, true,
                        new String[] { tutorialGroup.getCourse().getTitle(), tutorialGroup.getTitle(), responsibleForAction.getName() });
                notification.setTransientAndStringTarget(createTutorialGroupTarget(tutorialGroup, tutorialGroup.getCourse().getId(), true, true));
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/domain/scores/StudentScore.java`
#### Snippet
```java
        Long exerciseId = getExercise() != null ? getExercise().getId() : null;
        Long lastResultId = getLastResult() != null ? getLastResult().getId() : null;
        Double lastResultScore = getLastScore();
        Long lastRatedResultId = getLastRatedResult() != null ? getLastRatedResult().getId() : null;
        Double lastRatedScore = getLastRatedScore();
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/AssessmentDashboardService.java`
#### Snippet
```java
        var programmingSubmissionMap = programmingSubmissionsCounts.stream().collect(Collectors.toMap(ExerciseMapEntry::exerciseId, ExerciseMapEntry::value));
        var submissionMap = submissionCounts.stream().collect(Collectors.toMap(ExerciseMapEntry::exerciseId, ExerciseMapEntry::value));
        var lateSubmissionMap = lateSubmissionCounts.stream().collect(Collectors.toMap(ExerciseMapEntry::exerciseId, ExerciseMapEntry::value));
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/CourseService.java`
#### Snippet
```java
            user.setLastNotificationRead(null);
            user.setActivationKey(null);
            user.setLangKey(null);
            user.setLastNotificationRead(null);
            user.setLastModifiedBy(null);
            user.setLastModifiedDate(null);
            user.setCreatedBy(null);
            user.setCreatedDate(null);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        final var optionalParticipation = participationService.findOneByExerciseAndStudentLoginWithEagerSubmissionsAnyState(exercise, user.getLogin());
        if (optionalParticipation.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.FAILED_DEPENDENCY, "No participation found for " + user.getLogin() + " in exercise " + exercise.getId());
        }
        final var participation = optionalParticipation.get();
        final var dueDate = ExerciseDateService.getDueDate(participation);
        // Important: for exam exercises, we should NOT check the exercise due date, we only check if for course exercises
        if (dueDate.isPresent() && exerciseDateService.isAfterDueDate(participation) && participation.getInitializationDate().isBefore(dueDate.get())) {
            throw new AccessForbiddenException();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        fileUploadSubmission.setSubmissionDate(ZonedDateTime.now());
        fileUploadSubmission.setType(SubmissionType.MANUAL);
        participation.addSubmission(fileUploadSubmission);

        if (participation.getInitializationState() != InitializationState.FINISHED) {
            participation.setInitializationState(InitializationState.FINISHED);
            studentParticipationRepository.save(participation);
        }

        // remove result from submission (in the unlikely case it is passed here), so that students cannot inject a result
        fileUploadSubmission.setResults(new ArrayList<>());

        // Note: we save before the new file path is set to potentially remove the old file on the file system
        fileUploadSubmission = fileUploadSubmissionRepository.save(fileUploadSubmission);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/flowchart/FlowchartFlowline.java`
#### Snippet
```java
        double similarity = 0;

        double sourceWeight = 0.5;
        double targetWeight = 0.5;

        similarity += referenceFlowline.getSource().similarity(source) * sourceWeight;
        similarity += referenceFlowline.getTarget().similarity(target) * targetWeight;

        double similarityReverse = 0;

        similarityReverse += referenceFlowline.getSource().similarity(target) * sourceWeight;
        similarityReverse += referenceFlowline.getTarget().similarity(source) * targetWeight;

        similarity = Math.max(similarity, similarityReverse);

        return ensureSimilarityRange(similarity);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooResultService.java`
#### Snippet
```java
        var agentSetupDuration = new BuildJobPartDuration(jobStarted, agentSetupCompleted);
        var testDuration = new BuildJobPartDuration(testsStarted, testsFinished);
        var scaDuration = new BuildJobPartDuration(scaStarted, scaFinished);
        var totalJobDuration = new BuildJobPartDuration(jobStarted, jobFinished);

        buildLogStatisticsEntryRepository.saveBuildLogStatisticsEntry(programmingSubmission, agentSetupDuration, testDuration, scaDuration, totalJobDuration,
                dependenciesDownloadedCount);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketInfoContributor.java`
#### Snippet
```java
        String commitHashUrlTemplate = bitbucketServerUrl + commitHashPathTemplate;
        builder.withDetail(Constants.INFO_COMMIT_HASH_URL_DETAIL, commitHashUrlTemplate);

        // Store ssh url template
        if (bitbucketSshUrlTemplate.isPresent()) {
            builder.withDetail(Constants.INFO_SSH_CLONE_URL_DETAIL, bitbucketSshUrlTemplate);
            if (bitbucketSshKeysUrlPath.isPresent()) {
                final var sshKeysUrl = bitbucketServerUrl + bitbucketSshKeysUrlPath.get();
                builder.withDetail(Constants.INFO_SSH_KEYS_URL_DETAIL, sshKeysUrl);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketService.java`
#### Snippet
```java
        ConnectorHealth health;
        try {
            final var status = shortTimeoutRestTemplate.getForObject(bitbucketServerUrl + "/status", JsonNode.class);
            health = status.get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
            health = new ConnectorHealth(emAll);
        }

        health.setAdditionalInfo(Map.of("url", bitbucketServerUrl));
        return health;
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/ConversationDTOService.java`
#### Snippet
```java
        var course = oneToOneChat.getCourse();
        Set<ConversationParticipant> conversationParticipants = getConversationParticipants(oneToOneChat);
        var participantOfRequestingUser = conversationParticipants.stream()
                .filter(conversationParticipant -> conversationParticipant.getUser().getId().equals(requestingUser.getId())).findFirst();
        Set<ConversationUserDTO> chatParticipants = getChatParticipantDTOs(requestingUser, course, conversationParticipants);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/ConversationService.java`
#### Snippet
```java
            conversationParticipant.setUser(user);
            conversationParticipant.setConversation(conversation);
            conversationParticipant.setIsModerator(false);
            conversationParticipant.setIsHidden(false);
            conversationParticipant.setIsFavorite(false);
            // set the last reading time of a participant in the past when creating conversation for the first time!
            conversationParticipant.setLastRead(ZonedDateTime.now().minusYears(2));
            conversationParticipant.setUnreadMessagesCount(0L);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        if (!isCourseFilter && !isExamFilter) {
            return new SearchResultPageDTO<>(Collections.emptyList(), 0);
        }
        String searchTerm = search.getSearchTerm();
        PageRequest pageable = PageUtil.createExercisePageRequest(search);
        Specification<ProgrammingExercise> specification = exerciseSpecificationService.getExerciseSearchSpecification(searchTerm, isCourseFilter, isExamFilter, user, pageable);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
        if (overlappingPeriod.isPresent()) {
            session.setStatus(TutorialGroupSessionStatus.CANCELLED);
            session.setStatusExplanation(null);
            session.setTutorialGroupFreePeriod(overlappingPeriod.get());
        }
        else {
            session.setStatus(TutorialGroupSessionStatus.ACTIVE);
            session.setStatusExplanation(null);
            session.setTutorialGroupFreePeriod(null);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/AssessmentResource.java`
#### Snippet
```java
            if (result.getFeedbacks() != null) {
                result.getFeedbacks().stream().filter(feedback -> !FeedbackType.MANUAL_UNREFERENCED.equals(feedback.getType()) && StringUtils.hasText(feedback.getReference()))
                        .forEach(feedback -> {
                            Feedback freshFeedback = new Feedback();
                            freshFeedback.setId(feedback.getId());
                            freshResult.addFeedback(freshFeedback.reference(feedback.getReference()).type(feedback.getType()));
                        });
            }
            result = freshResult;
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingExerciseResource.java`
#### Snippet
```java
        User user = userRepository.getUserWithGroupsAndAuthorities();
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.INSTRUCTOR, modelingExercise, user);
        // note: we use the exercise service here, because this one makes sure to clean up all lazy references correctly.
        exerciseService.logDeletion(modelingExercise, modelingExercise.getCourseViaExerciseGroupOrCourseMember(), user);
        exerciseDeletionService.delete(exerciseId, false, false);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, modelingExercise.getTitle())).build();
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingExerciseResource.java`
#### Snippet
```java
        plagiarismResult.sortAndLimit(100);
        log.info("Limited number of comparisons to {} to avoid performance issues when saving to database", plagiarismResult.getComparisons().size());
        start = System.nanoTime();
        plagiarismResultRepository.savePlagiarismResultAndRemovePrevious(plagiarismResult);
        log.info("Finished plagiarismResultRepository.savePlagiarismResultAndRemovePrevious call in {}", TimeLogUtil.formatDurationFrom(start));
        plagiarismResultRepository.prepareResultForClient(plagiarismResult);
        return ResponseEntity.ok(plagiarismResult);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/StudentExamResource.java`
#### Snippet
```java
        long start = System.currentTimeMillis();
        User user = userRepository.getUserWithGroupsAndAuthorities();
        log.debug("REST request to get the student exam of user {} for exam {}", user.getLogin(), examId);

        StudentExam studentExam = studentExamRepository.findByIdWithExercisesElseThrow(studentExamId);

        if (!user.equals(studentExam.getUser())) {
            throw new AccessForbiddenException("Current user is not the user of the requested student exam");
        }
        studentExamAccessService.checkCourseAndExamAccessElseThrow(courseId, examId, user, studentExam.isTestRun(), false);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/metis/conversation/GroupChatResource.java`
#### Snippet
```java
        var course = courseRepository.findByIdElseThrow(courseId);
        checkMessagingEnabledElseThrow(course);
        if (userLogins == null || userLogins.isEmpty()) {
            throw new BadRequestAlertException("No user logins provided", GROUP_CHAT_ENTITY_NAME, "userLoginsEmpty");
        }
        var groupChatFromDatabase = groupChatRepository.findByIdElseThrow(groupChatId);
        checkEntityIdMatchesPathIds(groupChatFromDatabase, Optional.of(courseId), Optional.of(groupChatId));
        var requestingUser = userRepository.getUserWithGroupsAndAuthorities();
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        Map<String, String> fileSaveResult = saveFileSubmissions(submissions, repository);

        if (commit) {
            var response = super.commitChanges(participationId);
            if (response.getStatusCode() != HttpStatus.OK) {
                throw new ResponseStatusException(response.getStatusCode());
            }
        }

        return ResponseEntity.ok(fileSaveResult);
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupFreePeriodResource.java`
#### Snippet
```java
        Optional<TutorialGroupsConfiguration> configurationOptional = tutorialGroupsConfigurationRepository.findByCourseIdWithEagerTutorialGroupFreePeriods(courseId);
        if (configurationOptional.isEmpty()) {
            throw new BadRequestException("The course has no tutorial groups configuration");
        }
        var configuration = configurationOptional.get();
        if (configuration.getCourse().getTimeZone() == null) {
            throw new BadRequestException("The course has no time zone");
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
        var configurationOptional = this.tutorialGroupsConfigurationRepository.findByCourseIdWithEagerTutorialGroupFreePeriods(courseId);
        if (configurationOptional.isEmpty()) {
            throw new BadRequestException("The course has no tutorial groups configuration");
        }
        var configuration = configurationOptional.get();
        if (configuration.getCourse().getTimeZone() == null) {
            throw new BadRequestException("The course has no time zone");
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/errors/ScheduleOverlapsWithSessionException.java`
#### Snippet
```java
        Map<String, List<String>> params = new HashMap<>();
        params.put("sessions", overlappingSessions.stream().map(session -> session.getStart().withZoneSameInstant(zoneId).format(DateTimeFormatter.ISO_LOCAL_DATE)).toList());
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("skipAlert", true);
        parameters.put("message", "artemisApp.errors." + ERROR_KEY);
        parameters.put("params", params);
        return parameters;
```

### DuplicatedCode
Duplicated code
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
        var i = lo
        var j = mid
        for (k in lo until hi) {
            when {
                i == mid -> aux[k] = a[j++]
                j == hi -> aux[k] = a[i++]
                a[j] < a[i] -> aux[k] = a[j++]
                else -> aux[k] = a[i++]
            }
        }

        // copy back
        for (k in lo until hi)
            a[k] = aux[k]
```

### DuplicatedCode
Duplicated code
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
        if (hi - lo <= 1) return

        // sort each half, recursively
        val mid = lo + (hi - lo) / 2
        sort(a, aux, lo, mid)
        sort(a, aux, mid, hi)

        // merge back together
        merge(a, aux, lo, mid, hi)
```

### DuplicatedCode
Duplicated code
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
        var i = lo
        var j = hi

        // compare element x
        val x = a[(lo + hi) / 2]

        //  divide
        while (i <= j) {
            while (a[i] < x) i++
            while (a[j] > x) j--
            if (i <= j) {
                exchange(i, j)
                i++
                j--
            }
        }

        // recursion
        if (lo < j) quicksort(lo, j)
        if (i < hi) quicksort(i, hi)
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
     *
     * @param courseId the id of the course
     * @return number of locked submissions for the current user in the given course
     */
    public List<Submission> getLockedSubmissions(long courseId) {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/service/TextBlockService.java`
#### Snippet
```java
     *
     * @param submission TextSubmission to split
     * @return List of TextBlocks
     */
    public Set<TextBlock> splitSubmissionIntoBlocks(TextSubmission submission) {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/service/metis/conversation/ConversationService.java`
#### Snippet
```java
     * @param findAllTutors      if true, result includes all users with the tutor role in the course
     * @param findAllInstructors if true, result includes all users with the instructor role in the course
     * @return the list of users found
     */
    public Set<User> findUsersInDatabase(Course course, boolean findAllStudents, boolean findAllTutors, boolean findAllInstructors) {
```

### MismatchedJavadocCode
Method is specified to return number but the return type is map
in `src/main/java/de/tum/in/www1/artemis/service/hestia/TestwiseCoverageService.java`
#### Snippet
```java
     *
     * @param report the report for which the line counts of its file reports should be caluclated and saved
     * @return the number of covered lines by file path
     */
    private Map<String, Integer> calculateAndSaveUniqueLineCountsByFilePath(CoverageReport report) {
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/TextBlockRepository.java`
#### Snippet
```java
     *
     * @param submissionId the id of the Submission
     * @return the number of other TextBlock's in the same cluster as the block with given `id`
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ExerciseRepository.java`
#### Snippet
```java
     * @param courseId the course to get the exercises for
     * @param now      the current date time
     * @return a set of exercises
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/repository/ExerciseRepository.java`
#### Snippet
```java
     * @param courseId the id of the course
     * @param login    the login of the corresponding user
     * @return list of exercises
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/repository/AttachmentUnitRepository.java`
#### Snippet
```java
     * @param lectureId      the id of the lecture
     * @param attachmentType the attachment type
     * @return the list of all attachment units with the given lecture id and attachment type
     * @throws EntityNotFoundException if no results are found
     */
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintResponseRepository.java`
#### Snippet
```java
     * @param exerciseIds   - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintResponseRepository.java`
#### Snippet
```java
     * @param exerciseIds   - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ProgrammingExerciseRepository.java`
#### Snippet
```java
     *
     * @param exerciseIds the exercise ids we are interested in
     * @return the number of distinct submissions belonging to the exercise id
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return number but the return type is map
in `src/main/java/de/tum/in/www1/artemis/repository/StudentParticipationRepository.java`
#### Snippet
```java
     * @param courseId      the id of the course for which to consider participations
     * @param teamShortName the short name of the team for which to consider participations
     * @return the number of submissions per participation in the given course for the team
     */
    default Map<Long, Integer> countLegalSubmissionsPerParticipationByCourseIdAndTeamShortNameAsMap(long courseId, String teamShortName) {
```

### MismatchedJavadocCode
Method is specified to return number but the return type is map
in `src/main/java/de/tum/in/www1/artemis/repository/StudentParticipationRepository.java`
#### Snippet
```java
     *
     * @param exerciseId the id of the exercise for which to consider participations
     * @return the number of submissions per participation in the given exercise
     */
    default Map<Long, Integer> countSubmissionsPerParticipationByExerciseIdAsMap(long exerciseId) {
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ModelElementRepository.java`
#### Snippet
```java
     *
     * @param submissionId the id of the Submission
     * @return the number of other TextBlock's in the same cluster as the block with given `id`
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintRepository.java`
#### Snippet
```java
     * @param exerciseIds   - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintRepository.java`
#### Snippet
```java
     * @param exerciseIds   - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### MismatchedJavadocCode
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/SubmissionRepository.java`
#### Snippet
```java
     *
     * @param exerciseIds the exercise id we are interested in
     * @return the number of submissions belonging to the exercise id, which have the submitted flag set to true and the submission date before the exercise due date, or no
     *         exercise due date at all
     */
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlabci/GitLabCIService.java`
#### Snippet
```java
        }
        catch (GitLabApiException e) {
            throw new GitLabCIException("Error enabling CI for " + repositoryURL.toString(), e);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlabci/GitLabCIService.java`
#### Snippet
```java
        }
        catch (GitLabApiException e) {
            log.error("Error creating variable for " + repositoryURL.toString() + " The variables may already have been created.", e);
        }
    }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizPointStatistic.java`
#### Snippet
```java
     */
    private void changeStatisticBasedOnResult(double score, Boolean rated, int countChange) {
        /**
         * {@link de.tum.in.www1.artemis.service.util.RoundingUtil#roundScoreSpecifiedByCourseSettings}
         * is not applicable here, as we need to sort the points into existing integer buckets
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java

    public RepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository, RepositoryAccessService repositoryAccessService) {
        this.userRepository = userRepository;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java

    public RepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository, RepositoryAccessService repositoryAccessService) {
        this.userRepository = userRepository;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java
    protected final AuthorizationCheckService authCheckService;

    protected final Optional<ContinuousIntegrationService> continuousIntegrationService;

    protected final GitService gitService;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java
    protected final ProgrammingExerciseRepository programmingExerciseRepository;

    protected final Optional<VersionControlService> versionControlService;

    protected final RepositoryAccessService repositoryAccessService;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/config/ProgrammingLanguageConfiguration.java`
#### Snippet
```java
     * @return the docker image name
     */
    public String getImage(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType) {
        final Map<ProjectType, String> languageImages = images.get(programmingLanguage);
        final ProjectType configuredProjectType = projectType.map(this::getConfiguredProjectType).orElse(DEFAULT_PROJECT_TYPE);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsXmlConfigBuilder.java`
#### Snippet
```java
     * @return The parsed XML document containing the Jenkins build config
     */
    Document buildBasicConfig(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType, InternalVcsRepositoryURLs internalVcsRepositoryURLs,
            boolean isStaticCodeAnalysisEnabled, boolean isSequentialRuns, boolean isTestwiseCoverageEnabled);
}
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'SessionFactoryImpl' used without 'try'-with-resources statement
in `src/main/java/de/tum/in/www1/artemis/service/TitleCacheEvictionService.java`
#### Snippet
```java
        this.cacheManager = cacheManager;

        var eventListenerRegistry = entityManagerFactory.unwrap(SessionFactoryImpl.class).getServiceRegistry().getService(EventListenerRegistry.class);
        eventListenerRegistry.appendListeners(EventType.POST_UPDATE, this);
        eventListenerRegistry.appendListeners(EventType.POST_DELETE, this);
```

### AutoCloseableResource
'Repository' used without 'try'-with-resources statement
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
    public void deleteLocalRepository(Repository repository) throws IOException {
        Path repoPath = repository.getLocalPath();
        cachedRepositories.remove(repoPath);
        // if repository is not closed, it causes weird IO issues when trying to delete the repository again
        // java.io.IOException: Unable to delete file: ...\.git\objects\pack\...
```

### AutoCloseableResource
'Repository' used without 'try'-with-resources statement
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
            if (!Files.exists(localPath)) {
                // In this case we should remove the repository if cached, because it can't exist anymore.
                cachedRepositories.remove(localPath);
                return null;
            }
```

### AutoCloseableResource
'SshdSessionFactory' used without 'try'-with-resources statement
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                return lookup(hostName, port, userName);
            }
        }).setSshDirectory(new java.io.File(gitSshPrivateKeyPath.get())).setHomeDirectory(new java.io.File(System.getProperty("user.home"))).build(new JGitKeyCache());

        sshCallback = transport -> {
```

## RuleId[id=ImplicitSubclassInspection]
### ImplicitSubclassInspection
Methods annotated with '@Transactional' must be overridable
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java

    @Transactional // ok because of delete
    protected void deleteUser(User user) {
        // TODO: before we can delete the user, we need to make sure that all associated objects are deleted as well (or the connection to user is set to null)
        // 1) All participation connected to the user (as student)
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param user` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/domain/LearningObject.java`
#### Snippet
```java
     * Get the date when the object has been completed by the participant
     *
     * @param user
     * @return The datetime when the object was first completed or null
     */
```

### JavadocDeclaration
`@param user` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/domain/LearningObject.java`
#### Snippet
```java
     * Whether the participant has completed the object
     *
     * @param user
     * @return True if completed, else false
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/de/tum/in/www1/artemis/domain/tutorialgroups/TutorialGroupSchedule.java`
#### Snippet
```java
     * The date until which this recurrence pattern is valid.
     * <p>
     * For example, if the tutorial group meets every Monday from 2021-01-01 to 2021-06-30, then the {@link #validToInclusive} is 2021-06-30.
     * The first session will be on 2021-01-04 (Monday) and the last session will be on 2021-06-28 (Monday).
     * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/de/tum/in/www1/artemis/domain/tutorialgroups/TutorialGroupSchedule.java`
#### Snippet
```java
     * Currently represents weekly recurrence, so 1 means every week, 2 means every other week, etc.
     * <p>
     * E.g. if the tutorial group meets every Monday then the {@link #repetitionFrequency} is 1.
     */
    @Column(name = "repetition_frequency")
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/de/tum/in/www1/artemis/domain/tutorialgroups/TutorialGroupSchedule.java`
#### Snippet
```java
     * The date from which this recurrence pattern starts.
     * <p>
     * For example, if the tutorial group meets every Monday from 2021-01-01 to 2021-06-30, then the {@link #validFromInclusive} is 2021-01-01.
     * The first session will be on 2021-01-04 (Monday) and the last session will be on 2021-06-28 (Monday).
     * <p>
```

### JavadocDeclaration
Illegal character
in `src/main/java/de/tum/in/www1/artemis/service/ModelingExerciseImportService.java`
#### Snippet
```java
     * Imports a modeling exercise creating a new entity, copying all basic values and saving it in the database.
     * All basic include everything except Student-, Tutor participations, and student questions. <br>
     * This method calls {@link #copyModelingExerciseBasis(Exercise, Map<Long, GradingInstruction>)} to set up the basis of the exercise
     * {@link #copyExampleSubmission(Exercise, Exercise)} for a hard copy of the example submissions.
     *
```

### JavadocDeclaration
Illegal character
in `src/main/java/de/tum/in/www1/artemis/service/ModelingExerciseImportService.java`
#### Snippet
```java
     * Imports a modeling exercise creating a new entity, copying all basic values and saving it in the database.
     * All basic include everything except Student-, Tutor participations, and student questions. <br>
     * This method calls {@link #copyModelingExerciseBasis(Exercise, Map<Long, GradingInstruction>)} to set up the basis of the exercise
     * {@link #copyExampleSubmission(Exercise, Exercise)} for a hard copy of the example submissions.
     *
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java
     * @param exercise         that holds the needed information: exercise -> studentParticipation -> results (this information was loaded in previous steps)
     * @param recipientStudent who will receive the email
     * @return the updated context
     */
    private void checkAndPrepareExerciseSubmissionAssessedCase(NotificationType notificationType, Context context, Exercise exercise, User recipientStudent) {
```

### JavadocDeclaration
`@param pagingEnabled` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
     *
     * @param postContextFilter filter object
     * @param pagingEnabled
     * @param pageable
     * @return page of posts that belong to the exercise
```

### JavadocDeclaration
`@param pageable` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
     * @param postContextFilter filter object
     * @param pagingEnabled
     * @param pageable
     * @return page of posts that belong to the exercise
     */
```

### JavadocDeclaration
`@param pagingEnabled` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
     *
     * @param postContextFilter filter object
     * @param pagingEnabled
     * @param pageable
     * @return page of posts that belong to the lecture
```

### JavadocDeclaration
`@param pageable` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
     * @param postContextFilter filter object
     * @param pagingEnabled
     * @param pageable
     * @return page of posts that belong to the lecture
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @param allUmlElementsMap  map of uml elements and ids to find owner element
     * @param ownerRelationships map of uml elements and ids of their owners
     * @return the UMLComponent object parsed from the JSON object
     */
    protected static void resolveParentComponent(Map<String, UMLElement> allUmlElementsMap, Map<UMLElement, String> ownerRelationships) {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @param jsonObject         json representation of element
     * @param umlElement         uml element
     * @return the UMLComponent object parsed from the JSON object
     */
    protected static void findOwner(Map<UMLElement, String> ownerRelationships, JsonObject jsonObject, UMLElement umlElement) {
```

### JavadocDeclaration
`@param programmingLanguage` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     * Assembles a bamboo docker configuration for a given programming exercise and project type
     *
     * @param programmingLanguage
     * @param projectType
     * @return bamboo docker configuration
```

### JavadocDeclaration
`@param projectType` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     *
     * @param programmingLanguage
     * @param projectType
     * @return bamboo docker configuration
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsUserManagementService.java`
#### Snippet
```java
     * @param groupsToAdd    groups to add the user to
     * @param groupsToRemove groups to remove the user from
     * @throws ContinuousIntegrationException
     */
    @Override
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `ele` to `TypeElement` is redundant
in `src/main/java/de/tum/in/www1/artemis/config/BeanInfoProcessor.java`
#### Snippet
```java
            Set<? extends Element> annotatedElements = new HashSet<>(roundEnv.getElementsAnnotatedWith(annotation));
            annotatedElements.stream().filter(ele -> ele.getKind().isClass()).map(ele -> (TypeElement) ele).flatMap(ele -> findSupers(ele).stream())
                    .forEach(ele -> generateBeanInfo((TypeElement) ele));
        }
        return false;
```

## RuleId[id=SpringTransactionalMethodCallsInspection]
### SpringTransactionalMethodCallsInspection
@Transactional self-invocation (in effect, a method within the target object calling another method of the target object) does not lead to an actual transaction at runtime
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentQueueService.java`
#### Snippet
```java
     */
    public Optional<TextSubmission> getProposedTextSubmission(TextExercise textExercise) {
        return getProposedTextSubmission(textExercise, null);
    }

```

### SpringTransactionalMethodCallsInspection
@Transactional self-invocation (in effect, a method within the target object calling another method of the target object) does not lead to an actual transaction at runtime
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
            catch (VersionControlException e) {
                log.error("An error occurred while registering GitLab user {}:", savedNonActivatedUser.getLogin(), e);
                deleteUser(savedNonActivatedUser);
                throw e;
            }
```

### SpringTransactionalMethodCallsInspection
@Transactional self-invocation (in effect, a method within the target object calling another method of the target object) does not lead to an actual transaction at runtime
in `src/main/java/de/tum/in/www1/artemis/repository/ParticipantScoreRepository.java`
#### Snippet
```java
     */
    default void clearAllByResultId(Long resultId) {
        this.clearLastResultByResultId(resultId);
        this.clearLastRatedResultByResultId(resultId);
    }
```

### SpringTransactionalMethodCallsInspection
@Transactional self-invocation (in effect, a method within the target object calling another method of the target object) does not lead to an actual transaction at runtime
in `src/main/java/de/tum/in/www1/artemis/repository/ParticipantScoreRepository.java`
#### Snippet
```java
    default void clearAllByResultId(Long resultId) {
        this.clearLastResultByResultId(resultId);
        this.clearLastRatedResultByResultId(resultId);
    }

```

### SpringTransactionalMethodCallsInspection
@Transactional self-invocation (in effect, a method within the target object calling another method of the target object) does not lead to an actual transaction at runtime
in `src/main/java/de/tum/in/www1/artemis/repository/UserRepository.java`
#### Snippet
```java
     */
    default void updateUserNotificationReadDate(long userId) {
        updateUserNotificationReadDate(userId, ZonedDateTime.now());
    }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `languageToDefaultCategories` may be 'final'
in `src/main/java/de/tum/in/www1/artemis/config/StaticCodeAnalysisConfigurer.java`
#### Snippet
```java
public class StaticCodeAnalysisConfigurer {

    private static Map<ProgrammingLanguage, List<StaticCodeAnalysisDefaultCategory>> languageToDefaultCategories = Map.of(ProgrammingLanguage.JAVA,
            createDefaultCategoriesForJava(), ProgrammingLanguage.SWIFT, createDefaultCategoriesForSwift(), ProgrammingLanguage.C, createDefaultCategoriesForC());

```

## RuleId[id=SpringJavaAutowiredFieldsWarningInspection]
### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `src/main/java/de/tum/in/www1/artemis/config/PublicResourcesConfiguration.java`
#### Snippet
```java
public class PublicResourcesConfiguration implements WebMvcConfigurer {

    @Autowired
    private JHipsterProperties jHipsterProperties;

```

## RuleId[id=SpringDataMethodInconsistencyInspection]
### SpringDataMethodInconsistencyInspection
Cannot resolve property 'courseId'
in `src/main/java/de/tum/in/www1/artemis/repository/GroupNotificationRepository.java`
#### Snippet
```java
public interface GroupNotificationRepository extends JpaRepository<Notification, Long> {

    List<GroupNotification> findAllByCourseId(Long courseId);
}

```

### SpringDataMethodInconsistencyInspection
Cannot resolve property 'isInternal'
in `src/main/java/de/tum/in/www1/artemis/repository/UserRepository.java`
#### Snippet
```java

    @EntityGraph(type = LOAD, attributePaths = { "groups", "authorities" })
    Optional<User> findOneWithGroupsAndAuthoritiesByLoginAndIsInternal(String login, boolean isInternal);

    @EntityGraph(type = LOAD, attributePaths = { "groups", "authorities" })
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
            log.warn("Clone is already in progress. This will lead to an error. Wait for a second");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'exercise'
in `src/main/java/de/tum/in/www1/artemis/domain/Team.java`
#### Snippet
```java
     * @param team Team which to copy
     */
    public Team(@NotNull Team team) {
        this.name = team.name;
        this.shortName = team.shortName;
```

## RuleId[id=UnusedSymbol]
### UnusedSymbol
Function "scrambleArray" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    }

    fun scrambleArray(array: Array<Int>): Array<Int> {
        return array.toList().shuffled().toTypedArray()
    }
```

### UnusedSymbol
Function "createIntegerArray" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
object Client {

    fun createIntegerArray(size: Int = 30): Array<Int> {
        return Array(size) { Random.nextInt(0, 100) }
    }
```

### UnusedSymbol
Function "simulateRuntimeConfigurationChange" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    }

    fun simulateRuntimeConfigurationChange(sortPolicy: Policy) {
        if (Random.nextBoolean()) {
            println("Time is important!")
```

### UnusedSymbol
Function "printIntegerArray" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    }

    fun printIntegerArray(a: Array<Int>) {
        println(a.joinToString(prefix = "[", postfix = "]"))
    }
```

