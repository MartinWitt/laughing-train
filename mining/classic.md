# chrisliebot/classic
# Bad smells
I found 315 bad smells with 195 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 194 | true |
| BoundedWildcard | 44 | false |
| AssignmentToMethodParameter | 20 | false |
| ReturnNull | 12 | false |
| ConstantConditions | 9 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| RedundantFieldInitialization | 5 | false |
| OptionalContainsCollection | 4 | false |
| RedundantSuppression | 4 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| RedundantMethodOverride | 1 | false |
| CodeBlock2Expr | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RegExpSimplifiable | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| NullableProblems | 1 | false |
## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'value'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		private final Function<ChrislieParser, TokenSelector> selector;
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stackTraceColor'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
	
	private final Optional<Color> stackTraceColor = colorFromCallstack();
	
	@Override
```

## RedundantMethodOverride
### RedundantMethodOverride
Method `help()` only delegates to its super method
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Command.super.help(ctx, ref);
	}
```

## UnnecessaryModifier
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	 */
	@FunctionalInterface
	public static interface ExceptionalRunnable {
		
		public void run() throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	public static interface ExceptionalRunnable {
		
		public void run() throws Exception;
	}
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	@Data
	public static class QwantResponse {
		
		private String status;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	@Data
	public static class QwantResponse {
		
		private String status;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	);
	
	public default Call<QwantResponse> search(String query, SafeSearch safesearch, int count, @NotNull Type type) {
		return search(type.code, type.code, query, safesearch.code, count);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
public interface QwantService {
	
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
public interface QwantService {
	
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
public interface QwantService {
	
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	@GET("v3/search/{type}?device=desktop&locale=" + DEFAULT_LOCALE)
	@SuppressWarnings({"MissingDeprecatedAnnotation"})
	public Call<QwantResponse> search(
			@Path("type") String type,
			@Query("t") String t,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class Definition {
		
		private String definition, example, word;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class Definition {
		
		private String definition, example, word;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@GET("v0/define")
	public Call<DefinitionList> lookup(@Query("term") String term);
	
	@Data
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
public interface UrbanDictionaryService {
	
	public static final String BASE_URL = "https://api.urbandictionary.com/";
	
	@GET("v0/define")
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
public interface UrbanDictionaryService {
	
	public static final String BASE_URL = "https://api.urbandictionary.com/";
	
	@GET("v0/define")
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
public interface UrbanDictionaryService {
	
	public static final String BASE_URL = "https://api.urbandictionary.com/";
	
	@GET("v0/define")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class DefinitionList {
		
		private List<Definition> list;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class DefinitionList {
		
		private List<Definition> list;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	}
	
	public static String removeBrackets(String definition) {
		StringSubstitutor strSub = new StringSubstitutor(key -> key, "[", "]", '\\');
		return strSub.replace(definition);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * blocked us or we are otherwise unable to contact user.
	 */
	public Optional<? extends ChrislieChannel> directMessage();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * @return The string that should be used to {@code ping} the user.
	 */
	public String mention();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * @return An internal identifier of a user. Should be used when storing user associated data.
	 */
	public String identifier();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * @return The display name which should be used to talk about the user in human facing messages.
	 */
	public String displayName();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
		
		@GET("db.json")
		public Call<List<DatabaseEntry>> getDatabase();
	}
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public default ChrislieOutput output(LimiterConfig limiterConfig) {
		return new DiscordChannelOutput(service(), messageChannel());
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput output(LimiterConfig limiterConfig, DiscordMessage source) {
		return new DiscordChannelOutput(service(), messageChannel(), source);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public DiscordService service();
	
	@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
public interface DiscordChannel extends ChrislieChannel {
	
	public MessageChannel messageChannel();
	
	@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordGuild> guild();
	
	@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput authorUrl(String url);
	
	public ChrislieOutput authorIcon(String url);
	
	public ChrislieOutput field(String field, String value, boolean inline);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput convert(Consumer<PlainOutput.PlainOutputSubstituion> out) {
		out.accept(convert());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput authorIcon(String url);
	
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public PlainOutput.PlainOutputSubstituion convert();
	
	public default ChrislieOutput convert(String s) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput plain();
	
	public default ChrislieOutput plain(String s) {
		plainSimpleSet(s, plain());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default void markAsError() {}
	
	public ChrislieOutput color(Color color);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public ChrislieOutput image(String url);
	
	public ChrislieOutput thumbnail(String url);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput color(Color color);
	
	public ChrislieOutput color(int color);
	
	public ChrislieOutput author(String name);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public PlainOutput plain();
	
	public default ChrislieOutput plain(String s) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput image(String url);
	
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public default void markAsError() {}
	
	public ChrislieOutput color(Color color);
	
	public ChrislieOutput color(int color);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public ChrislieOutput footer(String text, String iconUrl);
	
	public default ChrislieOutput footer(String text) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
		plainSimpleSet(s, description());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
public interface ChrislieOutput {
	
	public ChrislieOutput title(String title, String url);
	
	public default ChrislieOutput title(String title) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
		plainSimpleSet(s, replace());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput replace(Consumer<PlainOutput> out) {
		out.accept(replace());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput description(Consumer<PlainOutput> out) {
		out.accept(description());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput title(String title, String url);
	
	public default ChrislieOutput title(String title) {
		return title(title, null);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public void send(); // TODO: implement callback for message transmission
	
	private static void plainSimpleSet(String s, PlainOutput plainOutput) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput color(int color);
	
	public ChrislieOutput author(String name);
	
	public ChrislieOutput authorUrl(String url);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
		return field(field, value, true);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput author(String name);
	
	public ChrislieOutput authorUrl(String url);
	
	public ChrislieOutput authorIcon(String url);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput.PlainOutputSubstituion convert();
	
	public default ChrislieOutput convert(String s) {
		convert().clear().appendEscapeSub(s);
		return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput footer(String text, String iconUrl);
	
	public default ChrislieOutput footer(String text) {
		return footer(text, null);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
		
		@NotNull
		public String parse(ChrislieParser parser) throws ChrislieParser.ParserException;
	}
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A potential user if the user can be found in this channel.
	 */
	public default Optional<? extends ChrislieUser> user(String identifier) {
		return users().stream()
				.filter(user -> user.identifier().equals(identifier))
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A list of all users that are currently in this channel.
	 */
	public List<? extends ChrislieUser> users();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return {@code true} if the bot can write messages to this channel.
	 */
	public default boolean canTalk() {
		return true;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return {@code true} if this channel is marked as a NSFW channel.
	 */
	public default boolean isNSFW() {
		return false;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return The display name which should be used to refer to this channel in human facing messages.
	 */
	public String displayName();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return An optional guild, if this channel is part of a guild.
	 */
	public Optional<? extends ChrislieGuild> guild();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A potential user that this call name might refer to.
	 */
	public Optional<? extends ChrislieUser> resolve(String callName);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return String that will create a mention for the given channel.
	 */
	public default String mention() {
		return displayName();
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return {@code true} if this channel represents a one to one communication.
	 */
	public boolean isDirectMessage();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return An internal identifier of this channel. Should be used when storing channel associated data.
	 */
	public String identifier();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A ChrislieOutput instance that can be used to post to this channel.
	 */
	public ChrislieOutput output(LimiterConfig limiterConfig);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	private interface OptionContainer {
		
		public void visit(ChrislieParser parser) throws OptionsMapException, ChrislieParser.ParserException;
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceAttached.java`
#### Snippet
```java
	public ChrislieService service();
	
	public default Chrisliebot bot() {
		return service().bot();
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceAttached.java`
#### Snippet
```java
public interface ServiceAttached {
	
	public ChrislieService service();
	
	public default Chrisliebot bot() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public interface PlainOutputSubstituion extends PlainOutput {
		
		public PlainOutputSubstituion appendSub(String s, Object... format);
		
		public PlainOutputSubstituion appendEscapeSub(String s, Object... format);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion appendEscape(String s, Object... format);
		
		@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		public PlainOutputSubstituion appendSub(String s, Object... format);
		
		public PlainOutputSubstituion appendEscapeSub(String s, Object... format);
		
		@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion append(String s, Object... format);
		
		@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion newLine();
		
		@Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
public interface PlainOutput {
	
	public PlainOutput append(String s, Object... format);
	
	public PlainOutput appendEscape(String s, Object... format);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput newLine();
	
	public PlainOutput clear();
	
	public default JoinPlainOutput joiner(String delimiter) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	
	@SuppressWarnings("ClassReferencesSubclass")
	public static PlainOutputSubstituion dummy() {
		return PlainOutputDummy.DUMMY;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput clear();
	
	public default JoinPlainOutput joiner(String delimiter) {
		return new JoinPlainOutput(this, delimiter);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public interface PlainOutputSubstituion extends PlainOutput {
		
		public PlainOutputSubstituion appendSub(String s, Object... format);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput appendEscape(String s, Object... format);
	
	public PlainOutput newLine();
	
	public PlainOutput clear();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class PlainOutputDummy implements PlainOutputSubstituion {
		
		private static final PlainOutputDummy DUMMY = new PlainOutputDummy();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class PlainOutputDummy implements PlainOutputSubstituion {
		
		private static final PlainOutputDummy DUMMY = new PlainOutputDummy();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class JoinPlainOutput implements PlainOutput {
		
		private @NonNull PlainOutput out;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class JoinPlainOutput implements PlainOutput {
		
		private @NonNull PlainOutput out;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion clear();
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput append(String s, Object... format);
	
	public PlainOutput appendEscape(String s, Object... format);
	
	public PlainOutput newLine();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	public ChrislieChannel channel();
	
	public ChrislieUser user();
	
	public String message();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
public interface ChrislieMessage extends ServiceAttached {
	
	public ChrislieChannel channel();
	
	public ChrislieUser user();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @return A possible {@link ChrislieDispatcher.CommandParse} object.
	 */
	public default Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.empty();
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	public ChrislieUser user();
	
	public String message();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @return An ouput instance for the channel that this message was received in.
	 */
	public default ChrislieOutput reply(LimiterConfig limiter) {
		return channel().output(limiter);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @param s       The string to reply with.
	 */
	public default void reply(LimiterConfig limiter, String s) throws ChrislieListener.ListenerException {
		reply(limiter).plain(s).send();
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return An internal identifier of this guild. Should be used when storing guild associated data.
	 */
	public String identifier();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return A list of all channels that are part of this guild.
	 */
	public Collection<? extends ChrislieChannel> channels();
	
	// TODO: get user, call name? (check chrisliechannel) do we want to introduce a new type for guildusers? (discord offers that)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return The display name which should be used to refer to this guild in human facing messages.
	 */
	public String displayName();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return A list of all users that are currently part of this guild.
	 */
	public default Collection<? extends ChrislieUser> users() {
		return channels().stream()
				.map(ChrislieChannel::users)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieMessage message);
	
	public boolean check(ChrislieUser user);
	
	public boolean check(ChrislieChannel channel);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
public interface Selector {
	
	public boolean check(ChrislieMessage message);
	
	public boolean check(ChrislieUser user);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieService service);
	
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	 * Thrown to indicate that the selector was unable to load the provided config.
	 */
	public static class SelectorException extends Exception {
		
		public SelectorException(String message) {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	 * Thrown to indicate that the selector was unable to load the provided config.
	 */
	public static class SelectorException extends Exception {
		
		public SelectorException(String message) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieUser user);
	
	public boolean check(ChrislieChannel channel);
	
	public boolean check(ChrislieService service);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieChannel channel);
	
	public boolean check(ChrislieService service);
	
	public boolean check(ChrislieGuild guild);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
	
	@GET("r/{subreddit}/new.json?sort=new")
	public Call<SubredditListing> getFeed(
			@Path("subreddit") String subreddit
	);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
public interface RedditService {
	
	public static final String BASE_URL = "https://www.reddit.com/";
	
	@GET("r/{subreddit}/new.json?sort=new")
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
public interface RedditService {
	
	public static final String BASE_URL = "https://www.reddit.com/";
	
	@GET("r/{subreddit}/new.json?sort=new")
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
public interface RedditService {
	
	public static final String BASE_URL = "https://www.reddit.com/";
	
	@GET("r/{subreddit}/new.json?sort=new")
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
	}
	
	public static interface Provider<T> {
		
		public Optional<T> get(FlexConf flex);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public Optional<T> get(FlexConf flex);
		
		public default Optional<T> get(ChrislieListener.ListenerMessage m) {
			return get(m.ref().flexConf());
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		}
		
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException;
		
		public default T getOrFail(ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
	public static interface Provider<T> {
		
		public Optional<T> get(FlexConf flex);
		
		public default Optional<T> get(ChrislieListener.ListenerMessage m) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException;
		
		public default T getOrFail(ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
			return getOrFail(m.ref().flexConf());
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	
	@GET("general/")
	public Call<MensaApiMeta> getMeta(@Header("Authorization") String credentials);
	
	@GET("canteen/")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
public interface MensaApiService {
	
	public static final String MENSA_BASE_URL = "https://www.sw-ka.de/en/json_interface/";
	
	@GET("general/")
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
public interface MensaApiService {
	
	public static final String MENSA_BASE_URL = "https://www.sw-ka.de/en/json_interface/";
	
	@GET("general/")
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
public interface MensaApiService {
	
	public static final String MENSA_BASE_URL = "https://www.sw-ka.de/en/json_interface/";
	
	@GET("general/")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	 * @return Not really unfucked but still better than what it was before and actually usable.
	 */
	public static Map<String, Map<Long, Map<String, List<MensaApiMeal>>>> unfuck(GsonValidator gson, JsonElement json) {
		if (json == null)
			return null;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	
	@GET("canteen/")
	public Call<JsonElement> getCanteen(@Header("Authorization") String credentials);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @return Wraps the value of this class into an {@link Optional}.
	 */
	public Optional<String> optional();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class NoToken implements OptionalToken {
		
		@Getter private final ParserException throwable;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class NoToken implements OptionalToken {
		
		@Getter private final ParserException throwable;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	}
	
	public static OptionalToken empty(ParserException throwable, ChrislieParser parser) {
		return new NoToken(throwable, parser);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	}
	
	public static OptionalToken of(String value) {
		return new ValueToken(value);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @return {@code true} if the token was successfully parsed.
	 */
	public boolean isSuccess();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 *                         via the message parameter.
	 */
	public String expect(String msg) throws ParserException;
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @throws NoSuchElementException If the token was successfully parsed and thous no exception was raised.
	 */
	public ParserException throwable() throws NoSuchElementException;
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @throws ParserException The exception that was raised while parsing the token.
	 */
	public String expect() throws ParserException;
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class ValueToken implements OptionalToken {
		
		private final String value;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class ValueToken implements OptionalToken {
		
		private final String value;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	private interface OutputFunction {
		
		public void out(ChrislieOutput out);
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return An optional containing the guild if the given identifier could be resolved.
	 */
	public Optional<? extends ChrislieGuild> guild(String identifier);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @param resolver The reesolver that is going to be used by this instance.
	 */
	public default void announceResolver(ContextResolver resolver) {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @throws ServiceException If a proper shutdown is not possible.
	 */
	public void exit() throws ServiceException;
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return A user that represents the online identity of this service itself.
	 */
	public ChrislieUser botUser();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return That bot that this service belongs to.
	 */
	public Chrisliebot bot();
	
	public static class ServiceException extends Exception {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	public Chrisliebot bot();
	
	public static class ServiceException extends Exception {
		
		public ServiceException() {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	public Chrisliebot bot();
	
	public static class ServiceException extends Exception {
		
		public ServiceException() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @throws Exception If a unrecoverable error is occured that prevents the service from ever entering a fully operational state.
	 */
	public void awaitReady() throws Exception;
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * Implementing service is expected to, if possible, drop connection and reconnect to network.
	 */
	public default void reconnect() {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return An optional containing the channel if the given identifier could be resolved.
	 */
	public Optional<? extends ChrislieChannel> channel(String identifier);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return This service for method chaining.
	 */
	public ChrislieService sink(@Nullable Consumer<ChrislieMessage> sink);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return An optional containing the user if the given identifier could be resolved.
	 */
	public Optional<? extends ChrislieUser> user(String identifier);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return Unique indentifier of this service.
	 */
	public String identifier();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Param {
		private String proc;
		private Args args;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Param {
		private String proc;
		private Args args;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Output {
		private int returncode;
		private String output;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Output {
		private int returncode;
		private String output;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Args {
		private String expression;
		private String timelimit;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Args {
		private String expression;
		private String timelimit;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Headers("Content-Type: application/json")
	@POST("rpc")
	public Call<Output> runHaskell(@Body Param param);
	
	@Data
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceBootstrap.java`
#### Snippet
```java
	 * @return A configured and fully functional {@link ChrislieService}.
	 */
	public ChrislieService service(Chrisliebot chrisliebot, String identifier) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
public interface Generator {
	
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
public interface Generator {
	
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
public interface Generator {
	
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           anything but this exception will cause the dirty bit to be set.
	 */
	public default void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @param fn The function to wrap.
		 */
		public default void unwrap(@NonNull ListenerRunnable fn) {
			try {
				fn.run();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * </p>
	 */
	public interface Command extends ChrislieListener {
		
		/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 *                           is required to resolve the problem.
		 */
		public void execute(Invocation invc) throws ListenerException;
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           will not set the dirty bit.
	 */
	public default void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString(callSuper = true)
	public static class Invocation extends ListenerMessage {
		
		public Invocation(@NonNull ExceptionHandler exceptionHandler,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString(callSuper = true)
	public static class Invocation extends ListenerMessage {
		
		public Invocation(@NonNull ExceptionHandler exceptionHandler,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @throws ListenerException If accessing the help failed.
		 */
		public default Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {return Optional.empty();}
		
		/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	@AllArgsConstructor
	@ToString
	public static class Envelope {
		
		@Getter private final @NonNull ChrislieListener listener;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	@AllArgsConstructor
	@ToString
	public static class Envelope {
		
		@Getter private final @NonNull ChrislieListener listener;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @param e The exception that was raised during execution.
		 */
		public void escalateException(@NonNull ListenerException e);
		
		/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * Regular runnable but it can throw {@link ListenerException}.
	 */
	public interface ListenerRunnable {
		
		public void run() throws ListenerException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           exception will cause the dirty bit to be set.
	 */
	public default void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * Thrown to indicate failure in listener.
	 */
	public static class ListenerException extends Exception {
		
		public ListenerException(String message) {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * Thrown to indicate failure in listener.
	 */
	public static class ListenerException extends Exception {
		
		public ListenerException(String message) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString
	public static class ListenerMessage implements ServiceAttached {
		
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString
	public static class ListenerMessage implements ServiceAttached {
		
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * which invocations caused an exception to occur.
	 */
	public interface ExceptionHandler {
		
		/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           required to resolve the problem.
	 */
	public default void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	public interface ListenerRunnable {
		
		public void run() throws ListenerException;
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           not set the dirty bit.
	 */
	public default void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {}
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		}
		
		public default Optional<Object> get(String key, Type type) {
			return Optional.empty();
		}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * that multiple lookups for the same key may or may not return the same instance.
	 */
	public static interface Resolver {
		
		public default <V> Optional<V> get(String key, Class<V> clazz) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public static interface Resolver {
		
		public default <V> Optional<V> get(String key, Class<V> clazz) {
			return Optional.empty();
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private interface PlainMethod {
			
			public PlainOutput fn(PlainOutput output, String s, Object[] format);
		}
		
```

## UnnecessarySuperQualifier
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
				// section requires copying, since we can't just take a reference, this would make us modify existing ListenerReferences once we call this method a second time
				// current context flexconfg will be used as a fallback in all listener references but since this flex conf can change multiple times, we use it as a fallback, rather then a snapshot
				super.flexConf = FlexConf.fallback(ChrislieContext.this.flexConf).apply(o.flexConf()); // copies o.flexConf but adds fallback to global context flexConf
				aliasSet = new AliasSet(o.aliasSet());
				return;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			
			// otherwise we apply both the flex conf and alias set from the other listener context
			super.flexConf.apply(o.flexConf());
			aliasSet.apply(o.aliasSet());
		}
```

## DynamicRegexReplaceableByCompiledPattern
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		// shorten the input string one word at a time and find largest matching string as date
		String[] w = arg.split("\\s+");
		for (int i = w.length; i >= 0; i--) {
			try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
		
		// compile pattern from user input
		var searchPattern = com.google.re2j.Pattern.compile(matcher.group("search").replaceAll("\\\\/", "/"));
		
		// extract groups and reverse escaped slash
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
		
		// extract groups and reverse escaped slash
		String replace = matcher.group("replace").replaceAll("\\\\/", "/");
		String flags = matcher.group("flags");
		
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
		try {
			var str = IOUtils.toString(getClass().getResourceAsStream("/emoji-list.txt"), StandardCharsets.UTF_8);
			list = Arrays.asList(str.split("\\r?\\n"));
		} catch (IOException e) {
			throw new ListenerException("failed to load emoji list", e);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static String escapeStrSubstitution(String s) {
		return s.replaceAll("\\$\\{", "\\$\\${");
	}
	
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			
			summary = summary
					.replaceAll("[\n\r\u0000]", "") // remove illegal irc characters
					.trim();
			
```

## CodeBlock2Expr
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		}
		
		var httpLogger = new HttpLoggingInterceptor(s -> {
			log.trace("HTTP REQUEST: {}", s);
		});
```

## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'search' is still used
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	@GET("v3/search/{type}?device=desktop&locale=" + DEFAULT_LOCALE)
	@SuppressWarnings({"MissingDeprecatedAnnotation"})
	public Call<QwantResponse> search(
			@Path("type") String type,
			@Query("t") String t,
```

## OptionalContainsCollection
### OptionalContainsCollection
'Optional' contains collection `Map`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		@SuppressWarnings("ThisEscapedInObjectConstruction")
		private final StrSubstitutor substitutor = new StrSubstitutor(this);
		private final LoadingCache<String, Optional<Map<String, String>>> cache;
		
		public CachingSubstitutor(Invocation invocation) {
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			
			try {
				Optional<Map<String, String>> outMap = cache.get(gen);
				if (outMap.isEmpty()) {
					generatorEmpty = true;
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
					.build(new CacheLoader<>() {
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
							var generator = generators.get(key);
							
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		//noinspection UnnecessaryCodeBlock
		{ // scope fuckery to hide type fuckery, the perfect crime
			Optional<Set<String>> maybeIgnoreLines = flex.get(FLEX_FILTER, new TypeToken<Set<String>>() {}.getType());
			ignoreLines = maybeIgnoreLines.orElse(Set.of());
		}
```

## FieldAccessedSynchronizedAndUnsynchronized
### FieldAccessedSynchronizedAndUnsynchronized
Field `jda` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Getter private Chrisliebot bot;
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ctxResolver` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	private ContextResolver ctxResolver;
	
	// keeps track of which guilds we have already registered our commands
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pollTask` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private Twitter twitter;
	
	private ScheduledFuture<?> pollTask;
	private boolean shutdown;
	
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `resolver` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	private Chrisliebot bot;
	private ContextResolver resolver;
	private List<TimelineSubscription> subscriptions;
	
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bot` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private boolean shutdown;
	
	private Chrisliebot bot;
	private ContextResolver resolver;
	private List<TimelineSubscription> subscriptions;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `twitter` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	private Config cfg;
	private Twitter twitter;
	
	private ScheduledFuture<?> pollTask;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `subscriptions` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private Chrisliebot bot;
	private ContextResolver resolver;
	private List<TimelineSubscription> subscriptions;
	
	@Override
```

## RedundantFieldInitialization
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		private Instant snooze;
		
		private int snoozeCount = 0;
		private boolean deleted = false;
		
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		private int snoozeCount = 0;
		private boolean deleted = false;
		
		private Instant nextDue() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	 * Exit code that will be returned if proper shutdown occurs.
	 */
	private volatile int exitCode = 0;
	
	@Getter private final Managment managment = new Managment();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	private boolean colorSet = false;
	
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
	
	private final Optional<Color> stackTraceColor = colorFromCallstack();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	 * since we need the proper call stack for this, we have to store the color in the constructor
	 */
	private boolean colorSet = false;
	
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
```

## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	private static long decodeTimer(String s) throws IdParseException {
		s = s.toLowerCase();
		
		int out = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		while (l != 0) {
			int idx = (int) (l & ENCODER_BITMASK);
			l >>= ENCODER_ALPHABET_LOG;
			out.append(ENCODER_ALPHABET.charAt(idx));
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `guilds`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private static Multimap<String, Pattern> buildGuildMap(Map<String, List<String>> guilds) {
		if (guilds == null)
			guilds = Map.of();
		
		Multimap<String, Pattern> guildMap = HashMultimap.create();
```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
		// convert irc->chrisliebot
		if (format instanceof Format)
			format = IrcFormatter.irc2ChrislieFormat((Format) format);
		
		// convert discord->chrisliebot (since jda requires message builder for applying formatting)
```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
		// convert discord->chrisliebot (since jda requires message builder for applying formatting)
		if (format instanceof Formatting)
			format = discord2ChrislieFormat((Formatting) format);
		
		// handle chrisliebot formattings
```

### AssignmentToMethodParameter
Assignment to method parameter `invc`
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
		
		// build new context
		invc = new Invocation(
				invc.exceptionHandler(),
				invc.bot(),
```

### AssignmentToMethodParameter
Assignment to method parameter `limit`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	public List<String> split(String message, int limit) {
		// limit is broken when connected to znc, a hard coded offset should fix that
		limit += offset;
		
		if (stripIrcFormatting)
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		if (stripIrcFormatting)
			message = Format.stripAll(message);
		else
			message = C.squashFormatting(message);
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			message = Format.stripAll(message);
		else
			message = C.squashFormatting(message);
		
		// regular messages are prefixed with special byte to prevent accidental triggering of other automated services
```

### AssignmentToMethodParameter
Assignment to method parameter `limit`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			
			// when prefix is set, it will reduce the line capacity, so we need to adjust our limit accordingly
			limit -= prefix.length();
		}
		
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		// remove illegal characters
		message = message.replace("\0", "");
		
		if (stripLineBreak)
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		if (stripLineBreak)
			message = C.NEWLINE_PATTERN.matcher(message).replaceAll(" ");
		
		receiver.sendMultiLineMessage(message, this::split);
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private String applyFormats(String s, Object... formats) {
		for (Object format : formats) {
			s = formatResolver.apply(format, s);
		}
		return s;
```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
		// convert discord->chrisliebot
		if (format instanceof Formatting)
			format = DiscordFormatter.discord2ChrislieFormat((Formatting) format);
		
		// handle irc directly
```

### AssignmentToMethodParameter
Assignment to method parameter `day`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static Optional<DayOfWeek> stringToDay(@NonNull String day) {
		day = day.trim().toLowerCase();
		
		return switch (day) {
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	@SuppressWarnings("MagicNumber")
	public static String durationToString(long s) {
		s = Math.abs(s);
		
		// SirYwell hauen wenn kaputt
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
		
		// SirYwell hauen wenn kaputt
		s /= 1000;
		long days = s / (24 * 3600);
		s %= 24 * 3600;
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
		s /= 1000;
		long days = s / (24 * 3600);
		s %= 24 * 3600;
		long hours = s / 3600;
		s %= 3600;
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
		s %= 24 * 3600;
		long hours = s / 3600;
		s %= 3600;
		long minutes = s / 60;
		long seconds = s % 60;
```

### AssignmentToMethodParameter
Assignment to method parameter `flex`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	
	private static FlexConf instanceFlexConf(GsonValidator gson, Map<String, JsonElement> flex) {
		flex = flex == null ? Map.of() : flex;
		return JsonFlexConfResolver.of(gson, Collections.unmodifiableMap(flex));
	}
```

## RegExpSimplifiable
### RegExpSimplifiable
`[g]` can be simplified to 'g'
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
public class SedListener implements ChrislieListener {
	
	private static final Pattern SED_PATTERN = Pattern.compile("^s/(?<search>([^/]|\\\\/)+)/(?<replace>([^/]|\\\\/)*)/(?<flags>[g]*)$");
	
	private Cache<ChannelIdentifier, CircularFifoQueue<StoredMessage>> backlog = CacheBuilder.newBuilder().build();
```

## ReturnNull
### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			public String mediaUrl(GsonValidator gson) {
				if (media == null || media.isJsonNull())
					return null;
				
				if (media.isJsonPrimitive()) {
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
					var array = media.getAsJsonArray();
					if (array.size() == 0) {
						return null;
					}
					
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				}
				
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
				if (outMap.isEmpty()) {
					generatorEmpty = true;
					return null;
				}
				
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
				return value == null ? "UNKOWN_LOOKUP(" + key + ")" : value;
			} catch (ExecutionException e) {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
			
			if (lines.isEmpty())
				return null;
			
			var idx = ThreadLocalRandom.current().nextInt(lines.size());
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
		} catch (PatternSyntaxException e) {
			ErrorOutputBuilder.generic("Fehler in Suchmuster: " + e.getDescription()).write(invc).send();
			return null; // we simply return no result
		}
	}
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
				replace = tmp;
			else if (replace != tmp) // check if set changed from replacement to incremental or vice versa
				return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	public static Map<String, Map<Long, Map<String, List<MensaApiMeal>>>> unfuck(GsonValidator gson, JsonElement json) {
		if (json == null)
			return null;
		
		try {
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	public static String stripHtml(String html) {
		if (html == null)
			return null;
		return Jsoup.parse(html).text();
	}
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	public static String squashFormatting(String s) {
		if (s == null)
			return null;
		
		// TODO: takes the input string and attempts to reduce the amount of format codes by merging overlapping or unused definitions
```

### ReturnNull
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	public ChrislieOutput apply(ChrislieOutput output, Function<String, String> transform) {
		// we don't want caller to handle null values, so instead we simply handle these with our own lambda
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
		
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
```

## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`array.size() == 0` can be replaced with 'array.isEmpty()'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				if (media.isJsonArray()) {
					var array = media.getAsJsonArray();
					if (array.size() == 0) {
						return null;
					}
```

## ConstantConditions
### ConstantConditions
Condition `patterns == null` is always `false`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		
		var patterns = guildMap.get(identifier);
		if (patterns == null)
			return Optional.empty();
		
```

### ConstantConditions
Method invocation `getRoles` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		// ignore member on whitelist
		for (Role role : ev.getMember().getRoles()) {
			if (cfg.whitelist.contains(role.getIdLong())) {
				return;
```

### ConstantConditions
Method invocation `output` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
					reply.title("Haskell ist Liebe");
					reply.thumbnail("https://chrisliebot.chrisliebaer.de/haskell_logo.png");
					reply.description(d -> d.appendEscape(result.output(), ChrislieFormat.BLOCK));
					
					if (result.returncode() != 0) {
```

### ConstantConditions
Method invocation `returncode` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
					reply.description(d -> d.appendEscape(result.output(), ChrislieFormat.BLOCK));
					
					if (result.returncode() != 0) {
						reply.footer("Das hat leider nicht geklappt");
						reply.markAsError();
```

### ConstantConditions
Method invocation `hasPermission` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				var textChannel = (TextChannel) channel;
				var selfMember = textChannel.getGuild().getMember(textChannel.getJDA().getSelfUser());
				canUpload = selfMember.hasPermission(textChannel, Permission.MESSAGE_ATTACH_FILES);
			}
			
```

### ConstantConditions
Argument `getClass().getResourceAsStream("/emoji-list.txt")` might be null
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		try {
			var str = IOUtils.toString(getClass().getResourceAsStream("/emoji-list.txt"), StandardCharsets.UTF_8);
			list = Arrays.asList(str.split("\\r?\\n"));
		} catch (IOException e) {
```

### ConstantConditions
Method invocation `data` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		// remove older entries
		feed.data().children().removeIf(c -> c.data().createdUtc() <= lastTimestamp);
		
		// update last timestamp
```

### ConstantConditions
Condition `metaOgTitle != null` is always `true`
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			// but prefer open graph
			Elements metaOgTitle = doc.select("meta[property=og:title]");
			if (metaOgTitle != null) {
				var ogTitle = metaOgTitle.attr("content");
				summary = ogTitle.isEmpty() ? summary : ogTitle;
```

### ConstantConditions
Condition `metaOgDescription != null` is always `true`
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			// and try to also append open graph description
			Elements metaOgDescription = doc.select("meta[property=og:description]");
			if (metaOgDescription != null) {
				var ogDescription = metaOgDescription.attr("content");
				summary += ogDescription.isEmpty() ? "" : (" - " + ogDescription);
```

## BoundedWildcard
### BoundedWildcard
Can generalize to `? extends User`
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuery(ActorPrivateMessageEventBase<User> ev) {
		if (ev instanceof PrivateMessageEvent) {
			logMessage(new Date(), ev.getTarget(), ev.getActor(), ev.getMessage(), MessageType.NORMAL);
```

### BoundedWildcard
Can generalize to `? extends User`
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logChannel(ActorChannelMessageEventBase<User> ev) {
		MessageType type = null;
		if (ev instanceof ChannelCtcpEvent) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	}
	
	private void addMention(String s, Pattern pattern, Consumer<String> callback) {
		var matcher = pattern.matcher(s);
		while (matcher.find()) {
```

### BoundedWildcard
Can generalize to `? super User`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	}
	
	public Optional<User> findUser(Predicate<User> predicate, Stream<User> userStream) {
		return userStream
				.filter(predicate)
```

### BoundedWildcard
Can generalize to `? super PlainOutput.PlainOutputSubstituion`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput convert(Consumer<PlainOutput.PlainOutputSubstituion> out) {
		out.accept(convert());
		return this;
```

### BoundedWildcard
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
```

### BoundedWildcard
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput replace(Consumer<PlainOutput> out) {
		out.accept(replace());
		return this;
```

### BoundedWildcard
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput description(Consumer<PlainOutput> out) {
		out.accept(description());
		return this;
```

### BoundedWildcard
Can generalize to `? extends Selector`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	protected CombinationSelector(List<Selector> selectors, Operation operation) {
		Preconditions.checkArgument(!selectors.isEmpty(), "selector list must no be empty");
		
```

### BoundedWildcard
Can generalize to `? super Selector`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAllOr(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (fn.apply(selector, in))
```

### BoundedWildcard
Can generalize to `? super Selector`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAllAnd(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (!fn.apply(selector, in))
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	}
	
	private static Multimap<String, Pattern> buildGuildMap(Map<String, List<String>> guilds) {
		if (guilds == null)
			guilds = Map.of();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	};
	
	public IrcOutput(@NonNull Function<String, String> escaper, @NonNull Consumer<String> sink) {
		this.escaper = escaper;
		this.sink = sink;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> Optional<V> of(String name, Function<String, V> convert) {
		return get(name, s -> Optional.of(s).map(convert), Optional.empty());
	}
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> Optional<V> of(String name, Function<String, V> convert) {
		return get(name, s -> Optional.of(s).map(convert), Optional.empty());
	}
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
public class SystemProperty<T> {
	
	private static <T> T get(@NonNull String name, Function<String, T> fn, T def) {
		Preconditions.checkArgument(!name.isBlank(), "name must not be blank");
		var v = System.getProperty(name);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
public class SystemProperty<T> {
	
	private static <T> T get(@NonNull String name, Function<String, T> fn, T def) {
		Preconditions.checkArgument(!name.isBlank(), "name must not be blank");
		var v = System.getProperty(name);
```

### BoundedWildcard
Can generalize to `? super ChrislieParser`
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
			this.selector = selector;
		}
```

### BoundedWildcard
Can generalize to `? extends TokenSelector`
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
			this.selector = selector;
		}
```

### BoundedWildcard
Can generalize to `? extends Status`
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	}
	
	private void postTweets(TimelineSubscription sub, List<Status> tweets) throws ListenerException {
		if (tweets.isEmpty())
			return;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	}
	
	private static void ensureDisjoint(Set<String> set, Set<String> serviceKeys) {
		for (String s : serviceKeys) {
			if (set.contains(s))
```

### BoundedWildcard
Can generalize to `? extends ListenerReference`
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
		this.name = name;
		this.flexConf = flexConf;
```

### BoundedWildcard
Can generalize to `? extends ChrislieGroup`
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public void addGroups(Collection<ChrislieGroup> groups) {
		groups.forEach(this::addGroup);
	}
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private List<Supplier<String>> calls = new ArrayList<>();
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
						   @NonNull BiFunction<Object, String, String> formatResolver) {
		this.escaper = escaper;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
						   @NonNull BiFunction<Object, String, String> formatResolver) {
		this.escaper = escaper;
		this.formatResolver = formatResolver;
```

### BoundedWildcard
Can generalize to `? extends ChrislieGroup`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/ScopeMapping.java`
#### Snippet
```java
	@Getter private List<ChrislieGroup> groups;
	
	public ScopeMapping(List<Selector> selectors, List<ChrislieGroup> groups) {
		super(selectors, Operation.AND);
		this.groups = ImmutableList.copyOf(groups);
```

### BoundedWildcard
Can generalize to `? extends ScopeMapping`
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
	@Getter private Set<ChrislieListener.Envelope> envelopes;
	
	public ContextResolver(@NonNull List<ScopeMapping> mappings) {
		this.mappings = Collections.unmodifiableList(mappings);
		
```

### BoundedWildcard
Can generalize to `? super FlexConf`
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
			this.convert = convert;
			this.key = key;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
			this.convert = convert;
			this.key = key;
```

### BoundedWildcard
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public static ErrorOutputBuilder generic(Consumer<PlainOutput> outFn) {
		return new ErrorOutputBuilder().fn(out -> {
			outFn.accept(out.description());
```

### BoundedWildcard
Can generalize to `? super Edge`
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	}
	
	private boolean applyGraphSpec(Invocation invc, FlowGraph graph, String spec, Set<Edge> edgeStore) throws ListenerException, IllegalGraphException {
		var matcher = GRAPH_NODE_SPEC_PATTERN.matcher(spec);
		
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### BoundedWildcard
Can generalize to `? super ProcessExecutor`
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	}
	
	private void dispatch(Consumer<ProcessExecutor> fnPass, ChrislieOutput out, ExceptionHandler exceptionHandler) throws ListenerException {
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
```

### BoundedWildcard
Can generalize to `? super UrlPreviewListener.HistoryEntry`
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@SneakyThrows
	public GenericUrlPreview(@NonNull URL url, ChrislieListener.ListenerMessage m, Set<UrlPreviewListener.HistoryEntry> titleHistory) {
		this.url = url;
		this.m = m;
```

### BoundedWildcard
Can generalize to `? extends JsonElement`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	}
	
	private static FlexConf instanceFlexConf(GsonValidator gson, Map<String, JsonElement> flex) {
		flex = flex == null ? Map.of() : flex;
		return JsonFlexConfResolver.of(gson, Collections.unmodifiableMap(flex));
```

### BoundedWildcard
Can generalize to `? extends JsonElement`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private JsonFlexConfResolver(GsonValidator gson, Map<String, JsonElement> map) {
			this.gson = gson;
			this.map = map;
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		@Override
		public <V> Optional<V> get(String key, Class<V> clazz) {
			var val = map.get(key);
			if (val == null)
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private ChrislieGroup instanceGroup(String name, Group group, List<String> includeList) throws ConfigInitializeException {
			// check for inheritance cycle
			if (includeList.contains(name))
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	 * @return The given ChrislieOutput for method chaining.
	 */
	public ChrislieOutput apply(ChrislieOutput output, Function<String, String> transform) {
		// we don't want caller to handle null values, so instead we simply handle these with our own lambda
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private @NotNull ChrislieFormat[] formats = EMPTY_FORMATS;
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	private static void toFlatMap(Map<String, Object> map, Set<String> flexValues, ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
		var msg = m.msg();
		var channel = msg.channel();
```

## NullableProblems
### NullableProblems
Overridden methods are not annotated
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
```

## RedundantSuppression
### RedundantSuppression
Redundant suppression
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	@SuppressWarnings("resource")
	@Override
	protected void startUp() throws Exception {
		// ping database to ensure basic functionality
		try (var conn = dataSource.getConnection(); var stmt = conn.createStatement()) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiMeal.java`
#### Snippet
```java
@SuppressWarnings("MissingDeprecatedAnnotation")
@ToString
public class MensaApiMeal {
	
	@Getter private String meal;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				.build();
		
		@SuppressWarnings("resource") // warning makes no sense and is probably result of lambda usage
				OkHttpClient client = bot.sharedResources().httpClient()
				.newBuilder().addNetworkInterceptor(
						c -> c.proceed(c.request()
								.newBuilder()
								.header("User-Agent", C.UA_CHROME).build())).build();
		
		Retrofit retrofit = new Retrofit.Builder()
```

### RedundantSuppression
Redundant suppression
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	@GET("v3/search/{type}?device=desktop&locale=" + DEFAULT_LOCALE)
	@SuppressWarnings({"MissingDeprecatedAnnotation"})
	public Call<QwantResponse> search(
			@Path("type") String type,
			@Query("t") String t,
```

