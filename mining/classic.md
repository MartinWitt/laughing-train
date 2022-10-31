# chrisliebot/classic
# Bad smells
I found 2791 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnqualifiedFieldAccess | 854 | false |
| PublicMethodWithoutLogging | 581 | false |
| unused | 443 | false |
| UseOfAnotherObjectsPrivateField | 283 | false |
| ParameterHidingMemberVariable | 144 | false |
| ClassWithoutLogger | 95 | false |
| DuplicateStringLiteralInspection | 92 | false |
| RedundantThrows | 68 | false |
| TypeMayBeWeakened | 41 | false |
| CallToSuspiciousStringMethod | 41 | false |
| CollectionsMustHaveInitialCapacity | 40 | false |
| MethodCallInLoopCondition | 16 | false |
| ClassNestingDepth | 15 | false |
| UnusedReturnValue | 13 | false |
| ConstantConditions | 9 | false |
| ConfusingElse | 8 | false |
| ProtectedField | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| AnonymousClassComplexity | 6 | false |
| MethodCount | 5 | false |
| HashCodeUsesNonFinalVariable | 4 | false |
| ObjectEquality | 4 | false |
| BooleanVariableAlwaysNegated | 3 | false |
| SwitchStatementWithTooManyBranches | 2 | false |
| AssignmentToNull | 1 | false |
| MultiplyOrDivideByPowerOfTwo | 1 | false |
| ClassReferencesSubclass | 1 | false |
| ReturnOfInnerClass | 1 | false |
| SubtractionInCompareTo | 1 | false |
| AbstractClassWithOnlyOneDirectInheritor | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| NullableProblems | 1 | false |
| ParametersPerConstructor | 1 | false |
| NestingDepth | 1 | false |
## HashCodeUsesNonFinalVariable
### HashCodeUsesNonFinalVariable
Non-final field `user` accessed in 'hashCode()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return user.hashCode();
	}
	
```

### HashCodeUsesNonFinalVariable
Non-final field `user` accessed in 'hashCode()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return user.hashCode();
	}
	
```

### HashCodeUsesNonFinalVariable
Non-final field `channel` accessed in 'hashCode()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return channel.hashCode();
	}
	
```

### HashCodeUsesNonFinalVariable
Non-final field `user` accessed in 'hashCode()'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return user.hashCode();
	}
	
```

## SwitchStatementWithTooManyBranches
### SwitchStatementWithTooManyBranches
`switch` has too many branches (42)
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
		day = day.trim().toLowerCase();
		
		return switch (day) {
			case "montag", "mon", "mo", "monday" -> Optional.of(DayOfWeek.MONDAY);
			case "dienstag", "di", "tuesday", "tue", "tues", "tu" -> Optional.of(DayOfWeek.TUESDAY);
```

### SwitchStatementWithTooManyBranches
`switch` has too many branches (13)
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		private Selector instanceSelector(JsonSelector json) throws Selector.SelectorException {
			Selector selector = switch (json.type) {
				case "all" -> new AcceptAllSelector();
				case "or" -> CombinationSelector.or(instanceSelectors(json.json));
```

## ProtectedField
### ProtectedField
Protected field `name`
in `src/main/java/chrisliebaer/chrisliebot/command/ListenerReference.java`
#### Snippet
```java
public class ListenerReference {
	
	@Getter protected String name;
	@Getter protected String help;
	
```

### ProtectedField
Protected field `flexConf`
in `src/main/java/chrisliebaer/chrisliebot/command/ListenerReference.java`
#### Snippet
```java
	@Getter protected ChrislieListener.Envelope envelope;
	
	@Getter protected FlexConf flexConf;
	@Getter protected AliasSet aliasSet;
}
```

### ProtectedField
Protected field `help`
in `src/main/java/chrisliebaer/chrisliebot/command/ListenerReference.java`
#### Snippet
```java
	
	@Getter protected String name;
	@Getter protected String help;
	
	@Getter protected ChrislieListener.Envelope envelope;
```

### ProtectedField
Protected field `aliasSet`
in `src/main/java/chrisliebaer/chrisliebot/command/ListenerReference.java`
#### Snippet
```java
	
	@Getter protected FlexConf flexConf;
	@Getter protected AliasSet aliasSet;
}

```

### ProtectedField
Protected field `envelope`
in `src/main/java/chrisliebaer/chrisliebot/command/ListenerReference.java`
#### Snippet
```java
	@Getter protected String help;
	
	@Getter protected ChrislieListener.Envelope envelope;
	
	@Getter protected FlexConf flexConf;
```

### ProtectedField
Protected field `codepoints`
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
public class ChrislieParser {
	
	protected final int[] codepoints;
	protected int idx;
	
```

### ProtectedField
Protected field `idx`
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	
	protected final int[] codepoints;
	protected int idx;
	
	private ChrislieParser parent;
```

## DuplicateStringLiteralInspection
### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.choice.ChoiceCommand', 'chrisliebaer.chrisliebot.util.ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
				.appendEscape(" (Ausgabe limitiert auf maximal " + maxCodepoints + " Codepoints)")
				.newLine()
				.appendSub("${description}");
		
		reply.send();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder', 'chrisliebaer.chrisliebot.abstraction.irc.IrcLogger'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
			
			return switch (key) {
				case "service" -> Optional.of(DataContainer::service);
				case "guild" -> Optional.of(DataContainer::guild);
				case "channel" -> Optional.of(DataContainer::channel);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel', 'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
				case "service" -> Optional.of(DataContainer::service);
				case "guild" -> Optional.of(DataContainer::guild);
				case "channel" -> Optional.of(DataContainer::channel);
				case "user" -> Optional.of(DataContainer::user);
				case "displayName" -> Optional.of(DataContainer::displayName);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.generator.GeneratorCommand.CachingSubstitutor'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
				case "channel" -> Optional.of(DataContainer::channel);
				case "user" -> Optional.of(DataContainer::user);
				case "displayName" -> Optional.of(DataContainer::displayName);
				case "message" -> Optional.of(DataContainer::message);
				default -> Optional.empty();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.external.ExternalMessageTranslator', 'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel', 'chrisliebaer.chrisliebot.command.generator.GeneratorCommand.CachingSubstitutor'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
				case "user" -> Optional.of(DataContainer::user);
				case "displayName" -> Optional.of(DataContainer::displayName);
				case "message" -> Optional.of(DataContainer::message);
				default -> Optional.empty();
			};
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordFormatter'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
			return format + s + Format.RESET;
		
		throw new UnsupportedOperationException("unkown format: " + format);
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.basic.NickCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
			recruitDiscord(invc);
		else
			throw new ListenerException("This command does not know how to handle the current service.");
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.basic.RecruitCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
			changeDiscordNick(invc);
		else
			throw new ListenerException("This command does not know how to handle the current service.");
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.irc.IrcOutput'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	private void printResultItem(ChrislieOutput reply, QwantResponse.QwantItem item) {
		StringSubstitutor strSub = new StringSubstitutor(key -> switch (key) {
			case "title" -> C.stripHtml(item.title());
			case "media" -> item.mediaUrl(bot.sharedResources().gson());
			case "desc" -> C.stripHtml(item.desc());
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.urbandictionary.UrbanDictionaryCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	private static final ErrorOutputBuilder ERROR_NO_ACTIVE_SEARCH = ErrorOutputBuilder.generic("Es gibt keine aktive Suchanfrage.");
	private static final ErrorOutputBuilder ERROR_EOF = ErrorOutputBuilder.generic("Das waren alle Ergebnisse. Mehr hab ich nicht.");
	private static final ErrorOutputBuilder ERROR_NO_MATCH = ErrorOutputBuilder.generic("Deine Suche ergab leider keine Treffer.");
	
	private static final CommonFlex.Provider<QwantService.SafeSearch> FLEX_SAFE_SEARCH = CommonFlex.provider(
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.SharedResources', 'chrisliebaer.chrisliebot.command.urlpreview.GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
						c -> c.proceed(c.request()
								.newBuilder()
								.header("User-Agent", C.UA_CHROME).build())).build();
		
		Retrofit retrofit = new Retrofit.Builder()
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.bottlespin.BottleSpinCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
			reply.description(out -> out.appendEscape(choice))
					.replace()
					.appendEscape("Die Flasche hat ")
					.appendEscape(choice, ChrislieFormat.HIGHLIGHT)
					.appendEscape(" ausgew?hlt.");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.bottlespin.BottleSpinCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
					.appendEscape("Die Flasche hat ")
					.appendEscape(choice, ChrislieFormat.HIGHLIGHT)
					.appendEscape(" ausgew?hlt.");
		} else {
			var userList = m.channel().users();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.bottlespin.BottleSpinCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
			reply.description(out -> out.append(user.mention()))
					.replace()
					.appendEscape("Die Flasche hat ")
					.appendEscape(user.displayName(), ChrislieFormat.HIGHLIGHT)
					.appendEscape(" ausgew?hlt.");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.bottlespin.BottleSpinCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
					.appendEscape("Die Flasche hat ")
					.appendEscape(user.displayName(), ChrislieFormat.HIGHLIGHT)
					.appendEscape(" ausgew?hlt.");
		}
		reply.send();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordSlashCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
			case TEXT -> channel = new DiscordGuildChannel(service, ev.getTextChannel());
			case PRIVATE -> channel = new DiscordPrivateChannel(service, ev.getPrivateChannel());
			default -> throw new RuntimeException("message was sent in unkown channel type");
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.irc.IrcLogger'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	
	private static void exceptionLogger(Throwable t) {
		log.error("error in irc library", t);
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.parser.OptionsMap.Flag'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		public Optional<String> get() {
			if (!OptionsMap.this.parsed)
				throw new NoSuchElementException("you must call parse() before accessing this value");
			return value;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.parser.OptionsMap.Option'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		public boolean getAsBoolean() {
			if (!OptionsMap.this.parsed)
				throw new NoSuchElementException("you must call parse() before accessing this value");
			return value;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.mensa.MensaCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		var reply = invc.reply();
		var replace = reply.replace();
		reply.title("Mensaeinheitsbrei f?r " + (useDisplay ? mensa.displayName() : mensa.name()) + " am " + dateFormat.format(new Date(day.timestamp())));
		replace
				.appendEscape("Mensaeinheitsbrei f?r ")
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.mensa.MensaCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		reply.title("Mensaeinheitsbrei f?r " + (useDisplay ? mensa.displayName() : mensa.name()) + " am " + dateFormat.format(new Date(day.timestamp())));
		replace
				.appendEscape("Mensaeinheitsbrei f?r ")
				.appendEscape(useDisplay ? mensa.displayName() : mensa.name(), ChrislieFormat.HIGHLIGHT)
				.appendEscape(" am ")
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
					.appendEscape("Der DNS Typ: ")
					.appendEscape(args[1], ChrislieFormat.HIGHLIGHT)
					.appendEscape(" ist ung?ltig."))
					.write(invc).send();
			return;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.generator.GeneratorCommand.CachingSubstitutor'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			StringSubstitutor substitutor = new StringSubstitutor(key -> switch (key) {
				case "server" -> ev.getGuild().getName();
				case "mention" -> ev.getAuthor().getAsMention();
				case "user" -> ev.getAuthor().getName();
				case "channel" -> ev.getChannel().getName();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
				case "mention" -> ev.getAuthor().getAsMention();
				case "user" -> ev.getAuthor().getName();
				case "channel" -> ev.getChannel().getName();
				case "message" -> ev.getMessage().getContentDisplay();
				default -> key;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.external.ExternalMessageTranslator', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer', 'chrisliebaer.chrisliebot.command.generator.GeneratorCommand.CachingSubstitutor'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
				case "user" -> ev.getAuthor().getName();
				case "channel" -> ev.getChannel().getName();
				case "message" -> ev.getMessage().getContentDisplay();
				default -> key;
			});
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.qwant.QwantSearchCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	
	private static final ErrorOutputBuilder ERROR_NO_QUERY = ErrorOutputBuilder.generic("Du hast keinen Suchbegriff eingegeben.");
	private static final ErrorOutputBuilder ERROR_NO_MATCH = ErrorOutputBuilder.generic("Deine Suche ergab leider keine Treffer.");
	
	private UrbanDictionaryService service;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.ChrislieDispatcher'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	private static void toFlatMap(Map<String, Object> map, Set<String> flexValues, ChrislieListener.Invocation m) throws ChrislieListener.ListenerException {
		map.put("argument", m.arg());
		map.put("alias", m.alias());
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.ChrislieDispatcher'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	private static void toFlatMap(Map<String, Object> map, Set<String> flexValues, ChrislieListener.Invocation m) throws ChrislieListener.ListenerException {
		map.put("argument", m.arg());
		map.put("alias", m.alias());
		
		toFlatMap(map, flexValues, (ChrislieListener.ListenerMessage) m);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer', 'chrisliebaer.chrisliebot.command.generator.GeneratorCommand.CachingSubstitutor'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		var channel = msg.channel();
		
		map.put("message", msg.message());
		
		map.put("user.identifier", msg.user().identifier());
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.generator.GeneratorCommand.CachingSubstitutor'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		channel.guild().ifPresent(g -> {
			map.put("guild.identifier", g.identifier());
			map.put("guild.displayName", g.displayName());
		});
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.unicode.UnicodeCommand', 'chrisliebaer.chrisliebot.util.ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
				.description(out ->
						out.appendEscape(flavour).appendEscape(" ").appendEscape(choice, ChrislieFormat.HIGHLIGHT))
				.convert("${description}")
				.send();
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.urlpreview.GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			Elements metaOgTitle = doc.select("meta[property=og:title]");
			if (metaOgTitle != null) {
				var ogTitle = metaOgTitle.attr("content");
				summary = ogTitle.isEmpty() ? summary : ogTitle;
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.urlpreview.GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			Elements metaOgDescription = doc.select("meta[property=og:description]");
			if (metaOgDescription != null) {
				var ogDescription = metaOgDescription.attr("content");
				summary += ogDescription.isEmpty() ? "" : (" - " + ogDescription);
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.SharedResources', 'chrisliebaer.chrisliebot.command.qwant.QwantSearchCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		var req = new Request.Builder().get()
				.url(url)
				.header("User-Agent", "Twitterbot/1.0") // otherwise we get blocked too often :(
				.build();
		var call = client.newCall(req);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.parser.TokenSelector', 'chrisliebaer.chrisliebot.util.parser.ChrislieParser'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
			
			if (!p.canRead())
				throw new ChrislieParser.ParserException(p, "unexpected EOF");
			
			StringBuilder sb = new StringBuilder();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.parser.TokenSelector', 'chrisliebaer.chrisliebot.util.parser.ChrislieParser'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
			
			if (!p.canRead())
				throw new ChrislieParser.ParserException(p, "unexpected EOF");
			
			int quote = p.consumeCodepoint();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.irc.IrcFormatter'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
			return format + s + format;
		
		throw new UnsupportedOperationException("unkown format: " + format);
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordPrivateChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public Optional<DiscordUser> resolve(String callName) {
		throw new RuntimeException("not yet implemented"); // TODO
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordSlashCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				}
			} catch (IOException e) {
				log.warn("failed to upload attachments, falling back to regular message", e);
				// regular upload follows after catch block and try has return statement
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.reddit.RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		if (post.title() == null)
			out.title("Zum Beitrag", "https://www.reddit.com" + post.permalink());
		else
			out.title(post.title(), "https://www.reddit.com" + post.permalink());
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.reddit.RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			out.title("Zum Beitrag", "https://www.reddit.com" + post.permalink());
		else
			out.title(post.title(), "https://www.reddit.com" + post.permalink());
		
		if (post.preview() != null
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	private void deleteTimerRecord(long id) {
		String sql = "UPDATE timer SET deleted = TRUE WHERE id = ?";
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, id);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			
			// we know the user is allowed to modify the timer and we know it exists, so we simply update it without further checks
			String sql = "UPDATE timer SET deleted = TRUE WHERE id = ?";
			try (var stmt = conn.prepareStatement(sql)) {
				stmt.setLong(1, id);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				infoCommand(invc);
				return;
			} else if (arg.startsWith("snooze")) {
				snoozeCommand(invc);
				return;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer', 'chrisliebaer.chrisliebot.abstraction.irc.IrcLogger'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.id = rs.getLong("id");
		
		timerInfo.service = rs.getString("service");
		timerInfo.user = rs.getString("user");
		timerInfo.channel = rs.getString("channel");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel', 'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.service = rs.getString("service");
		timerInfo.user = rs.getString("user");
		timerInfo.channel = rs.getString("channel");
		
		// janky overflow shit can lead to unix epoch of 0 in DB which will cause jdbc to read "NULL" and lead to NPE, so we use unix_epoch of 1 instead
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.due = Objects.requireNonNullElse(rs.getTimestamp("due"), UNIX_EPOCH_SECOND_1).toInstant();
		
		var timestamp = rs.getTimestamp("snooze");
		if (timestamp != null)
			timerInfo.snooze = timestamp.toInstant();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.qwant.QwantSearchCommand', 'chrisliebaer.chrisliebot.abstraction.irc.IrcOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput title(String title, String url) {
		map.put("title", title);
		map.put("titleUrl", url);
		return this;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.qwant.QwantSearchCommand', 'chrisliebaer.chrisliebot.abstraction.irc.IrcOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
		public String get() {
			String out = "";
			var title = map.get("title");
			if (title != null && !title.isBlank()) {
				out += title;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
			case TEXT -> channel = new DiscordGuildChannel(service, ev.getTextChannel());
			case PRIVATE -> channel = new DiscordPrivateChannel(service, ev.getPrivateChannel());
			default -> throw new RuntimeException("message was sent in unkown channel type");
		}
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordChannelOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
					}
				} catch (IOException e) {
					log.warn("failed to upload attachments, falling back to regular message", e);
					restAction = hook.sendMessage(message.noUpload()).setEphemeral(isError);
				}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.irc.IrcBootstrap'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcLogger.java`
#### Snippet
```java
	
	private void error(Throwable t) {
		runMdc(() -> log.error("error in irc library", t));
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer', 'chrisliebaer.chrisliebot.abstraction.irc.IrcLogger'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcLogger.java`
#### Snippet
```java
	
	private void runMdc(Runnable r) {
		MDC.put("service", name);
		r.run();
		MDC.remove("service");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.config.JsonBotConfig.Builder', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer', 'chrisliebaer.chrisliebot.abstraction.irc.IrcLogger'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcLogger.java`
#### Snippet
```java
		MDC.put("service", name);
		r.run();
		MDC.remove("service");
	}
}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			HashMap<String, String> map = new HashMap<>();
			map.put("arg", escapeStrSubstitution(invocation.arg().strip()));
			map.put("displayName", escapeStrSubstitution(user.displayName()));
			map.put("channel.name", escapeStrSubstitution(msg.channel().displayName()));
			map.put("channel.mention", escapeStrSubstitution(msg.channel().mention()));
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			map.put("channel.name", escapeStrSubstitution(msg.channel().displayName()));
			map.put("channel.mention", escapeStrSubstitution(msg.channel().mention()));
			map.put("mention", escapeStrSubstitution(user.mention()));
			map.put("guild.displayName", escapeStrSubstitution(msg.channel().guild().map(ChrislieGuild::displayName).orElse(msg.channel().displayName())));
			
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.external.ExternalMessageTranslator'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			map.put("channel.mention", escapeStrSubstitution(msg.channel().mention()));
			map.put("mention", escapeStrSubstitution(user.mention()));
			map.put("guild.displayName", escapeStrSubstitution(msg.channel().guild().map(ChrislieGuild::displayName).orElse(msg.channel().displayName())));
			
			cache.put("message", Optional.of(map));
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.external.ExternalMessageTranslator', 'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			map.put("guild.displayName", escapeStrSubstitution(msg.channel().guild().map(ChrislieGuild::displayName).orElse(msg.channel().displayName())));
			
			cache.put("message", Optional.of(map));
		}
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.qwant.QwantSearchCommand', 'chrisliebaer.chrisliebot.command.urlpreview.GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		
		var builder = new OkHttpClient.Builder()
				.addNetworkInterceptor(c -> c.proceed(c.request().newBuilder().header("User-Agent", DEFAULT_USER_AGENT).build()))
				.addNetworkInterceptor(httpLogger);
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.mensa.api.MensaApiService'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	
	@GET("general/")
	public Call<MensaApiMeta> getMeta(@Header("Authorization") String credentials);
	
	@GET("canteen/")
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.mensa.api.MensaApiService'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	
	@GET("canteen/")
	public Call<JsonElement> getCanteen(@Header("Authorization") String credentials);
	
	/**
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.external.ExternalMessageTranslator'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
public class ChrislieDispatcher {
	
	private static final String DISPATCHER_PATTERN_GROUP_ALIAS = "alias";
	private static final String DISPATCHER_PATTERN_GROUP_ARGUMENT = "argument";
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.external.ExternalMessageTranslator'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	
	private static final String DISPATCHER_PATTERN_GROUP_ALIAS = "alias";
	private static final String DISPATCHER_PATTERN_GROUP_ARGUMENT = "argument";
	
	private Chrisliebot chrisliebot;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.qwant.QwantService.Type'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.qwant.QwantService'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		WEB("web"),
		NEWS("news"),
		IMAGE("images");
		private String code;
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
		return new ErrorOutputBuilder()
				.fn(out -> {
					out.title("Server meldet fehler");
					out.description()
							.appendEscape(String.valueOf(resp.code()), ChrislieFormat.HIGHLIGHT)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	@CheckReturnValue
	public static ErrorOutputBuilder generic(String description) {
		return new ErrorOutputBuilder().fn(out -> defaultConvert(out.title("Fehler").description(description).convert()));
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.choice.ChoiceCommand', 'chrisliebaer.chrisliebot.command.unicode.UnicodeCommand'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	private static void defaultConvert(PlainOutput.PlainOutputSubstituion convert) {
		convert.appendEscapeSub("[${title}] ", Format.RED, Format.BOLD).appendEscapeSub("${description}");
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
		return new ErrorOutputBuilder().fn(out -> {
			outFn.accept(out.description());
			defaultConvert(out.title("Fehler").convert());
		});
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
		return new ErrorOutputBuilder()
				.fn(out -> {
					out.title("Server meldet fehler");
					out.description()
							.appendEscape(String.valueOf(resp.code()), ChrislieFormat.HIGHLIGHT)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.util.parser.TokenSelector'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	protected int consumeCodepoint() throws ParserException {
		if (!canRead())
			throw new ParserException(this, "unexpected EOF");
		return codepoints[idx++];
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.abstraction.discord.DiscordGuildChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	@Override
	public Optional<DiscordUser> resolve(String callName) {
		throw new RuntimeException("not yet implemented"); // TODO
	}
	
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		int capacity;
		try {
			capacity = Integer.parseInt(matcher.group("capacity"));
			if (capacity <= 0)
				throw new NumberFormatException("edge capacity must be greater zero");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
					.appendEscape(edge.toString(), ChrislieFormat.CODE)
					.appendEscape(" mit Wert ")
					.appendEscape(matcher.group("capacity"), ChrislieFormat.CODE))
					.write(invc).send();
			return false;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		if (list.isEmpty()) {
			simpleOutput(invc.reply(), "Keine Berechnungen f?r %s".formatted(container.name), "EMPTY").send();
		} else {
			var output = list.stream()
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var from = Node.withName(parser.word(true).consume().expect("start node"));
		if (!graph.contains(from)) {
			ErrorOutputBuilder.generic("Der Graph %s hat keinen Node mit dem Namen: %s".formatted(container.name, from.name())).write(invc).send();
			return;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var to = Node.withName(parser.word(true).consume().expect("finish node"));
		if (!graph.contains(to)) {
			ErrorOutputBuilder.generic("Der Graph %s hat keinen Node mit dem Namen: %s".formatted(container.name, to.name())).write(invc).send();
			return;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		if (list.isEmpty()) {
			simpleOutput(invc.reply(), "Keine Graphen vorhanden", "EMPTY").send();
		} else {
			var output = list.stream().map(c -> "%s %d".formatted(c.name, c.graph.nodeCount())).collect(Collectors.joining("\n"));
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				 */
				case "add" -> {
					var name = parser.word(true).consume().expect("graph name");
					var container = graphs.get(name);
					if (container == null)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
					var nameToken = parser.word(true).peek();
					if (nameToken.isSuccess()) {
						var name = nameToken.expect("graph name");
						var container = graphs.get(name);
						if (container == null) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
						var container = graphs.get(name);
						if (container == null) {
							ErrorOutputBuilder.generic("Ich kenn keinen Graphen mit dem Namen " + name).write(invc).send();
							return;
						}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				 */
				case "print" -> {
					var name = parser.word(true).consume().expect("graph name");
					var container = graphs.get(name);
					if (container == null) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
					var container = graphs.get(name);
					if (container == null) {
						ErrorOutputBuilder.generic("Ich kenn keinen Graphen mit dem Namen " + name).write(invc).send();
						return;
					}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				 */
				case "flow" -> {
					var name = parser.word(true).consume().expect("graph name");
					var container = graphs.get(name);
					if (container == null) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
					var container = graphs.get(name);
					if (container == null) {
						ErrorOutputBuilder.generic("Ich kenn keinen Graphen mit dem Namen " + name).write(invc).send();
						return;
					}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.dns.DnsCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		if (!GRAPH_NAME_PATTERN.matcher(name).matches()) {
			ErrorOutputBuilder.generic(out -> out.appendEscape("Der Name ").appendEscape(name, ChrislieFormat.BOLD).appendEscape(" ist ung?ltig."))
					.write(invc).send();
			return;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		parser.skipWhitespaces();
		if (parser.codepoint().canRead()) {
			ErrorOutputBuilder.generic("Da h?ngen Daten hinter der Graph Definition, die ich nicht verstehe.").write(invc).send();
			return;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.kit.finals2021.escaperoutes.KitEscapeRoutesCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		parser.skipWhitespaces();
		if (parser.codepoint().canRead()) {
			ErrorOutputBuilder.generic("Da h?ngen Daten hinter der Graph Definition, die ich nicht verstehe.").write(invc).send();
			return;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.config.JsonBotConfig.JsonFlexConfResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				return Optional.ofNullable(gson.fromJson(val, type));
			} catch (JsonSyntaxException e) {
				log.warn("failed to get key `{}` from flexconf as `{}` with json representation `{}` flexconf is: {}", key, type, val, this, e);
				return Optional.empty();
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.command.specialchannel.SpecialChannel', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				case "and" -> CombinationSelector.and(instanceSelectors(json.json));
				case "nsfw" -> new NSFWSelector();
				case "channel" -> new ChannelSelector();
				case "regex" -> new RegExpSelector();
				case "userExistsInChannel" -> new UserExistsInChannel();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.command.timer.TimerCommand', 'chrisliebaer.chrisliebot.config.scope.selector.RegExpSelector.DataContainer', 'chrisliebaer.chrisliebot.abstraction.irc.IrcLogger'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				case "userExistsInChannel" -> new UserExistsInChannel();
				case "userIsPartOfGuild" -> new UserIsPartOfGuild();
				case "service" -> new ServiceIdentifierSelector();
				case "irc" -> new ServiceSelector.IrcSelector();
				case "discord" -> new ServiceSelector.DiscordSelector();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'chrisliebaer.chrisliebot.config.JsonBotConfig.JsonFlexConfResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				return Optional.ofNullable(gson.fromJson(val, clazz));
			} catch (JsonSyntaxException e) {
				log.warn("failed to get key `{}` from flexconf as `{}` with json representation `{}` flexconf is: {}", key, clazz, val, this, e);
				return Optional.empty();
			}
```

## AssignmentToNull
### AssignmentToNull
'null' assigned to variable `source`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
		this.service = service;
		this.channel = channel;
		source = null;
	}
	
```

## CollectionsMustHaveInitialCapacity
### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	
	public void ensureDisjoint() {
		Set<String> set = new HashSet<>();
		ensureDisjoint(set, irc.keySet());
		ensureDisjoint(set, discord.keySet());
```

### CollectionsMustHaveInitialCapacity
`new IdentityHashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	private Map<String, ListenerContext> aliases = new HashMap<>();
	
	private Set<ChrislieGroup> included = Collections.newSetFromMap(new IdentityHashMap<>());
	
	@Getter private FlexConf flexConf = new FlexConf();
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	private Map<String, ListenerContext> listeners = new HashMap<>();
	private Map<String, ListenerContext> aliases = new HashMap<>();
	
	private Set<ChrislieGroup> included = Collections.newSetFromMap(new IdentityHashMap<>());
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
public class ChrislieContext {
	
	private Map<String, ListenerContext> listeners = new HashMap<>();
	private Map<String, ListenerContext> aliases = new HashMap<>();
	
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		
		// build list of command data for discord api from context refs
		var commandDatas = new ArrayList<CommandData>();
		for (var ref : refs) {
			
```

### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	// keeps track of which guilds we have already registered our commands
	private final Set<Long> registeredGuilds = new HashSet<>();
	
	private final BetterScheduledService commandUpdaterService;
```

### CollectionsMustHaveInitialCapacity
`new HashSet`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
			var emote = maybeEmote.get();
			
			var roles = new HashSet<Role>();
			while (parser.word(true).canRead()) {
				var input = parser.word(true).consume().expect();
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// bot config requires running serivces, so services go first
		coreCfg.ensureDisjoint();
		Map<String, ServiceBootstrap> bootstraps = new HashMap<>();
		bootstraps.putAll(coreCfg.irc());
		bootstraps.putAll(coreCfg.discord());
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	 * List of currently active services.
	 */
	private Map<String, ChrislieService> services = new HashMap<>();
	
	/**
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	private MensaApiService service;
	
	private Map<String, Mensa> menu = new HashMap<>();
	
	@Override
```

### CollectionsMustHaveInitialCapacity
`new HashMap`>() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
			}
			
			var newTaggedMemes = new HashMap<String, List<DatabaseEntry>>();
			for (var meme : responseMemes) {
				for (var tag : meme.tags()) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
			for (var meme : responseMemes) {
				for (var tag : meme.tags()) {
					var memeList = newTaggedMemes.computeIfAbsent(tag, k -> new ArrayList<>());
					memeList.add(meme);
				}
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		predicates = new ArrayList<>();
		
		if (cfg.file)
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	public Map<String, String> toFlatMap(@NonNull ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
		Map<String, Object> map = new HashMap<>();
		toFlatMap(map, flexValues, m);
		return stringifyMap(map);
```

### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	private static final String ENV_PREFIX = "CB_";
	
	private Set<String> flexValues = new HashSet<>();
	
	public ExternalMessageTranslator withFlex(@NonNull String key) {
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	public Map<String, String> toFlatMap(@NonNull ChrislieListener.Invocation m) throws ChrislieListener.ListenerException {
		Map<String, Object> map = new HashMap<>();
		toFlatMap(map, flexValues, m);
		return stringifyMap(map);
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
public final class FlowGraph {
	
	private final Map<Edge, Integer> edges = new HashMap<>();
	private final Set<Node> nodes = new HashSet<>();
	
```

### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	
	private final Map<Edge, Integer> edges = new HashMap<>();
	private final Set<Node> nodes = new HashSet<>();
	
	private FlowGraph() {}
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			var localEmbedBuilder = new EmbedBuilder(embedBuilder);
			
			var files = new ArrayList<SinkMessageData.UploadFile>();
			if (imageUrl != null) {
				// check if we can derive a file name for this url
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
public class DiscordPlainOutput extends PlainOutputImpl {
	
	private final List<Consumer<MessageBuilder>> mentionsTransformers = new ArrayList<>();
	
	public DiscordPlainOutput(@NonNull Function<String, String> escaper, @NonNull BiFunction<Object, String, String> formatResolver) {
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
public final class MaxFlowSolver {
	
	private final Map<Edge, Integer> edges = new HashMap<>();
	
	private MaxFlowSolver(Map<Edge, Integer> edges) {
```

### CollectionsMustHaveInitialCapacity
`new HashMap`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
		
		// keep track of traversal
		var parents = new HashMap<Node, Node>();
		var visited = new HashSet<Node>(lookup.size());
		var pending = new LinkedList<Node>();
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
			// we reached final node, backtrack with parent information
			if (node.equals(finish)) {
				var path = new ArrayList<Edge>();
				var current = node;
				while (parents.containsKey(current)) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private BiFunction<Object, String, String> formatResolver;
	
	private List<Supplier<String>> calls = new ArrayList<>();
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private DataSource dataSource;
	
	private final Map<Long, ScheduledTimer> runtimeTimer = new HashMap<>();
	
	@Override
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		Predicate<TimerInfo> pred = accessPredicate(invc.msg());
		
		List<TimerInfo> timerList = new ArrayList<>();
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, invc.service().identifier());
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		String sql = "SELECT * FROM timer WHERE deleted = FALSE AND TIMESTAMPDIFF(SECOND, NOW(), COALESCE(snooze, due)) < ?";
		List<TimerInfo> timers = new ArrayList<>();
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			var msg = invocation.msg();
			var user = msg.user();
			HashMap<String, String> map = new HashMap<>();
			map.put("arg", escapeStrSubstitution(invocation.arg().strip()));
			map.put("displayName", escapeStrSubstitution(user.displayName()));
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
		// some emotes might be limited to certain roles, and can't be posted, but we still track them
		int filtered = 0;
		var list = new ArrayList<Emote>();
		for (var emote : jda.getEmotes()) {
			if (emote.canInteract(self, channel))
```

### CollectionsMustHaveInitialCapacity
`new HashSet`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
		
		// consume all loger names and collectively update their level
		var names = new HashSet<String>();
		while (parser.word(true).canRead())
			names.add(parser.word(true).consume().expect());
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
		
		// extract all groups from mapping (remember that group names are unique)
		groups = new HashMap<>();
		mappings.stream()
				.map(ScopeMapping::groups)
```

### CollectionsMustHaveInitialCapacity
`new IdentityHashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
		
		// extract all listeners from all groups (identity is only way to make sure we got each listener exactly once)
		envelopes = Collections.newSetFromMap(new IdentityHashMap<>());
		groups.values().stream()
				.map(ChrislieGroup::refs)
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				
				var mainline = gson.fromJson(items, QwantMainlineItemsBullshit.class);
				var list = new ArrayList<QwantItem>();
				for (var result : mainline.mainline) {
					if (result.type.equalsIgnoreCase(type.code)) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// create group (and parent groups)
					List<ChrislieGroup> list = new ArrayList<>();
					
					// skip groups with no includes
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			this.gson = gson;
			
			chrislieGroups = new HashMap<>();
			
			ensureNonNull(groups, "group list is null");
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// will return existing group when called twice with same group
					var g = instanceGroup(name, group, new ArrayList<>());
					mappingGroups.add(g);
				}
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	private static final Pattern GRAPH_NODE_SPEC_PATTERN = Pattern.compile("(?<from>[a-z]{1,6})(?<capacity>[0-9]+)(?<to>[a-z]{1,6})");
	
	private final Map<String, GraphContainer> graphs = new HashMap<>();
	
	@Override
```

### CollectionsMustHaveInitialCapacity
`new HashSet`() without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		}
		
		var edgeStore = new HashSet<Edge>();
		for (String edgeSpec : edgeSpecs) {
			// abort on error
```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		private final String name;
		private final FlowGraph graph;
		private final HashMap<FlowQuery, Long> resultCache = new HashMap<>();
		
		@Override
```

### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		}
		
		if (!applyGraphSpec(invc, graph, edgeSpec, new HashSet<>()))
			return;
		
```

## MultiplyOrDivideByPowerOfTwo
### MultiplyOrDivideByPowerOfTwo
`s.length() * 2` can be replaced with 's.length()\<\<1'
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	private String emojify(String s) {
		var matcher = WHITESPACE_PATTERN.matcher(s);
		var sb = new StringBuilder(s.length() * 2);
		while (matcher.find()) {
			matcher.appendReplacement(sb, " " + randomEmoji() + " ");
```

## ClassReferencesSubclass
### ClassReferencesSubclass
Class 'PlainOutput' references subclass `JoinPlainOutput`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput clear();
	
	public default JoinPlainOutput joiner(String delimiter) {
		return new JoinPlainOutput(this, delimiter);
	}
```

## TypeMayBeWeakened
### TypeMayBeWeakened
Type of parameter `set` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	}
	
	private static void ensureDisjoint(Set<String> set, Set<String> serviceKeys) {
		for (String s : serviceKeys) {
			if (set.contains(s))
```

### TypeMayBeWeakened
Type of parameter `serviceKeys` may be weakened to 'java.lang.Iterable'
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	}
	
	private static void ensureDisjoint(Set<String> set, Set<String> serviceKeys) {
		for (String s : serviceKeys) {
			if (set.contains(s))
```

### TypeMayBeWeakened
Type of parameter `groups` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/ScopeMapping.java`
#### Snippet
```java
	@Getter private List<ChrislieGroup> groups;
	
	public ScopeMapping(List<Selector> selectors, List<ChrislieGroup> groups) {
		super(selectors, Operation.AND);
		this.groups = ImmutableList.copyOf(groups);
```

### TypeMayBeWeakened
Type of field `DUMMY` may be weakened to 'chrisliebaer.chrisliebot.abstraction.PlainOutput.PlainOutputSubstituion'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public static final class PlainOutputDummy implements PlainOutputSubstituion {
		
		private static final PlainOutputDummy DUMMY = new PlainOutputDummy();
		
		private PlainOutputDummy() { }
```

### TypeMayBeWeakened
Type of parameter `groups` may be weakened to 'java.lang.Iterable'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public void addGroups(Collection<ChrislieGroup> groups) {
		groups.forEach(this::addGroup);
	}
```

### TypeMayBeWeakened
Type of parameter `s` may be weakened to 'java.lang.CharSequence'
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	}
	
	private String emojify(String s) {
		var matcher = WHITESPACE_PATTERN.matcher(s);
		var sb = new StringBuilder(s.length() * 2);
```

### TypeMayBeWeakened
Type of variable `slashCommand` may be weakened to 'chrisliebaer.chrisliebot.abstraction.ChrislieMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		var args = argsOpt == null ? "" : argsOpt.getAsString();
		
		var slashCommand = new DiscordSlashCommandMessage(this, ev);
		
		sink.accept(slashCommand);
```

### TypeMayBeWeakened
Type of field `registeredGuilds` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	// keeps track of which guilds we have already registered our commands
	private final Set<Long> registeredGuilds = new HashSet<>();
	
	private final BetterScheduledService commandUpdaterService;
```

### TypeMayBeWeakened
Type of variable `guilds` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			// there is no easy way to check which guilds need to be updated with new commands, so we simply update all
			synchronized (registeredGuilds) {
				var guilds = new ArrayList<>(jda.getGuilds()); // returned list is immutable
				guilds.removeIf(guild -> registeredGuilds.contains(guild.getIdLong()));
				
```

### TypeMayBeWeakened
Type of parameter `s` may be weakened to 'java.lang.CharSequence'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	 * @return The escaped string.
	 */
	public String escapeNicks(String s) {
		Pattern nickPattern = Pattern.compile(
				channel.getNicknames().stream().map(Pattern::quote).collect(Collectors.joining("|")),
```

### TypeMayBeWeakened
Type of variable `message` may be weakened to 'chrisliebaer.chrisliebot.abstraction.ChrislieMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
		
		try {
			var message = (DiscordMessage) invc.msg();
			var maybeGuild = message.channel().guild().map(g -> (DiscordGuild) g);
			if (maybeGuild.isEmpty()) {
```

### TypeMayBeWeakened
Type of variable `roles` may be weakened to 'java.util.Set'
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
			var emote = maybeEmote.get();
			
			var roles = new HashSet<Role>();
			while (parser.word(true).canRead()) {
				var input = parser.word(true).consume().expect();
```

### TypeMayBeWeakened
Type of parameter `ev` may be weakened to 'org.kitteh.irc.client.library.event.helper.ChannelUserListChangeEvent'
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuit(UserQuitEvent ev) {
		if (ev.getAffectedChannel().isPresent()) {
			logMessage(new Date(), ev.getAffectedChannel().get().getName(), ev.getUser(), null, MessageType.QUIT);
```

### TypeMayBeWeakened
Type of variable `message` may be weakened to 'chrisliebaer.chrisliebot.abstraction.ChrislieMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		if (maybeChannel.isPresent()) {
			var channel = maybeChannel.get();
			var message = new CronCommandMessage(channel.service().botUser(), channel, entry.msg, entry.asParse());
			bot.dispatcher().dispatch(message);
		} else {
```

### TypeMayBeWeakened
Type of parameter `flexValues` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		}
		
		public static ExternalInvocation of(ChrislieListener.ListenerMessage m, Set<String> flexValues) {
			var msg = m.msg();
			
```

### TypeMayBeWeakened
Type of parameter `flexValues` may be weakened to 'java.lang.Iterable'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	private static void toFlatMap(Map<String, Object> map, Set<String> flexValues, ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
		var msg = m.msg();
		var channel = msg.channel();
```

### TypeMayBeWeakened
Type of variable `stringMap` may be weakened to 'java.util.Map'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	private static Map<String, String> stringifyMap(Map<String, Object> map) {
		var stringMap = new HashMap<String, String>(map.size());
		for (var e : map.entrySet()) {
			stringMap.put(ENV_PREFIX + e.getKey(), String.valueOf(e.getValue()));
```

### TypeMayBeWeakened
Type of parameter `s` may be weakened to 'java.lang.CharSequence'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	}
	
	private void addMention(String s, Pattern pattern, Consumer<String> callback) {
		var matcher = pattern.matcher(s);
		while (matcher.find()) {
```

### TypeMayBeWeakened
Type of variable `parents` may be weakened to 'java.util.Map'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
		
		// keep track of traversal
		var parents = new HashMap<Node, Node>();
		var visited = new HashSet<Node>(lookup.size());
		var pending = new LinkedList<Node>();
```

### TypeMayBeWeakened
Type of variable `visited` may be weakened to 'java.util.Set'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
		// keep track of traversal
		var parents = new HashMap<Node, Node>();
		var visited = new HashSet<Node>(lookup.size());
		var pending = new LinkedList<Node>();
		
```

### TypeMayBeWeakened
Type of variable `path` may be weakened to 'java.util.List'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
			// we reached final node, backtrack with parent information
			if (node.equals(finish)) {
				var path = new ArrayList<Edge>();
				var current = node;
				while (parents.containsKey(current)) {
```

### TypeMayBeWeakened
Type of variable `message` may be weakened to 'chrisliebaer.chrisliebot.abstraction.ChrislieMessage'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	public boolean check(ChrislieMessage chrislieMessage) {
		if (chrislieMessage instanceof DiscordMessage) {
			var message = (DiscordMessage) chrislieMessage;
			var maybeGuild = message.channel().guild();
			if (maybeGuild.isEmpty())
```

### TypeMayBeWeakened
Type of variable `textChannel` may be weakened to 'net.dv8tion.jda.api.entities.GuildChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				
				// check if we can upload files
				var textChannel = (TextChannel) channel;
				var selfMember = textChannel.getGuild().getMember(textChannel.getJDA().getSelfUser());
				canUpload = selfMember.hasPermission(textChannel, Permission.MESSAGE_ATTACH_FILES);
```

### TypeMayBeWeakened
Type of parameter `msg` may be weakened to 'java.lang.CharSequence'
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	}
	
	private static String ultimateTextMassacre(@NonNull String msg) {
		Matcher matcher = INNER_WORD_PATTERN.matcher(msg);
		return matcher.replaceAll(matchResult -> {
```

### TypeMayBeWeakened
Type of field `calls` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private BiFunction<Object, String, String> formatResolver;
	
	private List<Supplier<String>> calls = new ArrayList<>();
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
```

### TypeMayBeWeakened
Type of parameter `channel` may be weakened to 'org.kitteh.irc.client.library.element.Actor'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	}
	
	protected Optional<IrcGuild> channelToGuild(Channel channel) {
		var channelName = channel.getName();
		for (var e : guildMap.asMap().entrySet()) {
```

### TypeMayBeWeakened
Type of variable `map` may be weakened to 'java.util.Map'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			var msg = invocation.msg();
			var user = msg.user();
			HashMap<String, String> map = new HashMap<>();
			map.put("arg", escapeStrSubstitution(invocation.arg().strip()));
			map.put("displayName", escapeStrSubstitution(user.displayName()));
```

### TypeMayBeWeakened
Type of variable `msg` may be weakened to 'chrisliebaer.chrisliebot.abstraction.ChrislieMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
		
		var service = (DiscordService) invc.service();
		var msg = (DiscordMessage) invc.msg();
		var channel = msg.channel().messageChannel();
		var jda = service.jda();
```

### TypeMayBeWeakened
Type of variable `list` may be weakened to 'java.util.List'
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
		// some emotes might be limited to certain roles, and can't be posted, but we still track them
		int filtered = 0;
		var list = new ArrayList<Emote>();
		for (var emote : jda.getEmotes()) {
			if (emote.canInteract(self, channel))
```

### TypeMayBeWeakened
Type of variable `names` may be weakened to 'java.util.Set'
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
		
		// consume all loger names and collectively update their level
		var names = new HashSet<String>();
		while (parser.word(true).canRead())
			names.add(parser.word(true).consume().expect());
```

### TypeMayBeWeakened
Type of parameter `calls` may be weakened to 'java.lang.Iterable'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	}
	
	private static void applyCalls(List<PlainOutputCall> calls, PlainOutput out, Function<String, String> fn) {
		calls.forEach(call -> call.apply(out, fn));
	}
```

### TypeMayBeWeakened
Type of variable `list` may be weakened to 'java.util.List'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				
				var mainline = gson.fromJson(items, QwantMainlineItemsBullshit.class);
				var list = new ArrayList<QwantItem>();
				for (var result : mainline.mainline) {
					if (result.type.equalsIgnoreCase(type.code)) {
```

### TypeMayBeWeakened
Type of variable `outOnly` may be weakened to 'java.util.Set'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private ChrislieOutput warnInvalidGraph(FlowGraph graph, ChrislieOutput out) {
		var outOnly = new HashSet<>(graph.nodes());
		var inOnly = new HashSet<>(graph.nodes());
		
```

### TypeMayBeWeakened
Type of variable `inOnly` may be weakened to 'java.util.Set'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	private ChrislieOutput warnInvalidGraph(FlowGraph graph, ChrislieOutput out) {
		var outOnly = new HashSet<>(graph.nodes());
		var inOnly = new HashSet<>(graph.nodes());
		
		for (var edge : graph.toEdgeMap().keySet()) {
```

### TypeMayBeWeakened
Type of parameter `edgeStore` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	}
	
	private boolean applyGraphSpec(Invocation invc, FlowGraph graph, String spec, Set<Edge> edgeStore) throws ListenerException, IllegalGraphException {
		var matcher = GRAPH_NODE_SPEC_PATTERN.matcher(spec);
		
```

### TypeMayBeWeakened
Type of variable `list` may be weakened to 'java.util.List'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	private synchronized void actionPrintGraph(Invocation invc, GraphContainer container) throws ListenerException {
		var graph = container.graph;
		var list = new ArrayList<>(graph.toEdgeMap().entrySet());
		list.sort(Map.Entry.comparingByKey());
		var output = list.stream().map(e ->
```

### TypeMayBeWeakened
Type of variable `list` may be weakened to 'java.util.List'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var reply = invc.reply();
		
		var list = new ArrayList<>(container.resultCache.entrySet());
		list.sort((o1, o2) -> {
			if (o1.getValue() < o2.getValue())
```

### TypeMayBeWeakened
Type of variable `list` may be weakened to 'java.util.List'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private synchronized void actionListGraphs(Invocation invc) throws ListenerException {
		var list = new ArrayList<>(graphs.values());
		Collections.sort(list);
		
```

### TypeMayBeWeakened
Type of variable `edgeStore` may be weakened to 'java.util.Set'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		}
		
		var edgeStore = new HashSet<Edge>();
		for (String edgeSpec : edgeSpecs) {
			// abort on error
```

### TypeMayBeWeakened
Type of field `resultCache` may be weakened to 'java.util.Map'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		private final String name;
		private final FlowGraph graph;
		private final HashMap<FlowQuery, Long> resultCache = new HashMap<>();
		
		@Override
```

### TypeMayBeWeakened
Type of variable `nameTracker` may be weakened to 'java.util.Collection'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// resolve listener and create reference in group
					Set<String> nameTracker = new HashSet<>(group.listener.size()); // prevent duplicated listener names
					List<ListenerReference> refs = new ArrayList<>(group.listener.size());
					for (ListenerAnchor anchor : group.listener) {
```

## MethodCallInLoopCondition
### MethodCallInLoopCondition
Call to method `isEmpty()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			StringBuilder sb = new StringBuilder();
			
			while (!remain.isEmpty()) {
				
				// check if adding string would exceed limit
```

### MethodCallInLoopCondition
Call to method `find()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
		var matcher = WHITESPACE_PATTERN.matcher(s);
		var sb = new StringBuilder(s.length() * 2);
		while (matcher.find()) {
			matcher.appendReplacement(sb, " " + randomEmoji() + " ");
		}
```

### MethodCallInLoopCondition
Call to method `word()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
			
			var roles = new HashSet<Role>();
			while (parser.word(true).canRead()) {
				var input = parser.word(true).consume().expect();
				
```

### MethodCallInLoopCondition
Call to method `canRead()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
			
			var roles = new HashSet<Role>();
			while (parser.word(true).canRead()) {
				var input = parser.word(true).consume().expect();
				
```

### MethodCallInLoopCondition
Call to method `parseShort()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
				
				// short-option, current symbol is short option, pass directly to parser function
				while (parseShort(parser)) {
					
					// current symbol being whitespace indicates that flag group ended
```

### MethodCallInLoopCondition
Call to method `canRead()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
			
			StringBuilder sb = new StringBuilder();
			while (p.canRead()) {
				int cp = p.consumeCodepoint();
				if (Character.isWhitespace(cp)) // impossible on first loop since we skipped whitespaces and checked for EOF
```

### MethodCallInLoopCondition
Call to method `canRead()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
				StringBuilder sb = new StringBuilder();
				boolean escape = false;
				while (p.canRead()) {
					int cp = p.consumeCodepoint();
					
```

### MethodCallInLoopCondition
Call to method `find()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	private void addMention(String s, Pattern pattern, Consumer<String> callback) {
		var matcher = pattern.matcher(s);
		while (matcher.find()) {
			var id = matcher.group(1); // first group is id as string (which is okay since jda takes string as id)
			callback.accept(id);
```

### MethodCallInLoopCondition
Call to method `isEmpty()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
		pending.addFirst(start);
		
		while (!pending.isEmpty()) {
			var node = pending.removeLast();
			
```

### MethodCallInLoopCondition
Call to method `containsKey()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
				var path = new ArrayList<Edge>();
				var current = node;
				while (parents.containsKey(current)) {
					var parent = parents.get(current);
					path.add(Edge.between(parent, current));
```

### MethodCallInLoopCondition
Call to method `length()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
		var arg = invc.arg();
		StringBuilder sb = new StringBuilder(arg.length());
		for (int i = 0; i < arg.length(); i++) {
			int cp = arg.codePointAt(i);
			int idx = LOOKUP_NORMAL.indexOf(cp);
```

### MethodCallInLoopCondition
Call to method `word()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
		// consume all loger names and collectively update their level
		var names = new HashSet<String>();
		while (parser.word(true).canRead())
			names.add(parser.word(true).consume().expect());
		
```

### MethodCallInLoopCondition
Call to method `canRead()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
		// consume all loger names and collectively update their level
		var names = new HashSet<String>();
		while (parser.word(true).canRead())
			names.add(parser.word(true).consume().expect());
		
```

### MethodCallInLoopCondition
Call to method `get()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		// wait for other threads to exit dispatcher section
		synchronized (shutdownCounter) {
			while (shutdownCounter.get() != 0)
				shutdownCounter.wait();
		}
```

### MethodCallInLoopCondition
Call to method `canRead()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	public void skipWhitespaces() {
		while (canRead() && Character.isWhitespace(codepoints[idx]))
			skipCodepoints(1);
	}
```

### MethodCallInLoopCondition
Call to method `isWhitespace()` in loop condition
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	public void skipWhitespaces() {
		while (canRead() && Character.isWhitespace(codepoints[idx]))
			skipCodepoints(1);
	}
```

## CallToSuspiciousStringMethod
### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
		// check of message jump url
		var ownMessage = msg.getReferencedMessage();
		var matcher = JUMP_URL_PATTERN.matcher(invc.arg().trim());
		if (matcher.matches()) {
			var guildId = matcher.group(1);
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
			
			try {
				if ("@me".equals(guildId)) {
					var channel = jda.getPrivateChannelById(channelId);
					if (channel != null)
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg().trim();
		var m = invc.msg();
		
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	
	public static Optional<DayOfWeek> stringToDay(@NonNull String day) {
		day = day.trim().toLowerCase();
		
		return switch (day) {
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	public Optional<IrcUser> resolve(String callName) {
		var user = this.user.user();
		if (user.getNick().equalsIgnoreCase(callName))
			return Optional.of(this.user);
		return Optional.empty();
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.identifier().equalsIgnoreCase(this.channel);
	}
	
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieService service) {
		return service.identifier().equals(identifier);
	}
	
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	public default Optional<? extends ChrislieUser> user(String identifier) {
		return users().stream()
				.filter(user -> user.identifier().equals(identifier))
				.findAny();
	}
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
			
			// aliases must be lowercase, since we don't know what java counts as lowercase, we simply compare the string with toLowerCase()
			if (!alias.equals(alias.toLowerCase()))
				return Optional.empty();
			
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
			String name = matcher.group("name");
			var exposed = matcher.group("exposed").isBlank(); // exposed if not set
			var add = "+".equals(matcher.group("action")); // false implies "-" since sementics were already checked by "isRpleace()"
			
			// incremental alias maps could contain same alias name multiple times with different control characters
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
			public void onResponse(Call<QwantResponse> c, Response<QwantResponse> resp) {
				QwantResponse body = resp.body();
				if (!resp.isSuccessful() || (body != null && !"success".equals(body.status()))) { // bad error code or "error" in status field of json
					if (resp.code() == RATE_LIMIT_CODE) {
						errorRateLimited.write(reply).send();
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var query = invc.arg().trim();
		var identifier = ChrislieIdentifier.ChannelIdentifier.of(m.channel());
		var reply = invc.reply();
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		}
		
		if ("next".equalsIgnoreCase(query)) {
			synchronized (resultStorage) {
				List<QwantResponse.QwantItem> pastResult = resultStorage.getIfPresent(identifier);
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieUser user) {
		return user.identifier().equals(this.user);
	}
	
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		@Handler
		public void capAck(CapabilitiesRejectedEvent ev) {
			if (ev.getRejectedCapabilitiesRequest().stream().anyMatch(c -> c.getName().equalsIgnoreCase(CapabilityManager.Defaults.ECHO_MESSAGE))) {
				log.error("failed to enable echo-message, will not be able to react to own messages (including logging)");
			}
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
			if (ev.isNegotiating()) {
				Optional<CapabilityState> opt = ev.getSupportedCapabilities()
						.stream().filter(s -> s.getName().equalsIgnoreCase(CapabilityManager.Defaults.ECHO_MESSAGE)).findFirst();
				
				if (opt.isEmpty()) {
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		@Handler
		public void capAck(CapabilitiesAcknowledgedEvent ev) {
			if (ev.getAcknowledgedCapabilities().stream().anyMatch(c -> c.getName().equalsIgnoreCase(CapabilityManager.Defaults.ECHO_MESSAGE))) {
				log.info("enabled echo-message capability");
			}
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/util/ClientLogic.java`
#### Snippet
```java
	@Handler
	public void onInvite(ChannelInviteEvent ev) {
		if (ev.getTarget().equals(ev.getClient().getNick())) {
			log.info("received invite from {} to join {}", ev.getActor().getName(), ev.getChannel().getName());
			ev.getChannel().join();
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		while (it.hasNext()) {
			var next = it.next();
			if ("-r".equals(next)) {
				useDisplay = false;
				it.remove();
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
				useDisplay = false;
				it.remove();
			} else if ("--cron".equals(next)) {
				it.remove();
				isCron = true;
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		
		if (!args.isEmpty() && !args.get(0).isBlank()) { // argument stack is not empty
			if ("list".equalsIgnoreCase(args.get(0))) { // check if first argument matches "list"
				
				// list requires permission
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
		}
		
		var query = invc.arg().trim();
		if (query.isEmpty()) {
			var set = taggedMemes.values().stream()
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
		var m = invc.msg();
		var reply = invc.reply();
		String term = invc.arg().trim();
		if (term.isEmpty()) {
			ERROR_NO_QUERY.write(reply).send();
```

### CallToSuspiciousStringMethod
`String.compareTo()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Node.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull Node o) {
		return name.compareTo(o.name);
	}
}
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		
		// we only care about html pages
		String mime = contentType.split(";")[0].trim();
		if (!"text/html".equalsIgnoreCase(mime)) {
			log.debug("can't parse content type {} for {}", mime, url);
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		// we only care about html pages
		String mime = contentType.split(";")[0].trim();
		if (!"text/html".equalsIgnoreCase(mime)) {
			log.debug("can't parse content type {} for {}", mime, url);
		}
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			summary = summary
					.replaceAll("[\n\r\u0000]", "") // remove illegal irc characters
					.trim();
			
			// limit output to 500 characters at max
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			// limit output to 500 characters at max
			if (summary.length() > MAX_IRC_MESSAGE_LENGTH)
				summary = summary.substring(0, MAX_IRC_MESSAGE_LENGTH).trim() + "[...]";
			
			// check if summary was posted before within timeout window
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				var dates = parse.stream().flatMap(in -> in.getDates().stream()).collect(Collectors.toList());
				
				if (!parse.isEmpty() && parse.get(0).getText().equals(part)) {
					String message = String.join(" ", Arrays.copyOfRange(w, i, w.length));
					return Optional.of(Pair.of(dates.get(0).toInstant(), message));
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var guild = channel.guild();
		
		Predicate<TimerInfo> pred = timer -> timer.service.equals(user.service().identifier()) && timer.user.equals(user.identifier());
		
		if (guild.isPresent()) { // if guild is present, we filter by channel guilds
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var guild = channel.guild();
		
		Predicate<TimerInfo> pred = timer -> timer.service.equals(user.service().identifier()) && timer.user.equals(user.identifier());
		
		if (guild.isPresent()) { // if guild is present, we filter by channel guilds
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			pred = pred.and(timer -> guildChannels.contains(timer.channel));
		} else if (!channel.isDirectMessage()) { // if not dm channel, we filter by channel
			pred = pred.and(timer -> channel.identifier().equals(timer.channel));
		}  // otherwise we show user all their timers
		
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieGuild guild) {
		return this.guild.identifier().equals(guild.identifier());
	}
}
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	public boolean check(ChrislieMessage message) {
		var isOtherGuild = message.channel().guild()
				.map(g -> !g.identifier().equals(cfg.guild)) // true if mismatch => other guild
				.orElse(false);
		
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	private static Predicate<User> userByNickname(String nickname) {
		return user -> user.getNick().equals(nickname);
	}
	
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	private static Predicate<User> userByAccount(String account) {
		return user -> user.getAccount().filter(s -> s.equals(account)).isPresent();
	}
	
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
		
		var mode = parser.word(true).consume().expect("mode");
		if ("reset".equalsIgnoreCase(mode)) {
			reset();
			invc.reply("Logger Konfiguration wurde neu geladen");
```

### CallToSuspiciousStringMethod
`String.equalsIgnoreCase()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				var list = new ArrayList<QwantItem>();
				for (var result : mainline.mainline) {
					if (result.type.equalsIgnoreCase(type.code)) {
						list.addAll(result.getItemsAndUnfuckMess(gson, type)); // will actually end up in first branch so no recursion
					}
```

### CallToSuspiciousStringMethod
`String.compareTo()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				return intComp;
			
			return name.compareTo(o.name);
		}
	}
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			// validate type and create or fetch listener from context
			ChrislieListener.Envelope envelope;
			if ("def".equals(type)) {
				if (clazz == null || clazz.isBlank())
					throw new ChrislieListener.ListenerException("no clazz specified");
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				envelope = instanceListener(gson, groupName);
			} else if ("ref".equals(type)) {
				if (clazz != null)
					throw new ChrislieListener.ListenerException("clazz is only valid in listener definition");
```

## ClassWithoutLogger
### ClassWithoutLogger
Class `ListenerReference` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/ListenerReference.java`
#### Snippet
```java
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ListenerReference {
	
	@Getter protected String name;
```

### ClassWithoutLogger
Class `RegExpTransformCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/RegExpTransformCommand.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.config.flex.FlexConf;

public class RegExpTransformCommand extends TransformCommand {
	
	@Override
```

### ClassWithoutLogger
Class `TransformCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
import java.util.Optional;

public class TransformCommand implements ChrislieListener.Command {
	
	private static final String TRANSFORM_TARGET = "transform.target";
```

### ClassWithoutLogger
Class `ChrislieIdentifier` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieIdentifier.java`
#### Snippet
```java
 */
@UtilityClass
public class ChrislieIdentifier {
	
	@ToString
```

### ClassWithoutLogger
Class `CoreConfig` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java

@ToString
public class CoreConfig {
	
	@Getter private String databasePool;
```

### ClassWithoutLogger
Class `IrcUser` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
import java.util.function.Function;

public class IrcUser implements ChrislieUser {
	
	@Getter private IrcService service;
```

### ClassWithoutLogger
Class `HaskellCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
import java.util.Optional;

public class HaskellCommand implements ChrislieListener.Command {
	
	private static String FLEX_TIMEOUT = "haskell.timeout";
```

### ClassWithoutLogger
Class `ExplainCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class ExplainCommand implements ChrislieListener.Command {
	
	// the one that comes with JDA can't handle DM refs
```

### ClassWithoutLogger
Class `ScopeMapping` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/ScopeMapping.java`
#### Snippet
```java
import java.util.List;

public class ScopeMapping extends CombinationSelector {
	
	@Getter private List<ChrislieGroup> groups;
```

### ClassWithoutLogger
Class `FlexConf` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
 */
@SuppressWarnings("OverloadedMethodsWithSameNumberOfParameters")
public class FlexConf {
	
	public static final String DISPATCHER_PATTERN = "dispatcher.pattern";
```

### ClassWithoutLogger
Class `AcceptAllSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/AcceptAllSelector.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.config.scope.Selector;

public class AcceptAllSelector implements Selector {
	
	@Override
```

### ClassWithoutLogger
Class `CommonFlex` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java

@UtilityClass
public class CommonFlex {
	
	@Getter private static final Provider<DateTimeFormatter> DATE_TIME_FORMAT = provider(
```

### ClassWithoutLogger
Class `UnicodeCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class UnicodeCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_NUMBER_PARSE = ErrorOutputBuilder.generic("Das sah zwar gut aus, aber ich habs trotzdem nicht gerafft.");
```

### ClassWithoutLogger
Class `RegExpSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class RegExpSelector implements Selector {
	
	private List<Function<DataContainer, Boolean>> fns;
```

### ClassWithoutLogger
Class `SystemProperty` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java

@UtilityClass
public class SystemProperty<T> {
	
	private static <T> T get(@NonNull String name, Function<String, T> fn, T def) {
```

### ClassWithoutLogger
Class `IrcPrivateChannel` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
import java.util.stream.Stream;

public class IrcPrivateChannel implements ChrislieChannel {
	
	
```

### ClassWithoutLogger
Class `IrcFormatter` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
@SuppressWarnings("OverloadedMethodsWithSameNumberOfParameters")
@UtilityClass
public class IrcFormatter {
	
	public static String format(Object format, String s) {
```

### ClassWithoutLogger
Class `MensaApiMeal` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiMeal.java`
#### Snippet
```java
@SuppressWarnings("MissingDeprecatedAnnotation")
@ToString
public class MensaApiMeal {
	
	@Getter private String meal;
```

### ClassWithoutLogger
Class `Edge` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java

@Data
public final class Edge implements Comparable<Edge> {
	
	private final Node from, to;
```

### ClassWithoutLogger
Class `CronCommandMessage` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
import java.util.Optional;

public class CronCommandMessage implements ChrislieMessage {
	
	@Getter private final ChrislieUser user;
```

### ClassWithoutLogger
Class `StaticOutputCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
import java.util.Objects;

public class StaticOutputCommand implements ChrislieListener.Command {
	
	private SerializedOutput out;
```

### ClassWithoutLogger
Class `ChannelSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
import com.google.gson.JsonElement;

public class ChannelSelector implements Selector {
	
	private String channel;
```

### ClassWithoutLogger
Class `HelpCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class HelpCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `MockCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/string/MockCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class MockCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `ServiceIdentifierSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
import com.google.gson.JsonElement;

public class ServiceIdentifierSelector implements Selector {
	
	private String identifier;
```

### ClassWithoutLogger
Class `MensaApiMeta` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiMeta.java`
#### Snippet
```java
 */
@Data
public class MensaApiMeta {
	
	private Map<String, Entry> mensa;
```

### ClassWithoutLogger
Class `NickCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java

//TODO: put global and other guild rename behind permission
public class NickCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `AliasSet` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public final class AliasSet implements Supplier<Map<String, AliasSet.Alias>> {
	
	private static final Pattern ALIAS_PATTERN = Pattern.compile("^(?<action>[+-]?)(?<name>[^?]+)(?<exposed>\\??)$");
```

### ClassWithoutLogger
Class `EmojifyCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class EmojifyCommand implements ChrislieListener.Command {
	
	private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\b +\\b", Pattern.UNICODE_CHARACTER_CLASS);
```

### ClassWithoutLogger
Class `AttachmenViewerCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
import java.util.Optional;

public class AttachmenViewerCommand implements ChrislieListener.Command {
	
	private Config cfg;
```

### ClassWithoutLogger
Class `ServiceSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.config.scope.Selector;

public abstract class ServiceSelector implements Selector {
	
	@Override
```

### ClassWithoutLogger
Class `FlowQuery` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java

@Data
public final class FlowQuery implements Comparable<FlowQuery> {
	
	private final Node from, to;
```

### ClassWithoutLogger
Class `UserExistsInChannel` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
 * the given user can observe the message.
 */
public class UserExistsInChannel implements Selector {
	
	private String user;
```

### ClassWithoutLogger
Class `UntilCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java

// TODO: port to new v3 architecture
public class UntilCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_INVALID_DATE = ErrorOutputBuilder.generic("Ich seh da nichts was einen Zeitpunkt darstellt.");
```

### ClassWithoutLogger
Class `ChrislieGroup` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java

@ToString
public class ChrislieGroup {
	
	@Getter private String name;
```

### ClassWithoutLogger
Class `BottleSpinCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class BottleSpinCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `DiceCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/random/DiceCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class DiceCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `StaticGenerator` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
import java.util.Map;

public class StaticGenerator implements Generator {
	
	private @NonNull String out;
```

### ClassWithoutLogger
Class `FileGenerator` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java


public class FileGenerator implements Generator {
	
	private boolean search;
```

### ClassWithoutLogger
Class `PlainOutputSubstituionImpl` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java

// most methods overriden to adjust return type
public class PlainOutputSubstituionImpl extends PlainOutputImpl implements PlainOutput.PlainOutputSubstituion {
	
	private StrSubstitutor substitutor;
```

### ClassWithoutLogger
Class `DiscordMessage` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class DiscordMessage implements ChrislieMessage {
	
	@Getter private DiscordService service;
```

### ClassWithoutLogger
Class `IrcMessage` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
import org.kitteh.irc.client.library.event.user.PrivateMessageEvent;

public class IrcMessage implements ChrislieMessage {
	
	@Getter private IrcService service;
```

### ClassWithoutLogger
Class `PatternTypeAdapter` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/PatternTypeAdapter.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class PatternTypeAdapter extends TypeAdapter<Pattern> {
	
	@Override
```

### ClassWithoutLogger
Class `IrcChannel` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class IrcChannel implements ChrislieChannel {
	
	@Getter private IrcService service;
```

### ClassWithoutLogger
Class `DiscordEmojiManagement` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class DiscordEmojiManagement implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `NullCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NullCommand.java`
#### Snippet
```java
 * eat the invocation.
 */
public class NullCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `OptionsMap` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
 */
@SuppressWarnings("ReturnOfInnerClass") // caller is expected to throw values away after command call finished
public class OptionsMap {
	
	private final ChrislieParser parser;
```

### ClassWithoutLogger
Class `IrcDropAccountCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
import java.util.Optional;

public class IrcDropAccountCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_IRC_ONLY = ErrorOutputBuilder.generic("Dieser Befehl ist nur in IRC Netzwerken verf?gbar.");
```

### ClassWithoutLogger
Class `ShutdownCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
import java.util.Optional;

public class ShutdownCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `UpgradeCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
import java.util.Optional;

public class UpgradeCommand implements ChrislieListener.Command { // TODO: replace with implementation that first attempts to build and run chrisliebot before upgrading
	
	@Override
```

### ClassWithoutLogger
Class `DnsCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java

//TODO: replace with async resolver
public class DnsCommand implements ChrislieListener.Command {
	
	private static final int TIMEOUT = 5000;
```

### ClassWithoutLogger
Class `SpecialChannel` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java

// TODO: emote only channel
public class SpecialChannel implements ChrislieListener {
	
	private Config cfg;
```

### ClassWithoutLogger
Class `NSFWSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/NSFWSelector.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.config.scope.Selector;

public class NSFWSelector implements Selector {
	
	@Override
```

### ClassWithoutLogger
Class `CronTypeAdapter` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/CronTypeAdapter.java`
#### Snippet
```java
import java.io.IOException;

public class CronTypeAdapter extends TypeAdapter<Cron> {
	
	private final CronDefinition cronDefinition;
```

### ClassWithoutLogger
Class `UrbanDictionaryCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
import retrofit2.Retrofit;

public class UrbanDictionaryCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_NO_QUERY = ErrorOutputBuilder.generic("Du hast keinen Suchbegriff eingegeben.");
```

### ClassWithoutLogger
Class `ChoiceCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ChoiceCommand implements ChrislieListener.Command {
	
	private static final String[] FLAVOUR = {
```

### ClassWithoutLogger
Class `SubredditListing` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java

@Data
public class SubredditListing {
	
	private SubredditData data;
```

### ClassWithoutLogger
Class `CombinationSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
import java.util.function.BiFunction;

public class CombinationSelector implements Selector {
	
	private List<Selector> selectors;
```

### ClassWithoutLogger
Class `IrcChannelFlagSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
import java.util.List;

public class IrcChannelFlagSelector implements Selector {
	
	private List<Character> chars;
```

### ClassWithoutLogger
Class `FlowGraph` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
 * This graph implementation allows building of graphs that are compatible with the algorithm defined in {@link MaxFlowSolver}.
 */
public final class FlowGraph {
	
	private final Map<Edge, Integer> edges = new HashMap<>();
```

### ClassWithoutLogger
Class `Node` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Node.java`
#### Snippet
```java
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Node implements Comparable<Node> {
	
	private final String name;
```

### ClassWithoutLogger
Class `CoinCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/random/CoinCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class CoinCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `BetterScheduledService` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
 */
@AllArgsConstructor
public class BetterScheduledService extends AbstractScheduledService {
	
	private @NonNull ExceptionalRunnable runnable;
```

### ClassWithoutLogger
Class `RestartCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
import java.util.Optional;

public class RestartCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `ZoneIdTypeAdapter` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/ZoneIdTypeAdapter.java`
#### Snippet
```java
import java.time.ZoneId;

public class ZoneIdTypeAdapter extends TypeAdapter<ZoneId> {
	
	@Override
```

### ClassWithoutLogger
Class `TokenSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
 */
@AllArgsConstructor
public class TokenSelector {
	
	private final ChrislieParser parser;
```

### ClassWithoutLogger
Class `DiscordUser` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
import java.util.concurrent.ExecutionException;

public class DiscordUser implements ChrislieUser {
	
	@Getter private DiscordService service;
```

### ClassWithoutLogger
Class `DiscordFormatter` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
@SuppressWarnings("OverloadedMethodsWithSameNumberOfParameters")
@UtilityClass
public class DiscordFormatter {
	
	public static String format(Object format, String s) {
```

### ClassWithoutLogger
Class `DiscordGuild` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
@AllArgsConstructor
@ToString
public class DiscordGuild implements ChrislieGuild {
	
	@Getter private DiscordService service;
```

### ClassWithoutLogger
Class `OutOfBandTransmission` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
import java.util.UUID;

public class OutOfBandTransmission {
	
	private static final String FILE_EXTENSION = ".txt";
```

### ClassWithoutLogger
Class `DiscordGuildChannel` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class DiscordGuildChannel implements DiscordChannel {
	
	@Getter private DiscordService service;
```

### ClassWithoutLogger
Class `DiscordPlainOutput` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
 * that are provided to the Discord API to prevent unwanted mentions without having to do the escaping ourself.
 */
public class DiscordPlainOutput extends PlainOutputImpl {
	
	private final List<Consumer<MessageBuilder>> mentionsTransformers = new ArrayList<>();
```

### ClassWithoutLogger
Class `MaxFlowSolver` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
import java.util.Map;

public final class MaxFlowSolver {
	
	private final Map<Edge, Integer> edges = new HashMap<>();
```

### ClassWithoutLogger
Class `DiscordBootstrap` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
import javax.security.auth.login.LoginException;

public class DiscordBootstrap implements ServiceBootstrap {
	
	private String token;
```

### ClassWithoutLogger
Class `IrcGuild` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class IrcGuild implements ChrislieGuild {
	
	@Getter private IrcService service;
```

### ClassWithoutLogger
Class `DiscordPermissionSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
import java.util.Set;

public class DiscordPermissionSelector implements Selector {
	
	private Set<Permission> permissions;
```

### ClassWithoutLogger
Class `ScrambleCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ScrambleCommand implements ChrislieListener.Command {
	
	private static final Pattern INNER_WORD_PATTERN = Pattern.compile("\\b\\w(.+?)\\w\\b");
```

### ClassWithoutLogger
Class `PlainOutputImpl` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class PlainOutputImpl implements PlainOutput {
	
	private static final Pattern ESCAPE_PATTERN = Pattern.compile("[\u0000\\\\]");
```

### ClassWithoutLogger
Class `FlipCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
import java.util.Optional;

public class FlipCommand implements ChrislieListener.Command {
	
	private static final String LOOKUP_NORMAL;
```

### ClassWithoutLogger
Class `GuildSelector` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
import lombok.NonNull;

public class GuildSelector implements Selector {
	
	private final ChrislieGuild guild;
```

### ClassWithoutLogger
Class `UserIsPartOfGuild` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
import java.util.Objects;

public class UserIsPartOfGuild implements Selector {
	
	private Config cfg;
```

### ClassWithoutLogger
Class `ExternalCommandListener` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	webhook funktioniert ?hnlich, kann jedoch nur reagieren und ob er das ziel ausw?hlen kann pendeln wir noch aus
 */
public abstract class ExternalCommandListener implements ChrislieListener.Command {
	
	protected abstract @NonNull @org.checkerframework.checker.nullness.qual.NonNull Config externalConfig();
```

### ClassWithoutLogger
Class `IrcOutput` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
import java.util.function.Supplier;

public class IrcOutput implements ChrislieOutput {
	
	// stores values that are passed to methods we can't resolve directly
```

### ClassWithoutLogger
Class `TraceMessageSource` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
 */
@Data
public final class TraceMessageSource {
	
	private long guildId;
```

### ClassWithoutLogger
Class `GeneratorCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
import static chrisliebaer.chrisliebot.C.escapeStrSubstitution;

public class GeneratorCommand implements ChrislieListener.Command {
	
	private SerializedOutput output;
```

### ClassWithoutLogger
Class `DiscordListEmojis` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
import java.util.Optional;

public class DiscordListEmojis implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `SerializedOutput` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
 * is to specify complex outputs in config languages without being able to call actual code.
 */
public class SerializedOutput {
	
	private String title;
```

### ClassWithoutLogger
Class `ContextResolver` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
import java.util.stream.Stream;

public class ContextResolver {
	
	@Getter private List<ScopeMapping> mappings;
```

### ClassWithoutLogger
Class `VersionCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
import java.util.Optional;

public class VersionCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `ChrislieParser` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
 * TokenSelector} references.
 */
public class ChrislieParser {
	
	protected final int[] codepoints;
```

### ClassWithoutLogger
Class `ErrorOutputBuilder` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java

// TODO: should we make this thing throwable? or even better: allow to create exception from message because otherwise the stacktrace won't fit, should be own exception, requireing to be also used for user and not being actually logged
public final class ErrorOutputBuilder {
	
	private static final Color ERROR_COLOR = Color.RED;
```

### ClassWithoutLogger
Class `QuizCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/quiz/QuizCommand.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.command.ChrislieListener;

public class QuizCommand implements ChrislieListener.Command {
	
	@Override
```

### ClassWithoutLogger
Class `DiscordPrivateChannel` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
import java.util.Optional;

public class DiscordPrivateChannel implements DiscordChannel {
	
	@Getter private DiscordService service;
```

### ClassWithoutLogger
Class `GsonValidator` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class GsonValidator {
	
	@Getter private final Gson gson;
```

### ClassWithoutLogger
Class `KitEscapeRoutesCommand` does not declare a logger
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
 * massively simplified by removing ambiguities. Something which I didn't bother sinking time into. It is what it is.
 */
public class KitEscapeRoutesCommand implements ChrislieListener.Command {
	
	private static final int LIMIT_MAX_FLOW_CACHE = 20;
```

## ReturnOfInnerClass
### ReturnOfInnerClass
Return of instance of anonymous class
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	@Override
	public ChrislieOutput reply(LimiterConfig limiter) {
		return new AbstractDiscordOutput<Message>() { // the generic types are so broken
			private boolean isError;
			private WebhookMessageAction<Message> messageAction;
```

## MethodCount
### MethodCount
`MensaApiMeal` has too many methods (method count = 23)
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiMeal.java`
#### Snippet
```java
@SuppressWarnings("MissingDeprecatedAnnotation")
@ToString
public class MensaApiMeal {
	
	@Getter private String meal;
```

### MethodCount
`ChrislieOutput` has too many methods (method count = 28)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
 * for the features of all services.
 */
public interface ChrislieOutput {
	
	public ChrislieOutput title(String title, String url);
```

### MethodCount
`TimerCommand` has too many methods (method count = 28)
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
 */
@Slf4j
public class TimerCommand implements ChrislieListener.Command {
	
	private static final Timestamp UNIX_EPOCH_SECOND_1 = Timestamp.from(Instant.ofEpochSecond(1));
```

### MethodCount
`IrcService` has too many methods (method count = 21)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java

@Slf4j
public class IrcService implements ChrislieService {
	
	/* IRC has a problem: it doesn't share a lot of information about clients without being asked. This means we have to get creative.
```

### MethodCount
`TraceMessageSource` has too many methods (method count = 21)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
 */
@Data
public final class TraceMessageSource {
	
	private long guildId;
```

## SubtractionInCompareTo
### SubtractionInCompareTo
Subtraction `timestamp - o.timestamp` in 'compareTo()' may result in overflow or precision loss
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		@Override
		public int compareTo(MensaRecord o) {
			return Long.signum(timestamp - o.timestamp);
		}
	}
```

## UnusedReturnValue
### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public ChrislieOutput image(String url);
	
	public ChrislieOutput thumbnail(String url);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public default void markAsError() {}
	
	public ChrislieOutput color(Color color);
	
	public ChrislieOutput color(int color);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput color(Color color);
	
	public ChrislieOutput color(int color);
	
	public ChrislieOutput author(String name);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput authorUrl(String url);
	
	public ChrislieOutput authorIcon(String url);
	
	public ChrislieOutput field(String field, String value, boolean inline);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
		return field(field, value, true);
	}
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput footer(String text, String iconUrl);
	
	public default ChrislieOutput footer(String text) {
		return footer(text, null);
	}
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
		plainSimpleSet(s, replace());
		return this;
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @return This service for method chaining.
	 */
	public ChrislieService sink(@Nullable Consumer<ChrislieMessage> sink);
	
	/**
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	}
	
	public LimiterConfig send(MessageReceiver receiver, String message) {
		
		// remove illegal characters
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public interface PlainOutputSubstituion extends PlainOutput {
		
		public PlainOutputSubstituion appendSub(String s, Object... format);
		
		public PlainOutputSubstituion appendEscapeSub(String s, Object... format);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private interface PlainMethod {
			
			public PlainOutput fn(PlainOutput output, String s, Object[] format);
		}
		
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	private Set<String> flexValues = new HashSet<>();
	
	public ExternalMessageTranslator withFlex(@NonNull String key) {
		flexValues.add(key);
		return this;
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private <T> T ensureNonNull(T o, String msg) throws ConfigInitializeException {
			if (o == null)
				throw new ConfigInitializeException(msg);
```

## AbstractClassWithOnlyOneDirectInheritor
### AbstractClassWithOnlyOneDirectInheritor
Abstract class `ExternalCommandListener` has only one direct inheritor
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	webhook funktioniert ?hnlich, kann jedoch nur reagieren und ob er das ziel ausw?hlen kann pendeln wir noch aus
 */
public abstract class ExternalCommandListener implements ChrislieListener.Command {
	
	protected abstract @NonNull @org.checkerframework.checker.nullness.qual.NonNull Config externalConfig();
```

## AnonymousClassComplexity
### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 4)
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
		var call = service.runHaskell(param);
		
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<HaskellService.Output> call, Response<HaskellService.Output> response) {
```

### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 9)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		var safeSearch = FLEX_SAFE_SEARCH.getOrFail(invc);
		Call<QwantResponse> call = service.search(query, safeSearch, cfg.count, cfg.type);
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<QwantResponse> c, Response<QwantResponse> resp) {
```

### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 5)
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		var bot = new Chrisliebot();
		bot.addListener(new Listener() {
			@Override
			public void starting() {
```

### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 4)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	public PlainOutputSubstituion convert() {
		// swap strategy to using this output with substitutions from gathered method calls
		PlainOutputSubstituionImpl substitution = new PlainOutputSubstituionImpl(escaper, IrcFormatter::format, new StrLookup() {
			@Override
			public String lookup(String key) {
```

### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 6)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	// strategy for converting received calls into irc message (default is to use title and description/plain)
	private Supplier<String> converter = new Supplier<>() {
		@Override
		public String get() {
```

### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 5)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	@Override
	public ChrislieOutput reply(LimiterConfig limiter) {
		return new AbstractDiscordOutput<Message>() { // the generic types are so broken
			private boolean isError;
			private WebhookMessageAction<Message> messageAction;
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
Method invocation `data` may produce `NullPointerException`
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		// remove older entries
		feed.data().children().removeIf(c -> c.data().createdUtc() <= lastTimestamp);
		
		// update last timestamp
```

### ConstantConditions
Condition `patterns == null` is always `false`
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		
		var patterns = guildMap.get(identifier);
		if (patterns == null)
			return Optional.empty();
		
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

## RedundantThrows
### RedundantThrows
The declared exception `Chrisliebot.ChrisliebotException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	
	@Override
	protected void shutDown() throws Chrisliebot.ChrisliebotException {
		// remember: reverse order
		timer.shutdown();
```

### RedundantThrows
The declared exception `ChrislieListener.ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @param s       The string to reply with.
	 */
	public default void reply(LimiterConfig limiter, String s) throws ChrislieListener.ListenerException {
		reply(limiter).plain(s).send();
	}
```

### RedundantThrows
The declared exception `Exception` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public void awaitReady() throws Exception {
		client.getEventManager().registerEventListener(this);
		
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Generiert eine Vorschau f?r hochgeladene Textdateien aus der referenzierten antwort, so dass der Anhang nicht runtergeladen werden muss.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NullCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {}
}

```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		out = Objects.requireNonNull(gson.fromJson(json, SerializedOutput.class));
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Zeigt Informationen zur aktuellen Version von Chrisliebot an.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		config = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		executorService = bot.sharedResources().timer();
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		for (var entry : config.entries) {
			queueRun(entry);
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Setzt die Whiteslist f?r den angegebenen Emoji. Beispiel: :kappa: @Premium @Mitglieder. " +
				"Keine Angabe von Rollen l?scht die Whitelist.");
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Listet alle Emojis auf, auf die ich aktuell Zugriff habe. Vorsicht: Das sind viele!");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Antworte entweder mit diesem Befehl auf meine Nachricht oder geb mir einen Link zu einer anderen Nachricht von mir und ich sag dir, " +
				"warum ich das getan hab.");
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("<Query> [<Type>]");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	}
	
	private void dispatch(Consumer<ProcessExecutor> fnPass, ChrislieOutput out, ExceptionHandler exceptionHandler) throws ListenerException {
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
```

### RedundantThrows
The declared exception `ChrislieListener.ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	
	@Override
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException {
		return Map.of(Generator.DEFAULT, out);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(cfg.hostname())
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("F?hrt die ?bergebene Haskell Expression aus. Funktionsdefinitionen k?nnen mit `let` in die Expression gebunden werden.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("F?hrt den nachfolgenden Befehl ohne IRC Accountinformationen aus. Hat den selben Effekt wie ein Ausloggen aus dem IRC Account.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.resolver = resolver;
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("?berschreibt die aktuelle Loggerkonfiguration bis zum n?chsten Neustart: <TRACE|DEBUG|INFO|WARN|ERROR> [logger-name.[*]], reset");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	@SneakyThrows // TODO: remove once error output builder was reworked
	@Override
	public void execute(Invocation invc) throws ListenerException {
		ChrislieParser parser = new ChrislieParser(invc.arg());
		
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess erneut zu starten.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().restart();
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess nicht erneut zu starten.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().shutdown();
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess Chrisliebot zu upgraden.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().upgrade();
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	// overwrite the references after all changes were made.
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval(), TimeUnit.MILLISECONDS));
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.startAsync().awaitRunning();
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.stopAsync().awaitTerminated();
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Stellt den aktuellen Speiseplan des Studierendenwerks bereit. mensa list, mensa <name> [<Wochentag|Zahl>], mensa [<Wochentag>]");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		this.cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/quiz/QuizCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		throw new RuntimeException("not implemented"); //TODO
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		feedUpdate.stopAsync().awaitTerminated();
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		predicates = new ArrayList<>();
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of(emojify("Wir haben so viele Emojis, wir sollten sie vielleicht auch alle nutzen, was meinst du?"));
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("10 min Pizza|list, info|delete|restore <id>, snooze <id> 2 days. Zus?tzlich gibt es folgende K?rzel f?r <id>: ^ letzter abgelaufener Timer, . letzter angelegter Timer, - n?chster f?lliger Timer.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.dataSource = bot.sharedResources().dataSource();
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		shutdown = true;
		
```

### RedundantThrows
The declared exception `SQLException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 * @throws SQLException
	 */
	private static String resolveTimerString(ListenerMessage msg) throws SQLException {
		// TODO: check constants for symbols
		throw new RuntimeException("implement me");
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		pollTask.cancel(false);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Hiermit kann der Datumsparser f?r die Timer getestet werden.");
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(UrbanDictionaryService.BASE_URL)
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### RedundantThrows
The declared exception `ListenerException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		if (msg.msg().message().startsWith(" ") || isCommand) // TODO: is this good?
			return;
```

### RedundantThrows
The declared exception `SelectorException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		channel = json.getAsString();
	}
```

### RedundantThrows
The declared exception `SelectorException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	@Override
	@SuppressWarnings("EmptyClass")
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		permissions = gson.fromJson(json, new TypeToken<Set<Permission>>(){}.getType());
	}
```

### RedundantThrows
The declared exception `SelectorException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		identifier = json.getAsString();
	}
```

### RedundantThrows
The declared exception `SelectorException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		cfg = Objects.requireNonNull(gson.fromJson(json, Config.class), "config is null");
	}
```

### RedundantThrows
The declared exception `Exception` is never thrown in any method implementation
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	public static interface ExceptionalRunnable {
		
		public void run() throws Exception;
	}
}
```

### RedundantThrows
The declared exception `IOException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public RequestBody convert(T value) throws IOException {
			return null;
		}
```

### RedundantThrows
The declared exception `ParserException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public String expect() throws ParserException {
			return value;
		}
```

### RedundantThrows
The declared exception `ParserException` is never thrown
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public String expect(String msg) throws ParserException {
			return value;
		}
```

## ParametersPerConstructor
### ParametersPerConstructor
`Invocation()` has too many parameters (num parameters = 7)
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	public static class Invocation extends ListenerMessage {
		
		public Invocation(@NonNull ExceptionHandler exceptionHandler,
						  @NonNull Chrisliebot bot,
						  @NonNull ChrislieMessage msg,
```

## PublicMethodWithoutLogging
### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
	
	@Override
	public final void execute(Invocation invc) throws ListenerException {
		var flex = invc.ref().flexConf();
		var arg = transformArg(invc.arg(), flex);
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		var target = target(ctx, ref.flexConf());
		
```

### PublicMethodWithoutLogging
'public' method `channel()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieIdentifier.java`
#### Snippet
```java
		}
		
		public Optional<ChrislieChannel> channel(Chrisliebot bot) {
			return bot.service(service).flatMap(service -> service.channel(channel));
		}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieIdentifier.java`
#### Snippet
```java
		private final String channel;
		
		public static ChannelIdentifier of(ChrislieChannel channel) {
			return new ChannelIdentifier(channel.service().identifier(), channel.identifier());
		}
```

### PublicMethodWithoutLogging
'public' method `ensureDisjoint()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	@Getter private Map<String, DiscordBootstrap> discord = Map.of();
	
	public void ensureDisjoint() {
		Set<String> set = new HashSet<>();
		ensureDisjoint(set, irc.keySet());
```

### PublicMethodWithoutLogging
'public' method `directMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Override
	public Optional<? extends ChrislieChannel> directMessage() {
		return Optional.of(new IrcPrivateChannel(service, user));
	}
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return idFn.apply(this);
	}
```

### PublicMethodWithoutLogging
'public' method `hashCode()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Override
	public int hashCode() {
		return user.hashCode();
	}
```

### PublicMethodWithoutLogging
'public' method `equals()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
```

### PublicMethodWithoutLogging
'public' method `mention()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Override
	public String mention() {
		return user.getNick();
	}
```

### PublicMethodWithoutLogging
'public' method `asNickname()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	 * @return a new {@link ChrislieUser} with the account indentifier dropped.
	 */
	public IrcUser asNickname() {
		return new IrcUser(service, user, IrcUser::createIdFromNickIgnoreAccount);
	}
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	@Override
	public String displayName() {
		return user.getNick();
	}
```

### PublicMethodWithoutLogging
'public' method `onFailure()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<HaskellService.Output> call, Throwable t) {
				invc.exceptionHandler().escalateException(new ListenerException("failed to contact haskell backend", t));
			}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("F?hrt die ?bergebene Haskell Expression aus. Funktionsdefinitionen k?nnen mit `let` in die Expression gebunden werden.");
	}
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(cfg.hostname())
```

### PublicMethodWithoutLogging
'public' method `onResponse()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<HaskellService.Output> call, Response<HaskellService.Output> response) {
				if (!response.isSuccessful()) {
					invc.exceptionHandler().unwrap(() -> ErrorOutputBuilder.remoteErrorCode(call.request(), response).write(invc).send());
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var flex = invc.ref().flexConf();
		var timeout = flex.getStringOrFail(FLEX_TIMEOUT);
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc) || !(invc.msg() instanceof DiscordMessage)) {
			ErrorOutputBuilder.generic("Dieser Befehlt steht nur auf Discord zur Verf?gung oder ich habe Schwierigkeiten diese Nachricht zu erkennen.").write(invc).send();
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Antworte entweder mit diesem Befehl auf meine Nachricht oder geb mir einen Link zu einer anderen Nachricht von mir und ich sag dir, " +
				"warum ich das getan hab.");
```

### PublicMethodWithoutLogging
'public' method `send()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	}
	
	public LimiterConfig send(MessageReceiver receiver, String message) {
		
		// remove illegal characters
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	private boolean stripIrcFormatting;
	
	public static LimiterConfig of(FlexConf flex) throws ChrislieListener.ListenerException {
		var cfg = new LimiterConfig();
		cfg.offset = flex.getInteger(FLEX_OFFSET).orElse(0);
```

### PublicMethodWithoutLogging
'public' method `reply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @param s       The string to reply with.
	 */
	public default void reply(LimiterConfig limiter, String s) throws ChrislieListener.ListenerException {
		reply(limiter).plain(s).send();
	}
```

### PublicMethodWithoutLogging
'public' method `reply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @return An ouput instance for the channel that this message was received in.
	 */
	public default ChrislieOutput reply(LimiterConfig limiter) {
		return channel().output(limiter);
	}
```

### PublicMethodWithoutLogging
'public' method `forcedInvocation()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @return A possible {@link ChrislieDispatcher.CommandParse} object.
	 */
	public default Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.empty();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/AcceptAllSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/AcceptAllSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/AcceptAllSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/AcceptAllSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/AcceptAllSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		
		@Override
		public Optional<T> get(FlexConf flex) {
			return convert.apply(flex, key);
		}
```

### PublicMethodWithoutLogging
'public' method `getOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException;
		
		public default T getOrFail(ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
			return getOrFail(m.ref().flexConf());
		}
```

### PublicMethodWithoutLogging
'public' method `provider()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
	}
	
	public static <T> Provider<T> provider(BiFunction<FlexConf, String, Optional<T>> fn, String key) {
		return new ProviderImpl<>(fn, key);
	}
```

### PublicMethodWithoutLogging
'public' method `getOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		
		@Override
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException {
			return convert.apply(flex, key).orElseThrow(() -> FlexConf.keyNotFound(key));
		}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public Optional<T> get(FlexConf flex);
		
		public default Optional<T> get(ChrislieListener.ListenerMessage m) {
			return get(m.ref().flexConf());
		}
```

### PublicMethodWithoutLogging
'public' method `getStringOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public String getStringOrFail(String key) throws ChrislieListener.ListenerException {
		return getString(key).orElseThrow(() -> keyNotFound(key));
	}
```

### PublicMethodWithoutLogging
'public' method `getIntegerOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public int getIntegerOrFail(String key) throws ChrislieListener.ListenerException {
		return getInteger(key).orElseThrow(() -> keyNotFound(key));
	}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
			
			@Override
			public Optional<Object> get(String key, Type type) {
				return o.resolver.get(key, type);
			}
```

### PublicMethodWithoutLogging
'public' method `getOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public <T> T getOrFail(String key, Type type) throws ChrislieListener.ListenerException {
		return C.unsafeCast(get(key, type).orElseThrow(() -> keyNotFound(key)));
	}
```

### PublicMethodWithoutLogging
'public' method `getOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public <V> V getOrFail(String key, Class<V> clazz) throws ChrislieListener.ListenerException {
		return get(key, clazz).orElseThrow(() -> keyNotFound(key));
	}
```

### PublicMethodWithoutLogging
'public' method `getInteger()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public OptionalInt getInteger(String key) {
		return resolver.get(key, Integer.class).map(OptionalInt::of).orElseGet(OptionalInt::empty);
	}
```

### PublicMethodWithoutLogging
'public' method `fallback()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * @return A new FlexConf that can be modified without changing the state of the given FlexConf.
	 */
	public static FlexConf fallback(@NonNull FlexConf o) {
		return new FlexConf(new Resolver() {
			@Override
```

### PublicMethodWithoutLogging
'public' method `isSet()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public boolean isSet(String key) {
		return get(key, Boolean.class).orElse(false);
	}
```

### PublicMethodWithoutLogging
'public' method `getDoubleorFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public double getDoubleorFail(String key) throws ChrislieListener.ListenerException {
		return getDouble(key).orElseThrow(() -> keyNotFound(key));
	}
```

### PublicMethodWithoutLogging
'public' method `snapshot()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * @return A snapshot of the provided FlexConf.
	 */
	public static FlexConf snapshot(FlexConf o) {
		// it's actually enought to just copy the resolver
		return new FlexConf(o.resolver);
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public <T> Optional<T> get(String key, Type type) {
		return C.unsafeCast(resolver.get(key, type));
	}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		
		@Override
		public <V> Optional<V> get(String key, Class<V> clazz) {
			return current.get(key, clazz).or(() -> next.get(key, clazz));
		}
```

### PublicMethodWithoutLogging
'public' method `getLongOrFail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public long getLongOrFail(String key) throws ChrislieListener.ListenerException {
		return getLong(key).orElseThrow(() -> keyNotFound(key));
	}
```

### PublicMethodWithoutLogging
'public' method `getDouble()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public OptionalDouble getDouble(String key) {
		return resolver.get(key, Double.class).map(OptionalDouble::of).orElseGet(OptionalDouble::empty);
	}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public <V> Optional<V> get(String key, Class<V> clazz) {
		return resolver.get(key, clazz);
	}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public static interface Resolver {
		
		public default <V> Optional<V> get(String key, Class<V> clazz) {
			return Optional.empty();
		}
```

### PublicMethodWithoutLogging
'public' method `getString()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public Optional<String> getString(String key) {
		return resolver.get(key, String.class);
	}
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * @return This flex conf for method chaining.
	 */
	public FlexConf apply(@NonNull FlexConf o) {
		// this creates a chain of resolver, with the current one being in front
		resolver = new ChainResolver(o.resolver, resolver); // yes, this is the correct parameter order, new one goes first and becomes current
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		}
		
		public default Optional<Object> get(String key, Type type) {
			return Optional.empty();
		}
```

### PublicMethodWithoutLogging
'public' method `getLong()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public OptionalLong getLong(String key) {
		return resolver.get(key, Long.class).map(OptionalLong::of).orElseGet(OptionalLong::empty);
	}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		return new FlexConf(new Resolver() {
			@Override
			public <V> Optional<V> get(String key, Class<V> clazz) {
				return o.resolver.get(key, clazz);
			}
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		
		@Override
		public Optional<Object> get(String key, Type type) {
			return current.get(key, type).or(() -> next.get(key, type));
		}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg().trim();
		var m = invc.msg();
```

### PublicMethodWithoutLogging
'public' method `appendEscape()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion appendEscape(String s, Object... format) { return this; }
		
		@Override
```

### PublicMethodWithoutLogging
'public' method `append()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public JoinPlainOutput append(String s, Object... format) {
			out.append(s, format);
			pending = true;
```

### PublicMethodWithoutLogging
'public' method `newLine()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion newLine() { return this; }
		
		@Override
```

### PublicMethodWithoutLogging
'public' method `seperator()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		 * Will add delimiter if output has been appended since last call to this method.
		 */
		public JoinPlainOutput seperator() {
			if (pending) {
				pending = false;
```

### PublicMethodWithoutLogging
'public' method `newLine()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public JoinPlainOutput newLine() {
			out.newLine();
			return this;
```

### PublicMethodWithoutLogging
'public' method `dummy()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	
	@SuppressWarnings("ClassReferencesSubclass")
	public static PlainOutputSubstituion dummy() {
		return PlainOutputDummy.DUMMY;
	}
```

### PublicMethodWithoutLogging
'public' method `appendEscape()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public JoinPlainOutput appendEscape(String s, Object... format) {
			out.appendEscape(s, format);
			pending = true;
```

### PublicMethodWithoutLogging
'public' method `clear()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion clear() { return this; }
	}
	
```

### PublicMethodWithoutLogging
'public' method `append()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion append(String s, Object... format) { return this; }
		
		@Override
```

### PublicMethodWithoutLogging
'public' method `joiner()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
	public PlainOutput clear();
	
	public default JoinPlainOutput joiner(String delimiter) {
		return new JoinPlainOutput(this, delimiter);
	}
```

### PublicMethodWithoutLogging
'public' method `clear()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public JoinPlainOutput clear() {
			pending = false;
			out.clear();
```

### PublicMethodWithoutLogging
'public' method `appendEscapeSub()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion appendEscapeSub(String s, Object... format) { return this; }
		
		@Override
```

### PublicMethodWithoutLogging
'public' method `appendSub()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		
		@Override
		public PlainOutputSubstituion appendSub(String s, Object... format) { return this; }
		
		@Override
```

### PublicMethodWithoutLogging
'public' method `stringToDay()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	}
	
	public static Optional<DayOfWeek> stringToDay(@NonNull String day) {
		day = day.trim().toLowerCase();
		
```

### PublicMethodWithoutLogging
'public' method `hashColor()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	 * @return Deterministic color based on the input value.
	 */
	public Color hashColor(byte[] bytes) {
		CRC32C crc = new CRC32C();
		crc.update(bytes);
```

### PublicMethodWithoutLogging
'public' method `stripHtml()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	}
	
	public static String stripHtml(String html) {
		if (html == null)
			return null;
```

### PublicMethodWithoutLogging
'public' method `durationToString()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	// TODO: remove after until command has been ported to java 8 Duration
	@SuppressWarnings("MagicNumber")
	public static String durationToString(long s) {
		s = Math.abs(s);
		
```

### PublicMethodWithoutLogging
'public' method `format()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	}
	
	public static String format(Duration duration) {
		String s = "";
		
```

### PublicMethodWithoutLogging
'public' method `escapeStrSubstitution()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	public static final String UA_CHROME = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36";
	
	public static String escapeStrSubstitution(String s) {
		return s.replaceAll("\\$\\{", "\\$\\${");
	}
```

### PublicMethodWithoutLogging
'public' method `downloadFile()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	}
	
	public byte[] downloadFile(OkHttpClient client, URL url) throws IOException {
		var request = new Request.Builder()
				.url(url)
```

### PublicMethodWithoutLogging
'public' method `squashFormatting()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	}
	
	public static String squashFormatting(String s) {
		if (s == null)
			return null;
```

### PublicMethodWithoutLogging
'public' method `unsafeCast()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	 */
	@SuppressWarnings("unchecked")
	public static <T> T unsafeCast(Object value) {
		return (T) value;
	}
```

### PublicMethodWithoutLogging
'public' method `isLongParseable()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	}
	
	public static boolean isLongParseable(String s) {
		try {
			Long.parseLong(s);
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return test(DataContainer.builder()
				.service(service.identifier())
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return test(DataContainer.builder()
				.service(user.service().identifier())
```

### PublicMethodWithoutLogging
'public' method `accessor()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
		@Getter private final String message;
		
		public static Optional<Function<DataContainer, String>> accessor(String key) {
			if (key == null)
				return Optional.empty();
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return test(DataContainer.builder()
				.service(guild.service().identifier())
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return test(DataContainer.builder()
				.service(message.service().identifier())
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return test(DataContainer.builder()
				.service(channel.service().identifier())
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	@SuppressWarnings("EmptyClass")
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		var type = new TypeToken<Map<String, String>>() {}.getType();
		Map<String, String> map = gson.fromJson(json, type);
```

### PublicMethodWithoutLogging
'public' method `listeners()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public Map<String, ListenerReference> listeners() {
		return Collections.unmodifiableMap(listeners);
	}
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
		 * @param o Another ListenerContext that will override the current context.
		 */
		public void apply(ListenerReference o) {
			assert !(o instanceof ListenerContext);
			
```

### PublicMethodWithoutLogging
'public' method `listener()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public Optional<ListenerReference> listener(String name) {
		return Optional.ofNullable(listeners.get(name));
	}
```

### PublicMethodWithoutLogging
'public' method `alias()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public Optional<ListenerReference> alias(String alias) {
		return Optional.ofNullable(aliases.get(alias));
	}
```

### PublicMethodWithoutLogging
'public' method `listener()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public Optional<? extends ListenerReference> listener(ChrislieListener listener) throws NoSuchElementException {
		return listeners.values().stream().filter(ctx -> ctx.envelope().listener() == listener).findAny();
	}
```

### PublicMethodWithoutLogging
'public' method `addGroups()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	}
	
	public void addGroups(Collection<ChrislieGroup> groups) {
		groups.forEach(this::addGroup);
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static String of(String name, String def) {
		return get(name, Function.identity(), def);
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static Optional<String> of(String name) {
		return get(name, Optional::of, Optional.empty());
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> V of(String name, V def, Function<String, V> convert) {
		return get(name, convert, def);
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> Optional<V> of(String name, Function<String, V> convert) {
		return get(name, s -> Optional.of(s).map(convert), Optional.empty());
	}
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcGuild> guild() {
		return Optional.empty();
	}
```

### PublicMethodWithoutLogging
'public' method `hashCode()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public int hashCode() {
		return user.hashCode();
	}
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return user.identifier();
	}
```

### PublicMethodWithoutLogging
'public' method `isDirectMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public boolean isDirectMessage() {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `resolve()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> resolve(String callName) {
		var user = this.user.user();
		if (user.getNick().equalsIgnoreCase(callName))
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public String displayName() {
		return user.displayName();
	}
```

### PublicMethodWithoutLogging
'public' method `equals()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
```

### PublicMethodWithoutLogging
'public' method `users()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public List<IrcUser> users() {
		return List.of(user);
	}
```

### PublicMethodWithoutLogging
'public' method `output()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public IrcOutput output(LimiterConfig limiterConfig) {
		return new IrcOutput(Function.identity(), s -> limiterConfig.send(user.user(), s));
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, Stream.of(user.user())).map(u -> new IrcUser(service, u));
	}
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		pollTask.cancel(false);
	}
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `format()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
	}
	
	public static String format(ChrislieFormat format, String s) {
		return switch (format) {
			case HIGHLIGHT -> format(Format.TEAL, s);
```

### PublicMethodWithoutLogging
'public' method `format()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
	}
	
	public static String format(Format format, String s) {
		return format.toString() + s + Format.RESET;
	}
```

### PublicMethodWithoutLogging
'public' method `format()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
public class IrcFormatter {
	
	public static String format(Object format, String s) {
		
		// convert discord->chrisliebot
```

### PublicMethodWithoutLogging
'public' method `irc2ChrislieFormat()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcFormatter.java`
#### Snippet
```java
	}
	
	public static ChrislieFormat irc2ChrislieFormat(Format format) {
		return switch (format) {
			case BOLD -> ChrislieFormat.BOLD;
```

### PublicMethodWithoutLogging
'public' method `between()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	}
	
	public static Edge between(Node from, Node to) {
		return new Edge(from, to);
	}
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	
	@Override
	public int compareTo(@NotNull Edge o) {
		var firstComp = from.compareTo(o.from);
		if (firstComp != 0)
```

### PublicMethodWithoutLogging
'public' method `reverse()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	}
	
	public Edge reverse() {
		return new Edge(to, from);
	}
```

### PublicMethodWithoutLogging
'public' method `forcedInvocation()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	
	@Override
	public Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.of(commandParse);
	}
```

### PublicMethodWithoutLogging
'public' method `service()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	
	@Override
	public ChrislieService service() {
		return channel.service();
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		out.apply(invc.reply()).send();
	}
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		out = Objects.requireNonNull(gson.fromJson(json, SerializedOutput.class));
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return check(message.channel());
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		channel = json.getAsString();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.identifier().equalsIgnoreCase(this.channel);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/MockCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Wenn eine Aussage so dumm ist, dass es keinen weiteren Kommentar bedarf.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		
		String arg = invc.arg();
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Erlaubt Zugriff auf eingebaute Hilfetexte von Befehlen. Listet ohne Parameter alle Befehle des aktuellen Context auf. Wird ein " +
				"Befehlsname ?bergeben, so wird dessen Hilfetext angezeigt.");
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/MockCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		if (arg.isBlank()) {
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (IrcService.isIrc(invc))
			recruitIrc(invc);
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Du willst mich auch in deinem Channel oder Server haben?");
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return check(message.service());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return check(guild.service());
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		identifier = json.getAsString();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return check(user.service());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return service.identifier().equals(identifier);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return check(channel.service());
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("?ndert den Nickname der Botinstanz. Je nach Servicetyp wird der Nickname nur in der aktuellen Community oder global ge?ndert.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (IrcService.isIrc(invc))
			changeIrcNick(invc);
```

### PublicMethodWithoutLogging
'public' method `mention()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return String that will create a mention for the given channel.
	 */
	public default String mention() {
		return displayName();
	}
```

### PublicMethodWithoutLogging
'public' method `canTalk()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return {@code true} if the bot can write messages to this channel.
	 */
	public default boolean canTalk() {
		return true;
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A potential user if the user can be found in this channel.
	 */
	public default Optional<? extends ChrislieUser> user(String identifier) {
		return users().stream()
				.filter(user -> user.identifier().equals(identifier))
```

### PublicMethodWithoutLogging
'public' method `users()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieGuild.java`
#### Snippet
```java
	 * @return A list of all users that are currently part of this guild.
	 */
	public default Collection<? extends ChrislieUser> users() {
		return channels().stream()
				.map(ChrislieChannel::users)
```

### PublicMethodWithoutLogging
'public' method `isNSFW()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return {@code true} if this channel is marked as a NSFW channel.
	 */
	public default boolean isNSFW() {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `isEmpty()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	}
	
	public boolean isEmpty(boolean ignoreHidden) {
		return aliases.values().stream()
				.noneMatch(a -> {
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	 * @param o The other AliasSet.
	 */
	public void apply(AliasSet o) {
		
		// if the other set is a replacement we simply clear this set before applying changes
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	}
	
	public static Optional<AliasSet> of(Collection<String> set) {
		Boolean replace = isReplace(set);
		
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	
	@Override
	public Map<String, Alias> get() {
		return aliases.entrySet().stream()
				.filter(e -> e.getValue().add) // remove if add is false
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of(emojify("Wir haben so viele Emojis, wir sollten sie vielleicht auch alle nutzen, was meinst du?"));
	}
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		try {
			var str = IOUtils.toString(getClass().getResourceAsStream("/emoji-list.txt"), StandardCharsets.UTF_8);
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.arg();
		var result = emojify(m);
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `onFailure()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<QwantResponse> c, Throwable t) {
				ErrorOutputBuilder.remoteRequest(c.request(), t).write(reply).send();
			}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Ich zeig dir das World Wide Web. Gib einfach deine Suchanfrage ein.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc)) {
			ErrorOutputBuilder.generic("Dieses Feature steht nur auf Discord zu Verf?gung.").write(invc).send();
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Generiert eine Vorschau f?r hochgeladene Textdateien aus der referenzierten antwort, so dass der Anhang nicht runtergeladen werden muss.");
	}
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return check(channel.service());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return check(message.service());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
		
		@Override
		public boolean check(ChrislieService service) {
			return service instanceof IrcService;
		}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return check(guild.service());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return check(user.service());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceSelector.java`
#### Snippet
```java
		
		@Override
		public boolean check(ChrislieService service) {
			return service instanceof DiscordService;
		}
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	
	@Override
	public int compareTo(@NotNull FlowQuery o) {
		return from.compareTo(to);
	}
```

### PublicMethodWithoutLogging
'public' method `asQuery()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	}
	
	public static FlowQuery asQuery(Node from, Node to) {
		return new FlowQuery(from, to);
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		user = json.getAsString();
		if (user == null)
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return user.identifier().equals(this.user);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.user(user).isPresent();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		var user = message.user();
		var channel = message.channel();
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		long now = System.currentTimeMillis();
		
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Hiermit kann der Datumsparser f?r die Timer getestet werden.");
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Dreh die Flasche und finde den Nutzer auf den sie zeigt.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var rng = ThreadLocalRandom.current();
		
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/random/DiceCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Du hast den W?rfel f?r den D&D Abend vergessen oder willst eine Klausuraufgabe l?sen? Dann bist du hier genau richtig.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/random/DiceCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		try {
			var arg = invc.arg();
```

### PublicMethodWithoutLogging
'public' method `generate()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	
	@Override
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException {
		return Map.of(Generator.DEFAULT, out);
	}
```

### PublicMethodWithoutLogging
'public' method `generate()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	
	@Override
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException {
		try {
			var arg = invc.arg();
```

### PublicMethodWithoutLogging
'public' method `appendEscape()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion appendEscape(String s, Object... format) {
		super.appendEscape(s, format);
		return this;
```

### PublicMethodWithoutLogging
'public' method `newLine()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion newLine() {
		super.newLine();
		return this;
```

### PublicMethodWithoutLogging
'public' method `appendEscapeSub()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion appendEscapeSub(String s, Object... format) {
		appendEscape(() -> substitutor.replace(s), format);
		return this;
```

### PublicMethodWithoutLogging
'public' method `appendSub()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion appendSub(String s, Object... format) {
		append(() -> substitutor.replace(s), format);
		return this;
```

### PublicMethodWithoutLogging
'public' method `clear()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion clear() {
		super.clear();
		return this;
```

### PublicMethodWithoutLogging
'public' method `append()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion append(String s, Object... format) {
		super.append(s, format);
		return this;
```

### PublicMethodWithoutLogging
'public' method `onSlashCommand()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onSlashCommand(SlashCommandEvent ev) {
		if (sink == null)
			return;
```

### PublicMethodWithoutLogging
'public' method `channel()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public Optional<ChrislieChannel> channel(String identifier) {
		if (identifier.startsWith(PREFIX_GUILD_CHANNEL)) {
			var channel = jda.getGuildChannelById(identifier.substring(PREFIX_GUILD_CHANNEL.length()));
```

### PublicMethodWithoutLogging
'public' method `exit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public void exit() throws ServiceException {
		@SuppressWarnings("UnnecessaryFinalOnLocalVariableOrParameter") final var helper = new Object() {
			private final CountDownLatch latch = new CountDownLatch(1);
```

### PublicMethodWithoutLogging
'public' method `isDiscord()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	}
	
	public static boolean isDiscord(ServiceAttached service) {
		return service.service() instanceof DiscordService;
	}
```

### PublicMethodWithoutLogging
'public' method `onGuildJoin()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onGuildJoin(GuildJoinEvent ev) {
		refreshGuildCommands();
	}
```

### PublicMethodWithoutLogging
'public' method `onShutdown()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			
			@SubscribeEvent
			public void onShutdown(ShutdownEvent ev) {
				latch.countDown();
			}
```

### PublicMethodWithoutLogging
'public' method `awaitReady()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public void awaitReady() throws InterruptedException {
		jda.awaitReady();
	}
```

### PublicMethodWithoutLogging
'public' method `botUser()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public ChrislieUser botUser() {
		return new DiscordUser(this, jda.getSelfUser());
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordUser> user(String identifier) {
		User user = jda.getUserById(identifier);
		return user == null ? Optional.empty() : Optional.of(new DiscordUser(this, user));
```

### PublicMethodWithoutLogging
'public' method `announceResolver()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public void announceResolver(@NonNull ContextResolver ctxResolver) {
		this.ctxResolver = ctxResolver;
		
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onMessage(MessageReceivedEvent ev) {
		if (ev.getAuthor().isBot())
			return;
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordGuild> guild(String identifier) {
		return Optional.ofNullable(jda.getGuildById(identifier))
				.map(guild -> new DiscordGuild(this, guild));
```

### PublicMethodWithoutLogging
'public' method `message()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	
	@Override
	public String message() {
		return ev.getMessage().getContentRaw();
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	
	@Override
	public DiscordUser user() {
		return new DiscordUser(service, ev.getAuthor());
	}
```

### PublicMethodWithoutLogging
'public' method `reply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	
	@Override
	public ChrislieOutput reply(LimiterConfig limiter) {
		return channel.output(limiter, this);
	}
```

### PublicMethodWithoutLogging
'public' method `output()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput output(LimiterConfig limiterConfig, DiscordMessage source) {
		return new DiscordChannelOutput(service(), messageChannel(), source);
	}
```

### PublicMethodWithoutLogging
'public' method `output()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannel.java`
#### Snippet
```java
	
	@Override
	public default ChrislieOutput output(LimiterConfig limiterConfig) {
		return new DiscordChannelOutput(service(), messageChannel());
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	}
	
	public static IrcMessage of(IrcService service, PrivateMessageEvent ev) {
		return new IrcMessage(service,
				new IrcUser(service, ev.getActor()),
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	}
	
	public static IrcMessage of(IrcService service, ChannelMessageEvent ev) {
		var channel = ev.getChannel();
		var guild = service.channelToGuild(channel);
```

### PublicMethodWithoutLogging
'public' method `read()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/PatternTypeAdapter.java`
#### Snippet
```java
	
	@Override
	public Pattern read(JsonReader in) throws IOException {
		return Pattern.compile(in.nextString());
	}
```

### PublicMethodWithoutLogging
'public' method `write()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/PatternTypeAdapter.java`
#### Snippet
```java
	
	@Override
	public void write(JsonWriter out, Pattern value) throws IOException {
		out.value(value.pattern());
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, channel.getUsers().stream()).map(user -> new IrcUser(service, user));
	}
```

### PublicMethodWithoutLogging
'public' method `isDirectMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public boolean isDirectMessage() {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public String displayName() {
		return channel.getName();
	}
```

### PublicMethodWithoutLogging
'public' method `users()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public List<IrcUser> users() {
		return channel.getUsers().stream()
				.map(user -> new IrcUser(service, user))
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return channel.getName();
	}
```

### PublicMethodWithoutLogging
'public' method `hashCode()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public int hashCode() {
		return channel.hashCode();
	}
```

### PublicMethodWithoutLogging
'public' method `resolve()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> resolve(String callName) {
		return channel.getUser(callName)
				.map(user -> new IrcUser(service, user))
```

### PublicMethodWithoutLogging
'public' method `equals()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
```

### PublicMethodWithoutLogging
'public' method `escapeNicks()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	 * @return The escaped string.
	 */
	public String escapeNicks(String s) {
		Pattern nickPattern = Pattern.compile(
				channel.getNicknames().stream().map(Pattern::quote).collect(Collectors.joining("|")),
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcGuild> guild() {
		return Optional.ofNullable(guild);
	}
```

### PublicMethodWithoutLogging
'public' method `output()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	
	@Override
	public IrcOutput output(LimiterConfig limiterConfig) {
		return new IrcOutput(this::escapeNicks, s -> limiterConfig.send(channel, s));
	}
```

### PublicMethodWithoutLogging
'public' method `service()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	
	@Override
	public IrcService service(Chrisliebot bot, String identifier) throws NullPointerException {
		
		var builder = Client.builder();
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NullCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {}
}

```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc))
			throw new ListenerException("This command only works on Discord services.");
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Setzt die Whiteslist f?r den angegebenen Emoji. Beispiel: :kappa: @Premium @Mitglieder. " +
				"Keine Angabe von Rollen l?scht die Whitelist.");
```

### PublicMethodWithoutLogging
'public' method `flag()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @throws IllegalArgumentException If the given flags collide with existing flags or options.
	 */
	public BooleanSupplier flag(String... flags) throws IllegalArgumentException {
		// check if flags are causing conflict
		for (var f : flags)
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		@Override
		public Optional<String> get() {
			if (!OptionsMap.this.parsed)
				throw new NoSuchElementException("you must call parse() before accessing this value");
```

### PublicMethodWithoutLogging
'public' method `visit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		@Override
		public void visit(ChrislieParser parser) throws ChrislieParser.ParserException, OptionsMapException {
			if (value.isPresent())
				throw new OptionsMapException("option has already been set");
```

### PublicMethodWithoutLogging
'public' method `parse()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * Needs to be called after all flags and options have been registered.
	 */
	public void parse() throws ChrislieParser.ParserException {
		
		// we keep a fork of the current parser that we commit after we have completed parsing
```

### PublicMethodWithoutLogging
'public' method `getAsBoolean()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		@Override
		public boolean getAsBoolean() {
			if (!OptionsMap.this.parsed)
				throw new NoSuchElementException("you must call parse() before accessing this value");
```

### PublicMethodWithoutLogging
'public' method `visit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		@Override
		public void visit(ChrislieParser parser) throws OptionsMapException {
			if (value)
				throw new OptionsMapException("flag has already been set");
```

### PublicMethodWithoutLogging
'public' method `option()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @throws IllegalArgumentException If the given options collide with existing flags or options.
	 */
	public Supplier<Optional<String>> option(Function<ChrislieParser, TokenSelector> selector, String... options) throws IllegalArgumentException {
		// check if flags are causing conflict
		for (var f : options)
```

### PublicMethodWithoutLogging
'public' method `shutdown()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	public class Managment {
		
		public void shutdown() {
			shutdownWithCode(EXIT_CODE_PROPER_SHUTDOWN);
		}
```

### PublicMethodWithoutLogging
'public' method `service()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	}
	
	public Optional<ChrislieService> service(String identifier) {
		return Optional.ofNullable(services.get(identifier));
	}
```

### PublicMethodWithoutLogging
'public' method `upgrade()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		}
		
		public void upgrade() {
			shutdownWithCode(EXIT_CODE_UPGRADE);
		}
```

### PublicMethodWithoutLogging
'public' method `restart()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		}
		
		public void restart() {
			shutdownWithCode(EXIT_CODE_RESTART);
		}
```

### PublicMethodWithoutLogging
'public' method `logPart()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logPart(ChannelPartEvent ev) {
		logMessage(new Date(), ev.getChannel().getName(), ev.getUser(), null, MessageType.PART);
	}
```

### PublicMethodWithoutLogging
'public' method `logChannel()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logChannel(ActorChannelMessageEventBase<User> ev) {
		MessageType type = null;
		if (ev instanceof ChannelCtcpEvent) {
```

### PublicMethodWithoutLogging
'public' method `logNick()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logNick(UserNickChangeEvent ev) {
		logMessage(new Date(), ev.getOldUser().getNick(), ev.getOldUser(), ev.getSource().getMessage(), MessageType.NICK);
	}
```

### PublicMethodWithoutLogging
'public' method `logJoin()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logJoin(ChannelJoinEvent ev) {
		logMessage(new Date(), ev.getChannel().getName(), ev.getUser(), null, MessageType.JOIN);
	}
```

### PublicMethodWithoutLogging
'public' method `logQuery()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuery(ActorPrivateMessageEventBase<User> ev) {
		if (ev instanceof PrivateMessageEvent) {
			logMessage(new Date(), ev.getTarget(), ev.getActor(), ev.getMessage(), MessageType.NORMAL);
```

### PublicMethodWithoutLogging
'public' method `logQuit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuit(UserQuitEvent ev) {
		if (ev.getAffectedChannel().isPresent()) {
			logMessage(new Date(), ev.getAffectedChannel().get().getName(), ev.getUser(), null, MessageType.QUIT);
```

### PublicMethodWithoutLogging
'public' method `logKick()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logKick(ChannelKickEvent ev) {
		logMessage(new Date(), ev.getChannel().getName(), ev.getUser(), ev.getMessage() + "(" + ev.getTarget().getNick() + ")", MessageType.KICK);
	}
```

### PublicMethodWithoutLogging
'public' method `asParse()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		private String msg;
		
		public ChrislieDispatcher.CommandParse asParse() {
			return new ChrislieDispatcher.CommandParse(alias, args == null ? "" : args);
		}
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		executorService = bot.sharedResources().timer();
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		config = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("F?hrt den nachfolgenden Befehl ohne IRC Accountinformationen aus. Hat den selben Effekt wie ein Ausloggen aus dem IRC Account.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!IrcService.isIrc(invc)) {
			ERROR_IRC_ONLY.write(invc).send();
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.resolver = resolver;
	}
```

### PublicMethodWithoutLogging
'public' method `onPing()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ClientLogic.java`
#### Snippet
```java
	@CommandFilter("PING")
	@Handler(delivery = Invoke.Synchronously)
	public void onPing(ClientReceiveCommandEvent ev) {
		var param = ev.getParameters();
		String r = "Chrisliebot";
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().shutdown();
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess nicht erneut zu starten.");
	}
```

### PublicMethodWithoutLogging
'public' method `empty()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	}
	
	public static OptionalToken empty(ParserException throwable, ChrislieParser parser) {
		return new NoToken(throwable, parser);
	}
```

### PublicMethodWithoutLogging
'public' method `expect()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public String expect() throws ParserException {
			throw new ParserException(parser, throwable);
		}
```

### PublicMethodWithoutLogging
'public' method `optional()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public Optional<String> optional() {
			return Optional.empty();
		}
```

### PublicMethodWithoutLogging
'public' method `isSuccess()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public boolean isSuccess() {
			return false;
		}
```

### PublicMethodWithoutLogging
'public' method `optional()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public Optional<String> optional() {
			return Optional.of(value);
		}
```

### PublicMethodWithoutLogging
'public' method `expect()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public String expect(String msg) throws ParserException {
			throw new ParserException(parser, "expected `%s` but %s".formatted(msg, throwable.getMessage()), throwable);
		}
```

### PublicMethodWithoutLogging
'public' method `expect()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public String expect(String msg) throws ParserException {
			return value;
		}
```

### PublicMethodWithoutLogging
'public' method `throwable()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public ParserException throwable() throws NoSuchElementException {
			throw new NoSuchElementException("token was successfully parsed so there is no throwable attached");
		}
```

### PublicMethodWithoutLogging
'public' method `expect()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public String expect() throws ParserException {
			return value;
		}
```

### PublicMethodWithoutLogging
'public' method `isSuccess()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		
		@Override
		public boolean isSuccess() {
			return true;
		}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	}
	
	public static OptionalToken of(String value) {
		return new ValueToken(value);
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().upgrade();
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess Chrisliebot zu upgraden.");
	}
```

### PublicMethodWithoutLogging
'public' method `removeBrackets()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	}
	
	public static String removeBrackets(String definition) {
		StringSubstitutor strSub = new StringSubstitutor(key -> key, "[", "]", '\\');
		return strSub.replace(definition);
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		if (taggedMemes == null) {
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	// overwrite the references after all changes were made.
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval(), TimeUnit.MILLISECONDS));
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.stopAsync().awaitTerminated();
	}
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.startAsync().awaitRunning();
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Dank Memes vom Memelord. MEME HARD!! Du willst deine eigenen Memes teilen? Frag Chrisliebaer.");
	}
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		
		@Override
		public int compareTo(MensaRecord o) {
			return Long.signum(timestamp - o.timestamp);
		}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Stellt den aktuellen Speiseplan des Studierendenwerks bereit. mensa list, mensa <name> [<Wochentag|Zahl>], mensa [<Wochentag>]");
	}
```

### PublicMethodWithoutLogging
'public' method `dayOffsetToDate()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	 * @return The starting timestamp but shifted by the given offset.
	 */
	public static long dayOffsetToDate(long timestamp, int offset) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(timestampToDate(timestamp));
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var arg = invc.arg();
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) {
		this.bot = bot;
		updateService = new BetterScheduledService(this::update,
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void start(Chrisliebot bot, ContextResolver resolver) {
		updateService.startAsync().awaitRunning();
	}
```

### PublicMethodWithoutLogging
'public' method `dayOffsetToDate()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	 * @return The timestamp of the next day, starting from the given timestamp.
	 */
	public static long dayOffsetToDate(long timestamp, DayOfWeek dayOfWeek) {
		LocalDate date = LocalDate.ofInstant(Instant.ofEpochMilli(timestamp), TimeZone.getDefault().toZoneId());
		date = date.with(TemporalAdjusters.nextOrSame(dayOfWeek));
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) {
		updateService.stopAsync().awaitTerminated();
	}
```

### PublicMethodWithoutLogging
'public' method `timestampToDate()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	 * @return Timestamp of beginning of same day.
	 */
	public static long timestampToDate(long timestamp) {
		Calendar cal = Calendar.getInstance(MENSA_TIMEZONE); // mensa is actually using local time, so we have to as well
		cal.setTimeInMillis(timestamp);
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		this.cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var args = invc.arg().split(" ");
		if (args.length < 1) {
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("<Query> [<Type>]");
	}
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		if (!DiscordService.isDiscord(msg))
			return;
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		predicates = new ArrayList<>();
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/NSFWSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.isNSFW();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/NSFWSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return message.channel().isNSFW();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/NSFWSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/NSFWSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/NSFWSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `write()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/CronTypeAdapter.java`
#### Snippet
```java
	
	@Override
	public void write(JsonWriter out, Cron value) throws IOException {
		out.value(value.asString());
	}
```

### PublicMethodWithoutLogging
'public' method `read()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/CronTypeAdapter.java`
#### Snippet
```java
	
	@Override
	public Cron read(JsonReader in) throws IOException {
		return new CronParser(cronDefinition).parse(in.nextString());
	}
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(UrbanDictionaryService.BASE_URL)
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var reply = invc.reply();
```

### PublicMethodWithoutLogging
'public' method `onResponse()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
		call.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<DefinitionList> call, Response<DefinitionList> response) {
				assert response.body() != null; // jesus shut up
				var defs = response.body().list();
```

### PublicMethodWithoutLogging
'public' method `onFailure()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
			
			@Override
			public void onFailure(Call<DefinitionList> call, Throwable t) {
				ErrorOutputBuilder.remoteRequest(call.request(), t).write(reply).send();
			}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Ich helf dir beim Treffen von wichtigen Entscheidungen: `option1, option2, ...`");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		var choices = Arrays.stream(arg.split(",")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		}
		
		public static ExternalInvocation of(ChrislieListener.ListenerMessage m, Set<String> flexValues) {
			var msg = m.msg();
			
```

### PublicMethodWithoutLogging
'public' method `toFlatMap()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public Map<String, String> toFlatMap(@NonNull ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
		Map<String, Object> map = new HashMap<>();
		toFlatMap(map, flexValues, m);
```

### PublicMethodWithoutLogging
'public' method `withFlex()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	private Set<String> flexValues = new HashSet<>();
	
	public ExternalMessageTranslator withFlex(@NonNull String key) {
		flexValues.add(key);
		return this;
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String mention;
		
		public static ExternalUser of(ChrislieUser u) {
			var r = new ExternalUser();
			r.identifier = u.identifier();
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private ExternalChannel channel;
		
		public static ExternalInvocation of(ChrislieListener.Invocation invc, Set<String> flexValues) {
			var r = of((ChrislieListener.ListenerMessage) invc, flexValues);
			r.argument = invc.arg();
```

### PublicMethodWithoutLogging
'public' method `toObject()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public ExternalInvocation toObject(@NonNull ChrislieListener.Invocation invc) {
		return ExternalInvocation.of(invc, flexValues);
	}
```

### PublicMethodWithoutLogging
'public' method `toObject()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public ExternalInvocation toObject(@NonNull ChrislieListener.ListenerMessage m) {
		return ExternalInvocation.of(m, flexValues);
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private ExternalGuild guild;
		
		public static ExternalChannel of(ChrislieChannel c) {
			var r = new ExternalChannel();
			r.identifier = c.identifier();
```

### PublicMethodWithoutLogging
'public' method `toFlatMap()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public Map<String, String> toFlatMap(@NonNull ChrislieListener.Invocation m) throws ChrislieListener.ListenerException {
		Map<String, Object> map = new HashMap<>();
		toFlatMap(map, flexValues, m);
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String displayName;
		
		public static ExternalGuild of(ChrislieGuild g) {
			var r = new ExternalGuild();
			r.identifier = g.identifier();
```

### PublicMethodWithoutLogging
'public' method `checkAll()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAll(BiFunction<Selector, T, Boolean> fn, T in) {
		return switch (operation) {
			case OR -> checkAllOr(fn, in);
```

### PublicMethodWithoutLogging
'public' method `checkAllOr()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAllOr(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (fn.apply(selector, in))
```

### PublicMethodWithoutLogging
'public' method `or()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public static CombinationSelector or(List<Selector> selectors) {
		return new CombinationSelector(selectors, Operation.OR);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return checkAll(Selector::check, user);
	}
```

### PublicMethodWithoutLogging
'public' method `and()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public static CombinationSelector and(List<Selector> selectors) {
		return new CombinationSelector(selectors, Operation.AND);
	}
```

### PublicMethodWithoutLogging
'public' method `checkAllAnd()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	public <T> boolean checkAllAnd(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (!fn.apply(selector, in))
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return checkAll(Selector::check, service);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return checkAll(Selector::check, guild);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return checkAll(Selector::check, channel);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return checkAll(Selector::check, message);
	}
```

### PublicMethodWithoutLogging
'public' method `footer()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput footer(String text, String iconUrl);
	
	public default ChrislieOutput footer(String text) {
		return footer(text, null);
	}
```

### PublicMethodWithoutLogging
'public' method `title()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput title(String title, String url);
	
	public default ChrislieOutput title(String title) {
		return title(title, null);
	}
```

### PublicMethodWithoutLogging
'public' method `field()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public ChrislieOutput field(String field, String value, boolean inline);
	
	public default ChrislieOutput field(String field, String value) {
		return field(field, value, true);
	}
```

### PublicMethodWithoutLogging
'public' method `plain()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput plain();
	
	public default ChrislieOutput plain(String s) {
		plainSimpleSet(s, plain());
		return this;
```

### PublicMethodWithoutLogging
'public' method `markAsError()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default void markAsError() {}
	
	public ChrislieOutput color(Color color);
```

### PublicMethodWithoutLogging
'public' method `replace()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput replace(Consumer<PlainOutput> out) {
		out.accept(replace());
		return this;
```

### PublicMethodWithoutLogging
'public' method `description()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput description(Consumer<PlainOutput> out) {
		out.accept(description());
		return this;
```

### PublicMethodWithoutLogging
'public' method `plain()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
```

### PublicMethodWithoutLogging
'public' method `replace()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput replace();
	
	public default ChrislieOutput replace(String s) {
		plainSimpleSet(s, replace());
		return this;
```

### PublicMethodWithoutLogging
'public' method `convert()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput convert(Consumer<PlainOutput.PlainOutputSubstituion> out) {
		out.accept(convert());
		return this;
```

### PublicMethodWithoutLogging
'public' method `convert()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public PlainOutput.PlainOutputSubstituion convert();
	
	public default ChrislieOutput convert(String s) {
		convert().clear().appendEscapeSub(s);
		return this;
```

### PublicMethodWithoutLogging
'public' method `description()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	public @NonNull PlainOutput description();
	
	public default ChrislieOutput description(String s) {
		plainSimpleSet(s, description());
		return this;
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		if (msg.msg().message().startsWith(" ") || isCommand) // TODO: is this good?
			return;
```

### PublicMethodWithoutLogging
'public' method `empty()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 * @return An empty graph, duh.
	 */
	public static FlowGraph empty() {
		return new FlowGraph();
	}
```

### PublicMethodWithoutLogging
'public' method `nodes()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	}
	
	public Set<Node> nodes() {
		return Collections.unmodifiableSet(nodes);
	}
```

### PublicMethodWithoutLogging
'public' method `nodeCount()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 * @return The number of nodes in this graph.
	 */
	public int nodeCount() {
		return nodes.size();
	}
```

### PublicMethodWithoutLogging
'public' method `toEdgeMap()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 * @return The edge map representing this graph.
	 */
	public Map<Edge, Integer> toEdgeMap() {
		return Map.copyOf(edges);
	}
```

### PublicMethodWithoutLogging
'public' method `modifyEdge()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 * @throws IllegalGraphException If new edge capacity would be violating graph contract.
	 */
	public void modifyEdge(Edge edge, int capacity) throws IllegalGraphException {
		// check for loop
		if (edge.from().equals(edge.to()))
```

### PublicMethodWithoutLogging
'public' method `contains()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 * @return Wether this graph contains the given node.
	 */
	public boolean contains(Node node) {
		return nodes.contains(node);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		if (!(channel instanceof IrcChannel))
			return false;
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return check(message.channel());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	@SuppressWarnings("EmptyClass")
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		chars = gson.fromJson(json, new TypeToken<List<Character>>() {}.getType());
		if (chars == null)
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Node.java`
#### Snippet
```java
	
	@Override
	public int compareTo(@NotNull Node o) {
		return name.compareTo(o.name);
	}
```

### PublicMethodWithoutLogging
'public' method `withName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Node.java`
#### Snippet
```java
	private final String name;
	
	public static Node withName(String name) {
		return new Node(name);
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/random/CoinCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Wirf eine M?nze und lass den Zufall f?r dich entscheiden. Sei faul!");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/random/CoinCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.reply()
				.title("Die M?nze ist gefallen")
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess erneut zu starten.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().restart();
	}
```

### PublicMethodWithoutLogging
'public' method `shortVersion()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String buildTime() { return INSTANCE.buildTime; }
	
	public static String shortVersion() {
		return INSTANCE.version + "@" + INSTANCE.buildTime + " (branch: " + INSTANCE.branch + ") clean: " + INSTANCE.clean;
	}
```

### PublicMethodWithoutLogging
'public' method `buildTime()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String clean() { return INSTANCE.clean; }
	
	public static String buildTime() { return INSTANCE.buildTime; }
	
	public static String shortVersion() {
```

### PublicMethodWithoutLogging
'public' method `commit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String version() { return INSTANCE.version; }
	
	public static String commit() { return INSTANCE.commit; }
	
	public static String branch() { return INSTANCE.branch; }
```

### PublicMethodWithoutLogging
'public' method `version()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	}
	
	public static String version() { return INSTANCE.version; }
	
	public static String commit() { return INSTANCE.commit; }
```

### PublicMethodWithoutLogging
'public' method `clean()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String branch() { return INSTANCE.branch; }
	
	public static String clean() { return INSTANCE.clean; }
	
	public static String buildTime() { return INSTANCE.buildTime; }
```

### PublicMethodWithoutLogging
'public' method `branch()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String commit() { return INSTANCE.commit; }
	
	public static String branch() { return INSTANCE.branch; }
	
	public static String clean() { return INSTANCE.clean; }
```

### PublicMethodWithoutLogging
'public' method `read()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/ZoneIdTypeAdapter.java`
#### Snippet
```java
	
	@Override
	public ZoneId read(JsonReader in) throws IOException {
		return ZoneId.of(in.nextString());
	}
```

### PublicMethodWithoutLogging
'public' method `write()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/ZoneIdTypeAdapter.java`
#### Snippet
```java
	
	@Override
	public void write(JsonWriter out, ZoneId value) throws IOException {
		out.value(value.getId());
	}
```

### PublicMethodWithoutLogging
'public' method `peek()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
	 */
	@NotNull
	public OptionalToken peek() {
		return runParser(parser.fork());
	}
```

### PublicMethodWithoutLogging
'public' method `consume()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
	 */
	@NotNull
	public OptionalToken consume() {
		var fork = parser.fork();
		var token = runParser(fork);
```

### PublicMethodWithoutLogging
'public' method `canRead()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
	 * @return {@code true} if this TokenSelector is currently able to read it's token.
	 */
	public boolean canRead() {
		return peek().isSuccess();
	}
```

### PublicMethodWithoutLogging
'public' method `directMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordPrivateChannel> directMessage() {
		var future = user.openPrivateChannel().submit();
		try {
```

### PublicMethodWithoutLogging
'public' method `mention()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Override
	public String mention() {
		return user.getAsMention();
	}
```

### PublicMethodWithoutLogging
'public' method `equals()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return user.getId();
	}
```

### PublicMethodWithoutLogging
'public' method `hashCode()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Override
	public int hashCode() {
		return user.hashCode();
	}
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	
	@Override
	public String displayName() {
		return user.getName();
	}
```

### PublicMethodWithoutLogging
'public' method `discord2ChrislieFormat()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
	}
	
	public static ChrislieFormat discord2ChrislieFormat(Formatting format) {
		return switch (format) {
			case ITALICS -> ChrislieFormat.ITALIC;
```

### PublicMethodWithoutLogging
'public' method `format()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
public class DiscordFormatter {
	
	public static String format(Object format, String s) {
		
		// convert irc->chrisliebot
```

### PublicMethodWithoutLogging
'public' method `format()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordFormatter.java`
#### Snippet
```java
	}
	
	public static String format(ChrislieFormat format, String s) {
		// there is no way to format string in jda without using message builder, so we do it manually
		return switch (format) {
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	
	@Override
	public String displayName() {
		return guild.getName();
	}
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return guild.getId();
	}
```

### PublicMethodWithoutLogging
'public' method `channels()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	
	@Override
	public Collection<DiscordGuildChannel> channels() {
		return guild.getTextChannels().stream()
				.map(channel -> new DiscordGuildChannel(service, channel))
```

### PublicMethodWithoutLogging
'public' method `send()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
	private @NotBlank String path;
	
	public String send(String content) throws IOException {
		var uuid = UUID.randomUUID();
		var file = new File(path, uuid + ".txt");
```

### PublicMethodWithoutLogging
'public' method `convert()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutput.PlainOutputSubstituion convert() {
		return PlainOutput.dummy();
	}
```

### PublicMethodWithoutLogging
'public' method `authorIcon()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput authorIcon(String url) {
		authorIcon = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
```

### PublicMethodWithoutLogging
'public' method `discordSend()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	}
	
	public CompletableFuture<RestObject> discordSend() {
		
		return sink(new SinkMessage());
```

### PublicMethodWithoutLogging
'public' method `title()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput title(String title, String url) {
		embedBuilder.setTitle(title, url);
		return this;
```

### PublicMethodWithoutLogging
'public' method `authorUrl()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput authorUrl(String url) {
		authorUrl = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
```

### PublicMethodWithoutLogging
'public' method `color()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput color(Color color) {
		colorSet = true;
		embedBuilder.setColor(color);
```

### PublicMethodWithoutLogging
'public' method `color()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput color(int color) {
		colorSet = true;
		embedBuilder.setColor(color);
```

### PublicMethodWithoutLogging
'public' method `author()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput author(String name) {
		authorName = name;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
```

### PublicMethodWithoutLogging
'public' method `noUpload()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		 * @return The requested message.
		 */
		public Message noUpload() {
			return prepare(embedBuilder);
		}
```

### PublicMethodWithoutLogging
'public' method `thumbnail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput thumbnail(String url) {
		embedBuilder.setThumbnail(url);
		return this;
```

### PublicMethodWithoutLogging
'public' method `plain()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutput plain() {
		return plain;
	}
```

### PublicMethodWithoutLogging
'public' method `field()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput field(String field, String value, boolean inline) {
		embedBuilder.addField(field, value, inline);
		return this;
```

### PublicMethodWithoutLogging
'public' method `canUpload()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		 * @return Object containing message and files that need to be uploaded together with message.
		 */
		public SinkMessageData canUpload(OkHttpClient okHttpClient) {
			// copy embed builder since we are potentially changing image
			var localEmbedBuilder = new EmbedBuilder(embedBuilder);
```

### PublicMethodWithoutLogging
'public' method `send()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public void send() {
		discordSend();
	}
```

### PublicMethodWithoutLogging
'public' method `download()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			 * @throws IOException If an error occurs during download.
			 */
			public byte[] download() throws IOException {
				return C.downloadFile(client, url);
			}
```

### PublicMethodWithoutLogging
'public' method `replace()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutput replace() {
		return PlainOutput.dummy();
	}
```

### PublicMethodWithoutLogging
'public' method `footer()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public AbstractDiscordOutput footer(String text, String iconUrl) {
		embedBuilder.setFooter(text, iconUrl);
		return this;
```

### PublicMethodWithoutLogging
'public' method `description()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	
	@Override
	public @NonNull PlainOutput description() {
		return description;
	}
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public String displayName() {return channel.getName();}
	
	@Override
```

### PublicMethodWithoutLogging
'public' method `resolve()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordUser> resolve(String callName) {
		throw new RuntimeException("not yet implemented"); // TODO
	}
```

### PublicMethodWithoutLogging
'public' method `messageChannel()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public MessageChannel messageChannel() {
		return channel;
	}
```

### PublicMethodWithoutLogging
'public' method `isNSFW()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public boolean isNSFW() {return channel.isNSFW();}
	
	@Override
```

### PublicMethodWithoutLogging
'public' method `canTalk()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public boolean canTalk() {
		return channel.canTalk();
	}
```

### PublicMethodWithoutLogging
'public' method `isDirectMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public boolean isDirectMessage() {return false;}
	
	@Override
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordGuild> guild() {
		return Optional.of(new DiscordGuild(service, channel.getGuild()));
	}
```

### PublicMethodWithoutLogging
'public' method `mention()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public String mention() {
		return channel.getAsMention();
	}
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return DiscordService.PREFIX_GUILD_CHANNEL + channel.getId();
	}
```

### PublicMethodWithoutLogging
'public' method `users()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public List<DiscordUser> users() {
		return channel.getMembers().stream()
				.map(member -> new DiscordUser(service, member.getUser()))
```

### PublicMethodWithoutLogging
'public' method `append()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	
	@Override
	public DiscordPlainOutput append(String s, Object... format) {
		if (EVERYONE.getPattern().matcher(s).find())
			mentionsTransformers.add(mb -> mb.allowMentions(EVERYONE));
```

### PublicMethodWithoutLogging
'public' method `applyMentionRules()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	 * @param mb The message builder that's mentions should be configured by this output instance.
	 */
	public void applyMentionRules(MessageBuilder mb) {
		mentionsTransformers.forEach(t -> t.accept(mb));
	}
```

### PublicMethodWithoutLogging
'public' method `service()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
	
	@Override
	public DiscordService service(Chrisliebot bot, String identifier) throws LoginException {
		var jda = JDABuilder.create(token, GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS))
				.setEventManager(new AnnotatedEventManager())
```

### PublicMethodWithoutLogging
'public' method `maxFlow()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
	}
	
	public long maxFlow(FlowQuery query) {
		var flowState = new HashMap<>(edges);
		
```

### PublicMethodWithoutLogging
'public' method `ofFlowGraph()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
	}
	
	public static MaxFlowSolver ofFlowGraph(FlowGraph graph) {
		return new MaxFlowSolver(graph.toEdgeMap());
	}
```

### PublicMethodWithoutLogging
'public' method `announceResolver()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * @param resolver The reesolver that is going to be used by this instance.
	 */
	public default void announceResolver(ContextResolver resolver) {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `reconnect()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * Implementing service is expected to, if possible, drop connection and reconnect to network.
	 */
	public default void reconnect() {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `channels()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	
	@Override
	public Collection<IrcChannel> channels() {
		return channels.stream()
				.map(channel -> new IrcChannel(service, channel, this))
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	
	@Override
	public String displayName() {
		return identifier;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage chrislieMessage) {
		if (chrislieMessage instanceof DiscordMessage) {
			var message = (DiscordMessage) chrislieMessage;
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	@Override
	@SuppressWarnings("EmptyClass")
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		permissions = gson.fromJson(json, new TypeToken<Set<Permission>>(){}.getType());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser chrislieUser) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Command.super.help(ctx, ref);
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.reply(ultimateTextMassacre(invc.arg()));
	}
```

### PublicMethodWithoutLogging
'public' method `clear()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutput clear() {
		calls.clear();
		return this;
```

### PublicMethodWithoutLogging
'public' method `append()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutput append(String s, Object... format) {
		append(() -> s, format);
		return this;
```

### PublicMethodWithoutLogging
'public' method `newLine()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutput newLine() {
		calls.add(() -> "\n");
		return this;
```

### PublicMethodWithoutLogging
'public' method `string()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	@CheckReturnValue
	public String string() {
		return calls.stream()
				.map(Supplier::get)
```

### PublicMethodWithoutLogging
'public' method `appendEscape()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	@Override
	public PlainOutput appendEscape(String s, Object... format) {
		appendEscape(() -> s, format);
		return this;
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		StringBuilder sb = new StringBuilder(arg.length());
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("??do? ????s ?l?M ??p");
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return check(message.channel());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return this.guild.identifier().equals(guild.identifier());
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.guild().map(this::check).orElse(false);
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		// initial request gets most recent posts timestamp
		try {
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		feedUpdate.stopAsync().awaitTerminated();
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		var isOtherGuild = message.channel().guild()
				.map(g -> !g.identifier().equals(cfg.guild)) // true if mismatch => other guild
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		cfg = Objects.requireNonNull(gson.fromJson(json, Config.class), "config is null");
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		var guild = user.service().guild(cfg.guild);
		return guild.map(g -> g.users().contains(user)).orElse(false);
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return false;
	}
```

### PublicMethodWithoutLogging
'public' method `check()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		
		// listeners that are accesing private channels might not know they are targeting a single user and thous only use the channel handle
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		shutdown = true;
		
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.dataSource = bot.sharedResources().dataSource();
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("10 min Pizza|list, info|delete|restore <id>, snooze <id> 2 days. Zus?tzlich gibt es folgende K?rzel f?r <id>: ^ letzter abgelaufener Timer, . letzter angelegter Timer, - n?chster f?lliger Timer.");
	}
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcGuild> guild(String identifier) {
		
		var patterns = guildMap.get(identifier);
```

### PublicMethodWithoutLogging
'public' method `botUser()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public ChrislieUser botUser() {
		return new IrcUser(this, client.getUser().orElseThrow());
	}
```

### PublicMethodWithoutLogging
'public' method `isIrc()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	}
	
	public static boolean isIrc(ServiceAttached service) {
		return service.service() instanceof IrcService;
	}
```

### PublicMethodWithoutLogging
'public' method `onChannelMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Handler
	public void onChannelMessage(ChannelMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
```

### PublicMethodWithoutLogging
'public' method `exit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public void exit() {
		// TODO: actually wait for full shutdown
		client.getEventManager().unregisterEventListener(this);
```

### PublicMethodWithoutLogging
'public' method `reconnect()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public void reconnect() {
		client.reconnect();
	}
```

### PublicMethodWithoutLogging
'public' method `channel()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public Optional<? extends ChrislieChannel> channel(String identifier) {
		
		var prefixes = client.getServerInfo().getChannelPrefixes();
```

### PublicMethodWithoutLogging
'public' method `onPrivateMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Handler
	public void onPrivateMessage(PrivateMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> user(String identifier) {
		return userByPrefixedIdentifier(identifier).map(user -> new IrcUser(this, user));
	}
```

### PublicMethodWithoutLogging
'public' method `findUser()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	}
	
	public Optional<User> findUser(Predicate<User> predicate, Stream<User> userStream) {
		return userStream
				.filter(predicate)
```

### PublicMethodWithoutLogging
'public' method `awaitReady()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public void awaitReady() throws Exception {
		client.getEventManager().registerEventListener(this);
		
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	
	@Override
	public final void execute(Invocation invc) throws ListenerException {
		if (cfg().implementsCommand)
			handleCommand(invc);
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	
	@Override
	public final void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		var cfg = cfg();
		
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           will not set the dirty bit.
	 */
	public default void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `unwrap()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @param fn The function to wrap.
		 */
		public default void unwrap(@NonNull ListenerRunnable fn) {
			try {
				fn.run();
```

### PublicMethodWithoutLogging
'public' method `service()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		
		@Override
		public ChrislieService service() {
			return msg.service();
		}
```

### PublicMethodWithoutLogging
'public' method `ref()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		}
		
		public Invocation ref(@NonNull ListenerReference ref) {
			return new Invocation(
					exceptionHandler(),
```

### PublicMethodWithoutLogging
'public' method `arg()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		
		
		public Invocation arg(@NonNull String arg) {
			return new Invocation(
					exceptionHandler(),
```

### PublicMethodWithoutLogging
'public' method `stop()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           exception will cause the dirty bit to be set.
	 */
	public default void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           not set the dirty bit.
	 */
	public default void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `start()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           anything but this exception will cause the dirty bit to be set.
	 */
	public default void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           required to resolve the problem.
	 */
	public default void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `reply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 *                           LimiterConfig} instance.
		 */
		public void reply(String s) throws ListenerException {
			reply().plain(s).send();
		}
```

### PublicMethodWithoutLogging
'public' method `reply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 */
		@CheckReturnValue
		public ChrislieOutput reply() throws ListenerException {
			return msg.reply(LimiterConfig.of(ref().flexConf()));
		}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		 * @throws ListenerException If accessing the help failed.
		 */
		public default Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {return Optional.empty();}
		
		/**
```

### PublicMethodWithoutLogging
'public' method `thumbnail()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput thumbnail(String url) {
		map.put("thumbnailUrl", url);
		return this;
```

### PublicMethodWithoutLogging
'public' method `title()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput title(String title, String url) {
		map.put("title", title);
		map.put("titleUrl", url);
```

### PublicMethodWithoutLogging
'public' method `field()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput field(String field, String value, boolean inline) {
		fields.put(field, value);
		return this;
```

### PublicMethodWithoutLogging
'public' method `authorIcon()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput authorIcon(String url) {
		map.put("authorIcon", url);
		return this;
```

### PublicMethodWithoutLogging
'public' method `author()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput author(String name) {
		map.put("author", name);
		return this;
```

### PublicMethodWithoutLogging
'public' method `send()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public void send() {
		sink.accept(converter.get());
	}
```

### PublicMethodWithoutLogging
'public' method `description()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutput description() {
		return description;
	}
```

### PublicMethodWithoutLogging
'public' method `replace()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutput replace() {
		PlainOutputImpl output = new PlainOutputImpl(escaper, IrcFormatter::format);
		converter = output::string;
```

### PublicMethodWithoutLogging
'public' method `authorUrl()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput authorUrl(String url) {
		map.put("authorUrl", url);
		return this;
```

### PublicMethodWithoutLogging
'public' method `color()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput color(Color color) {
		// there really is nothing we could do with a color
		return this;
```

### PublicMethodWithoutLogging
'public' method `get()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	private Supplier<String> converter = new Supplier<>() {
		@Override
		public String get() {
			String out = "";
			var title = map.get("title");
```

### PublicMethodWithoutLogging
'public' method `image()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput image(String url) {
		map.put("imageUrl", url);
		return this;
```

### PublicMethodWithoutLogging
'public' method `convert()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public PlainOutputSubstituion convert() {
		// swap strategy to using this output with substitutions from gathered method calls
		PlainOutputSubstituionImpl substitution = new PlainOutputSubstituionImpl(escaper, IrcFormatter::format, new StrLookup() {
```

### PublicMethodWithoutLogging
'public' method `plain()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public @NotNull PlainOutput plain() {
		return plain;
	}
```

### PublicMethodWithoutLogging
'public' method `lookup()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
		PlainOutputSubstituionImpl substitution = new PlainOutputSubstituionImpl(escaper, IrcFormatter::format, new StrLookup() {
			@Override
			public String lookup(String key) {
				String out = "MISSING_KEY(" + key + ")";
				switch (key) {
```

### PublicMethodWithoutLogging
'public' method `footer()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput footer(String text, String iconUrl) {
		map.put("footerText", text);
		map.put("footerIconUrl", iconUrl);
```

### PublicMethodWithoutLogging
'public' method `color()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	
	@Override
	public IrcOutput color(int color) {
		// there really is nothing we could do with a color
		return this;
```

### PublicMethodWithoutLogging
'public' method `forcedInvocation()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	
	@Override
	public Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.of(parse);
	}
```

### PublicMethodWithoutLogging
'public' method `markAsError()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
			
			@Override
			public void markAsError() {
				isError = true;
			}
```

### PublicMethodWithoutLogging
'public' method `message()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	
	@Override
	public String message() {
		return parse.args();
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	
	@Override
	public DiscordUser user() {
		return new DiscordUser(service, ev.getUser());
	}
```

### PublicMethodWithoutLogging
'public' method `toInstant()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public OffsetDateTime toInstant() {
		return TimeUtil.getTimeCreated(messageId);
	}
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public Optional<Guild> guild(JDA jda) {
		return Optional.ofNullable(jda.getGuildById(guildId));
	}
```

### PublicMethodWithoutLogging
'public' method `user()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public Optional<User> user(JDA jda) {
		return Optional.ofNullable(jda.getUserById(userId));
	}
```

### PublicMethodWithoutLogging
'public' method `fromResultSet()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public static TraceMessageSource fromResultSet(ResultSet rs) throws SQLException {
		return new TraceMessageSource(rs);
	}
```

### PublicMethodWithoutLogging
'public' method `attach()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcLogger.java`
#### Snippet
```java
	public final String name;
	
	public static void attach(@NonNull String name, @NonNull Client.Builder builder) {
		var logger = new IrcLogger(name);
		
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var reply = invc.reply();
		var substitutor = new CachingSubstitutor(invc);
```

### PublicMethodWithoutLogging
'public' method `lookup()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		
		@Override
		public String lookup(String key) {
			// keys should be in format generator.field, if not, we assume generator.DEFAULT
			var args = key.split("\\.", 2);
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		var cfg = gson.fromJson(json, Config.class);
		output = cfg.output;
```

### PublicMethodWithoutLogging
'public' method `substitute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		}
		
		public String substitute(String s) {
			return substitutor.replace(s);
		}
```

### PublicMethodWithoutLogging
'public' method `load()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
					.build(new CacheLoader<>() {
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
							var generator = generators.get(key);
							
```

### PublicMethodWithoutLogging
'public' method `init()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
```

### PublicMethodWithoutLogging
'public' method `fromConfig()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### PublicMethodWithoutLogging
'public' method `dataSource()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	}
	
	public DataSource dataSource() {
		return dataSource;
	}
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Listet alle Emojis auf, auf die ich aktuell Zugriff habe. Vorsicht: Das sind viele!");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc)) {
			invc.reply("Dieser Befehl funktioniert nur auf Discordinstanzen, das tut mir leid.");
```

### PublicMethodWithoutLogging
'public' method `bot()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceAttached.java`
#### Snippet
```java
	public ChrislieService service();
	
	public default Chrisliebot bot() {
		return service().bot();
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
	public boolean check(ChrislieGuild guild);
	
	public default void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {}
	
	/**
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	@SneakyThrows // TODO: remove once error output builder was reworked
	@Override
	public void execute(Invocation invc) throws ListenerException {
		ChrislieParser parser = new ChrislieParser(invc.arg());
		
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("?berschreibt die aktuelle Loggerkonfiguration bis zum n?chsten Neustart: <TRACE|DEBUG|INFO|WARN|ERROR> [logger-name.[*]], reset");
	}
```

### PublicMethodWithoutLogging
'public' method `unfuck()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/api/MensaApiService.java`
#### Snippet
```java
	 * @return Not really unfucked but still better than what it was before and actually usable.
	 */
	public static Map<String, Map<Long, Map<String, List<MensaApiMeal>>>> unfuck(GsonValidator gson, JsonElement json) {
		if (json == null)
			return null;
```

### PublicMethodWithoutLogging
'public' method `onMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		var m = msg.msg();
		
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	 * @return The given ChrislieOutput for method chaining.
	 */
	public ChrislieOutput apply(ChrislieOutput output, Function<String, String> transform) {
		// we don't want caller to handle null values, so instead we simply handle these with our own lambda
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private @NotNull ChrislieFormat[] formats = EMPTY_FORMATS;
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
```

### PublicMethodWithoutLogging
'public' method `apply()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	 * @return The given ChrislieOutput for method chaining.
	 */
	public ChrislieOutput apply(ChrislieOutput output) {
		return apply(output, Function.identity());
	}
```

### PublicMethodWithoutLogging
'public' method `resolve()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
	}
	
	public <T> ChrislieContext resolve(BiFunction<Selector, T, Boolean> lookup, T t) {
		ChrislieContext ctx = new ChrislieContext();
		
```

### PublicMethodWithoutLogging
'public' method `shutdown()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	 * after a shutdown will be discarded.
	 */
	public void shutdown() throws InterruptedException {
		shutdown = true; // discard all new messages
		
```

### PublicMethodWithoutLogging
'public' method `escalateException()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		
		@Override
		public void escalateException(ChrislieListener.@NonNull ListenerException e) {
			escalateException((Exception) e);
		}
```

### PublicMethodWithoutLogging
'public' method `load()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			.build(new CacheLoader<>() {
				@Override
				public Pattern load(String key) {
					return Pattern.compile(key);
				}
```

### PublicMethodWithoutLogging
'public' method `escalateException()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		
		@Override
		public void escalateException(ChrislieListener.@NonNull ListenerException e) {
			escalateException((Exception) e);
		}
```

### PublicMethodWithoutLogging
'public' method `items()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		private QwantData data;
		
		public List<QwantItem> items(GsonValidator gson, Type type) {
			return data.result.getItemsAndUnfuckMess(gson, type);
		}
```

### PublicMethodWithoutLogging
'public' method `search()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	);
	
	public default Call<QwantResponse> search(String query, SafeSearch safesearch, int count, @NotNull Type type) {
		return search(type.code, type.code, query, safesearch.code, count);
	}
```

### PublicMethodWithoutLogging
'public' method `getItemsAndUnfuckMess()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			
			// web type search returns a bunch of bullshit typed json, so we fix that
			public List<QwantItem> getItemsAndUnfuckMess(GsonValidator gson, Type type) {
				if (items == null || items.isJsonNull()) {
					return List.of();
```

### PublicMethodWithoutLogging
'public' method `mediaUrl()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			private String url;
			
			public String mediaUrl(GsonValidator gson) {
				if (media == null || media.isJsonNull())
					return null;
```

### PublicMethodWithoutLogging
'public' method `help()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Zeigt Informationen zur aktuellen Version von Chrisliebot an.");
	}
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
	@SuppressWarnings({"UnnecessaryUnicodeEscape", "RedundantSuppression"})
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var reply = invc.reply();
		reply.title("Versionsinformationen");
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/quiz/QuizCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		throw new RuntimeException("not implemented"); //TODO
	}
```

### PublicMethodWithoutLogging
'public' method `write()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public ChrislieOutput write(ChrislieListener.ListenerMessage msg) throws ChrislieListener.ListenerException {
		return write(msg.reply());
	}
```

### PublicMethodWithoutLogging
'public' method `remoteErrorCode()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteErrorCode(Request req, @SuppressWarnings("UnnecessaryFullyQualifiedName") retrofit2.Response<?> resp) {
		
		return new ErrorOutputBuilder()
```

### PublicMethodWithoutLogging
'public' method `write()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public ChrislieOutput write(ChrislieOutput out) {
		out.color(ERROR_COLOR);
		out.markAsError();
```

### PublicMethodWithoutLogging
'public' method `generic()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public static ErrorOutputBuilder generic(String description) {
		return new ErrorOutputBuilder().fn(out -> defaultConvert(out.title("Fehler").description(description).convert()));
	}
```

### PublicMethodWithoutLogging
'public' method `generic()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public static ErrorOutputBuilder generic(Consumer<PlainOutput> outFn) {
		return new ErrorOutputBuilder().fn(out -> {
			outFn.accept(out.description());
```

### PublicMethodWithoutLogging
'public' method `throwable()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	
	@CheckReturnValue
	public static ErrorOutputBuilder throwable(Throwable throwable) {
		return new ErrorOutputBuilder().fn(out -> {
			out.title(throwable.getClass().getSimpleName());
```

### PublicMethodWithoutLogging
'public' method `remoteErrorCode()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteErrorCode(Request req, @SuppressWarnings("UnnecessaryFullyQualifiedName") okhttp3.Response resp) {
		return new ErrorOutputBuilder()
				.fn(out -> {
```

### PublicMethodWithoutLogging
'public' method `remoteRequest()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteRequest(Request req, Throwable t) {
		var reason = t.getMessage();
		
```

### PublicMethodWithoutLogging
'public' method `permission()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder permission() {
		return PERMISSION_ERROR;
	}
```

### PublicMethodWithoutLogging
'public' method `toString()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	
	@Override
	public String toString() {
		return "ArgumentParser{" +
				"idx=" + idx +
```

### PublicMethodWithoutLogging
'public' method `quoted()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	@CheckReturnValue
	public TokenSelector quoted(boolean skipWhitespace) {
		return TokenSelector.maybeQuotedString(this, skipWhitespace);
	}
```

### PublicMethodWithoutLogging
'public' method `fork()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @return Identical copy with it's parent set to the current instance.
	 */
	public ChrislieParser fork() {
		return new ChrislieParser(this);
	}
```

### PublicMethodWithoutLogging
'public' method `commit()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @throws IllegalArgumentException If the parser is not a fork of an existing parser.
	 */
	public void commit() throws IllegalArgumentException {
		if (parent == null)
			throw new IllegalStateException("this parser doesn't have a parant");
```

### PublicMethodWithoutLogging
'public' method `options()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @return OptionMap that will operate on this parser.
	 */
	public OptionsMap options() {
		return new OptionsMap(this);
	}
```

### PublicMethodWithoutLogging
'public' method `skipWhitespaces()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * After calling this method, the internal pointer will point to the next non-whitespace character or EOF.
	 */
	public void skipWhitespaces() {
		while (canRead() && Character.isWhitespace(codepoints[idx]))
			skipCodepoints(1);
```

### PublicMethodWithoutLogging
'public' method `codepoint()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	@CheckReturnValue
	public TokenSelector codepoint() {
		return TokenSelector.codepoint(this);
	}
```

### PublicMethodWithoutLogging
'public' method `word()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	@CheckReturnValue
	public TokenSelector word(boolean skipWhitespace) {
		return TokenSelector.singleWord(this, skipWhitespace);
	}
```

### PublicMethodWithoutLogging
'public' method `predicate()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	@CheckReturnValue
	public TokenSelector predicate(IntPredicate pred, boolean acceptEOF) {
		return TokenSelector.predicate(this, pred, acceptEOF);
	}
```

### PublicMethodWithoutLogging
'public' method `string()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 * @return Reconstructs the input string from the internal code point array.
		 */
		public String string() {
			return intStreamToString(IntStream.of(input));
		}
```

### PublicMethodWithoutLogging
'public' method `current()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 * exception occured.
		 */
		public String current() {
			return intStreamToString(IntStream.of(input).skip(index));
		}
```

### PublicMethodWithoutLogging
'public' method `guild()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordGuild> guild() {return Optional.empty();}
	
	@Override
```

### PublicMethodWithoutLogging
'public' method `users()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public List<DiscordUser> users() {
		return List.of(new DiscordUser(service, user));
	}
```

### PublicMethodWithoutLogging
'public' method `resolve()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordUser> resolve(String callName) {
		throw new RuntimeException("not yet implemented"); // TODO
	}
```

### PublicMethodWithoutLogging
'public' method `displayName()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public String displayName() {return channel.getName();}
	
	@Override
```

### PublicMethodWithoutLogging
'public' method `isDirectMessage()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public boolean isDirectMessage() {return true;}
	
	@Override
```

### PublicMethodWithoutLogging
'public' method `identifier()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return DiscordService.PREFIX_PRIVATE_CHANNEL + user.getId(); // use user id as identifier since we need to reopen this channel
	}
```

### PublicMethodWithoutLogging
'public' method `messageChannel()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public MessageChannel messageChannel() {
		return channel;
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, classOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public String toJson(Object src, Type typeOfSrc) {
		return gson.toJson(validate(src), typeOfSrc);
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(Object src, Appendable writer) throws JsonIOException {
		gson.toJson(validate(src), writer);
	}
```

### PublicMethodWithoutLogging
'public' method `factory()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public Converter.Factory factory() {
		return factory;
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(Object src, Type typeOfSrc, Appendable writer) throws JsonIOException {
		gson.toJson(validate(src), typeOfSrc, writer);
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException, JsonIOException {
		return validate(gson.fromJson(json, classOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(Object src, Type typeOfSrc, JsonWriter writer) throws JsonIOException {
		gson.toJson(validate(src), typeOfSrc, writer);
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(JsonElement json, Type typeOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `responseBodyConverter()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
			Converter<ResponseBody, ?> converter = gsonFactory.responseBodyConverter(type, annotations, retrofit);
			return body -> validate(converter.convert(body));
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, classOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public String toJson(Object src) {
		return gson.toJson(src);
	}
```

### PublicMethodWithoutLogging
'public' method `convert()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public RequestBody convert(T value) throws IOException {
			return null;
		}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(JsonElement jsonElement, Appendable writer) throws JsonIOException {
		gson.toJson(jsonElement, writer);
	}
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `requestBodyConverter()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Nullable
		@Override
		public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
			Converter<?, RequestBody> converter = gsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
			return value -> validate(converter.convert(C.unsafeCast(value))); // type compatibility is upheld by retrofit
```

### PublicMethodWithoutLogging
'public' method `fromJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException, JsonSyntaxException {
		return validate(gson.fromJson(reader, typeOfT));
	}
```

### PublicMethodWithoutLogging
'public' method `toJson()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public String toJson(JsonElement jsonElement) {
		return gson.toJson(jsonElement);
	}
```

### PublicMethodWithoutLogging
'public' method `compareTo()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		@Override
		public int compareTo(@NotNull KitEscapeRoutesCommand.GraphContainer o) {
			var intComp = Integer.compareUnsigned(o.graph.nodeCount(), graph.nodeCount());
			if (intComp != 0)
```

### PublicMethodWithoutLogging
'public' method `execute()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void execute(Invocation invc) throws ListenerException {
		try {
			var arg = invc.arg();
```

### PublicMethodWithoutLogging
'public' method `instance()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	}
	
	public List<ScopeMapping> instance(GsonValidator gson) throws ConfigInitializeException {
		return new Builder().instanceScopeMapping(gson);
	}
```

### PublicMethodWithoutLogging
'public' method `of()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		private Map<String, JsonElement> map;
		
		public static FlexConf of(GsonValidator gson, Map<String, JsonElement> map) {
			return new FlexConf(new JsonFlexConfResolver(gson, map));
		}
```

### PublicMethodWithoutLogging
'public' method `instance()` has no logging call
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		@SuppressWarnings("VariableNotUsedInsideIf") // validation is for user, not for program
		public ListenerReference instance(GsonValidator gson, ChrislieContext ctx, String groupName) throws ChrislieListener.ListenerException {
			
			// check for common fields
```

## ClassNestingDepth
### ClassNestingDepth
`UploadFile` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		@Data
		@AllArgsConstructor
		public static class UploadFile {
			
			private final OkHttpClient client;
```

### ClassNestingDepth
`CacheLoader<>` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			// instances a loading cache that will use the parents generators with the given invocation to create inputs
			cache = CacheBuilder.newBuilder()
					.build(new CacheLoader<>() {
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
```

### ClassNestingDepth
`ArgumentPassing` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		}
		
		private enum ArgumentPassing {
			/**
			 * Passes arguments as environment variables to process.
```

### ClassNestingDepth
`ExitCodeMethod` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		private SerializedOutput output;
		
		private enum ExitCodeMethod {
			/**
			 * Accept any exit code as valid.
```

### ClassNestingDepth
`PlainOutputMethod` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		@AllArgsConstructor
		private enum PlainOutputMethod {
			APPEND(PlainOutput::append),
			APPEND_ESCAPE(PlainOutput::appendEscape);
```

### ClassNestingDepth
`PlainMethod` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		public static final ChrislieFormat[] EMPTY_FORMATS = new ChrislieFormat[0];
		
		private interface PlainMethod {
			
			public PlainOutput fn(PlainOutput output, String s, Object[] format);
```

### ClassNestingDepth
`QwantItem` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		
		@Data
		public static class QwantItem {
			
			private String title;
```

### ClassNestingDepth
`TypeToken`> is too deeply nested (nesting level = 3)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				
				if (items.isJsonArray()) {
					return gson.fromJson(items, new TypeToken<List<QwantItem>>() {}.getType());
				}
				
```

### ClassNestingDepth
`QwantMainlineItemsBullshit` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		public static class QwantMainlineItemsBullshit {
			
			public List<QwantResult> mainline;
```

### ClassNestingDepth
`QwantQuery` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		private static class QwantQuery {
			
			public String query;
```

### ClassNestingDepth
`QwantMediaSubObject2` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		public static class QwantMediaSubObject2 {
			public String url;
		}
```

### ClassNestingDepth
`QwantMediaSubObject` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		public static class QwantMediaSubObject {
			public QwantMediaSubObject2 pict;
		}
```

### ClassNestingDepth
`QwantResult` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		private static class QwantResult {
			
			public JsonElement items;
```

### ClassNestingDepth
`QwantData` is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		private static class QwantData {
			
			public QwantResult result;
```

### ClassNestingDepth
`TypeToken`> is too deeply nested (nesting level = 2)
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		@SuppressWarnings("EmptyClass")
		private List<Selector> instanceSelectors(@NonNull JsonElement json) throws Selector.SelectorException {
			List<JsonSelector> jsonSelectors = gson.fromJson(json, new TypeToken<List<JsonSelector>>() {}.getType());
			List<Selector> selectors = new ArrayList<>(jsonSelectors.size());
			for (JsonSelector selector : jsonSelectors)
```

## BooleanVariableAlwaysNegated
### BooleanVariableAlwaysNegated
Boolean field `updateSlashCommands` is always inverted
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
	
	@Setter private Consumer<ChrislieMessage> sink;
```

### BooleanVariableAlwaysNegated
Boolean field `parsed` is always inverted
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	
	
	private boolean parsed; // used to indicate that parse() has been called
	private Map<String, OptionContainer> map = new HashedMap<>();
	
```

### BooleanVariableAlwaysNegated
Boolean field `colorSet` is always inverted
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	 * since we need the proper call stack for this, we have to store the color in the constructor
	 */
	private boolean colorSet = false;
	
	private URL imageUrl = null; // ideally, embed builder would allow us to just access the god damn thing
```

## UnqualifiedFieldAccess
### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieIdentifier.java`
#### Snippet
```java
		
		public Optional<ChrislieChannel> channel(Chrisliebot bot) {
			return bot.service(service).flatMap(service -> service.channel(channel));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieIdentifier.java`
#### Snippet
```java
		
		public Optional<ChrislieChannel> channel(Chrisliebot bot) {
			return bot.service(service).flatMap(service -> service.channel(channel));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `irc` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
	public void ensureDisjoint() {
		Set<String> set = new HashSet<>();
		ensureDisjoint(set, irc.keySet());
		ensureDisjoint(set, discord.keySet());
	}
```

### UnqualifiedFieldAccess
Instance field access `discord` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/CoreConfig.java`
#### Snippet
```java
		Set<String> set = new HashSet<>();
		ensureDisjoint(set, irc.keySet());
		ensureDisjoint(set, discord.keySet());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public Optional<? extends ChrislieChannel> directMessage() {
		return Optional.of(new IrcPrivateChannel(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public Optional<? extends ChrislieChannel> directMessage() {
		return Optional.of(new IrcPrivateChannel(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `idFn` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return idFn.apply(this);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return user.hashCode();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
			return false;
		IrcUser ircUser = (IrcUser) o;
		return user.equals(ircUser.user);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public String mention() {
		return user.getNick();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	 */
	public IrcUser asNickname() {
		return new IrcUser(service, user, IrcUser::createIdFromNickIgnoreAccount);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	 */
	public IrcUser asNickname() {
		return new IrcUser(service, user, IrcUser::createIdFromNickIgnoreAccount);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	@Override
	public String displayName() {
		return user.getNick();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(cfg.hostname())
				.client(bot.sharedResources().httpClient())
				.addConverterFactory(bot.sharedResources().gson().factory())
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
				.addConverterFactory(bot.sharedResources().gson().factory())
				.build();
		service = retrofit.create(HaskellService.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
				.args(HaskellService.Args.builder().timelimit(timeout).expression(invc.arg()).build())
				.build();
		var call = service.runHaskell(param);
		
		call.enqueue(new Callback<>() {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `offset` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	public List<String> split(String message, int limit) {
		// limit is broken when connected to znc, a hard coded offset should fix that
		limit += offset;
		
		if (stripIrcFormatting)
```

### UnqualifiedFieldAccess
Instance field access `stripIrcFormatting` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		limit += offset;
		
		if (stripIrcFormatting)
			message = Format.stripAll(message);
		else
```

### UnqualifiedFieldAccess
Instance field access `maxLines` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		// we need to check if the output exceeds our limits and take appropriate action
		int excess = out.size() - maxLines;
		if (excess > 0) {
			
```

### UnqualifiedFieldAccess
Instance field access `outOfBand` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		if (excess > 0) {
			
			if (outOfBand == null) {
				// drop excess lines
				out = out.subList(0, maxLines);
```

### UnqualifiedFieldAccess
Instance field access `maxLines` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			if (outOfBand == null) {
				// drop excess lines
				out = out.subList(0, maxLines);
				
				if (appendCutNotice) {
```

### UnqualifiedFieldAccess
Instance field access `appendCutNotice` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
				out = out.subList(0, maxLines);
				
				if (appendCutNotice) {
					String notice = String.format("(%s Zeile(n) wurden abgeschnitten.)", excess);
					
```

### UnqualifiedFieldAccess
Instance field access `outOfBand` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
			} else {
				try {
					String url = outOfBand.send(Format.stripAll(message));
					out = List.of("Die Ausgabe war zu lang und wurde umgeleitet: " + url);
				} catch (IOException e) {
```

### UnqualifiedFieldAccess
Instance field access `stripLineBreak` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		message = message.replace("\0", "");
		
		if (stripLineBreak)
			message = C.NEWLINE_PATTERN.matcher(message).replaceAll(" ");
		
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	
	public <T> Optional<T> get(String key, Type type) {
		return C.unsafeCast(resolver.get(key, type));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `current` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		@Override
		public <V> Optional<V> get(String key, Class<V> clazz) {
			return current.get(key, clazz).or(() -> next.get(key, clazz));
		}
		
```

### UnqualifiedFieldAccess
Instance field access `next` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		@Override
		public <V> Optional<V> get(String key, Class<V> clazz) {
			return current.get(key, clazz).or(() -> next.get(key, clazz));
		}
		
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	
	public OptionalDouble getDouble(String key) {
		return resolver.get(key, Double.class).map(OptionalDouble::of).orElseGet(OptionalDouble::empty);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	
	public <V> Optional<V> get(String key, Class<V> clazz) {
		return resolver.get(key, clazz);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	
	public Optional<String> getString(String key) {
		return resolver.get(key, String.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public FlexConf apply(@NonNull FlexConf o) {
		// this creates a chain of resolver, with the current one being in front
		resolver = new ChainResolver(o.resolver, resolver); // yes, this is the correct parameter order, new one goes first and becomes current
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public FlexConf apply(@NonNull FlexConf o) {
		// this creates a chain of resolver, with the current one being in front
		resolver = new ChainResolver(o.resolver, resolver); // yes, this is the correct parameter order, new one goes first and becomes current
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	
	public OptionalInt getInteger(String key) {
		return resolver.get(key, Integer.class).map(OptionalInt::of).orElseGet(OptionalInt::empty);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	
	public OptionalLong getLong(String key) {
		return resolver.get(key, Long.class).map(OptionalLong::of).orElseGet(OptionalLong::empty);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `current` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		@Override
		public Optional<Object> get(String key, Type type) {
			return current.get(key, type).or(() -> next.get(key, type));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `next` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		@Override
		public Optional<Object> get(String key, Type type) {
			return current.get(key, type).or(() -> next.get(key, type));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `convert` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		@Override
		public Optional<T> get(FlexConf flex) {
			return convert.apply(flex, key);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `key` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		@Override
		public Optional<T> get(FlexConf flex) {
			return convert.apply(flex, key);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `convert` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		@Override
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException {
			return convert.apply(flex, key).orElseThrow(() -> FlexConf.keyNotFound(key));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `key` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		@Override
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException {
			return convert.apply(flex, key).orElseThrow(() -> FlexConf.keyNotFound(key));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `key` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		@Override
		public T getOrFail(FlexConf flex) throws ChrislieListener.ListenerException {
			return convert.apply(flex, key).orElseThrow(() -> FlexConf.keyNotFound(key));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		@Override
		public JoinPlainOutput append(String s, Object... format) {
			out.append(s, format);
			pending = true;
			return this;
```

### UnqualifiedFieldAccess
Instance field access `pending` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		public JoinPlainOutput append(String s, Object... format) {
			out.append(s, format);
			pending = true;
			return this;
		}
```

### UnqualifiedFieldAccess
Instance field access `pending` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		 */
		public JoinPlainOutput seperator() {
			if (pending) {
				pending = false;
				out.appendEscape(delimiter);
```

### UnqualifiedFieldAccess
Instance field access `pending` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		public JoinPlainOutput seperator() {
			if (pending) {
				pending = false;
				out.appendEscape(delimiter);
			}
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
			if (pending) {
				pending = false;
				out.appendEscape(delimiter);
			}
			return this;
```

### UnqualifiedFieldAccess
Instance field access `delimiter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
			if (pending) {
				pending = false;
				out.appendEscape(delimiter);
			}
			return this;
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		@Override
		public JoinPlainOutput newLine() {
			out.newLine();
			return this;
		}
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		@Override
		public JoinPlainOutput appendEscape(String s, Object... format) {
			out.appendEscape(s, format);
			pending = true;
			return this;
```

### UnqualifiedFieldAccess
Instance field access `pending` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		public JoinPlainOutput appendEscape(String s, Object... format) {
			out.appendEscape(s, format);
			pending = true;
			return this;
		}
```

### UnqualifiedFieldAccess
Instance field access `pending` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		@Override
		public JoinPlainOutput clear() {
			pending = false;
			out.clear();
			return this;
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		public JoinPlainOutput clear() {
			pending = false;
			out.clear();
			return this;
		}
```

### UnqualifiedFieldAccess
Instance field access `fns` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
	
	private boolean test(DataContainer c) {
		return fns.stream().allMatch(f -> f.apply(c));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `fns` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
		Map<String, String> map = gson.fromJson(json, type);
		
		fns = new ArrayList<>(map.size());
		
		for (var e : map.entrySet()) {
```

### UnqualifiedFieldAccess
Instance field access `fns` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/RegExpSelector.java`
#### Snippet
```java
			
			// build function that takes container, uses accessor to extract value and tests with the given predicate
			fns.add(c -> {
				var val = accessor.get().apply(c);
				return val != null && predicate.test(val);
```

### UnqualifiedFieldAccess
Instance field access `listeners` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	public Map<String, ListenerReference> listeners() {
		return Collections.unmodifiableMap(listeners);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `envelope` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			
			// if listener instance differs, we drop the existing context, this also happens on the first merge since listener is initialized with null
			if (envelope != o.envelope()) {
				name = o.name();
				help = o.help() != null ? o.help() : help; // only override if set
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			// if listener instance differs, we drop the existing context, this also happens on the first merge since listener is initialized with null
			if (envelope != o.envelope()) {
				name = o.name();
				help = o.help() != null ? o.help() : help; // only override if set
				
```

### UnqualifiedFieldAccess
Instance field access `help` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			if (envelope != o.envelope()) {
				name = o.name();
				help = o.help() != null ? o.help() : help; // only override if set
				
				envelope = o.envelope();
```

### UnqualifiedFieldAccess
Instance field access `help` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			if (envelope != o.envelope()) {
				name = o.name();
				help = o.help() != null ? o.help() : help; // only override if set
				
				envelope = o.envelope();
```

### UnqualifiedFieldAccess
Instance field access `envelope` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
				help = o.help() != null ? o.help() : help; // only override if set
				
				envelope = o.envelope();
				
				// section requires copying, since we can't just take a reference, this would make us modify existing ListenerReferences once we call this method a second time
```

### UnqualifiedFieldAccess
Instance field access `aliasSet` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
				// current context flexconfg will be used as a fallback in all listener references but since this flex conf can change multiple times, we use it as a fallback, rather then a snapshot
				super.flexConf = FlexConf.fallback(ChrislieContext.this.flexConf).apply(o.flexConf()); // copies o.flexConf but adds fallback to global context flexConf
				aliasSet = new AliasSet(o.aliasSet());
				return;
			}
```

### UnqualifiedFieldAccess
Instance field access `aliasSet` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			// otherwise we apply both the flex conf and alias set from the other listener context
			super.flexConf.apply(o.flexConf());
			aliasSet.apply(o.aliasSet());
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `listeners` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	public Optional<ListenerReference> listener(String name) {
		return Optional.ofNullable(listeners.get(name));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `included` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	public void addGroup(ChrislieGroup group) {
		if (included.contains(group)) {
			log.trace("ignoring include of group `{}` since it was already included before", group.name());
			return;
```

### UnqualifiedFieldAccess
Instance field access `flexConf` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
		
		// merging flex conf of group so that most recently added group provides values first
		flexConf.apply(group.flexConf());
		
		// lookup existing listener context and merge with each ref in group
```

### UnqualifiedFieldAccess
Instance field access `listeners` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
		// lookup existing listener context and merge with each ref in group
		for (var e : group.refs().entrySet()) {
			var ctx = listeners.get(e.getKey());
			
			// the new context will actually be unsuable due to it's defaults, but since it will be merged in the following lines, it's fine
```

### UnqualifiedFieldAccess
Instance field access `listeners` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			if (ctx == null) {
				ctx = new ListenerContext();
				listeners.put(e.getKey(), ctx);
			}
			ctx.apply(e.getValue());
```

### UnqualifiedFieldAccess
Instance field access `included` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
		
		// remember included group
		included.add(group);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	public Optional<ListenerReference> alias(String alias) {
		return Optional.ofNullable(aliases.get(alias));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `listeners` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	public Optional<? extends ListenerReference> listener(ChrislieListener listener) throws NoSuchElementException {
		return listeners.values().stream().filter(ctx -> ctx.envelope().listener() == listener).findAny();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	private void updateAliases() {
		aliases.clear();
		for (ListenerContext ctx : listeners.values()) {
			for (AliasSet.Alias alias : ctx.aliasSet().get().values()) {
```

### UnqualifiedFieldAccess
Instance field access `listeners` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	private void updateAliases() {
		aliases.clear();
		for (ListenerContext ctx : listeners.values()) {
			for (AliasSet.Alias alias : ctx.aliasSet().get().values()) {
				var old = aliases.put(alias.name(), ctx);
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
		for (ListenerContext ctx : listeners.values()) {
			for (AliasSet.Alias alias : ctx.aliasSet().get().values()) {
				var old = aliases.put(alias.name(), ctx);
				if (old != null)
					log.warn("conflicting alias found: `{}` is hiding `{}` on alias `{}`", ctx.envelope(), old.envelope(), alias);
```

### UnqualifiedFieldAccess
Instance field access `pollTask` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	private synchronized void poll() {
		if (shutdown)
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `subscriptions` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		
		// poll all subscribed timelines for new tweets
		for (var sub : subscriptions) {
			try {
				// twitter4j provides no return value for easy pagination but we don't care about more than 20 tweets
```

### UnqualifiedFieldAccess
Instance field access `twitter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// twitter4j provides no return value for easy pagination but we don't care about more than 20 tweets
				// also: yes, we need to differentiate here because twitter4j is really broken
				var timeline = sub.lastId == 0 ? twitter.getUserTimeline(sub.userId) :
						twitter.getUserTimeline(sub.userId, new Paging().sinceId(sub.lastId));
				
```

### UnqualifiedFieldAccess
Instance field access `twitter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// also: yes, we need to differentiate here because twitter4j is really broken
				var timeline = sub.lastId == 0 ? twitter.getUserTimeline(sub.userId) :
						twitter.getUserTimeline(sub.userId, new Paging().sinceId(sub.lastId));
				
				// newest entry is first, we don't want that, so we invert it
```

### UnqualifiedFieldAccess
Instance field access `pollTask` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		pollTask.cancel(false);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		sub.lastId = tweets.get(tweets.size() - 1).getId();
		
		var maybeChannel = sub.channel.channel(bot);
		if (maybeChannel.isEmpty()) {
			log.warn("could not find channel for subscription {}", sub);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		}
		
		var ctx = resolver.resolve(Selector::check, maybeChannel.get());
		var maybeRef = ctx.listener(this);
		if (maybeRef.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		this.resolver = resolver;
		var config = new ConfigurationBuilder()
				.setOAuthConsumerKey(cfg.apiKey)
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		var config = new ConfigurationBuilder()
				.setOAuthConsumerKey(cfg.apiKey)
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				.setOAuthConsumerKey(cfg.apiKey)
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
				.build();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
				.build();
		twitter = new TwitterFactory(config).getInstance();
```

### UnqualifiedFieldAccess
Instance field access `twitter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
				.build();
		twitter = new TwitterFactory(config).getInstance();
		
		// we need the account name and the last tweet id, luckily we can do this with a single request per subscrition
```

### UnqualifiedFieldAccess
Instance field access `subscriptions` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		
		// we need the account name and the last tweet id, luckily we can do this with a single request per subscrition
		subscriptions = new ArrayList<>(cfg.subscriptions.size());
		var partitions = Lists.partition(cfg.subscriptions, 100); // endpoints allows 100 users per request
		for (var part : partitions) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		
		// we need the account name and the last tweet id, luckily we can do this with a single request per subscrition
		subscriptions = new ArrayList<>(cfg.subscriptions.size());
		var partitions = Lists.partition(cfg.subscriptions, 100); // endpoints allows 100 users per request
		for (var part : partitions) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		// we need the account name and the last tweet id, luckily we can do this with a single request per subscrition
		subscriptions = new ArrayList<>(cfg.subscriptions.size());
		var partitions = Lists.partition(cfg.subscriptions, 100); // endpoints allows 100 users per request
		for (var part : partitions) {
			try {
```

### UnqualifiedFieldAccess
Instance field access `twitter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
			try {
				var ids = part.stream().map(TimelineSubscription::userId).mapToLong(v -> v).toArray();
				var users = twitter.users().lookupUsers(ids);
				
				// returned array may not match id order, so we need intermediate step
```

### UnqualifiedFieldAccess
Instance field access `subscriptions` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
					
					// only store resolved users and ignore deleted ones
					subscriptions.add(subscription);
				}
			} catch (TwitterException e) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		}
		
		log.debug("will monitor the following subscriptions: {}", cfg.subscriptions);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return user.hashCode();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return user.identifier();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public String displayName() {
		return user.displayName();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
			return false;
		IrcPrivateChannel that = (IrcPrivateChannel) o;
		return user.equals(that.user);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public List<IrcUser> users() {
		return List.of(user);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public IrcOutput output(LimiterConfig limiterConfig) {
		return new IrcOutput(Function.identity(), s -> limiterConfig.send(user.user(), s));
	}
}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, Stream.of(user.user())).map(u -> new IrcUser(service, u));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, Stream.of(user.user())).map(u -> new IrcUser(service, u));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, Stream.of(user.user())).map(u -> new IrcUser(service, u));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `from` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull Edge o) {
		var firstComp = from.compareTo(o.from);
		if (firstComp != 0)
			return firstComp;
```

### UnqualifiedFieldAccess
Instance field access `to` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
		if (firstComp != 0)
			return firstComp;
		return to.compareTo(o.to);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `to` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	
	public Edge reverse() {
		return new Edge(to, from);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `from` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	
	public Edge reverse() {
		return new Edge(to, from);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `commandParse` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	@Override
	public Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.of(commandParse);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	@Override
	public ChrislieService service() {
		return channel.service();
	}
}
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
	@Override
	public void execute(Invocation invc) throws ListenerException {
		out.apply(invc.reply()).send();
	}
}
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		out = Objects.requireNonNull(gson.fromJson(json, SerializedOutput.class));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		channel = json.getAsString();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
		reply.description()
				.appendEscape("Du willst mich auf auch auf deinem Server haben? Dann lade mich doch ein: ")
				.append(cfg.recruitUrl);
		reply.send();
	}
```

### UnqualifiedFieldAccess
Instance field access `identifier` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		identifier = json.getAsString();
	}
}
```

### UnqualifiedFieldAccess
Instance field access `identifier` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ServiceIdentifierSelector.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieService service) {
		return service.identifier().equals(identifier);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	
	public AliasSet(AliasSet o) {
		aliases = new HashMap<>(o.aliases);
		replace = o.replace;
	}
```

### UnqualifiedFieldAccess
Instance field access `replace` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	public AliasSet(AliasSet o) {
		aliases = new HashMap<>(o.aliases);
		replace = o.replace;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	
	public boolean isEmpty(boolean ignoreHidden) {
		return aliases.values().stream()
				.noneMatch(a -> {
					if (ignoreHidden)
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
		// if the other set is a replacement we simply clear this set before applying changes
		if (o.replace) {
			aliases.clear();
			replace = true; // in order to maintain replacment contract, we need to taint this set as replacement
		}
```

### UnqualifiedFieldAccess
Instance field access `replace` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
		if (o.replace) {
			aliases.clear();
			replace = true; // in order to maintain replacment contract, we need to taint this set as replacement
		}
		
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
		
		// we simply override existing entries with entries from the other alias set
		aliases.putAll(o.aliases);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	
	public AliasSet() {
		aliases = new HashMap<>(0);
		replace = false;
	}
```

### UnqualifiedFieldAccess
Instance field access `replace` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	public AliasSet() {
		aliases = new HashMap<>(0);
		replace = false;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `aliases` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	@Override
	public Map<String, Alias> get() {
		return aliases.entrySet().stream()
				.filter(e -> e.getValue().add) // remove if add is false
				.map(e -> new Alias(e.getKey(), e.getValue().exposed))
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		StringSubstitutor strSub = new StringSubstitutor(key -> switch (key) {
			case "title" -> C.stripHtml(item.title());
			case "media" -> item.mediaUrl(bot.sharedResources().gson());
			case "desc" -> C.stripHtml(item.desc());
			case "url" -> item.url();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		});
		
		cfg.output.apply(reply, strSub::replace);
		reply.send();
	}
```

### UnqualifiedFieldAccess
Instance field access `errorRateLimited` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				if (!resp.isSuccessful() || (body != null && !"success".equals(body.status()))) { // bad error code or "error" in status field of json
					if (resp.code() == RATE_LIMIT_CODE) {
						errorRateLimited.write(reply).send();
					} else {
						ErrorOutputBuilder.remoteErrorCode(c.request(), resp).write(reply).send();
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
					
					// clear search cache so we don't confuse user with old results
					synchronized (resultStorage) {
						resultStorage.invalidate(identifier);
					}
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
					// clear search cache so we don't confuse user with old results
					synchronized (resultStorage) {
						resultStorage.invalidate(identifier);
					}
					
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				}
				assert body != null; // shut up about body being null, it can't
				List<QwantResponse.QwantItem> items = body.items(bot.sharedResources().gson(), cfg.type);
				if (items == null || items.isEmpty()) {
					ERROR_NO_MATCH.write(reply).send();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				}
				assert body != null; // shut up about body being null, it can't
				List<QwantResponse.QwantItem> items = body.items(bot.sharedResources().gson(), cfg.type);
				if (items == null || items.isEmpty()) {
					ERROR_NO_MATCH.write(reply).send();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				}
				
				if (cfg.randomize)
					Collections.shuffle(items);
				
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
					Collections.shuffle(items);
				
				synchronized (resultStorage) {
					// add result to storage for later lookups
					resultStorage.put(identifier, items);
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				synchronized (resultStorage) {
					// add result to storage for later lookups
					resultStorage.put(identifier, items);
					
					// pop and print
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
				.expireAfterAccess(cfg.resultTimeout, TimeUnit.MILLISECONDS)
				.build();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
				.expireAfterAccess(cfg.resultTimeout, TimeUnit.MILLISECONDS)
				.build();
		
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				.addConverterFactory(bot.sharedResources().gson().factory())
				.build();
		service = retrofit.create(QwantService.class);
		
		errorRateLimited = ErrorOutputBuilder.generic(out -> out.appendEscape("Ich wurde ausgesperrt. Bitte hilf mir: ").append(cfg.captchaUrl));
```

### UnqualifiedFieldAccess
Instance field access `errorRateLimited` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		service = retrofit.create(QwantService.class);
		
		errorRateLimited = ErrorOutputBuilder.generic(out -> out.appendEscape("Ich wurde ausgesperrt. Bitte hilf mir: ").append(cfg.captchaUrl));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		service = retrofit.create(QwantService.class);
		
		errorRateLimited = ErrorOutputBuilder.generic(out -> out.appendEscape("Ich wurde ausgesperrt. Bitte hilf mir: ").append(cfg.captchaUrl));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		if ("next".equalsIgnoreCase(query)) {
			synchronized (resultStorage) {
				List<QwantResponse.QwantItem> pastResult = resultStorage.getIfPresent(identifier);
				if (pastResult == null) {
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		if ("next".equalsIgnoreCase(query)) {
			synchronized (resultStorage) {
				List<QwantResponse.QwantItem> pastResult = resultStorage.getIfPresent(identifier);
				if (pastResult == null) {
					ERROR_NO_ACTIVE_SEARCH.write(reply).send();
```

### UnqualifiedFieldAccess
Instance field access `resultStorage` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				if (pastResult.isEmpty()) {
					ERROR_EOF.write(reply).send();
					resultStorage.invalidate(identifier);
					return;
				}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		var safeSearch = FLEX_SAFE_SEARCH.getOrFail(invc);
		Call<QwantResponse> call = service.search(query, safeSearch, cfg.count, cfg.type);
		call.enqueue(new Callback<>() {
			@Override
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		var safeSearch = FLEX_SAFE_SEARCH.getOrFail(invc);
		Call<QwantResponse> call = service.search(query, safeSearch, cfg.count, cfg.type);
		call.enqueue(new Callback<>() {
			@Override
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		var safeSearch = FLEX_SAFE_SEARCH.getOrFail(invc);
		Call<QwantResponse> call = service.search(query, safeSearch, cfg.count, cfg.type);
		call.enqueue(new Callback<>() {
			@Override
```

### UnqualifiedFieldAccess
Instance field access `list` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	private String randomEmoji() {
		return list.get(ThreadLocalRandom.current().nextInt(list.size()));
	}
}
```

### UnqualifiedFieldAccess
Instance field access `list` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	private String randomEmoji() {
		return list.get(ThreadLocalRandom.current().nextInt(list.size()));
	}
}
```

### UnqualifiedFieldAccess
Instance field access `list` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
		try {
			var str = IOUtils.toString(getClass().getResourceAsStream("/emoji-list.txt"), StandardCharsets.UTF_8);
			list = Arrays.asList(str.split("\\r?\\n"));
		} catch (IOException e) {
			throw new ListenerException("failed to load emoji list", e);
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		var filename = attachment.getFileName();
		
		var hashInput = "%s/%s/%s%s".formatted(msg.getChannel().getId(), attachment.getId(), filename, cfg.hashSalt);
		var hash = digest.digest(hashInput.getBytes(StandardCharsets.UTF_8));
		var test = Arrays.copyOf(hash, cfg.hashLength);
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		var hashInput = "%s/%s/%s%s".formatted(msg.getChannel().getId(), attachment.getId(), filename, cfg.hashSalt);
		var hash = digest.digest(hashInput.getBytes(StandardCharsets.UTF_8));
		var test = Arrays.copyOf(hash, cfg.hashLength);
		
		return "%s%s/%s/%s/%s".formatted(
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		
		return "%s%s/%s/%s/%s".formatted(
				cfg.baseUrl,
				base64UrlEncode(long2byte(msg.getChannel().getIdLong())),
				base64UrlEncode(long2byte(attachment.getIdLong())),
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
				base64UrlEncode(long2byte(attachment.getIdLong())),
				base64UrlEncode(filename.getBytes(StandardCharsets.UTF_8)),
				base64UrlEncode(Arrays.copyOf(hash, cfg.hashLength))
		);
	}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `from` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull FlowQuery o) {
		return from.compareTo(to);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `to` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull FlowQuery o) {
		return from.compareTo(to);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		user = json.getAsString();
		if (user == null)
			throw new SelectorException("user must be set");
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		user = json.getAsString();
		if (user == null)
			throw new SelectorException("user must be set");
	}
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.user(user).isPresent();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `parser` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
		long now = System.currentTimeMillis();
		
		List<DateGroup> parse = parser.parse(invc.arg());
		var dates = parse.stream().flatMap(in -> in.getDates().stream()).collect(Collectors.toList());
		
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	@Override
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException {
		return Map.of(Generator.DEFAULT, out);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `out` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	
	public StaticGenerator(@NonNull File file) throws IOException {
		out = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `search` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	
	public FileGenerator(@NonNull Config cfg) throws ChrislieListener.ListenerException {
		search = cfg.search;
		file = new File(cfg.file);
		
```

### UnqualifiedFieldAccess
Instance field access `file` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	public FileGenerator(@NonNull Config cfg) throws ChrislieListener.ListenerException {
		search = cfg.search;
		file = new File(cfg.file);
		
		if (!file.canRead())
```

### UnqualifiedFieldAccess
Instance field access `file` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
		file = new File(cfg.file);
		
		if (!file.canRead())
			throw new ChrislieListener.ListenerException("unable to locate file: " + file);
	}
```

### UnqualifiedFieldAccess
Instance field access `file` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
		
		if (!file.canRead())
			throw new ChrislieListener.ListenerException("unable to locate file: " + file);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `file` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
		try {
			var arg = invc.arg();
			var lines = FileUtils.readLines(file, Charsets.UTF_8);
			
			if (search && !arg.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `search` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
			var lines = FileUtils.readLines(file, Charsets.UTF_8);
			
			if (search && !arg.isEmpty()) {
				var pred = Pattern.compile(arg, Pattern.CASE_INSENSITIVE);
				lines.removeIf((item) -> !pred.matcher(item).find());
```

### UnqualifiedFieldAccess
Instance field access `substitutor` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	@Override
	public PlainOutputSubstituion appendEscapeSub(String s, Object... format) {
		appendEscape(() -> substitutor.replace(s), format);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `substitutor` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
									  StrLookup lookup) {
		super(escaper, formatResolver);
		substitutor = new StrSubstitutor(lookup);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `substitutor` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputSubstituionImpl.java`
#### Snippet
```java
	@Override
	public PlainOutputSubstituion appendSub(String s, Object... format) {
		append(() -> substitutor.replace(s), format);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		
		// register helper to keep track shutdown event
		jda.addEventListener(helper);
		if (commandUpdaterService.isRunning())
			commandUpdaterService.stopAsync().awaitTerminated();
```

### UnqualifiedFieldAccess
Instance field access `commandUpdaterService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		// register helper to keep track shutdown event
		jda.addEventListener(helper);
		if (commandUpdaterService.isRunning())
			commandUpdaterService.stopAsync().awaitTerminated();
		jda.removeEventListener(this);
```

### UnqualifiedFieldAccess
Instance field access `commandUpdaterService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		jda.addEventListener(helper);
		if (commandUpdaterService.isRunning())
			commandUpdaterService.stopAsync().awaitTerminated();
		jda.removeEventListener(this);
		jda.shutdownNow();
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		if (commandUpdaterService.isRunning())
			commandUpdaterService.stopAsync().awaitTerminated();
		jda.removeEventListener(this);
		jda.shutdownNow();
		
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			commandUpdaterService.stopAsync().awaitTerminated();
		jda.removeEventListener(this);
		jda.shutdownNow();
		
		// wait for shutdown event to occur
```

### UnqualifiedFieldAccess
Instance field access `latch` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			@SubscribeEvent
			public void onShutdown(ShutdownEvent ev) {
				latch.countDown();
			}
		};
```

### UnqualifiedFieldAccess
Instance field access `ctxResolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	private void refreshGuildCommands() {
		// need to wait for bot framework to announce resolver
		if (ctxResolver == null)
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `updateSlashCommands` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			return;
		
		if (!updateSlashCommands)
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `registeredGuilds` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			
			// there is no easy way to check which guilds need to be updated with new commands, so we simply update all
			synchronized (registeredGuilds) {
				var guilds = new ArrayList<>(jda.getGuilds()); // returned list is immutable
				guilds.removeIf(guild -> registeredGuilds.contains(guild.getIdLong()));
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			// there is no easy way to check which guilds need to be updated with new commands, so we simply update all
			synchronized (registeredGuilds) {
				var guilds = new ArrayList<>(jda.getGuilds()); // returned list is immutable
				guilds.removeIf(guild -> registeredGuilds.contains(guild.getIdLong()));
				
```

### UnqualifiedFieldAccess
Instance field access `registeredGuilds` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			synchronized (registeredGuilds) {
				var guilds = new ArrayList<>(jda.getGuilds()); // returned list is immutable
				guilds.removeIf(guild -> registeredGuilds.contains(guild.getIdLong()));
				
				for (var guild : guilds) {
```

### UnqualifiedFieldAccess
Instance field access `registeredGuilds` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
					try {
						registerCommandsOnGuild(guild);
						registeredGuilds.add(guild.getIdLong());
					} catch (ExecutionException e) {
						if (e.getCause() instanceof ErrorResponseException) {
```

### UnqualifiedFieldAccess
Instance field access `registeredGuilds` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
							if (ere.getErrorCode() == 50001) {
								log.debug("missing permission to modify slash commands on guild {}", guild);
								registeredGuilds.add(guild.getIdLong());
							}
						} else {
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Override
	public void awaitReady() throws InterruptedException {
		jda.awaitReady();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Override
	public ChrislieUser botUser() {
		return new DiscordUser(this, jda.getSelfUser());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Override
	public Optional<DiscordGuild> guild(String identifier) {
		return Optional.ofNullable(jda.getGuildById(identifier))
				.map(guild -> new DiscordGuild(this, guild));
	}
```

### UnqualifiedFieldAccess
Instance field access `sink` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@SubscribeEvent
	public void onSlashCommand(SlashCommandEvent ev) {
		if (sink == null)
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `sink` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		var slashCommand = new DiscordSlashCommandMessage(this, ev);
		
		sink.accept(slashCommand);
		
		// if invoked command is doing asynchronous processing, we need to acknowledge the message ourself
```

### UnqualifiedFieldAccess
Instance field access `ctxResolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		var chrislieGuild = new DiscordGuild(this, guild);
		
		var ctx = ctxResolver.resolve(Selector::check, chrislieGuild);
		var refs = ctx.listeners().values();
		
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	public Optional<ChrislieChannel> channel(String identifier) {
		if (identifier.startsWith(PREFIX_GUILD_CHANNEL)) {
			var channel = jda.getGuildChannelById(identifier.substring(PREFIX_GUILD_CHANNEL.length()));
			return channel == null ? Optional.empty() : Optional.of(new DiscordGuildChannel(this, (TextChannel) channel));
		}
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		}
		if (identifier.startsWith(PREFIX_PRIVATE_CHANNEL)) {
			var user = jda.getUserById(identifier.substring(PREFIX_PRIVATE_CHANNEL.length()));
			if (user == null)
				return Optional.empty();
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
				""";
		
		try (var conn = bot.sharedResources().dataSource().getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, result.getChannel().getIdLong());
			stmt.setLong(2, result.getIdLong());
```

### UnqualifiedFieldAccess
Instance field access `commandUpdaterService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		jda.addEventListener(this);
		
		commandUpdaterService = new BetterScheduledService(this::refreshGuildCommands,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, 1, TimeUnit.HOURS));
	}
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
				""";
		
		try (var conn = bot.sharedResources().dataSource().getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, msg.getChannel().getIdLong());
			stmt.setLong(2, msg.getIdLong());
```

### UnqualifiedFieldAccess
Instance field access `jda` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	@Override
	public Optional<DiscordUser> user(String identifier) {
		User user = jda.getUserById(identifier);
		return user == null ? Optional.empty() : Optional.of(new DiscordUser(this, user));
	}
```

### UnqualifiedFieldAccess
Instance field access `commandUpdaterService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		this.ctxResolver = ctxResolver;
		
		if (!commandUpdaterService.isRunning()) {
			commandUpdaterService.startAsync();
		}
```

### UnqualifiedFieldAccess
Instance field access `commandUpdaterService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		
		if (!commandUpdaterService.isRunning()) {
			commandUpdaterService.startAsync();
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `ev` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Override
	public String message() {
		return ev.getMessage().getContentRaw();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Override
	public DiscordUser user() {
		return new DiscordUser(service, ev.getAuthor());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `ev` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Override
	public DiscordUser user() {
		return new DiscordUser(service, ev.getAuthor());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
		
		switch (ev.getChannelType()) {
			case TEXT -> channel = new DiscordGuildChannel(service, ev.getTextChannel());
			case PRIVATE -> channel = new DiscordPrivateChannel(service, ev.getPrivateChannel());
			default -> throw new RuntimeException("message was sent in unkown channel type");
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
		switch (ev.getChannelType()) {
			case TEXT -> channel = new DiscordGuildChannel(service, ev.getTextChannel());
			case PRIVATE -> channel = new DiscordPrivateChannel(service, ev.getPrivateChannel());
			default -> throw new RuntimeException("message was sent in unkown channel type");
		}
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Override
	public ChrislieOutput reply(LimiterConfig limiter) {
		return channel.output(limiter, this);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, channel.getUsers().stream()).map(user -> new IrcUser(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, channel.getUsers().stream()).map(user -> new IrcUser(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, channel.getUsers().stream()).map(user -> new IrcUser(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public String displayName() {
		return channel.getName();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public List<IrcUser> users() {
		return channel.getUsers().stream()
				.map(user -> new IrcUser(service, user))
				.collect(Collectors.toList());
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	public List<IrcUser> users() {
		return channel.getUsers().stream()
				.map(user -> new IrcUser(service, user))
				.collect(Collectors.toList());
	}
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return channel.getName();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return channel.hashCode();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcUser> resolve(String callName) {
		return channel.getUser(callName)
				.map(user -> new IrcUser(service, user))
				.or(() -> user(callName));
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	public Optional<IrcUser> resolve(String callName) {
		return channel.getUser(callName)
				.map(user -> new IrcUser(service, user))
				.or(() -> user(callName));
	}
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
			return false;
		IrcChannel that = (IrcChannel) o;
		return Objects.equal(channel, that.channel);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	public String escapeNicks(String s) {
		Pattern nickPattern = Pattern.compile(
				channel.getNicknames().stream().map(Pattern::quote).collect(Collectors.joining("|")),
				Pattern.CASE_INSENSITIVE);
		return nickPattern.matcher(s).replaceAll(result -> {
```

### UnqualifiedFieldAccess
Instance field access `guild` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public Optional<IrcGuild> guild() {
		return Optional.ofNullable(guild);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	@Override
	public IrcOutput output(LimiterConfig limiterConfig) {
		return new IrcOutput(this::escapeNicks, s -> limiterConfig.send(channel, s));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `host` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		var server = builder.server();
		
		server.host(host);
		
		if (port != null)
```

### UnqualifiedFieldAccess
Instance field access `port` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		server.host(host);
		
		if (port != null)
			server.port(port, secure ? SecurityType.SECURE : SecurityType.INSECURE);
		
```

### UnqualifiedFieldAccess
Instance field access `port` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (port != null)
			server.port(port, secure ? SecurityType.SECURE : SecurityType.INSECURE);
		
		if (user != null)
```

### UnqualifiedFieldAccess
Instance field access `secure` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (port != null)
			server.port(port, secure ? SecurityType.SECURE : SecurityType.INSECURE);
		
		if (user != null)
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
			server.port(port, secure ? SecurityType.SECURE : SecurityType.INSECURE);
		
		if (user != null)
			builder.user(user);
		
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (user != null)
			builder.user(user);
		
		if (nickname != null)
```

### UnqualifiedFieldAccess
Instance field access `nickname` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
			builder.user(user);
		
		if (nickname != null)
			builder.nick(nickname);
		
```

### UnqualifiedFieldAccess
Instance field access `nickname` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (nickname != null)
			builder.nick(nickname);
		
		if (serverPassword != null)
```

### UnqualifiedFieldAccess
Instance field access `serverPassword` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
			builder.nick(nickname);
		
		if (serverPassword != null)
			server.password(serverPassword);
		
```

### UnqualifiedFieldAccess
Instance field access `serverPassword` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (serverPassword != null)
			server.password(serverPassword);
		
		if (flooding != null)
```

### UnqualifiedFieldAccess
Instance field access `flooding` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
			server.password(serverPassword);
		
		if (flooding != null)
			builder.management().messageSendingQueueSupplier(SingleDelaySender.getSupplier(flooding));
		
```

### UnqualifiedFieldAccess
Instance field access `flooding` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (flooding != null)
			builder.management().messageSendingQueueSupplier(SingleDelaySender.getSupplier(flooding));
		
		if (realname != null)
```

### UnqualifiedFieldAccess
Instance field access `realname` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
			builder.management().messageSendingQueueSupplier(SingleDelaySender.getSupplier(flooding));
		
		if (realname != null)
			builder.realName(realname);
	}
```

### UnqualifiedFieldAccess
Instance field access `realname` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		if (realname != null)
			builder.realName(realname);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `chatlog` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		// log chat messages in database
		if (chatlog)
			chatLogger(client, bot, identifier);
		
```

### UnqualifiedFieldAccess
Instance field access `guilds` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		// connect and pass to service, service should not assume client to be still disconnected, setup is done here
		client.connect();
		return new IrcService(bot, client, identifier, buildGuildMap(guilds), ignore);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `ignore` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		// connect and pass to service, service should not assume client to be still disconnected, setup is done here
		client.connect();
		return new IrcService(bot, client, identifier, buildGuildMap(guilds), ignore);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cwd` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	private final File cwd = SystemProperty.of("cwd", new File("."), File::new);
	private final File coreFile = SystemProperty.of("chrisliebot.core", new File("core.json"), f -> new File(cwd, f));
	private final File botFile = SystemProperty.of("chrisliebot.bot", new File("bot.json"), f -> new File(cwd, f));
	
	/**
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	
	public Optional<ChrislieService> service(String identifier) {
		return Optional.ofNullable(services.get(identifier));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `coreFile` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	@Override
	protected void startUp() throws Exception {
		log.info("using core config `{}` and bot config `{}`", coreFile, botFile);
		
		CoreConfig coreCfg;
```

### UnqualifiedFieldAccess
Instance field access `botFile` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	@Override
	protected void startUp() throws Exception {
		log.info("using core config `{}` and bot config `{}`", coreFile, botFile);
		
		CoreConfig coreCfg;
```

### UnqualifiedFieldAccess
Instance field access `coreFile` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		CoreConfig coreCfg;
		try (var fr = new FileReader(coreFile)) {
			coreCfg = gson.fromJson(fr, CoreConfig.class);
		} catch (IOException e) {
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		CoreConfig coreCfg;
		try (var fr = new FileReader(coreFile)) {
			coreCfg = gson.fromJson(fr, CoreConfig.class);
		} catch (IOException e) {
			throw new Exception("failed to load connection config", e);
```

### UnqualifiedFieldAccess
Instance field access `sharedResources` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// setup shared ressources as they might be required by some services
		sharedResources = new SharedResources(coreCfg.databasePool(), gson);
		sharedResources.startAsync().awaitRunning();
		
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// setup shared ressources as they might be required by some services
		sharedResources = new SharedResources(coreCfg.databasePool(), gson);
		sharedResources.startAsync().awaitRunning();
		
```

### UnqualifiedFieldAccess
Instance field access `sharedResources` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// setup shared ressources as they might be required by some services
		sharedResources = new SharedResources(coreCfg.databasePool(), gson);
		sharedResources.startAsync().awaitRunning();
		
		// bot config requires running serivces, so services go first
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			var boostrap = entry.getValue();
			try {
				services.put(name, boostrap.service(this, name));
			} catch (Exception e) {
				throw new Exception(String.format("failed to start service `%s`", name), e);
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// separate loop so services can work in parallel
		for (var entry : services.entrySet()) {
			var name = entry.getKey();
			var service = entry.getValue();
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	protected void shutDown() throws ChrisliebotException {
		// unhook services from dispatcher to stop messsage stream
		services.values().forEach(s -> s.sink(null));
		
		// shutdown dispatcher to cut listeners from message sink
```

### UnqualifiedFieldAccess
Instance field access `dispatcher` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// shutdown dispatcher to cut listeners from message sink
		try {
			dispatcher.shutdown();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		log.debug("calling stop() on listeners");
		for (var envelope : resolver.envelopes()) {
			var listener = envelope.listener();
			try {
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			try {
				log.trace("calling stop() on {}", envelope);
				listener.stop(this, resolver);
			} catch (ChrislieListener.ListenerException e) {
				throw new ChrisliebotException("failed to shut down listener: " + envelope.source(), e);
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// shut down services since no more listeners are expected to access services
		log.info("shutting down services");
		for (var service : services.values()) {
			try {
				log.debug("shutting down service: {}", service.identifier());
```

### UnqualifiedFieldAccess
Instance field access `sharedResources` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// shut down shared ressources
		try {
			sharedResources.shutDown();
		} catch (ChrisliebotException e) {
			throw new ChrisliebotException("shutdown of shared ressources failed", e);
```

### UnqualifiedFieldAccess
Instance field access `botFile` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// deserializing config
		JsonBotConfig botConfig;
		try (var fr = new FileReader(botFile)) {
			botConfig = gson.fromJson(fr, JsonBotConfig.class);
		} catch (IOException e) {
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		JsonBotConfig botConfig;
		try (var fr = new FileReader(botFile)) {
			botConfig = gson.fromJson(fr, JsonBotConfig.class);
		} catch (IOException e) {
			throw new ChrisliebotException("failed to load bot config file", e);
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		List<ScopeMapping> scopeMappings;
		try {
			scopeMappings = new ArrayList<>(botConfig.instance(gson));
		} catch (JsonBotConfig.ConfigInitializeException e) {
			throw new ChrisliebotException("unable to instance bot config", e);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// listeners are created, but not yet initialized or started since this requires a context resolver and a chrisliebot instance, so do that
		resolver = new ContextResolver(scopeMappings);
		log.info("found {} listeners, {} groups and {} mappings",
				resolver.envelopes().size(), resolver.groups().size(), resolver.mappings().size());
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		resolver = new ContextResolver(scopeMappings);
		log.info("found {} listeners, {} groups and {} mappings",
				resolver.envelopes().size(), resolver.groups().size(), resolver.mappings().size());
		
		// we also need two loops for listener startup, since the second phase requires each listener to have completed the first phase
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		resolver = new ContextResolver(scopeMappings);
		log.info("found {} listeners, {} groups and {} mappings",
				resolver.envelopes().size(), resolver.groups().size(), resolver.mappings().size());
		
		// we also need two loops for listener startup, since the second phase requires each listener to have completed the first phase
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		resolver = new ContextResolver(scopeMappings);
		log.info("found {} listeners, {} groups and {} mappings",
				resolver.envelopes().size(), resolver.groups().size(), resolver.mappings().size());
		
		// we also need two loops for listener startup, since the second phase requires each listener to have completed the first phase
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// we also need two loops for listener startup, since the second phase requires each listener to have completed the first phase
		log.debug("calling init() on listeners");
		for (var envelope : resolver.envelopes()) {
			try {
				log.trace("calling init() on {}", envelope);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			try {
				log.trace("calling init() on {}", envelope);
				envelope.listener().init(this, resolver);
			} catch (ChrislieListener.ListenerException e) {
				throw new ChrisliebotException(String.format("error in init() of listener with source `%s`", envelope.source()), e);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		}
		log.debug("calling start() on listeners");
		for (var envelope : resolver.envelopes()) {
			try {
				log.trace("calling start() on {}", envelope);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			try {
				log.trace("calling start() on {}", envelope);
				envelope.listener().start(this, resolver);
			} catch (ChrislieListener.ListenerException e) {
				throw new ChrisliebotException(String.format("error in start() of listener with source `%s`", envelope.source()), e);
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// announce the resolver that's going to be used to services for command suggestion
		services.values().forEach(s -> s.announceResolver(resolver));
		
		// create dispatcher and hook into services
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// announce the resolver that's going to be used to services for command suggestion
		services.values().forEach(s -> s.announceResolver(resolver));
		
		// create dispatcher and hook into services
```

### UnqualifiedFieldAccess
Instance field access `dispatcher` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// create dispatcher and hook into services
		dispatcher = new ChrislieDispatcher(this, resolver);
		services.values().forEach(s -> s.sink(dispatcher::dispatch));
	}
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		
		// create dispatcher and hook into services
		dispatcher = new ChrislieDispatcher(this, resolver);
		services.values().forEach(s -> s.sink(dispatcher::dispatch));
	}
```

### UnqualifiedFieldAccess
Instance field access `services` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// create dispatcher and hook into services
		dispatcher = new ChrislieDispatcher(this, resolver);
		services.values().forEach(s -> s.sink(dispatcher::dispatch));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `dispatcher` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		// create dispatcher and hook into services
		dispatcher = new ChrislieDispatcher(this, resolver);
		services.values().forEach(s -> s.sink(dispatcher::dispatch));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `managment` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	@SuppressWarnings("MethodOnlyUsedFromInnerClass")
	private void shutdownWithCode(int code) {
		synchronized (managment) {
			if (exitCode != 0) {
				// exit code may only be set once
```

### UnqualifiedFieldAccess
Instance field access `exitCode` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	private void shutdownWithCode(int code) {
		synchronized (managment) {
			if (exitCode != 0) {
				// exit code may only be set once
				return;
```

### UnqualifiedFieldAccess
Instance field access `exitCode` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
				return;
			}
			exitCode = code;
			stopAsync();
		}
```

### UnqualifiedFieldAccess
Instance field access `cwd` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	
	private final File cwd = SystemProperty.of("cwd", new File("."), File::new);
	private final File coreFile = SystemProperty.of("chrisliebot.core", new File("core.json"), f -> new File(cwd, f));
	private final File botFile = SystemProperty.of("chrisliebot.bot", new File("bot.json"), f -> new File(cwd, f));
	
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		// check if flags are causing conflict
		for (var f : flags)
			if (map.containsKey(f))
				throw new IllegalArgumentException("duplicated key: " + f + " in " + Arrays.toString(flags));
		
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		var flag = new Flag();
		for (var f : flags)
			map.put(f, flag);
		
		return flag;
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
			if (!OptionsMap.this.parsed)
				throw new NoSuchElementException("you must call parse() before accessing this value");
			return value;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		var fork = parser.fork(); // fork so we can accurately point to parsing error
		String c = fork.codepoint().consume().expect("short option name");
		var v = map.get(c);
		if (v == null)
			throw new ChrislieParser.ParserException(parser, "invalid short option `%s`".formatted(c));
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		}, true).consume().expect("long option name");
		
		var v = map.get(name);
		if (v == null)
			throw new ChrislieParser.ParserException(parser, "unkown long option name `%s`".formatted(name));
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		@Override
		public void visit(ChrislieParser parser) throws ChrislieParser.ParserException, OptionsMapException {
			if (value.isPresent())
				throw new OptionsMapException("option has already been set");
			
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
				throw new OptionsMapException("option has already been set");
			
			value = Optional.of(selector.apply(parser).consume().expect("option value"));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `selector` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
				throw new OptionsMapException("option has already been set");
			
			value = Optional.of(selector.apply(parser).consume().expect("option value"));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `parsed` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		// set parser flag to allow accessing parsed values in inner class
		parsed = true;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
			if (!OptionsMap.this.parsed)
				throw new NoSuchElementException("you must call parse() before accessing this value");
			return value;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		@Override
		public void visit(ChrislieParser parser) throws OptionsMapException {
			if (value)
				throw new OptionsMapException("flag has already been set");
			
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
				throw new OptionsMapException("flag has already been set");
			
			value = true;
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		// check if flags are causing conflict
		for (var f : options)
			if (map.containsKey(f))
				throw new IllegalArgumentException("duplicated options: " + f + " in " + Arrays.toString(options));
		
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		var option = new Option(selector);
		for (var o : options)
			map.put(o, option);
		
		return option;
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
		try {
			String sql = "INSERT INTO chatlog(timestamp, service, context, type, nickname, realname, ident, host, account, message) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			try (Connection connection = dataSource.getConnection();
				 var stmt = connection.prepareStatement(sql)) {
				
```

### UnqualifiedFieldAccess
Instance field access `identifier` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
				
				stmt.setTimestamp(1, new Timestamp(when.getTime()));
				stmt.setString(2, identifier);
				stmt.setString(3, context);
				stmt.setString(4, type.name());
```

### UnqualifiedFieldAccess
Instance field access `alias` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		
		public ChrislieDispatcher.CommandParse asParse() {
			return new ChrislieDispatcher.CommandParse(alias, args == null ? "" : args);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `args` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		
		public ChrislieDispatcher.CommandParse asParse() {
			return new ChrislieDispatcher.CommandParse(alias, args == null ? "" : args);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `args` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		
		public ChrislieDispatcher.CommandParse asParse() {
			return new ChrislieDispatcher.CommandParse(alias, args == null ? "" : args);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `config` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		for (var entry : config.entries) {
			queueRun(entry);
		}
```

### UnqualifiedFieldAccess
Instance field access `config` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		}
		
		log.info("loaded {} cron entries", config.entries.size());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `executorService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		executorService = bot.sharedResources().timer();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `config` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	private void queueRun(CronEntry entry) {
		var now = ZonedDateTime.now(config.zoneId);
		var executionTime = ExecutionTime.forCron(entry.cron);
		var maybeDuration = executionTime.timeToNextExecution(now);
```

### UnqualifiedFieldAccess
Instance field access `executorService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		log.trace("schedule execution in {} for {}", duration, entry);
		
		executorService.schedule(() -> executeCron(entry), duration.toMillis(), TimeUnit.MILLISECONDS);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `config` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		config = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	private void executeCron(CronEntry entry) {
		var maybeChannel = entry.channel.channel(bot);
		if (maybeChannel.isPresent()) {
			var channel = maybeChannel.get();
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
			var channel = maybeChannel.get();
			var message = new CronCommandMessage(channel.service().botUser(), channel, entry.msg, entry.asParse());
			bot.dispatcher().dispatch(message);
		} else {
			log.warn("unable to find channel for cron: {}", entry);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
		
		// TODO: streamline dynamic command dispatching with helper framework
		var ctx = resolver.resolve(Selector::check, msg);
		var maybeRef = ctx.alias(args[0]);
		if (maybeRef.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `parser` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect() throws ParserException {
			throw new ParserException(parser, throwable);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `throwable` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect() throws ParserException {
			throw new ParserException(parser, throwable);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public Optional<String> optional() {
			return Optional.of(value);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `parser` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect(String msg) throws ParserException {
			throw new ParserException(parser, "expected `%s` but %s".formatted(msg, throwable.getMessage()), throwable);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `throwable` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect(String msg) throws ParserException {
			throw new ParserException(parser, "expected `%s` but %s".formatted(msg, throwable.getMessage()), throwable);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `throwable` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect(String msg) throws ParserException {
			throw new ParserException(parser, "expected `%s` but %s".formatted(msg, throwable.getMessage()), throwable);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect(String msg) throws ParserException {
			return value;
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `value` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
		@Override
		public String expect() throws ParserException {
			return value;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `timestamp` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		@Override
		public int compareTo(MensaRecord o) {
			return Long.signum(timestamp - o.timestamp);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `menu` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
				reply.title("Diese Mensen kenne ich");
				var joiner = reply.description().joiner(", ");
				for (String s : menu.keySet()) {
					joiner.seperator().appendEscape(s, ChrislieFormat.HIGHLIGHT);
				}
```

### UnqualifiedFieldAccess
Instance field access `menu` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
				// mensa selection is only attempted if user is allowed to
				if (flex.isSet(FLEX_ALLOW_PICK)) {
					if (menu.containsKey(argMensaName.toLowerCase())) { // check if first argument matches valid mensa name
						mensaName = argMensaName;
						
```

### UnqualifiedFieldAccess
Instance field access `menu` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		
		// get mensa and find next matching day
		Mensa mensa = menu.get(mensaName);
		
		if (mensa == null) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	private synchronized void update() {
		try {
			String credentials = Credentials.basic(cfg.username, cfg.password);
			Call<MensaApiMeta> metaReq = service.getMeta(credentials);
			Call<JsonElement> canteensReq = service.getCanteen(credentials);
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	private synchronized void update() {
		try {
			String credentials = Credentials.basic(cfg.username, cfg.password);
			Call<MensaApiMeta> metaReq = service.getMeta(credentials);
			Call<JsonElement> canteensReq = service.getCanteen(credentials);
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		try {
			String credentials = Credentials.basic(cfg.username, cfg.password);
			Call<MensaApiMeta> metaReq = service.getMeta(credentials);
			Call<JsonElement> canteensReq = service.getCanteen(credentials);
			
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
			String credentials = Credentials.basic(cfg.username, cfg.password);
			Call<MensaApiMeta> metaReq = service.getMeta(credentials);
			Call<JsonElement> canteensReq = service.getCanteen(credentials);
			
			// no enqueue since we absolutely need to block for result
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
			
			// reads as: mensaname, timestamp, line name, meals
			Map<String, Map<Long, Map<String, List<MensaApiMeal>>>> canteen = MensaApiService.unfuck(bot.sharedResources().gson(), canteenJson);
			
			// clean up returned json and attempt to validate structure
```

### UnqualifiedFieldAccess
Instance field access `menu` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
			
			// clean up returned json and attempt to validate structure
			menu = validateAndFilter(meta, canteen);
			
			log.trace("updated mensa menu: {}", menu);
```

### UnqualifiedFieldAccess
Instance field access `menu` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
			menu = validateAndFilter(meta, canteen);
			
			log.trace("updated mensa menu: {}", menu);
			
		} catch (@SuppressWarnings("OverlyBroadCatchBlock") Throwable t) { // when dealing with mensa, we don't fuck around
```

### UnqualifiedFieldAccess
Instance field access `updateService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) {
		this.bot = bot;
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval, TimeUnit.MILLISECONDS));
		Retrofit retrofit = new Retrofit.Builder()
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		this.bot = bot;
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval, TimeUnit.MILLISECONDS));
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(MensaApiService.MENSA_BASE_URL)
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
				.addConverterFactory(bot.sharedResources().gson().factory())
				.build();
		service = retrofit.create(MensaApiService.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `updateService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	@Override
	public synchronized void start(Chrisliebot bot, ContextResolver resolver) {
		updateService.startAsync().awaitRunning();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `updateService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) {
		updateService.stopAsync().awaitTerminated();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `taggedMemes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		if (taggedMemes == null) {
			ERROR_NO_DATABASE.write(invc).send();
			return;
```

### UnqualifiedFieldAccess
Instance field access `taggedMemes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
		var query = invc.arg().trim();
		if (query.isEmpty()) {
			var set = taggedMemes.values().stream()
					.flatMap(Collection::stream)
					.collect(Collectors.toSet());
```

### UnqualifiedFieldAccess
Instance field access `taggedMemes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
		}
		
		var one = FuzzySearch.extractOne(query, taggedMemes.entrySet(), Map.Entry::getKey);
		
		if (one.getScore() <= cfg.acceptScore()) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
		var one = FuzzySearch.extractOne(query, taggedMemes.entrySet(), Map.Entry::getKey);
		
		if (one.getScore() <= cfg.acceptScore()) {
			ERROR_NO_MATCH.write(invc).send();
			return;
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	private void printResult(ChrislieOutput reply, DatabaseEntry item) {
		// until discord allows us to embed videos, we need to send the user directly to the video page
		var url = cfg.baseUrl() + "hash/" + item.hash() + "?raw=1";
		
		reply.plain().append(url);
```

### UnqualifiedFieldAccess
Instance field access `updateService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval(), TimeUnit.MILLISECONDS));
		Retrofit retrofit = new Retrofit.Builder()
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval(), TimeUnit.MILLISECONDS));
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(cfg.baseUrl())
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval(), TimeUnit.MILLISECONDS));
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(cfg.baseUrl())
				.client(bot.sharedResources().httpClient())
				.addConverterFactory(bot.sharedResources().gson().factory())
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
				.addConverterFactory(bot.sharedResources().gson().factory())
				.build();
		service = retrofit.create(MemeDbService.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `updateService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.stopAsync().awaitTerminated();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	private void update() {
		try {
			Response<List<DatabaseEntry>> response = service.getDatabase().execute();
			if (!response.isSuccessful()) {
				log.warn("request to meme database was not successfull, error code: {}", response.code());
```

### UnqualifiedFieldAccess
Instance field access `updateService` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.startAsync().awaitRunning();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		// ignore member on whitelist
		for (Role role : ev.getMember().getRoles()) {
			if (cfg.whitelist.contains(role.getIdLong())) {
				return;
			}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		boolean match;
		if (cfg.match == Match.ANY_MATCH)
			match = predicates.stream().anyMatch(p -> p.test(ev.getMessage()));
		else if (cfg.match == Match.ALL_MATCH)
```

### UnqualifiedFieldAccess
Instance field access `predicates` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		boolean match;
		if (cfg.match == Match.ANY_MATCH)
			match = predicates.stream().anyMatch(p -> p.test(ev.getMessage()));
		else if (cfg.match == Match.ALL_MATCH)
			match = predicates.stream().allMatch(p -> p.test(ev.getMessage()));
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		if (cfg.match == Match.ANY_MATCH)
			match = predicates.stream().anyMatch(p -> p.test(ev.getMessage()));
		else if (cfg.match == Match.ALL_MATCH)
			match = predicates.stream().allMatch(p -> p.test(ev.getMessage()));
		else
```

### UnqualifiedFieldAccess
Instance field access `predicates` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			match = predicates.stream().anyMatch(p -> p.test(ev.getMessage()));
		else if (cfg.match == Match.ALL_MATCH)
			match = predicates.stream().allMatch(p -> p.test(ev.getMessage()));
		else
			throw new Error("match state is not set");
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			throw new Error("match state is not set");
		
		if (match ? cfg.mode == Mode.DENY : cfg.mode == Mode.ALLOW) {
			// delete message
			message.ev().getMessage().delete().queue();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			throw new Error("match state is not set");
		
		if (match ? cfg.mode == Mode.DENY : cfg.mode == Mode.ALLOW) {
			// delete message
			message.ev().getMessage().delete().queue();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
				default -> key;
			});
			var out = (DiscordChannelOutput) cfg.output.apply(
					cfg.sendDm ?
							new DiscordChannelOutput(message.service(), ev.getAuthor().openPrivateChannel().complete())
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			});
			var out = (DiscordChannelOutput) cfg.output.apply(
					cfg.sendDm ?
							new DiscordChannelOutput(message.service(), ev.getAuthor().openPrivateChannel().complete())
							: msg.reply(), substitutor::replace);
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			var future = out.discordSend();
			
			if (cfg.deleteAfter > 0 && !cfg.sendDm) {
				// register listener to delete message afterwards
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			var future = out.discordSend();
			
			if (cfg.deleteAfter > 0 && !cfg.sendDm) {
				// register listener to delete message afterwards
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			if (cfg.deleteAfter > 0 && !cfg.sendDm) {
				// register listener to delete message afterwards
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
						() -> m.delete().queue(),
						cfg.deleteAfter, TimeUnit.MILLISECONDS));
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
						() -> m.delete().queue(),
						cfg.deleteAfter, TimeUnit.MILLISECONDS));
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `predicates` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		predicates = new ArrayList<>();
		
		if (cfg.file)
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		predicates = new ArrayList<>();
		
		if (cfg.file)
			predicates.add(message -> !message.getAttachments().isEmpty());
		
```

### UnqualifiedFieldAccess
Instance field access `predicates` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		if (cfg.file)
			predicates.add(message -> !message.getAttachments().isEmpty());
		
		if (cfg.link)
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			predicates.add(message -> !message.getAttachments().isEmpty());
		
		if (cfg.link)
			predicates.add(message -> {
				var extractor = LinkExtractor.builder().linkTypes(EnumSet.of(LinkType.URL)).build();
```

### UnqualifiedFieldAccess
Instance field access `predicates` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		if (cfg.link)
			predicates.add(message -> {
				var extractor = LinkExtractor.builder().linkTypes(EnumSet.of(LinkType.URL)).build();
				var links = extractor.extractLinks(message.getContentRaw());
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			});
		
		if (cfg.pattern != null)
			predicates.add(message -> cfg.pattern.asPredicate().test(message.getContentRaw()));
	}
```

### UnqualifiedFieldAccess
Instance field access `predicates` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		if (cfg.pattern != null)
			predicates.add(message -> cfg.pattern.asPredicate().test(message.getContentRaw()));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		if (cfg.pattern != null)
			predicates.add(message -> cfg.pattern.asPredicate().test(message.getContentRaw()));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cronDefinition` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/CronTypeAdapter.java`
#### Snippet
```java
	@Override
	public Cron read(JsonReader in) throws IOException {
		return new CronParser(cronDefinition).parse(in.nextString());
	}
}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
				.addConverterFactory(bot.sharedResources().gson().factory())
				.build();
		service = retrofit.create(UrbanDictionaryService.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
		}
		
		var call = service.lookup(term);
		call.enqueue(new Callback<>() {
			@Override
```

### UnqualifiedFieldAccess
Instance field access `flexValues` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	public Map<String, String> toFlatMap(@NonNull ChrislieListener.ListenerMessage m) throws ChrislieListener.ListenerException {
		Map<String, Object> map = new HashMap<>();
		toFlatMap(map, flexValues, m);
		return stringifyMap(map);
	}
```

### UnqualifiedFieldAccess
Instance field access `flexValues` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	public ExternalMessageTranslator withFlex(@NonNull String key) {
		flexValues.add(key);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `flexValues` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	public ExternalInvocation toObject(@NonNull ChrislieListener.Invocation invc) {
		return ExternalInvocation.of(invc, flexValues);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `flexValues` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	public ExternalInvocation toObject(@NonNull ChrislieListener.ListenerMessage m) {
		return ExternalInvocation.of(m, flexValues);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `flexValues` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	public Map<String, String> toFlatMap(@NonNull ChrislieListener.Invocation m) throws ChrislieListener.ListenerException {
		Map<String, Object> map = new HashMap<>();
		toFlatMap(map, flexValues, m);
		return stringifyMap(map);
	}
```

### UnqualifiedFieldAccess
Instance field access `operation` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	public <T> boolean checkAll(BiFunction<Selector, T, Boolean> fn, T in) {
		return switch (operation) {
			case OR -> checkAllOr(fn, in);
			case AND -> checkAllAnd(fn, in);
```

### UnqualifiedFieldAccess
Instance field access `selectors` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	public <T> boolean checkAllOr(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (fn.apply(selector, in))
				return true;
```

### UnqualifiedFieldAccess
Instance field access `selectors` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	
	public <T> boolean checkAllAnd(BiFunction<Selector, T, Boolean> fn, T in) {
		for (var selector : selectors) {
			if (!fn.apply(selector, in))
				return false;
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `urlHistory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
		
		// ignore url if seen recently in same channel
		if (urlHistory.contains(historyLookup)) {
			log.debug("ignoring recently posted url: {} in {}", url, m.msg().channel().displayName());
			return;
```

### UnqualifiedFieldAccess
Instance field access `urlHistory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
		
		// add url to history (wonky if lookup fails but who cares about shitty websites?)
		urlHistory.add(historyLookup);
		
		// TODO: enhance with multiple handlers for different domains
```

### UnqualifiedFieldAccess
Instance field access `titleHistory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
		
		// TODO: enhance with multiple handlers for different domains
		new GenericUrlPreview(url, m, titleHistory).start();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
			try {
				URL url = new URL(m.substring(link.getBeginIndex(), link.getEndIndex()));
				if (!cfg.hostBlacklist.contains(url.getHost()))
					fetchLink(msg, url);
			} catch (MalformedURLException ignore) {} // don't care about invalid links
```

### UnqualifiedFieldAccess
Instance field access `nodes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	
	public Set<Node> nodes() {
		return Collections.unmodifiableSet(nodes);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `nodes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 */
	public int nodeCount() {
		return nodes.size();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `edges` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 */
	public Map<Edge, Integer> toEdgeMap() {
		return Map.copyOf(edges);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `edges` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
		
		// check for backwards edge
		if (edges.containsKey(edge.reverse()))
			throw new IllegalGraphException("already contains reverse edge");
		
```

### UnqualifiedFieldAccess
Instance field access `edges` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
		
		if (capacity == 0)
			edges.remove(edge);
		else
			edges.put(edge, capacity);
```

### UnqualifiedFieldAccess
Instance field access `edges` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
			edges.remove(edge);
		else
			edges.put(edge, capacity);
		
		// required for node count
```

### UnqualifiedFieldAccess
Instance field access `nodes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
		
		// required for node count
		nodes.add(edge.from());
		nodes.add(edge.to());
	}
```

### UnqualifiedFieldAccess
Instance field access `nodes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
		// required for node count
		nodes.add(edge.from());
		nodes.add(edge.to());
	}
}
```

### UnqualifiedFieldAccess
Instance field access `chars` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
		Channel c = chan.channel();
		
		for (char ch : chars) {
			if (c.getModes().containsMode(ch))
				return true;
```

### UnqualifiedFieldAccess
Instance field access `nodes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowGraph.java`
#### Snippet
```java
	 */
	public boolean contains(Node node) {
		return nodes.contains(node);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `chars` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		chars = gson.fromJson(json, new TypeToken<List<Character>>() {}.getType());
		if (chars == null)
			throw new SelectorException("char list must not be null");
```

### UnqualifiedFieldAccess
Instance field access `chars` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/IrcChannelFlagSelector.java`
#### Snippet
```java
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		chars = gson.fromJson(json, new TypeToken<List<Character>>() {}.getType());
		if (chars == null)
			throw new SelectorException("char list must not be null");
	}
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Node.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull Node o) {
		return name.compareTo(o.name);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	public void onFailure(Call call, IOException e) {
		if (!e.getMessage().isEmpty())
			log.debug("failed to connect to {}: {}", url, e.getMessage());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		String contentType = response.header("Content-Type");
		if (contentType == null) {
			log.debug("no content type provided: {}", url);
			return;
		}
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		String mime = contentType.split(";")[0].trim();
		if (!"text/html".equalsIgnoreCase(mime)) {
			log.debug("can't parse content type {} for {}", mime, url);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `m` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			
			// check if summary was posted before within timeout window
			UrlPreviewListener.HistoryEntry historyLookup = new UrlPreviewListener.HistoryEntry(summary, m.msg().channel().identifier());
			if (titleHistory.contains(historyLookup)) {
				// output has been posted, don't repeat
```

### UnqualifiedFieldAccess
Instance field access `titleHistory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			// check if summary was posted before within timeout window
			UrlPreviewListener.HistoryEntry historyLookup = new UrlPreviewListener.HistoryEntry(summary, m.msg().channel().identifier());
			if (titleHistory.contains(historyLookup)) {
				// output has been posted, don't repeat
				log.debug("not posting summary of {} in {} since it's identical with a recently posted summary",
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
				// output has been posted, don't repeat
				log.debug("not posting summary of {} in {} since it's identical with a recently posted summary",
						url.toExternalForm(), m.msg().channel().displayName());
				return;
			}
```

### UnqualifiedFieldAccess
Instance field access `m` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
				// output has been posted, don't repeat
				log.debug("not posting summary of {} in {} since it's identical with a recently posted summary",
						url.toExternalForm(), m.msg().channel().displayName());
				return;
			}
```

### UnqualifiedFieldAccess
Instance field access `titleHistory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			
			// add output to history
			titleHistory.add(historyLookup);
			
			if (!summary.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `m` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
				try { // TODO: create function in ListenerMessage that can be used to unwrap exceptions and feed back to dispatcher for error handling in async code
					ChrislieOutput reply;
					reply = m.reply();
					reply.plain()
							.appendEscape("Linkvorschau: ", ChrislieFormat.BOLD)
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		
		var shared = m.bot().sharedResources();
		client = shared.httpClient();
		timer = shared.timer();
	}
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		var shared = m.bot().sharedResources();
		client = shared.httpClient();
		timer = shared.timer();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	public void start() {
		var req = new Request.Builder().get()
				.url(url)
				.header("User-Agent", "Twitterbot/1.0") // otherwise we get blocked too often :(
				.build();
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
				.header("User-Agent", "Twitterbot/1.0") // otherwise we get blocked too often :(
				.build();
		var call = client.newCall(req);
		call.enqueue(this);
		
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
		
		// queue timer for cancelation
		timer.schedule(() -> {
			
			call.cancel();
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
			call.cancel();
			if (!call.isExecuted())
				log.debug("canceled preview of {} since it took to long", url);
		}, PREVIEW_TIMEOUT, TimeUnit.MILLISECONDS);
	}
```

### UnqualifiedFieldAccess
Instance field access `runnable` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	@Override
	protected void runOneIteration() throws Exception {
		runnable.run();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `scheduler` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/BetterScheduledService.java`
#### Snippet
```java
	@Override
	protected Scheduler scheduler() {
		return scheduler;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `version` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
		
		// get or load defaults
		version = properties.getProperty("version", VERSION_UNKNOWN);
		commit = properties.getProperty("commit", VERSION_UNKNOWN);
		branch = properties.getProperty("branch", VERSION_UNKNOWN);
```

### UnqualifiedFieldAccess
Instance field access `commit` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
		// get or load defaults
		version = properties.getProperty("version", VERSION_UNKNOWN);
		commit = properties.getProperty("commit", VERSION_UNKNOWN);
		branch = properties.getProperty("branch", VERSION_UNKNOWN);
		clean = properties.getProperty("clean", VERSION_UNKNOWN);
```

### UnqualifiedFieldAccess
Instance field access `branch` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
		version = properties.getProperty("version", VERSION_UNKNOWN);
		commit = properties.getProperty("commit", VERSION_UNKNOWN);
		branch = properties.getProperty("branch", VERSION_UNKNOWN);
		clean = properties.getProperty("clean", VERSION_UNKNOWN);
		buildTime = properties.getProperty("buildTime", VERSION_UNKNOWN);
```

### UnqualifiedFieldAccess
Instance field access `clean` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
		commit = properties.getProperty("commit", VERSION_UNKNOWN);
		branch = properties.getProperty("branch", VERSION_UNKNOWN);
		clean = properties.getProperty("clean", VERSION_UNKNOWN);
		buildTime = properties.getProperty("buildTime", VERSION_UNKNOWN);
	}
```

### UnqualifiedFieldAccess
Instance field access `buildTime` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
		branch = properties.getProperty("branch", VERSION_UNKNOWN);
		clean = properties.getProperty("clean", VERSION_UNKNOWN);
		buildTime = properties.getProperty("buildTime", VERSION_UNKNOWN);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `parser` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
	@NotNull
	public OptionalToken peek() {
		return runParser(parser.fork());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `tokenParser` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
		var fork = parser.fork(); // we fork, so we can put the original position into an exception
		try {
			return OptionalToken.of(tokenParser.parse(fork));
		} catch (ChrislieParser.ParserException e) {
			return OptionalToken.empty(e, fork);
```

### UnqualifiedFieldAccess
Instance field access `parser` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
	@NotNull
	public OptionalToken consume() {
		var fork = parser.fork();
		var token = runParser(fork);
		
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Override
	public Optional<DiscordPrivateChannel> directMessage() {
		var future = user.openPrivateChannel().submit();
		try {
			var channel = future.get();
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
		try {
			var channel = future.get();
			return Optional.of(new DiscordPrivateChannel(service, channel));
		} catch (InterruptedException ignore) {
			Thread.currentThread().interrupt();
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Override
	public String mention() {
		return user.getAsMention();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
			return false;
		DiscordUser that = (DiscordUser) o;
		return user.equals(that.user);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return user.getId();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return user.hashCode();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Override
	public String displayName() {
		return user.getName();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `guild` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	@Override
	public String displayName() {
		return guild.getName();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `guild` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return guild.getId();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `guild` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	@Override
	public Collection<DiscordGuildChannel> channels() {
		return guild.getTextChannels().stream()
				.map(channel -> new DiscordGuildChannel(service, channel))
				.collect(Collectors.toList());
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuild.java`
#### Snippet
```java
	public Collection<DiscordGuildChannel> channels() {
		return guild.getTextChannels().stream()
				.map(channel -> new DiscordGuildChannel(service, channel))
				.collect(Collectors.toList());
	}
```

### UnqualifiedFieldAccess
Instance field access `path` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
	public String send(String content) throws IOException {
		var uuid = UUID.randomUUID();
		var file = new File(path, uuid + ".txt");
		FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8);
		return generator.replace("${file}", file.getName());
```

### UnqualifiedFieldAccess
Instance field access `generator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
		var file = new File(path, uuid + ".txt");
		FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8);
		return generator.replace("${file}", file.getName());
	}
}
```

### UnqualifiedFieldAccess
Instance field access `authorIcon` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput authorIcon(String url) {
		authorIcon = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorIcon(String url) {
		authorIcon = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorName` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorIcon(String url) {
		authorIcon = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorIcon(String url) {
		authorIcon = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorIcon` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorIcon(String url) {
		authorIcon = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput title(String title, String url) {
		embedBuilder.setTitle(title, url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput authorUrl(String url) {
		authorUrl = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorUrl(String url) {
		authorUrl = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorName` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorUrl(String url) {
		authorUrl = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorUrl(String url) {
		authorUrl = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorIcon` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput authorUrl(String url) {
		authorUrl = url;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `colorSet` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput color(Color color) {
		colorSet = true;
		embedBuilder.setColor(color);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput color(Color color) {
		colorSet = true;
		embedBuilder.setColor(color);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `colorSet` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput color(int color) {
		colorSet = true;
		embedBuilder.setColor(color);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput color(int color) {
		colorSet = true;
		embedBuilder.setColor(color);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorName` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput author(String name) {
		authorName = name;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput author(String name) {
		authorName = name;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorName` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput author(String name) {
		authorName = name;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput author(String name) {
		authorName = name;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `authorIcon` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput author(String name) {
		authorName = name;
		embedBuilder.setAuthor(authorName, authorUrl, authorIcon);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		 */
		public Message noUpload() {
			return prepare(embedBuilder);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput thumbnail(String url) {
		embedBuilder.setThumbnail(url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public PlainOutput plain() {
		return plain;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput field(String field, String value, boolean inline) {
		embedBuilder.addField(field, value, inline);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `imageUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	public AbstractDiscordOutput image(String url) {
		try {
			imageUrl = new URL(url);
			embedBuilder.setImage(url);
		} catch (MalformedURLException e) {
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		try {
			imageUrl = new URL(url);
			embedBuilder.setImage(url);
		} catch (MalformedURLException e) {
			log.warn("malformed url for embed image", e);
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		public SinkMessageData canUpload(OkHttpClient okHttpClient) {
			// copy embed builder since we are potentially changing image
			var localEmbedBuilder = new EmbedBuilder(embedBuilder);
			
			var files = new ArrayList<SinkMessageData.UploadFile>();
```

### UnqualifiedFieldAccess
Instance field access `imageUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			
			var files = new ArrayList<SinkMessageData.UploadFile>();
			if (imageUrl != null) {
				// check if we can derive a file name for this url
				var filePath = Path.of(imageUrl.getPath());
```

### UnqualifiedFieldAccess
Instance field access `imageUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			if (imageUrl != null) {
				// check if we can derive a file name for this url
				var filePath = Path.of(imageUrl.getPath());
				var file = filePath.getFileName();
				if (file != null) {
```

### UnqualifiedFieldAccess
Instance field access `imageUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
					if (EMBED_SUPPORTED_IMAGE_ENDINGS.test(filename)) {
						// TODO: when supporting multiple files, generate random file names to avoid clashes
						files.add(new SinkMessageData.UploadFile(okHttpClient, filename, imageUrl));
						
						localEmbedBuilder.setImage("attachment://" + filename); // update embed file name
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
		
		private Message prepare(EmbedBuilder localEmbedBuilder) {
			localEmbedBuilder.setDescription(description.string());
			MessageBuilder mb = new MessageBuilder();
			
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			// block all mentions by default and apply collected mention rules from output instance
			mb.setAllowedMentions(List.of());
			plain.applyMentionRules(mb);
			
			if (!localEmbedBuilder.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `colorSet` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
				
				// jda considers embed non-empty if color has been set
				if (!colorSet)
					stackTraceColor.ifPresent(localEmbedBuilder::setColor);
				
```

### UnqualifiedFieldAccess
Instance field access `stackTraceColor` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
				// jda considers embed non-empty if color has been set
				if (!colorSet)
					stackTraceColor.ifPresent(localEmbedBuilder::setColor);
				
				mb.setEmbed(localEmbedBuilder.build());
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			}
			
			mb.append(plain.string());
			return mb.build();
		}
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			 */
			public byte[] download() throws IOException {
				return C.downloadFile(client, url);
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
			 */
			public byte[] download() throws IOException {
				return C.downloadFile(client, url);
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `embedBuilder` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public AbstractDiscordOutput footer(String text, String iconUrl) {
		embedBuilder.setFooter(text, iconUrl);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/AbstractDiscordOutput.java`
#### Snippet
```java
	@Override
	public @NonNull PlainOutput description() {
		return description;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public String displayName() {return channel.getName();}
	
	@Override
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public MessageChannel messageChannel() {
		return channel;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	
	@Override
	public boolean isNSFW() {return channel.isNSFW();}
	
	@Override
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public boolean canTalk() {
		return channel.canTalk();
	}
}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public Optional<DiscordGuild> guild() {
		return Optional.of(new DiscordGuild(service, channel.getGuild()));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public Optional<DiscordGuild> guild() {
		return Optional.of(new DiscordGuild(service, channel.getGuild()));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public String mention() {
		return channel.getAsMention();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return DiscordService.PREFIX_GUILD_CHANNEL + channel.getId();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Override
	public List<DiscordUser> users() {
		return channel.getMembers().stream()
				.map(member -> new DiscordUser(service, member.getUser()))
				.collect(Collectors.toList());
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	public List<DiscordUser> users() {
		return channel.getMembers().stream()
				.map(member -> new DiscordUser(service, member.getUser()))
				.collect(Collectors.toList());
	}
```

### UnqualifiedFieldAccess
Instance field access `mentionsTransformers` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	public DiscordPlainOutput append(String s, Object... format) {
		if (EVERYONE.getPattern().matcher(s).find())
			mentionsTransformers.add(mb -> mb.allowMentions(EVERYONE));
		
		if (HERE.getPattern().matcher(s).find())
```

### UnqualifiedFieldAccess
Instance field access `mentionsTransformers` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
		
		if (HERE.getPattern().matcher(s).find())
			mentionsTransformers.add(mb -> mb.allowMentions(HERE));
		
		addMention(s, USER.getPattern(), id -> mentionsTransformers.add(mb -> mb.mentionUsers(id)));
```

### UnqualifiedFieldAccess
Instance field access `mentionsTransformers` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
			mentionsTransformers.add(mb -> mb.allowMentions(HERE));
		
		addMention(s, USER.getPattern(), id -> mentionsTransformers.add(mb -> mb.mentionUsers(id)));
		addMention(s, ROLE.getPattern(), id -> mentionsTransformers.add(mb -> mb.mentionRoles(id)));
		
```

### UnqualifiedFieldAccess
Instance field access `mentionsTransformers` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
		
		addMention(s, USER.getPattern(), id -> mentionsTransformers.add(mb -> mb.mentionUsers(id)));
		addMention(s, ROLE.getPattern(), id -> mentionsTransformers.add(mb -> mb.mentionRoles(id)));
		
		super.append(s, format);
```

### UnqualifiedFieldAccess
Instance field access `mentionsTransformers` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPlainOutput.java`
#### Snippet
```java
	 */
	public void applyMentionRules(MessageBuilder mb) {
		mentionsTransformers.forEach(t -> t.accept(mb));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `edges` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
	
	public long maxFlow(FlowQuery query) {
		var flowState = new HashMap<>(edges);
		
		long maxFlow = 0;
```

### UnqualifiedFieldAccess
Instance field access `token` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
	@Override
	public DiscordService service(Chrisliebot bot, String identifier) throws LoginException {
		var jda = JDABuilder.create(token, GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS))
				.setEventManager(new AnnotatedEventManager())
				.setActivity(Activity.playing("mit dir"))
```

### UnqualifiedFieldAccess
Instance field access `updateSlashCommands` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
				.setActivity(Activity.playing("mit dir"))
				.build();
		return new DiscordService(bot, jda, identifier, updateSlashCommands);
	}
}
```

### UnqualifiedFieldAccess
Instance field access `channels` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	@Override
	public Collection<IrcChannel> channels() {
		return channels.stream()
				.map(channel -> new IrcChannel(service, channel, this))
				.collect(Collectors.toList());
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	public Collection<IrcChannel> channels() {
		return channels.stream()
				.map(channel -> new IrcChannel(service, channel, this))
				.collect(Collectors.toList());
	}
```

### UnqualifiedFieldAccess
Instance field access `identifier` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	@Override
	public String displayName() {
		return identifier;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `source` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
		this.service = service;
		this.channel = channel;
		source = null;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
			
			// TODO: make this configurable via flex config
			if (channel instanceof TextChannel) {
				
				// check if we can upload files
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				
				// check if we can upload files
				var textChannel = (TextChannel) channel;
				var selfMember = textChannel.getGuild().getMember(textChannel.getJDA().getSelfUser());
				canUpload = selfMember.hasPermission(textChannel, Permission.MESSAGE_ATTACH_FILES);
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
					// inform user that we are processing request
					try {
						channel.sendTyping().submit().get(200, TimeUnit.MILLISECONDS); // attempt to wait for short period to reduce bugged typing states
					} catch (InterruptedException | ExecutionException | TimeoutException ignore) {
					}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
					}
					
					var sinkData = message.canUpload(service.bot().sharedResources().httpClient());
					var messageAction = channel.sendMessage(sinkData.message());
					
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
					
					var sinkData = message.canUpload(service.bot().sharedResources().httpClient());
					var messageAction = channel.sendMessage(sinkData.message());
					
					for (var file : sinkData.files()) {
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
			// there is sadly no way to know why restAction has not been populated yet, but if it isn't then we fall back to simple message
			if (restAction == null) {
				restAction = channel.sendMessage(message.noUpload());
			}
			
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
			
			// second special handling for text channels ?\_(?)_/?
			if (channel instanceof TextChannel) {
				var textChannel = (TextChannel) channel;
				if (textChannel.isNews()) {
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
			// second special handling for text channels ?\_(?)_/?
			if (channel instanceof TextChannel) {
				var textChannel = (TextChannel) channel;
				if (textChannel.isNews()) {
					restAction = restAction.flatMap(Message::crosspost);
```

### UnqualifiedFieldAccess
Instance field access `source` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				
				// link send message with source message in database
				if (source != null) {
					source.service().traceMessage(source.ev().getMessage(), m);
				}
```

### UnqualifiedFieldAccess
Instance field access `source` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				// link send message with source message in database
				if (source != null) {
					source.service().traceMessage(source.ev().getMessage(), m);
				}
			});
```

### UnqualifiedFieldAccess
Instance field access `source` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
				// link send message with source message in database
				if (source != null) {
					source.service().traceMessage(source.ev().getMessage(), m);
				}
			});
```

### UnqualifiedFieldAccess
Instance field access `permissions` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
				return false;
			
			for (var perm : permissions)
				if (!member.hasPermission(perm))
					return false;
```

### UnqualifiedFieldAccess
Instance field access `permissions` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/DiscordPermissionSelector.java`
#### Snippet
```java
	@SuppressWarnings("EmptyClass")
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		permissions = gson.fromJson(json, new TypeToken<Set<Permission>>(){}.getType());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private void deleteTimerRecord(long id) {
		String sql = "UPDATE timer SET deleted = TRUE WHERE id = ?";
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, id);
			stmt.execute();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	@Override
	public synchronized void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `runtimeTimer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 */
	private synchronized boolean removeRuntime(long id) {
		var rt = runtimeTimer.remove(id);
		if (rt != null) {
			rt.future.cancel(false);
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		List<TimerInfo> timers = new ArrayList<>();
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, cfg.prefetchWindow / 1000);
			
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, cfg.prefetchWindow / 1000);
			
			try (var rs = stmt.executeQuery()) {
```

### UnqualifiedFieldAccess
Instance field access `runtimeTimer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		// convert new timers into runtime timers
		timers.removeIf(timerInfo -> runtimeTimer.containsKey(timerInfo.id));
		
		log.trace("found {} new runtime timers", timers.size());
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		}
		
		timer.scheduleWithFixedDelay(() -> {
			try {
				refreshRuntimeTimer();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				log.warn("failed to refresh timers from database", e);
			}
		}, 0, cfg.prefetchInterval, TimeUnit.MILLISECONDS);
		timer.scheduleWithFixedDelay(this::purgeExpired, 0, PURGE_INTERVAL, TimeUnit.MILLISECONDS);
	}
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			}
		}, 0, cfg.prefetchInterval, TimeUnit.MILLISECONDS);
		timer.scheduleWithFixedDelay(this::purgeExpired, 0, PURGE_INTERVAL, TimeUnit.MILLISECONDS);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		// if shutdown, timer will survive until reboot
		if (shutdown)
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			return;
		
		var maybeService = bot.service(timerInfo.service);
		if (maybeService.isEmpty()) {
			log.debug("service unknown, failed to deliver timer {}", timerInfo);
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		}
		var channel = maybeChannel.get();
		var maybeRef = resolver.resolve(Selector::check, channel).listener(this);
		
		if (maybeRef.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		}
		
		try (var conn = dataSource.getConnection()) {
			var maybeTimerInfo = getTimerFromDb(conn, id).filter(accessPredicate(invc.msg()));
			if (maybeTimerInfo.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		List<TimerInfo> timerList = new ArrayList<>();
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, invc.service().identifier());
			stmt.setString(2, invc.msg().user().identifier());
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		for (var timer : timerList) {
			var id = encodeTimer(timer.id);
			var abbrev = StringUtils.abbreviate(timer.text, cfg.abbrevLength);
			
			joiner.seperator().appendEscape(id, ChrislieFormat.BOLD).appendEscape(": ").appendEscape(abbrev);
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var duration = C.format(wtf);
		
		Optional<ChrislieService> service = bot.service(timerInfo.service);
		Optional<ChrislieUser> user = service.flatMap(s -> s.user(timerInfo.user));
		Optional<ChrislieChannel> channel = service.flatMap(s -> s.channel(timerInfo.channel));
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		long id = decodeTimer(arg);
		
		try (var conn = dataSource.getConnection()) {
			// we just fetch the timer and check if the user is allowed to change it, easier then checking inside the query
			var maybeTimerInfo = getTimerFromDb(conn, id).filter(accessPredicate(invc.msg()));
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var delay = Math.max(0, diff.toMillis());
		
		var task = timer.schedule(() -> {
			try {
				timerDue(timerInfo);
```

### UnqualifiedFieldAccess
Instance field access `runtimeTimer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		
		runtimeTimer.put(timerInfo.id, new ScheduledTimer(timerInfo, task));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			
			int i = 1;
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		long id = decodeTimer(arg);
		
		try (var conn = dataSource.getConnection()) {
			var maybeTimerInfo = getTimerFromDb(conn, id).filter(accessPredicate(invc.msg()));
			if (maybeTimerInfo.isEmpty() || maybeTimerInfo.get().deleted) {
```

### UnqualifiedFieldAccess
Instance field access `snooze` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		private Instant nextDue() {
			return Objects.requireNonNullElse(snooze, due);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `due` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		private Instant nextDue() {
			return Objects.requireNonNullElse(snooze, due);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		shutdown = true;
		
		runtimeTimer.values().forEach(t -> t.future.cancel(false));
```

### UnqualifiedFieldAccess
Instance field access `runtimeTimer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		shutdown = true;
		
		runtimeTimer.values().forEach(t -> t.future.cancel(false));
		runtimeTimer.clear(); // clear map so we don't get confused in case we need to debug anything
	}
```

### UnqualifiedFieldAccess
Instance field access `runtimeTimer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		runtimeTimer.values().forEach(t -> t.future.cancel(false));
		runtimeTimer.clear(); // clear map so we don't get confused in case we need to debug anything
	}
	
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		String sql = "DELETE FROM timer WHERE TIMESTAMPDIFF(SECOND, COALESCE(snooze, due), NOW()) > ?";
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, cfg.expire / 1000);
			
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, cfg.expire / 1000);
			
			var deleted = stmt.executeLargeUpdate();
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var id = decodeTimer(arg);
		
		try (var conn = dataSource.getConnection()) {
			var maybeTimerInfo = getTimerFromDb(conn, id).filter(accessPredicate(invc.msg()));
			if (maybeTimerInfo.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `calls` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	@Override
	public PlainOutput clear() {
		calls.clear();
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `calls` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	protected void appendEscape(Supplier<String> supplier, Object... formats) {
		calls.add(() -> applyFormats(escaper.apply(supplier.get()), formats));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `escaper` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	protected void appendEscape(Supplier<String> supplier, Object... formats) {
		calls.add(() -> applyFormats(escaper.apply(supplier.get()), formats));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `calls` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	@Override
	public PlainOutput newLine() {
		calls.add(() -> "\n");
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `calls` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	@CheckReturnValue
	public String string() {
		return calls.stream()
				.map(Supplier::get)
				.collect(Collectors.joining());
```

### UnqualifiedFieldAccess
Instance field access `formatResolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private String applyFormats(String s, Object... formats) {
		for (Object format : formats) {
			s = formatResolver.apply(format, s);
		}
		return s;
```

### UnqualifiedFieldAccess
Instance field access `calls` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	protected void append(Supplier<String> supplier, Object... formats) {
		calls.add(() -> applyFormats(supplier.get(), formats));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			
			// prepare context for output generation
			var maybeChannel = cfg.channel.channel(bot);
			if (maybeChannel.isEmpty()) {
				log.warn("unable to resolve channel for subreddit: {}", cfg.subreddit);
```

### UnqualifiedFieldAccess
Instance field access `bot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			
			// prepare context for output generation
			var maybeChannel = cfg.channel.channel(bot);
			if (maybeChannel.isEmpty()) {
				log.warn("unable to resolve channel for subreddit: {}", cfg.subreddit);
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			var maybeChannel = cfg.channel.channel(bot);
			if (maybeChannel.isEmpty()) {
				log.warn("unable to resolve channel for subreddit: {}", cfg.subreddit);
				return;
			}
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			}
			
			var ctx = resolver.resolve(Selector::check, maybeChannel.get());
			var maybeRef = ctx.listener(this);
			if (maybeRef.isEmpty()) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			var maybeRef = ctx.listener(this);
			if (maybeRef.isEmpty()) {
				log.warn("listener not present in channel for subreddit: {}", cfg.subreddit);
				return;
			}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			
		} catch (Exception e) {
			log.warn("failed to feed feed for subreddit: {}", cfg.subreddit, e);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
				.addConverterFactory(bot.sharedResources().gson().factory())
				.build();
		service = retrofit.create(RedditService.class);
		
		feedUpdate = new BetterScheduledService(this::poll,
```

### UnqualifiedFieldAccess
Instance field access `feedUpdate` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		service = retrofit.create(RedditService.class);
		
		feedUpdate = new BetterScheduledService(this::poll,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.delay, TimeUnit.MILLISECONDS));
	}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		feedUpdate = new BetterScheduledService(this::poll,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.delay, TimeUnit.MILLISECONDS));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `feedUpdate` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		}
		
		feedUpdate.startAsync().awaitRunning();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		}
		
		out.footer("r/" + cfg.subreddit);
		out.color(REDDIT_COLOR);
	}
```

### UnqualifiedFieldAccess
Instance field access `feedUpdate` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		feedUpdate.stopAsync().awaitTerminated();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	private SubredditListing fetch() throws IOException {
		var call = service.getFeed(cfg.subreddit);
		
		var resp = call.execute();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	private SubredditListing fetch() throws IOException {
		var call = service.getFeed(cfg.subreddit);
		
		var resp = call.execute();
```

### UnqualifiedFieldAccess
Instance field access `lastTimestamp` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		// remove older entries
		feed.data().children().removeIf(c -> c.data().createdUtc() <= lastTimestamp);
		
		// update last timestamp
```

### UnqualifiedFieldAccess
Instance field access `lastTimestamp` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		if (feed.data().children() != null) {
			for (var child : feed.data().children()) {
				lastTimestamp = Math.max(child.data().createdUtc(), lastTimestamp);
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `lastTimestamp` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		if (feed.data().children() != null) {
			for (var child : feed.data().children()) {
				lastTimestamp = Math.max(child.data().createdUtc(), lastTimestamp);
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			}
		}
		log.trace("most recent timestamp for feed {}: {}", cfg.subreddit, lastTimestamp);
		
		return feed;
```

### UnqualifiedFieldAccess
Instance field access `lastTimestamp` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			}
		}
		log.trace("most recent timestamp for feed {}: {}", cfg.subreddit, lastTimestamp);
		
		return feed;
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	public boolean check(ChrislieMessage message) {
		var isOtherGuild = message.channel().guild()
				.map(g -> !g.identifier().equals(cfg.guild)) // true if mismatch => other guild
				.orElse(false);
		
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
		
		// other guilds requires opt int
		if (isOtherGuild && !cfg.includeOthers)
			return false;
		
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	@Override
	public void fromJson(GsonValidator gson, JsonElement json) throws SelectorException {
		cfg = Objects.requireNonNull(gson.fromJson(json, Config.class), "config is null");
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieUser user) {
		var guild = user.service().guild(cfg.guild);
		return guild.map(g -> g.users().contains(user)).orElse(false);
	}
```

### UnqualifiedFieldAccess
Instance field access `guildMap` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	public Optional<IrcGuild> guild(String identifier) {
		
		var patterns = guildMap.get(identifier);
		if (patterns == null)
			return Optional.empty();
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
				.reduce(Predicate::or).orElse(s -> false); // if no regex is given, we still instance the guild with no channels
		
		var channels = client.getChannels().stream()
				.filter(channel -> pred.test(channel.getName()))
				.collect(Collectors.toList());
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Override
	public ChrislieUser botUser() {
		return new IrcUser(this, client.getUser().orElseThrow());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `guildMap` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	protected Optional<IrcGuild> channelToGuild(Channel channel) {
		var channelName = channel.getName();
		for (var e : guildMap.asMap().entrySet()) {
			var name = e.getKey();
			for (var pattern : e.getValue()) {
```

### UnqualifiedFieldAccess
Instance field access `ignore` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Handler
	public void onChannelMessage(ChannelMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Handler
	public void onChannelMessage(ChannelMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	public void exit() {
		// TODO: actually wait for full shutdown
		client.getEventManager().unregisterEventListener(this);
		client.shutdown();
	}
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		// TODO: actually wait for full shutdown
		client.getEventManager().unregisterEventListener(this);
		client.shutdown();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Override
	public void reconnect() {
		client.reconnect();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	public Optional<? extends ChrislieChannel> channel(String identifier) {
		
		var prefixes = client.getServerInfo().getChannelPrefixes();
		var isChannel = prefixes.stream()
				.anyMatch(p -> identifier.startsWith(String.valueOf(p)));
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		
		if (isChannel) {
			return client.getChannel(identifier)
					.map(channel -> {
						var guildIdentifier = channelToGuild(channel);
```

### UnqualifiedFieldAccess
Instance field access `ignore` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Handler
	public void onPrivateMessage(PrivateMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Handler
	public void onPrivateMessage(PrivateMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
		
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	protected Optional<User> userByPrefixedIdentifier(String prefixedIdentifier) {
		// creates a stream of all users known to this instance
		var userStream = client.getChannels().stream()
				.map(Channel::getUsers)
				.flatMap(Collection::stream);
```

### UnqualifiedFieldAccess
Instance field access `client` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Override
	public void awaitReady() throws Exception {
		client.getEventManager().registerEventListener(this);
		
		// TODO: check if and how we can ensure we are somewhat ready for connections
```

### UnqualifiedFieldAccess
Instance field access `identifier` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
		if (ev.canAttemptReconnect()) {
			ev.getCause().ifPresentOrElse(
					e -> log.info("service {} lost connection, attempting reconnect", identifier, e),
					() -> log.info("service {} lost connection witout cause", identifier)
			);
```

### UnqualifiedFieldAccess
Instance field access `identifier` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
			ev.getCause().ifPresentOrElse(
					e -> log.info("service {} lost connection, attempting reconnect", identifier, e),
					() -> log.info("service {} lost connection witout cause", identifier)
			);
			
```

### UnqualifiedFieldAccess
Instance field access `msg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		@Override
		public ChrislieService service() {
			return msg.service();
		}
		
```

### UnqualifiedFieldAccess
Instance field access `msg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		@CheckReturnValue
		public ChrislieOutput reply() throws ListenerException {
			return msg.reply(LimiterConfig.of(ref().flexConf()));
		}
		
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput thumbnail(String url) {
		map.put("thumbnailUrl", url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput title(String title, String url) {
		map.put("title", title);
		map.put("titleUrl", url);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	public IrcOutput title(String title, String url) {
		map.put("title", title);
		map.put("titleUrl", url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `fields` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput field(String field, String value, boolean inline) {
		fields.put(field, value);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput authorIcon(String url) {
		map.put("authorIcon", url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput author(String name) {
		map.put("author", name);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `sink` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public void send() {
		sink.accept(converter.get());
	}
}
```

### UnqualifiedFieldAccess
Instance field access `converter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public void send() {
		sink.accept(converter.get());
	}
}
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public PlainOutput description() {
		return description;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `escaper` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public PlainOutput replace() {
		PlainOutputImpl output = new PlainOutputImpl(escaper, IrcFormatter::format);
		converter = output::string;
		return output;
```

### UnqualifiedFieldAccess
Instance field access `converter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	public PlainOutput replace() {
		PlainOutputImpl output = new PlainOutputImpl(escaper, IrcFormatter::format);
		converter = output::string;
		return output;
	}
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput authorUrl(String url) {
		map.put("authorUrl", url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
		this.escaper = escaper;
		this.sink = sink;
		plain = new PlainOutputImpl(escaper, IrcFormatter::format);
		description = new PlainOutputImpl(escaper, IrcFormatter::format);
	}
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
		this.sink = sink;
		plain = new PlainOutputImpl(escaper, IrcFormatter::format);
		description = new PlainOutputImpl(escaper, IrcFormatter::format);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
		public String get() {
			String out = "";
			var title = map.get("title");
			if (title != null && !title.isBlank()) {
				out += title;
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
			}
			
			var descriptionStr = description.string();
			if (!descriptionStr.isBlank()) {
				
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
			// fall back to plain text if empty
			if (out.isEmpty())
				out = plain.string();
			
			return out;
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput image(String url) {
		map.put("imageUrl", url);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `escaper` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	public PlainOutputSubstituion convert() {
		// swap strategy to using this output with substitutions from gathered method calls
		PlainOutputSubstituionImpl substitution = new PlainOutputSubstituionImpl(escaper, IrcFormatter::format, new StrLookup() {
			@Override
			public String lookup(String key) {
```

### UnqualifiedFieldAccess
Instance field access `converter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
			}
		});
		converter = substitution::string;
		return substitution;
	}
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public @NotNull PlainOutput plain() {
		return plain;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
				String out = "MISSING_KEY(" + key + ")";
				switch (key) {
					case "plain" -> out = plain.string();
					case "description" -> out = description.string();
					default -> out = key.startsWith("f-") ? fields.getOrDefault(key.substring(2), out) : map.getOrDefault(key, out);
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
				switch (key) {
					case "plain" -> out = plain.string();
					case "description" -> out = description.string();
					default -> out = key.startsWith("f-") ? fields.getOrDefault(key.substring(2), out) : map.getOrDefault(key, out);
				}
```

### UnqualifiedFieldAccess
Instance field access `fields` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
					case "plain" -> out = plain.string();
					case "description" -> out = description.string();
					default -> out = key.startsWith("f-") ? fields.getOrDefault(key.substring(2), out) : map.getOrDefault(key, out);
				}
				return C.escapeStrSubstitution(out);
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
					case "plain" -> out = plain.string();
					case "description" -> out = description.string();
					default -> out = key.startsWith("f-") ? fields.getOrDefault(key.substring(2), out) : map.getOrDefault(key, out);
				}
				return C.escapeStrSubstitution(out);
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	@Override
	public IrcOutput footer(String text, String iconUrl) {
		map.put("footerText", text);
		map.put("footerIconUrl", iconUrl);
		return this;
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	public IrcOutput footer(String text, String iconUrl) {
		map.put("footerText", text);
		map.put("footerIconUrl", iconUrl);
		return this;
	}
```

### UnqualifiedFieldAccess
Instance field access `parse` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	@Override
	public Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.of(parse);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
		
		switch (ev.getChannelType()) {
			case TEXT -> channel = new DiscordGuildChannel(service, ev.getTextChannel());
			case PRIVATE -> channel = new DiscordPrivateChannel(service, ev.getPrivateChannel());
			default -> throw new RuntimeException("message was sent in unkown channel type");
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
		switch (ev.getChannelType()) {
			case TEXT -> channel = new DiscordGuildChannel(service, ev.getTextChannel());
			case PRIVATE -> channel = new DiscordPrivateChannel(service, ev.getPrivateChannel());
			default -> throw new RuntimeException("message was sent in unkown channel type");
		}
```

### UnqualifiedFieldAccess
Instance field access `parse` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
		
		var arg = ev.getOption(DiscordService.SLASH_COMMAND_ARG_NAME);
		parse = new ChrislieDispatcher.CommandParse(ev.getName(), arg == null ? "" : arg.getAsString());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `isError` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
			@Override
			public void markAsError() {
				isError = true;
			}
			
```

### UnqualifiedFieldAccess
Instance field access `ev` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
			protected CompletableFuture<Message> sink(SinkMessage message) {
				// file uploads my cause delays, so we have to ack message in all cases
				if (!ev.isAcknowledged()) {
					ev.deferReply(isError).queue();
				}
```

### UnqualifiedFieldAccess
Instance field access `ev` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
				// file uploads my cause delays, so we have to ack message in all cases
				if (!ev.isAcknowledged()) {
					ev.deferReply(isError).queue();
				}
				var hook = ev.getHook();
```

### UnqualifiedFieldAccess
Instance field access `isError` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
				// file uploads my cause delays, so we have to ack message in all cases
				if (!ev.isAcknowledged()) {
					ev.deferReply(isError).queue();
				}
				var hook = ev.getHook();
```

### UnqualifiedFieldAccess
Instance field access `ev` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
					ev.deferReply(isError).queue();
				}
				var hook = ev.getHook();
				
				// now we can pull files for upload (slash commands are always allowed to upload files)
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
				
				// now we can pull files for upload (slash commands are always allowed to upload files)
				var sinkData = message.canUpload(service.bot().sharedResources().httpClient());
				var restAction = hook.sendMessage(sinkData.message()).setEphemeral(isError);
				try {
```

### UnqualifiedFieldAccess
Instance field access `isError` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
				// now we can pull files for upload (slash commands are always allowed to upload files)
				var sinkData = message.canUpload(service.bot().sharedResources().httpClient());
				var restAction = hook.sendMessage(sinkData.message()).setEphemeral(isError);
				try {
					for (var file : sinkData.files()) {
```

### UnqualifiedFieldAccess
Instance field access `isError` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
				} catch (IOException e) {
					log.warn("failed to upload attachments, falling back to regular message", e);
					restAction = hook.sendMessage(message.noUpload()).setEphemeral(isError);
				}
				
```

### UnqualifiedFieldAccess
Instance field access `parse` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	@Override
	public String message() {
		return parse.args();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	@Override
	public DiscordUser user() {
		return new DiscordUser(service, ev.getUser());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `ev` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	@Override
	public DiscordUser user() {
		return new DiscordUser(service, ev.getUser());
	}
	
```

### UnqualifiedFieldAccess
Instance field access `messageId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	
	public OffsetDateTime toInstant() {
		return TimeUtil.getTimeCreated(messageId);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `guildId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	
	public Optional<Guild> guild(JDA jda) {
		return Optional.ofNullable(jda.getGuildById(guildId));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `userId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	
	public Optional<User> user(JDA jda) {
		return Optional.ofNullable(jda.getUserById(userId));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `guildId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	
	private TraceMessageSource(ResultSet rs) throws SQLException {
		guildId = rs.getLong("sourceGuildId");
		channelId = rs.getLong("sourceChannelId");
		messageId = rs.getLong("sourceMessageId");
```

### UnqualifiedFieldAccess
Instance field access `channelId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	private TraceMessageSource(ResultSet rs) throws SQLException {
		guildId = rs.getLong("sourceGuildId");
		channelId = rs.getLong("sourceChannelId");
		messageId = rs.getLong("sourceMessageId");
		
```

### UnqualifiedFieldAccess
Instance field access `messageId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
		guildId = rs.getLong("sourceGuildId");
		channelId = rs.getLong("sourceChannelId");
		messageId = rs.getLong("sourceMessageId");
		
		nickname = rs.getString("sourceUserNickname");
```

### UnqualifiedFieldAccess
Instance field access `nickname` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
		messageId = rs.getLong("sourceMessageId");
		
		nickname = rs.getString("sourceUserNickname");
		discriminator = rs.getInt("sourceUserDiscriminator");
		userId = rs.getLong("sourceUserId");
```

### UnqualifiedFieldAccess
Instance field access `discriminator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
		
		nickname = rs.getString("sourceUserNickname");
		discriminator = rs.getInt("sourceUserDiscriminator");
		userId = rs.getLong("sourceUserId");
		
```

### UnqualifiedFieldAccess
Instance field access `userId` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
		nickname = rs.getString("sourceUserNickname");
		discriminator = rs.getInt("sourceUserDiscriminator");
		userId = rs.getLong("sourceUserId");
		
		content = rs.getString("sourceContent");
```

### UnqualifiedFieldAccess
Instance field access `content` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
		userId = rs.getLong("sourceUserId");
		
		content = rs.getString("sourceContent");
	}
	
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcLogger.java`
#### Snippet
```java
	
	private void runMdc(Runnable r) {
		MDC.put("service", name);
		r.run();
		MDC.remove("service");
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	private void doOutput(ProcessResult result, ChrislieOutput out, ExceptionHandler exceptionHandler) {
		if (cfg.output != null) {
			cfg.output.apply(out, s -> s.replace("${out}", result.outputUTF8())).send();
		} else {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	private void doOutput(ProcessResult result, ChrislieOutput out, ExceptionHandler exceptionHandler) {
		if (cfg.output != null) {
			cfg.output.apply(out, s -> s.replace("${out}", result.outputUTF8())).send();
		} else {
			try {
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		} else {
			try {
				gson.fromJson(result.outputUTF8(), SerializedOutput.class).apply(out).send();
			} catch (JsonSyntaxException e) {
				exceptionHandler.escalateException(new ListenerException("failed to parse process output as json", e));
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	private void dispatch(Consumer<ProcessExecutor> fnPass, ChrislieOutput out, ExceptionHandler exceptionHandler) throws ListenerException {
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
				.redirectErrorStream(cfg.stderrToSdtOut)
				.environment(cfg.envMap) // note that this map only contains static values
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
				.redirectErrorStream(cfg.stderrToSdtOut)
				.environment(cfg.envMap) // note that this map only contains static values
				.readOutput(true)
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
				.redirectErrorStream(cfg.stderrToSdtOut)
				.environment(cfg.envMap) // note that this map only contains static values
				.readOutput(true)
				.redirectOutputAlsoTo(Slf4jStream.of(log).asTrace())
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		fnPass.accept(procExec);
		
		if (cfg.dir != null)
			procExec.directory(new File(cfg.dir));
		
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		
		if (cfg.dir != null)
			procExec.directory(new File(cfg.dir));
		
		switch (cfg.exitMethod) {
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			procExec.directory(new File(cfg.dir));
		
		switch (cfg.exitMethod) {
			case ANY -> procExec.exitValueAny();
			case NORMAL -> procExec.exitValueNormal();
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			case ANY -> procExec.exitValueAny();
			case NORMAL -> procExec.exitValueNormal();
			case LIST -> procExec.exitValues(cfg.exitCodes);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		}
		
		if (cfg.timeout > 0)
			procExec.timeout(cfg.timeout, TimeUnit.MILLISECONDS);
		
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		
		if (cfg.timeout > 0)
			procExec.timeout(cfg.timeout, TimeUnit.MILLISECONDS);
		
		// this entire library sucks suchs massive donkey cocks that we simply go with the blocking route
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		
		// this entire library sucks suchs massive donkey cocks that we simply go with the blocking route
		synchronized (processes) {
			if (shutdown)
				return;
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		// this entire library sucks suchs massive donkey cocks that we simply go with the blocking route
		synchronized (processes) {
			if (shutdown)
				return;
			
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			
			var t = new Thread(() -> handleProcess(procExec, out, exceptionHandler));
			processes.add(t);
			t.start();
		}
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			
			// synchronize is required to prevent printing output while/after shell command has shut down
			synchronized (processes) {
				if (shutdown)
					return;
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			// synchronize is required to prevent printing output while/after shell command has shut down
			synchronized (processes) {
				if (shutdown)
					return;
				
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		} catch (InterruptedException e) {
			t.interrupt();
			if (shutdown)
				return;
			
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			exceptionHandler.escalateException(new ListenerException("process exited with invalid exit code"));
		} finally {
			synchronized (processes) {
				if (!shutdown)
					processes.remove(t);
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		} finally {
			synchronized (processes) {
				if (!shutdown)
					processes.remove(t);
			}
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			synchronized (processes) {
				if (!shutdown)
					processes.remove(t);
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	protected ExternalCommandListener.@NonNull @org.checkerframework.checker.nullness.qual.NonNull Config externalConfig() {
		return cfg.ext;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	private Consumer<ProcessExecutor> passStdin(ExternalMessageTranslator.ExternalInvocation inv) {
		return executor -> executor.redirectInput(IOUtils.toInputStream(gson.toJson(inv), StandardCharsets.UTF_8));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	protected void handleCommand(Invocation invc) throws ListenerException {
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(invc));
			case STDIN -> passStdin(translator.toObject(invc));
```

### UnqualifiedFieldAccess
Instance field access `translator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	protected void handleCommand(Invocation invc) throws ListenerException {
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(invc));
			case STDIN -> passStdin(translator.toObject(invc));
		};
```

### UnqualifiedFieldAccess
Instance field access `translator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(invc));
			case STDIN -> passStdin(translator.toObject(invc));
		};
		dispatch(fn, invc.reply(), invc.exceptionHandler());
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		
		List<Thread> l;
		synchronized (processes) {
			// prevent terminating processes from modifying process list
			shutdown = true;
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		synchronized (processes) {
			// prevent terminating processes from modifying process list
			shutdown = true;
			
			// create copy since termination listener will also lock on processes and we need to wait for them to finish, otherwise we deadlock
```

### UnqualifiedFieldAccess
Instance field access `processes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			
			// create copy since termination listener will also lock on processes and we need to wait for them to finish, otherwise we deadlock
			l = new ArrayList<>(processes);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
	}
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `translator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	protected void externalMessage(ListenerMessage msg) throws ListenerException {
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(msg));
			case STDIN -> passStdin(translator.toObject(msg));
```

### UnqualifiedFieldAccess
Instance field access `translator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	protected void externalMessage(ListenerMessage msg) throws ListenerException {
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(msg));
			case STDIN -> passStdin(translator.toObject(msg));
		};
```

### UnqualifiedFieldAccess
Instance field access `translator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(msg));
			case STDIN -> passStdin(translator.toObject(msg));
		};
		dispatch(fn, msg.reply(), msg.exceptionHandler());
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `output` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		var reply = invc.reply();
		var substitutor = new CachingSubstitutor(invc);
		output.apply(reply, substitutor::substitute);
		
		// some generators will depend on the input string (regex search) and thereforce not always be able to provide an output
```

### UnqualifiedFieldAccess
Instance field access `cache` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			
			try {
				Optional<Map<String, String>> outMap = cache.get(gen);
				if (outMap.isEmpty()) {
					generatorEmpty = true;
```

### UnqualifiedFieldAccess
Instance field access `generatorEmpty` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
				Optional<Map<String, String>> outMap = cache.get(gen);
				if (outMap.isEmpty()) {
					generatorEmpty = true;
					return null;
				}
```

### UnqualifiedFieldAccess
Instance field access `output` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		var cfg = gson.fromJson(json, Config.class);
		output = cfg.output;
		
		generators = new HashMap<>(cfg.generators.size());
```

### UnqualifiedFieldAccess
Instance field access `generators` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		output = cfg.output;
		
		generators = new HashMap<>(cfg.generators.size());
		for (var e : cfg.generators.entrySet())
			generators.put(e.getKey(), loadGenerator(gson, e.getValue()));
```

### UnqualifiedFieldAccess
Instance field access `generators` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		generators = new HashMap<>(cfg.generators.size());
		for (var e : cfg.generators.entrySet())
			generators.put(e.getKey(), loadGenerator(gson, e.getValue()));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `cache` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		public CachingSubstitutor(Invocation invocation) {
			// instances a loading cache that will use the parents generators with the given invocation to create inputs
			cache = CacheBuilder.newBuilder()
					.build(new CacheLoader<>() {
						@Override
```

### UnqualifiedFieldAccess
Instance field access `cache` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			map.put("guild.displayName", escapeStrSubstitution(msg.channel().guild().map(ChrislieGuild::displayName).orElse(msg.channel().displayName())));
			
			cache.put("message", Optional.of(map));
		}
		
```

### UnqualifiedFieldAccess
Instance field access `substitutor` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		
		public String substitute(String s) {
			return substitutor.replace(s);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `generators` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
						@Override
						public Optional<Map<String, String>> load(String key) throws ListenerException {
							var generator = generators.get(key);
							
							if (generator == null)
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	protected void shutDown() throws Chrisliebot.ChrisliebotException {
		// remember: reverse order
		timer.shutdown();
		httpClient.dispatcher().executorService().shutdown(); // TODO: are the executors blocking? should we configure the pool by ourself?
		httpClient.connectionPool().evictAll();
```

### UnqualifiedFieldAccess
Instance field access `httpClient` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		// remember: reverse order
		timer.shutdown();
		httpClient.dispatcher().executorService().shutdown(); // TODO: are the executors blocking? should we configure the pool by ourself?
		httpClient.connectionPool().evictAll();
		
```

### UnqualifiedFieldAccess
Instance field access `httpClient` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		timer.shutdown();
		httpClient.dispatcher().executorService().shutdown(); // TODO: are the executors blocking? should we configure the pool by ourself?
		httpClient.connectionPool().evictAll();
		
		dataSource.close();
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		httpClient.connectionPool().evictAll();
		
		dataSource.close();
	}
}
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	protected void startUp() throws Exception {
		// ping database to ensure basic functionality
		try (var conn = dataSource.getConnection(); var stmt = conn.createStatement()) {
			stmt.execute("SELECT 1");
		} catch (SQLException e) {
```

### UnqualifiedFieldAccess
Instance field access `httpClient` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
			}
		}
		httpClient = builder.build();
		
		timer = new ScheduledThreadPoolExecutor(1, r -> {
```

### UnqualifiedFieldAccess
Instance field access `timer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
		httpClient = builder.build();
		
		timer = new ScheduledThreadPoolExecutor(1, r -> {
			var t = new Thread(r, "SharedTimerExecutor");
			t.setDaemon(true);
```

### UnqualifiedFieldAccess
Instance field access `dataSource` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	
	public DataSource dataSource() {
		return dataSource;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `title` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
		
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
		Optional.ofNullable(img).ifPresent(img -> output.image(fn.apply(img)));
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
```

### UnqualifiedFieldAccess
Instance field access `url` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Function<String, String> fn = (s) -> s == null ? null : transform.apply(s);
		
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
		Optional.ofNullable(img).ifPresent(img -> output.image(fn.apply(img)));
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
```

### UnqualifiedFieldAccess
Instance field access `img` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
		Optional.ofNullable(img).ifPresent(img -> output.image(fn.apply(img)));
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
		Optional.ofNullable(color).ifPresent(output::color);
```

### UnqualifiedFieldAccess
Instance field access `thumbnail` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(title).ifPresent(title -> output.title(fn.apply(title), fn.apply(url)));
		Optional.ofNullable(img).ifPresent(img -> output.image(fn.apply(img)));
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
```

### UnqualifiedFieldAccess
Instance field access `color` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(img).ifPresent(img -> output.image(fn.apply(img)));
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
```

### UnqualifiedFieldAccess
Instance field access `author` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
		
```

### UnqualifiedFieldAccess
Instance field access `authorUrl` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
		
```

### UnqualifiedFieldAccess
Instance field access `authorIcon` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(thumbnail).ifPresent(thumbnail -> output.thumbnail(fn.apply(thumbnail)));
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
		
```

### UnqualifiedFieldAccess
Instance field access `footer` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
		
		Optional.ofNullable(plain).ifPresent(list -> applyCalls(list, output.plain(), fn));
```

### UnqualifiedFieldAccess
Instance field access `footerIcon` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(color).ifPresent(output::color);
		Optional.ofNullable(author).ifPresent(author -> output.author(fn.apply(author)).authorUrl(fn.apply(authorUrl)).authorIcon(fn.apply(authorIcon)));
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
		
		Optional.ofNullable(plain).ifPresent(list -> applyCalls(list, output.plain(), fn));
```

### UnqualifiedFieldAccess
Instance field access `plain` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(footer).ifPresent(footer -> output.footer(fn.apply(footer), fn.apply(footerIcon)));
		
		Optional.ofNullable(plain).ifPresent(list -> applyCalls(list, output.plain(), fn));
		Optional.ofNullable(description).ifPresent(list -> applyCalls(list, output.description(), fn));
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
```

### UnqualifiedFieldAccess
Instance field access `description` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		Optional.ofNullable(plain).ifPresent(list -> applyCalls(list, output.plain(), fn));
		Optional.ofNullable(description).ifPresent(list -> applyCalls(list, output.description(), fn));
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
		
```

### UnqualifiedFieldAccess
Instance field access `replace` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(plain).ifPresent(list -> applyCalls(list, output.plain(), fn));
		Optional.ofNullable(description).ifPresent(list -> applyCalls(list, output.description(), fn));
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
		
		fields.forEach(field -> output.field(field.name, field.value, field.inline));
```

### UnqualifiedFieldAccess
Instance field access `fields` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
		
		fields.forEach(field -> output.field(field.name, field.value, field.inline));
		
		return output;
```

### UnqualifiedFieldAccess
Instance field access `method` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `content` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `formats` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `backlog` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
	private synchronized void keepMessage(ListenerMessage msg) throws ExecutionException {
		var m = msg.msg();
		var queue = backlog.get(ChannelIdentifier.of(m.channel()),
				() -> new CircularFifoQueue<>(msg.ref().flexConf().getIntegerOrFail("sed.backlog")));
		
```

### UnqualifiedFieldAccess
Instance field access `backlog` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
		Predicate<String> searchPredicate = (item) -> searchPattern.matcher(item).find();
		
		var queue = backlog.getIfPresent(ChannelIdentifier.of(m.channel()));
		
		if (queue == null) {
```

### UnqualifiedFieldAccess
Instance field access `invc` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		
		public void escalateException(Exception e) {
			log.error("command invocation failed with exception: {}", invc, e);
			
			// if verbose mode is enabled, we output generic error message (note that we are not using the exception text, as it might contain private information)
```

### UnqualifiedFieldAccess
Instance field access `invc` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			
			// if verbose mode is enabled, we output generic error message (note that we are not using the exception text, as it might contain private information)
			if (invc.ref().flexConf().isSet(FlexConf.DISPATCHER_VERBOSE)) {
				try {
					ErrorOutputBuilder.generic("Da ging etwas schief. Das tut mir leid.").write(invc).send();
```

### UnqualifiedFieldAccess
Instance field access `invc` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			if (invc.ref().flexConf().isSet(FlexConf.DISPATCHER_VERBOSE)) {
				try {
					ErrorOutputBuilder.generic("Da ging etwas schief. Das tut mir leid.").write(invc).send();
				} catch (ChrislieListener.ListenerException ex) {
					log.warn("unable to instance reply instance for dispatcher error", ex);
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	 */
	public void shutdown() throws InterruptedException {
		shutdown = true; // discard all new messages
		
		// wait for other threads to exit dispatcher section
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		
		// wait for other threads to exit dispatcher section
		synchronized (shutdownCounter) {
			while (shutdownCounter.get() != 0)
				shutdownCounter.wait();
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		// wait for other threads to exit dispatcher section
		synchronized (shutdownCounter) {
			while (shutdownCounter.get() != 0)
				shutdownCounter.wait();
		}
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		synchronized (shutdownCounter) {
			while (shutdownCounter.get() != 0)
				shutdownCounter.wait();
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `msg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		
		public void escalateException(Exception e) {
			log.error("listener callback failed with exception: {}", msg, e);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `chrisliebot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		var invocation = new ChrislieListener.Invocation(
				exceptionHandler,
				chrisliebot,
				m,
				maybeRef.get(),
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	public void dispatch(@NonNull ChrislieMessage m) {
		try {
			shutdownCounter.incrementAndGet();
			
			if (shutdown)
```

### UnqualifiedFieldAccess
Instance field access `shutdown` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			shutdownCounter.incrementAndGet();
			
			if (shutdown)
				return;
			
```

### UnqualifiedFieldAccess
Instance field access `resolver` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
				return;
			
			var ctx = resolver.resolve(Selector::check, m);
			
			// dispatcher can be directly controlled via certain group config flax
```

### UnqualifiedFieldAccess
Instance field access `chrisliebot` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
				var lm = new ChrislieListener.ListenerMessage(
						exceptionHandler,
						chrisliebot,
						m,
						ref,
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			}
		} finally {
			synchronized (shutdownCounter) {
				shutdownCounter.decrementAndGet();
				shutdownCounter.notifyAll();
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		} finally {
			synchronized (shutdownCounter) {
				shutdownCounter.decrementAndGet();
				shutdownCounter.notifyAll();
			}
```

### UnqualifiedFieldAccess
Instance field access `shutdownCounter` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
			synchronized (shutdownCounter) {
				shutdownCounter.decrementAndGet();
				shutdownCounter.notifyAll();
			}
		}
```

### UnqualifiedFieldAccess
Instance field access `patternCache` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
		Pattern pattern;
		try {
			pattern = patternCache.get(patternStr.get());
		} catch (ExecutionException e) {
			log.warn("failed to compile dispatcher pattern `{}` for message: {}", patternStr.get(), m, e);
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
		
		// extract all groups from mapping (remember that group names are unique)
		groups = new HashMap<>();
		mappings.stream()
				.map(ScopeMapping::groups)
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.map(ScopeMapping::groups)
				.flatMap(List::stream)
				.filter(g -> !groups.containsKey(g.name())) // only visit each group once
				.flatMap(ContextResolver::flattenGroups)
				.forEach(group -> groups.put(group.name(), group));
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.filter(g -> !groups.containsKey(g.name())) // only visit each group once
				.flatMap(ContextResolver::flattenGroups)
				.forEach(group -> groups.put(group.name(), group));
		
		groups = Collections.unmodifiableMap(groups); // make unmodifiable
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.forEach(group -> groups.put(group.name(), group));
		
		groups = Collections.unmodifiableMap(groups); // make unmodifiable
		
		// extract all listeners from all groups (identity is only way to make sure we got each listener exactly once)
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.forEach(group -> groups.put(group.name(), group));
		
		groups = Collections.unmodifiableMap(groups); // make unmodifiable
		
		// extract all listeners from all groups (identity is only way to make sure we got each listener exactly once)
```

### UnqualifiedFieldAccess
Instance field access `envelopes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
		
		// extract all listeners from all groups (identity is only way to make sure we got each listener exactly once)
		envelopes = Collections.newSetFromMap(new IdentityHashMap<>());
		groups.values().stream()
				.map(ChrislieGroup::refs)
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
		// extract all listeners from all groups (identity is only way to make sure we got each listener exactly once)
		envelopes = Collections.newSetFromMap(new IdentityHashMap<>());
		groups.values().stream()
				.map(ChrislieGroup::refs)
				.map(Map::values)
```

### UnqualifiedFieldAccess
Instance field access `envelopes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.flatMap(Collection::stream)
				.map(ListenerReference::envelope)
				.forEach(envelopes::add);
		envelopes = Collections.unmodifiableSet(envelopes);
	}
```

### UnqualifiedFieldAccess
Instance field access `envelopes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.map(ListenerReference::envelope)
				.forEach(envelopes::add);
		envelopes = Collections.unmodifiableSet(envelopes);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `envelopes` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
				.map(ListenerReference::envelope)
				.forEach(envelopes::add);
		envelopes = Collections.unmodifiableSet(envelopes);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `mappings` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
		ChrislieContext ctx = new ChrislieContext();
		
		for (ScopeMapping mapping : mappings)
			if (mapping.checkAll(lookup, t))
				ctx.addGroups(mapping.groups());
```

### UnqualifiedFieldAccess
Instance field access `data` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		
		public List<QwantItem> items(GsonValidator gson, Type type) {
			return data.result.getItemsAndUnfuckMess(gson, type);
		}
		
```

### UnqualifiedFieldAccess
Instance field access `items` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			// web type search returns a bunch of bullshit typed json, so we fix that
			public List<QwantItem> getItemsAndUnfuckMess(GsonValidator gson, Type type) {
				if (items == null || items.isJsonNull()) {
					return List.of();
				}
```

### UnqualifiedFieldAccess
Instance field access `items` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			// web type search returns a bunch of bullshit typed json, so we fix that
			public List<QwantItem> getItemsAndUnfuckMess(GsonValidator gson, Type type) {
				if (items == null || items.isJsonNull()) {
					return List.of();
				}
```

### UnqualifiedFieldAccess
Instance field access `items` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				}
				
				if (items.isJsonArray()) {
					return gson.fromJson(items, new TypeToken<List<QwantItem>>() {}.getType());
				}
```

### UnqualifiedFieldAccess
Instance field access `items` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				
				if (items.isJsonArray()) {
					return gson.fromJson(items, new TypeToken<List<QwantItem>>() {}.getType());
				}
				
```

### UnqualifiedFieldAccess
Instance field access `items` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				}
				
				var mainline = gson.fromJson(items, QwantMainlineItemsBullshit.class);
				var list = new ArrayList<QwantItem>();
				for (var result : mainline.mainline) {
```

### UnqualifiedFieldAccess
Instance field access `media` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			
			public String mediaUrl(GsonValidator gson) {
				if (media == null || media.isJsonNull())
					return null;
				
```

### UnqualifiedFieldAccess
Instance field access `media` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			
			public String mediaUrl(GsonValidator gson) {
				if (media == null || media.isJsonNull())
					return null;
				
```

### UnqualifiedFieldAccess
Instance field access `media` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
					return null;
				
				if (media.isJsonPrimitive()) {
					return media.getAsString();
				}
```

### UnqualifiedFieldAccess
Instance field access `media` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				
				if (media.isJsonPrimitive()) {
					return media.getAsString();
				}
				
```

### UnqualifiedFieldAccess
Instance field access `media` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				}
				
				if (media.isJsonArray()) {
					var array = media.getAsJsonArray();
					if (array.size() == 0) {
```

### UnqualifiedFieldAccess
Instance field access `media` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				
				if (media.isJsonArray()) {
					var array = media.getAsJsonArray();
					if (array.size() == 0) {
						return null;
```

### UnqualifiedFieldAccess
Instance field access `fn` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
		out.color(ERROR_COLOR);
		out.markAsError();
		fn.out(out);
		return out;
	}
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	public ChrislieParser(@NonNull String s, int idx) {
		codepoints = s.substring(idx).codePoints().toArray();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `input` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		
		public ParserException(ChrislieParser parser) {
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser) {
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	public String toString() {
		return "ArgumentParser{" +
				"idx=" + idx +
				", argString='" + intStreamToString(IntStream.of(codepoints)) + '\'' +
				", remaining='" + intStreamToString(IntStream.of(codepoints).skip(idx)) + '\'' +
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		return "ArgumentParser{" +
				"idx=" + idx +
				", argString='" + intStreamToString(IntStream.of(codepoints)) + '\'' +
				", remaining='" + intStreamToString(IntStream.of(codepoints).skip(idx)) + '\'' +
				'}';
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
				"idx=" + idx +
				", argString='" + intStreamToString(IntStream.of(codepoints)) + '\'' +
				", remaining='" + intStreamToString(IntStream.of(codepoints).skip(idx)) + '\'' +
				'}';
	}
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
				"idx=" + idx +
				", argString='" + intStreamToString(IntStream.of(codepoints)) + '\'' +
				", remaining='" + intStreamToString(IntStream.of(codepoints).skip(idx)) + '\'' +
				'}';
	}
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	protected boolean canRead() {
		return idx < codepoints.length;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	protected boolean canRead() {
		return idx < codepoints.length;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `input` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser, Throwable t) {
			super(t);
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
			super(t);
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `input` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser, String message, Throwable t) {
			super(message, t);
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
			super(message, t);
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `input` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 */
		public String string() {
			return intStreamToString(IntStream.of(input));
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `input` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser, String message) {
			super(message);
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
			super(message);
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	
	protected void skipCodepoints(int n) {
		idx(idx + n);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `parent` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	public void commit() throws IllegalArgumentException {
		if (parent == null)
			throw new IllegalStateException("this parser doesn't have a parant");
		
```

### UnqualifiedFieldAccess
Instance field access `parent` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		
		// update index of parent to current
		parent.idx = this.idx;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `parent` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	
	private ChrislieParser(ChrislieParser parser) {
		parent = parser; // store reference to parant parser
		
		idx = parser.idx;
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		parent = parser; // store reference to parant parser
		
		idx = parser.idx;
		codepoints = parser.codepoints;
	}
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		
		idx = parser.idx;
		codepoints = parser.codepoints;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	public void skipWhitespaces() {
		while (canRead() && Character.isWhitespace(codepoints[idx]))
			skipCodepoints(1);
	}
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	public void skipWhitespaces() {
		while (canRead() && Character.isWhitespace(codepoints[idx]))
			skipCodepoints(1);
	}
```

### UnqualifiedFieldAccess
Instance field access `input` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 */
		public String current() {
			return intStreamToString(IntStream.of(input).skip(index));
		}
		
```

### UnqualifiedFieldAccess
Instance field access `index` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 */
		public String current() {
			return intStreamToString(IntStream.of(input).skip(index));
		}
		
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		if (!canRead())
			throw new ParserException(this, "unexpected EOF");
		return codepoints[idx++];
	}
	
```

### UnqualifiedFieldAccess
Instance field access `idx` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		if (!canRead())
			throw new ParserException(this, "unexpected EOF");
		return codepoints[idx++];
	}
	
```

### UnqualifiedFieldAccess
Instance field access `codepoints` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	
	private void idx(int idx) {
		Preconditions.checkElementIndex(idx, codepoints.length);
		this.idx = idx;
	}
```

### UnqualifiedFieldAccess
Instance field access `service` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	@Override
	public List<DiscordUser> users() {
		return List.of(new DiscordUser(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	@Override
	public List<DiscordUser> users() {
		return List.of(new DiscordUser(service, user));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public String displayName() {return channel.getName();}
	
	@Override
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	@Override
	public String identifier() {
		return DiscordService.PREFIX_PRIVATE_CHANNEL + user.getId(); // use user id as identifier since we need to reopen this channel
	}
	
```

### UnqualifiedFieldAccess
Instance field access `user` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
		this.channel = channel;
		
		user = channel.getUser();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `channel` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	@Override
	public MessageChannel messageChannel() {
		return channel;
	}
}
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, classOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `validator` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	private <T> T validate(T t) throws JsonSyntaxException {
		try {
			var result = validator.validate(t);
			if (!result.isEmpty()) {
				var reason = result.stream().map(v -> String.format("%s value `%s`: %s",
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public String toJson(Object src, Type typeOfSrc) {
		return gson.toJson(validate(src), typeOfSrc);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public void toJson(Object src, Appendable writer) throws JsonIOException {
		gson.toJson(validate(src), writer);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `factory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public Converter.Factory factory() {
		return factory;
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public void toJson(Object src, Type typeOfSrc, Appendable writer) throws JsonIOException {
		gson.toJson(validate(src), typeOfSrc, writer);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `factory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		this.validator = validator;
		
		factory = new ValidatingRetrofitFactory();
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException, JsonIOException {
		return validate(gson.fromJson(json, classOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public void toJson(Object src, Type typeOfSrc, JsonWriter writer) throws JsonIOException {
		gson.toJson(validate(src), typeOfSrc, writer);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(JsonElement json, Type typeOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gsonFactory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Override
		public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
			Converter<ResponseBody, ?> converter = gsonFactory.responseBodyConverter(type, annotations, retrofit);
			return body -> validate(converter.convert(body));
		}
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, classOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public String toJson(Object src) {
		return gson.toJson(src);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public void toJson(JsonElement jsonElement, Appendable writer) throws JsonIOException {
		gson.toJson(jsonElement, writer);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gsonFactory` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
		@Override
		public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
			Converter<?, RequestBody> converter = gsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
			return value -> validate(converter.convert(C.unsafeCast(value))); // type compatibility is upheld by retrofit
		}
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	private class ValidatingRetrofitFactory extends Converter.Factory {
		
		private GsonConverterFactory gsonFactory = GsonConverterFactory.create(gson);
		
		@Nullable
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException, JsonSyntaxException {
		return validate(gson.fromJson(reader, typeOfT));
	}
	
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	
	public String toJson(JsonElement jsonElement) {
		return gson.toJson(jsonElement);
	}
	
```

### UnqualifiedFieldAccess
Instance field access `graph` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		@Override
		public int compareTo(@NotNull KitEscapeRoutesCommand.GraphContainer o) {
			var intComp = Integer.compareUnsigned(o.graph.nodeCount(), graph.nodeCount());
			if (intComp != 0)
				return intComp;
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				return intComp;
			
			return name.compareTo(o.name);
		}
	}
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private synchronized void actionQuit(Invocation invc) throws ListenerException {
		graphs.clear();
		simpleOutput(invc.reply(), "Ich habe aufger?umt", ":)))").send();
	}
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private synchronized void actionListGraphs(Invocation invc) throws ListenerException {
		var list = new ArrayList<>(graphs.values());
		Collections.sort(list);
		
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				case "add" -> {
					var name = parser.word(true).consume().expect("graph name");
					var container = graphs.get(name);
					if (container == null)
						actionAddNewGraph(invc, parser, name);
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
					if (nameToken.isSuccess()) {
						var name = nameToken.expect("graph name");
						var container = graphs.get(name);
						if (container == null) {
							ErrorOutputBuilder.generic("Ich kenn keinen Graphen mit dem Namen " + name).write(invc).send();
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				case "print" -> {
					var name = parser.word(true).consume().expect("graph name");
					var container = graphs.get(name);
					if (container == null) {
						ErrorOutputBuilder.generic("Ich kenn keinen Graphen mit dem Namen " + name).write(invc).send();
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				case "flow" -> {
					var name = parser.word(true).consume().expect("graph name");
					var container = graphs.get(name);
					if (container == null) {
						ErrorOutputBuilder.generic("Ich kenn keinen Graphen mit dem Namen " + name).write(invc).send();
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	private synchronized void actionAddNewGraph(Invocation invc, ChrislieParser parser, String name)
			throws ListenerException, ChrislieParser.ParserException, IllegalGraphException {
		if (graphs.size() >= LIMIT_MAX_GRAPH_COUNT) {
			ErrorOutputBuilder.generic("Ich hab jetzt %d Graphen gespeichert, das reicht!".formatted(graphs.size())).write(invc).send();
			return;
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
			throws ListenerException, ChrislieParser.ParserException, IllegalGraphException {
		if (graphs.size() >= LIMIT_MAX_GRAPH_COUNT) {
			ErrorOutputBuilder.generic("Ich hab jetzt %d Graphen gespeichert, das reicht!".formatted(graphs.size())).write(invc).send();
			return;
		}
```

### UnqualifiedFieldAccess
Instance field access `graphs` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		}
		
		graphs.put(name, new GraphContainer(name, graph));
		
		simpleOutput(warnInvalidGraph(graph, invc.reply()), "Graph `%s` angelegt".formatted(name), "Added new escape network with identifier %s.".formatted(name)).send();
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		@SuppressWarnings("EmptyClass")
		private List<Selector> instanceSelectors(@NonNull JsonElement json) throws Selector.SelectorException {
			List<JsonSelector> jsonSelectors = gson.fromJson(json, new TypeToken<List<JsonSelector>>() {}.getType());
			List<Selector> selectors = new ArrayList<>(jsonSelectors.size());
			for (JsonSelector selector : jsonSelectors)
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		@Override
		public Optional<Object> get(String key, Type type) {
			var val = map.get(key);
			if (val == null)
				return Optional.empty();
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			try {
				return Optional.ofNullable(gson.fromJson(val, type));
			} catch (JsonSyntaxException e) {
				log.warn("failed to get key `{}` from flexconf as `{}` with json representation `{}` flexconf is: {}", key, type, val, this, e);
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				Class<? extends ChrislieListener> clazz = Class.forName(this.clazz).asSubclass(ChrislieListener.class);
				ChrislieListener listener = clazz.getDeclaredConstructor().newInstance();
				listener.fromConfig(gson, cfg);
				return new ChrislieListener.Envelope(listener, format("created as listener `%s` in group `%s`", name, groupName));
			} catch (@SuppressWarnings("OverlyBroadCatchBlock") Exception e) {
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				ChrislieListener listener = clazz.getDeclaredConstructor().newInstance();
				listener.fromConfig(gson, cfg);
				return new ChrislieListener.Envelope(listener, format("created as listener `%s` in group `%s`", name, groupName));
			} catch (@SuppressWarnings("OverlyBroadCatchBlock") Exception e) {
				throw new ChrislieListener.ListenerException("failed to instance listener", e);
```

### UnqualifiedFieldAccess
Instance field access `chrislieGroups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				// resolve includes
				ChrislieGroup g = chrislieGroups.get(name);
				if (g == null) {
					
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
						
						try {
							refs.add(anchor.instance(gson, ctx, name));
						} catch (ChrislieListener.ListenerException e) {
							throw new ConfigInitializeException(format("failed to instance listener anchor in group `%s`, anchor was: %s", name, anchor), e);
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					}
					
					g = new ChrislieGroup(name, instanceFlexConf(gson, group.flex), list, refs);
					
					// add group to instanced groups as this group is now fully functional
```

### UnqualifiedFieldAccess
Instance field access `chrislieGroups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// add group to instanced groups as this group is now fully functional
					chrislieGroups.put(name, g);
				}
				
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				default -> throw new Selector.SelectorException(format("there is no selector of type `%s`", json.type));
			};
			selector.fromJson(gson, json.json);
			return selector;
		}
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			// check for common fields
			if (name == null || name.isBlank())
				throw new ChrislieListener.ListenerException("no name given");
			if (type == null)
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			// check for common fields
			if (name == null || name.isBlank())
				throw new ChrislieListener.ListenerException("no name given");
			if (type == null)
```

### UnqualifiedFieldAccess
Instance field access `type` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			if (name == null || name.isBlank())
				throw new ChrislieListener.ListenerException("no name given");
			if (type == null)
				throw new ChrislieListener.ListenerException("no type given");
			
```

### UnqualifiedFieldAccess
Instance field access `type` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			// validate type and create or fetch listener from context
			ChrislieListener.Envelope envelope;
			if ("def".equals(type)) {
				if (clazz == null || clazz.isBlank())
					throw new ChrislieListener.ListenerException("no clazz specified");
```

### UnqualifiedFieldAccess
Instance field access `clazz` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			ChrislieListener.Envelope envelope;
			if ("def".equals(type)) {
				if (clazz == null || clazz.isBlank())
					throw new ChrislieListener.ListenerException("no clazz specified");
				
```

### UnqualifiedFieldAccess
Instance field access `clazz` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			ChrislieListener.Envelope envelope;
			if ("def".equals(type)) {
				if (clazz == null || clazz.isBlank())
					throw new ChrislieListener.ListenerException("no clazz specified");
				
```

### UnqualifiedFieldAccess
Instance field access `type` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				envelope = instanceListener(gson, groupName);
			} else if ("ref".equals(type)) {
				if (clazz != null)
					throw new ChrislieListener.ListenerException("clazz is only valid in listener definition");
```

### UnqualifiedFieldAccess
Instance field access `clazz` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				envelope = instanceListener(gson, groupName);
			} else if ("ref".equals(type)) {
				if (clazz != null)
					throw new ChrislieListener.ListenerException("clazz is only valid in listener definition");
				if (cfg != null)
```

### UnqualifiedFieldAccess
Instance field access `cfg` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				if (clazz != null)
					throw new ChrislieListener.ListenerException("clazz is only valid in listener definition");
				if (cfg != null)
					throw new ChrislieListener.ListenerException("cfg is only valid in listener definition");
				
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				// look up listener in provided context or fail if there is no such listener
				envelope = ctx.listener(name)
						.orElseThrow(() -> new ChrislieListener.ListenerException("failed to locate referenced listener in current context"))
						.envelope();
```

### UnqualifiedFieldAccess
Instance field access `alias` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			// create alias set if listener implements command
			AliasSet aliasSet;
			if (alias != null) {
				if (envelope.listener() instanceof ChrislieListener.Command)
					aliasSet = AliasSet.of(alias).orElseThrow(() -> new ChrislieListener.ListenerException("invalid alias map: " + alias));
```

### UnqualifiedFieldAccess
Instance field access `alias` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			if (alias != null) {
				if (envelope.listener() instanceof ChrislieListener.Command)
					aliasSet = AliasSet.of(alias).orElseThrow(() -> new ChrislieListener.ListenerException("invalid alias map: " + alias));
				else
					throw new ChrislieListener.ListenerException("anchor has alias map but listener doesn't implement command interface");
```

### UnqualifiedFieldAccess
Instance field access `alias` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			if (alias != null) {
				if (envelope.listener() instanceof ChrislieListener.Command)
					aliasSet = AliasSet.of(alias).orElseThrow(() -> new ChrislieListener.ListenerException("invalid alias map: " + alias));
				else
					throw new ChrislieListener.ListenerException("anchor has alias map but listener doesn't implement command interface");
```

### UnqualifiedFieldAccess
Instance field access `name` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			// always returns a listener reference since it doesn't matter where they are from, this results in references being the only way to reference a listener
			return ListenerReference.builder()
					.name(name)
					.help(help)
					.envelope(envelope)
```

### UnqualifiedFieldAccess
Instance field access `help` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			return ListenerReference.builder()
					.name(name)
					.help(help)
					.envelope(envelope)
					.flexConf(instanceFlexConf(gson, flex))
```

### UnqualifiedFieldAccess
Instance field access `flex` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					.help(help)
					.envelope(envelope)
					.flexConf(instanceFlexConf(gson, flex))
					.aliasSet(aliasSet)
					.build();
```

### UnqualifiedFieldAccess
Instance field access `map` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		@Override
		public <V> Optional<V> get(String key, Class<V> clazz) {
			var val = map.get(key);
			if (val == null)
				return Optional.empty();
```

### UnqualifiedFieldAccess
Instance field access `gson` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			try {
				return Optional.ofNullable(gson.fromJson(val, clazz));
			} catch (JsonSyntaxException e) {
				log.warn("failed to get key `{}` from flexconf as `{}` with json representation `{}` flexconf is: {}", key, clazz, val, this, e);
```

### UnqualifiedFieldAccess
Instance field access `chrislieGroups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			this.gson = gson;
			
			chrislieGroups = new HashMap<>();
			
			ensureNonNull(groups, "group list is null");
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			chrislieGroups = new HashMap<>();
			
			ensureNonNull(groups, "group list is null");
			ensureNonNull(mappings, "mapping list is null");
			
```

### UnqualifiedFieldAccess
Instance field access `mappings` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			ensureNonNull(groups, "group list is null");
			ensureNonNull(mappings, "mapping list is null");
			
			// iterate over all mappings (note that a mapping may consist of multiple selectors)
```

### UnqualifiedFieldAccess
Instance field access `mappings` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			// iterate over all mappings (note that a mapping may consist of multiple selectors)
			List<ScopeMapping> scopeMappings = new ArrayList<>(mappings.size());
			for (ScopeToGroup mapping : mappings) {
				
```

### UnqualifiedFieldAccess
Instance field access `mappings` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			// iterate over all mappings (note that a mapping may consist of multiple selectors)
			List<ScopeMapping> scopeMappings = new ArrayList<>(mappings.size());
			for (ScopeToGroup mapping : mappings) {
				
				ensureNonNull(mapping, "mapping itself is null");
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// instancing group only when referenced by mapping allows checking for orphaned groups after loop
					var group = groups.get(name);
					ensureNonNull(group, format("there is no group with name `%s` referenced by mapping: %s", name, mapping));
					
```

### UnqualifiedFieldAccess
Instance field access `groups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			// compare list of instanced groups with list of all existing groups in config and report difference as orphans
			groups.keySet().forEach(chrislieGroups::remove);
			
			if (!chrislieGroups.isEmpty())
```

### UnqualifiedFieldAccess
Instance field access `chrislieGroups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			// compare list of instanced groups with list of all existing groups in config and report difference as orphans
			groups.keySet().forEach(chrislieGroups::remove);
			
			if (!chrislieGroups.isEmpty())
```

### UnqualifiedFieldAccess
Instance field access `chrislieGroups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			groups.keySet().forEach(chrislieGroups::remove);
			
			if (!chrislieGroups.isEmpty())
				log.warn("found orphaned groups that are never used: {}", chrislieGroups.keySet());
			
```

### UnqualifiedFieldAccess
Instance field access `chrislieGroups` is not qualified with 'this'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			
			if (!chrislieGroups.isEmpty())
				log.warn("found orphaned groups that are never used: {}", chrislieGroups.keySet());
			
			return scopeMappings;
```

## NestingDepth
### NestingDepth
`refreshGuildCommands` is overly nested (maximum nesting depth = 6)
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	}
	
	private void refreshGuildCommands() {
		// need to wait for bot framework to announce resolver
		if (ctxResolver == null)
```

## FieldAccessedSynchronizedAndUnsynchronized
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
Field `resolver` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
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
Field `pollTask` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	private Twitter twitter;
	
	private ScheduledFuture<?> pollTask;
	private boolean shutdown;
	
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
Field `jda` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Getter private Chrisliebot bot;
	@Getter private JDA jda;
	@Getter private String identifier;
	private boolean updateSlashCommands;
```

## ConfusingElse
### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
			fork.commit();
			return false;
		} else {
			return true;
		}
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
				reply.send();
				return;
			} else {
				var argMensaName = args.get(0).toLowerCase();
				
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
				if (acceptEOF)
					return sb.toString();
				else
					throw e;
			}
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				listCommand(invc);
				return;
			} else if (arg.startsWith("delete") || arg.startsWith("del")) {
				deleteCommand(invc);
				return;
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				deleteCommand(invc);
				return;
			} else if (arg.startsWith("info") || arg.startsWith("i")) {
				infoCommand(invc);
				return;
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				infoCommand(invc);
				return;
			} else if (arg.startsWith("snooze")) {
				snoozeCommand(invc);
				return;
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				snoozeCommand(invc);
				return;
			} else if (arg.startsWith("restore")) {
				restoreCommand(invc);
				return;
```

### ConfusingElse
`else` branch may be unwrapped, as the 'if' branch never completes normally
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
						return new IrcChannel(this, channel, guildIdentifier.orElse(null));
					});
		} else {
			return userByPrefixedIdentifier(identifier).map(user -> new IrcPrivateChannel(this, user));
		}
```

## ParameterHidingMemberVariable
### ParameterHidingMemberVariable
Parameter `service` hides field in class 'IrcUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	private Function<IrcUser, String> idFn;
	
	public IrcUser(IrcService service, User user) {
		this(service, user, IrcUser::createIdFromAccountOrFallback);
	}
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'IrcUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	private Function<IrcUser, String> idFn;
	
	public IrcUser(IrcService service, User user) {
		this(service, user, IrcUser::createIdFromAccountOrFallback);
	}
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'IrcUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	}
	
	private IrcUser(IrcService service, User user, Function<IrcUser, String> idFn) {
		this.service = service;
		this.user = user;
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'IrcUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	}
	
	private IrcUser(IrcService service, User user, Function<IrcUser, String> idFn) {
		this.service = service;
		this.user = user;
```

### ParameterHidingMemberVariable
Parameter `idFn` hides field in class 'IrcUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	}
	
	private IrcUser(IrcService service, User user, Function<IrcUser, String> idFn) {
		this.service = service;
		this.user = user;
```

### ParameterHidingMemberVariable
Parameter `groups` hides field in class 'ScopeMapping'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/ScopeMapping.java`
#### Snippet
```java
	@Getter private List<ChrislieGroup> groups;
	
	public ScopeMapping(List<Selector> selectors, List<ChrislieGroup> groups) {
		super(selectors, Operation.AND);
		this.groups = ImmutableList.copyOf(groups);
```

### ParameterHidingMemberVariable
Parameter `current` hides field in class 'ChainResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		private Resolver next;
		
		public ChainResolver(@NonNull Resolver current, @NonNull Resolver next) {
			this.current = current;
			this.next = next;
```

### ParameterHidingMemberVariable
Parameter `next` hides field in class 'ChainResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
		private Resolver next;
		
		public ChainResolver(@NonNull Resolver current, @NonNull Resolver next) {
			this.current = current;
			this.next = next;
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'FlexConf'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * @param resolver A resolver instance that will be used by the newly created FlexConfg.
	 */
	public FlexConf(@NonNull Resolver resolver) {
		this.resolver = resolver;
	}
```

### ParameterHidingMemberVariable
Parameter `convert` hides field in class 'ProviderImpl'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
			this.convert = convert;
			this.key = key;
```

### ParameterHidingMemberVariable
Parameter `key` hides field in class 'ProviderImpl'
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		private BiFunction<FlexConf, String, Optional<T>> convert;
		
		private ProviderImpl(@NonNull BiFunction<FlexConf, String, Optional<T>> convert, @NonNull String key) {
			this.convert = convert;
			this.key = key;
```

### ParameterHidingMemberVariable
Parameter `out` hides field in class 'JoinPlainOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		private boolean pending;
		
		public JoinPlainOutput(@NonNull PlainOutput out, @NonNull String delimiter) {
			this.out = out;
			this.delimiter = delimiter;
```

### ParameterHidingMemberVariable
Parameter `delimiter` hides field in class 'JoinPlainOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutput.java`
#### Snippet
```java
		private boolean pending;
		
		public JoinPlainOutput(@NonNull PlainOutput out, @NonNull String delimiter) {
			this.out = out;
			this.delimiter = delimiter;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'IrcPrivateChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Getter private IrcUser user;
	
	public IrcPrivateChannel(IrcService service, User user) {
		this.service = service;
		this.user = new IrcUser(service, user);
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'IrcPrivateChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	@Getter private IrcUser user;
	
	public IrcPrivateChannel(IrcService service, User user) {
		this.service = service;
		this.user = new IrcUser(service, user);
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'TwitterTimelineNotifier'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'TwitterTimelineNotifier'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'TwitterTimelineNotifier'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		pollTask.cancel(false);
	}
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'TwitterTimelineNotifier'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		pollTask.cancel(false);
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'TwitterTimelineNotifier'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'TwitterTimelineNotifier'
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### ParameterHidingMemberVariable
Parameter `from` hides field in class 'Edge'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	private final Node from, to;
	
	private Edge(Node from, Node to) {
		this.from = from;
		this.to = to;
```

### ParameterHidingMemberVariable
Parameter `to` hides field in class 'Edge'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	private final Node from, to;
	
	private Edge(Node from, Node to) {
		this.from = from;
		this.to = to;
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'CronCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	private final ChrislieDispatcher.CommandParse commandParse;
	
	public CronCommandMessage(ChrislieUser user, ChrislieChannel channel, String message, ChrislieDispatcher.CommandParse commandParse) {
		this.user = user;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'CronCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	private final ChrislieDispatcher.CommandParse commandParse;
	
	public CronCommandMessage(ChrislieUser user, ChrislieChannel channel, String message, ChrislieDispatcher.CommandParse commandParse) {
		this.user = user;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `message` hides field in class 'CronCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	private final ChrislieDispatcher.CommandParse commandParse;
	
	public CronCommandMessage(ChrislieUser user, ChrislieChannel channel, String message, ChrislieDispatcher.CommandParse commandParse) {
		this.user = user;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `commandParse` hides field in class 'CronCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	private final ChrislieDispatcher.CommandParse commandParse;
	
	public CronCommandMessage(ChrislieUser user, ChrislieChannel channel, String message, ChrislieDispatcher.CommandParse commandParse) {
		this.user = user;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'ChannelSelector'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/ChannelSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieChannel channel) {
		return channel.identifier().equalsIgnoreCase(this.channel);
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'QwantSearchCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
```

### ParameterHidingMemberVariable
Parameter `from` hides field in class 'FlowQuery'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	private final Node from, to;
	
	private FlowQuery(Node from, Node to) {
		this.from = from;
		this.to = to;
```

### ParameterHidingMemberVariable
Parameter `to` hides field in class 'FlowQuery'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/FlowQuery.java`
#### Snippet
```java
	private final Node from, to;
	
	private FlowQuery(Node from, Node to) {
		this.from = from;
		this.to = to;
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'UserExistsInChannel'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserExistsInChannel.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieUser user) {
		return user.identifier().equals(this.user);
	}
```

### ParameterHidingMemberVariable
Parameter `name` hides field in class 'ChrislieGroup'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
		this.name = name;
		this.flexConf = flexConf;
```

### ParameterHidingMemberVariable
Parameter `flexConf` hides field in class 'ChrislieGroup'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
		this.name = name;
		this.flexConf = flexConf;
```

### ParameterHidingMemberVariable
Parameter `includes` hides field in class 'ChrislieGroup'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
		this.name = name;
		this.flexConf = flexConf;
```

### ParameterHidingMemberVariable
Parameter `refs` hides field in class 'ChrislieGroup'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieGroup.java`
#### Snippet
```java
	@Getter @ToString.Exclude private Map<String, ListenerReference> refs;
	
	public ChrislieGroup(String name, FlexConf flexConf, Collection<ChrislieGroup> includes, Collection<ListenerReference> refs) {
		this.name = name;
		this.flexConf = flexConf;
```

### ParameterHidingMemberVariable
Parameter `out` hides field in class 'StaticGenerator'
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	private @NonNull String out;
	
	public StaticGenerator(@NonNull String out) {
		this.out = out;
	}
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public Optional<ChrislieChannel> channel(String identifier) {
		if (identifier.startsWith(PREFIX_GUILD_CHANNEL)) {
			var channel = jda.getGuildChannelById(identifier.substring(PREFIX_GUILD_CHANNEL.length()));
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SuppressWarnings("ThisEscapedInObjectConstruction")
	public DiscordService(Chrisliebot bot, JDA jda, String identifier, boolean updateSlashCommands) {
		this.bot = bot;
		this.jda = jda;
```

### ParameterHidingMemberVariable
Parameter `jda` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SuppressWarnings("ThisEscapedInObjectConstruction")
	public DiscordService(Chrisliebot bot, JDA jda, String identifier, boolean updateSlashCommands) {
		this.bot = bot;
		this.jda = jda;
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SuppressWarnings("ThisEscapedInObjectConstruction")
	public DiscordService(Chrisliebot bot, JDA jda, String identifier, boolean updateSlashCommands) {
		this.bot = bot;
		this.jda = jda;
```

### ParameterHidingMemberVariable
Parameter `updateSlashCommands` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SuppressWarnings("ThisEscapedInObjectConstruction")
	public DiscordService(Chrisliebot bot, JDA jda, String identifier, boolean updateSlashCommands) {
		this.bot = bot;
		this.jda = jda;
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordUser> user(String identifier) {
		User user = jda.getUserById(identifier);
		return user == null ? Optional.empty() : Optional.of(new DiscordUser(this, user));
```

### ParameterHidingMemberVariable
Parameter `ctxResolver` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public void announceResolver(@NonNull ContextResolver ctxResolver) {
		this.ctxResolver = ctxResolver;
		
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'DiscordService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@Override
	public Optional<DiscordGuild> guild(String identifier) {
		return Optional.ofNullable(jda.getGuildById(identifier))
				.map(guild -> new DiscordGuild(this, guild));
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Getter private DiscordChannel channel;
	
	public DiscordMessage(@NonNull DiscordService service, @NonNull MessageReceivedEvent ev) {
		this.service = service;
		this.ev = ev;
```

### ParameterHidingMemberVariable
Parameter `ev` hides field in class 'DiscordMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordMessage.java`
#### Snippet
```java
	@Getter private DiscordChannel channel;
	
	public DiscordMessage(@NonNull DiscordService service, @NonNull MessageReceivedEvent ev) {
		this.service = service;
		this.ev = ev;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'IrcMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	@Getter private String message;
	
	public IrcMessage(@NonNull IrcService service,
					  @NonNull IrcUser user,
					  @NonNull ChrislieChannel channel,
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'IrcMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	
	public IrcMessage(@NonNull IrcService service,
					  @NonNull IrcUser user,
					  @NonNull ChrislieChannel channel,
					  @NonNull String message) {
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'IrcMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
	public IrcMessage(@NonNull IrcService service,
					  @NonNull IrcUser user,
					  @NonNull ChrislieChannel channel,
					  @NonNull String message) {
		this.service = service;
```

### ParameterHidingMemberVariable
Parameter `message` hides field in class 'IrcMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcMessage.java`
#### Snippet
```java
					  @NonNull IrcUser user,
					  @NonNull ChrislieChannel channel,
					  @NonNull String message) {
		this.service = service;
		this.user = user;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'IrcChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	private IrcGuild guild;
	
	public IrcChannel(IrcService service, Channel channel, IrcGuild guild) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'IrcChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	private IrcGuild guild;
	
	public IrcChannel(IrcService service, Channel channel, IrcGuild guild) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `guild` hides field in class 'IrcChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
	private IrcGuild guild;
	
	public IrcChannel(IrcService service, Channel channel, IrcGuild guild) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `parser` hides field in class 'OptionsMap'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @throws ChrislieParser.ParserException If the short code is unkown or EOF is reached.
	 */
	private boolean parseShort(ChrislieParser parser) throws ChrislieParser.ParserException {
		var fork = parser.fork(); // fork so we can accurately point to parsing error
		String c = fork.codepoint().consume().expect("short option name");
```

### ParameterHidingMemberVariable
Parameter `parser` hides field in class 'OptionsMap'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	}
	
	private void parseLong(ChrislieParser parser) throws ChrislieParser.ParserException {
		var fork = parser.fork();
		
```

### ParameterHidingMemberVariable
Parameter `parser` hides field in class 'OptionsMap'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		@Override
		public void visit(ChrislieParser parser) throws ChrislieParser.ParserException, OptionsMapException {
			if (value.isPresent())
				throw new OptionsMapException("option has already been set");
```

### ParameterHidingMemberVariable
Parameter `selector` hides field in class 'Option'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
			this.selector = selector;
		}
```

### ParameterHidingMemberVariable
Parameter `parser` hides field in class 'OptionsMap'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		
		@Override
		public void visit(ChrislieParser parser) throws OptionsMapException {
			if (value)
				throw new OptionsMapException("flag has already been set");
```

### ParameterHidingMemberVariable
Parameter `parser` hides field in class 'OptionsMap'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @param parser The parser that this OptionsMap will operate on.
	 */
	protected OptionsMap(@NonNull ChrislieParser parser) {
		this.parser = parser;
	}
```

### ParameterHidingMemberVariable
Parameter `dataSource` hides field in class 'IrcToSqlLogger'
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	private final String identifier;
	
	public IrcToSqlLogger(@NonNull DataSource dataSource, @NonNull String identifier) {
		this.dataSource = dataSource;
		this.identifier = identifier;
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'IrcToSqlLogger'
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	private final String identifier;
	
	public IrcToSqlLogger(@NonNull DataSource dataSource, @NonNull String identifier) {
		this.dataSource = dataSource;
		this.identifier = identifier;
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'CronListener'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		for (var entry : config.entries) {
			queueRun(entry);
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'CronListener'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		for (var entry : config.entries) {
			queueRun(entry);
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'CronListener'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		executorService = bot.sharedResources().timer();
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'CronListener'
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		executorService = bot.sharedResources().timer();
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'IrcDropAccountCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.resolver = resolver;
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'MensaCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) {
		this.bot = bot;
		updateService = new BetterScheduledService(this::update,
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'MensaCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void start(Chrisliebot bot, ContextResolver resolver) {
		updateService.startAsync().awaitRunning();
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'MensaCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) {
		updateService.stopAsync().awaitTerminated();
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'SpecialChannel'
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		predicates = new ArrayList<>();
```

### ParameterHidingMemberVariable
Parameter `cronDefinition` hides field in class 'CronTypeAdapter'
in `src/main/java/chrisliebaer/chrisliebot/util/typeadapter/CronTypeAdapter.java`
#### Snippet
```java
	private final CronDefinition cronDefinition;
	
	public CronTypeAdapter(@NonNull CronDefinition cronDefinition) {
		this.cronDefinition = cronDefinition;
	}
```

### ParameterHidingMemberVariable
Parameter `selectors` hides field in class 'CombinationSelector'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	protected CombinationSelector(List<Selector> selectors, Operation operation) {
		Preconditions.checkArgument(!selectors.isEmpty(), "selector list must no be empty");
		
```

### ParameterHidingMemberVariable
Parameter `operation` hides field in class 'CombinationSelector'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/CombinationSelector.java`
#### Snippet
```java
	}
	
	protected CombinationSelector(List<Selector> selectors, Operation operation) {
		Preconditions.checkArgument(!selectors.isEmpty(), "selector list must no be empty");
		
```

### ParameterHidingMemberVariable
Parameter `url` hides field in class 'GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@SneakyThrows
	public GenericUrlPreview(@NonNull URL url, ChrislieListener.ListenerMessage m, Set<UrlPreviewListener.HistoryEntry> titleHistory) {
		this.url = url;
		this.m = m;
```

### ParameterHidingMemberVariable
Parameter `m` hides field in class 'GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@SneakyThrows
	public GenericUrlPreview(@NonNull URL url, ChrislieListener.ListenerMessage m, Set<UrlPreviewListener.HistoryEntry> titleHistory) {
		this.url = url;
		this.m = m;
```

### ParameterHidingMemberVariable
Parameter `titleHistory` hides field in class 'GenericUrlPreview'
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/GenericUrlPreview.java`
#### Snippet
```java
	
	@SneakyThrows
	public GenericUrlPreview(@NonNull URL url, ChrislieListener.ListenerMessage m, Set<UrlPreviewListener.HistoryEntry> titleHistory) {
		this.url = url;
		this.m = m;
```

### ParameterHidingMemberVariable
Parameter `parser` hides field in class 'TokenSelector'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
	}
	
	private OptionalToken runParser(ChrislieParser parser) {
		var fork = parser.fork(); // we fork, so we can put the original position into an exception
		try {
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Getter private User user;
	
	public DiscordUser(@NonNull DiscordService service, @NonNull User user) {
		this.service = service;
		this.user = user;
```

### ParameterHidingMemberVariable
Parameter `user` hides field in class 'DiscordUser'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
	@Getter private User user;
	
	public DiscordUser(@NonNull DiscordService service, @NonNull User user) {
		this.service = service;
		this.user = user;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordGuildChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Getter private TextChannel channel;
	
	public DiscordGuildChannel(@NonNull DiscordService service, @NonNull TextChannel channel) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'DiscordGuildChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordGuildChannel.java`
#### Snippet
```java
	@Getter private TextChannel channel;
	
	public DiscordGuildChannel(@NonNull DiscordService service, @NonNull TextChannel channel) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `edges` hides field in class 'MaxFlowSolver'
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/MaxFlowSolver.java`
#### Snippet
```java
	private final Map<Edge, Integer> edges = new HashMap<>();
	
	private MaxFlowSolver(Map<Edge, Integer> edges) {
		this.edges.putAll(edges);
	}
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'IrcGuild'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	private List<Channel> channels;
	
	public IrcGuild(IrcService service, String identifier, List<Channel> channels) {
		this.service = service;
		this.identifier = identifier;
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'IrcGuild'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	private List<Channel> channels;
	
	public IrcGuild(IrcService service, String identifier, List<Channel> channels) {
		this.service = service;
		this.identifier = identifier;
```

### ParameterHidingMemberVariable
Parameter `channels` hides field in class 'IrcGuild'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcGuild.java`
#### Snippet
```java
	private List<Channel> channels;
	
	public IrcGuild(IrcService service, String identifier, List<Channel> channels) {
		this.service = service;
		this.identifier = identifier;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordChannelOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
	private MessageAction messageAction;
	
	public DiscordChannelOutput(@NonNull DiscordService service, @NonNull MessageChannel channel) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'DiscordChannelOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
	private MessageAction messageAction;
	
	public DiscordChannelOutput(@NonNull DiscordService service, @NonNull MessageChannel channel) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordChannelOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
	}
	
	public DiscordChannelOutput(@NonNull DiscordService service, @NonNull MessageChannel channel, @NonNull DiscordMessage source) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'DiscordChannelOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
	}
	
	public DiscordChannelOutput(@NonNull DiscordService service, @NonNull MessageChannel channel, @NonNull DiscordMessage source) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `source` hides field in class 'DiscordChannelOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
	}
	
	public DiscordChannelOutput(@NonNull DiscordService service, @NonNull MessageChannel channel, @NonNull DiscordMessage source) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `escaper` hides field in class 'PlainOutputImpl'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private List<Supplier<String>> calls = new ArrayList<>();
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
						   @NonNull BiFunction<Object, String, String> formatResolver) {
		this.escaper = escaper;
```

### ParameterHidingMemberVariable
Parameter `formatResolver` hides field in class 'PlainOutputImpl'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	public PlainOutputImpl(@NonNull Function<String, String> escaper,
						   @NonNull BiFunction<Object, String, String> formatResolver) {
		this.escaper = escaper;
		this.formatResolver = formatResolver;
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		
		// while refresh timer could take care of that, we do it here to provide exception handling to chrisliebot framework
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		
		// while refresh timer could take care of that, we do it here to provide exception handling to chrisliebot framework
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		shutdown = true;
		
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		shutdown = true;
		
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.dataSource = bot.sharedResources().dataSource();
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'TimerCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.dataSource = bot.sharedResources().dataSource();
```

### ParameterHidingMemberVariable
Parameter `guild` hides field in class 'GuildSelector'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieGuild guild) {
		return this.guild.identifier().equals(guild.identifier());
	}
```

### ParameterHidingMemberVariable
Parameter `guild` hides field in class 'GuildSelector'
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	private final ChrislieGuild guild;
	
	public GuildSelector(@NonNull ChrislieGuild guild) {
		this.guild = guild;
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		// initial request gets most recent posts timestamp
		try {
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		// initial request gets most recent posts timestamp
		try {
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		feedUpdate.stopAsync().awaitTerminated();
	}
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'RedditListener'
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		feedUpdate.stopAsync().awaitTerminated();
	}
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcGuild> guild(String identifier) {
		
		var patterns = guildMap.get(identifier);
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public Optional<? extends ChrislieChannel> channel(String identifier) {
		
		var prefixes = client.getServerInfo().getChannelPrefixes();
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> user(String identifier) {
		return userByPrefixedIdentifier(identifier).map(user -> new IrcUser(this, user));
	}
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	public IrcService(@NonNull Chrisliebot bot, @NonNull Client client, @NonNull String identifier, Multimap<String, Pattern> guildMap, Set<String> ignore) {
		this.bot = bot;
		this.client = client;
```

### ParameterHidingMemberVariable
Parameter `client` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	public IrcService(@NonNull Chrisliebot bot, @NonNull Client client, @NonNull String identifier, Multimap<String, Pattern> guildMap, Set<String> ignore) {
		this.bot = bot;
		this.client = client;
```

### ParameterHidingMemberVariable
Parameter `identifier` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	public IrcService(@NonNull Chrisliebot bot, @NonNull Client client, @NonNull String identifier, Multimap<String, Pattern> guildMap, Set<String> ignore) {
		this.bot = bot;
		this.client = client;
```

### ParameterHidingMemberVariable
Parameter `guildMap` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	public IrcService(@NonNull Chrisliebot bot, @NonNull Client client, @NonNull String identifier, Multimap<String, Pattern> guildMap, Set<String> ignore) {
		this.bot = bot;
		this.client = client;
```

### ParameterHidingMemberVariable
Parameter `ignore` hides field in class 'IrcService'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	@Setter private Consumer<ChrislieMessage> sink;
	
	public IrcService(@NonNull Chrisliebot bot, @NonNull Client client, @NonNull String identifier, Multimap<String, Pattern> guildMap, Set<String> ignore) {
		this.bot = bot;
		this.client = client;
```

### ParameterHidingMemberVariable
Parameter `arg` hides field in class 'Invocation'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		
		
		public Invocation arg(@NonNull String arg) {
			return new Invocation(
					exceptionHandler(),
```

### ParameterHidingMemberVariable
Parameter `arg` hides field in class 'Invocation'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
						  @NonNull ListenerReference ref,
						  @NonNull ChrislieContext ctx,
						  @NonNull String arg,
						  @NonNull String alias) {
			super(exceptionHandler, bot, msg, ref, ctx);
```

### ParameterHidingMemberVariable
Parameter `alias` hides field in class 'Invocation'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
						  @NonNull ChrislieContext ctx,
						  @NonNull String arg,
						  @NonNull String alias) {
			super(exceptionHandler, bot, msg, ref, ctx);
			this.arg = arg;
```

### ParameterHidingMemberVariable
Parameter `exceptionHandler` hides field in class 'ListenerMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	public static class ListenerMessage implements ServiceAttached {
		
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
							   @NonNull Chrisliebot bot,
							   @NonNull ChrislieMessage msg,
```

### ParameterHidingMemberVariable
Parameter `bot` hides field in class 'ListenerMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
							   @NonNull Chrisliebot bot,
							   @NonNull ChrislieMessage msg,
							   @NonNull ListenerReference ref,
```

### ParameterHidingMemberVariable
Parameter `msg` hides field in class 'ListenerMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
		public ListenerMessage(@NonNull ExceptionHandler exceptionHandler,
							   @NonNull Chrisliebot bot,
							   @NonNull ChrislieMessage msg,
							   @NonNull ListenerReference ref,
							   @NonNull ChrislieContext ctx) {
```

### ParameterHidingMemberVariable
Parameter `ref` hides field in class 'ListenerMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
							   @NonNull Chrisliebot bot,
							   @NonNull ChrislieMessage msg,
							   @NonNull ListenerReference ref,
							   @NonNull ChrislieContext ctx) {
			this.exceptionHandler = exceptionHandler;
```

### ParameterHidingMemberVariable
Parameter `ctx` hides field in class 'ListenerMessage'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
							   @NonNull ChrislieMessage msg,
							   @NonNull ListenerReference ref,
							   @NonNull ChrislieContext ctx) {
			this.exceptionHandler = exceptionHandler;
			this.bot = bot;
```

### ParameterHidingMemberVariable
Parameter `escaper` hides field in class 'IrcOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	};
	
	public IrcOutput(@NonNull Function<String, String> escaper, @NonNull Consumer<String> sink) {
		this.escaper = escaper;
		this.sink = sink;
```

### ParameterHidingMemberVariable
Parameter `sink` hides field in class 'IrcOutput'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcOutput.java`
#### Snippet
```java
	};
	
	public IrcOutput(@NonNull Function<String, String> escaper, @NonNull Consumer<String> sink) {
		this.escaper = escaper;
		this.sink = sink;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordSlashCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	private final ChrislieDispatcher.CommandParse parse;
	
	public DiscordSlashCommandMessage(@NonNull DiscordService service, @NonNull SlashCommandEvent ev) {
		this.service = service;
		this.ev = ev;
```

### ParameterHidingMemberVariable
Parameter `ev` hides field in class 'DiscordSlashCommandMessage'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
	private final ChrislieDispatcher.CommandParse parse;
	
	public DiscordSlashCommandMessage(@NonNull DiscordService service, @NonNull SlashCommandEvent ev) {
		this.service = service;
		this.ev = ev;
```

### ParameterHidingMemberVariable
Parameter `gson` hides field in class 'ShellCommand'
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		cfg = gson.fromJson(json, Config.class);
	}
```

### ParameterHidingMemberVariable
Parameter `dataSource` hides field in class 'SharedResources'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	private MariaDbPoolDataSource dataSource;
	
	public SharedResources(@NonNull String dataSource, @NonNull GsonValidator gson) throws SQLException {
		this.dataSource = new MariaDbPoolDataSource(dataSource);
		this.gson = gson;
```

### ParameterHidingMemberVariable
Parameter `gson` hides field in class 'SharedResources'
in `src/main/java/chrisliebaer/chrisliebot/SharedResources.java`
#### Snippet
```java
	private MariaDbPoolDataSource dataSource;
	
	public SharedResources(@NonNull String dataSource, @NonNull GsonValidator gson) throws SQLException {
		this.dataSource = new MariaDbPoolDataSource(dataSource);
		this.gson = gson;
```

### ParameterHidingMemberVariable
Parameter `chrisliebot` hides field in class 'ChrislieDispatcher'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	private ContextResolver resolver;
	
	public ChrislieDispatcher(@NonNull Chrisliebot chrisliebot, @NonNull ContextResolver resolver) {
		this.chrisliebot = chrisliebot;
		this.resolver = resolver;
```

### ParameterHidingMemberVariable
Parameter `resolver` hides field in class 'ChrislieDispatcher'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
	private ContextResolver resolver;
	
	public ChrislieDispatcher(@NonNull Chrisliebot chrisliebot, @NonNull ContextResolver resolver) {
		this.chrisliebot = chrisliebot;
		this.resolver = resolver;
```

### ParameterHidingMemberVariable
Parameter `mappings` hides field in class 'ContextResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/ContextResolver.java`
#### Snippet
```java
	@Getter private Set<ChrislieListener.Envelope> envelopes;
	
	public ContextResolver(@NonNull List<ScopeMapping> mappings) {
		this.mappings = Collections.unmodifiableList(mappings);
		
```

### ParameterHidingMemberVariable
Parameter `type` hides field in class 'QwantResult'
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			
			// web type search returns a bunch of bullshit typed json, so we fix that
			public List<QwantItem> getItemsAndUnfuckMess(GsonValidator gson, Type type) {
				if (items == null || items.isJsonNull()) {
					return List.of();
```

### ParameterHidingMemberVariable
Parameter `fn` hides field in class 'ErrorOutputBuilder'
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	private OutputFunction fn;
	
	private ErrorOutputBuilder fn(OutputFunction fn) {
		this.fn = fn;
		return this;
```

### ParameterHidingMemberVariable
Parameter `idx` hides field in class 'ChrislieParser'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @param idx The offset in codepoints.
	 */
	public ChrislieParser(@NonNull String s, int idx) {
		codepoints = s.substring(idx).codePoints().toArray();
	}
```

### ParameterHidingMemberVariable
Parameter `idx` hides field in class 'ChrislieParser'
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	}
	
	private void idx(int idx) {
		Preconditions.checkElementIndex(idx, codepoints.length);
		this.idx = idx;
```

### ParameterHidingMemberVariable
Parameter `service` hides field in class 'DiscordPrivateChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	private User user;
	
	public DiscordPrivateChannel(@NonNull DiscordService service, @NonNull PrivateChannel channel) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `channel` hides field in class 'DiscordPrivateChannel'
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordPrivateChannel.java`
#### Snippet
```java
	private User user;
	
	public DiscordPrivateChannel(@NonNull DiscordService service, @NonNull PrivateChannel channel) {
		this.service = service;
		this.channel = channel;
```

### ParameterHidingMemberVariable
Parameter `gson` hides field in class 'GsonValidator'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	private final Converter.Factory factory;
	
	public GsonValidator(@NonNull Gson gson, @NonNull Validator validator) {
		this.gson = gson;
		this.validator = validator;
```

### ParameterHidingMemberVariable
Parameter `validator` hides field in class 'GsonValidator'
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	private final Converter.Factory factory;
	
	public GsonValidator(@NonNull Gson gson, @NonNull Validator validator) {
		this.gson = gson;
		this.validator = validator;
```

### ParameterHidingMemberVariable
Parameter `gson` hides field in class 'JsonFlexConfResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private JsonFlexConfResolver(GsonValidator gson, Map<String, JsonElement> map) {
			this.gson = gson;
			this.map = map;
```

### ParameterHidingMemberVariable
Parameter `map` hides field in class 'JsonFlexConfResolver'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		private JsonFlexConfResolver(GsonValidator gson, Map<String, JsonElement> map) {
			this.gson = gson;
			this.map = map;
```

### ParameterHidingMemberVariable
Parameter `gson` hides field in class 'Builder'
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		private Map<String, ChrislieGroup> chrislieGroups;
		
		public List<ScopeMapping> instanceScopeMapping(GsonValidator gson) throws ConfigInitializeException {
			this.gson = gson;
			
```

## UseOfAnotherObjectsPrivateField
### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	private static String createIdFromAccountOrFallback(IrcUser ircUser) {
		var user = ircUser.user;
		return user.getAccount().map(s -> IrcService.PREFIX_USER_BY_ACCOUNT + s)
				.orElse(IrcService.PREFIX_USER_BY_NICKNAME + user.getNick());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
			return false;
		IrcUser ircUser = (IrcUser) o;
		return user.equals(ircUser.user);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcUser.java`
#### Snippet
```java
	
	private static String createIdFromNickIgnoreAccount(IrcUser ircUser) {
		return IrcService.PREFIX_USER_BY_NICKNAME + ircUser.user.getNick();
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `offset` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
	public static LimiterConfig of(FlexConf flex) throws ChrislieListener.ListenerException {
		var cfg = new LimiterConfig();
		cfg.offset = flex.getInteger(FLEX_OFFSET).orElse(0);
		cfg.maxLines = flex.getIntegerOrFail(FLEX_MAX_LINES);
		cfg.stripLineBreak = flex.isSet(FLEX_STRIP_LINEBREAK);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `maxLines` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		var cfg = new LimiterConfig();
		cfg.offset = flex.getInteger(FLEX_OFFSET).orElse(0);
		cfg.maxLines = flex.getIntegerOrFail(FLEX_MAX_LINES);
		cfg.stripLineBreak = flex.isSet(FLEX_STRIP_LINEBREAK);
		cfg.appendCutNotice = flex.isSet(FLEX_CUT_NOTICE);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `stripLineBreak` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		cfg.offset = flex.getInteger(FLEX_OFFSET).orElse(0);
		cfg.maxLines = flex.getIntegerOrFail(FLEX_MAX_LINES);
		cfg.stripLineBreak = flex.isSet(FLEX_STRIP_LINEBREAK);
		cfg.appendCutNotice = flex.isSet(FLEX_CUT_NOTICE);
		cfg.stripIrcFormatting = flex.isSet(FLEX_STRIP_IRC_FORMATTING);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `appendCutNotice` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		cfg.maxLines = flex.getIntegerOrFail(FLEX_MAX_LINES);
		cfg.stripLineBreak = flex.isSet(FLEX_STRIP_LINEBREAK);
		cfg.appendCutNotice = flex.isSet(FLEX_CUT_NOTICE);
		cfg.stripIrcFormatting = flex.isSet(FLEX_STRIP_IRC_FORMATTING);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `stripIrcFormatting` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		cfg.stripLineBreak = flex.isSet(FLEX_STRIP_LINEBREAK);
		cfg.appendCutNotice = flex.isSet(FLEX_CUT_NOTICE);
		cfg.stripIrcFormatting = flex.isSet(FLEX_STRIP_IRC_FORMATTING);
		
		if (!flex.isSet(FLEX_OUT_OF_BAND_DISABLE))
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `outOfBand` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/LimiterConfig.java`
#### Snippet
```java
		
		if (!flex.isSet(FLEX_OUT_OF_BAND_DISABLE))
			cfg.outOfBand = flex.get(FLEX_OUT_OF_BAND, OutOfBandTransmission.class).orElse(null);
		
		return cfg;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resolver` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
			@Override
			public Optional<Object> get(String key, Type type) {
				return o.resolver.get(key, type);
			}
		});
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resolver` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public FlexConf apply(@NonNull FlexConf o) {
		// this creates a chain of resolver, with the current one being in front
		resolver = new ChainResolver(o.resolver, resolver); // yes, this is the correct parameter order, new one goes first and becomes current
		return this;
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resolver` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
			@Override
			public <V> Optional<V> get(String key, Class<V> clazz) {
				return o.resolver.get(key, clazz);
			}
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resolver` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	public static FlexConf snapshot(FlexConf o) {
		// it's actually enought to just copy the resolver
		return new FlexConf(o.resolver);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `flexConf` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
				// section requires copying, since we can't just take a reference, this would make us modify existing ListenerReferences once we call this method a second time
				// current context flexconfg will be used as a fallback in all listener references but since this flex conf can change multiple times, we use it as a fallback, rather then a snapshot
				super.flexConf = FlexConf.fallback(ChrislieContext.this.flexConf).apply(o.flexConf()); // copies o.flexConf but adds fallback to global context flexConf
				aliasSet = new AliasSet(o.aliasSet());
				return;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `flexConf` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			
			// otherwise we apply both the flex conf and alias set from the other listener context
			super.flexConf.apply(o.flexConf());
			aliasSet.apply(o.aliasSet());
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
			return false;
		IrcPrivateChannel that = (IrcPrivateChannel) o;
		return user.equals(that.user);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `lastId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// twitter4j provides no return value for easy pagination but we don't care about more than 20 tweets
				// also: yes, we need to differentiate here because twitter4j is really broken
				var timeline = sub.lastId == 0 ? twitter.getUserTimeline(sub.userId) :
						twitter.getUserTimeline(sub.userId, new Paging().sinceId(sub.lastId));
				
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `userId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// twitter4j provides no return value for easy pagination but we don't care about more than 20 tweets
				// also: yes, we need to differentiate here because twitter4j is really broken
				var timeline = sub.lastId == 0 ? twitter.getUserTimeline(sub.userId) :
						twitter.getUserTimeline(sub.userId, new Paging().sinceId(sub.lastId));
				
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `userId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// also: yes, we need to differentiate here because twitter4j is really broken
				var timeline = sub.lastId == 0 ? twitter.getUserTimeline(sub.userId) :
						twitter.getUserTimeline(sub.userId, new Paging().sinceId(sub.lastId));
				
				// newest entry is first, we don't want that, so we invert it
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `lastId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// also: yes, we need to differentiate here because twitter4j is really broken
				var timeline = sub.lastId == 0 ? twitter.getUserTimeline(sub.userId) :
						twitter.getUserTimeline(sub.userId, new Paging().sinceId(sub.lastId));
				
				// newest entry is first, we don't want that, so we invert it
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `lastId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		
		// update last id and then post (ensure that we always update id even if output creates explosion
		sub.lastId = tweets.get(tweets.size() - 1).getId();
		
		var maybeChannel = sub.channel.channel(bot);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		sub.lastId = tweets.get(tweets.size() - 1).getId();
		
		var maybeChannel = sub.channel.channel(bot);
		if (maybeChannel.isEmpty()) {
			log.warn("could not find channel for subscription {}", sub);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `screenName` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
			
			// might as well update the account name
			sub.screenName = user.getScreenName();
			
			if (!sub.includeRetweet && tweet.isRetweet())
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `includeRetweet` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
			sub.screenName = user.getScreenName();
			
			if (!sub.includeRetweet && tweet.isRetweet())
				continue;
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `includeReply` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				continue;
			
			if (!sub.includeReply && tweet.getInReplyToScreenName() != null)
				continue;
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `apiKey` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		this.resolver = resolver;
		var config = new ConfigurationBuilder()
				.setOAuthConsumerKey(cfg.apiKey)
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `apiKeySecret` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		var config = new ConfigurationBuilder()
				.setOAuthConsumerKey(cfg.apiKey)
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `accessToken` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				.setOAuthConsumerKey(cfg.apiKey)
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
				.build();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `accessTokenSecret` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				.setOAuthConsumerSecret(cfg.apiKeySecret)
				.setOAuthAccessToken(cfg.accessToken)
				.setOAuthAccessTokenSecret(cfg.accessTokenSecret)
				.build();
		twitter = new TwitterFactory(config).getInstance();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subscriptions` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		
		// we need the account name and the last tweet id, luckily we can do this with a single request per subscrition
		subscriptions = new ArrayList<>(cfg.subscriptions.size());
		var partitions = Lists.partition(cfg.subscriptions, 100); // endpoints allows 100 users per request
		for (var part : partitions) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subscriptions` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		// we need the account name and the last tweet id, luckily we can do this with a single request per subscrition
		subscriptions = new ArrayList<>(cfg.subscriptions.size());
		var partitions = Lists.partition(cfg.subscriptions, 100); // endpoints allows 100 users per request
		for (var part : partitions) {
			try {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `userId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
				// now match requested users to keys in map
				for (TimelineSubscription subscription : part) {
					var result = map.get(subscription.userId);
					if (result == null) {
						log.warn("unknown twitter account: {}", subscription);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `screenName` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
					}
					
					subscription.screenName = result.getScreenName();
					
					// user might not have a status or we are not allowed to access it
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `lastId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
					// user might not have a status or we are not allowed to access it
					var status = result.getStatus();
					subscription.lastId = status == null ? 0 : status.getId();
					
					// only store resolved users and ignore deleted ones
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subscriptions` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
		}
		
		log.debug("will monitor the following subscriptions: {}", cfg.subscriptions);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `from` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull Edge o) {
		var firstComp = from.compareTo(o.from);
		if (firstComp != 0)
			return firstComp;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `to` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Edge.java`
#### Snippet
```java
		if (firstComp != 0)
			return firstComp;
		return to.compareTo(o.to);
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `recruitUrl` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
		reply.description()
				.appendEscape("Du willst mich auf auch auf deinem Server haben? Dann lade mich doch ein: ")
				.append(cfg.recruitUrl);
		reply.send();
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `aliases` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	
	public AliasSet(AliasSet o) {
		aliases = new HashMap<>(o.aliases);
		replace = o.replace;
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `replace` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	public AliasSet(AliasSet o) {
		aliases = new HashMap<>(o.aliases);
		replace = o.replace;
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `exposed` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
				.noneMatch(a -> {
					if (ignoreHidden)
						return a.exposed;
					return false;
				});
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `replace` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
		
		// if the other set is a replacement we simply clear this set before applying changes
		if (o.replace) {
			aliases.clear();
			replace = true; // in order to maintain replacment contract, we need to taint this set as replacement
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `aliases` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
		
		// we simply override existing entries with entries from the other alias set
		aliases.putAll(o.aliases);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `add` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
	public Map<String, Alias> get() {
		return aliases.entrySet().stream()
				.filter(e -> e.getValue().add) // remove if add is false
				.map(e -> new Alias(e.getKey(), e.getValue().exposed))
				.collect(Collectors.toUnmodifiableMap(Alias::name, Function.identity()));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `exposed` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/AliasSet.java`
#### Snippet
```java
		return aliases.entrySet().stream()
				.filter(e -> e.getValue().add) // remove if add is false
				.map(e -> new Alias(e.getKey(), e.getValue().exposed))
				.collect(Collectors.toUnmodifiableMap(Alias::name, Function.identity()));
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `output` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		});
		
		cfg.output.apply(reply, strSub::replace);
		reply.send();
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `type` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				}
				assert body != null; // shut up about body being null, it can't
				List<QwantResponse.QwantItem> items = body.items(bot.sharedResources().gson(), cfg.type);
				if (items == null || items.isEmpty()) {
					ERROR_NO_MATCH.write(reply).send();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `randomize` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
				}
				
				if (cfg.randomize)
					Collections.shuffle(items);
				
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resultTimeout` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
				.expireAfterAccess(cfg.resultTimeout, TimeUnit.MILLISECONDS)
				.build();
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `captchaUrl` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		service = retrofit.create(QwantService.class);
		
		errorRateLimited = ErrorOutputBuilder.generic(out -> out.appendEscape("Ich wurde ausgesperrt. Bitte hilf mir: ").append(cfg.captchaUrl));
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `count` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		var safeSearch = FLEX_SAFE_SEARCH.getOrFail(invc);
		Call<QwantResponse> call = service.search(query, safeSearch, cfg.count, cfg.type);
		call.enqueue(new Callback<>() {
			@Override
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `type` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		var safeSearch = FLEX_SAFE_SEARCH.getOrFail(invc);
		Call<QwantResponse> call = service.search(query, safeSearch, cfg.count, cfg.type);
		call.enqueue(new Callback<>() {
			@Override
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `hashSalt` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		var filename = attachment.getFileName();
		
		var hashInput = "%s/%s/%s%s".formatted(msg.getChannel().getId(), attachment.getId(), filename, cfg.hashSalt);
		var hash = digest.digest(hashInput.getBytes(StandardCharsets.UTF_8));
		var test = Arrays.copyOf(hash, cfg.hashLength);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `hashLength` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		var hashInput = "%s/%s/%s%s".formatted(msg.getChannel().getId(), attachment.getId(), filename, cfg.hashSalt);
		var hash = digest.digest(hashInput.getBytes(StandardCharsets.UTF_8));
		var test = Arrays.copyOf(hash, cfg.hashLength);
		
		return "%s%s/%s/%s/%s".formatted(
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `baseUrl` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		
		return "%s%s/%s/%s/%s".formatted(
				cfg.baseUrl,
				base64UrlEncode(long2byte(msg.getChannel().getIdLong())),
				base64UrlEncode(long2byte(attachment.getIdLong())),
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `hashLength` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
				base64UrlEncode(long2byte(attachment.getIdLong())),
				base64UrlEncode(filename.getBytes(StandardCharsets.UTF_8)),
				base64UrlEncode(Arrays.copyOf(hash, cfg.hashLength))
		);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `search` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	
	public FileGenerator(@NonNull Config cfg) throws ChrislieListener.ListenerException {
		search = cfg.search;
		file = new File(cfg.file);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `file` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	public FileGenerator(@NonNull Config cfg) throws ChrislieListener.ListenerException {
		search = cfg.search;
		file = new File(cfg.file);
		
		if (!file.canRead())
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `latch` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		// wait for shutdown event to occur
		try {
			helper.latch.await();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcChannel.java`
#### Snippet
```java
			return false;
		IrcChannel that = (IrcChannel) o;
		return Objects.equal(channel, that.channel);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `exitCode` of another object
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
			public void terminated(State from) {
				log.info("Chrisliebot has terminated (was {})", from);
				System.exit(bot.exitCode);
			}
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `entries` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		for (var entry : config.entries) {
			queueRun(entry);
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `entries` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		}
		
		log.info("loaded {} cron entries", config.entries.size());
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `zoneId` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	private void queueRun(CronEntry entry) {
		var now = ZonedDateTime.now(config.zoneId);
		var executionTime = ExecutionTime.forCron(entry.cron);
		var maybeDuration = executionTime.timeToNextExecution(now);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `cron` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	private void queueRun(CronEntry entry) {
		var now = ZonedDateTime.now(config.zoneId);
		var executionTime = ExecutionTime.forCron(entry.cron);
		var maybeDuration = executionTime.timeToNextExecution(now);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	private void executeCron(CronEntry entry) {
		var maybeChannel = entry.channel.channel(bot);
		if (maybeChannel.isPresent()) {
			var channel = maybeChannel.get();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `msg` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
		if (maybeChannel.isPresent()) {
			var channel = maybeChannel.get();
			var message = new CronCommandMessage(channel.service().botUser(), channel, entry.msg, entry.asParse());
			bot.dispatcher().dispatch(message);
		} else {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `timestamp` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		@Override
		public int compareTo(MensaRecord o) {
			return Long.signum(timestamp - o.timestamp);
		}
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `records` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		if (maybeDay.isEmpty()) {
			// find last day with information
			var lastDay = new Date(mensa.records().get(mensa.records.size() - 1).timestamp);
			
			if (!isCron)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `timestamp` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		if (maybeDay.isEmpty()) {
			// find last day with information
			var lastDay = new Date(mensa.records().get(mensa.records.size() - 1).timestamp);
			
			if (!isCron)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		for (MensaLine line : day.lines()) {
			// skip lines on ignore list
			if (ignoreLines.contains(mensa.name + "." + line.name))
				continue;
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		for (MensaLine line : day.lines()) {
			// skip lines on ignore list
			if (ignoreLines.contains(mensa.name + "." + line.name))
				continue;
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `timestamp` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		// inform user if we have skipped to the next available day
		// may override symbol table, but who cares
		if (day.timestamp != timestamp) {
			reply.footer("??VORSICHT: Ich habe f?r dich den n?chsten m?glichen Tag ausgew?hlt.");
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `username` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	private synchronized void update() {
		try {
			String credentials = Credentials.basic(cfg.username, cfg.password);
			Call<MensaApiMeta> metaReq = service.getMeta(credentials);
			Call<JsonElement> canteensReq = service.getCanteen(credentials);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `password` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	private synchronized void update() {
		try {
			String credentials = Credentials.basic(cfg.username, cfg.password);
			Call<MensaApiMeta> metaReq = service.getMeta(credentials);
			Call<JsonElement> canteensReq = service.getCanteen(credentials);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `updateInterval` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		this.bot = bot;
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval, TimeUnit.MILLISECONDS));
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(MensaApiService.MENSA_BASE_URL)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `whitelist` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		// ignore member on whitelist
		for (Role role : ev.getMember().getRoles()) {
			if (cfg.whitelist.contains(role.getIdLong())) {
				return;
			}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `match` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		boolean match;
		if (cfg.match == Match.ANY_MATCH)
			match = predicates.stream().anyMatch(p -> p.test(ev.getMessage()));
		else if (cfg.match == Match.ALL_MATCH)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `match` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		if (cfg.match == Match.ANY_MATCH)
			match = predicates.stream().anyMatch(p -> p.test(ev.getMessage()));
		else if (cfg.match == Match.ALL_MATCH)
			match = predicates.stream().allMatch(p -> p.test(ev.getMessage()));
		else
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `mode` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			throw new Error("match state is not set");
		
		if (match ? cfg.mode == Mode.DENY : cfg.mode == Mode.ALLOW) {
			// delete message
			message.ev().getMessage().delete().queue();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `mode` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			throw new Error("match state is not set");
		
		if (match ? cfg.mode == Mode.DENY : cfg.mode == Mode.ALLOW) {
			// delete message
			message.ev().getMessage().delete().queue();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `output` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
				default -> key;
			});
			var out = (DiscordChannelOutput) cfg.output.apply(
					cfg.sendDm ?
							new DiscordChannelOutput(message.service(), ev.getAuthor().openPrivateChannel().complete())
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `sendDm` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			});
			var out = (DiscordChannelOutput) cfg.output.apply(
					cfg.sendDm ?
							new DiscordChannelOutput(message.service(), ev.getAuthor().openPrivateChannel().complete())
							: msg.reply(), substitutor::replace);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleteAfter` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			var future = out.discordSend();
			
			if (cfg.deleteAfter > 0 && !cfg.sendDm) {
				// register listener to delete message afterwards
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `sendDm` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			var future = out.discordSend();
			
			if (cfg.deleteAfter > 0 && !cfg.sendDm) {
				// register listener to delete message afterwards
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleteAfter` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
				future.thenAccept(m -> bot.sharedResources().timer().schedule(
						() -> m.delete().queue(),
						cfg.deleteAfter, TimeUnit.MILLISECONDS));
			}
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `file` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		predicates = new ArrayList<>();
		
		if (cfg.file)
			predicates.add(message -> !message.getAttachments().isEmpty());
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `link` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			predicates.add(message -> !message.getAttachments().isEmpty());
		
		if (cfg.link)
			predicates.add(message -> {
				var extractor = LinkExtractor.builder().linkTypes(EnumSet.of(LinkType.URL)).build();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `pattern` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
			});
		
		if (cfg.pattern != null)
			predicates.add(message -> cfg.pattern.asPredicate().test(message.getContentRaw()));
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `pattern` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		if (cfg.pattern != null)
			predicates.add(message -> cfg.pattern.asPredicate().test(message.getContentRaw()));
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			
			var r = new ExternalInvocation();
			r.service = m.service().identifier();
			r.user = ExternalUser.of(msg.user());
			r.channel = ExternalChannel.of(msg.channel());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			var r = new ExternalInvocation();
			r.service = m.service().identifier();
			r.user = ExternalUser.of(msg.user());
			r.channel = ExternalChannel.of(msg.channel());
			r.message = msg.message();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			r.service = m.service().identifier();
			r.user = ExternalUser.of(msg.user());
			r.channel = ExternalChannel.of(msg.channel());
			r.message = msg.message();
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `message` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			r.user = ExternalUser.of(msg.user());
			r.channel = ExternalChannel.of(msg.channel());
			r.message = msg.message();
			
			var flex = m.ref().flexConf();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `flex` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			
			var flex = m.ref().flexConf();
			r.flex = new HashMap<>(flexValues.size());
			for (String key : flexValues)
				r.flex.put(key, flex.get(key, JsonElement.class).orElse(null));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `flex` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			r.flex = new HashMap<>(flexValues.size());
			for (String key : flexValues)
				r.flex.put(key, flex.get(key, JsonElement.class).orElse(null));
			
			return r;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `identifier` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		public static ExternalUser of(ChrislieUser u) {
			var r = new ExternalUser();
			r.identifier = u.identifier();
			r.displayName = u.displayName();
			r.mention = u.mention();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `displayName` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			var r = new ExternalUser();
			r.identifier = u.identifier();
			r.displayName = u.displayName();
			r.mention = u.mention();
			return r;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `mention` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			r.identifier = u.identifier();
			r.displayName = u.displayName();
			r.mention = u.mention();
			return r;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `argument` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		public static ExternalInvocation of(ChrislieListener.Invocation invc, Set<String> flexValues) {
			var r = of((ChrislieListener.ListenerMessage) invc, flexValues);
			r.argument = invc.arg();
			r.alias = invc.alias();
			return r;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `alias` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			var r = of((ChrislieListener.ListenerMessage) invc, flexValues);
			r.argument = invc.arg();
			r.alias = invc.alias();
			return r;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `identifier` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		public static ExternalChannel of(ChrislieChannel c) {
			var r = new ExternalChannel();
			r.identifier = c.identifier();
			r.displayName = c.displayName();
			r.isDirectMessage = c.isDirectMessage();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `displayName` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			var r = new ExternalChannel();
			r.identifier = c.identifier();
			r.displayName = c.displayName();
			r.isDirectMessage = c.isDirectMessage();
			// TODO: decide if we really need that
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `isDirectMessage` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			r.identifier = c.identifier();
			r.displayName = c.displayName();
			r.isDirectMessage = c.isDirectMessage();
			// TODO: decide if we really need that
			//r.users = c.users().stream().map(ExternalUser::of).collect(Collectors.toList());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `isNSFW` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			// TODO: decide if we really need that
			//r.users = c.users().stream().map(ExternalUser::of).collect(Collectors.toList());
			r.isNSFW = c.isNSFW();
			r.guild = c.guild().map(ExternalGuild::of).orElse(null);
			return r;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `guild` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			//r.users = c.users().stream().map(ExternalUser::of).collect(Collectors.toList());
			r.isNSFW = c.isNSFW();
			r.guild = c.guild().map(ExternalGuild::of).orElse(null);
			return r;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `identifier` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		public static ExternalGuild of(ChrislieGuild g) {
			var r = new ExternalGuild();
			r.identifier = g.identifier();
			r.displayName = g.displayName();
			return r;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `displayName` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
			var r = new ExternalGuild();
			r.identifier = g.identifier();
			r.displayName = g.displayName();
			return r;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `hostBlacklist` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
			try {
				URL url = new URL(m.substring(link.getBeginIndex(), link.getEndIndex()));
				if (!cfg.hostBlacklist.contains(url.getHost()))
					fetchLink(msg, url);
			} catch (MalformedURLException ignore) {} // don't care about invalid links
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/Node.java`
#### Snippet
```java
	@Override
	public int compareTo(@NotNull Node o) {
		return name.compareTo(o.name);
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `version` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	
	public static String shortVersion() {
		return INSTANCE.version + "@" + INSTANCE.buildTime + " (branch: " + INSTANCE.branch + ") clean: " + INSTANCE.clean;
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `buildTime` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	
	public static String shortVersion() {
		return INSTANCE.version + "@" + INSTANCE.buildTime + " (branch: " + INSTANCE.branch + ") clean: " + INSTANCE.clean;
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `branch` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	
	public static String shortVersion() {
		return INSTANCE.version + "@" + INSTANCE.buildTime + " (branch: " + INSTANCE.branch + ") clean: " + INSTANCE.clean;
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `clean` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	
	public static String shortVersion() {
		return INSTANCE.version + "@" + INSTANCE.buildTime + " (branch: " + INSTANCE.branch + ") clean: " + INSTANCE.clean;
	}
}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `buildTime` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String clean() { return INSTANCE.clean; }
	
	public static String buildTime() { return INSTANCE.buildTime; }
	
	public static String shortVersion() {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `commit` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String version() { return INSTANCE.version; }
	
	public static String commit() { return INSTANCE.commit; }
	
	public static String branch() { return INSTANCE.branch; }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `version` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	}
	
	public static String version() { return INSTANCE.version; }
	
	public static String commit() { return INSTANCE.commit; }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `clean` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String branch() { return INSTANCE.branch; }
	
	public static String clean() { return INSTANCE.clean; }
	
	public static String buildTime() { return INSTANCE.buildTime; }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `branch` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String commit() { return INSTANCE.commit; }
	
	public static String branch() { return INSTANCE.branch; }
	
	public static String clean() { return INSTANCE.clean; }
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordUser.java`
#### Snippet
```java
			return false;
		DiscordUser that = (DiscordUser) o;
		return user.equals(that.user);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `future` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var rt = runtimeTimer.remove(id);
		if (rt != null) {
			rt.future.cancel(false);
			return true;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		// create timer
		TimerInfo timerInfo = new TimerInfo();
		timerInfo.service = message.service().identifier();
		timerInfo.user = message.user().identifier();
		timerInfo.channel = channel.identifier();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		TimerInfo timerInfo = new TimerInfo();
		timerInfo.service = message.service().identifier();
		timerInfo.user = message.user().identifier();
		timerInfo.channel = channel.identifier();
		timerInfo.text = text;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.service = message.service().identifier();
		timerInfo.user = message.user().identifier();
		timerInfo.channel = channel.identifier();
		timerInfo.text = text;
		timerInfo.creation = Instant.now();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `text` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.user = message.user().identifier();
		timerInfo.channel = channel.identifier();
		timerInfo.text = text;
		timerInfo.creation = Instant.now();
		timerInfo.due = due;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `creation` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.channel = channel.identifier();
		timerInfo.text = text;
		timerInfo.creation = Instant.now();
		timerInfo.due = due;
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `due` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.text = text;
		timerInfo.creation = Instant.now();
		timerInfo.due = due;
		
		try {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `prefetchWindow` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, cfg.prefetchWindow / 1000);
			
			try (var rs = stmt.executeQuery()) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		// convert new timers into runtime timers
		timers.removeIf(timerInfo -> runtimeTimer.containsKey(timerInfo.id));
		
		log.trace("found {} new runtime timers", timers.size());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `prefetchInterval` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				log.warn("failed to refresh timers from database", e);
			}
		}, 0, cfg.prefetchInterval, TimeUnit.MILLISECONDS);
		timer.scheduleWithFixedDelay(this::purgeExpired, 0, PURGE_INTERVAL, TimeUnit.MILLISECONDS);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private synchronized void timerDue(TimerInfo timerInfo) throws ListenerException {
		// remove timer from runtime timers, if it fails, the timer was canceled while aquiring synchronisation lock
		if (!removeRuntime(timerInfo.id))
			return;
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			return;
		
		var maybeService = bot.service(timerInfo.service);
		if (maybeService.isEmpty()) {
			log.debug("service unknown, failed to deliver timer {}", timerInfo);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		}
		var service = maybeService.get();
		var maybeUser = service.user(timerInfo.user);
		
		if (maybeUser.isEmpty()) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		// if the original channel is not available, the message will be delivered via dm
		boolean dmRedirected = false;
		var maybeChannel = service.channel(timerInfo.channel);
		if (maybeChannel.isEmpty()
				|| maybeChannel.get().user(user.identifier()).isEmpty()
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			if (maybeChannel.isEmpty()) {
				log.debug("failed to open dm channel, user must have blocked us");
				deleteTimerRecord(timerInfo.id);
				return;
			}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		out.send();
		
		deleteTimerRecord(timerInfo.id);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var guild = channel.guild();
		
		Predicate<TimerInfo> pred = timer -> timer.service.equals(user.service().identifier()) && timer.user.equals(user.identifier());
		
		if (guild.isPresent()) { // if guild is present, we filter by channel guilds
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var guild = channel.guild();
		
		Predicate<TimerInfo> pred = timer -> timer.service.equals(user.service().identifier()) && timer.user.equals(user.identifier());
		
		if (guild.isPresent()) { // if guild is present, we filter by channel guilds
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
					.collect(Collectors.toSet());
			
			pred = pred.and(timer -> guildChannels.contains(timer.channel));
		} else if (!channel.isDirectMessage()) { // if not dm channel, we filter by channel
			pred = pred.and(timer -> channel.identifier().equals(timer.channel));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			pred = pred.and(timer -> guildChannels.contains(timer.channel));
		} else if (!channel.isDirectMessage()) { // if not dm channel, we filter by channel
			pred = pred.and(timer -> channel.identifier().equals(timer.channel));
		}  // otherwise we show user all their timers
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		for (var timer : timerList) {
			var id = encodeTimer(timer.id);
			var abbrev = StringUtils.abbreviate(timer.text, cfg.abbrevLength);
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `text` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		for (var timer : timerList) {
			var id = encodeTimer(timer.id);
			var abbrev = StringUtils.abbreviate(timer.text, cfg.abbrevLength);
			
			joiner.seperator().appendEscape(id, ChrislieFormat.BOLD).appendEscape(": ").appendEscape(abbrev);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `abbrevLength` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		for (var timer : timerList) {
			var id = encodeTimer(timer.id);
			var abbrev = StringUtils.abbreviate(timer.text, cfg.abbrevLength);
			
			joiner.seperator().appendEscape(id, ChrislieFormat.BOLD).appendEscape(": ").appendEscape(abbrev);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `creation` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		var when = timerInfo.nextDue().atZone(zoneId).format(formater);
		var creation = timerInfo.creation.atZone(zoneId).format(formater);
		var id = encodeTimer(timerInfo.id);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var when = timerInfo.nextDue().atZone(zoneId).format(formater);
		var creation = timerInfo.creation.atZone(zoneId).format(formater);
		var id = encodeTimer(timerInfo.id);
		
		var wtf = Duration.between(Instant.now(), timerInfo.nextDue());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var duration = C.format(wtf);
		
		Optional<ChrislieService> service = bot.service(timerInfo.service);
		Optional<ChrislieUser> user = service.flatMap(s -> s.user(timerInfo.user));
		Optional<ChrislieChannel> channel = service.flatMap(s -> s.channel(timerInfo.channel));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		Optional<ChrislieService> service = bot.service(timerInfo.service);
		Optional<ChrislieUser> user = service.flatMap(s -> s.user(timerInfo.user));
		Optional<ChrislieChannel> channel = service.flatMap(s -> s.channel(timerInfo.channel));
		Optional<ChrislieGuild> guild = channel.flatMap(ChrislieChannel::guild);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		Optional<ChrislieService> service = bot.service(timerInfo.service);
		Optional<ChrislieUser> user = service.flatMap(s -> s.user(timerInfo.user));
		Optional<ChrislieChannel> channel = service.flatMap(s -> s.channel(timerInfo.channel));
		Optional<ChrislieGuild> guild = channel.flatMap(ChrislieChannel::guild);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `text` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		Optional<ChrislieGuild> guild = channel.flatMap(ChrislieChannel::guild);
		
		out.description(timerInfo.text);
		out.field("Id", id);
		user.ifPresent(u -> out.field("Besitzer", u.mention()));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `text` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		convert.appendEscapeSub("${title} - ")
				.appendEscape("Text: ")
				.appendEscape(timerInfo.text)
				.appendEscape(", Id: ").appendEscape(id)
				.appendEscape(", Besitzer: ")
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snoozeCount` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			convert.appendEscape(", Dauer: ").appendEscape(duration, ChrislieFormat.HIGHLIGHT);
		
		if (timerInfo.snoozeCount > 0) {
			out.field("Snoozez?hler", String.valueOf(timerInfo.snoozeCount));
			convert.appendEscape(", Snoozez?hler: ").appendEscape(String.valueOf(timerInfo.snoozeCount));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snoozeCount` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		if (timerInfo.snoozeCount > 0) {
			out.field("Snoozez?hler", String.valueOf(timerInfo.snoozeCount));
			convert.appendEscape(", Snoozez?hler: ").appendEscape(String.valueOf(timerInfo.snoozeCount));
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snoozeCount` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		if (timerInfo.snoozeCount > 0) {
			out.field("Snoozez?hler", String.valueOf(timerInfo.snoozeCount));
			convert.appendEscape(", Snoozez?hler: ").appendEscape(String.valueOf(timerInfo.snoozeCount));
		}
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleted` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			// we just fetch the timer and check if the user is allowed to change it, easier then checking inside the query
			var maybeTimerInfo = getTimerFromDb(conn, id).filter(accessPredicate(invc.msg()));
			if (maybeTimerInfo.isEmpty() || maybeTimerInfo.get().deleted) {
				ErrorOutputBuilder.generic(ERROR_TIMER_UNKOWN_OR_RESTRICTED).write(invc).send();
				return;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		
		runtimeTimer.put(timerInfo.id, new ScheduledTimer(timerInfo, task));
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			
			int i = 1;
			stmt.setString(i++, timerInfo.service);
			stmt.setString(i++, timerInfo.user);
			stmt.setString(i++, timerInfo.channel);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			int i = 1;
			stmt.setString(i++, timerInfo.service);
			stmt.setString(i++, timerInfo.user);
			stmt.setString(i++, timerInfo.channel);
			stmt.setString(i++, timerInfo.text);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			stmt.setString(i++, timerInfo.service);
			stmt.setString(i++, timerInfo.user);
			stmt.setString(i++, timerInfo.channel);
			stmt.setString(i++, timerInfo.text);
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `text` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			stmt.setString(i++, timerInfo.user);
			stmt.setString(i++, timerInfo.channel);
			stmt.setString(i++, timerInfo.text);
			
			stmt.setTimestamp(i++, Timestamp.from(timerInfo.creation));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `creation` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			stmt.setString(i++, timerInfo.text);
			
			stmt.setTimestamp(i++, Timestamp.from(timerInfo.creation));
			stmt.setTimestamp(i++, Timestamp.from(timerInfo.due));
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `due` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			
			stmt.setTimestamp(i++, Timestamp.from(timerInfo.creation));
			stmt.setTimestamp(i++, Timestamp.from(timerInfo.due));
			
			if (timerInfo.snooze == null)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snooze` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			stmt.setTimestamp(i++, Timestamp.from(timerInfo.due));
			
			if (timerInfo.snooze == null)
				stmt.setNull(i++, Types.TIMESTAMP);
			else
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snooze` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				stmt.setNull(i++, Types.TIMESTAMP);
			else
				stmt.setTimestamp(i++, Timestamp.from(timerInfo.snooze));
			
			stmt.setInt(i++, timerInfo.snoozeCount);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snoozeCount` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
				stmt.setTimestamp(i++, Timestamp.from(timerInfo.snooze));
			
			stmt.setInt(i++, timerInfo.snoozeCount);
			stmt.setBoolean(i, timerInfo.deleted);
			
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleted` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			
			stmt.setInt(i++, timerInfo.snoozeCount);
			stmt.setBoolean(i, timerInfo.deleted);
			
			stmt.executeUpdate();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			try (var gen = stmt.getGeneratedKeys()) {
				if (gen.next()) {
					timerInfo.id = gen.getLong(1);
				} else {
					throw new SQLException("failed to retrieve timer insert id");
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleted` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		try (var conn = dataSource.getConnection()) {
			var maybeTimerInfo = getTimerFromDb(conn, id).filter(accessPredicate(invc.msg()));
			if (maybeTimerInfo.isEmpty() || maybeTimerInfo.get().deleted) {
				ErrorOutputBuilder.generic(ERROR_TIMER_UNKOWN_OR_RESTRICTED).write(invc).send();
				return;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `future` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		shutdown = true;
		
		runtimeTimer.values().forEach(t -> t.future.cancel(false));
		runtimeTimer.clear(); // clear map so we don't get confused in case we need to debug anything
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `id` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private TimerInfo createTimerInfo(ResultSet rs) throws SQLException {
		TimerInfo timerInfo = new TimerInfo();
		timerInfo.id = rs.getLong("id");
		
		timerInfo.service = rs.getString("service");
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `service` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.id = rs.getLong("id");
		
		timerInfo.service = rs.getString("service");
		timerInfo.user = rs.getString("user");
		timerInfo.channel = rs.getString("channel");
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `user` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		timerInfo.service = rs.getString("service");
		timerInfo.user = rs.getString("user");
		timerInfo.channel = rs.getString("channel");
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.service = rs.getString("service");
		timerInfo.user = rs.getString("user");
		timerInfo.channel = rs.getString("channel");
		
		// janky overflow shit can lead to unix epoch of 0 in DB which will cause jdbc to read "NULL" and lead to NPE, so we use unix_epoch of 1 instead
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `creation` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		// janky overflow shit can lead to unix epoch of 0 in DB which will cause jdbc to read "NULL" and lead to NPE, so we use unix_epoch of 1 instead
		timerInfo.creation = rs.getTimestamp("creation").toInstant();
		timerInfo.due = Objects.requireNonNullElse(rs.getTimestamp("due"), UNIX_EPOCH_SECOND_1).toInstant();
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `due` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		// janky overflow shit can lead to unix epoch of 0 in DB which will cause jdbc to read "NULL" and lead to NPE, so we use unix_epoch of 1 instead
		timerInfo.creation = rs.getTimestamp("creation").toInstant();
		timerInfo.due = Objects.requireNonNullElse(rs.getTimestamp("due"), UNIX_EPOCH_SECOND_1).toInstant();
		
		var timestamp = rs.getTimestamp("snooze");
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snooze` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		var timestamp = rs.getTimestamp("snooze");
		if (timestamp != null)
			timerInfo.snooze = timestamp.toInstant();
		
		timerInfo.snoozeCount = rs.getInt("snoozeCount");
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `snoozeCount` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			timerInfo.snooze = timestamp.toInstant();
		
		timerInfo.snoozeCount = rs.getInt("snoozeCount");
		
		timerInfo.text = rs.getString("text");
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `text` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		timerInfo.snoozeCount = rs.getInt("snoozeCount");
		
		timerInfo.text = rs.getString("text");
		timerInfo.deleted = rs.getBoolean("deleted");
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleted` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		timerInfo.text = rs.getString("text");
		timerInfo.deleted = rs.getBoolean("deleted");
		
		return timerInfo;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `expire` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, cfg.expire / 1000);
			
			var deleted = stmt.executeLargeUpdate();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `deleted` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
			var timerInfo = maybeTimerInfo.get();
			
			if (!timerInfo.deleted) {
				ErrorOutputBuilder.generic("Dieser Timer wurde gar nicht gel?scht.").write(invc).send();
				return;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `channel` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			
			// prepare context for output generation
			var maybeChannel = cfg.channel.channel(bot);
			if (maybeChannel.isEmpty()) {
				log.warn("unable to resolve channel for subreddit: {}", cfg.subreddit);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subreddit` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			var maybeChannel = cfg.channel.channel(bot);
			if (maybeChannel.isEmpty()) {
				log.warn("unable to resolve channel for subreddit: {}", cfg.subreddit);
				return;
			}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subreddit` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			var maybeRef = ctx.listener(this);
			if (maybeRef.isEmpty()) {
				log.warn("listener not present in channel for subreddit: {}", cfg.subreddit);
				return;
			}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subreddit` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			
		} catch (Exception e) {
			log.warn("failed to feed feed for subreddit: {}", cfg.subreddit, e);
		}
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `delay` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		feedUpdate = new BetterScheduledService(this::poll,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.delay, TimeUnit.MILLISECONDS));
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subreddit` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		}
		
		out.footer("r/" + cfg.subreddit);
		out.color(REDDIT_COLOR);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subreddit` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	private SubredditListing fetch() throws IOException {
		var call = service.getFeed(cfg.subreddit);
		
		var resp = call.execute();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `subreddit` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
			}
		}
		log.trace("most recent timestamp for feed {}: {}", cfg.subreddit, lastTimestamp);
		
		return feed;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `guild` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	public boolean check(ChrislieMessage message) {
		var isOtherGuild = message.channel().guild()
				.map(g -> !g.identifier().equals(cfg.guild)) // true if mismatch => other guild
				.orElse(false);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `includeOthers` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
		
		// other guilds requires opt int
		if (isOtherGuild && !cfg.includeOthers)
			return false;
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `guild` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	@Override
	public boolean check(ChrislieUser user) {
		var guild = user.service().guild(cfg.guild);
		return guild.map(g -> g.users().contains(user)).orElse(false);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `implementsCommand` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	@Override
	public final void execute(Invocation invc) throws ListenerException {
		if (cfg().implementsCommand)
			handleCommand(invc);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `implementsListener` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
		var cfg = cfg();
		
		if (cfg.implementsListener && (!isCommand) || cfg.includeCommands)
			externalMessage(msg);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `includeCommands` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
		var cfg = cfg();
		
		if (cfg.implementsListener && (!isCommand) || cfg.includeCommands)
			externalMessage(msg);
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `generatorEmpty` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		
		// some generators will depend on the input string (regex search) and thereforce not always be able to provide an output
		if (!substitutor.generatorEmpty)
			reply.send();
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `output` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	public void fromConfig(GsonValidator gson, JsonElement json) throws ListenerException {
		var cfg = gson.fromJson(json, Config.class);
		output = cfg.output;
		
		generators = new HashMap<>(cfg.generators.size());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `generators` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		output = cfg.output;
		
		generators = new HashMap<>(cfg.generators.size());
		for (var e : cfg.generators.entrySet())
			generators.put(e.getKey(), loadGenerator(gson, e.getValue()));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `generators` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		
		generators = new HashMap<>(cfg.generators.size());
		for (var e : cfg.generators.entrySet())
			generators.put(e.getKey(), loadGenerator(gson, e.getValue()));
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `type` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	private Generator loadGenerator(GsonValidator gson, GeneratorConfig cfg) throws ListenerException {
		try {
			return switch (cfg.type) {
				case "static" -> new StaticGenerator(cfg.cfg.getAsString());
				case "staticfile" -> new StaticGenerator(new File(cfg.cfg.getAsString()));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `cfg` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		try {
			return switch (cfg.type) {
				case "static" -> new StaticGenerator(cfg.cfg.getAsString());
				case "staticfile" -> new StaticGenerator(new File(cfg.cfg.getAsString()));
				case "file" -> new FileGenerator(gson.fromJson(cfg.cfg, FileGenerator.Config.class));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `cfg` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
			return switch (cfg.type) {
				case "static" -> new StaticGenerator(cfg.cfg.getAsString());
				case "staticfile" -> new StaticGenerator(new File(cfg.cfg.getAsString()));
				case "file" -> new FileGenerator(gson.fromJson(cfg.cfg, FileGenerator.Config.class));
				default -> throw new ListenerException("unkown generator type: " + cfg.type);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `cfg` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
				case "static" -> new StaticGenerator(cfg.cfg.getAsString());
				case "staticfile" -> new StaticGenerator(new File(cfg.cfg.getAsString()));
				case "file" -> new FileGenerator(gson.fromJson(cfg.cfg, FileGenerator.Config.class));
				default -> throw new ListenerException("unkown generator type: " + cfg.type);
			};
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `type` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
				case "staticfile" -> new StaticGenerator(new File(cfg.cfg.getAsString()));
				case "file" -> new FileGenerator(gson.fromJson(cfg.cfg, FileGenerator.Config.class));
				default -> throw new ListenerException("unkown generator type: " + cfg.type);
			};
		} catch (IOException e) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `output` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	private void doOutput(ProcessResult result, ChrislieOutput out, ExceptionHandler exceptionHandler) {
		if (cfg.output != null) {
			cfg.output.apply(out, s -> s.replace("${out}", result.outputUTF8())).send();
		} else {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `output` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	private void doOutput(ProcessResult result, ChrislieOutput out, ExceptionHandler exceptionHandler) {
		if (cfg.output != null) {
			cfg.output.apply(out, s -> s.replace("${out}", result.outputUTF8())).send();
		} else {
			try {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `cmd` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	private void dispatch(Consumer<ProcessExecutor> fnPass, ChrislieOutput out, ExceptionHandler exceptionHandler) throws ListenerException {
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
				.redirectErrorStream(cfg.stderrToSdtOut)
				.environment(cfg.envMap) // note that this map only contains static values
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `stderrToSdtOut` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		var procExec = new ProcessExecutor()
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
				.redirectErrorStream(cfg.stderrToSdtOut)
				.environment(cfg.envMap) // note that this map only contains static values
				.readOutput(true)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `envMap` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
				.command(cfg.cmd) // TODO: check if arguments are passed via env or stdin json
				.redirectErrorStream(cfg.stderrToSdtOut)
				.environment(cfg.envMap) // note that this map only contains static values
				.readOutput(true)
				.redirectOutputAlsoTo(Slf4jStream.of(log).asTrace())
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `dir` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		fnPass.accept(procExec);
		
		if (cfg.dir != null)
			procExec.directory(new File(cfg.dir));
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `dir` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		
		if (cfg.dir != null)
			procExec.directory(new File(cfg.dir));
		
		switch (cfg.exitMethod) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `exitMethod` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			procExec.directory(new File(cfg.dir));
		
		switch (cfg.exitMethod) {
			case ANY -> procExec.exitValueAny();
			case NORMAL -> procExec.exitValueNormal();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `exitCodes` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
			case ANY -> procExec.exitValueAny();
			case NORMAL -> procExec.exitValueNormal();
			case LIST -> procExec.exitValues(cfg.exitCodes);
		}
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `timeout` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		}
		
		if (cfg.timeout > 0)
			procExec.timeout(cfg.timeout, TimeUnit.MILLISECONDS);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `timeout` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		
		if (cfg.timeout > 0)
			procExec.timeout(cfg.timeout, TimeUnit.MILLISECONDS);
		
		// this entire library sucks suchs massive donkey cocks that we simply go with the blocking route
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `ext` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	protected ExternalCommandListener.@NonNull @org.checkerframework.checker.nullness.qual.NonNull Config externalConfig() {
		return cfg.ext;
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `passing` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	protected void handleCommand(Invocation invc) throws ListenerException {
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(invc));
			case STDIN -> passStdin(translator.toObject(invc));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `flex` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `passing` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	@Override
	protected void externalMessage(ListenerMessage msg) throws ListenerException {
		var fn = switch (cfg.passing) {
			case ENV -> passEnv(translator.toFlatMap(msg));
			case STDIN -> passStdin(translator.toObject(msg));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `message` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
			
			// stop on first match
			if (searchPredicate.test(sm.message)) {
				match = Optional.of(sm);
				break;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `message` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
		
		StoredMessage found = match.get();
		var searchMatcher = searchPattern.matcher(found.message);
		String replaced;
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `nickname` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
			replaced = searchMatcher.replaceFirst(replace);
		
		msg.reply("<" + found.nickname + "> " + replaced);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
		
		fields.forEach(field -> output.field(field.name, field.value, field.inline));
		
		return output;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `value` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
		
		fields.forEach(field -> output.field(field.name, field.value, field.inline));
		
		return output;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `inline` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		Optional.ofNullable(replace).ifPresent(list -> applyCalls(list, output.replace(), fn));
		
		fields.forEach(field -> output.field(field.name, field.value, field.inline));
		
		return output;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `fn` of another object
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		public void apply(PlainOutput out, Function<String, String> fn) {
			method.fn.fn(out, fn.apply(content), formats);
		}
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `invc` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
				alias
		);
		exceptionHandler.invc = invocation; // TODO: do we want to do this properly?
		
		try {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `msg` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
						ctx
				);
				exceptionHandler.msg = lm; // TODO: do we want to do this properly?
				
				log.trace("calling listener `{}` for message: {}", ref.envelope().source(), m);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `code` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public default Call<QwantResponse> search(String query, SafeSearch safesearch, int count, @NotNull Type type) {
		return search(type.code, type.code, query, safesearch.code, count);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `code` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public default Call<QwantResponse> search(String query, SafeSearch safesearch, int count, @NotNull Type type) {
		return search(type.code, type.code, query, safesearch.code, count);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `code` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public default Call<QwantResponse> search(String query, SafeSearch safesearch, int count, @NotNull Type type) {
		return search(type.code, type.code, query, safesearch.code, count);
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `code` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
				var list = new ArrayList<QwantItem>();
				for (var result : mainline.mainline) {
					if (result.type.equalsIgnoreCase(type.code)) {
						list.addAll(result.getItemsAndUnfuckMess(gson, type)); // will actually end up in first branch so no recursion
					}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `codepoints` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		
		public ParserException(ChrislieParser parser) {
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `idx` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser) {
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `idx` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		
		// update index of parent to current
		parent.idx = this.idx;
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `idx` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		parent = parser; // store reference to parant parser
		
		idx = parser.idx;
		codepoints = parser.codepoints;
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `codepoints` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		
		idx = parser.idx;
		codepoints = parser.codepoints;
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `codepoints` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser, Throwable t) {
			super(t);
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `idx` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
			super(t);
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `codepoints` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser, String message, Throwable t) {
			super(message, t);
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `idx` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
			super(message, t);
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `codepoints` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		public ParserException(ChrislieParser parser, String message) {
			super(message);
			input = parser.codepoints;
			index = parser.idx;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `idx` of another object
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
			super(message);
			input = parser.codepoints;
			index = parser.idx;
		}
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `graph` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		@Override
		public int compareTo(@NotNull KitEscapeRoutesCommand.GraphContainer o) {
			var intComp = Integer.compareUnsigned(o.graph.nodeCount(), graph.nodeCount());
			if (intComp != 0)
				return intComp;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
				return intComp;
			
			return name.compareTo(o.name);
		}
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `graph` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private synchronized void actionPrintGraph(Invocation invc, GraphContainer container) throws ListenerException {
		var graph = container.graph;
		var list = new ArrayList<>(graph.toEdgeMap().entrySet());
		list.sort(Map.Entry.comparingByKey());
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var output = list.stream().map(e ->
				"%s%d%s".formatted(e.getKey().from().name(), e.getValue(), e.getKey().to().name())).collect(Collectors.joining("\n"));
		simpleOutput(invc.reply(), "Graphstruktur von %s".formatted(container.name), output).send();
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resultCache` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var reply = invc.reply();
		
		var list = new ArrayList<>(container.resultCache.entrySet());
		list.sort((o1, o2) -> {
			if (o1.getValue() < o2.getValue())
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		if (list.isEmpty()) {
			simpleOutput(invc.reply(), "Keine Berechnungen f?r %s".formatted(container.name), "EMPTY").send();
		} else {
			var output = list.stream()
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
			var output = list.stream()
					.map(e -> "%d %s %s".formatted(e.getValue(), e.getKey().from().name(), e.getKey().to().name())).collect(Collectors.joining("\n"));
			simpleOutput(invc.reply(), "Verhandene Berechnungen f?r %s".formatted(container.name), output).send();
		}
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resultCache` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private synchronized void actionMaxFlow(Invocation invc, GraphContainer container, ChrislieParser parser) throws ChrislieParser.ParserException, ListenerException {
		if (container.resultCache.size() > LIMIT_MAX_FLOW_CACHE) {
			ErrorOutputBuilder.generic("Wir haben genug maximale Fl?sse berechnet, so viele brennbare " +
					"Gegenst?nde gibt es gar nicht, wie du Fluchtwege in diesem Graphen berechnen m?chtest!!!").write(invc).send();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `graph` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		}
		
		var graph = container.graph;
		var solver = MaxFlowSolver.ofFlowGraph(graph);
		
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var from = Node.withName(parser.word(true).consume().expect("start node"));
		if (!graph.contains(from)) {
			ErrorOutputBuilder.generic("Der Graph %s hat keinen Node mit dem Namen: %s".formatted(container.name, from.name())).write(invc).send();
			return;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var to = Node.withName(parser.word(true).consume().expect("finish node"));
		if (!graph.contains(to)) {
			ErrorOutputBuilder.generic("Der Graph %s hat keinen Node mit dem Namen: %s".formatted(container.name, to.name())).write(invc).send();
			return;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resultCache` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		}
		
		var maxFlow = container.resultCache.computeIfAbsent(FlowQuery.asQuery(from, to), query -> solver.maxFlow(FlowQuery.asQuery(from, to)));
		simpleOutput(invc.reply(), "Max Flow in `%s` von `%s` nach `%s` ist `%d`"
				.formatted(container.name, from.name(), to.name(), maxFlow), "%d".formatted(maxFlow)).send();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		var maxFlow = container.resultCache.computeIfAbsent(FlowQuery.asQuery(from, to), query -> solver.maxFlow(FlowQuery.asQuery(from, to)));
		simpleOutput(invc.reply(), "Max Flow in `%s` von `%s` nach `%s` ist `%d`"
				.formatted(container.name, from.name(), to.name(), maxFlow), "%d".formatted(maxFlow)).send();
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
			simpleOutput(invc.reply(), "Keine Graphen vorhanden", "EMPTY").send();
		} else {
			var output = list.stream().map(c -> "%s %d".formatted(c.name, c.graph.nodeCount())).collect(Collectors.joining("\n"));
			simpleOutput(invc.reply(), "Vorhandene Graphen", output).send();
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `graph` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
			simpleOutput(invc.reply(), "Keine Graphen vorhanden", "EMPTY").send();
		} else {
			var output = list.stream().map(c -> "%s %d".formatted(c.name, c.graph.nodeCount())).collect(Collectors.joining("\n"));
			simpleOutput(invc.reply(), "Vorhandene Graphen", output).send();
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `graph` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	private synchronized void actionModifyGraph(Invocation invc, ChrislieParser parser, GraphContainer container)
			throws ChrislieParser.ParserException, IllegalGraphException, ListenerException {
		var graph = container.graph;
		
		if (graph.nodeCount() > LIMIT_MAX_EDGE_COUNT) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		// parser spec may confuse user if they intent to add new graph but name already exists, this is due to poor parser design but we can account for that
		if (edgeSpec.contains(";")) {
			ErrorOutputBuilder.generic("Mehrere Kanten kannst du nur bei neuen Graphen hinzuf?gen. Der Graph `%s` existiert jedoch schon.".formatted(container.name))
					.write(invc).send();
			return;
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `resultCache` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		// clear max flow cache
		container.resultCache.clear();
		
		simpleOutput(warnInvalidGraph(graph, invc.reply()), "Graph `%s` aktualisiert".formatted(container.name),
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		container.resultCache.clear();
		
		simpleOutput(warnInvalidGraph(graph, invc.reply()), "Graph `%s` aktualisiert".formatted(container.name),
				"Added new section %s to escape network %s.".formatted(edgeSpec, container.name)).send();
	}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
		
		simpleOutput(warnInvalidGraph(graph, invc.reply()), "Graph `%s` aktualisiert".formatted(container.name),
				"Added new section %s to escape network %s.".formatted(edgeSpec, container.name)).send();
	}
	
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `listener` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				if (g == null) {
					
					if (group.listener == null)
						group.listener = List.of();
					
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `listener` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					if (group.listener == null)
						group.listener = List.of();
					
					// create group (and parent groups)
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `include` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// skip groups with no includes
					if (group.include != null) {
						for (String include : group.include)
							list.add(instanceGroup(include, JsonBotConfig.this.groups.get(include), includeList));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `include` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					// skip groups with no includes
					if (group.include != null) {
						for (String include : group.include)
							list.add(instanceGroup(include, JsonBotConfig.this.groups.get(include), includeList));
					}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `listener` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					
					// resolve listener and create reference in group
					Set<String> nameTracker = new HashSet<>(group.listener.size()); // prevent duplicated listener names
					List<ListenerReference> refs = new ArrayList<>(group.listener.size());
					for (ListenerAnchor anchor : group.listener) {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `listener` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					// resolve listener and create reference in group
					Set<String> nameTracker = new HashSet<>(group.listener.size()); // prevent duplicated listener names
					List<ListenerReference> refs = new ArrayList<>(group.listener.size());
					for (ListenerAnchor anchor : group.listener) {
						if (nameTracker.contains(anchor.name))
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `listener` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					Set<String> nameTracker = new HashSet<>(group.listener.size()); // prevent duplicated listener names
					List<ListenerReference> refs = new ArrayList<>(group.listener.size());
					for (ListenerAnchor anchor : group.listener) {
						if (nameTracker.contains(anchor.name))
							throw new ConfigInitializeException(format("duplicated listener name in group `%s`, conflicting anchor was: %s", name, anchor));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					List<ListenerReference> refs = new ArrayList<>(group.listener.size());
					for (ListenerAnchor anchor : group.listener) {
						if (nameTracker.contains(anchor.name))
							throw new ConfigInitializeException(format("duplicated listener name in group `%s`, conflicting anchor was: %s", name, anchor));
						
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `name` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
						}
						
						nameTracker.add(anchor.name);
					}
					
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `flex` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
					}
					
					g = new ChrislieGroup(name, instanceFlexConf(gson, group.flex), list, refs);
					
					// add group to instanced groups as this group is now fully functional
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `type` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		private Selector instanceSelector(JsonSelector json) throws Selector.SelectorException {
			Selector selector = switch (json.type) {
				case "all" -> new AcceptAllSelector();
				case "or" -> CombinationSelector.or(instanceSelectors(json.json));
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `json` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
			Selector selector = switch (json.type) {
				case "all" -> new AcceptAllSelector();
				case "or" -> CombinationSelector.or(instanceSelectors(json.json));
				case "and" -> CombinationSelector.and(instanceSelectors(json.json));
				case "nsfw" -> new NSFWSelector();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `json` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				case "all" -> new AcceptAllSelector();
				case "or" -> CombinationSelector.or(instanceSelectors(json.json));
				case "and" -> CombinationSelector.and(instanceSelectors(json.json));
				case "nsfw" -> new NSFWSelector();
				case "channel" -> new ChannelSelector();
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `type` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				case "ircChannelFlag" -> new IrcChannelFlagSelector();
				case "discordPermission" -> new DiscordPermissionSelector();
				default -> throw new Selector.SelectorException(format("there is no selector of type `%s`", json.type));
			};
			selector.fromJson(gson, json.json);
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `json` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				default -> throw new Selector.SelectorException(format("there is no selector of type `%s`", json.type));
			};
			selector.fromJson(gson, json.json);
			return selector;
		}
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `groups` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				ensureNonNull(mapping, "mapping itself is null");
				ensureNonNull(mapping.groups, "group list in mapping is null");
				ensureNonNull(mapping.selectors, "selector list in mapping is null");
				
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `selectors` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				ensureNonNull(mapping, "mapping itself is null");
				ensureNonNull(mapping.groups, "group list in mapping is null");
				ensureNonNull(mapping.selectors, "selector list in mapping is null");
				
				// try to resolve group names first, since it is faster and better to fail at this stage rather than executing selector code before failing
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `groups` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				// try to resolve group names first, since it is faster and better to fail at this stage rather than executing selector code before failing
				List<ChrislieGroup> mappingGroups = new ArrayList<>(mapping.groups.size());
				for (String name : mapping.groups) {
					
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `groups` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				// try to resolve group names first, since it is faster and better to fail at this stage rather than executing selector code before failing
				List<ChrislieGroup> mappingGroups = new ArrayList<>(mapping.groups.size());
				for (String name : mapping.groups) {
					
					// instancing group only when referenced by mapping allows checking for orphaned groups after loop
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `selectors` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				}
				
				List<Selector> selectors = new ArrayList<>(mapping.selectors.size());
				for (JsonSelector selector : mapping.selectors) {
					try {
```

### UseOfAnotherObjectsPrivateField
Direct access to non-public field `selectors` of another object
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
				
				List<Selector> selectors = new ArrayList<>(mapping.selectors.size());
				for (JsonSelector selector : mapping.selectors) {
					try {
						selectors.add(instanceSelector(selector));
```

## ObjectEquality
### ObjectEquality
Object values are compared using `!=`, not 'equals()'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
			
			// if listener instance differs, we drop the existing context, this also happens on the first merge since listener is initialized with null
			if (envelope != o.envelope()) {
				name = o.name();
				help = o.help() != null ? o.help() : help; // only override if set
```

### ObjectEquality
Object values are compared using `==`, not 'equals()'
in `src/main/java/chrisliebaer/chrisliebot/config/ChrislieContext.java`
#### Snippet
```java
	
	public Optional<? extends ListenerReference> listener(ChrislieListener listener) throws NoSuchElementException {
		return listeners.values().stream().filter(ctx -> ctx.envelope().listener() == listener).findAny();
	}
	
```

### ObjectEquality
Object values are compared using `==`, not 'equals()'
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
		
		// prevent cyclic loops
		if (this == listener) {
			ERROR_CYCLE_DETECTED.write(invc).send();
			return;
```

### ObjectEquality
Object values are compared using `==`, not 'equals()'
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieDispatcher.java`
#### Snippet
```java
				
				// if a listener was called as a command, it will not be called again for the very same message
				if (isCommand && listener.get() == ref.envelope().listener())
					continue;
				
```

## unused
### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/C.java`
#### Snippet
```java
	public static final Pattern NEWLINE_PATTERN = Pattern.compile("\\R");
	
	public static final String MIME_TYPE_JSON = "application/json; charset=utf-8";
	
	public static final char ZERO_WIDTH_NO_BREAK_SPACE = '\uFEFF';
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
	public static class ChrisliebotException extends Exception {
		
		public ChrisliebotException() {
		}
		
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		}
		
		public ChrisliebotException(String message) {
			super(message);
		}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/Chrisliebot.java`
#### Snippet
```java
		}
		
		public ChrisliebotException(Throwable cause) {
			super(cause);
		}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieChannel.java`
#### Snippet
```java
	 * @return A potential user that this call name might refer to.
	 */
	public Optional<? extends ChrislieUser> resolve(String callName);
	
	/**
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieMessage.java`
#### Snippet
```java
	 * @param s       The string to reply with.
	 */
	public default void reply(LimiterConfig limiter, String s) throws ChrislieListener.ListenerException {
		reply(limiter).plain(s).send();
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput plain(Consumer<PlainOutput> out) {
		out.accept(plain());
		return this;
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput convert(Consumer<PlainOutput.PlainOutputSubstituion> out) {
		out.accept(convert());
		return this;
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieOutput.java`
#### Snippet
```java
	}
	
	public default ChrislieOutput replace(Consumer<PlainOutput> out) {
		out.accept(replace());
		return this;
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	 * Implementing service is expected to, if possible, drop connection and reconnect to network.
	 */
	public default void reconnect() {}
	
	/**
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
	public static class ServiceException extends Exception {
		
		public ServiceException() {
		}
		
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
		}
		
		public ServiceException(String message) {
			super(message);
		}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieService.java`
#### Snippet
```java
		}
		
		public ServiceException(Throwable cause) {
			super(cause);
		}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
public class PlainOutputImpl implements PlainOutput {
	
	private static final Pattern ESCAPE_PATTERN = Pattern.compile("[\u0000\\\\]");
	
	private static final char ESCAPE_MARKER = '\0';
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	private static final Pattern ESCAPE_PATTERN = Pattern.compile("[\u0000\\\\]");
	
	private static final char ESCAPE_MARKER = '\0';
	private static final char ESCAPE_CHARACTER = '\\';
	
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/PlainOutputImpl.java`
#### Snippet
```java
	
	private static final char ESCAPE_MARKER = '\0';
	private static final char ESCAPE_CHARACTER = '\\';
	
	private Function<String, String> escaper;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
public class SerializedOutput {
	
	private String title;
	private @URL String url; // shares validity with title and permits null values
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	
	private String title;
	private @URL String url; // shares validity with title and permits null values
	
	private String img;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private @URL String url; // shares validity with title and permits null values
	
	private String img;
	private String thumbnail;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	
	private String img;
	private String thumbnail;
	
	private Integer color;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private String thumbnail;
	
	private Integer color;
	
	private String author;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private Integer color;
	
	private String author;
	// without the author field, these are ignored, null is also a valid value, so no need to wrap in optional
	private String authorUrl;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private String author;
	// without the author field, these are ignored, null is also a valid value, so no need to wrap in optional
	private String authorUrl;
	private String authorIcon;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	// without the author field, these are ignored, null is also a valid value, so no need to wrap in optional
	private String authorUrl;
	private String authorIcon;
	
	private @NotNull List<Field> fields = List.of();
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private @NotNull List<Field> fields = List.of();
	
	private String footer;
	private String footerIcon;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	
	private String footer;
	private String footerIcon;
	
	private List<PlainOutputCall> plain;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private String footerIcon;
	
	private List<PlainOutputCall> plain;
	private List<PlainOutputCall> description;
	private List<PlainOutputCall> replace;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	
	private List<PlainOutputCall> plain;
	private List<PlainOutputCall> description;
	private List<PlainOutputCall> replace;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private List<PlainOutputCall> plain;
	private List<PlainOutputCall> description;
	private List<PlainOutputCall> replace;
	
	/**
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	private static final class Field {
		
		private @NotBlank String name;
		private @NotBlank String value;
		private boolean inline = true;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		private @NotBlank String name;
		private @NotBlank String value;
		private boolean inline = true;
	}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		@AllArgsConstructor
		private enum PlainOutputMethod {
			APPEND(PlainOutput::append),
			APPEND_ESCAPE(PlainOutput::appendEscape);
			
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		private enum PlainOutputMethod {
			APPEND(PlainOutput::append),
			APPEND_ESCAPE(PlainOutput::appendEscape);
			
			private PlainMethod fn;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		}
		
		private @NotNull PlainOutputMethod method;
		private @NotNull String content;
		private @NotNull ChrislieFormat[] formats = EMPTY_FORMATS;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
		
		private @NotNull PlainOutputMethod method;
		private @NotNull String content;
		private @NotNull ChrislieFormat[] formats = EMPTY_FORMATS;
		
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ServiceAttached.java`
#### Snippet
```java
	public ChrislieService service();
	
	public default Chrisliebot bot() {
		return service().bot();
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
public class DiscordBootstrap implements ServiceBootstrap {
	
	private String token;
	private boolean updateSlashCommands;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
	
	private String token;
	private boolean updateSlashCommands;
	
	@Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
	
	@Override
	public DiscordService service(Chrisliebot bot, String identifier) throws LoginException {
		var jda = JDABuilder.create(token, GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS))
				.setEventManager(new AnnotatedEventManager())
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordChannelOutput.java`
#### Snippet
```java
	private final MessageChannel channel;
	
	private MessageAction messageAction;
	
	public DiscordChannelOutput(@NonNull DiscordService service, @NonNull MessageChannel channel) {
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onMessage(MessageReceivedEvent ev) {
		if (ev.getAuthor().isBot())
			return;
```

### unused
Variable `aliases` is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
				continue;
			
			var aliases = ref.aliasSet();
			
			// get first alias as primary alias
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onGuildJoin(GuildJoinEvent ev) {
		refreshGuildCommands();
	}
```

### unused
Parameter `ev` is not used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onGuildJoin(GuildJoinEvent ev) {
		refreshGuildCommands();
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
	
	@SubscribeEvent
	public void onSlashCommand(SlashCommandEvent ev) {
		if (sink == null)
			return;
```

### unused
Variable `args` is never used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
		
		var argsOpt = ev.getOption("args");
		var args = argsOpt == null ? "" : argsOpt.getAsString();
		
		var slashCommand = new DiscordSlashCommandMessage(this, ev);
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			
			@SubscribeEvent
			public void onShutdown(ShutdownEvent ev) {
				latch.countDown();
			}
```

### unused
Parameter `ev` is not used
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordService.java`
#### Snippet
```java
			
			@SubscribeEvent
			public void onShutdown(ShutdownEvent ev) {
				latch.countDown();
			}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordSlashCommandMessage.java`
#### Snippet
```java
		return new AbstractDiscordOutput<Message>() { // the generic types are so broken
			private boolean isError;
			private WebhookMessageAction<Message> messageAction;
			
			@Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public Optional<User> user(JDA jda) {
		return Optional.ofNullable(jda.getUserById(userId));
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public Optional<Guild> guild(JDA jda) {
		return Optional.ofNullable(jda.getGuildById(guildId));
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/TraceMessageSource.java`
#### Snippet
```java
	}
	
	public OffsetDateTime toInstant() {
		return TimeUtil.getTimeCreated(messageId);
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
public class IrcBootstrap implements ServiceBootstrap {
	
	private boolean chatlog; // enable logging of all messages to database
	
	private String host;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private boolean chatlog; // enable logging of all messages to database
	
	private String host;
	private Integer port;
	private String user; // for login, not nickname
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	
	private String host;
	private Integer port;
	private String user; // for login, not nickname
	private String nickname;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private String host;
	private Integer port;
	private String user; // for login, not nickname
	private String nickname;
	private String serverPassword;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private Integer port;
	private String user; // for login, not nickname
	private String nickname;
	private String serverPassword;
	private boolean secure; // enables tls
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private String user; // for login, not nickname
	private String nickname;
	private String serverPassword;
	private boolean secure; // enables tls
	private Integer flooding; // delay between messenges in ms
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private String nickname;
	private String serverPassword;
	private boolean secure; // enables tls
	private Integer flooding; // delay between messenges in ms
	private String realname;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private String serverPassword;
	private boolean secure; // enables tls
	private Integer flooding; // delay between messenges in ms
	private String realname;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private boolean secure; // enables tls
	private Integer flooding; // delay between messenges in ms
	private String realname;
	
	private Map<String, List<String>> guilds;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private String realname;
	
	private Map<String, List<String>> guilds;
	
	private Set<String> ignore;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	private Map<String, List<String>> guilds;
	
	private Set<String> ignore;
	
	@Override
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	
	@Override
	public IrcService service(Chrisliebot bot, String identifier) throws NullPointerException {
		
		var builder = Client.builder();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	}
	
	private void verboseLogging(Client.Builder builder) {
		builder.listeners().input(IrcBootstrap::inLogger);
		builder.listeners().output(IrcBootstrap::outLogger);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		@Handler
		public void capList(CapabilitiesSupportedListEvent ev) {
			if (ev.isNegotiating()) {
				Optional<CapabilityState> opt = ev.getSupportedCapabilities()
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		@Handler
		public void capAck(CapabilitiesAcknowledgedEvent ev) {
			if (ev.getAcknowledgedCapabilities().stream().anyMatch(c -> c.getName().equalsIgnoreCase(CapabilityManager.Defaults.ECHO_MESSAGE))) {
				log.info("enabled echo-message capability");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
		
		@Handler
		public void capAck(CapabilitiesRejectedEvent ev) {
			if (ev.getRejectedCapabilitiesRequest().stream().anyMatch(c -> c.getName().equalsIgnoreCase(CapabilityManager.Defaults.ECHO_MESSAGE))) {
				log.error("failed to enable echo-message, will not be able to react to own messages (including logging)");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public String identifier() {
		return user.identifier();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public List<IrcUser> users() {
		return List.of(user);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcUser> user(String identifier) {
		return service.userByPrefixedIdentifier(identifier, Stream.of(user.user())).map(u -> new IrcUser(service, u));
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public Optional<IrcGuild> guild() {
		return Optional.empty();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcPrivateChannel.java`
#### Snippet
```java
	
	@Override
	public IrcOutput output(LimiterConfig limiterConfig) {
		return new IrcOutput(Function.identity(), s -> limiterConfig.send(user.user(), s));
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Handler
	public void onChannelMessage(ChannelMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Handler
	public void onPrivateMessage(PrivateMessageEvent ev) {
		if (ignore.contains(ev.getActor().getNick()) || client.isUser(ev.getActor()))
			return;
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcService.java`
#### Snippet
```java
	
	@Handler
	public void onDisconnect(ClientConnectionEndedEvent ev) {
		if (ev.canAttemptReconnect()) {
			ev.getCause().ifPresentOrElse(
```

### unused
Parameter `bot` is not used in this method nor in any of its overriding methods
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           exception will cause the dirty bit to be set.
	 */
	public default void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### unused
Parameter `resolver` is not used in this method nor in any of its overriding methods
in `src/main/java/chrisliebaer/chrisliebot/command/ChrislieListener.java`
#### Snippet
```java
	 *                           exception will cause the dirty bit to be set.
	 */
	public default void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {}
	
	/**
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Generiert eine Vorschau f?r hochgeladene Textdateien aus der referenzierten antwort, so dass der Anhang nicht runtergeladen werden muss.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc)) {
			ErrorOutputBuilder.generic("Dieses Feature steht nur auf Discord zu Verf?gung.").write(invc).send();
```

### unused
Variable `test` is never used
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		var hashInput = "%s/%s/%s%s".formatted(msg.getChannel().getId(), attachment.getId(), filename, cfg.hashSalt);
		var hash = digest.digest(hashInput.getBytes(StandardCharsets.UTF_8));
		var test = Arrays.copyOf(hash, cfg.hashLength);
		
		return "%s%s/%s/%s/%s".formatted(
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	private static class Config {
		
		private String baseUrl;
		private String hashSalt;
		private int hashLength;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		
		private String baseUrl;
		private String hashSalt;
		private int hashLength;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
		private String baseUrl;
		private String hashSalt;
		private int hashLength;
	}
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("?ndert den Nickname der Botinstanz. Je nach Servicetyp wird der Nickname nur in der aktuellen Community oder global ge?ndert.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (IrcService.isIrc(invc))
			changeIrcNick(invc);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NullCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {}
}

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Du willst mich auch in deinem Channel oder Server haben?");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (IrcService.isIrc(invc))
			recruitIrc(invc);
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	private static class Config {
		
		private @URL @NotNull String recruitUrl;
	}
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		out.apply(invc.reply()).send();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Zeigt Informationen zur aktuellen Version von Chrisliebot an.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
	@SuppressWarnings({"UnnecessaryUnicodeEscape", "RedundantSuppression"})
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var reply = invc.reply();
		reply.title("Versionsinformationen");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Dreh die Flasche und finde den Nutzer auf den sie zeigt.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var rng = ThreadLocalRandom.current();
		
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Ich helf dir beim Treffen von wichtigen Entscheidungen: `option1, option2, ...`");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		var choices = Arrays.stream(arg.split(",")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	
	@Override
	public Optional<ChrislieDispatcher.CommandParse> forcedInvocation() {
		return Optional.of(commandParse);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronCommandMessage.java`
#### Snippet
```java
	
	@Override
	public ChrislieService service() {
		return channel.service();
	}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	private Chrisliebot bot;
	private ContextResolver resolver;
	
	private ScheduledExecutorService executorService;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		executorService = bot.sharedResources().timer();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		for (var entry : config.entries) {
			queueRun(entry);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Setzt die Whiteslist f?r den angegebenen Emoji. Beispiel: :kappa: @Premium @Mitglieder. " +
				"Keine Angabe von Rollen l?scht die Whitelist.");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc))
			throw new ListenerException("This command only works on Discord services.");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Listet alle Emojis auf, auf die ich aktuell Zugriff habe. Vorsicht: Das sind viele!");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc)) {
			invc.reply("Dieser Befehl funktioniert nur auf Discordinstanzen, das tut mir leid.");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Antworte entweder mit diesem Befehl auf meine Nachricht oder geb mir einen Link zu einer anderen Nachricht von mir und ich sag dir, " +
				"warum ich das getan hab.");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!DiscordService.isDiscord(invc) || !(invc.msg() instanceof DiscordMessage)) {
			ErrorOutputBuilder.generic("Dieser Befehlt steht nur auf Discord zur Verf?gung oder ich habe Schwierigkeiten diese Nachricht zu erkennen.").write(invc).send();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("<Query> [<Type>]");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var args = invc.arg().split(" ");
		if (args.length < 1) {
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	
	@Override
	public final void execute(Invocation invc) throws ListenerException {
		if (cfg().implementsCommand)
			handleCommand(invc);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	
	@Override
	public final void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		var cfg = cfg();
		
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	protected static class Config {
		
		private boolean implementsListener;
		private boolean implementsCommand;
		private boolean includeCommands;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
		
		private boolean implementsListener;
		private boolean implementsCommand;
		private boolean includeCommands;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
		private boolean implementsListener;
		private boolean implementsCommand;
		private boolean includeCommands;
	}
}
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	public static class ExternalInvocation {
		
		private String argument; // non-null argument string
		private String alias; // alias that was used to invoke this command
		private String message; // full incoming message
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		
		private String argument; // non-null argument string
		private String alias; // alias that was used to invoke this command
		private String message; // full incoming message
		private Map<String, JsonElement> flex; // the flex config of this command, only explicitly included fields will be present
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String argument; // non-null argument string
		private String alias; // alias that was used to invoke this command
		private String message; // full incoming message
		private Map<String, JsonElement> flex; // the flex config of this command, only explicitly included fields will be present
		
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private Map<String, JsonElement> flex; // the flex config of this command, only explicitly included fields will be present
		
		private String service; // service identifier
		private ExternalUser user;
		private ExternalChannel channel;
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		
		private String service; // service identifier
		private ExternalUser user;
		private ExternalChannel channel;
		
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String service; // service identifier
		private ExternalUser user;
		private ExternalChannel channel;
		
		public static ExternalInvocation of(ChrislieListener.Invocation invc, Set<String> flexValues) {
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	public static class ExternalUser {
		
		private String identifier;
		private String displayName;
		private String mention;
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		
		private String identifier;
		private String displayName;
		private String mention;
		
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String identifier;
		private String displayName;
		private String mention;
		
		public static ExternalUser of(ChrislieUser u) {
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	public static class ExternalChannel {
		
		private String identifier;
		private String displayName;
		private boolean isDirectMessage;
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		
		private String identifier;
		private String displayName;
		private boolean isDirectMessage;
		private List<ExternalUser> users;
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String identifier;
		private String displayName;
		private boolean isDirectMessage;
		private List<ExternalUser> users;
		private boolean isNSFW;
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private String displayName;
		private boolean isDirectMessage;
		private List<ExternalUser> users;
		private boolean isNSFW;
		private ExternalGuild guild;
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private boolean isDirectMessage;
		private List<ExternalUser> users;
		private boolean isNSFW;
		private ExternalGuild guild;
		
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		private List<ExternalUser> users;
		private boolean isNSFW;
		private ExternalGuild guild;
		
		public static ExternalChannel of(ChrislieChannel c) {
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	public static class ExternalGuild {
		
		private String identifier;
		private String displayName;
		
```

### unused
Field is assigned but never accessed.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
		
		private String identifier;
		private String displayName;
		
		public static ExternalGuild of(ChrislieGuild g) {
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		gson = bot.sharedResources().gson();
		cfg.flex.forEach(translator::withFlex);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		// bot framework ensures that this listener will not receive any more messages, so we don't need to care about that
		
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	private static class Config {
		
		private @NotNull ExternalCommandListener.Config ext;
		
		/**
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * Will redirect {@code stderr} to {@code stdout}.
		 */
		private boolean stderrToSdtOut;
		
		/**
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * First element indicates binary followed by arg array.
		 */
		private @NotEmpty List<String> cmd;
		
		/**
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * Optional path to working directory.
		 */
		private String dir;
		
		/**
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * recommended).
		 */
		private @PositiveOrZero long timeout;
		
		/**
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
		 * JSON representation of a {@link SerializedOutput}.
		 */
		private SerializedOutput output;
		
		private enum ExitCodeMethod {
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	protected static class Config {
		
		private @NotBlank String file;
		private boolean search;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
		
		private @NotBlank String file;
		private boolean search;
	}
}
```

### unused
Parameter `command` is not used in any implementation
in `src/main/java/chrisliebaer/chrisliebot/command/generator/Generator.java`
#### Snippet
```java
	public static final String DEFAULT = "DEFAULT";
	
	public Map<String, String> generate(ChrislieListener.Invocation invc, GeneratorCommand command) throws ChrislieListener.ListenerException;
}

```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var reply = invc.reply();
		var substitutor = new CachingSubstitutor(invc);
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	private static class Config {
		
		private @NotNull SerializedOutput output;
		private Map<String, GeneratorConfig> generators = Map.of();
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	private static class GeneratorConfig {
		
		private String type;
		private JsonElement cfg;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
		
		private String type;
		private JsonElement cfg;
	}
}
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	private @NonNull String out;
	
	public StaticGenerator(@NonNull String out) {
		this.out = out;
	}
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/StaticGenerator.java`
#### Snippet
```java
	}
	
	public StaticGenerator(@NonNull File file) throws IOException {
		out = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(cfg.hostname())
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("F?hrt die ?bergebene Haskell Expression aus. Funktionsdefinitionen k?nnen mit `let` in die Expression gebunden werden.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var flex = invc.ref().flexConf();
		var timeout = flex.getStringOrFail(FLEX_TIMEOUT);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		
		String arg = invc.arg();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Erlaubt Zugriff auf eingebaute Hilfetexte von Befehlen. Listet ohne Parameter alle Befehle des aktuellen Context auf. Wird ein " +
				"Befehlsname ?bergeben, so wird dessen Hilfetext angezeigt.");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("F?hrt den nachfolgenden Befehl ohne IRC Accountinformationen aus. Hat den selben Effekt wie ein Ausloggen aus dem IRC Account.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.resolver = resolver;
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		if (!IrcService.isIrc(invc)) {
			ERROR_IRC_ONLY.write(invc).send();
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/IllegalGraphException.java`
#### Snippet
```java
public class IllegalGraphException extends Exception {
	
	public IllegalGraphException(String message) {
		super(message);
	}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/IllegalGraphException.java`
#### Snippet
```java
	}
	
	public IllegalGraphException(String message, Throwable cause) {
		super(message, cause);
	}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/IllegalGraphException.java`
#### Snippet
```java
	}
	
	public IllegalGraphException(Throwable cause) {
		super(cause);
	}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/IllegalGraphException.java`
#### Snippet
```java
	}
	
	public IllegalGraphException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void execute(Invocation invc) throws ListenerException {
		try {
			var arg = invc.arg();
```

### unused
Variable `reply` is never used
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
	
	private synchronized void actionListFlows(Invocation invc, GraphContainer container) throws ListenerException {
		var reply = invc.reply();
		
		var list = new ArrayList<>(container.resultCache.entrySet());
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("?berschreibt die aktuelle Loggerkonfiguration bis zum n?chsten Neustart: <TRACE|DEBUG|INFO|WARN|ERROR> [logger-name.[*]], reset");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java
	@SneakyThrows // TODO: remove once error output builder was reworked
	@Override
	public void execute(Invocation invc) throws ListenerException {
		ChrislieParser parser = new ChrislieParser(invc.arg());
		
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess erneut zu starten.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().restart();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess nicht erneut zu starten.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().shutdown();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Beendet Chrisliebot und teilt dem Monitoring mit den Prozess Chrisliebot zu upgraden.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.bot().managment().upgrade();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Dank Memes vom Memelord. MEME HARD!! Du willst deine eigenen Memes teilen? Frag Chrisliebaer.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	// overwrite the references after all changes were made.
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService = new BetterScheduledService(this::update,
				AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, cfg.updateInterval(), TimeUnit.MILLISECONDS));
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.startAsync().awaitRunning();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		updateService.stopAsync().awaitTerminated();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		if (taggedMemes == null) {
```

### unused
Variable `m` is never used
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		if (taggedMemes == null) {
			ERROR_NO_DATABASE.write(invc).send();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	}
	
	private void update() {
		try {
			Response<List<DatabaseEntry>> response = service.getDatabase().execute();
```

### unused
Variable `m` is never used
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	@Override
	public synchronized void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var arg = invc.arg();
		var flex = invc.ref().flexConf();
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	private static class Config {
		
		private @NotNull @NotBlank String username;
		private @NotNull @NotBlank String password;
		private @Positive long updateInterval;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		
		private @NotNull @NotBlank String username;
		private @NotNull @NotBlank String password;
		private @Positive long updateInterval;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
		private @NotNull @NotBlank String username;
		private @NotNull @NotBlank String password;
		private @Positive long updateInterval;
	}
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/quiz/QuizCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		throw new RuntimeException("not implemented"); //TODO
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Ich zeig dir das World Wide Web. Gib einfach deine Suchanfrage ein.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		resultStorage = CacheBuilder.newBuilder()
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var query = invc.arg().trim();
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	private static class Config {
		
		private @NotNull SerializedOutput output;
		private @NotNull QwantService.Type type;
		private @Positive long resultTimeout; // duration in milliseconds until cached results expire
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		
		private @NotNull SerializedOutput output;
		private @NotNull QwantService.Type type;
		private @Positive long resultTimeout; // duration in milliseconds until cached results expire
		private boolean randomize;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		private @NotNull SerializedOutput output;
		private @NotNull QwantService.Type type;
		private @Positive long resultTimeout; // duration in milliseconds until cached results expire
		private boolean randomize;
		private @Positive int count; // limited to 50
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		private @NotNull QwantService.Type type;
		private @Positive long resultTimeout; // duration in milliseconds until cached results expire
		private boolean randomize;
		private @Positive int count; // limited to 50
		private @NotBlank String captchaUrl; // posted when rate limited
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		private @Positive long resultTimeout; // duration in milliseconds until cached results expire
		private boolean randomize;
		private @Positive int count; // limited to 50
		private @NotBlank String captchaUrl; // posted when rate limited
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
		private boolean randomize;
		private @Positive int count; // limited to 50
		private @NotBlank String captchaUrl; // posted when rate limited
	}
}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String DEFAULT_LOCALE = "de_DE";
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	public static final String TYPE_WEB = "web";
	public static final String TYPE_NEWS = "news";
	public static final String TYPE_IMAGES = "images";
	
	@AllArgsConstructor
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	@AllArgsConstructor
	enum Type {
		WEB("web"),
		NEWS("news"),
		IMAGE("images");
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	enum Type {
		WEB("web"),
		NEWS("news"),
		IMAGE("images");
		private String code;
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		WEB("web"),
		NEWS("news"),
		IMAGE("images");
		private String code;
	}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		private static class QwantQuery {
			
			public String query;
		}
		
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		private static class QwantData {
			
			public QwantResult result;
			public QwantQuery query;
		}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			
			public QwantResult result;
			public QwantQuery query;
		}
		
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		public static class QwantMainlineItemsBullshit {
			
			public List<QwantResult> mainline;
		}
		
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		private static class QwantResult {
			
			public JsonElement items;
			public String type;
			
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
			
			public JsonElement items;
			public String type;
			
			// web type search returns a bunch of bullshit typed json, so we fix that
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		
		public static class QwantMediaSubObject {
			public QwantMediaSubObject2 pict;
		}
		
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		
		public static class QwantMediaSubObject2 {
			public String url;
		}
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/random/CoinCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Wirf eine M?nze und lass den Zufall f?r dich entscheiden. Sei faul!");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/random/CoinCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.reply()
				.title("Die M?nze ist gefallen")
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/random/DiceCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Du hast den W?rfel f?r den D&D Abend vergessen oder willst eine Klausuraufgabe l?sen? Dann bist du hier genau richtig.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/random/DiceCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		try {
			var arg = invc.arg();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		// initial request gets most recent posts timestamp
		try {
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	
	@Override
	public void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		feedUpdate.stopAsync().awaitTerminated();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	}
	
	private void poll() {
		try {
			var feed = fetch();
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	private static class Config {
		
		@NotNull private ChrislieIdentifier.ChannelIdentifier channel;
		@Positive private long delay;
		@NotEmpty private String subreddit;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		
		@NotNull private ChrislieIdentifier.ChannelIdentifier channel;
		@Positive private long delay;
		@NotEmpty private String subreddit;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
		@NotNull private ChrislieIdentifier.ChannelIdentifier channel;
		@Positive private long delay;
		@NotEmpty private String subreddit;
	}
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		var m = msg.msg();
		
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		predicates = new ArrayList<>();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		if (!DiscordService.isDiscord(msg))
			return;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	private static class Config {
		
		@NotNull private Mode mode; // action to perform on match
		@NotNull private Match match;
		private boolean link;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		
		@NotNull private Mode mode; // action to perform on match
		@NotNull private Match match;
		private boolean link;
		private boolean file;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		@NotNull private Mode mode; // action to perform on match
		@NotNull private Match match;
		private boolean link;
		private boolean file;
		private Pattern pattern;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		@NotNull private Match match;
		private boolean link;
		private boolean file;
		private Pattern pattern;
		@PositiveOrZero private long deleteAfter; // 0 will disable removal of message
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		private boolean link;
		private boolean file;
		private Pattern pattern;
		@PositiveOrZero private long deleteAfter; // 0 will disable removal of message
		private boolean sendDm; // sends dm instead of writing in channel (
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		private boolean file;
		private Pattern pattern;
		@PositiveOrZero private long deleteAfter; // 0 will disable removal of message
		private boolean sendDm; // sends dm instead of writing in channel (
		@NotNull private SerializedOutput output; // supports ${server} ${mention} ${user} ${channel}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		private Pattern pattern;
		@PositiveOrZero private long deleteAfter; // 0 will disable removal of message
		private boolean sendDm; // sends dm instead of writing in channel (
		@NotNull private SerializedOutput output; // supports ${server} ${mention} ${user} ${channel}
		@NotNull private List<Long> whitelist = List.of(); // role ids to be excluded
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
		@PositiveOrZero private long deleteAfter; // 0 will disable removal of message
		private boolean sendDm; // sends dm instead of writing in channel (
		@NotNull private SerializedOutput output; // supports ${server} ${mention} ${user} ${channel}
		@NotNull private List<Long> whitelist = List.of(); // role ids to be excluded
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of(emojify("Wir haben so viele Emojis, wir sollten sie vielleicht auch alle nutzen, was meinst du?"));
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		try {
			var str = IOUtils.toString(getClass().getResourceAsStream("/emoji-list.txt"), StandardCharsets.UTF_8);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.arg();
		var result = emojify(m);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		StringBuilder sb = new StringBuilder(arg.length());
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("??do? ????s ?l?M ??p");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/MockCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) {
		return Optional.of("Wenn eine Aussage so dumm ist, dass es keinen weiteren Kommentar bedarf.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/MockCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		if (arg.isBlank()) {
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Command.super.help(ctx, ref);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		invc.reply(ultimateTextMassacre(invc.arg()));
	}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private static final long PURGE_INTERVAL = 60 * 60 * 1000;
	
	private static final String SHORTHAND_LAST_EXPIRED = "^";
	private static final String SHORTHAND_LAST_CREATED = ".";
	private static final String SHORTHAND_UPCOMING = "-";
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	private static final String SHORTHAND_LAST_EXPIRED = "^";
	private static final String SHORTHAND_LAST_CREATED = ".";
	private static final String SHORTHAND_UPCOMING = "-";
	
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private static final String SHORTHAND_LAST_EXPIRED = "^";
	private static final String SHORTHAND_LAST_CREATED = ".";
	private static final String SHORTHAND_UPCOMING = "-";
	
	// TODO: put these in code and replace with exception based error messages later
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("10 min Pizza|list, info|delete|restore <id>, snooze <id> 2 days. Zus?tzlich gibt es folgende K?rzel f?r <id>: ^ letzter abgelaufener Timer, . letzter angelegter Timer, - n?chster f?lliger Timer.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.dataSource = bot.sharedResources().dataSource();
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		
		// while refresh timer could take care of that, we do it here to provide exception handling to chrisliebot framework
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		shutdown = true;
		
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@Override
	public synchronized void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg();
		
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 * @throws SQLException
	 */
	private static String resolveTimerString(ListenerMessage msg) throws SQLException {
		// TODO: check constants for symbols
		throw new RuntimeException("implement me");
```

### unused
Parameter `msg` is not used
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	 * @throws SQLException
	 */
	private static String resolveTimerString(ListenerMessage msg) throws SQLException {
		// TODO: check constants for symbols
		throw new RuntimeException("implement me");
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	private static class Config {
		
		private @Positive long expire;
		private @Positive long prefetchWindow;
		private @Positive long prefetchInterval;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		
		private @Positive long expire;
		private @Positive long prefetchWindow;
		private @Positive long prefetchInterval;
		private @Positive int abbrevLength;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		private @Positive long expire;
		private @Positive long prefetchWindow;
		private @Positive long prefetchInterval;
		private @Positive int abbrevLength;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
		private @Positive long prefetchWindow;
		private @Positive long prefetchInterval;
		private @Positive int abbrevLength;
	}
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	private ScheduledFuture<?> pollTask;
	private boolean shutdown;
	
	private Chrisliebot bot;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		this.bot = bot;
		this.resolver = resolver;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public void start(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		var timer = bot.sharedResources().timer();
		pollTask = timer.scheduleWithFixedDelay(this::poll, 0, cfg.interval, TimeUnit.MILLISECONDS);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Override
	public synchronized void stop(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		pollTask.cancel(false);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg().trim();
		var m = invc.msg();
```

### unused
Variable `m` is never used
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
	public void execute(Invocation invc) throws ListenerException {
		var arg = invc.arg().trim();
		var m = invc.msg();
		
		List<Integer> cps;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		return Optional.of("Hiermit kann der Datumsparser f?r die Timer getestet werden.");
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		long now = System.currentTimeMillis();
		
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	
	@Override
	public void init(Chrisliebot bot, ContextResolver resolver) throws ListenerException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(UrbanDictionaryService.BASE_URL)
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var reply = invc.reply();
```

### unused
Variable `m` is never used
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
	@Override
	public void execute(Invocation invc) throws ListenerException {
		var m = invc.msg();
		var reply = invc.reply();
		String term = invc.arg().trim();
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	}
	
	public static String removeBrackets(String definition) {
		StringSubstitutor strSub = new StringSubstitutor(key -> key, "[", "]", '\\');
		return strSub.replace(definition);
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
public class UrlPreviewListener implements ChrislieListener {
	
	private static final String FLEX_LOGSIZE = "urlpreview.logsize";
	private static final String FLEX_EXPIRE_TIME = "urlpreview.expireTime";
	
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	private static final String FLEX_LOGSIZE = "urlpreview.logsize";
	private static final String FLEX_EXPIRE_TIME = "urlpreview.expireTime";
	
	private static final long URL_EXPIRE_TIME = 600000; // 10 minutes
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	@Override
	public void onMessage(ListenerMessage msg, boolean isCommand) throws ListenerException {
		if (msg.msg().message().startsWith(" ") || isCommand) // TODO: is this good?
			return;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
	
	@Override
	public Optional<String> help(ChrislieContext ctx, ListenerReference ref) throws ListenerException {
		var target = target(ctx, ref.flexConf());
		
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
	
	@Override
	public final void execute(Invocation invc) throws ListenerException {
		var flex = invc.ref().flexConf();
		var arg = transformArg(invc.arg(), flex);
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		
		@SuppressWarnings("VariableNotUsedInsideIf") // validation is for user, not for program
		public ListenerReference instance(GsonValidator gson, ChrislieContext ctx, String groupName) throws ChrislieListener.ListenerException {
			
			// check for common fields
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	public static class ConfigInitializeException extends Exception {
		
		public ConfigInitializeException() {
		}
		
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
		}
		
		public ConfigInitializeException(Throwable cause) {
			super(cause);
		}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/flex/CommonFlex.java`
#### Snippet
```java
		public Optional<T> get(FlexConf flex);
		
		public default Optional<T> get(ChrislieListener.ListenerMessage m) {
			return get(m.ref().flexConf());
		}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	 * @return A snapshot of the provided FlexConf.
	 */
	public static FlexConf snapshot(FlexConf o) {
		// it's actually enought to just copy the resolver
		return new FlexConf(o.resolver);
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public <V> V getOrFail(String key, Class<V> clazz) throws ChrislieListener.ListenerException {
		return get(key, clazz).orElseThrow(() -> keyNotFound(key));
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/flex/FlexConf.java`
#### Snippet
```java
	}
	
	public <T> T getOrFail(String key, Type type) throws ChrislieListener.ListenerException {
		return C.unsafeCast(get(key, type).orElseThrow(() -> keyNotFound(key)));
	}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
		}
		
		public SelectorException(String message, Throwable cause) {
			super(message, cause);
		}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/Selector.java`
#### Snippet
```java
		}
		
		public SelectorException(Throwable cause) {
			super(cause);
		}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	private final ChrislieGuild guild;
	
	public GuildSelector(@NonNull ChrislieGuild guild) {
		this.guild = guild;
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieMessage message) {
		return check(message.channel());
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/GuildSelector.java`
#### Snippet
```java
	
	@Override
	public boolean check(ChrislieService service) {
		return false;
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
	private static class Config {
		
		private @NotBlank String guild;
		private boolean includeOthers; // if true, will match even if inside other guild
	}
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/config/scope/selector/UserIsPartOfGuild.java`
#### Snippet
```java
		
		private @NotBlank String guild;
		private boolean includeOthers; // if true, will match even if inside other guild
	}
}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/ClientLogic.java`
#### Snippet
```java
	@CommandFilter("ERROR")
	@Handler(delivery = Invoke.Synchronously)
	public void onDisconnect(ClientReceiveCommandEvent ev) {
		log.error("server terminated connection, reason: {}", ev.getParameters());
		ev.getClient().reconnect("Received ERROR from server");
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/ClientLogic.java`
#### Snippet
```java
	@CommandFilter("PING")
	@Handler(delivery = Invoke.Synchronously)
	public void onPing(ClientReceiveCommandEvent ev) {
		var param = ev.getParameters();
		String r = "Chrisliebot";
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/ClientLogic.java`
#### Snippet
```java
	
	@Handler
	public void onInvite(ChannelInviteEvent ev) {
		if (ev.getTarget().equals(ev.getClient().getNick())) {
			log.info("received invite from {} to join {}", ev.getActor().getName(), ev.getChannel().getName());
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder permission() {
		return PERMISSION_ERROR;
	}
```

### unused
Parameter `req` is not used
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteRequest(Request req, Throwable t) {
		var reason = t.getMessage();
		
```

### unused
Parameter `req` is not used
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteErrorCode(Request req, @SuppressWarnings("UnnecessaryFullyQualifiedName") retrofit2.Response<?> resp) {
		
		return new ErrorOutputBuilder()
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteErrorCode(Request req, @SuppressWarnings("UnnecessaryFullyQualifiedName") okhttp3.Response resp) {
		return new ErrorOutputBuilder()
				.fn(out -> {
```

### unused
Parameter `req` is not used
in `src/main/java/chrisliebaer/chrisliebot/util/ErrorOutputBuilder.java`
#### Snippet
```java
	}
	
	public static ErrorOutputBuilder remoteErrorCode(Request req, @SuppressWarnings("UnnecessaryFullyQualifiedName") okhttp3.Response resp) {
		return new ErrorOutputBuilder()
				.fn(out -> {
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
		return validate(gson.fromJson(json, typeOfT));
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException, JsonSyntaxException {
		return validate(gson.fromJson(reader, typeOfT));
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public String toJson(Object src, Type typeOfSrc) {
		return gson.toJson(validate(src), typeOfSrc);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(Object src, Appendable writer) throws JsonIOException {
		gson.toJson(validate(src), writer);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(Object src, Type typeOfSrc, Appendable writer) throws JsonIOException {
		gson.toJson(validate(src), typeOfSrc, writer);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(Object src, Type typeOfSrc, JsonWriter writer) throws JsonIOException {
		gson.toJson(validate(src), typeOfSrc, writer);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public String toJson(JsonElement jsonElement) {
		return gson.toJson(jsonElement);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	public void toJson(JsonElement jsonElement, Appendable writer) throws JsonIOException {
		gson.toJson(jsonElement, writer);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logChannel(ActorChannelMessageEventBase<User> ev) {
		MessageType type = null;
		if (ev instanceof ChannelCtcpEvent) {
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logJoin(ChannelJoinEvent ev) {
		logMessage(new Date(), ev.getChannel().getName(), ev.getUser(), null, MessageType.JOIN);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logPart(ChannelPartEvent ev) {
		logMessage(new Date(), ev.getChannel().getName(), ev.getUser(), null, MessageType.PART);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuit(UserQuitEvent ev) {
		if (ev.getAffectedChannel().isPresent()) {
			logMessage(new Date(), ev.getAffectedChannel().get().getName(), ev.getUser(), null, MessageType.QUIT);
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logQuery(ActorPrivateMessageEventBase<User> ev) {
		if (ev instanceof PrivateMessageEvent) {
			logMessage(new Date(), ev.getTarget(), ev.getActor(), ev.getMessage(), MessageType.NORMAL);
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logNick(UserNickChangeEvent ev) {
		logMessage(new Date(), ev.getOldUser().getNick(), ev.getOldUser(), ev.getSource().getMessage(), MessageType.NICK);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	
	@Handler
	public void logKick(ChannelKickEvent ev) {
		logMessage(new Date(), ev.getChannel().getName(), ev.getUser(), ev.getMessage() + "(" + ev.getTarget().getNick() + ")", MessageType.KICK);
	}
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
public class OutOfBandTransmission {
	
	private static final String FILE_EXTENSION = ".txt";
	private static final Charset CHARSET = StandardCharsets.UTF_8;
	
```

### unused
Field has no usages.
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
	
	private static final String FILE_EXTENSION = ".txt";
	private static final Charset CHARSET = StandardCharsets.UTF_8;
	
	private @NotBlank String generator;
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
	private static final Charset CHARSET = StandardCharsets.UTF_8;
	
	private @NotBlank String generator;
	private @NotBlank String path;
	
```

### unused
Field is never assigned.
in `src/main/java/chrisliebaer/chrisliebot/util/OutOfBandTransmission.java`
#### Snippet
```java
	
	private @NotBlank String generator;
	private @NotBlank String path;
	
	public String send(String content) throws IOException {
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static Optional<String> of(String name) {
		return get(name, Optional::of, Optional.empty());
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static String of(String name, String def) {
		return get(name, Function.identity(), def);
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/SystemProperty.java`
#### Snippet
```java
	}
	
	public static <V> Optional<V> of(String name, Function<String, V> convert) {
		return get(name, s -> Optional.of(s).map(convert), Optional.empty());
	}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/VersionUtil.java`
#### Snippet
```java
	public static String clean() { return INSTANCE.clean; }
	
	public static String buildTime() { return INSTANCE.buildTime; }
	
	public static String shortVersion() {
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	private ChrislieParser parent;
	
	private ChrislieParser(ChrislieParser parser) {
		parent = parser; // store reference to parant parser
		
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @param s The string to use.
	 */
	public ChrislieParser(@NonNull String s) {
		this(s, 0);
	}
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @param idx The offset in codepoints.
	 */
	public ChrislieParser(@NonNull String s, int idx) {
		codepoints = s.substring(idx).codePoints().toArray();
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 * @return OptionMap that will operate on this parser.
	 */
	public OptionsMap options() {
		return new OptionsMap(this);
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
	 */
	@CheckReturnValue
	public TokenSelector quoted(boolean skipWhitespace) {
		return TokenSelector.maybeQuotedString(this, skipWhitespace);
	}
```

### unused
Constructor is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		private final int index;
		
		public ParserException(ChrislieParser parser) {
			input = parser.codepoints;
			index = parser.idx;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		}
		
		public ParserException(ChrislieParser parser, String message) {
			super(message);
			input = parser.codepoints;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		}
		
		public ParserException(ChrislieParser parser, String message, Throwable t) {
			super(message, t);
			input = parser.codepoints;
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		}
		
		public ParserException(ChrislieParser parser, Throwable t) {
			super(t);
			input = parser.codepoints;
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 * exception occured.
		 */
		public String current() {
			return intStreamToString(IntStream.of(input).skip(index));
		}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/ChrislieParser.java`
#### Snippet
```java
		 * @return Reconstructs the input string from the internal code point array.
		 */
		public String string() {
			return intStreamToString(IntStream.of(input));
		}
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @return Wraps the value of this class into an {@link Optional}.
	 */
	public Optional<String> optional();
	
	/**
```

### unused
Method is never used.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	 * @throws NoSuchElementException If the token was successfully parsed and thous no exception was raised.
	 */
	public ParserException throwable() throws NoSuchElementException;
	
	/**
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @param parser The parser that this OptionsMap will operate on.
	 */
	protected OptionsMap(@NonNull ChrislieParser parser) {
		this.parser = parser;
	}
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @throws IllegalArgumentException If the given flags collide with existing flags or options.
	 */
	public BooleanSupplier flag(String... flags) throws IllegalArgumentException {
		// check if flags are causing conflict
		for (var f : flags)
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * @throws IllegalArgumentException If the given options collide with existing flags or options.
	 */
	public Supplier<Optional<String>> option(Function<ChrislieParser, TokenSelector> selector, String... options) throws IllegalArgumentException {
		// check if flags are causing conflict
		for (var f : options)
```

### unused
* Method owner class is never instantiated OR
* An instantiation is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	 * Needs to be called after all flags and options have been registered.
	 */
	public void parse() throws ChrislieParser.ParserException {
		
		// we keep a fork of the current parser that we commit after we have completed parsing
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
		private Optional<String> value = Optional.empty();
		
		public Option(Function<ChrislieParser, TokenSelector> selector) {
			this.selector = selector;
		}
```

### unused
All constructor usages belong to the calls chain that has no members reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	public static class OptionsMapException extends Exception {
		
		public OptionsMapException(String reason) {
			super(reason);
		}
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/ChrislieIdentifier.java`
#### Snippet
```java
	@EqualsAndHashCode
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class ChannelIdentifier {
		
		private final String service;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
 * is to specify complex outputs in config languages without being able to call actual code.
 */
public class SerializedOutput {
	
	private String title;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	}
	
	private static final class Field {
		
		private @NotBlank String name;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/SerializedOutput.java`
#### Snippet
```java
	}
	
	private static final class PlainOutputCall {
		
		public static final ChrislieFormat[] EMPTY_FORMATS = new ChrislieFormat[0];
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/discord/DiscordBootstrap.java`
#### Snippet
```java
import javax.security.auth.login.LoginException;

public class DiscordBootstrap implements ServiceBootstrap {
	
	private String token;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java

@Slf4j
public class IrcBootstrap implements ServiceBootstrap {
	
	private boolean chatlog; // enable logging of all messages to database
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/abstraction/irc/IrcBootstrap.java`
#### Snippet
```java
	 * Adding this handler to the event processor will enable the "echo-message" capability if supported by the server.
	 */
	private static class EchoCapHandler {
		
		@Handler
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
import java.util.Optional;

public class AttachmenViewerCommand implements ChrislieListener.Command {
	
	private Config cfg;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/attachment/AttachmenViewerCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private String baseUrl;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NickCommand.java`
#### Snippet
```java

//TODO: put global and other guild rename behind permission
public class NickCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/NullCommand.java`
#### Snippet
```java
 * eat the invocation.
 */
public class NullCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java

@Slf4j
public class RecruitCommand implements ChrislieListener.Command {
	
	private Config cfg;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/RecruitCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private @URL @NotNull String recruitUrl;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/StaticOutputCommand.java`
#### Snippet
```java
import java.util.Objects;

public class StaticOutputCommand implements ChrislieListener.Command {
	
	private SerializedOutput out;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/basic/VersionCommand.java`
#### Snippet
```java
import java.util.Optional;

public class VersionCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/bottlespin/BottleSpinCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class BottleSpinCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/choice/ChoiceCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ChoiceCommand implements ChrislieListener.Command {
	
	private static final String[] FLAVOUR = {
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java

@Slf4j
public class CronListener implements ChrislieListener {
	
	
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Data
	private static class Config {
		private ZoneId zoneId;
		
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/cron/CronListener.java`
#### Snippet
```java
	
	@Data
	private static class CronEntry {
		@NonNull
		private Cron cron;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordEmojiManagement.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class DiscordEmojiManagement implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/DiscordListEmojis.java`
#### Snippet
```java
import java.util.Optional;

public class DiscordListEmojis implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/discord/ExplainCommand.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class ExplainCommand implements ChrislieListener.Command {
	
	// the one that comes with JDA can't handle DM refs
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/dns/DnsCommand.java`
#### Snippet
```java

//TODO: replace with async resolver
public class DnsCommand implements ChrislieListener.Command {
	
	private static final int TIMEOUT = 5000;
```

### unused
Abstract class has an implementation but

* it is never instantiated OR
* no instantiations are reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	webhook funktioniert ?hnlich, kann jedoch nur reagieren und ob er das ziel ausw?hlen kann pendeln wir noch aus
 */
public abstract class ExternalCommandListener implements ChrislieListener.Command {
	
	protected abstract @NonNull @org.checkerframework.checker.nullness.qual.NonNull Config externalConfig();
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalCommandListener.java`
#### Snippet
```java
	protected abstract void externalMessage(ListenerMessage msg) throws ListenerException;
	
	protected static class Config {
		
		private boolean implementsListener;
```

### unused
Class has 2 instantiations, but they are not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
 */
@Slf4j
public final class ExternalMessageTranslator {
	
	private static final String ENV_PREFIX = "CB_";
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	
	@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
	public static class ExternalInvocation {
		
		private String argument; // non-null argument string
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public static class ExternalUser {
		
		private String identifier;
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public static class ExternalChannel {
		
		private String identifier;
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ExternalMessageTranslator.java`
#### Snippet
```java
	}
	
	public static class ExternalGuild {
		
		private String identifier;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java

@Slf4j
public class ShellCommand extends ExternalCommandListener {
	
	@SuppressWarnings("FieldAccessedSynchronizedAndUnsynchronized")
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/external/ShellCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private @NotNull ExternalCommandListener.Config ext;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/FileGenerator.java`
#### Snippet
```java
	}
	
	protected static class Config {
		
		private @NotBlank String file;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
import static chrisliebaer.chrisliebot.C.escapeStrSubstitution;

public class GeneratorCommand implements ChrislieListener.Command {
	
	private SerializedOutput output;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private @NotNull SerializedOutput output;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/generator/GeneratorCommand.java`
#### Snippet
```java
	}
	
	private static class GeneratorConfig {
		
		private String type;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
import java.util.Optional;

public class HaskellCommand implements ChrislieListener.Command {
	
	private static String FLEX_TIMEOUT = "haskell.timeout";
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellCommand.java`
#### Snippet
```java
	
	@Data
	private static class Config {
		
		@URL @NotNull
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Param {
		private String proc;
		private Args args;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Args {
		private String expression;
		private String timelimit;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/haskell/HaskellService.java`
#### Snippet
```java
	@Data
	@Builder
	public static class Output {
		private int returncode;
		private String output;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/help/HelpCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class HelpCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/irc/IrcDropAccountCommand.java`
#### Snippet
```java
import java.util.Optional;

public class IrcDropAccountCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_IRC_ONLY = ErrorOutputBuilder.generic("Dieser Befehl ist nur in IRC Netzwerken verf?gbar.");
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/kit/finals2021/escaperoutes/KitEscapeRoutesCommand.java`
#### Snippet
```java
 * massively simplified by removing ambiguities. Something which I didn't bother sinking time into. It is what it is.
 */
public class KitEscapeRoutesCommand implements ChrislieListener.Command {
	
	private static final int LIMIT_MAX_FLOW_CACHE = 20;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/LogConfigCommand.java`
#### Snippet
```java

@Slf4j
public class LogConfigCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/RestartCommand.java`
#### Snippet
```java
import java.util.Optional;

public class RestartCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/ShutdownCommand.java`
#### Snippet
```java
import java.util.Optional;

public class ShutdownCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/manage/UpgradeCommand.java`
#### Snippet
```java
import java.util.Optional;

public class UpgradeCommand implements ChrislieListener.Command { // TODO: replace with implementation that first attempts to build and run chrisliebot before upgrading
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
@Slf4j
// TODO: include nsfw filter, requires change to tags in meme indexer?
public class MemeDbCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_NO_DATABASE =
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Data
	private static class DatabaseEntry {
		
		private String hash;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/memedb/MemeDbCommand.java`
#### Snippet
```java
	
	@Data
	private static class Config {
		
		private String baseUrl;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/mensa/MensaCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private @NotNull @NotBlank String username;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/quiz/QuizCommand.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.command.ChrislieListener;

public class QuizCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
@SuppressWarnings({"SynchronizeOnNonFinalField", "FieldAccessedSynchronizedAndUnsynchronized"})
// resultStorage never changes but can't be final
public class QwantSearchCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_NO_QUERY = ErrorOutputBuilder.generic("Du hast keine Suchanfrage eingegeben.");
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantSearchCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private @NotNull SerializedOutput output;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
	
	@Data
	public static class QwantResponse {
		
		private String status;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		private static class QwantQuery {
			
			public String query;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		private static class QwantData {
			
			public QwantResult result;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		public static class QwantMainlineItemsBullshit {
			
			public List<QwantResult> mainline;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		private static class QwantResult {
			
			public JsonElement items;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		
		@Data
		public static class QwantItem {
			
			private String title;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		public static class QwantMediaSubObject {
			public QwantMediaSubObject2 pict;
		}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/qwant/QwantService.java`
#### Snippet
```java
		}
		
		public static class QwantMediaSubObject2 {
			public String url;
		}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/random/CoinCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class CoinCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/random/DiceCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class DiceCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java

@Slf4j
public class RedditListener implements ChrislieListener {
	
	private static final int REDDIT_COLOR = 16721664;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/RedditListener.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		@NotNull private ChrislieIdentifier.ChannelIdentifier channel;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java

@Data
public class SubredditListing {
	
	private SubredditData data;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java
	
	@Data
	public static class SubredditData {
		private List<Container> children;
		private String before, after;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java
	
	@Data
	public static class Container {
		private PostData data;
	}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java
	
	@Data
	public static class PostData {
		private String name; // what we need to stuff into "before" and "after"
		private String selftext;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java
	
	@Data
	public static class Preview {
		private List<PreviewImages> images;
	}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java
	
	@Data
	public static class PreviewImages {
		private PreviewImagesUrl source;
	}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/reddit/SubredditListing.java`
#### Snippet
```java
	
	@Data
	public static class PreviewImagesUrl {
		private String url;
	}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java

@Slf4j
public class SedListener implements ChrislieListener {
	
	private static final Pattern SED_PATTERN = Pattern.compile("^s/(?<search>([^/]|\\\\/)+)/(?<replace>([^/]|\\\\/)*)/(?<flags>[g]*)$");
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/sed/SedListener.java`
#### Snippet
```java
	
	@AllArgsConstructor
	private static class StoredMessage {
		
		private String nickname, message;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java

// TODO: emote only channel
public class SpecialChannel implements ChrislieListener {
	
	private Config cfg;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/specialchannel/SpecialChannel.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		@NotNull private Mode mode; // action to perform on match
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/string/EmojifyCommand.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class EmojifyCommand implements ChrislieListener.Command {
	
	private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\b +\\b", Pattern.UNICODE_CHARACTER_CLASS);
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/string/FlipCommand.java`
#### Snippet
```java
import java.util.Optional;

public class FlipCommand implements ChrislieListener.Command {
	
	private static final String LOOKUP_NORMAL;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/string/MockCommand.java`
#### Snippet
```java
import java.util.concurrent.ThreadLocalRandom;

public class MockCommand implements ChrislieListener.Command {
	
	@Override
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/string/ScrambleCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ScrambleCommand implements ChrislieListener.Command {
	
	private static final Pattern INNER_WORD_PATTERN = Pattern.compile("\\b\\w(.+?)\\w\\b");
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
 */
@Slf4j
public class TimerCommand implements ChrislieListener.Command {
	
	private static final Timestamp UNIX_EPOCH_SECOND_1 = Timestamp.from(Instant.ofEpochSecond(1));
```

### unused
Class has 2 instantiations, but they are not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@ToString
	private static class TimerInfo {
		
		private long id;
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	
	@AllArgsConstructor
	private static class ScheduledTimer {
		
		private final TimerInfo timerInfo;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	}
	
	private static class Config {
		
		private @Positive long expire;
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/timer/TimerCommand.java`
#### Snippet
```java
	}
	
	private static class IdParseException extends Exception {
	}
}
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
// TODO: twitter api is a gigantic mess and we have no pollished library to use, so consider this feature an experiment
@Slf4j
public class TwitterTimelineNotifier implements ChrislieListener {
	
	private Config cfg;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Data
	private static class Config {
		
		public long interval;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/twitter/TwitterTimelineNotifier.java`
#### Snippet
```java
	
	@Data
	private static class TimelineSubscription {
		
		private ChrislieIdentifier.ChannelIdentifier channel;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/unicode/UnicodeCommand.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class UnicodeCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_NUMBER_PARSE = ErrorOutputBuilder.generic("Das sah zwar gut aus, aber ich habs trotzdem nicht gerafft.");
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/until/UntilCommand.java`
#### Snippet
```java

// TODO: port to new v3 architecture
public class UntilCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_INVALID_DATE = ErrorOutputBuilder.generic("Ich seh da nichts was einen Zeitpunkt darstellt.");
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryCommand.java`
#### Snippet
```java
import retrofit2.Retrofit;

public class UrbanDictionaryCommand implements ChrislieListener.Command {
	
	private static final ErrorOutputBuilder ERROR_NO_QUERY = ErrorOutputBuilder.generic("Du hast keinen Suchbegriff eingegeben.");
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class DefinitionList {
		
		private List<Definition> list;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/urbandictionary/UrbanDictionaryService.java`
#### Snippet
```java
	
	@Data
	public static class Definition {
		
		private String definition, example, word;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java

@Slf4j
public class UrlPreviewListener implements ChrislieListener {
	
	private static final String FLEX_LOGSIZE = "urlpreview.logsize";
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	
	@Data
	private static class Config {
		
		private List<String> hostBlacklist;
```

### unused
Class has 2 instantiations, but they are not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/command/urlpreview/UrlPreviewListener.java`
#### Snippet
```java
	@AllArgsConstructor
	@SuppressWarnings("PackageVisibleInnerClass")
	static class HistoryEntry {
		
		private @NonNull String data;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/RegExpTransformCommand.java`
#### Snippet
```java
import chrisliebaer.chrisliebot.config.flex.FlexConf;

public class RegExpTransformCommand extends TransformCommand {
	
	@Override
```

### unused
Class and its implementation are never instantiated.
in `src/main/java/chrisliebaer/chrisliebot/command/wrapper/TransformCommand.java`
#### Snippet
```java
import java.util.Optional;

public class TransformCommand implements ChrislieListener.Command {
	
	private static final String TRANSFORM_TARGET = "transform.target";
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	
	@ToString
	private static class ScopeToGroup {
		
		private List<JsonSelector> selectors;
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/config/JsonBotConfig.java`
#### Snippet
```java
	 */
	@ToString
	private static class ListenerAnchor {
		// both ref and def are defined within the same class so we can ensure the uer didn't provide conflicting fields
		
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/ClientLogic.java`
#### Snippet
```java
 */
@Slf4j
public class ClientLogic {
	
	//TODO: keep track of incoming lines and reconnect if timeout
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/util/GsonValidator.java`
#### Snippet
```java
	}
	
	private static class RequestConverterHelper<T> implements Converter<T, RequestBody> {
		
		@Nullable
```

### unused
Class is not instantiated.
in `src/main/java/chrisliebaer/chrisliebot/util/IrcToSqlLogger.java`
#### Snippet
```java
	@Data
	@Builder
	private static class LogRecord {
		
		private Timestamp timestamp; // find out type
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class ValueToken implements OptionalToken {
		
		private final String value;
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionalToken.java`
#### Snippet
```java
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class NoToken implements OptionalToken {
		
		@Getter private final ParserException throwable;
```

### unused
Class has one instantiation, but it is not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/OptionsMap.java`
#### Snippet
```java
	}
	
	private class Flag implements BooleanSupplier, OptionContainer {
		
		private boolean value;
```

### unused
Class has 4 instantiations, but they are not reachable from entry points.
in `src/main/java/chrisliebaer/chrisliebot/util/parser/TokenSelector.java`
#### Snippet
```java
 */
@AllArgsConstructor
public class TokenSelector {
	
	private final ChrislieParser parser;
```

