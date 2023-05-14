# struts-examples 
 
# Bad smells
I found 438 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| WebProperties | 140 | false |
| FieldMayBeFinal | 65 | false |
| SpringXmlModelInspection | 56 | false |
| ServletWithoutMappingInspection | 53 | false |
| Deprecation | 25 | false |
| SpringInjectionValueStyleInspection | 13 | false |
| SpringBeanNameConventionInspection | 10 | false |
| FieldCanBeLocal | 9 | false |
| JavadocDeclaration | 8 | false |
| SpringBeanAttributesInspection | 7 | false |
| UNCHECKED_WARNING | 6 | false |
| UnusedAssignment | 6 | false |
| DuplicatedCode | 5 | false |
| IgnoreResultOfCall | 5 | false |
| SynchronizeOnNonFinalField | 5 | false |
| UNUSED_IMPORT | 3 | false |
| RedundantCast | 3 | false |
| PlaceholderCountMatchesArgumentCount | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| TrivialIf | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| SpringBeanConstructorArgInspection | 1 | false |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryReturn | 1 | true |
| ThrowableSupplierOnlyThrowException | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| CachedNumberConstructorCall | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Person\[persons.size()\]'
in `crud/src/main/java/org/apache/struts/crud/dao/MemoryPersonDao.java`
#### Snippet
```java
    @Override
    public Person[] getAllPersons() {
        return persons.toArray(new Person[persons.size()]);
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `shiro-basic/src/main/java/org/apache/struts2/shiro/example/action/LoginAction.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private static final transient Logger log = LogManager.getLogger(LoginAction.class);

    private String username;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `portlet/src/main/java/org/apache/struts2/portlet/example/spring/ThingManager.java`
#### Snippet
```java

    public void addThing(String thing) {
        things.add(thing);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Collection'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
        synchronized (subscriptions) {
            Subscription results[] = new Subscription[subscriptions.size()];
            return ((Subscription[]) subscriptions.values().toArray(results));
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
                    new AbstractSubscription(this, host);
            synchronized (subscriptions) {
                subscriptions.put(host, subscription);
            }
            return (subscription);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     */
    public void setSubscription(Subscription subscription) {
        getSession().put(Constants.SUBSCRIPTION_KEY, subscription);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     */
    public void setUser(User user) {
        getSession().put(Constants.USER_KEY, user);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     */
    public void setDatabase(UserDatabase database) {
        getApplication().put(Constants.DATABASE_KEY, database);
    }

```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `type-conversion/src/main/java/org/apache/struts/example/ThemeAction.java`
#### Snippet
```java

    public ThemeDescriptor getSelectedTheme() {
        LOG.info("Existing theme: #0", String.valueOf(selectedTheme));
        return selectedTheme;
    }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `type-conversion/src/main/java/org/apache/struts/example/ThemeAction.java`
#### Snippet
```java

    public void setSelectedTheme(ThemeDescriptor selectedTheme) {
        LOG.info("Selected theme: #0", String.valueOf(selectedTheme));
        this.selectedTheme = selectedTheme;
    }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/ApplicationListener.java`
#### Snippet
```java
                new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(os, 1024);
        byte buffer[] = new byte[1024];
        while (true) {
            int n = bis.read(buffer);
```

### CStyleArrayDeclaration
C-style array declaration of local variable `results`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java

        synchronized (subscriptions) {
            Subscription results[] = new Subscription[subscriptions.size()];
            return ((Subscription[]) subscriptions.values().toArray(results));
        }
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="RequiredContainerServices"
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="RequiredContainerServices"
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="RequiredContainerServices"
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'container'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="RequiredContainerServices"
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class 'ContainerServicesImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="RequiredContainerServices"
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PortalContext"
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PortalContext"
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PortalContext"
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'container'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PortalContext"
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
```

### SpringXmlModelInspection
Cannot resolve class 'PortalContextImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PortalContext"
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="DriverConfiguration"
          class="org.apache.pluto.driver.config.impl.DriverConfigurationImpl">

        <!-- ===== Portal Services ===== -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="DriverConfiguration"
          class="org.apache.pluto.driver.config.impl.DriverConfigurationImpl">

        <!-- ===== Portal Services ===== -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="DriverConfiguration"
          class="org.apache.pluto.driver.config.impl.DriverConfigurationImpl">

        <!-- ===== Portal Services ===== -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="DriverConfiguration"
          class="org.apache.pluto.driver.config.impl.DriverConfigurationImpl">

        <!-- ===== Portal Services ===== -->
```

### SpringXmlModelInspection
Cannot resolve class 'DriverConfigurationImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="DriverConfiguration"
          class="org.apache.pluto.driver.config.impl.DriverConfigurationImpl">

        <!-- ===== Portal Services ===== -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the administration tree -->
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the administration tree -->
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the administration tree -->
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the administration tree -->
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'AdminConfigurationImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the administration tree -->
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
```

### SpringXmlModelInspection
Cannot resolve property 'renderConfigAdminService'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
```

### SpringXmlModelInspection
Cannot resolve class or package 'url'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
```

### SpringXmlModelInspection
Cannot resolve class 'PortalURLParserImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
```

### SpringXmlModelInspection
Cannot resolve method 'getParser'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'resource'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'PropertyConfigServiceImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'resource'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'RenderConfigServiceImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'resource'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class 'SupportedModesServiceImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'resource'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class 'SupportedWindowStateServiceImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pluto'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'driver'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'services'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'container'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'PortalCallbackServiceImpl'
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- ================================================ -->
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
    </bean>
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve Filter 'struts2'
in `exclude-parameters/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `form-tags/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `dynamic-href/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `form-xml-validation/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `form-processing/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `form-validation/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `file-upload/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `exception-handling/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `expression-cache/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `crud/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `basic-struts/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `control-tags/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `debugging-struts/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `bean-validation/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `coding-actions/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `action-chaining/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `helloworld/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `annotations/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `http-session/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `interceptors/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `json/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `jfreechart/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `json-customize/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `blank/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `message-store/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `message-resource/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `preparable-interface/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `jasperreports/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `mailreader2/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `restful2actionmapper/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `rest-angular/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `text-provider/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `spring-struts/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

	<filter-mapping>
		<filter-name>struts2</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `themes-override/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'shiroFilter'
in `shiro-basic/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  </filter>
  <filter-mapping>
    <filter-name>shiroFilter</filter-name>
    <url-pattern>/*</url-pattern>
    <dispatcher>REQUEST</dispatcher>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `shiro-basic/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  </filter>
  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `themes/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `unit-testing/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `using-tags/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `unknown-handler/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `type-conversion/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `validation-messages/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `wildcard-method-selection/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

     <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `wildcard-regex/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'struts2'
in `tiles/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### WebProperties
Cannot resolve class 'ServletContextHolderListener'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.apache.struts2.portlet.context.ServletContextHolderListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'exoplatform'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.exoplatform.services.portletcontainer.impl.servlet.PortletApplicationListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'services'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.exoplatform.services.portletcontainer.impl.servlet.PortletApplicationListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'portletcontainer'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.exoplatform.services.portletcontainer.impl.servlet.PortletApplicationListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'impl'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.exoplatform.services.portletcontainer.impl.servlet.PortletApplicationListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.exoplatform.services.portletcontainer.impl.servlet.PortletApplicationListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'PortletApplicationListener'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.exoplatform.services.portletcontainer.impl.servlet.PortletApplicationListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'PreparatorServlet'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>preparator</servlet-name>
		<servlet-class>
			org.apache.struts2.portlet.context.PreparatorServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'uk'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'ltd'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'getahead'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'dwr'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class 'DWRServlet'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'exoplatform'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>PortletWrapper</servlet-name>
		<servlet-class>
			org.exoplatform.services.portletcontainer.impl.servlet.ServletWrapper
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'services'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>PortletWrapper</servlet-name>
		<servlet-class>
			org.exoplatform.services.portletcontainer.impl.servlet.ServletWrapper
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'portletcontainer'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>PortletWrapper</servlet-name>
		<servlet-class>
			org.exoplatform.services.portletcontainer.impl.servlet.ServletWrapper
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'impl'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>PortletWrapper</servlet-name>
		<servlet-class>
			org.exoplatform.services.portletcontainer.impl.servlet.ServletWrapper
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>PortletWrapper</servlet-name>
		<servlet-class>
			org.exoplatform.services.portletcontainer.impl.servlet.ServletWrapper
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class 'ServletWrapper'
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java
		<servlet-name>PortletWrapper</servlet-name>
		<servlet-class>
			org.exoplatform.services.portletcontainer.impl.servlet.ServletWrapper
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'liferay'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.liferay.portal.servlet.PortletContextListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'portal'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.liferay.portal.servlet.PortletContextListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.liferay.portal.servlet.PortletContextListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'PortletContextListener'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.liferay.portal.servlet.PortletContextListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'ServletContextHolderListener'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.apache.struts2.portlet.context.ServletContextHolderListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'liferay'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
		<servlet-name>StrutsPortlet</servlet-name>
		<servlet-class>
			com.liferay.portal.servlet.PortletServlet
		</servlet-class>
		<init-param>
```

### WebProperties
Cannot resolve class or package 'portal'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
		<servlet-name>StrutsPortlet</servlet-name>
		<servlet-class>
			com.liferay.portal.servlet.PortletServlet
		</servlet-class>
		<init-param>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
		<servlet-name>StrutsPortlet</servlet-name>
		<servlet-class>
			com.liferay.portal.servlet.PortletServlet
		</servlet-class>
		<init-param>
```

### WebProperties
Cannot resolve class 'PortletServlet'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
		<servlet-name>StrutsPortlet</servlet-name>
		<servlet-class>
			com.liferay.portal.servlet.PortletServlet
		</servlet-class>
		<init-param>
```

### WebProperties
Cannot resolve class 'PreparatorServlet'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
		<servlet-name>preparator</servlet-name>
		<servlet-class>
			org.apache.struts2.portlet.context.PreparatorServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'uk'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>

```

### WebProperties
Cannot resolve class or package 'ltd'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>

```

### WebProperties
Cannot resolve class or package 'getahead'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>

```

### WebProperties
Cannot resolve class or package 'dwr'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>

```

### WebProperties
Cannot resolve class 'DWRServlet'
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>

```

### WebProperties
Cannot resolve class 'ServletContextHolderListener'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.apache.struts2.portlet.context.ServletContextHolderListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'gridlab'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'gridsphere'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'provider'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'portlet'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'jsr'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'PortletServlet'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'PreparatorServlet'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>preparator</servlet-name>
		<servlet-class>
			org.apache.struts2.portlet.context.PreparatorServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'uk'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'ltd'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'getahead'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'dwr'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class 'DWRServlet'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>uk.ltd.getahead.dwr.DWRServlet</servlet-class>
	</servlet>
	<servlet>
```

### WebProperties
Cannot resolve class or package 'gridlab'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>PortletServlet</servlet-name>
		<servlet-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'gridsphere'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>PortletServlet</servlet-name>
		<servlet-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'provider'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>PortletServlet</servlet-name>
		<servlet-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'portlet'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>PortletServlet</servlet-name>
		<servlet-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'jsr'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>PortletServlet</servlet-name>
		<servlet-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class 'PortletServlet'
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java
		<servlet-name>PortletServlet</servlet-name>
		<servlet-class>
			org.gridlab.gridsphere.provider.portlet.jsr.PortletServlet
		</servlet-class>
	</servlet>
```

### WebProperties
Cannot resolve class or package 'bekk'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'boss'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'pluto'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'embedded'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'jetty'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'util'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'OverrideContextLoaderListener'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	<listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.jetty.util.OverrideContextLoaderListener
        </listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'bekk'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.util.PortalStartupListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'boss'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.util.PortalStartupListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'pluto'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.util.PortalStartupListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'embedded'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.util.PortalStartupListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'util'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.util.PortalStartupListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class 'PortalStartupListener'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <listener>
		<listener-class>
			com.bekk.boss.pluto.embedded.util.PortalStartupListener
		</listener-class>
	</listener>
```

### WebProperties
Cannot resolve class or package 'bekk'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
  <filter>
```

### WebProperties
Cannot resolve class or package 'boss'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
  <filter>
```

### WebProperties
Cannot resolve class or package 'pluto'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
  <filter>
```

### WebProperties
Cannot resolve class or package 'embedded'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
  <filter>
```

### WebProperties
Cannot resolve class or package 'util'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
  <filter>
```

### WebProperties
Cannot resolve class 'PlutResourcesFilter'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
  <filter>
```

### WebProperties
Cannot resolve class or package 'bekk'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
	
```

### WebProperties
Cannot resolve class or package 'boss'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
	
```

### WebProperties
Cannot resolve class or package 'pluto'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
	
```

### WebProperties
Cannot resolve class or package 'embedded'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
	
```

### WebProperties
Cannot resolve class or package 'util'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
	
```

### WebProperties
Cannot resolve class 'PlutoPortalDriverFilter'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
	
```

### WebProperties
Cannot resolve Filter 'plutoResourceFilter'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	
   <filter-mapping>
		<filter-name>plutoResourceFilter</filter-name>
		<url-pattern>*.css</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve Filter 'plutoResourceFilter'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	</filter-mapping>
	<filter-mapping>
		<filter-name>plutoResourceFilter</filter-name>
		<url-pattern>*.gif</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve Filter 'plutoResourceFilter'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	</filter-mapping>
	<filter-mapping>
		<filter-name>plutoResourceFilter</filter-name>
		<url-pattern>*.png</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve Filter 'plutoResourceFilter'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	</filter-mapping>
	<filter-mapping>
		<filter-name>plutoResourceFilter</filter-name>
		<url-pattern>*.js</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve Filter 'plutoPortalDriver'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	</filter-mapping>
	<filter-mapping>
		<filter-name>plutoPortalDriver</filter-name>
		<url-pattern>/pluto/index.jsp</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve Filter 'plutoPortalDriver'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	</filter-mapping>
	<filter-mapping>
		<filter-name>plutoPortalDriver</filter-name>
		<url-pattern>/pluto/index.jsp/*</url-pattern>
	</filter-mapping>
```

### WebProperties
Cannot resolve class or package 'mortbay'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.mortbay.jetty.servlet.DefaultServlet</servlet-class>
    <init-param>
      <param-name>acceptRanges</param-name>
```

### WebProperties
Cannot resolve class or package 'jetty'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.mortbay.jetty.servlet.DefaultServlet</servlet-class>
    <init-param>
      <param-name>acceptRanges</param-name>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.mortbay.jetty.servlet.DefaultServlet</servlet-class>
    <init-param>
      <param-name>acceptRanges</param-name>
```

### WebProperties
Cannot resolve class 'DefaultServlet'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.mortbay.jetty.servlet.DefaultServlet</servlet-class>
    <init-param>
      <param-name>acceptRanges</param-name>
```

### WebProperties
Cannot resolve class or package 'bekk'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
        <param-name>logVerbosityLevel</param-name>
```

### WebProperties
Cannot resolve class or package 'boss'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
        <param-name>logVerbosityLevel</param-name>
```

### WebProperties
Cannot resolve class or package 'pluto'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
        <param-name>logVerbosityLevel</param-name>
```

### WebProperties
Cannot resolve class or package 'embedded'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
        <param-name>logVerbosityLevel</param-name>
```

### WebProperties
Cannot resolve class or package 'util'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
        <param-name>logVerbosityLevel</param-name>
```

### WebProperties
Cannot resolve class 'PortletJspServlet'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
        <param-name>logVerbosityLevel</param-name>
```

### WebProperties
Cannot resolve Servlet 'jsp'
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java

  <servlet-mapping> 
    <servlet-name>jsp</servlet-name> 
    <url-pattern>*.jsp</url-pattern> 
    <url-pattern>*.jspf</url-pattern>
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching factory method found in class
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
    </bean>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
		states = new ArrayList<>();
		states.add(new State("AZ", "Arizona"));
		states.add(new State("CA", "California"));
		states.add(new State("FL", "Florida"));
		states.add(new State("KS", "Kansas"));
		states.add(new State("NY", "New York"));

		return states;
```

### DuplicatedCode
Duplicated code
in `form-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
        states.add(new State("AZ", "Arizona"));
        states.add(new State("CA", "California"));
        states.add(new State("FL", "Florida"));
        states.add(new State("KS", "Kansas"));
        states.add(new State("NY", "New York"));

        return states;
```

### DuplicatedCode
Duplicated code
in `bean-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
		EditServiceInMemory.person.setFirstName(personBean.getFirstName() );
		EditServiceInMemory.person.setLastName(personBean.getLastName() );
		EditServiceInMemory.person.setSport(personBean.getSport() );
		EditServiceInMemory.person.setGender( personBean.getGender() );
		EditServiceInMemory.person.setResidency( personBean.getResidency() );
		EditServiceInMemory.person.setOver21( personBean.isOver21() );
		EditServiceInMemory.person.setCarModels(personBean.getCarModels() );
```

### DuplicatedCode
Duplicated code
in `crud/src/main/webapp/css/main.css`
#### Snippet
```java
html, body  {
    margin-left: 10px;
    margin-right: 10px;
```

### DuplicatedCode
Duplicated code
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
        states = new ArrayList<State>();
        states.add(new State("AZ", "Arizona"));
        states.add(new State("CA", "California"));
        states.add(new State("FL", "Florida"));
        states.add(new State("KS", "Kansas"));
        states.add(new State("NY", "New York"));

        return states;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/SubscriptionAction.java`
#### Snippet
```java
     * <p>Provide the list of MailServer types.</p>
     *
     * @return List of MailServer types
     */
    public Map<String, String> getTypes() {
```

## RuleId[id=SpringBeanAttributesInspection]
### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
          scope="singleton">
        <constructor-arg>
            <ref bean="PortalContext"/>
```

### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
          scope="singleton">
    </bean>

```

### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
    </bean>

```

### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
    </bean>

```

### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
        <constructor-arg>
            <ref bean="PropertyConfigService"/>
```

### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
        <constructor-arg>
            <ref bean="PropertyConfigService"/>
```

### SpringBeanAttributesInspection
Attribute scope with default value 'singleton' is superfluous
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
    </bean>

```

## RuleId[id=Deprecation]
### Deprecation
'getParameterMap()' is deprecated
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormResultAction.java`
#### Snippet
```java
    public Collection getRenderParams() {
        RenderRequest req = PortletActionContext.getRenderRequest();
        Map params = req.getParameterMap();
        return params.entrySet();
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.portlet.interceptor.PortletRequestAware'
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/ProcessAction.java`
#### Snippet
```java
    }

    public void setPortletRequest(PortletRequest request) {
        this.request = request;
    }
```

### Deprecation
'setRenderParameter(java.lang.String, java.lang.String)' is deprecated
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/ProcessAction.java`
#### Snippet
```java
            EventRequest req = (EventRequest) request;
            EventResponse res = (EventResponse) response;
            res.setRenderParameter("eventName", (String) req.getEvent().getValue());
            return "forward";
        } else {
```

### Deprecation
'getParameter(java.lang.String)' is deprecated
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/ProcessAction.java`
#### Snippet
```java
            return "forward";
        } else {
            name = request.getParameter("eventName");
        }

```

### Deprecation
'org.apache.struts2.portlet.interceptor.PortletRequestAware' is deprecated
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/ProcessAction.java`
#### Snippet
```java
import javax.portlet.PortletResponse;

public class ProcessAction extends ActionSupport implements PortletRequestAware, PortletResponseAware {

    private PortletRequest request;
```

### Deprecation
'org.apache.struts2.portlet.interceptor.PortletResponseAware' is deprecated
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/ProcessAction.java`
#### Snippet
```java
import javax.portlet.PortletResponse;

public class ProcessAction extends ActionSupport implements PortletRequestAware, PortletResponseAware {

    private PortletRequest request;
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.portlet.interceptor.PortletResponseAware'
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/ProcessAction.java`
#### Snippet
```java
    }

    public void setPortletResponse(PortletResponse response) {
        this.response = response;
    }
```

### Deprecation
'org.apache.struts2.portlet.interceptor.PortletResponseAware' is deprecated
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/PublishAction.java`
#### Snippet
```java
import javax.xml.namespace.QName;

public class PublishAction extends ActionSupport implements PortletResponseAware {

    private PortletResponse response;
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.portlet.interceptor.PortletResponseAware'
in `portlet/src/main/java/org/apache/struts2/portlet/example/eventing/PublishAction.java`
#### Snippet
```java
    }

    public void setPortletResponse(PortletResponse response) {
        this.response = response;

```

### Deprecation
'org.hibernate.validator.constraints.NotBlank' is deprecated
in `rest-angular/src/main/java/org/apache/examples/struts/models/Order.java`
#### Snippet
```java
    String id;

    @NotBlank(message = "validation.order.client")
    String clientName;

```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.interceptor.SessionAware'
in `unknown-handler/src/main/java/org/apache/strutsexamples/actions/Login.java`
#### Snippet
```java
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
```

### Deprecation
'org.apache.struts2.interceptor.SessionAware' is deprecated
in `unknown-handler/src/main/java/org/apache/strutsexamples/actions/Login.java`
#### Snippet
```java
import java.util.Map;

public class Login extends ActionSupport implements SessionAware {

    private Map<String, Object> session;
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.interceptor.SessionAware'
in `http-session/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java

	
	public void setSession(Map<String, Object> session) {
		
		userSession = session ;
```

### Deprecation
'org.apache.struts2.interceptor.SessionAware' is deprecated
in `http-session/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
 *
 */
public class HelloWorldAction extends ActionSupport implements SessionAware, ParameterNameAware {

	private static final long serialVersionUID = 1L;
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.interceptor.ServletRequestAware'
in `json/src/main/java/org/demo/ConsumeAction.java`
#### Snippet
```java
    }

    public void setServletRequest(HttpServletRequest request) {
        responseAsJson = request.getHeader("Accept").contains("application/json");
    }
```

### Deprecation
'org.apache.struts2.interceptor.ServletRequestAware' is deprecated
in `json/src/main/java/org/demo/ConsumeAction.java`
#### Snippet
```java
import javax.servlet.http.HttpServletRequest;

public class ConsumeAction extends ActionSupport implements ServletRequestAware {

    private MyBean bean = new MyBean();
```

### Deprecation
'org.apache.struts2.interceptor.SessionAware' is deprecated
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
 * avoids creating unnecessary local properties. Pick your poison.</p>
 */
public class MailreaderSupport extends ActionSupport implements SessionAware, ApplicationAware {

    /**
```

### Deprecation
'org.apache.struts2.interceptor.ApplicationAware' is deprecated
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
 * avoids creating unnecessary local properties. Pick your poison.</p>
 */
public class MailreaderSupport extends ActionSupport implements SessionAware, ApplicationAware {

    /**
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.interceptor.ApplicationAware'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * @param value A Map representing application state
     */
    public void setApplication(Map value) {
        application = value;
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.struts2.interceptor.SessionAware'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * @param value A Map representing session state
     */
    public void setSession(Map value) {
        session = value;
    }
```

### Deprecation
'Integer(int)' is deprecated
in `form-xml-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
        person.setCarModels(carModels);
        person.setPhoneNumber("123-456-9999");
        person.setAge(new Integer(30));

    }
```

### Deprecation
'org.hibernate.validator.constraints.NotBlank' is deprecated
in `bean-validation/src/main/java/org/apache/struts/edit/model/Person.java`
#### Snippet
```java
{
	
	@NotBlank(message="firstName.required")
    private String firstName;
	
```

### Deprecation
'org.hibernate.validator.constraints.NotEmpty' is deprecated
in `bean-validation/src/main/java/org/apache/struts/edit/model/Person.java`
#### Snippet
```java
    private boolean over21;
    
    @NotEmpty(message="carModels.required")
    private String [] carModels;
    
```

### Deprecation
'org.hibernate.validator.constraints.NotBlank' is deprecated
in `bean-validation/src/main/java/org/apache/struts/edit/model/Person.java`
#### Snippet
```java
    private String firstName;
	
	@NotBlank(message="lastName.required")
    private String lastName;
    private String sport;
```

### Deprecation
'org.hibernate.validator.constraints.Email' is deprecated
in `bean-validation/src/main/java/org/apache/struts/edit/model/Person.java`
#### Snippet
```java
    
    @Size(min=1, message="email.required")
    @Email(message="email.format")
    private String email;
    
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `json-customize/src/main/java/org/demo/ExcludeTransformer.java`
#### Snippet
```java
public class ExcludeTransformer extends AbstractTransformer {
    public void transform(Object o) {
        return;
    }
}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `exception-handling/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java

		throw new NullPointerException("Null Pointer Exception thrown from "
				+ Register.class.toString());
	}

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugging-struts/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	public void throwNullPointerException() throws NullPointerException {
		throw new NullPointerException("Null Pointer Exception thrown from "
				+ Register.class.toString());
	}

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `control-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

```

### FieldCanBeLocal
Field can be converted to a local variable
in `spring-struts/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
```

### FieldCanBeLocal
Field can be converted to a local variable
in `portlet/src/main/java/org/apache/struts2/portlet/example/ExampleAction.java`
#### Snippet
```java
public class ExampleAction extends ActionSupport {

    private String name = "PortletWork Example";

    public String getName() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private String[] sports = {"football", "baseball", "basketball"};
    private String[] genders = {"male", "female", "not sure"};
    private List<State> states;
    private String[] carModelsAvailable;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `themes-override/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
```

### FieldCanBeLocal
Field can be converted to a local variable
in `themes/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
```

### FieldCanBeLocal
Field can be converted to a local variable
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private String[] genders = {"male", "female", "not sure"};

    private List<State> states;

    private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};
```

### FieldCanBeLocal
Field can be converted to a local variable
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
	private String [] carModelsAvailable ;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String[] sports = {"football", "baseball", "basketball"};
	private String[] genders = {"male", "female", "not sure"};
	private List<State> states;
	private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};

```

## RuleId[id=SpringBeanNameConventionInspection]
### SpringBeanNameConventionInspection
'RequiredContainerServices' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
      -->

    <bean id="RequiredContainerServices"
          name="OptionalContainerServices"
          class="org.apache.pluto.driver.services.container.ContainerServicesImpl"
```

### SpringBeanNameConventionInspection
'PortalContext' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    </bean>

    <bean id="PortalContext"
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
```

### SpringBeanNameConventionInspection
'DriverConfiguration' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the configuration tree -->
    <!-- ================================================ -->
    <bean id="DriverConfiguration"
          class="org.apache.pluto.driver.config.impl.DriverConfigurationImpl">

```

### SpringBeanNameConventionInspection
'AdminConfiguration' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- The single top element of the administration tree -->
    <!-- ================================================ -->
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
```

### SpringBeanNameConventionInspection
'PortalURLParser' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- Portal Services injected into the Configuration  -->
    <!-- ================================================ -->
    <bean id="PortalURLParser"
          class="org.apache.pluto.driver.url.impl.PortalURLParserImpl"
          factory-method="getParser"
```

### SpringBeanNameConventionInspection
'PropertyConfigService' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    </bean>

    <bean id="PropertyConfigService"
          class="org.apache.pluto.driver.services.impl.resource.PropertyConfigServiceImpl"
          scope="singleton">
```

### SpringBeanNameConventionInspection
'RenderConfigService' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    </bean>

    <bean id="RenderConfigService"
          class="org.apache.pluto.driver.services.impl.resource.RenderConfigServiceImpl"
          scope="singleton">
```

### SpringBeanNameConventionInspection
'SupportedModesService' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    </bean>

    <bean id="SupportedModesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedModesServiceImpl"
          scope="singleton">
```

### SpringBeanNameConventionInspection
'SupportedWindowStatesService' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    </bean>

    <bean id="SupportedWindowStatesService"
          class="org.apache.pluto.driver.services.impl.resource.SupportedWindowStateServiceImpl"
          scope="singleton">
```

### SpringBeanNameConventionInspection
'PortalCallbackService' should start with lowercase letter
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <!-- Container Services injected into  Configuration  -->
    <!-- ================================================ -->
    <bean id="PortalCallbackService"
          class="org.apache.pluto.driver.services.container.PortalCallbackServiceImpl"
          scope="singleton">
```

## RuleId[id=SpringInjectionValueStyleInspection]
### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
          scope="singleton">
        <constructor-arg>
            <ref bean="PortalContext"/>
        </constructor-arg>
        <constructor-arg>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        </constructor-arg>
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
        </constructor-arg>
    </bean>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
          class="org.apache.pluto.driver.services.container.PortalContextImpl">
        <constructor-arg>
            <ref bean="DriverConfiguration"/>
        </constructor-arg>
    </bean>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        <!-- ===== Portal Services ===== -->
        <constructor-arg>
            <ref bean="PortalURLParser"/>
        </constructor-arg>
        <constructor-arg>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        </constructor-arg>
        <constructor-arg>
            <ref bean="PropertyConfigService"/>
        </constructor-arg>
        <constructor-arg>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        </constructor-arg>
        <constructor-arg>
            <ref bean="RenderConfigService"/>
        </constructor-arg>
        <constructor-arg>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        </constructor-arg>
        <constructor-arg>
            <ref bean="SupportedModesService"/>
        </constructor-arg>
        <constructor-arg>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        </constructor-arg>
        <constructor-arg>
            <ref bean="SupportedWindowStatesService"/>
        </constructor-arg>

```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
        <!-- === Container Services === -->
        <constructor-arg>
            <ref bean="PortalCallbackService"/>
        </constructor-arg>

```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
    <bean id="AdminConfiguration" class="org.apache.pluto.driver.config.impl.AdminConfigurationImpl">
        <property name="renderConfigAdminService">
            <ref bean="RenderConfigService"/>
        </property>
    </bean>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
          scope="singleton">
        <constructor-arg>
            <ref bean="PropertyConfigService"/>
        </constructor-arg>
    </bean>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/resources/pluto-portal-driver-services-config.xml`
#### Snippet
```java
          scope="singleton">
        <constructor-arg>
            <ref bean="PropertyConfigService"/>
        </constructor-arg>
    </bean>
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `portlet/src/main/webapp/WEB-INF/applicationContext.xml`
#### Snippet
```java
		  class="org.apache.struts2.portlet.example.spring.SpringAction" scope="prototype">
		<property name="thingManager">
			<ref bean="thingManager" />
		</property>
	</bean>
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
            if (writer.checkError()) {
                writer.close();
                fileNew.delete();
                throw new IOException("Saving database to '" + pathname + "'");
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
                writer.close();
            }
            fileNew.delete();
            throw e;
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
        File fileOld = new File(pathnameOld);
        if (fileOrig.exists()) {
            fileOld.delete();
            if (!fileOrig.renameTo(fileOld)) {
                throw new IOException
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
        if (!fileNew.renameTo(fileOrig)) {
            if (fileOld.exists()) {
                fileOld.renameTo(fileOrig);
            }
            throw new IOException
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
                    ("Renaming '" + pathnameNew + "' to '" + pathname + "'");
        }
        fileOld.delete();
    }

```

## RuleId[id=ThrowableSupplierOnlyThrowException]
### ThrowableSupplierOnlyThrowException
Throwable supplier doesn't return any exception
in `jasperreports/src/main/java/org/apache/struts/example/jasperreports/service/JapserInitializer.java`
#### Snippet
```java
          Optional.ofNullable(
                  JapserInitializer.class.getResource("/jasper/our_jasper_template.jrxml"))
              .orElseThrow(
                  () -> {
                    throw new IllegalStateException("our_jasper_template.jrxml File not found.");
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `http-session/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
		boolean allowedParameterName = true ;
		
		if ( parameterName.contains("session")  || parameterName.contains("request") ) {
		
			allowedParameterName = false ;
```

### TrivialIf
`if` statement can be simplified
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
            autoConnect = "false";
        }
        if ("true".equalsIgnoreCase(autoConnect) ||
                "yes".equalsIgnoreCase(autoConnect)) {
            subscription.setAutoConnect(true);
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
                    ("Subscription not associated with this user");
        }
        synchronized (subscriptions) {
            subscriptions.remove(subscription.getHost());
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
    public Subscription findSubscription(String host) {

        synchronized (subscriptions) {
            return ((Subscription) subscriptions.get(host));
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
    public Subscription[] getSubscriptions() {

        synchronized (subscriptions) {
            Subscription results[] = new Subscription[subscriptions.size()];
            return ((Subscription[]) subscriptions.values().toArray(results));
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
    public Subscription createSubscription(String host) {

        synchronized (subscriptions) {
            if (subscriptions.get(host) != null) {
                throw new IllegalArgumentException("Duplicate host '" + host
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
            Subscription subscription =
                    new AbstractSubscription(this, host);
            synchronized (subscriptions) {
                subscriptions.put(host, subscription);
            }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof Country'
in `crud/src/main/java/org/apache/struts/crud/model/Country.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        return (o!=null) 
                && (o instanceof Country) 
                && (((Country) o).getCountryId() != null) 
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.opensymphony.xwork2.ActionSupport;`
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExample.java`
#### Snippet
```java
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.opensymphony.xwork2.ActionSupport;

/**
```

### UNUSED_IMPORT
Unused import `import com.opensymphony.xwork2.config.Configuration;`
in `text-provider/src/main/java/org/apache/struts_example/IndexAction.java`
#### Snippet
```java
import com.opensymphony.xwork2.TextProvider;
import com.opensymphony.xwork2.TextProviderFactory;
import com.opensymphony.xwork2.config.Configuration;

public class IndexAction extends ActionSupport {
```

### UNUSED_IMPORT
Unused import `import com.opensymphony.xwork2.ActionSupport;`
in `validation-messages/src/main/java/org/apache/struts/validation_messages/Login.java`
#### Snippet
```java
package org.apache.struts.validation_messages;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ExampleSupport {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Exception is not declared to be thrown by method isOpen
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/UserDatabase.java`
#### Snippet
```java
     * <p>Return true if open() has been called.</p>
     *
     * @exception Exception if a database access error occurs
     */
    boolean isOpen();
```

### JavadocDeclaration
`@param host` tag description is missing
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * the host is not unique.</p>
     *
     * @param host
     * @return New User Subscription object or null
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * <p>Store new Subscription host.</p>
     *
     * @param value
     */
    public void setHost(String value) {
```

### JavadocDeclaration
`@param subscription` tag description is missing
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * <p>Store new User Subscription.</p>
     *
     * @param subscription
     */
    public void setSubscription(Subscription subscription) {
```

### JavadocDeclaration
`@param host` tag description is missing
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * to capture input values.</p>
     *
     * @param host
     */
    public void copySubscription(String host) {
```

### JavadocDeclaration
`@param database` tag description is missing
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * <p>Store a new reference to UserDatabase</p>
     *
     * @param database
     */
    public void setDatabase(UserDatabase database) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * @param password User password
     * @return User object or null if not found
     * @throws ExpiredPasswordException
     */
    public User findUser(String username, String password)
```

### JavadocDeclaration
`@return` tag description is missing
in `restful2actionmapper/src/main/java/org/apache/struts/example/MovieAction.java`
#### Snippet
```java
	 * Method is called if url is movie/ .
	 * No value will be sent to setId.
	 * @return
	 */
	public String index() {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `invocation -> {...}` to `Result` is redundant
in `quarkus/src/main/java/org/apache/struts2/examples/quarkus/IndexAction.java`
#### Snippet
```java

    public Result execute() {
        return (Result) invocation -> {
            HttpServletResponse response = ServletActionContext.getResponse();
            response.getWriter().println("Hello!");
```

### RedundantCast
Casting `users.get(...)` to `User` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    public User findUser(String username)  {
        synchronized (users) {
            return ((User) users.get(username));
        }
    }
```

### RedundantCast
Casting `digester.peek()` to `User` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    public Object createObject(Attributes attributes) {
        String host = attributes.getValue("host");
        User user = (User) digester.peek();
        Subscription subscription = user.createSubscription(host);
        String autoConnect = attributes.getValue("autoConnect");
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `personService` may be 'final'
in `crud/src/main/java/org/apache/struts/crud/action/PersonAction.java`
#### Snippet
```java
    
    private static final Logger LOG = LogManager.getLogger(PersonAction.class.getName());
    private PersonService personService = new DefaultPersonService();
    private Person person;
    private Person[] persons;
```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `control-tags/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java

	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	static {
```

### FieldMayBeFinal
Field `person` may be 'final'
in `control-tags/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
public class EditServiceInMemory implements EditService {

	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `carModelsAvailable` may be 'final'
in `control-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String save() throws Exception {
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `control-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java

	private Person personBean;
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `control-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private Person personBean;
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
```

### FieldMayBeFinal
Field `editService` may be 'final'
in `control-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;

	private EditService editService = new EditServiceInMemory();

	private Person personBean;
```

### FieldMayBeFinal
Field `message` may be 'final'
in `helloworld/src/main/java/org/apache/struts/helloworld/model/MessageStore.java`
#### Snippet
```java
public class MessageStore {
    
    private String message;
    
    public MessageStore() {
```

### FieldMayBeFinal
Field `person` may be 'final'
in `spring-struts/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `spring-struts/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
```

### FieldMayBeFinal
Field `carModelsAvailable` may be 'final'
in `spring-struts/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String execute() throws Exception {
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `spring-struts/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private Person personBean;
	
	private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `spring-struts/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;
```

### FieldMayBeFinal
Field `themes` may be 'final'
in `type-conversion/src/main/java/org/apache/struts/example/ThemeAction.java`
#### Snippet
```java
    private static final Logger LOG = LogManager.getLogger(ThemeAction.class);

    private Map<String, ThemeDescriptor> themes = Themes.list();
    private ThemeDescriptor selectedTheme = Themes.get("simple");

```

### FieldMayBeFinal
Field `themes` may be 'final'
in `type-conversion/src/main/java/org/apache/struts/model/Themes.java`
#### Snippet
```java
public class Themes {

    private static Map<String, ThemeDescriptor> themes;

    static {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExampleModelDriven.java`
#### Snippet
```java
public class FormExampleModelDriven extends ActionSupport implements ModelDriven<Name> {
    
	private Name name = new Name();

	public Name getModel() {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `portlet/src/main/java/org/apache/struts2/portlet/example/ExampleAction.java`
#### Snippet
```java
public class ExampleAction extends ActionSupport {

    private String name = "PortletWork Example";

    public String getName() {
```

### FieldMayBeFinal
Field `things` may be 'final'
in `portlet/src/main/java/org/apache/struts2/portlet/example/spring/ThingManager.java`
#### Snippet
```java
 */
public class ThingManager {
    private List things = new ArrayList();

    public void addThing(String thing) {
```

### FieldMayBeFinal
Field `ordersService` may be 'final'
in `rest-angular/src/main/java/org/apache/examples/struts/actions/data/OrderController.java`
#### Snippet
```java
    private String id;
    private Collection<Order> list = null;
    private OrdersService ordersService = new OrdersService();

    // GET /data/order/1
```

### FieldMayBeFinal
Field `orders` may be 'final'
in `rest-angular/src/main/java/org/apache/examples/struts/services/OrdersService.java`
#### Snippet
```java
public class OrdersService {

    private static Map<String,Order> orders = new HashMap<>();
    private static int nextId = 6;
    static {
```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
```

### FieldMayBeFinal
Field `person` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `editService` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private EditService editService = new EditServiceInMemory();
    private CarModelsService carModelsService = new CarModelsServiceHardCoded();

```

### FieldMayBeFinal
Field `log` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
public class EditAction extends ActionSupport implements Preparable {

    private static Logger log = LogManager.getLogger(EditAction.class);
    private static final long serialVersionUID = 1L;

```

### FieldMayBeFinal
Field `sports` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java

    private Person personBean;
    private String[] sports = {"football", "baseball", "basketball"};
    private String[] genders = {"male", "female", "not sure"};
    private List<State> states;
```

### FieldMayBeFinal
Field `carModelsService` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java

    private EditService editService = new EditServiceInMemory();
    private CarModelsService carModelsService = new CarModelsServiceHardCoded();

    private Person personBean;
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private Person personBean;
    private String[] sports = {"football", "baseball", "basketball"};
    private String[] genders = {"male", "female", "not sure"};
    private List<State> states;
    private String[] carModelsAvailable;
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `themes-override/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;
```

### FieldMayBeFinal
Field `carModelsAvailable` may be 'final'
in `themes-override/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String execute() throws Exception {
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `themes-override/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private Person personBean;
	
	private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
```

### FieldMayBeFinal
Field `editService` may be 'final'
in `themes-override/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private EditService editService = new EditServiceInMemory();
	
	private Person personBean;
```

### FieldMayBeFinal
Field `person` may be 'final'
in `themes-override/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `themes-override/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
```

### FieldMayBeFinal
Field `person` may be 'final'
in `themes/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `themes/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `themes/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;
```

### FieldMayBeFinal
Field `carModelsAvailable` may be 'final'
in `themes/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String execute() throws Exception {
```

### FieldMayBeFinal
Field `editService` may be 'final'
in `themes/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private EditService editService = new EditServiceInMemory();
	
	private Person personBean;
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `themes/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private Person personBean;
	
	private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
```

### FieldMayBeFinal
Field `people` may be 'final'
in `wildcard-method-selection/src/main/java/org/apache/struts/tutorials/wildcardmethod/service/PersonService.java`
#### Snippet
```java
	private static final Logger log = LogManager.getLogger(PersonService.class);

	private static SortedMap<Integer, Person> people = new TreeMap<>();
	
	static {
```

### FieldMayBeFinal
Field `bean` may be 'final'
in `json/src/main/java/org/demo/ConsumeAction.java`
#### Snippet
```java
public class ConsumeAction extends ActionSupport implements ServletRequestAware {

    private MyBean bean = new MyBean();
    private boolean responseAsJson = true;

```

### FieldMayBeFinal
Field `log` may be 'final'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/ApplicationListener.java`
#### Snippet
```java
     * <p>Logging output for this plug in instance.</p>
     */
    private Logger log = LogManager.getLogger(ApplicationListener.class);

    /**
```

### FieldMayBeFinal
Field `subscriptions` may be 'final'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The {@link Subscription}s for this User, keyed by hostname.
     */
    private HashMap subscriptions = new HashMap();


```

### FieldMayBeFinal
Field `genders` may be 'final'
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private String[] sports = {"football", "baseball", "basketball"};

    private String[] genders = {"male", "female", "not sure"};

    private List<State> states;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * <p><code>Log</code> instance for this application. </p>
     */
    private Logger log = LogManager.getLogger(MailreaderSupport.class);

    /**
```

### FieldMayBeFinal
Field `carModelsAvailable` may be 'final'
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private List<State> states;

    private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};

    public String execute() throws Exception {
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private Person personBean;

    private String[] sports = {"football", "baseball", "basketball"};

    private String[] genders = {"male", "female", "not sure"};
```

### FieldMayBeFinal
Field `editService` may be 'final'
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
public class EditAction extends ActionSupport {

    private EditService editService = new EditServiceInMemory();

    private Person personBean;
```

### FieldMayBeFinal
Field `person` may be 'final'
in `form-xml-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
public class EditServiceInMemory implements EditService {

    private static Person person;
    private static String[] carModels = {"Ford", "Nissan"};

```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `form-xml-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java

    private static Person person;
    private static String[] carModels = {"Ford", "Nissan"};

    static {
```

### FieldMayBeFinal
Field `message` may be 'final'
in `using-tags/src/main/java/org/apache/struts/using_tags/helloworld/model/MessageStore.java`
#### Snippet
```java
public class MessageStore {
    
    private String message;
    
    public MessageStore() {
```

### FieldMayBeFinal
Field `log` may be 'final'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
     * Logging output for this user database instance.
     */
    private Log log = LogFactory.getLog(this.getClass());

    /**
```

### FieldMayBeFinal
Field `person` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
```

### FieldMayBeFinal
Field `editService` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private EditService editService = new EditServiceInMemory();
	private CarModelsService carModelsService = new CarModelsServiceHardCoded() ;
	
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	
	private Person personBean;
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
```

### FieldMayBeFinal
Field `carModelsService` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	
	private EditService editService = new EditServiceInMemory();
	private CarModelsService carModelsService = new CarModelsServiceHardCoded() ;
	
	private Person personBean;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
public class EditAction extends ActionSupport implements Preparable {

	private static Logger log = LogManager.getLogger(EditAction.class);
	private static final long serialVersionUID = 1L;
	
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private Person personBean;
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
	private List<State> states ;
	private String [] carModelsAvailable ;
```

### FieldMayBeFinal
Field `genders` may be 'final'
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private Person personBean;
	private String[] sports = {"football", "baseball", "basketball"};
	private String[] genders = {"male", "female", "not sure"};
	private List<State> states;
	private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};
```

### FieldMayBeFinal
Field `editService` may be 'final'
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;

	private EditService editService = new EditServiceInMemory();

	@Valid
```

### FieldMayBeFinal
Field `carModelsAvailable` may be 'final'
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private String[] genders = {"male", "female", "not sure"};
	private List<State> states;
	private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};

	public String execute() throws Exception {
```

### FieldMayBeFinal
Field `sports` may be 'final'
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	@Valid
	private Person personBean;
	private String[] sports = {"football", "baseball", "basketball"};
	private String[] genders = {"male", "female", "not sure"};
	private List<State> states;
```

### FieldMayBeFinal
Field `person` may be 'final'
in `bean-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
public class EditServiceInMemory implements EditService {
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

```

### FieldMayBeFinal
Field `carModels` may be 'final'
in `bean-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	static {
```

## RuleId[id=ServletWithoutMappingInspection]
### ServletWithoutMappingInspection
Filter should have a mapping
in `form-tags/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `dynamic-href/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `form-processing/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `form-validation/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `form-xml-validation/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `exclude-parameters/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `exception-handling/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `expression-cache/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>
            org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `file-upload/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>
            org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `crud/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `basic-struts/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `control-tags/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `debugging-struts/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `bean-validation/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `coding-actions/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `action-chaining/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `helloworld/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `http-session/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `annotations/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
        <init-param>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `interceptors/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `json/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `jfreechart/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>
            org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `json-customize/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `blank/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `message-store/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `message-resource/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `preparable-interface/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `jasperreports/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `mailreader2/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `restful2actionmapper/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `rest-angular/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `spring-struts/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

	<filter>
		<filter-name>struts2</filter-name>
		<filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
	</filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `text-provider/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `themes-override/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `shiro-basic/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  </listener>
  <filter>
    <filter-name>shiroFilter</filter-name>
    <filter-class>org.apache.shiro.web.servlet.ShiroFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `themes/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `shiro-basic/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  </filter-mapping>
  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `unit-testing/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `using-tags/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `unknown-handler/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `type-conversion/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `validation-messages/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>
      org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `wildcard-method-selection/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  					 
    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `wildcard-regex/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `tiles/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>struts2</filter-name>
        <filter-class>
            org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `tiles/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <servlet>
        <servlet-name>jspSupportServlet</servlet-name>
        <servlet-class>org.apache.struts2.views.JspSupportServlet</servlet-class>
        <load-on-startup>5</load-on-startup>
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `portlet/src/main/etc/exo/web.xml`
#### Snippet
```java

	<servlet>
		<servlet-name>preparator</servlet-name>
		<servlet-class>
			org.apache.struts2.portlet.context.PreparatorServlet
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `portlet/src/main/etc/gridsphere/web.xml`
#### Snippet
```java

	<servlet>
		<servlet-name>preparator</servlet-name>
		<servlet-class>
			org.apache.struts2.portlet.context.PreparatorServlet
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `portlet/src/main/etc/liferay3.6.1/web.xml`
#### Snippet
```java

	<servlet>
		<servlet-name>preparator</servlet-name>
		<servlet-class>
			org.apache.struts2.portlet.context.PreparatorServlet
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
	</listener>
  <filter>
	  <filter-name>plutoResourceFilter</filter-name>
	  <filter-class>com.bekk.boss.pluto.embedded.util.PlutResourcesFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  </filter>
  <filter>
	 <filter-name>plutoPortalDriver</filter-name>
	 <filter-class>com.bekk.boss.pluto.embedded.util.PlutoPortalDriverFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  -->
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.mortbay.jetty.servlet.DefaultServlet</servlet-class>
    <init-param>
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `portlet/src/main/webapp/WEB-INF/jetty-pluto-web-default.xml`
#### Snippet
```java
  <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  -->
  <servlet id="jsp">
    <servlet-name>jsp</servlet-name>
    <servlet-class>com.bekk.boss.pluto.embedded.util.PortletJspServlet</servlet-class>
    <init-param>
```

## RuleId[id=CachedNumberConstructorCall]
### CachedNumberConstructorCall
Number constructor call with primitive argument
in `form-xml-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
        person.setCarModels(carModels);
        person.setPhoneNumber("123-456-9999");
        person.setAge(new Integer(30));

    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `carModelsAvailable` is redundant
in `preparable-interface/src/main/java/org/apache/struts/edit/service/CarModelsServiceHardCoded.java`
#### Snippet
```java
	public String[] getCarModels() {
		
		String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
		
		return carModelsAvailable ;
```

### UnnecessaryLocalVariable
Local variable `carModelsAvailable` is redundant
in `exclude-parameters/src/main/java/org/apache/struts/edit/service/CarModelsServiceHardCoded.java`
#### Snippet
```java
	public String[] getCarModels() {
		
		String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
		
		return carModelsAvailable ;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `host` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The mail host for this subscription.
     */
    private String host = null;


```

### UnusedAssignment
Variable `user` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The {@link User} with which we are associated.
     */
    private User user = null;


```

### UnusedAssignment
Variable `database` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The {@link UserDatabase} with which we are associated.
     */
    private UserDatabase database = null;


```

### UnusedAssignment
Variable `username` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The username for this user.
     */
    private String username = null;


```

### UnusedAssignment
The value `null` assigned to `fis` is never used
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
            bis.close();
            bis = null;
            fis = null;
            this.open = true;

```

### UnusedAssignment
Variable `database` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    }

    private MemoryUserDatabase database = null;

    private Digester digester = null;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `id` is always 'null'
in `rest-angular/src/main/java/org/apache/examples/struts/actions/data/OrderController.java`
#### Snippet
```java
        }

        ordersService.remove(id);
        return "success";
    }
```

