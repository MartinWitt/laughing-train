# java-webapp-oidc-migrate-poc 
 
# Bad smells
I found 70 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedAssignment | 19 | false |
| ThrowablePrintStackTrace | 9 | false |
| ConstantValue | 6 | false |
| UNUSED_IMPORT | 3 | false |
| NestedAssignment | 3 | false |
| EmptyMethod | 3 | false |
| ReturnNull | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| DataFlowIssue | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CommentedOutCode | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| StringBufferReplaceableByStringBuilder | 2 | false |
| DuplicateThrows | 2 | false |
| RedundantSuppression | 2 | false |
| MalformedFormatString | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| RedundantFieldInitialization | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryReturn | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| UtilityClassWithPublicConstructor | 1 | false |
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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `JSONHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
 * 
 */
public class JSONHelper {

    private static Logger logger = Logger.getLogger(JSONHelper.class);
```

### UtilityClassWithoutPrivateConstructor
Class `HttpClientHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
 * 
 */
public class HttpClientHelper {

    public HttpClientHelper() {
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        int bytesRead = 0;

        while ((bytesRead = is.read(buff, 0, buff.length)) != -1) {
            baos.write(buff, 0, bytesRead);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        StringBuffer stringBuffer = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        String line = "";
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
        }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/PropertyReading.java`
#### Snippet
```java
        	localProps.load(new FileInputStream(localPropPath));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return claims;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj.toString();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
	    }
	    catch (Exception e) {
	            e.printStackTrace();
	    }
		return res;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
	    }
	    catch (Exception e) {
	            e.printStackTrace();
	    }
		return res;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
```

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DirectoryObject()` of an abstract class should not be declared 'public'
in `src/main/java/com/microsoft/aad/oidcpoc/DirectoryObject.java`
#### Snippet
```java
public abstract class DirectoryObject {
	
	public DirectoryObject() {
		super();
	}
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/com/microsoft/aad/oidcpoc/BasicFilter.java`
#### Snippet
```java
		_flow.is_b2c = (AuthHelper.getSetting(ctx,  "is_b2c").equals("true"));
    }
    public void destroy() {

    }
```

### EmptyMethod
The method is empty
in `src/main/java/com/microsoft/aad/oidcpoc/CoreFilter.java`
#### Snippet
```java
    }

	public void destroy() {

    }
```

### EmptyMethod
The method is empty
in `src/main/java/com/microsoft/aad/oidcpoc/PropertyReading.java`
#### Snippet
```java

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
    private static Logger logger = Logger.getLogger(db.class);
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `msiEndpoint`
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    private String getAccessToken(String msiEndpoint, String msiSecret) throws IOException, JSONException {
    	
    	msiEndpoint += "?resource=https://vault.azure.net&api-version=2017-09-01";
    	URL url = new URL(msiEndpoint);
    	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
		DBUser user = database.ValidateUser(userName, password);
		if (user == null) {
			return null;
		} else {
			//need to create authenticated session
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/aad/oidcpoc/AuthHelper.java`
#### Snippet
```java
        HttpSession session = request.getSession();
        Object usrblob = session.getAttribute(AuthHelper.USEROBJ_SESSION_NAME);
        return (usrblob!=null) ? (DBUser)usrblob : null;
    }
    
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`param.length() == 0` can be replaced with 'param.isEmpty()'
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
                String param = request.getParameter(fieldName);
                if (allFieldStringList.contains(fieldName)) {
                    if (param == null || param.length() == 0) {
                        if (!fieldName.equalsIgnoreCase("password")) {
                            obj.put(fieldName, JSONObject.NULL);
```

### SizeReplaceableByIsEmpty
`deltaLink.length() == 0` can be replaced with 'deltaLink.isEmpty()'
in `src/main/java/com/microsoft/aad/oidcpoc/JSONHelper.java`
#### Snippet
```java
        // Parse the skip token out of the string.
        deltaLink = jsonObject.optJSONObject("responseMsg").optString("aad.deltaLink");
        if (deltaLink == null || deltaLink.length() == 0) {
            deltaLink = jsonObject.optJSONObject("responseMsg").optString("aad.nextLink");
            logger.info("deltaLink empty, nextLink ->" + deltaLink);
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer stringBuffer` may be declared as 'StringBuilder'
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
            reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuffer stringBuffer = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer stringBuffer` may be declared as 'StringBuilder'
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = "";
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
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
Variable `url` initializer `String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCerti...` is redundant
in `src/main/java/com/microsoft/aad/oidcpoc/db.java`
#### Snippet
```java
    String user;
    String password;
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    
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

## RuleId[id=ConstantValue]
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private StateData removeStateFromSession(HttpSession session, String state) {
        Map<String, StateData> states = (Map<String, StateData>) session.getAttribute(STATES);
        if (states != null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/microsoft/aad/oidcpoc/AuthFlow.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void storeStateInSession(HttpSession session, String state, String nonce) {
        if (session.getAttribute(STATES) == null) {
            session.setAttribute(STATES, new HashMap<String, StateData>());
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `HttpClientHelper` has only 'static' members, and a 'public' constructor
in `src/main/java/com/microsoft/aad/oidcpoc/HttpClientHelper.java`
#### Snippet
```java
 * 
 */
public class HttpClientHelper {

    public HttpClientHelper() {
```

