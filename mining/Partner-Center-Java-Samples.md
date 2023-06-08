# Partner-Center-Java-Samples 
 
# Bad smells
I found 33 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| WebProperties | 18 | false |
| SpringXmlModelInspection | 13 | false |
| SpringInjectionValueStyleInspection | 2 | false |
## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve package com
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context 
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
```

### SpringXmlModelInspection
Cannot resolve package microsoft
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context 
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
```

### SpringXmlModelInspection
Cannot resolve package store
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context 
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
```

### SpringXmlModelInspection
Cannot resolve package samples
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context 
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
```

### SpringXmlModelInspection
Cannot resolve package partnerconsent
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context 
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'servlet'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'view'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve class 'InternalResourceViewResolver'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
				http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
```

### SpringXmlModelInspection
Cannot resolve property 'prefix'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	<context:component-scan base-package="com.microsoft.store.samples.partnerconsent" />
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
		</property>
```

### SpringXmlModelInspection
Cannot resolve property 'suffix'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
			<value>/</value>
		</property>
		<property name="suffix">
			<value>.jsp</value>
		</property>
```

## RuleId[id=SpringInjectionValueStyleInspection]
### SpringInjectionValueStyleInspection
Usage of explicit element
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix">
			<value>/</value>
		</property>
		<property name="suffix">
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml`
#### Snippet
```java
		</property>
		<property name="suffix">
			<value>.jsp</value>
		</property>
	</bean>
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'com'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class or package 'microsoft'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class or package 'store'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class or package 'samples'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class or package 'partnerconsent'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class or package 'security'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class 'AuthenticationFilter'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<filter>
		<filter-name>AuthenticationFilter</filter-name>
		<filter-class>com.microsoft.store.samples.partnerconsent.security.AuthenticationFilter</filter-class>
		<init-param>
			<param-name>client_id</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'web'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
```

### WebProperties
Cannot resolve class 'DispatcherServlet'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>mvc-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
```

### WebProperties
Value must not be empty
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	<servlet-mapping>
		<servlet-name>mvc-dispatcher</servlet-name>
		<url-pattern></url-pattern>
	</servlet-mapping>
	<context-param>
```

### WebProperties
Cannot resolve class or package 'org'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	</context-param>
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	</context-param>
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'web'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	</context-param>
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'context'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	</context-param>
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

### WebProperties
Cannot resolve class 'ContextLoaderListener'
in `secure-app-model/keyvault/partnerconsent/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
	</context-param>
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</web-app>
```

