# teamcity-termsOfService-plugin 
 
# Bad smells
I found 30 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 16 | false |
| UNUSED_IMPORT | 4 | false |
| DataFlowIssue | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| RedundantFieldInitialization | 1 | false |
| ReturnNull | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| BoundedWildcard | 1 | false |
| CodeBlock2Expr | 1 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
    private final List<ExternalAgreementLink> externalAgreements = new ArrayList<>();
    @Nullable
    private volatile GuestNotice myGuestNotice = null;

    public TermsOfServiceManagerImpl(@NotNull TermsOfServiceConfig config,
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/AcceptTermsOfServiceController.java`
#### Snippet
```java
        }
        response.sendRedirect(next);
        return null;
    }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TermsOfServiceLogger` has only 'static' members, and lacks a 'private' constructor
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceLogger.java`
#### Snippet
```java
import com.intellij.openapi.diagnostic.Logger;

public class TermsOfServiceLogger {
    public static volatile Logger LOGGER = Logger.getInstance("jetbrains.buildServer.TermsOfService");
}
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `createParentDirs()` declared in class 'com.intellij.openapi.util.io.FileUtil' but referenced via subclass 'jetbrains.buildServer.util.FileUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceConfig.java`
#### Snippet
```java

    private synchronized void extractDefaultConfig() {
        FileUtil.createParentDirs(mySettingsFile);
        FileUtil.copyResourceWithDist(getClass(), "/configDist/" + mySettingsFile.getName(), new File(myConfigDir, mySettingsFile.getName()));
        FileUtil.copyResourceWithDist(getClass(), "/configDist/agreement.html", new File(myConfigDir, "agreement.html"));
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
            String agreementFileParam = params.get("content-file");

            if (StringUtil.isEmptyOrSpaces(agreementId)) {
                TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing agreement id, the agreement is ignored.");
                continue;
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
            }

            if (StringUtil.isEmptyOrSpaces(agreementFileParam)) {
                TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing 'content-file' parameter for agreement id = '" + agreementId + "', the agreement is ignored.");
                continue;
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
                    }

                    if (StringUtil.isEmptyOrSpaces(id)) {
                        TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing consent id, the consent is ignored.");
                        continue;
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
                    }

                    if (StringUtil.isEmptyOrSpaces(html)) {
                        TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing consent text/file, the consent is ignored.");
                        continue;
```

### StaticCallOnSubclass
Static method `pluralize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        String msg = "Configuration was loaded from " + myConfig.getMainConfig() + ", ";
        if (!myAgreements.isEmpty()) {
            msg += myAgreements.size() + " " + StringUtil.pluralize("agreement", myAgreements.size())+ " loaded";
        } else {
            msg += "no agreements were loaded";
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
            String contentFile = params.get("content-file");

            if (StringUtil.isEmptyOrSpaces(title)) {
                TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing guest notice title, the guest notice is ignored.");
                return;
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
            }

            if (StringUtil.isEmptyOrSpaces(contentFile)) {
                TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing 'content-file' parameter for a guest notice, the guest notice is ignored.");
                return;
```

### StaticCallOnSubclass
Static method `parseInt()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
                    String guestNoticeContent = FileUtil.readText(guestNoticeFile, "UTF-8");
                    String cookieName = params.getOrDefault("accepted-cookie-name", "guest-notice-accepted");
                    int cookieDurationMinutes = StringUtil.parseInt(params.getOrDefault("accepted-cookie-max-age-days", "30"), 30);
                    myGuestNotice = new GuestNoticeSettings(title, note, guestNoticeContent, cookieName, cookieDurationMinutes);
                } catch (IOException e) {
```

### StaticCallOnSubclass
Static method `notNullize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        @Override
        public String toString() {
            return "Agreement " + StringUtil.notNullize(params.get("short-name"), "Terms of Service") + " (id = " + id + ")";
        }

```

### StaticCallOnSubclass
Static method `notNullize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        @Override
        public String getNewVersionNote() {
            return StringUtil.notNullize(params.get("new-version-note"),
                    "We've updated the " + getShortName() + " agreement. " +
                    "Review the terms and click \"I agree\" when you're ready to continue using TeamCity.");
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
            String url = ((Element) agreementEl).getAttributeValue("url");

            if (StringUtil.isEmptyOrSpaces(text)) {
                TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing external agreement text, the agreement is ignored.");
                continue;
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
            }

            if (StringUtil.isEmptyOrSpaces(url)) {
                TermsOfServiceLogger.LOGGER.warn("Broken configuration: missing external agreement url, the agreement is ignored.");
                continue;
```

### StaticCallOnSubclass
Static method `notNullize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        @Override
        public String getNewUserNote() {
            return StringUtil.notNullize(params.get("new-user-note"),
                    "You have to accept the " + getShortName() + " agreement before you can continue to use TeamCity. " +
                    "Review the terms and click \"I agree\" when you're ready to proceed.");
```

### StaticCallOnSubclass
Static method `notNullize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        @Override
        public String getShortName() {
            return StringUtil.notNullize(params.get("short-name"), "Terms of Service");
        }

```

### StaticCallOnSubclass
Static method `notNullize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
        @Override
        public String getFullName() {
            return StringUtil.notNullize(params.get("full-name"), "Terms of Service");
        }

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
Inner class `ExternalAgreementLinkSettings` may be 'static'
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceManagerImpl.java`
#### Snippet
```java
    }

    class ExternalAgreementLinkSettings implements TermsOfServiceManager.ExternalAgreementLink {
        private final String text;
        private final String url;
```

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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Element`
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceConfig.java`
#### Snippet
```java
    }

    public void setOnChange(@NotNull Consumer<Element> listener) {
        this.onChangeListener = listener;
    }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceUserProfileExtension.java`
#### Snippet
```java
        }

        form.agreement.getConsents().forEach(consent -> {
            consent.changeAcceptedState(SessionUser.getUser(request), form.consentsState.getOrDefault(consent.getId(), false), WebUtil.getRemoteAddress(request));
        });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `onChangeListener` is accessed in both synchronized and unsynchronized contexts
in `termsOfService-server/src/main/java/jetbrains/buildServer/termsOfService/TermsOfServiceConfig.java`
#### Snippet
```java
    private final File myConfigDir;
    private final File mySettingsFile;
    private Consumer<Element> onChangeListener;

    public TermsOfServiceConfig(@NotNull EventDispatcher<BuildServerListener> myEvents,
```

