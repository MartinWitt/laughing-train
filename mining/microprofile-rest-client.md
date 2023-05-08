# microprofile-rest-client 
 
# Bad smells
I found 165 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UastIncorrectHttpHeaderInspection | 38 | false |
| AutoCloseableResource | 31 | false |
| DataFlowIssue | 19 | false |
| UnnecessaryModifier | 13 | true |
| FieldMayBeFinal | 12 | false |
| CdiInjectionPointsInspection | 11 | false |
| DuplicatedCode | 6 | false |
| JavadocLinkAsPlainText | 6 | false |
| TrivialStringConcatenation | 5 | false |
| UnnecessaryLocalVariable | 4 | true |
| CharsetObjectCanBeUsed | 2 | false |
| CdiUnproxyableBeanTypesInspection | 2 | false |
| JavadocDeclaration | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| NullableProblems | 2 | false |
| TrivialIf | 2 | false |
| OptionalIsPresent | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ExtendsAnnotation | 1 | false |
| OctalLiteral | 1 | false |
| CatchMayIgnoreException | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TestMessageBodyWriter.java`
#### Snippet
```java
            MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream)
            throws IOException, WebApplicationException {
        outputStream.write("this is the replaced writer ".getBytes("UTF-8"));
        outputStream.write(s.getBytes("UTF-8"));
    }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TestMessageBodyWriter.java`
#### Snippet
```java
            throws IOException, WebApplicationException {
        outputStream.write("this is the replaced writer ".getBytes("UTF-8"));
        outputStream.write(s.getBytes("UTF-8"));
    }
}
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `api/src/main/java/org/eclipse/microprofile/rest/client/ext/DefaultClientHeadersFactoryImpl.java`
#### Snippet
```java
        MultivaluedMap<String, String> propagatedHeaders = new MultivaluedHashMap<>();
        Optional<String> propagateHeaderString = getHeadersProperty();
        if (propagateHeaderString.isPresent()) {
            Arrays.stream(propagateHeaderString.get().split(","))
                    .forEach(header -> {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIQueryParamStyleTest.java`
#### Snippet
```java

    @RegisterRestClient(configKey = "queryParamStyle")
    public static interface ArrayPairsStringClient extends StringClient {
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIQueryParamStyleTest.java`
#### Snippet
```java

    @RegisterRestClient(configKey = "queryParamStyle")
    public static interface CommaSeparatedStringClient extends StringClient {
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIQueryParamStyleTest.java`
#### Snippet
```java

    @RegisterRestClient(configKey = "queryParamStyle")
    public static interface DefaultStringClient extends StringClient {
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIQueryParamStyleTest.java`
#### Snippet
```java

    @RegisterRestClient(configKey = "queryParamStyle")
    public static interface MultiPairsStringClient extends StringClient {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasSingletonScopeTest.java`
#### Snippet
```java
    public interface MySingletonApi {
        @GET
        public Response get();
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/CustomHttpMethod.java`
#### Snippet
```java
    @Retention(RetentionPolicy.RUNTIME)
    @HttpMethod("MYMETHOD")
    public static @interface MYMETHOD {
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/CustomHttpMethod.java`
#### Snippet
```java
    @Retention(RetentionPolicy.RUNTIME)
    @HttpMethod("MYMETHOD")
    public static @interface MYMETHOD {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasRequestScopeTest.java`
#### Snippet
```java
    public interface MyRequestScopedApi {
        @GET
        public Response get();
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasAppScopeTest.java`
#### Snippet
```java
    public interface MyAppScopedApi {
        @GET
        public Response get();
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasConversationScopeTest.java`
#### Snippet
```java
    public interface MyConversationScopedApi {
        @GET
        public Response get();
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasSessionScopeTest.java`
#### Snippet
```java
    public interface MySessionScopedApi {
        @GET
        public Response get();
    }
}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
    }

    public static interface MyProgrammaticClient {
        @GET
        Response executeGet();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
    @RegisterRestClient(baseUri = STUB_URI)
    @RegisterProvider(MyFilter.class)
    public static interface MyClientWithAnnotations {
        @GET
        Response executeGet();
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/RestClientListenerTest.java`
#### Snippet
```java
                .build(SimpleGetApi.class);

        assertEquals(client.executeGet().getStatus(), 500,
                "The RestClientListener impl was not invoked");
        assertEquals(SimpleRestClientListenerImpl.getServiceInterface(), SimpleGetApi.class,
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/RestClientBuilderListenerTest.java`
#### Snippet
```java
                .build(SimpleGetApi.class);

        assertEquals(client.executeGet().getStatus(), 200,
                "The RestClientBuilderListener impl was not invoked");
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InvokedMethodTest.java`
#### Snippet
```java
                .build(ChildClient.class);

        Response response = client.executeBasePost();
        assertEquals(response.getStatus(), 200,
                "An exception occurred in the ClientRequestFilter");
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/CallMultipleMappersTest.java`
#### Snippet
```java

        try {
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown via the registered "
                    + TestResponseExceptionMapper.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/ConfigKeyForMultipleInterfacesTest.java`
#### Snippet
```java
    public void testConfigKeyUsedForUri() throws Exception {
        assertEquals(client1.get(), "GET http://localhost:1234/configKeyUri/hello");
        assertEquals(client2.executeGet().readEntity(String.class), "GET http://localhost:1234/configKeyUri");
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProvidesRestClientBuilderTest.java`
#### Snippet
```java
        builder = builder.baseUrl(new URL("http://localhost:8080/right1"));
        SimpleGetApi client = builder.build(SimpleGetApi.class);
        assertEquals(client.executeGet().readEntity(String.class), "GET http://localhost:8080/right1");

        builder = builder.baseUrl(new URL("http://localhost:8080/wrong2"));
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProvidesRestClientBuilderTest.java`
#### Snippet
```java
        builder = builder.baseUri(new URI("http://localhost:8080/right2"));
        client = builder.build(SimpleGetApi.class);
        assertEquals(client.executeGet().readEntity(String.class), "GET http://localhost:8080/right2");
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/BeanParamTest.java`
#### Snippet
```java

        MyBean myBean = new MyBean("qParam", "123", "headerVal");
        Response response = client.executePut(myBean, "body");
        assertEquals(response.getStatus(), 200, "Unexpected response - filter not properly registered");
        String responseStr = response.readEntity(String.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/BeanParamTest.java`
#### Snippet
```java

        myBean.setCookie("456");
        response = client.executePut(myBean, "body");
        assertEquals(response.getStatus(), 200, "Unexpected response - filter not properly registered");
        responseStr = response.readEntity(String.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/CustomHttpMethodTest.java`
#### Snippet
```java
        RestClientBuilder builder = RestClientBuilder.newBuilder().register(filter);
        CustomHttpMethod client = builder.baseUri(new URI("http://localhost/stub")).build(CustomHttpMethod.class);
        Response response = client.executeMyMethod();
        assertEquals(response.getStatus(), 200, "Unexpected HTTP Method sent from client - " +
                "expected \"MYMETHOD\", was \"" + response.readEntity(String.class) + "\"");
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InheritanceTest.java`
#### Snippet
```java
        RestClientBuilder builder = RestClientBuilder.newBuilder().register(filter);
        BaseClient client = builder.baseUri(new URI("http://localhost/stub")).build(ChildClient.class);
        Response response = client.executeBaseGet();
        assertEquals(response.getStatus(), 200, "Unexpected response status code");
        String responseStr = response.readEntity(String.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InheritanceTest.java`
#### Snippet
```java
        RestClientBuilder builder = RestClientBuilder.newBuilder().register(filter);
        BaseClient client = builder.baseUri(new URI("http://localhost/stub")).build(ChildClient.class);
        Response response = client.executeBasePost();
        assertEquals(response.getStatus(), 200, "Unexpected response status code");
        String responseStr = response.readEntity(String.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InheritanceTest.java`
#### Snippet
```java
        RestClientBuilder builder = RestClientBuilder.newBuilder().register(filter);
        ChildClient client = builder.baseUri(new URI("http://localhost/stub")).build(ChildClient.class);
        Response response = client.executeChildGet();
        assertEquals(response.getStatus(), 200, "Unexpected response status code");
        String responseStr = response.readEntity(String.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/DefaultExceptionMapperConfigTest.java`
#### Snippet
```java

        try {
            Response response = simpleGetApi.executeGet();
            assertEquals(response.getStatus(), STATUS);
        } catch (Exception w) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/DefaultExceptionMapperTest.java`
#### Snippet
```java

        try {
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown automatically");
        } catch (WebApplicationException w) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/DefaultExceptionMapperTest.java`
#### Snippet
```java

        try {
            Response response = simpleGetApi.executeGet();
            assertEquals(response.getStatus(), STATUS);
        } catch (Exception w) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/DefaultExceptionMapperTest.java`
#### Snippet
```java

        try {
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown automatically");
        } catch (WebApplicationException w) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/DefaultExceptionMapperTest.java`
#### Snippet
```java

        try {
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown automatically");
        } catch (WebApplicationException w) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProxyServerTest.java`
#### Snippet
```java
                    .baseUri(URI.create("http://localhost:" + DESTINATION_SERVER_PORT + "/testProxy"))
                    .build(SimpleGetApi.class);
            Response response = client.executeGet();
            assertEquals(response.getStatus(), 200);
            assertEquals(response.readEntity(String.class).trim(), "foo");
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ExceptionMapperTest.java`
#### Snippet
```java

        try {
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown via the registered "
                    + TestResponseExceptionMapper.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ExceptionMapperTest.java`
#### Snippet
```java

        try {
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown via the registered "
                    + TestResponseExceptionMapper.class);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/timeout/TimeoutTestBase.java`
#### Snippet
```java
        long startTime = System.nanoTime();
        try {
            getClientWithConnectTimeout().executeGet();
            fail("A ProcessingException should have been thrown to indicate a timeout");
        } finally {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/timeout/TimeoutTestBase.java`
#### Snippet
```java
        long startTime = System.nanoTime();
        try {
            getClientWithReadTimeout().executeGet();
            fail("A ProcessingException should have been thrown due to a read timeout");
        } finally {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
    @Test
    public void testCDIProviderSpecifiedViaAnnotation() throws Exception {
        Response r = annotationClient.executeGet();
        assertEquals(r.getStatus(), 200);
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
    @Test
    public void testCDIProviderSpecifiedInMPConfig() throws Exception {
        Response r = configClient.executeGet();
        assertEquals(r.getStatus(), 200);
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
                .register(new MyFilter())
                .build(MyProgrammaticClient.class);
        Response r = client.executeGet();
        assertEquals(r.getStatus(), 204);
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
                .register(MyFilter.class)
                .build(MyProgrammaticClient.class);
        Response r = client.executeGet();
        assertEquals(r.getStatus(), 200);
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIProxyServerTest.java`
#### Snippet
```java
        try {
            startDestinationServer("bar");
            Response response = client.executeGet();
            assertEquals(response.getStatus(), 200);
            assertEquals(response.readEntity(String.class).trim(), "bar");
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProducesConsumesTest.java`
#### Snippet
```java

        LOG.info(m + " @Produce(application/json) @Consume(application/xml)");
        Response r = client.produceJSONConsumeXML(XML_PAYLOAD);
        String acceptHeader = r.getHeaderString("Sent-Accept");
        LOG.info(m + "Sent-Accept: " + acceptHeader);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProducesConsumesTest.java`
#### Snippet
```java

        LOG.info(m + " @Produce(application/xml) @Consume(application/json)");
        r = client.produceXMLConsumeJSON(JSON_PAYLOAD);
        acceptHeader = r.getHeaderString("Sent-Accept");
        LOG.info(m + "Sent-Accept: " + acceptHeader);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProducesConsumesTest.java`
#### Snippet
```java

        LOG.info(m + " @Produce(text/html) @Consume(text/plain)");
        Response r = client.produceHtmlConsumeText("1", "whatever");
        String acceptHeader = r.getHeaderString("Sent-Accept");
        LOG.info(m + "Sent-Accept: " + acceptHeader);
```

## RuleId[id=CdiUnproxyableBeanTypesInspection]
### CdiUnproxyableBeanTypesInspection
Managed bean declaring a passivating scope must be java.io.Serializable
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasConversationScopeTest.java`
#### Snippet
```java
    @ConversationScoped
    @RegisterRestClient
    public interface MyConversationScopedApi {
        @GET
        public Response get();
```

### CdiUnproxyableBeanTypesInspection
Managed bean declaring a passivating scope must be java.io.Serializable
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/HasSessionScopeTest.java`
#### Snippet
```java
    @Path("/")
    @RegisterRestClient
    public interface MySessionScopedApi {
        @GET
        public Response get();
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/CloseTest.java`
#### Snippet
```java
        RestClientBuilder builder = RestClientBuilder.newBuilder().register(ReturnWith200RequestFilter.class);
        StringClient client = builder.baseUri(new URI("http://localhost/stub")).build(StringClient.class);
        try (AutoCloseable ac = (AutoCloseable) client;) {
            assertEquals(client.getHeaderValue("foo"), "OK");
        } catch (Throwable t) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `delete` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeadersFactoryTest.java`
#### Snippet
```java
        CustomClientHeadersFactory.passedInOutgoingHeaders.clear();

        JsonObject headers = client(ReturnWithAllClientHeadersFilter.class).delete("argValue");

        assertTrue(CustomClientHeadersFactory.invoked);
```

### DataFlowIssue
Argument `input` might be null
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/AbstractSslTest.java`
#### Snippet
```java

        try (InputStream input = AbstractSslTest.class.getResourceAsStream(resourceLocation)) {
            Files.copy(input, diskLocation);
            diskLocation.toFile().deleteOnExit();
        } catch (IOException e) {
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ext/CustomClientHeadersFactory.java`
#### Snippet
```java
        MultivaluedMap<String, String> returnVal = new MultivaluedHashMap<>();
        returnVal.putSingle("FactoryHeader", "factoryValue");
        clientOutgoingHeaders.forEach((k, v) -> {
            returnVal.putSingle(k, v.get(0) + "Modified");
        });
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ext/CdiCustomClientHeadersFactory.java`
#### Snippet
```java
        MultivaluedMap<String, String> returnVal = new MultivaluedHashMap<>();
        returnVal.putSingle("FactoryHeader", "factoryValue");
        clientOutgoingHeaders.forEach((k, v) -> {
            returnVal.putSingle(k, v.get(0) + "Modified");
        });
```

### DataFlowIssue
Method invocation `delete` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIClientHeadersFactoryTest.java`
#### Snippet
```java
        CdiCustomClientHeadersFactory.passedInOutgoingHeaders.clear();

        JsonObject headers = client(ReturnWithAllClientHeadersFilter.class).delete("argValue");

        assertTrue(CdiCustomClientHeadersFactory.invoked);
```

### DataFlowIssue
Method invocation `methodClientHeaderParamOverridesInterfaceExplicit` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testExplicitClientHeaderParamOnMethodOverridesClientHeaderParamOnInterface() {
        stub("OverrideableExplicit", "overriddenMethodExplicit");
        assertEquals(client().methodClientHeaderParamOverridesInterfaceExplicit(),
                "overriddenMethodExplicit");
    }
```

### DataFlowIssue
Method invocation `methodComputed` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testComputedClientHeaderParamOnMethod() {
        stub("MethodHeaderComputed", "MethodHeaderComputed-X");
        assertEquals(client().methodComputed(), "MethodHeaderComputed-X");
    }

```

### DataFlowIssue
Method invocation `methodExplicit` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testExplicitClientHeaderParamOnMethod() {
        stub("MethodHeaderExplicit", "methodExplicit");
        assertEquals(client().methodExplicit(), "methodExplicit");
    }

```

### DataFlowIssue
Method invocation `methodComputeMultiValuedHeaderFromOtherClass` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testMultivaluedHeaderInterfaceExplicit() {
        stub("InterfaceMultiValuedHeaderExplicit", "abc", "xyz");
        assertEquals(client().methodComputeMultiValuedHeaderFromOtherClass(),
                "abc-xyz");
    }
```

### DataFlowIssue
Method invocation `methodComputeMultiValuedHeaderFromOtherClass` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testMultivaluedHeaderSentWhenInvokingComputeMethodFromSeparateClass() {
        stub("MultiValueInvokedFromAnotherClass", "value1", "value2");
        assertEquals(client().methodComputeMultiValuedHeaderFromOtherClass(),
                "value1-value2");
    }
```

### DataFlowIssue
Method invocation `methodRequiredComputeMethodFails` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testExceptionInRequiredComputeMethodThrowsClientErrorException() {
        try {
            client().methodRequiredComputeMethodFails();
            fail("Expected exception to be thrown");
        } catch (Throwable t) {
```

### DataFlowIssue
Method invocation `interfaceExplicit` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testExplicitClientHeaderParamOnInterface() {
        stub("InterfaceHeaderExplicit", "interfaceExplicit");
        assertEquals(client().interfaceExplicit(), "interfaceExplicit");
    }
    @Test
```

### DataFlowIssue
Method invocation `methodClientHeaderParamOverridesInterfaceComputed` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testComputedClientHeaderParamOnMethodOverridesClientHeaderParamOnInterface() {
        stub("OverrideableComputed", "overriddenMethodComputed");
        assertEquals(client().methodClientHeaderParamOverridesInterfaceComputed(),
                "overriddenMethodComputed");
    }
```

### DataFlowIssue
Method invocation `headerParamOverridesInterfaceExplicit` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testHeaderParamOverridesExplicitClientHeaderParamOnInterface() {
        stub("InterfaceHeaderExplicit", "header");
        assertEquals(client().headerParamOverridesInterfaceExplicit("header"), "header");
    }

```

### DataFlowIssue
Method invocation `headerParamOverridesMethodComputed` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testHeaderParamOverridesComputedClientHeaderParamOnMethod() {
        stub("MethodHeaderComputed", "override2");
        assertEquals(client().headerParamOverridesMethodComputed("override2"), "override2");
    }

```

### DataFlowIssue
Method invocation `interfaceComputed` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testComputedClientHeaderParamOnInterface() {
        stub("InterfaceHeaderComputed", "interfaceComputed");
        assertEquals(client().interfaceComputed(), "interfaceComputed");
    }

```

### DataFlowIssue
Method invocation `methodOptionalMethodHeaderNotSentWhenComputeThrowsException` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testHeaderNotSentWhenExceptionThrownAndRequiredIsFalse() {
        JsonObject headers = client(ReturnWithAllClientHeadersFilter.class)
                .methodOptionalMethodHeaderNotSentWhenComputeThrowsException();

        assertFalse(headers.containsKey("OptionalInterfaceHeader"));
```

### DataFlowIssue
Method invocation `headerParamOverridesMethodExplicit` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testHeaderParamOverridesExplicitClientHeaderParamOnMethod() {
        stub("MethodHeaderExplicit", "header2");
        assertEquals(client().headerParamOverridesMethodExplicit("header2"), "header2");
    }

```

### DataFlowIssue
Method invocation `headerParamOverridesInterfaceComputed` may produce `NullPointerException`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    public void testHeaderParamOverridesComputedClientHeaderParamOnInterface() {
        stub("InterfaceHeaderComputed", "override");
        assertEquals(client().headerParamOverridesInterfaceComputed("override"), "override");
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientHeaderParamTest.java`
#### Snippet
```java
    private static void stub(String expectedHeaderName, String... expectedHeaderValue) {
        String expectedIncomingHeader = Arrays.stream(expectedHeaderValue)
                .collect(Collectors.joining(","));
        String outputBody = expectedIncomingHeader.replace(',', '-');
        MappingBuilder mappingBuilder = get(urlEqualTo("/"));
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `api/src/main/java/org/eclipse/microprofile/rest/client/spi/RestClientBuilderResolver.java`
#### Snippet
```java
     * Creates a new RestClientBuilder instance.
     * <p>
     * Implementations are expected to override the {@link #newBuilder()} method to create custom RestClientBuilder
     * implementations.
     * <p>
```

### JavadocDeclaration
Tag `return` is not allowed here
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/AbstractSslTest.java`
#### Snippet
```java
     * @param serverInitializer
     *            performs a test-specific configuration of the https server
     * @return the disk directory containing certificates
     */
    static void initializeTest(WebArchive webArchive, Consumer<HttpsServer> serverInitializer) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `invocations` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TestClientRequestFilter.java`
#### Snippet
```java

public class TestClientRequestFilter implements ClientRequestFilter {
    private static AtomicInteger invocations = new AtomicInteger(0);
    @Override
    public void filter(ClientRequestContext clientRequestContext) throws IOException {
```

### FieldMayBeFinal
Field `serverLaunchExecutor` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/AbstractSseTest.java`
#### Snippet
```java
    protected static final int PORT = Integer.getInteger("sse.server.port", 10000);

    private static ExecutorService serverLaunchExecutor = Executors.newSingleThreadExecutor();

    protected static AtomicReference<Throwable> launchServer(CountDownLatch stopLatch,
```

### FieldMayBeFinal
Field `responseContentType` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/HttpsServer.java`
#### Snippet
```java

    private String responseContent = "{\"foo\": \"bar\"}";
    private String responseContentType = ContentType.APPLICATION_JSON.getMimeType();

    public HttpsServer keyStore(String keystore, String keyStorePassword) {
```

### FieldMayBeFinal
Field `sslContextFactory` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/HttpsServer.java`
#### Snippet
```java

    private final Server server = new Server();
    private SslContextFactory sslContextFactory = new SslContextFactory();

    private String responseContent = "{\"foo\": \"bar\"}";
```

### FieldMayBeFinal
Field `responseContent` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/HttpsServer.java`
#### Snippet
```java
    private SslContextFactory sslContextFactory = new SslContextFactory();

    private String responseContent = "{\"foo\": \"bar\"}";
    private String responseContentType = ContentType.APPLICATION_JSON.getMimeType();

```

### FieldMayBeFinal
Field `invocations` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TestWriterInterceptor.java`
#### Snippet
```java

public class TestWriterInterceptor implements WriterInterceptor {
    private static AtomicInteger invocations = new AtomicInteger(0);
    @Override
    public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext)
```

### FieldMayBeFinal
Field `invocations` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TestClientResponseFilter.java`
#### Snippet
```java

public class TestClientResponseFilter implements ClientResponseFilter {
    private static AtomicInteger invocations = new AtomicInteger(0);
    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext)
```

### FieldMayBeFinal
Field `privateIgnoredField` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MyJsonBObjectWithPrivateProperties.java`
#### Snippet
```java

    @JsonbTransient
    private String privateIgnoredField;

    public MyJsonBObjectWithPrivateProperties() {
```

### FieldMayBeFinal
Field `invocations` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TestReaderInterceptor.java`
#### Snippet
```java

public class TestReaderInterceptor implements ReaderInterceptor {
    private static AtomicInteger invocations = new AtomicInteger(0);
    @Override
    public Object aroundReadFrom(ReaderInterceptorContext readerInterceptorContext)
```

### FieldMayBeFinal
Field `tlInt` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TLAsyncInvocationInterceptorFactory.java`
#### Snippet
```java
public class TLAsyncInvocationInterceptorFactory implements AsyncInvocationInterceptorFactory {

    private static ThreadLocal<Integer> tlInt = ThreadLocal.withInitial(() -> {
        return new Integer(0);
    });
```

### FieldMayBeFinal
Field `data` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/TLAsyncInvocationInterceptorFactory.java`
#### Snippet
```java
    });

    private Map<String, Object> data = new ConcurrentHashMap<>();

    public static Integer getTlInt() {
```

### FieldMayBeFinal
Field `inMethod` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/ReactiveStreamsPublisherTckTest.java`
#### Snippet
```java

    private CountDownLatch cleanupLatch;
    private AtomicBoolean inMethod = new AtomicBoolean(false);

    @Deployment
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `ids` are updated, but never queried
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/BasicReactiveStreamsTest.java`
#### Snippet
```java
        final Set<String> comments = new HashSet<>();
        final Set<String> names = new HashSet<>();
        final Set<String> ids = new HashSet<>();
        final CountDownLatch eventLatch;
        Throwable throwable;
```

### MismatchedCollectionQueryUpdate
Contents of collection `eventSources` are queried, but never updated
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/MyEventSourceServlet.java`
#### Snippet
```java

    private final Consumer<MyEventSource> consumer;
    private final Set<MyEventSource> eventSources = new HashSet<>();

    MyEventSourceServlet(Consumer<MyEventSource> consumer) {
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'RestClientLiteral' implements annotation interface `RestClient`
in `api/src/main/java/org/eclipse/microprofile/rest/client/inject/RestClient.java`
#### Snippet
```java
    RestClient LITERAL = new RestClientLiteral();

    class RestClientLiteral extends AnnotationLiteral<RestClient> implements RestClient {

    }
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/CdiClientHeadersFactoryClient.java`
#### Snippet
```java
@Path("/")
@RegisterClientHeaders(CdiCustomClientHeadersFactory.class)
@ClientHeaderParam(name = "IntfHeader", value = "intfValue")
public interface CdiClientHeadersFactoryClient {
    @DELETE
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/CdiClientHeadersFactoryClient.java`
#### Snippet
```java
public interface CdiClientHeadersFactoryClient {
    @DELETE
    @ClientHeaderParam(name = "MethodHeader", value = "methodValue")
    JsonObject delete(@HeaderParam("ArgHeader") String argHeader);
}
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/CdiClientHeadersFactoryClient.java`
#### Snippet
```java
    @DELETE
    @ClientHeaderParam(name = "MethodHeader", value = "methodValue")
    JsonObject delete(@HeaderParam("ArgHeader") String argHeader);
}

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MultipleHeadersOnSameMethod.java`
#### Snippet
```java
    }

    @ClientHeaderParam(name = "IdenticalHeader", value = "{computeMethod}")
    @ClientHeaderParam(name = "IdenticalHeader", value = "someValue")
    @GET
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MultipleHeadersOnSameMethod.java`
#### Snippet
```java

    @ClientHeaderParam(name = "IdenticalHeader", value = "{computeMethod}")
    @ClientHeaderParam(name = "IdenticalHeader", value = "someValue")
    @GET
    Response get();
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "OverrideableComputed", value = "{computeForMethod3}")
    String methodClientHeaderParamOverridesInterfaceComputed();

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "MethodHeaderExplicit", value = "methodExplicit")
    String headerParamOverridesMethodExplicit(@HeaderParam("MethodHeaderExplicit") String param);

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
    @GET
    @ClientHeaderParam(name = "MethodHeaderExplicit", value = "methodExplicit")
    String headerParamOverridesMethodExplicit(@HeaderParam("MethodHeaderExplicit") String param);

    @GET
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
import jakarta.ws.rs.Path;

@ClientHeaderParam(name = "InterfaceHeaderExplicit", value = "interfaceExplicit")
@ClientHeaderParam(name = "OverrideableExplicit", value = "overrideableInterfaceExplicit")
@ClientHeaderParam(name = "InterfaceHeaderComputed", value = "{computeForInterface}")
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

@ClientHeaderParam(name = "InterfaceHeaderExplicit", value = "interfaceExplicit")
@ClientHeaderParam(name = "OverrideableExplicit", value = "overrideableInterfaceExplicit")
@ClientHeaderParam(name = "InterfaceHeaderComputed", value = "{computeForInterface}")
@ClientHeaderParam(name = "OverrideableComputed", value = "{computeForInterface2}")
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
@ClientHeaderParam(name = "InterfaceHeaderExplicit", value = "interfaceExplicit")
@ClientHeaderParam(name = "OverrideableExplicit", value = "overrideableInterfaceExplicit")
@ClientHeaderParam(name = "InterfaceHeaderComputed", value = "{computeForInterface}")
@ClientHeaderParam(name = "OverrideableComputed", value = "{computeForInterface2}")
@ClientHeaderParam(name = "OptionalInterfaceHeader", value = "{fail}", required = false)
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
@ClientHeaderParam(name = "OverrideableExplicit", value = "overrideableInterfaceExplicit")
@ClientHeaderParam(name = "InterfaceHeaderComputed", value = "{computeForInterface}")
@ClientHeaderParam(name = "OverrideableComputed", value = "{computeForInterface2}")
@ClientHeaderParam(name = "OptionalInterfaceHeader", value = "{fail}", required = false)
@ClientHeaderParam(name = "InterfaceMultiValuedHeaderExplicit", value = {"abc", "xyz"})
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
@ClientHeaderParam(name = "InterfaceHeaderComputed", value = "{computeForInterface}")
@ClientHeaderParam(name = "OverrideableComputed", value = "{computeForInterface2}")
@ClientHeaderParam(name = "OptionalInterfaceHeader", value = "{fail}", required = false)
@ClientHeaderParam(name = "InterfaceMultiValuedHeaderExplicit", value = {"abc", "xyz"})
@Path("/")
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
@ClientHeaderParam(name = "OverrideableComputed", value = "{computeForInterface2}")
@ClientHeaderParam(name = "OptionalInterfaceHeader", value = "{fail}", required = false)
@ClientHeaderParam(name = "InterfaceMultiValuedHeaderExplicit", value = {"abc", "xyz"})
@Path("/")
public interface ClientHeaderParamClient {
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    String headerParamOverridesInterfaceExplicit(@HeaderParam("InterfaceHeaderExplicit") String param);

    @GET
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "OptionalMethodHeader", value = "{fail}", required = false)
    @ClientHeaderParam(name = "MethodHeaderExplicit", value = "SomeValue")
    JsonObject methodOptionalMethodHeaderNotSentWhenComputeThrowsException();
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
    @GET
    @ClientHeaderParam(name = "OptionalMethodHeader", value = "{fail}", required = false)
    @ClientHeaderParam(name = "MethodHeaderExplicit", value = "SomeValue")
    JsonObject methodOptionalMethodHeaderNotSentWhenComputeThrowsException();

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "MethodHeaderComputed", value = "{computeForMethod}")
    String methodComputed();

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
    // CHECKSTYLE:OFF
    // something in the parent pom is forcing these lines to merged into one line, which is longer than 150 characters
    @ClientHeaderParam(name = "MultiValueInvokedFromAnotherClass", value = "{org.eclipse.microprofile.rest.client.tck.ext.HeaderGenerator.generateHeader}")
    // CHECKSTYLE:OFF
    String methodComputeMultiValuedHeaderFromOtherClass();
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "MethodHeaderExplicit", value = "methodExplicit")
    String methodExplicit();

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    String headerParamOverridesInterfaceComputed(@HeaderParam("InterfaceHeaderComputed") String param);

    @GET
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "OverrideableExplicit", value = "overriddenMethodExplicit")
    String methodClientHeaderParamOverridesInterfaceExplicit();

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "WillCauseFailure", value = "{fail}")
    String methodRequiredComputeMethodFails();

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "MethodHeaderComputed", value = "{computeForMethod2}")
    String headerParamOverridesMethodComputed(@HeaderParam("MethodHeaderComputed") String param);

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeaderParamClient.java`
#### Snippet
```java
    @GET
    @ClientHeaderParam(name = "MethodHeaderComputed", value = "{computeForMethod2}")
    String headerParamOverridesMethodComputed(@HeaderParam("MethodHeaderComputed") String param);

    @GET
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ProxyServerTest.java`
#### Snippet
```java
                            HttpServletResponse response) throws IOException {
                        response.setHeader("Content-Type", "text/plain");
                        response.setHeader("X-Via", request.getHeader("X-Via"));
                        try (PrintWriter writer = response.getWriter()) {
                            writer.println(responseContent);
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ExceptionMapperTest.java`
#### Snippet
```java
    @Test
    public void testWithTwoRegisteredProviders() throws Exception {
        stubFor(get(urlEqualTo("/")).willReturn(aResponse().withHeader("CustomHeader", "true")
                .withBody("body is ignored in this test")));
        SimpleGetApi simpleGetApi = RestClientBuilder.newBuilder()
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ExceptionMapperTest.java`
#### Snippet
```java
    @Test
    public void testWithOneRegisteredProvider() throws Exception {
        stubFor(get(urlEqualTo("/")).willReturn(aResponse().withHeader("CustomHeader", "true")
                .withBody("body is ignored in this test")));
        SimpleGetApi simpleGetApi = RestClientBuilder.newBuilder()
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/InvalidComputeMethodSignature.java`
#### Snippet
```java
    }

    @ClientHeaderParam(name = "TestHeader", value = "{invalidMethod}")
    @GET
    Response get();
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeadersFactoryClient.java`
#### Snippet
```java
@Path("/")
@RegisterClientHeaders(CustomClientHeadersFactory.class)
@ClientHeaderParam(name = "IntfHeader", value = "intfValue")
public interface ClientHeadersFactoryClient {
    @DELETE
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeadersFactoryClient.java`
#### Snippet
```java
public interface ClientHeadersFactoryClient {
    @DELETE
    @ClientHeaderParam(name = "MethodHeader", value = "methodValue")
    JsonObject delete(@HeaderParam("ArgHeader") String argHeader);
}
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/ClientHeadersFactoryClient.java`
#### Snippet
```java
    @DELETE
    @ClientHeaderParam(name = "MethodHeader", value = "methodValue")
    JsonObject delete(@HeaderParam("ArgHeader") String argHeader);
}

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MultipleHeadersOnSameInterface.java`
#### Snippet
```java
import jakarta.ws.rs.core.Response;

@ClientHeaderParam(name = "IdenticalHeader", value = "{computeMethod}")
@ClientHeaderParam(name = "IdenticalHeader", value = "someValue")
public interface MultipleHeadersOnSameInterface {
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MultipleHeadersOnSameInterface.java`
#### Snippet
```java

@ClientHeaderParam(name = "IdenticalHeader", value = "{computeMethod}")
@ClientHeaderParam(name = "IdenticalHeader", value = "someValue")
public interface MultipleHeadersOnSameInterface {

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MyBean.java`
#### Snippet
```java
    private String cookie;

    @HeaderParam("MyHeader")
    private String header;

```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MultiValueClientHeaderWithComputeMethodOnInterface.java`
#### Snippet
```java
import jakarta.ws.rs.core.Response;

@ClientHeaderParam(name = "TestHeader", value = {"{computeHeader}", "SecondValue"})
public interface MultiValueClientHeaderWithComputeMethodOnInterface {
    default String computeHeader(String headerName) {
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MultiValueClientHeaderWithComputeMethodOnMethod.java`
#### Snippet
```java

    @GET
    @ClientHeaderParam(name = "TestHeader", value = {"InitialValue", "{computeHeader}"})
    Response get();
}
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MissingHeaderComputeMethod.java`
#### Snippet
```java
public interface MissingHeaderComputeMethod {

    @ClientHeaderParam(name = "TestHeader", value = "{missingMethod}")
    @GET
    Response get();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/AdditionalRegistrationTest.java`
#### Snippet
```java
        Map<Class<?>, Integer> priorities = new HashMap<>();
        priorities.put(ClientRequestFilter.class, 500);
        priorities.put(ClientResponseFilter.class, 501);
        priorities.put(MessageBodyReader.class, 502);
        priorities.put(MessageBodyWriter.class, 503);
        priorities.put(ReaderInterceptor.class, 504);
        priorities.put(WriterInterceptor.class, 505);
        priorities.put(ResponseExceptionMapper.class, 506);
        priorities.put(ParamConverterProvider.class, 507);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/AdditionalRegistrationTest.java`
#### Snippet
```java
        Map<Class<?>, Integer> contracts = configuration.getContracts(MultiTypedProvider.class);
        assertEquals(contracts.size(), priorities.size(),
                "There should be " + priorities.size() + " provider types registered");
        for (Map.Entry<Class<?>, Integer> priority : priorities.entrySet()) {
            Integer contractPriority = contracts.get(priority.getKey());
            assertEquals(contractPriority, priority.getValue(),
                    "The priority for " + priority.getKey() + " should be " + priority.getValue());
        }
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InvokeWithBuiltProvidersTest.java`
#### Snippet
```java
        Response response = api.executePost(inputBody);

        String body = response.readEntity(String.class);

        response.close();

        assertEquals(body, expectedResponseBody);

        verify(1, postRequestedFor(urlEqualTo("/")).withRequestBody(equalTo(expectedReceivedBody)));

        assertEquals(TestClientResponseFilter.getAndResetValue(), 1);
        assertEquals(TestClientRequestFilter.getAndResetValue(), 1);
        assertEquals(TestReaderInterceptor.getAndResetValue(), 1);
        assertEquals(TestWriterInterceptor.getAndResetValue(), 1);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InvokeWithBuiltProvidersTest.java`
#### Snippet
```java
        Response response = api.executePut(id, inputBody);

        String body = response.readEntity(String.class);

        response.close();

        assertEquals(body, expectedResponseBody);

        verify(1, putRequestedFor(urlEqualTo("/" + expectedId)).withRequestBody(equalTo(expectedReceivedBody)));

        assertEquals(TestClientResponseFilter.getAndResetValue(), 1);
        assertEquals(TestClientRequestFilter.getAndResetValue(), 1);
        assertEquals(TestReaderInterceptor.getAndResetValue(), 1);
        assertEquals(TestWriterInterceptor.getAndResetValue(), 1);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ext/CdiCustomClientHeadersFactory.java`
#### Snippet
```java
        invoked = true;
        isIncomingHeadersMapNull = incomingHeaders == null;
        isOutgoingHeadersMapNull = clientOutgoingHeaders == null;
        if (!isOutgoingHeadersMapNull) {
            passedInOutgoingHeaders.putAll(clientOutgoingHeaders);
        }

        MultivaluedMap<String, String> returnVal = new MultivaluedHashMap<>();
        returnVal.putSingle("FactoryHeader", "factoryValue");
        clientOutgoingHeaders.forEach((k, v) -> {
            returnVal.putSingle(k, v.get(0) + "Modified");
        });
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/BasicReactiveStreamsTest.java`
#### Snippet
```java
        RsSseClient client = RestClientBuilder.newBuilder()
                .baseUri(URI.create("http://localhost:" + PORT + "/string/sse"))
                .build(RsSseClient.class);
        Publisher<InboundSseEvent> publisher = client.getEvents();
        InboundSseEventSubscriber subscriber = new InboundSseEventSubscriber(3, resultsLatch);
        publisher.subscribe(subscriber);

        assertTrue(resultsLatch.await(30, TimeUnit.SECONDS));
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `04`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/jsonb/InvokeWithJsonBProviderTest.java`
#### Snippet
```java
        assertEquals(obj.getQty(), 17);
        assertEquals(obj.getIgnoredField(), "CTOR");
        assertEquals(obj.getDate(), LocalDate.of(2018, 12, 04));
    }
}
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/DefaultExceptionMapperTest.java`
#### Snippet
```java
            simpleGetApi.executeGet();
            fail("A " + WebApplicationException.class + " should have been thrown automatically");
        } catch (WebApplicationException w) {
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `event` is redundant
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/WeatherEventProvider.java`
#### Snippet
```java
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            WeatherEvent event = new WeatherEvent(df.parse(dateString), description);
            return event;
        } catch (ParseException ex) {
```

### UnnecessaryLocalVariable
Local variable `webArchive` is redundant
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/BasicReactiveStreamsTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive createDeployment() {
        WebArchive webArchive = ShrinkWrap.create(WebArchive.class,
                BasicReactiveStreamsTest.class.getSimpleName() + ".war")
                .addClasses(AbstractSseTest.class,
```

### UnnecessaryLocalVariable
Local variable `unwrappedError` is redundant
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ClientReuseTest.java`
#### Snippet
```java
            Assert.fail("the test didn't finish in " + timeout + " " + timeUnit);
        } catch (ExecutionException e) {
            Throwable unwrappedError = e.getCause();
            throw unwrappedError;
        }
```

### UnnecessaryLocalVariable
Local variable `webArchive` is redundant
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/ReactiveStreamsPublisherTckTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive createDeployment() {
        WebArchive webArchive = ShrinkWrap
                .create(WebArchive.class, BasicReactiveStreamsTest.class.getSimpleName() + ".war")
                .addPackage(PublisherVerification.class.getPackage())
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/interfaces/MyJsonBObjectWithPrivateProperties.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(privateIgnoredField).append("|").append(privateName).append("|").append(privateQty);
        return sb.toString();
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIFollowRedirectsTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private SimpleGetApi defaultClient;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/SslTrustStoreTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private JsonPClient clientWithNoSslStores;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/SslMutualTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private JsonPClient clientWithNoSslStores;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/SslHostnameVerifierTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private JsonPClient clientWithHostnameVerifier;

    @Test(expectedExceptions = ProcessingException.class)
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIURIvsURLConfigTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private SimpleGetApi api;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/InvokeWithJsonPProviderTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private JsonPClient cdiJsonPClient;

    private JsonPClient builtJsonPClient;
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/timeout/TimeoutViaMPConfigTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private SimpleGetApi api;

    @Deployment
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/jsonb/InvokeWithJsonBProviderTest.java`
#### Snippet
```java
    @RestClient
    @Inject
    private JsonBClient cdiJsonBClient;

    @RestClient
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIInvokeSimpleGetOperationTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private SimpleGetApi api;
    @Inject
    private BeanManager beanManager;
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIManagedProviderTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private SimpleGetApi configClient;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/cditests/CDIProxyServerTest.java`
#### Snippet
```java
    @Inject
    @RestClient
    private SimpleGetApi client;

    @Deployment
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/ThreadedClientResponseFilter.java`
#### Snippet
```java
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext)
            throws IOException {
        responseThreadId = "" + Thread.currentThread().getId();
        clientResponseContext.getHeaders().putSingle(RESPONSE_THREAD_ID_HEADER, responseThreadId);
        responseThreadName = Thread.currentThread().getName();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/asynctests/AsyncMethodTest.java`
#### Snippet
```java
                        .withBody(expectedBody)));

        final String mainThreadId = "" + Thread.currentThread().getId();

        ThreadedClientResponseFilter filter = new ThreadedClientResponseFilter();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/asynctests/AsyncMethodTest.java`
#### Snippet
```java
                        .withBody(expectedBody)));

        final String mainThreadId = "" + Thread.currentThread().getId();

        SimpleGetApiAsync api = RestClientBuilder.newBuilder()
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ext/CdiCustomClientHeadersFactory.java`
#### Snippet
```java

        if (counter != null) {
            returnVal.putSingle("CDI_INJECT_COUNT", "" + counter.count());
        }
        return returnVal;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/WiremockArquillianTest.java`
#### Snippet
```java
    protected static String getStringURL() {
        int port = getPort();
        return scheme + "://" + host + ":" + port + "" + context;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/asynctests/AsyncMethodTest.java`
#### Snippet
```java
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, expectedThreadName);
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/asynctests/AsyncMethodTest.java`
#### Snippet
```java
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(new Runnable() {
                    @Override
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `o != null` is always `true`
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/providers/Widget.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        return (o instanceof Widget) && o != null && ((Widget) o).name.equals(name) && ((Widget) o).length == length;
    }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/ssl/AbstractSslTest.java`
#### Snippet
```java
 *
 * Certificates were generated with Tomas Terem's script:
 * https://gist.github.com/tterem/8c4891641eddd6f070c6cdc738738c34
 *
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/eclipse/microprofile/rest/client/RestClientBuilder.java`
#### Snippet
```java
     * Specifies the base URL to be used when making requests. Assuming that the interface has a
     * <code>@Path("/api")</code> at the interface level and a <code>url</code> is given with
     * <code>http://my-service:8080/service</code> then all REST calls will be invoked with a <code>url</code> of
     * <code>http://my-service:8080/service/api</code> in addition to any <code>@Path</code> annotations included on the
     * method.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/eclipse/microprofile/rest/client/RestClientBuilder.java`
#### Snippet
```java
     * <code>@Path("/api")</code> at the interface level and a <code>url</code> is given with
     * <code>http://my-service:8080/service</code> then all REST calls will be invoked with a <code>url</code> of
     * <code>http://my-service:8080/service/api</code> in addition to any <code>@Path</code> annotations included on the
     * method.
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/eclipse/microprofile/rest/client/RestClientBuilder.java`
#### Snippet
```java
     * Specifies the base URI to be used when making requests. Assuming that the interface has a
     * <code>@Path("/api")</code> at the interface level and a <code>uri</code> is given with
     * <code>http://my-service:8080/service</code> then all REST calls will be invoked with a <code>uri</code> of
     * <code>http://my-service:8080/service/api</code> in addition to any <code>@Path</code> annotations included on the
     * method.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/eclipse/microprofile/rest/client/RestClientBuilder.java`
#### Snippet
```java
     * <code>@Path("/api")</code> at the interface level and a <code>uri</code> is given with
     * <code>http://my-service:8080/service</code> then all REST calls will be invoked with a <code>uri</code> of
     * <code>http://my-service:8080/service/api</code> in addition to any <code>@Path</code> annotations included on the
     * method.
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/utils/ConfigUtil.java`
#### Snippet
```java
     * @param value
     *            property value
     * @return an MP Config line, e.g. com.example.MyClient/mp-rest/url=http://example.com
     */
    public static String configLine(Class<?> aClass, String key, String value) {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/WeatherEvent.java`
#### Snippet
```java
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `tck/src/main/java/org/eclipse/microprofile/rest/client/tck/sse/WeatherEvent.java`
#### Snippet
```java
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
```

