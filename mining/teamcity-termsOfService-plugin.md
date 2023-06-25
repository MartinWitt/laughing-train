# teamcity-termsOfService-plugin 
 
# Bad smells
I found 18 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 7 | false |
| UNUSED_IMPORT | 4 | false |
| DataFlowIssue | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| DuplicatedCode | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'ViewTermsOfServiceController'#treeend

*** ** * ** ***

|-------------------------------------------|---|--------------------------------------------|
| **ViewTermsOfServiceController(...):**    |   | **Bean:**                                  |
| WebControllerManager webControllerManager |   | **???**                                    |
| PluginDescriptor descriptor               |   | **???**                                    |
| TermsOfServiceManager manager             |   | Autowired: null(TermsOfServiceManagerImpl) |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java

    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceHandlerInterceptor" lazy-init="false"/>
    <bean class="jetbrains.buildServer.termsOfService.ViewTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.AcceptTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceManagerImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AcceptTermsOfServiceController'#treeend

*** ** * ** ***

|-------------------------------------------|---|--------------------------------------------|
| **AcceptTermsOfServiceController(...):**  |   | **Bean:**                                  |
| WebControllerManager webControllerManager |   | **???**                                    |
| PluginDescriptor descriptor               |   | **???**                                    |
| TermsOfServiceManager manager             |   | Autowired: null(TermsOfServiceManagerImpl) |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceHandlerInterceptor" lazy-init="false"/>
    <bean class="jetbrains.buildServer.termsOfService.ViewTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.AcceptTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceManagerImpl"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceConfig"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TermsOfServiceManagerImpl'#treeend

*** ** * ** ***

|-------------------------------------|---|---------------------------------------|
| **TermsOfServiceManagerImpl(...):** |   | **Bean:**                             |
| TermsOfServiceConfig config         |   | Autowired: null(TermsOfServiceConfig) |
| UserModel userModel                 |   | **???**                               |
| TimeService timeService             |   | **???**                               |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.termsOfService.ViewTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.AcceptTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceManagerImpl"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceConfig"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServicesLink"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TermsOfServiceConfig'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **TermsOfServiceConfig(...):**                  |   | **Bean:** |
| EventDispatcher\<BuildServerListener\> myEvents |   | **???**   |
| ServerPaths serverPaths                         |   | **???**   |
| FileWatcherFactory fileWatcherFactory           |   | **???**   |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.termsOfService.AcceptTermsOfServiceController"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceManagerImpl"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceConfig"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServicesLink"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceUserProfileExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TermsOfServicesLink'#treeend

*** ** * ** ***

|-------------------------------|---|--------------------------------------------|
| **TermsOfServicesLink(...):** |   | **Bean:**                                  |
| TermsOfServiceManager manager |   | Autowired: null(TermsOfServiceManagerImpl) |
| PagePlaces pagePlaces         |   | **???**                                    |
| PluginDescriptor descriptor   |   | **???**                                    |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceManagerImpl"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceConfig"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServicesLink"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceUserProfileExtension"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceGuestNote"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TermsOfServiceUserProfileExtension'#treeend

*** ** * ** ***

|----------------------------------------------|---|--------------------------------------------|
| **TermsOfServiceUserProfileExtension(...):** |   | **Bean:**                                  |
| TermsOfServiceManager manager                |   | Autowired: null(TermsOfServiceManagerImpl) |
| PagePlaces pagePlaces                        |   | **???**                                    |
| PluginDescriptor descriptor                  |   | **???**                                    |
| WebControllerManager webControllerManager    |   | **???**                                    |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceConfig"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServicesLink"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceUserProfileExtension"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceGuestNote"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TermsOfServiceGuestNote'#treeend

*** ** * ** ***

|-----------------------------------|---|--------------------------------------------|
| **TermsOfServiceGuestNote(...):** |   | **Bean:**                                  |
| TermsOfServiceManager manager     |   | Autowired: null(TermsOfServiceManagerImpl) |
| PagePlaces pagePlaces             |   | **???**                                    |
| PluginDescriptor descriptor       |   | **???**                                    |
| UserModel userModel               |   | **???**                                    |
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServicesLink"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceUserProfileExtension"/>
    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceGuestNote"/>


```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `termsOfService-server/src/main/resources/META-INF/build-server-plugin-terms-of-service.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans
               http://www.springframework.org/schema/beans/spring-beans-3.0.xsd http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"
       default-autowire="constructor">

    <bean class="jetbrains.buildServer.termsOfService.TermsOfServiceHandlerInterceptor" lazy-init="false"/>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/AcceptTermsOfServiceController.java`
#### Snippet
```java
        String agreementId = request.getParameter("agreement");

        if (agreementId == null) {
            LOGGER.warn("Request without agreement id detected " + WebUtil.getRequestDump(request));
            response.setStatus(404);
            return null;
        }

        Optional<TermsOfServiceManager.Agreement> agreement = myManager.findAgreement(agreementId);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
                } catch (ParseException e) {
                    TermsOfServiceLogger.LOGGER.warnAndDebugDetails("Invalid 'enforcement-date' date format for the agreement '" + id + "', supported format is: " + pattern, e);
                    parsedEnforcementDate = null;
                }
            }
```

### DataFlowIssue
Argument `myGuestNotice` might be null
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        }

        return Optional.of(myGuestNotice);
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.controllers.login.RememberUrl;`
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/AcceptTermsOfServiceController.java`
#### Snippet
```java

import jetbrains.buildServer.controllers.BaseController;
import jetbrains.buildServer.controllers.login.RememberUrl;
import jetbrains.buildServer.controllers.overview.OverviewController;
import jetbrains.buildServer.users.SUser;
```

### UNUSED_IMPORT
Unused import `import org.springframework.web.servlet.view.RedirectView;`
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/AcceptTermsOfServiceController.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
```

### UNUSED_IMPORT
Unused import `import java.util.Date;`
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManager.java`
#### Snippet
```java

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Optional;
```

### UNUSED_IMPORT
Unused import `import org.springframework.web.servlet.view.RedirectView;`
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/ViewTermsOfServiceController.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `GuestNoticeSettings` may be 'static'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
    }

    class GuestNoticeSettings implements GuestNotice {
        private final String title;
        private final String note;
```

### InnerClassMayBeStatic
Inner class `ExternalAgreementLinkSettings` may be 'static'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
    }

    class ExternalAgreementLinkSettings implements TermsOfServiceManager.ExternalAgreementLink {
        private final String text;
        private final String url;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceUserProfileExtension.java`
#### Snippet
```java

        form.getAgreement().getConsents().forEach(consent -> {
            if (request.getParameter(consent.getId()) != null) {
                form.setConsentState(consent.getId(), true);
            } else {
```

