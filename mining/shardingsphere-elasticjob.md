# shardingsphere-elasticjob 
 
# Bad smells
I found 244 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 53 | false |
| FieldMayBeFinal | 44 | false |
| FieldCanBeLocal | 31 | false |
| SpringBootApplicationYaml | 27 | false |
| UnstableApiUsage | 19 | false |
| MismatchedCollectionQueryUpdate | 8 | false |
| DuplicatedCode | 7 | false |
| SpringPlaceholdersInspection | 6 | false |
| ProtectedMemberInFinalClass | 6 | true |
| ConstantValue | 6 | false |
| UNCHECKED_WARNING | 5 | false |
| UnparsedCustomBeanInspection | 5 | false |
| JavadocReference | 3 | false |
| TrivialStringConcatenation | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| IgnoreResultOfCall | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| DataFlowIssue | 2 | false |
| SpringBootAdditionalConfig | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| NullableProblems | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| AutoCloseableResource | 1 | false |
| SlowListContainsAll | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/spi/ElasticJobServiceLoader.java`
#### Snippet
```java
     */
    public static <T extends TypedSPI> Optional<T> newTypedServiceInstance(final Class<T> typedServiceInterface, final String type, final Properties props) {
        Optional<T> result = Optional.ofNullable(TYPED_SERVICE_CLASSES.get(typedServiceInterface)).map(serviceClasses -> serviceClasses.get(type)).map(clazz -> (T) newServiceInstance(clazz));
        if (result.isPresent() && result.get() instanceof SPIPostProcessor) {
            ((SPIPostProcessor) result.get()).init(props);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.elasticjob.infra.spi.TypedSPI' to 'T'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/spi/ElasticJobServiceLoader.java`
#### Snippet
```java
     */
    public static <T extends TypedSPI> Optional<T> getCachedTypedServiceInstance(final Class<T> typedServiceInterface, final String type) {
        return Optional.ofNullable(TYPED_SERVICES.get(typedServiceInterface)).map(services -> (T) services.get(type));
    }
    
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.Collection'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/mesos/LaunchingTasks.java`
#### Snippet
```java
    
    private Collection<TaskRequest> createTaskRequests(final JobContext jobContext) {
        Collection<TaskRequest> result = new ArrayList<>(jobContext.getAssignedShardingItems().size());
        for (int each : jobContext.getAssignedShardingItems()) {
            result.add(new JobTaskRequest(
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.elasticjob.restful.handler.ExceptionHandler\>' to 'org.apache.shardingsphere.elasticjob.restful.handler.ExceptionHandler'
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/pipeline/ExceptionHandling.java`
#### Snippet
```java
            exceptionHandler = DEFAULT_EXCEPTION_HANDLER;
        }
        return (ExceptionHandler<T>) exceptionHandler;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/deserializer/impl/DefaultTextPlainRequestBodyDeserializer.java`
#### Snippet
```java
        }
        if (String.class.isAssignableFrom(targetType)) {
            return (T) new String(requestBodyBytes, StandardCharsets.UTF_8);
        }
        throw new UnsupportedOperationException(MessageFormat.format("Cannot deserialize [{0}] into [{1}]", mimeType(), targetType.getName()));
```

## RuleId[id=SpringPlaceholdersInspection]
### SpringPlaceholdersInspection
Cannot resolve property key
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
```

### SpringPlaceholdersInspection
Cannot resolve property key
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
        <property name="password" value="${event.rdb.password}" />
```

### SpringPlaceholdersInspection
Cannot resolve property key
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
        <property name="password" value="${event.rdb.password}" />
    </bean>
```

### SpringPlaceholdersInspection
Cannot resolve property key
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
        <property name="password" value="${event.rdb.password}" />
    </bean>

```

### SpringPlaceholdersInspection
Cannot resolve property key
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
                    sharding-total-count="${simple.shardingTotalCount}" cron="${simple.cron}"
                    sharding-item-parameters="${simple.shardingItemParameters}"
```

### SpringPlaceholdersInspection
Cannot resolve property key
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                    disabled="${simple.disabled}" overwrite="${simple.overwrite}" />

    <elasticjob:job id="${dataflow.id}" job-ref="dataflowJob" registry-center-ref="regCenter"
                    sharding-total-count="${dataflow.shardingTotalCount}" cron="${dataflow.cron}"
                    sharding-item-parameters="${dataflow.shardingItemParameters}"
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ImportBeanDefinitionRegistrar`
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/core/scanner/ElasticJobScanRegistrar.java`
#### Snippet
```java

/**
 * A {@link ImportBeanDefinitionRegistrar} to allow annotation configuration of Elastic Job scanning.
 *
 * @see ClassPathJobScanner
```

### JavadocReference
Cannot resolve symbol `ClassPathBeanDefinitionScanner`
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/core/scanner/ClassPathJobScanner.java`
#### Snippet
```java

/**
 * A {@link ClassPathBeanDefinitionScanner} that registers ScheduleJobBootstrap by {@code basePackage}.
 *
 * @see ScheduleJobBootstrap
```

### JavadocReference
Cannot resolve symbol `LeaderSelector`
in `elasticjob-infra/elasticjob-registry-center/elasticjob-regitry-center-provider/elasticjob-registry-center-zookeeper-curator/src/main/java/org/apache/shardingsphere/elasticjob/reg/zookeeper/ZookeeperElectionService.java`
#### Snippet
```java

/**
 * Use {@link LeaderSelector} to implement election service.
 */
@Slf4j
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `slaveHost` might be null
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/mesos/MesosStateService.java`
#### Snippet
```java
                }
            }
            Preconditions.checkNotNull(slaveHost);
            JsonObject slaveState = fetch(String.format("http://%s/state", slaveHost));
            String workDir = slaveState.get("flags").getAsJsonObject().get("work_dir").getAsString();
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `elasticjob-infra/elasticjob-registry-center/elasticjob-regitry-center-provider/elasticjob-registry-center-zookeeper-curator/src/main/java/org/apache/shardingsphere/elasticjob/reg/zookeeper/ZookeeperRegistryCenter.java`
#### Snippet
```java
            }
            Type type = getTypeFromCuratorType(curatorType);
            String path = Type.DELETED == type ? oldData.getPath() : newData.getPath();
            if (path.isEmpty() || Type.IGNORED == type) {
                return;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toUpperCase()` call can be replaced with 'equalsIgnoreCase()'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/console/controller/search/JobEventRdbSearch.java`
#### Snippet
```java
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append(" ORDER BY ").append(lowerUnderscore);
        if ("DESC".equals(sortOrder.toUpperCase())) {
            sqlBuilder.append(" DESC");
        } else {
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve package apache
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
                        http://www.springframework.org/schema/context/spring-context.xsd 
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
```

### SpringXmlModelInspection
Cannot resolve package shardingsphere
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
                        http://www.springframework.org/schema/context/spring-context.xsd 
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
```

### SpringXmlModelInspection
Cannot resolve package elasticjob
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
                        http://www.springframework.org/schema/context/spring-context.xsd 
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
```

### SpringXmlModelInspection
Cannot resolve package lite
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
                        http://www.springframework.org/schema/context/spring-context.xsd 
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
```

### SpringXmlModelInspection
Cannot resolve package example
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
                        http://www.springframework.org/schema/context/spring-context.xsd 
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shardingsphere'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'elasticjob'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'lite'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'example'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'job'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'simple'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'SpringSimpleJob'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shardingsphere'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'elasticjob'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'lite'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'example'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'job'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'dataflow'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'SpringDataflowJob'
in `examples/elasticjob-example-cloud/src/main/resources/META-INF/applicationContext.xml`
#### Snippet
```java
    
    <bean id="springSimpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="springDataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />
</beans>

```

### SpringXmlModelInspection
Cannot resolve package apache
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        http://shardingsphere.apache.org/schema/elasticjob/elasticjob.xsd
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
```

### SpringXmlModelInspection
Cannot resolve package shardingsphere
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        http://shardingsphere.apache.org/schema/elasticjob/elasticjob.xsd
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
```

### SpringXmlModelInspection
Cannot resolve package elasticjob
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        http://shardingsphere.apache.org/schema/elasticjob/elasticjob.xsd
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
```

### SpringXmlModelInspection
Cannot resolve package lite
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        http://shardingsphere.apache.org/schema/elasticjob/elasticjob.xsd
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
```

### SpringXmlModelInspection
Cannot resolve package example
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        http://shardingsphere.apache.org/schema/elasticjob/elasticjob.xsd
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
```

### SpringXmlModelInspection
Cannot resolve directory 'conf'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
    <elasticjob:zookeeper id="regCenter" server-lists="${serverLists}" namespace="${namespace}"
```

### SpringXmlModelInspection
Cannot find matching files
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                        ">
    <context:component-scan base-package="org.apache.shardingsphere.elasticjob.lite.example" />
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
    <elasticjob:zookeeper id="regCenter" server-lists="${serverLists}" namespace="${namespace}"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:snapshot id="jobSnapshot" registry-center-ref="regCenter" dump-port="9999" />
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'commons'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:snapshot id="jobSnapshot" registry-center-ref="regCenter" dump-port="9999" />
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'dbcp2'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:snapshot id="jobSnapshot" registry-center-ref="regCenter" dump-port="9999" />
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
```

### SpringXmlModelInspection
Cannot resolve class 'BasicDataSource'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:snapshot id="jobSnapshot" registry-center-ref="regCenter" dump-port="9999" />
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
```

### SpringXmlModelInspection
Cannot resolve method 'close'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:snapshot id="jobSnapshot" registry-center-ref="regCenter" dump-port="9999" />
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
```

### SpringXmlModelInspection
Cannot resolve property 'driverClassName'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
```

### SpringXmlModelInspection
Cannot resolve property 'url'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
        <property name="password" value="${event.rdb.password}" />
```

### SpringXmlModelInspection
Cannot resolve property 'username'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
        <property name="driverClassName" value="${event.rdb.driver}" />
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
        <property name="password" value="${event.rdb.password}" />
    </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'password'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
        <property name="url" value="${event.rdb.url}" />
        <property name="username" value="${event.rdb.username}" />
        <property name="password" value="${event.rdb.password}" />
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'shardingsphere'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'elasticjob'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'lite'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'example'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'job'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'simple'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class 'SpringSimpleJob'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class or package 'shardingsphere'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class or package 'elasticjob'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class or package 'lite'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class or package 'example'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class or package 'job'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dataflow'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

### SpringXmlModelInspection
Cannot resolve class 'SpringDataflowJob'
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'zookeeper' for namespace 'http://shardingsphere.apache.org/schema/elasticjob', please file issue (Help\|Submit a Bug Report...)
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <context:property-placeholder location="classpath:conf/*.properties"/>
    
    <elasticjob:zookeeper id="regCenter" server-lists="${serverLists}" namespace="${namespace}"
                          base-sleep-time-milliseconds="${baseSleepTimeMilliseconds}"
                          max-sleep-time-milliseconds="${maxSleepTimeMilliseconds}" max-retries="${maxRetries}" />
```

### UnparsedCustomBeanInspection
Unsupported tag 'snapshot' for namespace 'http://shardingsphere.apache.org/schema/elasticjob', please file issue (Help\|Submit a Bug Report...)
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                          max-sleep-time-milliseconds="${maxSleepTimeMilliseconds}" max-retries="${maxRetries}" />
    
    <elasticjob:snapshot id="jobSnapshot" registry-center-ref="regCenter" dump-port="9999" />
    
    <bean id="elasticJobTracingDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
```

### UnparsedCustomBeanInspection
Unsupported tag 'rdb-tracing' for namespace 'http://shardingsphere.apache.org/schema/elasticjob', please file issue (Help\|Submit a Bug Report...)
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    </bean>

    <elasticjob:rdb-tracing id="elasticJobTrace" data-source-ref="elasticJobTracingDataSource" />

    <bean id="simpleJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.simple.SpringSimpleJob" />
```

### UnparsedCustomBeanInspection
Unsupported tag 'job' for namespace 'http://shardingsphere.apache.org/schema/elasticjob', please file issue (Help\|Submit a Bug Report...)
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
    <bean id="dataflowJob" class="org.apache.shardingsphere.elasticjob.lite.example.job.dataflow.SpringDataflowJob" />

    <elasticjob:job id="${simple.id}" job-ref="simpleJob" registry-center-ref="regCenter" tracing-ref="elasticJobTrace"
                    sharding-total-count="${simple.shardingTotalCount}" cron="${simple.cron}"
                    sharding-item-parameters="${simple.shardingItemParameters}"
```

### UnparsedCustomBeanInspection
Unsupported tag 'job' for namespace 'http://shardingsphere.apache.org/schema/elasticjob', please file issue (Help\|Submit a Bug Report...)
in `examples/elasticjob-example-lite-spring/src/main/resources/META-INF/application-context.xml`
#### Snippet
```java
                    disabled="${simple.disabled}" overwrite="${simple.overwrite}" />

    <elasticjob:job id="${dataflow.id}" job-ref="dataflowJob" registry-center-ref="regCenter"
                    sharding-total-count="${dataflow.shardingTotalCount}" cron="${dataflow.cron}"
                    sharding-item-parameters="${dataflow.shardingItemParameters}"
```

## RuleId[id=SpringBootAdditionalConfig]
### SpringBootAdditionalConfig
Cannot resolve configuration key reference 'elasticjob.tracing.type'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/resources/META-INF/additional-spring-configuration-metadata.json`
#### Snippet
```java
  "hints": [
    {
      "name": "elasticjob.tracing.type",
      "values": [
        {
```

### SpringBootAdditionalConfig
Cannot resolve configuration key reference 'elasticjob.jobs.keys'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/resources/META-INF/additional-spring-configuration-metadata.json`
#### Snippet
```java
    },
    {
      "name": "elasticjob.jobs.keys",
      "values": [
      ]
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.dump.port'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-snapshot.yml`
#### Snippet
```java
elasticjob:
  dump:
    port: 0
  regCenter:
    serverLists: localhost:18181
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.regCenter.serverLists'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-snapshot.yml`
#### Snippet
```java
    port: 0
  regCenter:
    serverLists: localhost:18181
    namespace: elasticjob-lite-spring-boot-starter

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.regCenter.namespace'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-snapshot.yml`
#### Snippet
```java
  regCenter:
    serverLists: localhost:18181
    namespace: elasticjob-lite-spring-boot-starter

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.url'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
spring:
  datasource:
    url: jdbc:h2:mem:job_event_storage
    driver-class-name: org.h2.Driver
    username: sa
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.driver-class-name'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
  datasource:
    url: jdbc:h2:mem:job_event_storage
    driver-class-name: org.h2.Driver
    username: sa
    password:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.username'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    url: jdbc:h2:mem:job_event_storage
    driver-class-name: org.h2.Driver
    username: sa
    password:

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.password'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    driver-class-name: org.h2.Driver
    username: sa
    password:

elasticjob:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.tracing.type'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
elasticjob:
  tracing:
    type: RDB
    excludeJobNames: [customTestJob]
  regCenter:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.tracing.excludeJobNames'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
  tracing:
    type: RDB
    excludeJobNames: [customTestJob]
  regCenter:
    serverLists: localhost:18181
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.regCenter.serverLists'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    excludeJobNames: [customTestJob]
  regCenter:
    serverLists: localhost:18181
    namespace: elasticjob-lite-spring-boot-starter
  jobs:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.regCenter.namespace'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
  regCenter:
    serverLists: localhost:18181
    namespace: elasticjob-lite-spring-boot-starter
  jobs:
    customTestJob:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.customTestJob.elasticJobClass'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
  jobs:
    customTestJob:
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
      jobBootstrapBeanName: customTestJobBean
      shardingTotalCount: 3
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.customTestJob.jobBootstrapBeanName'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    customTestJob:
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
      jobBootstrapBeanName: customTestJobBean
      shardingTotalCount: 3
      jobListenerTypes:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.customTestJob.shardingTotalCount'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
      jobBootstrapBeanName: customTestJobBean
      shardingTotalCount: 3
      jobListenerTypes:
        - NOOP
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.customTestJob.jobListenerTypes'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      jobBootstrapBeanName: customTestJobBean
      shardingTotalCount: 3
      jobListenerTypes:
        - NOOP
        - LOG
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.printTestJob.elasticJobType'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
        - LOG
    printTestJob:
      elasticJobType: PRINT
      jobBootstrapBeanName: printTestJobBean
      shardingTotalCount: 3
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.printTestJob.jobBootstrapBeanName'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    printTestJob:
      elasticJobType: PRINT
      jobBootstrapBeanName: printTestJobBean
      shardingTotalCount: 3
      props:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.printTestJob.shardingTotalCount'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      elasticJobType: PRINT
      jobBootstrapBeanName: printTestJobBean
      shardingTotalCount: 3
      props:
        print.content: "test print job"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.printTestJob.props.print.content'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      shardingTotalCount: 3
      props:
        print.content: "test print job"
    defaultBeanNameClassJob:
      cron: 0/5 * * * * ?
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameClassJob.cron'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
        print.content: "test print job"
    defaultBeanNameClassJob:
      cron: 0/5 * * * * ?
      timeZome: GMT+08:00
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameClassJob.timeZome'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    defaultBeanNameClassJob:
      cron: 0/5 * * * * ?
      timeZome: GMT+08:00
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
      shardingTotalCount: 3
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameClassJob.elasticJobClass'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      cron: 0/5 * * * * ?
      timeZome: GMT+08:00
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
      shardingTotalCount: 3
    defaultBeanNameTypeJob:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameClassJob.shardingTotalCount'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      timeZome: GMT+08:00
      elasticJobClass: org.apache.shardingsphere.elasticjob.lite.spring.boot.job.fixture.job.impl.CustomTestJob
      shardingTotalCount: 3
    defaultBeanNameTypeJob:
      cron: 0/5 * * * * ?
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameTypeJob.cron'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      shardingTotalCount: 3
    defaultBeanNameTypeJob:
      cron: 0/5 * * * * ?
      elasticJobType: PRINT
      shardingTotalCount: 3
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameTypeJob.elasticJobType'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
    defaultBeanNameTypeJob:
      cron: 0/5 * * * * ?
      elasticJobType: PRINT
      shardingTotalCount: 3
      props:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameTypeJob.shardingTotalCount'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      cron: 0/5 * * * * ?
      elasticJobType: PRINT
      shardingTotalCount: 3
      props:
        print.content: "test print job"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'elasticjob.jobs.defaultBeanNameTypeJob.props.print.content'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/test/resources/application-elasticjob.yml`
#### Snippet
```java
      shardingTotalCount: 3
      props:
        print.content: "test print job"

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `docs/static/css/style.css`
#### Snippet
```java
/* background behind the logo*/
#header {
    background: black;
```

### DuplicatedCode
Duplicated code
in `docs/static/css/theme-black.css`
#### Snippet
```java
.tooltipped:after {
    position: absolute;
    z-index: 1000000;
    display: none;
    padding: 5px 8px;
    font: normal normal 11px/1.5 "Work Sans", "Helvetica", "Tahoma", "Geneva", "Arial", sans-serif;
    color: #fff;
    text-align: center;
    text-decoration: none;
    text-shadow: none;
    text-transform: none;
    letter-spacing: normal;
    word-wrap: break-word;
    white-space: pre;
    pointer-events: none;
    content: attr(aria-label);
    background: rgba(0, 0, 0, 0.8);
    border-radius: 3px;
    -webkit-font-smoothing: subpixel-antialiased;
}
```

### DuplicatedCode
Duplicated code
in `docs/static/css/theme-black.css`
#### Snippet
```java
#body #breadcrumbs {
    height: auto;
    margin-bottom: 0;
    padding-left: 0;
    line-height: 1.4;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    width: 70%;
    display: inline-block;
    float: left;
}
```

### DuplicatedCode
Duplicated code
in `docs/static/css/theme-black.css`
#### Snippet
```java
@media only all and (max-width: 47.938em) {
    #sidebar {
        width: 230px;
        left: -230px;
    }

    #body {
        margin-left: 0;
        width: 100%;
    }

    .sidebar-hidden {
        overflow: hidden;
    }

    .sidebar-hidden #sidebar {
        left: 0;
    }

    .sidebar-hidden #body {
        margin-left: 230px;
        overflow: hidden;
    }

    .sidebar-hidden #overlay {
        position: absolute;
        left: 0;
        right: 0;
        top: 0;
        bottom: 0;
        z-index: 10;
        background: rgba(255, 255, 255, 0.5);
        cursor: pointer;
    }
}
```

### DuplicatedCode
Duplicated code
in `docs/themes/hugo-theme-learn/exampleSite/static/css/theme-mine.css`
#### Snippet
```java

:root{
    
```

### DuplicatedCode
Duplicated code
in `elasticjob-ecosystem/elasticjob-error-handler/elasticjob-error-handler-type/elasticjob-error-handler-dingtalk/src/main/java/org/apache/shardingsphere/elasticjob/error/handler/dingtalk/DingtalkJobErrorHandler.java`
#### Snippet
```java
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(connectTimeoutMilliseconds).setSocketTimeout(readTimeoutMilliseconds).build();
        result.setConfig(requestConfig);
        StringEntity entity = new StringEntity(getJsonParameter(getErrorMessage(jobName, cause)), StandardCharsets.UTF_8);
        entity.setContentEncoding(StandardCharsets.UTF_8.name());
        entity.setContentType("application/json");
        result.setEntity(entity);
        return result;
```

### DuplicatedCode
Duplicated code
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBJobEventStorage.java`
#### Snippet
```java
            preparedStatement.setString(1, jobExecutionEvent.getId());
            preparedStatement.setString(2, jobExecutionEvent.getJobName());
            preparedStatement.setString(3, jobExecutionEvent.getTaskId());
            preparedStatement.setString(4, jobExecutionEvent.getHostname());
            preparedStatement.setString(5, jobExecutionEvent.getIp());
            preparedStatement.setInt(6, jobExecutionEvent.getShardingItem());
            preparedStatement.setString(7, jobExecutionEvent.getSource().toString());
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/yaml/representer/ElasticJobYamlRepresenter.java`
#### Snippet
```java
    
    @Override
    protected NodeTuple representJavaBeanProperty(final Object javaBean, final Property property, final Object propertyValue, final Tag customTag) {
        return new DefaultYamlTupleProcessor().process(super.representJavaBeanProperty(javaBean, property, propertyValue, customTag));
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-namespace/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/namespace/scanner/parser/JobScannerBeanDefinitionParser.java`
#### Snippet
```java
    
    @Override
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext) {
        BeanDefinitionBuilder factory = BeanDefinitionBuilder.rootBeanDefinition(JobScannerConfiguration.class);
        String attribute = element.getAttribute(JobScannerBeanDefinitionTag.BASE_PACKAGE);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-namespace/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/namespace/tracing/parser/TracingBeanDefinitionParser.java`
#### Snippet
```java
    
    @Override
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext) {
        BeanDefinitionBuilder factory = BeanDefinitionBuilder.rootBeanDefinition(TracingConfiguration.class);
        factory.addConstructorArgValue("RDB");
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-namespace/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/namespace/reg/parser/ZookeeperBeanDefinitionParser.java`
#### Snippet
```java
    
    @Override
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext) {
        BeanDefinitionBuilder result = BeanDefinitionBuilder.rootBeanDefinition(ZookeeperRegistryCenter.class);
        result.addConstructorArgValue(buildZookeeperConfigurationBeanDefinition(element));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-namespace/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/namespace/snapshot/parser/SnapshotBeanDefinitionParser.java`
#### Snippet
```java
    
    @Override
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext) {
        BeanDefinitionBuilder result = BeanDefinitionBuilder.rootBeanDefinition(SnapshotService.class);
        result.addConstructorArgReference(element.getAttribute(SnapshotBeanDefinitionTag.REGISTRY_CENTER_REF_ATTRIBUTE));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-namespace/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/namespace/job/parser/JobBeanDefinitionParser.java`
#### Snippet
```java
    
    @Override
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext) {
        BeanDefinitionBuilder factory;
        if (Strings.isNullOrEmpty(element.getAttribute(JobBeanDefinitionTag.CRON_ATTRIBUTE))) {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/internal/guarantee/GuaranteeNode.java`
#### Snippet
```java
    
    static String getCompletedNode(final int shardingItem) {
        return String.join("/", COMPLETED_ROOT, shardingItem + "");
    }
    
```

### TrivialStringConcatenation
Empty string used in concatenation
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/internal/guarantee/GuaranteeNode.java`
#### Snippet
```java
    
    static String getStartedNode(final int shardingItem) {
        return String.join("/", STARTED_ROOT, shardingItem + "");
    }
    
```

### TrivialStringConcatenation
Empty string used in concatenation
in `elasticjob-cloud/elasticjob-cloud-executor/src/main/java/org/apache/shardingsphere/elasticjob/cloud/executor/local/LocalTaskExecutor.java`
#### Snippet
```java
        Map<Integer, String> shardingItemMap = new HashMap<>(1, 1);
        shardingItemMap.put(shardingItem, new ShardingItemParameters(jobConfiguration.getShardingItemParameters()).getMap().get(shardingItem));
        String taskId = String.join("@-@", jobConfiguration.getJobName(), shardingItem + "", "READY", "foo_slave_id", "foo_uuid");
        return new ShardingContexts(taskId, jobConfiguration.getJobName(), jobConfiguration.getShardingTotalCount(), jobConfiguration.getJobParameter(), shardingItemMap);
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `elasticjob-ecosystem/elasticjob-error-handler/elasticjob-error-handler-type/elasticjob-error-handler-email/src/main/java/org/apache/shardingsphere/elasticjob/error/handler/email/EmailJobErrorHandler.java`
#### Snippet
```java
        StringWriter writer = new StringWriter();
        cause.printStackTrace(new PrintWriter(writer, true));
        return String.format("Job '%s' exception occur in job processing, caused by %s", jobName, writer.toString());
    }
    
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `elasticjob-ecosystem/elasticjob-error-handler/elasticjob-error-handler-type/elasticjob-error-handler-dingtalk/src/main/java/org/apache/shardingsphere/elasticjob/error/handler/dingtalk/DingtalkJobErrorHandler.java`
#### Snippet
```java
        StringWriter writer = new StringWriter();
        cause.printStackTrace(new PrintWriter(writer, true));
        String result = String.format("Job '%s' exception occur in job processing, caused by %s", jobName, writer.toString());
        if (!Strings.isNullOrEmpty(keyword)) {
            result = keyword.concat(result);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `elasticjob-ecosystem/elasticjob-error-handler/elasticjob-error-handler-type/elasticjob-error-handler-wechat/src/main/java/org/apache/shardingsphere/elasticjob/error/handler/wechat/WechatJobErrorHandler.java`
#### Snippet
```java
        StringWriter stringWriter = new StringWriter();
        cause.printStackTrace(new PrintWriter(stringWriter, true));
        return String.format("Job '%s' exception occur in job processing, caused by %s", jobName, stringWriter.toString());
    }
    
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/wrapper/QueryParameterMap.java`
#### Snippet
```java
    
    @Override
    public Set<Entry<String, List<String>>> entrySet() {
        return queryMap.entrySet();
    }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String insertForJobStatusTraceLog;
    
    private final String selectForJobStatusTraceLog;
    
    private final String selectOriginalTaskIdForJobStatusTraceLog;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String updateForJobExecutionLogForFailure;
    
    private final String insertForJobStatusTraceLog;
    
    private final String selectForJobStatusTraceLog;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String createIndexForTaskIdStateIndex;
    
    private final String insertForJobExecutionLog;
    
    private final String insertForJobExecutionLogForComplete;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String insertForJobExecutionLogForComplete;
    
    private final String insertForJobExecutionLogForFailure;
    
    private final String updateForJobExecutionLog;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String updateForJobExecutionLog;
    
    private final String updateForJobExecutionLogForFailure;
    
    private final String insertForJobStatusTraceLog;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
public final class RDBStorageSQLMapper {
    
    private final String createTableForJobExecutionLog;
    
    private final String createTableForJobStatusTraceLog;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String createTableForJobExecutionLog;
    
    private final String createTableForJobStatusTraceLog;
    
    private final String createIndexForTaskIdStateIndex;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String createTableForJobStatusTraceLog;
    
    private final String createIndexForTaskIdStateIndex;
    
    private final String insertForJobExecutionLog;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String insertForJobExecutionLogForFailure;
    
    private final String updateForJobExecutionLog;
    
    private final String updateForJobExecutionLogForFailure;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String selectForJobStatusTraceLog;
    
    private final String selectOriginalTaskIdForJobStatusTraceLog;
    
    public RDBStorageSQLMapper(final String sqlPropertiesFileName) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    private final String insertForJobExecutionLog;
    
    private final String insertForJobExecutionLogForComplete;
    
    private final String insertForJobExecutionLogForFailure;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/job/ElasticJobConfigurationProperties.java`
#### Snippet
```java
    private boolean misfire;
    
    private int maxTimeDiffSeconds = -1;
    
    private int reconcileIntervalMinutes;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/reg/ZookeeperProperties.java`
#### Snippet
```java
     * Max sleep time milliseconds.
     */
    private int maxSleepTimeMilliseconds = 3000;
    
    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/reg/ZookeeperProperties.java`
#### Snippet
```java
     * Base sleep time milliseconds.
     */
    private int baseSleepTimeMilliseconds = 1000;
    
    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/reg/ZookeeperProperties.java`
#### Snippet
```java
     * Max retry times.
     */
    private int maxRetries = 3;
    
    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private boolean misfire;
    
    private int maxTimeDiffSeconds = -1;
    
    private int reconcileIntervalMinutes;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobInstance.java`
#### Snippet
```java
    public static final String DELIMITER = "@-@";
    
    private String jobInstanceId;
    
    private String labels;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobInstance.java`
#### Snippet
```java
    private String jobInstanceId;
    
    private String labels;
    
    private String serverIp;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobInstance.java`
#### Snippet
```java
    private String labels;
    
    private String serverIp;
    
    public JobInstance() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/context/ShardingItemParameters.java`
#### Snippet
```java
    private static final String KEY_VALUE_DELIMITER = "=";
    
    private final Map<Integer, String> map;
    
    public ShardingItemParameters(final String shardingItemParameters) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/listener/ShardingContexts.java`
#### Snippet
```java
    private final Map<Integer, String> shardingItemParameters;
    
    private int jobEventSamplingCount;
    
    @Setter
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/api/TracingConfiguration.java`
#### Snippet
```java
    private final String type;
    
    private final TracingStorageConfiguration<T> tracingStorageConfiguration;
    
    @SuppressWarnings("unchecked")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/api/TracingConfiguration.java`
#### Snippet
```java
public final class TracingConfiguration<T> implements JobExtraConfiguration {
    
    private final String type;
    
    private final TracingStorageConfiguration<T> tracingStorageConfiguration;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/util/HttpClientUtils.java`
#### Snippet
```java
        private final int code;
        
        private final String content;
        
        public HttpResult(final int code, final String content) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/util/HttpClientUtils.java`
#### Snippet
```java
    public static class HttpResult {
        
        private final int code;
        
        private final String content;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/pojo/CloudAppConfigurationPOJO.java`
#### Snippet
```java
    private String bootstrapScript;
    
    private double cpuCount = 1d;
    
    private double memoryMB = 128d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/pojo/CloudAppConfigurationPOJO.java`
#### Snippet
```java
    private double cpuCount = 1d;
    
    private double memoryMB = 128d;
    
    private boolean appCacheEnable = true;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/pojo/CloudAppConfigurationPOJO.java`
#### Snippet
```java
    private double memoryMB = 128d;
    
    private boolean appCacheEnable = true;
    
    private int eventTraceSamplingCount;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/handler/Handler.java`
#### Snippet
```java
    
    @Getter
    private final List<HandlerParameter> handlerParameters;
    
    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/handler/Handler.java`
#### Snippet
```java
     */
    @Getter
    private final int httpStatusCode;
    
    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/handler/Handler.java`
#### Snippet
```java
     */
    @Getter
    private final String producing;
    
    public Handler(final Object instance, final Method handleMethod) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/api/listener/AbstractDistributeOnceElasticJobListener.java`
#### Snippet
```java
            }
        } catch (final InterruptedException ex) {
            Thread.interrupted();
        }
        if (timeService.getCurrentMillis() - before >= startedTimeoutMilliseconds) {
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/api/listener/AbstractDistributeOnceElasticJobListener.java`
#### Snippet
```java
            }
        } catch (final InterruptedException ex) {
            Thread.interrupted();
        }
        if (timeService.getCurrentMillis() - before >= completedTimeoutMilliseconds) {
```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/mesos/LeasesQueue.java`
#### Snippet
```java
     */
    public void offer(final Protos.Offer offer) {
        queue.offer(new VMLeaseObject(offer));
    }
    
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/pipeline/HandlerParameterDecoder.java`
#### Snippet
```java
        }
        if (Character.class.equals(targetType) || char.class.equals(targetType)) {
            Preconditions.checkArgument(1 >= value.length(), MessageFormat.format("Cannot set value [{0}] into a char.", value));
            return value.charAt(0);
        }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
reconcileIntervalMinutes \* 60 \* 1000: integer multiplication implicitly cast to long
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/internal/reconcile/ReconcileService.java`
#### Snippet
```java
    protected void runOneIteration() {
        int reconcileIntervalMinutes = configService.load(true).getReconcileIntervalMinutes();
        if (reconcileIntervalMinutes > 0 && (System.currentTimeMillis() - lastReconcileTime >= reconcileIntervalMinutes * 60 * 1000)) {
            lastReconcileTime = System.currentTimeMillis();
            if (!shardingService.isNeedSharding() && shardingService.hasShardingInfoInOfflineServers() && !(isStaticSharding() && hasShardingInfo())) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/storage/RDBStorageSQLMapper.java`
#### Snippet
```java
    
    private InputStream getPropertiesInputStream(final String sqlPropertiesFileName) {
        InputStream sqlPropertiesFile = RDBJobEventStorage.class.getClassLoader().getResourceAsStream(String.format("META-INF/sql/%s", sqlPropertiesFileName));
        return null == sqlPropertiesFile ? RDBJobEventStorage.class.getClassLoader().getResourceAsStream("META-INF/sql/SQL92.properties") : sqlPropertiesFile;
    }
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `elasticjob-lite/elasticjob-lite-lifecycle/src/main/java/org/apache/shardingsphere/elasticjob/lite/lifecycle/internal/statistics/JobStatisticsAPIImpl.java`
#### Snippet
```java
            }
        }
        return !instances.containsAll(shardingInstances) || shardingInstances.isEmpty();
    }
    
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/mapping/RegexUrlPatternMap.java`
#### Snippet
```java
        
        @Override
        public int compare(final MappingContext<?> o1, final MappingContext<?> o2) {
            String[] s1 = o1.pattern().split(PATH_SEPARATOR);
            String[] s2 = o2.pattern().split(PATH_SEPARATOR);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `cleanShutdown` may be 'final'
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/internal/schedule/JobShutdownHookPlugin.java`
#### Snippet
```java
    
    @Setter
    private boolean cleanShutdown = true;
    
    @Override
```

### FieldMayBeFinal
Field `props` may be 'final'
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-rdb/src/main/java/org/apache/shardingsphere/elasticjob/tracing/rdb/yaml/YamlDataSourceConfiguration.java`
#### Snippet
```java
    private String dataSourceClassName;
    
    private Map<String, Object> props = new LinkedHashMap<>();
    
    @Override
```

### FieldMayBeFinal
Field `jobs` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/job/ElasticJobProperties.java`
#### Snippet
```java
public class ElasticJobProperties {
    
    private Map<String, ElasticJobConfigurationProperties> jobs = new LinkedHashMap<>();
}

```

### FieldMayBeFinal
Field `maxTimeDiffSeconds` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/job/ElasticJobConfigurationProperties.java`
#### Snippet
```java
    private boolean misfire;
    
    private int maxTimeDiffSeconds = -1;
    
    private int reconcileIntervalMinutes;
```

### FieldMayBeFinal
Field `jobListenerTypes` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/job/ElasticJobConfigurationProperties.java`
#### Snippet
```java
    private String jobErrorHandlerType;
    
    private Collection<String> jobListenerTypes = new LinkedList<>();
    
    private String description;
```

### FieldMayBeFinal
Field `props` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/job/ElasticJobConfigurationProperties.java`
#### Snippet
```java
    private String description;
    
    private Properties props = new Properties();
    
    private boolean disabled;
```

### FieldMayBeFinal
Field `maxSleepTimeMilliseconds` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/reg/ZookeeperProperties.java`
#### Snippet
```java
     * Max sleep time milliseconds.
     */
    private int maxSleepTimeMilliseconds = 3000;
    
    /**
```

### FieldMayBeFinal
Field `baseSleepTimeMilliseconds` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/reg/ZookeeperProperties.java`
#### Snippet
```java
     * Base sleep time milliseconds.
     */
    private int baseSleepTimeMilliseconds = 1000;
    
    /**
```

### FieldMayBeFinal
Field `maxRetries` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/reg/ZookeeperProperties.java`
#### Snippet
```java
     * Max retry times.
     */
    private int maxRetries = 3;
    
    /**
```

### FieldMayBeFinal
Field `includeJobNames` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/tracing/TracingProperties.java`
#### Snippet
```java
    private DataSourceProperties dataSource;

    private Set<String> includeJobNames = new HashSet<>();

    private Set<String> excludeJobNames = new HashSet<>();
```

### FieldMayBeFinal
Field `excludeJobNames` may be 'final'
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/tracing/TracingProperties.java`
#### Snippet
```java
    private Set<String> includeJobNames = new HashSet<>();

    private Set<String> excludeJobNames = new HashSet<>();
}

```

### FieldMayBeFinal
Field `maxTimeDiffSeconds` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private boolean misfire;
    
    private int maxTimeDiffSeconds = -1;
    
    private int reconcileIntervalMinutes;
```

### FieldMayBeFinal
Field `jobListenerTypes` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private String jobErrorHandlerType;
    
    private Collection<String> jobListenerTypes = new ArrayList<>();
    
    private Collection<YamlConfiguration<JobExtraConfiguration>> jobExtraConfigurations = new LinkedList<>();
```

### FieldMayBeFinal
Field `props` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private String description;
    
    private Properties props = new Properties();
    
    private boolean disabled;
```

### FieldMayBeFinal
Field `jobExtraConfigurations` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private Collection<String> jobListenerTypes = new ArrayList<>();
    
    private Collection<YamlConfiguration<JobExtraConfiguration>> jobExtraConfigurations = new LinkedList<>();
    
    private String description;
```

### FieldMayBeFinal
Field `jobInstanceId` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobInstance.java`
#### Snippet
```java
    public static final String DELIMITER = "@-@";
    
    private String jobInstanceId;
    
    private String labels;
```

### FieldMayBeFinal
Field `labels` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobInstance.java`
#### Snippet
```java
    private String jobInstanceId;
    
    private String labels;
    
    private String serverIp;
```

### FieldMayBeFinal
Field `serverIp` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobInstance.java`
#### Snippet
```java
    private String labels;
    
    private String serverIp;
    
    public JobInstance() {
```

### FieldMayBeFinal
Field `allowSendJobEvent` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/listener/ShardingContexts.java`
#### Snippet
```java
    
    @Setter
    private boolean allowSendJobEvent = true;
    
    public ShardingContexts(final String taskId, final String jobName, final int shardingTotalCount, final String jobParameter,
```

### FieldMayBeFinal
Field `jobEventSamplingCount` may be 'final'
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/listener/ShardingContexts.java`
#### Snippet
```java
    private final Map<Integer, String> shardingItemParameters;
    
    private int jobEventSamplingCount;
    
    @Setter
```

### FieldMayBeFinal
Field `disabledJobsNum` may be 'final'
in `elasticjob-lite/elasticjob-lite-lifecycle/src/main/java/org/apache/shardingsphere/elasticjob/lite/lifecycle/domain/ServerBriefInfo.java`
#### Snippet
```java
    private int jobsNum;
    
    private AtomicInteger disabledJobsNum = new AtomicInteger();
    
    @Override
```

### FieldMayBeFinal
Field `id` may be 'final'
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/event/JobStatusTraceEvent.java`
#### Snippet
```java
public final class JobStatusTraceEvent implements JobEvent {
    
    private String id = UUID.randomUUID().toString();
    
    private final String jobName;
```

### FieldMayBeFinal
Field `creationTime` may be 'final'
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/event/JobStatusTraceEvent.java`
#### Snippet
```java
    private final String message;
    
    private Date creationTime = new Date();
    
    public enum State {
```

### FieldMayBeFinal
Field `originalTaskId` may be 'final'
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/event/JobStatusTraceEvent.java`
#### Snippet
```java
    
    @Setter
    private String originalTaskId = "";
    
    private final String taskId;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/event/JobExecutionEvent.java`
#### Snippet
```java
public final class JobExecutionEvent implements JobEvent {
    
    private String id = UUID.randomUUID().toString();
    
    private final String hostname;
```

### FieldMayBeFinal
Field `startTime` may be 'final'
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/event/JobExecutionEvent.java`
#### Snippet
```java
    private final int shardingItem;
    
    private Date startTime = new Date();
    
    @Setter
```

### FieldMayBeFinal
Field `cpuCount` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/CloudAppConfiguration.java`
#### Snippet
```java
    private final String bootstrapScript;
    
    private double cpuCount = 1d;
    
    private double memoryMB = 128d;
```

### FieldMayBeFinal
Field `memoryMB` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/CloudAppConfiguration.java`
#### Snippet
```java
    private double cpuCount = 1d;
    
    private double memoryMB = 128d;
    
    private boolean appCacheEnable = true;
```

### FieldMayBeFinal
Field `appCacheEnable` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/CloudAppConfiguration.java`
#### Snippet
```java
    private double memoryMB = 128d;
    
    private boolean appCacheEnable = true;
    
    private int eventTraceSamplingCount;
```

### FieldMayBeFinal
Field `cpuCount` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/pojo/CloudAppConfigurationPOJO.java`
#### Snippet
```java
    private String bootstrapScript;
    
    private double cpuCount = 1d;
    
    private double memoryMB = 128d;
```

### FieldMayBeFinal
Field `memoryMB` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/pojo/CloudAppConfigurationPOJO.java`
#### Snippet
```java
    private double cpuCount = 1d;
    
    private double memoryMB = 128d;
    
    private boolean appCacheEnable = true;
```

### FieldMayBeFinal
Field `appCacheEnable` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/pojo/CloudAppConfigurationPOJO.java`
#### Snippet
```java
    private double memoryMB = 128d;
    
    private boolean appCacheEnable = true;
    
    private int eventTraceSamplingCount;
```

### FieldMayBeFinal
Field `mesosStateService` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/config/app/CloudAppConfigurationListener.java`
#### Snippet
```java
    private final ProducerManager producerManager;
    
    private MesosStateService mesosStateService;
    
    public CloudAppConfigurationListener(final CoordinatorRegistryCenter regCenter, final ProducerManager producerManager) {
```

### FieldMayBeFinal
Field `repository` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/statistics/job/JobRunningStatisticJob.java`
#### Snippet
```java
    private RunningService runningService;
    
    private StatisticRdbRepository repository;

    public JobRunningStatisticJob(final CoordinatorRegistryCenter registryCenter, final StatisticRdbRepository rdbRepository) {
```

### FieldMayBeFinal
Field `runningService` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/statistics/job/JobRunningStatisticJob.java`
#### Snippet
```java
    private static final StatisticInterval EXECUTE_INTERVAL = StatisticInterval.MINUTE;
    
    private RunningService runningService;
    
    private StatisticRdbRepository repository;
```

### FieldMayBeFinal
Field `args` may be 'final'
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/handler/HandleContext.java`
#### Snippet
```java
    private MappingContext<T> mappingContext;
    
    private Object[] args = new Object[0];
}

```

### FieldMayBeFinal
Field `baseSleepTimeMilliseconds` may be 'final'
in `elasticjob-infra/elasticjob-registry-center/elasticjob-regitry-center-provider/elasticjob-registry-center-zookeeper-curator/src/main/java/org/apache/shardingsphere/elasticjob/reg/zookeeper/ZookeeperConfiguration.java`
#### Snippet
```java
     * Base sleep time milliseconds. 
     */
    private int baseSleepTimeMilliseconds = 1000;
    
    /**
```

### FieldMayBeFinal
Field `maxSleepTimeMilliseconds` may be 'final'
in `elasticjob-infra/elasticjob-registry-center/elasticjob-regitry-center-provider/elasticjob-registry-center-zookeeper-curator/src/main/java/org/apache/shardingsphere/elasticjob/reg/zookeeper/ZookeeperConfiguration.java`
#### Snippet
```java
     * Max sleep time milliseconds.
     */
    private int maxSleepTimeMilliseconds = 3000;
    
    /**
```

### FieldMayBeFinal
Field `maxRetries` may be 'final'
in `elasticjob-infra/elasticjob-registry-center/elasticjob-regitry-center-provider/elasticjob-registry-center-zookeeper-curator/src/main/java/org/apache/shardingsphere/elasticjob/reg/zookeeper/ZookeeperConfiguration.java`
#### Snippet
```java
     * Max retry times.
     */
    private int maxRetries = 3;
    
    /**
```

### FieldMayBeFinal
Field `creationTime` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-common/src/main/java/org/apache/shardingsphere/elasticjob/cloud/statistics/type/job/JobRegisterStatistics.java`
#### Snippet
```java
    private final Date statisticsTime;
    
    private Date creationTime = new Date();
}

```

### FieldMayBeFinal
Field `creationTime` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-common/src/main/java/org/apache/shardingsphere/elasticjob/cloud/statistics/type/job/JobRunningStatistics.java`
#### Snippet
```java
    private final Date statisticsTime;
    
    private Date creationTime = new Date();
}

```

### FieldMayBeFinal
Field `creationTime` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-common/src/main/java/org/apache/shardingsphere/elasticjob/cloud/statistics/type/task/TaskResultStatistics.java`
#### Snippet
```java
    private final Date statisticsTime;
    
    private Date creationTime = new Date();
}

```

### FieldMayBeFinal
Field `creationTime` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-common/src/main/java/org/apache/shardingsphere/elasticjob/cloud/statistics/type/task/TaskRunningStatistics.java`
#### Snippet
```java
    private final Date statisticsTime;
    
    private Date creationTime = new Date();
}

```

### FieldMayBeFinal
Field `props` may be 'final'
in `elasticjob-cloud/elasticjob-cloud-common/src/main/java/org/apache/shardingsphere/elasticjob/cloud/config/pojo/CloudJobConfigurationPOJO.java`
#### Snippet
```java
    private String description;
    
    private Properties props = new Properties();
    
    private boolean disabled;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `jobListenerTypes` are queried, but never updated
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-boot-starter/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/boot/job/ElasticJobConfigurationProperties.java`
#### Snippet
```java
    private String jobErrorHandlerType;
    
    private Collection<String> jobListenerTypes = new LinkedList<>();
    
    private String description;
```

### MismatchedCollectionQueryUpdate
Contents of collection `jobListenerTypes` are queried, but never updated
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private String jobErrorHandlerType;
    
    private Collection<String> jobListenerTypes = new ArrayList<>();
    
    private Collection<YamlConfiguration<JobExtraConfiguration>> jobExtraConfigurations = new LinkedList<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `props` are queried, but never updated
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private String description;
    
    private Properties props = new Properties();
    
    private boolean disabled;
```

### MismatchedCollectionQueryUpdate
Contents of collection `jobExtraConfigurations` are queried, but never updated
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/pojo/JobConfigurationPOJO.java`
#### Snippet
```java
    private Collection<String> jobListenerTypes = new ArrayList<>();
    
    private Collection<YamlConfiguration<JobExtraConfiguration>> jobExtraConfigurations = new LinkedList<>();
    
    private String description;
```

### MismatchedCollectionQueryUpdate
Contents of collection `shardingItems` are queried, but never updated
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/context/TaskContext.java`
#### Snippet
```java
        private final String jobName;
        
        private final List<Integer> shardingItems;

        /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `controllerInstances` are updated, but never queried
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/NettyRestfulServiceConfiguration.java`
#### Snippet
```java
    private final List<Filter> filterInstances = new LinkedList<>();
    
    private final List<RestfulController> controllerInstances = new LinkedList<>();
    
    private final Map<Class<? extends Throwable>, ExceptionHandler<? extends Throwable>> exceptionHandlers = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `filterInstances` are updated, but never queried
in `elasticjob-infra/elasticjob-restful/src/main/java/org/apache/shardingsphere/elasticjob/restful/NettyRestfulServiceConfiguration.java`
#### Snippet
```java
    private boolean trailingSlashSensitive;
    
    private final List<Filter> filterInstances = new LinkedList<>();
    
    private final List<RestfulController> controllerInstances = new LinkedList<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `props` are queried, but never updated
in `elasticjob-cloud/elasticjob-cloud-common/src/main/java/org/apache/shardingsphere/elasticjob/cloud/config/pojo/CloudJobConfigurationPOJO.java`
#### Snippet
```java
    private String description;
    
    private Properties props = new Properties();
    
    private boolean disabled;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `elasticjob-lite/elasticjob-lite-spring/elasticjob-lite-spring-namespace/src/main/java/org/apache/shardingsphere/elasticjob/lite/spring/namespace/job/parser/JobBeanDefinitionParser.java`
#### Snippet
```java
            result.addConstructorArgValue(Collections.emptyList());
        } else {
            result.addConstructorArgValue(Arrays.asList(element.getAttribute(JobBeanDefinitionTag.JOB_LISTENER_TYPES_ATTRIBUTE).split(",")));
        }
        result.addConstructorArgValue(parseExtraConfigs(new String[]{JobBeanDefinitionTag.TRACING_REF_ATTRIBUTE},
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/sharding/JobShardingStrategyFactory.java`
#### Snippet
```java
    public static JobShardingStrategy getStrategy(final String type) {
        if (Strings.isNullOrEmpty(type)) {
            return ElasticJobServiceLoader.getCachedTypedServiceInstance(JobShardingStrategy.class, DEFAULT_STRATEGY).get();
        }
        return ElasticJobServiceLoader.getCachedTypedServiceInstance(JobShardingStrategy.class, type)
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/handler/threadpool/JobExecutorServiceHandlerFactory.java`
#### Snippet
```java
    public static JobExecutorServiceHandler getHandler(final String type) {
        if (Strings.isNullOrEmpty(type)) {
            return ElasticJobServiceLoader.getCachedTypedServiceInstance(JobExecutorServiceHandler.class, DEFAULT_HANDLER).get();
        }
        return ElasticJobServiceLoader.getCachedTypedServiceInstance(JobExecutorServiceHandler.class, type)
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/mesos/TaskLaunchScheduledService.java`
#### Snippet
```java
    private Protos.Resource buildResource(final String type, final double resourceValue, final List<Protos.Resource> resources) {
        return Protos.Resource.newBuilder().mergeFrom(
                resources.stream().filter(input -> input.getName().equals(type)).findFirst().get()).setScalar(Protos.Value.Scalar.newBuilder().setValue(resourceValue)).build();
    }
    
```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `timeService.getCurrentMillis() - before` is always '0'
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/api/listener/AbstractDistributeOnceElasticJobListener.java`
#### Snippet
```java
            Thread.interrupted();
        }
        if (timeService.getCurrentMillis() - before >= startedTimeoutMilliseconds) {
            guaranteeService.clearAllStartedInfo();
            handleTimeout(startedTimeoutMilliseconds);
```

### ConstantValue
Result of `timeService.getCurrentMillis() - before` is always '0'
in `elasticjob-lite/elasticjob-lite-core/src/main/java/org/apache/shardingsphere/elasticjob/lite/api/listener/AbstractDistributeOnceElasticJobListener.java`
#### Snippet
```java
            Thread.interrupted();
        }
        if (timeService.getCurrentMillis() - before >= completedTimeoutMilliseconds) {
            guaranteeService.clearAllCompletedInfo();
            handleTimeout(completedTimeoutMilliseconds);
```

### ConstantValue
Condition `Objects.nonNull(appName)` is always `true`
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/disable/app/CloudAppDisableListener.java`
#### Snippet
```java
        if (Type.NODE_CREATED == type && isAppDisableNode(path)) {
            String appName = path.substring(DisableAppNode.ROOT.length() + 1);
            if (Objects.nonNull(appName)) {
                disableApp(appName);
            }
```

### ConstantValue
Condition `Objects.nonNull(appName)` is always `true`
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/disable/app/CloudAppDisableListener.java`
#### Snippet
```java
        } else if (Type.NODE_DELETED == type && isAppDisableNode(path)) {
            String appName = path.substring(DisableAppNode.ROOT.length() + 1);
            if (Objects.nonNull(appName)) {
                enableApp(appName);
            }
```

### ConstantValue
Condition `Objects.nonNull(jobName)` is always `true`
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/disable/job/CloudJobDisableListener.java`
#### Snippet
```java
        if (Type.NODE_CREATED == type && isJobDisableNode(path)) {
            String jobName = path.substring(DisableJobNode.ROOT.length() + 1);
            if (Objects.nonNull(jobName)) {
                producerManager.unschedule(jobName);
            }
```

### ConstantValue
Condition `Objects.nonNull(jobName)` is always `true`
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/disable/job/CloudJobDisableListener.java`
#### Snippet
```java
        } else if (Type.NODE_DELETED == type && isJobDisableNode(path)) {
            String jobName = path.substring(DisableJobNode.ROOT.length() + 1);
            if (Objects.nonNull(jobName)) {
                producerManager.reschedule(jobName);
            }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor)' is marked unstable with @Beta
in `elasticjob-infra/elasticjob-infra-common/src/main/java/org/apache/shardingsphere/elasticjob/infra/concurrent/ElasticJobExecutorService.java`
#### Snippet
```java
     */
    public ExecutorService createExecutorService() {
        return MoreExecutors.listeningDecorator(MoreExecutors.getExitingExecutorService(threadPoolExecutor));
    }

```

### UnstableApiUsage
'post(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/JobTracingEventBus.java`
#### Snippet
```java
    public void post(final JobEvent event) {
        if (isRegistered && !EXECUTOR_SERVICE.isShutdown()) {
            eventBus.post(event);
        }
    }
```

### UnstableApiUsage
'AsyncEventBus(java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.eventbus.AsyncEventBus' marked with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/JobTracingEventBus.java`
#### Snippet
```java
    
    public JobTracingEventBus(final TracingConfiguration<?> tracingConfig) {
        eventBus = new AsyncEventBus(EXECUTOR_SERVICE);
        register(tracingConfig);
    }
```

### UnstableApiUsage
'com.google.common.eventbus.AsyncEventBus' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/JobTracingEventBus.java`
#### Snippet
```java
    
    public JobTracingEventBus(final TracingConfiguration<?> tracingConfig) {
        eventBus = new AsyncEventBus(EXECUTOR_SERVICE);
        register(tracingConfig);
    }
```

### UnstableApiUsage
'getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor)' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/JobTracingEventBus.java`
#### Snippet
```java
                new LinkedBlockingQueue<>(), new BasicThreadFactory.Builder().namingPattern(String.join("-", "job-event", "%s")).build());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return MoreExecutors.listeningDecorator(MoreExecutors.getExitingExecutorService(threadPoolExecutor));
    }
    
```

### UnstableApiUsage
'register(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/JobTracingEventBus.java`
#### Snippet
```java
    private void register(final TracingConfiguration<?> tracingConfig) {
        try {
            eventBus.register(TracingListenerFactory.getListener(tracingConfig));
            isRegistered = true;
        } catch (final TracingConfigurationException ex) {
```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/JobTracingEventBus.java`
#### Snippet
```java
    private static final ExecutorService EXECUTOR_SERVICE;
    
    private final EventBus eventBus;
    
    private volatile boolean isRegistered;
```

### UnstableApiUsage
'com.google.common.eventbus.Subscribe' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/listener/TracingListener.java`
#### Snippet
```java
     * @param jobExecutionEvent job execution event
     */
    @Subscribe
    @AllowConcurrentEvents
    void listen(JobExecutionEvent jobExecutionEvent);
```

### UnstableApiUsage
'com.google.common.eventbus.AllowConcurrentEvents' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/listener/TracingListener.java`
#### Snippet
```java
     */
    @Subscribe
    @AllowConcurrentEvents
    void listen(JobExecutionEvent jobExecutionEvent);
    
```

### UnstableApiUsage
'com.google.common.eventbus.Subscribe' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/listener/TracingListener.java`
#### Snippet
```java
     * @param jobStatusTraceEvent job status trace event
     */
    @Subscribe
    @AllowConcurrentEvents
    void listen(JobStatusTraceEvent jobStatusTraceEvent);
```

### UnstableApiUsage
'com.google.common.eventbus.AllowConcurrentEvents' is marked unstable with @Beta
in `elasticjob-ecosystem/elasticjob-tracing/elasticjob-tracing-api/src/main/java/org/apache/shardingsphere/elasticjob/tracing/listener/TracingListener.java`
#### Snippet
```java
     */
    @Subscribe
    @AllowConcurrentEvents
    void listen(JobStatusTraceEvent jobStatusTraceEvent);
}
```

### UnstableApiUsage
'com.google.common.hash.HashCode' is marked unstable with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        List<String> jobNames = regCenter.getChildrenKeys(FailoverNode.ROOT);
        Collection<JobContext> result = new ArrayList<>(jobNames.size());
        Set<HashCode> assignedTasks = new HashSet<>(jobNames.size() * 10, 1);
        for (String each : jobNames) {
            List<String> taskIdList = regCenter.getChildrenKeys(FailoverNode.getFailoverJobNodePath(each));
```

### UnstableApiUsage
'com.google.common.hash.HashCode' is marked unstable with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
    }
    
    private List<Integer> getAssignedShardingItems(final String jobName, final List<String> taskIdList, final Set<HashCode> assignedTasks) {
        List<Integer> result = new ArrayList<>(taskIdList.size());
        for (String each : taskIdList) {
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        for (String each : taskIdList) {
            MetaInfo metaInfo = MetaInfo.from(each);
            if (assignedTasks.add(Hashing.sha256().newHasher().putString(jobName, StandardCharsets.UTF_8).putInt(metaInfo.getShardingItems().get(0)).hash())
                    && !runningService.isTaskRunning(metaInfo)) {
                result.add(metaInfo.getShardingItems().get(0));
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        for (String each : taskIdList) {
            MetaInfo metaInfo = MetaInfo.from(each);
            if (assignedTasks.add(Hashing.sha256().newHasher().putString(jobName, StandardCharsets.UTF_8).putInt(metaInfo.getShardingItems().get(0)).hash())
                    && !runningService.isTaskRunning(metaInfo)) {
                result.add(metaInfo.getShardingItems().get(0));
```

### UnstableApiUsage
'newHasher()' is declared in unstable interface 'com.google.common.hash.HashFunction' marked with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        for (String each : taskIdList) {
            MetaInfo metaInfo = MetaInfo.from(each);
            if (assignedTasks.add(Hashing.sha256().newHasher().putString(jobName, StandardCharsets.UTF_8).putInt(metaInfo.getShardingItems().get(0)).hash())
                    && !runningService.isTaskRunning(metaInfo)) {
                result.add(metaInfo.getShardingItems().get(0));
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        for (String each : taskIdList) {
            MetaInfo metaInfo = MetaInfo.from(each);
            if (assignedTasks.add(Hashing.sha256().newHasher().putString(jobName, StandardCharsets.UTF_8).putInt(metaInfo.getShardingItems().get(0)).hash())
                    && !runningService.isTaskRunning(metaInfo)) {
                result.add(metaInfo.getShardingItems().get(0));
```

### UnstableApiUsage
'putInt(int)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        for (String each : taskIdList) {
            MetaInfo metaInfo = MetaInfo.from(each);
            if (assignedTasks.add(Hashing.sha256().newHasher().putString(jobName, StandardCharsets.UTF_8).putInt(metaInfo.getShardingItems().get(0)).hash())
                    && !runningService.isTaskRunning(metaInfo)) {
                result.add(metaInfo.getShardingItems().get(0));
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `elasticjob-cloud/elasticjob-cloud-scheduler/src/main/java/org/apache/shardingsphere/elasticjob/cloud/scheduler/state/failover/FailoverService.java`
#### Snippet
```java
        for (String each : taskIdList) {
            MetaInfo metaInfo = MetaInfo.from(each);
            if (assignedTasks.add(Hashing.sha256().newHasher().putString(jobName, StandardCharsets.UTF_8).putInt(metaInfo.getShardingItems().get(0)).hash())
                    && !runningService.isTaskRunning(metaInfo)) {
                result.add(metaInfo.getShardingItems().get(0));
```

