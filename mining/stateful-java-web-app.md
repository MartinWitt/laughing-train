# stateful-java-web-app 
 
# Bad smells
I found 11 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 3 | false |
| WebProperties | 3 | false |
| DanglingJavadoc | 2 | false |
| WrongPackageStatement | 2 | false |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
         */

        out.println(buffer.toString());

        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
        }

        /**
         * WEBSITE_INSTANCE_ID = 33037ab24fcfe9052fca7b7786dc73bd9e70878172511068a5b343b2afee0f8b
         * WEBSITE_OWNER_NAME = 343129b6-cc9a-49f8-8b05-fbebbc594bd1+e2e-java-se-WestUSwebspace
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
        out.println("<hr>");

        /**
        Properties properties = System.getProperties();
        buffer = new StringBuffer();
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.microsoft.webapp.samples' does not correspond to the file path 'main.java.com.microsoft.webapp.samples'
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
 */

package com.microsoft.webapp.samples;

import java.io.IOException;
```

### WrongPackageStatement
Package name 'com.microsoft.webapp.samples' does not correspond to the file path 'main.java.com.microsoft.webapp.samples'
in `src/main/java/com/microsoft/webapp/samples/PageVisits.java`
#### Snippet
```java
 */

package com.microsoft.webapp.samples;

import java.io.IOException;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
     * @param request Servlet Request
     * @param response Servlet Response
     * @throws ServletException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
     * @param response Servlet Response
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
     * that contains configuration
     * information for this servlet
     * @throws ServletException
     */
    public void init(ServletConfig config) throws ServletException {
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'microsoft'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>TrackerServlet</servlet-name>
        <servlet-class>com.microsoft.webapp.samples.TrackerServlet</servlet-class>
        <init-param>
            <param-name>pageTitle</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>TrackerServlet</servlet-name>
        <servlet-class>com.microsoft.webapp.samples.TrackerServlet</servlet-class>
        <init-param>
            <param-name>pageTitle</param-name>
```

### WebProperties
Cannot resolve class or package 'samples'
in `src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>TrackerServlet</servlet-name>
        <servlet-class>com.microsoft.webapp.samples.TrackerServlet</servlet-class>
        <init-param>
            <param-name>pageTitle</param-name>
```

