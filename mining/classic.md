# classic 
 
# Bad smells
I found 320 bad smells with 198 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryModifier] | 194 | true |
| RuleId[ruleID=BoundedWildcard] | 44 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 20 | false |
| RuleId[ruleID=ReturnNull] | 12 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 7 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 6 | false |
| RuleId[ruleID=DataFlowIssue] | 6 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 5 | false |
| RuleId[ruleID=OptionalContainsCollection] | 4 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 4 | true |
| RuleId[ruleID=RedundantSuppression] | 4 | false |
| RuleId[ruleID=ConstantValue] | 3 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 2 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 2 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=ComparatorMethodParameterNotUsed] | 1 | false |
| RuleId[ruleID=CodeBlock2Expr] | 1 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 1 | false |
| RuleId[ruleID=RegExpSimplifiable] | 1 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 1 | false |
| RuleId[ruleID=NullableProblems] | 1 | false |
## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'value'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		private final Function<ChrislieParser, TokenSelector> selector;
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'stackTraceColor'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
	
	private final Optional<Color> stackTraceColor = colorFromCallstack();
	
	@Override
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `help()` only delegates to its super method
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Command.super.help(ctx, ref);
	}
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * blocked us or we are otherwise unable to contact user.
	 */
	public Optional<? extends ChrislieChannel> directMessage();
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * @return The display name which should be used to talk about the user in human facing messages.
	 */
	public String displayName();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * @return An internal identifier of a user. Should be used when storing user associated data.
	 */
	public String identifier();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieUser.java`
#### Snippet
```java
	 * @return The string that should be used to {@code ping} the user.
	 */
	public String mention();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceBootstrap.java`
#### Snippet
```java
	 * @return A configured and fully functional {@link ChrislieService}.
	 */
	public ChrislieService service(Chrisliebot chrisliebot, String identifier) throws Exception;
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput convert(Consumer<PlainOutput.PlainOutputSubstituion> out) {
		out.accept(convert());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public ChrislieOutput image(String url);
	
	public ChrislieOutput thumbnail(String url);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public default void markAsError() {}
	
	public ChrislieOutput color(Color color);
	
	public ChrislieOutput color(int color);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public ChrislieOutput footer(String text, String iconUrl);
	
	public default ChrislieOutput footer(String text) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public PlainOutput.PlainOutputSubstituion convert();
	
	public default ChrislieOutput convert(String s) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default void markAsError() {}
	
	public ChrislieOutput color(Color color);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
		plainSimpleSet(s, replace());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput image(String url);
	
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput color(Color color);
	
	public ChrislieOutput color(int color);
	
	public ChrislieOutput author(String name);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput footer(String text, String iconUrl);
	
	public default ChrislieOutput footer(String text) {
		return footer(text, null);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput author(String name);
	
	public ChrislieOutput authorUrl(String url);
	
	public ChrislieOutput authorIcon(String url);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput authorIcon(String url);
	
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
public interface ChrislieOutput {
	
	public ChrislieOutput title(String title, String url);
	
	public default ChrislieOutput title(String title) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput.PlainOutputSubstituion convert();
	
	public default ChrislieOutput convert(String s) {
		convert().clear().appendEscapeSub(s);
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public PlainOutput plain();
	
	public default ChrislieOutput plain(String s) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput title(String title, String url);
	
	public default ChrislieOutput title(String title) {
		return title(title, null);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput color(int color);
	
	public ChrislieOutput author(String name);
	
	public ChrislieOutput authorUrl(String url);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput replace(Consumer<PlainOutput> out) {
		out.accept(replace());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput plain();
	
	public default ChrislieOutput plain(String s) {
		plainSimpleSet(s, plain());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
		plainSimpleSet(s, description());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public void send(); // TODO: implement callback for message transmission
	
	private static void plainSimpleSet(String s, PlainOutput plainOutput) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
		return field(field, value, true);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput authorUrl(String url);
	
	public ChrislieOutput authorIcon(String url);
	
	public ChrislieOutput field(String field, String value, boolean inline);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput description(Consumer<PlainOutput> out) {
		out.accept(description());
		return this;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
		
		@NotNull
		public String parse(ChrislieParser parser) throws ChrislieParser.ParserException;
	}
}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return An optional guild, if this channel is part of a guild.
	 */
	public Optional<? extends ChrislieGuild> guild();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A list of all users that are currently in this channel.
	 */
	public List<? extends ChrislieUser> users();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return The display name which should be used to refer to this channel in human facing messages.
	 */
	public String displayName();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return {@code true} if this channel represents a one to one communication.
	 */
	public boolean isDirectMessage();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A potential user that this call name might refer to.
	 */
	public Optional<? extends ChrislieUser> resolve(String callName);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return An internal identifier of this channel. Should be used when storing channel associated data.
	 */
	public String identifier();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A ChrislieOutput instance that can be used to post to this channel.
	 */
	public ChrislieOutput output(LimiterConfig limiterConfig);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	private interface OptionContainer {
		
		public void visit(ChrislieParser parser) throws OptionsMapException, ChrislieParser.ParserException;
	}
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private interface PlainMethod {
			
			public PlainOutput fn(PlainOutput output, String s, Object[] format);
		}
		
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @return {@code true} if the token was successfully parsed.
	 */
	public boolean isSuccess();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @return Wraps the value of this class into an {@link Optional}.
	 */
	public Optional<String> optional();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	}
	
	public static OptionalToken empty(ParserException throwable, ChrislieParser parser) {
		return new NoToken(throwable, parser);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	}
	
	public static OptionalToken of(String value) {
		return new ValueToken(value);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @throws ParserException The exception that was raised while parsing the token.
	 */
	public String expect() throws ParserException;
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class ValueToken implements OptionalToken {
		
		private final String value;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class ValueToken implements OptionalToken {
		
		private final String value;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 *                         via the message parameter.
	 */
	public String expect(String msg) throws ParserException;
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class NoToken implements OptionalToken {
		
		@Getter private final ParserException throwable;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class NoToken implements OptionalToken {
		
		@Getter private final ParserException throwable;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @throws NoSuchElementException If the token was successfully parsed and thous no exception was raised.
	 */
	public ParserException throwable() throws NoSuchElementException;
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput newLine();
	
	public PlainOutput clear();
	
	public default JoinPlainOutput joiner(String delimiter) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class PlainOutputDummy implements PlainOutputSubstituion {
		
		private static final PlainOutputDummy DUMMY = new PlainOutputDummy();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class PlainOutputDummy implements PlainOutputSubstituion {
		
		private static final PlainOutputDummy DUMMY = new PlainOutputDummy();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion appendEscape(String s, Object... format);
		
		@Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion newLine();
		
		@Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput append(String s, Object... format);
	
	public PlainOutput appendEscape(String s, Object... format);
	
	public PlainOutput newLine();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput appendEscape(String s, Object... format);
	
	public PlainOutput newLine();
	
	public PlainOutput clear();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class JoinPlainOutput implements PlainOutput {
		
		private @NonNull PlainOutput out;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public static final class JoinPlainOutput implements PlainOutput {
		
		private @NonNull PlainOutput out;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
public interface PlainOutput {
	
	public PlainOutput append(String s, Object... format);
	
	public PlainOutput appendEscape(String s, Object... format);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion append(String s, Object... format);
		
		@Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		public PlainOutputSubstituion appendSub(String s, Object... format);
		
		public PlainOutputSubstituion appendEscapeSub(String s, Object... format);
		
		@Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion clear();
	}
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	
	@SuppressWarnings("ClassReferencesSubclass")
	public static PlainOutputSubstituion dummy() {
		return PlainOutputDummy.DUMMY;
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	}
	
	public interface PlainOutputSubstituion extends PlainOutput {
		
		public PlainOutputSubstituion appendSub(String s, Object... format);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public interface PlainOutputSubstituion extends PlainOutput {
		
		public PlainOutputSubstituion appendSub(String s, Object... format);
		
		public PlainOutputSubstituion appendEscapeSub(String s, Object... format);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput clear();
	
	public default JoinPlainOutput joiner(String delimiter) {
		return new JoinPlainOutput(this, delimiter);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceAttached.java`
#### Snippet
```java
public interface ServiceAttached {
	
	public ChrislieService service();
	
	public default Chrisliebot bot() {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceAttached.java`
#### Snippet
```java
	public ChrislieService service();
	
	public default Chrisliebot bot() {
		return service().bot();
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return A user that represents the online identity of this service itself.
	 */
	public ChrislieUser botUser();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return An optional containing the user if the given identifier could be resolved.
	 */
	public Optional<? extends ChrislieUser> user(String identifier);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return This service for method chaining.
	 */
	public ChrislieService sink(@Nullable Consumer<ChrislieMessage> sink);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	public Chrisliebot bot();
	
	public static class ServiceException extends Exception {
		
		public ServiceException() {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	public Chrisliebot bot();
	
	public static class ServiceException extends Exception {
		
		public ServiceException() {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return Unique indentifier of this service.
	 */
	public String identifier();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return That bot that this service belongs to.
	 */
	public Chrisliebot bot();
	
	public static class ServiceException extends Exception {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @param resolver The reesolver that is going to be used by this instance.
	 */
	public default void announceResolver(ContextResolver resolver) {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * Implementing service is expected to, if possible, drop connection and reconnect to network.
	 */
	public default void reconnect() {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return An optional containing the channel if the given identifier could be resolved.
	 */
	public Optional<? extends ChrislieChannel> channel(String identifier);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @throws ServiceException If a proper shutdown is not possible.
	 */
	public void exit() throws ServiceException;
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return An optional containing the guild if the given identifier could be resolved.
	 */
	public Optional<? extends ChrislieGuild> guild(String identifier);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @throws Exception If a unrecoverable error is occured that prevents the service from ever entering a fully operational state.
	 */
	public void awaitReady() throws Exception;
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 *                           is required to resolve the problem.
		 */
		public void execute(Invocation invc) throws ListenerException;
	}
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * Thrown to indicate failure in listener.
	 */
	public static class ListenerException extends Exception {
		
		public ListenerException(String message) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * Thrown to indicate failure in listener.
	 */
	public static class ListenerException extends Exception {
		
		public ListenerException(String message) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           anything but this exception will cause the dirty bit to be set.
	 */
	public default void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @param e The exception that was raised during execution.
		 */
		public void escalateException(@NonNull ListenerException e);
		
		/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           not set the dirty bit.
	 */
	public default void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * Regular runnable but it can throw {@link ListenerException}.
	 */
	public interface ListenerRunnable {
		
		public void run() throws ListenerException;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	 */
	@FunctionalInterface
	public static interface ExceptionalRunnable {
		
		public void run() throws Exception;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           will not set the dirty bit.
	 */
	public default void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	public static interface ExceptionalRunnable {
		
		public void run() throws Exception;
	}
}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	@AllArgsConstructor
	@ToString
	public static class Envelope {
		
		@Getter private final @NonNull ChrislieListener listener;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	@AllArgsConstructor
	@ToString
	public static class Envelope {
		
		@Getter private final @NonNull ChrislieListener listener;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           exception will cause the dirty bit to be set.
	 */
	public default void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @throws ListenerException If accessing the help failed.
		 */
		public default Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {return Optional.empty();}
		
		/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString(callSuper = true)
	public static class Invocation extends ListenerMessage {
		
		public Invocation(@NonNull ExceptionHandler exceptionHandler,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString(callSuper = true)
	public static class Invocation extends ListenerMessage {
		
		public Invocation(@NonNull ExceptionHandler exceptionHandler,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	public interface ListenerRunnable {
		
		public void run() throws ListenerException;
	}
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * which invocations caused an exception to occur.
	 */
	public interface ExceptionHandler {
		
		/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString
	public static class ListenerMessage implements ServiceAttached {
		
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	
	@ToString
	public static class ListenerMessage implements ServiceAttached {
		
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 * </p>
	 */
	public interface Command extends ChrislieListener {
		
		/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           required to resolve the problem.
	 */
	public default void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	private interface OutputFunction {
		
		public void out(ChrislieOutput out);
	}
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	
	@GET("general/")
	public Call<MensaApiMeta> getMeta(@Header("Authorization") String credentials);
	
	@GET("canteen/")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	
	@GET("canteen/")
	public Call<JsonElement> getCanteen(@Header("Authorization") String credentials);
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
public interface MensaApiService {
	
	public static final String MENSA_BASE_URL = "https://www.sw-ka.de/en/json_interface/";
	
	@GET("general/")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
public interface MensaApiService {
	
	public static final String MENSA_BASE_URL = "https://www.sw-ka.de/en/json_interface/";
	
	@GET("general/")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
public interface MensaApiService {
	
	public static final String MENSA_BASE_URL = "https://www.sw-ka.de/en/json_interface/";
	
	@GET("general/")
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
public interface RedditService {
	
	public static final String BASE_URL = "https://www.reddit.com/";
	
	@GET("r/{subreddit}/new.json?sort=new")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
public interface RedditService {
	
	public static final String BASE_URL = "https://www.reddit.com/";
	
	@GET("r/{subreddit}/new.json?sort=new")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
public interface RedditService {
	
	public static final String BASE_URL = "https://www.reddit.com/";
	
	@GET("r/{subreddit}/new.json?sort=new")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditService.java`
#### Snippet
```java
	
	@GET("r/{subreddit}/new.json?sort=new")
	public Call<SubredditListing> getFeed(
			@Path("subreddit") String subreddit
	);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
public interface UrbanDictionaryService {
	
	public static final String BASE_URL = "https://api.urbandictionary.com/";
	
	@GET("v0/define")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
public interface UrbanDictionaryService {
	
	public static final String BASE_URL = "https://api.urbandictionary.com/";
	
	@GET("v0/define")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
public interface UrbanDictionaryService {
	
	public static final String BASE_URL = "https://api.urbandictionary.com/";
	
	@GET("v0/define")
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class DefinitionList {
		
		private List<Definition> list;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class DefinitionList {
		
		private List<Definition> list;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class Definition {
		
		private String definition, example, word;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class Definition {
		
		private String definition, example, word;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@GET("v0/define")
	public Call<DefinitionList> lookup(@Query("term") String term);
	
	@Data
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	}
	
	public static String removeBrackets(String definition) {
		StringSubstitutor strSub = new StringSubstitutor(key -> key, "[", "]", '\\');
		return strSub.replace(definition);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieChannel channel);
	
	public boolean check(ChrislieService service);
	
	public boolean check(ChrislieGuild guild);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieUser user);
	
	public boolean check(ChrislieChannel channel);
	
	public boolean check(ChrislieService service);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
public interface Selector {
	
	public boolean check(ChrislieMessage message);
	
	public boolean check(ChrislieUser user);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieMessage message);
	
	public boolean check(ChrislieUser user);
	
	public boolean check(ChrislieChannel channel);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieService service);
	
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	 * Thrown to indicate that the selector was unable to load the provided config.
	 */
	public static class SelectorException extends Exception {
		
		public SelectorException(String message) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	 * Thrown to indicate that the selector was unable to load the provided config.
	 */
	public static class SelectorException extends Exception {
		
		public SelectorException(String message) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		}
		
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException;
		
		public default T getOrFail(ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public Optional<T> get(FlexConf flex);
		
		public default Optional<T> get(ChrislieListener.ListenerMessage m) {
			return get(m.ref().flexConf());
		}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
	}
	
	public static interface Provider<T> {
		
		public Optional<T> get(FlexConf flex);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException;
		
		public default T getOrFail(ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
			return getOrFail(m.ref().flexConf());
		}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
	public static interface Provider<T> {
		
		public Optional<T> get(FlexConf flex);
		
		public default Optional<T> get(ChrislieListener.ListenerMessage m) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
public interface QwantService {
	
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
public interface QwantService {
	
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
public interface QwantService {
	
	public static final String BASE_URL = "https://api.qwant.com/";
	
	public static final String DEFAULT_LOCALE = "de_DE";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	@Data
	public static class QwantResponse {
		
		private String status;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	@Data
	public static class QwantResponse {
		
		private String status;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	);
	
	public default Call<QwantResponse> search(String query, SafeSearch safesearch, int count, @NotNull Type type) {
		return search(type.code, type.code, query, safesearch.code, count);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
		
		@GET("db.json")
		public Call<List<DatabaseEntry>> getDatabase();
	}
}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
public interface Generator {
	
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
public interface Generator {
	
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
public interface Generator {
	
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
}

```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Headers("Content-Type: application/json")
	@POST("rpc")
	public Call<Output> runHaskell(@Body Param param);
	
	@Data
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public static interface Resolver {
		
		public default <V> Optional<V> get(String key, Class<V> clazz) {
			return Optional.empty();
		}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * that multiple lookups for the same key may or may not return the same instance.
	 */
	public static interface Resolver {
		
		public default <V> Optional<V> get(String key, Class<V> clazz) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		}
		
		public default Optional<Object> get(String key, Type type) {
			return Optional.empty();
		}
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	public ChrislieUser user();
	
	public String message();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	public ChrislieChannel channel();
	
	public ChrislieUser user();
	
	public String message();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
public interface ChrislieMessage extends ServiceAttached {
	
	public ChrislieChannel channel();
	
	public ChrislieUser user();
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return A list of all channels that are part of this guild.
	 */
	public Collection<? extends ChrislieChannel> channels();
	
	// TODO: get user, call name? (check chrisliechannel) do we want to introduce a new type for guildusers? (discord offers that)
```

### RuleId[ruleID=UnnecessaryModifier]
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

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return An internal identifier of this guild. Should be used when storing guild associated data.
	 */
	public String identifier();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return The display name which should be used to refer to this guild in human facing messages.
	 */
	public String displayName();
	
	/**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput output(LimiterConfig limiterConfig, DiscordMessage source) {
		return new DiscordChannelOutput(service(), messageChannel(), source);
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public default ChrislieOutput output(LimiterConfig limiterConfig) {
		return new DiscordChannelOutput(service(), messageChannel());
	}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public DiscordService service();
	
	@Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
public interface DiscordChannel extends ChrislieChannel {
	
	public MessageChannel messageChannel();
	
	@Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordGuild> guild();
	
	@Override
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
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

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			
			// otherwise we apply both the flex conf and alias set from the other listener context
			super.flexConf.apply(o.flexConf());
			aliasSet.apply(o.aliasSet());
		}
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			
			summary = summary
					.replaceAll("[\n\r\u0000]", "") // remove illegal irc characters
					.trim();
			
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
		
		// compile pattern from user input
		var searchPattern = com.google.re2j.Pattern.compile(matcher.group("search").replaceAll("\\\\/", "/"));
		
		// extract groups and reverse escaped slash
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
		
		// extract groups and reverse escaped slash
		String replace = matcher.group("replace").replaceAll("\\\\/", "/");
		String flags = matcher.group("flags");
		
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static String escapeStrSubstitution(String s) {
		return s.replaceAll("\\$\\{", "\\$\\${");
	}
	
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		// shorten the input string one word at a time and find largest matching string as date
		String[] w = arg.split("\\s+");
		for (int i = w.length; i >= 0; i--) {
			try {
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `data` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		// remove older entries
		feed.data().children().removeIf(c -> c.data().createdUtc() <= lastTimestamp);
		
		// update last timestamp
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hasPermission` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				var textChannel = (TextChannel) channel;
				var selfMember = textChannel.getGuild().getMember(textChannel.getJDA().getSelfUser());
				canUpload = selfMember.hasPermission(textChannel, Permission.MESSAGE_ATTACH_FILES);
			}
			
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `getRoles` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		// ignore member on whitelist
		for (Role role : ev.getMember().getRoles()) {
			if (cfg.whitelist.contains(role.getIdLong())) {
				return;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `output` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
					reply.title("Haskell ist Liebe");
					reply.thumbnail("https://chrisliebot.chrisliebaer.de/haskell_logo.png");
					reply.description(d -> d.appendEscape(result.output(), ChrislieFormat.BLOCK));
					
					if (result.returncode() != 0) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `returncode` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
					reply.description(d -> d.appendEscape(result.output(), ChrislieFormat.BLOCK));
					
					if (result.returncode() != 0) {
						reply.footer("Das hat leider nicht geklappt");
						reply.markAsError();
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### RuleId[ruleID=ComparatorMethodParameterNotUsed]
'compareTo()' parameter `o` is not used
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	
	@Override
	public int compareTo(@NotNull FlowQuery o) {
		return from.compareTo(to);
	}
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		}
		
		var httpLogger = new HttpLoggingInterceptor(s -> {
			log.trace("HTTP REQUEST: {}", s);
		});
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			
			try {
				Optional<Map<String, String>> outMap = cache.get(gen);
				if (outMap.isEmpty()) {
					generatorEmpty = true;
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		@SuppressWarnings("ThisEscapedInObjectConstruction")
		private final StrSubstitutor substitutor = new StrSubstitutor(this);
		private final LoadingCache<String, Optional<Map<String, String>>> cache;
		
		public CachingSubstitutor(Invocation invocation) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
					.build(new CacheLoader<>() {
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
							var generator = generators.get(key);
							
```

### RuleId[ruleID=OptionalContainsCollection]
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

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `ctxResolver` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	private ContextResolver ctxResolver;
	
	// keeps track of which guilds we have already registered our commands
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `jda` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Getter private Chrisliebot bot;
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `subscriptions` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private Chrisliebot bot;
	private ContextResolver resolver;
	private List<TimelineSubscription> subscriptions;
	
	@Override
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `twitter` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	private Config cfg;
	private Twitter twitter;
	
	private ScheduledFuture<?> pollTask;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `bot` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private boolean shutdown;
	
	private Chrisliebot bot;
	private ContextResolver resolver;
	private List<TimelineSubscription> subscriptions;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `pollTask` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private Twitter twitter;
	
	private ScheduledFuture<?> pollTask;
	private boolean shutdown;
	
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `resolver` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	private Chrisliebot bot;
	private ContextResolver resolver;
	private List<TimelineSubscription> subscriptions;
	
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	 * since we need the proper call stack for this, we have to store the color in the constructor
	 */
	private boolean colorSet = false;
	
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	private boolean colorSet = false;
	
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
	
	private final Optional<Color> stackTraceColor = colorFromCallstack();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	 * Exit code that will be returned if proper shutdown occurs.
	 */
	private volatile int exitCode = 0;
	
	@Getter private final Managment managment = new Managment();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		private Instant snooze;
		
		private int snoozeCount = 0;
		private boolean deleted = false;
		
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		private int snoozeCount = 0;
		private boolean deleted = false;
		
		private Instant nextDue() {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `invc`
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
		
		// build new context
		invc = new Invocation(
				invc.exceptionHandler(),
				invc.bot(),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `format`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
		// convert irc->chrisliebot
		if (format instanceof Format)
			format = IrcFormatter.irc2ChrislieFormat((Format) format);
		
		// convert discord->chrisliebot (since jda requires message builder for applying formatting)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `format`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
		// convert discord->chrisliebot (since jda requires message builder for applying formatting)
		if (format instanceof Formatting)
			format = discord2ChrislieFormat((Formatting) format);
		
		// handle chrisliebot formattings
```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `format`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
		// convert discord->chrisliebot
		if (format instanceof Formatting)
			format = DiscordFormatter.discord2ChrislieFormat((Formatting) format);
		
		// handle irc directly
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	@SuppressWarnings("MagicNumber")
	public static String durationToString(long s) {
		s = Math.abs(s);
		
		// SirYwell hauen wenn kaputt
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
		
		// SirYwell hauen wenn kaputt
		s /= 1000;
		long days = s / (24 * 3600);
		s %= 24 * 3600;
```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `day`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static Optional<DayOfWeek> stringToDay(@NonNull String day) {
		day = day.trim().toLowerCase();
		
		return switch (day) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `guilds`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private static Multimap<String, Pattern> buildGuildMap(Map<String, List<String>> guilds) {
		if (guilds == null)
			guilds = Map.of();
		
		Multimap<String, Pattern> guildMap = HashMultimap.create();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `flex`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	
	private static FlexConf instanceFlexConf(GsonValidator gson, Map<String, JsonElement> flex) {
		flex = flex == null ? Map.of() : flex;
		return JsonFlexConfResolver.of(gson, Collections.unmodifiableMap(flex));
	}
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `limit`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	public List<String> split(String message, int limit) {
		// limit is broken when connected to znc, a hard coded offset should fix that
		limit += offset;
		
		if (stripIrcFormatting)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		if (stripIrcFormatting)
			message = Format.stripAll(message);
		else
			message = C.squashFormatting(message);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			message = Format.stripAll(message);
		else
			message = C.squashFormatting(message);
		
		// regular messages are prefixed with special byte to prevent accidental triggering of other automated services
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `limit`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			
			// when prefix is set, it will reduce the line capacity, so we need to adjust our limit accordingly
			limit -= prefix.length();
		}
		
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		// remove illegal characters
		message = message.replace("\0", "");
		
		if (stripLineBreak)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `message`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		if (stripLineBreak)
			message = C.NEWLINE_PATTERN.matcher(message).replaceAll(" ");
		
		receiver.sendMultiLineMessage(message, this::split);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	private static long decodeTimer(String s) throws IdParseException {
		s = s.toLowerCase();
		
		int out = 0;
```

### RuleId[ruleID=AssignmentToMethodParameter]
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

## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`[g]` can be simplified to 'g'
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
public class SedListener implements ChrislieListener {
	
	private static final Pattern SED_PATTERN = Pattern.compile("^s/(?<search>([^/]|\\\\/)+)/(?<replace>([^/]|\\\\/)*)/(?<flags>[g]*)$");
	
	private Cache<ChannelIdentifier, CircularFifoQueue<StoredMessage>> backlog = CacheBuilder.newBuilder().build();
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	public ChrislieOutput apply(ChrislieOutput output, Function<String, String> transform) {
		// we don't want caller to handle null values, so instead we simply handle these with our own lambda
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
		
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	public static Map<String, Map<Long, Map<String, List<MensaApiMeal>>>> unfuck(GsonValidator gson, JsonElement json) {
		if (json == null)
			return null;
		
		try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
				if (outMap.isEmpty()) {
					generatorEmpty = true;
					return null;
				}
				
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			public String mediaUrl(GsonValidator gson) {
				if (media == null || media.isJsonNull())
					return null;
				
				if (media.isJsonPrimitive()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
					var array = media.getAsJsonArray();
					if (array.size() == 0) {
						return null;
					}
					
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				}
				
				return null;
			}
		}
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	public static String squashFormatting(String s) {
		if (s == null)
			return null;
		
		// TODO: takes the input string and attempts to reduce the amount of format codes by merging overlapping or unused definitions
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
			
			if (lines.isEmpty())
				return null;
			
			var idx = ThreadLocalRandom.current().nextInt(lines.size());
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
				replace = tmp;
			else if (replace != tmp) // check if set changed from replacement to incremental or vice versa
				return null;
		}
		
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`sb.length() == 0` can be replaced with 'sb.isEmpty()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
					
					// force split string if stringbuffer is empty, this happens if next word is too big even when on a single line
					if (sb.length() == 0) {
						String s = remain.removeFirst();
						sb.append(s, 0, limit + 1);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
				} else {
					// append current string to string builder
					if (sb.length() != 0)
						sb.append(' ');
					
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			
			// append pending string builer, if not empty
			if (sb.length() != 0)
				out.add(prefix + sb);
		}
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * A list of valid exit codes.
		 */
		private @NotNull int[] exitCodes = new int[0];
		
		/**
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PlainOutput.PlainOutputSubstituion`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput convert(Consumer<PlainOutput.PlainOutputSubstituion> out) {
		out.accept(convert());
		return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput replace(Consumer<PlainOutput> out) {
		out.accept(replace());
		return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput description(Consumer<PlainOutput> out) {
		out.accept(description());
		return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ChrislieParser`
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
			this.selector = selector;
		}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TokenSelector`
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
			this.selector = selector;
		}
```

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private @NotNull ChrislieFormat[] formats = EMPTY_FORMATS;
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ScopeMapping`
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
	@Getter private Set<ChrislieListener.Envelope> envelopes;
	
	public ContextResolver(@NonNull List<ScopeMapping> mappings) {
		this.mappings = Collections.unmodifiableList(mappings);
		
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Edge`
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	}
	
	private boolean applyGraphSpec(Invocation invc, FlowGraph graph, String spec, Set<Edge> edgeStore) throws ListenerException, IllegalGraphException {
		var matcher = GRAPH_NODE_SPEC_PATTERN.matcher(spec);
		
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super UrlPreviewListener.HistoryEntry`
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@SneakyThrows
	public GenericUrlPreview(@NonNull URL url, ChrislieListener.ListenerMessage m, Set<UrlPreviewListener.HistoryEntry> titleHistory) {
		this.url = url;
		this.m = m;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public static ErrorOutputBuilder generic(Consumer<PlainOutput> outFn) {
		return new ErrorOutputBuilder().fn(out -> {
			outFn.accept(out.description());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super FlexConf`
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
			this.convert = convert;
			this.key = key;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
			this.convert = convert;
			this.key = key;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private List<Supplier<String>> calls = new ArrayList<>();
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
						   @NonNull BiFunction<Object, String, String> formatResolver) {
		this.escaper = escaper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
						   @NonNull BiFunction<Object, String, String> formatResolver) {
		this.escaper = escaper;
		this.formatResolver = formatResolver;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Selector`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAllOr(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (fn.apply(selector, in))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Selector`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAllAnd(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (!fn.apply(selector, in))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Selector`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	protected CombinationSelector(List<Selector> selectors, Operation operation) {
		Preconditions.checkArgument(!selectors.isEmpty(), "selector list must no be empty");
		
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> Optional<V> of(String name, Function<String, V> convert) {
		return get(name, s -> Optional.of(s).map(convert), Optional.empty());
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> Optional<V> of(String name, Function<String, V> convert) {
		return get(name, s -> Optional.of(s).map(convert), Optional.empty());
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
public class SystemProperty<T> {
	
	private static <T> T get(@NonNull String name, Function<String, T> fn, T def) {
		Preconditions.checkArgument(!name.isBlank(), "name must not be blank");
		var v = System.getProperty(name);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
public class SystemProperty<T> {
	
	private static <T> T get(@NonNull String name, Function<String, T> fn, T def) {
		Preconditions.checkArgument(!name.isBlank(), "name must not be blank");
		var v = System.getProperty(name);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	}
	
	private static Multimap<String, Pattern> buildGuildMap(Map<String, List<String>> guilds) {
		if (guilds == null)
			guilds = Map.of();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		@Override
		public <V> Optional<V> get(String key, Class<V> clazz) {
			var val = map.get(key);
			if (val == null)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JsonElement`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private JsonFlexConfResolver(GsonValidator gson, Map<String, JsonElement> map) {
			this.gson = gson;
			this.map = map;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private ChrislieGroup instanceGroup(String name, Group group, List<String> includeList) throws ConfigInitializeException {
			// check for inheritance cycle
			if (includeList.contains(name))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JsonElement`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	}
	
	private static FlexConf instanceFlexConf(GsonValidator gson, Map<String, JsonElement> flex) {
		flex = flex == null ? Map.of() : flex;
		return JsonFlexConfResolver.of(gson, Collections.unmodifiableMap(flex));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Status`
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	}
	
	private void postTweets(TimelineSubscription sub, List<Status> tweets) throws ListenerException {
		if (tweets.isEmpty())
			return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChrislieGroup`
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public void addGroups(Collection<ChrislieGroup> groups) {
		groups.forEach(this::addGroup);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	}
	
	private static void ensureDisjoint(Set<String> set, Set<String> serviceKeys) {
		for (String s : serviceKeys) {
			if (set.contains(s))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProcessExecutor`
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	}
	
	private void dispatch(Consumer<ProcessExecutor> fnPass, ChrislieOutput out, ExceptionHandler exceptionHandler) throws ListenerException {
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuery(ActorPrivateMessageEventBase<User> ev) {
		if (ev instanceof PrivateMessageEvent) {
			logMessage(new Date(), ev.getTarget(), ev.getActor(), ev.getMessage(), MessageType.NORMAL);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logChannel(ActorChannelMessageEventBase<User> ev) {
		MessageType type = null;
		if (ev instanceof ChannelCtcpEvent) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	}
	
	private void addMention(String s, Pattern pattern, Consumer<String> callback) {
		var matcher = pattern.matcher(s);
		while (matcher.find()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	};
	
	public IrcOutput(@NonNull Function<String, String> escaper, @NonNull Consumer<String> sink) {
		this.escaper = escaper;
		this.sink = sink;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ListenerReference`
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
		this.name = name;
		this.flexConf = flexConf;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChrislieGroup`
in `src/main/java/chrisliebaer/chrisliebot/config/scope/ScopeMapping.java`
#### Snippet
```java
	@Getter private List<ChrislieGroup> groups;
	
	public ScopeMapping(List<Selector> selectors, List<ChrislieGroup> groups) {
		super(selectors, Operation.AND);
		this.groups = ImmutableList.copyOf(groups);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super User`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	}
	
	public Optional<User> findUser(Predicate<User> predicate, Stream<User> userStream) {
		return userStream
				.filter(predicate)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	}
	
	private static <T> Optional<T> resolve(String input, Pattern pattern, Function<String, T> idLookup, Function<String, List<T>> nameLookup, int idGroup) {
		// check if user used mention (parameter containts entire mention, so we match on entire input)
		var matcher = pattern.matcher(input);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	private static void toFlatMap(Map<String, Object> map, Set<String> flexValues, ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
		var msg = m.msg();
		var channel = msg.channel();
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput thumbnail(String url);
	
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `patterns == null` is always `false`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		
		var patterns = guildMap.get(identifier);
		if (patterns == null)
			return Optional.empty();
		
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
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

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiMeal.java`
#### Snippet
```java
@SuppressWarnings("MissingDeprecatedAnnotation")
@ToString
public class MensaApiMeal {
	
	@Getter private String meal;
```

### RuleId[ruleID=RedundantSuppression]
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

### RuleId[ruleID=RedundantSuppression]
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

