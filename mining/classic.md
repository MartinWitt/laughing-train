# classic 
 
# Bad smells
I found 363 bad smells with 194 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 194 | true |
| FieldMayBeFinal | 96 | false |
| NullableProblems | 34 | false |
| BlockingMethodInNonBlockingContext | 12 | false |
| DataFlowIssue | 7 | false |
| ConstantValue | 4 | false |
| JavadocDeclaration | 3 | false |
| NonFinalFieldInEnum | 3 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RedundantCast | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| DuplicatedCode | 1 | false |
| RegExpSimplifiable | 1 | false |
| BusyWait | 1 | false |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=UnnecessaryModifier]
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
	 * @return The display name which should be used to talk about the user in human facing messages.
	 */
	public String displayName();
	
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
	 * blocked us or we are otherwise unable to contact user.
	 */
	public Optional<? extends ChrislieChannel> directMessage();
}

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
	}
	
	public static String removeBrackets(String definition) {
		StringSubstitutor strSub = new StringSubstitutor(key -> key, "[", "]", '\\');
		return strSub.replace(definition);
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
	public ChrislieOutput author(String name);
	
	public ChrislieOutput authorUrl(String url);
	
	public ChrislieOutput authorIcon(String url);
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
	
	public void send(); // TODO: implement callback for message transmission
	
	private static void plainSimpleSet(String s, PlainOutput plainOutput) {
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
public interface ChrislieOutput {
	
	public ChrislieOutput title(String title, String url);
	
	public default ChrislieOutput title(String title) {
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
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
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
	
	public PlainOutput plain();
	
	public default ChrislieOutput plain(String s) {
```

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
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
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
	public ChrislieOutput image(String url);
	
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
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
	
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
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
	}
	
	public PlainOutput.PlainOutputSubstituion convert();
	
	public default ChrislieOutput convert(String s) {
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
	public ChrislieOutput authorIcon(String url);
	
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
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
	 * @return A ChrislieOutput instance that can be used to post to this channel.
	 */
	public ChrislieOutput output(LimiterConfig limiterConfig);
	
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
	 * @return The display name which should be used to refer to this channel in human facing messages.
	 */
	public String displayName();
	
	/**
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
	public default ChrislieOutput output(LimiterConfig limiterConfig) {
		return new DiscordChannelOutput(service(), messageChannel());
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
	
	@Override
	public Optional<DiscordGuild> guild();
	
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
	
	@GET("general/")
	public Call<MensaApiMeta> getMeta(@Header("Authorization") String credentials);
	
	@GET("canteen/")
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
	@GET("v3/search/{type}?device=desktop&locale=" + DEFAULT_LOCALE)
	@SuppressWarnings({"MissingDeprecatedAnnotation"})
	public Call<QwantResponse> search(
			@Path("type") String type,
			@Query("t") String t,
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
	 *                           anything but this exception will cause the dirty bit to be set.
	 */
	public default void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	
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
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	private interface OutputFunction {
		
		public void out(ChrislieOutput out);
	}
	
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
	@Headers("Content-Type: application/json")
	@POST("rpc")
	public Call<Output> runHaskell(@Body Param param);
	
	@Data
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
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
	
	/**
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
	public boolean check(ChrislieService service);
	
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
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
	public boolean check(ChrislieMessage message);
	
	public boolean check(ChrislieUser user);
	
	public boolean check(ChrislieChannel channel);
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
	 * @param s       The string to reply with.
	 */
	public default void reply(LimiterConfig limiter, String s) throws ChrislieListener.ListenerException {
		reply(limiter).plain(s).send();
	}
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
	public ChrislieUser user();
	
	public String message();
	
	/**
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
	 * @return An ouput instance for the channel that this message was received in.
	 */
	public default ChrislieOutput reply(LimiterConfig limiter) {
		return channel().output(limiter);
	}
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
	public PlainOutput append(String s, Object... format);
	
	public PlainOutput appendEscape(String s, Object... format);
	
	public PlainOutput newLine();
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
		
		@Override
		public PlainOutputSubstituion append(String s, Object... format);
		
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
	}
	
	public interface PlainOutputSubstituion extends PlainOutput {
		
		public PlainOutputSubstituion appendSub(String s, Object... format);
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
		public PlainOutputSubstituion newLine();
		
		@Override
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
	public PlainOutput appendEscape(String s, Object... format);
	
	public PlainOutput newLine();
	
	public PlainOutput clear();
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
		
		@Override
		public PlainOutputSubstituion appendEscape(String s, Object... format);
		
		@Override
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
	 * @return Unique indentifier of this service.
	 */
	public String identifier();
	
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
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private interface PlainMethod {
			
			public PlainOutput fn(PlainOutput output, String s, Object[] format);
		}
		
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getRoles` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		// ignore member on whitelist
		for (Role role : ev.getMember().getRoles()) {
			if (cfg.whitelist.contains(role.getIdLong())) {
				return;
```

### DataFlowIssue
Method invocation `output` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
					reply.title("Haskell ist Liebe");
					reply.thumbnail("https://chrisliebot.chrisliebaer.de/haskell_logo.png");
					reply.description(d -> d.appendEscape(result.output(), ChrislieFormat.BLOCK));
					
					if (result.returncode() != 0) {
```

### DataFlowIssue
Method invocation `returncode` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
					reply.description(d -> d.appendEscape(result.output(), ChrislieFormat.BLOCK));
					
					if (result.returncode() != 0) {
						reply.footer("Das hat leider nicht geklappt");
						reply.markAsError();
```

### DataFlowIssue
Method invocation `hasPermission` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				var textChannel = (TextChannel) channel;
				var selfMember = textChannel.getGuild().getMember(textChannel.getJDA().getSelfUser());
				canUpload = selfMember.hasPermission(textChannel, Permission.MESSAGE_ATTACH_FILES);
			}
			return canUpload;
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `data` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		// remove older entries
		feed.data().children().removeIf(c -> c.data().createdUtc() <= lastTimestamp);
		
		// update last timestamp
```

### DataFlowIssue
Method invocation `getAcct` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
				return false;
			
			return handle.equalsIgnoreCase(status.getAccount().getAcct());
		}
	}
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
'compareTo()' parameter `o` is not used
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	
	@Override
	public int compareTo(@NotNull FlowQuery o) {
		return from.compareTo(to);
	}
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param msg` tag description is missing
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 * This method resolves a given timer string by either calling {@link #encodeTimer(long)} or looking up alias keywords.
	 *
	 * @param msg
	 * @return
	 * @throws SQLException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 *
	 * @param msg
	 * @return
	 * @throws SQLException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 * @param msg
	 * @return
	 * @throws SQLException
	 */
	private static String resolveTimerString(ListenerMessage msg) throws SQLException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `g` to `DiscordGuild` is redundant
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
		try {
			var message = (DiscordMessage) invc.msg();
			var maybeGuild = message.channel().guild().map(g -> (DiscordGuild) g);
			if (maybeGuild.isEmpty()) {
				ErrorOutputBuilder.generic("Dieser Befehl kann nur in einer Gilde ausgeführt werden.").write(invc).send();
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `operation` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	private List<Selector> selectors;
	private Operation operation;
	
	protected enum Operation {
```

### FieldMayBeFinal
Field `selectors` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
public class CombinationSelector implements Selector {
	
	private List<Selector> selectors;
	private Operation operation;
	
```

### FieldMayBeFinal
Field `map` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	
	private boolean parsed; // used to indicate that parse() has been called
	private Map<String, OptionContainer> map = new HashedMap<>();
	
	
```

### FieldMayBeFinal
Field `whitelist` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		private boolean sendDm; // sends dm instead of writing in channel (
		@NotNull private SerializedOutput output; // supports ${server} ${mention} ${user} ${channel}
		@NotNull private List<Long> whitelist = List.of(); // role ids to be excluded
	}
	
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Getter private MessageReceivedEvent ev;
	
	@Getter private DiscordChannel channel;
	
	public DiscordMessage(@NonNull DiscordService service, @NonNull MessageReceivedEvent ev) {
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
public class DiscordMessage implements ChrislieMessage {
	
	@Getter private DiscordService service;
	@Getter private MessageReceivedEvent ev;
	
```

### FieldMayBeFinal
Field `ev` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	
	@Getter private DiscordService service;
	@Getter private MessageReceivedEvent ev;
	
	@Getter private DiscordChannel channel;
```

### FieldMayBeFinal
Field `parser` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EE dd.MM.yyyy HH:mm:ss", Locale.GERMAN);
	
	private Parser parser = new Parser();
	
	@Override
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Getter private DiscordService service;
	@Getter private User user;
	
	public DiscordUser(@NonNull DiscordService service, @NonNull User user) {
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
public class DiscordUser implements ChrislieUser {
	
	@Getter private DiscordService service;
	@Getter private User user;
	
```

### FieldMayBeFinal
Field `titleHistory` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	// This cache is used to track the posted titles if website provides poor title and opengraph tags
	private Set<HistoryEntry> titleHistory = Collections.newSetFromMap(CacheBuilder.newBuilder()
			.expireAfterAccess(URL_EXPIRE_TIME, TimeUnit.MILLISECONDS)
			.maximumSize(URL_MAX_HISTORY)
```

### FieldMayBeFinal
Field `urlHistory` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	// This cache is used to track urls that are posted multiple times. It's basically a set.
	private Set<HistoryEntry> urlHistory = Collections.newSetFromMap(CacheBuilder.newBuilder()
			.expireAfterAccess(URL_EXPIRE_TIME, TimeUnit.MILLISECONDS)
			.maximumSize(URL_MAX_HISTORY)
```

### FieldMayBeFinal
Field `titleHistory` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	private URL url;
	private ChrislieListener.ListenerMessage m;
	private Set<UrlPreviewListener.HistoryEntry> titleHistory;
	
	@SneakyThrows
```

### FieldMayBeFinal
Field `url` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	private ScheduledExecutorService timer;
	
	private URL url;
	private ChrislieListener.ListenerMessage m;
	private Set<UrlPreviewListener.HistoryEntry> titleHistory;
```

### FieldMayBeFinal
Field `m` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	private URL url;
	private ChrislieListener.ListenerMessage m;
	private Set<UrlPreviewListener.HistoryEntry> titleHistory;
	
```

### FieldMayBeFinal
Field `timer` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	private OkHttpClient client;
	private ScheduledExecutorService timer;
	
	private URL url;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	private static final long PREVIEW_TIMEOUT = 10000; // cancel connection after 10 seconds even if we are still receiving data
	
	private OkHttpClient client;
	private ScheduledExecutorService timer;
	
```

### FieldMayBeFinal
Field `out` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
public class StaticGenerator implements Generator {
	
	private @NonNull String out;
	
	public StaticGenerator(@NonNull String out) {
```

### FieldMayBeFinal
Field `sink` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	// will receive all messages on sending
	private Consumer<String> sink;
	
	// used for escaping strings inside PlainOutput instances
```

### FieldMayBeFinal
Field `plain` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	// used for escaping strings inside PlainOutput instances
	private Function<String, String> escaper;
	private PlainOutputImpl plain, description;
	
	// strategy for converting received calls into irc message (default is to use title and description/plain)
```

### FieldMayBeFinal
Field `description` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	// used for escaping strings inside PlainOutput instances
	private Function<String, String> escaper;
	private PlainOutputImpl plain, description;
	
	// strategy for converting received calls into irc message (default is to use title and description/plain)
```

### FieldMayBeFinal
Field `escaper` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	// used for escaping strings inside PlainOutput instances
	private Function<String, String> escaper;
	private PlainOutputImpl plain, description;
	
```

### FieldMayBeFinal
Field `map` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	// stores values that are passed to methods we can't resolve directly
	private HashMap<String, String> map = new HashMap<>(10), fields = new HashMap<>(0);
	
	// will receive all messages on sending
```

### FieldMayBeFinal
Field `fields` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	// stores values that are passed to methods we can't resolve directly
	private HashMap<String, String> map = new HashMap<>(10), fields = new HashMap<>(0);
	
	// will receive all messages on sending
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Getter private IrcService service;
	@Getter private Channel channel;
	private IrcGuild guild;
	
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
public class IrcChannel implements ChrislieChannel {
	
	@Getter private IrcService service;
	@Getter private Channel channel;
	private IrcGuild guild;
```

### FieldMayBeFinal
Field `guild` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Getter private IrcService service;
	@Getter private Channel channel;
	private IrcGuild guild;
	
	public IrcChannel(IrcService service, Channel channel, IrcGuild guild) {
```

### FieldMayBeFinal
Field `substitutor` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
public class PlainOutputSubstituionImpl extends PlainOutputImpl implements PlainOutput.PlainOutputSubstituion {
	
	private StrSubstitutor substitutor;
	
	public PlainOutputSubstituionImpl(@NonNull Function<String, String> escaper,
```

### FieldMayBeFinal
Field `file` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	
	private boolean search;
	private File file;
	
	public FileGenerator(@NonNull Config cfg) throws ChrislieListener.ListenerException {
```

### FieldMayBeFinal
Field `ignore` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Getter private final String identifier;
	private final Multimap<String, Pattern> guildMap;
	private Set<String> ignore;
	
	@Setter private Consumer<ChrislieMessage> sink;
```

### FieldMayBeFinal
Field `search` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
public class FileGenerator implements Generator {
	
	private boolean search;
	private File file;
	
```

### FieldMayBeFinal
Field `patternCache` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	private final AtomicInteger shutdownCounter = new AtomicInteger(0);
	
	private LoadingCache<String, Pattern> patternCache = CacheBuilder.newBuilder()
			.maximumSize(10)
			.build(new CacheLoader<>() {
```

### FieldMayBeFinal
Field `resolver` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			});
	
	private ContextResolver resolver;
	
	public ChrislieDispatcher(@NonNull Chrisliebot chrisliebot, @NonNull ContextResolver resolver) {
```

### FieldMayBeFinal
Field `chrisliebot` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	private static final String DISPATCHER_PATTERN_GROUP_ARGUMENT = "argument";
	
	private Chrisliebot chrisliebot;
	
	private volatile boolean shutdown;
```

### FieldMayBeFinal
Field `mappings` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
public class ContextResolver {
	
	@Getter private List<ScopeMapping> mappings;
	@Getter private Map<String, ChrislieGroup> groups;
	@Getter private Set<ChrislieListener.Envelope> envelopes;
```

### FieldMayBeFinal
Field `message` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	@Getter private IrcUser user;
	@Getter private ChrislieChannel channel; // we have no irc abstraction that combines channels and private messages
	@Getter private String message;
	
	public IrcMessage(@NonNull IrcService service,
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
public class IrcMessage implements ChrislieMessage {
	
	@Getter private IrcService service;
	@Getter private IrcUser user;
	@Getter private ChrislieChannel channel; // we have no irc abstraction that combines channels and private messages
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	
	@Getter private IrcService service;
	@Getter private IrcUser user;
	@Getter private ChrislieChannel channel; // we have no irc abstraction that combines channels and private messages
	@Getter private String message;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	@Getter private IrcService service;
	@Getter private IrcUser user;
	@Getter private ChrislieChannel channel; // we have no irc abstraction that combines channels and private messages
	@Getter private String message;
	
```

### FieldMayBeFinal
Field `map` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		private GsonValidator gson;
		private Map<String, JsonElement> map;
		
		public static FlexConf of(GsonValidator gson, Map<String, JsonElement> map) {
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	private static final class JsonFlexConfResolver implements FlexConf.Resolver {
		
		private GsonValidator gson;
		private Map<String, JsonElement> map;
		
```

### FieldMayBeFinal
Field `groups` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/ScopeMapping.java`
#### Snippet
```java
public class ScopeMapping extends CombinationSelector {
	
	@Getter private List<ChrislieGroup> groups;
	
	public ScopeMapping(List<Selector> selectors, List<ChrislieGroup> groups) {
```

### FieldMayBeFinal
Field `gsonFactory` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	private class ValidatingRetrofitFactory extends Converter.Factory {
		
		private GsonConverterFactory gsonFactory = GsonConverterFactory.create(gson);
		
		@Nullable
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	@Getter private OkHttpClient httpClient;
	@Getter private ScheduledExecutorService timer;
	@Getter private GsonValidator gson;
	
	private MariaDbPoolDataSource dataSource;
```

### FieldMayBeFinal
Field `dataSource` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	@Getter private GsonValidator gson;
	
	private MariaDbPoolDataSource dataSource;
	
	public SharedResources(@NonNull String dataSource, @NonNull GsonValidator gson) throws SQLException {
```

### FieldMayBeFinal
Field `updateSlashCommands` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
	
	@Setter private Consumer<ChrislieMessage> sink;
```

### FieldMayBeFinal
Field `bot` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	public static final String SLASH_COMMAND_ARG_NAME = "args";
	
	@Getter private Chrisliebot bot;
	@Getter private JDA jda;
	@Getter private String identifier;
```

### FieldMayBeFinal
Field `jda` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Getter private Chrisliebot bot;
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
```

### FieldMayBeFinal
Field `identifier` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Getter private Chrisliebot bot;
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
	
```

### FieldMayBeFinal
Field `flexConf` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	private Set<ChrislieGroup> included = Collections.newSetFromMap(new IdentityHashMap<>());
	
	@Getter private FlexConf flexConf = new FlexConf();
	
	/**
```

### FieldMayBeFinal
Field `included` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	private Map<String, ListenerContext> aliases = new HashMap<>();
	
	private Set<ChrislieGroup> included = Collections.newSetFromMap(new IdentityHashMap<>());
	
	@Getter private FlexConf flexConf = new FlexConf();
```

### FieldMayBeFinal
Field `aliases` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	private Map<String, ListenerContext> listeners = new HashMap<>();
	private Map<String, ListenerContext> aliases = new HashMap<>();
	
	private Set<ChrislieGroup> included = Collections.newSetFromMap(new IdentityHashMap<>());
```

### FieldMayBeFinal
Field `listeners` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
public class ChrislieContext {
	
	private Map<String, ListenerContext> listeners = new HashMap<>();
	private Map<String, ListenerContext> aliases = new HashMap<>();
	
```

### FieldMayBeFinal
Field `key` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
	private static final class ProviderImpl<T> implements Provider<T> {
		
		private String key;
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
```

### FieldMayBeFinal
Field `convert` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		
		private String key;
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
```

### FieldMayBeFinal
Field `next` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		
		private Resolver current;
		private Resolver next;
		
		public ChainResolver(@NonNull Resolver current, @NonNull Resolver next) {
```

### FieldMayBeFinal
Field `current` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	private static class ChainResolver implements Resolver {
		
		private Resolver current;
		private Resolver next;
		
```

### FieldMayBeFinal
Field `FLEX_TIMEOUT` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
public class HaskellCommand implements ChrislieListener.Command {
	
	private static String FLEX_TIMEOUT = "haskell.timeout";
	
	private HaskellService service;
```

### FieldMayBeFinal
Field `irc` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	@Getter private String databasePool;
	
	@Getter private Map<String, IrcBootstrap> irc = Map.of();
	@Getter private Map<String, DiscordBootstrap> discord = Map.of();
	
```

### FieldMayBeFinal
Field `discord` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	
	@Getter private Map<String, IrcBootstrap> irc = Map.of();
	@Getter private Map<String, DiscordBootstrap> discord = Map.of();
	
	public void ensureDisjoint() {
```

### FieldMayBeFinal
Field `flexValues` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	private static final String ENV_PREFIX = "CB_";
	
	private Set<String> flexValues = new HashSet<>();
	
	public ExternalMessageTranslator withFlex(@NonNull String key) {
```

### FieldMayBeFinal
Field `escaper` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private static final char ESCAPE_CHARACTER = '\\';
	
	private Function<String, String> escaper;
	private BiFunction<Object, String, String> formatResolver;
	
```

### FieldMayBeFinal
Field `formatResolver` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	private Function<String, String> escaper;
	private BiFunction<Object, String, String> formatResolver;
	
	private List<Supplier<String>> calls = new ArrayList<>();
```

### FieldMayBeFinal
Field `calls` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private BiFunction<Object, String, String> formatResolver;
	
	private List<Supplier<String>> calls = new ArrayList<>();
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
```

### FieldMayBeFinal
Field `idFn` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Getter private User user;
	
	private Function<IrcUser, String> idFn;
	
	public IrcUser(IrcService service, User user) {
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Getter private IrcService service;
	@Getter private User user;
	
	private Function<IrcUser, String> idFn;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
public class IrcUser implements ChrislieUser {
	
	@Getter private IrcService service;
	@Getter private User user;
	
```

### FieldMayBeFinal
Field `backlog` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
	private static final Pattern SED_PATTERN = Pattern.compile("^s/(?<search>([^/]|\\\\/)+)/(?<replace>([^/]|\\\\/)*)/(?<flags>[g]*)$");
	
	private Cache<ChannelIdentifier, CircularFifoQueue<StoredMessage>> backlog = CacheBuilder.newBuilder().build();
	
	@Override
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Getter private IrcService service;
	@Getter private IrcUser user;
	
	public IrcPrivateChannel(IrcService service, User user) {
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	
	@Getter private IrcService service;
	@Getter private IrcUser user;
	
```

### FieldMayBeFinal
Field `out` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public static final class JoinPlainOutput implements PlainOutput {
		
		private @NonNull PlainOutput out;
		private @NonNull String delimiter;
		
```

### FieldMayBeFinal
Field `delimiter` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		private @NonNull PlainOutput out;
		private @NonNull String delimiter;
		
		private boolean pending;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
public class DiscordGuildChannel implements DiscordChannel {
	
	@Getter private DiscordService service;
	@Getter private TextChannel channel;
	
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Getter private DiscordService service;
	@Getter private TextChannel channel;
	
	public DiscordGuildChannel(@NonNull DiscordService service, @NonNull TextChannel channel) {
```

### FieldMayBeFinal
Field `generators` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		
		private @NotNull SerializedOutput output;
		private Map<String, GeneratorConfig> generators = Map.of();
	}
	
```

### FieldMayBeFinal
Field `envMap` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * Additional environment variables that are passed to the process unmodified.
		 */
		private @NotNull Map<@NotNull String, @NotNull String> envMap = Map.of();
		
		/**
```

### FieldMayBeFinal
Field `passing` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * The method that's to pass invocation arguments to process.
		 */
		private @NotNull ArgumentPassing passing = ArgumentPassing.ENV;
		
		/**
```

### FieldMayBeFinal
Field `translator` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@SuppressWarnings("FieldAccessedSynchronizedAndUnsynchronized")
	private Config cfg;
	private ExternalMessageTranslator translator = new ExternalMessageTranslator();
	
	private final List<Thread> processes = new LinkedList<>(); // we are going to join on them anyway, so no reason to get fancy with a wrapper
```

### FieldMayBeFinal
Field `exitMethod` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * The method that's used to determine if an exit code should be considered valid.
		 */
		private @NotNull ExitCodeMethod exitMethod = ExitCodeMethod.NORMAL;
		
		/**
```

### FieldMayBeFinal
Field `exitCodes` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * A list of valid exit codes.
		 */
		private @NotNull int[] exitCodes = new int[0];
		
		/**
```

### FieldMayBeFinal
Field `flex` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * specify wildcards.
		 */
		private @NotNull Set<@NotNull String> flex = Set.of();
		
		/**
```

### FieldMayBeFinal
Field `refs` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	
	@Getter @ToString.Exclude private Collection<ChrislieGroup> includes;
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
```

### FieldMayBeFinal
Field `includes` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private FlexConf flexConf;
	
	@Getter @ToString.Exclude private Collection<ChrislieGroup> includes;
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
public class ChrislieGroup {
	
	@Getter private String name;
	@Getter @ToString.Exclude private FlexConf flexConf;
	
```

### FieldMayBeFinal
Field `flexConf` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	
	@Getter private String name;
	@Getter @ToString.Exclude private FlexConf flexConf;
	
	@Getter @ToString.Exclude private Collection<ChrislieGroup> includes;
```

### FieldMayBeFinal
Field `channels` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	@Getter private String identifier;
	
	private List<Channel> channels;
	
	public IrcGuild(IrcService service, String identifier, List<Channel> channels) {
```

### FieldMayBeFinal
Field `identifier` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	
	@Getter private IrcService service;
	@Getter private String identifier;
	
	private List<Channel> channels;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
public class IrcGuild implements ChrislieGuild {
	
	@Getter private IrcService service;
	@Getter private String identifier;
	
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
public class DiscordPrivateChannel implements DiscordChannel {
	
	@Getter private DiscordService service;
	@Getter private PrivateChannel channel;
	
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	@Getter private PrivateChannel channel;
	
	private User user;
	
	public DiscordPrivateChannel(@NonNull DiscordService service, @NonNull PrivateChannel channel) {
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Getter private DiscordService service;
	@Getter private PrivateChannel channel;
	
	private User user;
```

### FieldMayBeFinal
Field `fields` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private String authorIcon;
	
	private @NotNull List<Field> fields = List.of();
	
	private String footer;
```

### FieldMayBeFinal
Field `formats` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private @NotNull PlainOutputMethod method;
		private @NotNull String content;
		private @NotNull ChrislieFormat[] formats = EMPTY_FORMATS;
		
		public void apply(PlainOutput out, Function<String, String> fn) {
```

### FieldMayBeFinal
Field `inline` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private @NotBlank String name;
		private @NotBlank String value;
		private boolean inline = true;
	}
	
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	 * entire application.
	 */
	@SuppressWarnings("resource") private GsonValidator gson = new GsonValidator(new GsonBuilder()
			.disableHtmlEscaping()
			.setPrettyPrinting()
```

### FieldMayBeFinal
Field `services` may be 'final'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	 * List of currently active services.
	 */
	private Map<String, ChrislieService> services = new HashMap<>();
	
	/**
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `code` in enum 'Type'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		NEWS("news"),
		IMAGE("images");
		private String code;
	}
	
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'SafeSearch'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		MEDIUM(1),
		HIGH(2);
		private int code;
	}
	
```

### NonFinalFieldInEnum
Non-final field `fn` in enum 'PlainOutputMethod'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
			APPEND_ESCAPE(PlainOutput::appendEscape);
			
			private PlainMethod fn;
		}
		
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
		var maybeChannel = sub.channel.channel(bot);
		if (maybeChannel.isEmpty()) {
			log.warn("could not find channel for subscription {}", sub);
			return;
		}
		
		var ctx = resolver.resolve(Selector::check, maybeChannel.get());
		var maybeRef = ctx.listener(this);
		if (maybeRef.isEmpty()) {
			log.warn("no listener ref found in channel for subscrition {}", sub);
			return;
		}
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[g]` can be simplified to 'g'
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
public class SedListener implements ChrislieListener {
	
	private static final Pattern SED_PATTERN = Pattern.compile("^s/(?<search>([^/]|\\\\/)+)/(?<replace>([^/]|\\\\/)*)/(?<flags>[g]*)$");
	
	private Cache<ChannelIdentifier, CircularFifoQueue<StoredMessage>> backlog = CacheBuilder.newBuilder().build();
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
				log.warn("error during websocket connection, reconnecting", e);
				try {
					Thread.sleep(RETRY_SLEEP);
				} catch (InterruptedException ignore) {
					Thread.currentThread().interrupt();
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<DefinitionList> call, Response<DefinitionList> response) {
				assert response.body() != null; // jesus shut up
				var defs = response.body().list();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<DefinitionList> call, Response<DefinitionList> response) {
				assert response.body() != null; // jesus shut up
				var defs = response.body().list();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<DefinitionList> call, Throwable t) {
				ErrorOutputBuilder.remoteRequest(call.request(), t).write(reply).send();
			}
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<DefinitionList> call, Throwable t) {
				ErrorOutputBuilder.remoteRequest(call.request(), t).write(reply).send();
			}
```

### NullableProblems
Overridden methods are not annotated
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	
	@Override
	protected Scheduler scheduler() {
		return scheduler;
	}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@Override
	public void onResponse(Call call, Response response) throws IOException {
		
		// check for mime type
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@Override
	public void onFailure(Call call, IOException e) {
		if (!e.getMessage().isEmpty())
			log.debug("failed to connect to {}: {}", url, e.getMessage());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutput description() {
		return description;
	}
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			.build(new CacheLoader<>() {
				@Override
				public Pattern load(String key) {
					return Pattern.compile(key);
				}
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			.build(new CacheLoader<>() {
				@Override
				public Pattern load(String key) {
					return Pattern.compile(key);
				}
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<QwantResponse> c, Response<QwantResponse> resp) {
				QwantResponse body = resp.body();
				if (!resp.isSuccessful() || (body != null && !"success".equals(body.status()))) { // bad error code or "error" in status field of json
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<QwantResponse> c, Response<QwantResponse> resp) {
				QwantResponse body = resp.body();
				if (!resp.isSuccessful() || (body != null && !"success".equals(body.status()))) { // bad error code or "error" in status field of json
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<QwantResponse> c, Throwable t) {
				ErrorOutputBuilder.remoteRequest(c.request(), t).write(reply).send();
			}
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<QwantResponse> c, Throwable t) {
				ErrorOutputBuilder.remoteRequest(c.request(), t).write(reply).send();
			}
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
			Converter<ResponseBody, ?> converter = gsonFactory.responseBodyConverter(type, annotations, retrofit);
			return body -> validate(converter.convert(body));
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
			Converter<ResponseBody, ?> converter = gsonFactory.responseBodyConverter(type, annotations, retrofit);
			return body -> validate(converter.convert(body));
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
			Converter<ResponseBody, ?> converter = gsonFactory.responseBodyConverter(type, annotations, retrofit);
			return body -> validate(converter.convert(body));
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public RequestBody convert(T value) throws IOException {
			return null;
		}
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
			Converter<?, RequestBody> converter = gsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
			return value -> validate(converter.convert(C.unsafeCast(value))); // type compatibility is upheld by retrofit
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
			Converter<?, RequestBody> converter = gsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
			return value -> validate(converter.convert(C.unsafeCast(value))); // type compatibility is upheld by retrofit
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
			Converter<?, RequestBody> converter = gsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
			return value -> validate(converter.convert(C.unsafeCast(value))); // type compatibility is upheld by retrofit
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
			Converter<?, RequestBody> converter = gsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
			return value -> validate(converter.convert(C.unsafeCast(value))); // type compatibility is upheld by retrofit
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<HaskellService.Output> call, Response<HaskellService.Output> response) {
				if (!response.isSuccessful()) {
					invc.exceptionHandler().unwrap(() -> ErrorOutputBuilder.remoteErrorCode(call.request(), response).write(invc).send());
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<HaskellService.Output> call, Response<HaskellService.Output> response) {
				if (!response.isSuccessful()) {
					invc.exceptionHandler().unwrap(() -> ErrorOutputBuilder.remoteErrorCode(call.request(), response).write(invc).send());
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<HaskellService.Output> call, Throwable t) {
				invc.exceptionHandler().escalateException(new ListenerException("failed to contact haskell backend", t));
			}
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<HaskellService.Output> call, Throwable t) {
				invc.exceptionHandler().escalateException(new ListenerException("failed to contact haskell backend", t));
			}
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
					.build(new CacheLoader<>() {
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
							var generator = generators.get(key);
							
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
					.build(new CacheLoader<>() {
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
							var generator = generators.get(key);
							
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	protected ExternalCommandListener.@NonNull @org.checkerframework.checker.nullness.qual.NonNull Config externalConfig() {
		return cfg.ext;
	}
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			
			@Override
			public void failed(State from, Throwable failure) {
				log.error("Chrisliebot has encountered a critical error during `{}` and will now terminate the process", from, failure);
				System.exit(EXIT_CODE_ERROR);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			
			@Override
			public void failed(State from, Throwable failure) {
				log.error("Chrisliebot has encountered a critical error during `{}` and will now terminate the process", from, failure);
				System.exit(EXIT_CODE_ERROR);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			
			@Override
			public void stopping(State from) {
				log.info("Chrisliebot is transitioning to termination (was {})", from);
			}
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			
			@Override
			public void terminated(State from) {
				log.info("Chrisliebot has terminated (was {})", from);
				System.exit(bot.exitCode);
```

## RuleId[id=ConstantValue]
### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `patterns == null` is always `false`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		
		var patterns = guildMap.get(identifier);
		if (patterns == null)
			return Optional.empty();
		
```

### ConstantValue
Condition `url == null` is always `false`
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
				var status = gson.fromJson(msg.payload, Status.class);
				var url = status.getUrl();
				if (url == null || url.isEmpty())
					return;
				
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
public class HaskellCommand implements ChrislieListener.Command {
	
	private static String FLEX_TIMEOUT = "haskell.timeout";
	
	private HaskellService service;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static String squashFormatting(String s) {
		if (s == null)
			return null;
		
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
		var future = user.openPrivateChannel().submit();
		try {
			var channel = future.get();
			return Optional.of(new DiscordPrivateChannel(service, channel));
		} catch (InterruptedException ignore) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
			try (var in = getClass().getResourceAsStream(VERSION_FILE_PATH)) {
				if (in != null)
					properties.load(in);
			}
		} catch (@SuppressWarnings("OverlyBroadCatchBlock") Exception e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		synchronized (shutdownCounter) {
			while (shutdownCounter.get() != 0)
				shutdownCounter.wait();
		}
	}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			var future = user.openPrivateChannel().submit();
			try {
				var channel = future.get();
				return Optional.of(new DiscordPrivateChannel(this, channel));
			} catch (InterruptedException ignore) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	private void registerCommandsOnGuild(Guild guild) throws ExecutionException, InterruptedException, TimeoutException {
		
		var existing = guild.retrieveCommands().submit().get().stream().map(Command::getName).collect(Collectors.toSet());
		
		var update = guild.updateCommands();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		if (!existing.isEmpty() || !neww.isEmpty()) {
			log.trace("updating commands for {}: (new: {}, removed: {}) {} total", chrislieGuild, neww, existing, commandDatas.size());
			update.addCommands(commandDatas).submit().get(5, TimeUnit.MINUTES);
		} else {
			log.trace("guild {} is already in sync", guild);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		// wait for shutdown event to occur
		try {
			helper.latch.await();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
					// inform user that we are processing request
					try {
						channel.sendTyping().submit().get(200, TimeUnit.MILLISECONDS); // attempt to wait for short period to reduce bugged typing states
					} catch (InterruptedException | ExecutionException | TimeoutException ignore) {
					}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		try {
			for (var t : l)
				t.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
		// wait for websocket to signal end
		try {
			while(!latch.await(1, TimeUnit.HOURS)) {
				// mastodon is unable to handle long-lived connections, so we need to reconnect periodically
				log.info("closing websocket to refresh connection");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
				log.warn("error during websocket connection, reconnecting", e);
				try {
					Thread.sleep(RETRY_SLEEP);
				} catch (InterruptedException ignore) {
					Thread.currentThread().interrupt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/chrisliebaer/chrisliebot/command/mastodon/MastodonTimelineNotifier.java`
#### Snippet
```java
	protected void shutDown() throws Exception {
		thread.interrupt();
		thread.join();
	}
	
```

