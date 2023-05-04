# weblogic-on-azure 
 
# Bad smells
I found 8 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| WebProperties | 8 | false |
## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'javax'
in `javaee/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'faces'
in `javaee/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `javaee/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'javax'
in `coherence/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'faces'
in `coherence/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `coherence/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `javaee/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `coherence/weblogic-cafe/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

