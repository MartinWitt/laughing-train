# netbeans 
 
# Bad smells
I found 1026 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| WebProperties | 678 | false |
| SpringXmlModelInspection | 104 | false |
| RegExpSimplifiable | 70 | false |
| RegExpRedundantNestedCharacterClass | 59 | false |
| RegExpRedundantEscape | 31 | false |
| CdiDomBeans | 16 | false |
| DataFlowIssue | 12 | false |
| RegExpSingleCharAlternation | 11 | false |
| ConstantValue | 11 | false |
| DuplicatedCode | 8 | false |
| UnusedAssignment | 7 | false |
| SpringInjectionValueStyleInspection | 6 | false |
| SwitchStatementWithTooFewBranches | 5 | false |
| ServletWithoutMappingInspection | 2 | false |
| FieldMayBeFinal | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| PointlessBooleanExpression | 1 | true |
| ReassignedToPlainText | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=DataFlowIssue]
### DataFlowIssue
Switch label `0` is unreachable
in `enterprise/jsp.lexer/test/unit/data/input/JspLexerTest/testComplexJSP.jsp`
#### Snippet
```java
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
        }
```

### DataFlowIssue
Switch label `0` is unreachable
in `enterprise/jsp.lexer/test/unit/data/testfiles/tokensTest.jsp`
#### Snippet
```java
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
        }
```

### DataFlowIssue
Switch label `0` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensTest.jsp`
#### Snippet
```java
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
        }
```

### DataFlowIssue
Switch label `0` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensTag.tag`
#### Snippet
```java
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
        }
```

### DataFlowIssue
Method invocation `hasMoreElements` may produce `NullPointerException`
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/issue89174.jsp`
#### Snippet
```java

if (error == null){
while (systemPropertiesEnum.hasMoreElements ()){
String prop = systemPropertiesEnum.nextElement ().toString ();
out.print ("<tr><td><b>" + prop + "</b>" + "</td>");
```

### DataFlowIssue
Method invocation `getProperty` may produce `NullPointerException`
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/issue89174.jsp`
#### Snippet
```java
String prop = systemPropertiesEnum.nextElement ().toString ();
out.print ("<tr><td><b>" + prop + "</b>" + "</td>");
out.println ("<td>" + systemProperties.getProperty (prop) + "</td></tr>");
} // end while
} // end if
```

### DataFlowIssue
Switch label `10` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/reformatTest.jsp`
#### Snippet
```java
                int j = 3;
                switch(j){
            case 10:
break;
            case 20:
```

### DataFlowIssue
Switch label `20` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/reformatTest.jsp`
#### Snippet
```java
            case 10:
break;
            case 20:
break;
default:
```

### DataFlowIssue
Switch label `10` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
        <%  if(true){
            switch(age){
                case 10:
                    
                    a=b;
```

### DataFlowIssue
Switch label `10` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
                switch (age) {
                    
                    case 10:
                        dsds;
                        case 12:
```

### DataFlowIssue
Switch label `12` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
                    case 10:
                        dsds;
                        case 12:
                            kfkfdlf;
                            case 22:
```

### DataFlowIssue
Switch label `22` is unreachable
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
                        case 12:
                            kfkfdlf;
                            case 22:
                                fdfjd;
                            
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_1_2.xsd`
#### Snippet
```java

        <xsd:restriction base="xsd:string">
            <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
        </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `property` may be 'final'
in `enterprise/web.core.syntax/test/unit/data/testSingleJsps/JSPDeclaration.jsp`
#### Snippet
```java
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! private int property = 1; %>


```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsApplicationFactoryBean'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve property 'grailsDescriptor'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="grailsResourceLoader" ref="grailsResourceLoader" />
	</bean>
```

### SpringXmlModelInspection
Cannot resolve property 'grailsResourceLoader'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="grailsResourceLoader" ref="grailsResourceLoader" />
	</bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'plugins'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsPluginManagerFactoryBean'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve property 'grailsDescriptor'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="application" ref="grailsApplication" />
	</bean>
```

### SpringXmlModelInspection
Cannot resolve property 'application'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="application" ref="grailsApplication" />
	</bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <constructor-arg value="classpath*:**/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <constructor-arg value="classpath*:**/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <constructor-arg value="classpath*:**/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <constructor-arg value="classpath*:**/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'plugins'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <constructor-arg value="classpath*:**/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'DefaultPluginMetaManager'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <constructor-arg value="classpath*:**/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'spring'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsRuntimeConfigurator'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve property 'pluginManager'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
            <ref bean="grailsApplication" />
        </constructor-arg>
        <property name="pluginManager" ref="pluginManager" />
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsResourceLoaderFactoryBean'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'grailsResourceHolder'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'spring'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsResourceHolder'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve property 'resources'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'filter'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class 'CharacterEncodingFilter'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve property 'encoding'
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsApplicationFactoryBean'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve property 'grailsDescriptor'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	<bean id="grailsApplication" class="org.codehaus.groovy.grails.commons.GrailsApplicationFactoryBean">
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="grailsResourceLoader" ref="grailsResourceLoader" />
	</bean>
```

### SpringXmlModelInspection
Cannot resolve property 'grailsResourceLoader'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
		<description>Grails application factory bean</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="grailsResourceLoader" ref="grailsResourceLoader" />
	</bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'plugins'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsPluginManagerFactoryBean'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
```

### SpringXmlModelInspection
Cannot resolve property 'grailsDescriptor'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	<bean id="pluginManager" class="org.codehaus.groovy.grails.plugins.GrailsPluginManagerFactoryBean">
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="application" ref="grailsApplication" />
	</bean>
```

### SpringXmlModelInspection
Cannot resolve property 'application'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
		<description>A bean that manages Grails plugins</description>
        <property name="grailsDescriptor" value="/WEB-INF/grails.xml" />
        <property name="application" ref="grailsApplication" />
	</bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'plugins'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
```

### SpringXmlModelInspection
Cannot resolve class 'DefaultPluginMetaManager'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
	</bean>

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
```

### SpringXmlModelInspection
Cannot resolve property 'grailsApplication'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java

    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'resourcePattern'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    <bean id="pluginMetaManager" class="org.codehaus.groovy.grails.plugins.DefaultPluginMetaManager">
        <property name="grailsApplication" ref="grailsApplication" />
        <property name="resourcePattern" value="/WEB-INF/plugins/*/plugin.xml" />
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'spring'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsRuntimeConfigurator'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
```

### SpringXmlModelInspection
Cannot resolve property 'pluginManager'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
            <ref bean="grailsApplication" />
        </constructor-arg>
        <property name="pluginManager" ref="pluginManager" />
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsResourceLoaderFactoryBean'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'grailsResourceHolder'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java

    <bean id="grailsResourceLoader" class="org.codehaus.groovy.grails.commons.GrailsResourceLoaderFactoryBean">
        <property name="grailsResourceHolder" ref="grailsResourceHolder" />
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'codehaus'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'groovy'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'grails'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'spring'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve class 'GrailsResourceHolder'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    </bean>

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
```

### SpringXmlModelInspection
Cannot resolve property 'resources'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java

    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'org'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'filter'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve class 'CharacterEncodingFilter'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
```

### SpringXmlModelInspection
Cannot resolve property 'encoding'
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
   <bean id="characterEncodingFilter"
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
        </property>
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\ ` in RegExp
in `ide/xml/test/qa-functional/data/people.xsd`
#### Snippet
```java
<xs:simpleType name="SPZ">
    <xs:restriction base="xs:token">
        <xs:pattern value="[a-zA-Z]{2,3}\ \d{2}\-\d{2}"/>
    </xs:restriction>
</xs:simpleType>	
```

### RegExpRedundantEscape
Redundant character escape `\-` in RegExp
in `ide/xml/test/qa-functional/data/people.xsd`
#### Snippet
```java
<xs:simpleType name="SPZ">
    <xs:restriction base="xs:token">
        <xs:pattern value="[a-zA-Z]{2,3}\ \d{2}\-\d{2}"/>
    </xs:restriction>
</xs:simpleType>	
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `nbi/engine/src/org/netbeans/installer/product/state-file.xsd`
#### Snippet
```java
        <xsd:restriction base="xsd:string">
            <xsd:pattern 
                value="([A-Za-z0-9\-\._])+"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `nbi/engine/src/org/netbeans/installer/product/registry.xsd`
#### Snippet
```java
        <xsd:restriction base="xsd:string">
            <xsd:pattern 
                value="([A-Za-z0-9\-\._])+"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=ServletWithoutMappingInspection]
### ServletWithoutMappingInspection
Filter should have a mapping
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <description>FilterDescription</description>
        <filter-name>FilterName</filter-name>
        <filter-class>FilterClass</filter-class>
        <init-param>
```

### ServletWithoutMappingInspection
Servlet should have a mapping
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
<web-app>
    <servlet>
        <servlet-name>
            default
        </servlet-name>
        <servlet-class>
            org.apache.tomcat.servlets.DefaultServlet
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'org'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/input_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
</listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/input_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
</listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'web'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/input_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
</listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'context'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/input_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
</listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class 'ContextLoaderListener'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/input_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
</listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'org'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/output_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
        </listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/output_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
        </listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'web'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/output_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
        </listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'context'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/output_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
        </listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class 'ContextLoaderListener'
in `ide/xml.text/test/unit/src/org/netbeans/modules/xml/text/indent/output_tagAtStatOfLine.xml`
#### Snippet
```java
    <listener>
        <listener-class>
            org.springframework.web.context.ContextLoaderListener
        </listener-class> <-- should be indented by 8 -->
    </listener>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'GetRegistry'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'GetFile'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>get-file</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetFile</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'GetEngine'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>nbi-engine.jar</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.GetEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'RunCommand'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>run-command</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RunCommand</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'Install'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>install</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Install</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'Registries'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Registries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'CreateBundle'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>create-bundle</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.CreateBundle</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'Feed'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>feed</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Feed</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'AddPackage'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-package</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddPackage</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'Components'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'RemoveProduct'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-product</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveProduct</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'client'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'Components2'
in `nbi/infra/server/modules/war-client/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Components2</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.client.servlets.Components2</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'UpdateEngine'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>update-engine</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.UpdateEngine</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'AddRegistry'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>add-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.AddRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'RemoveRegistry'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-registry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveRegistry</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'RemoveGroup'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>remove-group</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.RemoveGroup</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'ManageRegistries'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>manage-registries</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ManageRegistries</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'GenerateBundles'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>generate-bundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.GenerateBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'DeleteBundles'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>DeleteBundles</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.DeleteBundles</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'installer'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'infra'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'server'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'admin'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ExportRegistry'
in `nbi/infra/server/modules/war-admin/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExportRegistry</servlet-name>
        <servlet-class>org.netbeans.installer.infra.server.admin.servlets.ExportRegistry</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'mypackage'
in `java/ant.freeform/test/unit/data/example-projects/web_jakarta/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HelloWorld</servlet-name>
    <servlet-class>mypackage.HelloWorld</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'HelloWorld'
in `java/ant.freeform/test/unit/data/example-projects/web_jakarta/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HelloWorld</servlet-name>
    <servlet-class>mypackage.HelloWorld</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_2_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_1_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_1_2.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'jsf'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'util'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class 'UploadFilter'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <filter>
        <filter-name>UploadFilter</filter-name>
        <filter-class>com.sun.webui.jsf.util.UploadFilter</filter-class>
        <init-param>
            <description>The maximum allowed upload size in bytes.  If this is set to a negative value, there is no maximum.  The default value is 1000000.</description>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <init-param>
            <param-name>javax.faces.LIFECYCLE_ID</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'errorhandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ExceptionHandlerServlet</servlet-name>
        <servlet-class>com.sun.errorhandler.ExceptionHandler</servlet-class>
        <init-param>
            <param-name>errorHost</param-name>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'webui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'theme'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ThemeServlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ThemeServlet</servlet-name>
        <servlet-class>com.sun.webui.theme.ThemeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ServletException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
        </welcome-file-list>
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.servlet.ServletException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'java'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'io'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'IOException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>java.io.IOException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'javax'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'faces'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'FacesException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>javax.faces.FacesException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <error-page>
```

### WebProperties
Cannot resolve class or package 'com'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'sun'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'rave'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'web'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'ui'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class or package 'appbase'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve class 'ApplicationException'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    </error-page>
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
```

### WebProperties
Cannot resolve directory 'error'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'ExceptionHandler'
in `java/performance.java/test/qa-functional/data/PerformanceTestFoldersData/src/folders/xmlFolder100/web_3.xml`
#### Snippet
```java
    <error-page>
        <exception-type>com.sun.rave.web.ui.appbase.ApplicationException</exception-type>
        <location>/error/ExceptionHandler</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve class or package 'web'
in `contrib/j2ee.jboss4/test/qa-functional/data/JBoss4WebTest/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Test</servlet-name>
        <servlet-class>web.Test</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'Test'
in `contrib/j2ee.jboss4/test/qa-functional/data/JBoss4WebTest/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Test</servlet-name>
        <servlet-class>web.Test</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'jnlp'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>JnlpDownloadServlet</servlet-name>
        <servlet-class>jnlp.sample.servlet.JnlpDownloadServlet</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'sample'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>JnlpDownloadServlet</servlet-name>
        <servlet-class>jnlp.sample.servlet.JnlpDownloadServlet</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>JnlpDownloadServlet</servlet-name>
        <servlet-class>jnlp.sample.servlet.JnlpDownloadServlet</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'JnlpDownloadServlet'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>JnlpDownloadServlet</servlet-name>
        <servlet-class>jnlp.sample.servlet.JnlpDownloadServlet</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>IndexServlet</servlet-name>
        <servlet-class>org.netbeans.jnlp.IndexServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>IndexServlet</servlet-name>
        <servlet-class>org.netbeans.jnlp.IndexServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'jnlp'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>IndexServlet</servlet-name>
        <servlet-class>org.netbeans.jnlp.IndexServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'IndexServlet'
in `nbbuild/installer/jnlp/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>IndexServlet</servlet-name>
        <servlet-class>org.netbeans.jnlp.IndexServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.el/test/unit/data/projects/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot convert empty string to target class 'java.lang.Integer'
in `enterprise/j2ee.dd/test/unit/data/invalid/web_org.xml`
#### Snippet
```java
	 version="3.0">
    <session-config>
        <session-timeout
            30
        </session-timeout>
```

### WebProperties
Cannot resolve class or package 'org'
in `enterprise/tomcat5/test/unit/data/server/home0/conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `enterprise/tomcat5/test/unit/data/server/home0/conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'jasper'
in `enterprise/tomcat5/test/unit/data/server/home0/conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `enterprise/tomcat5/test/unit/data/server/home0/conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class 'JspServlet'
in `enterprise/tomcat5/test/unit/data/server/home0/conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/EntityHintsApp/web/WEB-INF/web.xml`
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
in `enterprise/j2ee.kit/test/qa-functional/data/projects/EntityHintsApp/web/WEB-INF/web.xml`
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
in `enterprise/j2ee.kit/test/qa-functional/data/projects/EntityHintsApp/web/WEB-INF/web.xml`
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
in `enterprise/j2ee.kit/test/qa-functional/data/projects/EntityHintsApp/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
        </servlet>
```

### WebProperties
Cannot resolve class 'FilterClass'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>FilterDescription</description>
        <filter-name>FilterName</filter-name>
        <filter-class>FilterClass</filter-class>
        <init-param>
            <description>FilterParamDescription</description>
```

### WebProperties
Cannot resolve Filter 'MappedFilterName'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
    </filter>
    <filter-mapping>
        <filter-name>MappedFilterName</filter-name>
        <url-pattern>/*</url-pattern>
        <dispatcher>REQUEST</dispatcher>
```

### WebProperties
Cannot resolve class 'listenerclass'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
    <listener>
        <description>listenerdescription</description>
        <listener-class>listenerclass</listener-class>
    </listener>
    <servlet>
```

### WebProperties
Cannot resolve class 'ServletClass'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ServletDescription</description>
        <servlet-name>ServletName</servlet-name>
        <servlet-class>ServletClass</servlet-class>
        <init-param>
            <description>ServletParamDesc</description>
```

### WebProperties
Cannot resolve file 'index.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
    <error-page>
        <error-code>404</error-code>
        <location>/index.jsp</location>
    </error-page>
    <jsp-config>
```

### WebProperties
Cannot resolve file 'head.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
            <scripting-invalid>true</scripting-invalid>
            <is-xml>true</is-xml>
            <include-prelude>head.jsp</include-prelude>
            <include-prelude>head2.jsp</include-prelude>
            <include-coda>foot.jsp</include-coda>
```

### WebProperties
Cannot resolve file 'head2.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
            <is-xml>true</is-xml>
            <include-prelude>head.jsp</include-prelude>
            <include-prelude>head2.jsp</include-prelude>
            <include-coda>foot.jsp</include-coda>
            <include-coda>foot2.jsp</include-coda>
```

### WebProperties
Cannot resolve file 'foot.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
            <include-prelude>head.jsp</include-prelude>
            <include-prelude>head2.jsp</include-prelude>
            <include-coda>foot.jsp</include-coda>
            <include-coda>foot2.jsp</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve file 'foot2.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
            <include-prelude>head2.jsp</include-prelude>
            <include-coda>foot.jsp</include-coda>
            <include-coda>foot2.jsp</include-coda>
        </jsp-property-group>
    </jsp-config>
```

### WebProperties
Cannot resolve file 'login.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <auth-method>FORM</auth-method>
        <form-login-config>
            <form-login-page>/login.jsp</form-login-page>
            <form-error-page>/loginError.jsp</form-error-page>
        </form-login-config>
```

### WebProperties
Cannot resolve file 'loginError.jsp'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <form-login-config>
            <form-login-page>/login.jsp</form-login-page>
            <form-error-page>/loginError.jsp</form-error-page>
        </form-login-config>
    </login-config>
```

### WebProperties
Cannot resolve class 'EJBHome2'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <ejb-ref-name>EJBName2</ejb-ref-name>
        <ejb-ref-type>Session</ejb-ref-type>
        <home>EJBHome2</home>
        <remote>EJBRemote</remote>
        <ejb-link>LinkedEJB2</ejb-link>
```

### WebProperties
Cannot resolve class 'EJBRemote'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <ejb-ref-type>Session</ejb-ref-type>
        <home>EJBHome2</home>
        <remote>EJBRemote</remote>
        <ejb-link>LinkedEJB2</ejb-link>
    </ejb-ref>
```

### WebProperties
Cannot resolve symbol 'LinkedEJB2'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <home>EJBHome2</home>
        <remote>EJBRemote</remote>
        <ejb-link>LinkedEJB2</ejb-link>
    </ejb-ref>
    <ejb-local-ref>
```

### WebProperties
Cannot resolve class 'EJBHome'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <ejb-ref-name>EJBName</ejb-ref-name>
        <ejb-ref-type>Entity</ejb-ref-type>
        <local-home>EJBHome</local-home>
        <local>EJBLocal</local>
        <ejb-link>LinkedEJB</ejb-link>
```

### WebProperties
Cannot resolve class 'EJBLocal'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <ejb-ref-type>Entity</ejb-ref-type>
        <local-home>EJBHome</local-home>
        <local>EJBLocal</local>
        <ejb-link>LinkedEJB</ejb-link>
    </ejb-local-ref>
```

### WebProperties
Cannot resolve symbol 'LinkedEJB'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <local-home>EJBHome</local-home>
        <local>EJBLocal</local>
        <ejb-link>LinkedEJB</ejb-link>
    </ejb-local-ref>
    <resource-ref>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ResDesc</description>
        <res-ref-name>ResName</res-ref-name>
        <res-type>javax.mail.Session</res-type>
        <res-auth>Application</res-auth>
        <res-sharing-scope>Unshareable</res-sharing-scope>
```

### WebProperties
Cannot resolve class or package 'mail'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ResDesc</description>
        <res-ref-name>ResName</res-ref-name>
        <res-type>javax.mail.Session</res-type>
        <res-auth>Application</res-auth>
        <res-sharing-scope>Unshareable</res-sharing-scope>
```

### WebProperties
Cannot resolve class 'Session'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ResDesc</description>
        <res-ref-name>ResName</res-ref-name>
        <res-type>javax.mail.Session</res-type>
        <res-auth>Application</res-auth>
        <res-sharing-scope>Unshareable</res-sharing-scope>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ResEnvdesc</description>
        <resource-env-ref-name>ResEnvName</resource-env-ref-name>
        <resource-env-ref-type>javax.jms.Topic</resource-env-ref-type>
    </resource-env-ref>
    <message-destination-ref>
```

### WebProperties
Cannot resolve class or package 'jms'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ResEnvdesc</description>
        <resource-env-ref-name>ResEnvName</resource-env-ref-name>
        <resource-env-ref-type>javax.jms.Topic</resource-env-ref-type>
    </resource-env-ref>
    <message-destination-ref>
```

### WebProperties
Cannot resolve class 'Topic'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>ResEnvdesc</description>
        <resource-env-ref-name>ResEnvName</resource-env-ref-name>
        <resource-env-ref-type>javax.jms.Topic</resource-env-ref-type>
    </resource-env-ref>
    <message-destination-ref>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>MsgDesc</description>
        <message-destination-ref-name>MsgName</message-destination-ref-name>
        <message-destination-type>javax.jms.Topic</message-destination-type>
        <message-destination-usage>Produces</message-destination-usage>
        <message-destination-link>MsgLink</message-destination-link>
```

### WebProperties
Cannot resolve class or package 'jms'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>MsgDesc</description>
        <message-destination-ref-name>MsgName</message-destination-ref-name>
        <message-destination-type>javax.jms.Topic</message-destination-type>
        <message-destination-usage>Produces</message-destination-usage>
        <message-destination-link>MsgLink</message-destination-link>
```

### WebProperties
Cannot resolve class 'Topic'
in `enterprise/j2ee.kit/test/qa-functional/data/projects/TestWebApp/web/WEB-INF/web.xml`
#### Snippet
```java
        <description>MsgDesc</description>
        <message-destination-ref-name>MsgName</message-destination-ref-name>
        <message-destination-type>javax.jms.Topic</message-destination-type>
        <message-destination-usage>Produces</message-destination-usage>
        <message-destination-link>MsgLink</message-destination-link>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>TestingServlet</servlet-name>
        <servlet-class>test.TestingServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'TestingServlet'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>TestingServlet</servlet-name>
        <servlet-class>test.TestingServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
        <ejb-ref-name>TestingSessionBean</ejb-ref-name>
        <ejb-ref-type>Session</ejb-ref-type>
        <local-home>test.TestingSessionLocalHome</local-home>
        <local>test.TestingSessionLocal</local>
        <ejb-link>TestingEntApp-EJBModule.jar#TestingSessionBean</ejb-link>
```

### WebProperties
Cannot resolve class 'TestingSessionLocalHome'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
        <ejb-ref-name>TestingSessionBean</ejb-ref-name>
        <ejb-ref-type>Session</ejb-ref-type>
        <local-home>test.TestingSessionLocalHome</local-home>
        <local>test.TestingSessionLocal</local>
        <ejb-link>TestingEntApp-EJBModule.jar#TestingSessionBean</ejb-link>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
        <ejb-ref-type>Session</ejb-ref-type>
        <local-home>test.TestingSessionLocalHome</local-home>
        <local>test.TestingSessionLocal</local>
        <ejb-link>TestingEntApp-EJBModule.jar#TestingSessionBean</ejb-link>
    </ejb-local-ref>
```

### WebProperties
Cannot resolve class 'TestingSessionLocal'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
        <ejb-ref-type>Session</ejb-ref-type>
        <local-home>test.TestingSessionLocalHome</local-home>
        <local>test.TestingSessionLocal</local>
        <ejb-link>TestingEntApp-EJBModule.jar#TestingSessionBean</ejb-link>
    </ejb-local-ref>
```

### WebProperties
Cannot resolve symbol 'TestingEntApp-EJBModule.jar#TestingSessionBean'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInServlet_web.xml`
#### Snippet
```java
        <local-home>test.TestingSessionLocalHome</local-home>
        <local>test.TestingSessionLocal</local>
        <ejb-link>TestingEntApp-EJBModule.jar#TestingSessionBean</ejb-link>
    </ejb-local-ref>
</web-app>
```

### WebProperties
Cannot resolve class or package 'sample'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>WSServlet_SampleWebService</servlet-name>
    <servlet-class>sample.SampleWebServiceImpl</servlet-class>
    <load-on-startup>1</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class 'SampleWebServiceImpl'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>WSServlet_SampleWebService</servlet-name>
    <servlet-class>sample.SampleWebServiceImpl</servlet-class>
    <load-on-startup>1</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'sample'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
        <ejb-ref-name>ejb/SampleSessionBean</ejb-ref-name>
        <ejb-ref-type>Session</ejb-ref-type>
        <home>sample.SampleSessionRemoteHome</home>
        <remote>sample.SampleSessionRemote</remote>
        <ejb-link>SampleApp-EJBModule.jar#SampleSessionBean</ejb-link>
```

### WebProperties
Cannot resolve class 'SampleSessionRemoteHome'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
        <ejb-ref-name>ejb/SampleSessionBean</ejb-ref-name>
        <ejb-ref-type>Session</ejb-ref-type>
        <home>sample.SampleSessionRemoteHome</home>
        <remote>sample.SampleSessionRemote</remote>
        <ejb-link>SampleApp-EJBModule.jar#SampleSessionBean</ejb-link>
```

### WebProperties
Cannot resolve class or package 'sample'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
        <ejb-ref-type>Session</ejb-ref-type>
        <home>sample.SampleSessionRemoteHome</home>
        <remote>sample.SampleSessionRemote</remote>
        <ejb-link>SampleApp-EJBModule.jar#SampleSessionBean</ejb-link>
    </ejb-ref>
```

### WebProperties
Cannot resolve class 'SampleSessionRemote'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
        <ejb-ref-type>Session</ejb-ref-type>
        <home>sample.SampleSessionRemoteHome</home>
        <remote>sample.SampleSessionRemote</remote>
        <ejb-link>SampleApp-EJBModule.jar#SampleSessionBean</ejb-link>
    </ejb-ref>
```

### WebProperties
Cannot resolve symbol 'SampleApp-EJBModule.jar#SampleSessionBean'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/CallEJBTest/testCallEJBInWS_web.xml`
#### Snippet
```java
        <home>sample.SampleSessionRemoteHome</home>
        <remote>sample.SampleSessionRemote</remote>
        <ejb-link>SampleApp-EJBModule.jar#SampleSessionBean</ejb-link>
    </ejb-ref>
    </web-app>
```

### WebProperties
Cannot resolve class or package 'sample'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/AddOperationTest/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>WSServlet_SampleWebService</servlet-name>
    <servlet-class>sample.SampleWebServiceImpl</servlet-class>
    <load-on-startup>1</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class 'SampleWebServiceImpl'
in `enterprise/j2ee.kit/test/qa-functional/data/goldenfiles/org/netbeans/test/j2ee/addmethod/AddOperationTest/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>WSServlet_SampleWebService</servlet-name>
    <servlet-class>sample.SampleWebServiceImpl</servlet-class>
    <load-on-startup>1</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/j2ee.kit/test/qa-functional/data/TestingEntApp/TestingEntApp-war/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>TestingServlet</servlet-name>
    <servlet-class>test.TestingServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'TestingServlet'
in `enterprise/j2ee.kit/test/qa-functional/data/TestingEntApp/TestingEntApp-war/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>TestingServlet</servlet-name>
    <servlet-class>test.TestingServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'web'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>AccountState</servlet-name>
    <servlet-class>web.AccountState</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'AccountState'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>AccountState</servlet-name>
    <servlet-class>web.AccountState</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'ejb'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
    <ejb-ref-name>ejb/AccountStateBean</ejb-ref-name>
    <ejb-ref-type>Session</ejb-ref-type>
    <local-home>ejb.AccountStateLocalHome</local-home>
    <local>ejb.AccountStateLocal</local>
    <ejb-link>Secure-EJBModule.jar#AccountStateBean</ejb-link>
```

### WebProperties
Cannot resolve class 'AccountStateLocalHome'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
    <ejb-ref-name>ejb/AccountStateBean</ejb-ref-name>
    <ejb-ref-type>Session</ejb-ref-type>
    <local-home>ejb.AccountStateLocalHome</local-home>
    <local>ejb.AccountStateLocal</local>
    <ejb-link>Secure-EJBModule.jar#AccountStateBean</ejb-link>
```

### WebProperties
Cannot resolve class or package 'ejb'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
    <ejb-ref-type>Session</ejb-ref-type>
    <local-home>ejb.AccountStateLocalHome</local-home>
    <local>ejb.AccountStateLocal</local>
    <ejb-link>Secure-EJBModule.jar#AccountStateBean</ejb-link>
  </ejb-local-ref>
```

### WebProperties
Cannot resolve class 'AccountStateLocal'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
    <ejb-ref-type>Session</ejb-ref-type>
    <local-home>ejb.AccountStateLocalHome</local-home>
    <local>ejb.AccountStateLocal</local>
    <ejb-link>Secure-EJBModule.jar#AccountStateBean</ejb-link>
  </ejb-local-ref>
```

### WebProperties
Cannot resolve symbol 'Secure-EJBModule.jar#AccountStateBean'
in `enterprise/j2ee.kit/test/qa-functional/data/freeform_projects/Secure/Secure-war/web/WEB-INF/web.xml`
#### Snippet
```java
    <local-home>ejb.AccountStateLocalHome</local-home>
    <local>ejb.AccountStateLocal</local>
    <ejb-link>Secure-EJBModule.jar#AccountStateBean</ejb-link>
  </ejb-local-ref>
</web-app>
```

### WebProperties
Cannot resolve class or package 'org'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.apache.tomcat.servlets.DefaultServlet
        </servlet-class>
	<load-on-startup>
```

### WebProperties
Cannot resolve class or package 'apache'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.apache.tomcat.servlets.DefaultServlet
        </servlet-class>
	<load-on-startup>
```

### WebProperties
Cannot resolve class or package 'tomcat'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.apache.tomcat.servlets.DefaultServlet
        </servlet-class>
	<load-on-startup>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.apache.tomcat.servlets.DefaultServlet
        </servlet-class>
	<load-on-startup>
```

### WebProperties
Cannot resolve class 'DefaultServlet'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.apache.tomcat.servlets.DefaultServlet
        </servlet-class>
	<load-on-startup>
```

### WebProperties
Cannot resolve class or package 'org'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
-->
        <servlet-class>
            org.apache.tomcat.servlets.InvokerServlet
        </servlet-class>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'apache'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
-->
        <servlet-class>
            org.apache.tomcat.servlets.InvokerServlet
        </servlet-class>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'tomcat'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
-->
        <servlet-class>
            org.apache.tomcat.servlets.InvokerServlet
        </servlet-class>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
-->
        <servlet-class>
            org.apache.tomcat.servlets.InvokerServlet
        </servlet-class>
    </servlet>
```

### WebProperties
Cannot resolve class 'InvokerServlet'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
-->
        <servlet-class>
            org.apache.tomcat.servlets.InvokerServlet
        </servlet-class>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Cannot resolve class or package 'netbeans'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Cannot resolve class or package 'modules'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Cannot resolve class or package 'web'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Cannot resolve class or package 'core'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Cannot resolve class or package 'execution'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Cannot resolve class 'JspServlet'
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
        </servlet-name>
        <servlet-class>
            org.netbeans.modules.web.core.execution.JspServlet
        </servlet-class>

```

### WebProperties
Mime Mapping with such name already exists
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
    </mime-mapping>
    <mime-mapping>
        <extension>
            ps
        </extension>
        <mime-type>
            application/x-postscript
```

### WebProperties
Mime Mapping with such name already exists
in `enterprise/web.core/src/org/netbeans/modules/web/core/resources/defaultweb.xml`
#### Snippet
```java
    </mime-mapping>
    <mime-mapping>
        <extension>
            ps
        </extension>
        <mime-type>
            application/postscript
```

### WebProperties
Cannot resolve class or package 'org'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DivideServlet</servlet-name>
    <servlet-class>org.netbeans.test.servlets.DivideServlet</servlet-class>
  </servlet>
  <servlet>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DivideServlet</servlet-name>
    <servlet-class>org.netbeans.test.servlets.DivideServlet</servlet-class>
  </servlet>
  <servlet>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DivideServlet</servlet-name>
    <servlet-class>org.netbeans.test.servlets.DivideServlet</servlet-class>
  </servlet>
  <servlet>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DivideServlet</servlet-name>
    <servlet-class>org.netbeans.test.servlets.DivideServlet</servlet-class>
  </servlet>
  <servlet>
```

### WebProperties
Cannot resolve class 'DivideServlet'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DivideServlet</servlet-name>
    <servlet-class>org.netbeans.test.servlets.DivideServlet</servlet-class>
  </servlet>
  <servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Multiply</servlet-name>
    <servlet-class>org.netbeans.test.servlets.Multiply</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'netbeans'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Multiply</servlet-name>
    <servlet-class>org.netbeans.test.servlets.Multiply</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Multiply</servlet-name>
    <servlet-class>org.netbeans.test.servlets.Multiply</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Multiply</servlet-name>
    <servlet-class>org.netbeans.test.servlets.Multiply</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'Multiply'
in `enterprise/web.debug/test/qa-functional/data/MainTestApplication/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Multiply</servlet-name>
    <servlet-class>org.netbeans.test.servlets.Multiply</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'NewServlet'
in `enterprise/web.jspparser/test/unit/data/project2/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>NewServlet</servlet-name>
        <servlet-class>NewServlet</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve directory 'codaprelude'
in `enterprise/web.jspparser/test/unit/data/project2/web/WEB-INF/web.xml`
#### Snippet
```java
            <display-name>Test</display-name>
            <url-pattern>/inludePreludeCoda.jsp</url-pattern>
            <include-prelude>/codaprelude/header.jsp</include-prelude>
            <include-coda>/codaprelude/footer.jsp</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve file 'header.jsp'
in `enterprise/web.jspparser/test/unit/data/project2/web/WEB-INF/web.xml`
#### Snippet
```java
            <display-name>Test</display-name>
            <url-pattern>/inludePreludeCoda.jsp</url-pattern>
            <include-prelude>/codaprelude/header.jsp</include-prelude>
            <include-coda>/codaprelude/footer.jsp</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve directory 'codaprelude'
in `enterprise/web.jspparser/test/unit/data/project2/web/WEB-INF/web.xml`
#### Snippet
```java
            <url-pattern>/inludePreludeCoda.jsp</url-pattern>
            <include-prelude>/codaprelude/header.jsp</include-prelude>
            <include-coda>/codaprelude/footer.jsp</include-coda>
        </jsp-property-group>
        <jsp-property-group>
```

### WebProperties
Cannot resolve file 'footer.jsp'
in `enterprise/web.jspparser/test/unit/data/project2/web/WEB-INF/web.xml`
#### Snippet
```java
            <url-pattern>/inludePreludeCoda.jsp</url-pattern>
            <include-prelude>/codaprelude/header.jsp</include-prelude>
            <include-coda>/codaprelude/footer.jsp</include-coda>
        </jsp-property-group>
        <jsp-property-group>
```

### WebProperties
Cannot resolve class or package 'abc'
in `enterprise/j2ee.ddloaders/test/unit/data/projects/webapp/web/WEB-INF/web.xml`
#### Snippet
```java
  <listener>
    <description>ServletContextListener</description>
    <listener-class>abc.NewServletListener</listener-class>
  </listener>
  <servlet>
```

### WebProperties
Cannot resolve class 'NewServletListener'
in `enterprise/j2ee.ddloaders/test/unit/data/projects/webapp/web/WEB-INF/web.xml`
#### Snippet
```java
  <listener>
    <description>ServletContextListener</description>
    <listener-class>abc.NewServletListener</listener-class>
  </listener>
  <servlet>
```

### WebProperties
Cannot resolve class or package 'abc'
in `enterprise/j2ee.ddloaders/test/unit/data/projects/webapp/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>NewServlet</servlet-name>
    <servlet-class>abc.NewServlet</servlet-class>
    <init-param>
      <param-name>Name</param-name>
```

### WebProperties
Cannot resolve class 'NewServlet'
in `enterprise/j2ee.ddloaders/test/unit/data/projects/webapp/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>NewServlet</servlet-name>
    <servlet-class>abc.NewServlet</servlet-class>
    <init-param>
      <param-name>Name</param-name>
```

### WebProperties
Cannot resolve class or package 'web'
in `enterprise/javaee.wildfly/test/qa-functional/data/JBoss4WebTest/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Test</servlet-name>
        <servlet-class>web.Test</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'Test'
in `enterprise/javaee.wildfly/test/qa-functional/data/JBoss4WebTest/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Test</servlet-name>
        <servlet-class>web.Test</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Context Param with such name already exists
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF22/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF22/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF22/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.editor/test/qa-functional/data/sampleJSF22/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'com'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'sun'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'jersey'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'spi'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'container'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'ServletContainer'
in `enterprise/websvc.restkit/test/qa-functional/data/projects/NodesSample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>ServletAdaptor</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/performance.web/test/unit/data/TestWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>TestServlet</servlet-name>
    <servlet-class>test.TestServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'TestServlet'
in `enterprise/performance.web/test/unit/data/TestWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>TestServlet</servlet-name>
    <servlet-class>test.TestServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'test'
in `enterprise/performance.web/test/qa-functional/data/TestWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>TestServlet</servlet-name>
    <servlet-class>test.TestServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'TestServlet'
in `enterprise/performance.web/test/qa-functional/data/TestWebProject/web/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>TestServlet</servlet-name>
    <servlet-class>test.TestServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'javax'
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JSF/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JSF/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JSF/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JSF/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JavaEE6/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JavaEE6/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JavaEE6/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/CompletionTestProjects/JavaEE6/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/AutoCompletionTestProjects/AutoCompletionProject/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/AutoCompletionTestProjects/AutoCompletionProject/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/AutoCompletionTestProjects/AutoCompletionProject/web/WEB-INF/web.xml`
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
in `enterprise/web.core.syntax/test/qa-functional/data/AutoCompletionTestProjects/AutoCompletionProject/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.navigation/test/unit/src/org/netbeans/modules/web/jsf/navigation/TestJSFApp/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.navigation/test/unit/src/org/netbeans/modules/web/jsf/navigation/TestJSFApp/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.navigation/test/unit/src/org/netbeans/modules/web/jsf/navigation/TestJSFApp/web/WEB-INF/web.xml`
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
in `enterprise/web.jsf.navigation/test/unit/src/org/netbeans/modules/web/jsf/navigation/TestJSFApp/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
        </servlet>
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/reformatTest.jsp`
#### Snippet
```java
break;
            case 20:
break;
default:

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `enterprise/jsp.lexer/test/unit/data/testfiles/tokensTest.jsp`
#### Snippet
```java
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `enterprise/jsp.lexer/test/unit/data/input/JspLexerTest/testComplexJSP.jsp`
#### Snippet
```java
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensTest.jsp`
#### Snippet
```java
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensTag.tag`
#### Snippet
```java
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
            default: run ();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
        <%  if(true){
            switch(age){
                case 10:
                    
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/css/main.css`
#### Snippet
```java
html * {
    margin: 0;
    /*padding: 0; SELECT NOT DISPLAYED CORRECTLY IN FIREFOX */
```

### DuplicatedCode
Duplicated code
in `enterprise/web.jsf.editor/test/unit/data/testWebProject/web/resources/css/default.css`
#### Snippet
```java
body {
    background-color: #ffffff;
    font-size: 12px;
```

### DuplicatedCode
Duplicated code
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/jsfcrud.css`
#### Snippet
```java
    border-top-style: solid;
    border-bottom-style: solid;
    border-left-style: solid;
    border-right-style: solid;
    border-top-width: 1px;
    border-bottom-width: 1px;
    border-left-width: 1px;
    border-right-width: 1px;
    border-top-color: #b2d5d6;
    border-bottom-color: #b2d5d6;
```

### DuplicatedCode
Duplicated code
in `ide/csl.api/src/org/netbeans/modules/csl/hints/infrastructure/ide.css`
#### Snippet
```java
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
```

### DuplicatedCode
Duplicated code
in `ide/css.editor/test/unit/data/testfiles/netbeans.css`
#### Snippet
```java
/* -------- DIRECT STYLES FOR TAGS-----------*/
body {
color: #333333; padding:0px; margin:0px;
```

### DuplicatedCode
Duplicated code
in `nb/ide.branding/release-toplevel/netbeans.css`
#### Snippet
```java
.moduletitle {
  font-family: Arial, "Arial CE", "Lucida Grande CE", lucida, "Helvetica CE", sans-serif;
  font-size: 22px;
  font-weight:normal;
  margin-top:4px;
  margin-bottom:20px;
  padding-bottom:0px;
  border-bottom:1px solid #AFAFAF;
  color:#0E1B55;
  background-image:url("/images/v4/bg_icon.gif");
  background-repeat:no-repeat;
  background-position:right;
}
```

### DuplicatedCode
Duplicated code
in `nbbuild/javadoctools/javadoc-generic.css`
#### Snippet
```java
    background-color:#4D7A97;
    color:#FFFFFF;
    float:left;
    padding:0;
    width:100%;
    clear:right;
    height:2.8em;
    padding-top:10px;
    overflow:hidden;
    font-size:12px; 
```

### DuplicatedCode
Duplicated code
in `webcommon/javascript.nodejs/samples_src/MessagesAngular/client/styles/style.css`
#### Snippet
```java
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/OTA_TI_simple.xsd`
#### Snippet
```java
		</xs:annotation>
		<xs:restriction base="xs:string">
			<xs:pattern value="[0-9A-Z]{1,3}(\.[A-Z]{3}(\.X){0,1}){0,1}"/>
		</xs:restriction>
	</xs:simpleType>	
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/OTA_TI_simple.xsd`
#### Snippet
```java
		</xs:annotation>
		<xs:restriction base="xs:string">
			<xs:pattern value="[0-9A-Z]{1,3}(\.[A-Z]{3}(\.X){0,1}){0,1}"/>
		</xs:restriction>
	</xs:simpleType>	
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_0.xsd`
#### Snippet
```java

        <xsd:restriction base="xsd:string">
            <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
        </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_2.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[a-z0-9_.\-][a-z0-9_.\-]*` can be simplified to '\[a-z0-9_.\\-\]+'
in `enterprise/j2ee.earproject/src/org/netbeans/modules/j2ee/earproject/resources/ear-prj.xsd`
#### Snippet
```java
    <xsd:simpleType name="pathType">
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[a-z0-9_.\-][a-z0-9_.\-]*(/[a-z0-9_.\-][a-z0-9_.\-]*)*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpSimplifiable
`[a-z0-9_.\-][a-z0-9_.\-]*` can be simplified to '\[a-z0-9_.\\-\]+'
in `enterprise/j2ee.earproject/src/org/netbeans/modules/j2ee/earproject/resources/ear-prj.xsd`
#### Snippet
```java
    <xsd:simpleType name="pathType">
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[a-z0-9_.\-][a-z0-9_.\-]*(/[a-z0-9_.\-][a-z0-9_.\-]*)*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

## RuleId[id=CdiDomBeans]
### CdiDomBeans
Cannot resolve class 'Class1'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans-orig.xml`
#### Snippet
```java
<beans xmlns="http://java.sun.com/xml/ns/javaee">
	<alternatives>
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
	</alternatives>
```

### CdiDomBeans
@Alternative stereotype annotation class expected here
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans-orig.xml`
#### Snippet
```java
	<alternatives>
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
	</alternatives>
</beans>
```

### CdiDomBeans
Cannot resolve class 'Class2'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/beans-orig.xml`
#### Snippet
```java
	<interceptors/>
	<decorators>
		<class>Class2</class>
	</decorators>
	<alternatives/>
```

### CdiDomBeans
Cannot resolve class 'Stereotype1'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans-orig.xml`
#### Snippet
```java
	<alternatives>
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
	</alternatives>
</beans>
```

### CdiDomBeans
Cannot resolve class 'Class1'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/beans.xml`
#### Snippet
```java
	<interceptors/>
	<interceptors>
		<class>Class1</class>
	</interceptors>
	<decorators>
```

### CdiDomBeans
Cannot resolve class 'Class2'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/beans.xml`
#### Snippet
```java
	</interceptors>
	<decorators>
		<class>Class2</class>
	</decorators>
	<alternatives/>
```

### CdiDomBeans
Cannot resolve class 'Class1'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
<beans xmlns="http://java.sun.com/xml/ns/javaee">
	<alternatives>
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
		<class>Class2</class>
```

### CdiDomBeans
Cannot resolve class 'Class3'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/beans.xml`
#### Snippet
```java
	<decorators/>
	<alternatives>
		<class>Class3</class>
		<stereotype>Stereotype1</stereotype>
	</alternatives>
```

### CdiDomBeans
@Alternative stereotype annotation class expected here
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
	<alternatives>
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
		<class>Class2</class>
		<class>Class3</class>
```

### CdiDomBeans
@Alternative stereotype annotation class expected here
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/beans.xml`
#### Snippet
```java
	<alternatives>
		<class>Class3</class>
		<stereotype>Stereotype1</stereotype>
	</alternatives>
</beans>
```

### CdiDomBeans
Cannot resolve class 'Stereotype1'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
	<alternatives>
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
		<class>Class2</class>
		<class>Class3</class>
```

### CdiDomBeans
Cannot resolve class 'Class2'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
		<class>Class1</class>
		<stereotype>Stereotype1</stereotype>
		<class>Class2</class>
		<class>Class3</class>
		<stereotype>Stereotype2</stereotype>
```

### CdiDomBeans
Cannot resolve class 'Stereotype1'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/beans.xml`
#### Snippet
```java
	<alternatives>
		<class>Class3</class>
		<stereotype>Stereotype1</stereotype>
	</alternatives>
</beans>
```

### CdiDomBeans
Cannot resolve class 'Class3'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
		<stereotype>Stereotype1</stereotype>
		<class>Class2</class>
		<class>Class3</class>
		<stereotype>Stereotype2</stereotype>
	</alternatives>
```

### CdiDomBeans
@Alternative stereotype annotation class expected here
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
		<class>Class2</class>
		<class>Class3</class>
		<stereotype>Stereotype2</stereotype>
	</alternatives>
</beans>
```

### CdiDomBeans
Cannot resolve class 'Stereotype2'
in `enterprise/web.beans/test/unit/src/org/netbeans/modules/web/beans/xdm/model/alternatives-beans.xml`
#### Snippet
```java
		<class>Class2</class>
		<class>Class3</class>
		<stereotype>Stereotype2</stereotype>
	</alternatives>
</beans>
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Table` may be 'static'
in `enterprise/web.core.syntax/test/qa-functional/data/CommentTestProject/web/testJSP.jsp`
#### Snippet
```java
</font>
<%!
    class Table{
        public java.util.Map getEntries(){
                return java.util.Collections.emptyMap();
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`true|false` can be simplified to 'true'
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/reformatTestIssue67978.jsp`
#### Snippet
```java
<html><%! boolean b = true|false; %></ht
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `System.currentTimeMillis()` assigned to `s` is never used
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/case004.jsp`
#### Snippet
```java
<%
long s;
s =
System.currentTimeMillis();
%>
```

### UnusedAssignment
The value `System.currentTimeMillis()` assigned to `s` is never used
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/case004.jsp`
#### Snippet
```java
Bean created!  Setting foo.bar...<br>
<%
s =
System.currentTimeMillis();
%>
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/issue162017.jsp`
#### Snippet
```java
<head>
<%
int i = 0;
for (i = 0; i < 100; i++) {
i++;
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/issue162017.jsp`
#### Snippet
```java
function a() {
<%
int i = 0;
for (i = 0; i < 100; i++) {
i++;
```

### UnusedAssignment
Variable `systemProperties` initializer `null` is redundant
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/issue89174.jsp`
#### Snippet
```java
<%
String error = null;
Properties systemProperties = null;
Enumeration systemPropertiesEnum = null;
Enumeration servletInitParametersEnum = null;
```

### UnusedAssignment
Variable `servletInitParametersEnum` initializer `null` is redundant
in `enterprise/web.core.syntax/test/unit/data/testfilesformatting/issue89174.jsp`
#### Snippet
```java
Properties systemProperties = null;
Enumeration systemPropertiesEnum = null;
Enumeration servletInitParametersEnum = null;

ServletContext sc = getServletContext ();
```

### UnusedAssignment
The value `str.length()` assigned to `i` is never used
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/testJSP.jsp`
#### Snippet
```java
                            Integer.toString(10);
                        case 11:
                            i=str.length();/*CC */
                        default:
                            fce(0, 41, 8);
```

## RuleId[id=ReassignedToPlainText]
### ReassignedToPlainText
This file was explicitly re-assigned to plain text
in `javafx/javafx2.samples/FXML-LoginDemo/README.TXT`
#### Snippet
```java
Hello,
this is the Login demo!
 
Scenario
========
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition is always true
in `enterprise/jsp.lexer/test/unit/data/testfiles/tokensTest.jsp`
#### Snippet
```java
    int i = 0;
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
```

### ConstantValue
Condition is always true
in `enterprise/jsp.lexer/test/unit/data/input/JspLexerTest/testComplexJSP.jsp`
#### Snippet
```java
    int i = 0;
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensTest.jsp`
#### Snippet
```java
    int i = 0;
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensTag.tag`
#### Snippet
```java
    int i = 0;
    char ch = 'a';
    if (true) {
        switch (aa) {
            case 0: a = b;
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/testJSP.jsp`
#### Snippet
```java
        <%! /*CC */
        public int first(int i, String str){
            if (true){/*CC */
                    switch(i){
                        case 10:/*CC */
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/reformatTestIssue66638.jsp`
#### Snippet
```java
    <body>        
        <%                
        if(true) {
            a = b ;
        }
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/indentationTest.jsp`
#### Snippet
```java
        %>
        <%
        if (true){
            for (int i = 0; i< count; i++){
                
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/tagIndent.jsp`
#### Snippet
```java
        %>
        <%
        if (true){
            for (int i = 0; i< count; i++){
                
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
        <%  if(true){
            switch(age){
                case 10:
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
        <%
        
        if (true) {
            
        }
```

### ConstantValue
Condition is always true
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/WEB-INF/tags/reformatTestIssue120967.tag`
#### Snippet
```java
        <title>JSP Page</title>
        <%
            if (true) {
                switch (age) {
                    
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `enterprise/web.core.syntax/test/unit/data/testSingleJsps/JSPDeclaration.jsp`
#### Snippet
```java
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! private int property = 1; %>


```

## RuleId[id=SpringInjectionValueStyleInspection]
### SpringInjectionValueStyleInspection
Usage of explicit element
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
        </constructor-arg>
        <property name="pluginManager" ref="pluginManager" />
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
        </property>
    </bean>    
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
        </property>
   </bean>    	
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    <bean id="grailsConfigurator" class="org.codehaus.groovy.grails.commons.spring.GrailsRuntimeConfigurator">
        <constructor-arg>
            <ref bean="grailsApplication" />
        </constructor-arg>
        <property name="pluginManager" ref="pluginManager" />
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
    <bean id="grailsResourceHolder" scope="prototype" class="org.codehaus.groovy.grails.commons.spring.GrailsResourceHolder">
        <property name="resources">
              <value>classpath*:**/grails-app/**/*.groovy</value>
        </property>
    </bean>    
```

### SpringInjectionValueStyleInspection
Usage of explicit element
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/web-app/WEB-INF/applicationContext.xml`
#### Snippet
```java
      class="org.springframework.web.filter.CharacterEncodingFilter">
        <property name="encoding">
          <value>utf-8</value>
        </property>
   </bean>    	
```

