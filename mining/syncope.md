# syncope 
 
# Bad smells
I found 153 bad smells with 153 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 153 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/am/console/src/main/java/org/apache/syncope/client/console/panels/SAML2IdPEntityDirectoryPanel.java`
#### Snippet
```java
getDefaultModelObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/am/console/src/main/java/org/apache/syncope/client/console/panels/SAML2SPEntityDirectoryPanel.java`
#### Snippet
```java
getDefaultModelObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idm/console/src/main/java/org/apache/syncope/client/console/panels/ConnidLocations.java`
#### Snippet
```java
rowModel.getObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/panels/AttrListDirectoryPanel.java`
#### Snippet
```java
rowModel.getObject().getValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/panels/ParametersDirectoryPanel.java`
#### Snippet
```java
rowModel.getObject().getValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/panels/SchemaTypeWizardBuilder.java`
#### Snippet
```java
entry.getLeft().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/panels/search/SearchClausePanel.java`
#### Snippet
```java
object.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/panels/search/SearchClausePanel.java`
#### Snippet
```java
object.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/panels/search/SearchClausePanel.java`
#### Snippet
```java
getDisplayValue(object).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/saml2sp4ui/client-console/src/main/java/org/apache/syncope/client/console/pages/SAML2SPBeforeLogout.java`
#### Snippet
```java
Session.get().getAttribute(SAML2SP4UIConstants.SAML2SP4UI_IDP_ENTITY_ID).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/scimv2/client-console/src/main/java/org/apache/syncope/client/console/pages/SCIMConfPage.java`
#### Snippet
```java
result.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/policies/PolicyModalPanelBuilder.java`
#### Snippet
```java
object.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idm/console/src/main/java/org/apache/syncope/client/console/rest/ConnectorRestClient.java`
#### Snippet
```java
SyncopeConsoleSession.get().getLocale().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idm/console/src/main/java/org/apache/syncope/client/console/rest/ConnectorRestClient.java`
#### Snippet
```java
SyncopeConsoleSession.get().getLocale().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idm/console/src/main/java/org/apache/syncope/client/console/rest/ConnectorRestClient.java`
#### Snippet
```java
SyncopeConsoleSession.get().getLocale().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idm/console/src/main/java/org/apache/syncope/client/console/rest/ConnectorRestClient.java`
#### Snippet
```java
SyncopeConsoleSession.get().getLocale().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/wicket/extensions/markup/html/repeater/data/table/CollectionPanel.java`
#### Snippet
```java
item.getModelObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/widgets/AlertWidget.java`
#### Snippet
```java
getDefaultModelObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/console/src/main/java/org/apache/syncope/client/console/tasks/CrontabPanel.java`
#### Snippet
```java
object.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/BaseLogin.java`
#### Snippet
```java
parameters.get(Constants.NOTIFICATION_MSG_PARAM).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/BaseLogin.java`
#### Snippet
```java
parameters.get(Constants.NOTIFICATION_LEVEL_PARAM).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxCheckBoxPanel.java`
#### Snippet
```java
Boolean.TRUE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxCheckBoxPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxCheckBoxPanel.java`
#### Snippet
```java
object.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxCheckBoxPanel.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxCheckBoxPanel.java`
#### Snippet
```java
Boolean.TRUE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxCheckBoxPanel.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
object.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/AjaxSpinnerFieldPanel.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/BinaryFieldDownload.java`
#### Snippet
```java
getCallbackUrl().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/DateFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/DateFieldPanel.java`
#### Snippet
```java
list.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/DateFieldPanel.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/common-ui/src/main/java/org/apache/syncope/client/ui/commons/markup/html/form/DateFieldPanel.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/oidcc4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/oidcc4ui/BeforeLogoutResource.java`
#### Snippet
```java
request.getRequestURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/oidcc4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/oidcc4ui/CodeConsumerResource.java`
#### Snippet
```java
request.getRequestURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/oidcc4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/oidcc4ui/CodeConsumerResource.java`
#### Snippet
```java
Session.get().getAttribute(OIDCConstants.OP).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/oidcc4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/oidcc4ui/LoginResource.java`
#### Snippet
```java
attributes.getRequest().getQueryParameters().getParameterValue(OIDCC4UIConstants.PARAM_OP).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/oidcc4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/oidcc4ui/LoginResource.java`
#### Snippet
```java
request.getRequestURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/saml2sp4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/saml2sp4ui/AbstractSAML2SP4UIResource.java`
#### Snippet
```java
request.getRequestURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/saml2sp4ui/client-common-ui/src/main/java/org/apache/syncope/client/ui/commons/resources/saml2sp4ui/LoginResource.java`
#### Snippet
```java
attributes.getRequest().getQueryParameters().getParameterValue(SAML2SP4UIConstants.PARAM_IDP).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/enduser/src/main/java/org/apache/syncope/client/enduser/pages/BasePage.java`
#### Snippet
```java
parameters.get("domain").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/enduser/src/main/java/org/apache/syncope/client/enduser/pages/SelfConfirmPasswordReset.java`
#### Snippet
```java
parameters.get("token").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/enduser/src/main/java/org/apache/syncope/client/enduser/pages/SelfRegistration.java`
#### Snippet
```java
parameters.get(NEW_USER_PARAM).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/enduser/src/main/java/org/apache/syncope/client/enduser/pages/SelfResult.java`
#### Snippet
```java
parameters.get(Constants.NOTIFICATION_TITLE_PARAM).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/client/idrepo/enduser/src/main/java/org/apache/syncope/client/enduser/pages/SelfResult.java`
#### Snippet
```java
parameters.get(Constants.NOTIFICATION_MSG_PARAM).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/saml2sp4ui/client-enduser/src/main/java/org/apache/syncope/client/enduser/pages/SAML2SPBeforeLogout.java`
#### Snippet
```java
Session.get().getAttribute(SAML2SP4UIConstants.SAML2SP4UI_IDP_ENTITY_ID).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/to/OIDCJWKSTO.java`
#### Snippet
```java
new ToStringBuilder(this).append("key", key).append("json", json).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/to/SAML2EntityTO.java`
#### Snippet
```java
new ToStringBuilder(this).append("key", key).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/wa/GoogleMfaAuthAccount.java`
#### Snippet
```java
new ToStringBuilder(this).append("name", name).append("secretKey", secretKey).append("id", id).append("scratchCodes", scratchCodes).append("registrationDate", registrationDate).append("validationCode", validationCode).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/wa/GoogleMfaAuthToken.java`
#### Snippet
```java
new ToStringBuilder(this).append("token", otp).append("issueDate", issueDate).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/wa/ImpersonationAccount.java`
#### Snippet
```java
new ToStringBuilder(this).append("impersonated", impersonated).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/wa/U2FDevice.java`
#### Snippet
```java
new ToStringBuilder(this).append("record", record).append("id", id).append("issueDate", issueDate).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/wa/WebAuthnAccount.java`
#### Snippet
```java
new ToStringBuilder(this).append("credentials", credentials).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/am/lib/src/main/java/org/apache/syncope/common/lib/wa/WebAuthnDeviceCredential.java`
#### Snippet
```java
new ToStringBuilder(this).append("records", json).append("identifier", identifier).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/common/idrepo/lib/src/main/java/org/apache/syncope/common/lib/search/SyncopeFiqlParser.java`
#### Snippet
```java
tvalue.getObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/idm/logic/src/main/java/org/apache/syncope/core/logic/ConnectorLogic.java`
#### Snippet
```java
uri.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/oidcc4ui/logic/src/main/java/org/apache/syncope/core/logic/OIDCC4UILogic.java`
#### Snippet
```java
idToken.getClaim(item.getExtAttrName()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/scimv2/logic/src/main/java/org/apache/syncope/core/logic/SCIMDataBinder.java`
#### Snippet
```java
JexlUtils.evaluate(filter2JexlExpression(op.getPath().getFilter()), new MapContext(Map.of("type", conf.getType().name()))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/scimv2/logic/src/main/java/org/apache/syncope/core/logic/SCIMDataBinder.java`
#### Snippet
```java
JexlUtils.evaluate(filter2JexlExpression(op.getPath().getFilter()), new MapContext(Map.of("type", addressConf.getType().name()))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/idrepo/rest-cxf/src/test/java/org/apache/syncope/core/rest/cxf/service/AnyObjectServiceTest.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/idrepo/rest-cxf/src/test/java/org/apache/syncope/core/rest/cxf/service/AnyObjectServiceTest.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/idrepo/rest-cxf/src/test/java/org/apache/syncope/core/rest/cxf/service/AnyObjectServiceTest.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/idrepo/rest-cxf/src/main/java/org/apache/syncope/core/rest/cxf/batch/BatchItemRequest.java`
#### Snippet
```java
batchItem.getHeaders().get(HttpHeaders.CONTENT_TYPE).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/idrepo/rest-cxf/src/main/java/org/apache/syncope/core/rest/cxf/batch/BatchItemRequest.java`
#### Snippet
```java
batchItem.getHeaders().get(HttpHeaders.CONTENT_LENGTH).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-api/src/main/java/org/apache/syncope/core/persistence/api/attrvalue/validation/InvalidEntityException.java`
#### Snippet
```java
violation.getPropertyPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-api/src/main/java/org/apache/syncope/core/persistence/api/search/FilterVisitor.java`
#### Snippet
```java
sc.getStatement().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-api/src/main/java/org/apache/syncope/core/persistence/api/search/SearchCondVisitor.java`
#### Snippet
```java
sc.getStatement().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractAnyDAO.java`
#### Snippet
```java
actualKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractAnyDAO.java`
#### Snippet
```java
actualKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractAnyDAO.java`
#### Snippet
```java
actualKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractAnyDAO.java`
#### Snippet
```java
actualKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/JPAAnyObjectDAO.java`
#### Snippet
```java
groupKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/JPAAnySearchDAO.java`
#### Snippet
```java
leftInfo.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/JPAEntityCacheDAO.java`
#### Snippet
```java
queryKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/JPAUserDAO.java`
#### Snippet
```java
roleKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/main/java/org/apache/syncope/core/persistence/jpa/dao/JPAUserDAO.java`
#### Snippet
```java
groupKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/test/java/org/apache/syncope/core/persistence/jpa/outer/GroupTest.java`
#### Snippet
```java
actualKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/persistence-jpa/src/test/java/org/apache/syncope/core/persistence/jpa/outer/GroupTest.java`
#### Snippet
```java
actualKey.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-api/src/main/java/org/apache/syncope/core/provisioning/api/jexl/JexlUtils.java`
#### Snippet
```java
evaluate(mandatoryCondition, jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-api/src/main/java/org/apache/syncope/core/provisioning/api/serialization/GuardedStringSerializer.java`
#### Snippet
```java
field.get(source).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-api/src/main/java/org/apache/syncope/core/provisioning/api/serialization/SyncTokenSerializer.java`
#### Snippet
```java
source.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-api/src/test/java/org/apache/syncope/core/provisioning/api/serialization/SyncTokenSerializerTest.java`
#### Snippet
```java
source.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/DefaultDerAttrHandler.java`
#### Snippet
```java
JexlUtils.evaluate(schema.getExpression(), jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/DefaultDerAttrHandler.java`
#### Snippet
```java
JexlUtils.evaluate(schema.getExpression(), jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/DefaultMappingManager.java`
#### Snippet
```java
JexlUtils.evaluate(connObjectLink, jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/DefaultMappingManager.java`
#### Snippet
```java
JexlUtils.evaluate(connObjectLink, jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/DefaultMappingManager.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/job/AbstractSchedTaskJobDelegate.java`
#### Snippet
```java
SecureRandomUtils.generateRandomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/propagation/AzurePropagationActions.java`
#### Snippet
```java
AttributeUtil.find(getEmailAttrName(), attrs).getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/propagation/GoogleAppsPropagationActions.java`
#### Snippet
```java
AttributeUtil.find(getEmailAttrName(), attrs).getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/propagation/LDAPMembershipPropagationActions.java`
#### Snippet
```java
JexlUtils.evaluate(connObjectLinkTemplate, jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/propagation/LDAPMembershipPropagationActions.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/propagation/LDAPMembershipPropagationActions.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/propagation/LDAPMembershipPropagationActions.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/pushpull/DefaultPullCorrelationRule.java`
#### Snippet
```java
attr.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/pushpull/DefaultPullCorrelationRule.java`
#### Snippet
```java
attr.getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/pushpull/DefaultPushCorrelationRule.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/pushpull/LDAPMembershipPullActions.java`
#### Snippet
```java
membValue.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/pushpull/stream/CSVStreamConnector.java`
#### Snippet
```java
attr.getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/pushpull/stream/CSVStreamConnector.java`
#### Snippet
```java
attr.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/utils/ConnObjectUtils.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/utils/TemplateUtils.java`
#### Snippet
```java
JexlUtils.evaluate(value, jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/utils/TemplateUtils.java`
#### Snippet
```java
JexlUtils.evaluate(template.getRealm(), jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/utils/TemplateUtils.java`
#### Snippet
```java
JexlUtils.evaluate(((UserTO) (template)).getUsername(), jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/utils/TemplateUtils.java`
#### Snippet
```java
JexlUtils.evaluate(((UserTO) (template)).getPassword(), jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/provisioning-java/src/main/java/org/apache/syncope/core/provisioning/java/utils/TemplateUtils.java`
#### Snippet
```java
JexlUtils.evaluate(((GroupTO) (template)).getName(), jexlContext).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/self-keymaster-starter/src/main/java/org/apache/syncope/core/keymaster/rest/security/SelfKeymasterUsernamePasswordAuthenticationProvider.java`
#### Snippet
```java
authentication.getCredentials().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/starter/src/main/java/org/apache/syncope/core/starter/actuate/DefaultSyncopeCoreInfoContributor.java`
#### Snippet
```java
bean.getThreadPoolExecutor().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/spring/src/main/java/org/apache/syncope/core/spring/security/AuthDataAccessor.java`
#### Snippet
```java
authentication.getCredentials().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/spring/src/main/java/org/apache/syncope/core/spring/security/UsernamePasswordAuthenticationProvider.java`
#### Snippet
```java
authentication.getCredentials().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/spring/src/main/java/org/apache/syncope/core/spring/security/UsernamePasswordAuthenticationProvider.java`
#### Snippet
```java
authentication.getCredentials().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/spring/src/main/java/org/apache/syncope/core/spring/security/UsernamePasswordAuthenticationProvider.java`
#### Snippet
```java
authentication.getCredentials().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/core/spring/src/main/java/org/apache/syncope/core/spring/security/UsernamePasswordAuthenticationProvider.java`
#### Snippet
```java
authentication.getPrincipal().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/flowable/flowable-bpmn/src/main/java/org/apache/syncope/core/flowable/impl/FlowableDeployUtils.java`
#### Snippet
```java
new BpmnJsonConverter().convertToJson(bpmnModel).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/ext/scimv2/scim-rest-cxf/src/main/java/org/apache/syncope/ext/scimv2/cxf/service/SCIMGroupServiceImpl.java`
#### Snippet
```java
JexlUtils.evaluate(SCIMDataBinder.filter2JexlExpression(op.getPath().getFilter()), new MapContext(Map.of("value", member))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/build-tools/src/main/java/org/apache/syncope/fit/buildtools/cxf/ProvisioningImpl.java`
#### Snippet
```java
attr.getValues().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/build-tools/src/main/java/org/apache/syncope/fit/buildtools/cxf/ProvisioningImpl.java`
#### Snippet
```java
attr.getValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/build-tools/src/main/java/org/apache/syncope/fit/buildtools/cxf/ProvisioningImpl.java`
#### Snippet
```java
operand.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/build-tools/src/main/java/org/apache/syncope/fit/buildtools/cxf/ProvisioningImpl.java`
#### Snippet
```java
attr.getValues().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/build-tools/src/main/java/org/apache/syncope/fit/buildtools/cxf/ProvisioningImpl.java`
#### Snippet
```java
attr.getValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/build-tools/src/main/java/org/apache/syncope/fit/buildtools/cxf/ProvisioningImpl.java`
#### Snippet
```java
attr.getValues().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/AbstractNotificationTaskITCase.java`
#### Snippet
```java
message.getFrom()[0].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BatchITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BatchITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BatchITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BatchITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BatchITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BatchITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/BpmnProcessITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/MailTemplateITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/MailTemplateITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/MailTemplateITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/PropagationTaskITCase.java`
#### Snippet
```java
attr.getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/RESTITCase.java`
#### Snippet
```java
response.getMediaType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/main/java/org/apache/syncope/fit/core/reference/LinkedAccountSamplePullCorrelationRule.java`
#### Snippet
```java
email.getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/main/java/org/apache/syncope/fit/core/reference/LinkedAccountSamplePullCorrelationRule.java`
#### Snippet
```java
firstName.getValue().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/wa/GoogleMfaAuthAccountITCase.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/wa/GoogleMfaAuthTokenITCase.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/wa/U2FRegistrationITCase.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/fit/core-reference/src/test/java/org/apache/syncope/fit/core/wa/WebAuthnAccountITCase.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/sra/src/main/java/org/apache/syncope/sra/SyncopeSRAWebExceptionHandler.java`
#### Snippet
```java
HttpStatus.NOT_FOUND.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/sra/src/test/java/org/apache/syncope/sra/ActuatorTest.java`
#### Snippet
```java
ApiVersion.V3.getProducedMimeType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/sra/src/main/java/org/apache/syncope/sra/actuate/SRASessions.java`
#### Snippet
```java
ctx.getAuthentication().getPrincipal().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/sra/src/main/java/org/apache/syncope/sra/filters/LinkRewriteGatewayFilterFactory.java`
#### Snippet
```java
decorator.getHeaders().getContentType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-syncope27467679457979354849997237019405921225/sra/src/main/java/org/apache/syncope/sra/security/pac4j/ServerWebExchangeContext.java`
#### Snippet
```java
value.toString()
```

