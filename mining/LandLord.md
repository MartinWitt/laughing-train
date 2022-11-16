# LandlordPlugin/LandLord
# Bad smells
I found 211 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 33 | false |
| RuleId[ruleID=TrivialStringConcatenation] | 29 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 19 | false |
| RuleId[ruleID=EnhancedSwitchMigration] | 17 | false |
| RuleId[ruleID=BoundedWildcard] | 17 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 9 | true |
| RuleId[ruleID=DataFlowIssue] | 8 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 7 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 6 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 5 | true |
| RuleId[ruleID=EmptyMethod] | 5 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 5 | false |
| RuleId[ruleID=SuspiciousNameCombination] | 4 | false |
| RuleId[ruleID=CommentedOutCode] | 4 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 4 | false |
| RuleId[ruleID=StaticCallOnSubclass] | 3 | false |
| RuleId[ruleID=MissortedModifiers] | 3 | false |
| RuleId[ruleID=RedundantMethodOverride] | 3 | false |
| RuleId[ruleID=EnumSwitchStatementWhichMissesCases] | 2 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 2 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 2 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 2 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 2 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 2 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 2 | false |
| RuleId[ruleID=ClassCanBeRecord] | 2 | false |
| RuleId[ruleID=UnusedAssignment] | 2 | false |
| RuleId[ruleID=PatternVariableCanBeUsed] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 1 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 1 | false |
| RuleId[ruleID=NestedAssignment] | 1 | false |
| RuleId[ruleID=ReplaceNullCheck] | 1 | false |
| RuleId[ruleID=CodeBlock2Expr] | 1 | false |
| RuleId[ruleID=RedundantImplements] | 1 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 1 | false |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 1 | false |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 1 | false |
| RuleId[ruleID=ConstantValue] | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (manageMode) { case MULTI: lgManager.sendMessage(player, lgManage...` statement on enum type 'biz.princeps.landlord.api.ManageMode' misses case 'ONE'
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiUnclaimTask.java`
#### Snippet
```java
    @Override
    public void complete() {
        switch (manageMode) {
            case MULTI:
                lgManager.sendMessage(player, lgManager.getString(player, "Commands.MultiUnclaim.success")
                        .replace("%amount%", "" + unclaimedLands)
                        .replace("%money%", (Options.isVaultEnabled() ? plugin.getVaultManager().format(totalPayBack) : "-eco disabled-")));
                break;
            case ALL:
                lgManager.sendMessage(player, lgManager.getString(player, "Commands.UnclaimAll.success")
                        .replace("%amount%", "" + unclaimedLands)
                        .replace("%world%", world.getName())
                        .replace("%money%", (Options.isVaultEnabled() ? plugin.getVaultManager().format(totalPayBack) : "-eco disabled-")));
                break;
        }

        new BukkitRunnable() {
```

### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (blockFace) { case NORTH: for (int z = zCenter; z >= zCen...` statement on enum type 'org.bukkit.block.BlockFace' misses cases: 'UP', 'DOWN', 'NORTH_EAST', 'NORTH_WEST', ...
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiMode.java`
#### Snippet
```java
            BlockFace blockFace = JavaUtils.getBlockFace(center.getYaw());

            switch (blockFace) {
                case NORTH:
                    for (int z = zCenter; z >= zCenter - radius; z--) {
                        landsLocations.add(new Location(world, xCenter << 4, 0, z << 4));
                    }
                    break;
                case EAST:
                    for (int x = xCenter; x <= xCenter + radius; x++) {
                        landsLocations.add(new Location(world, x << 4, 0, zCenter << 4));
                    }
                    break;
                case WEST:
                    for (int x = xCenter; x >= xCenter - radius; x--) {
                        landsLocations.add(new Location(world, x << 4, 0, zCenter << 4));
                    }
                    break;
                case SOUTH:
                    for (int z = zCenter; z <= zCenter + radius; z++) {
                        landsLocations.add(new Location(world, xCenter << 4, 0, z << 4));
                    }
                    break;
            }

            return landsLocations;
```

## RuleId[ruleID=SuspiciousNameCombination]
### RuleId[ruleID=SuspiciousNameCombination]
'minHeight' should probably not be passed as parameter 'left'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
        // This will claim the whole chunk.
        if (boundaryMethod == ClaimHeightDefinition.FULL) {
            return Pair.of(minHeight, maxHeight);
        }

```

### RuleId[ruleID=SuspiciousNameCombination]
'maxHeight' should probably not be passed as parameter 'right'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
        // This will claim the whole chunk.
        if (boundaryMethod == ClaimHeightDefinition.FULL) {
            return Pair.of(minHeight, maxHeight);
        }

```

### RuleId[ruleID=SuspiciousNameCombination]
'bottomY' should probably not be passed as parameter 'left'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
            topY = Math.min(topY, maxHeight);
        }
        return Pair.of(bottomY, topY);
    }

```

### RuleId[ruleID=SuspiciousNameCombination]
'topY' should probably not be passed as parameter 'right'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
            topY = Math.min(topY, maxHeight);
        }
        return Pair.of(bottomY, topY);
    }

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ChatAPI` has only 'static' members, and lacks a 'private' constructor
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ChatAPI.java`
#### Snippet
```java
 * This class can be used to generate new messages. Just wraps around existing classes
 */
public class ChatAPI {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpigotUtil` has only 'static' members, and lacks a 'private' constructor
in `LandLord-core/src/main/java/biz/princeps/lib/util/SpigotUtil.java`
#### Snippet
```java
 * Created by spatium on 11.06.17.
 */
public class SpigotUtil {

    public static Location exactlocationFromString(String s) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Options` has only 'static' members, and lacks a 'private' constructor
in `LandLord-api/src/main/java/biz/princeps/landlord/api/Options.java`
#### Snippet
```java
 * Options class, which pulls some stuff out of the config.
 */
public class Options {

    private static FileConfiguration cfg;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TimeUtil` has only 'static' members, and lacks a 'private' constructor
in `LandLord-core/src/main/java/biz/princeps/lib/util/TimeUtil.java`
#### Snippet
```java
 * Created by spatium on 11.06.17.
 */
public class TimeUtil {

    public static String secToMin(int i) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConfigUpdater` has only 'static' members, and lacks a 'private' constructor
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
import java.util.logging.Level;

public class ConfigUpdater {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JavaUtils` has only 'static' members, and lacks a 'private' constructor
in `LandLord-core/src/main/java/biz/princeps/landlord/util/JavaUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class JavaUtils {

    public static final BlockFace[] BLOCK_FACES = new BlockFace[]{BlockFace.SOUTH, BlockFace.WEST, BlockFace.NORTH, BlockFace.EAST};
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MathUtil` has only 'static' members, and lacks a 'private' constructor
in `LandLord-core/src/main/java/biz/princeps/lib/util/MathUtil.java`
#### Snippet
```java
 * Created by spatium on 29.07.17.
 */
public class MathUtil {

    public static List<Location> helix(Location center, float radius, int amount, double offset) {
```

## RuleId[ruleID=StaticCallOnSubclass]
### RuleId[ruleID=StaticCallOnSubclass]
Static method `toBlockPoint()` declared in class 'com.sk89q.worldedit.Vector' but referenced via subclass 'com.sk89q.worldedit.BlockVector'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        Vector v2 = new Location(world, x + 15, 255, z + 15).toVector();

        BlockVector b1 = BlockVector.toBlockPoint(v1.getX(), v1.getY(), v1.getZ());
        BlockVector b2 = BlockVector.toBlockPoint(v2.getX(), v2.getY(), v2.getZ());

```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `toBlockPoint()` declared in class 'com.sk89q.worldedit.Vector' but referenced via subclass 'com.sk89q.worldedit.BlockVector'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java

        BlockVector b1 = BlockVector.toBlockPoint(v1.getX(), v1.getY(), v1.getZ());
        BlockVector b2 = BlockVector.toBlockPoint(v2.getX(), v2.getY(), v2.getZ());

        CuboidRegion region = new CuboidRegion(weWorld, b1, b2);
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `toBlockPoint()` declared in class 'com.sk89q.worldedit.Vector' but referenced via subclass 'com.sk89q.worldedit.BlockVector'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        CuboidRegion region = new CuboidRegion(weWorld, b1, b2);
        try {
            region.shift(BlockVector.toBlockPoint(0, amount, 0));
        } catch (RegionOperationException e) {
            e.printStackTrace();
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Argument `flag` might be null
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
    }

```

### RuleId[ruleID=DataFlowIssue]
Argument `target` might be null
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/LLItem.java`
#### Snippet
```java
        if (targetingPlayer == null) {
            if (properties.isPlayer()) {
                lm.sendMessage(properties.getPlayer(), lm.getString(properties.getPlayer(), "Commands.Item.noPlayer").replace("%player%", target));
            } else {
                properties.sendMessage(lm.getString(properties.getPlayer(), "Commands.Item.noPlayer").replace("%player%", target));
```

### RuleId[ruleID=DataFlowIssue]
Argument `target` might be null
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/LLItem.java`
#### Snippet
```java
                lm.sendMessage(properties.getPlayer(), lm.getString(properties.getPlayer(), "Commands.Item.noPlayer").replace("%player%", target));
            } else {
                properties.sendMessage(lm.getString(properties.getPlayer(), "Commands.Item.noPlayer").replace("%player%", target));
            }
            return;
```

### RuleId[ruleID=DataFlowIssue]
Argument `a` might be null
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/ConfigurationManager.java`
#### Snippet
```java
            if (i > version) {
                try (InputStream a = plugin.getClass().getResourceAsStream(pathInJar)) {
                    Files.copy(a, Paths.get(pathToExisting + ".v" + i), StandardCopyOption.REPLACE_EXISTING);
                }
                plugin.getLogger().warning(pathToExisting + " config file is not up-to-date! " +
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setOwningPlayer` may produce `NullPointerException`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MaterialsManager.java`
#### Snippet
```java
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta itemMeta = (SkullMeta) skull.getItemMeta();
        itemMeta.setOwningPlayer(plugin.getServer().getOfflinePlayer(owner));
        skull.setItemMeta(itemMeta);
        return skull;
```

### RuleId[ruleID=DataFlowIssue]
Argument `flag` might be null
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `charAt` may produce `NullPointerException`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            String s = type.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toUpperCase` may produce `NullPointerException`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
        @Override
        public String getName() {
            return type.getName().toUpperCase();
        }
    }
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java

        String command = e.getMessage();
        //  command = command.substring(1, command.length());
        //   System.out.println("found command: " + command);
        if (this.isDelayedCommand(command.toLowerCase())) {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (16 lines)
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
    }

    /*
    public void sendCountdown(final Player p, final int delay) {
        new BukkitRunnable() {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (39 lines)
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLFeatherBoard.java`
#### Snippet
```java
    private void registerPlaceholders(ILandLord plugin) {
        plugin.getLogger().warning("Featherboard Placeholders do not work. Please tell Maxim from Featherboard to take a look at the MVdWPlaceholderAPI repo.");
        /*
        PlaceholderAPI.registerPlaceholder(plugin, "ownedlands",
                e -> {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
    public IPlayer getPlayer(UUID id) {
        Triplet triplet = executeQuery("SELECT * FROM ll_players WHERE uuid = '" + id + "'");
        // plugin.getLogger().log(Level.INFO, "Query: " + "SELECT * FROM ll_players WHERE " + mode.name().toLowerCase() + " = '" +
        //        sanitize(obj.toString()) + "'");
        try {
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `mapList.keySet()` may be replaced with 'values()' iteration
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/map/MapManager.java`
#### Snippet
```java
    @Override
    public void removeAllMaps() {
        for (UUID uuid : mapList.keySet()) {
            mapList.get(uuid).removeMap();
        }
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `mapList.keySet()` may be replaced with 'values()' iteration
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/map/MapManager.java`
#### Snippet
```java
    @Override
    public void updateAll() {
        for (UUID uuid : mapList.keySet()) {
            mapList.get(uuid).forceUpdate();
        }
```

## RuleId[ruleID=PatternVariableCanBeUsed]
### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'player' can be replaced with pattern variable
in `LandLord-core/src/main/java/biz/princeps/lib/gui/simple/AbstractGUI.java`
#### Snippet
```java
                event.setCancelled(true);
                if (event.getWhoClicked() instanceof Player) {
                    Player player = (Player) event.getWhoClicked();
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null || itemStack.getType() == Material.AIR)
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`applicableRegions.getRegions().size() > 0` can be replaced with '!applicableRegions.getRegions().isEmpty()'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        ApplicableRegionSet applicableRegions = getRegionManager(loc.getWorld())
                .getApplicableRegions(locationToVec(loc));
        if (applicableRegions.getRegions().size() > 0) { // check for other lands, that may not be handled by landlord
            for (ProtectedRegion protectedRegion : applicableRegions.getRegions()) {
                if (protectedRegion.isMember(localPlayer) || protectedRegion.isOwner(localPlayer)) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`land.getFriends().size() > 0` can be replaced with '!land.getFriends().isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/friends/ListFriends.java`
#### Snippet
```java
            return;
        }
        if (land.getFriends().size() > 0)
            lm.sendMessage(player, lm.getString(player, "Commands.Listfriends.friends")
                    .replace("%friends%", land.getMembersString()));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`lands.size() > 0` can be replaced with '!lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/AdminTeleport.java`
#### Snippet
```java
                // Success
                Set<IOwnedLand> lands = plugin.getWGManager().getRegions(offline.getUuid());
                if (lands.size() > 0) {
                    MultiPagedGUI landGui = new MultiPagedGUI(plugin, sender, 5,
                            lm.getRawString("Commands.AdminTp.guiHeader").replace("%player%", target));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`applicableRegions.getRegions().size() > 0` can be replaced with '!applicableRegions.getRegions().isEmpty()'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        ApplicableRegionSet applicableRegions = getRegionManager(loc.getWorld())
                .getApplicableRegions(locationToVec(loc));
        if (applicableRegions.getRegions().size() > 0) { // check for other lands, that may not be handled by landlord
            for (ProtectedRegion protectedRegion : applicableRegions.getRegions()) {
                if (protectedRegion.isMember(localPlayer) || protectedRegion.isOwner(localPlayer)) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`region.getFlags().size() == 0` can be replaced with 'region.getFlags().isEmpty()'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java

        // Insert default flags.
        if (region.getFlags().size() == 0) {
            initFlags(owner);
            initRegionPriority();
```

## RuleId[ruleID=EnhancedSwitchMigration]
### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-api/src/main/java/biz/princeps/landlord/api/IMaterialsManager.java`
#### Snippet
```java

    default Material getWorldGrass(World world) {
        switch (world.getEnvironment()) {
            case NORMAL:
                return getGrass();
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLExpansion.java`
#### Snippet
```java

    private String parsePlaceholder(Player player, String placeholder) {
        switch (placeholder) {
            // The amount of claimed lands
            case "owned_lands":
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/Update.java`
#### Snippet
```java
            String option = arguments.get(0);

            switch (option) {
                case "-u":
                    onUpdateLands(properties.getCommandSender());
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/lib/manager/ConfirmationManager.java`
#### Snippet
```java

    public void draw(Player p, String guiMessage, String chatMessage, Action onAccept, Action onDeny, String confirmCommand, int timout, AbstractGUI main) {
        switch (state) {

            case GUI:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/LandChangeListener.java`
#### Snippet
```java
        MessageDisplay type = MessageDisplay.valueOf(plugin.getConfig().getString("LandMessage"));
        // that would be super cool with switch expressions :(
        switch (type) {
            case ActionBar:
                sendMessage = (message, player) -> player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiUnclaimTask.java`
#### Snippet
```java
    @Override
    public void complete() {
        switch (manageMode) {
            case MULTI:
                lgManager.sendMessage(player, lgManager.getString(player, "Commands.MultiUnclaim.success")
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/util/Skulls.java`
#### Snippet
```java
        String numstring = String.valueOf(num);
        for (char c : numstring.toCharArray()) {
            switch (c) {
                case '1':
                    list.add(BLACK1);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiClearTask.java`
#### Snippet
```java
    @Override
    public void complete() {
        switch (clearType) {
            case PLAYER:
                plugin.getPlayerManager().getOffline(targetName, lPlayer -> {
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java

    private void executeAction(ItemClickAction clickAction, Player p, Location loc) {
        switch (clickAction.getResult()) {
            case INFO:
                plugin.getServer().dispatchCommand(p, "ll info");
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java

    private void checkForLandCondition(ItemClickAction clickAction, Player p, IOwnedLand landAtLoc, Location loc) {
        switch (clickAction.getCondition()) {

            case OWNLAND:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java
        } else {
            // land manage <allCommands>
            switch (args[0]) {
                case "setgreetall":
                    setGreet(player, args, new ArrayList<>(wg.getRegions(player.getUniqueId())), 1);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java
                        IOwnedLand target = wg.getRegion(args[0]);

                        switch (args[1]) {
                            case "setgreet":
                                setGreet(player, args, Collections.singletonList(target), 2);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiMode.java`
#### Snippet
```java
            BlockFace blockFace = JavaUtils.getBlockFace(center.getYaw());

            switch (blockFace) {
                case NORTH:
                    for (int z = zCenter; z >= zCenter - radius; z--) {
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/GiveClaims.java`
#### Snippet
```java
        }

        switch (args.size()) {
            case 3:
                // ll giveclaims name price amount
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/MultiListLands.java`
#### Snippet
```java
            try {
                // check arguments for different sub sub commands like /ll list <mode> <radius> <name> <pagenr>
                switch (arguments.size()) {
                    case 4:
                        target = arguments.get(2);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
                ComponentBuilder builder = new ComponentBuilder(lm.getString(player, "Commands.Manage.SetGreet.clickMsg"));

                switch (manageMode) {
                    case ALL:
                        builder.event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, managecmd + " setgreetall "));
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
                ComponentBuilder builder = new ComponentBuilder(lm.getString(player, "Commands.Manage.SetFarewell.clickMsg"));

                switch (manageMode) {
                    case ALL:
                        builder.event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, managecmd + " setfarewellall "));
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
                if (c == '_') {
                    sb.append(' ');
                    sb.append(Character.toUpperCase(s.charAt(++i)));
                } else {
                    sb.append(c);
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
                if (c == '_') {
                    sb.append(' ');
                    sb.append(Character.toUpperCase(s.charAt(++i)));
                } else {
                    sb.append(c);
```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
                int delay = this.getDelay(command.toLowerCase());
                e.setCancelled(true);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.getDontMove()).replace("%time%", "" + delay));
                // Utils.displayHelix(p, delay);

```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
                        } else {
                            if (countdown % 4 == 0)
                                getStuffManager().sendActionBar(p, ChatColor.translateAlternateColorCodes('&', getCountdown()).replace("%countdown%", "" + countdown / 4));

                            if (spawnParticles) {
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/chat/MultiPagedMessage.java`
#### Snippet
```java
     */
    private void updateTitle() {
        this.header = this.header.replace("%site%", "" + (pointer + 1))
                .replace("%maxsite%", (int) Math.ceil((double) elements.size() / (double) perSite) + "");
    }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/chat/MultiPagedMessage.java`
#### Snippet
```java
    private void updateTitle() {
        this.header = this.header.replace("%site%", "" + (pointer + 1))
                .replace("%maxsite%", (int) Math.ceil((double) elements.size() / (double) perSite) + "");
    }

```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiUnclaimTask.java`
#### Snippet
```java
            case MULTI:
                lgManager.sendMessage(player, lgManager.getString(player, "Commands.MultiUnclaim.success")
                        .replace("%amount%", "" + unclaimedLands)
                        .replace("%money%", (Options.isVaultEnabled() ? plugin.getVaultManager().format(totalPayBack) : "-eco disabled-")));
                break;
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/multi/MultiUnclaimTask.java`
#### Snippet
```java
            case ALL:
                lgManager.sendMessage(player, lgManager.getString(player, "Commands.UnclaimAll.success")
                        .replace("%amount%", "" + unclaimedLands)
                        .replace("%world%", world.getName())
                        .replace("%money%", (Options.isVaultEnabled() ? plugin.getVaultManager().format(totalPayBack) : "-eco disabled-")));
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java

        configString = configString.replace("%world%", chunk.getWorld().getName());
        configString = configString.replace("%x%", x + "");
        configString = configString.replace("%z%", z + "");

```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
        configString = configString.replace("%world%", chunk.getWorld().getName());
        configString = configString.replace("%x%", x + "");
        configString = configString.replace("%z%", z + "");

        return ChatColor.translateAlternateColorCodes('&', configString);
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Shop.java`
#### Snippet
```java

            ShopGUI gui = new ShopGUI(plugin, player, plugin.getLangManager().getRawString("Shop.title")
                    .replace("%regions%", regionCount + "")
                    .replace("%claims%", claims + ""));
            gui.display();
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Shop.java`
#### Snippet
```java
            ShopGUI gui = new ShopGUI(plugin, player, plugin.getLangManager().getRawString("Shop.title")
                    .replace("%regions%", regionCount + "")
                    .replace("%claims%", claims + ""));
            gui.display();
        }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/adv/Advertise.java`
#### Snippet
```java
        lm.sendMessage(player, lm.getString(player, "Commands.Advertise.success")
                .replace("%landname%", iOwnedLand.getName())
                .replace("%price%", price + ""));
    }
}
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java
        if (radius > maxSize) { // +2 for marge value. Unless server has a huge render distance (16 for example), won't cause any trouble
            lm.sendMessage(player, lm.getString(player, "Commands.MultiClaim.hugeSize")
                    .replace("%max_size%", maxSize + ""));
            return;
        }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java
            PrincepsLib.getConfirmationManager().draw(player,
                    lm.getRawString("Commands.MultiClaim.guiMessage")
                            .replace("%amount%", toClaim.size() + "")
                            .replace("%cost%", formattedCost),
                    lm.getString(player, "Commands.MultiClaim.chatMessage")
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java
                            .replace("%cost%", formattedCost),
                    lm.getString(player, "Commands.MultiClaim.chatMessage")
                            .replace("%amount%", toClaim.size() + "")
                            .replace("%cost%", formattedCost),
                    (p) -> {
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java
                        // on decline
                        lm.sendMessage(p, lm.getString(p, "Commands.MultiClaim.abort")
                                .replace("%amount%", toClaim.size() + ""));
                        p.closeInventory();
                    }, confirmcmd);
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java
                    replaceLore(
                            lm.getStringList("Shop.gui.error.lore"), "%cost%", vault.format(cost)),
                    "%own%", "" + vault.format(vault.getBalance(player))
            ));
            error.addClickAction((p) -> lm.sendMessage(player, lm.getString(player, "Shop.notEnoughMoney")
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java

            if (claimcount > 0) {
                lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                        .replace("%claims%", claimcount + ""));
            } else {
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java
            if (claimcount > 0) {
                lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                        .replace("%claims%", claimcount + ""));
            } else {
                BaseComponent[] text = TextComponent.fromLegacyText(lm.getString(player, "Commands.Claims.noClaims"));
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java
            int highestAllowedLandCount = plugin.getPlayerManager().getMaxClaimPermission(player);
            int regionCount = plugin.getWGManager().getRegionCount(player.getUniqueId());
            lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                    .replace("%claims%", (highestAllowedLandCount == Integer.MAX_VALUE ? "?" : highestAllowedLandCount <= 0 ? "?" : highestAllowedLandCount + "")));
        }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java
            int regionCount = plugin.getWGManager().getRegionCount(player.getUniqueId());
            lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                    .replace("%claims%", (highestAllowedLandCount == Integer.MAX_VALUE ? "?" : highestAllowedLandCount <= 0 ? "?" : highestAllowedLandCount + "")));
        }
    }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiUnclaim.java`
#### Snippet
```java
        if (radius > maxSize) { // +2 for marge value. Unless server has a huge render distance (16 for example), won't cause any trouble
            lm.sendMessage(player, lm.getString(player, "Commands.MultiUnclaim.hugeSize")
                    .replace("%max_size%", maxSize + ""));
            return;
        }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/SecureWorldListener.java`
#### Snippet
```java
        if (landcount < treshold) {
            String rawString = plugin.getLangManager().getRawString("Alerts.tresholdNotReached")
                    .replace("%x%", treshold + "");
            if (display == MessageDisplay.ActionBar) {
                PrincepsLib.getStuffManager().sendActionBar(p, rawString);
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/SecureWorldListener.java`
#### Snippet
```java
            } else if (display == MessageDisplay.Chat) {
                plugin.getLangManager().sendMessage(p, plugin.getLangManager().getString("Alerts.tresholdNotReached")
                        .replace("%x%", treshold + ""));
            } else if (display == MessageDisplay.Title) {
                p.sendTitle(rawString, null, 10, 70, 20);
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/GiveClaims.java`
#### Snippet
```java
                            vault.take(player, cost);
                            lm.sendMessage(player, plugin.getLangManager().getString("Shop.success")
                                    .replace("%number%", amount + "")
                                    .replace("%cost%", vault.format(cost)));
                            player.closeInventory();
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/GiveClaims.java`
#### Snippet
```java
                        } else {
                            lm.sendMessage(player, plugin.getLangManager().getString("Shop.notEnoughMoney")
                                    .replace("%number%", amount + "")
                                    .replace("%cost%", vault.format(cost)));
                            player.closeInventory();
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claim.java`
#### Snippet
```java
        if (regionCount >= highestAllowedLandCount) {
            lm.sendMessage(player, lm.getString(player, "Commands.Claim.hardcap").replace("%regions%",
                    highestAllowedLandCount + ""));
            return false;
        }
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claim.java`
#### Snippet
```java
                        lm.sendMessage(player, lm.getString(player, "Commands.Claim.notYetInactive")
                                .replace("%owner%", ol.getOwnersString())
                                .replace("%days%", "" + inactiveDays));
                    }
                });
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claim.java`
#### Snippet
```java
            if (regionCount >= claims) {
                ComponentBuilder builder = new ComponentBuilder(lm.getString(player, "Commands.Claim.limit")
                        .replace("%regions%", regionCount + "")
                        .replace("%claims%", claims + ""))
                        .color(ChatColor.YELLOW)
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claim.java`
#### Snippet
```java
                ComponentBuilder builder = new ComponentBuilder(lm.getString(player, "Commands.Claim.limit")
                        .replace("%regions%", regionCount + "")
                        .replace("%claims%", claims + ""))
                        .color(ChatColor.YELLOW)
                        .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, PrincepsLib.getCommandManager()
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `Confirm` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/Landlordbase.java`
#### Snippet
```java
    }

    public class Confirm extends SubCommand {

        public Confirm() {
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StateFlag.State`
in `LandLord-latest/src/main/java/biz/princeps/landlord/LLFlag.java`
#### Snippet
```java
    private final Material mat;

    public LLFlag(ProtectedRegion pr, Flag<StateFlag.State> flag, Material mat) {
        this.pr = pr;
        this.flag = flag;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Boolean`
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LPlayerManager.java`
#### Snippet
```java

    @Override
    public void isInactive(UUID id, Consumer<Boolean> consumer) {
        getOffline(id, (lp) -> {
            if (lp != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LPlayerManager.java`
#### Snippet
```java

    @Override
    public void getInactiveRemainingDays(UUID owner, Consumer<Integer> consumer) {
        long days = plugin.getConfig().getInt("BuyUpInactive.timegate");
        this.getOffline(owner, (offline) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super IPlayer`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java

    @Override
    public void getPlayer(UUID id, Consumer<IPlayer> consumer) {
        plugin.getServer().getScheduler().runTaskAsynchronously(plugin, () -> consumer.accept(getPlayer(id)));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ResultSet`
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
    }

    public void executeQuery(String query, Consumer<ResultSet> consumer, Object... args) {
        try (Connection con = getConnection();
             PreparedStatement st = con.prepareStatement(query)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProtectedRegion`
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java

    // assuming lands don't overlap, as it should be
    private IOwnedLand getFirstOwnedLand(Set<ProtectedRegion> regions) {
        for (ProtectedRegion region : regions) {
            IOwnedLand land = this.worldGuardManager.getRegion(region.getId());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Block`
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/PistonOverwriter.java`
#### Snippet
```java
     * @return if all blocks have the same owner
     */
    private boolean sameOwner(Block origin, List<Block> blocks) {
        if (origin == null) {
            return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super List`
in `LandLord-api/src/main/java/biz/princeps/landlord/api/ClaimHeightDefinition.java`
#### Snippet
```java
    private final Function<List<Integer>, Integer> calc;

    ClaimHeightDefinition(Function<List<Integer>, Integer> calc) {
        this.calc = calc;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super IPlayer`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
    }

    public void getPlayer(UUID id, Consumer<IPlayer> consumer) {
        consumer.accept(getPlayer(id));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProtectedRegion`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java

    // assuming lands don't overlap, as it should be
    private IOwnedLand getFirstOwnedLand(Set<ProtectedRegion> regions) {
        for (ProtectedRegion region : regions) {
            IOwnedLand land = this.worldGuardManager.getRegion(region.getId());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StateFlag.State`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LLFlag.java`
#### Snippet
```java
    private final Material mat;

    public LLFlag(ProtectedRegion pr, Flag<StateFlag.State> flag, Material mat) {
        this.pr = pr;
        this.flag = flag;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Block`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/listener/PistonOverwriter.java`
#### Snippet
```java
     * @return if all blocks have the same owner
     */
    private boolean sameOwner(Block origin, List<Block> blocks) {
        if (origin == null) {
            return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends World`
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/UnclaimAll.java`
#### Snippet
```java
    }

    public void performUnclaimAll(Player player, List<World> worlds) {
        for (World world : worlds) {
            if (isDisabledWorld(world)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IOwnedLand`
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java
    }

    private void setFarewell(Player player, String[] args, List<IOwnedLand> lands, int casy) {
        if (lands.isEmpty() || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IOwnedLand`
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java


    private void setGreet(Player player, String[] args, List<IOwnedLand> lands, int casy) {
        if (lands.isEmpty() || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IOwnedLand`
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
    private int flagPage = 0;

    AManage(ILandLord plugin, Player player, String header, List<IOwnedLand> land, ManageMode manageMode, MultiMode multiMode, int radius) {
        super(plugin, player, 45, header);
        this.plugin = plugin;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IOwnedLand`
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
    }

    AManage(ILandLord plugin, Player player, MultiPagedGUI landGui, String header, List<IOwnedLand> land, ManageMode manageMode, MultiMode multiMode, int radius) {
        super(plugin, player, 54, header, landGui);
        this.plugin = plugin;
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `synchronized static`
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ConfirmationDialog.java`
#### Snippet
```java
        }

        public synchronized static boolean contains(UUID uuid) {
            return openDialogs.containsKey(uuid);
        }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `synchronized static`
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ConfirmationDialog.java`
#### Snippet
```java
        }

        public synchronized static void removePlayer(UUID uniqueId) {
            openDialogs.remove(uniqueId);
        }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `synchronized static`
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ConfirmationDialog.java`
#### Snippet
```java
        }

        public synchronized static void addPlayer(UUID uniqueId, ConfirmationDialog confirmationDialog) {
            openDialogs.put(uniqueId, confirmationDialog);
        }
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
        customConfigFile = new File(plugin.getDataFolder(), "storage.yml");
        if (!customConfigFile.exists()) {
            customConfigFile.getParentFile().mkdirs();
            try {
                customConfigFile.createNewFile();
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
            customConfigFile.getParentFile().mkdirs();
            try {
                customConfigFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
        if (!file.exists())
            try {
                INSTANCE.getDataFolder().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
            try {
                INSTANCE.getDataFolder().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdir()` is ignored
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
        if (getConfig().getString("Regeneration.provider", "default").equalsIgnoreCase("wg")) {
            File folder = new File(getDataFolder(), "chunksaves");
            folder.mkdir();
            this.regenerationManager = new WGRegenerator(this);
            new WGRegenListener(this);
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdir()` is ignored
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LangManager.java`
#### Snippet
```java
            File folder = new File(plugin.getDataFolder(), "messages");
            if (!folder.exists())
                folder.mkdir();

            if (!f.exists())
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Factory` is the same as one of its superclass' names
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
    }

    public static final class Factory extends Handler.Factory<LandSessionHandler> {

        private final ILandLord plugin;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Factory` is the same as one of its superclass' names
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
    }

    public static final class Factory extends Handler.Factory<LandSessionHandler> {

        private final ILandLord plugin;
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `getTitle()` is identical to its super method
in `LandLord-core/src/main/java/biz/princeps/lib/gui/MainMenuGUI.java`
#### Snippet
```java


    public String getTitle() {
        return title;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onDisable()` only delegates to its super method
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onDisable()` only delegates to its super method
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        int minHeight = weWorld.getMinY();

        return super.calcClaimHeightBoundaries(boundaryMethod, world, chunk, minHeight, maxHeight);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        int minHeight = 0;

        return super.calcClaimHeightBoundaries(boundaryMethod, world, chunk, minHeight, maxHeight);
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.bukkit` is unnecessary and can be removed
in `LandLord-core/src/main/java/biz/princeps/lib/gui/MultiPagedGUI.java`
#### Snippet
```java
            this.setIcon(rowsPerSite * 9 + 4,
                    new Icon(new ItemStack(Material.NETHER_STAR))
                            .setName(org.bukkit.ChatColor.GOLD + mainMenu.getTitle())
                            .addClickAction((p) -> mainMenu.display()));
        }
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.logging.Level;`
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/command/CommandManager.java`
#### Snippet
```java
            this.cmdMap = (CommandMap) bukkitCommandMap.get(plugin.getServer());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
            config.load(f);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            region.shift(BlockVector3.at(0, amount, 0));
        } catch (RegionOperationException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
                executeAsync("UPDATE version FROM ll_version SET version = ?", CURRENT_VERSION);
        } catch (SQLException e) {
            e.printStackTrace();
            plugin.getLogger().warning("Error while handling upgrade!\nError:" + e.getMessage());
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
            customConfig.save(customConfigFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
                customConfigFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
            customConfig.load(customConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/ConfigurationManager.java`
#### Snippet
```java
            }
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
            config.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/regenerators/WGRegenerator.java`
#### Snippet
```java

                } catch (IOException | WorldEditException e) {
                    e.printStackTrace();
                }
            }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/util/Skulls.java`
#### Snippet
```java

        } catch (IllegalArgumentException | NoSuchFieldException | SecurityException | IllegalAccessException error) {
            error.printStackTrace();
        }
        head.setItemMeta(headMeta);
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/WGRegenListener.java`
#### Snippet
```java
            Operations.complete(forwardExtentCopy);
        } catch (WorldEditException worldEditException) {
            worldEditException.printStackTrace();
        }

```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/WGRegenListener.java`
#### Snippet
```java
            writer.write(clipboard);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            region.shift(BlockVector.toBlockPoint(0, amount, 0));
        } catch (RegionOperationException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LangManager.java`
#### Snippet
```java
            this.msg.load(f);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/command/MainCommand.java`
#### Snippet
```java
                    this.addSubcommand(subCommand);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLExpansion.java`
#### Snippet
```java
                String members;
                IOwnedLand region2 = wg.getRegion(player.getLocation());
                if (region2 != null && !(members = region2.getMembersString()).isEmpty()) {
                    return members;
                }
```

## RuleId[ruleID=ReplaceNullCheck]
### RuleId[ruleID=ReplaceNullCheck]
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java
        for (Player onlinePlayer : getServer().getOnlinePlayers()) {
            getPlayerManager().getOffline(onlinePlayer.getUniqueId(), (offline) -> {
                if (offline == null) {
                    this.getPlayerManager().add(new LPlayer(onlinePlayer.getUniqueId()));
                } else {
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claim.java`
#### Snippet
```java
    public void onCommand(Properties properties, Arguments arguments) {
        if (properties.isPlayer()) {
            PaperLib.getChunkAtAsync(properties.getPlayer().getLocation()).thenAccept(chunk -> {
                onClaim(properties.getPlayer(), chunk);
            });
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractItem()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/item/AbstractItem.java`
#### Snippet
```java
     * @param glowing if the item should be glowing or not
     */
    public AbstractItem(String name, ItemStack stack, boolean glowing, boolean breakBlocks) {
        this.name = name;
        this.stack = PrincepsLib.crossVersion().addNBTTag(stack, "customItem", "true");
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ACostManager()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/cost/ACostManager.java`
#### Snippet
```java
    protected final int free;

    public ACostManager(ILandLord plugin, int free, String namespace) {
        this.plugin = plugin;
        this.free = free;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractGUI()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/gui/simple/AbstractGUI.java`
#### Snippet
```java
     * @param mainMenu The superior menu
     */
    public AbstractGUI(Plugin plugin, Player player, int size, String title, AbstractGUI mainMenu) {
        this.plugin = plugin;
        this.player = player;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractGUI()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/gui/simple/AbstractGUI.java`
#### Snippet
```java
     * @param title  the name of the menu - ChatColor allowed!
     */
    public AbstractGUI(Plugin plugin, Player player, int size, String title) {
        this(plugin, player, size, title, null);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AMultiTask()` of an abstract class should not be declared 'public'
in `LandLord-api/src/main/java/biz/princeps/landlord/api/AMultiTask.java`
#### Snippet
```java
    protected final Deque<T> queue;

    public AMultiTask(ILandLord plugin, Collection<T> operations) {
        this.plugin = plugin;
        this.queue = new ArrayDeque<>(operations);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AWorldGuardManager()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
    protected final ILandLord plugin;

    public AWorldGuardManager(ILandLord plugin) {
        this.plugin = plugin;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BasicListener()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/BasicListener.java`
#### Snippet
```java
    protected final ILandLord plugin;

    public BasicListener(ILandLord plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `MainCommand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/command/MainCommand.java`
#### Snippet
```java
     * @param aliases      the aliases which are also viable to trigger this command
     */
    public MainCommand(String name, String description, String usageMessage, Set<String> perms, String... aliases) {
        super(name, description, usageMessage, Arrays.asList(aliases));
        this.subCommandMap = new HashMap<>();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `LandlordCommand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/LandlordCommand.java`
#### Snippet
```java
    protected final ILangManager lm;

    public LandlordCommand(ILandLord plugin, String name, String usage, Set<String> permissions, Set<String> aliases) {
        super(name, usage, permissions, aliases);
        this.plugin = plugin;
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `customConfig` is accessed in both synchronized and unsynchronized contexts
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java

    private File customConfigFile;
    private FileConfiguration customConfig;

    public FlatFileStorage(Plugin plugin) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `customConfigFile` is accessed in both synchronized and unsynchronized contexts
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
    private final Plugin plugin;

    private File customConfigFile;
    private FileConfiguration customConfig;

```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java
     * Registers special items (left/right click action; nbt data...) with the princepslib protection
     */
    private void setupItems() {
        //PrincepsLib.getItemManager().registerItem(Maitem.NAME, Maitem.class);
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemActionListener.java`
#### Snippet
```java

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
/*TODO reimplement

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemActionListener.java`
#### Snippet
```java

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        //TODO replace with new method. Dunno and to lazy to google it
        /* TODO reimplement
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
                int taskid = new BukkitRunnable() {
                    int countdown = delay * 4;
                    int var = 0;

                    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/lib/gui/MultiPagedGUI.java`
#### Snippet
```java
    private final int rowsPerSite;

    private int siteNumber = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java
    private final IVaultManager vault;

    private int delta = 0;
    private double cost = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java

    private int delta = 0;
    private double cost = 0;

    public ShopGUI(ILandLord plugin, Player player, String title) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
    private final MultiMode multiMode;
    private final int radius;
    private int flagPage = 0;

    AManage(ILandLord plugin, Player player, String header, List<IOwnedLand> land, ManageMode manageMode, MultiMode multiMode, int radius) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `chunkname`
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Unclaim.java`
#### Snippet
```java
            Location location = player.getLocation();
            ol = wg.getRegion(location);
            chunkname = wg.getLandName(location);
        } else {
            if (!wg.isLLRegion(chunkname)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `text`
in `LandLord-core/src/main/java/biz/princeps/landlord/util/SimpleScoreboard.java`
#### Snippet
```java
    private String fixDuplicates(String text) {
        while (scores.contains(text))
            text += "?r";
        if (text.length() > 48)
            text = text.substring(0, 47);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `text`
in `LandLord-core/src/main/java/biz/princeps/landlord/util/SimpleScoreboard.java`
#### Snippet
```java
            text += "?r";
        if (text.length() > 48)
            text = text.substring(0, 47);
        return text;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `location`
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java
    public void onClick(Action action, Player p, Location location) {
        if (location == null)
            location = p.getLocation();

        IOwnedLand landAtLoc = plugin.getWGManager().getRegion(location);
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Listener`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
 * Date: 06-05-19
 */
public class LandLord extends ALandLord implements Listener {

    @Override
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/util/SpigotUtil.java`
#### Snippet
```java
    public static Location exactlocationFromString(String s) {
        if (s == null || s.isEmpty() || s.equals("null"))
            return null;
        String[] split = s.split(":");
        Location loc;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemManager.java`
#### Snippet
```java
            return new ItemStack(material);
        } catch (NumberFormatException ex) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemManager.java`
#### Snippet
```java
            EldoUtilities.logger().log(Level.WARNING, "Custom item must implement empty constructor: " + e);
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/command/CommandManager.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/util/TimeUtil.java`
#### Snippet
```java
    public static LocalDateTime stringToTime(String s) {
        if (s == null || s.isEmpty() || s.equals("null"))
            return null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(s, formatter);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            return land;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LPlayerManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
            ResultSet res = triplet.getResultSet();
            if (!res.next()) {
                return null;
            } else {
                return new LPlayer(UUID.fromString(res.getString("uuid")),
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
            triplet.close();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
        if (uniqueIds.size() != 1) {
            plugin.getLogger().warning("The region " + getName() + " is faulty! It does not have an owner!");
            return null;
        } else {
            return uniqueIds.iterator().next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
        } catch (SQLException e) {
            plugin.getLogger().warning("Error while trying to pull a new connection: " + e.getMessage());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
        }
        // Connection should be closed via the result set
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-api/src/main/java/biz/princeps/landlord/api/ClaimHeightDefinition.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java

        if (splitted.length < 3) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java

        if (sec == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java
        Plugin plugin = getServer().getPluginManager().getPlugin("Vault");
        if (plugin == null) {
            return null;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        return (rsp == null ? null : rsp.getProvider());
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
        Plugin plugin = getServer().getPluginManager().getPlugin("WorldGuard");
        if (!(plugin instanceof WorldGuardPlugin)) {
            return null;
        }
        return (WorldGuardPlugin) plugin;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            return land;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
        if (uniqueIds.size() != 1) {
            plugin.getLogger().warning("The region " + getName() + " is faulty! It does not have an owner or the name matches a ll region");
            return null;
        } else {
            return uniqueIds.iterator().next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/DelimitationManager.java`
#### Snippet
```java
                if (mat == null) {
                    plugin.getLogger().warning("Invalid Material in delimitation!");
                    return null;
                }
                varToMaterial.put(var, mat);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/DelimitationManager.java`
#### Snippet
```java
            } else {
                plugin.getLogger().warning("Invalid line '" + s + "' detected!!");
                return null;
            }
        }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AOwnedLand.java`
#### Snippet
```java
            return w.getChunkAt(chunkX, chunkZ);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AOwnedLand.java`
#### Snippet
```java
        World world = wg.getWorld(name);
        if (world == null)
            return null;

        return new Location(world, chunkX << 4, world.getHighestBlockYAt(chunkX << 4, chunkZ << 4) + 1, chunkZ << 4);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
        Plugin plugin = getServer().getPluginManager().getPlugin("WorldGuard");
        if (!(plugin instanceof WorldGuardPlugin)) {
            return null;
        }
        return (WorldGuardPlugin) plugin;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/command/MainCommand.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `offline`
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/JoinListener.java`
#### Snippet
```java
        plugin.getPlayerManager().getOffline(p.getUniqueId(), (offline) -> {
            if (offline == null) {
                offline = new LPlayer(p.getUniqueId(), p.getName(), 0, null, LocalDateTime.now());
            }
            plugin.getPlayerManager().add(offline);
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/Landlordbase.java`
#### Snippet
```java
                plugin.getConfig().getString("CommandSettings.Main.usage"),
                Sets.newHashSet(plugin.getConfig().getStringList("CommandSettings.Main.permissions")),
                plugin.getConfig().getStringList("CommandSettings.Main.aliases").toArray(new String[]{}));
        this.plugin = plugin;
        reloadCommands();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
    public IOwnedLand[] getSurroundings(Location ploc) {
        if (ploc == null)
            return new IOwnedLand[0];
        return new IOwnedLand[]{
                getRegion(ploc),
```

## RuleId[ruleID=ClassCanBeRecord]
### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
    }

    static class Entry {
        final Entry superior;

```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java
    }

    static class ItemClickAction {

        private final ClickedAtCondition activation;
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
            @Override
            public void run() {
                executeQuery(query, consumer, null);
            }
        }.runTaskAsynchronously(plugin);
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
The value changed at `pos++` is never used
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ClearGUI.java`
#### Snippet
```java
                confirm.display();
            });
            this.setIcon(pos++, i3);
        }
    }
```

### RuleId[ruleID=UnusedAssignment]
The value changed at `position++` is never used
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
                    }.runTaskAsynchronously(plugin));

            this.setIcon(position++, icon);
        }
    }
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `PlayerNotFoundException` ends with 'Exception'
in `LandLord-core/src/main/java/biz/princeps/lib/exception/PlayerNotFoundException.java`
#### Snippet
```java
 * Date: 2/4/18
 */
public class PlayerNotFoundException extends Throwable {

    public PlayerNotFoundException(String string) {
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `sourceFile` is always 'null'
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
        File sourceFile = null;
        //sourceFile = new File(PrincepsLib.getPluginInstance().getClass().getResource(source));
        List<Entry> entryList = generateEntries(sourceFile);


```

