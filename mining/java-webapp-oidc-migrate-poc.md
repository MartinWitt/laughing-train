# java-webapp-oidc-migrate-poc 
 
# Bad smells
I found 119 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 33 | false |
| UnusedAssignment | 19 | false |
| WebProperties | 10 | false |
| JavadocReference | 8 | false |
| FieldMayBeFinal | 8 | false |
| SpringXmlModelInspection | 8 | false |
| ConstantValue | 6 | false |
| UNUSED_IMPORT | 3 | false |
| FieldCanBeLocal | 3 | false |
| DataFlowIssue | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CommentedOutCode | 2 | false |
| IOStreamConstructor | 2 | false |
| DuplicateThrows | 2 | false |
| SpringInjectionValueStyleInspection | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| MalformedFormatString | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| DuplicatedCode | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryReturn | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| DanglingJavadoc | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/webapp/_header.jsp`
#### Snippet
```java
	//forcing SSL here to work around Azure app service java hosting
	//https://stackoverflow.com/questions/30371122/azure-web-app-not-passing-https-scheme-to-java-web-application
	Boolean requireSsl = Boolean.valueOf(request.getSession().getServletContext().getInitParameter("require_ssl"));
	if (requireSsl) { %>
		<script type="text/javascript">
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 3, expected: 2)
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    	hostName = host;
    	dbName = db;
        url = String.format("jdbc:sqlserver://%s:1433;database=%s;authentication=NotSpecified;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, msiClientId);
        Properties info = new Properties();
        String value = getAccessToken(msiEndpoint, msiSecret);
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/webapp/secure/profile.jsp`
#### Snippet
```java
<% 
DBUser user = AuthHelper.GetSessionProfile(request);
if (user==null){ %>
	Your account has not been linked to the system yet.
	<div>
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `mail`
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java

	/**
	 * @param mail The MailNickname to set to this User object.
	 */
	public void setMailNickname(String mailNickname) {
```

### JavadocReference
Cannot resolve symbol `JSONException`
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param errorMsg
     * @return
     * @throws JSONException
     */
    public static JSONObject processResponse(int responseCode, String errorCode, String errorMsg) throws JSONException {
```

### JavadocReference
Cannot resolve symbol `errorCode`
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * 
     * @param responseCode
     * @param errorCode
     * @param errorMsg
     * @return
```

### JavadocReference
Cannot resolve symbol `errorMsg`
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param responseCode
     * @param errorCode
     * @param errorMsg
     * @return
     * @throws JSONException
```

### JavadocReference
Cannot resolve symbol `JSONException`
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param errorMsg
     * @return
     * @throws JSONException
     */
    public static JSONObject processGoodRespStr(int responseCode, String goodRespStr) throws JSONException {
```

### JavadocReference
Cannot resolve symbol `JSONException`
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param responseMsg
     * @return
     * @throws JSONException
     */
    public static JSONObject processBadRespStr(int responseCode, String responseMsg) throws JSONException {
```

### JavadocReference
Cannot resolve symbol `jsonData`
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * This method parses the skip token from a json formatted string.
     * 
     * @param jsonData
     *            The JSON Formatted String.
     * @return The skipToken.
```

### JavadocReference
Cannot resolve symbol `jSonData`
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * within a string.
     * 
     * @param jSonData
     *            The JSON String that holds the collection.
     * @return An JSON Array that would contains all the collection object.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `shutdown` may produce `NullPointerException`
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
            throw e.getCause();
        } finally {
            service.shutdown();
        }

```

### DataFlowIssue
Method invocation `shutdown` may produce `NullPointerException`
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
            throw e.getCause();
        } finally {
            service.shutdown();
        }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.sql.SQLException;`
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
package com.microsoft.aad.oidcpoc;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Enumeration;`
in `src/main/java/com/microsoft/aad/oidcpoc/CoreFilter.java`
#### Snippet
```java

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
```

### UNUSED_IMPORT
Unused import `import java.util.Enumeration;`
in `src/main/java/com/microsoft/aad/oidcpoc/PropertyReading.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
        if (!skipToken.equalsIgnoreCase("")) {
            // Remove the unnecessary prefix from the skip token.
            int index = skipToken.indexOf("$skiptoken=") + (new String("$skiptoken=")).length();
            skipToken = skipToken.substring(index);
        }
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
        if (!deltaLink.equalsIgnoreCase("")) {
            // Remove the unnecessary prefix from the skip token.
            int index = deltaLink.indexOf("deltaLink=") + (new String("deltaLink=")).length();
            deltaLink = deltaLink.substring(index);
        }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param objectType` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
	/**
	 * 
	 * @param objectType
	 */
	public abstract void setObjectType(String objectType);
```

### JavadocDeclaration
`@param objectId` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
	
	/**
	 * @param objectId
	 */
	public abstract void setObjectId(String objectId);
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
	/**
	 * 
	 * @return
	 */
	public abstract String getObjectId();
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
	/**
	 * 
	 * @return
	 */
	public abstract String getDisplayName();
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
	/**
	 * 
	 * @return
	 */
	public abstract String getObjectType();
```

### JavadocDeclaration
`@param displayName` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
	/**
	 * 
	 * @param displayName
	 */
	public abstract void setDisplayName(String displayName);
```

### JavadocDeclaration
`@param responseCode` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * for bad response, whose responseCode is not 200 level
     * 
     * @param responseCode
     * @param errorCode
     * @param errorMsg
```

### JavadocDeclaration
`@param errorCode` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * 
     * @param responseCode
     * @param errorCode
     * @param errorMsg
     * @return
```

### JavadocDeclaration
`@param errorMsg` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param responseCode
     * @param errorCode
     * @param errorMsg
     * @return
     * @throws JSONException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param errorCode
     * @param errorMsg
     * @return
     * @throws JSONException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param errorMsg
     * @return
     * @throws JSONException
     */
    public static JSONObject processResponse(int responseCode, String errorCode, String errorMsg) throws JSONException {
```

### JavadocDeclaration
`@param responseCode` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * for bad response, whose responseCode is not 200 level
     * 
     * @param responseCode
     * @param errorCode
     * @param errorMsg
```

### JavadocDeclaration
`@param errorCode` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * 
     * @param responseCode
     * @param errorCode
     * @param errorMsg
     * @return
```

### JavadocDeclaration
`@param errorMsg` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param responseCode
     * @param errorCode
     * @param errorMsg
     * @return
     * @throws JSONException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param errorCode
     * @param errorMsg
     * @return
     * @throws JSONException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param errorMsg
     * @return
     * @throws JSONException
     */
    public static JSONObject processGoodRespStr(int responseCode, String goodRespStr) throws JSONException {
```

### JavadocDeclaration
`@param responseCode` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * for good response
     * 
     * @param responseCode
     * @param responseMsg
     * @return
```

### JavadocDeclaration
`@param responseMsg` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * 
     * @param responseCode
     * @param responseMsg
     * @return
     * @throws JSONException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param responseCode
     * @param responseMsg
     * @return
     * @throws JSONException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
     * @param responseMsg
     * @return
     * @throws JSONException
     */
    public static JSONObject processBadRespStr(int responseCode, String responseMsg) throws JSONException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     *            The JSON Formatted String.
     * @return The skipToken.
     * @throws Exception
     */
    public static String fetchNextSkiptoken(JSONObject jsonObject) throws Exception {
```

### JavadocDeclaration
`@param jsonObject` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java

    /**
     * @param jsonObject
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
    /**
     * @param jsonObject
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * @param jsonObject
     * @return
     * @throws Exception
     */
    public static String fetchDeltaLink(JSONObject jsonObject) throws Exception {
```

### JavadocDeclaration
`@param jsonObject` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * within a string
     * 
     * @param jsonObject
     * @return An JSON Object that would contains the DirectoryObject.
     * @throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * @param jsonObject
     * @return An JSON Object that would contains the DirectoryObject.
     * @throws Exception
     */
    public static JSONObject fetchDirectoryObjectJSONObject(JSONObject jsonObject) throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     *            The JSON String that holds the collection.
     * @return An JSON Array that would contains all the collection object.
     * @throws Exception
     */
    public static JSONArray fetchDirectoryObjectJSONArray(JSONObject jsonObject) throws Exception {
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
    /**
     * 
     * @param key
     * @param value
     * @return string format of this JSON obje
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * 
     * @param key
     * @param value
     * @return string format of this JSON obje
     * @throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     * @param value
     * @return string format of this JSON obje
     * @throws Exception
     */
    public static String createJSONString(String key, String value) throws Exception {
```

### JavadocDeclaration
`@param session` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
     * delete it from session - should be used only once
     *
     * @param session
     * @param state
     * @throws Exception
```

### JavadocDeclaration
`@param state` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
     *
     * @param session
     * @param state
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
     * @param session
     * @param state
     * @throws Exception
     */
    private StateData validateState(HttpSession session, String state) throws Exception {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `groups` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
	
	// The groups holds a list of group entity this user belongs to. 
	private ArrayList<Group> groups;
	
	// The roles holds a list of role entity this user belongs to. 
```

### FieldMayBeFinal
Field `roles` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
	
	// The roles holds a list of role entity this user belongs to. 
	private ArrayList<Group> roles;
	
	
```

### FieldMayBeFinal
Field `directReports` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
	
	// The directReports holds a list of directReports
	private ArrayList<User> directReports;
	
	// The groups holds a list of group entity this user belongs to. 
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
public class JSONHelper {

    private static Logger logger = Logger.getLogger(JSONHelper.class);

    JSONHelper() {
```

### FieldMayBeFinal
Field `nonce` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java

    private class StateData {
        private String nonce;
        private Date expirationDate;

```

### FieldMayBeFinal
Field `expirationDate` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    private class StateData {
        private String nonce;
        private Date expirationDate;

        public StateData(String nonce, Date expirationDate) {
```

### FieldMayBeFinal
Field `authority` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    private String clientSecret = "";
    private String tenant = "";
    private String authority;
    public boolean is_b2c;
    private String policy_susi="";
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    Connection connection = null;
    
    private static Logger logger = Logger.getLogger(db.class);

    public db(String host, String db, String msiClientId) throws Exception {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
		managerDisplayname = null;
	}
//	
//	public User(String displayName, String objectId){
//		setDisplayName(displayName);
```

### CommentedOutCode
Commented out code (31 lines)
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
 * access methods to set or get the displayName and the ObjectId of this entry.
 */
//class DirectReport extends User{
//
//	private String displayName;
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'servlet'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'view'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class 'InternalResourceViewResolver'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve property 'prefix'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
		</property>
```

### SpringXmlModelInspection
Cannot resolve property 'suffix'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
			<value>/</value>
		</property>
		<property name="suffix">
			<value>.jsp</value>
		</property>
```

### SpringXmlModelInspection
Cannot resolve location '/WEB-INF/resources/'
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	</bean>
	
	<mvc:resources mapping = "/resources/**" location = "/WEB-INF/resources/" />
	<mvc:annotation-driven/>
</beans>
```

## RuleId[id=WebProperties]
### WebProperties
'com.microsoft.aad.oidcpoc.BasicFilter' is not assignable to 'javax.servlet.Filter,javax.servlet.Filter'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>BasicFilter</filter-name>
		<filter-class>com.microsoft.aad.oidcpoc.BasicFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
'com.microsoft.aad.oidcpoc.CoreFilter' is not assignable to 'javax.servlet.Filter,javax.servlet.Filter'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>CoreFilter</filter-name>
		<filter-class>com.microsoft.aad.oidcpoc.CoreFilter</filter-class>
	</filter>
	<filter-mapping>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>2</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'web'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>2</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>2</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class 'DispatcherServlet'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>2</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'web'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'context'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class 'ContextLoaderListener'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
        	ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
            	//we have a match
        		res = new DBUser();
        		res.UserId = resultSet.getInt("UserId");
        		res.Email = resultSet.getNString("Email");
        		res.FName = resultSet.getNString("FName");
        		res.LName = resultSet.getNString("LName");
        		res.UniqueId = resultSet.getNString("UniqueId");
            }
    		if (resultSet.next()) {
    			//sanity check - we had more than one match
    			res = null;
    		}
      		connection.close();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/microsoft/aad/oidcpoc/PropertyReading.java`
#### Snippet
```java
        final Properties localProps = new Properties();
        try {    
        	configProps.load(new FileInputStream(configPropPath));
        	localProps.load(new FileInputStream(localPropPath));
        } catch (final IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/microsoft/aad/oidcpoc/PropertyReading.java`
#### Snippet
```java
        try {    
        	configProps.load(new FileInputStream(configPropPath));
        	localProps.load(new FileInputStream(localPropPath));
        } catch (final IOException e) {
            e.printStackTrace();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `uri` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
    public static String GetReplyUri(HttpServletRequest request) {
    	SchemeDTO scheme = GetScheme(request);
        String uri = scheme.Scheme
                + "://"
                + request.getServerName()
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.lang.Exception', in the throws list already.
in `src/main/java/com/microsoft/aad/oidcpoc/LoginController.java`
#### Snippet
```java

	@RequestMapping(value="/secure/linkaccounts", method = RequestMethod.POST )
	public String establishLink(ModelMap model, HttpServletRequest httpRequest) throws ClassNotFoundException, Exception {
		String userName = httpRequest.getParameter("j_username");
		String password = httpRequest.getParameter("j_password");
```

### DuplicateThrows
Duplicate throws
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    
    private void setSessionPrincipal(HttpServletRequest httpRequest,
                                     AuthenticationResult result, HttpServletResponse httpResponse) throws Exception, Exception {
        httpRequest.getSession().setAttribute(AuthHelper.PRINCIPAL_SESSION_NAME, result);
        
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
                httpResponse.sendRedirect(((HttpServletRequest) httpRequest)
                        .getContextPath() + "/secure/linkaccounts");
                return;
            }
        }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`authData.getExpiresOnDate().before(new Date()) ? true : false` can be simplified to 'authData.getExpiresOnDate().before(new Date())'
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    public boolean isAuthDataExpired(HttpServletRequest httpRequest) {
        AuthenticationResult authData = AuthHelper.getAuthSessionObject(httpRequest);
        return authData.getExpiresOnDate().before(new Date()) ? true : false;
    }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `StateData` may be 'static'
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    }

    private class StateData {
        private String nonce;
        private Date expirationDate;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java


/**
 * The Class DirectReports Holds the essential data for a single DirectReport entry. Namely,
 * it holds the displayName and the objectId of the direct entry. Furthermore, it provides the
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `res` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/PropertyReading.java`
#### Snippet
```java
        //Enumeration<String> name = ctx.getInitParameterNames();
        
        String res=null;
        for (String prop : names)
        {
```

### UnusedAssignment
Variable `reader` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
    public static String getResponseStringFromConn(HttpURLConnection conn, boolean isSuccess) throws IOException {

        BufferedReader reader = null;
        if (isSuccess) {
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
```

### UnusedAssignment
Variable `line` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        }
        StringBuffer stringBuffer = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line);
```

### UnusedAssignment
Variable `bytesRead` initializer `0` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];
        int bytesRead = 0;

        while ((bytesRead = is.read(buff, 0, buff.length)) != -1) {
```

### UnusedAssignment
Variable `line` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        // Get the message response from the server.
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = "";
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
```

### UnusedAssignment
Variable `claims` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
    
    public static Map<String, Object> GetClaims(String idTokenString) {
        Map<String, Object> claims = null;
    	try {
			claims = JWTParser.parse(idTokenString).getJWTClaimsSet().getAllClaims();
```

### UnusedAssignment
Variable `database` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
    private static db GetDB(HttpServletRequest request) throws Exception {
    	
    	db database = null;
    	String msiEndpoint = getSetting(request, "MSI_ENDPOINT");
    	
```

### UnusedAssignment
Variable `skipToken` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     */
    public static String fetchNextSkiptoken(JSONObject jsonObject) throws Exception {
        String skipToken = "";
        // Parse the skip token out of the string.
        skipToken = jsonObject.optJSONObject("responseMsg").optString("odata.nextLink");
```

### UnusedAssignment
Variable `deltaLink` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     */
    public static String fetchDeltaLink(JSONObject jsonObject) throws Exception {
        String deltaLink = "";
        // Parse the skip token out of the string.
        deltaLink = jsonObject.optJSONObject("responseMsg").optString("aad.deltaLink");
```

### UnusedAssignment
Variable `jObj` initializer `new JSONObject()` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     */
    public static JSONObject fetchDirectoryObjectJSONObject(JSONObject jsonObject) throws Exception {
        JSONObject jObj = new JSONObject();
        jObj = jsonObject.optJSONObject("responseMsg");
        return jObj;
```

### UnusedAssignment
Variable `jsonArray` initializer `new JSONArray()` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
     */
    public static JSONArray fetchDirectoryObjectJSONArray(JSONObject jsonObject) throws Exception {
        JSONArray jsonArray = new JSONArray();
        jsonArray = jsonObject.optJSONObject("responseMsg").optJSONArray("value");
        return jsonArray;
```

### UnusedAssignment
Variable `redirectUrl` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    private String getRedirectUrl(String currentUri, String state, String nonce)
            throws UnsupportedEncodingException {
    	String redirectUrl = null;
    	if (is_b2c) {
            redirectUrl = authority
```

### UnusedAssignment
Variable `clientSecret` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    public static final String FAILED_TO_VALIDATE_MESSAGE = "Failed to validate data received from Authorization service - ";
    private String clientId = "";
    private String clientSecret = "";
    private String tenant = "";
    private String authority;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
            String refreshToken) throws Throwable {
        AuthenticationContext context;
        AuthenticationResult result = null;
        ExecutorService service = null;
        try {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
                clientSecret);
        AuthenticationContext context;
        AuthenticationResult result = null;
        ExecutorService service = null;
        try {
```

### UnusedAssignment
Variable `clientId` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    public static final Integer STATE_TTL = 3600;
    public static final String FAILED_TO_VALIDATE_MESSAGE = "Failed to validate data received from Authorization service - ";
    private String clientId = "";
    private String clientSecret = "";
    private String tenant = "";
```

### UnusedAssignment
Variable `tenant` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    private String clientId = "";
    private String clientSecret = "";
    private String tenant = "";
    private String authority;
    public boolean is_b2c;
```

### UnusedAssignment
Variable `policy_susi` initializer `""` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
    private String authority;
    public boolean is_b2c;
    private String policy_susi="";

    public AuthFlow(String ClientID, String ClientSecret, String Tenant, String Authority, String B2CProfile) {
```

### UnusedAssignment
Variable `url` initializer `String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCerti...` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String user;
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `request` is always 'null'
in `src/main/java/com/microsoft/aad/oidcpoc/CoreFilter.java`
#### Snippet
```java
            }
        }
        chain.doFilter(request, response);
    }

```

### ConstantValue
Value `request` is always 'null'
in `src/main/java/com/microsoft/aad/oidcpoc/BasicFilter.java`
#### Snippet
```java
            }
        }
        chain.doFilter(request, response);
    }

```

### ConstantValue
Value `hostName` is always 'null'
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String user;
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
```

### ConstantValue
Value `dbName` is always 'null'
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String user;
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
```

### ConstantValue
Value `user` is always 'null'
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String user;
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
```

### ConstantValue
Value `password` is always 'null'
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String user;
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
	
	// The groups holds a list of group entity this user belongs to. 
	private ArrayList<Group> groups;
	
	// The roles holds a list of role entity this user belongs to. 
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
	
	// The roles holds a list of role entity this user belongs to. 
	private ArrayList<Group> roles;
	
	
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/aad/oidcpoc/User.java`
#### Snippet
```java
	
	// The directReports holds a list of directReports
	private ArrayList<User> directReports;
	
	// The groups holds a list of group entity this user belongs to. 
```

## RuleId[id=SpringInjectionValueStyleInspection]
### SpringInjectionValueStyleInspection
Usage of explicit element
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
		</property>
		<property name="suffix">
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
		</property>
		<property name="suffix">
			<value>.jsp</value>
		</property>
	</bean>
```

