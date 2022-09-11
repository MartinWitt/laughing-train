# chrisliebot/classic# Bad smells
I found 92 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MethodMayBeStatic | 22 | true |
| AssignmentToMethodParameter | 20 | false |
| ReturnNull | 12 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| ConstantConditions | 6 | false |
| RedundantFieldInitialization | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| RedundantSuppression | 4 | false |
| UnstableApiUsage | 3 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| RedundantMethodOverride | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RegExpSimplifiable | 1 | false |
| UnnecessaryReturn | 1 | true |
| NullableProblems | 1 | false |
## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stackTraceColor'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
	
	private final Optional<Color> stackTraceColor = colorFromCallstack();
	
	@Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'value'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		private final Function<ChrislieParser, TokenSelector> selector;
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
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

## FieldAccessedSynchronizedAndUnsynchronized
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
Field `pollTask` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private Twitter twitter;
	
	private ScheduledFuture<?> pollTask;
	private boolean shutdown;
	
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

## AssignmentToMethodParameter
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
Assignment to method parameter `flex`
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	
	private static FlexConf instanceFlexConf(GsonValidator gson, Map<String, JsonElement> flex) {
		flex = flex == null ? Map.of() : flex;
		return JsonFlexConfResolver.of(gson, Collections.unmodifiableMap(flex));
	}
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
Assignment to method parameter `day`
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static Optional<DayOfWeek> stringToDay(@NonNull String day) {
		day = day.trim().toLowerCase();
		
		return switch (day) {
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
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	public ChrislieOutput apply(ChrislieOutput output, Function<String, String> transform) {
		// we don't want caller to handle null values, so instead we simply handle these with our own lambda
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
		
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
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
	public static String squashFormatting(String s) {
		if (s == null)
			return null;
		
		// TODO: takes the input string and attempts to reduce the amount of format codes by merging overlapping or unused definitions
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

## UnnecessaryReturn
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
			ErrorOutputBuilder.generic("Ich konnte diese Nachricht leider nicht finden. Sie wurde entweder gelöscht oder du bist nicht berechtigt" +
					" Informationen über diese Nachricht abzufragen.").write(invc).send();
			return;
		}
	}
```

## ConstantConditions
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
Method invocation `hasPermission` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				var textChannel = (TextChannel) channel;
				var selfMember = textChannel.getGuild().getMember(textChannel.getJDA().getSelfUser());
				canUpload = selfMember.hasPermission(textChannel, Permission.MESSAGE_ATTACH_FILES);
			}
			
```

## UnnecessaryToStringCall
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
	public String send(String content) throws IOException {
		var uuid = UUID.randomUUID();
		var file = new File(path, uuid.toString() + ".txt");
		FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8);
		return generator.replace("${file}", file.getName());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
					
					// commit current string buffer to output
					out.add(prefix + sb.toString());
					sb.setLength(0);
				} else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			// append pending string builer, if not empty
			if (sb.length() != 0)
				out.add(prefix + sb.toString());
		}
		
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
				sb.append(LOOKUP_FLIP.charAt(idx));
		}
		invc.reply("(╯°□°）╯ " + sb.reverse().toString());
	}
	
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

## UnstableApiUsage
### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		//noinspection UnnecessaryCodeBlock
		{ // scope fuckery to hide type fuckery, the perfect crime
			Optional<Set<String>> maybeIgnoreLines = flex.get(FLEX_FILTER, new TypeToken<Set<String>>() {}.getType());
			ignoreLines = maybeIgnoreLines.orElse(Set.of());
		}
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		//noinspection UnnecessaryCodeBlock
		{ // scope fuckery to hide type fuckery, the perfect crime
			Optional<Set<String>> maybeIgnoreLines = flex.get(FLEX_FILTER, new TypeToken<Set<String>>() {}.getType());
			ignoreLines = maybeIgnoreLines.orElse(Set.of());
		}
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		//noinspection UnnecessaryCodeBlock
		{ // scope fuckery to hide type fuckery, the perfect crime
			Optional<Set<String>> maybeIgnoreLines = flex.get(FLEX_FILTER, new TypeToken<Set<String>>() {}.getType());
			ignoreLines = maybeIgnoreLines.orElse(Set.of());
		}
```

## MethodMayBeStatic
### MethodMayBeStatic
Method `long2byte()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	}
	
	private byte[] long2byte(long l) {
		var b = ByteBuffer.allocate(8);
		b.order(ByteOrder.LITTLE_ENDIAN);
```

### MethodMayBeStatic
Method `base64UrlEncode()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	}
	
	private String base64UrlEncode(byte[] data) {
		var encoder = Base64.getEncoder();
		return encoder.encodeToString(data)
```

### MethodMayBeStatic
Method `loadGenerator()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	}
	
	private Generator loadGenerator(GsonValidator gson, GeneratorConfig cfg) throws ListenerException {
		try {
			return switch (cfg.type) {
```

### MethodMayBeStatic
Method `addMention()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	}
	
	private void addMention(String s, Pattern pattern, Consumer<String> callback) {
		var matcher = pattern.matcher(s);
		while (matcher.find()) {
```

### MethodMayBeStatic
Method `handleLookup()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
	}
	
	private void handleLookup(Lookup lookup, ChrislieOutput reply, String host) {
		ForkJoinPool.commonPool().execute(() -> {
			Record[] records = lookup.run();
```

### MethodMayBeStatic
Method `parse()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	}
	
	private Optional<Instant> parse(String arg, ZoneId zoneId) {
		var parser = new Parser(TimeZone.getTimeZone(zoneId));
		var parse = parser.parse(arg);
```

### MethodMayBeStatic
Method `createTimerInfo()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	}
	
	private TimerInfo createTimerInfo(ResultSet rs) throws SQLException {
		TimerInfo timerInfo = new TimerInfo();
		timerInfo.id = rs.getLong("id");
```

### MethodMayBeStatic
Method `chatLogger()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	}
	
	private void chatLogger(Client client, Chrisliebot bot, String identifier) {
		client.getEventManager().registerEventListener(new IrcToSqlLogger(bot.sharedResources().dataSource(), identifier));
	}
```

### MethodMayBeStatic
Method `verboseLogging()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	}
	
	private void verboseLogging(Client.Builder builder) {
		builder.listeners().input(IrcBootstrap::inLogger);
		builder.listeners().output(IrcBootstrap::outLogger);
```

### MethodMayBeStatic
Method `target()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
	private static final String TRANSFORM_REDFINE_FLEX = "transform.flex";
	
	private ListenerReference target(ChrislieContext ctx, FlexConf flex) throws ListenerException {
		var target = flex.getStringOrFail(TRANSFORM_TARGET);
		var ref = ctx.listener(target)
```

### MethodMayBeStatic
Method `ensureEncoding()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	}
	
	private void ensureEncoding(Connection conn) {
		try (var stmt = conn.prepareStatement("SET NAMES 'utf8mb4'")) {
			stmt.execute();
```

### MethodMayBeStatic
Method `recruitIrc()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	}
	
	private void recruitIrc(Invocation invc) throws ListenerException {
		var service = (IrcService) invc.service();
		var arg = invc.arg();
```

### MethodMayBeStatic
Method `enumerate()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
	}
	
	private void enumerate(Invocation invc) throws ListenerException {
		var ctx = invc.ctx();
		
```

### MethodMayBeStatic
Method `reset()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	}
	
	private void reset() {
		// TODO: find out if this also reloads it
		Configurator.reconfigure();
```

### MethodMayBeStatic
Method `changeIrcNick()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
	}
	
	private void changeIrcNick(Invocation invc) {
		var service = (IrcService) invc.service();
		service.client().setNick(invc.arg());
```

### MethodMayBeStatic
Method `changeDiscordNick()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
	}
	
	private void changeDiscordNick(Invocation invc) throws ListenerException {
		var service = (DiscordService) invc.service();
		var jda = service.jda();
```

### MethodMayBeStatic
Method `detail()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
	}
	
	private void detail(Invocation invc, String alias) throws ListenerException {
		var ctx = invc.ctx();
		var maybeRef = ctx.alias(alias);
```

### MethodMayBeStatic
Method `printCodePoint()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
	}
	
	private void printCodePoint(int cp, PlainOutput out) {
		Optional<String> name = Optional.ofNullable(Character.getName(cp));
		var cpStr = Integer.toHexString(cp).toUpperCase();
```

### MethodMayBeStatic
Method `passEnv()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	}
	
	private Consumer<ProcessExecutor> passEnv(Map<String, String> flatMap) {
		return executor -> executor.environment(flatMap);
	}
```

### MethodMayBeStatic
Method `warnInvalidGraph()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	}
	
	private ChrislieOutput warnInvalidGraph(FlowGraph graph, ChrislieOutput out) {
		var outOnly = new HashSet<>(graph.nodes());
		var inOnly = new HashSet<>(graph.nodes());
```

### MethodMayBeStatic
Method `simpleOutput()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	}
	
	private ChrislieOutput simpleOutput(ChrislieOutput out, String title, String specOutput) {
		return out
				.thumbnail("https://chrisliebot.chrisliebaer.de/notausgang.png")
```

### MethodMayBeStatic
Method `applyGraphSpec()` may be 'static'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	}
	
	private boolean applyGraphSpec(Invocation invc, FlowGraph graph, String spec, Set<Edge> edgeStore) throws ListenerException, IllegalGraphException {
		var matcher = GRAPH_NODE_SPEC_PATTERN.matcher(spec);
		
```

