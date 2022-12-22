# playwright-java 
 
# Bad smells
I found 373 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToMethodParameter | 156 | false |
| ReturnNull | 41 | false |
| UNUSED_IMPORT | 27 | false |
| Convert2MethodRef | 22 | false |
| OptionalUsedAsFieldOrParameterType | 16 | false |
| BoundedWildcard | 15 | false |
| MissingDeprecatedAnnotation | 12 | false |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| SystemOutErr | 7 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| DataFlowIssue | 5 | false |
| ConstantValue | 5 | false |
| UnnecessarySemicolon | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| CodeBlock2Expr | 3 | true |
| PointlessBooleanExpression | 3 | true |
| DeprecatedIsStillUsed | 2 | false |
| FinalPrivateMethod | 2 | false |
| CatchMayIgnoreException | 2 | false |
| FinalStaticMethod | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| TrivialStringConcatenation | 2 | false |
| OptionalAssignedToNull | 2 | false |
| RedundantFieldInitialization | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ThreadStartInConstruction | 2 | false |
| MagicConstant | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| IgnoreResultOfCall | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| NestedAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| Java8MapApi | 1 | false |
| UnnecessaryContinue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[ruleID=MagicConstant]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AssertionsTimeout` has only 'static' members, and lacks a 'private' constructor
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsTimeout.java`
#### Snippet
```java
import com.microsoft.playwright.PlaywrightException;

public class AssertionsTimeout {
  static double defaultTimeout = 5_000;

```

### UtilityClassWithoutPrivateConstructor
Class `LocatorUtils` has only 'static' members, and lacks a 'private' constructor
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorUtils.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Utils.toJsRegexFlags;

public class LocatorUtils {
  private static volatile String testIdAttributeName = "data-testid";;

```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Serialization.toJsonArray;

class Utils {
  static <F, T> T convertType(F f, Class<T> t) {
    if (f == null) {
```

### UtilityClassWithoutPrivateConstructor
Class `Serialization` has only 'static' members, and lacks a 'private' constructor
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
import static com.microsoft.playwright.impl.Utils.fromJsRegexFlags;

class Serialization {
  private static final Gson gson = new GsonBuilder().disableHtmlEscaping()
    .registerTypeAdapter(SameSiteAttribute.class, new SameSiteAdapter().nullSafe())
```

### UtilityClassWithoutPrivateConstructor
Class `DriverLogging` has only 'static' members, and lacks a 'private' constructor
in `driver/src/main/java/com/microsoft/playwright/impl/driver/DriverLogging.java`
#### Snippet
```java
import java.time.format.DateTimeFormatter;

class DriverLogging {
  private static final boolean isEnabled;
  static {
```

### UtilityClassWithoutPrivateConstructor
Class `CLI` has only 'static' members, and lacks a 'private' constructor
in `playwright/src/main/java/com/microsoft/playwright/CLI.java`
#### Snippet
```java
 * Use this class to launch playwright cli.
 */
public class CLI {
  public static void main(String[] args) throws IOException, InterruptedException {
    Driver driver = Driver.ensureDriverInstalled(Collections.emptyMap(), false);
```

## RuleId[ruleID=UnnecessarySemicolon]
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
      Predicate<Request> requestPredicate = predicate;
      if (requestPredicate == null) {
        requestPredicate = request -> urlMatcher.test(request.url());;
      }
      return waitForRequestImpl(requestPredicate, options, code);
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

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `path` might be null
in `playwright/src/main/java/com/microsoft/playwright/impl/TracingImpl.java`
#### Snippet
```java
    if (connection.isRemote && json.has("sourceEntries")) {
      JsonArray entries = json.getAsJsonArray("sourceEntries");
      connection.localUtils.zip(path, entries);
    }
  }
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `driver-bundle/src/main/java/com/microsoft/playwright/impl/driver/jar/DriverJar.java`
#### Snippet
```java
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    URI originalUri = classloader.getResource(
      "driver/" + platformDir()).toURI();
    URI uri = maybeExtractNestedJar(originalUri);

```

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

## RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/DownloadImpl.java`
#### Snippet
```java
  @Override
  public Path path() {
    return page.withLogging("Download.path", () -> artifact.pathAfterFinished());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/DownloadImpl.java`
#### Snippet
```java
  @Override
  public String failure() {
    return page.withLogging("Download.failure", () -> artifact.failure());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/DownloadImpl.java`
#### Snippet
```java
  @Override
  public void delete() {
    page.withLogging("Download.delete", () -> artifact.delete());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/DownloadImpl.java`
#### Snippet
```java
  @Override
  public InputStream createReadStream() {
    return page.withLogging("Download.createReadStream", () -> artifact.createReadStream());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/DownloadImpl.java`
#### Snippet
```java
  @Override
  public void cancel() {
    page.withLogging("Download.cancel", () -> artifact.cancel());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
      return ValueWrapper.create(value);
    }
    Collection<String> values = asList((Object[]) value).stream().map(e -> e.toString()).collect(Collectors.toList());
    String stringRepresentation = "[" + String.join(", ", values) + "]";
    return ValueWrapper.create(value, stringRepresentation);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  @Override
  public Frame contentFrame() {
    return withLogging("ElementHandle.contentFrame", () -> contentFrameImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  @Override
  public String textContent() {
    return withLogging("ElementHandle.textContent", () -> textContentImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
  @Override
  public void close() {
    withLogging("Browser.close", () -> closeImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
  @Override
  public byte[] stopTracing() {
    return withLogging("Browser.stopTracing", () -> stopTracingImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  @Override
  public String title() {
    return withLogging("Frame.title", () -> titleImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  @Override
  public ElementHandle frameElement() {
    return withLogging("Frame.frameElement", () -> frameElementImpl());

  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  @Override
  public String content() {
    return withLogging("Frame.content", () -> contentImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  @Override
  public byte[] screenshot(ScreenshotOptions options) {
    return withElement((h, o) -> h.screenshot(o), convertType(options, ElementHandle.ScreenshotOptions.class));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/StackTraceCollector.java`
#### Snippet
```java
      return null;
    }
    List<Path> srcDirs = Arrays.stream(srcRoots.split(File.pathSeparator)).map(p -> Paths.get(p)).collect(Collectors.toList());
    for (Path srcDir: srcDirs) {
      if (!Files.exists(srcDir.toAbsolutePath())) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  @Override
  public PageImpl newPage() {
    return withLogging("BrowserContext.newPage", () -> newPageImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  @Override
  public void close() {
    withLogging("BrowserContext.close", () -> closeImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
    HARRouter harRouter = new HARRouter(connection.localUtils, har, options.notFound);
    onClose(context -> harRouter.dispose());
    route(matcher, route -> harRouter.handle(route), null);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private class WaitableFrameDetach extends WaitableEvent<EventType, Frame> {
    WaitableFrameDetach(Frame frameArg) {
      super(PageImpl.this.listeners, EventType.FRAMEDETACHED, detachedFrame -> frameArg.equals(detachedFrame));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
    HARRouter harRouter = new HARRouter(connection.localUtils, har, options.notFound);
    onClose(context -> harRouter.dispose());
    route(matcher, route -> harRouter.handle(route), null);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  @Override
  public String content() {
    return withLogging("Page.content", () -> mainFrame.contentImpl());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  @Override
  public String title() {
    return withLogging("Page.title", () -> mainFrame.titleImpl());
  }

```

## RuleId[ruleID=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  final Map<String, BindingCallback> bindings = new HashMap<>();
  PageImpl ownerPage;
  private static final Map<EventType, String> eventSubscriptions() {
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.REQUEST, "request");
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
    result.put(EventType.REQUEST, "request");
```

## RuleId[ruleID=CatchMayIgnoreException]
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
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
          try {
            dialog.accept();
          } catch (PlaywrightException e) {
          }
        } else {
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  final Map<String, BindingCallback> bindings = new HashMap<>();
  PageImpl ownerPage;
  private static final Map<EventType, String> eventSubscriptions() {
    Map<EventType, String> result = new HashMap<>();
    result.put(EventType.REQUEST, "request");
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
    result.put(EventType.REQUEST, "request");
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
        while (i + 1 < glob.length() && glob.charAt(i + 1) == '*') {
          starCount++;
          i++;
        }
        boolean afterDeep = i + 1 >= glob.length() || glob.charAt(i + 1) == '/';
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
        if (isDeep) {
          tokens.append("((?:[^/]*(?:\\/|$))*)");
          i++;
        } else {
          tokens.append("([^/]*)");
```

## RuleId[ruleID=TrivialStringConcatenation]
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

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  FrameImpl parentFrame;
  Set<FrameImpl> childFrames = new LinkedHashSet<>();
  private final Set<WaitUntilState> loadStates = new HashSet<>();

  enum InternalEventType { NAVIGATED, LOADSTATE }
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Root` may be 'static'
in `playwright/src/main/java/com/microsoft/playwright/impl/Connection.java`
#### Snippet
```java
  final Map<String, String> env;

  class Root extends ChannelOwner {
    Root(Connection connection) {
      super(connection, "Root", "");
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super EventType`
in `playwright/src/main/java/com/microsoft/playwright/impl/WaitableEvent.java`
#### Snippet
```java
  }

  WaitableEvent(ListenerCollection<EventType> listeners, EventType type, Predicate<T> predicate) {
    this.listeners = listeners;
    this.type = type;
```

### BoundedWildcard
Can generalize to `? super T`
in `playwright/src/main/java/com/microsoft/playwright/impl/WaitableEvent.java`
#### Snippet
```java
  }

  WaitableEvent(ListenerCollection<EventType> listeners, EventType type, Predicate<T> predicate) {
    this.listeners = listeners;
    this.type = type;
```

### BoundedWildcard
Can generalize to `? super String`
in `playwright/src/main/java/com/microsoft/playwright/impl/UrlMatcher.java`
#### Snippet
```java
  }

  private UrlMatcher(Object rawSource, Predicate<String> predicate) {
    this.rawSource = rawSource;
    this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? super Route`
in `playwright/src/main/java/com/microsoft/playwright/impl/Router.java`
#### Snippet
```java
    Integer times;

    RouteInfo(UrlMatcher matcher, Consumer<Route> handler, Integer times) {
      this.matcher = matcher;
      this.handler = handler;
```

### BoundedWildcard
Can generalize to `? extends HttpHeader`
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
  }

  static Map<String, String> toHeadersMap(List<HttpHeader> headers) {
    Map<String, String> map = new LinkedHashMap<>();
    for (HttpHeader header: headers) {
```

### BoundedWildcard
Can generalize to `? extends Waitable`
in `playwright/src/main/java/com/microsoft/playwright/impl/WaitableRace.java`
#### Snippet
```java
  private final Collection<Waitable<T>> waitables;

  WaitableRace(Collection<Waitable<T>> waitables) {
    this.waitables = waitables;
  }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static <T> T deserialize(SerializedValue value, Map<Integer, Object> idToValue) {
    if (value.ref != null) {
      return (T) idToValue.get(value.ref);
```

### BoundedWildcard
Can generalize to `? super ElementHandle`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  }

  private <R, O> R withElement(BiFunction<ElementHandle, O, R> callback, O options) {
    ElementHandleOptions handleOptions = convertType(options, ElementHandleOptions.class);
    // TODO: support deadline based timeout
```

### BoundedWildcard
Can generalize to `? extends Path`
in `playwright/src/main/java/com/microsoft/playwright/impl/StackTraceCollector.java`
#### Snippet
```java
  }

  private StackTraceCollector(List<Path> srcDirs) {
    this.srcDirs = srcDirs;
  }
```

### BoundedWildcard
Can generalize to `? super Logger`
in `playwright/src/main/java/com/microsoft/playwright/impl/WaitForEventLogger.java`
#### Snippet
```java
  private final String apiName;

  WaitForEventLogger(ChannelOwner channelOwner, String apiName, Function<Logger, T> supplier) {
    this.supplier = supplier;
    this.channel = channelOwner;
```

### BoundedWildcard
Can generalize to `? extends T`
in `playwright/src/main/java/com/microsoft/playwright/impl/WaitForEventLogger.java`
#### Snippet
```java
  private final String apiName;

  WaitForEventLogger(ChannelOwner channelOwner, String apiName, Function<Logger, T> supplier) {
    this.supplier = supplier;
    this.channel = channelOwner;
```

### BoundedWildcard
Can generalize to `? super JsonObject`
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java
  }

  ReaderThread(DataInputStream in, BlockingQueue<JsonObject> queue) {
    this.in = in;
    this.queue = queue;
```

### BoundedWildcard
Can generalize to `? super Dialog`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java

  @Override
  public void onceDialog(Consumer<Dialog> handler) {
    onDialog(new Consumer<Dialog>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends Response`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  }

  private Response waitForResponseImpl(Predicate<Response> predicate, WaitForResponseOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForResponseOptions();
```

### BoundedWildcard
Can generalize to `? extends Request`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  }

  private Request waitForRequestImpl(Predicate<Request> predicate, WaitForRequestOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForRequestOptions();
```

## RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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
`Optional` used as type for field 'colorScheme'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * emulation to system defaults. Defaults to {@code "light"}.
     */
    public Optional<ColorScheme> colorScheme;
    /**
     * Specify device scale factor (can be thought of as dpr). Defaults to {@code 1}.
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
`Optional` used as type for field 'viewportSize'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * viewport.
     */
    public Optional<ViewportSize> viewportSize;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'viewportSize'
in `playwright/src/main/java/com/microsoft/playwright/Browser.java`
#### Snippet
```java
     * viewport.
     */
    public Optional<ViewportSize> viewportSize;

    /**
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
     * Specify device scale factor (can be thought of as dpr). Defaults to {@code 1}.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'viewportSize'
in `playwright/src/main/java/com/microsoft/playwright/BrowserType.java`
#### Snippet
```java
     * viewport.
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
     * Specify device scale factor (can be thought of as dpr). Defaults to {@code 1}.
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

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `playwright/src/main/java/com/microsoft/playwright/impl/PlaywrightImpl.java`
#### Snippet
```java
      boolean didClose = driverProcess.waitFor(30, TimeUnit.SECONDS);
      if (!didClose) {
        System.err.println("WARNING: Timed out while waiting for driver process to exit");
      }
    } catch (IOException e) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
        connection.close();
      } catch (IOException e) {
        e.printStackTrace(System.err);
      }
      throw new PlaywrightException("Malformed endpoint. Did you use launchServer method?");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
        connection.close();
      } catch (IOException e) {
        e.printStackTrace(System.err);
      }
    });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `driver-bundle/src/main/java/com/microsoft/playwright/impl/driver/jar/DriverJar.java`
#### Snippet
```java
    }
    if (skip != null && !"0".equals(skip) && !"false".equals(skip)) {
      System.out.println("Skipping browsers download because `PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD` env variable is set");
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `playwright/src/main/java/com/microsoft/playwright/impl/LoggingSupport.java`
#### Snippet
```java
    // This matches log format produced by the server.
    String timestamp = ZonedDateTime.now().format(timestampFormat);
    System.err.println(timestamp + " " + message);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `driver/src/main/java/com/microsoft/playwright/impl/driver/DriverLogging.java`
#### Snippet
```java
    // This matches log format produced by the server.
    String timestamp = ZonedDateTime.now().format(timestampFormat);
    System.err.println(timestamp + " " + message);
  }
}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java
          close();
        } catch (IOException e) {
          e.printStackTrace(System.err);
        }
        throw new PlaywrightException("Failed to read message from driver, pipe closed.", readerThread.exception);
```

## RuleId[ruleID=OptionalAssignedToNull]
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

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
     * and returns immediately.
     */
    public IsVisibleOptions setTimeout(double timeout) {
      this.timeout = timeout;
      return this;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
     * returns immediately.
     */
    public IsHiddenOptions setTimeout(double timeout) {
      this.timeout = timeout;
      return this;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
     * and returns immediately.
     */
    public Double timeout;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Locator.java`
#### Snippet
```java
     * returns immediately.
     */
    public Double timeout;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
     * returns immediately.
     */
    public IsVisibleOptions setTimeout(double timeout) {
      this.timeout = timeout;
      return this;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
     * returns immediately.
     */
    public IsHiddenOptions setTimeout(double timeout) {
      this.timeout = timeout;
      return this;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
     * returns immediately.
     */
    public Double timeout;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Frame.java`
#### Snippet
```java
     * returns immediately.
     */
    public Double timeout;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * returns immediately.
     */
    public IsVisibleOptions setTimeout(double timeout) {
      this.timeout = timeout;
      return this;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * immediately.
     */
    public Double timeout;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * returns immediately.
     */
    public Double timeout;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `playwright/src/main/java/com/microsoft/playwright/Page.java`
#### Snippet
```java
     * immediately.
     */
    public IsHiddenOptions setTimeout(double timeout) {
      this.timeout = timeout;
      return this;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/APIResponseAssertionsImpl.java`
#### Snippet
```java
    String message = "Response status expected to be within [200..299] range, was " + actual.status();
    if (isNot) {
      message = message.replace("expected to", "expected not to");
    }
    List<String> logList = ((APIResponseImpl) actual).fetchLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
    }
    if (expectOptions.isNot) {
      message = message.replace("expected to", "expected not to");
    }
    FrameExpectResult result = actualLocator.expect(expression, expectOptions);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorUtils.java`
#### Snippet
```java

  private static String escapeForRegex(String text) {
    return text.replaceAll("[.*+?^>${}()|\\[\\]\\\\]", "\\\\\\\\$0");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorUtils.java`
#### Snippet
```java
    // However, our attribute selectors do not conform to CSS parsing spec,
    // so we escape them differently.
    return '"' + value.replaceAll("\"", "\\\\\"") + '"' + (exact ? "" : "i");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorUtils.java`
#### Snippet
```java
    String text = (String) param;
    if (exact) {
      return '"' + text.replace("\"", "\\\"") + '"';
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorUtils.java`
#### Snippet
```java

    if (text.contains("\"") || text.contains(">>") || text.startsWith("/")) {
      return "/" + escapeForRegex(text).replaceAll("\\s+", "\\\\s+") + "/" + (caseSensitive ? "" : "i");
    }
    return text;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `driver-bundle/src/main/java/com/microsoft/playwright/impl/driver/jar/DriverJar.java`
#### Snippet
```java
    }
    final String JAR_URL_SEPARATOR = "!/";
    String[] parts = uri.toString().split("!/");
    if (parts.length != 3) {
      return uri;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
      }
      String content = new String(encoded, StandardCharsets.UTF_8);
      content += "//# sourceURL=" + options.path.toString().replace("\n", "");
      jsonOptions.addProperty("content", content);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
      }
      String content = new String(encoded, StandardCharsets.UTF_8);
      content += "/*# sourceURL=" + options.path.toString().replace("\n", "") + "*/";
      jsonOptions.addProperty("content", content);
    }
```

## RuleId[ruleID=UNUSED_IMPORT]
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
Unused import `import static com.microsoft.playwright.impl.Serialization.gson;`
in `playwright/src/main/java/com/microsoft/playwright/impl/ConsoleMessageImpl.java`
#### Snippet
```java
import java.util.List;

import static com.microsoft.playwright.impl.Serialization.gson;

public class ConsoleMessageImpl extends ChannelOwner implements ConsoleMessage {
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

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java
      } catch (IOException e) {
        if (!isInterrupted())
          e.printStackTrace();
        break;
      } catch (InterruptedException e) {
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
      byte[] buf = new byte[8192];
      int length;
      while ((length = inputStream.read(buf)) > 0) {
        out.write(buf, 0, length);
      }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `playwright/src/main/java/com/microsoft/playwright/impl/TracingImpl.java`
#### Snippet
```java
  @Override
  public void startChunk(StartChunkOptions options) {
    withLogging("Tracing.startChunk", () -> {
      startChunkImpl(options);
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `playwright/src/main/java/com/microsoft/playwright/impl/TracingImpl.java`
#### Snippet
```java
  @Override
  public void stopChunk(StopChunkOptions options) {
    withLogging("Tracing.stopChunk", () -> {
      stopChunkImpl(options == null ? null : options.path);
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  @Override
  public void pause() {
    withLogging("BrowserContext.pause", () -> {
      context().pause();
    });
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `playwright/src/main/java/com/microsoft/playwright/impl/RawHeaders.java`
#### Snippet
```java
      String name = h.name.toLowerCase();
      List<String> values = headersMap.get(name);
      if (values == null) {
        values = new ArrayList<>();
        headersMap.put(name, values);
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `playwright/src/main/java/com/microsoft/playwright/impl/Connection.java`
#### Snippet
```java
  private final Root root;
  final boolean isRemote;
  private int lastId = 0;
  private final StackTraceCollector stackTraceCollector;
  private final Map<Integer, WaitableResult<JsonElement>> callbacks = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
    }
    private final Map<HashableValue, Integer> valueToId = new HashMap<>();
    private int lastId = 0;
    private final List<JSHandleImpl> handles = new ArrayList<>();
    private final SerializedValue serializedValue;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/MouseImpl.java`
#### Snippet
```java
  private void downImpl(DownOptions options) {
    if (options == null) {
      options = new DownOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/MouseImpl.java`
#### Snippet
```java
  private void moveImpl(double x, double y, MoveOptions options) {
    if (options == null) {
      options = new MoveOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/MouseImpl.java`
#### Snippet
```java
  private void upImpl(UpOptions options) {
    if (options == null) {
      options = new UpOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/MouseImpl.java`
#### Snippet
```java
  private void clickImpl(double x, double y, ClickOptions options) {
    if (options == null) {
      options = new ClickOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `playwright/src/main/java/com/microsoft/playwright/impl/Stream.java`
#### Snippet
```java
      byte[] buffer = Base64.getDecoder().decode(encoded);
      for (int i = 0; i < buffer.length;) {
        b[off++] = buffer[i++];
      }
      return buffer.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
    }
    if (expectOptions.isNot) {
      message = message.replace("expected to", "expected not to");
    }
    FrameExpectResult result = actualLocator.expect(expression, expectOptions);
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
      ValueWrapper expectedValue = formatValue(expected);
      ValueWrapper actualValue = formatValue(actual);
      message += ": " + expectedValue.getStringRepresentation() + "\nReceived: " + actualValue.getStringRepresentation() + "\n";
      throw new AssertionFailedError(message + log, expectedValue, actualValue);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/AssertionsBase.java`
#### Snippet
```java
  void expectImpl(String expression, List<ExpectedTextValue> expectedText, Object expected, String message, FrameExpectOptions options) {
    if (options == null) {
      options = new FrameExpectOptions();
    }
    options.expectedText = expectedText;
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/TracingImpl.java`
#### Snippet
```java
  private void startImpl(StartOptions options) {
    if (options == null) {
      options = new StartOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/TracingImpl.java`
#### Snippet
```java
  private void startChunkImpl(StartChunkOptions options) {
    if (options == null) {
      options = new StartChunkOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
  private Browser connectImpl(String wsEndpoint, ConnectOptions options) {
    if (options == null) {
      options = new ConnectOptions();
    }
    // We don't use gson() here as the headers map should be serialized to a json object.
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
  private BrowserImpl launchImpl(LaunchOptions options) {
    if (options == null) {
      options = new LaunchOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
  private BrowserContextImpl launchPersistentContextImpl(Path userDataDir, LaunchPersistentContextOptions options) {
    if (options == null) {
      options = new LaunchPersistentContextOptions();
    } else {
      // Make a copy so that we can nullify some fields below.
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
    } else {
      // Make a copy so that we can nullify some fields below.
      options = convertType(options, LaunchPersistentContextOptions.class);
    }
    JsonObject recordHar = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserTypeImpl.java`
#### Snippet
```java
  private Browser connectOverCDPImpl(String endpointURL, ConnectOverCDPOptions options) {
    if (options == null) {
      options = new ConnectOverCDPOptions();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestContextImpl.java`
#### Snippet
```java
  private APIResponse fetchImpl(String url, RequestOptionsImpl options) {
    if (options == null) {
      options = new RequestOptionsImpl();
    }
    JsonObject params = new JsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/WebSocketImpl.java`
#### Snippet
```java
  private WebSocketFrame waitForFrameSentImpl(WaitForFrameSentOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForFrameSentOptions();
    }
    return waitForEventWithTimeout(EventType.FRAMESENT, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/WebSocketImpl.java`
#### Snippet
```java
  private WebSocketFrame waitForFrameReceivedImpl(WaitForFrameReceivedOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForFrameReceivedOptions();
    }
    return waitForEventWithTimeout(EventType.FRAMERECEIVED, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void selectTextImpl(SelectTextOptions options) {
    if (options == null) {
      options = new SelectTextOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void waitForElementStateImpl(ElementState state, WaitForElementStateOptions options) {
    if (options == null) {
      options = new WaitForElementStateOptions();
    }
    if (state == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  public List<String> selectOption(SelectOption[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void scrollIntoViewIfNeededImpl(ScrollIntoViewIfNeededOptions options) {
    if (options == null) {
      options = new ScrollIntoViewIfNeededOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private byte[] screenshotImpl(ScreenshotOptions options) {
    if (options == null) {
      options = new ScreenshotOptions();
    }
    if (options.type == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void dblclickImpl(DblclickOptions options) {
    if (options == null) {
      options = new DblclickOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void uncheckImpl(UncheckOptions options) {
    if (options == null) {
      options = new UncheckOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private ElementHandle waitForSelectorImpl(String selector, WaitForSelectorOptions options) {
    if (options == null) {
      options = new WaitForSelectorOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void pressImpl(String key, PressOptions options) {
    if (options == null) {
      options = new PressOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void tapImpl(TapOptions options) {
    if (options == null) {
      options = new TapOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  public List<String> selectOption(String[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void typeImpl(String text, TypeOptions options) {
    if (options == null) {
      options = new TypeOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void fillImpl(String value, FillOptions options) {
    if (options == null) {
      options = new FillOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
    if (hasLargeFile(files)) {
      if (options == null) {
        options = new SetInputFilesOptions();
      }
      JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void clickImpl(ClickOptions options) {
    if (options == null) {
      options = new ClickOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void hoverImpl(HoverOptions options) {
    if (options == null) {
      options = new HoverOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private void checkImpl(CheckOptions options) {
    if (options == null) {
      options = new CheckOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  private String inputValueImpl(InputValueOptions options) {
    if (options == null) {
      options = new InputValueOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
    checkFilePayloadSize(files);
    if (options == null) {
      options = new SetInputFilesOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
  public List<String> selectOption(ElementHandle[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/APIRequestImpl.java`
#### Snippet
```java
  private APIRequestContextImpl newContextImpl(NewContextOptions options) {
    if (options == null) {
      options = new NewContextOptions();
    }
    if (options.storageStatePath != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/WorkerImpl.java`
#### Snippet
```java
  private Worker waitForCloseImpl(WaitForCloseOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForCloseOptions();
    }
    return waitForEventWithTimeout(EventType.CLOSE, code, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `transport`
in `playwright/src/main/java/com/microsoft/playwright/impl/Connection.java`
#### Snippet
```java
    this.isRemote = isRemote;
    if (isLogging) {
      transport = new TransportLogger(transport);
    }
    this.transport = transport;
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
  private void startTracingImpl(Page page, StartTracingOptions options) {
    if (options == null) {
      options = new StartTracingOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
  private BrowserContextImpl newContextImpl(NewContextOptions options) {
    if (options == null) {
      options = new NewContextOptions();
    } else {
      // Make a copy so that we can nullify some fields below.
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserImpl.java`
#### Snippet
```java
    } else {
      // Make a copy so that we can nullify some fields below.
      options = convertType(options, NewContextOptions.class);
    }
    if (options.storageStatePath != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/RouteImpl.java`
#### Snippet
```java
  private void fulfillImpl(FulfillOptions options) {
    if (options == null) {
      options = new FulfillOptions();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  private void hasCSS(String name, ExpectedTextValue expectedText, Object expectedValue, HasCSSOptions options) {
    if (options == null) {
      options = new HasCSSOptions();
    }
    FrameExpectOptions commonOptions = convertType(options, FrameExpectOptions.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void hasJSProperty(String name, Object value, HasJSPropertyOptions options) {
    if (options == null) {
      options = new HasJSPropertyOptions();
    }
    FrameExpectOptions commonOptions = convertType(options, FrameExpectOptions.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void hasCount(int count, HasCountOptions options) {
    if (options == null) {
      options = new HasCountOptions();
    }
    FrameExpectOptions commonOptions = convertType(options, FrameExpectOptions.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  private void hasAttribute(String name, ExpectedTextValue expectedText, Object expectedValue, HasAttributeOptions options) {
    if (options == null) {
      options = new HasAttributeOptions();
    }
    FrameExpectOptions commonOptions = convertType(options, FrameExpectOptions.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/SelectorsImpl.java`
#### Snippet
```java
  void registerImpl(String name, String script, Selectors.RegisterOptions options) {
    if (options == null) {
      options = new Selectors.RegisterOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageAssertionsImpl.java`
#### Snippet
```java
    ExpectedTextValue expected = new ExpectedTextValue();
    if (actualPage.context().baseUrl != null) {
      url = resolveUrl(actualPage.context().baseUrl, url);
    }
    expected.string = url;
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    if (hasLargeFile(files)) {
      if (options == null) {
        options = new SetInputFilesOptions();
      }
      JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  List<String> selectOptionImpl(String selector, SelectOption[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void uncheckImpl(String selector, UncheckOptions options) {
    if (options == null) {
      options = new UncheckOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  ElementHandle waitForSelectorImpl(String selector, WaitForSelectorOptions options, boolean omitReturnValue) {
    if (options == null) {
      options = new WaitForSelectorOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  boolean isEditableImpl(String selector, IsEditableOptions options) {
    if (options == null) {
      options = new IsEditableOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void typeImpl(String selector, String text, TypeOptions options) {
    if (options == null) {
      options = new TypeOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  Object evalOnSelectorImpl(String selector, String pageFunction, Object arg, EvalOnSelectorOptions options) {
    if (options == null) {
      options = new EvalOnSelectorOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    checkFilePayloadSize(files);
    if (options == null) {
      options = new SetInputFilesOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  String innerTextImpl(String selector, InnerTextOptions options) {
    if (options == null) {
      options = new InnerTextOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void pressImpl(String selector, String key, PressOptions options) {
    if (options == null) {
      options = new PressOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  boolean isDisabledImpl(String selector, IsDisabledOptions options) {
    if (options == null) {
      options = new IsDisabledOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  ElementHandle addScriptTagImpl(AddScriptTagOptions options) {
    if (options == null) {
      options = new AddScriptTagOptions();
    }
    JsonObject jsonOptions = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void setContentImpl(String html, SetContentOptions options) {
    if (options == null) {
      options = new SetContentOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void dblclickImpl(String selector, DblclickOptions options) {
    if (options == null) {
      options = new DblclickOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  private Response waitForNavigationImpl(Logger logger, Runnable code, WaitForNavigationOptions options, UrlMatcher matcher) {
    if (options == null) {
      options = new WaitForNavigationOptions();
    }
    if (options.waitUntil == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `matcher`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    List<Waitable<Response>> waitables = new ArrayList<>();
    if (matcher == null) {
      matcher = UrlMatcher.forOneOf(page.context().baseUrl, options.url);
    }
    logger.log("waiting for navigation " + matcher);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  JSHandle waitForFunctionImpl(String pageFunction, Object arg, WaitForFunctionOptions options) {
    if (options == null) {
      options = new WaitForFunctionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void focusImpl(String selector, FocusOptions options) {
    if (options == null) {
      options = new FocusOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  String innerHTMLImpl(String selector, InnerHTMLOptions options) {
    if (options == null) {
      options = new InnerHTMLOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void fillImpl(String selector, String value, FillOptions options) {
    if (options == null) {
      options = new FillOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void clickImpl(String selector, ClickOptions options) {
    if (options == null) {
      options = new ClickOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  ElementHandle addStyleTagImpl(AddStyleTagOptions options) {
    if (options == null) {
      options = new AddStyleTagOptions();
    }
    JsonObject jsonOptions = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void tapImpl(String selector, TapOptions options) {
    if (options == null) {
      options = new TapOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  boolean isCheckedImpl(String selector, IsCheckedOptions options) {
    if (options == null) {
      options = new IsCheckedOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  ResponseImpl navigateImpl(String url, NavigateOptions options) {
    if (options == null) {
      options = new NavigateOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void checkImpl(String selector, CheckOptions options) {
    if (options == null) {
      options = new CheckOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  boolean isHiddenImpl(String selector, IsHiddenOptions options) {
    if (options == null) {
      options = new IsHiddenOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  List<String> selectOptionImpl(String selector, String[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void dispatchEventImpl(String selector, String type, Object eventInit, DispatchEventOptions options) {
    if (options == null) {
      options = new DispatchEventOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void dragAndDropImpl(String source, String target, DragAndDropOptions options) {
    if (options == null) {
      options = new DragAndDropOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    logger.log("waiting for url " + matcher);
    if (options == null) {
      options = new WaitForURLOptions();
    }
    if (matcher.test(url())) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  void hoverImpl(String selector, HoverOptions options) {
    if (options == null) {
      options = new HoverOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  boolean isEnabledImpl(String selector, IsEnabledOptions options) {
    if (options == null) {
      options = new IsEnabledOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  boolean isVisibleImpl(String selector, IsVisibleOptions options) {
    if (options == null) {
      options = new IsVisibleOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  ElementHandleImpl querySelectorImpl(String selector, QuerySelectorOptions options) {
    if (options == null) {
      options = new QuerySelectorOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  List<String> selectOptionImpl(String selector, ElementHandle[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  String getAttributeImpl(String selector, String name, GetAttributeOptions options) {
    if (options == null) {
      options = new GetAttributeOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  private void waitForLoadStateImpl(WaitUntilState state, WaitForLoadStateOptions options, Logger logger) {
    if (options == null) {
      options = new WaitForLoadStateOptions();
    }
    if (state == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    }
    if (state == null) {
      state = LOAD;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  String textContentImpl(String selector, TextContentOptions options) {
    if (options == null) {
      options = new TextContentOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
  String inputValueImpl(String selector, InputValueOptions options) {
    if (options == null) {
      options = new InputValueOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public boolean isVisible(IsVisibleOptions options) {
    if (options == null) {
      options = new IsVisibleOptions();
    }
    return frame.isVisible(selector, convertType(options, Frame.IsVisibleOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void waitFor(WaitForOptions options) {
    if (options == null) {
      options = new WaitForOptions();
    }
    waitForImpl(options);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public String textContent(TextContentOptions options) {
    if (options == null) {
      options = new TextContentOptions();
    }
    return frame.textContent(selector, convertType(options, Frame.TextContentOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public List<String> selectOption(SelectOption values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    return frame.selectOption(selector, values, convertType(options, Frame.SelectOptionOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void dragTo(Locator target, DragToOptions options) {
    if (options == null) {
      options = new DragToOptions();
    }
    Frame.DragAndDropOptions frameOptions = convertType(options, Frame.DragAndDropOptions.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void focus(FocusOptions options) {
    if (options == null) {
      options = new FocusOptions();
    }
    frame.focus(selector, convertType(options, Frame.FocusOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void setInputFiles(FilePayload[] files, SetInputFilesOptions options) {
    if (options == null) {
      options = new SetInputFilesOptions();
    }
    frame.setInputFiles(selector, files, convertType(options, Frame.SetInputFilesOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void setInputFiles(Path[] files, SetInputFilesOptions options) {
    if (options == null) {
      options = new SetInputFilesOptions();
    }
    frame.setInputFiles(selector, files, convertType(options, Frame.SetInputFilesOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void fill(String value, FillOptions options) {
    if (options == null) {
      options = new FillOptions();
    }
    frame.fill(selector, value, convertType(options, Frame.FillOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public String innerHTML(InnerHTMLOptions options) {
    if (options == null) {
      options = new InnerHTMLOptions();
    }
    return frame.innerHTML(selector, convertType(options, Frame.InnerHTMLOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public String innerText(InnerTextOptions options) {
    if (options == null) {
      options = new InnerTextOptions();
    }
    return frame.innerText(selector, convertType(options, Frame.InnerTextOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void uncheck(UncheckOptions options) {
    if (options == null) {
      options = new UncheckOptions();
    }
    frame.uncheck(selector, convertType(options, Frame.UncheckOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void type(String text, TypeOptions options) {
    if (options == null) {
      options = new TypeOptions();
    }
    frame.type(selector, text, convertType(options, Frame.TypeOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void setInputFiles(Path files, SetInputFilesOptions options) {
    if (options == null) {
      options = new SetInputFilesOptions();
    }
    frame.setInputFiles(selector, files, convertType(options, Frame.SetInputFilesOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public boolean isHidden(IsHiddenOptions options) {
    if (options == null) {
      options = new IsHiddenOptions();
    }
    return frame.isHidden(selector, convertType(options, Frame.IsHiddenOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void setChecked(boolean checked, SetCheckedOptions options) {
    if (options == null) {
      options = new SetCheckedOptions();
    }
    frame.setChecked(selector, checked, convertType(options, Frame.SetCheckedOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public boolean isChecked(IsCheckedOptions options) {
    if (options == null) {
      options = new IsCheckedOptions();
    }
    return frame.isChecked(selector, convertType(options, Frame.IsCheckedOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public List<String> selectOption(SelectOption[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    return frame.selectOption(selector, values, convertType(options, Frame.SelectOptionOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public boolean isEditable(IsEditableOptions options) {
    if (options == null) {
      options = new IsEditableOptions();
    }
    return frame.isEditable(selector, convertType(options, Frame.IsEditableOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  private FrameExpectResult expectImpl(String expression, FrameExpectOptions options) {
    if (options == null) {
      options = new FrameExpectOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void hover(HoverOptions options) {
    if (options == null) {
      options = new HoverOptions();
    }
    frame.hover(selector, convertType(options, Frame.HoverOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void check(CheckOptions options) {
    if (options == null) {
      options = new CheckOptions();
    }
    frame.check(selector, convertType(options, Frame.CheckOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `selector`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
    if (options != null) {
      if (options.hasText != null) {
        selector += " >> internal:has-text=" + escapeForTextSelector(options.hasText, false);
      }
      if (options.has != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `selector`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
        if (locator.frame != frame)
          throw new Error("Inner 'has' locator must belong to the same frame.");
        selector += " >> internal:has=" + gson().toJson(locator.selector);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void click(ClickOptions options) {
    if (options == null) {
      options = new ClickOptions();
    }
    frame.click(selector, convertType(options, Frame.ClickOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public String inputValue(InputValueOptions options) {
    if (options == null) {
      options = new InputValueOptions();
    }
    return frame.inputValue(selector, convertType(options, Frame.InputValueOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public List<String> selectOption(ElementHandle values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    return frame.selectOption(selector, values, convertType(options, Frame.SelectOptionOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public boolean isEnabled(IsEnabledOptions options) {
    if (options == null) {
      options = new IsEnabledOptions();
    }
    return frame.isEnabled(selector, convertType(options, Frame.IsEnabledOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void setInputFiles(FilePayload files, SetInputFilesOptions options) {
    if (options == null) {
      options = new SetInputFilesOptions();
    }
    frame.setInputFiles(selector, files, convertType(options, Frame.SetInputFilesOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public List<String> selectOption(ElementHandle[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    return frame.selectOption(selector, values, convertType(options, Frame.SelectOptionOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void dblclick(DblclickOptions options) {
    if (options == null) {
      options = new DblclickOptions();
    }
    frame.dblclick(selector, convertType(options, Frame.DblclickOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public List<String> selectOption(String values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    return frame.selectOption(selector, values, convertType(options, Frame.SelectOptionOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void dispatchEvent(String type, Object eventInit, DispatchEventOptions options) {
    if (options == null) {
      options = new DispatchEventOptions();
    }
    frame.dispatchEvent(selector, type, eventInit, convertType(options, Frame.DispatchEventOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public List<String> selectOption(String[] values, SelectOptionOptions options) {
    if (options == null) {
      options = new SelectOptionOptions();
    }
    return frame.selectOption(selector, values, convertType(options, Frame.SelectOptionOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  private void blurImpl(BlurOptions options) {
    if (options == null) {
      options = new BlurOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void tap(TapOptions options) {
    if (options == null) {
      options = new TapOptions();
    }
    frame.tap(selector, convertType(options, Frame.TapOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public void press(String key, PressOptions options) {
    if (options == null) {
      options = new PressOptions();
    }
    frame.press(selector, key, convertType(options, Frame.PressOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public boolean isDisabled(IsDisabledOptions options) {
    if (options == null) {
      options = new IsDisabledOptions();
    }
    return frame.isDisabled(selector, convertType(options, Frame.IsDisabledOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public String getAttribute(String name, GetAttributeOptions options) {
    if (options == null) {
      options = new GetAttributeOptions();
    }
    return frame.getAttribute(selector, name, convertType(options, Frame.GetAttributeOptions.class).setStrict(true));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
  public ElementHandle elementHandle(ElementHandleOptions options) {
    if (options == null) {
      options = new ElementHandleOptions();
    }
    Frame.WaitForSelectorOptions frameOptions = convertType(options, Frame.WaitForSelectorOptions.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/KeyboardImpl.java`
#### Snippet
```java
  private void pressImpl(String key, PressOptions options) {
    if (options == null) {
      options = new PressOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/KeyboardImpl.java`
#### Snippet
```java
  private void typeImpl(String text, TypeOptions options) {
    if (options == null) {
      options = new TypeOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `urls`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
    JsonObject params = new JsonObject();
    if (urls == null) {
      urls = new ArrayList<>();
    }
    params.add("urls", gson().toJsonTree(urls));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  private void grantPermissionsImpl(List<String> permissions, GrantPermissionsOptions options) {
    if (options == null) {
      options = new GrantPermissionsOptions();
    }
    if (permissions == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `permissions`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
    }
    if (permissions == null) {
      permissions = new ArrayList<>();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  public void routeFromHAR(Path har, RouteFromHAROptions options) {
    if (options == null) {
      options = new RouteFromHAROptions();
    }
    if (options.update != null && options.update) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/BrowserContextImpl.java`
#### Snippet
```java
  private Page waitForPageImpl(WaitForPageOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForPageOptions();
    }
    return waitForEventWithTimeout(EventType.PAGE, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Response waitForResponseImpl(Predicate<Response> predicate, WaitForResponseOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForResponseOptions();
    }
    return waitForEventWithTimeout(EventType.RESPONSE, code, predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private byte[] screenshotImpl(ScreenshotOptions options) {
    if (options == null) {
      options = new ScreenshotOptions();
    }
    if (options.type == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
    // TODO: enable/disable file chooser interception
    if (options == null) {
      options = new WaitForFileChooserOptions();
    }
    return waitForEventWithTimeout(EventType.FILECHOOSER, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Request waitForRequestImpl(Predicate<Request> predicate, WaitForRequestOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForRequestOptions();
    }
    return waitForEventWithTimeout(EventType.REQUEST, code, predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
    }
    if (options == null) {
      options = new PdfOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Page waitForCloseImpl(WaitForCloseOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForCloseOptions();
    }
    return waitForEventWithTimeout(EventType.CLOSE, code, null, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  Response goBackImpl(GoBackOptions options) {
    if (options == null) {
      options = new GoBackOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Worker waitForWorkerImpl(WaitForWorkerOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForWorkerOptions();
    }
    return waitForEventWithTimeout(EventType.WORKER, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Request waitForRequestFinishedImpl(WaitForRequestFinishedOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForRequestFinishedOptions();
    }
    return waitForEventWithTimeout(EventType.REQUESTFINISHED, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  public void routeFromHAR(Path har, RouteFromHAROptions options) {
    if (options == null) {
      options = new RouteFromHAROptions();
    }
    if (options.update != null && options.update) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private WebSocket waitForWebSocketImpl(WaitForWebSocketOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForWebSocketOptions();
    }
    return waitForEventWithTimeout(EventType.WEBSOCKET, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private void emulateMediaImpl(EmulateMediaOptions options) {
    if (options == null) {
      options = new EmulateMediaOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Download waitForDownloadImpl(WaitForDownloadOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForDownloadOptions();
    }
    return waitForEventWithTimeout(EventType.DOWNLOAD, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private ConsoleMessage waitForConsoleMessageImpl(WaitForConsoleMessageOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForConsoleMessageOptions();
    }
    return waitForEventWithTimeout(EventType.CONSOLE, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Page waitForPopupImpl(WaitForPopupOptions options, Runnable code) {
    if (options == null) {
      options = new WaitForPopupOptions();
    }
    return waitForEventWithTimeout(EventType.POPUP, code, options.predicate, options.timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  Response goForwardImpl(GoForwardOptions options) {
    if (options == null) {
      options = new GoForwardOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  private Response reloadImpl(ReloadOptions options) {
    if (options == null) {
      options = new ReloadOptions();
    }
    JsonObject params = gson().toJsonTree(options).getAsJsonObject();
```

## RuleId[ruleID=PointlessBitwiseExpression]
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

## RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `TimeoutError` does not end with 'Exception'
in `playwright/src/main/java/com/microsoft/playwright/TimeoutError.java`
#### Snippet
```java
 * Page.waitForSelector()} or {@link BrowserType#launch BrowserType.launch()}.
 */
public class TimeoutError extends PlaywrightException {
  public TimeoutError(String message) {
    super(message);
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-12-22-09-22-04.028.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ArtifactImpl.java`
#### Snippet
```java
      return result.get("error").getAsString();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ArtifactImpl.java`
#### Snippet
```java
    JsonObject result = sendMessage("stream").getAsJsonObject();
    if (!result.has("stream")) {
      return null;
    }
    Stream stream = connection.getExistingObject(result.getAsJsonObject("stream").get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/RawHeaders.java`
#### Snippet
```java
    List<String> values = getAll(name);
    if (values == null) {
      return null;
    }
    return String.join("set-cookie".equals(name.toLowerCase()) ? "\n" : ", ", values);
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/JSHandleImpl.java`
#### Snippet
```java
  @Override
  public ElementHandle asElement() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/LoggingSupport.java`
#### Snippet
```java
    withLogging(apiName, () -> {
      code.run();
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
    JsonObject json = sendMessage("contentFrame").getAsJsonObject();
    if (!json.has("frame")) {
      return null;
    }
    return connection.getExistingObject(json.getAsJsonObject("frame").get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      JsonObject json = sendMessage("boundingBox").getAsJsonObject();
      if (!json.has("value")) {
        return null;
      }
      return gson().fromJson(json.get("value"), BoundingBox.class);
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      JsonObject json = sendMessage("ownerFrame").getAsJsonObject();
      if (!json.has("frame")) {
        return null;
      }
      return connection.getExistingObject(json.getAsJsonObject("frame").get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
    JsonObject element = json.getAsJsonObject().getAsJsonObject("element");
    if (element == null) {
      return null;
    }
    return connection.getExistingObject(element.get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      JsonObject element = json.getAsJsonObject().getAsJsonObject("element");
      if (element == null) {
        return null;
      }
      return connection.getExistingObject(element.get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      params.addProperty("name", name);
      JsonObject json = sendMessage("getAttribute", params).getAsJsonObject();
      return json.has("value") ? json.get("value").getAsString() : null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
      JsonArray elements = json.getAsJsonObject().getAsJsonArray("elements");
      if (elements == null) {
        return null;
      }
      List<ElementHandle> handles = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ElementHandleImpl.java`
#### Snippet
```java
    return withLogging("ElementHandle.textContent", () -> {
      JsonObject json = sendMessage("textContent").getAsJsonObject();
      return json.has("value") ? json.get("value").getAsString() : null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
  static <F, T> T convertType(F f, Class<T> t) {
    if (f == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/RequestImpl.java`
#### Snippet
```java
      JsonObject result = sendMessage("response").getAsJsonObject();
      if (!result.has("response")) {
        return null;
      }
      return connection.getExistingObject(result.getAsJsonObject("response").get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/RequestImpl.java`
#### Snippet
```java
    byte[] buffer = postDataBuffer();
    if (buffer == null) {
      return null;
    }
    return new String(buffer, StandardCharsets.UTF_8);
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  private static Boolean shouldIgnoreCase(Object options) {
    if (options == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
      return (Boolean) value;
    } catch (NoSuchFieldException | IllegalAccessException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
        case "undefined":
        case "null":
          return null;
        case "Infinity":
          return (T) Double.valueOf(Double.POSITIVE_INFINITY);
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java

      if (request == null) {
        return null;
      }
      return request.finalRequest().response();
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    withWaitLogging("Frame.waitForURL", logger -> {
      waitForURLImpl(logger, matcher, options);
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    JsonObject jsonResponse = result.getAsJsonObject().getAsJsonObject("response");
    if (jsonResponse == null) {
      return null;
    }
    return connection.getExistingObject(jsonResponse.get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    JsonArray elements = json.getAsJsonObject().getAsJsonArray("elements");
    if (elements == null) {
      return null;
    }
    List<ElementHandle> handles = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    JsonObject element = json.getAsJsonObject().getAsJsonObject("element");
    if (element == null) {
      return null;
    }
    return connection.getExistingObject(element.get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    withWaitLogging("Frame.waitForLoadState", logger -> {
      waitForLoadStateImpl(state, options, logger);
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
    JsonObject element = json.getAsJsonObject().getAsJsonObject("element");
    if (element == null) {
      return null;
    }
    return connection.getExistingObject(element.get("guid").getAsString());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/FrameImpl.java`
#### Snippet
```java
      return json.get("value").getAsString();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
    withElement((h, o) -> {
      h.selectText(o);
      return null;
    }, convertType(options, ElementHandle.SelectTextOptions.class));
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorImpl.java`
#### Snippet
```java
    withElement((h, o) -> {
      h.scrollIntoViewIfNeeded(o);
      return null;
    }, convertType(options, ElementHandle.ScrollIntoViewIfNeededOptions.class));
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/StackTraceCollector.java`
#### Snippet
```java
    }
    if (srcRoots == null) {
      return null;
    }
    List<Path> srcDirs = Arrays.stream(srcRoots.split(File.pathSeparator)).map(p -> Paths.get(p)).collect(Collectors.toList());
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ResponseImpl.java`
#### Snippet
```java
        return gson().fromJson(json.get("value"), ServerAddr.class);
      }
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/ResponseImpl.java`
#### Snippet
```java
        return gson().fromJson(json.get("value"), SecurityDetails.class);
      }
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
  public PageImpl opener() {
    if (opener == null || opener.isClosed()) {
      return null;
    }
    return opener;
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
    // too late during launchPersistentContext.
    if (browserContext.videosDir == null) {
      return null;
    }
    return forceVideo();
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      return connection.getExistingObject(json.getAsJsonObject("response").get("guid").getAsString());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
    withWaitLogging("Page.waitForURL", logger -> {
      mainFrame.waitForURLImpl(logger, matcher, convertType(options, Frame.WaitForURLOptions.class));
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
    withWaitLogging("Page.waitForLoadState", logger -> {
      mainFrame.waitForLoadStateImpl(state, convertType(options, Frame.WaitForLoadStateOptions.class), logger);
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      return connection.getExistingObject(json.getAsJsonObject("response").get("guid").getAsString());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `playwright/src/main/java/com/microsoft/playwright/impl/PageImpl.java`
#### Snippet
```java
      return connection.getExistingObject(json.getAsJsonObject("response").get("guid").getAsString());
    }
    return null;
  }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java

  static String createGuid() {
    StringBuffer result = new StringBuffer();
    Random random = new Random();
    for (int i = 0; i < 4; i++) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `playwright/src/main/java/com/microsoft/playwright/impl/Utils.java`
#### Snippet
```java
      payloads.add(toFilePayload(file));
    }
    return payloads.toArray(new FilePayload[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
              list.add(serializeValue(o));
            }
            result.a = list.toArray(new SerializedValue[0]);
          } else if (value instanceof Map) {
            List<SerializedValue.O> list = new ArrayList<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
              list.add(o);
            }
            result.o = list.toArray(new SerializedValue.O[0]);
          } else if (value instanceof Object[]) {
            List<SerializedValue> list = new ArrayList<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `playwright/src/main/java/com/microsoft/playwright/impl/Serialization.java`
#### Snippet
```java
              list.add(serializeValue(o));
            }
            result.a = list.toArray(new SerializedValue[0]);
          } else {
            throw new PlaywrightException("Unsupported type of argument: " + value);
```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`options.visible == true` can be simplified to 'options.visible'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isVisible(IsVisibleOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean visible = options == null || options.visible == null || options.visible == true;
    expectTrue(visible ? "to.be.visible" : "to.be.hidden", "Locator expected to be visible", frameOptions);
  }
```

### PointlessBooleanExpression
`options.enabled == true` can be simplified to 'options.enabled'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isEnabled(IsEnabledOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean enabled = options == null || options.enabled == null || options.enabled == true;
    expectTrue(enabled ? "to.be.enabled" : "to.be.disabled", "Locator expected to be enabled", frameOptions);
  }
```

### PointlessBooleanExpression
`options.editable == true` can be simplified to 'options.editable'
in `playwright/src/main/java/com/microsoft/playwright/impl/LocatorAssertionsImpl.java`
#### Snippet
```java
  public void isEditable(IsEditableOptions options) {
    FrameExpectOptions frameOptions = convertType(options, FrameExpectOptions.class);
    boolean editable = options == null || options.editable == null || options.editable == true;
    expectTrue(editable ? "to.be.editable" : "to.be.readonly", "Locator expected to be editable", frameOptions);
  }
```

## RuleId[ruleID=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java
    DataInputStream in = new DataInputStream(new BufferedInputStream(input));
    readerThread = new ReaderThread(in, incoming);
    readerThread.start();
    writerThread = new WriterThread(output, outgoing);
    writerThread.start();
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `playwright/src/main/java/com/microsoft/playwright/impl/PipeTransport.java`
#### Snippet
```java
    readerThread.start();
    writerThread = new WriterThread(output, outgoing);
    writerThread.start();
  }

```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
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

## RuleId[ruleID=ConstantValue]
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
    commonOptions.expectedNumber = count;
    List<ExpectedTextValue> expectedText = null;
    expectImpl("to.have.count", expectedText, count, "Locator expected to have count", commonOptions);
  }

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

