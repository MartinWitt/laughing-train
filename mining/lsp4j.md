# lsp4j 
 
# Bad smells
I found 206 bad smells with 35 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 53 | false |
| BoundedWildcard | 33 | false |
| UnnecessaryModifier | 18 | true |
| EmptyMethod | 14 | false |
| Convert2MethodRef | 7 | false |
| ProtectedMemberInFinalClass | 7 | true |
| SizeReplaceableByIsEmpty | 7 | true |
| DynamicRegexReplaceableByCompiledPattern | 7 | false |
| MissortedModifiers | 5 | false |
| UNUSED_IMPORT | 5 | false |
| RedundantFieldInitialization | 5 | false |
| AssignmentToMethodParameter | 5 | false |
| FieldMayBeStatic | 4 | false |
| UnnecessarySemicolon | 4 | false |
| ZeroLengthArrayInitialization | 3 | false |
| DataFlowIssue | 2 | false |
| AnonymousHasLambdaAlternative | 2 | false |
| UnnecessaryBoxing | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WhileCanBeForeach | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| ComparatorCombinators | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| ImplicitArrayToString | 1 | false |
| CodeBlock2Expr | 1 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| NonFinalFieldOfException | 1 | false |
| UnusedAssignment | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompletableFuture\[futures.size()\]'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/GenericEndpoint.java`
#### Snippet
```java
		}
		if (!futures.isEmpty()) {
			return CompletableFuture.anyOf(futures.toArray(new CompletableFuture[futures.size()]));
		}
		
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	
	public static String JSONRPC_VERSION = "2.0";
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	
	public static String JSONRPC_VERSION = "2.0";
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
	public static String CRLF = "\r\n";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
	public static String CRLF = "\r\n";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	public static String JSONRPC_VERSION = "2.0";
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
	public static String CRLF = "\r\n";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	public static String JSONRPC_VERSION = "2.0";
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
	public static String CRLF = "\r\n";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
	public static String CRLF = "\r\n";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
	public static String JSON_MIME_TYPE = "application/json";
	public static String CRLF = "\r\n";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
public interface MessageConstants {
	
	public static String JSONRPC_VERSION = "2.0";
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageConstants.java`
#### Snippet
```java
public interface MessageConstants {
	
	public static String JSONRPC_VERSION = "2.0";
	public static String CONTENT_LENGTH_HEADER = "Content-Length";
	public static String CONTENT_TYPE_HEADER = "Content-Type";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/services/IDebugProtocolClient.java`
#### Snippet
```java
	 * Version of Debug Protocol
	 */
	public static final String SCHEMA_VERSION = "1.58.0";

	/**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/services/IDebugProtocolClient.java`
#### Snippet
```java
	 * Version of Debug Protocol
	 */
	public static final String SCHEMA_VERSION = "1.58.0";

	/**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/services/IDebugProtocolClient.java`
#### Snippet
```java
	 * Version of Debug Protocol
	 */
	public static final String SCHEMA_VERSION = "1.58.0";

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/services/IDebugProtocolServer.java`
#### Snippet
```java
	 * Version of Debug Protocol
	 */
	public static final String SCHEMA_VERSION = "1.58.0";

	/**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/services/IDebugProtocolServer.java`
#### Snippet
```java
	 * Version of Debug Protocol
	 */
	public static final String SCHEMA_VERSION = "1.58.0";

	/**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/services/IDebugProtocolServer.java`
#### Snippet
```java
	 * Version of Debug Protocol
	 */
	public static final String SCHEMA_VERSION = "1.58.0";

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param <T> remote service interface type
	 */
	public static class Builder<T> {
		
		protected Collection<Object> localServices;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param <T> remote service interface type
	 */
	public static class Builder<T> {
		
		protected Collection<Object> localServices;
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `newLineString` may be 'static'
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		private final String indentationString = "  ";

		private final String newLineString = "\n";

		private int indentation = 0;
```

### FieldMayBeStatic
Field `indentationString` may be 'static'
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		private final StringBuilder builder = new StringBuilder();

		private final String indentationString = "  ";

		private final String newLineString = "\n";
```

### FieldMayBeStatic
Field `newLineString` may be 'static'
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		private final String indentationString = "  ";

		private final String newLineString = "\n";

		private int indentation = 0;
```

### FieldMayBeStatic
Field `indentationString` may be 'static'
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		private final StringBuilder builder = new StringBuilder();

		private final String indentationString = "  ";

		private final String newLineString = "\n";
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Casting `result.get()` to `Void` will produce `ClassCastException` for any non-null value
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/ConcurrentMessageProcessor.java`
#### Snippet
```java
			@Override
			public Void get() throws InterruptedException, ExecutionException {
				return (Void) result.get();
			}

```

### DataFlowIssue
Casting `result.get(...)` to `Void` will produce `ClassCastException` for any non-null value
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/ConcurrentMessageProcessor.java`
#### Snippet
```java
			public Void get(long timeout, TimeUnit unit)
					throws InterruptedException, ExecutionException, TimeoutException {
				return (Void) result.get(timeout, unit);
			}

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/WorkDoneProgressKind.java`
#### Snippet
```java

public enum WorkDoneProgressKind {
	begin, report, end;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/JsonElementTypeAdapter.java`
#### Snippet
```java
			adapter.write(out, (JsonElement) value);
		} else {
			gson.toJson(value, value.getClass(), out);;
		}
	}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/ServiceEndpoints.java`
#### Snippet
```java
			if (result.put(methodInfo.name, meth) != null) {
				throw new IllegalStateException("Duplicate RPC method "+methodInfo.name+".");
			};
		});
		
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/ServiceEndpoints.java`
#### Snippet
```java
				if (result.put(meth.getMethodName(), meth) != null) {
					throw new IllegalStateException("Duplicate RPC method "+meth.getMethodName()+".");
				};
			}
		});
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
			int index = 0;
			Iterator<JsonElement> iterator = array.iterator();
			while (iterator.hasNext()) {
				Type parameterType = index < parameterTypes.length ? parameterTypes[index] : null;  
				Object parameter = fromJson(iterator.next(), parameterType);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'initialized' is still used
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/LanguageServer.java`
#### Snippet
```java
	 */
	@Deprecated
	default void initialized() {
	}

```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/MessageIssueException.java`
#### Snippet
```java
	@Override
	public String getMessage() {
		return issues.stream().map(issue -> issue.getText()).collect(Collectors.joining("\n"));
	}
	
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageJsonHandler.java`
#### Snippet
```java
		if (toStringInstance == null) {
			toStringInstance = new MessageJsonHandler(Collections.emptyMap(), gsonBuilder -> {
				gsonBuilder.setPrettyPrinting();
			});
		}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java

	protected static Type[] getParameterTypes(Method method) {
		return Arrays.stream(method.getParameters()).map(t -> t.getParameterizedType()).toArray(Type[]::new);
	}
	
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
			} catch (Exception e) {
				if (SortedSet.class.isAssignableFrom(rawType))
					return () -> new TreeSet<E>();
				else if (Set.class.isAssignableFrom(rawType))
					return () -> new LinkedHashSet<E>();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
					return () -> new TreeSet<E>();
				else if (Set.class.isAssignableFrom(rawType))
					return () -> new LinkedHashSet<E>();
				else if (Queue.class.isAssignableFrom(rawType))
					return () -> new LinkedList<E>();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
					return () -> new LinkedHashSet<E>();
				else if (Queue.class.isAssignableFrom(rawType))
					return () -> new LinkedList<E>();
				else
					return () -> new ArrayList<E>();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
					return () -> new LinkedList<E>();
				else
					return () -> new ArrayList<E>();
			}
		}
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/validation/ReflectiveMessageValidator.java`
#### Snippet
```java
		if (!issues.isEmpty()) {
			// Sort the messages in order to get a stable order (otherwise it depends on the JVM's reflection implementation)
			Collections.sort(issues, (issue1, issue2) -> issue1.getText().compareTo(issue2.getText()));
			throw new MessageIssueException(message, issues);
		} else if (delegate != null) {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
					break;
				}
				case "event": {
					method = in.nextString();
					break;
				}
				case "message": {
					if (in.peek() == JsonToken.NULL) {
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'responseError' in a Serializable class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/ResponseErrorException.java`
#### Snippet
```java

	private static final long serialVersionUID = -5970739895395246885L;
	private ResponseError responseError;

	public ResponseErrorException(ResponseError responseError) {
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/EndpointProxy.java`
#### Snippet
```java
				try {
					return this.equals(Proxy.getInvocationHandler(args[0]));
				} catch (IllegalArgumentException exception) {
				}
			}
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}
	
	protected static String getMethodName(Method method, boolean useSegment, String segment, String value) {
		String name = value != null && value.length() > 0 ? value : method.getName();
		return useSegment ? segment + name : name;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}
	
	protected static MethodInfo createMethodInfo(Method method, boolean useSegment, String segment, String value) {
		method.setAccessible(true);

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}

	protected static Type[] getParameterTypes(Method method) {
		return Arrays.stream(method.getParameters()).map(t -> t.getParameterizedType()).toArray(Type[]::new);
	}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}

	protected static MethodInfo createNotificationInfo(Method method, String segment, JsonNotification jsonNotification) {
		MethodInfo methodInfo = createMethodInfo(method, jsonNotification.useSegment(), segment, jsonNotification.value());
		methodInfo.isNotification = true;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}
	
	protected static MethodInfo createRequestInfo(Method method, String segment, JsonRequest jsonRequest) {
		return createMethodInfo(method, jsonRequest.useSegment(), segment, jsonRequest.value());
	}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}

	protected static String getSegment(Class<?> clazz) {
		JsonSegment jsonSegment = clazz.getAnnotation(JsonSegment.class);
		return jsonSegment == null ? "" : jsonSegment.value() + "/";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	}
	
	protected static MethodInfo createMethodInfo(Method method, String segment) {
		if (!method.isSynthetic()) {
			JsonRequest jsonRequest = method.getAnnotation(JsonRequest.class);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	
	protected static String getMethodName(Method method, boolean useSegment, String segment, String value) {
		String name = value != null && value.length() > 0 ? value : method.getName();
		return useSegment ? segment + name : name;
	}
```

### SizeReplaceableByIsEmpty
`rawParams.getAsJsonArray().size() == 0` can be replaced with 'rawParams.getAsJsonArray().isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		}
		if (method != null && parameterTypes.length == 0 && (
				rawParams.isJsonArray() && rawParams.getAsJsonArray().size() == 0
				|| rawParams.isJsonObject() && rawParams.getAsJsonObject().size() == 0)) {
			return null;
```

### SizeReplaceableByIsEmpty
`rawParams.getAsJsonObject().size() == 0` can be replaced with 'rawParams.getAsJsonObject().isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		if (method != null && parameterTypes.length == 0 && (
				rawParams.isJsonArray() && rawParams.getAsJsonArray().size() == 0
				|| rawParams.isJsonObject() && rawParams.getAsJsonObject().size() == 0)) {
			return null;
		}
```

### SizeReplaceableByIsEmpty
`rawParams.getAsJsonArray().size() == 0` can be replaced with 'rawParams.getAsJsonArray().isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		JsonElement rawParams = JsonParser.parseReader(in);
		if (method != null && parameterTypes.length == 0 && (
				rawParams.isJsonArray() && rawParams.getAsJsonArray().size() == 0
				|| rawParams.isJsonObject() && rawParams.getAsJsonObject().size() == 0)) {
			return null;
```

### SizeReplaceableByIsEmpty
`rawParams.getAsJsonObject().size() == 0` can be replaced with 'rawParams.getAsJsonObject().isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		if (method != null && parameterTypes.length == 0 && (
				rawParams.isJsonArray() && rawParams.getAsJsonArray().size() == 0
				|| rawParams.isJsonObject() && rawParams.getAsJsonObject().size() == 0)) {
			return null;
		}
```

### SizeReplaceableByIsEmpty
`builder.length() != 0` can be replaced with '!builder.isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapter.java`
#### Snippet
```java
			StringBuilder builder = new StringBuilder();
			for (JsonToken expectedToken : expectedTokens) {
				if (builder.length() != 0) {
					builder.append(" | ");
				}
```

### SizeReplaceableByIsEmpty
`array.size() == 0` can be replaced with 'array.isEmpty()'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapter.java`
#### Snippet
```java
			if (t.isJsonArray()) {
				JsonArray array = t.getAsJsonArray();
				if (array.size() == 0)
					return resultIfEmpty;
				for (JsonElement e : array) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
				if (!(method.getParameterCount() == 0 && method.getReturnType().isInterface())) {
					throw new IllegalStateException(
							"The method " + method.toString() + " is not a proper @JsonDelegate method.");
				}
				return true;
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapter.java`
#### Snippet
```java
			this.adapter = (adapter != null) ? adapter :
				((type == Object.class) ? (TypeAdapter<T>) new JsonElementTypeAdapter(gson) : gson.getAdapter(this.typeToken));
			this.expectedTokens = new HashSet<>();
			for (Type expectedType : TypeUtils.getExpectedTypes(type)) {
				Class<?> rawType = TypeToken.get(expectedType).getRawType();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends JsonRpcMethod`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageJsonHandler.java`
#### Snippet
```java
	 * @param configureGson - a function that contributes to the GsonBuilder created by {@link #getDefaultGsonBuilder()}
	 */
	public MessageJsonHandler(Map<String, JsonRpcMethod> supportedMethods, Consumer<GsonBuilder> configureGson) {
		this.supportedMethods = supportedMethods;
		GsonBuilder gsonBuilder = getDefaultGsonBuilder();
```

### BoundedWildcard
Can generalize to `? extends JsonRpcMethod`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageJsonHandler.java`
#### Snippet
```java
	 * @param supportedMethods - a map used to resolve RPC methods in {@link #getJsonRpcMethod(String)}
	 */
	public MessageJsonHandler(Map<String, JsonRpcMethod> supportedMethods) {
		this.supportedMethods = supportedMethods;
		this.gson = getDefaultGsonBuilder().create();
```

### BoundedWildcard
Can generalize to `? super Class`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	private AnnotationUtil() {}
	
	public static void findDelegateSegments(Class<?> clazz, Set<Class<?>> visited, Consumer<Method> acceptor) {
		if (clazz == null || !visited.add(clazz))
			return;
```

### BoundedWildcard
Can generalize to `? super Method`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	private AnnotationUtil() {}
	
	public static void findDelegateSegments(Class<?> clazz, Set<Class<?>> visited, Consumer<Method> acceptor) {
		if (clazz == null || !visited.add(clazz))
			return;
```

### BoundedWildcard
Can generalize to `? super Class`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	 * Depth first search for annotated methods in hierarchy.
	 */
	public static void findRpcMethods(Class<?> clazz, Set<Class<?>> visited, Consumer<MethodInfo> acceptor) {
		if (clazz == null || !visited.add(clazz))
			return;
```

### BoundedWildcard
Can generalize to `? super MethodInfo`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	 * Depth first search for annotated methods in hierarchy.
	 */
	public static void findRpcMethods(Class<?> clazz, Set<Class<?>> visited, Consumer<MethodInfo> acceptor) {
		if (clazz == null || !visited.add(clazz))
			return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/DebugLauncher.java`
#### Snippet
```java
	 *            - a function for Gson configuration
	 */
	public static <T> Launcher<T> createIoLauncher(Object localService, Class<T> remoteInterface, InputStream in,
			OutputStream out, ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper,
			Consumer<GsonBuilder> configureGson) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/DebugLauncher.java`
#### Snippet
```java
	 *            {@code null} to disable tracing
	 */
	public static <T> Launcher<T> createLauncher(Object localService, Class<T> remoteInterface, InputStream in,
			OutputStream out, boolean validate, PrintWriter trace) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/DebugLauncher.java`
#### Snippet
```java
	 *            - outputstream to send outgoing messages
	 */
	public static <T> Launcher<T> createLauncher(Object localService, Class<T> remoteInterface, InputStream in,
			OutputStream out) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/DebugLauncher.java`
#### Snippet
```java
	 *            - a function for plugging in additional message consumers
	 */
	public static <T> Launcher<T> createIoLauncher(Object localService, Class<T> remoteInterface, InputStream in,
			OutputStream out, ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? super Type`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/TypeUtils.java`
#### Snippet
```java
	}

	private static void collectExpectedTypes(Type type, Collection<Type> types) {
		if (isEither(type)) {
			if (type instanceof ParameterizedType) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/TypeUtils.java`
#### Snippet
```java
	}
	
	private static Type getMappedType(Type type, Map<String, Type> varMapping) {
		if (type instanceof TypeVariable) {
			String name = ((TypeVariable<?>) type).getName();
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
	 * @param exceptionHandler - an exception handler that should never return null.
	 */
	public RemoteEndpoint(MessageConsumer out, Endpoint localEndpoint, Function<Throwable, ResponseError> exceptionHandler) {
		if (out == null)
			throw new NullPointerException("out");
```

### BoundedWildcard
Can generalize to `? extends ResponseError`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
	 * @param exceptionHandler - an exception handler that should never return null.
	 */
	public RemoteEndpoint(MessageConsumer out, Endpoint localEndpoint, Function<Throwable, ResponseError> exceptionHandler) {
		if (out == null)
			throw new NullPointerException("out");
```

### BoundedWildcard
Can generalize to `? extends MessageIssue`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
	}
	
	protected void logIssues(Message message, List<MessageIssue> issues) {
		for (MessageIssue issue : issues) {
			String logMessage = "Issue found in " + message.getClass().getSimpleName() + ": " + issue.getText();
```

### BoundedWildcard
Can generalize to `? extends MessageIssue`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
	}
	
	protected void handleRequestIssues(RequestMessage requestMessage, List<MessageIssue> issues) {
		ResponseError errorObject = new ResponseError();
		if (issues.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EnumTypeAdapter.java`
#### Snippet
```java
	private final Map<T, Integer> constantToValue = new HashMap<>();
	
	EnumTypeAdapter(Class<T> classOfT) throws IllegalAccessException {
		try {
			Field valueField = classOfT.getDeclaredField(VALUE_FIELD_NAME);
```

### BoundedWildcard
Can generalize to `? extends Either`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapterFactory.java`
#### Snippet
```java
	protected static class Adapter<L, R> extends EitherTypeAdapter<L, R> {

		public Adapter(Gson gson, TypeToken<Either<L, R>> typeToken) {
			super(gson, typeToken);
		}
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugEnumTypeAdapter.java`
#### Snippet
```java
	private final Map<T, String> enumToSerializedForm = new HashMap<T, String>();

	public DebugEnumTypeAdapter(Class<T> clazz) {
		try {
			for (T constant : clazz.getEnumConstants()) {
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/CompletableFutures.java`
#### Snippet
```java
	 * @return a future
	 */
	public static <R> CompletableFuture<R> computeAsync(Function<CancelChecker, R> code) {
		CompletableFuture<CancelChecker> start = new CompletableFuture<>();
		CompletableFuture<R> result = start.thenApplyAsync(code);
```

### BoundedWildcard
Can generalize to `? extends R`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/CompletableFutures.java`
#### Snippet
```java
	 * @return a future
	 */
	public static <R> CompletableFuture<R> computeAsync(Function<CancelChecker, R> code) {
		CompletableFuture<CancelChecker> start = new CompletableFuture<>();
		CompletableFuture<R> result = start.thenApplyAsync(code);
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/CompletableFutures.java`
#### Snippet
```java
	 * @return a future
	 */
	public static <R> CompletableFuture<R> computeAsync(Executor executor, Function<CancelChecker, R> code) {
		CompletableFuture<CancelChecker> start = new CompletableFuture<>();
		CompletableFuture<R> result = start.thenApplyAsync(code, executor);
```

### BoundedWildcard
Can generalize to `? extends R`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/CompletableFutures.java`
#### Snippet
```java
	 * @return a future
	 */
	public static <R> CompletableFuture<R> computeAsync(Executor executor, Function<CancelChecker, R> code) {
		CompletableFuture<CancelChecker> start = new CompletableFuture<>();
		CompletableFuture<R> result = start.thenApplyAsync(code, executor);
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
	private final Supplier<Collection<E>> constructor;

	public CollectionTypeAdapter(Gson gson, Type elementType, TypeAdapter<E> elementTypeAdapter, Supplier<Collection<E>> constructor) {
		this.gson = gson;
		this.elementType = elementType;
```

### BoundedWildcard
Can generalize to `? extends Number`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
	}

	private void writeIntId(JsonWriter out, Either<String, Number> id) throws IOException {
		if (id == null)
			writeNullValue(out);
```

### BoundedWildcard
Can generalize to `? super MessageIssue`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/validation/ReflectiveMessageValidator.java`
#### Snippet
```java
	 * Validate all fields of the given object.
	 */
	protected void validate(Object object, List<MessageIssue> issues, Deque<Object> objectStack, Deque<Object> accessorStack) throws Exception {
		if (object == null 
				|| object instanceof Enum<?> 
```

### BoundedWildcard
Can generalize to `? extends Number`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
	}
	
	protected void writeId(JsonWriter out, Either<String, Number> id) throws IOException {
		if (id == null)
			writeNullValue(out);
```

### BoundedWildcard
Can generalize to `? super JsonElement`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapter.java`
#### Snippet
```java
		}
		
		public ListChecker(Predicate<JsonElement> elementChecker, boolean resultIfEmpty) {
			this.elementChecker = elementChecker;
			this.resultIfEmpty = resultIfEmpty;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param configureGson - a function for Gson configuration
	 */
	static <T> Launcher<T> createIoLauncher(Object localService, Class<T> remoteInterface, InputStream in, OutputStream out, boolean validate,
			ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper, Consumer<GsonBuilder> configureGson) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param trace - a writer to which incoming and outgoing messages are traced, or {@code null} to disable tracing
	 */
	static <T> Launcher<T> createLauncher(Object localService, Class<T> remoteInterface, InputStream in, OutputStream out,
			boolean validate, PrintWriter trace) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param wrapper - a function for plugging in additional message consumers
	 */
	static <T> Launcher<T> createIoLauncher(Object localService, Class<T> remoteInterface, InputStream in, OutputStream out,
			ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param configureGson - a function for Gson configuration
	 */
	static <T> Launcher<T> createIoLauncher(Object localService, Class<T> remoteInterface, InputStream in, OutputStream out,
			ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper, Consumer<GsonBuilder> configureGson) {
		return new Builder<T>()
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/Launcher.java`
#### Snippet
```java
	 * @param out - output stream to send outgoing messages
	 */
	static <T> Launcher<T> createLauncher(Object localService, Class<T> remoteInterface, InputStream in, OutputStream out) {
		return new Builder<T>()
				.setLocalService(localService)
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract protected`
in `org.eclipse.lsp4j.websocket/src/main/java/org/eclipse/lsp4j/websocket/WebSocketEndpoint.java`
#### Snippet
```java
	 * {@link Launcher.Builder#setRemoteInterface(Class) remote interface}.
	 */
	abstract protected void configure(Launcher.Builder<T> builder);
	
	/**
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		public final static ToStringContext INSTANCE = new ToStringContext();

		private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
			@Override
			public IdentityHashMap<Object, Boolean> initialValue() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
	public static class ToStringContext {

		public final static ToStringContext INSTANCE = new ToStringContext();

		private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		public final static ToStringContext INSTANCE = new ToStringContext();

		private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
			@Override
			public IdentityHashMap<Object, Boolean> initialValue() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
	public static class ToStringContext {

		public final static ToStringContext INSTANCE = new ToStringContext();

		private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		public final static ToStringContext INSTANCE = new ToStringContext();

		private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
			@Override
			public IdentityHashMap<Object, Boolean> initialValue() {
```

### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		public final static ToStringContext INSTANCE = new ToStringContext();

		private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
			@Override
			public IdentityHashMap<Object, Boolean> initialValue() {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		String simpleName = obj.getClass().getSimpleName();
		int identityHashCode = System.identityHashCode(obj);
		return simpleName + "@" + Integer.valueOf(identityHashCode);
	}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		String simpleName = obj.getClass().getSimpleName();
		int identityHashCode = System.identityHashCode(obj);
		return simpleName + "@" + Integer.valueOf(identityHashCode);
	}

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/DebugLauncher.java`
#### Snippet
```java
	 * by the debug protocol.
	 */
	public static class Builder<T> extends Launcher.Builder<T> {
		
		@Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/launch/LSPLauncher.java`
#### Snippet
```java
	 * Launcher builder for the Language Server Protocol.
	 */
	public static class Builder<T> extends Launcher.Builder<T> {
		
	}
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array `parameterTypes`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/JsonRpcMethod.java`
#### Snippet
```java
		builder.append("\tmethodName: ").append(methodName).append('\n');
		if (parameterTypes != null)
			builder.append("\tparameterTypes: ").append(parameterTypes).append('\n');
		if (returnType != null)
			builder.append("\treturnType: ").append(returnType).append('\n');
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
		} else if ("response".equals(messageType)) {
			if (success != null && success) {
				return super.parseResult(rawBody, Integer.toString(request_seq));
			}
			if (isNull(rawBody)) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
			return parseParams(in, method);
		} else if ("response".equals(messageType) && success != null && success) {
			return super.parseResult(in, Integer.toString(request_seq));
		} else {
			return JsonParser.parseReader(in);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugEnumTypeAdapter.java`
#### Snippet
```java
		}
		m.appendTail(sb);
		return sb.toString().replaceAll("_", "");
	}

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
				sb.append(Arrays.toString((double[])object));
			} else if (object instanceof CharSequence) {
				sb.append("\"").append(((CharSequence)object).toString().replace("\n", "\\n").replace("\r", "\\r")).append("\"");
			} else if (object instanceof Enum<?>) {
				sb.append(((Enum<?>)object).name());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
				sb.append(Arrays.toString((double[])object));
			} else if (object instanceof CharSequence) {
				sb.append("\"").append(((CharSequence)object).toString().replace("\n", "\\n").replace("\r", "\\r")).append("\"");
			} else if (object instanceof Enum<?>) {
				sb.append(((Enum<?>)object).name());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		public IndentationAwareStringBuilder append(final CharSequence string) {
			if (indentation > 0) {
				String indented = string.toString().replace(
					newLineString,
					newLineString + repeat(indentationString, indentation)
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
				sb.append(Arrays.toString((double[])object));
			} else if (object instanceof CharSequence) {
				sb.append("\"").append(((CharSequence)object).toString().replace("\n", "\\n").replace("\r", "\\r")).append("\"");
			} else if (object instanceof Enum<?>) {
				sb.append(((Enum<?>)object).name());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
				sb.append(Arrays.toString((double[])object));
			} else if (object instanceof CharSequence) {
				sb.append("\"").append(((CharSequence)object).toString().replace("\n", "\\n").replace("\r", "\\r")).append("\"");
			} else if (object instanceof Enum<?>) {
				sb.append(((Enum<?>)object).name());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		public IndentationAwareStringBuilder append(final CharSequence string) {
			if (indentation > 0) {
				String indented = string.toString().replace(
					newLineString,
					newLineString + repeat(indentationString, indentation)
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Tuple.java`
#### Snippet
```java
package org.eclipse.lsp4j.jsonrpc.messages;

import java.io.IOException;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.lsp4j.jsonrpc.validation.NonNull;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Tuple.java`
#### Snippet
```java
import java.io.IOException;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

import com.google.gson.TypeAdapter;
```

### UNUSED_IMPORT
Unused import `import com.google.gson.TypeAdapter;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Tuple.java`
#### Snippet
```java
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
```

### UNUSED_IMPORT
Unused import `import com.google.gson.stream.JsonReader;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Tuple.java`
#### Snippet
```java

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

```

### UNUSED_IMPORT
Unused import `import com.google.gson.stream.JsonWriter;`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Tuple.java`
#### Snippet
```java
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageJsonHandler.java`
#### Snippet
```java
	public static String toString(Object object) {
		if (toStringInstance == null) {
			toStringInstance = new MessageJsonHandler(Collections.emptyMap(), gsonBuilder -> {
				gsonBuilder.setPrettyPrinting();
			});
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `output` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/StreamMessageConsumer.java`
#### Snippet
```java
	private final Object outputLock = new Object();

	private OutputStream output;

	public StreamMessageConsumer(MessageJsonHandler jsonHandler) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/LanguageClient.java`
#### Snippet
```java
	 */
	@JsonNotification("telemetry/event")
	void telemetryEvent(Object object);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/LanguageClient.java`
#### Snippet
```java
	 */
	@JsonNotification("textDocument/publishDiagnostics")
	void publishDiagnostics(PublishDiagnosticsParams diagnostics);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/LanguageClient.java`
#### Snippet
```java
	 */
	@JsonNotification("window/showMessage")
	void showMessage(MessageParams messageParams);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/LanguageClient.java`
#### Snippet
```java
	 */
	@JsonNotification("window/logMessage")
	void logMessage(MessageParams message);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/NotebookDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didOpen(DidOpenNotebookDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/NotebookDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didChange(DidChangeNotebookDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/NotebookDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didSave(DidSaveNotebookDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/NotebookDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didClose(DidCloseNotebookDocumentParams params);
}

```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/TextDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didOpen(DidOpenTextDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/TextDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didChange(DidChangeTextDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/TextDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didClose(DidCloseTextDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/TextDocumentService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didSave(DidSaveTextDocumentParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/WorkspaceService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didChangeConfiguration(DidChangeConfigurationParams params);

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/WorkspaceService.java`
#### Snippet
```java
	 */
	@JsonNotification
	void didChangeWatchedFiles(DidChangeWatchedFilesParams params);

	/**
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `gradle/java-compiler-settings.gradle`
#### Snippet
```java
 ******************************************************************************/

sourceCompatibility = '1.8'

tasks.withType(Javadoc) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
		public Method method;
		public Type[] parameterTypes = EMPTY_TYPE_ARRAY;
		public boolean isNotification = false;
	}

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
		private final String newLineString = "\n";

		private int indentation = 0;

		public IndentationAwareStringBuilder increaseIndent() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/util/ToStringBuilder.java`
#### Snippet
```java
	private boolean multiLine = true;

	private boolean skipNulls = false;

	private boolean showFieldNames = true;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
		private final String newLineString = "\n";

		private int indentation = 0;

		public IndentationAwareStringBuilder increaseIndent() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lsp4j.debug/src/main/java/org/eclipse/lsp4j/debug/util/ToStringBuilder.java`
#### Snippet
```java
	private boolean multiLine = true;

	private boolean skipNulls = false;

	private boolean showFieldNames = true;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `name`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugEnumTypeAdapter.java`
#### Snippet
```java

	private String getSerializedForm(String name) {
		name = name.toLowerCase();
		Matcher m = Pattern.compile("_[a-z]").matcher(name);
		StringBuffer sb = new StringBuffer();
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/EndpointProxy.java`
#### Snippet
```java
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		args = args == null ? new Object[0] : args;
		MethodInfo methodInfo = this.methodInfos.get(method.getName());
		if (methodInfo != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `errorMessage`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
					// Generally in those cases the body has some extra details to figure out
					// what went wrong.
					errorMessage = "Unset error message.";
				}
				error.setMessage(errorMessage);
```

### AssignmentToMethodParameter
Assignment to method parameter `body`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
								JsonElement jsonElement = (JsonElement) body;
								if (typeAdapter != null)
									body = typeAdapter.fromJsonTree(jsonElement);
								else
									body = fromJson(jsonElement, returnType);
```

### AssignmentToMethodParameter
Assignment to method parameter `body`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
									body = typeAdapter.fromJsonTree(jsonElement);
								else
									body = fromJson(jsonElement, returnType);
							}
						}
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/messages/DebugResponseMessage.java`
#### Snippet
```java
	public String getResponseId() {
		if (responseId == null)
			return null;
		if (responseId.isLeft())
			return responseId.getLeft();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/messages/DebugResponseMessage.java`
#### Snippet
```java
		if (responseId.isRight())
			return responseId.getRight().toString();
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/services/LanguageServer.java`
#### Snippet
```java
	@JsonDelegate
	default NotebookDocumentService getNotebookDocumentService() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/MessageJsonHandler.java`
#### Snippet
```java
		else if (CANCEL_METHOD.getMethodName().equals(name))
			return CANCEL_METHOD;
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
				receivedRequestMap.remove(messageId);
			}
			return null;
		});
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EnumTypeAdapter.java`
#### Snippet
```java
		if (peek == JsonToken.NULL) {
			in.nextNull();
			return null;
		} else if (peek == JsonToken.NUMBER) {
			return valueToConstant.get(in.nextInt());
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EnumTypeAdapter.java`
#### Snippet
```java
			Class<?> rawType = typeToken.getRawType();
			if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class)
				return null;
			if (!rawType.isEnum())
				rawType = rawType.getSuperclass();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugEnumTypeAdapter.java`
#### Snippet
```java
		if (in.peek() == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		return serializedFormToEnum.get(in.nextString());
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugEnumTypeAdapter.java`
#### Snippet
```java
			Class<?> rawType = typeToken.getRawType();
			if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class)
				return null;
			if (!rawType.isEnum())
				rawType = rawType.getSuperclass();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			if (!Collection.class.isAssignableFrom(typeToken.getRawType()))
				return null;

			Type[] elementTypes = TypeUtils.getElementTypes(typeToken, Collection.class);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
			Type[] elementTypes = TypeUtils.getElementTypes(typeToken, Collection.class);
			if (elementTypes.length != 1)
				return null;
			Type elementType = elementTypes[0];
			TypeAdapter<?> elementTypeAdapter;
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/CollectionTypeAdapter.java`
#### Snippet
```java
		if (peek == JsonToken.NULL) {
			in.nextNull();
			return null;
		} else if (peek == JsonToken.BEGIN_ARRAY) {
			Collection<E> collection = constructor.get();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/EndpointProxy.java`
#### Snippet
```java
			if (methodInfo.isNotification) {
				delegate.notify(methodInfo.name, params);
				return null;
			}
			return delegate.request(methodInfo.name, params);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/EndpointProxy.java`
#### Snippet
```java
	protected Object getParams(Object[] args, MethodInfo methodInfo) {
		if (args.length == 0) {
			return null;
		}
		if (args.length == 1) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/IdentifiableMessage.java`
#### Snippet
```java
	public String getId() {
		if (id == null)
			return null;
		if (id.isLeft())
			return id.getLeft();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/IdentifiableMessage.java`
#### Snippet
```java
		if (id.isRight())
			return id.getRight().toString();
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/CancelParams.java`
#### Snippet
```java
	public String getId() {
		if (id == null)
			return null;
		if (id.isLeft())
			return id.getLeft();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/CancelParams.java`
#### Snippet
```java
		if (id.isRight())
			return id.getRight().toString();
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/TupleTypeAdapters.java`
#### Snippet
```java
			if (next == JsonToken.NULL) {
				in.nextNull();
				return null;
			}
			in.beginArray();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/TupleTypeAdapters.java`
#### Snippet
```java
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			if (!TypeUtils.isTwoTuple(typeToken.getType())) {
				return null;
			}
			return new TwoTypeAdapter(gson, typeToken);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			if (!Message.class.isAssignableFrom(typeToken.getRawType()))
				return null;
			return (TypeAdapter<T>) new DebugMessageTypeAdapter(handler, gson);
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
			}
			if (isNull(rawBody)) {
				return null;
			}
			if (!(rawBody instanceof JsonElement)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/adapters/DebugMessageTypeAdapter.java`
#### Snippet
```java
		if (in.peek() == JsonToken.NULL) {
			in.nextNull();
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/ThrowableTypeAdapter.java`
#### Snippet
```java
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			if (!Throwable.class.isAssignableFrom(typeToken.getRawType()))
				return null;
			
			return (TypeAdapter<T>) new ThrowableTypeAdapter((TypeToken<Throwable>) typeToken);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/ThrowableTypeAdapter.java`
#### Snippet
```java
		if (in.peek() == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/adapters/ResourceOperationTypeAdapter.java`
#### Snippet
```java

		if (!ResourceOperation.class.isAssignableFrom(type.getRawType())) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/adapters/WorkDoneProgressNotificationAdapter.java`
#### Snippet
```java
		if (in.peek() == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j/src/main/java/org/eclipse/lsp4j/adapters/WorkDoneProgressNotificationAdapter.java`
#### Snippet
```java
			Class<?> rawType = typeToken.getRawType();
			if (!WorkDoneProgressNotification.class.isAssignableFrom(rawType)) {
				return null;
			}
			return (TypeAdapter<T>) new WorkDoneProgressNotificationAdapter();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either3.java`
#### Snippet
```java
		Either<T2, T3> right = getRight();
		if (right == null)
			return null;
		else
			return right.getLeft();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either3.java`
#### Snippet
```java
		Either<T2, T3> right = getRight();
		if (right == null)
			return null;
		else
			return right.getRight();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either3.java`
#### Snippet
```java
			return mapThird.apply(getThird());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/TracingMessageConsumer.java`
#### Snippet
```java
			if (requestMetadata == null) {
				LOG.log(WARNING, String.format("Unmatched response message: %s", message));
				return null;
			}
			String method = requestMetadata.method;
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/TracingMessageConsumer.java`
#### Snippet
```java
		} else {
			LOG.log(WARNING, String.format("Unknown message type: %s", message));
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/TracingMessageConsumer.java`
#### Snippet
```java
			if (requestMetadata == null) {
				LOG.log(WARNING, String.format("Unmatched response message: %s", message));
				return null;
			}
			String method = requestMetadata.method;
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/TracingMessageConsumer.java`
#### Snippet
```java
		} else {
			LOG.log(WARNING, String.format("Unknown message type: %s", message));
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
	protected Object fromJson(JsonElement element, Type type) {
		if (isNull(element)) {
			return null;
		}
		if (isNullOrVoidType(type)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		Object value = gson.fromJson(element, type);
		if (isNull(value)) {
			return null;
		}
		return value;
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
	protected Object parseParams(Object params, String method) {
		if (isNull(params)) {
			return null;
		}
		if (!(params instanceof JsonElement)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
				rawParams.isJsonArray() && rawParams.getAsJsonArray().size() == 0
				|| rawParams.isJsonObject() && rawParams.getAsJsonObject().size() == 0)) {
			return null;
		}
		return rawParams;
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		if (in.peek() == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		if (next == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		Type[] parameterTypes = getParameterTypes(method);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
				rawParams.isJsonArray() && rawParams.getAsJsonArray().size() == 0
				|| rawParams.isJsonObject() && rawParams.getAsJsonObject().size() == 0)) {
			return null;
		}
		return rawParams;
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			if (!Message.class.isAssignableFrom(typeToken.getRawType()))
				return null;
			return (TypeAdapter<T>) new MessageTypeAdapter(handler, gson);
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapter.java`
#### Snippet
```java
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			if (!TypeUtils.isEither(typeToken.getType())) {
				return null;
			}
			return new EitherTypeAdapter(gson, typeToken);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/EitherTypeAdapter.java`
#### Snippet
```java
		if (next == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		return create(next, in);
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/messages/DebugNotificationMessage.java`
#### Snippet
```java
	public String getId() {
		if (id == null)
			return null;
		if (id.isLeft())
			return id.getLeft();
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc.debug/src/main/java/org/eclipse/lsp4j/jsonrpc/debug/messages/DebugNotificationMessage.java`
#### Snippet
```java
		if (id.isRight())
			return id.getRight().toString();
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either.java`
#### Snippet
```java
			return mapRight.apply(getRight());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either.java`
#### Snippet
```java
		if (right != null)
			return right;
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/messages/Either.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `throwable`
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/RemoteEndpoint.java`
#### Snippet
```java
			}
			out.consume(createErrorResponseMessage(requestMessage, errorObject));
			if (throwable instanceof Error)
				throw (Error) throwable;
			else
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/AnnotationUtil.java`
#### Snippet
```java
	
	static class MethodInfo {
		private static Type[] EMPTY_TYPE_ARRAY = {};
		public String name;
		public Method method;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/EndpointProxy.java`
#### Snippet
```java
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		args = args == null ? new Object[0] : args;
		MethodInfo methodInfo = this.methodInfos.get(method.getName());
		if (methodInfo != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/MessageTypeAdapter.java`
#### Snippet
```java
	}
	
	private static Type[] EMPTY_TYPE_ARRAY = {};

	private final MessageJsonHandler handler;
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `responseError` of exception class
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/ResponseErrorException.java`
#### Snippet
```java

	private static final long serialVersionUID = -5970739895395246885L;
	private ResponseError responseError;

	public ResponseErrorException(ResponseError responseError) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `false` assigned to `newLine` is never used
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/StreamMessageProducer.java`
#### Snippet
```java
								if (!result)
									keepRunning = false;
								newLine = false;
							}
							headers = new Headers();
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `F` explicitly extends 'java.lang.Object'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/TupleTypeAdapters.java`
#### Snippet
```java
	private TupleTypeAdapters() {}

	public static class TwoTypeAdapter<F extends Object, S extends Object> extends TypeAdapter<Two<F, S>> {
		
		protected final TypeAdapter<F> first;
```

### TypeParameterExtendsObject
Type parameter `S` explicitly extends 'java.lang.Object'
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/json/adapters/TupleTypeAdapters.java`
#### Snippet
```java
	private TupleTypeAdapters() {}

	public static class TwoTypeAdapter<F extends Object, S extends Object> extends TypeAdapter<Two<F, S>> {
		
		protected final TypeAdapter<F> first;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.lsp4j.jsonrpc/src/main/java/org/eclipse/lsp4j/jsonrpc/services/GenericEndpoint.java`
#### Snippet
```java
			if (argumentCount > parameterCount) {
				Stream<?> unexpectedArguments = arguments.stream().skip(parameterCount);
				String unexpectedParams = unexpectedArguments.map(a -> "'" + a + "'").reduce((a, a2) -> a + ", " + a2).get();
				LOG.warning("Unexpected params " + unexpectedParams + " for '" + method + "' is ignored");
				return arguments.subList(0, parameterCount).toArray();
```

