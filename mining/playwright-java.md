# playwright-java 
 
# Bad smells
I found 205 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocLinkAsPlainText | 48 | false |
| UNUSED_IMPORT | 34 | false |
| JavadocDeclaration | 19 | false |
| OptionalUsedAsFieldOrParameterType | 16 | false |
| DuplicatedCode | 14 | false |
| UNCHECKED_WARNING | 10 | false |
| AutoCloseableResource | 7 | false |
| ConstantValue | 6 | false |
| DataFlowIssue | 4 | false |
| UnnecessarySemicolon | 4 | false |
| PointlessBooleanExpression | 4 | true |
| RedundantCast | 3 | false |
| DeprecatedIsStillUsed | 2 | false |
| FinalPrivateMethod | 2 | false |
| CatchMayIgnoreException | 2 | false |
| Deprecation | 2 | false |
| TrivialStringConcatenation | 2 | false |
| FinalStaticMethod | 2 | false |
| DanglingJavadoc | 2 | false |
| FieldCanBeLocal | 2 | false |
| OptionalAssignedToNull | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| MagicConstant | 1 | false |
| JavadocReference | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| IgnoreResultOfCall | 1 | false |
| TrivialIf | 1 | false |
| FieldMayBeFinal | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryContinue | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
      return (T)(Date.from(Instant.parse(value.d)));
    if (value.r != null)
      return (T)(Pattern.compile(value.r.p, fromJsRegexFlags(value.r.f)));
    if (value.v != null) {
      switch (value.v) {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.playwright.impl.Waitable\>' to 'com.microsoft.playwright.impl.Waitable'
in `playwright/src/main/java/com/microsoft/playwright/impl/VideoImpl.java`
#### Snippet
```java

  private ArtifactImpl waitForArtifact() {
    Waitable<ArtifactImpl> waitable = new WaitableRace<>(asList(waitableArtifact, (Waitable<ArtifactImpl>) page.waitableClosedOrCrashed));
    return page.runUntil(() -> {}, waitable);
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.function.Consumer\>' to 'java.util.function.Consumer'
in `playwright/src/main/java/com/microsoft/playwright/impl/ListenerCollection.java`
#### Snippet
```java

    for (Consumer<?> listener: new ArrayList<>(list)) {
      ((Consumer<T>) listener).accept(param);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.function.Predicate'
in `playwright/src/main/java/com/microsoft/playwright/impl/UrlMatcher.java`
#### Snippet
```java
    }
    if (object instanceof Predicate) {
      return new UrlMatcher((Predicate<String>) object);
    }
    throw new PlaywrightException("Url must be String, Pattern or Predicate<String>, found: " + object.getClass().getTypeName());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
      return f;
    }
    return convertType(f, (Class<T>) f.getClass());
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Enum' to 'T'
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java

    if (f instanceof Enum) {
      return (T) Enum.valueOf((Class) t, ((Enum) f).name());
    }

```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java

    if (f instanceof Enum) {
      return (T) Enum.valueOf((Class) t, ((Enum) f).name());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  @Override
  public List<String> allInnerTexts() {
    return (List<String>) frame.evalOnSelectorAll(selector, "ee => ee.map(e => e.innerText)");
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  @Override
  public List<String> allTextContents() {
    return (List<String>) frame.evalOnSelectorAll(selector, "ee => ee.map(e => e.textContent || '')");
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.playwright.impl.Waitable\>' to 'com.microsoft.playwright.impl.Waitable'
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      browserContext.setDefaultTimeoutImpl(0.0);
      try {
        runUntil(() -> {}, new WaitableRace<>(asList(context().pause(), (Waitable<JsonElement>) waitableClosedOrCrashed)));
      } finally {
        browserContext.setDefaultNavigationTimeoutImpl(defaultNavigationTimeout);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection\>'
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java

  <T> Waitable<T> createWaitForCloseHelper() {
    return new WaitableRace<T>(asList(new WaitablePageClose(), new WaitablePageCrash()));
  }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `timeout`
in `playwright/src/main/java/com/microsoft/playwright/assertions/PlaywrightAssertions.java`
#### Snippet
```java
   * }</pre>
   *
   * @param timeout Timeout in milliseconds.
   * @since v1.25
   */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `playwright/src/main/java/com/microsoft/playwright/impl/RouteImpl.java`
#### Snippet
```java
    } else if (options.body != null) {
      body = options.body;
      isBase64 = false;
      length = body.getBytes().length;
    } else if (options.bodyBytes != null) {
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `driver-bundle/src/main/java/com/microsoft/playwright/impl/driver/jar/DriverJar.java`
#### Snippet
```java
  public static URI getDriverResourceURI() throws URISyntaxException {
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    return classloader.getResource("driver/" + platformDir()).toURI();
  }

```

### DataFlowIssue
Method invocation `test` may produce `NullPointerException`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      Predicate<Response> responsePredicate = predicate;
      if (responsePredicate == null) {
        responsePredicate = response -> urlMatcher.test(response.url());;
      }
      return waitForResponseImpl(responsePredicate, options, code);
```

### DataFlowIssue
Method invocation `test` may produce `NullPointerException`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      Predicate<Request> requestPredicate = predicate;
      if (requestPredicate == null) {
        requestPredicate = request -> urlMatcher.test(request.url());;
      }
      return waitForRequestImpl(requestPredicate, options, code);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorUtils.java`
#### Snippet
```java

public class LocatorUtils {
  private static volatile String testIdAttributeName = "data-testid";;

  static void setTestIdAttributeName(String name) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `playwright/src/main/java/com/microsoft/playwright/impl/StackTraceCollector.java`
#### Snippet
```java
    while (index < stack.length && !stack[index].getClassName().equals(getClass().getName())) {
      index++;
    };
    // Find Playwright API call
    while (index < stack.length && stack[index].getClassName().startsWith("com.microsoft.playwright.")) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      Predicate<Response> responsePredicate = predicate;
      if (responsePredicate == null) {
        responsePredicate = response -> urlMatcher.test(response.url());;
      }
      return waitForResponseImpl(responsePredicate, options, code);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      Predicate<Request> requestPredicate = predicate;
      if (requestPredicate == null) {
        requestPredicate = request -> urlMatcher.test(request.url());;
      }
      return waitForRequestImpl(requestPredicate, options, code);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
      return ValueWrapper.create(value);
    }
    Collection<String> values = asList((Object[]) value).stream().map(e -> e.toString()).collect(Collectors.toList());
    String stringRepresentation = "[" + String.join(", ", values) + "]";
    return ValueWrapper.create(value, stringRepresentation);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `playwright/src/main/java/com/microsoft/playwright/impl/RawHeaders.java`
#### Snippet
```java
      return null;
    }
    return String.join("set-cookie".equals(name.toLowerCase()) ? "\n" : ", ", values);
  }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
    ElementHandleOptions handleOptions = convertType(options, ElementHandleOptions.class);
    // TODO: support deadline based timeout
//    Double timeout = null;
//    if (handleOptions != null) {
//      timeout = handleOptions.timeout;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'BrowserChannel' is still used
in `playwright/src/main/java/com/microsoft/playwright/options/BrowserChannel.java`
#### Snippet
```java

@Deprecated
public enum BrowserChannel {
  CHROME,
  CHROME_BETA,
```

### DeprecatedIsStillUsed
Deprecated member 'setChannel' is still used
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
     * href="https://playwright.dev/java/docs/browsers#google-chrome--microsoft-edge">Google Chrome and Microsoft Edge</a>.
     */
    public LaunchOptions setChannel(BrowserChannel channel) {
      this.channel = channel;
      return this;
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  final Map<String, BindingCallback> bindings = new HashMap<>();
  PageImpl ownerPage;
  private static final Map<EventType, String> eventSubscriptions() {
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.CONSOLE, "console");
```

### FinalPrivateMethod
'private' method declared `final`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private final Router routes = new Router();
  private final Set<FrameImpl> frames = new LinkedHashSet<>();
  private static final Map<EventType, String> eventSubscriptions() {
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.CONSOLE, "console");
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestImpl.java`
#### Snippet
```java
    if (options.storageStatePath != null) {
      try {
        byte[] bytes = Files.readAllBytes(options.storageStatePath);
        options.storageState = new String(bytes, StandardCharsets.UTF_8);
        options.storageStatePath = null;
      } catch (IOException e) {
        throw new PlaywrightException("Failed to read storage state from file", e);
      }
    }
    JsonObject storageState = null;
    if (options.storageState != null) {
      storageState = new Gson().fromJson(options.storageState, JsonObject.class);
      options.storageState = null;
    }
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.CONSOLE, "console");
    result.put(EventType.DIALOG, "dialog");
    result.put(EventType.REQUEST, "request");
    result.put(EventType.RESPONSE, "response");
    result.put(EventType.REQUESTFINISHED, "requestFinished");
    result.put(EventType.REQUESTFAILED, "requestFailed");
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
    bindings.put(name, playwrightBinding);

    JsonObject params = new JsonObject();
    params.addProperty("name", name);
    if (options != null && options.handle != null && options.handle) {
      params.addProperty("needsHandle", true);
    }
    sendMessage("exposeBinding", params);
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
    withLogging("BrowserContext.setExtraHTTPHeaders", () -> {
      JsonObject params = new JsonObject();
      JsonArray jsonHeaders = new JsonArray();
      for (Map.Entry<String, String> e : headers.entrySet()) {
        JsonObject header = new JsonObject();
        header.addProperty("name", e.getKey());
        header.addProperty("value", e.getValue());
        jsonHeaders.add(header);
      }
      params.add("headers", jsonHeaders);
      sendMessage("setExtraHTTPHeaders", params);
    });
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
      recordHar = new JsonObject();
      recordHar.addProperty("path", options.recordHarPath.toString());
      if (options.recordHarContent != null) {
        harContentPolicy = options.recordHarContent;
      } else if (options.recordHarOmitContent != null && options.recordHarOmitContent) {
        harContentPolicy = HarContentPolicy.OMIT;
      }
      if (harContentPolicy != null) {
        recordHar.addProperty("content", harContentPolicy.name().toLowerCase());
      }
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
      if (options.recordHarOmitContent != null) {
        throw new PlaywrightException("recordHarOmitContent is set but recordHarPath is null");
      }
      if (options.recordHarUrlFilter != null) {
        throw new PlaywrightException("recordHarUrlFilter is set but recordHarPath is null");
      }
      if (options.recordHarMode != null) {
        throw new PlaywrightException("recordHarMode is set but recordHarPath is null");
      }
      if (options.recordHarContent != null) {
        throw new PlaywrightException("recordHarContent is set but recordHarPath is null");
      }
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
    if (recordHar != null) {
      params.add("recordHar", recordHar);
    }
    if (options.recordVideoDir != null) {
      JsonObject recordVideo = new JsonObject();
      recordVideo.addProperty("dir", options.recordVideoDir.toString());
      if (options.recordVideoSize != null) {
        recordVideo.add("size", gson().toJsonTree(options.recordVideoSize));
      }
      params.remove("recordVideoDir");
      params.remove("recordVideoSize");
      params.add("recordVideo", recordVideo);
    } else if (options.recordVideoSize != null) {
      throw new PlaywrightException("recordVideoSize is set but recordVideoDir is null");
    }
    if (options.viewportSize != null) {
      if (options.viewportSize.isPresent()) {
        JsonElement size = params.get("viewportSize");
        params.remove("viewportSize");
        params.add("viewport", size);
      } else {
        params.remove("viewportSize");
        params.addProperty("noDefaultViewport", true);
      }
    }
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      params.addProperty("selector", selector);
      JsonElement json = sendMessage("querySelector", params);
      JsonObject element = json.getAsJsonObject().getAsJsonObject("element");
      if (element == null) {
        return null;
      }
      return connection.getExistingObject(element.get("guid").getAsString());
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      JsonObject params = new JsonObject();
      params.addProperty("selector", selector);
      JsonElement json = sendMessage("querySelectorAll", params);
      JsonArray elements = json.getAsJsonObject().getAsJsonArray("elements");
      if (elements == null) {
        return null;
      }
      List<ElementHandle> handles = new ArrayList<>();
      for (JsonElement item : elements) {
        handles.add(connection.getExistingObject(item.getAsJsonObject().get("guid").getAsString()));
      }
      return handles;
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      JsonObject params = new JsonObject();
      params.addProperty("selector", selector);
      params.addProperty("expression", pageFunction);
      params.add("arg", gson().toJsonTree(serializeArgument(arg)));
      JsonElement json = sendMessage("evalOnSelectorAll", params);
      SerializedValue value = gson().fromJson(json.getAsJsonObject().get("value"), SerializedValue.class);
      return deserialize(value);
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
    if (options == null) {
      options = new ScreenshotOptions();
    }
    if (options.type == null) {
      options.type = PNG;
      if (options.path != null) {
        String fileName = options.path.getFileName().toString();
        int extStart = fileName.lastIndexOf('.');
        if (extStart != -1) {
          String extension = fileName.substring(extStart).toLowerCase();
          if (".jpeg".equals(extension) || ".jpg".equals(extension)) {
            options.type = JPEG;
          }
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    JsonObject params = new JsonObject();
    params.addProperty("expression", expression);
    params.addProperty("world", "main");
    params.add("arg", gson().toJsonTree(serializeArgument(arg)));
    JsonElement json = sendMessage("evaluateExpression", params);
    SerializedValue value = gson().fromJson(json.getAsJsonObject().get("value"), SerializedValue.class);
    return deserialize(value);
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    JsonObject params = new JsonObject();
    params.addProperty("expression", pageFunction);
    params.addProperty("world", "main");
    params.add("arg", gson().toJsonTree(serializeArgument(arg)));
    JsonElement json = sendMessage("evaluateExpressionHandle", params);
    return connection.getExistingObject(json.getAsJsonObject().getAsJsonObject("handle").get("guid").getAsString());
```

### DuplicatedCode
Duplicated code
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
    List<ExpectedTextValue> list = new ArrayList<>();
    for (Pattern pattern : patterns) {
      ExpectedTextValue expected = expectedRegex(pattern);
      expected.ignoreCase = shouldIgnoreCase(options);
      expected.matchSubstring = true;
      expected.normalizeWhiteSpace = true;
      list.add(expected);
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `playwright/src/main/java/com/microsoft/playwright/impl/VideoImpl.java`
#### Snippet
```java
      try {
        waitForArtifact().delete();
      } catch (PlaywrightException e) {
      }
    });
```

### CatchMayIgnoreException
Empty `catch` block
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
          try {
            dialog.accept();
          } catch (PlaywrightException e) {
          }
        } else {
```

## RuleId[id=Deprecation]
### Deprecation
'com.microsoft.playwright.options.BrowserChannel' is deprecated
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer())
    .registerTypeAdapter(SameSiteAttribute.class, new SameSiteAdapter().nullSafe())
    .registerTypeAdapter(BrowserChannel.class, new ToLowerCaseAndDashSerializer<BrowserChannel>())
    .registerTypeAdapter(ColorScheme.class, new ToLowerCaseAndDashSerializer<ColorScheme>())
    .registerTypeAdapter(Media.class, new ToLowerCaseSerializer<Media>())
```

### Deprecation
'com.microsoft.playwright.options.BrowserChannel' is deprecated
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer())
    .registerTypeAdapter(SameSiteAttribute.class, new SameSiteAdapter().nullSafe())
    .registerTypeAdapter(BrowserChannel.class, new ToLowerCaseAndDashSerializer<BrowserChannel>())
    .registerTypeAdapter(ColorScheme.class, new ToLowerCaseAndDashSerializer<ColorScheme>())
    .registerTypeAdapter(Media.class, new ToLowerCaseSerializer<Media>())
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestContextImpl.java`
#### Snippet
```java
      item.addProperty("name", e.getKey());
      if (filePayload == null) {
        item.addProperty("value", "" + e.getValue());
      } else {
        item.add("file", toProtocol(filePayload));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestContextImpl.java`
#### Snippet
```java
      Map<String, String> queryParams = new LinkedHashMap<>();
      for (Map.Entry<String, ?> e : options.params.entrySet()) {
        queryParams.put(e.getKey(), "" + e.getValue());
      }
      params.add("params", toNameValueArray(queryParams));
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`contentType == null ? false : isTextualMimeType(contentType)` can be simplified to 'contentType!=null \&\& isTextualMimeType(contentType)'
in `playwright/src/main/java/com/microsoft/playwright/impl/APIResponseAssertionsImpl.java`
#### Snippet
```java

    String contentType = actual.headers().get("content-type");
    boolean isTextEncoding = contentType == null ? false : isTextualMimeType(contentType);
    String responseText = "";
    if (isTextEncoding) {
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  final Map<String, BindingCallback> bindings = new HashMap<>();
  PageImpl ownerPage;
  private static final Map<EventType, String> eventSubscriptions() {
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.CONSOLE, "console");
```

### FinalStaticMethod
'static' method declared `final`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private final Router routes = new Router();
  private final Set<FrameImpl> frames = new LinkedHashSet<>();
  private static final Map<EventType, String> eventSubscriptions() {
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.CONSOLE, "console");
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
    }
    @Deprecated
    /**
     * Browser distribution channel.  Supported values are "chrome", "chrome-beta", "chrome-dev", "chrome-canary", "msedge",
     * "msedge-beta", "msedge-dev", "msedge-canary". Read more about using <a
```

### DanglingJavadoc
Dangling Javadoc comment
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
    }
    @Deprecated
    /**
     * Browser distribution channel.  Supported values are "chrome", "chrome-beta", "chrome-dev", "chrome-canary", "msedge",
     * "msedge-beta", "msedge-dev", "msedge-canary". Read more about using <a
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Root` may be 'static'
in `playwright/src/main/java/com/microsoft/playwright/impl/Connection.java`
#### Snippet
```java
  private int tracingCount;

  class Root extends ChannelOwner {
    Root(Connection connection) {
      super(connection, "Root", "");
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
  class GrantPermissionsOptions {
    /**
     * The [origin] to grant permissions to, e.g. "https://example.com".
     */
    public String origin;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * <p> The earliest moment that page is available is when it has navigated to the initial url. For example, when opening a
   * popup with {@code window.open('http://example.com')}, this event will fire when the network request to
   * "http://example.com" is done and its response has started loading in the popup.
   * <pre>{@code
   * Page newPage = context.waitForPage(() -> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * The method adds a function called {@code name} on the {@code window} object of every frame in every page in the context.
   * When called, the function executes {@code callback} and returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a> which
   * resolves to the return value of {@code callback}.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * The method adds a function called {@code name} on the {@code window} object of every frame in every page in the context.
   * When called, the function executes {@code callback} and returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a> which
   * resolves to the return value of {@code callback}. If the {@code callback} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, it will be
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * The method adds a function called {@code name} on the {@code window} object of every frame in every page in the context.
   * When called, the function executes {@code callback} and returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a> which
   * resolves to the return value of {@code callback}. If the {@code callback} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, it will be
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java

    /**
     * The [origin] to grant permissions to, e.g. "https://example.com".
     */
    public GrantPermissionsOptions setOrigin(String origin) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Worker.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Worker#evaluateHandle Worker.evaluateHandle()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Worker#evaluateHandle Worker.evaluateHandle()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Worker.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Worker#evaluate Worker.evaluate()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Worker#evaluate Worker.evaluate()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Worker.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Worker#evaluateHandle Worker.evaluateHandle()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Worker#evaluateHandle Worker.evaluateHandle()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Worker.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Worker#evaluate Worker.evaluate()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Worker#evaluate Worker.evaluate()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, this method
   * will wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/ElementHandle.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * ElementHandle#evalOnSelectorAll ElementHandle.evalOnSelectorAll()} would wait for the promise to resolve and return its
   * value.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/ElementHandle.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * ElementHandle#evalOnSelector ElementHandle.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/ElementHandle.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * ElementHandle#evalOnSelectorAll ElementHandle.evalOnSelectorAll()} would wait for the promise to resolve and return its
   * value.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/ElementHandle.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * ElementHandle#evalOnSelector ElementHandle.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/JSHandle.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@code
   * handle.evaluate} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/JSHandle.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@code
   * handle.evaluate} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/JSHandle.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@code jsHandle.evaluateHandle} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@code
   * jsHandle.evaluateHandle} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/JSHandle.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@code jsHandle.evaluateHandle} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@code
   * jsHandle.evaluateHandle} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Page#evaluate Page.evaluate()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evaluate Page.evaluate()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * The method adds a function called {@code name} on the {@code window} object of every frame in the page. When called, the
   * function executes {@code callback} and returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a> which
   * resolves to the return value of {@code callback}.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Page#evaluateHandle Page.evaluateHandle()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evaluateHandle Page.evaluateHandle()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Page#evaluateHandle Page.evaluateHandle()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evaluateHandle Page.evaluateHandle()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evalOnSelectorAll Page.evalOnSelectorAll()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evalOnSelector Page.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evalOnSelectorAll Page.evalOnSelectorAll()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * The method adds a function called {@code name} on the {@code window} object of every frame in this page. When called,
   * the function executes {@code callback} and returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a> which
   * resolves to the return value of {@code callback}. If the {@code callback} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, it will be
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evalOnSelector Page.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * <p> The earliest moment that page is available is when it has navigated to the initial url. For example, when opening a
   * popup with {@code window.open('http://example.com')}, this event will fire when the network request to
   * "http://example.com" is done and its response has started loading in the popup.
   * <pre>{@code
   * Page popup = page.waitForPopup(() -> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evalOnSelector Page.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * The method adds a function called {@code name} on the {@code window} object of every frame in this page. When called,
   * the function executes {@code callback} and returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a> which
   * resolves to the return value of {@code callback}. If the {@code callback} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, it will be
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Page#evaluate Page.evaluate()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Page#evaluate Page.evaluate()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Frame#evaluate Frame.evaluate()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evaluate Frame.evaluate()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If the function passed to the {@link Frame#evaluate Frame.evaluate()} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evaluate Frame.evaluate()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evalOnSelectorAll Frame.evalOnSelectorAll()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evalOnSelector Frame.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evalOnSelector Frame.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If the function, passed to the {@link Frame#evaluateHandle Frame.evaluateHandle()}, returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evaluateHandle Frame.evaluateHandle()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evalOnSelector Frame.evalOnSelector()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If {@code expression} returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evalOnSelectorAll Frame.evalOnSelectorAll()} would wait for the promise to resolve and return its value.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
   *
   * <p> If the function, passed to the {@link Frame#evaluateHandle Frame.evaluateHandle()}, returns a <a
   * href='https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise'>Promise</a>, then {@link
   * Frame#evaluateHandle Frame.evaluateHandle()} would wait for the promise to resolve and return its value.
   *
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `playwright/src/main/java/com/microsoft/playwright/impl/PlaywrightImpl.java`
#### Snippet
```java
  private final SelectorsImpl selectors;
  private final APIRequestImpl apiRequest;
  private final LocalUtils localUtils;
  private SharedSelectors sharedSelectors;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestContextImpl.java`
#### Snippet
```java

class APIRequestContextImpl extends ChannelOwner implements APIRequestContext {
  private final TracingImpl tracing;

  APIRequestContextImpl(ChannelOwner parent, String type, String guid, JsonObject initializer) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `driver-bundle/src/main/java/com/microsoft/playwright/impl/driver/jar/DriverJar.java`
#### Snippet
```java
            Files.copy(fromPath, toPath);
            if (isExecutable(toPath)) {
              toPath.toFile().setExecutable(true, true);
            }
          }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `playwright/src/main/java/com/microsoft/playwright/impl/JsonPipe.java`
#### Snippet
```java
        }
        checkIfClosed();
        if (Duration.between(start, Instant.now()).compareTo(timeout) > 0) {
          return true;
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'viewportSize'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * operating system. It makes the execution of the tests non-deterministic.
     */
    public Optional<ViewportSize> viewportSize;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reducedMotion'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * defaults. Defaults to {@code "no-preference"}.
     */
    public Optional<ReducedMotion> reducedMotion;
    /**
     * Emulates consistent window screen size available inside web page via {@code window.screen}. Is only used when the {@code
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'forcedColors'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * Defaults to {@code "none"}.
     */
    public Optional<ForcedColors> forcedColors;
    public Geolocation geolocation;
    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'forcedColors'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * Defaults to {@code "none"}.
     */
    public Optional<ForcedColors> forcedColors;
    public Geolocation geolocation;
    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reducedMotion'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * defaults. Defaults to {@code "no-preference"}.
     */
    public Optional<ReducedMotion> reducedMotion;
    /**
     * Emulates consistent window screen size available inside web page via {@code window.screen}. Is only used when the {@code
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'colorScheme'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * emulation to system defaults. Defaults to {@code "light"}.
     */
    public Optional<ColorScheme> colorScheme;
    /**
     * Specify device scale factor (can be thought of as dpr). Defaults to {@code 1}. Learn more about <a
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'colorScheme'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * emulation to system defaults. Defaults to {@code "light"}.
     */
    public Optional<ColorScheme> colorScheme;
    /**
     * Specify device scale factor (can be thought of as dpr). Defaults to {@code 1}. Learn more about <a
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'viewportSize'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * operating system. It makes the execution of the tests non-deterministic.
     */
    public Optional<ViewportSize> viewportSize;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'colorScheme'
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * "no-preference"}. Passing {@code null} disables color scheme emulation.
     */
    public Optional<ColorScheme> colorScheme;
    /**
     * Emulates {@code "forced-colors"} media feature, supported values are {@code "active"} and {@code "none"}. Passing {@code
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reducedMotion'
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * Passing {@code null} disables reduced motion emulation.
     */
    public Optional<ReducedMotion> reducedMotion;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'media'
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * Passing {@code null} disables CSS media emulation.
     */
    public Optional<Media> media;
    /**
     * Emulates {@code "prefers-reduced-motion"} media feature, supported values are {@code "reduce"}, {@code "no-preference"}.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'forcedColors'
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * null} disables forced colors emulation.
     */
    public Optional<ForcedColors> forcedColors;
    /**
     * Changes the CSS media type of the page. The only allowed values are {@code "screen"}, {@code "print"} and {@code null}.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'viewportSize'
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
     * operating system. It makes the execution of the tests non-deterministic.
     */
    public Optional<ViewportSize> viewportSize;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'colorScheme'
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
     * emulation to system defaults. Defaults to {@code "light"}.
     */
    public Optional<ColorScheme> colorScheme;
    /**
     * Specify device scale factor (can be thought of as dpr). Defaults to {@code 1}. Learn more about <a
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'forcedColors'
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
     * Defaults to {@code "none"}.
     */
    public Optional<ForcedColors> forcedColors;
    public Geolocation geolocation;
    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reducedMotion'
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
     * defaults. Defaults to {@code "no-preference"}.
     */
    public Optional<ReducedMotion> reducedMotion;
    /**
     * Emulates consistent window screen size available inside web page via {@code window.screen}. Is only used when the {@code
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
      throw new PlaywrightException("recordVideoSize is set but recordVideoDir is null");
    }
    if (options.viewportSize != null) {
      if (options.viewportSize.isPresent()) {
        JsonElement size = params.get("viewportSize");
```

### OptionalAssignedToNull
Optional value is compared with null
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
      throw new PlaywrightException("recordVideoSize is set but recordVideoDir is null");
    }
    if (options.viewportSize != null) {
      if (options.viewportSize.isPresent()) {
        JsonElement size = params.get("viewportSize");
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'PageImpl' used without 'try'-with-resources statement
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
        listeners.notify(EventType.DIALOG, dialog);
      }
      PageImpl page = dialog.page();
      if (page != null) {
        if (page.listeners.hasListeners(PageImpl.EventType.DIALOG)) {
```

### AutoCloseableResource
'PageImpl' used without 'try'-with-resources statement
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
      ConsoleMessageImpl message = connection.getExistingObject(guid);
      listeners.notify(BrowserContextImpl.EventType.CONSOLE, message);
      PageImpl page = message.page();
      if (page != null) {
        page.listeners.notify(PageImpl.EventType.CONSOLE, message);
```

### AutoCloseableResource
'PageImpl' used without 'try'-with-resources statement
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      }
      JsonObject params = gson().toJsonTree(options).getAsJsonObject();
      addLargeFileUploadParams(files, params, frame.page().context());
      sendMessage("setInputFilePaths", params);
    } else {
```

### AutoCloseableResource
'Page' used without 'try'-with-resources statement
in `playwright/src/main/java/com/microsoft/playwright/impl/BindingCall.java`
#### Snippet
```java
    @Override
    public BrowserContext context() {
      return page().context();
    }

```

### AutoCloseableResource
'PageImpl' used without 'try'-with-resources statement
in `playwright/src/main/java/com/microsoft/playwright/impl/RouteImpl.java`
#### Snippet
```java
      options.timeout = fetchOptions.timeout;
    }
    APIRequestContextImpl apiRequest = request.frame().page().context().request();
    String url = (fetchOptions == null || fetchOptions.url == null) ? request().url() : fetchOptions.url;
    return apiRequest.fetch(url, options);
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `driver-bundle/src/main/java/com/microsoft/playwright/impl/driver/jar/DriverJar.java`
#### Snippet
```java
      // See https://github.com/microsoft/playwright-java/issues/306
      Path srcRootDefaultFs = Paths.get(srcRoot.toString());
      Files.walk(srcRoot).forEach(fromPath -> {
        if (preinstalledNodePath != null) {
          String fileName = fromPath.getFileName().toString();
```

### AutoCloseableResource
'BrowserContextImpl' used without 'try'-with-resources statement
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      browserContext.setDefaultTimeoutImpl(0.0);
      try {
        runUntil(() -> {}, new WaitableRace<>(asList(context().pause(), (Waitable<JsonElement>) waitableClosedOrCrashed)));
      } finally {
        browserContext.setDefaultNavigationTimeoutImpl(defaultNavigationTimeout);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `driver/src/main/java/com/microsoft/playwright/impl/driver/Driver.java`
#### Snippet
```java
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Path;`
in `playwright/src/main/java/com/microsoft/playwright/CLI.java`
#### Snippet
```java

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.options.*;`
in `playwright/src/main/java/com/microsoft/playwright/Keyboard.java`
#### Snippet
```java
package com.microsoft.playwright;

import com.microsoft.playwright.options.*;

/**
```

### UNUSED_IMPORT
Unused import `import com.google.gson.JsonElement;`
in `playwright/src/main/java/com/microsoft/playwright/impl/APIResponseImpl.java`
#### Snippet
```java

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.PlaywrightException;`
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
package com.microsoft.playwright.impl;

import com.microsoft.playwright.PlaywrightException;
import org.opentest4j.AssertionFailedError;
import org.opentest4j.ValueWrapper;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Utils.isSafeCloseError;`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Serialization.addHarUrlFilter;
import static com.microsoft.playwright.impl.Serialization.gson;
import static com.microsoft.playwright.impl.Utils.isSafeCloseError;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.readAllBytes;
```

### UNUSED_IMPORT
Unused import `import java.util.regex.Pattern;`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Pattern;

import static com.microsoft.playwright.impl.Serialization.addHarUrlFilter;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Utils.convertType;`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Serialization.gson;
import static com.microsoft.playwright.impl.Utils.*;
import static com.microsoft.playwright.impl.Utils.convertType;

class BrowserImpl extends ChannelOwner implements Browser {
```

### UNUSED_IMPORT
Unused import `import java.util.function.BinaryOperator;`
in `playwright/src/main/java/com/microsoft/playwright/impl/ChannelOwner.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.Page;`
in `playwright/src/main/java/com/microsoft/playwright/impl/ConsoleMessageImpl.java`
#### Snippet
```java
import com.microsoft.playwright.ConsoleMessage;
import com.microsoft.playwright.JSHandle;
import com.microsoft.playwright.Page;

import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Serialization.gson;`
in `playwright/src/main/java/com/microsoft/playwright/impl/ConsoleMessageImpl.java`
#### Snippet
```java
import java.util.List;

import static com.microsoft.playwright.impl.Serialization.gson;

public class ConsoleMessageImpl extends ChannelOwner implements ConsoleMessage {
```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.Page;`
in `playwright/src/main/java/com/microsoft/playwright/impl/DialogImpl.java`
#### Snippet
```java
import com.google.gson.JsonObject;
import com.microsoft.playwright.Dialog;
import com.microsoft.playwright.Page;

class DialogImpl extends ChannelOwner implements Dialog {
```

### UNUSED_IMPORT
Unused import `import java.io.PrintStream;`
in `playwright/src/main/java/com/microsoft/playwright/impl/DriverException.java`
#### Snippet
```java
import com.microsoft.playwright.PlaywrightException;

import java.io.PrintStream;
import java.io.PrintWriter;

```

### UNUSED_IMPORT
Unused import `import java.io.PrintWriter;`
in `playwright/src/main/java/com/microsoft/playwright/impl/DriverException.java`
#### Snippet
```java

import java.io.PrintStream;
import java.io.PrintWriter;

class DriverException extends PlaywrightException {
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Utils.addLargeFileUploadParams;`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Serialization.*;
import static com.microsoft.playwright.impl.Utils.*;
import static com.microsoft.playwright.impl.Utils.addLargeFileUploadParams;
import static com.microsoft.playwright.options.ScreenshotType.JPEG;
import static com.microsoft.playwright.options.ScreenshotType.PNG;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Serialization.gson;`
in `playwright/src/main/java/com/microsoft/playwright/impl/JsonPipe.java`
#### Snippet
```java
import java.util.function.Consumer;

import static com.microsoft.playwright.impl.Serialization.gson;

class JsonPipe extends ChannelOwner implements Transport {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocalUtils.java`
#### Snippet
```java

import java.nio.file.Path;
import java.util.List;

import static com.microsoft.playwright.impl.Serialization.gson;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Serialization.gson;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocalUtils.java`
#### Snippet
```java
import java.util.List;

import static com.microsoft.playwright.impl.Serialization.gson;

class LocalUtils extends ChannelOwner {
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Field;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
import com.microsoft.playwright.options.*;

import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.LinkedHashMap;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Utils.toJsRegexFlags;`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Serialization.gson;
import static com.microsoft.playwright.impl.Utils.convertType;
import static com.microsoft.playwright.impl.Utils.toJsRegexFlags;

class LocatorImpl implements Locator {
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.playwright.impl.Utils.toHeadersMap;`
in `playwright/src/main/java/com/microsoft/playwright/impl/RequestImpl.java`
#### Snippet
```java

import static com.microsoft.playwright.impl.Serialization.gson;
import static com.microsoft.playwright.impl.Utils.toHeadersMap;
import static java.util.Arrays.asList;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.options.RequestOptions;`
in `playwright/src/main/java/com/microsoft/playwright/impl/RouteImpl.java`
#### Snippet
```java
import com.google.gson.JsonObject;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.RequestOptions;

import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.PlaywrightException;`
in `playwright/src/main/java/com/microsoft/playwright/impl/SelectorsImpl.java`
#### Snippet
```java

import com.google.gson.JsonObject;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.Selectors;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `playwright/src/main/java/com/microsoft/playwright/impl/SelectorsImpl.java`
#### Snippet
```java
import com.microsoft.playwright.Selectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Files;`
in `playwright/src/main/java/com/microsoft/playwright/impl/SelectorsImpl.java`
#### Snippet
```java

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

```

### UNUSED_IMPORT
Unused import `import java.nio.file.Path;`
in `playwright/src/main/java/com/microsoft/playwright/impl/SelectorsImpl.java`
#### Snippet
```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.microsoft.playwright.impl.Serialization.gson;
```

### UNUSED_IMPORT
Unused import `import static java.nio.charset.StandardCharsets.UTF_8;`
in `playwright/src/main/java/com/microsoft/playwright/impl/SelectorsImpl.java`
#### Snippet
```java

import static com.microsoft.playwright.impl.Serialization.gson;
import static java.nio.charset.StandardCharsets.UTF_8;

class SelectorsImpl extends ChannelOwner {
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.ElementHandle;`
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.FilePayload;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.playwright.options.SelectOption;`
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
import com.microsoft.playwright.options.FilePayload;
import com.microsoft.playwright.options.HttpHeader;
import com.microsoft.playwright.options.SelectOption;

import java.io.FileOutputStream;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `playwright/src/main/java/com/microsoft/playwright/impl/Waitable.java`
#### Snippet
```java
package com.microsoft.playwright.impl;

import java.util.function.Function;

interface Waitable<T> {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `HasAttributeOptions` is redundant
in `playwright/src/main/java/com/microsoft/playwright/assertions/LocatorAssertions.java`
#### Snippet
```java
   */
  default void hasAttribute(String name, String value) {
    hasAttribute(name, value, (HasAttributeOptions) null);
  }
  /**
```

### RedundantCast
Casting `null` to `HasAttributeOptions` is redundant
in `playwright/src/main/java/com/microsoft/playwright/assertions/LocatorAssertions.java`
#### Snippet
```java
   */
  default void hasAttribute(String name, Pattern value) {
    hasAttribute(name, value, (HasAttributeOptions) null);
  }
  /**
```

### RedundantCast
Casting `value` to `URL` is redundant
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
        result.d = ((LocalDateTime)value).atZone(ZoneId.systemDefault()).toInstant().toString();
      } else if (value instanceof URL) {
        result.u = ((URL)value).toString();
      } else if (value instanceof Pattern) {
        result.r = new SerializedValue.R();
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * <p> <strong>NOTE:</strong> {@link Page#setDefaultNavigationTimeout Page.setDefaultNavigationTimeout()}, {@link Page#setDefaultTimeout
   * Page.setDefaultTimeout()} and {@link BrowserContext#setDefaultNavigationTimeout
   * BrowserContext.setDefaultNavigationTimeout()} take priority over {@link BrowserContext#setDefaultTimeout
   * BrowserContext.setDefaultTimeout()}.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * overrides a particular header, page-specific header value will be used instead of the browser context header value.
   *
   * <p> <strong>NOTE:</strong> {@link BrowserContext#setExtraHTTPHeaders BrowserContext.setExtraHTTPHeaders()} does not guarantee the order of headers
   * in the outgoing requests.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   * }</pre>
   *
   * <p> <strong>NOTE:</strong> When no {@link Page#onDialog Page.onDialog()} or {@link BrowserContext#onDialog BrowserContext.onDialog()} listeners are
   * present, all dialogs are automatically dismissed.
   */
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   *
   * <p> <strong>NOTE:</strong> {@link Page#setDefaultNavigationTimeout Page.setDefaultNavigationTimeout()} and {@link Page#setDefaultTimeout
   * Page.setDefaultTimeout()} take priority over {@link BrowserContext#setDefaultNavigationTimeout
   * BrowserContext.setDefaultNavigationTimeout()}.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/BrowserContext.java`
#### Snippet
```java
   *
   * <p> <strong>NOTE:</strong> HTTP Error responses, such as 404 or 503, are still successful responses from HTTP standpoint, so request will complete
   * with {@link BrowserContext#onRequestFinished BrowserContext.onRequestFinished()} event and not with {@link
   * BrowserContext#onRequestFailed BrowserContext.onRequestFailed()}.
   */
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
   * <p> <strong>NOTE:</strong> This is similar to force quitting the browser. Therefore, you should call {@link BrowserContext#close
   * BrowserContext.close()} on any {@code BrowserContext}'s you explicitly created earlier with {@link Browser#newContext
   * Browser.newContext()} **before** calling {@link Browser#close Browser.close()}.
   *
   * <p> The {@code Browser} object itself is considered to be disposed and cannot be used anymore.
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
  Locator getByTitle(Pattern text, GetByTitleOptions options);
  /**
   * Highlight the corresponding element(s) on the screen. Useful for debugging, don't commit the code that uses {@link
   * Locator#highlight Locator.highlight()}.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   * When locator points to a list of elements, returns array of locators, pointing to respective elements.
   *
   * <p> <strong>NOTE:</strong> {@link Locator#all Locator.all()} does not wait for elements to match the locator, and instead immediately returns
   * whatever is present in the page.  When the list of elements changes dynamically, {@link Locator#all Locator.all()} will
   * produce unpredictable and flaky results.  When the list of elements is stable, but loaded dynamically, wait for the full
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   *
   * <p> <strong>NOTE:</strong> {@link Locator#all Locator.all()} does not wait for elements to match the locator, and instead immediately returns
   * whatever is present in the page.  When the list of elements changes dynamically, {@link Locator#all Locator.all()} will
   * produce unpredictable and flaky results.  When the list of elements is stable, but loaded dynamically, wait for the full
   * list to finish loading before calling {@link Locator#all Locator.all()}.
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
   * whatever is present in the page.  When the list of elements changes dynamically, {@link Locator#all Locator.all()} will
   * produce unpredictable and flaky results.  When the list of elements is stable, but loaded dynamically, wait for the full
   * list to finish loading before calling {@link Locator#all Locator.all()}.
   *
   * <p> **Usage**
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Keyboard.java`
#### Snippet
```java
   * will be sent with that modifier active. To release the modifier key, use {@link Keyboard#up Keyboard.up()}.
   *
   * <p> After the key is pressed once, subsequent calls to {@link Keyboard#down Keyboard.down()} will have <a
   * href="https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/repeat">repeat</a> set to true. To release the key,
   * use {@link Keyboard#up Keyboard.up()}.
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * <p> See {@link BrowserContext#exposeFunction BrowserContext.exposeFunction()} for context-wide exposed function.
   *
   * <p> <strong>NOTE:</strong> Functions installed via {@link Page#exposeFunction Page.exposeFunction()} survive navigations.
   *
   * <p> **Usage**
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * This setting will change the default maximum time for all the methods accepting {@code timeout} option.
   *
   * <p> <strong>NOTE:</strong> {@link Page#setDefaultNavigationTimeout Page.setDefaultNavigationTimeout()} takes priority over {@link
   * Page#setDefaultTimeout Page.setDefaultTimeout()}.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * </ul>
   *
   * <p> <strong>NOTE:</strong> {@link Page#setDefaultNavigationTimeout Page.setDefaultNavigationTimeout()} takes priority over {@link
   * Page#setDefaultTimeout Page.setDefaultTimeout()}, {@link BrowserContext#setDefaultTimeout
   * BrowserContext.setDefaultTimeout()} and {@link BrowserContext#setDefaultNavigationTimeout
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> <strong>NOTE:</strong> HTTP Error responses, such as 404 or 503, are still successful responses from HTTP standpoint, so request will complete
   * with {@link Page#onRequestFinished Page.onRequestFinished()} event and not with {@link Page#onRequestFailed
   * Page.onRequestFailed()}. A request will only be considered failed when the client cannot get an HTTP response from the
   * server, e.g. due to network error net::ERR_FAILED.
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * Browser#newContext Browser.newContext()} allows to set viewport size (and more) for all pages in the context at once.
   *
   * <p> {@link Page#setViewportSize Page.setViewportSize()} will resize the page. A lot of websites don't expect phones to
   * change size, so you should set the viewport size before navigating to the page. {@link Page#setViewportSize
   * Page.setViewportSize()} will also reset {@code screen} size, use {@link Browser#newContext Browser.newContext()} with
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   *
   * <p> {@link Page#setViewportSize Page.setViewportSize()} will resize the page. A lot of websites don't expect phones to
   * change size, so you should set the viewport size before navigating to the page. {@link Page#setViewportSize
   * Page.setViewportSize()} will also reset {@code screen} size, use {@link Browser#newContext Browser.newContext()} with
   * {@code screen} and {@code viewport} parameters if you need better control of these properties.
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * The extra HTTP headers will be sent with every request the page initiates.
   *
   * <p> <strong>NOTE:</strong> {@link Page#setExtraHTTPHeaders Page.setExtraHTTPHeaders()} does not guarantee the order of headers in the outgoing
   * requests.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
   * }</pre>
   *
   * <p> <strong>NOTE:</strong> When no {@link Page#onDialog Page.onDialog()} or {@link BrowserContext#onDialog BrowserContext.onDialog()} listeners are
   * present, all dialogs are automatically dismissed.
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `listeners` may be 'final'
in `playwright/src/main/java/com/microsoft/playwright/impl/JsonPipe.java`
#### Snippet
```java
class JsonPipe extends ChannelOwner implements Transport {
  private final Queue<JsonObject> incoming = new LinkedList<>();
  private ListenerCollection<EventType> listeners = new ListenerCollection<>();
  private enum EventType { CLOSE }
  private boolean isClosed;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `streams` are updated, but never queried
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
  static void addLargeFileUploadParams(Path[] files, JsonObject params, BrowserContextImpl context) {
    if (context.connection.isRemote) {
      List<WritableStream> streams = new ArrayList<>();
      JsonArray jsonStreams = new JsonArray();
      for (Path path : files) {
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java

  private static void writeIntLE(OutputStream out, int v) throws IOException {
    out.write(v >>> 0 & 255);
    out.write(v >>> 8 & 255);
    out.write(v >>> 16 & 255);
```

### PointlessBitwiseExpression
`ch1 << 0` can be replaced with 'ch1'
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java
      throw new EOFException();
    } else {
      return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0);
    }
  }
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
          }
        } catch (NoSuchFieldException e) {
          continue;
        }
      }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `context` is redundant
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestImpl.java`
#### Snippet
```java

    JsonObject result = playwright.sendMessage("newRequest", params).getAsJsonObject();
    APIRequestContextImpl context = playwright.connection.getExistingObject(result.getAsJsonObject("request").get("guid").getAsString());
    return context;
  }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
    params.addProperty("expression", expression);
    JsonElement json = frame.sendMessage("expect", params);
    FrameExpectResult result = gson().fromJson(json, FrameExpectResult.class);
    return result;
  }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java

  void expectImpl(String expression, ExpectedTextValue textValue, Object expected, String message, FrameExpectOptions options) {
    expectImpl(expression, asList(textValue), expected, message, options);
  }

```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`options.visible == true` can be simplified to 'options.visible'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isVisible(IsVisibleOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean visible = options == null || options.visible == null || options.visible == true;
    String message = "Locator expected to be " + (visible ? "visible" : "hidden");
    expectTrue(visible ? "to.be.visible" : "to.be.hidden", message, frameOptions);
```

### PointlessBooleanExpression
`options.editable == true` can be simplified to 'options.editable'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isEditable(IsEditableOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean editable = options == null || options.editable == null || options.editable == true;
    String message = "Locator expected to be " + (editable ? "editable" : "readonly");
    expectTrue(editable ? "to.be.editable" : "to.be.readonly", message, frameOptions);
```

### PointlessBooleanExpression
`options.enabled == true` can be simplified to 'options.enabled'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isEnabled(IsEnabledOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean enabled = options == null || options.enabled == null || options.enabled == true;
    String message = "Locator expected to be " + (enabled ? "enabled" : "disabled");
    expectTrue(enabled ? "to.be.enabled" : "to.be.disabled", message, frameOptions);
```

### PointlessBooleanExpression
`options.attached == true` can be simplified to 'options.attached'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isAttached(IsAttachedOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean attached = options == null || options.attached == null || options.attached == true;
    String message = "Locator expected to be " + (attached ? "attached" : "detached");
    expectTrue(attached ? "to.be.attached" : "to.be.detached", message, frameOptions);
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java

      @Override
      public boolean equals(Object o) {
        return value == ((HashableValue) o).value;
      }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `expectedText` is always 'null'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  private void expectTrue(String expression, String message, FrameExpectOptions options) {
    List<ExpectedTextValue> expectedText = null;
    expectImpl(expression, expectedText, null, message, options);
  }

```

### ConstantValue
Value `list` is always 'null'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
    commonOptions.expectedValue = serializeArgument(value);
    List<ExpectedTextValue> list = null;
    expectImpl("to.have.property", list, value, "Locator expected to have JavaScript property '" + name + "'", commonOptions);
  }

```

### ConstantValue
Value `expectedText` is always 'null'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
    commonOptions.expectedNumber = (double) count;
    List<ExpectedTextValue> expectedText = null;
    expectImpl("to.have.count", expectedText, count, "Locator expected to have count", commonOptions);
  }

```

### ConstantValue
Value `f` is always 'null'
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
  static <T> T clone(T f) {
    if (f == null) {
      return f;
    }
    return convertType(f, (Class<T>) f.getClass());
```

### ConstantValue
Value `timeout` is always 'null'
in `playwright/src/main/java/com/microsoft/playwright/impl/TimeoutSettings.java`
#### Snippet
```java
    }
    if (parent != null) {
      return parent.timeout(timeout);
    }
    return DEFAULT_TIMEOUT_MS;
```

### ConstantValue
Value `timeout` is always 'null'
in `playwright/src/main/java/com/microsoft/playwright/impl/TimeoutSettings.java`
#### Snippet
```java
    }
    if (parent != null) {
      return parent.navigationTimeout(timeout);
    }
    return DEFAULT_TIMEOUT_MS;
```

