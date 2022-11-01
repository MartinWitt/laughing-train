# PlayPro/CoreProtect
# Bad smells
I found 1772 bad smells with 336 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SizeReplaceableByIsEmpty | 220 | true |
| ThrowablePrintStackTrace | 206 | false |
| DynamicRegexReplaceableByCompiledPattern | 173 | false |
| ConstantConditions | 161 | false |
| PatternVariableCanBeUsed | 156 | false |
| AssignmentToMethodParameter | 104 | false |
| TrivialStringConcatenation | 66 | false |
| UtilityClassWithoutPrivateConstructor | 60 | false |
| UnusedAssignment | 59 | false |
| ProtectedMemberInFinalClass | 58 | true |
| SetReplaceableByEnumSet | 55 | false |
| AssignmentToStaticFieldFromInstanceMethod | 54 | false |
| EnhancedSwitchMigration | 34 | false |
| ReturnNull | 33 | false |
| ReplaceAssignmentWithOperatorAssignment | 31 | false |
| RedundantFieldInitialization | 30 | false |
| StringConcatenationInsideStringBufferAppend | 26 | false |
| CommentedOutCode | 25 | false |
| UnnecessaryModifier | 24 | true |
| DuplicateExpressions | 14 | false |
| BusyWait | 14 | false |
| UnnecessaryToStringCall | 13 | true |
| UnnecessaryFullyQualifiedName | 13 | false |
| BoundedWildcard | 11 | false |
| WrapperTypeMayBePrimitive | 10 | false |
| IgnoreResultOfCall | 9 | false |
| MissortedModifiers | 8 | false |
| RedundantImplements | 8 | false |
| DeprecatedIsStillUsed | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| ConditionCoveredByFurtherCondition | 7 | false |
| UnnecessaryReturn | 6 | true |
| IOResource | 6 | false |
| ManualMinMaxCalculation | 5 | false |
| NullableProblems | 4 | false |
| EmptyMethod | 4 | false |
| CatchMayIgnoreException | 4 | false |
| Java8ListReplaceAll | 3 | false |
| GroovyUnusedAssignment | 3 | false |
| ParameterCanBeLocal | 3 | false |
| PointlessBooleanExpression | 3 | true |
| KeySetIterationMayUseEntrySet | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| ReadWriteStringCanBeUsed | 2 | false |
| ConditionalExpressionWithIdenticalBranches | 2 | false |
| CastConflictsWithInstanceof | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| UnnecessaryBoxing | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WhileCanBeForeach | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ListRemoveInLoop | 1 | false |
| NestedAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| FieldMayBeStatic | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| UtilityClassWithPublicConstructor | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| Convert2Lambda | 1 | false |
## ToArrayCallWithZeroLengthArrayArgument
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Integer\[list.size()\]'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            list.add(Integer.parseInt(item));
        }
        return list.toArray(new Integer[list.size()]);
    }

```

## WrapperTypeMayBePrimitive
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        if (location != null) {
                            Integer xmin = location.getBlockX() - r_x;
                            Integer xmax = location.getBlockX() + r_x;
                            Integer ymin = null;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (location != null) {
                            Integer xmin = location.getBlockX() - r_x;
                            Integer xmax = location.getBlockX() + r_x;
                            Integer ymin = null;
                            Integer ymax = null;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            Integer ymin = null;
                            Integer ymax = null;
                            Integer zmin = location.getBlockZ() - r_z;
                            Integer zmax = location.getBlockZ() + r_z;
                            if (r_y > -1) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            Integer ymax = null;
                            Integer zmin = location.getBlockZ() - r_z;
                            Integer zmax = location.getBlockZ() + r_z;
                            if (r_y > -1) {
                                ymin = location.getBlockY() - r_y;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java

            if (g == 1 && (argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
                    int radiusValue = argRadius[0];
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

            if (g == 1 && (pageLookup || argBlocks.size() > 0 || argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
                    int radiusValue = argRadius[0];
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

    public static long countLookupRows(Statement statement, CommandSender user, List<String> checkUuids, List<String> checkUsers, List<Object> restrictList, Map<Object, Boolean> excludeList, List<String> excludeUserList, List<Integer> actionList, Location location, Integer[] radius, Long[] rowData, long startTime, long endTime, boolean restrictWorld, boolean lookup) {
        Long rows = 0L;

        try {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

            StringBuilder modifiedData = new StringBuilder();
            Integer modifyCount = 0;
            if (actionList.contains(5)) {
                modifiedData = modifiedData.append(Phrase.build(Phrase.AMOUNT_ITEM, NumberFormat.getInstance().format(blockCount), (blockCount == 1 ? Selector.FIRST : Selector.SECOND)));
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                userString = user.getName();
                if (verbose && preview == 0 && !actionList.contains(11)) {
                    Integer chunks = chunkList.size();
                    Chat.sendMessage(user, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.ROLLBACK_CHUNKS_FOUND, chunks.toString(), (chunks == 1 ? Selector.FIRST : Selector.SECOND)));
                }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                if (verbose && user != null && preview == 0 && !actionList.contains(11)) {
                    Integer chunks = chunkList.size();
                    Chat.sendMessage(user, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.ROLLBACK_CHUNKS_MODIFIED, chunkCount.toString(), chunks.toString(), (chunks == 1 ? Selector.FIRST : Selector.SECOND)));
                }
```

## UnnecessaryModifier
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/spigot/SpigotInterface.java`
#### Snippet
```java
    public void setHoverEvent(Object message, String text);

    public void sendComponent(CommandSender sender, String string, String bypass);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/spigot/SpigotInterface.java`
#### Snippet
```java
public interface SpigotInterface {

    public void addHoverComponent(Object message, String[] data);

    public void setHoverEvent(Object message, String text);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/spigot/SpigotInterface.java`
#### Snippet
```java
    public void addHoverComponent(Object message, String[] data);

    public void setHoverEvent(Object message, String text);

    public void sendComponent(CommandSender sender, String string, String bypass);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/paper/PaperInterface.java`
#### Snippet
```java
public interface PaperInterface {

    public InventoryHolder getHolder(Inventory holder, boolean useSnapshot);

    public boolean isStopping(Server server);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/paper/PaperInterface.java`
#### Snippet
```java
    public InventoryHolder getHolder(Inventory holder, boolean useSnapshot);

    public boolean isStopping(Server server);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public int getMinHeight(World world);

    public int getLegacyBlockId(Material material);

    public void sendSignChange(Player player, Sign sign);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean isInvisible(Material material);

    public int getMinHeight(World world);

    public int getLegacyBlockId(Material material);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean isWall(BlockData blockData);

    public boolean isItemFrame(Material material);

    public boolean isGlowing(Sign sign);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot);

    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map);

    public boolean isAttached(Block block, Block scanBlock, BlockData blockData, int scanMin);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public ItemStack adjustIngredient(MerchantRecipe recipe, ItemStack itemStack);

    public Material getBucketContents(Material material);

    public Material getFrameType(Entity entity);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
public interface BukkitInterface {

    public ItemStack adjustIngredient(MerchantRecipe recipe, ItemStack itemStack);

    public Material getBucketContents(Material material);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public int getLegacyBlockId(Material material);

    public void sendSignChange(Player player, Sign sign);

    public void setGlowing(Sign sign, boolean b);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map);

    public boolean isAttached(Block block, Block scanBlock, BlockData blockData, int scanMin);

    public boolean isWall(BlockData blockData);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public Class<?> getFrameClass(Material material);

    public String parseLegacyName(String name);

    public boolean getEntityMeta(LivingEntity entity, List<Object> info);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public Material getFrameType(EntityType type);

    public Class<?> getFrameClass(Material material);

    public String parseLegacyName(String name);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public Material getFrameType(Entity entity);

    public Material getFrameType(EntityType type);

    public Class<?> getFrameClass(Material material);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public void sendSignChange(Player player, Sign sign);

    public void setGlowing(Sign sign, boolean b);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public String parseLegacyName(String name);

    public boolean getEntityMeta(LivingEntity entity, List<Object> info);

    public boolean setEntityMeta(Entity entity, Object value, int count);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean isAttached(Block block, Block scanBlock, BlockData blockData, int scanMin);

    public boolean isWall(BlockData blockData);

    public boolean isItemFrame(Material material);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public Material getBucketContents(Material material);

    public Material getFrameType(Entity entity);

    public Material getFrameType(EntityType type);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean isGlowing(Sign sign);

    public boolean isInvisible(Material material);

    public int getMinHeight(World world);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean isItemFrame(Material material);

    public boolean isGlowing(Sign sign);

    public boolean isInvisible(Material material);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean setEntityMeta(Entity entity, Object value, int count);

    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot);

    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public boolean getEntityMeta(LivingEntity entity, List<Object> info);

    public boolean setEntityMeta(Entity entity, Object value, int count);

    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot);
```

## WhileCanBeForeach
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
        if (Config.getConfig(world).NATURAL_BREAK) {
            Iterator<Map.Entry<Location, Block>> it = new HashMap<>(blockMap).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Location, Block> data = it.next();
                Block block = data.getValue();
```

## CommentedOutCode
### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/net/coreprotect/database/logger/UsernameLogger.java`
#### Snippet
```java
                preparedStmt.close();

                /*
                    //Commented out to prevent potential issues if player manages to stay logged in with old username
                    if (ConfigHandler.playerIdCache.get(user_row)!=null){
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java
                    }

                    // Functions.sendMessage(player, Color.DARK_AQUA + "Website: " + Color.WHITE + "www.coreprotect.net/updates/");

                    // Functions.sendMessage(player, Color.DARK_AQUA + Phrase.build(Phrase.LINK_DISCORD, Color.WHITE + "www.coreprotect.net/discord/").replaceFirst(":", ":" + Color.WHITE));
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java
                        if (instance.getServer().getPluginManager().getPlugin("CoreEdit") == null) {
                            Thread.sleep(500);
                            /*
                            Functions.sendMessage(player, Color.WHITE + "----- " + Color.DARK_AQUA + "Recommended Plugin " + Color.WHITE + "-----");
                            Functions.sendMessage(player, Color.DARK_AQUA + "Notice: " + Color.WHITE + "Enjoy CoreProtect? Check out CoreEdit!");
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
        }

        /*
            if (item!=null && playerItem==null){
                //player gets item
```

### CommentedOutCode
Commented out code (31 lines)
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
            NATURAL_BLOCKS.addAll(VINES);

            /*
            NATURAL_BLOCKS.addAll(Tag.BASE_STONE_OVERWORLD.getValues());
            NATURAL_BLOCKS.addAll(Tag.BEACON_BASE_BLOCKS.getValues());
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
            if (player.length() > 0) {
                boolean log = true;
                /*
                if (newState.getType().equals(Material.COBBLESTONE)) {
                    log = false;
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/net/coreprotect/listener/player/ProjectileLaunchListener.java`
#### Snippet
```java

    // Requires Bukkit 1.17+
    /*
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onEntityShootBow(EntityShootBowEvent event) {
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/net/coreprotect/listener/player/ProjectileLaunchListener.java`
#### Snippet
```java
    */
    // Requires Bukkit 1.16+
    /*
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onPlayerEggThrow(PlayerEggThrowEvent event) {
```

### CommentedOutCode
Commented out code (18 lines)
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java
                    }

                    /*
                    for (ItemStack itemStack : sourceHolder.getInventory().getContents()) {
                        if (itemStack != null && Util.getItemStackHashCode(itemStack) == itemHash) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java

            if (event.getPlayer() == null) {
                // IgniteCause cause = event.getCause(); // FLINT_AND_STEEL
                // boolean isDispenser = (event.getIgnitingBlock() != null && event.getIgnitingBlock().getType()==Material.DISPENSER);

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/listener/player/PlayerCommandListener.java`
#### Snippet
```java
        }

        /*
        if (Config.getGlobal().ENTITY_KILLS && player.hasPermission("bukkit.command.kill")) {
            EntityDeathListener.parseEntityKills(event.getMessage());
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/net/coreprotect/listener/player/PlayerCommandListener.java`
#### Snippet
```java
    }

    /*
    @EventHandler(priority = EventPriority.MONITOR)
    public void onServerCommand(ServerCommandEvent event) {
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java

    protected static void queueSignText(String user, Location location, int action, int color, boolean glowing, String line1, String line2, String line3, String line4, int offset) {
        /*
        if (line1.length() == 0 && line2.length() == 0 && line3.length() == 0 && line4.length() == 0) {
            return;
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Queue.queueBlockPlace(player.getName(), block.getState(), type, block.getState(), type, -1, 0, blockData.getAsString());

                            /*
                            BlockState blockState = block.getState();
                            Bukkit.getServer().getScheduler().runTask(CoreProtect.getInstance(), () -> {
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                            log = false;

                            /*
                            if (physics == 0 && scanBlock.getBlockData() instanceof MultipleFacing) {
                                physics = 1;
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java
                        if (container != null) {
                            for (Object[] lookupRow : lookupList) {
                                // int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
                                // int rowId = lookupRow[0];
                                // int rowTime = (Integer)lookupRow[1];
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                Queue.queueBlockBreak(e, block.getState(), Material.ARMOR_STAND, null, (int) entityLocation.getYaw());
            }
            /*
            else if (isCommand) {
                entityLocation.setY(entityLocation.getY() + 0.99);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            if (!skip) {
                if (!(entity instanceof Player) && entity_type.name() != null) {
                    // Player player = (Player)entity;
                    // e = player.getName();
                    e = "#" + entity_type.name().toLowerCase(Locale.ROOT);
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
    }

    /*
    private static long calculateTableOffset(long col2, long col3, long limitOffset, int limitCount) {
        return (limitOffset - (col2 + col3)) < 0L ? 0L : (limitOffset - (col2 + col3));
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

        try {
            /*
            if (list instanceof Object[]) {
                slot = (int) ((Object[]) list)[0];
```

### CommentedOutCode
Commented out code (10 lines)
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            boolean inventoryRollback = actionList.contains(11);

            /*
            int worldMin = BukkitAdapter.ADAPTER.getMinHeight(world);
            int worldHeight = world.getMaxHeight() - worldMin;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    int chunkZ = rowZ >> 4;
                    long chunkKey = inventoryRollback ? 0 : (chunkX & 0xffffffffL | (chunkZ & 0xffffffffL) << 32);
                    // int rowAction = result[8];
                    // if (rowAction==10) result[8] = 0;
                    // if (rowAction==11) result[8] = 1;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    }

                    /*
                    if (rowY < worldMin) {
                        continue;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (modifyList.get(chunkKey) == null) {
                        // Integer[][] chunkSections = new Integer[((worldMax - worldMin) >> 4)][];
                        // adjacentDataList.put(chunkKey, chunkSections);
                        dataList.put(chunkKey, new ArrayList<>());
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        else {
                                            boolean physics = true;
                                            /*
                                            if (blockData instanceof MultipleFacing || BukkitAdapter.ADAPTER.isWall(blockData) || blockData instanceof Snow || blockData instanceof Stairs || blockData instanceof RedstoneWire || blockData instanceof Chest) {
                                                physics = !(blockData instanceof Snow) || block.getY() <= BukkitAdapter.ADAPTER.getMinHeight(block.getWorld()) || (block.getWorld().getBlockAt(block.getX(), block.getY() - 1, block.getZ()).getType().equals(Material.GRASS_BLOCK));
```

## AssignmentToStaticFieldFromInstanceMethod
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `patchNotification` from instance context
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                                    Chat.console(Phrase.build(Phrase.PATCH_UPGRADING));
                                    alertTime = alertTime + 30;
                                    patchNotification = true;
                                }
                                Thread.sleep(1000);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ConfigHandler.converterRunning` from instance context
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                        try {
                            int finished = runPatcher(oldVersion, newVersionFinal);
                            ConfigHandler.converterRunning = false;
                            if (finished == 1) {
                                processConsumer();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                            }
                            else if (finished == 0) {
                                Consumer.isPaused = false;
                            }
                            else if (finished == -1) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `currentConsumer` from instance context
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
                int process_id = 0;
                if (currentConsumer == 0) {
                    currentConsumer = 1;
                }
                else {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `currentConsumer` from instance context
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
                else {
                    process_id = 1;
                    currentConsumer = 0;
                }
                Thread.sleep(500);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `instance` from instance context
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

    public PluginChannelHandshakeListener() {
        instance = this;
        pluginChannelPlayers = new HashSet<>();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `instance` from instance context
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

    public PluginChannelListener() {
        instance = this;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `donationKey` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            String[] remoteKey = response.replaceAll("[^a-zA-Z0-9;]", "").split(";");
                            if (remoteKey.length > 1 && remoteKey[1].equals("1") && remoteKey[0].length() == 8) {
                                donationKey = remoteKey[0];
                            }
                            else if (remoteKey.length > 1) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `donationKey` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            }
                            else if (remoteKey.length > 1) {
                                donationKey = null;
                            }
                            else {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `donationKey` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                }
                else {
                    donationKey = null;
                }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `donationKey` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        List<String> licenseFile = Files.readAllLines(licensePath);
                        if (licenseFile.size() == 1) {
                            donationKey = licenseFile.get(0);
                            if (donationKey == null || donationKey.length() != 8 || !donationKey.matches("^[A-Z0-9]+$")) {
                                donationKey = null;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `donationKey` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            donationKey = licenseFile.get(0);
                            if (donationKey == null || donationKey.length() != 8 || !donationKey.matches("^[A-Z0-9]+$")) {
                                donationKey = null;
                            }
                        }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `latestVersion` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                boolean newVersion = Util.newVersion(version, remoteVersion);
                                if (newVersion) {
                                    latestVersion = remoteVersion;
                                    if (startup) {
                                        Chat.console("--------------------");
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `latestVersion` from instance context
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                }
                                else {
                                    latestVersion = null;
                                }
                            }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/command/ReloadCommand.java`
#### Snippet
```java
                            Thread.sleep(1);
                        }
                        Consumer.isPaused = true;

                        ConfigHandler.performInitialization(false);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/command/ReloadCommand.java`
#### Snippet
```java
                    }

                    Consumer.isPaused = false;
                    ConfigHandler.lookupThrottle.put(player.getName(), new Object[] { false, System.currentTimeMillis() });
                }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ConfigHandler.purgeRunning` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    Chat.sendGlobalMessage(player, Phrase.build(Phrase.PURGE_NOTICE_2));

                    ConfigHandler.purgeRunning = true;
                    while (!Consumer.pausedSuccess) {
                        Thread.sleep(1);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                        Thread.sleep(1);
                    }
                    Consumer.isPaused = true;

                    String query = "";
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    if (newVersion && !ConfigHandler.EDITION_BRANCH.contains("-dev")) {
                        Chat.sendGlobalMessage(player, Phrase.build(Phrase.PURGE_FAILED));
                        Consumer.isPaused = false;
                        ConfigHandler.purgeRunning = false;
                        return;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ConfigHandler.purgeRunning` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                        Chat.sendGlobalMessage(player, Phrase.build(Phrase.PURGE_FAILED));
                        Consumer.isPaused = false;
                        ConfigHandler.purgeRunning = false;
                        return;
                    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                        ConfigHandler.loadDatabase();
                        Chat.sendGlobalMessage(player, Color.RED + Phrase.build(Phrase.PURGE_ABORTED));
                        Consumer.isPaused = false;
                        ConfigHandler.purgeRunning = false;
                        return;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ConfigHandler.purgeRunning` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                        Chat.sendGlobalMessage(player, Color.RED + Phrase.build(Phrase.PURGE_ABORTED));
                        Consumer.isPaused = false;
                        ConfigHandler.purgeRunning = false;
                        return;
                    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Consumer.isPaused` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                }

                Consumer.isPaused = false;
                ConfigHandler.purgeRunning = false;
            }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `materials` from instance context
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                    }

                    materials = new ArrayList<>(materialList);
                }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ConfigHandler.purgeRunning` from instance context
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java

                Consumer.isPaused = false;
                ConfigHandler.purgeRunning = false;
            }
        }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_TOP` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java

    public Bukkit_v1_16() {
        BlockGroup.TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWIS
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_BOTTOM` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES));
        BlockGroup.TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_SIDE` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
l.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES));
        BlockGroup.TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIM
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.DOORS` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
ial.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER, Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER, Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER, Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER, Material.SOUL_WALL_TORCH, Material.CRIMSON_WALL_SIGN, Material.WARPED_WALL_SIGN));
        BlockGroup.DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.CRIMSON_DOOR, Material.WARPED_DOOR));
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.BUTTONS` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
GLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER, Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER, Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER, Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER, Material.SOUL_WALL_TORCH, Material.CRIMSON_WALL_SIGN, Material.WARPED_WALL_SIGN));
        BlockGroup.DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.CRIMSON_DOOR, Material.WARPED_DOOR));
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.PRESSURE_PLATES` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.CRIMSON_DOOR, Material.WARPED_DOOR));
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.VINES` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.LIGHTABLES` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.FIRE` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.LANTERNS` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
        BlockGroup.INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.SOUL_BLOCKS` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
        BlockGroup.INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        B
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.INTERACT_BLOCKS` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
        BlockGroup.INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACI
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.SAFE_INTERACT_BLOCKS` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
ED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Mat
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.UPDATE_STATE` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
 Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BER
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.NON_ATTACHABLE` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
ial.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_ANY` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java

    public Bukkit_v1_17() {
        BlockGroup.TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.GLOW_LICHEN));
        BlockGroup.TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Materi
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_TOP` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    public Bukkit_v1_17() {
        BlockGroup.TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.GLOW_LICHEN));
        BlockGroup.TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Materia
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_TOP_BOTTOM` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
P, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN, Material.AZALEA, Material.FLOWERING_AZALEA, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF));
        BlockGroup.TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.POINTED_DRIPSTONE, Material.BIG_DRIPLEAF_STEM));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.TRACK_BOTTOM` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
aterial.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN, Material.AZALEA, Material.FLOWERING_AZALEA, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF));
        BlockGroup.TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.POINTED_DRIPSTONE, Material.BIG_DRIPLEAF_STEM));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
        BlockGroup.CANDLES = new HashSet<>(Arrays.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.VINES` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        BlockGroup.TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.POINTED_DRIPSTONE, Material.BIG_DRIPLEAF_STEM));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
        BlockGroup.CANDLES = new HashSet<>(Arrays.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.CANDLES` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
        BlockGroup.CANDLES = new HashSet<>(Arrays.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDST
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.AMETHYST` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
ys.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, M
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.UPDATE_STATE` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Materi
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.NON_ATTACHABLE` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
t(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Material.LAVA_CAULDRON));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BlockGroup.VERTICAL_TOP_BOTTOM` from instance context
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
STONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Material.LAVA_CAULDRON));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW, Material.SUGAR_CANE, Material.NETHER_PORTAL, Material.REPEATER, Material.KELP, Material.CHORUS_FLOWER, Material.CHORUS_PLANT, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.LIGHT, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF, Material.BIG_DRIPLEAF_STEM, Material.GLOW_LICHEN, Material.HANGING_ROOTS));
        BlockGroup.VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.BIG_DRIPLEAF_STEM));
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpigotHandler.DARK_AQUA` from instance context
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java

    public Spigot_v1_16() {
        SpigotHandler.DARK_AQUA = ChatColor.of("#31b0e8");
        Color.DARK_AQUA = SpigotHandler.DARK_AQUA.toString();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Color.DARK_AQUA` from instance context
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public Spigot_v1_16() {
        SpigotHandler.DARK_AQUA = ChatColor.of("#31b0e8");
        Color.DARK_AQUA = SpigotHandler.DARK_AQUA.toString();
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `instance` from instance context
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
    @Override
    public void onEnable() {
        instance = this;
        ConfigHandler.path = this.getDataFolder().getPath() + File.separator;
        Language.loadPhrases();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ConfigHandler.path` from instance context
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
    public void onEnable() {
        instance = this;
        ConfigHandler.path = this.getDataFolder().getPath() + File.separator;
        Language.loadPhrases();

```

## Java8ListReplaceAll
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

                List<String> completions = new ArrayList<>(Arrays.asList(ACTIONS));
                for (int index = 0; index < completions.size(); index++) {
                    completions.set(index, filter + completions.get(index));
                }
```

### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

                List<String> completions = Bukkit.getOnlinePlayers().stream().map(Player::getName).collect(Collectors.toList());
                for (int index = 0; index < completions.size(); index++) {
                    completions.set(index, filter + completions.get(index));
                }
```

### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `src/main/java/net/coreprotect/listener/world/StructureGrowListener.java`
#### Snippet
```java
                List<BlockState> structureBlocks = new ArrayList<>(blocks);
                structureBlocks.removeIf(replacedBlock -> replacedBlock.getY() > location.getBlockY());
                for (int i = 0; i < structureBlocks.size(); i++) {
                    BlockState replacedBlock = structureBlocks.get(i);
                    structureBlocks.set(i, replacedBlock.getBlock().getState());
```

## KeySetIterationMayUseEntrySet
### KeySetIterationMayUseEntrySet
Iteration over `ConfigHandler.oldContainer.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
                    String transactingChestId = playerLocation.getWorld().getUID().toString() + "." + x + "." + y + "." + z;
                    String loggingChestId = user.toLowerCase(Locale.ROOT) + "." + x + "." + y + "." + z;
                    for (String loggingChestIdViewer : ConfigHandler.oldContainer.keySet()) {
                        if (loggingChestIdViewer.equals(loggingChestId) || !loggingChestIdViewer.endsWith("." + x + "." + y + "." + z)) {
                            continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `json.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                        JSONParser parser = new JSONParser();
                                        JSONObject json = (JSONObject) parser.parse(response);
                                        for (Object jsonKey : json.keySet()) {
                                            String key = (String) jsonKey;
                                            String value = ((String) json.get(jsonKey)).trim();
```

## DuplicateBranchesInSwitch
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
        switch (data) {
            case 0:
                return Material.WHITE_WOOL;
            case 1:
                return Material.ORANGE_WOOL;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
        switch (data) {
            case 2:
                return BlockFace.NORTH;
            case 3:
                return BlockFace.SOUTH;
```

## DuplicateExpressions
### DuplicateExpressions
Multiple occurrences of `newtype.equals(Material.AIR) || newtype.equals(Material.CAVE_AIR)`
in `src/main/java/net/coreprotect/listener/entity/EntityChangeBlockListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Silverfish) {
                if (newtype.equals(Material.AIR) || newtype.equals(Material.CAVE_AIR)) {
                    e = "#silverfish";
                }
```

### DuplicateExpressions
Multiple occurrences of `newtype.equals(Material.AIR) || newtype.equals(Material.CAVE_AIR)`
in `src/main/java/net/coreprotect/listener/entity/EntityChangeBlockListener.java`
#### Snippet
```java
            }
            if (e.length() > 0) {
                if (newtype.equals(Material.AIR) || newtype.equals(Material.CAVE_AIR)) {
                    Queue.queueBlockBreak(e, block.getState(), type, block.getBlockData().getAsString(), 0);
                }
```

### DuplicateExpressions
Multiple occurrences of `argument0.equals("l") || argument0.equals("lookup") || argument0.equals("rollback") || argument0.equ...`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                    return StringUtil.copyPartialMatches(argument1, completions, new ArrayList<>(completions.size()));
                }
                else if (argument0.equals("l") || argument0.equals("lookup") || argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro") || argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")) {
                    List<String> completions = new ArrayList<>(filterParams(true, argument0, argument1, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer));
                    completions.addAll(Bukkit.getOnlinePlayers().stream().filter(player -> player.getName().toLowerCase(Locale.ROOT).startsWith(argument1)).map(Player::getName).collect(Collectors.toList()));
```

### DuplicateExpressions
Multiple occurrences of `argument0.equals("l") || argument0.equals("lookup") || argument0.equals("rollback") || argument0.equ...`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                return Arrays.asList("");
            }
            else if (argument0.equals("l") || argument0.equals("lookup") || argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro") || argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")) {
                if ((!argument0.equals("l") && !argument0.equals("lookup")) || !hasPage) {
                    ArrayList<String> params = filterParams(false, argument0, currentArg, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer);
```

### DuplicateExpressions
Multiple occurrences of `corecommand.equals("status") || corecommand.equals("stats") || corecommand.equals("version")`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        permission = true;
                    }
                    else if (user.hasPermission("coreprotect.status") && (corecommand.equals("status") || corecommand.equals("stats") || corecommand.equals("version"))) {
                        permission = true;
                    }
```

### DuplicateExpressions
Multiple occurrences of `corecommand.equals("status") || corecommand.equals("stats") || corecommand.equals("version")`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    TeleportCommand.runCommand(user, permission, argumentArray);
                }
                else if (corecommand.equals("status") || corecommand.equals("stats") || corecommand.equals("version")) {
                    StatusCommand.runCommand(user, permission, argumentArray);
                }
```

### DuplicateExpressions
Multiple occurrences of `!newType.equals(Material.AIR) && !newType.equals(Material.CAVE_AIR)`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                Queue.queueBlockPlaceDelayed(actor.getName(), location, newType, newBlockDataString, oldBlock, 0);
            }
            else if ((oldType.equals(Material.AIR) || oldType.equals(Material.CAVE_AIR)) && (!newType.equals(Material.AIR) && !newType.equals(Material.CAVE_AIR))) {
                // placed a block
                Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, newType, newBlockExtraData, 0, newBlockDataString);
```

### DuplicateExpressions
Multiple occurrences of `!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, newType, newBlockExtraData, 0, newBlockDataString);
            }
            else if ((!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)) && (!newType.equals(Material.AIR) && !newType.equals(Material.CAVE_AIR))) {
                // replaced a block
                Waterlogged waterlogged = Util.checkWaterlogged(newBlockData, oldBlock);
```

### DuplicateExpressions
Multiple occurrences of `!newType.equals(Material.AIR) && !newType.equals(Material.CAVE_AIR)`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, newType, newBlockExtraData, 0, newBlockDataString);
            }
            else if ((!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)) && (!newType.equals(Material.AIR) && !newType.equals(Material.CAVE_AIR))) {
                // replaced a block
                Waterlogged waterlogged = Util.checkWaterlogged(newBlockData, oldBlock);
```

### DuplicateExpressions
Multiple occurrences of `!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, newType, newBlockExtraData, 0, newBlockDataString);
            }
            else if ((!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)) && (newType.equals(Material.AIR) || newType.equals(Material.CAVE_AIR))) {
                // removed a block
                Queue.queueBlockBreak(actor.getName(), oldBlock, oldBlock.getType(), oldBlockDataString, null, oldBlockExtraData, 0);
```

### DuplicateExpressions
Multiple occurrences of `restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0)`
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "USE INDEX(wid) IGNORE INDEX(type,user) ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### DuplicateExpressions
Multiple occurrences of `users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0`
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "USE INDEX(wid) IGNORE INDEX(type,user) ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### DuplicateExpressions
Multiple occurrences of `restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0)`
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "INDEXED BY block_index ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### DuplicateExpressions
Multiple occurrences of `users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0`
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "INDEXED BY block_index ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`items.size() == 0` can be replaced with 'items.isEmpty()'
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java
        String user = ((Player) entity).getName();
        List<ItemStack> items = event.getDrops();
        if (items == null || items.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`data.size() == 0` can be replaced with 'data.isEmpty()'
in `src/main/java/net/coreprotect/database/logger/ItemLogger.java`
#### Snippet
```java
                    // Object[] metadata = new Object[] { slot, item.getItemMeta() };
                    List<List<Map<String, Object>>> data = ItemMetaHandler.seralize(item, null, null, 0);
                    if (data.size() == 0) {
                        data = null;
                    }
```

### SizeReplaceableByIsEmpty
`firstVersion.length() > 0` can be replaced with '!firstVersion.isEmpty()'
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java

                    String firstVersion = Patch.getFirstVersion();
                    if (firstVersion.length() > 0) {
                        firstVersion = " (" + Phrase.build(Phrase.FIRST_VERSION, firstVersion) + ")";
                    }
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
                if (ConfigHandler.transactingChest.get(transactingChestId) != null) {
                    List<Object> list = Collections.synchronizedList(new ArrayList<>(ConfigHandler.transactingChest.get(transactingChestId)));
                    if (list.size() > 0) {
                        ItemStack[] newMerge = new ItemStack[newInventory.length + list.size()];
                        int count = 0;
```

### SizeReplaceableByIsEmpty
`metadata.size() == 0` can be replaced with 'metadata.isEmpty()'
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
                        // Object[] metadata = new Object[] { slot, item.getItemMeta() };
                        List<List<Map<String, Object>>> metadata = ItemMetaHandler.seralize(item, type, faceData, slot);
                        if (metadata.size() == 0) {
                            metadata = null;
                        }
```

### SizeReplaceableByIsEmpty
`e.length() > 0` can be replaced with '!e.isEmpty()'
in `src/main/java/net/coreprotect/listener/entity/EntityBlockFormListener.java`
#### Snippet
```java
                e = "#snowman";
            }
            if (e.length() > 0) {
                Queue.queueBlockPlace(e, block.getState(), block.getType(), null, newState.getType(), -1, 0, newState.getBlockData().getAsString());
            }
```

### SizeReplaceableByIsEmpty
`e.length() > 0` can be replaced with '!e.isEmpty()'
in `src/main/java/net/coreprotect/listener/entity/EntityChangeBlockListener.java`
#### Snippet
```java
                }
            }
            if (e.length() > 0) {
                if (newtype.equals(Material.AIR) || newtype.equals(Material.CAVE_AIR)) {
                    Queue.queueBlockBreak(e, block.getState(), type, block.getBlockData().getAsString(), 0);
```

### SizeReplaceableByIsEmpty
`event.getUser().length() > 0` can be replaced with '!event.getUser().isEmpty()'
in `src/main/java/net/coreprotect/database/logger/BlockPlaceLogger.java`
#### Snippet
```java
            int time = (int) (System.currentTimeMillis() / 1000L);

            if (event.getUser().length() > 0) {
                CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { time, event.getUser(), type });
            }
```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
    public static boolean inventoryTransaction(String user, Location location, ItemStack[] inventoryData) {
        if (user != null && location != null) {
            if (user.length() > 0) {
                BlockState blockState = location.getBlock().getState();
                Material type = blockState.getType();
```

### SizeReplaceableByIsEmpty
`removed.length() > 0` can be replaced with '!removed.isEmpty()'
in `src/main/java/net/coreprotect/consumer/process/NaturalBlockBreakProcess.java`
#### Snippet
```java
                for (BlockState blockState : blockStateList) {
                    String removed = Lookup.whoRemovedCache(blockState);
                    if (removed.length() > 0) {
                        user = removed;
                    }
```

### SizeReplaceableByIsEmpty
`player.length() > 0` can be replaced with '!player.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
            String player = Lookup.whoPlacedCache(block);
            int wid = Util.getWorldId(world.getName());
            if (!(player.length() > 0)) {
                int x = block.getX();
                int y = block.getY();
```

### SizeReplaceableByIsEmpty
`player.length() > 0` can be replaced with '!player.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                }
            }
            if (player.length() > 0) {
                boolean log = true;
                /*
```

### SizeReplaceableByIsEmpty
`lines.size() > 0` can be replaced with '!lines.isEmpty()'
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            lines.addAll(sort);

            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
```

### SizeReplaceableByIsEmpty
`newLine.length() > 0` can be replaced with '!newLine.isEmpty()'
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).equalsIgnoreCase(oldLine)) {
                    if (newLine != null && newLine.length() > 0) {
                        lines.set(i, newLine);
                    }
```

### SizeReplaceableByIsEmpty
`lines.size() > 0` can be replaced with '!lines.isEmpty()'
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            }

            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            String key = entry.getKey();
            String value = entry.getValue();
            if (DEFAULT_VALUES.containsKey(key) && value.length() > 0 && (!isCache || DEFAULT_VALUES.get(key).equals(USER_VALUES.get(key)))) {
                Phrase phrase = Phrase.valueOf(key);
                if (!isCache) {
```

### SizeReplaceableByIsEmpty
`target.length() > 0` can be replaced with '!target.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                    target = "minecraft:" + target.toLowerCase(Locale.ROOT);
                }
                if (target.length() > 0) {
                    target = "" + target + "";
                }
```

### SizeReplaceableByIsEmpty
`keyConfig.length() > 0` can be replaced with '!keyConfig.isEmpty()'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                boolean keyValidated = true;
                String keyConfig = Config.getGlobal().DONATION_KEY.trim();
                if (keyConfig.length() > 0) {
                    URL url = new URL("http://coreprotect.net/license/" + keyConfig);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
```

### SizeReplaceableByIsEmpty
`response.length() > 0` can be replaced with '!response.isEmpty()'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String response = reader.readLine();
                        if (response != null && response.length() > 0) {
                            String[] remoteKey = response.replaceAll("[^a-zA-Z0-9;]", "").split(";");
                            if (remoteKey.length > 1 && remoteKey[1].equals("1") && remoteKey[0].length() == 8) {
```

### SizeReplaceableByIsEmpty
`keyConfig.length() > 0` can be replaced with '!keyConfig.isEmpty()'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    Path licensePath = Paths.get(ConfigHandler.path + ".license");
                    if (keyValidated && donationKey == null) {
                        if (keyConfig.length() > 0) {
                            Chat.console(Phrase.build(Phrase.INVALID_DONATION_KEY) + " " + Phrase.build(Phrase.CHECK_CONFIG) + ".");
                        }
```

### SizeReplaceableByIsEmpty
`response.length() > 0` can be replaced with '!response.isEmpty()'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                                    String response = responseBuilder.toString();
                                    if (response.length() > 0 && response.startsWith("{") && response.endsWith("}")) {
                                        TreeMap<Phrase, String> translatedPhrases = new TreeMap<>();
                                        JSONParser parser = new JSONParser();
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                            String key = (String) jsonKey;
                                            String value = ((String) json.get(jsonKey)).trim();
                                            if (phraseSet.contains(key) && value.length() > 0) {
                                                Phrase phrase = Phrase.valueOf(key);
                                                translatedPhrases.put(phrase, value);
```

### SizeReplaceableByIsEmpty
`response.length() > 0` can be replaced with '!response.isEmpty()'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        String response = reader.readLine();

                        if (response.length() > 0 && response.length() < 10) {
                            String remoteVersion = response.replaceAll("[^0-9.]", "");
                            if (remoteVersion.contains(".")) {
```

### SizeReplaceableByIsEmpty
`target.length() > 0` can be replaced with '!target.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                String target = resultMaterial.name().toLowerCase(Locale.ROOT);
                target = Util.nameFilter(target, resultData);
                if (target.length() > 0) {
                    target = "minecraft:" + target.toLowerCase(Locale.ROOT) + "";
                }
```

### SizeReplaceableByIsEmpty
`color.length() > 0` can be replaced with '!color.isEmpty()'
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
            }

            output = output.replace("{" + substring + "}", color + param + (color.length() > 0 ? Color.WHITE : color));
        }

```

### SizeReplaceableByIsEmpty
`blockData.length() > 0` can be replaced with '!blockData.isEmpty()'
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
                            }
                        }
                        else if (blockData.length() > 0) {
                            Chat.sendComponent(player, blockData);
                        }
```

### SizeReplaceableByIsEmpty
`columns.length() == 0` can be replaced with 'columns.isEmpty()'
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                            for (int i = 1; i <= columnCount; i++) {
                                String name = resultSetMetaData.getColumnName(i);
                                if (columns.length() == 0) {
                                    columns = name;
                                }
```

### SizeReplaceableByIsEmpty
`currentArg.length() > 0` can be replaced with '!currentArg.isEmpty()'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                if (arg.chars().allMatch(Character::isDigit)) {
                    boolean addNumbers = true;
                    if (currentArg.length() > 0) {
                        char lastChar = currentArg.charAt(currentArg.length() - 1);
                        if (Character.isDigit(lastChar)) {
```

### SizeReplaceableByIsEmpty
`arg.length() == 0` can be replaced with 'arg.isEmpty()'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                            completions.set(index, filter + arg + completions.get(index));
                        }
                        if (arg.length() == 0) {
                            completions.remove(0);
                        }
```

### SizeReplaceableByIsEmpty
`user.length() == 0` can be replaced with 'user.isEmpty()'
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
            }

            if (user.length() == 0) {
                return user;
            }
```

### SizeReplaceableByIsEmpty
`resultData.length() > 0` can be replaced with '!resultData.isEmpty()'
in `src/main/java/net/coreprotect/consumer/process/StructureGrowthProcess.java`
#### Snippet
```java
                List<BlockState> blockStates = blockLists.get(id);
                String resultData = Lookup.whoPlaced(statement, block);
                if (resultData.length() > 0) {
                    user = resultData;
                }
```

### SizeReplaceableByIsEmpty
`target.length() > 0` can be replaced with '!target.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                String target = resultMaterial.name().toLowerCase(Locale.ROOT);
                target = Util.nameFilter(target, resultData);
                if (target.length() > 0) {
                    target = "minecraft:" + target.toLowerCase(Locale.ROOT) + "";
                }
```

### SizeReplaceableByIsEmpty
`command.length() > 0` can be replaced with '!command.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                CommandBlock commandBlock = (CommandBlock) block;
                String command = commandBlock.getCommand();
                if (command.length() > 0) {
                    meta.add(command);
                }
```

### SizeReplaceableByIsEmpty
`itemMap.size() > 0` can be replaced with '!itemMap.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                for (ItemStack itemStack : inventory) {
                    Map<Integer, Object> itemMap = serializeItemStackLegacy(itemStack, null, slot);
                    if (itemMap.size() > 0) {
                        meta.add(itemMap);
                    }
```

### SizeReplaceableByIsEmpty
`nameWid.length() > 0` can be replaced with '!nameWid.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            if (data[2].startsWith("wid:")) {
                String nameWid = data[2].replaceFirst("wid:", "");
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
```

### SizeReplaceableByIsEmpty
`nameWid.length() > 0` can be replaced with '!nameWid.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
                        data[2] = nameWid;
                    }
```

### SizeReplaceableByIsEmpty
`branch.length() > 0` can be replaced with '!branch.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                branch = branch.substring(1);
            }
            if (branch.length() > 0) {
                branch = "-" + branch;
            }
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

            result = new String(data, StandardCharsets.UTF_8);
            if (result.length() > 0) {
                if (result.matches("\\d+")) {
                    result = result + ",";
```

### SizeReplaceableByIsEmpty
`block.length() > 0` can be replaced with '!block.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    for (String blockData : blockDataSplit) {
                        String block = getBlockDataString(Integer.parseInt(blockData));
                        if (block.length() > 0) {
                            blockDataArray.add(block);
                        }
```

### SizeReplaceableByIsEmpty
`nameWid.length() > 0` can be replaced with '!nameWid.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            if (name.startsWith("wid:")) {
                String nameWid = name.replaceFirst("wid:", "");
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
```

### SizeReplaceableByIsEmpty
`nameWid.length() > 0` can be replaced with '!nameWid.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
                        name = nameWid;
                    }
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }

            if (result.length() > 0) {
                id = getWorldId(result);
            }
```

### SizeReplaceableByIsEmpty
`worldEditVersion[0].length() == 0` can be replaced with 'worldEditVersion\[0\].isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    worldEditVersion[0] = worldEditVersion[0].replaceAll("[^0-9]", "");
                    worldEditVersion[1] = worldEditVersion[1].replaceAll("[^0-9]", "");
                    if (worldEditVersion[0].length() == 0 || worldEditVersion[1].length() == 0 || Util.newVersion(worldEditVersion[0] + "." + worldEditVersion[1], "7.1")) {
                        validVersion = false;
                    }
```

### SizeReplaceableByIsEmpty
`worldEditVersion[1].length() == 0` can be replaced with 'worldEditVersion\[1\].isEmpty()'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    worldEditVersion[0] = worldEditVersion[0].replaceAll("[^0-9]", "");
                    worldEditVersion[1] = worldEditVersion[1].replaceAll("[^0-9]", "");
                    if (worldEditVersion[0].length() == 0 || worldEditVersion[1].length() == 0 || Util.newVersion(worldEditVersion[0] + "." + worldEditVersion[1], "7.1")) {
                        validVersion = false;
                    }
```

### SizeReplaceableByIsEmpty
`itemMap.size() > 0` can be replaced with '!itemMap.isEmpty()'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
                for (ItemStack itemStack : subMeta.getItems()) {
                    Map<String, Object> itemMap = Util.serializeItemStack(itemStack, null, slot);
                    if (itemMap.size() > 0) {
                        list.add(itemMap);
                    }
```

### SizeReplaceableByIsEmpty
`line1.length() > 0` can be replaced with '!line1.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java

                StringBuilder message = new StringBuilder();
                if (line1 != null && line1.length() > 0) {
                    message.append(line1);
                    if (!line1.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`line2.length() > 0` can be replaced with '!line2.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                    }
                }
                if (line2 != null && line2.length() > 0) {
                    message.append(line2);
                    if (!line2.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`line3.length() > 0` can be replaced with '!line3.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                    }
                }
                if (line3 != null && line3.length() > 0) {
                    message.append(line3);
                    if (!line3.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`line4.length() > 0` can be replaced with '!line4.isEmpty()'
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                    }
                }
                if (line4 != null && line4.length() > 0) {
                    message.append(line4);
                    if (!line4.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`resultData.length() > 0` can be replaced with '!resultData.isEmpty()'
in `src/main/java/net/coreprotect/listener/world/PortalCreateListener.java`
#### Snippet
```java
            if (type == Material.NETHER_PORTAL || type == Material.FIRE) {
                String resultData = Lookup.whoPlacedCache(block);
                if (resultData.length() > 0) {
                    user = resultData;
                    break;
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        for (String value : r_dat) {
                            String i4 = value.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.length() == value.length() && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                double a1 = Double.parseDouble(i4);
                                if (rcount == 0) { // x
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        for (String value : r_dat) {
                            String i4 = value.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.length() == value.length() && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                double a1 = Double.parseDouble(i4);
                                if (rcount == 0) { // x
```

### SizeReplaceableByIsEmpty
`check.length() > 0` can be replaced with '!check.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
        List<String> badUsers = Arrays.asList("n", "noisy", "v", "verbose", "#v", "#verbose", "#silent", "#preview", "#preview_cancel", "#count", "#sum");
        String check = user.replaceAll("[\\s'\"]", "");
        if (check.equals(user) && check.length() > 0) {
            if (user.equalsIgnoreCase("#global")) {
                user = "#global";
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (i3.endsWith("w") && w.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (i3.endsWith("w") && w.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("d") && d.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("d") && d.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("h") && h.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("h") && h.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("m") && m.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("m") && m.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("s") && s.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("s") && s.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = new BigDecimal(i4);
                                if (range) {
```

### SizeReplaceableByIsEmpty
`coord.length() > 0` can be replaced with '!coord.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        for (String coord : i2) {
                            coord = coord.replaceAll("[^0-9.\\-]", "");
                            if (coord.length() > 0 && !coord.equals(".") && !coord.equals("-") && coord.indexOf('.') == coord.lastIndexOf('.')) {
                                double parsedCoord = Double.parseDouble(coord);
                                if (cCount == 0) {
```

### SizeReplaceableByIsEmpty
`i2.length() > 0` can be replaced with '!i2.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    if (!argument.startsWith("-")) {
                        String i2 = argument.replaceAll("[^0-9]", "");
                        if (i2.length() > 0 && i2.length() < 10) {
                            rows = Integer.parseInt(i2);
                        }
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (i3.endsWith("w") && w == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (i3.endsWith("w") && w == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("d") && d == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("d") && d == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("h") && h == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("h") && h == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("m") && m == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("m") && m == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.length() > 0` can be replaced with '!i4.isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("s") && s == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`i4.replaceAll("[^0-9]", "").length() > 0` can be replaced with '!i4.replaceAll("\[\^0-9\]", "").isEmpty()'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("s") && s == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = Double.parseDouble(i4);
                            }
```

### SizeReplaceableByIsEmpty
`p.length() > 0` can be replaced with '!p.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                if (Config.getConfig(world).LIQUID_TRACKING) {
                    String p = Lookup.whoPlacedCache(block);
                    if (p.length() > 0) {
                        f = p;
                    }
```

### SizeReplaceableByIsEmpty
`blockData.length() > 0` can be replaced with '!blockData.isEmpty()'
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                                }
                                            }
                                            else if (blockData.length() > 0) {
                                                Chat.sendComponent(finalPlayer, blockData);
                                            }
```

### SizeReplaceableByIsEmpty
`blockData.length() > 0` can be replaced with '!blockData.isEmpty()'
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                                }
                                            }
                                            else if (blockData.length() > 0) {
                                                Chat.sendComponent(finalPlayer, blockData);
                                            }
```

### SizeReplaceableByIsEmpty
`resultData.length() > 0` can be replaced with '!resultData.isEmpty()'
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                }
                            }
                            else if (resultData.length() > 0) {
                                Chat.sendComponent(player, resultData);
                            }
```

### SizeReplaceableByIsEmpty
`signMessage.length() > 0` can be replaced with '!signMessage.isEmpty()'
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                            }

                                            if (signMessage.length() > 0) {
                                                Chat.sendComponent(player, signMessage, bypass);
                                            }
```

### SizeReplaceableByIsEmpty
`line1.length() > 0` can be replaced with '!line1.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            int color = sign.getColor().getColor().asRGB();
                            boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                            if (line1.length() > 0 || line2.length() > 0 || line3.length() > 0 || line4.length() > 0) {
                                Queue.queueSignText(player.getName(), location, 1, color, isGlowing, line1, line2, line3, line4, 0);
                            }
```

### SizeReplaceableByIsEmpty
`line2.length() > 0` can be replaced with '!line2.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            int color = sign.getColor().getColor().asRGB();
                            boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                            if (line1.length() > 0 || line2.length() > 0 || line3.length() > 0 || line4.length() > 0) {
                                Queue.queueSignText(player.getName(), location, 1, color, isGlowing, line1, line2, line3, line4, 0);
                            }
```

### SizeReplaceableByIsEmpty
`line3.length() > 0` can be replaced with '!line3.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            int color = sign.getColor().getColor().asRGB();
                            boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                            if (line1.length() > 0 || line2.length() > 0 || line3.length() > 0 || line4.length() > 0) {
                                Queue.queueSignText(player.getName(), location, 1, color, isGlowing, line1, line2, line3, line4, 0);
                            }
```

### SizeReplaceableByIsEmpty
`line4.length() > 0` can be replaced with '!line4.isEmpty()'
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            int color = sign.getColor().getColor().asRGB();
                            boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                            if (line1.length() > 0 || line2.length() > 0 || line3.length() > 0 || line4.length() > 0) {
                                Queue.queueSignText(player.getName(), location, 1, color, isGlowing, line1, line2, line3, line4, 0);
                            }
```

### SizeReplaceableByIsEmpty
`removed.length() > 0` can be replaced with '!removed.isEmpty()'
in `src/main/java/net/coreprotect/listener/entity/HangingBreakListener.java`
#### Snippet
```java
                    attachedBlock = hangingEntity.getLocation().getBlock().getRelative(attached);
                    String removed = Lookup.whoRemovedCache(attachedBlock.getState());
                    if (removed.length() > 0) {
                        causeName = removed;
                        logDrops = true;
```

### SizeReplaceableByIsEmpty
`itemMap.size() > 0` can be replaced with '!itemMap.isEmpty()'
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
                    for (ItemStack chargedProjectile : subMeta.getChargedProjectiles()) {
                        Map<String, Object> itemMap = Util.serializeItemStack(chargedProjectile, null, slot);
                        if (itemMap.size() > 0) {
                            list.add(itemMap);
                        }
```

### SizeReplaceableByIsEmpty
`faceData.length() > 0` can be replaced with '!faceData.isEmpty()'
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
        }

        if (faceData != null && faceData.length() > 0) {
            Map<String, Object> meta = new HashMap<>();
            meta.put("facing", faceData);
```

### SizeReplaceableByIsEmpty
`modifiers.size() > 0` can be replaced with '!modifiers.isEmpty()'
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
        }

        if (modifiers.size() > 0) {
            Map<String, Object> meta = new HashMap<>();
            meta.put("modifiers", modifiers);
```

### SizeReplaceableByIsEmpty
`x.length() == 0` can be replaced with 'x.isEmpty()'
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        String zValidate = z.replaceAll("[^.\\-]", "");

        if ((x.length() == 0 || x.length() >= 12 || x.equals(xValidate)) || (y.length() == 0 || y.length() >= 12 || y.equals(yValidate)) || (z.length() == 0 || z.length() >= 12 || z.equals(zValidate))) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, "/co teleport <world> <x> <y> <z>"));
            return;
```

### SizeReplaceableByIsEmpty
`y.length() == 0` can be replaced with 'y.isEmpty()'
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        String zValidate = z.replaceAll("[^.\\-]", "");

        if ((x.length() == 0 || x.length() >= 12 || x.equals(xValidate)) || (y.length() == 0 || y.length() >= 12 || y.equals(yValidate)) || (z.length() == 0 || z.length() >= 12 || z.equals(zValidate))) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, "/co teleport <world> <x> <y> <z>"));
            return;
```

### SizeReplaceableByIsEmpty
`z.length() == 0` can be replaced with 'z.isEmpty()'
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        String zValidate = z.replaceAll("[^.\\-]", "");

        if ((x.length() == 0 || x.length() >= 12 || x.equals(xValidate)) || (y.length() == 0 || y.length() >= 12 || y.equals(yValidate)) || (z.length() == 0 || z.length() >= 12 || z.equals(zValidate))) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, "/co teleport <world> <x> <y> <z>"));
            return;
```

### SizeReplaceableByIsEmpty
`idList.length() == 0` can be replaced with 'idList.isEmpty()'
in `src/main/java/net/coreprotect/patch/script/__2_16_0.java`
#### Snippet
```java
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    if (idList.length() == 0) {
                        idList = id;
                    }
```

### SizeReplaceableByIsEmpty
`idList.length() > 0` can be replaced with '!idList.isEmpty()'
in `src/main/java/net/coreprotect/patch/script/__2_16_0.java`
#### Snippet
```java
                resultSet.close();

                if (idList.length() > 0) {
                    query = "SELECT rowid as id FROM " + ConfigHandler.prefix + "block WHERE type IN(" + idList + ") AND y='0'";
                    String preparedQueryDelete = "DELETE FROM " + ConfigHandler.prefix + "block WHERE rowid = ?";
```

### SizeReplaceableByIsEmpty
`blacklistUser.length() > 0` can be replaced with '!blacklistUser.isEmpty()'
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                    while (blfile.getFilePointer() < blfile.length()) {
                        String blacklistUser = blfile.readLine().replaceAll(" ", "").toLowerCase(Locale.ROOT);
                        if (blacklistUser.length() > 0) {
                            ConfigHandler.blacklist.put(blacklistUser, true);
                        }
```

### SizeReplaceableByIsEmpty
`signList.size() == 0` can be replaced with 'signList.isEmpty()'
in `src/main/java/net/coreprotect/patch/script/__2_19_0.java`
#### Snippet
```java
            }

            if (signList.size() == 0) {
                return true;
            }
```

### SizeReplaceableByIsEmpty
`set.length() > 0` can be replaced with '!set.isEmpty()'
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        else if (count == 1) {
                            String set = (String) value;
                            if (set.length() > 0) {
                                Player owner = Bukkit.getServer().getPlayer(set);
                                if (owner == null) {
```

### SizeReplaceableByIsEmpty
`color.length() > 0` can be replaced with '!color.isEmpty()'
in `src/main/java/net/coreprotect/language/Phrase.java`
#### Snippet
```java
        }

        if (color.length() > 0) {
            output = output.replaceFirst(split, split + color);
            output = ChatMessage.parseQuotes(output, color);
```

### SizeReplaceableByIsEmpty
`old.size() == 0` can be replaced with 'old.isEmpty()'
in `src/main/java/net/coreprotect/consumer/process/ContainerTransactionProcess.java`
#### Snippet
```java
                        ContainerLogger.log(preparedStmtContainer, preparedStmtItems, batchCount, user, type, inventory, location);
                        List<ItemStack[]> old = ConfigHandler.oldContainer.get(loggingChestId);
                        if (old.size() == 0) {
                            ConfigHandler.oldContainer.remove(loggingChestId);
                            ConfigHandler.loggingChest.remove(loggingChestId);
```

### SizeReplaceableByIsEmpty
`ConfigHandler.EDITION_BRANCH.length() == 0` can be replaced with 'ConfigHandler.EDITION_BRANCH.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
            }

            if (ConfigHandler.EDITION_BRANCH.length() == 0) {
                Chat.sendConsoleMessage(Color.RED + "[CoreProtect] " + Phrase.build(Phrase.INVALID_BRANCH_1));
                Chat.sendConsoleMessage(Color.GREY + "[CoreProtect] " + Phrase.build(Phrase.INVALID_BRANCH_2));
```

### SizeReplaceableByIsEmpty
`argAction.size() == 0` can be replaced with 'argAction.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            else if (arg instanceof EntityType) {
                hasEntity = true;
                if (argAction.size() == 0) {
                    argAction.add(3);
                }
```

### SizeReplaceableByIsEmpty
`argAction.size() == 0` can be replaced with 'argAction.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            else if (arg instanceof EntityType) {
                hasEntity = true;
                if (argAction.size() == 0) {
                    argAction.add(3);
                }
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            }

            if (argUsers.size() == 0 && (argWid > 0 || forceglobal) && argRadius == null) {
                if (finalAction == 0) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ROLLBACK_USER, Selector.FIRST));
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java

            if (argAction.contains(4) && argAction.contains(11)) { // a:inventory
                if (argUsers.size() == 0) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ACTION_USER));
                    return;
```

### SizeReplaceableByIsEmpty
`argUsers.size() > 0` can be replaced with '!argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### SizeReplaceableByIsEmpty
`argAction.size() > 0` can be replaced with '!argAction.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                    }
                }
                if (argAction.size() > 0) {
                    if (argAction.contains(4)) {
                        if (argUsers.contains("#global") || (argUsers.size() == 0 && argRadius == null)) {
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                if (argAction.size() > 0) {
                    if (argAction.contains(4)) {
                        if (argUsers.contains("#global") || (argUsers.size() == 0 && argRadius == null)) {
                            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ACTION_USER));
                            return;
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                }

                if (argUsers.size() == 0) {
                    argUsers.add("#global");
                }
```

### SizeReplaceableByIsEmpty
`users.length() == 0` can be replaced with 'users.isEmpty()'
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                            String users = "";
                                            for (String value : rollbackusers2) {
                                                if (users.length() == 0) {
                                                    users = "" + value + "";
                                                }
```

### SizeReplaceableByIsEmpty
`faceData.length() > 0` can be replaced with '!faceData.isEmpty()'
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java
                                    itemstack = (ItemStack) populatedStack[2];

                                    if (type == Material.ITEM_FRAME && faceData.length() > 0) {
                                        BlockFace blockFace = BlockFace.valueOf(faceData);
                                        ItemFrame itemFrame = (ItemFrame) container;
```

### SizeReplaceableByIsEmpty
`argAction.size() == 0` can be replaced with 'argAction.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            else if (arg instanceof EntityType) {
                hasEntity = true;
                if (argAction.size() == 0) {
                    argAction.add(3);
                }
```

### SizeReplaceableByIsEmpty
`argAction.size() == 0` can be replaced with 'argAction.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            else if (arg instanceof EntityType) {
                hasEntity = true;
                if (argAction.size() == 0) {
                    argAction.add(3);
                }
```

### SizeReplaceableByIsEmpty
`check1.length() > 0` can be replaced with '!check1.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    check2 = split[1].replaceAll("[^a-zA-Z_]", "");
                }
                if (check1.length() > 0 || check2.length() > 0) {
                    type = 4;
                    pageLookup = false;
```

### SizeReplaceableByIsEmpty
`check2.length() > 0` can be replaced with '!check2.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    check2 = split[1].replaceAll("[^a-zA-Z_]", "");
                }
                if (check1.length() > 0 || check2.length() > 0) {
                    type = 4;
                    pageLookup = false;
```

### SizeReplaceableByIsEmpty
`check1.length() > 0` can be replaced with '!check1.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            else {
                String check1 = dat.replaceAll("[^a-zA-Z_]", "");
                if (check1.length() > 0) {
                    type = 4;
                    pageLookup = false;
```

### SizeReplaceableByIsEmpty
`argAction.size() == 0` can be replaced with 'argAction.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }
        if (!allPermission) {
            if (!pageLookup && (argAction.size() == 0 || (argAction.size() == 1 && (argAction.contains(0) || argAction.contains(1)))) && !player.hasPermission("coreprotect.lookup.block")) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.NO_PERMISSION));
                return;
```

### SizeReplaceableByIsEmpty
`argBlocks.size() > 0` can be replaced with '!argBlocks.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                return;
            }
            if (argBlocks.size() > 0) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INCOMPATIBLE_ACTION, "i:"));
                return;
```

### SizeReplaceableByIsEmpty
`argExclude.size() > 0` can be replaced with '!argExclude.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                return;
            }
            if (argExclude.size() > 0) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INCOMPATIBLE_ACTION, "e:"));
                return;
```

### SizeReplaceableByIsEmpty
`argBlocks.size() > 0` can be replaced with '!argBlocks.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }

        if (startTime <= 0 && !pageLookup && type == 4 && (argBlocks.size() > 0 || argUsers.size() > 0)) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_TIME, Selector.FIRST));
            return;
```

### SizeReplaceableByIsEmpty
`argUsers.size() > 0` can be replaced with '!argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }

        if (startTime <= 0 && !pageLookup && type == 4 && (argBlocks.size() > 0 || argUsers.size() > 0)) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_TIME, Selector.FIRST));
            return;
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

        if (argAction.contains(4) && argAction.contains(11)) { // a:inventory
            if (argUsers.size() == 0) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ACTION_USER));
                return;
```

### SizeReplaceableByIsEmpty
`results.length() > 0` can be replaced with '!results.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                    results = results.replaceAll("[^0-9]", "");
                    if (results.length() > 0 && results.length() < 10) {
                        int r = Integer.parseInt(results);
                        if (r > 0) {
```

### SizeReplaceableByIsEmpty
`pages.length() > 0` can be replaced with '!pages.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                }
                pages = pages.replaceAll("[^0-9]", "");
                if (pages.length() > 0 && pages.length() < 10) {
                    int pa = Integer.parseInt(pages);
                    if (pa > 0) {
```

### SizeReplaceableByIsEmpty
`results.length() > 0` can be replaced with '!results.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                    results = results.replaceAll("[^0-9]", "");
                    if (results.length() > 0 && results.length() < 10) {
                        int r = Integer.parseInt(results);
                        if (r > 0) {
```

### SizeReplaceableByIsEmpty
`pages.length() > 0` can be replaced with '!pages.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                }
                pages = pages.replaceAll("[^0-9]", "");
                if (pages.length() > 0 && pages.length() < 10) {
                    int p = Integer.parseInt(pages);
                    if (p > 0) {
```

### SizeReplaceableByIsEmpty
`results.length() > 0` can be replaced with '!results.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                        }
                        results = results.replaceAll("[^0-9]", "");
                        if (results.length() > 0 && results.length() < 10) {
                            int r = Integer.parseInt(results);
                            if (r > 0) {
```

### SizeReplaceableByIsEmpty
`pages.length() > 0` can be replaced with '!pages.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                    pages = pages.replaceAll("[^0-9]", "");
                    if (pages.length() > 0 && pages.length() < 10) {
                        int p = Integer.parseInt(pages);
                        if (p > 0) {
```

### SizeReplaceableByIsEmpty
`argBlocks.size() > 0` can be replaced with '!argBlocks.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (pageLookup || argBlocks.size() > 0 || argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### SizeReplaceableByIsEmpty
`argUsers.size() > 0` can be replaced with '!argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (pageLookup || argBlocks.size() > 0 || argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (pageLookup || argBlocks.size() > 0 || argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                }

                if (argUsers.size() == 0) {
                    argUsers.add("#global");
                }
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            else {
                // Functions.sendMessage(player, ChatColors.RED + "You did not specify a lookup radius.");
                if (argUsers.size() == 0 && argBlocks.size() == 0 && (argWid > 0 || forceglobal)) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.FIRST));
                    return;
```

### SizeReplaceableByIsEmpty
`argBlocks.size() == 0` can be replaced with 'argBlocks.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            else {
                // Functions.sendMessage(player, ChatColors.RED + "You did not specify a lookup radius.");
                if (argUsers.size() == 0 && argBlocks.size() == 0 && (argWid > 0 || forceglobal)) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.FIRST));
                    return;
```

### SizeReplaceableByIsEmpty
`argUsers.size() == 0` can be replaced with 'argUsers.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    return;
                }
                else if (argUsers.size() == 0 && argBlocks.size() == 0 && argRadius == null) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.SECOND));
                    return;
```

### SizeReplaceableByIsEmpty
`argBlocks.size() == 0` can be replaced with 'argBlocks.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    return;
                }
                else if (argUsers.size() == 0 && argBlocks.size() == 0 && argRadius == null) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.SECOND));
                    return;
```

### SizeReplaceableByIsEmpty
`dname.length() > 0` can be replaced with '!dname.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                        dname = Util.nameFilter(dname, ddata);
                                                    }
                                                    if (dname.length() > 0 && !isPlayer) {
                                                        dname = "minecraft:" + dname.toLowerCase(Locale.ROOT) + "";
                                                    }
```

### SizeReplaceableByIsEmpty
`finalArgAction.size() == 0` can be replaced with 'finalArgAction.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    }

                                                    action = (finalArgAction.size() == 0 ? " (" + action + ")" : "");
                                                    Chat.sendComponent(player2, Color.WHITE + leftPadding + Color.GREY + "^ " + Util.getCoordinates(command.getName(), wid, x, y, z, true, true) + Color.GREY + Color.ITALIC + action);
                                                }
```

### SizeReplaceableByIsEmpty
`signMessage.length() > 0` can be replaced with '!signMessage.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                    }

                                    if (signMessage.length() > 0) {
                                        Chat.sendComponent(player2, signMessage, bypass);
                                    }
```

### SizeReplaceableByIsEmpty
`blockdata.length() > 0` can be replaced with '!blockdata.isEmpty()'
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                    }
                                }
                                else if (blockdata.length() > 0) {
                                    Chat.sendComponent(player2, blockdata);
                                }
```

### SizeReplaceableByIsEmpty
`e.length() == 0` can be replaced with 'e.isEmpty()'
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        EntityType entity_type = entity.getType();
        if (e.length() == 0) {
            // assume killed self
            if (!skip) {
```

### SizeReplaceableByIsEmpty
`e.length() > 0` can be replaced with '!e.isEmpty()'
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
        }

        if (e.length() > 0) {
            List<Object> data = new ArrayList<>();
            List<Object> age = new ArrayList<>();
```

### SizeReplaceableByIsEmpty
`blockData.length() == 0` can be replaced with 'blockData.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

            String blockData = parse[12];
            if (blockData == null || blockData.length() == 0) {
                return getType().createBlockData();
            }
```

### SizeReplaceableByIsEmpty
`actionList.size() == 0` can be replaced with 'actionList.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        List<Object> restrictBlocks = new ArrayList<>(restrictBlocksMap.keySet());
        if (actionList.size() == 0 && restrictBlocks.size() > 0) {
            boolean addedMaterial = false;
            boolean addedEntity = false;
```

### SizeReplaceableByIsEmpty
`restrictBlocks.size() > 0` can be replaced with '!restrictBlocks.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        List<Object> restrictBlocks = new ArrayList<>(restrictBlocksMap.keySet());
        if (actionList.size() == 0 && restrictBlocks.size() > 0) {
            boolean addedMaterial = false;
            boolean addedEntity = false;
```

### SizeReplaceableByIsEmpty
`actionList.size() == 0` can be replaced with 'actionList.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        }

        if (actionList.size() == 0) {
            actionList.add(0);
            actionList.add(1);
```

### SizeReplaceableByIsEmpty
`restrictUsers.size() == 0` can be replaced with 'restrictUsers.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        actionList.removeIf(actionListItem -> actionListItem > 3);

        if (restrictUsers.size() == 0) {
            restrictUsers.add("#global");
        }
```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED) {
            if (user != null && location != null) {
                if (user.length() > 0) {
                    Block block = location.getBlock();
                    BlockState blockState = block.getState();
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED && player != null && Config.getConfig(player.getWorld()).PLAYER_MESSAGES) {
            if (message != null) {
                if (message.length() > 0 && !message.startsWith("/")) {
                    long timestamp = System.currentTimeMillis() / 1000L;

```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED) {
            if (user != null && location != null) {
                if (user.length() > 0) {
                    String blockDataString = null;

```

### SizeReplaceableByIsEmpty
`command.length() > 0` can be replaced with '!command.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED && player != null && Config.getConfig(player.getWorld()).PLAYER_COMMANDS) {
            if (command != null) {
                if (command.length() > 0 && command.startsWith("/")) {
                    long timestamp = System.currentTimeMillis() / 1000L;

```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED) {
            if (user != null && location != null) {
                if (user.length() > 0) {
                    Queue.queueBlockPlace(user, location.getBlock().getState(), location.getBlock().getType(), null, type, data, 1, null);
                    return true;
```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED) {
            if (user != null && location != null) {
                if (user.length() > 0) {
                    Queue.queuePlayerInteraction(user, location.getBlock().getState(), location.getBlock().getType());
                    return true;
```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED) {
            if (user != null && location != null) {
                if (user.length() > 0) {
                    Queue.queueBlockBreak(user, location.getBlock().getState(), type, type.createBlockData().getAsString(), data);
                    return true;
```

### SizeReplaceableByIsEmpty
`checkUuids.size() > 0` can be replaced with '!checkUuids.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            String query = "";

            if (checkUuids.size() > 0) {
                String list = "";

```

### SizeReplaceableByIsEmpty
`list.length() == 0` can be replaced with 'list.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                for (String value : checkUuids) {
                    if (list.length() == 0) {
                        list = "'" + value + "'";
                    }
```

### SizeReplaceableByIsEmpty
`restrictList.size() > 0` can be replaced with '!restrictList.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (restrictList.size() > 0) {
                StringBuilder includeListMaterial = new StringBuilder();
                StringBuilder includeListEntity = new StringBuilder();
```

### SizeReplaceableByIsEmpty
`excludeList.size() > 0` can be replaced with '!excludeList.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (excludeList.size() > 0) {
                StringBuilder excludeListMaterial = new StringBuilder();
                StringBuilder excludeListEntity = new StringBuilder();
```

### SizeReplaceableByIsEmpty
`excludeUserList.size() > 0` can be replaced with '!excludeUserList.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (excludeUserList.size() > 0) {
                StringBuilder excludeUserText = new StringBuilder();

```

### SizeReplaceableByIsEmpty
`actionList.size() == 0` can be replaced with 'actionList.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            // Specify actions to exclude from a:item
            if ((lookup && actionList.size() == 0) || (actionList.contains(11) && actionList.size() == 1)) {
                StringBuilder actionText = new StringBuilder();
                actionText = actionText.append(ItemLogger.ITEM_BREAK);
```

### SizeReplaceableByIsEmpty
`actionExclude.length() > 0` can be replaced with '!actionExclude.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryBlock = queryBlock + " action IN(" + action + ") AND";
            }
            else if (inventoryQuery || actionExclude.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0 || excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " action NOT IN(-1) AND";
            }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryBlock = queryBlock + " action IN(" + action + ") AND";
            }
            else if (inventoryQuery || actionExclude.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0 || excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " action NOT IN(-1) AND";
            }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryBlock = queryBlock + " action IN(" + action + ") AND";
            }
            else if (inventoryQuery || actionExclude.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0 || excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " action NOT IN(-1) AND";
            }
```

### SizeReplaceableByIsEmpty
`excludeBlock.length() > 0` can be replaced with '!excludeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryBlock = queryBlock + " action IN(" + action + ") AND";
            }
            else if (inventoryQuery || actionExclude.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0 || excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " action NOT IN(-1) AND";
            }
```

### SizeReplaceableByIsEmpty
`excludeEntity.length() > 0` can be replaced with '!excludeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryBlock = queryBlock + " action IN(" + action + ") AND";
            }
            else if (inventoryQuery || actionExclude.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0 || excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " action NOT IN(-1) AND";
            }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryBlock = queryBlock + " type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryBlock = queryBlock + " type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryBlock = queryBlock + " type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ") AND";
            }

```

### SizeReplaceableByIsEmpty
`excludeBlock.length() > 0` can be replaced with '!excludeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`excludeEntity.length() > 0` can be replaced with '!excludeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`excludeBlock.length() > 0` can be replaced with '!excludeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ") AND";
            }

```

### SizeReplaceableByIsEmpty
`uuids.length() > 0` can be replaced with '!uuids.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (uuids.length() > 0) {
                queryBlock = queryBlock + " uuid IN(" + uuids + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`users.length() > 0` can be replaced with '!users.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (users.length() > 0) {
                queryBlock = queryBlock + " user IN(" + users + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`excludeUsers.length() > 0` can be replaced with '!excludeUsers.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (excludeUsers.length() > 0) {
                queryBlock = queryBlock + " user NOT IN(" + excludeUsers + ") AND";
            }
```

### SizeReplaceableByIsEmpty
`queryBlock.length() > 0` can be replaced with '!queryBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (queryBlock.length() > 0) {
                queryBlock = queryBlock.substring(0, queryBlock.length() - 4);
            }
```

### SizeReplaceableByIsEmpty
`queryBlock.length() == 0` can be replaced with 'queryBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (queryBlock.length() == 0) {
                queryBlock = " 1";
            }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            queryEntity = queryBlock;
            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ")", "type IN(" + (includeEntity.length() > 0 ? includeEntity : "0") + ")");
            }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            queryEntity = queryBlock;
            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ")", "type IN(" + (includeEntity.length() > 0 ? includeEntity : "0") + ")");
            }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            queryEntity = queryBlock;
            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ")", "type IN(" + (includeEntity.length() > 0 ? includeEntity : "0") + ")");
            }
            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            queryEntity = queryBlock;
            if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ")", "type IN(" + (includeEntity.length() > 0 ? includeEntity : "0") + ")");
            }
            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
```

### SizeReplaceableByIsEmpty
`excludeBlock.length() > 0` can be replaced with '!excludeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryEntity = queryEntity.replace("type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ")", "type IN(" + (includeEntity.length() > 0 ? includeEntity : "0") + ")");
            }
            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ")", "type NOT IN(" + (excludeEntity.length() > 0 ? excludeEntity : "0") + ")");
            }
```

### SizeReplaceableByIsEmpty
`excludeEntity.length() > 0` can be replaced with '!excludeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                queryEntity = queryEntity.replace("type IN(" + (includeBlock.length() > 0 ? includeBlock : "0") + ")", "type IN(" + (includeEntity.length() > 0 ? includeEntity : "0") + ")");
            }
            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ")", "type NOT IN(" + (excludeEntity.length() > 0 ? excludeEntity : "0") + ")");
            }
```

### SizeReplaceableByIsEmpty
`excludeBlock.length() > 0` can be replaced with '!excludeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }
            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ")", "type NOT IN(" + (excludeEntity.length() > 0 ? excludeEntity : "0") + ")");
            }

```

### SizeReplaceableByIsEmpty
`excludeEntity.length() > 0` can be replaced with '!excludeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }
            if (excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryEntity = queryEntity.replace("type NOT IN(" + (excludeBlock.length() > 0 ? excludeBlock : "0") + ")", "type NOT IN(" + (excludeEntity.length() > 0 ? excludeEntity : "0") + ")");
            }

```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            if (Config.getGlobal().MYSQL) {
                if (queryTable.equals("block")) {
                    if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                        index = "USE INDEX(type) IGNORE INDEX(user,wid) ";
                    }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            if (Config.getGlobal().MYSQL) {
                if (queryTable.equals("block")) {
                    if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                        index = "USE INDEX(type) IGNORE INDEX(user,wid) ";
                    }
```

### SizeReplaceableByIsEmpty
`users.length() > 0` can be replaced with '!users.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "USE INDEX(type) IGNORE INDEX(user,wid) ";
                    }
                    if (users.length() > 0) {
                        index = "USE INDEX(user) IGNORE INDEX(type,wid) ";
                    }
```

### SizeReplaceableByIsEmpty
`users.length() > 0` can be replaced with '!users.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "USE INDEX(wid) IGNORE INDEX(type,user) ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "USE INDEX(wid) IGNORE INDEX(type,user) ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "USE INDEX(wid) IGNORE INDEX(type,user) ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            else {
                if (queryTable.equals("block")) {
                    if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                        index = "INDEXED BY block_type_index ";
                    }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            else {
                if (queryTable.equals("block")) {
                    if (includeBlock.length() > 0 || includeEntity.length() > 0) {
                        index = "INDEXED BY block_type_index ";
                    }
```

### SizeReplaceableByIsEmpty
`users.length() > 0` can be replaced with '!users.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "INDEXED BY block_type_index ";
                    }
                    if (users.length() > 0) {
                        index = "INDEXED BY block_user_index ";
                    }
```

### SizeReplaceableByIsEmpty
`users.length() > 0` can be replaced with '!users.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "INDEXED BY block_index ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "INDEXED BY block_index ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### SizeReplaceableByIsEmpty
`includeEntity.length() > 0` can be replaced with '!includeEntity.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        index = "INDEXED BY block_index ";
                    }
                    if ((restrictWorld && (users.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0))) {
                        index = "";
                    }
```

### SizeReplaceableByIsEmpty
`actionList.size() == 0` can be replaced with 'actionList.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            boolean itemLookup = inventoryQuery;
            if ((lookup && actionList.size() == 0) || (itemLookup && !actionList.contains(0))) {
                if (!count) {
                    rows = "rowid as id,time,user,wid,x,y,z,type,meta as metadata,data,-1 as amount,action,rolled_back";
```

### SizeReplaceableByIsEmpty
`includeBlock.length() > 0` can be replaced with '!includeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                }

                if (includeBlock.length() > 0 || excludeBlock.length() > 0) {
                    baseQuery = baseQuery.replace("action NOT IN(-1)", "action NOT IN(3)"); // if block specified for include/exclude, filter out entity data
                }
```

### SizeReplaceableByIsEmpty
`excludeBlock.length() > 0` can be replaced with '!excludeBlock.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                }

                if (includeBlock.length() > 0 || excludeBlock.length() > 0) {
                    baseQuery = baseQuery.replace("action NOT IN(-1)", "action NOT IN(3)"); // if block specified for include/exclude, filter out entity data
                }
```

### SizeReplaceableByIsEmpty
`actionExclude.length() > 0` can be replaced with '!actionExclude.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                }

                if (actionExclude.length() > 0) {
                    queryBlock = queryBlock.replace("action NOT IN(-1)", "action NOT IN(" + actionExclude + ")");
                }
```

### SizeReplaceableByIsEmpty
`query.length() == 0` can be replaced with 'query.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            if (query.length() == 0) {
                if (actionExclude.length() > 0) {
                    baseQuery = baseQuery.replace("action NOT IN(-1)", "action NOT IN(" + actionExclude + ")");
```

### SizeReplaceableByIsEmpty
`actionExclude.length() > 0` can be replaced with '!actionExclude.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            if (query.length() == 0) {
                if (actionExclude.length() > 0) {
                    baseQuery = baseQuery.replace("action NOT IN(-1)", "action NOT IN(" + actionExclude + ")");
                }
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                result = ConfigHandler.playerIdCacheReversed.get(resultUserId);
                if (result.length() > 0) {
                    Material resultMaterial = Util.getType(resultType);
                    CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + worldId + "", new Object[] { time, result, resultMaterial });
```

### SizeReplaceableByIsEmpty
`line1.length() > 0` can be replaced with '!line1.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                    StringBuilder message = new StringBuilder();
                    if (line1 != null && line1.length() > 0) {
                        message.append(line1);
                        if (!line1.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`line2.length() > 0` can be replaced with '!line2.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        }
                    }
                    if (line2 != null && line2.length() > 0) {
                        message.append(line2);
                        if (!line2.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`line3.length() > 0` can be replaced with '!line3.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        }
                    }
                    if (line3 != null && line3.length() > 0) {
                        message.append(line3);
                        if (!line3.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`line4.length() > 0` can be replaced with '!line4.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        }
                    }
                    if (line4 != null && line4.length() > 0) {
                        message.append(line4);
                        if (!line4.endsWith(" ")) {
```

### SizeReplaceableByIsEmpty
`actionList.size() == 0` can be replaced with 'actionList.isEmpty()'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                    boolean hasTbl = false;
                    if ((lookup && actionList.size() == 0) || actionList.contains(4) || actionList.contains(5) || actionList.contains(11)) {
                        resultData = results.getInt("data");
                        resultAmount = results.getInt("amount");
```

### SizeReplaceableByIsEmpty
`metaList.size() > 0` can be replaced with '!metaList.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            Material rowType = itemstack.getType();
            List<Object> metaList = (List<Object>) list;
            if (metaList.size() > 0 && !(metaList.get(0) instanceof List<?>)) {
                if (rowType.name().endsWith("_BANNER")) {
                    BannerMeta meta = (BannerMeta) itemstack.getItemMeta();
```

### SizeReplaceableByIsEmpty
`map.size() == 0` can be replaced with 'map.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            Builder effectBuilder = FireworkEffect.builder();
            for (List<Map<String, Object>> map : (List<List<Map<String, Object>>>) list) {
                if (map.size() == 0) {
                    if (itemCount == 3 && (rowType == Material.FIREWORK_ROCKET || rowType == Material.FIREWORK_STAR)) {
                        buildFireworkEffect(effectBuilder, rowType, itemstack);
```

### SizeReplaceableByIsEmpty
`restrictList.size() > 0` can be replaced with '!restrictList.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            }

            if (restrictList.size() > 0) {
                StringBuilder restrictTargets = new StringBuilder();
                boolean material = false;
```

### SizeReplaceableByIsEmpty
`excludeList.size() > 0` can be replaced with '!excludeList.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            }

            if (excludeList.size() > 0) {
                StringBuilder excludeTargets = new StringBuilder();
                boolean material = false;
```

### SizeReplaceableByIsEmpty
`excludeUserList.size() > 0` can be replaced with '!excludeUserList.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            }

            if (excludeUserList.size() > 0) {
                StringBuilder excludeUsers = new StringBuilder();

```

### SizeReplaceableByIsEmpty
`inventory.addItem(itemstack).size() == 0` can be replaced with 'inventory.addItem(itemstack).isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                            }
                            if (!addedItem) {
                                addedItem = (inventory.addItem(itemstack).size() == 0);
                            }
                            if (!addedItem && isPlayerInventory) {
```

### SizeReplaceableByIsEmpty
`actionList.size() == 0` can be replaced with 'actionList.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

            List<Object[]> itemList = new ArrayList<>();
            if (Config.getGlobal().ROLLBACK_ITEMS && !checkUsers.contains("#container") && (actionList.size() == 0 || actionList.contains(4) || ROLLBACK_ITEMS) && preview == 0) {
                List<Integer> itemActionList = new ArrayList<>(actionList);

```

### SizeReplaceableByIsEmpty
`world.length() == 0` can be replaced with 'world.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                if (rowAction != 3) { // entity kill
                                    String world = Util.getWorldName(rowWorldId);
                                    if (world.length() == 0) {
                                        continue;
                                    }
```

### SizeReplaceableByIsEmpty
`world.length() == 0` can be replaced with 'world.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                            else if (rowAction == 3) { // entity kill
                                String world = Util.getWorldName(rowWorldId);
                                if (world.length() == 0) {
                                    continue;
                                }
```

### SizeReplaceableByIsEmpty
`world.length() == 0` can be replaced with 'world.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                                String world = Util.getWorldName(rowWorldId);
                                if (world.length() == 0) {
                                    continue;
                                }
```

### SizeReplaceableByIsEmpty
`rowUser.length() > 0` can be replaced with '!rowUser.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                                if ((rowType != Material.AIR) && changeBlock) {
                                    if (rowUser.length() > 0) {
                                        CacheHandler.lookupCache.put(rowX + "." + rowY + "." + rowZ + "." + rowWorldId, new Object[] { unixtimestamp, rowUser, rowType });
                                    }
```

### SizeReplaceableByIsEmpty
`world.length() == 0` can be replaced with 'world.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        container = null; // container patch 2.14.0
                                        String world = Util.getWorldName(rowWorldId);
                                        if (world.length() == 0) {
                                            continue;
                                        }
```

### SizeReplaceableByIsEmpty
`faceData.length() > 0` can be replaced with '!faceData.isEmpty()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                        container = entity;
                                                        containerType = Material.ITEM_FRAME;
                                                        if (faceData.length() > 0 && (BlockFace.valueOf(faceData) == ((ItemFrame) entity).getFacing())) {
                                                            break;
                                                        }
```

## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java

                if (!found) {
                    result.add(new StringBuilder(Color.WHITE + "----- " + Color.DARK_AQUA + Phrase.build(Phrase.SIGN_HEADER) + Color.WHITE + " ----- " + Util.getCoordinates(command, worldId, x, y, z, false, false) + "").toString());
                }
                found = true;
```

## ReadWriteStringCanBeUsed
### ReadWriteStringCanBeUsed
Can be replaced with 'Files.writeString()'
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
            }
```

### ReadWriteStringCanBeUsed
Can be replaced with 'Files.writeString()'
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
            }
```

## UnnecessaryReturn
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/spigot/SpigotAdapter.java`
#### Snippet
```java
    @Override
    public void addHoverComponent(Object message, String[] data) {
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/spigot/SpigotAdapter.java`
#### Snippet
```java
    @Override
    public void setHoverEvent(Object message, String text) {
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java
    @Override
    public void sendSignChange(Player player, Sign sign) {
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java
    @Override
    public void setGlowing(Sign sign, boolean set) {
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                if (argUsers.size() == 0 && argBlocks.size() == 0 && (argWid > 0 || forceglobal)) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.FIRST));
                    return;
                }
                else if (argUsers.size() == 0 && argBlocks.size() == 0 && argRadius == null) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                else if (argUsers.size() == 0 && argBlocks.size() == 0 && argRadius == null) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.SECOND));
                    return;
                }
                else {
```

## ManualMinMaxCalculation
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }

            int displayStart = (page - 2) < 1 ? 1 : (page - 2);
            int displayEnd = (page + 2) > totalPages ? totalPages : (page + 2);
            if (page > 999 || (page > 101 && totalPages > 99999)) { // limit to max 5 page numbers
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

            int displayStart = (page - 2) < 1 ? 1 : (page - 2);
            int displayEnd = (page + 2) > totalPages ? totalPages : (page + 2);
            if (page > 999 || (page > 101 && totalPages > 99999)) { // limit to max 5 page numbers
                displayStart = (displayStart + 1) < displayEnd ? (displayStart + 1) : displayStart;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                displayEnd = (displayEnd - 1) > displayStart ? (displayEnd - 1) : displayEnd;
                if (displayStart > (totalPages - 3)) {
                    displayStart = (totalPages - 3) < 1 ? 1 : (totalPages - 3);
                }
            }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            else { // display at least 7 page numbers
                if (displayStart > (totalPages - 5)) {
                    displayStart = (totalPages - 5) < 1 ? 1 : (totalPages - 5);
                }
                if (displayEnd < 6) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                if (displayEnd < 6) {
                    displayEnd = 6 > totalPages ? totalPages : 6;
                }
            }
```

## TrivialStringConcatenation
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java
            int y = location.getBlockY();
            int z = location.getBlockZ();
            CacheHandler.breakCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { time, event.getUser(), type });
            BlockStatement.insert(preparedStmt, batchCount, time, userId, wid, x, y, z, type, data, meta, blockData, 0, 0);
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java
            int y = location.getBlockY();
            int z = location.getBlockZ();
            CacheHandler.breakCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { time, event.getUser(), type });
            BlockStatement.insert(preparedStmt, batchCount, time, userId, wid, x, y, z, type, data, meta, blockData, 0, 0);
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/logger/BlockPlaceLogger.java`
#### Snippet
```java

            if (event.getUser().length() > 0) {
                CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { time, event.getUser(), type });
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/logger/BlockPlaceLogger.java`
#### Snippet
```java

            if (event.getUser().length() > 0) {
                CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { time, event.getUser(), type });
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/HelpCommand.java`
#### Snippet
```java
                else if (helpcommand.equals("purge") || helpcommand.equals("purges")) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "/co purge t:<time> " + Color.WHITE + "- " + Phrase.build(Phrase.HELP_PURGE_1));
                    Chat.sendMessage(player, Color.GREY + Color.ITALIC + "" + Phrase.build(Phrase.HELP_PURGE_2, "/co purge t:30d"));
                }
                else if (helpcommand.equals("reload")) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                    switch (i) {
                        case 0:
                            coords = "" + (x + 1) + "." + y + "." + z + "." + wid + "";
                            break;
                        case 1:
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                    switch (i) {
                        case 0:
                            coords = "" + (x + 1) + "." + y + "." + z + "." + wid + "";
                            break;
                        case 1:
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                            break;
                        case 1:
                            coords = "" + (x - 1) + "." + y + "." + z + "." + wid + "";
                            break;
                        case 2:
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                            break;
                        case 1:
                            coords = "" + (x - 1) + "." + y + "." + z + "." + wid + "";
                            break;
                        case 2:
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                            break;
                        case 2:
                            coords = "" + x + "." + y + "." + (z + 1) + "." + wid + "";
                            break;
                        case 3:
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                            break;
                        case 2:
                            coords = "" + x + "." + y + "." + (z + 1) + "." + wid + "";
                            break;
                        case 3:
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                            break;
                        case 3:
                            coords = "" + x + "." + y + "." + (z - 1) + "." + wid + "";
                            break;
                    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                            break;
                        case 3:
                            coords = "" + x + "." + y + "." + (z - 1) + "." + wid + "";
                            break;
                    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/player/PlayerBucketEmptyListener.java`
#### Snippet
```java
            }

            CacheHandler.lookupCache.put("" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + worldId + "", new Object[] { unixTimestamp, player, type });
            queueBlockPlace(player, block.getState(), block.getType(), blockState, type, 1, 1, null);
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/player/PlayerBucketEmptyListener.java`
#### Snippet
```java
            }

            CacheHandler.lookupCache.put("" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + worldId + "", new Object[] { unixTimestamp, player, type });
            queueBlockPlace(player, block.getState(), block.getType(), blockState, type, 1, 1, null);
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
            int totalPages = (int) Math.ceil(count / (limit + 0.0));

            query = "SELECT time,user,action,type,data,rolled_back FROM " + ConfigHandler.prefix + "block " + Util.getWidIndex("block") + "WHERE wid = '" + worldId + "' AND x = '" + x + "' AND z = '" + z + "' AND y = '" + y + "' AND action IN(0,1) AND time >= '" + checkTime + "' ORDER BY rowid DESC LIMIT " + page_start + ", " + limit + "";
            results = statement.executeQuery(query);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }
                if (target.length() > 0) {
                    target = "" + target + "";
                }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }
                if (target.length() > 0) {
                    target = "" + target + "";
                }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
            int totalPages = (int) Math.ceil(count / (limit + 0.0));

            query = "SELECT time,user,action,type,data,rolled_back FROM " + ConfigHandler.prefix + "block " + Util.getWidIndex("block") + "WHERE wid = '" + worldId + "' AND x = '" + x + "' AND z = '" + z + "' AND y = '" + y + "' AND action='2' AND time >= '" + checkTime + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            results = statement.executeQuery(query);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                target = Util.nameFilter(target, resultData);
                if (target.length() > 0) {
                    target = "minecraft:" + target.toLowerCase(Locale.ROOT) + "";
                }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                }

                String database = "jdbc:sqlite:" + ConfigHandler.path + ConfigHandler.sqlite + "";
                connection = DriverManager.getConnection(database);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java
                int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
                int world_id = Util.getWorldId(block.getWorld().getName());
                CacheHandler.lookupCache.put("" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + world_id + "", new Object[] { unixtimestamp, player.getName(), block.getType() });
            }
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java
                int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
                int world_id = Util.getWorldId(block.getWorld().getName());
                CacheHandler.lookupCache.put("" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + world_id + "", new Object[] { unixtimestamp, player.getName(), block.getType() });
            }
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java
                    int z = n.getZ();
                    Material t = n.getType();
                    String cords = "" + x + "." + y + "." + z + "." + wid + "." + t.name() + "";
                    if (CacheHandler.pistonCache.get(cords) == null) {
                        log = 1;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java
                    int z = n.getZ();
                    Material t = n.getType();
                    String cords = "" + x + "." + y + "." + z + "." + wid + "." + t.name() + "";
                    if (CacheHandler.pistonCache.get(cords) == null) {
                        log = 1;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                        for (String table : ConfigHandler.databaseTables) {
                            try {
                                query = "DROP TABLE IF EXISTS " + purgePrefix + table + "";
                                preparedStmt = connection.prepareStatement(query);
                                preparedStmt.execute();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                        Chat.sendGlobalMessage(player, Phrase.build(Phrase.PURGE_OPTIMIZING));
                        for (String table : ConfigHandler.databaseTables) {
                            query = "OPTIMIZE LOCAL TABLE " + ConfigHandler.prefix + table + "";
                            preparedStmt = connection.prepareStatement(query);
                            preparedStmt.execute();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
            int totalPages = (int) Math.ceil(count / (limit + 0.0));

            query = "SELECT time,user,action,type,data,amount,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + x + "' OR x = '" + x2 + "') AND (z = '" + z + "' OR z = '" + z2 + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            if (exact) {
                query = "SELECT time,user,action,type,data,amount,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + l.getBlockX() + "') AND (z = '" + l.getBlockZ() + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
            query = "SELECT time,user,action,type,data,amount,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + x + "' OR x = '" + x2 + "') AND (z = '" + z + "' OR z = '" + z2 + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            if (exact) {
                query = "SELECT time,user,action,type,data,amount,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + l.getBlockX() + "') AND (z = '" + l.getBlockZ() + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            }
            results = statement.executeQuery(query);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                target = Util.nameFilter(target, resultData);
                if (target.length() > 0) {
                    target = "minecraft:" + target.toLowerCase(Locale.ROOT) + "";
                }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
            int wid = Util.getWorldId(block.getWorld().getName());
            CacheHandler.lookupCache.put("" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + wid + "", new Object[] { unixtimestamp, user, Material.WATER });
            return true;
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
            int wid = Util.getWorldId(block.getWorld().getName());
            CacheHandler.lookupCache.put("" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + wid + "", new Object[] { unixtimestamp, user, Material.WATER });
            return true;
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
            int totalPages = (int) Math.ceil(count / (limit + 0.0));

            query = "SELECT time,user,line_1,line_2,line_3,line_4 FROM " + ConfigHandler.prefix + "sign " + Util.getWidIndex("sign") + "WHERE wid = '" + worldId + "' AND x = '" + x + "' AND z = '" + z + "' AND y = '" + y + "' AND action = '1' AND (LENGTH(line_1) > 0 OR LENGTH(line_2) > 0 OR LENGTH(line_3) > 0 OR LENGTH(line_4) > 0) ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            results = statement.executeQuery(query);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java

                if (!found) {
                    result.add(new StringBuilder(Color.WHITE + "----- " + Color.DARK_AQUA + Phrase.build(Phrase.SIGN_HEADER) + Color.WHITE + " ----- " + Util.getCoordinates(command, worldId, x, y, z, false, false) + "").toString());
                }
                found = true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                }

                CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { unixtimestamp, f, type });
                Queue.queueBlockPlace(f, toBlock.getState(), block.getType(), toBlockState, type, -1, 0, blockData.getAsString());
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                }

                CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + wid + "", new Object[] { unixtimestamp, f, type });
                Queue.queueBlockPlace(f, toBlock.getState(), block.getType(), toBlockState, type, -1, 0, blockData.getAsString());
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockUtil.java`
#### Snippet
```java
                    }
                    else {
                        String cords = "" + x + "." + yc + "." + z + "." + wid + "";
                        Object[] data = CacheHandler.lookupCache.get(cords);
                        if (data != null) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockUtil.java`
#### Snippet
```java
                    }
                    else {
                        String cords = "" + x + "." + yc + "." + z + "." + wid + "";
                        Object[] data = CacheHandler.lookupCache.get(cords);
                        if (data != null) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockUtil.java`
#### Snippet
```java
                }
            }
            CacheHandler.lookupCache.put("" + x + "." + block.getY() + "." + z + "." + wid + "", new Object[] { timestamp, player, type });
        }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/listener/block/BlockUtil.java`
#### Snippet
```java
                }
            }
            CacheHandler.lookupCache.put("" + x + "." + block.getY() + "." + z + "." + wid + "", new Object[] { timestamp, player, type });
        }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
                int wid = Util.getWorldId(block.getWorld().getName());
                String token = "" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + wid + "." + type.name() + "";
                CacheHandler.entityCache.put(token, new Object[] { unixtimestamp, entity.getEntityId() });

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
                int wid = Util.getWorldId(block.getWorld().getName());
                String token = "" + block.getX() + "." + block.getY() + "." + block.getZ() + "." + wid + "." + type.name() + "";
                CacheHandler.entityCache.put(token, new Object[] { unixtimestamp, entity.getEntityId() });

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                            for (String value : rollbackusers2) {
                                                if (users.length() == 0) {
                                                    users = "" + value + "";
                                                }
                                                else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                            for (String value : rollbackusers2) {
                                                if (users.length() == 0) {
                                                    users = "" + value + "";
                                                }
                                                else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    String tag = (action != 0 ? Color.GREEN + "+" : Color.RED + "-");
                                                    Chat.sendComponent(player2, timeago + " " + tag + " " + Color.DARK_AQUA + Phrase.build(Phrase.LOOKUP_LOGIN, Color.DARK_AQUA + dplayer + Color.WHITE, (action != 0 ? Selector.FIRST : Selector.SECOND)));
                                                    Chat.sendComponent(player2, Color.WHITE + leftPadding + Color.GREY + "^ " + Util.getCoordinates(command.getName(), wid, x, y, z, true, true) + "");
                                                    PluginChannelListener.getInstance().sendInfoData(player2, Integer.parseInt(time), Phrase.LOOKUP_LOGIN, (action != 0 ? Selector.FIRST : Selector.SECOND), dplayer, -1, x, y, z, wid);
                                                }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

                                                    Chat.sendComponent(player2, timeago + " " + Color.WHITE + "- " + Color.DARK_AQUA + dplayer + ": " + Color.WHITE, message);
                                                    Chat.sendComponent(player2, Color.WHITE + leftPadding + Color.GREY + "^ " + Util.getCoordinates(command.getName(), wid, x, y, z, true, true) + "");
                                                    PluginChannelListener.getInstance().sendMessageData(player2, Integer.parseInt(time), dplayer, message, true, x, y, z, wid);
                                                }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    }
                                                    if (dname.length() > 0 && !isPlayer) {
                                                        dname = "minecraft:" + dname.toLowerCase(Locale.ROOT) + "";
                                                    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            String baseQuery = ((!includeEntity.isEmpty() || !excludeEntity.isEmpty()) ? queryEntity : queryBlock);
            if (limitOffset > -1 && limitCount > -1) {
                queryLimit = " LIMIT " + limitOffset + ", " + limitCount + "";
                unionLimit = " ORDER BY time DESC, id DESC LIMIT " + (limitOffset + limitCount) + "";
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            if (limitOffset > -1 && limitCount > -1) {
                queryLimit = " LIMIT " + limitOffset + ", " + limitCount + "";
                unionLimit = " ORDER BY time DESC, id DESC LIMIT " + (limitOffset + limitCount) + "";
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }

            query = query + queryOrder + queryLimit + "";
            results = statement.executeQuery(query);
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            int worldId = Util.getWorldId(block.getWorld().getName());

            String cords = "" + x + "." + y + "." + z + "." + worldId + "";
            Object[] data = CacheHandler.lookupCache.get(cords);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            int worldId = Util.getWorldId(block.getWorld().getName());

            String cords = "" + x + "." + y + "." + z + "." + worldId + "";
            Object[] data = CacheHandler.lookupCache.get(cords);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                if (result.length() > 0) {
                    Material resultMaterial = Util.getType(resultType);
                    CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + worldId + "", new Object[] { time, result, resultMaterial });
                }
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                if (result.length() > 0) {
                    Material resultMaterial = Util.getType(resultType);
                    CacheHandler.lookupCache.put("" + x + "." + y + "." + z + "." + worldId + "", new Object[] { time, result, resultMaterial });
                }
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                int worldId = Util.getWorldId(block.getWorld().getName());

                String cords = "" + x + "." + y + "." + z + "." + worldId + "";
                Object[] data = CacheHandler.breakCache.get(cords);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                int worldId = Util.getWorldId(block.getWorld().getName());

                String cords = "" + x + "." + y + "." + z + "." + worldId + "";
                Object[] data = CacheHandler.breakCache.get(cords);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            for (String value : checkUsers) {
                if (usersBuilder.length() == 0) {
                    usersBuilder = usersBuilder.append("" + value + "");
                }
                else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            for (String value : checkUsers) {
                if (usersBuilder.length() == 0) {
                    usersBuilder = usersBuilder.append("" + value + "");
                }
                else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (targetCount == 0) {
                        restrictTargets = restrictTargets.append("" + targetName + "");
                    }
                    else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (targetCount == 0) {
                        restrictTargets = restrictTargets.append("" + targetName + "");
                    }
                    else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeTargets = excludeTargets.append("" + targetName + "");
                    }
                    else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeTargets = excludeTargets.append("" + targetName + "");
                    }
                    else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeUsers = excludeUsers.append("" + excludeUser + "");
                    }
                    else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeUsers = excludeUsers.append("" + excludeUser + "");
                    }
                    else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        int entityId = -1;
                                        String entityName = Util.getEntityType(oldTypeRaw).name();
                                        String token = "" + rowX + "." + rowY + "." + rowZ + "." + rowWorldId + "." + entityName + "";
                                        Object[] cachedEntity = CacheHandler.entityCache.get(token);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        int entityId = -1;
                                        String entityName = Util.getEntityType(oldTypeRaw).name();
                                        String token = "" + rowX + "." + rowY + "." + rowZ + "." + rowWorldId + "." + entityName + "";
                                        Object[] cachedEntity = CacheHandler.entityCache.get(token);

```

## ConstantConditions
### ConstantConditions
Condition `!(entity instanceof Player)` is always `false`
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java

        Entity entity = event.getEntity();
        if (!(entity instanceof Player)) {
            return;
        }
```

### ConstantConditions
Condition `entity instanceof Player` is always `true`
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java

        Entity entity = event.getEntity();
        if (!(entity instanceof Player)) {
            return;
        }
```

### ConstantConditions
Condition `items == null` is always `false`
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java
        String user = ((Player) entity).getName();
        List<ItemStack> items = event.getDrops();
        if (items == null || items.size() == 0) {
            return;
        }
```

### ConstantConditions
Condition `entityType != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityInteractListener.java`
#### Snippet
```java
        EntityType entityType = event.getEntityType();
        String user = "#entity";
        if (entityType != null) {
            user = "#" + entityType.name().toLowerCase(Locale.ROOT);
        }
```

### ConstantConditions
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/entity/HangingPlaceListener.java`
#### Snippet
```java

            int inspect = 0;
            if (ConfigHandler.inspecting.get(player.getName()) != null) {
                if (ConfigHandler.inspecting.get(player.getName())) {
                    inspect = 1;
```

### ConstantConditions
Condition `item == null` is always `false`
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
        }

        if (item == null && playerItem == null) {
            return;
        }
```

### ConstantConditions
Condition `item == null && playerItem == null` is always `false`
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
        }

        if (item == null && playerItem == null) {
            return;
        }
```

### ConstantConditions
Condition `inventory == null` is always `false`
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            // Perform standard inventory holder check on primary inventory
            Inventory inventory = event.getInventory();
            if (inventory == null) {
                return;
            }
```

### ConstantConditions
Condition `log` is always `true`
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                }
                */
                if (log) {
                    Queue.queueBlockPlace(player, block.getLocation().getBlock().getState(), block.getType(), block.getState(), newState.getType(), -1, 0, newState.getBlockData().getAsString());
                }
```

### ConstantConditions
Method invocation `getUniqueId` may produce `NullPointerException`
in `src/main/java/net/coreprotect/database/logger/SkullPlaceLogger.java`
#### Snippet
```java
                String skullOwner = "";
                if (skull.hasOwner()) {
                    skullOwner = skull.getOwningPlayer().getUniqueId().toString();
                    SkullStatement.insert(preparedStmt2, time, skullOwner);
                    ResultSet keys = preparedStmt2.getGeneratedKeys();
```

### ConstantConditions
Condition `damager != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
            String user = "#entity";

            if (damager != null) {
                final Entity entity = event.getEntity();
                Location entityLocation = entity.getLocation();
```

### ConstantConditions
Condition `entityType != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                    else if (source instanceof LivingEntity) {
                        EntityType entityType = ((LivingEntity) source).getType();
                        if (entityType != null) { // Check for MyPet plugin
                            String name = entityType.name().toLowerCase(Locale.ROOT);
                            user = "#" + name;
```

### ConstantConditions
Condition `damager.getType() != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                    user = "#wither";
                }
                else if (damager.getType() != null) {
                    user = "#" + damager.getType().name().toLowerCase(Locale.ROOT);
                }
```

### ConstantConditions
Condition `entity != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                            ItemStack[] contents = Util.getContainerContents(Material.ARMOR_STAND, entity, block.getLocation());
                            Bukkit.getScheduler().runTask(CoreProtect.getInstance(), () -> {
                                if (entity != null && entity.isDead()) {
                                    entityLocation.setY(entityLocation.getY() + 0.99);
                                    Database.containerBreakCheck(killer, Material.ARMOR_STAND, entity, contents, block.getLocation());
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }
                else {
                    phrase = Phrase.LOOKUP_BLOCK; // {placed|broke}
                    selector = (resultAction != 0 ? Selector.FIRST : Selector.SECOND);
                    tag = (resultAction != 0 ? Color.GREEN + "+" : Color.RED + "-");
```

### ConstantConditions
Condition `message == null` is always `false`
in `src/main/java/net/coreprotect/listener/player/PlayerChatListener.java`
#### Snippet
```java
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        if (message == null) {
            return;
        }
```

### ConstantConditions
Method invocation `getWorld` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java

                Location destinationLocation = destinationHolder.getInventory().getLocation();
                List<Object> list = ConfigHandler.transactingChest.get(destinationLocation.getWorld().getUID().toString() + "." + destinationLocation.getBlockX() + "." + destinationLocation.getBlockY() + "." + destinationLocation.getBlockZ());
                if (list != null) {
                    list.add(new ItemStack[] { null, movedItem });
```

### ConstantConditions
Value `connection` is always 'null'
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        try {
            if (!force && (ConfigHandler.converterRunning || ConfigHandler.purgeRunning)) {
                return connection;
            }
            if (Config.getGlobal().MYSQL) {
```

### ConstantConditions
Value `connection` is always 'null'
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java

                    if (pauseTime >= waitTime) {
                        return connection;
                    }
                }
```

### ConstantConditions
Condition `remover.getType() != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
                    logDrops = player.getGameMode() != GameMode.CREATIVE;
                }
                else if (remover.getType() != null) {
                    culprit = "#" + remover.getType().name().toLowerCase(Locale.ROOT);
                }
```

### ConstantConditions
Condition `block == null` is always `false`
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java
        if (!event.isCancelled() && Config.getConfig(world).BLOCK_IGNITE) {
            Block block = event.getBlock();
            if (block == null) {
                return;
            }
```

### ConstantConditions
Dereference of `event_blocks` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java
            List<Block> blocks = new ArrayList<>();

            for (Block block : event_blocks) {
                Block block_relative = block.getRelative(event.getDirection());
                nblocks.add(block_relative);
```

### ConstantConditions
Condition `item != null` is always `true`
in `src/main/java/net/coreprotect/listener/block/BlockDispenseListener.java`
#### Snippet
```java
            BlockData blockData = block.getBlockData();
            ItemStack item = event.getItem();
            if (item != null && blockData instanceof Dispenser) {
                Dispenser dispenser = (Dispenser) blockData;
                Material material = item.getType();
```

### ConstantConditions
Condition `!supportedActions.contains(action)` is always `true`
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
        }
        for (int action : argAction) {
            if (!supportedActions.contains(action)) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.ACTION_NOT_SUPPORTED));
                // Functions.sendMessage(player, new ChatMessage("Please specify a valid purge action.").build());
```

### ConstantConditions
Result of `supportedActions.contains(action)` is always 'false'
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
        }
        for (int action : argAction) {
            if (!supportedActions.contains(action)) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.ACTION_NOT_SUPPORTED));
                // Functions.sendMessage(player, new ChatMessage("Please specify a valid purge action.").build());
```

### ConstantConditions
Condition `args.length > 1` is always `true`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            return StringUtil.copyPartialMatches(argument, completions, new ArrayList<>(completions.size()));
        }
        else if (args.length > 1) {
            String argument0 = args[0].toLowerCase(Locale.ROOT);
            String argument1 = args[1].toLowerCase(Locale.ROOT);
```

### ConstantConditions
Condition `arg.length() == 0` is always `true`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                            completions.set(index, filter + arg + completions.get(index));
                        }
                        if (arg.length() == 0) {
                            completions.remove(0);
                        }
```

### ConstantConditions
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        String line3 = event.getLine(2);
        String line4 = event.getLine(3);
        int color = (blockState instanceof Sign) ? ((Sign) blockState).getColor().getColor().asRGB() : 0;
        boolean isGlowing = (blockState instanceof Sign) ? BukkitAdapter.ADAPTER.isGlowing((Sign) blockState) : false;

```

### ConstantConditions
Method invocation `getType` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/CraftItemListener.java`
#### Snippet
```java
        }

        if ((event.getClick() == ClickType.DROP || event.getClick() == ClickType.CONTROL_DROP) && event.getCursor().getType() != Material.AIR) {
            return;
        }
```

### ConstantConditions
Method invocation `getBlockHeight` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                    String name = Util.getArtName(rowData);
                    Art painting = Art.getByName(name.toUpperCase(Locale.ROOT));
                    int height = painting.getBlockHeight();
                    int width = painting.getBlockWidth();
                    int paintingX = x;
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/patch/script/__2_20_0.java`
#### Snippet
```java
                        break;
                    default:
                        entityType = EntityType.PIG;
                        break;
                }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        if (blockReplaced != null) {
            replaceType = blockReplaced.getType();
            replaceData = 0;

            if ((replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(Material.SUNFLOWER) || replaceType.equals(Material.LILAC) || replaceType.equals(Material.TALL_GRASS) || replaceType.equals(Material.LARGE_FERN) || replaceType.equals(Material.ROSE_BUSH) || replaceType.equals(Material.PEONY)) && replaceData >= 8) { // Double plant top half
```

### ConstantConditions
Condition `(replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(M...` is always `false`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            replaceData = 0;

            if ((replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(Material.SUNFLOWER) || replaceType.equals(Material.LILAC) || replaceType.equals(Material.TALL_GRASS) || replaceType.equals(Material.LARGE_FERN) || replaceType.equals(Material.ROSE_BUSH) || replaceType.equals(Material.PEONY)) && replaceData >= 8) { // Double plant top half
                BlockState blockBelow = blockReplaced.getWorld().getBlockAt(blockReplaced.getX(), blockReplaced.getY() - 1, blockReplaced.getZ()).getState();
                Material belowType = blockBelow.getType();
```

### ConstantConditions
Condition `replaceData >= 8` is always `false` when reached
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            replaceData = 0;

            if ((replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(Material.SUNFLOWER) || replaceType.equals(Material.LILAC) || replaceType.equals(Material.TALL_GRASS) || replaceType.equals(Material.LARGE_FERN) || replaceType.equals(Material.ROSE_BUSH) || replaceType.equals(Material.PEONY)) && replaceData >= 8) { // Double plant top half
                BlockState blockBelow = blockReplaced.getWorld().getBlockAt(blockReplaced.getX(), blockReplaced.getY() - 1, blockReplaced.getZ()).getState();
                Material belowType = blockBelow.getType();
```

### ConstantConditions
Argument `sign.getColor()` might be null
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java
    @Override
    public void sendSignChange(Player player, Sign sign) {
        player.sendSignChange(sign.getLocation(), sign.getLines(), sign.getColor());
    }

```

### ConstantConditions
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            Material material = Util.getType(type);
            if (material == null) {
                return result;
            }

```

### ConstantConditions
Method invocation `getAsString` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }

            if (material.isBlock() && !createBlockData(material).getAsString().equals(string) && string.startsWith(NAMESPACE + material.name().toLowerCase(Locale.ROOT) + "[") && string.endsWith("]")) {
                String substring = string.substring(material.name().length() + 11, string.length() - 1);
                String[] blockDataSplit = substring.split(",");
```

### ConstantConditions
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                else {
                    return result;
                }
            }
```

### ConstantConditions
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            else {
                return result;
            }

```

### ConstantConditions
Dereference of `contents` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                if (type == Material.ARMOR_STAND || type == Material.ITEM_FRAME) {
                    boolean hasItem = false;
                    for (ItemStack item : contents) {
                        if (item != null && !item.getType().equals(Material.AIR)) {
                            hasItem = true;
```

### ConstantConditions
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        byte[] result = null;
        if (data == null) {
            return result;
        }

```

### ConstantConditions
Argument `CoreProtect.getInstance().getClass().getResourceAsStream("/plugin.yml")` might be null
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        String branch = "";
        try {
            InputStreamReader reader = new InputStreamReader(CoreProtect.getInstance().getClass().getResourceAsStream("/plugin.yml"));
            branch = YamlConfiguration.loadConfiguration(reader).getString("branch");
            reader.close();
```

### ConstantConditions
Value `update` is always 'false'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        if (!update) {
            setTypeAndData(block, type, blockData, update);
            map.remove(block);
        }
```

### ConstantConditions
Method invocation `getDescription` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        try {
            boolean validVersion = true;
            String version = Bukkit.getServer().getPluginManager().getPlugin("WorldEdit").getDescription().getVersion();
            if (version.contains(";") || version.contains("+")) {
                if (version.contains("-beta-")) {
```

### ConstantConditions
Method invocation `getDescription` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                Plugin fawe = Bukkit.getServer().getPluginManager().getPlugin("FastAsyncWorldEdit");
                if (fawe != null) {
                    String apiVersion = Bukkit.getServer().getPluginManager().getPlugin("WorldEdit").getDescription().getAPIVersion();
                    String faweVersion = fawe.getDescription().getVersion();
                    double apiDouble = Double.parseDouble(apiVersion);
```

### ConstantConditions
Argument `apiVersion` might be null
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    String apiVersion = Bukkit.getServer().getPluginManager().getPlugin("WorldEdit").getDescription().getAPIVersion();
                    String faweVersion = fawe.getDescription().getVersion();
                    double apiDouble = Double.parseDouble(apiVersion);
                    double faweDouble = Double.parseDouble(faweVersion);
                    if (apiDouble >= 1.13 && faweDouble >= 1.0) {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Condition `resultc > -1` is always `true`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
        if (commandName.equals("core") || commandName.equals("coreprotect") || commandName.equals("co")) {
            int resultc = argumentArray.length;
            if (resultc > -1) {
                String corecommand = "help";
                if (resultc > 0) {
```

### ConstantConditions
Condition `!permission` is always `true`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                boolean permission = false;
                if (!permission) {
                    if (user.hasPermission("coreprotect.rollback") && (corecommand.equals("rollback") || corecommand.equals("rb") || corecommand.equals("ro") || corecommand.equals("apply") || corecommand.equals("cancel"))) {
                        permission = true;
```

### ConstantConditions
Value `permission` is always 'false'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                boolean permission = false;
                if (!permission) {
                    if (user.hasPermission("coreprotect.rollback") && (corecommand.equals("rollback") || corecommand.equals("rb") || corecommand.equals("ro") || corecommand.equals("apply") || corecommand.equals("cancel"))) {
                        permission = true;
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else {
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                if (next == 2) {
                    if (argument.endsWith(",")) {
                        next = 2;
                    }
                    else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (argument.contains(":")) {
                    next = 0;
                }
                else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else {
                    parseUser(users, argument);
                    next = 0;
                }
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                    }
                    levelled.setLevel(waterLevel);
                    blockData = levelled;
                }

```

### ConstantConditions
Condition `type.equals(Material.LAVA)` is always `true`
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                    f = "#water";
                }
                else if (type.equals(Material.LAVA)) {
                    f = "#lava";
                }
```

### ConstantConditions
Method invocation `getWorld` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
        /* Logging for players punching out fire blocks. */
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            World world = event.getClickedBlock().getWorld();
            if (event.useInteractedBlock() != Event.Result.DENY && Config.getConfig(world).BLOCK_BREAK) {
                Block relativeBlock = event.getClickedBlock().getRelative(event.getBlockFace());
```

### ConstantConditions
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        ItemStack mainHand = player.getInventory().getItemInMainHand();
                        if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null) {
                            handType = mainHand.getType();
                        }
```

### ConstantConditions
Condition `mainHand != null` is always `true` when reached
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        ItemStack mainHand = player.getInventory().getItemInMainHand();
                        if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null) {
                            handType = mainHand.getType();
                        }
```

### ConstantConditions
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int oldColor = sign.getColor().getColor().asRGB();
                            int newColor = oldColor;
                            boolean oldGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
```

### ConstantConditions
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                    }
                    else if (BlockGroup.INTERACT_BLOCKS.contains(type)) {
                        if (event.getHand().equals(EquipmentSlot.HAND) && Config.getConfig(world).PLAYER_INTERACTIONS) {
                            Block interactBlock = event.getClickedBlock();
                            if (BlockGroup.DOORS.contains(type)) {
```

### ConstantConditions
Method invocation `getY` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Block interactBlock = event.getClickedBlock();
                            if (BlockGroup.DOORS.contains(type)) {
                                int y = interactBlock.getY() - 1;
                                Block blockUnder = interactBlock.getWorld().getBlockAt(interactBlock.getX(), y, interactBlock.getZ());

```

### ConstantConditions
Method invocation `getState` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            }

                            Queue.queuePlayerInteraction(player.getName(), interactBlock.getState(), type);
                        }
                    }
```

### ConstantConditions
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Material handType = null;
                            ItemStack mainHand = player.getInventory().getItemInMainHand();
                            if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null) {
                                handType = mainHand.getType();
                            }
```

### ConstantConditions
Condition `mainHand != null` is always `true` when reached
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Material handType = null;
                            ItemStack mainHand = player.getInventory().getItemInMainHand();
                            if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null) {
                                handType = mainHand.getType();
                            }
```

### ConstantConditions
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                ItemStack offHand = player.getInventory().getItemInOffHand();

                if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null && entityBlockTypes.contains(mainHand.getType())) {
                    handItem = mainHand;
                }
```

### ConstantConditions
Condition `mainHand != null` is always `true`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                ItemStack offHand = player.getInventory().getItemInOffHand();

                if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null && entityBlockTypes.contains(mainHand.getType())) {
                    handItem = mainHand;
                }
```

### ConstantConditions
Condition `offHand != null` is always `true`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                    handItem = mainHand;
                }
                else if (event.getHand().equals(EquipmentSlot.OFF_HAND) && offHand != null && entityBlockTypes.contains(offHand.getType())) {
                    handItem = offHand;
                }
```

### ConstantConditions
Method invocation `getState` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            BlockState checkBlock = event.getClickedBlock().getState();
            int x = checkBlock.getX();
            int y = checkBlock.getY();
```

### ConstantConditions
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        long timeSince = systemTime - lastTime;
                        if (timeSince < 50 && !eventHand.equals(lastHand)) {
                            performLookup = false;
                        }
```

### ConstantConditions
Method invocation `getType` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        if (event.hasItem()) {
                            Material eventItem = event.getItem().getType();
                            if (eventItem.isBlock() && (eventItem.createBlockData() instanceof Bisected)) {
                                int x = finalBlock.getX();
```

### ConstantConditions
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int color = sign.getColor().getColor().asRGB();
                            boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                            if (line1.length() > 0 || line2.length() > 0 || line3.length() > 0 || line4.length() > 0) {
```

### ConstantConditions
Method invocation `entries` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

            if (itemMeta.hasAttributeModifiers()) {
                for (Map.Entry<Attribute, AttributeModifier> entry : itemMeta.getAttributeModifiers().entries()) {
                    Map<Attribute, Map<String, Object>> attributeList = new HashMap<>();
                    Attribute attribute = entry.getKey();
```

### ConstantConditions
Method invocation `serialize` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

                if (subMeta.hasColor()) {
                    list.add(subMeta.getColor().serialize());
                }
                metadata.add(list);
```

### ConstantConditions
Argument `effect` might be null
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
                if (subMeta.hasEffect()) {
                    FireworkEffect effect = subMeta.getEffect();
                    deserializeFireworkEffect(effect, metadata);
                }
            }
```

### ConstantConditions
Method invocation `serialize` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
                if (subMeta.hasColor()) {
                    list = new ArrayList<>();
                    list.add(subMeta.getColor().serialize());
                    metadata.add(list);
                }
```

### ConstantConditions
Method invocation `replaceAll` may produce `NullPointerException`
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        }

        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");
```

### ConstantConditions
Method invocation `replaceAll` may produce `NullPointerException`
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");

        if ((x.length() == 0 || x.length() >= 12 || x.equals(xValidate)) || (y.length() == 0 || y.length() >= 12 || y.equals(yValidate)) || (z.length() == 0 || z.length() >= 12 || z.equals(zValidate))) {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/patch/script/__2_19_0.java`
#### Snippet
```java
            for (Integer id : signList) {
                if (signData.length() == 0) {
                    signData = signData.append(id);
                }
                else {
```

### ConstantConditions
Condition `offlinePlayer != null` is always `true`
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                                if (owner == null) {
                                    OfflinePlayer offlinePlayer = Bukkit.getServer().getOfflinePlayer(set);
                                    if (offlinePlayer != null) {
                                        tameable.setOwner(offlinePlayer);
                                    }
```

### ConstantConditions
Condition `scanMin == 4` is always `false`
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                            log = false;
                        }
                        else if (scanMin == 4 && !BlockGroup.TRACK_TOP.contains(scanType)) {
                            // checking block below for door
                            log = false;
```

### ConstantConditions
Condition `scanMin == 4 && !BlockGroup.TRACK_TOP.contains(scanType)` is always `false`
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                            log = false;
                        }
                        else if (scanMin == 4 && !BlockGroup.TRACK_TOP.contains(scanType)) {
                            // checking block below for door
                            log = false;
```

### ConstantConditions
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                        String line3 = sign.getLine(2);
                        String line4 = sign.getLine(3);
                        int color = sign.getColor().getColor().asRGB();
                        boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                        Queue.queueSignText(user, location, 0, color, isGlowing, line1, line2, line3, line4, 5);
```

### ConstantConditions
Condition `handItem != null` is always `true` when reached
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                if (player != null && Util.iceBreakCheck(blockState, user, blockType)) {
                    ItemStack handItem = player.getInventory().getItemInMainHand();
                    if (!(player.getGameMode().equals(GameMode.CREATIVE)) && !(handItem != null && handItem.containsEnchantment(Enchantment.SILK_TOUCH))) {
                        Queue.queueBlockPlaceValidate(user, blockState, blockLog, null, Material.WATER, -1, 0, null, 0);
                    }
```

### ConstantConditions
Method invocation `isBlock` may produce `NullPointerException`
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                            }

                            if (blockBlockData == null && validatedMaterial.isBlock()) {
                                BlockData newBlockData = null;
                                try {
```

### ConstantConditions
Method invocation `getUniqueId` may produce `NullPointerException`
in `src/main/java/net/coreprotect/database/logger/SkullBreakLogger.java`
#### Snippet
```java
            int skullKey = 0;
            if (skull.hasOwner()) {
                skullOwner = skull.getOwningPlayer().getUniqueId().toString();
                SkullStatement.insert(preparedStmt2, time, skullOwner);
                ResultSet keys = preparedStmt2.getGeneratedKeys();
```

### ConstantConditions
Dereference of `configFolder.listFiles((File file) -> file.getName().endsWith(".yml"))` may produce `NullPointerException`
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
        }

        for (final File worldConfigFile : configFolder.listFiles((File file) -> file.getName().endsWith(".yml"))) {
            final String name = worldConfigFile.getName();
            if (name.equals(ConfigFile.CONFIG) || name.equals(ConfigFile.LANGUAGE)) {
```

### ConstantConditions
Method invocation `getString` may produce `NullPointerException`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                    if (Config.getConfig(location.getWorld()).SIGN_TEXT && Tag.SIGNS.isTagged(oldType)) {
                        CompoundTag compoundTag = baseBlock.getNbtData();
                        String line1 = getSignText(compoundTag.getString("Text1"));
                        String line2 = getSignText(compoundTag.getString("Text2"));
                        String line3 = getSignText(compoundTag.getString("Text3"));
```

### ConstantConditions
Condition `newType.equals(Material.AIR) || newType.equals(Material.CAVE_AIR)` is always `true` when reached
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, newType, newBlockExtraData, 0, newBlockDataString);
            }
            else if ((!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)) && (newType.equals(Material.AIR) || newType.equals(Material.CAVE_AIR))) {
                // removed a block
                Queue.queueBlockBreak(actor.getName(), oldBlock, oldBlock.getType(), oldBlockDataString, null, oldBlockExtraData, 0);
```

### ConstantConditions
Condition `newType.equals(Material.CAVE_AIR)` is always `true` when reached
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, newType, newBlockExtraData, 0, newBlockDataString);
            }
            else if ((!oldType.equals(Material.AIR) && !oldType.equals(Material.CAVE_AIR)) && (newType.equals(Material.AIR) || newType.equals(Material.CAVE_AIR))) {
                // removed a block
                Queue.queueBlockBreak(actor.getName(), oldBlock, oldBlock.getType(), oldBlockDataString, null, oldBlockExtraData, 0);
```

### ConstantConditions
Method invocation `getValue` may produce `NullPointerException`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
        String mobType = null;
        try {
            CompoundTag compoundTag = NBTUtils.getChildTag(fullBlock.getNbtData().getValue(), "SpawnData", CompoundTag.class);
            mobType = compoundTag.getString("id").toUpperCase(Locale.ROOT);
            if (mobType.contains("MINECRAFT:")) {
```

### ConstantConditions
Condition `treeType == null` is always `false`
in `src/main/java/net/coreprotect/listener/world/StructureGrowListener.java`
#### Snippet
```java

        // Skip logging for bad event calls
        if (treeType == null || event.isFromBonemeal()) {
            return;
        }
```

### ConstantConditions
Method invocation `setExecutor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                Consumer.initialize(); // Prepare consumer (keep this here)
                new ListenerHandler(this);
                getCommand("coreprotect").setExecutor(CommandHandler.getInstance());
                getCommand("coreprotect").setTabCompleter(new TabHandler());
                getCommand("core").setExecutor(CommandHandler.getInstance());
```

### ConstantConditions
Method invocation `setTabCompleter` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                new ListenerHandler(this);
                getCommand("coreprotect").setExecutor(CommandHandler.getInstance());
                getCommand("coreprotect").setTabCompleter(new TabHandler());
                getCommand("core").setExecutor(CommandHandler.getInstance());
                getCommand("core").setTabCompleter(new TabHandler());
```

### ConstantConditions
Method invocation `setExecutor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                getCommand("coreprotect").setExecutor(CommandHandler.getInstance());
                getCommand("coreprotect").setTabCompleter(new TabHandler());
                getCommand("core").setExecutor(CommandHandler.getInstance());
                getCommand("core").setTabCompleter(new TabHandler());
                getCommand("co").setExecutor(CommandHandler.getInstance());
```

### ConstantConditions
Method invocation `setTabCompleter` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                getCommand("coreprotect").setTabCompleter(new TabHandler());
                getCommand("core").setExecutor(CommandHandler.getInstance());
                getCommand("core").setTabCompleter(new TabHandler());
                getCommand("co").setExecutor(CommandHandler.getInstance());
                getCommand("co").setTabCompleter(new TabHandler());
```

### ConstantConditions
Method invocation `setExecutor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                getCommand("core").setExecutor(CommandHandler.getInstance());
                getCommand("core").setTabCompleter(new TabHandler());
                getCommand("co").setExecutor(CommandHandler.getInstance());
                getCommand("co").setTabCompleter(new TabHandler());

```

### ConstantConditions
Method invocation `setTabCompleter` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                getCommand("core").setTabCompleter(new TabHandler());
                getCommand("co").setExecutor(CommandHandler.getInstance());
                getCommand("co").setTabCompleter(new TabHandler());

                boolean exists = (new File(ConfigHandler.path)).exists();
```

### ConstantConditions
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                    String line3 = sign.getLine(2);
                    String line4 = sign.getLine(3);
                    int color = sign.getColor().getColor().asRGB();
                    boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                    Queue.queueSignText(user, location, 0, color, isGlowing, line1, line2, line3, line4, 5);
```

### ConstantConditions
Condition `argExclude == null` is always `false`
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
        String corecommand = args[0].toLowerCase(Locale.ROOT);

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantConditions
Condition `argExcludeUsers == null` is always `false`
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
        String corecommand = args[0].toLowerCase(Locale.ROOT);

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantConditions
Condition `argUsers.size() == 0` is always `true` when reached
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### ConstantConditions
Condition `argUsers.size() == 0 && argRadius == null` is always `false` when reached
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                if (argAction.size() > 0) {
                    if (argAction.contains(4)) {
                        if (argUsers.contains("#global") || (argUsers.size() == 0 && argRadius == null)) {
                            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ACTION_USER));
                            return;
```

### ConstantConditions
Condition `argRadius == null` is always `false` when reached
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                if (argAction.size() > 0) {
                    if (argAction.contains(4)) {
                        if (argUsers.contains("#global") || (argUsers.size() == 0 && argRadius == null)) {
                            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ACTION_USER));
                            return;
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
    protected static void runCommand(CommandSender player, Command command, boolean permission, String[] args) {
        int resultc = args.length;
        args = CommandHandler.parsePage(args);
        Location lo = CommandHandler.parseLocation(player, args);
        // List<String> arg_uuids = new ArrayList<String>();
```

### ConstantConditions
Condition `argExclude == null` is always `false`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        boolean pageLookup = false;

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantConditions
Condition `argExcludeUsers == null` is always `false`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        boolean pageLookup = false;

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantConditions
Condition `worldedit` is always `false` when reached
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }
        if (argAction.contains(6) || argAction.contains(7) || argAction.contains(8) || argAction.contains(9) || argAction.contains(10)) {
            if (argAction.contains(9) && (argRadius != null || argWid > 0 || worldedit)) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INCOMPATIBLE_ACTION, "r:"));
                return;
```

### ConstantConditions
Condition `type == 4` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }

        if (startTime <= 0 && !pageLookup && type == 4 && (argBlocks.size() > 0 || argUsers.size() > 0)) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_TIME, Selector.FIRST));
            return;
```

### ConstantConditions
Condition `resultc > 1` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                re = parseRows;
            }
            if (resultc > 1) {
                String pages = args[1];
                if (pages.contains(":")) {
```

### ConstantConditions
Condition `resultc > 1` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                re = parseRows;
            }
            if (resultc > 1) {
                String pages = args[1];
                if (pages.contains(":")) {
```

### ConstantConditions
Method invocation `getBlockAt` may produce `NullPointerException`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

            String world = Util.getWorldName(wid);
            final Block fblock = Bukkit.getServer().getWorld(world).getBlockAt(x, y, z);// .getLocation();
            final BlockState fblockstate = fblock.getState();
            final CommandSender player2 = player;
```

### ConstantConditions
Condition `resultc > 1` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }
            if (type == 5) {
                if (resultc > 1) {
                    String pages = args[1];
                    if (pages.contains(":")) {
```

### ConstantConditions
Condition `argUsers.size() == 0` is always `true` when reached
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (pageLookup || argBlocks.size() > 0 || argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### ConstantConditions
Condition `argBlocks.size() == 0` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            else {
                // Functions.sendMessage(player, ChatColors.RED + "You did not specify a lookup radius.");
                if (argUsers.size() == 0 && argBlocks.size() == 0 && (argWid > 0 || forceglobal)) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.FIRST));
                    return;
```

### ConstantConditions
Condition `argBlocks.size() == 0` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    return;
                }
                else if (argUsers.size() == 0 && argBlocks.size() == 0 && argRadius == null) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.SECOND));
                    return;
```

### ConstantConditions
Condition `argRadius == null` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    return;
                }
                else if (argUsers.size() == 0 && argBlocks.size() == 0 && argRadius == null) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_USER, Selector.SECOND));
                    return;
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                        }
                                                        else {
                                                            phrase = Phrase.LOOKUP_BLOCK; // {placed|broke}
                                                            selector = (daction != 0 ? Selector.FIRST : Selector.SECOND);
                                                            tag = (daction != 0 ? Color.GREEN + "+" : Color.RED + "-");
```

### ConstantConditions
Condition `entityType != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                else if (shooter instanceof LivingEntity) {
                    EntityType entityType = ((LivingEntity) shooter).getType();
                    if (entityType != null) { // Check for MyPet plugin
                        String name = entityType.name().toLowerCase(Locale.ROOT);
                        e = "#" + name;
```

### ConstantConditions
Condition `entityType != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                else if (shooter instanceof LivingEntity) {
                    EntityType entityType = ((LivingEntity) shooter).getType();
                    if (entityType != null) { // Check for MyPet plugin
                        String name = entityType.name().toLowerCase(Locale.ROOT);
                        e = "#" + name;
```

### ConstantConditions
Condition `attacker.getType().name() != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                }
            }
            else if (attacker.getType().name() != null) {
                e = "#" + attacker.getType().name().toLowerCase(Locale.ROOT);
            }
```

### ConstantConditions
Condition `entity_type.name() != null` is always `true` when reached
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            // assume killed self
            if (!skip) {
                if (!(entity instanceof Player) && entity_type.name() != null) {
                    // Player player = (Player)entity;
                    // e = player.getName();
```

### ConstantConditions
Condition `entity instanceof Player` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                    e = "#" + entity_type.name().toLowerCase(Locale.ROOT);
                }
                else if (entity instanceof Player) {
                    e = entity.getName();
                }
```

### ConstantConditions
Condition `entity instanceof Attributable` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }

            if (entity instanceof Attributable) {
                Attributable attributable = entity;

```

### ConstantConditions
Method invocation `getAsString` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                try {
                    info.add(enderman.getCarriedBlock().getAsString());
                }
                catch (Exception endermanException) {
```

### ConstantConditions
Condition `entity == null` is always `false`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
    public void onEntityDeath(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity == null) {
            return;
        }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

                if (location == null) {
                    restrictWorld = false;
                }

```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        int userId = ConfigHandler.playerIdCache.get(checkUser.toLowerCase(Locale.ROOT));
                        if (checkUserText.length() == 0) {
                            checkUserText = checkUserText.append(userId);
                        }
                        else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        targetName = ((Material) restrictTarget).name();
                        if (includeListMaterial.length() == 0) {
                            includeListMaterial = includeListMaterial.append(Util.getBlockId(targetName, false));
                        }
                        else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        targetName = ((EntityType) restrictTarget).name();
                        if (includeListEntity.length() == 0) {
                            includeListEntity = includeListEntity.append(Util.getEntityId(targetName, false));
                        }
                        else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        targetName = ((Material) restrictTarget).name();
                        if (excludeListMaterial.length() == 0) {
                            excludeListMaterial = excludeListMaterial.append(Util.getBlockId(targetName, false));
                        }
                        else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        targetName = ((EntityType) restrictTarget).name();
                        if (excludeListEntity.length() == 0) {
                            excludeListEntity = excludeListEntity.append(Util.getEntityId(targetName, false));
                        }
                        else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    int userId = ConfigHandler.playerIdCache.get(excludeTarget.toLowerCase(Locale.ROOT));
                    if (excludeUserText.length() == 0) {
                        excludeUserText = excludeUserText.append(userId);
                    }
                    else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            if ((lookup && actionList.size() == 0) || (actionList.contains(11) && actionList.size() == 1)) {
                StringBuilder actionText = new StringBuilder();
                actionText = actionText.append(ItemLogger.ITEM_BREAK);
                actionText.append(",").append(ItemLogger.ITEM_DESTROY);
                actionText.append(",").append(ItemLogger.ITEM_CREATE);
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                        if (actionText.length() == 0) {
                            actionText = actionText.append(actionTarget);
                        }
                        else {
```

### ConstantConditions
Casting `map[i]` to `byte[]` will produce `ClassCastException` for any non-null value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    }
                    else if (i == 13 && map[i] instanceof Byte[]) {
                        results[newId] = Util.byteDataToString((byte[]) map[i], (int) map[6]);
                    }
                    else if (i > 0) { // skip rowid
```

### ConstantConditions
Value `resultBlockData` is always 'null'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    if (valid) {
                        if (hasTbl) {
                            Object[] dataArray = new Object[] { resultId, resultTime, resultUserId, resultX, resultY, resultZ, resultType, resultData, resultAction, resultRolledBack, resultWorldId, resultAmount, resultMeta, resultBlockData, resultTable };
                            list.add(dataArray);
                        }
```

### ConstantConditions
Method invocation `entries` may produce `NullPointerException`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    ItemMeta itemMeta = itemstack.getItemMeta();
                    if (itemMeta.hasAttributeModifiers()) {
                        for (Map.Entry<Attribute, AttributeModifier> entry : itemMeta.getAttributeModifiers().entries()) {
                            itemMeta.removeAttributeModifier(entry.getKey(), entry.getValue());
                        }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            for (String value : checkUsers) {
                if (usersBuilder.length() == 0) {
                    usersBuilder = usersBuilder.append("" + value + "");
                }
                else {
```

### ConstantConditions
Value `item` is always 'true'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    if (restrictTarget instanceof Material) {
                        targetName = ((Material) restrictTarget).name().toLowerCase(Locale.ROOT);
                        item = (!item ? !(((Material) restrictTarget).isBlock()) : item);
                        material = true;
                    }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (targetCount == 0) {
                        restrictTargets = restrictTargets.append("" + targetName + "");
                    }
                    else {
```

### ConstantConditions
Value `item` is always 'true'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    if (excludeTarget instanceof Material) {
                        targetName = ((Material) excludeTarget).name().toLowerCase(Locale.ROOT);
                        item = (!item ? !(((Material) excludeTarget).isBlock()) : item);
                        material = true;
                    }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeTargets = excludeTargets.append("" + targetName + "");
                    }
                    else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeUsers = excludeUsers.append("" + excludeUser + "");
                    }
                    else {
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            Integer modifyCount = 0;
            if (actionList.contains(5)) {
                modifiedData = modifiedData.append(Phrase.build(Phrase.AMOUNT_ITEM, NumberFormat.getInstance().format(blockCount), (blockCount == 1 ? Selector.FIRST : Selector.SECOND)));
                modifyCount++;
            }
```

### ConstantConditions
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            else {
                if (itemCount > 0 || actionList.contains(4)) {
                    modifiedData = modifiedData.append(Phrase.build(Phrase.AMOUNT_ITEM, NumberFormat.getInstance().format(itemCount), (itemCount == 1 ? Selector.FIRST : Selector.SECOND)));
                    modifyCount++;
                }
```

### ConstantConditions
Condition `chunkCount == 1` is always `false`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                }
                else if (chunkCount > 1) {
                    modifiedDataVerbose.append(Phrase.build(Phrase.AMOUNT_CHUNK, NumberFormat.getInstance().format(chunkCount), (chunkCount == 1 ? Selector.FIRST : Selector.SECOND)));
                }
            }
```

### ConstantConditions
Method invocation `setArms` may produce `NullPointerException`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    else {
                        ArmorStand armorStand = (ArmorStand) equipment.getHolder();
                        armorStand.setArms(true);
                        switch (slot) {
                            case 4:
```

### ConstantConditions
Condition `offhand == null` is always `false`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                PlayerInventory playerInventory = (PlayerInventory) inventory;
                                ItemStack offhand = playerInventory.getItemInOffHand();
                                if (offhand == null || offhand.getType() == Material.AIR || (itemstack.isSimilar(offhand) && offhand.getAmount() < offhand.getMaxStackSize())) {
                                    ItemStack setOffhand = itemstack.clone();
                                    if (itemstack.isSimilar(offhand)) {
```

### ConstantConditions
Condition `lookupList == null` is always `false`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            }

            if (lookupList == null) {
                return null;
            }
```

## BoundedWildcard
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java

    // this function will close in
    public static void load(final InputStream in, final Map<String, String> config, boolean forceCase) throws IOException {
        try (final InputStream in0 = in) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java

    // this function will close in
    public static void load(final InputStream in, final Map<String, String> config, boolean forceCase) throws IOException {
        try (final InputStream in0 = in) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
```

### BoundedWildcard
Can generalize to `? super List`>
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java

    @Override
    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot) {
        if (itemMeta instanceof SuspiciousStewMeta) {
            SuspiciousStewMeta meta = (SuspiciousStewMeta) itemMeta;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java

    @Override
    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map) {
        if ((rowType == Material.SUSPICIOUS_STEW)) {
            for (Map<String, Object> suspiciousStewData : map) {
```

### BoundedWildcard
Can generalize to `? super Block`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    }

    public static void prepareTypeAndData(Map<Block, BlockData> map, Block block, Material type, BlockData blockData, boolean update) {
        if (blockData == null) {
            blockData = createBlockData(type);
```

### BoundedWildcard
Can generalize to `? super BlockData`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    }

    public static void prepareTypeAndData(Map<Block, BlockData> map, Block block, Material type, BlockData blockData, boolean update) {
        if (blockData == null) {
            blockData = createBlockData(type);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java

    @Override
    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map) {
        if ((rowType == Material.BUNDLE)) {
            BundleMeta meta = (BundleMeta) itemstack.getItemMeta();
```

### BoundedWildcard
Can generalize to `? super List`>
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java

    @Override
    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot) {
        if (itemMeta instanceof BundleMeta) {
            BundleMeta meta = (BundleMeta) itemMeta;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
    }

    private static void validUserCheck(List<String> users, String user) {
        List<String> badUsers = Arrays.asList("n", "noisy", "v", "verbose", "#v", "#verbose", "#silent", "#preview", "#preview_cancel", "#count", "#sum");
        String check = user.replaceAll("[\\s'\"]", "");
```

### BoundedWildcard
Can generalize to `? super List`>
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
    }

    private static void deserializeFireworkEffect(FireworkEffect effect, List<List<Map<String, Object>>> metadata) {
        List<Map<String, Object>> colorList = new ArrayList<>();
        List<Map<String, Object>> fadeList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Block`
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
public final class BlockExplodeListener extends Queue implements Listener {

    public static void processBlockExplode(String user, World world, List<Block> blockList) {
        HashMap<Location, Block> blockMap = new HashMap<>();

```

## MissortedModifiers
### MissortedModifiers
Missorted modifiers `final public static`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
    final public static String FIRST = "{1}";
    final public static String SECOND = "{2}";
    final public static String THIRD = "{3}";
    final public static String FOURTH = "{4}";

```

### MissortedModifiers
Missorted modifiers `final public static`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
public class Selector {

    final public static String FIRST = "{1}";
    final public static String SECOND = "{2}";
    final public static String THIRD = "{3}";
```

### MissortedModifiers
Missorted modifiers `final protected static`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
    final public static String FOURTH = "{4}";

    final protected static Set<String> SELECTORS = new HashSet<>(Arrays.asList(Selector.FIRST, Selector.SECOND, Selector.THIRD, Selector.FOURTH));

    private Selector() {
```

### MissortedModifiers
Missorted modifiers `final public static`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
    final public static String SECOND = "{2}";
    final public static String THIRD = "{3}";
    final public static String FOURTH = "{4}";

    final protected static Set<String> SELECTORS = new HashSet<>(Arrays.asList(Selector.FIRST, Selector.SECOND, Selector.THIRD, Selector.FOURTH));
```

### MissortedModifiers
Missorted modifiers `final public static`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java

    final public static String FIRST = "{1}";
    final public static String SECOND = "{2}";
    final public static String THIRD = "{3}";
    final public static String FOURTH = "{4}";
```

### MissortedModifiers
Missorted modifiers `final private static`
in `src/main/java/net/coreprotect/language/Phrase.java`
#### Snippet
```java
    final private static Set<Phrase> HEADERS = new HashSet<>(Arrays.asList(Phrase.CONTAINER_HEADER, Phrase.HELP_HEADER, Phrase.INTERACTIONS_HEADER, Phrase.LOOKUP_HEADER, Phrase.SIGN_HEADER, Phrase.UPDATE_HEADER));
    final private static Set<String> COLORS = new HashSet<>(Arrays.asList(Color.WHITE, Color.DARK_AQUA));
    final private static String split = ":";

    public String getPhrase() {
```

### MissortedModifiers
Missorted modifiers `final private static`
in `src/main/java/net/coreprotect/language/Phrase.java`
#### Snippet
```java
    WORLD_NOT_FOUND;

    final private static Set<Phrase> HEADERS = new HashSet<>(Arrays.asList(Phrase.CONTAINER_HEADER, Phrase.HELP_HEADER, Phrase.INTERACTIONS_HEADER, Phrase.LOOKUP_HEADER, Phrase.SIGN_HEADER, Phrase.UPDATE_HEADER));
    final private static Set<String> COLORS = new HashSet<>(Arrays.asList(Color.WHITE, Color.DARK_AQUA));
    final private static String split = ":";
```

### MissortedModifiers
Missorted modifiers `final private static`
in `src/main/java/net/coreprotect/language/Phrase.java`
#### Snippet
```java

    final private static Set<Phrase> HEADERS = new HashSet<>(Arrays.asList(Phrase.CONTAINER_HEADER, Phrase.HELP_HEADER, Phrase.INTERACTIONS_HEADER, Phrase.LOOKUP_HEADER, Phrase.SIGN_HEADER, Phrase.UPDATE_HEADER));
    final private static Set<String> COLORS = new HashSet<>(Arrays.asList(Color.WHITE, Color.DARK_AQUA));
    final private static String split = ":";

```

## NullableProblems
### NullableProblems
Method annotated with @Nullable must not override @NotNull method
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public Block getBlock() {
        // TODO Auto-generated method stub
        return null;
```

### NullableProblems
Method annotated with @Nullable must not override @NotNull method
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        // TODO Auto-generated method stub
        return null;
```

### NullableProblems
Method annotated with @Nullable must not override @NotNull method
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public MaterialData getData() {
        // TODO Auto-generated method stub
        return null;
```

### NullableProblems
Method annotated with @Nullable must not override @NotNull method
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public Chunk getChunk() {
        // TODO Auto-generated method stub
        return null;
```

## IfStatementMissingBreakInLoop
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            for (Integer value : actionList) {
                if (validActions.contains(value)) {
                    validAction = true;
                }
```

## IgnoreResultOfCall
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        final File configFolder = plugin.getDataFolder();
        if (!configFolder.exists()) {
            configFolder.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    if (abort) {
                        if (!Config.getGlobal().MYSQL) {
                            (new File(ConfigHandler.path + ConfigHandler.sqlite + ".tmp")).delete();
                        }
                        ConfigHandler.loadDatabase();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java

                    if (!Config.getGlobal().MYSQL) {
                        (new File(ConfigHandler.path + ConfigHandler.sqlite)).delete();
                        (new File(ConfigHandler.path + ConfigHandler.sqlite + ".tmp")).renameTo(new File(ConfigHandler.path + ConfigHandler.sqlite));
                    }
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    if (!Config.getGlobal().MYSQL) {
                        (new File(ConfigHandler.path + ConfigHandler.sqlite)).delete();
                        (new File(ConfigHandler.path + ConfigHandler.sqlite + ".tmp")).renameTo(new File(ConfigHandler.path + ConfigHandler.sqlite));
                    }

```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
            try {
                File tempFile = File.createTempFile("CoreProtect_" + System.currentTimeMillis(), ".tmp");
                tempFile.setExecutable(true);

                boolean canExecute = false;
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                    boolean exists = tempFolder.exists();
                    if (!exists) {
                        tempFolder.mkdir();
                    }
                    System.setProperty("java.io.tmpdir", "cache");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                }

                tempFile.delete();

                Class.forName("org.sqlite.JDBC");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
        final File configFolder = plugin.getDataFolder();
        if (!configFolder.exists()) {
            configFolder.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                boolean exists = (new File(ConfigHandler.path)).exists();
                if (!exists) {
                    new File(ConfigHandler.path).mkdir();
                }
                start = ConfigHandler.performInitialization(true); // Perform any necessary initialization
```

## IfStatementWithIdenticalBranches
### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                    if (valid) {
                        if (hasTbl) {
                            Object[] dataArray = new Object[] { resultId, resultTime, resultUserId, resultX, resultY, resultZ, resultType, resultData, resultAction, resultRolledBack, resultWorldId, resultAmount, resultMeta, resultBlockData, resultTable };
                            list.add(dataArray);
```

## ListRemoveInLoop
### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
                            // If database connection goes missing, remove processed data from consumer and abort
                            if (statement.isClosed()) {
                                for (int index = (i - 1); index >= 0; index--) {
                                    consumerData.remove(index);
                                }
```

## NestedAssignment
### NestedAssignment
Result of assignment expression used
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                    StringBuilder responseBuilder = new StringBuilder();
                                    String responseLine = null;
                                    while ((responseLine = reader.readLine()) != null) {
                                        responseBuilder.append(responseLine.trim());
                                    }
```

## ReplaceAssignmentWithOperatorAssignment
### ReplaceAssignmentWithOperatorAssignment
`consumerCount = consumerCount - 1` could be simplified to 'consumerCount -= 1'
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java
                        if (consumerCount >= 1 && (player instanceof Player)) {
                            if (Config.getConfig(((Player) player).getWorld()).PLAYER_COMMANDS) {
                                consumerCount = consumerCount - 1;
                            }
                        }
```

### ReplaceAssignmentWithOperatorAssignment
`alertTime = alertTime + 20` could be simplified to 'alertTime += 20'
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                            int alertTime = time_start + 10;
                            if (patchNotification) {
                                alertTime = alertTime + 20;
                            }
                            while (ConfigHandler.converterRunning) {
```

### ReplaceAssignmentWithOperatorAssignment
`alertTime = alertTime + 30` could be simplified to 'alertTime += 30'
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                                if (time >= alertTime) {
                                    Chat.console(Phrase.build(Phrase.PATCH_UPGRADING));
                                    alertTime = alertTime + 30;
                                    patchNotification = true;
                                }
```

### ReplaceAssignmentWithOperatorAssignment
`newAmount = newAmount - oldAmount` could be simplified to 'newAmount -= oldAmount'
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
                            int newAmount = newi.getAmount();
                            if (newAmount >= oldAmount) {
                                newAmount = newAmount - oldAmount;
                                oldi.setAmount(0);
                                newi.setAmount(newAmount);
```

### ReplaceAssignmentWithOperatorAssignment
`oldAmount = oldAmount - newAmount` could be simplified to 'oldAmount -= newAmount'
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
                            }
                            else {
                                oldAmount = oldAmount - newAmount;
                                oldi.setAmount(oldAmount);
                                newi.setAmount(0);
```

### ReplaceAssignmentWithOperatorAssignment
`removeAmount = removeAmount - itemStack.getAmount()` could be simplified to 'removeAmount -= itemStack.getAmount()'
in `src/main/java/net/coreprotect/listener/player/HopperPushListener.java`
#### Snippet
```java
                        }
                        else {
                            removeAmount = removeAmount - itemStack.getAmount();
                            itemStack = null;
                        }
```

### ReplaceAssignmentWithOperatorAssignment
`resultText = resultText + pageInfo` could be simplified to 'resultText += pageInfo'
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                    String pageInfo = Color.WHITE + "-----\n";
                    pageInfo = pageInfo + Util.getPageNavigation(command, page, totalPages) + "\n";
                    resultText = resultText + pageInfo;
                }
            }
```

### ReplaceAssignmentWithOperatorAssignment
`result = result + pageInfo` could be simplified to 'result += pageInfo'
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                    String pageInfo = Color.WHITE + "-----\n";
                    pageInfo = pageInfo + Util.getPageNavigation(command, page, totalPages) + "\n";
                    result = result + pageInfo;
                }
            }
```

### ReplaceAssignmentWithOperatorAssignment
`removed = removed + (oldCount - new_count)` could be simplified to 'removed += (oldCount - new_count)'
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }

                                removed = removed + (oldCount - new_count);
                            }
                        }
```

### ReplaceAssignmentWithOperatorAssignment
`removed = removed + preparedStmt.getUpdateCount()` could be simplified to 'removed += preparedStmt.getUpdateCount()'
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                    preparedStmt = connection.prepareStatement(query);
                                    preparedStmt.execute();
                                    removed = removed + preparedStmt.getUpdateCount();
                                    preparedStmt.close();
                                }
```

### ReplaceAssignmentWithOperatorAssignment
`where = where + " OR uuid = ?"` could be simplified to 'where += " OR uuid = ?"'
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
            String where = "user = ?" + collate;
            if (uuid != null) {
                where = where + " OR uuid = ?";
            }

```

### ReplaceAssignmentWithOperatorAssignment
`paintingY = paintingY - 1` could be simplified to 'paintingY -= 1'
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                        if (height > 1) {
                            if (height != 3) {
                                paintingY = paintingY - 1;
                            }
                        }
```

### ReplaceAssignmentWithOperatorAssignment
`result = result + pageInfo` could be simplified to 'result += pageInfo'
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                    String pageInfo = Color.WHITE + "-----\n";
                    pageInfo = pageInfo + Util.getPageNavigation(command, page, totalPages) + "\n";
                    result = result + pageInfo;
                }
            }
```

### ReplaceAssignmentWithOperatorAssignment
`timeSince = timeSince / 60` could be simplified to 'timeSince /= 60'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        // minutes
        timeSince = timeSince / 60;
        if (timeSince < 60.0) {
            message.append(Phrase.build(Phrase.LOOKUP_TIME, new DecimalFormat("0.00").format(timeSince) + "/m"));
```

### ReplaceAssignmentWithOperatorAssignment
`timeSince = timeSince / 60` could be simplified to 'timeSince /= 60'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        // hours
        if (message.length() == 0) {
            timeSince = timeSince / 60;
            if (timeSince < 24.0) {
                message.append(Phrase.build(Phrase.LOOKUP_TIME, new DecimalFormat("0.00").format(timeSince) + "/h"));
```

### ReplaceAssignmentWithOperatorAssignment
`timeSince = timeSince / 24` could be simplified to 'timeSince /= 24'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        // days
        if (message.length() == 0) {
            timeSince = timeSince / 24;
            message.append(Phrase.build(Phrase.LOOKUP_TIME, new DecimalFormat("0.00").format(timeSince) + "/d"));
        }
```

### ReplaceAssignmentWithOperatorAssignment
`result = result + ","` could be simplified to 'result += ","'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            if (result.length() > 0) {
                if (result.matches("\\d+")) {
                    result = result + ",";
                }
                if (result.contains(",")) {
```

### ReplaceAssignmentWithOperatorAssignment
`time = time + " -"` could be simplified to 'time += " -"'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            m = new BigDecimal(0);
                            s = new BigDecimal(0);
                            time = time + " -";
                        }

```

### ReplaceAssignmentWithOperatorAssignment
`waterLevel = waterLevel - 8` could be simplified to 'waterLevel -= 8'
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                    int waterLevel = levelled.getLevel() + 1;
                    if (waterLevel > 8) {
                        waterLevel = waterLevel - 8;
                    }
                    levelled.setLevel(waterLevel);
```

### ReplaceAssignmentWithOperatorAssignment
`alertTime = alertTime + (30 * 1000)` could be simplified to 'alertTime += (30 \* 1000)'
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                        Chat.console(Phrase.build(Phrase.LOGGING_ITEMS, String.format("%,d", consumerCount)));
                    }
                    alertTime = alertTime + (30 * 1000);
                }
                else if (!ConfigHandler.databaseReachable && (time - shutdownTime) >= (5 * 60 * 1000)) {
```

### ReplaceAssignmentWithOperatorAssignment
`sleepTime = sleepTime + 5` could be simplified to 'sleepTime += 5'
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java

            while (next == 0) {
                sleepTime = sleepTime + 5;
                Thread.sleep(5);
                rollbackHashData = ConfigHandler.rollbackHash.get(finalUserString);
```

### ReplaceAssignmentWithOperatorAssignment
`modifyCount = modifyCount + rowAmount` could be simplified to 'modifyCount += rowAmount'
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java

                                if ((rollbackType == 0 && rowRolledBack == 0) || (rollbackType == 1 && rowRolledBack == 1)) {
                                    modifyCount = modifyCount + rowAmount;
                                    int action = 0;

```

### ReplaceAssignmentWithOperatorAssignment
`queryBlock = queryBlock + " action NOT IN(-1) AND"` could be simplified to 'queryBlock += " action NOT IN(-1) AND"'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            }
            else if (inventoryQuery || actionExclude.length() > 0 || includeBlock.length() > 0 || includeEntity.length() > 0 || excludeBlock.length() > 0 || excludeEntity.length() > 0) {
                queryBlock = queryBlock + " action NOT IN(-1) AND";
            }

```

### ReplaceAssignmentWithOperatorAssignment
`queryBlock = queryBlock + " action = '1' AND (LENGTH(line_1) > 0 OR LENGTH(line_2) > 0 OR LENGTH(lin...` could be simplified to 'queryBlock += " action = '1' AND (LENGTH(line_1) \> 0 OR LENGTH(line_2) \> 0 OR LENGTH(line_3) \> 0 OR LENGTH(line_4) \> 0) AND"'
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

            if (actionList.contains(10)) {
                queryBlock = queryBlock + " action = '1' AND (LENGTH(line_1) > 0 OR LENGTH(line_2) > 0 OR LENGTH(line_3) > 0 OR LENGTH(line_4) > 0) AND";
            }

```

### ReplaceAssignmentWithOperatorAssignment
`rowData = rowData - 8` could be simplified to 'rowData -= 8'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            if (rowData >= 8) {
                                                door.setHalf(Half.TOP);
                                                rowData = rowData - 8;
                                            }
                                            else {
```

### ReplaceAssignmentWithOperatorAssignment
`rowData = rowData - 4` could be simplified to 'rowData -= 4'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            if (rowData >= 4) {
                                                door.setHinge(Hinge.RIGHT);
                                                rowData = rowData - 4;
                                            }
                                            else {
```

### ReplaceAssignmentWithOperatorAssignment
`rowData = rowData - 4` could be simplified to 'rowData -= 4'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            if (rowData > 4) {
                                                bed.setPart(Part.HEAD);
                                                rowData = rowData - 4;
                                            }

```

### ReplaceAssignmentWithOperatorAssignment
`itemCount1 = itemCount1 + rowAmount` could be simplified to 'itemCount1 += rowAmount'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                    }

                                    itemCount1 = itemCount1 + rowAmount;
                                    ConfigHandler.rollbackHash.put(finalUserString, new int[] { itemCount1, blockCount1, entityCount1, 0 });
                                    continue; // remove this for merged rollbacks in future? (be sure to re-enable chunk sorting)
```

### ReplaceAssignmentWithOperatorAssignment
`itemCount1 = itemCount1 + rowAmount` could be simplified to 'itemCount1 += rowAmount'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                                        modifyContainerItems(containerType, container, slot, itemstack, action);
                                        itemCount1 = itemCount1 + rowAmount;
                                    }
                                    containerInit = true;
```

### ReplaceAssignmentWithOperatorAssignment
`sleepTime = sleepTime + 1` could be simplified to 'sleepTime += 1'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    if (preview == 1) {
                        // Not actually changing blocks, so less intensive.
                        sleepTime = sleepTime + 1;
                        Thread.sleep(1);
                    }
```

### ReplaceAssignmentWithOperatorAssignment
`sleepTime = sleepTime + 5` could be simplified to 'sleepTime += 5'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    }
                    else {
                        sleepTime = sleepTime + 5;
                        Thread.sleep(5);
                    }
```

## EmptyMethod
### EmptyMethod
Method only calls its super
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java

    @Override
    public void sendSignChange(Player player, Sign sign) {
        return;
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java

    @Override
    public void setGlowing(Sign sign, boolean set) {
        return;
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/net/coreprotect/spigot/SpigotAdapter.java`
#### Snippet
```java

    @Override
    public void addHoverComponent(Object message, String[] data) {
        return;
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/net/coreprotect/spigot/SpigotAdapter.java`
#### Snippet
```java

    @Override
    public void setHoverEvent(Object message, String text) {
        return;
    }
```

## GroovyUnusedAssignment
### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
}

group = 'net.coreprotect'
String projectVersion = '21.2'
String projectBranch = ''
```

### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
String projectBranch = ''
version = projectVersion // `version` might be modified, we don't always want that (e.g. plugin.yml)
description = 'Provides block protection for your server.'
sourceCompatibility = '17'

```

### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
version = projectVersion // `version` might be modified, we don't always want that (e.g. plugin.yml)
description = 'Provides block protection for your server.'
sourceCompatibility = '17'

if (System.getenv("BUILD_NUMBER") != null) {
```

## RedundantFieldInitialization
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
public class Patch {

    private static boolean patching = false;
    private static boolean patchNotification = false;
    private static Integer[] firstVersion = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java

    private static boolean patching = false;
    private static boolean patchNotification = false;
    private static Integer[] firstVersion = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
    private static boolean patching = false;
    private static boolean patchNotification = false;
    private static Integer[] firstVersion = null;

    public static boolean continuePatch() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
public class Consumer extends Process implements Runnable, Thread.UncaughtExceptionHandler {

    private static Thread consumerThread = null;
    public static volatile int currentConsumer = 0;
    public static volatile boolean isPaused = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    private static Thread consumerThread = null;
    public static volatile int currentConsumer = 0;
    public static volatile boolean isPaused = false;
    public static volatile boolean transacting = false;
    public static volatile boolean interrupt = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java

    private static Thread consumerThread = null;
    public static volatile int currentConsumer = 0;
    public static volatile boolean isPaused = false;
    public static volatile boolean transacting = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static volatile boolean transacting = false;
    public static volatile boolean interrupt = false;
    protected static volatile boolean pausedSuccess = false;

    public static ConcurrentHashMap<Integer, ArrayList<Object[]>> consumer = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static volatile boolean isPaused = false;
    public static volatile boolean transacting = false;
    public static volatile boolean interrupt = false;
    protected static volatile boolean pausedSuccess = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static volatile int currentConsumer = 0;
    public static volatile boolean isPaused = false;
    public static volatile boolean transacting = false;
    public static volatile boolean interrupt = false;
    protected static volatile boolean pausedSuccess = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/worldedit/CoreProtectEditSessionEvent.java`
#### Snippet
```java

    private static boolean initialized = false;
    private static boolean isFAWE = false;
    private static CoreProtectEditSessionEvent event = new CoreProtectEditSessionEvent();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/worldedit/CoreProtectEditSessionEvent.java`
#### Snippet
```java
public class CoreProtectEditSessionEvent {

    private static boolean initialized = false;
    private static boolean isFAWE = false;
    private static CoreProtectEditSessionEvent event = new CoreProtectEditSessionEvent();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
    private boolean background = false;
    private boolean translate = true;
    private static String latestVersion = null;
    private static String donationKey = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
    private boolean translate = true;
    private static String latestVersion = null;
    private static String donationKey = null;

    public NetworkHandler(boolean startup, boolean background) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

    private boolean startup = true;
    private boolean background = false;
    private boolean translate = true;
    private static String latestVersion = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
    public static final int BLOCK_INVENTORY_ROLLBACK_UPDATE = 29;

    public static int lastLockUpdate = 0;
    private static volatile int currentConsumerSize = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java

    public static int lastLockUpdate = 0;
    private static volatile int currentConsumerSize = 0;

    public static int getCurrentConsumerSize() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
    private static String[] NUMBERS = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private static String[] TIMES = new String[] { "w", "d", "h", "m", "s" };
    private static ArrayList<String> materials = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_18.java`
#### Snippet
```java
public class Bukkit_v1_18 extends Bukkit_v1_17 implements BukkitInterface {

    private Boolean hasAdjust = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile boolean databaseReachable = true;
    public static volatile int worldId = 0;
    public static volatile int materialId = 0;
    public static volatile int blockdataId = 0;
    public static volatile int entityId = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile boolean serverRunning = false;
    public static volatile boolean converterRunning = false;
    public static volatile boolean purgeRunning = false;
    public static volatile boolean pauseConsumer = false;
    public static volatile boolean worldeditEnabled = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java

public class ConfigHandler extends Queue {
    public static int SERVER_VERSION = 0;
    public static final int EDITION_VERSION = 2;
    public static final String EDITION_BRANCH = Util.getBranch();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static String password = "";
    public static String prefix = "co_";
    public static HikariDataSource hikariDataSource = null;
    public static final boolean isSpigot = Util.isSpigot();
    public static final boolean isPaper = Util.isPaper();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile boolean converterRunning = false;
    public static volatile boolean purgeRunning = false;
    public static volatile boolean pauseConsumer = false;
    public static volatile boolean worldeditEnabled = false;
    public static volatile boolean databaseReachable = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static final boolean isPaper = Util.isPaper();
    public static volatile boolean serverRunning = false;
    public static volatile boolean converterRunning = false;
    public static volatile boolean purgeRunning = false;
    public static volatile boolean pauseConsumer = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile int materialId = 0;
    public static volatile int blockdataId = 0;
    public static volatile int entityId = 0;
    public static volatile int artId = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile boolean purgeRunning = false;
    public static volatile boolean pauseConsumer = false;
    public static volatile boolean worldeditEnabled = false;
    public static volatile boolean databaseReachable = true;
    public static volatile int worldId = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile boolean worldeditEnabled = false;
    public static volatile boolean databaseReachable = true;
    public static volatile int worldId = 0;
    public static volatile int materialId = 0;
    public static volatile int blockdataId = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile int blockdataId = 0;
    public static volatile int entityId = 0;
    public static volatile int artId = 0;

    private static <K, V> Map<K, V> syncMap() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static volatile int worldId = 0;
    public static volatile int materialId = 0;
    public static volatile int blockdataId = 0;
    public static volatile int entityId = 0;
    public static volatile int artId = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
    public static final boolean isSpigot = Util.isSpigot();
    public static final boolean isPaper = Util.isPaper();
    public static volatile boolean serverRunning = false;
    public static volatile boolean converterRunning = false;
    public static volatile boolean purgeRunning = false;
```

## RedundantImplements
### RedundantImplements
Redundant interface declaration `PaperInterface`
in `src/main/java/net/coreprotect/paper/Paper_v1_16.java`
#### Snippet
```java
import org.bukkit.inventory.InventoryHolder;

public class Paper_v1_16 extends PaperHandler implements PaperInterface {

    @Override
```

### RedundantImplements
Redundant interface declaration `PaperInterface`
in `src/main/java/net/coreprotect/paper/PaperHandler.java`
#### Snippet
```java
import org.bukkit.Server;

public class PaperHandler extends PaperAdapter implements PaperInterface {

    @Override
```

### RedundantImplements
Redundant interface declaration `BukkitInterface`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_18.java`
#### Snippet
```java
import org.bukkit.inventory.MerchantRecipe;

public class Bukkit_v1_18 extends Bukkit_v1_17 implements BukkitInterface {

    private Boolean hasAdjust = null;
```

### RedundantImplements
Redundant interface declaration `BukkitInterface`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
import net.coreprotect.model.BlockGroup;

public class Bukkit_v1_16 extends Bukkit_v1_15 implements BukkitInterface {

    public Bukkit_v1_16() {
```

### RedundantImplements
Redundant interface declaration `BukkitInterface`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java
import org.bukkit.potion.PotionEffect;

public class Bukkit_v1_15 extends BukkitAdapter implements BukkitInterface {

    @Override
```

### RedundantImplements
Redundant interface declaration `BukkitInterface`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class Bukkit_v1_17 extends Bukkit_v1_16 implements BukkitInterface {

    public Bukkit_v1_17() {
```

### RedundantImplements
Redundant interface declaration `SpigotInterface`
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
import net.md_5.bungee.api.chat.hover.content.Text;

public class Spigot_v1_16 extends SpigotHandler implements SpigotInterface {

    public Spigot_v1_16() {
```

### RedundantImplements
Redundant interface declaration `SpigotInterface`
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
import net.md_5.bungee.api.chat.TextComponent;

public class SpigotHandler extends SpigotAdapter implements SpigotInterface {

    public static ChatColor DARK_AQUA = ChatColor.DARK_AQUA;
```

## InstanceofCatchParameter
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `thr`
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
                }
                catch (final Throwable thr) {
                    if (thr instanceof ThreadDeath) {
                        throw (ThreadDeath) thr;
                    }
```

## ConditionalExpressionWithIdenticalBranches
### ConditionalExpressionWithIdenticalBranches
Conditional expression `lines.remove(lines.size() - 1).isEmpty() ? lines : lines` with identical branches
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
```

### ConditionalExpressionWithIdenticalBranches
Conditional expression `lines.remove(lines.size() - 1).isEmpty() ? lines : lines` with identical branches
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
```

## CastConflictsWithInstanceof
### CastConflictsWithInstanceof
Cast to 'Chest' type conflicts with preceding 'instanceof BlockInventoryHolder' check
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    Material type = blockState.getType();
                    if (chests.contains(type)) {
                        inventory = ((Chest) blockState).getBlockInventory();
                    }
                }
```

### CastConflictsWithInstanceof
Cast to 'Horse' type conflicts with preceding 'instanceof AbstractHorse' check
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            // deprecated
                            Style set = (Style) value;
                            Horse horse = (Horse) entity;
                            horse.setStyle(set);
                        }
```

## UnusedAssignment
### UnusedAssignment
Variable `itemStack` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/PlayerPickupArrowListener.java`
#### Snippet
```java

    public static ItemStack getArrowType(AbstractArrow arrow) {
        ItemStack itemStack = null;
        switch (arrow.getType()) {
            case SPECTRAL_ARROW:
```

### UnusedAssignment
Variable `consumerCount` initializer `0` is redundant
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java

                    try {
                        int consumerCount = 0;
                        int currentConsumerSize = Process.getCurrentConsumerSize();
                        if (currentConsumerSize == 0) {
```

### UnusedAssignment
Variable `blockData` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/entity/HangingPlaceListener.java`
#### Snippet
```java
        if (entity instanceof ItemFrame || entity instanceof Painting) {
            Block blockEvent = event.getEntity().getLocation().getBlock();
            String blockData = null;
            Material material;
            int artId;
```

### UnusedAssignment
Variable `enderChest` initializer `false` is redundant
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        }

        boolean enderChest = false;
        if (inventoryAction != InventoryAction.MOVE_TO_OTHER_INVENTORY && inventoryAction != InventoryAction.COLLECT_TO_CURSOR && inventoryAction != InventoryAction.UNKNOWN) {
            // Perform this check to prevent triggering onInventoryInteractAsync when a user is just clicking items in their own inventory
```

### UnusedAssignment
Variable `addItem` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

                                        for (Object item : transactingChestList) {
                                            ItemStack addItem = null;
                                            ItemStack removeItem = null;
                                            if (item instanceof ItemStack) {
```

### UnusedAssignment
Variable `location` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        }

        Location location = null;
        try {
            location = inventory.getLocation();
```

### UnusedAssignment
Variable `skullOwner` initializer `""` is redundant
in `src/main/java/net/coreprotect/database/logger/SkullPlaceLogger.java`
#### Snippet
```java
            if (block instanceof Skull) {
                Skull skull = (Skull) block;
                String skullOwner = "";
                if (skull.hasOwner()) {
                    skullOwner = skull.getOwningPlayer().getUniqueId().toString();
```

### UnusedAssignment
Variable `phrase` initializer `Phrase.LOOKUP_BLOCK` is redundant
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                found = true;

                Phrase phrase = Phrase.LOOKUP_BLOCK;
                String selector = Selector.FIRST;
                String tag = Color.WHITE + "-";
```

### UnusedAssignment
Variable `selector` initializer `Selector.FIRST` is redundant
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java

                Phrase phrase = Phrase.LOOKUP_BLOCK;
                String selector = Selector.FIRST;
                String tag = Color.WHITE + "-";
                if (resultAction == 2 || resultAction == 3) {
```

### UnusedAssignment
Variable `tag` initializer `Color.WHITE + "-"` is redundant
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                Phrase phrase = Phrase.LOOKUP_BLOCK;
                String selector = Selector.FIRST;
                String tag = Color.WHITE + "-";
                if (resultAction == 2 || resultAction == 3) {
                    phrase = Phrase.LOOKUP_INTERACTION; // {clicked|killed}
```

### UnusedAssignment
Variable `responseLine` initializer `null` is redundant
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                                    StringBuilder responseBuilder = new StringBuilder();
                                    String responseLine = null;
                                    while ((responseLine = reader.readLine()) != null) {
                                        responseBuilder.append(responseLine.trim());
```

### UnusedAssignment
Variable `startup` initializer `true` is redundant
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
public class NetworkHandler extends Language implements Runnable {

    private boolean startup = true;
    private boolean background = false;
    private boolean translate = true;
```

### UnusedAssignment
Variable `background` initializer `false` is redundant
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

    private boolean startup = true;
    private boolean background = false;
    private boolean translate = true;
    private static String latestVersion = null;
```

### UnusedAssignment
Variable `index` initializer `""` is redundant
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
            try (Connection connection = Database.getConnection(true, true, true, 0)) {
                if (connection != null) {
                    String index = "";
                    Statement statement = connection.createStatement();
                    index = ", INDEX(id)";
```

### UnusedAssignment
Variable `query` initializer `""` is redundant
in `src/main/java/net/coreprotect/consumer/process/SignUpdateProcess.java`
#### Snippet
```java
            int wid = Util.getWorldId(block.getWorld().getName());
            int userid = ConfigHandler.playerIdCache.get(user.toLowerCase(Locale.ROOT));
            String query = "";
            if (action == 0) {
                query = "SELECT color, data, line_1, line_2, line_3, line_4 FROM " + ConfigHandler.prefix + "sign WHERE user='" + userid + "' AND wid='" + wid + "' AND x='" + x + "' AND z='" + z + "' AND y='" + y + "' AND time < '" + time + "' ORDER BY rowid DESC LIMIT 0, 1";
```

### UnusedAssignment
Variable `blockData` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
            }

            String blockData = null;
            Material material;
            int itemData = 0;
```

### UnusedAssignment
Variable `n` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java
            while (l <= nblocks.size()) {
                int ll = l - 1;
                Block n = null;
                if (ll == -1) {
                    n = bm;
```

### UnusedAssignment
Variable `type` initializer `Material.AIR` is redundant
in `src/main/java/net/coreprotect/listener/block/BlockDispenseListener.java`
#### Snippet
```java
                Dispenser dispenser = (Dispenser) blockData;
                Material material = item.getType();
                Material type = Material.AIR;
                String user = "#dispenser";
                boolean forceItem = true;
```

### UnusedAssignment
Variable `filter` initializer `lastArg` is redundant
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            }
            else if (lastArg.equals("t:") || lastArg.equals("time:") || currentArg.startsWith("t:") || currentArg.startsWith("time:")) {
                String filter = lastArg;
                String arg = "";
                if (currentArg.contains(":")) {
```

### UnusedAssignment
Variable `filter` initializer `lastArg` is redundant
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            }
            else if (lastArg.equals("page:") || currentArg.startsWith("page:")) {
                String filter = lastArg;
                String arg = "";
                if (currentArg.contains(":")) {
```

### UnusedAssignment
Variable `filter` initializer `lastArg` is redundant
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            }
            else if (lastArg.equals("r:") || lastArg.equals("radius:") || currentArg.startsWith("r:") || currentArg.startsWith("radius:")) {
                String filter = lastArg;
                String arg = "";
                if (currentArg.contains(":")) {
```

### UnusedAssignment
Variable `filter` initializer `lastArg` is redundant
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            }
            else if (lastArg.equals("i:") || lastArg.equals("include:") || lastArg.equals("item:") || lastArg.equals("items:") || lastArg.equals("b:") || lastArg.equals("block:") || lastArg.equals("blocks:") || currentArg.startsWith("i:") || currentArg.startsWith("include:") || currentArg.startsWith("item:") || currentArg.startsWith("items:") || currentArg.startsWith("b:") || currentArg.startsWith("block:") || currentArg.startsWith("blocks:") || lastArg.equals("e:") || lastArg.equals("exclude:") || currentArg.startsWith("e:") || currentArg.startsWith("exclude:")) {
                String filter = lastArg;
                String arg = "";
                if (currentArg.contains(":")) {
```

### UnusedAssignment
Variable `query` initializer `""` is redundant
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    Consumer.isPaused = true;

                    String query = "";
                    PreparedStatement preparedStmt = null;
                    boolean abort = false;
```

### UnusedAssignment
Variable `preparedStmt` initializer `null` is redundant
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java

                    String query = "";
                    PreparedStatement preparedStmt = null;
                    boolean abort = false;
                    String purgePrefix = "tmp_" + ConfigHandler.prefix;
```

### UnusedAssignment
Variable `entityType` initializer `EntityType.PIG` is redundant
in `src/main/java/net/coreprotect/patch/script/__2_20_0.java`
#### Snippet
```java
            ResultSet resultSet = statement.executeQuery(entityQuery);
            while (resultSet.next()) {
                EntityType entityType = EntityType.PIG;
                switch (resultSet.getInt("data")) {
                    case 1:
```

### UnusedAssignment
Variable `minor` initializer `0` is redundant
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static Integer[] getInternalPluginVersion() {
        int major = ConfigHandler.EDITION_VERSION;
        int minor = 0;
        int revision = 0;

```

### UnusedAssignment
Variable `range` initializer `false` is redundant
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
        int count = 0;
        int next = 0;
        boolean range = false;
        BigDecimal w = new BigDecimal(0);
        BigDecimal d = new BigDecimal(0);
```

### UnusedAssignment
Variable `range` initializer `false` is redundant
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
        int count = 0;
        int next = 0;
        boolean range = false;
        double w = 0;
        double d = 0;
```

### UnusedAssignment
Variable `handItem` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
            if (event.useItemInHand() != Event.Result.DENY) {
                List<Material> entityBlockTypes = Arrays.asList(Material.ARMOR_STAND, Material.END_CRYSTAL, Material.BOW, Material.CROSSBOW, Material.TRIDENT, Material.EXPERIENCE_BOTTLE, Material.SPLASH_POTION, Material.LINGERING_POTION, Material.ENDER_PEARL, Material.FIREWORK_ROCKET, Material.EGG, Material.SNOWBALL);
                ItemStack handItem = null;
                ItemStack mainHand = player.getInventory().getItemInMainHand();
                ItemStack offHand = player.getInventory().getItemInOffHand();
```

### UnusedAssignment
Variable `blockData` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/entity/HangingBreakListener.java`
#### Snippet
```java
                }

                String blockData = null;
                Material material;
                int itemData = 0;
```

### UnusedAssignment
Variable `consumerCount` initializer `0` is redundant
in `src/main/java/net/coreprotect/api/QueueLookup.java`
#### Snippet
```java

        try {
            int consumerCount = 0;
            int currentConsumerSize = Process.getCurrentConsumerSize();
            if (currentConsumerSize == 0) {
```

### UnusedAssignment
Variable `skullOwner` initializer `""` is redundant
in `src/main/java/net/coreprotect/database/logger/SkullBreakLogger.java`
#### Snippet
```java
            int type = Util.getBlockId(block.getType().name(), true);
            Skull skull = (Skull) block;
            String skullOwner = "";
            int skullKey = 0;
            if (skull.hasOwner()) {
```

### UnusedAssignment
The value `null` assigned to `below` is never used
in `src/main/java/net/coreprotect/listener/block/BlockSpreadListener.java`
#### Snippet
```java
                    below.setY(below.getY() + 1);
                }
                below = null;

                Queue.queueBlockPlaceDelayed("#bamboo", sourceBlock.getLocation(), type, null, sourceBlock.getState(), 0);
```

### UnusedAssignment
Variable `wid` initializer `0` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                }

                int wid = 0;
                int x = 0;
                int y = 0;
```

### UnusedAssignment
Variable `x` initializer `0` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java

                int wid = 0;
                int x = 0;
                int y = 0;
                int z = 0;
```

### UnusedAssignment
Variable `y` initializer `0` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                int wid = 0;
                int x = 0;
                int y = 0;
                int z = 0;
                if (rollbackusers.contains("#container")) {
```

### UnusedAssignment
Variable `z` initializer `0` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                int x = 0;
                int y = 0;
                int z = 0;
                if (rollbackusers.contains("#container")) {
                    if (argAction.contains(11)) {
```

### UnusedAssignment
Variable `selector` initializer `Selector.FIRST` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    String dname = Util.nameFilter(blockType.name().toLowerCase(Locale.ROOT), ddata);

                                                    String selector = Selector.FIRST;
                                                    String tag = Color.WHITE + "-";
                                                    if (daction == 2 || daction == 3) { // LOOKUP_ITEM
```

### UnusedAssignment
Variable `tag` initializer `Color.WHITE + "-"` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

                                                    String selector = Selector.FIRST;
                                                    String tag = Color.WHITE + "-";
                                                    if (daction == 2 || daction == 3) { // LOOKUP_ITEM
                                                        selector = (daction != 2 ? Selector.FIRST : Selector.SECOND);
```

### UnusedAssignment
Variable `tag` initializer `Color.WHITE + "-"` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    int wid = Integer.parseInt(data[9]);
                                                    int amount = Integer.parseInt(data[10]);
                                                    String tag = Color.WHITE + "-";

                                                    String timeago = Util.getTimeSince(Integer.parseInt(time), unixtimestamp, true);
```

### UnusedAssignment
Variable `dname` initializer `""` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    }

                                                    String dname = "";
                                                    boolean isPlayer = false;
                                                    if (daction == 3 && !finalArgAction.contains(11) && amount == -1) {
```

### UnusedAssignment
Variable `phrase` initializer `Phrase.LOOKUP_BLOCK` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    // Functions.sendMessage(player2, timeago+" " + ChatColors.WHITE + "- " + ChatColors.DARK_AQUA+rbd+""+dplayer+" " + ChatColors.WHITE+rbd+""+a+" " + ChatColors.DARK_AQUA+rbd+"#"+dtype+ChatColors.WHITE + ". " + ChatColors.GREY + "(x"+x+"/y"+y+"/z"+z+")");

                                                    Phrase phrase = Phrase.LOOKUP_BLOCK;
                                                    String selector = Selector.FIRST;
                                                    String action = "a:block";
```

### UnusedAssignment
Variable `selector` initializer `Selector.FIRST` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

                                                    Phrase phrase = Phrase.LOOKUP_BLOCK;
                                                    String selector = Selector.FIRST;
                                                    String action = "a:block";
                                                    if (finalArgAction.contains(4) || finalArgAction.contains(5) || finalArgAction.contains(11) || amount > -1) {
```

### UnusedAssignment
Variable `blockdata` initializer `null` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                            }
                            else {
                                String blockdata = null;
                                if (t == 7) {
                                    blockdata = InteractionLookup.performLookup(command.getName(), statement, fblock, player2, 0, p2, finalLimit);
```

### UnusedAssignment
Variable `queryEntity` initializer `""` is redundant
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            boolean validAction = false;
            String queryBlock = "";
            String queryEntity = "";
            String queryLimit = "";
            String queryTable = "block";
```

### UnusedAssignment
Variable `targetName` initializer `""` is redundant
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                for (Object restrictTarget : restrictList) {
                    String targetName = "";

                    if (restrictTarget instanceof Material) {
```

### UnusedAssignment
Variable `targetName` initializer `""` is redundant
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                for (Object restrictTarget : excludeList.keySet()) {
                    String targetName = "";

                    if (restrictTarget instanceof Material) {
```

### UnusedAssignment
Variable `resultData` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                }
                else {
                    int resultData = 0;
                    int resultAmount = -1;
                    int resultTable = 0;
```

### UnusedAssignment
Variable `resultMeta` initializer `null` is redundant
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    int resultAmount = -1;
                    int resultTable = 0;
                    byte[] resultMeta = null;
                    byte[] resultBlockData = null;
                    long resultId = results.getLong("id");
```

### UnusedAssignment
The value changed at `modifyCount++` is never used
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    }
                    modifiedData.append(Phrase.build(Phrase.AMOUNT_CHUNK, NumberFormat.getInstance().format(chunkCount), (chunkCount == 1 ? Selector.FIRST : Selector.SECOND)));
                    modifyCount++;
                }
                else if (chunkCount > 1) {
```

### UnusedAssignment
Variable `contents` initializer `null` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        int modifiedArmor = -1;
        try {
            ItemStack[] contents = null;

            if (type != null && type.equals(Material.ARMOR_STAND)) {
```

### UnusedAssignment
Variable `list` initializer `new ArrayList<>()` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

    public static List<String[]> performRollbackRestore(Statement statement, CommandSender user, List<String> checkUuids, List<String> checkUsers, String timeString, List<Object> restrictList, Map<Object, Boolean> excludeList, List<String> excludeUserList, List<Integer> actionList, Location location, Integer[] radius, long startTime, long endTime, boolean restrictWorld, boolean lookup, boolean verbose, final int rollbackType, final int preview) {
        List<String[]> list = new ArrayList<>();

        try {
```

### UnusedAssignment
The value `BukkitAdapter.ADAPTER.getMinHeight(bukkitWorld)` assigned to `worldMin` is never used
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                        World bukkitWorld = Bukkit.getServer().getWorld(world);
                        if (bukkitWorld != null) {
                            worldMin = BukkitAdapter.ADAPTER.getMinHeight(bukkitWorld);
                            worldMax = bukkitWorld.getMaxHeight();
                        }
```

### UnusedAssignment
The value `bukkitWorld.getMaxHeight()` assigned to `worldMax` is never used
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                        if (bukkitWorld != null) {
                            worldMin = BukkitAdapter.ADAPTER.getMinHeight(bukkitWorld);
                            worldMax = bukkitWorld.getMaxHeight();
                        }
                    }
```

### UnusedAssignment
Variable `itemCount` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                chunkCount++;

                int itemCount = 0;
                int blockCount = 0;
                int entityCount = 0;
```

### UnusedAssignment
Variable `blockCount` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                int itemCount = 0;
                int blockCount = 0;
                int entityCount = 0;
                int[] rollbackHashData = ConfigHandler.rollbackHash.get(finalUserString);
```

### UnusedAssignment
Variable `entityCount` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                int itemCount = 0;
                int blockCount = 0;
                int entityCount = 0;
                int[] rollbackHashData = ConfigHandler.rollbackHash.get(finalUserString);
                itemCount = rollbackHashData[0];
```

### UnusedAssignment
The value `true` assigned to `removed` is never used
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                if (id == entityId) {
                                                    entityCount1++;
                                                    removed = true;
                                                    entity.remove();
                                                    break;
```

### UnusedAssignment
Variable `inventoryAction` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                    }

                                    int inventoryAction = 0;
                                    if (rowAction == ItemLogger.ITEM_DROP || rowAction == ItemLogger.ITEM_PICKUP || rowAction == ItemLogger.ITEM_THROW || rowAction == ItemLogger.ITEM_SHOOT || rowAction == ItemLogger.ITEM_BREAK || rowAction == ItemLogger.ITEM_DESTROY || rowAction == ItemLogger.ITEM_CREATE || rowAction == ItemLogger.ITEM_SELL || rowAction == ItemLogger.ITEM_BUY) {
                                        inventoryAction = ((rowAction == ItemLogger.ITEM_PICKUP || rowAction == ItemLogger.ITEM_CREATE || rowAction == ItemLogger.ITEM_BUY) ? 1 : 0);
```

## StringConcatenationInsideStringBufferAppend
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `OutputStreamWriter.append()` call
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                out.append(key);
                out.append(": ");
                out.append("\"" + defaultValue + "\"");
            }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }

                resultTextBuilder.append(timeAgo + " " + tag + " ").append(Phrase.build(phrase, Color.DARK_AQUA + rbFormat + resultUser + Color.WHITE + rbFormat, Color.DARK_AQUA + rbFormat + target + Color.WHITE, selector)).append("\n");
                PluginChannelListener.getInstance().sendData(commandSender, resultTime, phrase, selector, resultUser, target, -1, x, y, z, worldId, rbFormat, false, tag.contains("+"));
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `OutputStreamWriter.append()` call
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                        try (final FileOutputStream fout = new FileOutputStream(file, false)) {
                                            OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(fout), StandardCharsets.UTF_8);
                                            out.append("# CoreProtect v" + pluginVersion + " Language Cache (" + languageCode + ")");
                                            out.append(Config.LINE_SEPARATOR);

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `OutputStreamWriter.append()` call
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                                out.append(key);
                                                out.append(": ");
                                                out.append("\"" + value + "\"");
                                            }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                }

                resultBuilder.append(timeAgo + " " + Color.WHITE + "- ").append(Phrase.build(Phrase.LOOKUP_INTERACTION, Color.DARK_AQUA + rbFormat + resultUser + Color.WHITE + rbFormat, Color.DARK_AQUA + rbFormat + target + Color.WHITE, Selector.FIRST)).append("\n");
                PluginChannelListener.getInstance().sendData(commandSender, resultTime, Phrase.LOOKUP_INTERACTION, Selector.FIRST, resultUser, target, -1, x, y, z, worldId, rbFormat, false, false);
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                }

                resultBuilder.append(timeAgo + " " + tag + " ").append(Phrase.build(Phrase.LOOKUP_CONTAINER, Color.DARK_AQUA + rbFormat + resultUser + Color.WHITE + rbFormat, "x" + resultAmount, Color.DARK_AQUA + rbFormat + target + Color.WHITE, selector)).append("\n");
                PluginChannelListener.getInstance().sendData(commandSender, resultTime, Phrase.LOOKUP_CONTAINER, selector, resultUser, target, resultAmount, x, y, z, worldId, rbFormat, true, tag.contains("+"));
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        StringBuilder worldDisplay = new StringBuilder();
        if (displayWorld) {
            worldDisplay.append("/" + Util.getWorldName(worldId));
        }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        // command
        message.append("|/" + command + " teleport wid:" + worldId + " " + (x + 0.50) + " " + y + " " + (z + 0.50) + "|");

        // chat output
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        // chat output
        message.append(Color.GREY + (italic ? Color.ITALIC : "") + "(x" + x + "/y" + y + "/z" + z + worldDisplay.toString() + ")");

        return message.append(Chat.COMPONENT_TAG_CLOSE).toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        StringBuilder pagination = new StringBuilder();
        if (totalPages > 1) {
            pagination.append(Color.GREY + "(");
            if (page > 3) {
                pagination.append(Color.WHITE + Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_COMMAND + "|/" + command + " l " + 1 + "|" + "1 " + Chat.COMPONENT_TAG_CLOSE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            pagination.append(Color.GREY + "(");
            if (page > 3) {
                pagination.append(Color.WHITE + Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_COMMAND + "|/" + command + " l " + 1 + "|" + "1 " + Chat.COMPONENT_TAG_CLOSE);
                if (page > 4 && totalPages > 7) {
                    pagination.append(Color.GREY + "... ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                pagination.append(Color.WHITE + Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_COMMAND + "|/" + command + " l " + 1 + "|" + "1 " + Chat.COMPONENT_TAG_CLOSE);
                if (page > 4 && totalPages > 7) {
                    pagination.append(Color.GREY + "... ");
                }
                else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                else {
                    pagination.append(Color.GREY + "| ");
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            for (int displayPage = displayStart; displayPage <= displayEnd; displayPage++) {
                if (page != displayPage) {
                    pagination.append(Color.WHITE + Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_COMMAND + "|/" + command + " l " + displayPage + "|" + displayPage + (displayPage < totalPages ? " " : "") + Chat.COMPONENT_TAG_CLOSE);
                }
                else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                else {
                    pagination.append(Color.WHITE + Color.UNDERLINE + displayPage + Color.RESET + (displayPage < totalPages ? " " : ""));
                }
                if (displayPage < displayEnd) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                if (displayPage < displayEnd) {
                    pagination.append(Color.GREY + "| ");
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            if (displayEnd < totalPages) {
                if (displayEnd < (totalPages - 1)) {
                    pagination.append(Color.GREY + "... ");
                }
                else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                else {
                    pagination.append(Color.GREY + "| ");
                }
                if (page != totalPages) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                if (page != totalPages) {
                    pagination.append(Color.WHITE + Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_COMMAND + "|/" + command + " l " + totalPages + "|" + totalPages + Chat.COMPONENT_TAG_CLOSE);
                }
                else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                }
                else {
                    pagination.append(Color.WHITE + Color.UNDERLINE + totalPages);
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }

            pagination.append(Color.GREY + ")");
        }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }

        return message.append(Color.WHITE + backArrow + Color.DARK_AQUA + Phrase.build(Phrase.LOOKUP_PAGE, Color.WHITE + page + "/" + totalPages) + nextArrow + pagination).toString();
    }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            for (String value : checkUsers) {
                if (usersBuilder.length() == 0) {
                    usersBuilder = usersBuilder.append("" + value + "");
                }
                else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (targetCount == 0) {
                        restrictTargets = restrictTargets.append("" + targetName + "");
                    }
                    else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeTargets = excludeTargets.append("" + targetName + "");
                    }
                    else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeUsers = excludeUsers.append("" + excludeUser + "");
                    }
                    else {
```

## IOResource
### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java
    private byte[] sendRegistered() throws IOException {
        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);
        msgOut.writeBoolean(true);

```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        DataInputStream dis = new DataInputStream(in);

        try {
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);

        msgOut.writeInt(4);
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);

        msgOut.writeInt(3);
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);
        msgOut.writeInt(1);
        msgOut.writeLong(timeAgo * 1000);
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);

        msgOut.writeInt(2);
```

## FieldMayBeStatic
### FieldMayBeStatic
Field `networkingProtocolVersion` may be 'static'
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

    public static final String pluginChannel = "coreprotect:handshake";
    private final int networkingProtocolVersion = 1;
    private final Set<UUID> pluginChannelPlayers;
    private static PluginChannelHandshakeListener instance;
```

## UtilityClassWithoutPrivateConstructor
### UtilityClassWithoutPrivateConstructor
Class `PlayerLogoutProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/PlayerLogoutProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.PlayerSessionLogger;

class PlayerLogoutProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, Object object, int time, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `NetworkDebugCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/NetworkDebugCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class NetworkDebugCommand {
    protected static void runCommand(CommandSender player, boolean permission, String[] args) {
        if (!permission || !Config.getGlobal().NETWORK_DEBUG) {
```

### UtilityClassWithoutPrivateConstructor
Class `WorldEditHandler` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/WorldEditHandler.java`
#### Snippet
```java
import net.coreprotect.worldedit.WorldEditLogger;

public class WorldEditHandler {

    protected static Integer[] runWorldEditCommand(CommandSender user) {
```

### UtilityClassWithoutPrivateConstructor
Class `StatusCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class StatusCommand {
    private static ConcurrentHashMap<String, Boolean> alert = new ConcurrentHashMap<>();

```

### UtilityClassWithoutPrivateConstructor
Class `Patch` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class Patch {

    private static boolean patching = false;
```

### UtilityClassWithoutPrivateConstructor
Class `BlockDataInsertProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/BlockDataInsertProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Chat;

class BlockDataInsertProcess {

    static void process(PreparedStatement preparedStmt, Statement statement, int batchCount, Object name, int materialId) {
```

### UtilityClassWithoutPrivateConstructor
Class `BlockPlaceProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/BlockPlaceProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class BlockPlaceProcess {

    static void process(PreparedStatement preparedStmt, PreparedStatement preparedStmtSkulls, int batchCount, Material blockType, int blockData, Material replaceType, int replaceData, int forceData, String user, Object object, String newBlockData, String replacedBlockData) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_10_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_10_0.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

public class __2_10_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApplyCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class ApplyCommand {
    protected static void runCommand(CommandSender user, Command command, boolean permission, String[] args) {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `ListenerHandler` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/listener/ListenerHandler.java`
#### Snippet
```java
import net.coreprotect.paper.listener.PaperChatListener;

public final class ListenerHandler {

    public ListenerHandler(CoreProtect plugin) {
```

### UtilityClassWithoutPrivateConstructor
Class `BlockGroup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

public final class BlockGroup {

    public static Set<Material> TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL));
```

### UtilityClassWithoutPrivateConstructor
Class `NaturalBlockBreakProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/NaturalBlockBreakProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class NaturalBlockBreakProcess {

    static void process(Statement statement, PreparedStatement preparedStmt, int batchCount, int processId, int id, String user, Object object, Material blockType, int blockData, String overrideData) {
```

### UtilityClassWithoutPrivateConstructor
Class `HelpCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/HelpCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class HelpCommand {
    protected static void runCommand(CommandSender player, boolean permission, String[] args) {
        int resultc = args.length;
```

### UtilityClassWithoutPrivateConstructor
Class `EntityInsertProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/EntityInsertProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Chat;

class EntityInsertProcess {

    static void process(PreparedStatement preparedStmt, Statement statement, int batchCount, Object name, int materialId) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_6_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_6_0.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

public class __2_6_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_5_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_5_0.java`
#### Snippet
```java
import net.coreprotect.patch.Patch;

public class __2_5_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `BlockAPI` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/api/BlockAPI.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class BlockAPI {

    public static List<String[]> performLookup(Block block, int offset) {
```

### UtilityClassWithoutPrivateConstructor
Class `HopperPushListener` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/listener/player/HopperPushListener.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public final class HopperPushListener {

    static void processHopperPush(Location location, InventoryHolder sourceHolder, InventoryHolder destinationHolder, ItemStack item) {
```

### UtilityClassWithoutPrivateConstructor
Class `BlockLookup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class BlockLookup {

    public static String performLookup(String command, Statement statement, BlockState block, CommandSender commandSender, int offset, int page, int limit) {
```

### UtilityClassWithoutPrivateConstructor
Class `InteractionLookup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class InteractionLookup {

    public static String performLookup(String command, Statement statement, Block block, CommandSender commandSender, int offset, int page, int limit) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_17_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_17_0.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

public class __2_17_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `ReloadCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/ReloadCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class ReloadCommand {
    protected static void runCommand(final CommandSender player, boolean permission, String[] args) {
        if (permission) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_11_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_11_0.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

public class __2_11_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `MaterialInsertProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/MaterialInsertProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Chat;

class MaterialInsertProcess {

    static void process(PreparedStatement preparedStmt, Statement statement, int batchCount, Object name, int materialId) {
```

### UtilityClassWithoutPrivateConstructor
Class `HopperPullListener` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public final class HopperPullListener {

    static void processHopperPull(Location location, InventoryHolder sourceHolder, InventoryHolder destinationHolder, ItemStack item) {
```

### UtilityClassWithoutPrivateConstructor
Class `SignTextProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/SignTextProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.SignTextLogger;

class SignTextProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, int forceData, String user, Object object, int action, int color) {
```

### UtilityClassWithoutPrivateConstructor
Class `UndoCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/UndoCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class UndoCommand {
    protected static void runCommand(CommandSender user, Command command, boolean permission, String[] args) {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `PlayerCommandProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/PlayerCommandProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.CommandLogger;

class PlayerCommandProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, Object object, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `SignUpdateProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/SignUpdateProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class SignUpdateProcess {

    static void process(Statement statement, Object object, String user, int action, int time) {
```

### UtilityClassWithoutPrivateConstructor
Class `WorldInsertProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/WorldInsertProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Chat;

class WorldInsertProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, Statement statement, Object world, int worldId) {
```

### UtilityClassWithoutPrivateConstructor
Class `EntityKillProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/EntityKillProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class EntityKillProcess {

    static void process(PreparedStatement preparedStmt, PreparedStatement preparedStmtEntities, int batchCount, int processId, int id, Object object, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `StructureGrowthProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/StructureGrowthProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class StructureGrowthProcess {

    static void process(Statement statement, PreparedStatement preparedStmt, int batchCount, int processId, int id, String user, Object object, int replaceBlockCount) {
```

### UtilityClassWithoutPrivateConstructor
Class `SkullUpdateProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/SkullUpdateProcess.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

class SkullUpdateProcess {

    static void process(Statement statement, Object object, int rowId) {
```

### UtilityClassWithoutPrivateConstructor
Class `PlayerKillProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/PlayerKillProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.PlayerKillLogger;

class PlayerKillProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, int id, Object object, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_20_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_20_0.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class __2_20_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_21_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_21_0.java`
#### Snippet
```java
import net.coreprotect.utility.Chat;

public class __2_21_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `ChestTransactionLookup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class ChestTransactionLookup {

    public static String performLookup(String command, Statement statement, Location l, CommandSender commandSender, int page, int limit, boolean exact) {
```

### UtilityClassWithoutPrivateConstructor
Class `InspectCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/InspectCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class InspectCommand {
    protected static void runCommand(CommandSender player, boolean permission, String[] args) {
        if (permission) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_18_1` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_18_1.java`
#### Snippet
```java
import net.coreprotect.patch.Patch;

public class __2_18_1 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `BlockBreakProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/BlockBreakProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class BlockBreakProcess {

    static void process(PreparedStatement preparedStmt, PreparedStatement preparedStmtSkulls, int batchCount, int processId, int id, Material blockType, int blockDataId, Material replaceType, int forceData, String user, Object object, String blockData) {
```

### UtilityClassWithoutPrivateConstructor
Class `PlayerChatProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/PlayerChatProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.ChatLogger;

class PlayerChatProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, Object object, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `CancelCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/CancelCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Color;

public class CancelCommand {
    protected static void runCommand(CommandSender user, Command command, boolean permission, String[] args) {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `ArtInsertProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/ArtInsertProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Chat;

class ArtInsertProcess {

    static void process(PreparedStatement preparedStmt, Statement statement, int batchCount, Object name, int materialId) {
```

### UtilityClassWithoutPrivateConstructor
Class `SignMessageLookup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class SignMessageLookup {

    public static List<String> performLookup(String command, Statement statement, Location l, CommandSender commandSender, int page, int limit) {
```

### UtilityClassWithoutPrivateConstructor
Class `ContainerBreakProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/ContainerBreakProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.ContainerBreakLogger;

class ContainerBreakProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, Material type, String user, Object object) {
```

### UtilityClassWithoutPrivateConstructor
Class `BlockUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/listener/block/BlockUtil.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class BlockUtil {

    public static final int NONE = 0;
```

### UtilityClassWithoutPrivateConstructor
Class `PlayerLoginProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/PlayerLoginProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.UsernameLogger;

class PlayerLoginProcess {

    static void process(Connection connection, PreparedStatement preparedStmt, int batchCount, int processId, int id, Object object, int configSessions, int configUsernames, int time, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `ItemMetaHandler` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class ItemMetaHandler {

    public static String getEnchantmentName(Enchantment enchantment, int level) {
```

### UtilityClassWithoutPrivateConstructor
Class `TeleportCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class TeleportCommand {

    protected static void runCommand(CommandSender player, boolean permission, String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_15_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_15_0.java`
#### Snippet
```java
import net.coreprotect.database.Database;

public class __2_15_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_16_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_16_0.java`
#### Snippet
```java
import net.coreprotect.patch.Patch;

public class __2_16_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_19_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_19_0.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class __2_19_0 {

    protected static boolean patch(Statement statement) {
```

### UtilityClassWithoutPrivateConstructor
Class `__2_18_0` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class __2_18_0 {

    protected static boolean createIndexes = true;
```

### UtilityClassWithoutPrivateConstructor
Class `PlayerLookup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/database/lookup/PlayerLookup.java`
#### Snippet
```java
import net.coreprotect.config.ConfigHandler;

public class PlayerLookup {

    public static boolean playerExists(Connection connection, String user) {
```

### UtilityClassWithoutPrivateConstructor
Class `PlayerInteractionProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/PlayerInteractionProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.PlayerInteractLogger;

class PlayerInteractionProcess {

    static void process(PreparedStatement preparedStmt, int batchCount, String user, Object object, Material type) {
```

### UtilityClassWithoutPrivateConstructor
Class `EntitySpawnProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/EntitySpawnProcess.java`
#### Snippet
```java
import net.coreprotect.utility.entity.EntityUtil;

class EntitySpawnProcess {

    static void process(Statement statement, Object object, int rowId) {
```

### UtilityClassWithoutPrivateConstructor
Class `RollbackUpdateProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/RollbackUpdateProcess.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

class RollbackUpdateProcess {

    static void process(Statement statement, int processId, int id, int action, int table) {
```

### UtilityClassWithoutPrivateConstructor
Class `ContainerTransactionProcess` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/consumer/process/ContainerTransactionProcess.java`
#### Snippet
```java
import net.coreprotect.database.logger.ContainerLogger;

class ContainerTransactionProcess {

    static void process(PreparedStatement preparedStmtContainer, PreparedStatement preparedStmtItems, int batchCount, int processId, int id, Material type, int forceData, String user, Object object) {
```

### UtilityClassWithoutPrivateConstructor
Class `RollbackRestoreCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class RollbackRestoreCommand {
    protected static void runCommand(CommandSender player, Command command, boolean permission, String[] args, Location argLocation, long forceStart, long forceEnd) {
        Location lo = (argLocation != null ? argLocation : CommandHandler.parseLocation(player, args));
```

### UtilityClassWithoutPrivateConstructor
Class `LookupCommand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
import net.coreprotect.utility.Util;

public class LookupCommand {
    protected static void runCommand(CommandSender player, Command command, boolean permission, String[] args) {
        int resultc = args.length;
```

## SimplifyStreamApiCallChains
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                else if (argument0.equals("l") || argument0.equals("lookup") || argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro") || argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")) {
                    List<String> completions = new ArrayList<>(filterParams(true, argument0, argument1, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer));
                    completions.addAll(Bukkit.getOnlinePlayers().stream().filter(player -> player.getName().toLowerCase(Locale.ROOT).startsWith(argument1)).map(Player::getName).collect(Collectors.toList()));
                    return StringUtil.copyPartialMatches(argument1, completions, new ArrayList<>(completions.size()));
                }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                else if (argument0.equals("l") || argument0.equals("lookup") || argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro") || argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")) {
                    List<String> completions = new ArrayList<>(filterParams(true, argument0, argument1, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer));
                    completions.addAll(Bukkit.getOnlinePlayers().stream().filter(player -> player.getName().toLowerCase(Locale.ROOT).startsWith(argument1)).map(Player::getName).collect(Collectors.toList()));
                    return StringUtil.copyPartialMatches(argument1, completions, new ArrayList<>(completions.size()));
                }
```

## ParameterCanBeLocal
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java

public class ApplyCommand {
    protected static void runCommand(CommandSender user, Command command, boolean permission, String[] args) {
        try {
            if (ConfigHandler.lastRollback.get(user.getName()) != null) {
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `src/main/java/net/coreprotect/command/UndoCommand.java`
#### Snippet
```java

public class UndoCommand {
    protected static void runCommand(CommandSender user, Command command, boolean permission, String[] args) {
        try {
            if (ConfigHandler.lastRollback.get(user.getName()) != null) {
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `src/main/java/net/coreprotect/command/CancelCommand.java`
#### Snippet
```java

public class CancelCommand {
    protected static void runCommand(CommandSender user, Command command, boolean permission, String[] args) {
        try {
            if (ConfigHandler.lastRollback.get(user.getName()) != null) {
```

## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'consumerStrings' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, String[]>> consumerUsers = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, String>> consumerStrings = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, Object[]>> consumerSigns = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'consumerObjectList' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, List<Object[]>>> consumerObjectArrayList = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, List<Object>>> consumerObjectList = new ConcurrentHashMap<>(4, 0.75f, 2);

    public static ConcurrentHashMap<Integer, Map<Integer, Object>> consumerObjects = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'consumerSigns' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, String>> consumerStrings = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, Object[]>> consumerSigns = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, ItemStack[]>> consumerContainers = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'consumerObjectArrayList' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, List<BlockState>>> consumerBlockList = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, List<Object[]>>> consumerObjectArrayList = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, List<Object>>> consumerObjectList = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'consumerContainers' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, Object[]>> consumerSigns = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, ItemStack[]>> consumerContainers = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, Object>> consumerInventories = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'consumerInventories' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, ItemStack[]>> consumerContainers = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, Object>> consumerInventories = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, List<BlockState>>> consumerBlockList = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'consumerBlockList' is still used
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    public static ConcurrentHashMap<Integer, Map<Integer, Object>> consumerInventories = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, List<BlockState>>> consumerBlockList = new ConcurrentHashMap<>(4, 0.75f, 2);
    @Deprecated
    public static ConcurrentHashMap<Integer, Map<Integer, List<Object[]>>> consumerObjectArrayList = new ConcurrentHashMap<>(4, 0.75f, 2);
```

### DeprecatedIsStillUsed
Deprecated member 'getData' is still used
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        @Deprecated
        public int getData() {
            return Integer.parseInt(parse[6]);
        }
```

## PatternVariableCanBeUsed
### PatternVariableCanBeUsed
Variable 'location' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/PlayerLogoutProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, int batchCount, Object object, int time, String user) {
        if (object instanceof Location) {
            Location location = (Location) object;
            PlayerSessionLogger.log(preparedStmt, batchCount, user, location, time, 0);
        }
```

### PatternVariableCanBeUsed
Variable 'arrowEntity' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/PlayerPickupArrowListener.java`
#### Snippet
```java

        if (arrow instanceof Arrow) {
            Arrow arrowEntity = (Arrow) arrow;
            PotionData data = arrowEntity.getBasePotionData();
            if (data.getType() != PotionType.UNCRAFTABLE) {
```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/BlockPlaceProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, PreparedStatement preparedStmtSkulls, int batchCount, Material blockType, int blockData, Material replaceType, int replaceData, int forceData, String user, Object object, String newBlockData, String replacedBlockData) {
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            List<Object> meta = Util.processMeta(block);
            if (blockType.equals(Material.SKELETON_SKULL) || blockType.equals(Material.SKELETON_WALL_SKULL) || blockType.equals(Material.WITHER_SKELETON_SKULL) || blockType.equals(Material.WITHER_SKELETON_WALL_SKULL) || blockType.equals(Material.ZOMBIE_HEAD) || blockType.equals(Material.ZOMBIE_WALL_HEAD) || blockType.equals(Material.PLAYER_HEAD) || blockType.equals(Material.PLAYER_WALL_HEAD) || blockType.equals(Material.CREEPER_HEAD) || blockType.equals(Material.CREEPER_WALL_HEAD) || blockType.equals(Material.DRAGON_HEAD) || blockType.equals(Material.DRAGON_WALL_HEAD)) {
```

### PatternVariableCanBeUsed
Variable 'itemFrame' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/HangingPlaceListener.java`
#### Snippet
```java
            if (entity instanceof ItemFrame) {
                material = BukkitAdapter.ADAPTER.getFrameType(entity);
                ItemFrame itemFrame = (ItemFrame) entity;
                blockData = "FACING=" + itemFrame.getFacing().name();
                artId = 0;
```

### PatternVariableCanBeUsed
Variable 'state' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

                    if (inventoryHolder instanceof BlockState) {
                        BlockState state = (BlockState) inventoryHolder;
                        type = state.getType();
                        if (BlockGroup.CONTAINERS.contains(type)) {
```

### PatternVariableCanBeUsed
Variable 'state' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
                    }
                    else if (inventoryHolder instanceof DoubleChest) {
                        DoubleChest state = (DoubleChest) inventoryHolder;
                        playerLocation = state.getLocation();
                    }
```

### PatternVariableCanBeUsed
Variable 'inventoryHolder' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

                if (BlockGroup.CONTAINERS.contains(type) && blockState instanceof InventoryHolder) {
                    InventoryHolder inventoryHolder = (InventoryHolder) blockState;
                    return onInventoryInteract(user, inventoryHolder.getInventory(), inventoryData, null, location, false);
                }
```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/NaturalBlockBreakProcess.java`
#### Snippet
```java
    static void process(Statement statement, PreparedStatement preparedStmt, int batchCount, int processId, int id, String user, Object object, Material blockType, int blockData, String overrideData) {
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            Map<Integer, List<BlockState>> blockLists = Consumer.consumerBlockList.get(processId);
            if (blockLists.get(id) != null) {
```

### PatternVariableCanBeUsed
Variable 'location' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/ItemTransactionProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, int forceData, int time, int offset, String user, Object object) {
        if (object instanceof Location) {
            Location location = (Location) object;
            String loggingItemId = user.toLowerCase(Locale.ROOT) + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ();

```

### PatternVariableCanBeUsed
Variable 'skull' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/logger/SkullPlaceLogger.java`
#### Snippet
```java

            if (block instanceof Skull) {
                Skull skull = (Skull) block;
                String skullOwner = "";
                if (skull.hasOwner()) {
```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java

                if (damager instanceof Player) {
                    Player player = (Player) damager;
                    user = player.getName();
                    logDrops = player.getGameMode() != GameMode.CREATIVE;
```

### PatternVariableCanBeUsed
Variable 'arrow' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                }
                else if (damager instanceof AbstractArrow) {
                    AbstractArrow arrow = (AbstractArrow) damager;
                    ProjectileSource source = arrow.getShooter();

```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java

                    if (source instanceof Player) {
                        Player player = (Player) source;
                        user = player.getName();
                    }
```

### PatternVariableCanBeUsed
Variable 'frame' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                if (!event.isCancelled() && !inspecting) {
                    if (entity instanceof ItemFrame && Config.getConfig(entityLocation.getWorld()).ITEM_TRANSACTIONS) {
                        ItemFrame frame = (ItemFrame) entity;
                        if (frame.getItem().getType() != Material.AIR) {
                            PlayerInteractEntityListener.queueFrameTransaction(user, frame, logDrops);
```

### PatternVariableCanBeUsed
Variable 'location' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/SignTextProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, int forceData, String user, Object object, int action, int color) {
        if (object instanceof Location) {
            Location location = (Location) object;
            Map<Integer, Object[]> signs = Consumer.consumerSigns.get(processId);
            if (signs.get(id) != null) {
```

### PatternVariableCanBeUsed
Variable 'data' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/PlayerCommandProcess.java`
#### Snippet
```java
        }

        Object[] data = (Object[]) object;
        if (data[1] instanceof Location) {
            Map<Integer, String> strings = Consumer.consumerStrings.get(processId);
```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/SignUpdateProcess.java`
#### Snippet
```java
         */
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            int x = block.getX();
            int y = block.getY();
```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
        boolean inspecting = false;
        if (event.getRemover() instanceof Player) {
            Player player = (Player) event.getRemover();

            if (ConfigHandler.inspecting.get(player.getName()) != null) {
```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
            if (remover != null) {
                if (remover instanceof Player) {
                    Player player = (Player) remover;
                    culprit = player.getName();
                    logDrops = player.getGameMode() != GameMode.CREATIVE;
```

### PatternVariableCanBeUsed
Variable 'itemframe' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
            if (entity instanceof ItemFrame) {
                material = BukkitAdapter.ADAPTER.getFrameType(entity);
                ItemFrame itemframe = (ItemFrame) entity;
                blockData = "FACING=" + itemframe.getFacing().name();

```

### PatternVariableCanBeUsed
Variable 'lightable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java
                replacedBlock = block.getState();
                if (forceBlockData instanceof Lightable) {
                    Lightable lightable = (Lightable) forceBlockData;
                    lightable.setLit(true);
                }
```

### PatternVariableCanBeUsed
Variable 'dispenser' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockDispenseListener.java`
#### Snippet
```java
            ItemStack item = event.getItem();
            if (item != null && blockData instanceof Dispenser) {
                Dispenser dispenser = (Dispenser) blockData;
                Material material = item.getType();
                Material type = Material.AIR;
```

### PatternVariableCanBeUsed
Variable 'skull' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/statement/SkullStatement.java`
#### Snippet
```java
            }

            Skull skull = (Skull) block;
            ResultSet resultSet = statement.executeQuery(query);

```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/StructureGrowthProcess.java`
#### Snippet
```java
    static void process(Statement statement, PreparedStatement preparedStmt, int batchCount, int processId, int id, String user, Object object, int replaceBlockCount) {
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            Map<Integer, List<BlockState>> blockLists = Consumer.consumerBlockList.get(processId);
            if (blockLists.get(id) != null) {
```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/SkullUpdateProcess.java`
#### Snippet
```java
         */
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            String query = "SELECT owner FROM " + ConfigHandler.prefix + "skull WHERE rowid='" + rowId + "' LIMIT 0, 1";
            SkullStatement.getData(statement, block, query);
```

### PatternVariableCanBeUsed
Variable 'sign' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java
            }

            Sign sign = (Sign) block;
            ResultSet resultSet = statement.executeQuery(query);

```

### PatternVariableCanBeUsed
Variable 'hanging' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                        Entity entity = block.getWorld().spawn(spawnBlock.getLocation(), itemFrame);
                        if (entity instanceof ItemFrame) {
                            ItemFrame hanging = (ItemFrame) entity;
                            hanging.teleport(block.getWorld().getBlockAt(x, y, z).getLocation());
                            hanging.setFacingDirection(faceSet, true);
```

### PatternVariableCanBeUsed
Variable 'mobSpawner' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
    protected static void queueBlockBreak(String user, BlockState block, Material type, String blockData, Material breakType, int extraData, int blockNumber) {
        if (type == Material.SPAWNER && block instanceof CreatureSpawner) { // Mob spawner
            CreatureSpawner mobSpawner = (CreatureSpawner) block;
            extraData = Util.getSpawnerType(mobSpawner.getSpawnedType());
        }
```

### PatternVariableCanBeUsed
Variable 'mobSpawner' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java

        if (type == Material.SPAWNER && blockLocation instanceof CreatureSpawner) { // Mob spawner
            CreatureSpawner mobSpawner = (CreatureSpawner) blockLocation;
            data = Util.getSpawnerType(mobSpawner.getSpawnedType());
            forceData = 1;
```

### PatternVariableCanBeUsed
Variable 'piglin' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
    public boolean setEntityMeta(Entity entity, Object value, int count) {
        if (entity instanceof Piglin) {
            Piglin piglin = (Piglin) entity;
            if (count == 0) {
                boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'zoglin' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        }
        else if (entity instanceof Zoglin) {
            Zoglin zoglin = (Zoglin) entity;
            if (count == 0) {
                boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'directional' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
    public boolean isAttached(Block block, Block scanBlock, BlockData blockData, int scanMin) {
        if (blockData instanceof Directional && blockData instanceof FaceAttachable) {
            Directional directional = (Directional) blockData;
            FaceAttachable faceAttachable = (FaceAttachable) blockData;

```

### PatternVariableCanBeUsed
Variable 'faceAttachable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        if (blockData instanceof Directional && blockData instanceof FaceAttachable) {
            Directional directional = (Directional) blockData;
            FaceAttachable faceAttachable = (FaceAttachable) blockData;

            boolean scanButton = false;
```

### PatternVariableCanBeUsed
Variable 'piglin' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
    public boolean getEntityMeta(LivingEntity entity, List<Object> info) {
        if (entity instanceof Piglin) {
            Piglin piglin = (Piglin) entity;
            info.add(piglin.isBaby());
        }
```

### PatternVariableCanBeUsed
Variable 'zoglin' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        }
        else if (entity instanceof Zoglin) {
            Zoglin zoglin = (Zoglin) entity;
            info.add(zoglin.isBaby());
        }
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java
    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot) {
        if (itemMeta instanceof SuspiciousStewMeta) {
            SuspiciousStewMeta meta = (SuspiciousStewMeta) itemMeta;
            SuspiciousStewMeta subMeta = meta.clone();
            meta.clearCustomEffects();
```

### PatternVariableCanBeUsed
Variable 'bee' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java
    public boolean getEntityMeta(LivingEntity entity, List<Object> info) {
        if (entity instanceof Bee) {
            Bee bee = (Bee) entity;
            info.add(bee.getAnger());
            info.add(bee.hasNectar());
```

### PatternVariableCanBeUsed
Variable 'bee' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java
    public boolean setEntityMeta(Entity entity, Object value, int count) {
        if (entity instanceof Bee) {
            Bee bee = (Bee) entity;
            if (count == 0) {
                int set = (int) value;
```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/BlockBreakProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, PreparedStatement preparedStmtSkulls, int batchCount, int processId, int id, Material blockType, int blockDataId, Material replaceType, int forceData, String user, Object object, String blockData) {
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            List<Object> meta = Util.processMeta(block);
            if (block instanceof Skull) {
```

### PatternVariableCanBeUsed
Variable 'commandBlock' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        try {
            if (block instanceof CommandBlock) {
                CommandBlock commandBlock = (CommandBlock) block;
                String command = commandBlock.getCommand();
                if (command.length() > 0) {
```

### PatternVariableCanBeUsed
Variable 'banner' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            else if (block instanceof Banner) {
                Banner banner = (Banner) block;
                meta.add(banner.getBaseColor());
                List<Pattern> patterns = banner.getPatterns();
```

### PatternVariableCanBeUsed
Variable 'shulkerBox' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            else if (block instanceof ShulkerBox) {
                ShulkerBox shulkerBox = (ShulkerBox) block;
                ItemStack[] inventory = shulkerBox.getSnapshotInventory().getStorageContents();
                int slot = 0;
```

### PatternVariableCanBeUsed
Variable 'data' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/PlayerChatProcess.java`
#### Snippet
```java
        }

        Object[] data = (Object[]) object;
        if (data[1] instanceof Location) {
            Map<Integer, String> strings = Consumer.consumerStrings.get(processId);
```

### PatternVariableCanBeUsed
Variable 'axolotl' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    public boolean getEntityMeta(LivingEntity entity, List<Object> info) {
        if (entity instanceof Axolotl) {
            Axolotl axolotl = (Axolotl) entity;
            info.add(axolotl.getVariant());
        }
```

### PatternVariableCanBeUsed
Variable 'goat' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        }
        else if (entity instanceof Goat) {
            Goat goat = (Goat) entity;
            info.add(goat.isScreaming());
        }
```

### PatternVariableCanBeUsed
Variable 'axolotl' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    public boolean setEntityMeta(Entity entity, Object value, int count) {
        if (entity instanceof Axolotl) {
            Axolotl axolotl = (Axolotl) entity;
            if (count == 0) {
                org.bukkit.entity.Axolotl.Variant set = (org.bukkit.entity.Axolotl.Variant) value;
```

### PatternVariableCanBeUsed
Variable 'goat' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        }
        else if (entity instanceof Goat) {
            Goat goat = (Goat) entity;
            if (count == 0) {
                boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'pointedDripstone' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    public boolean isAttached(Block block, Block scanBlock, BlockData blockData, int scanMin) {
        if (blockData instanceof PointedDripstone) {
            PointedDripstone pointedDripstone = (PointedDripstone) blockData;
            BlockFace blockFace = pointedDripstone.getVerticalDirection();
            boolean adjacent = scanBlock.getRelative(blockFace.getOppositeFace()).getLocation().equals(block.getLocation());
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot) {
        if (itemMeta instanceof BundleMeta) {
            BundleMeta meta = (BundleMeta) itemMeta;
            BundleMeta subMeta = (BundleMeta) meta.clone();
            meta.setItems(null);
```

### PatternVariableCanBeUsed
Variable 'location' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/ContainerBreakProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, int batchCount, int processId, int id, Material type, String user, Object object) {
        if (object instanceof Location) {
            Location location = (Location) object;
            Map<Integer, ItemStack[]> containers = Consumer.consumerContainers.get(processId);
            if (containers.get(id) != null) {
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
            BlockData blockData = block.getBlockData();
            if (blockData instanceof Waterlogged) {
                Waterlogged waterlogged = (Waterlogged) blockData;
                if (waterlogged.isWaterlogged()) {
                    type = Material.WATER;
```

### PatternVariableCanBeUsed
Variable 'levelled' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java

                if (blockData instanceof Levelled) {
                    Levelled levelled = (Levelled) blockData;
                    int waterLevel = levelled.getLevel() + 1;
                    if (waterLevel > 8) {
```

### PatternVariableCanBeUsed
Variable 'enderCrystal' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                    for (Entity entity : locationFinal.getChunk().getEntities()) {
                                        if (entity instanceof EnderCrystal && entity.getLocation().getBlockX() == locationFinal.getBlockX() && entity.getLocation().getBlockY() == locationFinal.getBlockY() && entity.getLocation().getBlockZ() == locationFinal.getBlockZ()) {
                                            EnderCrystal enderCrystal = (EnderCrystal) entity;
                                            showingBottom = enderCrystal.isShowingBottom() ? 1 : 0;
                                            blockExists = true;
```

### PatternVariableCanBeUsed
Variable 'sign' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            if (blockFinal instanceof Sign && player.getGameMode() != GameMode.CREATIVE) {
                                Thread.sleep(1500);
                                Sign sign = (Sign) blockFinal;
                                BukkitAdapter.ADAPTER.sendSignChange(player, sign);
                            }
```

### PatternVariableCanBeUsed
Variable 'bed' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
            /* Check if clicking top half of bed */
            if (checkBlockData instanceof Bed) {
                Bed bed = (Bed) checkBlockData;
                if (bed.getPart().equals(Part.HEAD)) {
                    checkBlock = event.getClickedBlock().getRelative(bed.getFacing().getOppositeFace()).getState();
```

### PatternVariableCanBeUsed
Variable 'doubleChest' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                            if (inventoryHolder instanceof DoubleChest) {
                                DoubleChest doubleChest = (DoubleChest) inventoryHolder;
                                location = doubleChest.getLocation();
                            }
```

### PatternVariableCanBeUsed
Variable 'frame' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByBlockListener.java`
#### Snippet
```java

        if (entity instanceof ItemFrame && Config.getConfig(entity.getWorld()).ITEM_TRANSACTIONS) {
            ItemFrame frame = (ItemFrame) entity;
            if (frame.getItem().getType() != Material.AIR) {
                PlayerInteractEntityListener.queueFrameTransaction(user, frame, false);
```

### PatternVariableCanBeUsed
Variable 'itemframe' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/HangingBreakListener.java`
#### Snippet
```java
                if (entity instanceof ItemFrame) {
                    material = BukkitAdapter.ADAPTER.getFrameType(entity);
                    ItemFrame itemframe = (ItemFrame) entity;
                    blockData = "FACING=" + itemframe.getFacing().name();

```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/PlayerBucketFillListener.java`
#### Snippet
```java
            BlockData blockData = block.getBlockData();
            if (blockData instanceof Waterlogged) {
                Waterlogged waterlogged = (Waterlogged) blockData;
                if (waterlogged.isWaterlogged()) {
                    type = Material.WATER;
```

### PatternVariableCanBeUsed
Variable 'blockState' can be replaced with pattern variable
in `src/main/java/net/coreprotect/api/QueueLookup.java`
#### Snippet
```java
                    String blockData = (String) data[7];
                    String user = userData[0];
                    BlockState blockState = (BlockState) objectData;
                    Location location = blockState.getLocation();
                    int wid = Util.getWorldId(location.getWorld().getName());
```

### PatternVariableCanBeUsed
Variable 'enchantmentStorageEngine' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

        if (itemMeta instanceof EnchantmentStorageMeta) {
            EnchantmentStorageMeta enchantmentStorageEngine = (EnchantmentStorageMeta) itemMeta;
            return enchantmentStorageEngine.getStoredEnchants();
        }
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

            if (itemMeta instanceof LeatherArmorMeta) {
                LeatherArmorMeta meta = (LeatherArmorMeta) itemMeta;
                LeatherArmorMeta subMeta = meta.clone();

```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
            }
            else if (itemMeta instanceof PotionMeta) {
                PotionMeta meta = (PotionMeta) itemMeta;
                PotionMeta subMeta = meta.clone();
                meta.setColor(null);
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
            }
            else if (itemMeta instanceof FireworkMeta) {
                FireworkMeta meta = (FireworkMeta) itemMeta;
                FireworkMeta subMeta = meta.clone();
                meta.clearEffects();
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
            }
            else if (itemMeta instanceof FireworkEffectMeta) {
                FireworkEffectMeta meta = (FireworkEffectMeta) itemMeta;
                FireworkEffectMeta subMeta = meta.clone();
                meta.setEffect(null);
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
            }
            else if (itemMeta instanceof BannerMeta) {
                BannerMeta meta = (BannerMeta) itemMeta;
                BannerMeta subMeta = (BannerMeta) meta.clone();
                meta.setPatterns(new ArrayList<>());
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
            }
            else if (itemMeta instanceof CrossbowMeta) {
                CrossbowMeta meta = (CrossbowMeta) itemMeta;
                CrossbowMeta subMeta = (CrossbowMeta) meta.clone();
                meta.setChargedProjectiles(null);
```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
            }
            else if (itemMeta instanceof MapMeta) {
                MapMeta meta = (MapMeta) itemMeta;
                MapMeta subMeta = meta.clone();
                meta.setColor(null);
```

### PatternVariableCanBeUsed
Variable 'frame' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/player/PlayerInteractEntityListener.java`
#### Snippet
```java
        final Entity entity = event.getRightClicked(); // change item in ItemFrame, etc
        if (entity instanceof ItemFrame) {
            ItemFrame frame = (ItemFrame) entity;
            Material handType = Material.AIR;
            ItemStack mainHand = player.getInventory().getItemInMainHand();
```

### PatternVariableCanBeUsed
Variable 'ageable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                if (entity instanceof Ageable) {
                    int count = 0;
                    Ageable ageable = (Ageable) entity;
                    for (Object value : age) {
                        if (count == 0) {
```

### PatternVariableCanBeUsed
Variable 'tameable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                if (entity instanceof Tameable) {
                    int count = 0;
                    Tameable tameable = (Tameable) entity;
                    for (Object value : tame) {
                        if (count == 0) {
```

### PatternVariableCanBeUsed
Variable 'attributable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                }
                if (entity instanceof Attributable && list.size() >= 6) {
                    Attributable attributable = (Attributable) entity;
                    @SuppressWarnings("unchecked")
                    List<Object> attributes = (List<Object>) list.get(5);
```

### PatternVariableCanBeUsed
Variable 'livingEntity' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java

                if (entity instanceof LivingEntity && list.size() >= 7) {
                    LivingEntity livingEntity = (LivingEntity) entity;
                    @SuppressWarnings("unchecked")
                    List<Object> details = (List<Object>) list.get(6);
```

### PatternVariableCanBeUsed
Variable 'creeper' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                for (Object value : data) {
                    if (entity instanceof Creeper) {
                        Creeper creeper = (Creeper) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'enderman' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Enderman) {
                        Enderman enderman = (Enderman) entity;
                        if (count == 1) {
                            String blockDataString = (String) value;
```

### PatternVariableCanBeUsed
Variable 'irongolem' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof IronGolem) {
                        IronGolem irongolem = (IronGolem) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'cat' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Cat) {
                        Cat cat = (Cat) entity;
                        if (count == 0) {
                            Cat.Type set = (Cat.Type) value;
```

### PatternVariableCanBeUsed
Variable 'fox' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Fox) {
                        Fox fox = (Fox) entity;
                        if (count == 0) {
                            Fox.Type set = (Fox.Type) value;
```

### PatternVariableCanBeUsed
Variable 'panda' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Panda) {
                        Panda panda = (Panda) entity;
                        if (count == 0) {
                            Gene set = (Gene) value;
```

### PatternVariableCanBeUsed
Variable 'pig' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Pig) {
                        Pig pig = (Pig) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'sheep' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Sheep) {
                        Sheep sheep = (Sheep) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'mushroomCow' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof MushroomCow) {
                        MushroomCow mushroomCow = (MushroomCow) entity;
                        if (count == 0) {
                            MushroomCow.Variant set = (MushroomCow.Variant) value;
```

### PatternVariableCanBeUsed
Variable 'slime' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Slime) {
                        Slime slime = (Slime) entity;
                        if (count == 0) {
                            int set = (Integer) value;
```

### PatternVariableCanBeUsed
Variable 'parrot' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Parrot) {
                        Parrot parrot = (Parrot) entity;
                        if (count == 0) {
                            Variant set = (Variant) value;
```

### PatternVariableCanBeUsed
Variable 'tropicalFish' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof TropicalFish) {
                        TropicalFish tropicalFish = (TropicalFish) entity;
                        if (count == 0) {
                            DyeColor set = (DyeColor) value;
```

### PatternVariableCanBeUsed
Variable 'phantom' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Phantom) {
                        Phantom phantom = (Phantom) entity;
                        if (count == 0) {
                            int set = (Integer) value;
```

### PatternVariableCanBeUsed
Variable 'abstractVillager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof AbstractVillager) {
                        AbstractVillager abstractVillager = (AbstractVillager) entity;
                        if (count == 0) {
                            if (abstractVillager instanceof Villager) {
```

### PatternVariableCanBeUsed
Variable 'villager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        if (count == 0) {
                            if (abstractVillager instanceof Villager) {
                                Villager villager = (Villager) abstractVillager;
                                Profession set = (Profession) value;
                                villager.setProfession(set);
```

### PatternVariableCanBeUsed
Variable 'villager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        else if (count == 1) {
                            if (abstractVillager instanceof Villager && value instanceof Villager.Type) {
                                Villager villager = (Villager) abstractVillager;
                                Villager.Type set = (Villager.Type) value;
                                villager.setVillagerType(set);
```

### PatternVariableCanBeUsed
Variable 'set' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            if (abstractVillager instanceof Villager && value instanceof Villager.Type) {
                                Villager villager = (Villager) abstractVillager;
                                Villager.Type set = (Villager.Type) value;
                                villager.setVillagerType(set);
                            }
```

### PatternVariableCanBeUsed
Variable 'raider' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Raider) {
                        Raider raider = (Raider) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'spellcaster' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java

                        if (entity instanceof Spellcaster && count == 1) {
                            Spellcaster spellcaster = (Spellcaster) entity;
                            Spell set = (Spell) value;
                            spellcaster.setSpell(set);
```

### PatternVariableCanBeUsed
Variable 'wolf' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Wolf) {
                        Wolf wolf = (Wolf) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'zombieVillager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof ZombieVillager) {
                        ZombieVillager zombieVillager = (ZombieVillager) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'zombie' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof Zombie) {
                        Zombie zombie = (Zombie) entity;
                        if (count == 0) {
                            boolean set = (Boolean) value;
```

### PatternVariableCanBeUsed
Variable 'abstractHorse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                    }
                    else if (entity instanceof AbstractHorse) {
                        AbstractHorse abstractHorse = (AbstractHorse) entity;
                        if (count == 0 && value != null) {
                            // deprecated
```

### PatternVariableCanBeUsed
Variable 'chestedHorse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            boolean set = (Boolean) value;
                            if (entity instanceof ChestedHorse) {
                                ChestedHorse chestedHorse = (ChestedHorse) entity;
                                chestedHorse.setCarryingChest(set);
                            }
```

### PatternVariableCanBeUsed
Variable 'horse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            org.bukkit.entity.Horse.Color set = (org.bukkit.entity.Horse.Color) value;
                            if (entity instanceof Horse) {
                                Horse horse = (Horse) entity;
                                horse.setColor(set);
                            }
```

### PatternVariableCanBeUsed
Variable 'horse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        }
                        if (entity instanceof Horse) {
                            Horse horse = (Horse) entity;
                            if (count == 8) {
                                if (value != null) {
```

### PatternVariableCanBeUsed
Variable 'leatherArmorMeta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                                    ItemMeta itemMeta = armor.getItemMeta();
                                    if (itemMeta instanceof LeatherArmorMeta) {
                                        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemMeta;
                                        leatherArmorMeta.setColor(set);
                                        armor.setItemMeta(leatherArmorMeta);
```

### PatternVariableCanBeUsed
Variable 'llama' can be replaced with pattern variable
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            }
                            if (entity instanceof Llama) {
                                Llama llama = (Llama) entity;
                                if (count == 8) {
                                    if (value != null) {
```

### PatternVariableCanBeUsed
Variable 'directional' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
        BlockData blockData = scanBlock.getBlockData();
        if (blockData instanceof Directional && !(blockData instanceof Bisected) && scanMin != BlockUtil.BOTTOM && scanMin != BlockUtil.TOP) {
            Directional directional = (Directional) blockData;
            BlockFace blockFace = directional.getFacing();
            if (blockData instanceof Bed) {
```

### PatternVariableCanBeUsed
Variable 'multipleFacing' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
        }
        else if (blockData instanceof MultipleFacing) {
            MultipleFacing multipleFacing = (MultipleFacing) blockData;
            for (BlockFace blockFace : multipleFacing.getFaces()) {
                boolean adjacent = scanBlock.getRelative(blockFace).getLocation().equals(block.getLocation());
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                BlockData blockDataB1 = blockState.getBlockData();
                if (blockDataB1 instanceof Waterlogged) {
                    Waterlogged waterlogged = (Waterlogged) blockDataB1;
                    if (waterlogged.isWaterlogged()) {
                        Queue.queueBlockPlace(user, blockState, blockLog.getType(), null, Material.WATER, -1, 0, null);
```

### PatternVariableCanBeUsed
Variable 'directional' can be replaced with pattern variable
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                                if (newBlockData != null) {
                                    if (validatedMaterial == Material.OAK_WALL_SIGN && newBlockData instanceof Directional) {
                                        Directional directional = (Directional) newBlockData;
                                        BlockFace newDirection = getLegacyDirection(blockData);
                                        directional.setFacing(newDirection);
```

### PatternVariableCanBeUsed
Variable 'rotatable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                                    }
                                    if (validatedMaterial == Material.SKELETON_SKULL && newBlockData instanceof Rotatable) {
                                        Rotatable rotatable = (Rotatable) newBlockData;
                                        BlockFace newRotation = getLegacyRotation(blockData);
                                        rotatable.setRotation(newRotation);
```

### PatternVariableCanBeUsed
Variable 'block' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/PlayerInteractionProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmt, int batchCount, String user, Object object, Material type) {
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            PlayerInteractLogger.log(preparedStmt, batchCount, user, block, type);
        }
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java

                if (oldBlockData instanceof Waterlogged) {
                    Waterlogged waterlogged = (Waterlogged) oldBlockData;
                    if (waterlogged.isWaterlogged()) {
                        Queue.queueBlockPlace(actor.getName(), newBlock, newType, null, Material.WATER, -1, 0, null);
```

### PatternVariableCanBeUsed
Variable 'bisected' can be replaced with pattern variable
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                }
                else if (oldBlockData instanceof Bisected) {
                    Bisected bisected = (Bisected) oldBlockData;
                    Location bisectLocation = location.clone();
                    if (bisected.getHalf() == Half.TOP) {
```

### PatternVariableCanBeUsed
Variable 'location' can be replaced with pattern variable
in `src/main/java/net/coreprotect/consumer/process/ContainerTransactionProcess.java`
#### Snippet
```java
    static void process(PreparedStatement preparedStmtContainer, PreparedStatement preparedStmtItems, int batchCount, int processId, int id, Material type, int forceData, String user, Object object) {
        if (object instanceof Location) {
            Location location = (Location) object;
            Map<Integer, Object> inventories = Consumer.consumerInventories.get(processId);
            if (inventories.get(id) != null) {
```

### PatternVariableCanBeUsed
Variable 'bisected' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                            BlockData blockData = scanBlock.getBlockData();
                            if (blockData instanceof Bisected) {
                                Bisected bisected = (Bisected) blockData;
                                Location bisectLocation = location.clone();
                                if (bisected.getHalf() == Half.TOP) {
```

### PatternVariableCanBeUsed
Variable 'attack' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        if (damage instanceof EntityDamageByEntityEvent) {
            EntityDamageByEntityEvent attack = (EntityDamageByEntityEvent) damage;
            Entity attacker = attack.getDamager();

```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

            if (attacker instanceof Player) {
                Player player = (Player) attacker;
                e = player.getName();
            }
```

### PatternVariableCanBeUsed
Variable 'arrow' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (attacker instanceof AbstractArrow) {
                AbstractArrow arrow = (AbstractArrow) attacker;
                ProjectileSource shooter = arrow.getShooter();

```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                if (shooter instanceof Player) {
                    Player player = (Player) shooter;
                    e = player.getName();
                }
```

### PatternVariableCanBeUsed
Variable 'potion' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (attacker instanceof ThrownPotion) {
                ThrownPotion potion = (ThrownPotion) attacker;
                ProjectileSource shooter = potion.getShooter();

```

### PatternVariableCanBeUsed
Variable 'player' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                if (shooter instanceof Player) {
                    Player player = (Player) shooter;
                    e = player.getName();
                }
```

### PatternVariableCanBeUsed
Variable 'ageable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

            if (entity instanceof Ageable) {
                Ageable ageable = (Ageable) entity;
                age.add(ageable.getAge());
                age.add(ageable.getAgeLock());
```

### PatternVariableCanBeUsed
Variable 'tameable' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

            if (entity instanceof Tameable) {
                Tameable tameable = (Tameable) entity;
                tame.add(tameable.isTamed());
                if (tameable.isTamed()) {
```

### PatternVariableCanBeUsed
Variable 'creeper' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

            if (entity instanceof Creeper) {
                Creeper creeper = (Creeper) entity;
                info.add(creeper.isPowered());
            }
```

### PatternVariableCanBeUsed
Variable 'enderman' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Enderman) {
                Enderman enderman = (Enderman) entity;
                info.add(null);

```

### PatternVariableCanBeUsed
Variable 'irongolem' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof IronGolem) {
                IronGolem irongolem = (IronGolem) entity;
                info.add(irongolem.isPlayerCreated());
            }
```

### PatternVariableCanBeUsed
Variable 'cat' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Cat) {
                Cat cat = (Cat) entity;
                info.add(cat.getCatType());
                info.add(cat.getCollarColor());
```

### PatternVariableCanBeUsed
Variable 'fox' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Fox) {
                Fox fox = (Fox) entity;
                info.add(fox.getFoxType());
                info.add(fox.isSitting());
```

### PatternVariableCanBeUsed
Variable 'panda' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Panda) {
                Panda panda = (Panda) entity;
                info.add(panda.getMainGene());
                info.add(panda.getHiddenGene());
```

### PatternVariableCanBeUsed
Variable 'pig' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Pig) {
                Pig pig = (Pig) entity;
                info.add(pig.hasSaddle());
            }
```

### PatternVariableCanBeUsed
Variable 'sheep' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Sheep) {
                Sheep sheep = (Sheep) entity;
                info.add(sheep.isSheared());
                info.add(sheep.getColor());
```

### PatternVariableCanBeUsed
Variable 'mushroomCow' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof MushroomCow) {
                MushroomCow mushroomCow = (MushroomCow) entity;
                info.add(mushroomCow.getVariant());
            }
```

### PatternVariableCanBeUsed
Variable 'slime' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Slime) {
                Slime slime = (Slime) entity;
                info.add(slime.getSize());
            }
```

### PatternVariableCanBeUsed
Variable 'parrot' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Parrot) {
                Parrot parrot = (Parrot) entity;
                info.add(parrot.getVariant());
            }
```

### PatternVariableCanBeUsed
Variable 'tropicalFish' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof TropicalFish) {
                TropicalFish tropicalFish = (TropicalFish) entity;
                info.add(tropicalFish.getBodyColor());
                info.add(tropicalFish.getPattern());
```

### PatternVariableCanBeUsed
Variable 'phantom' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Phantom) {
                Phantom phantom = (Phantom) entity;
                info.add(phantom.getSize());
            }
```

### PatternVariableCanBeUsed
Variable 'abstractVillager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof AbstractVillager) {
                AbstractVillager abstractVillager = (AbstractVillager) entity;
                List<Object> recipes = new ArrayList<>();
                for (MerchantRecipe merchantRecipe : abstractVillager.getRecipes()) {
```

### PatternVariableCanBeUsed
Variable 'villager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                if (abstractVillager instanceof Villager) {
                    Villager villager = (Villager) abstractVillager;
                    info.add(villager.getProfession());
                    info.add(villager.getVillagerType());
```

### PatternVariableCanBeUsed
Variable 'raider' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Raider) {
                Raider raider = (Raider) entity;
                info.add(raider.isPatrolLeader());

```

### PatternVariableCanBeUsed
Variable 'spellcaster' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                if (entity instanceof Spellcaster) {
                    Spellcaster spellcaster = (Spellcaster) entity;
                    info.add(spellcaster.getSpell());
                }
```

### PatternVariableCanBeUsed
Variable 'wolf' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Wolf) {
                Wolf wolf = (Wolf) entity;
                info.add(wolf.isSitting());
                info.add(wolf.getCollarColor());
```

### PatternVariableCanBeUsed
Variable 'zombieVillager' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof ZombieVillager) {
                ZombieVillager zombieVillager = (ZombieVillager) entity;
                info.add(zombieVillager.isBaby());
                info.add(zombieVillager.getVillagerProfession());
```

### PatternVariableCanBeUsed
Variable 'zombie' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof Zombie) {
                Zombie zombie = (Zombie) entity;
                info.add(zombie.isBaby());
                info.add(null);
```

### PatternVariableCanBeUsed
Variable 'abstractHorse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (entity instanceof AbstractHorse) {
                AbstractHorse abstractHorse = (AbstractHorse) entity;
                info.add(null);
                info.add(null);
```

### PatternVariableCanBeUsed
Variable 'horse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                if (entity instanceof Horse) {
                    Horse horse = (Horse) entity;
                    info.add(null);

```

### PatternVariableCanBeUsed
Variable 'meta' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                        Color color = null;
                        if (itemMeta instanceof LeatherArmorMeta) {
                            LeatherArmorMeta meta = (LeatherArmorMeta) itemMeta;
                            color = meta.getColor();
                            meta.setColor(null);
```

### PatternVariableCanBeUsed
Variable 'chestedHorse' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                }
                else if (entity instanceof ChestedHorse) {
                    ChestedHorse chestedHorse = (ChestedHorse) entity;
                    info.add(chestedHorse.isCarryingChest());

```

### PatternVariableCanBeUsed
Variable 'llama' can be replaced with pattern variable
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                    if (entity instanceof Llama) {
                        Llama llama = (Llama) entity;
                        ItemStack decor = llama.getInventory().getDecor();
                        if (decor != null) {
```

### PatternVariableCanBeUsed
Variable 'pistonHead' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        /* If modifying the head of a piston, update the base piston block to prevent it from being destroyed */
                                        if (changeBlockData instanceof PistonHead) {
                                            PistonHead pistonHead = (PistonHead) changeBlockData;
                                            Block pistonBlock = block.getRelative(pistonHead.getFacing().getOppositeFace());
                                            BlockData pistonData = pistonBlock.getBlockData();
```

### PatternVariableCanBeUsed
Variable 'piston' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            BlockData pistonData = pistonBlock.getBlockData();
                                            if (pistonData instanceof Piston) {
                                                Piston piston = (Piston) pistonData;
                                                piston.setExtended(false);
                                                pistonBlock.setBlockData(piston, false);
```

### PatternVariableCanBeUsed
Variable 'technicalPiston' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        }
                                        else if (rowType == Material.MOVING_PISTON && blockData instanceof TechnicalPiston && !(blockData instanceof PistonHead)) {
                                            TechnicalPiston technicalPiston = (TechnicalPiston) blockData;
                                            rowType = (technicalPiston.getType() == org.bukkit.block.data.type.TechnicalPiston.Type.STICKY ? Material.STICKY_PISTON : Material.PISTON);
                                            blockData = rowType.createBlockData();
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        else if ((rowType == Material.AIR) && ((oldTypeMaterial == Material.WATER))) {
                                            if (pendingChangeData instanceof Waterlogged) {
                                                Waterlogged waterlogged = (Waterlogged) pendingChangeData;
                                                waterlogged.setWaterlogged(false);
                                                Util.prepareTypeAndData(chunkChanges, block, null, waterlogged, false);
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            if ((rowType == Material.AIR)) {
                                                if (pendingChangeData instanceof Waterlogged) {
                                                    Waterlogged waterlogged = (Waterlogged) pendingChangeData;
                                                    if (waterlogged.isWaterlogged()) {
                                                        Util.prepareTypeAndData(chunkChanges, block, Material.WATER, Material.WATER.createBlockData(), true);
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                else if ((pendingChangeType == Material.WATER)) {
                                                    if (rawBlockData instanceof Waterlogged) {
                                                        Waterlogged waterlogged = (Waterlogged) rawBlockData;
                                                        if (waterlogged.isWaterlogged()) {
                                                            remove = false;
```

### PatternVariableCanBeUsed
Variable 'bisected' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                }
                                                else if (changeBlockData instanceof Bisected && !(changeBlockData instanceof TrapDoor)) {
                                                    Bisected bisected = (Bisected) changeBlockData;
                                                    Location bisectLocation = block.getLocation().clone();
                                                    if (bisected.getHalf() == Half.TOP) {
```

### PatternVariableCanBeUsed
Variable 'bed' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                }
                                                else if (changeBlockData instanceof Bed) {
                                                    Bed bed = (Bed) changeBlockData;
                                                    if (bed.getPart() == Part.FOOT) {
                                                        Block adjacentBlock = block.getRelative(bed.getFacing());
```

### PatternVariableCanBeUsed
Variable 'string' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                for (Object value : meta) {
                                                    if (value instanceof String) {
                                                        String string = (String) value;
                                                        commandBlock.setCommand(string);
                                                        commandBlock.update();
```

### PatternVariableCanBeUsed
Variable 'waterlogged' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        else if ((rowType == Material.WATER)) {
                                            if (pendingChangeData instanceof Waterlogged) {
                                                Waterlogged waterlogged = (Waterlogged) pendingChangeData;
                                                waterlogged.setWaterlogged(true);
                                                Util.prepareTypeAndData(chunkChanges, block, null, waterlogged, false);
```

### PatternVariableCanBeUsed
Variable 'bisected' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        }
                                        else if (rowType != Material.AIR && rawBlockData instanceof Bisected && !(rawBlockData instanceof Stairs || rawBlockData instanceof TrapDoor)) {
                                            Bisected bisected = (Bisected) rawBlockData;
                                            Bisected bisectData = (Bisected) rawBlockData.clone();
                                            Location bisectLocation = block.getLocation().clone();
```

### PatternVariableCanBeUsed
Variable 'bed' can be replaced with pattern variable
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        }
                                        else if (rowType != Material.AIR && rawBlockData instanceof Bed) {
                                            Bed bed = (Bed) rawBlockData;
                                            if (bed.getPart() == Part.FOOT) {
                                                Block adjacentBlock = block.getRelative(bed.getFacing());
```

## CatchMayIgnoreException
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/net/coreprotect/thread/CacheHandler.java`
#### Snippet
```java
                                    iterator.remove();
                                }
                                catch (Exception e) {
                                }
                            }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                        hanging = block.getWorld().spawn(spawnBlock.getLocation(), Painting.class);
                    }
                    catch (Exception e) {
                    }
                    if (hanging != null) {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                        }
                    }
                    catch (Exception e) {
                    }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                    info.add(enderman.getCarriedBlock().getAsString());
                }
                catch (Exception endermanException) {
                }
            }
```

## ProtectedMemberInFinalClass
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onPlayerDeath(PlayerDeathEvent event) {
        if (event.getKeepInventory()) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/PlayerPickupArrowListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onPlayerPickupArrowEvent(PlayerPickupArrowEvent event) {
        ItemStack itemStack = getArrowType(event.getArrow());
        EntityPickupItemListener.onItemPickup(event.getPlayer(), event.getArrow().getLocation(), itemStack);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityInteractListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onEntityInteractEntity(EntityInteractEvent event) {
        Block block = event.getBlock();
        World world = block.getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockFadeListener.java`
#### Snippet
```java

    @EventHandler
    protected void onBlockFade(BlockFadeEvent event) {
        // snow/ice fading
        if (event.isCancelled()) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/HangingPlaceListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.HIGHEST)
    protected void onHangingPlace(HangingPlaceEvent event) {
        Entity entity = event.getEntity();
        Player player = event.getPlayer();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onPlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEvent event) {
        Player player = event.getPlayer();
        final ArmorStand armorStand = event.getRightClicked();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityBlockFormListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onEntityBlockForm(EntityBlockFormEvent event) {
        World world = event.getBlock().getWorld();
        if (!event.isCancelled() && Config.getConfig(world).ENTITY_CHANGE) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityChangeBlockListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onEntityChangeBlock(EntityChangeBlockEvent event) {
        World world = event.getBlock().getWorld();
        if (!event.isCancelled() && Config.getConfig(world).ENTITY_CHANGE) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.LOWEST)
    protected void onInventoryClick(InventoryClickEvent event) {
        InventoryAction inventoryAction = event.getAction();
        if (inventoryAction == InventoryAction.NOTHING) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
    protected static AtomicLong tasksCompleted = new AtomicLong();

    protected static void checkTasks(long taskStarted) {
        try {
            int waitCount = 0;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onInventoryMoveItemEvent(InventoryMoveItemEvent event) {
        if (event.isCancelled()) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.LOWEST)
    protected void onInventoryDragEvent(InventoryDragEvent event) {
        boolean movedItem = false;
        boolean enderChest = false;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java

    protected static AtomicLong tasksStarted = new AtomicLong();
    protected static AtomicLong tasksCompleted = new AtomicLong();

    protected static void checkTasks(long taskStarted) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
public final class InventoryChangeListener extends Queue implements Listener {

    protected static AtomicLong tasksStarted = new AtomicLong();
    protected static AtomicLong tasksCompleted = new AtomicLong();

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockForm(BlockFormEvent event) {
        // random form, snow/ice
        World world = event.getBlock().getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerBucketEmptyListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.HIGHEST)
    protected void onPlayerBucketEmpty(org.bukkit.event.player.PlayerBucketEmptyEvent event) {
        String player = event.getPlayer().getName();
        World world = event.getPlayer().getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java
public final class WorldEditBlockState implements BlockState {

    protected Location location;
    protected Material material;
    protected BlockData blockData;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    protected Location location;
    protected Material material;
    protected BlockData blockData;

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java
    protected Location location;
    protected Material material;
    protected BlockData blockData;

    public WorldEditBlockState(Location loc) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
    // EntityPickupItemEvent resulting from this event can trigger BEFORE this event if both are set to MONITOR
    @EventHandler(priority = EventPriority.HIGHEST)
    protected void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/ProjectileLaunchListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onProjectileLaunch(ProjectileLaunchEvent event) {
        Location location = event.getEntity().getLocation();
        String key = location.getWorld().getName() + "-" + location.getBlockX() + "-" + location.getBlockY() + "-" + location.getBlockZ();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityPickupItemListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onEntityPickupItem(EntityPickupItemEvent event) {
        if (event.getEntityType() != EntityType.PLAYER) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.HIGHEST)
    protected void onHangingBreakByEntity(HangingBreakByEntityEvent event) {
        Entity entity = event.getEntity();
        Entity remover = event.getRemover();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/world/LeavesDecayListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onLeavesDecay(LeavesDecayEvent event) {
        World world = event.getBlock().getWorld();
        if (!event.isCancelled() && Config.getConfig(world).LEAF_DECAY) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockIgnite(BlockIgniteEvent event) {
        World world = event.getBlock().getWorld();
        if (!event.isCancelled() && Config.getConfig(world).BLOCK_IGNITE) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockPistonExtend(BlockPistonExtendEvent event) {
        onBlockPiston(event);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java
public final class BlockPistonListener extends Queue implements Listener {

    protected void onBlockPiston(BlockPistonEvent event) {
        List<Block> event_blocks = null;
        if (event instanceof BlockPistonExtendEvent) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockPistonRetract(BlockPistonRetractEvent event) {
        onBlockPiston(event);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockDispenseListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockDispense(BlockDispenseEvent event) {
        Block block = event.getBlock();
        World world = block.getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onSignChange(SignChangeEvent event) {
        String player = event.getPlayer().getName();
        Block block = event.getBlock();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/CraftItemListener.java`
#### Snippet
```java
    }

    protected static void playerCraftItem(InventoryClickEvent event, boolean isTrade) {
        if (event.getResult() == Result.DENY || event.getSlotType() != SlotType.RESULT) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/CraftItemListener.java`
#### Snippet
```java
public final class CraftItemListener extends Queue implements Listener {

    protected static void logCraftedItem(Location location, String user, ItemStack itemStack, int action) {
        if (!Config.getConfig(location.getWorld()).ITEM_TRANSACTIONS || itemStack == null) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/CraftItemListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onCraftItem(CraftItemEvent event) {
        playerCraftItem(event, false);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/InventoryClickListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onVillagerTrade(InventoryClickEvent event) {
        CraftItemListener.playerCraftItem(event, true);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/FoodLevelChangeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onFoodLevelChangeEvent(FoodLevelChangeEvent event) {
        if (event.isCancelled() || event.getEntityType() != EntityType.PLAYER) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/world/PortalCreateListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onPortalCreate(PortalCreateEvent event) {
        World world = event.getWorld();
        if (event.isCancelled() || !Config.getConfig(world).PORTALS) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/world/ChunkPopulateListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onChunkPopulate(ChunkPopulateEvent event) {
        long chunkKey = event.getChunk().getX() & 0xffffffffL | (event.getChunk().getZ() & 0xffffffffL) << 32;
        ConfigHandler.populatedChunks.put(chunkKey, (System.currentTimeMillis() / 1000L));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityExplodeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onEntityExplode(EntityExplodeEvent event) {
        Entity entity = event.getEntity();
        World world = event.getLocation().getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockFromTo(BlockFromToEvent event) {
        Block block = event.getBlock();
        Material type = block.getType(); // old block type
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerItemBreakListener.java`
#### Snippet
```java
public final class PlayerItemBreakListener extends Queue implements Listener {

    protected static void playerBreakItem(Location location, String user, ItemStack itemStack) {
        if (!Config.getConfig(location.getWorld()).ITEM_TRANSACTIONS || itemStack == null) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerItemBreakListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onPlayerItemBreak(PlayerItemBreakEvent event) {
        ItemStack itemStack = event.getBrokenItem();
        playerBreakItem(event.getPlayer().getLocation(), event.getPlayer().getName(), itemStack);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockFertilizeListener.java`
#### Snippet
```java

    @EventHandler
    protected void onBlockFertilize(BlockFertilizeEvent event) {
        if (event.isCancelled()) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByBlockListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onEntityDamageByBlock(EntityDamageByBlockEvent event) {
        Entity entity = event.getEntity();
        if (!(entity instanceof ItemFrame) && !(entity instanceof ArmorStand) && !(entity instanceof EnderCrystal)) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onPlayerInteract(PlayerInteractEvent event) {
        /* Logging for players punching out fire blocks. */
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.LOWEST)
    protected void onPlayerInspect(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockPlace(BlockPlaceEvent event) {
        World world = event.getBlockPlaced().getWorld();
        if (!event.isCancelled() && Config.getConfig(world).BLOCK_PLACE) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/HangingBreakListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onHangingBreak(HangingBreakEvent event) {
        HangingBreakEvent.RemoveCause cause = event.getCause();
        Entity entity = event.getEntity();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerBucketFillListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.HIGHEST)
    protected void onPlayerBucketFill(PlayerBucketFillEvent event) {
        String player = event.getPlayer().getName();
        Block block = event.getBlockClicked();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerInteractEntityListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        if (event instanceof PlayerArmorStandManipulateEvent) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockBreak(BlockBreakEvent event) {
        if (!event.isCancelled()) {
            String user = event.getPlayer().getName();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
    }

    protected static void processBlockBreak(Player player, String user, Block block, boolean logBreak, int skipScan) {
        List<Block> placementMap = new ArrayList<>();
        Material type = block.getType();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockBurnListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockBurn(BlockBurnEvent event) {
        World world = event.getBlock().getWorld();
        if (!event.isCancelled() && Config.getConfig(world).BLOCK_BURN) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerDropItemListener.java`
#### Snippet
```java
public final class PlayerDropItemListener extends Queue implements Listener {

    protected static void playerDropItem(Location location, String user, ItemStack itemStack) {
        if (!Config.getConfig(location.getWorld()).ITEM_DROPS || itemStack == null) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/player/PlayerDropItemListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onPlayerDropItem(PlayerDropItemEvent event) {
        Item item = event.getItemDrop();
        ItemStack itemStack = item.getItemStack();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/world/StructureGrowListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onStructureGrow(StructureGrowEvent event) {
        // Event that is called when an organic structure attempts to grow (Sapling -> Tree), (Mushroom -> Huge Mushroom), naturally or using bonemeal.
        TreeType treeType = event.getSpecies();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockExplode(BlockExplodeEvent event) {
        Block eventBlock = event.getBlock();
        World world = eventBlock.getLocation().getWorld();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/block/BlockSpreadListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockSpread(BlockSpreadEvent event) {
        // mushrooms, fire

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
    }

    protected static void logEntityDeath(LivingEntity entity, String e) {
        if (!Config.getConfig(entity.getWorld()).ENTITY_KILLS) {
            return;
```

## EnhancedSwitchMigration
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/listener/PlayerPickupArrowListener.java`
#### Snippet
```java
    public static ItemStack getArrowType(AbstractArrow arrow) {
        ItemStack itemStack = null;
        switch (arrow.getType()) {
            case SPECTRAL_ARROW:
                itemStack = new ItemStack(Material.SPECTRAL_ARROW);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/paper/PaperAdapter.java`
#### Snippet
```java
        }

        switch (paperVersion) {
            case PAPER_UNAVAILABLE:
                PaperAdapter.ADAPTER = new PaperAdapter();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/listener/block/BlockFormListener.java`
#### Snippet
```java
                String coords = "";
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            coords = "" + (x + 1) + "." + y + "." + z + "." + wid + "";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/spigot/SpigotAdapter.java`
#### Snippet
```java
        }

        switch (spigotVersion) {
            case SPIGOT_UNAVAILABLE:
                SpigotAdapter.ADAPTER = new SpigotAdapter();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        boolean sign = true;

        switch (type) {
            case "2":
                sendInfoData(commandSender, timeAgo, Phrase.LOOKUP_LOGIN, selector, resultUser, amount, x, y, z, worldId);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java

                        try {
                            switch (action) {
                                case Process.BLOCK_BREAK:
                                    BlockBreakProcess.process(preparedStmtBlocks, preparedStmtSkulls, i, processId, id, blockType, blockData, replaceType, forceData, user, object, (String) data[7]);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java

    public static void loadAdapter() {
        switch (ConfigHandler.SERVER_VERSION) {
            case BUKKIT_V1_13:
            case BUKKIT_V1_14:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/thread/CacheHandler.java`
#### Snippet
```java
                    Map cache = CacheHandler.lookupCache;

                    switch (id) {
                        case 1:
                            cache = CacheHandler.breakCache;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
            String blockdataInsert = "INSERT INTO " + ConfigHandler.prefix + "blockdata_map (id, data) VALUES (?, ?)";

            switch (type) {
                case SIGN:
                    preparedStatement = prepareStatement(connection, signInsert, keys);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/patch/script/__2_20_0.java`
#### Snippet
```java
            while (resultSet.next()) {
                EntityType entityType = EntityType.PIG;
                switch (resultSet.getInt("data")) {
                    case 1:
                        entityType = EntityType.ZOMBIE;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java

            boolean scanButton = false;
            switch (faceAttachable.getAttachedFace()) {
                case WALL:
                    scanButton = (scanMin < 5 && scanBlock.getRelative(directional.getFacing().getOppositeFace()).getLocation().equals(block.getLocation()));
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static String nameFilter(String name, int data) {
        if (name.equals("stone")) {
            switch (data) {
                case 1:
                    name = "granite";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

    public static Material getEntityMaterial(EntityType type) {
        switch (type) {
            case ARMOR_STAND:
                return Material.ARMOR_STAND;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

    public static int toggleRolledBack(int rolledBack, boolean isInventory) {
        switch (rolledBack) {
            case 1: // just block rolled back
                return isInventory ? 3 : 0;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

    public static int rolledBack(int rolledBack, boolean isInventory) {
        switch (rolledBack) {
            case 1: // just block rolled back
                return isInventory ? 0 : 1;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        else {
            switch (queryTable) {
                case "block":
                    index = "INDEXED BY block_index ";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }

        switch (material) {
            case WHEAT:
                material = Material.WHEAT_SEEDS;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    @Override
    public String parseLegacyName(String name) {
        switch (name) {
            case "GRASS_PATH":
                name = "DIRT_PATH";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    @Override
    public Material getFrameType(EntityType type) {
        switch (type) {
            case ITEM_FRAME:
                return Material.ITEM_FRAME;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    @Override
    public int getLegacyBlockId(Material material) {
        switch (material) {
            case DIRT_PATH:
                return Util.getBlockId("GRASS_PATH", false);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
        String name = enchantment.getKey().getKey();

        switch (name) {
            case "vanishing_curse":
                name = "Curse of Vanishing";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

    private static String getEnchantmentLevel(int level) {
        switch (level) {
            case 1:
                return "I";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
        else if (blockData instanceof Lantern) {
            boolean scan = false;
            switch (scanMin) {
                case BlockUtil.TOP:
                    scan = !((Lantern) blockData).isHanging();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                        BlockData blockData = scanBlock.getBlockData();
                        Bell bell = (Bell) blockData;
                        switch (bell.getAttachment()) {
                            case SINGLE_WALL:
                                scanBell = (scanMin < 5 && scanBlock.getRelative(bell.getFacing()).getLocation().equals(block.getLocation()));
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java

                        boolean legacy = true;
                        switch (materialName) {
                            case "minecraft:legacy_wall_sign":
                                materialName = "minecraft:oak_wall_sign";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java

    protected static Material getWoolColor(int data) {
        switch (data) {
            case 0:
                return Material.WHITE_WOOL;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java

    private static BlockFace getLegacyDirection(int data) {
        switch (data) {
            case 2:
                return BlockFace.NORTH;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java

    private static BlockFace getLegacyRotation(int data) {
        switch (data) {
            case 1:
                return BlockFace.SOUTH_SOUTH_WEST;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/ChestTool.java`
#### Snippet
```java
        Type chestType = ((Chest) blockData).getType();
        if (chestType == Type.LEFT) {
            switch (blockFace) {
                case NORTH:
                    newFace = BlockFace.EAST;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/utility/ChestTool.java`
#### Snippet
```java
        }
        else if (chestType == Type.RIGHT) {
            switch (blockFace) {
                case NORTH:
                    newFace = BlockFace.WEST;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            int actionID = Integer.parseInt(parse[7]);
            if (parse.length < 13 && Integer.parseInt(parse[6]) == SessionLookup.ID) {
                switch (actionID) {
                    case 0:
                        return "logout";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                        ArmorStand armorStand = (ArmorStand) equipment.getHolder();
                        armorStand.setArms(true);
                        switch (slot) {
                            case 4:
                                equipment.setItemInMainHand(itemstack);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            BlockFace face = BlockFace.NORTH;

                                            switch (rowData) {
                                                case 0:
                                                    face = BlockFace.EAST;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                            }

                                            switch (rowData) {
                                                case 2:
                                                    face = BlockFace.WEST;
```

## UnnecessaryToStringCall
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
            }
            else {
                String transactingChestId = location.getWorld().getUID().toString() + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ();
                if (ConfigHandler.transactingChest.get(transactingChestId) != null) {
                    List<Object> list = Collections.synchronizedList(new ArrayList<>(ConfigHandler.transactingChest.get(transactingChestId)));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
        int z = standLocation.getBlockZ();

        String transactingChestId = standLocation.getWorld().getUID().toString() + "." + x + "." + y + "." + z;
        String loggingChestId = player.getName().toLowerCase(Locale.ROOT) + "." + x + "." + y + "." + z;
        int chestId = Queue.getChestId(loggingChestId);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        }

        List<Object> list = ConfigHandler.transactingChest.get(location.getWorld().getUID().toString() + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ());
        if (list == null) {
            return;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
                    int z = playerLocation.getBlockZ();

                    String transactingChestId = playerLocation.getWorld().getUID().toString() + "." + x + "." + y + "." + z;
                    String loggingChestId = user.toLowerCase(Locale.ROOT) + "." + x + "." + y + "." + z;
                    for (String loggingChestIdViewer : ConfigHandler.oldContainer.keySet()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/HopperPushListener.java`
#### Snippet
```java
                }

                List<Object> list = ConfigHandler.transactingChest.get(location.getWorld().getUID().toString() + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ());
                if (list != null) {
                    list.add(movedItem);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java

                if (!hopperTransactions) {
                    List<Object> list = ConfigHandler.transactingChest.get(location.getWorld().getUID().toString() + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ());
                    if (list != null) {
                        list.add(movedItem);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java

                Location destinationLocation = destinationHolder.getInventory().getLocation();
                List<Object> list = ConfigHandler.transactingChest.get(destinationLocation.getWorld().getUID().toString() + "." + destinationLocation.getBlockX() + "." + destinationLocation.getBlockY() + "." + destinationLocation.getBlockZ());
                if (list != null) {
                    list.add(new ItemStack[] { null, movedItem });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        // chat output
        message.append(Color.GREY + (italic ? Color.ITALIC : "") + "(x" + x + "/y" + y + "/z" + z + worldDisplay.toString() + ")");

        return message.append(Chat.COMPONENT_TAG_CLOSE).toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            String formattedTimestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").format(logDate);

            return Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_POPUP + "|" + Color.GREY + formattedTimestamp + "|" + Color.GREY + message.toString() + Chat.COMPONENT_TAG_CLOSE;
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                }
                found = true;
                result.add(timeAgo + Color.WHITE + " - " + Color.DARK_AQUA + resultUser + ": " + Color.WHITE + "\n" + message.toString() + Color.WHITE);
                PluginChannelListener.getInstance().sendMessageData(commandSender, resultTime, resultUser, message.toString(), true, x, y, z, worldId);
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/patch/script/__2_19_0.java`
#### Snippet
```java
            }

            String blockQuery = "SELECT time, user, wid, x, y, z FROM " + ConfigHandler.prefix + "block WHERE type IN(" + signData.toString() + ") AND action='1' ORDER BY rowid ASC";
            String preparedSignQuery = "SELECT rowid as id FROM " + ConfigHandler.prefix + "sign WHERE user = ? AND wid = ? AND x = ? AND y = ? AND z = ? AND time >= ? ORDER BY rowid ASC LIMIT 0, 1";
            String preparedQueryUpdate = "UPDATE " + ConfigHandler.prefix + "sign SET action = 1 WHERE rowid = ?";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/listener/player/PlayerInteractEntityListener.java`
#### Snippet
```java
        int z = frameLocation.getBlockZ();

        String transactingChestId = frameLocation.getWorld().getUID().toString() + "." + x + "." + y + "." + z;
        String loggingChestId = user.toLowerCase(Locale.ROOT) + "." + x + "." + y + "." + z;
        int chestId = Queue.getChestId(loggingChestId);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/net/coreprotect/consumer/process/ContainerTransactionProcess.java`
#### Snippet
```java
            if (inventories.get(id) != null) {
                Object inventory = inventories.get(id);
                String transactingChestId = location.getWorld().getUID().toString() + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ();
                String loggingChestId = user.toLowerCase(Locale.ROOT) + "." + location.getBlockX() + "." + location.getBlockY() + "." + location.getBlockZ();
                if (ConfigHandler.loggingChest.get(loggingChestId) != null) {
```

## InnerClassMayBeStatic
### InnerClassMayBeStatic
Inner class `ParseResult` may be 'static'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
public class CoreProtectAPI extends Queue {

    public class ParseResult {
        String[] parse;

```

## SetReplaceableByEnumSet
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
    public static Set<Material> DIRECTIONAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STICKY_PISTON, Material.PISTON, Material.REPEATER, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.COMPARATOR));
    public static Set<Material> INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PUR
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java

    /* blocks that support vertical scanning */
    public static Set<Material> VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER, Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER, Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER, Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER));
    public static Set<Material> SHULKER_BOXES = new HashSet<>(Arrays.asList(Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX));
    public static Set<Material> CONTAINERS = new HashSet<>(Arrays.asList(Material.DISPENSER, Material.CHEST, Material.FURNACE, Material.BREWING_STAND, Material.TRAPPED_CHEST, Material.HOPPER, Material.DROPPER, Material.ARMOR_STAND, Material.ITEM_FRAME, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SH
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
    public static Set<Material> DIRECTIONAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STICKY_PISTON, Material.PISTON, Material.REPEATER, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.COMPARATOR));
    public static Set<Material> INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP));
    public static Set<Material> TRACK_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Materia
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON));
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    // These are blocks that an item frame or painting can't be attached to.
    // Same as non_solid_entity_blocks? >>Perform testing<<
    public static Set<Material> NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW, Material.SUGAR_CANE, Material.NETHER_PORTAL, Material.REPEATER, Material.KELP, Material.CHORUS_FLOWER, Material.CHORUS_PLANT));

    public static void initialize() {
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL = new HashSet<>(Arrays.asList());

```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER));
    public static Set<Material> SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE));
    public static Set<Material> UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL));
    public static Set<Material> NATURAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STONE, Material.GOLD_ORE, Material.IRON_ORE, Material.COAL_ORE, Material.LAPIS_ORE, Material.SANDSTONE, Material.COBWEB, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Materi
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> CONTAINERS = new HashSet<>(Arrays.asList(Material.DISPENSER, Material.CHEST, Material.FURNACE, Material.BREWING_STAND, Material.TRAPPED_CHEST, Material.HOPPER, Material.DROPPER, Material.ARMOR_STAND, Material.ITEM_FRAME, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.SMOKER, Material.LECTERN));
    public static Set<Material> DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR));
    public static Set<Material> BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON));
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    /* blocks that support vertical scanning */
    public static Set<Material> VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL = new HashSet<>(Arrays.asList());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX));
    public static Set<Material> CONTAINERS = new HashSet<>(Arrays.asList(Material.DISPENSER, Material.CHEST, Material.FURNACE, Material.BREWING_STAND, Material.TRAPPED_CHEST, Material.HOPPER, Material.DROPPER, Material.ARMOR_STAND, Material.ITEM_FRAME, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.SMOKER, Material.LECTERN));
    public static Set<Material> DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR));
    public static Set<Material> BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON));
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
    public static Set<Material> DIRECTIONAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STICKY_PISTON, Material.PISTON, Material.REPEATER, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.COMPARATOR));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
    public static Set<Material> DIRECTIONAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STICKY_PISTON, Material.PISTON, Material.REPEATER, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.COMPARATOR));
    public static Set<Material> INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, M
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER, Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER, Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER, Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER));
    public static Set<Material> SHULKER_BOXES = new HashSet<>(Arrays.asList(Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX));
    public static Set<Material> CONTAINERS = new HashSet<>(Arrays.asList(Material.DISPENSER, Material.CHEST, Material.FURNACE, Material.BREWING_STAND, Material.TRAPPED_CHEST, Material.HOPPER, Material.DROPPER, Material.ARMOR_STAND, Material.ITEM_FRAME, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.SMOKER, Material.LECTERN));
    public static Set<Material> DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java

    public static Set<Material> TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL));
    public static Set<Material> TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, M
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL = new HashSet<>(Arrays.asList());

    // These are blocks that an item frame or painting can't be attached to.
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL));
    public static Set<Material> TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Ma
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
RAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE));
    public static Set<Material> UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL));
    public static Set<Material> NATURAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STONE, Material.GOLD_ORE, Material.IRON_ORE, Material.COAL_ORE, Material.LAPIS_ORE, Material.SANDSTONE, Material.COBWEB, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.OBSIDIAN, Material.DIAMOND_ORE, Material.WHEAT, Material.REDSTONE_ORE, Material.SNOW, Material.ICE, Material.CACTUS, Material.CLAY, Material.SUGAR_CANE, Material.PUMPKIN, Material.NETHERRACK, Material.SOUL_SAND, Material.MELON, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.MYCELIUM, Material.LILY_PAD, Material.NETHER_WART, Material.END_STONE, Material.EMERALD_ORE, Material.CARROT, Material.POTATO, Material.KELP, Material.CHORUS_FLOWER, Materia
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
public final class BlockGroup {

    public static Set<Material> TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL));
    public static Set<Material> TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Mater
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
ED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER));
    public static Set<Material> SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE));
    public static Set<Material> UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Mat
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR));
    public static Set<Material> BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON));
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
erial.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP));
    public static Set<Material> TRACK_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/listener/player/ProjectileLaunchListener.java`
#### Snippet
```java
public final class ProjectileLaunchListener extends Queue implements Listener {

    public static Set<Material> BOWS = new HashSet<>(Arrays.asList(Material.BOW, Material.CROSSBOW));

    public static void playerLaunchProjectile(Location location, String user, ItemStack itemStack, int amount, int delay, int offset, int action) {
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java

    public Bukkit_v1_16() {
        BlockGroup.TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWIS
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
ANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES));
        BlockGroup.TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.L
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
l.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES));
        BlockGroup.TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Materia
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
erial.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER, Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER, Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER, Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER, Material.SOUL_WALL_TORCH, Material.CRIMSON_WALL_SIGN, Material.WARPED_WALL_SIGN));
        BlockGroup.DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.CRIMSON_DOOR, Material.WARPED_DOOR));
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PL
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
GLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER, Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER, Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER, Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER, Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER, Material.SOUL_WALL_TORCH, Material.CRIMSON_WALL_SIGN, Material.WARPED_WALL_SIGN));
        BlockGroup.DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.CRIMSON_DOOR, Material.WARPED_DOOR));
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.DOORS = new HashSet<>(Arrays.asList(Material.OAK_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.CRIMSON_DOOR, Material.WARPED_DOOR));
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON, Material.POLISHED_BLACKSTONE_BUTTON, Material.CRIMSON_BUTTON, Material.WARPED_BUTTON));
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE, Material.CRIMSON_PRESSURE_PLATE, Material.WARPED_PRESSURE_PLATE, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES));
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE, Material.SOUL_CAMPFIRE));
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
        BlockGroup.INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.FIRE = new HashSet<>(Arrays.asList(Material.FIRE, Material.SOUL_FIRE));
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
        BlockGroup.INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        B
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        BlockGroup.LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN, Material.SOUL_LANTERN));
        BlockGroup.SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND, Material.SOUL_SOIL));
        BlockGroup.INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACI
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
OR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMP
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
R_BOX, Material.BARREL, Material.BLAST_FURNACE, Material.GRINDSTONE, Material.LOOM, Material.SMOKER, Material.CRAFTING_TABLE, Material.CARTOGRAPHY_TABLE, Material.ENCHANTING_TABLE, Material.SMITHING_TABLE, Material.STONECUTTER, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.SAFE_INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.LEVER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_S
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
 Material.ACACIA_FENCE_GATE, Material.CRIMSON_FENCE_GATE, Material.WARPED_FENCE_GATE, Material.CRIMSON_TRAPDOOR, Material.WARPED_TRAPDOOR));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW, Material.SUGAR_CANE, M
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/utility/Teleport.java`
#### Snippet
```java
    public static void performSafeTeleport(Player player, Location location, boolean enforceTeleport) {
        try {
            Set<Material> unsafeBlocks = new HashSet<>(Arrays.asList(Material.LAVA));
            unsafeBlocks.addAll(BlockGroup.FIRE);

```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java

    public Bukkit_v1_17() {
        BlockGroup.TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.GLOW_LICHEN));
        BlockGroup.TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Materi
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    public Bukkit_v1_17() {
        BlockGroup.TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.GLOW_LICHEN));
        BlockGroup.TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Materia
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
P, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN, Material.AZALEA, Material.FLOWERING_AZALEA, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF));
        BlockGroup.TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.POINTED_DRIPSTONE, Material.BIG_DRIPLEAF_STEM));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
aterial.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN, Material.AZALEA, Material.FLOWERING_AZALEA, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF));
        BlockGroup.TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.POINTED_DRIPSTONE, Material.BIG_DRIPLEAF_STEM));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
        BlockGroup.CANDLES = new HashSet<>(Arrays.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Mate
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        BlockGroup.TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.POINTED_DRIPSTONE, Material.BIG_DRIPLEAF_STEM));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
        BlockGroup.CANDLES = new HashSet<>(Arrays.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.HANGING_ROOTS));
        BlockGroup.VINES = new HashSet<>(Arrays.asList(Material.VINE, Material.WEEPING_VINES, Material.TWISTING_VINES, Material.CAVE_VINES));
        BlockGroup.CANDLES = new HashSet<>(Arrays.asList(Material.CANDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDST
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
NDLE, Material.BLACK_CANDLE, Material.BLUE_CANDLE, Material.BROWN_CANDLE, Material.CYAN_CANDLE, Material.GRAY_CANDLE, Material.GREEN_CANDLE, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHY
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
IGHT_GRAY_CANDLE, Material.LIME_CANDLE, Material.MAGENTA_CANDLE, Material.ORANGE_CANDLE, Material.PINK_CANDLE, Material.PURPLE_CANDLE, Material.RED_CANDLE, Material.WHITE_CANDLE, Material.YELLOW_CANDLE, Material.CANDLE_CAKE, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BROWN_CANDLE_CAKE, Material.CYAN_CANDLE_CAKE, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.PURPLE_CANDLE_CAKE, Material.RED_CANDLE_CAKE, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE));
        BlockGroup.AMETHYST = new HashSet<>(Arrays.asList(Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER));
        BlockGroup.UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Material.LAVA_CAULDRON));
   
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
al.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Material.LAVA_CAULDRON));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW, Material.SUGAR_CANE, M
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
STONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Material.LAVA_CAULDRON));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW, Material.SUGAR_CANE, Material.NETHER_PORTAL, Material.REPEATER, Material.KELP, Material.CHORUS_FLOWER, Material.CHORUS_PLANT, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.LIGHT, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF, Material.BIG_DRIPLEAF_STEM, Material.GLOW_LICHEN, Material.HANGING_ROOTS));
        BlockGroup.VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.BIG_DRIPLEAF_STEM));
    }

```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/net/coreprotect/language/Phrase.java`
#### Snippet
```java
    WORLD_NOT_FOUND;

    final private static Set<Phrase> HEADERS = new HashSet<>(Arrays.asList(Phrase.CONTAINER_HEADER, Phrase.HELP_HEADER, Phrase.INTERACTIONS_HEADER, Phrase.LOOKUP_HEADER, Phrase.SIGN_HEADER, Phrase.UPDATE_HEADER));
    final private static Set<String> COLORS = new HashSet<>(Arrays.asList(Color.WHITE, Color.DARK_AQUA));
    final private static String split = ":";
```

## UtilityClassWithPublicConstructor
### UtilityClassWithPublicConstructor
Class `ListenerHandler` has only 'static' members, and a 'public' constructor
in `src/main/java/net/coreprotect/listener/ListenerHandler.java`
#### Snippet
```java
import net.coreprotect.paper.listener.PaperChatListener;

public final class ListenerHandler {

    public ListenerHandler(CoreProtect plugin) {
```

## UnnecessaryBoxing
### UnnecessaryBoxing
Unnecessary boxing `Double.valueOf(worldMinHeight)`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java

                                if (y < worldMinHeight) {
                                    y = Double.valueOf(worldMinHeight);
                                }
                                if (y > worldMaxHeight) {
```

### UnnecessaryBoxing
Unnecessary boxing `Double.valueOf(worldMaxHeight)`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                }
                                if (y > worldMaxHeight) {
                                    y = Double.valueOf(worldMaxHeight);
                                }

```

## NonStrictComparisonCanBeEquality
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }

        if (string.length() <= 1) {
            return string.toUpperCase(Locale.ROOT);
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }

            if (p <= 0) {
                p = 1;
            }
```

## CharsetObjectCanBeUsed
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                int status = connection.getResponseCode();
                                if (status == 200) {
                                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                                    StringBuilder responseBuilder = new StringBuilder();
                                    String responseLine = null;
```

## ConditionCoveredByFurtherCondition
### ConditionCoveredByFurtherCondition
Condition 'inventoryHolder == null' covered by subsequent condition '!(inventoryHolder instanceof BlockInventoryHolder \|\| inventoryHolder instanceof DoubleChest)'
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            InventoryHolder inventoryHolder = inventory.getHolder();
            enderChest = inventory.equals(event.getWhoClicked().getEnderChest());
            if ((inventoryHolder == null || !(inventoryHolder instanceof BlockInventoryHolder || inventoryHolder instanceof DoubleChest)) && !enderChest) {
                return;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'inventoryHolder == null' covered by subsequent condition '!(inventoryHolder instanceof BlockInventoryHolder \|\| inventoryHolder instanceof DoubleChest)'
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            InventoryHolder inventoryHolder = inventory.getHolder();
            enderChest = inventory.equals(event.getWhoClicked().getEnderChest());
            if ((inventoryHolder == null || !(inventoryHolder instanceof BlockInventoryHolder || inventoryHolder instanceof DoubleChest)) && !enderChest) {
                return;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'inventoryHolder != null' covered by subsequent condition 'inventoryHolder instanceof BlockInventoryHolder \|\| inventoryHolder instanceof DoubleChest'
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            InventoryHolder inventoryHolder = inventory.getHolder();
            enderChest = inventory.equals(event.getWhoClicked().getEnderChest());
            if ((inventoryHolder != null && (inventoryHolder instanceof BlockInventoryHolder || inventoryHolder instanceof DoubleChest)) || enderChest) {
                movedItem = true;
                break;
```

### ConditionCoveredByFurtherCondition
Condition 'response.length() \> 0' covered by subsequent condition 'response.startsWith(...)'
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                                    String response = responseBuilder.toString();
                                    if (response.length() > 0 && response.startsWith("{") && response.endsWith("}")) {
                                        TreeMap<Phrase, String> translatedPhrases = new TreeMap<>();
                                        JSONParser parser = new JSONParser();
```

### ConditionCoveredByFurtherCondition
Condition 'objectData != null' covered by subsequent condition 'objectData instanceof BlockState'
in `src/main/java/net/coreprotect/api/QueueLookup.java`
#### Snippet
```java
                String[] userData = users.get(id);
                Object objectData = consumerObject.get(id);
                if (userData != null && objectData != null && (objectData instanceof BlockState) && ((BlockState) objectData).getLocation().equals(oldLocation)) {
                    Material blockType = (Material) data[2];
                    int legacyData = (int) data[3];
```

### ConditionCoveredByFurtherCondition
Condition 'plugin == null' covered by subsequent condition '!(plugin instanceof WorldEditPlugin)'
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
    public static WorldEditPlugin getWorldEdit(Server server) {
        Plugin plugin = server.getPluginManager().getPlugin("WorldEdit");
        if (plugin == null || !(plugin instanceof WorldEditPlugin)) {
            return null;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'command.length() \> 0' covered by subsequent condition 'command.startsWith(...)'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED && player != null && Config.getConfig(player.getWorld()).PLAYER_COMMANDS) {
            if (command != null) {
                if (command.length() > 0 && command.startsWith("/")) {
                    long timestamp = System.currentTimeMillis() / 1000L;

```

## DynamicRegexReplaceableByCompiledPattern
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java

            if (checkType == Material.LECTERN) {
                blockData = blockData.replaceFirst("has_book=true", "has_book=false");
            }
            else if (checkType == Material.PAINTING || BukkitAdapter.ADAPTER.isItemFrame(checkType)) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java

    protected static String getClassVersion(String version) {
        return (version.split(".__"))[1].replaceAll("_", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java

    protected static String getClassVersion(String version) {
        return (version.split(".__"))[1].replaceAll("_", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                    String className = jarEntry.getName();
                    if (className.startsWith("net/coreprotect/patch/script/__") && className.endsWith(".class")) {
                        Class<?> patchClass = Class.forName(className.substring(0, className.length() - 6).replaceAll("/", "."));
                        String patchVersion = getClassVersion(patchClass.getName());
                        if (!Util.newVersion(Util.getInternalPluginVersion(), patchVersion)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                    version = String.format(Locale.ROOT, "%3.2f", version_int / 100.0);
                }
                version = version.replaceAll(",", ".");
                String[] old_version_split = version.split("\\.");
                if (old_version_split.length > 2) { // #.#.#
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java

                        if (continuePatch()) {
                            Class<?> patchClass = Class.forName("net.coreprotect.patch.script.__" + patchData.replaceAll("\\.", "_"));
                            Method patchMethod = patchClass.getDeclaredMethod("patch", Statement.class);
                            patchMethod.setAccessible(true);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java
                    if (args[i].equals("#preview")) {
                        valid = true;
                        args[i] = args[i].replaceAll("#preview", "");
                    }
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/HelpCommand.java`
#### Snippet
```java
                String helpcommand_original = args[1];
                String helpcommand = args[1].toLowerCase(Locale.ROOT);
                helpcommand = helpcommand.replaceAll("[^a-zA-Z]", "");
                Chat.sendMessage(player, Color.WHITE + "----- " + Color.DARK_AQUA + Phrase.build(Phrase.HELP_HEADER, "CoreProtect") + Color.WHITE + " -----");
                if (helpcommand.equals("help")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                // Strip out single and double quotes from the start/end of the value
                if (value.length() >= 2 && value.startsWith("'") && value.endsWith("'")) {
                    value = value.replaceAll("^'|'$", "");
                    value = value.replace("''", "'");
                    value = value.replace("\\'", "'");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                }
                else if (value.length() >= 2 && value.startsWith("\"") && value.endsWith("\"")) {
                    value = value.replaceAll("^\"|\"$", "");
                    value = value.replace("\\\"", "\"");
                    value = value.replace("\\\\", "\\");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            for (final Entry<String, String> entry : DEFAULT_VALUES.entrySet()) {
                final String key = entry.getKey();
                final String defaultValue = entry.getValue().replaceAll("\"", "\\\\\"");

                final String configuredValue = this.lang.get(key);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        String response = reader.readLine();
                        if (response != null && response.length() > 0) {
                            String[] remoteKey = response.replaceAll("[^a-zA-Z0-9;]", "").split(";");
                            if (remoteKey.length > 1 && remoteKey[1].equals("1") && remoteKey[0].length() == 8) {
                                donationKey = remoteKey[0];
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        if (licenseFile.size() == 1) {
                            donationKey = licenseFile.get(0);
                            if (donationKey == null || donationKey.length() != 8 || !donationKey.matches("^[A-Z0-9]+$")) {
                                donationKey = null;
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                            String mapString = "data=" + JSONObject.toJSONString(phrases);
                            mapString = mapString.replaceAll("\\+", "{PLUS_SIGN}");
                            byte[] postData = mapString.getBytes(StandardCharsets.UTF_8);
                            int postDataLength = postData.length;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                            for (final Entry<Phrase, String> entry : translatedPhrases.entrySet()) {
                                                String key = entry.getKey().name();
                                                String value = entry.getValue().replaceAll("\"", "\\\\\"");

                                                out.append(Config.LINE_SEPARATOR);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                        if (response.length() > 0 && response.length() < 10) {
                            String remoteVersion = response.replaceAll("[^0-9.]", "");
                            if (remoteVersion.contains(".")) {
                                boolean newVersion = Util.newVersion(version, remoteVersion);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    List<String> excludeTables = Arrays.asList("database_lock"); // don't insert data into these tables
                    for (String table : ConfigHandler.databaseTables) {
                        String tableName = table.replaceAll("_", " ");
                        Chat.sendGlobalMessage(player, Phrase.build(Phrase.PURGE_PROCESSING, tableName));

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

            if (data[2].startsWith("wid:")) {
                String nameWid = data[2].replaceFirst("wid:", "");
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            if (data[2].startsWith("wid:")) {
                String nameWid = data[2].replaceFirst("wid:", "");
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            result = new String(data, StandardCharsets.UTF_8);
            if (result.length() > 0) {
                if (result.matches("\\d+")) {
                    result = result + ",";
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            // Parse wid:# parameter used internally for /co tp click events
            if (name.startsWith("wid:")) {
                String nameWid = name.replaceFirst("wid:", "");
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            if (name.startsWith("wid:")) {
                String nameWid = name.replaceFirst("wid:", "");
                if (nameWid.length() > 0 && nameWid.equals(nameWid.replaceAll("[^0-9]", ""))) {
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            // Determine closest match on world name
            String result = "";
            name = name.replaceFirst("#", "").toLowerCase(Locale.ROOT).trim();
            for (World world : Bukkit.getServer().getWorlds()) {
                String worldName = world.getName();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    result = world.getName();
                }
                else if (worldName.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]", "").endsWith(name)) {
                    result = world.getName();
                }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                if (version.contains("-beta-")) {
                    version = version.split(";")[0];
                    version = version.split("-beta-")[1];
                    long value = Long.parseLong(version.replaceAll("[^0-9]", ""));
                    if (value < 6) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    version = version.split(";")[0];
                    version = version.split("-beta-")[1];
                    long value = Long.parseLong(version.replaceAll("[^0-9]", ""));
                    if (value < 6) {
                        validVersion = false;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

                    if (version.contains("-")) {
                        long value = Long.parseLong(((version.split("-"))[0]).replaceAll("[^0-9]", ""));
                        if (value > 0 && value < 4268) {
                            validVersion = false;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            else if (version.contains(".")) {
                String[] worldEditVersion = version.split("-|\\.");
                if (worldEditVersion.length >= 2) {
                    worldEditVersion[0] = worldEditVersion[0].replaceAll("[^0-9]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                String[] worldEditVersion = version.split("-|\\.");
                if (worldEditVersion.length >= 2) {
                    worldEditVersion[0] = worldEditVersion[0].replaceAll("[^0-9]", "");
                    worldEditVersion[1] = worldEditVersion[1].replaceAll("[^0-9]", "");
                    if (worldEditVersion[0].length() == 0 || worldEditVersion[1].length() == 0 || Util.newVersion(worldEditVersion[0] + "." + worldEditVersion[1], "7.1")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                if (worldEditVersion.length >= 2) {
                    worldEditVersion[0] = worldEditVersion[0].replaceAll("[^0-9]", "");
                    worldEditVersion[1] = worldEditVersion[1].replaceAll("[^0-9]", "");
                    if (worldEditVersion[0].length() == 0 || worldEditVersion[1].length() == 0 || Util.newVersion(worldEditVersion[0] + "." + worldEditVersion[1], "7.1")) {
                        validVersion = false;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CancelCommand.java`
#### Snippet
```java
                    if (args[i].equals("#preview")) {
                        valid = true;
                        args[i] = args[i].replaceAll("#preview", "#preview_cancel");
                    }
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("r:") || argument.equals("radius:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if (argument.equals("#global") || argument.equals("global") || argument.equals("off") || argument.equals("-1") || argument.equals("none") || argument.equals("false")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if (argument.equals("#global") || argument.equals("global") || argument.equals("off") || argument.equals("-1") || argument.equals("none") || argument.equals("false")) {
                        result = true;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("r:") || argument.equals("radius:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if (argument.equals("#worldedit") || argument.equals("#we")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if (argument.equals("#worldedit") || argument.equals("#we")) {
                        result = true;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("r:") || argument.equals("radius:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if (argument.equals("#worldedit") || argument.equals("#we")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if (argument.equals("#worldedit") || argument.equals("#we")) {
                        if (user.getServer().getPluginManager().getPlugin("WorldEdit") != null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        for (String value : r_dat) {
                            String i4 = value.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.length() == value.length() && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                double a1 = Double.parseDouble(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        for (String value : r_dat) {
                            String i4 = value.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.length() == value.length() && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                double a1 = Double.parseDouble(i4);
                                if (rcount == 0) { // x
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("a:") || argument.equals("action:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 1 || argument.startsWith("a:") || argument.startsWith("action:")) {
                    result.clear();
                    argument = argument.replaceAll("action:", "");
                    argument = argument.replaceAll("a:", "");
                    if (argument.startsWith("#")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    result.clear();
                    argument = argument.replaceAll("action:", "");
                    argument = argument.replaceAll("a:", "");
                    if (argument.startsWith("#")) {
                        argument = argument.replaceFirst("#", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("a:", "");
                    if (argument.startsWith("#")) {
                        argument = argument.replaceFirst("#", "");
                    }
                    if (argument.equals("broke") || argument.equals("break") || argument.equals("remove") || argument.equals("destroy") || argument.equals("block-break") || argument.equals("block-remove") || argument.equals("-block") || argument.equals("-blocks") || argument.equals("block-")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("t:") || argument.equals("time:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 1 || argument.startsWith("t:") || argument.startsWith("time:")) {
                    // time arguments
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    // time arguments
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
                    range = argument.contains("-");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
                    range = argument.contains("-");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java

                        if (i3.endsWith("w") && w.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = new BigDecimal(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (i3.endsWith("w") && w.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = new BigDecimal(i4);
                                if (range) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("d") && d.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = new BigDecimal(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("d") && d.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = new BigDecimal(i4);
                                if (range) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("h") && h.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = new BigDecimal(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("h") && h.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = new BigDecimal(i4);
                                if (range) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("m") && m.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = new BigDecimal(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("m") && m.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = new BigDecimal(i4);
                                if (range) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("s") && s.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = new BigDecimal(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("s") && s.intValue() == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = new BigDecimal(i4);
                                if (range) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("e:") || argument.equals("exclude:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 5 || argument.startsWith("e:") || argument.startsWith("exclude:")) {
                    argument = argument.replaceAll("exclude:", "");
                    argument = argument.replaceAll("e:", "");
                    if (argument.contains(",")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 5 || argument.startsWith("e:") || argument.startsWith("exclude:")) {
                    argument = argument.replaceAll("exclude:", "");
                    argument = argument.replaceAll("e:", "");
                    if (argument.contains(",")) {
                        String[] i2 = argument.split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("t:") || argument.equals("time:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 1 || argument.startsWith("t:") || argument.startsWith("time:")) {
                    // time arguments
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    // time arguments
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
                    range = argument.contains("-");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
                    range = argument.contains("-");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java

                        if (i3.endsWith("w") && w == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = Double.parseDouble(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (i3.endsWith("w") && w == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                w = Double.parseDouble(i4);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("d") && d == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = Double.parseDouble(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("d") && d == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                d = Double.parseDouble(i4);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("h") && h == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = Double.parseDouble(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("h") && h == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                h = Double.parseDouble(i4);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("m") && m == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = Double.parseDouble(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("m") && m == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                m = Double.parseDouble(i4);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                        else if (i3.endsWith("s") && s == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = Double.parseDouble(i4);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        else if (i3.endsWith("s") && s == 0) {
                            String i4 = i3.replaceAll("[^0-9.]", "");
                            if (i4.length() > 0 && i4.replaceAll("[^0-9]", "").length() > 0 && i4.indexOf('.') == i4.lastIndexOf('.')) {
                                s = Double.parseDouble(i4);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim();
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim();
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                String inputProcessed = argument.toLowerCase(Locale.ROOT);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || inputProcessed.startsWith("r:") || inputProcessed.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "").replaceAll("r:", "");
                    inputProcessed = argument.toLowerCase(Locale.ROOT);
                    if ((processWorldEdit && (inputProcessed.equals("#worldedit") || inputProcessed.equals("#we"))) || inputProcessed.equals("#global") || inputProcessed.equals("global") || inputProcessed.equals("off") || inputProcessed.equals("-1") || inputProcessed.equals("none") || inputProcessed.equals("false")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || inputProcessed.startsWith("r:") || inputProcessed.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "").replaceAll("r:", "");
                    inputProcessed = argument.toLowerCase(Locale.ROOT);
                    if ((processWorldEdit && (inputProcessed.equals("#worldedit") || inputProcessed.equals("#we"))) || inputProcessed.equals("#global") || inputProcessed.equals("global") || inputProcessed.equals("off") || inputProcessed.equals("-1") || inputProcessed.equals("none") || inputProcessed.equals("false")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        world_id = Util.matchWorld(inputProcessed);
                        if (world_id == -1 && !requireLoaded) {
                            world_id = ConfigHandler.worlds.getOrDefault(argument.replaceFirst("#", ""), -1);
                        }
                    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("e:") || argument.equals("exclude:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 5 || argument.startsWith("e:") || argument.startsWith("exclude:")) {
                    argument = argument.replaceAll("exclude:", "");
                    argument = argument.replaceAll("e:", "");
                    if (argument.contains(",")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 5 || argument.startsWith("e:") || argument.startsWith("exclude:")) {
                    argument = argument.replaceAll("exclude:", "");
                    argument = argument.replaceAll("e:", "");
                    if (argument.contains(",")) {
                        String[] i2 = argument.split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");
                if (argument.equals("#count") || argument.equals("#sum")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");
                if (argument.equals("#count") || argument.equals("#sum")) {
                    result = true;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("n") || argument.equals("noisy") || argument.equals("v") || argument.equals("verbose") || argument.equals("#v") || argument.equals("#verbose")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
    private static void validUserCheck(List<String> users, String user) {
        List<String> badUsers = Arrays.asList("n", "noisy", "v", "verbose", "#v", "#verbose", "#silent", "#preview", "#preview_cancel", "#count", "#sum");
        String check = user.replaceAll("[\\s'\"]", "");
        if (check.equals(user) && check.length() > 0) {
            if (user.equalsIgnoreCase("#global")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
    protected static String[] parsePage(String[] argumentArray) {
        if (argumentArray.length == 2) {
            argumentArray[1] = argumentArray[1].replaceFirst("page:", "");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("i:") || argument.equals("include:") || argument.equals("item:") || argument.equals("items:") || argument.equals("b:") || argument.equals("block:") || argument.equals("blocks:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 4 || argument.startsWith("i:") || argument.startsWith("include:") || argument.startsWith("item:") || argument.startsWith("items:") || argument.startsWith("b:") || argument.startsWith("block:") || argument.startsWith("blocks:")) {
                    argument = argument.replaceAll("include:", "");
                    argument = argument.replaceAll("i:", "");
                    argument = argument.replaceAll("items:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 4 || argument.startsWith("i:") || argument.startsWith("include:") || argument.startsWith("item:") || argument.startsWith("items:") || argument.startsWith("b:") || argument.startsWith("block:") || argument.startsWith("blocks:")) {
                    argument = argument.replaceAll("include:", "");
                    argument = argument.replaceAll("i:", "");
                    argument = argument.replaceAll("items:", "");
                    argument = argument.replaceAll("item:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("include:", "");
                    argument = argument.replaceAll("i:", "");
                    argument = argument.replaceAll("items:", "");
                    argument = argument.replaceAll("item:", "");
                    argument = argument.replaceAll("blocks:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("i:", "");
                    argument = argument.replaceAll("items:", "");
                    argument = argument.replaceAll("item:", "");
                    argument = argument.replaceAll("blocks:", "");
                    argument = argument.replaceAll("block:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("items:", "");
                    argument = argument.replaceAll("item:", "");
                    argument = argument.replaceAll("blocks:", "");
                    argument = argument.replaceAll("block:", "");
                    argument = argument.replaceAll("b:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("item:", "");
                    argument = argument.replaceAll("blocks:", "");
                    argument = argument.replaceAll("block:", "");
                    argument = argument.replaceAll("b:", "");
                    if (argument.contains(",")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("blocks:", "");
                    argument = argument.replaceAll("block:", "");
                    argument = argument.replaceAll("b:", "");
                    if (argument.contains(",")) {
                        String[] i2 = argument.split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("position:") || argument.equals("location:") || argument.equals("c:") || argument.equals("coord:") || argument.equals("coords:") || argument.equals("cord:") || argument.equals("cords:") || argument.equals("coordinate:") || argument.equals("coordinates:") || argument.equals("cordinate:") || argument.equals("cordinates:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || argument.startsWith("c:") || argument.startsWith("coord:") || argument.startsWith("coords:") || argument.startsWith("cord:") || argument.startsWith("cords:") || argument.startsWith("coordinate:") || argument.startsWith("coordinates:") || argument.startsWith("cordinate:") || argument.startsWith("cordinates:")) {
                    argument = argument.replaceAll("coordinates:", "");
                    argument = argument.replaceAll("coordinate:", "");
                    argument = argument.replaceAll("cordinates:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 2 || argument.startsWith("c:") || argument.startsWith("coord:") || argument.startsWith("coords:") || argument.startsWith("cord:") || argument.startsWith("cords:") || argument.startsWith("coordinate:") || argument.startsWith("coordinates:") || argument.startsWith("cordinate:") || argument.startsWith("cordinates:")) {
                    argument = argument.replaceAll("coordinates:", "");
                    argument = argument.replaceAll("coordinate:", "");
                    argument = argument.replaceAll("cordinates:", "");
                    argument = argument.replaceAll("cordinate:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("coordinates:", "");
                    argument = argument.replaceAll("coordinate:", "");
                    argument = argument.replaceAll("cordinates:", "");
                    argument = argument.replaceAll("cordinate:", "");
                    argument = argument.replaceAll("coords:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("coordinate:", "");
                    argument = argument.replaceAll("cordinates:", "");
                    argument = argument.replaceAll("cordinate:", "");
                    argument = argument.replaceAll("coords:", "");
                    argument = argument.replaceAll("coord:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("cordinates:", "");
                    argument = argument.replaceAll("cordinate:", "");
                    argument = argument.replaceAll("coords:", "");
                    argument = argument.replaceAll("coord:", "");
                    argument = argument.replaceAll("cords:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("cordinate:", "");
                    argument = argument.replaceAll("coords:", "");
                    argument = argument.replaceAll("coord:", "");
                    argument = argument.replaceAll("cords:", "");
                    argument = argument.replaceAll("cord:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("coords:", "");
                    argument = argument.replaceAll("coord:", "");
                    argument = argument.replaceAll("cords:", "");
                    argument = argument.replaceAll("cord:", "");
                    argument = argument.replaceAll("c:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("coord:", "");
                    argument = argument.replaceAll("cords:", "");
                    argument = argument.replaceAll("cord:", "");
                    argument = argument.replaceAll("c:", "");
                    if (argument.contains(",")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("cords:", "");
                    argument = argument.replaceAll("cord:", "");
                    argument = argument.replaceAll("c:", "");
                    if (argument.contains(",")) {
                        String[] i2 = argument.split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        int cCount = 0;
                        for (String coord : i2) {
                            coord = coord.replaceAll("[^0-9.\\-]", "");
                            if (coord.length() > 0 && !coord.equals(".") && !coord.equals("-") && coord.indexOf('.') == coord.lastIndexOf('.')) {
                                double parsedCoord = Double.parseDouble(coord);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("r:") || argument.equals("radius:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if ((processWorldEdit && (argument.equals("#worldedit") || argument.equals("#we"))) || argument.equals("#global") || argument.equals("global") || argument.equals("off") || argument.equals("-1") || argument.equals("none") || argument.equals("false")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 2 || argument.startsWith("r:") || argument.startsWith("radius:")) {
                    argument = argument.replaceAll("radius:", "");
                    argument = argument.replaceAll("r:", "");
                    if ((processWorldEdit && (argument.equals("#worldedit") || argument.equals("#we"))) || argument.equals("#global") || argument.equals("global") || argument.equals("off") || argument.equals("-1") || argument.equals("none") || argument.equals("false")) {
                        worldName = "";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    }
                    else if (argument.startsWith("#")) {
                        worldName = argument.replaceFirst("#", "");
                    }
                    next = 0;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (argument.equals("rows:")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 1 || argument.startsWith("rows:")) {
                    argument = argument.replaceAll("rows:", "").trim();
                    if (!argument.startsWith("-")) {
                        String i2 = argument.replaceAll("[^0-9]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("rows:", "").trim();
                    if (!argument.startsWith("-")) {
                        String i2 = argument.replaceAll("[^0-9]", "");
                        if (i2.length() > 0 && i2.length() < 10) {
                            rows = Integer.parseInt(i2);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");

                if (next == 2) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                }
                else if (next == 1 || argument.startsWith("p:") || argument.startsWith("user:") || argument.startsWith("users:") || argument.startsWith("u:")) {
                    argument = argument.replaceAll("user:", "");
                    argument = argument.replaceAll("users:", "");
                    argument = argument.replaceAll("p:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                else if (next == 1 || argument.startsWith("p:") || argument.startsWith("user:") || argument.startsWith("users:") || argument.startsWith("u:")) {
                    argument = argument.replaceAll("user:", "");
                    argument = argument.replaceAll("users:", "");
                    argument = argument.replaceAll("p:", "");
                    argument = argument.replaceAll("u:", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("user:", "");
                    argument = argument.replaceAll("users:", "");
                    argument = argument.replaceAll("p:", "");
                    argument = argument.replaceAll("u:", "");
                    if (argument.contains(",")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("users:", "");
                    argument = argument.replaceAll("p:", "");
                    argument = argument.replaceAll("u:", "");
                    if (argument.contains(",")) {
                        String[] i2 = argument.split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
            if (count > 0) {
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");
                if (argument.equals("#preview")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                argument = argument.trim().toLowerCase(Locale.ROOT);
                argument = argument.replaceAll("\\\\", "");
                argument = argument.replaceAll("'", "");
                if (argument.equals("#preview")) {
                    result = 1;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                            if (dyeSet.contains(handType)) {
                                newColor = (DyeColor.valueOf(handType.name().replaceFirst("_DYE", ""))).getColor().asRGB();
                            }
                            else {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java

            if (x == null) {
                x = args[i].replaceAll("[^0-9.\\-]", "");
            }
            else if (z == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
            }
            else if (z == null) {
                z = args[i].replaceAll("[^0-9.\\-]", "");
            }
            else if (y == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
            else if (y == null) {
                y = z;
                z = args[i].replaceAll("[^0-9.\\-]", "");
            }
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        }

        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java

        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");

        if ((x.length() == 0 || x.length() >= 12 || x.equals(xValidate)) || (y.length() == 0 || y.length() >= 12 || y.equals(yValidate)) || (z.length() == 0 || z.length() >= 12 || z.equals(zValidate))) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                if (blc > 0) {
                    while (blfile.getFilePointer() < blfile.length()) {
                        String blacklistUser = blfile.readLine().replaceAll(" ", "").toLowerCase(Locale.ROOT);
                        if (blacklistUser.length() > 0) {
                            ConfigHandler.blacklist.put(blacklistUser, true);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
        }

        configured = configured.replaceAll("[^0-9]", "");

        return configured.isEmpty() ? 0 : Integer.parseInt(configured);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/language/Phrase.java`
#### Snippet
```java

        if (color.length() > 0) {
            output = output.replaceFirst(split, split + color);
            output = ChatMessage.parseQuotes(output, color);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
    private static boolean performVersionChecks() {
        try {
            String[] bukkitVersion = Bukkit.getServer().getBukkitVersion().split("[-.]");
            if (Util.newVersion(bukkitVersion[0] + "." + bukkitVersion[1], ConfigHandler.SPIGOT_VERSION)) {
                Chat.console(Phrase.build(Phrase.VERSION_REQUIRED, "Spigot", ConfigHandler.SPIGOT_VERSION));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                return false;
            }
            String[] javaVersion = (System.getProperty("java.version").replaceAll("[^0-9.]", "") + ".0").split("\\.");
            if (Util.newVersion(javaVersion[0] + "." + javaVersion[1], ConfigHandler.JAVA_VERSION)) {
                Chat.console(Phrase.build(Phrase.VERSION_REQUIRED, "Java", ConfigHandler.JAVA_VERSION));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }

        if (args[0].toLowerCase(Locale.ROOT).equals("page") && (args.length != 2 || !args[1].equals(args[1].replaceAll("[^0-9]", "")))) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, Color.WHITE, "/co page <page>"));
            return;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            if (dat.contains(":")) {
                String[] split = dat.split(":");
                String check1 = split[0].replaceAll("[^a-zA-Z_]", "");
                String check2 = "";
                if (split.length > 1) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                String check2 = "";
                if (split.length > 1) {
                    check2 = split[1].replaceAll("[^a-zA-Z_]", "");
                }
                if (check1.length() > 0 || check2.length() > 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }
            else {
                String check1 = dat.replaceAll("[^a-zA-Z_]", "");
                if (check1.length() > 0) {
                    type = 4;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                        results = data[1];
                    }
                    results = results.replaceAll("[^0-9]", "");
                    if (results.length() > 0 && results.length() < 10) {
                        int r = Integer.parseInt(results);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                }
                pages = pages.replaceAll("[^0-9]", "");
                if (pages.length() > 0 && pages.length() < 10) {
                    int pa = Integer.parseInt(pages);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                        results = data[1];
                    }
                    results = results.replaceAll("[^0-9]", "");
                    if (results.length() > 0 && results.length() < 10) {
                        int r = Integer.parseInt(results);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                }
                pages = pages.replaceAll("[^0-9]", "");
                if (pages.length() > 0 && pages.length() < 10) {
                    int p = Integer.parseInt(pages);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                            results = data[1];
                        }
                        results = results.replaceAll("[^0-9]", "");
                        if (results.length() > 0 && results.length() < 10) {
                            int r = Integer.parseInt(results);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                        }
                    }
                    pages = pages.replaceAll("[^0-9]", "");
                    if (pages.length() > 0 && pages.length() < 10) {
                        int p = Integer.parseInt(pages);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    int action = Integer.parseInt(data[6]);
                                                    String timeago = Util.getTimeSince(Integer.parseInt(time), unixtimestamp, true);
                                                    int timeLength = 50 + (Util.getTimeSince(Integer.parseInt(time), unixtimestamp, false).replaceAll("[^0-9]", "").length() * 6);
                                                    String leftPadding = Color.BOLD + Strings.padStart("", 10, ' ');
                                                    if (timeLength % 4 == 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    String message = data[6];
                                                    String timeago = Util.getTimeSince(Integer.parseInt(time), unixtimestamp, true);
                                                    int timeLength = 50 + (Util.getTimeSince(Integer.parseInt(time), unixtimestamp, false).replaceAll("[^0-9]", "").length() * 6);
                                                    String leftPadding = Color.BOLD + Strings.padStart("", 10, ' ');
                                                    if (timeLength % 4 == 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

                                                    String timeago = Util.getTimeSince(Integer.parseInt(time), unixtimestamp, true);
                                                    int timeLength = 50 + (Util.getTimeSince(Integer.parseInt(time), unixtimestamp, false).replaceAll("[^0-9]", "").length() * 6);
                                                    String leftPadding = Color.BOLD + Strings.padStart("", 10, ' ');
                                                    if (timeLength % 4 == 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        String[] args = message.split(" ");
        if (args.length < 2 || !args[0].replaceFirst("/", "").equals("kill") || !args[1].startsWith("@e")) {
            return;
        }
```

## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.event.player` is unnecessary, and can be replaced with an import
in `src/main/java/net/coreprotect/listener/player/PlayerBucketEmptyListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.HIGHEST)
    protected void onPlayerBucketEmpty(org.bukkit.event.player.PlayerBucketEmptyEvent event) {
        String player = event.getPlayer().getName();
        World world = event.getPlayer().getWorld();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.entity` is unnecessary and can be removed
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            Axolotl axolotl = (Axolotl) entity;
            if (count == 0) {
                org.bukkit.entity.Axolotl.Variant set = (org.bukkit.entity.Axolotl.Variant) value;
                axolotl.setVariant(set);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.entity` is unnecessary and can be removed
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            Axolotl axolotl = (Axolotl) entity;
            if (count == 0) {
                org.bukkit.entity.Axolotl.Variant set = (org.bukkit.entity.Axolotl.Variant) value;
                axolotl.setVariant(set);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.entity` is unnecessary and can be removed
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        else if (count == 1 && value != null) {
                            // deprecated
                            org.bukkit.entity.Horse.Color set = (org.bukkit.entity.Horse.Color) value;
                            if (entity instanceof Horse) {
                                Horse horse = (Horse) entity;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.entity` is unnecessary and can be removed
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        else if (count == 1 && value != null) {
                            // deprecated
                            org.bukkit.entity.Horse.Color set = (org.bukkit.entity.Horse.Color) value;
                            if (entity instanceof Horse) {
                                Horse horse = (Horse) entity;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.entity` is unnecessary and can be removed
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            }
                            else if (count == 9) {
                                org.bukkit.entity.Horse.Color set = (org.bukkit.entity.Horse.Color) value;
                                horse.setColor(set);
                            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.entity` is unnecessary and can be removed
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            }
                            else if (count == 9) {
                                org.bukkit.entity.Horse.Color set = (org.bukkit.entity.Horse.Color) value;
                                horse.setColor(set);
                            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit` is unnecessary, and can be replaced with an import
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            else if (count == 12 && value != null) {
                                @SuppressWarnings("unchecked")
                                org.bukkit.Color set = org.bukkit.Color.deserialize((Map<String, Object>) value);
                                ItemStack armor = horse.getInventory().getArmor();
                                if (armor != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit` is unnecessary, and can be replaced with an import
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            else if (count == 12 && value != null) {
                                @SuppressWarnings("unchecked")
                                org.bukkit.Color set = org.bukkit.Color.deserialize((Map<String, Object>) value);
                                ItemStack armor = horse.getInventory().getArmor();
                                if (armor != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit` is unnecessary and can be removed
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                            effectBuilder = FireworkEffect.builder();
                            for (Map<String, Object> fireworkData : map) {
                                org.bukkit.FireworkEffect.Type type = (org.bukkit.FireworkEffect.Type) fireworkData.getOrDefault("type", org.bukkit.FireworkEffect.Type.BALL);
                                boolean hasFlicker = (Boolean) fireworkData.get("flicker");
                                boolean hasTrail = (Boolean) fireworkData.get("trail");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit` is unnecessary and can be removed
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                            effectBuilder = FireworkEffect.builder();
                            for (Map<String, Object> fireworkData : map) {
                                org.bukkit.FireworkEffect.Type type = (org.bukkit.FireworkEffect.Type) fireworkData.getOrDefault("type", org.bukkit.FireworkEffect.Type.BALL);
                                boolean hasFlicker = (Boolean) fireworkData.get("flicker");
                                boolean hasTrail = (Boolean) fireworkData.get("trail");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit` is unnecessary and can be removed
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                            effectBuilder = FireworkEffect.builder();
                            for (Map<String, Object> fireworkData : map) {
                                org.bukkit.FireworkEffect.Type type = (org.bukkit.FireworkEffect.Type) fireworkData.getOrDefault("type", org.bukkit.FireworkEffect.Type.BALL);
                                boolean hasFlicker = (Boolean) fireworkData.get("flicker");
                                boolean hasTrail = (Boolean) fireworkData.get("trail");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bukkit.block.data.type` is unnecessary and can be removed
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                        else if (rowType == Material.MOVING_PISTON && blockData instanceof TechnicalPiston && !(blockData instanceof PistonHead)) {
                                            TechnicalPiston technicalPiston = (TechnicalPiston) blockData;
                                            rowType = (technicalPiston.getType() == org.bukkit.block.data.type.TechnicalPiston.Type.STICKY ? Material.STICKY_PISTON : Material.PISTON);
                                            blockData = rowType.createBlockData();
                                            ((Piston) blockData).setFacing(technicalPiston.getFacing());
```

## RegExpSingleCharAlternation
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            else if (version.contains(".")) {
                String[] worldEditVersion = version.split("-|\\.");
                if (worldEditVersion.length >= 2) {
                    worldEditVersion[0] = worldEditVersion[0].replaceAll("[^0-9]", "");
```

## ComparatorMethodParameterNotUsed
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<>((e1, e2) -> {
            int res = e1.getValue().compareTo(e2.getValue());
            return res != 0 ? res : 1;
        });
        sortedEntries.addAll(map.entrySet());
```

## ThrowablePrintStackTrace
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/NetworkDebugCommand.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/UsernameLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/ChatLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/WorldEditHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/ItemLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/ItemLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/SignTextLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/ContainerBreakLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_10_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/BlockPlaceLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        pausedSuccess = false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
                errorDelay();
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    @Override
    public void uncaughtException(Thread thread, Throwable e) {
        e.printStackTrace();
        Bukkit.getPluginManager().disablePlugin(CoreProtect.getInstance());
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/worldedit/CoreProtectEditSessionEvent.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/api/SessionLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_6_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_5_0.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_5_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/SkullPlaceLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java
        catch (Exception exception) {
            Chat.console(exception.toString());
            exception.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/api/BlockAPI.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/ChatStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/HopperPushListener.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return resultText;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
        catch (Exception e) {
            Chat.console(Phrase.build(Phrase.UPDATE_ERROR));
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/CommandStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/PlayerInteractLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/CommandLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_17_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/ReloadCommand.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_11_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/thread/CacheHandler.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/UndoCommand.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                }
                else {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            if (!success) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                    Chat.console(Phrase.build(Phrase.DATABASE_INDEX_ERROR));
                    if (purge) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                    ConfigHandler.databaseReachable = false;
                    Chat.sendConsoleMessage(Color.RED + "[CoreProtect] " + Phrase.build(Phrase.MYSQL_UNAVAILABLE));
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                catch (Exception e) {
                                    error = true;
                                    e.printStackTrace();
                                }
                            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                    abort = true;
                                    break;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }

                                e.printStackTrace();
                            }
                        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                catch (Exception e) {
                    Chat.sendGlobalMessage(player, Phrase.build(Phrase.PURGE_FAILED));
                    e.printStackTrace();
                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/SkullStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/SkullStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return id;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_20_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/WorldStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_21_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, ticks);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, ticks);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, ticks);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, ticks);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_18_1.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Teleport.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/FoodLevelChangeListener.java`
#### Snippet
```java
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return equipment;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/BlockStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return id;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return inventory;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return contents;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return name;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/SessionStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/CancelCommand.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }
                            });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/api/QueueLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/MaterialStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/MaterialStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/ItemStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_15_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_16_0.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_16_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_19_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/PlayerKillLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/PlayerSessionLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/EntityKillLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                String error = e.getMessage().toLowerCase();
                if (!error.contains("duplicate") && !error.contains("error 1060")) {
                    e.printStackTrace();
                    return false;
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                Database.commitTransaction(statement);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/logger/SkullBreakLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/statement/ContainerStatement.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/lookup/PlayerLookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/utility/ChestTool.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, 2);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
                start = false;
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }, 0);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }
                                if (ConfigHandler.activeRollbacks.get(player2.getName()) != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new Object[] { slot, faceData, itemstack };
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                        int[] rollbackHashData1 = ConfigHandler.rollbackHash.get(finalUserString);
                        int itemCount1 = rollbackHashData1[0];
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }
        catch (Exception e) {
            e.printStackTrace();
        }

```

## Convert2Lambda
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java
            ConfigHandler.rollbackHash.put(userString, new int[] { 0, 0, 0, 0 });

            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(CoreProtect.getInstance(), new Runnable() {
                @Override
                public void run() {
```

## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java

            if (checkType == Material.LECTERN) {
                blockData = blockData.replaceFirst("has_book=true", "has_book=false");
            }
            else if (checkType == Material.PAINTING || BukkitAdapter.ADAPTER.isItemFrame(checkType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java
            }
            else if (checkType == Material.PAINTING || BukkitAdapter.ADAPTER.isItemFrame(checkType)) {
                blockData = overrideData;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java
                long startTime = (Long) list.get(0);
                long endTime = (Long) list.get(1);
                args = (String[]) list.get(2);
                Location location = (Location) list.get(3);
                boolean valid = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/database/logger/BlockPlaceLogger.java`
#### Snippet
```java
            Material type = block.getType();
            if (blockData == null && (forceType == null || (!forceType.equals(Material.WATER)) && (!forceType.equals(Material.LAVA)))) {
                blockData = block.getBlockData().getAsString();
                if (blockData.equals("minecraft:air")) {
                    blockData = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/database/logger/BlockPlaceLogger.java`
#### Snippet
```java
                blockData = block.getBlockData().getAsString();
                if (blockData.equals("minecraft:air")) {
                    blockData = null;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `inventoryData`
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
                if (playerLocation != null) {
                    if (inventoryData == null) {
                        inventoryData = inventory.getContents();
                    }

```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `src/main/java/net/coreprotect/consumer/process/NaturalBlockBreakProcess.java`
#### Snippet
```java
                    String removed = Lookup.whoRemovedCache(blockState);
                    if (removed.length() > 0) {
                        user = removed;
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
            if (command == null) {
                if (commandSender.hasPermission("coreprotect.co")) {
                    command = "co";
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
                    command = "core";
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
                    command = "coreprotect";
                }
                else {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }
                else {
                    command = "co";
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
            if (command == null) {
                if (commandSender.hasPermission("coreprotect.co")) {
                    command = "co";
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
                    command = "core";
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
                    command = "coreprotect";
                }
                else {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/InteractionLookup.java`
#### Snippet
```java
                }
                else {
                    command = "co";
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `itemStack`
in `src/main/java/net/coreprotect/listener/player/ProjectileLaunchListener.java`
#### Snippet
```java
        int itemId = getItemId(loggingItemId);

        itemStack = itemStack.clone();
        if (amount > 0) {
            itemStack.setAmount(amount);
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/net/coreprotect/command/UndoCommand.java`
#### Snippet
```java
                long startTime = (Long) list.get(0);
                long endTime = (Long) list.get(1);
                args = (String[]) list.get(2);
                Location location = (Location) list.get(3);
                for (String arg : args) {
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
            int index = substring(substring, "|", selector);
            if (index == -1) {
                param = substring.substring(0, substring.indexOf("|"));
            }
            else {
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
            }
            else {
                param = substring.substring(index + 1, (substring.lastIndexOf("|") > index ? substring(substring, "|", selector + 1) : substring.length()));
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `output`
in `src/main/java/net/coreprotect/language/Selector.java`
#### Snippet
```java
            }

            output = output.replace("{" + substring + "}", color + param + (color.length() > 0 ? Color.WHITE : color));
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `contents`
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                try {
                    if (contents == null) {
                        contents = Util.getContainerContents(type, container, location);
                    }
                    if (contents != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `uuid`
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                uuid = resultSet.getString("uuid");
            }
            resultSet.close();
```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `src/main/java/net/coreprotect/utility/ChatMessage.java`
#### Snippet
```java
        if (indexFirst > -1 && indexLast > indexFirst) {
            String quoteText = string.substring(indexFirst + 1, indexLast);
            string = string.replace(quoteText, Color.DARK_AQUA + ChatColor.stripColor(quoteText) + textColor);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `src/main/java/net/coreprotect/consumer/process/StructureGrowthProcess.java`
#### Snippet
```java
                String resultData = Lookup.whoPlaced(statement, block);
                if (resultData.length() > 0) {
                    user = resultData;
                }
                int count = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
    protected static void queueRollbackUpdate(String user, Location location, List<Object[]> list, int table, int action) {
        if (location == null) {
            location = new Location(Bukkit.getServer().getWorlds().get(0), 0, 0, 0);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `extraData`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        if (type == Material.SPAWNER && block instanceof CreatureSpawner) { // Mob spawner
            CreatureSpawner mobSpawner = (CreatureSpawner) block;
            extraData = Util.getSpawnerType(mobSpawner.getSpawnedType());
        }
        else if (type == Material.IRON_DOOR || BlockGroup.DOORS.contains(type) || type.equals(Material.SUNFLOWER) || type.equals(Material.LILAC) || type.equals(Material.TALL_GRASS) || type.equals(Material.LARGE_FERN) || type.equals(Material.ROSE_BUSH) || type.equals(Material.PEONY)) { // Double plant
```

### AssignmentToMethodParameter
Assignment to method parameter `block`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java

                    if (block.getY() > BukkitAdapter.ADAPTER.getMinHeight(block.getWorld())) {
                        block = block.getWorld().getBlockAt(block.getX(), block.getY() - 1, block.getZ()).getState();
                        if (type != block.getType()) {
                            return;
```

### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
                        }

                        blockData = block.getBlockData().getAsString();
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `forceData`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            CreatureSpawner mobSpawner = (CreatureSpawner) blockLocation;
            data = Util.getSpawnerType(mobSpawner.getSpawnedType());
            forceData = 1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `forceData`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        if (forceType != null) {
            type = forceType;
            forceData = 1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `forceData`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        if (forceD != -1) {
            data = forceD;
            forceData = 1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
            if (command == null) {
                if (commandSender.hasPermission("coreprotect.co")) {
                    command = "co";
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
                    command = "core";
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
                    command = "coreprotect";
                }
                else {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                }
                else {
                    command = "co";
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `list`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_15.java`
#### Snippet
```java
            if (subMeta.hasCustomEffects()) {
                for (PotionEffect effect : subMeta.getCustomEffects()) {
                    list = new ArrayList<>();
                    list.add(effect.serialize());
                    metadata.add(list);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        // Name entered by user
        EntityType type = null;
        name = name.toLowerCase(Locale.ROOT).trim();
        if (name.contains(NAMESPACE)) {
            name = (name.split(":"))[1];
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        name = name.toLowerCase(Locale.ROOT).trim();
        if (name.contains(NAMESPACE)) {
            name = (name.split(":"))[1];
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static int getEntityId(String name, boolean internal) {
        int id = -1;
        name = name.toLowerCase(Locale.ROOT).trim();

        if (ConfigHandler.entities.get(name) != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    }
                }
                string = String.join(",", blockDataArray);
            }
            else if (!string.contains(":") && (material == Material.PAINTING || BukkitAdapter.ADAPTER.isItemFrame(material))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                int id = getBlockdataId(string, true);
                if (id > -1) {
                    string = Integer.toString(id);
                }
                else {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            switch (data) {
                case 1:
                    name = "granite";
                    break;
                case 2:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    break;
                case 2:
                    name = "polished_granite";
                    break;
                case 3:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    break;
                case 3:
                    name = "diorite";
                    break;
                case 4:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    break;
                case 4:
                    name = "polished_diorite";
                    break;
                case 5:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    break;
                case 5:
                    name = "andesite";
                    break;
                case 6:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    break;
                case 6:
                    name = "polished_andesite";
                    break;
                default:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    break;
                default:
                    name = "stone";
                    break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `container`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                // container may be null if called from within WorldEdit logger
                if (container == null) {
                    container = location.getBlock();
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static void setTypeAndData(Block block, Material type, BlockData blockData, boolean update) {
        if (blockData == null && type != null) {
            blockData = createBlockData(type);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        // Name entered by user
        Material material = null;
        name = name.toUpperCase(Locale.ROOT).trim();
        if (!name.startsWith("#")) {
            if (name.contains(NAMESPACE.toUpperCase(Locale.ROOT))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        if (!name.startsWith("#")) {
            if (name.contains(NAMESPACE.toUpperCase(Locale.ROOT))) {
                name = name.split(":")[1];
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }

            name = BukkitAdapter.ADAPTER.parseLegacyName(name);
            material = Material.matchMaterial(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `blockData`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static void prepareTypeAndData(Map<Block, BlockData> map, Block block, Material type, BlockData blockData, boolean update) {
        if (blockData == null) {
            blockData = createBlockData(type);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static int getArtId(String name, boolean internal) {
        int id = -1;
        name = name.toLowerCase(Locale.ROOT).trim();

        if (ConfigHandler.art.get(name) != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                    nameWid = Util.getWorldName(Integer.parseInt(nameWid));
                    if (nameWid.length() > 0) {
                        name = nameWid;
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            // Determine closest match on world name
            String result = "";
            name = name.replaceFirst("#", "").toLowerCase(Locale.ROOT).trim();
            for (World world : Bukkit.getServer().getWorlds()) {
                String worldName = world.getName();
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        int id = -1;

        name = name.toLowerCase(Locale.ROOT).trim();
        if (!name.contains(":")) {
            name = NAMESPACE + name;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        name = name.toLowerCase(Locale.ROOT).trim();
        if (!name.contains(":")) {
            name = NAMESPACE + name;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static int getBlockdataId(String data, boolean internal) {
        int id = -1;
        data = data.toLowerCase(Locale.ROOT).trim();

        if (ConfigHandler.blockdata.get(data) != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `material`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        switch (material) {
            case WHEAT:
                material = Material.WHEAT_SEEDS;
                break;
            case PUMPKIN_STEM:
```

### AssignmentToMethodParameter
Assignment to method parameter `material`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                break;
            case PUMPKIN_STEM:
                material = Material.PUMPKIN_SEEDS;
                break;
            case MELON_STEM:
```

### AssignmentToMethodParameter
Assignment to method parameter `material`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                break;
            case MELON_STEM:
                material = Material.MELON_SEEDS;
                break;
            case BEETROOTS:
```

### AssignmentToMethodParameter
Assignment to method parameter `material`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
                break;
            case BEETROOTS:
                material = Material.BEETROOT_SEEDS;
                break;
            default:
```

### AssignmentToMethodParameter
Assignment to method parameter `material`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        if (material.name().contains("WALL_")) {
            material = Material.valueOf(material.name().replace("WALL_", ""));
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }

        string = string.toLowerCase(Locale.ROOT);

        if (allWords) {
```

### AssignmentToMethodParameter
Assignment to method parameter `material`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
    public static int getBlockId(Material material) {
        if (material == null) {
            material = Material.AIR;
        }
        return getBlockId(material.name(), true);
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/net/coreprotect/command/CancelCommand.java`
#### Snippet
```java
                long startTime = (Long) list.get(0);
                long endTime = (Long) list.get(1);
                args = (String[]) list.get(2);
                Location location = (Location) list.get(3);
                boolean valid = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
            if (command == null) {
                if (commandSender.hasPermission("coreprotect.co")) {
                    command = "co";
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
                    command = "core";
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
                    command = "coreprotect";
                }
                else {
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/net/coreprotect/database/lookup/SignMessageLookup.java`
#### Snippet
```java
                }
                else {
                    command = "co";
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
        switch (name) {
            case "GRASS_PATH":
                name = "DIRT_PATH";
                break;
            default:
```

### AssignmentToMethodParameter
Assignment to method parameter `list`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java

            if (subMeta.hasItems()) {
                list = new ArrayList<>();
                for (ItemStack itemStack : subMeta.getItems()) {
                    Map<String, Object> itemMap = Util.serializeItemStack(itemStack, null, slot);
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/net/coreprotect/utility/Chat.java`
#### Snippet
```java
    public static void sendMessage(CommandSender sender, String message) {
        if (sender instanceof ConsoleCommandSender) {
            message = message.replace(Color.DARK_AQUA, ChatColor.DARK_AQUA.toString());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java

    private static void parseUser(List<String> users, String string) {
        string = string.trim();
        if (string.contains(",")) {
            String[] data = string.split(",");
```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
        if (check.equals(user) && check.length() > 0) {
            if (user.equalsIgnoreCase("#global")) {
                user = "#global";
            }
            if (!badUsers.contains(user.toLowerCase(Locale.ROOT))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        if (cCount > 1) {
                            if (location == null && worldId > 0) {
                                location = new Location(Bukkit.getWorld(Util.getWorldName(worldId)), 0, 0, 0);
                            }
                            if (location != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

        if (sender instanceof ConsoleCommandSender) {
            string = string.replace(SpigotHandler.DARK_AQUA.toString(), ChatColor.DARK_AQUA.toString());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
    protected static void runCommand(CommandSender player, Command command, boolean permission, String[] args) {
        int resultc = args.length;
        args = CommandHandler.parsePage(args);
        Location lo = CommandHandler.parseLocation(player, args);
        // List<String> arg_uuids = new ArrayList<String>();
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

    public static void parseEntityKills(String message) {
        message = message.trim().toLowerCase(Locale.ROOT);
        if (!message.contains(" ")) {
            return;
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
        boolean isCommand = (damage.getCause() == DamageCause.VOID && entity.getLocation().getBlockY() >= BukkitAdapter.ADAPTER.getMinHeight(entity.getWorld()));
        if (e == null) {
            e = isCommand ? "#command" : "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            if (attacker instanceof Player) {
                Player player = (Player) attacker;
                e = player.getName();
            }
            else if (attacker instanceof AbstractArrow) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                if (shooter instanceof Player) {
                    Player player = (Player) shooter;
                    e = player.getName();
                }
                else if (shooter instanceof LivingEntity) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                    if (entityType != null) { // Check for MyPet plugin
                        String name = entityType.name().toLowerCase(Locale.ROOT);
                        e = "#" + name;
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                if (shooter instanceof Player) {
                    Player player = (Player) shooter;
                    e = player.getName();
                }
                else if (shooter instanceof LivingEntity) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                    if (entityType != null) { // Check for MyPet plugin
                        String name = entityType.name().toLowerCase(Locale.ROOT);
                        e = "#" + name;
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (attacker.getType().name() != null) {
                e = "#" + attacker.getType().name().toLowerCase(Locale.ROOT);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            EntityDamageEvent.DamageCause cause = damage.getCause();
            if (cause.equals(EntityDamageEvent.DamageCause.FIRE)) {
                e = "#fire";
            }
            else if (cause.equals(EntityDamageEvent.DamageCause.FIRE_TICK)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            else if (cause.equals(EntityDamageEvent.DamageCause.FIRE_TICK)) {
                if (!skip) {
                    e = "#fire";
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (cause.equals(EntityDamageEvent.DamageCause.LAVA)) {
                e = "#lava";
            }
            else if (cause.equals(EntityDamageEvent.DamageCause.BLOCK_EXPLOSION)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (cause.equals(EntityDamageEvent.DamageCause.BLOCK_EXPLOSION)) {
                e = "#explosion";
            }
            else if (cause.equals(EntityDamageEvent.DamageCause.MAGIC)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }
            else if (cause.equals(EntityDamageEvent.DamageCause.MAGIC)) {
                e = "#magic";
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                    // Player player = (Player)entity;
                    // e = player.getName();
                    e = "#" + entity_type.name().toLowerCase(Locale.ROOT);
                }
                else if (entity instanceof Player) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                }
                else if (entity instanceof Player) {
                    e = entity.getName();
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        if (e.startsWith("#wither")) {
            e = "#wither";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        if (e.startsWith("#enderdragon")) {
            e = "#enderdragon";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        if (e.startsWith("#primedtnt") || e.startsWith("#tnt")) {
            e = "#tnt";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        if (e.startsWith("#lightning")) {
            e = "#lightning";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `restrictUsers`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        if (restrictUsers == null) {
            restrictUsers = new ArrayList<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `excludeUsers`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        if (excludeUsers == null) {
            excludeUsers = new ArrayList<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `actionList`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        if (actionList == null) {
            actionList = new ArrayList<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `radius`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        if (radius < 1) {
            radius = -1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `restrictWorld`
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
            List<Integer> validActions = Arrays.asList(0, 1, 2, 3);
            if (radius != null) {
                restrictWorld = true;
            }

```

## ReturnNull
### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java
    public Block getBlock() {
        // TODO Auto-generated method stub
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java
    public List<MetadataValue> getMetadata(String metadataKey) {
        // TODO Auto-generated method stub
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java
    public MaterialData getData() {
        // TODO Auto-generated method stub
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java
    public Chunk getChunk() {
        // TODO Auto-generated method stub
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java
    @Override
    public ItemStack adjustIngredient(MerchantRecipe recipe, ItemStack itemStack) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/bukkit/BukkitAdapter.java`
#### Snippet
```java
    @Override
    public Material getFrameType(EntityType type) {
        return type == EntityType.ITEM_FRAME ? Material.ITEM_FRAME : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_18.java`
#### Snippet
```java
            }
            else if (Boolean.FALSE.equals(hasAdjust)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_18.java`
#### Snippet
```java
        catch (Exception e) {
            hasAdjust = false;
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }
        catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
                return Material.GLOW_ITEM_FRAME;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                        Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_INCLUDE, i3));
                                        // Functions.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, "/co help include"));
                                        return null;
                                    }
                                }
```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_INCLUDE, argument));
                                    // Functions.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, "/co help include"));
                                    return null;
                                }
                            }
```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java
    private static Map<Enchantment, Integer> getEnchantments(ItemMeta itemMeta) {
        if (itemMeta == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
        Plugin plugin = server.getPluginManager().getPlugin("WorldEdit");
        if (plugin == null || !(plugin instanceof WorldEditPlugin)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(user, time, radius, location, parseList(restrict), parseList(exclude), 0, 2, -1, -1, false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(time, radius, radiusLocation, parseList(restrictBlocks), parseList(excludeBlocks), restrictUsers, excludeUsers, actionList, 1, 2, -1, -1, false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        public BlockData getBlockData() {
            if (parse.length < 13) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return BlockAPI.performLookup(block, time);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        if (restrictUsers.contains("#global") && radius == -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        if (radius > -1 && location == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(time, radius, radiusLocation, parseList(restrictBlocks), parseList(excludeBlocks), restrictUsers, excludeUsers, actionList, 0, 2, -1, -1, false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(user, time, radius, location, parseList(restrict), parseList(exclude), 0, 1, -1, -1, false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(time, radius, radiusLocation, parseList(restrictBlocks), parseList(excludeBlocks), restrictUsers, excludeUsers, actionList, 0, 1, limitOffset, limitCount, true);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(user, time, radius, location, parseList(restrict), parseList(exclude), 0, 1, limitOffset, limitCount, true);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(time, radius, radiusLocation, parseList(restrictBlocks), parseList(excludeBlocks), restrictUsers, excludeUsers, actionList, 0, 1, -1, -1, false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        public Material getType() {
            if (parse.length < 13) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
            return processData(user, time, radius, location, parseList(restrict), parseList(exclude), 1, 2, -1, -1, false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

        if (list == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

            if (lookupList == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
        }

        return null;
    }

```

## UnnecessaryLocalVariable
### UnnecessaryLocalVariable
Local variable `xMin` is redundant
in `src/main/java/net/coreprotect/command/WorldEditHandler.java`
#### Snippet
```java
                            max = length;
                        }
                        int xMin = x;
                        int xMax = x + (width - 1);
                        int yMin = y;
```

### UnnecessaryLocalVariable
Local variable `yMin` is redundant
in `src/main/java/net/coreprotect/command/WorldEditHandler.java`
#### Snippet
```java
                        int xMin = x;
                        int xMax = x + (width - 1);
                        int yMin = y;
                        int yMax = y + (height - 1);
                        int zMin = z;
```

### UnnecessaryLocalVariable
Local variable `zMin` is redundant
in `src/main/java/net/coreprotect/command/WorldEditHandler.java`
#### Snippet
```java
                        int yMin = y;
                        int yMax = y + (height - 1);
                        int zMin = z;
                        int zMax = z + (length - 1);
                        result = new Integer[] { max, xMin, xMax, yMin, yMax, zMin, zMax, 1 };
```

### UnnecessaryLocalVariable
Local variable `location` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            int DEFAULT_RADIUS = Config.getGlobal().DEFAULT_RADIUS;
            if ((player instanceof Player || player instanceof BlockCommandSender) && argRadius == null && DEFAULT_RADIUS > 0 && !forceglobal && !argAction.contains(11)) {
                Location location = lo;
                int xmin = location.getBlockX() - DEFAULT_RADIUS;
                int xmax = location.getBlockX() + DEFAULT_RADIUS;
```

### UnnecessaryLocalVariable
Local variable `rollbackusers` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                }

                List<String> rollbackusers = argUsers;
                int c = 0;
                for (String ruser : rollbackusers) {
```

### UnnecessaryLocalVariable
Local variable `action` is redundant
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                try (Connection connection = Database.getConnection(false, 1000)) {
                                    ConfigHandler.lookupThrottle.put(player.getName(), new Object[] { true, System.currentTimeMillis() });
                                    int action = finalAction;
                                    Location location = locationFinal;
                                    if (connection != null) {
```

### UnnecessaryLocalVariable
Local variable `type` is redundant
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            List<Object> details = new ArrayList<>();
            List<Object> info = new ArrayList<>();
            EntityType type = entity_type;

            // Basic LivingEntity attributes
```

### UnnecessaryLocalVariable
Local variable `attributable` is redundant
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

            if (entity instanceof Attributable) {
                Attributable attributable = entity;

                for (Attribute attribute : Attribute.values()) {
```

## BusyWait
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                                    patchNotification = true;
                                }
                                Thread.sleep(1000);
                            }
                        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
            Thread.sleep(1000);
            while (Consumer.isPaused) {
                Thread.sleep(500);
            }
            ConfigHandler.serverRunning = isRunning;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
            while ((ConfigHandler.serverRunning || ConfigHandler.converterRunning) && (Consumer.isPaused || ConfigHandler.pauseConsumer || ConfigHandler.purgeRunning || Consumer.consumer_id.get(process_id)[1] == 1)) {
                pausedSuccess = true;
                Thread.sleep(100);
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
                    currentConsumer = 0;
                }
                Thread.sleep(500);
                pauseConsumer(process_id);
                Process.processConsumer(process_id, lastRun);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    while (ConfigHandler.serverRunning && (time < sleepTime)) {
                        time = System.currentTimeMillis();
                        Thread.sleep(1000);
                    }
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/command/ReloadCommand.java`
#### Snippet
```java
                        }
                        while (Consumer.isPaused) {
                            Thread.sleep(1);
                        }
                        Consumer.isPaused = true;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/thread/CacheHandler.java`
#### Snippet
```java
            try {
                for (int id = 0; id < 7; id++) {
                    Thread.sleep(1000);
                    int scanTime = 30;
                    Map cache = CacheHandler.lookupCache;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
            catch (Exception e) {
                if (e.getMessage().startsWith("[SQLITE_BUSY]") && count < 30) {
                    Thread.sleep(1000);
                    count++;

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                long startTime = System.nanoTime();
                while (Consumer.isPaused && !force && (Consumer.transacting || !onlyCheckTransacting)) {
                    Thread.sleep(1);
                    long pauseTime = (System.nanoTime() - startTime) / 1000000;

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    ConfigHandler.purgeRunning = true;
                    while (!Consumer.pausedSuccess) {
                        Thread.sleep(1);
                    }
                    Consumer.isPaused = true;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                                lockMessage = true;
                            }
                            Thread.sleep(1000);
                        }
                        else {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                }

                Thread.sleep(100);
            }

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        try {
            while (Consumer.isPaused) {
                Thread.sleep(1);
            }
            Consumer.isPaused = true;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        try {
            while (Consumer.isPaused) {
                Thread.sleep(1);
            }

```

## PointlessBooleanExpression
### PointlessBooleanExpression
`enderChest != true` can be simplified to '!enderChest'
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        Bukkit.getServer().getScheduler().runTaskAsynchronously(CoreProtect.getInstance(), () -> {
            try {
                Material containerType = (enderChest != true ? null : Material.ENDER_CHEST);
                InventoryChangeListener.checkTasks(taskStarted);
                onInventoryInteract(player.getName(), inventory, containerState, containerType, inventoryLocation, true);
```

### PointlessBooleanExpression
`glowing == true` can be simplified to 'glowing'
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.SIGN_TEXT, null, color, null, action, offset, null });
        Consumer.consumerSigns.get(currentConsumer).put(consumerId, new Object[] { (glowing == true ? 1 : 0), line1, line2, line3, line4 });
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, location);
    }
```

### PointlessBooleanExpression
`location.getWorld().isChunkLoaded(chunkX, chunkZ) == false` can be simplified to '!location.getWorld().isChunkLoaded(chunkX, chunkZ)'
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        int chunkX = location.getBlockX() >> 4;
        int chunkZ = location.getBlockZ() >> 4;
        if (location.getWorld().isChunkLoaded(chunkX, chunkZ) == false) {
            location.getWorld().getChunkAt(location);
        }
```

## CastCanBeRemovedNarrowingVariableType
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'entity' to 'Player'
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java
        }

        String user = ((Player) entity).getName();
        List<ItemStack> items = event.getDrops();
        if (items == null || items.size() == 0) {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'entity' to 'Hanging'
in `src/main/java/net/coreprotect/listener/entity/HangingBreakListener.java`
#### Snippet
```java

                if (!cause.equals(HangingBreakEvent.RemoveCause.EXPLOSION)) {
                    Hanging hangingEntity = (Hanging) entity;
                    BlockFace attached = hangingEntity.getAttachedFace();
                    attachedBlock = hangingEntity.getLocation().getBlock().getRelative(attached);
```

