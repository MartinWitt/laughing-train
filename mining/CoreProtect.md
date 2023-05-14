# CoreProtect 
 
# Bad smells
I found 1031 bad smells with 115 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 161 | false |
| Deprecation | 132 | false |
| DataFlowIssue | 88 | false |
| DuplicatedCode | 71 | false |
| ConstantValue | 69 | false |
| TrivialStringConcatenation | 66 | false |
| UnusedAssignment | 63 | false |
| ProtectedMemberInFinalClass | 58 | true |
| StringConcatenationInsideStringBufferAppend | 26 | false |
| UnnecessaryModifier | 25 | true |
| NullableProblems | 25 | false |
| ArraysAsListWithZeroOrOneArgument | 25 | false |
| CommentedOutCode | 24 | false |
| TrivialIf | 24 | false |
| DuplicateExpressions | 16 | false |
| StringConcatenationInLoops | 16 | false |
| BusyWait | 16 | false |
| FieldMayBeFinal | 12 | false |
| UnnecessaryToStringCall | 11 | true |
| WrapperTypeMayBePrimitive | 10 | false |
| IgnoreResultOfCall | 9 | false |
| DeprecatedIsStillUsed | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| ConditionCoveredByFurtherCondition | 7 | false |
| UnnecessaryReturn | 6 | true |
| RedundantCast | 6 | false |
| ManualMinMaxCalculation | 5 | false |
| StringBufferReplaceableByString | 4 | false |
| CatchMayIgnoreException | 4 | false |
| EmptyStatementBody | 3 | false |
| SimplifiableConditionalExpression | 3 | false |
| ParameterCanBeLocal | 3 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| PointlessBooleanExpression | 3 | true |
| DuplicateBranchesInSwitch | 2 | false |
| ConditionalExpressionWithIdenticalBranches | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| FieldCanBeLocal | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ListRemoveInLoop | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=WrapperTypeMayBePrimitive]
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
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

    public static long countLookupRows(Statement statement, CommandSender user, List<String> checkUuids, List<String> checkUsers, List<Object> restrictList, Map<Object, Boolean> excludeList, List<String> excludeUserList, List<Integer> actionList, Location location, Integer[] radius, Long[] rowData, long startTime, long endTime, boolean restrictWorld, boolean lookup) {
        Long rows = 0L;

        try {
```

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

## RuleId[id=UnnecessaryModifier]
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
    public void setHoverEvent(Object message, String text);

    public void sendComponent(CommandSender sender, String string, String bypass);

}
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
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public int getLegacyBlockId(Material material);

    public void setGlowing(Sign sign, boolean b);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/bukkit/BukkitInterface.java`
#### Snippet
```java
    public int getMinHeight(World world);

    public int getLegacyBlockId(Material material);

    public void setGlowing(Sign sign, boolean b);
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
    public boolean isWall(BlockData blockData);

    public boolean isItemFrame(Material material);

    public boolean isGlowing(Sign sign);
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
    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map);

    public boolean isAttached(Block block, Block scanBlock, BlockData blockData, int scanMin);

    public boolean isWall(BlockData blockData);
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
    public String parseLegacyName(String name);

    public boolean getEntityMeta(LivingEntity entity, List<Object> info);

    public boolean setEntityMeta(Entity entity, Object value, int count);
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
    public boolean setEntityMeta(Entity entity, Object value, int count);

    public boolean getItemMeta(ItemMeta itemMeta, List<Map<String, Object>> list, List<List<Map<String, Object>>> metadata, int slot);

    public boolean setItemMeta(Material rowType, ItemStack itemstack, List<Map<String, Object>> map);
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
public interface BukkitInterface {

    public ItemStack adjustIngredient(MerchantRecipe recipe, ItemStack itemStack);

    public Material getBucketContents(Material material);
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
    public Material getFrameType(Entity entity);

    public Material getFrameType(EntityType type);

    public Class<?> getFrameClass(Material material);
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

    public String getLine(Sign sign, int line);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/paper/PaperInterface.java`
#### Snippet
```java
    public String getLine(Sign sign, int line);

    public void teleportAsync(Entity entity, Location location);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/net/coreprotect/paper/PaperInterface.java`
#### Snippet
```java
    public boolean isStopping(Server server);

    public String getLine(Sign sign, int line);

    public void teleportAsync(Entity entity, Location location);
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
            }

            if (donationKey != null) {
                // valid donation key, continue initialization
            }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        }
                    }
                    else if ((argument.startsWith("#") && argument.length() > 1) || argument.equals("global") || argument.equals("off") || argument.equals("-1") || argument.equals("none") || argument.equals("false")) {
                        // radius = -2;
                    }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                }
                                            }
                                            else if (rollbackType == 0 && rowAction == 0 && (rowType == Material.AIR)) {
                                                // broke block ID #0
                                            }
```

## RuleId[id=CommentedOutCode]
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
Commented out code (2 lines)
in `src/main/java/net/coreprotect/listener/block/BlockIgniteListener.java`
#### Snippet
```java

            if (event.getPlayer() == null) {
                // IgniteCause cause = event.getCause(); // FLINT_AND_STEEL
                // boolean isDispenser = (event.getIgnitingBlock() != null && event.getIgnitingBlock().getType()==Material.DISPENSER);

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

                    if (modifyList.get(rowWorldId).get(chunkKey) == null) {
                        // Integer[][] chunkSections = new Integer[((worldMax - worldMin) >> 4)][];
                        // adjacentDataList.put(chunkKey, chunkSections);
                        dataList.get(rowWorldId).put(chunkKey, new ArrayList<>());
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

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=DuplicateExpressions]
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
Multiple occurrences of `argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro")`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                    return StringUtil.copyPartialMatches(argument1, completions, new ArrayList<>(completions.size()));
                }
                else if ((sender.hasPermission("coreprotect.lookup") && (argument0.equals("l") || argument0.equals("lookup"))) || (sender.hasPermission("coreprotect.rollback") && (argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro"))) || (sender.hasPermission("coreprotect.restore") && (argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")))) {
                    List<String> completions = new ArrayList<>(filterParams(true, argument0, argument1, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer));
                    completions.addAll(Bukkit.getOnlinePlayers().stream().filter(player -> player.getName().toLowerCase(Locale.ROOT).startsWith(argument1)).map(Player::getName).collect(Collectors.toList()));
```

### DuplicateExpressions
Multiple occurrences of `argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                    return StringUtil.copyPartialMatches(argument1, completions, new ArrayList<>(completions.size()));
                }
                else if ((sender.hasPermission("coreprotect.lookup") && (argument0.equals("l") || argument0.equals("lookup"))) || (sender.hasPermission("coreprotect.rollback") && (argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro"))) || (sender.hasPermission("coreprotect.restore") && (argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")))) {
                    List<String> completions = new ArrayList<>(filterParams(true, argument0, argument1, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer));
                    completions.addAll(Bukkit.getOnlinePlayers().stream().filter(player -> player.getName().toLowerCase(Locale.ROOT).startsWith(argument1)).map(Player::getName).collect(Collectors.toList()));
```

### DuplicateExpressions
Multiple occurrences of `argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro")`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                return Arrays.asList("");
            }
            else if ((sender.hasPermission("coreprotect.lookup") && (argument0.equals("l") || argument0.equals("lookup"))) || (sender.hasPermission("coreprotect.rollback") && (argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro"))) || (sender.hasPermission("coreprotect.restore") && (argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")))) {
                if ((!argument0.equals("l") && !argument0.equals("lookup")) || !hasPage) {
                    ArrayList<String> params = filterParams(false, argument0, currentArg, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer);
```

### DuplicateExpressions
Multiple occurrences of `argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")`
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                return Arrays.asList("");
            }
            else if ((sender.hasPermission("coreprotect.lookup") && (argument0.equals("l") || argument0.equals("lookup"))) || (sender.hasPermission("coreprotect.rollback") && (argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro"))) || (sender.hasPermission("coreprotect.restore") && (argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")))) {
                if ((!argument0.equals("l") && !argument0.equals("lookup")) || !hasPage) {
                    ArrayList<String> params = filterParams(false, argument0, currentArg, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer);
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

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java

                if (!found) {
                    result.add(new StringBuilder(Color.WHITE + "----- " + Color.DARK_AQUA + Phrase.build(Phrase.CONTAINER_HEADER) + Color.WHITE + " ----- " + Util.getCoordinates(command, worldId, x, y, z, false, false)).toString());
                }
                found = true;
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                }

                result.add(new StringBuilder(timeAgo + " " + tag + " " + Phrase.build(Phrase.LOOKUP_CONTAINER, Color.DARK_AQUA + rbFormat + resultUser + Color.WHITE + rbFormat, "x" + resultAmount, Util.createTooltip(Color.DARK_AQUA + rbFormat + target, tooltip) + Color.WHITE, selector)).toString());
                PluginChannelListener.getInstance().sendData(commandSender, resultTime, Phrase.LOOKUP_CONTAINER, selector, resultUser, target, resultAmount, x, y, z, worldId, rbFormat, true, tag.contains("+"));
            }
```

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

### StringBufferReplaceableByString
`StringBuilder message` can be replaced with 'String'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        }

        StringBuilder message = new StringBuilder(Chat.COMPONENT_TAG_OPEN + Chat.COMPONENT_POPUP);

        // tooltip
```

## RuleId[id=Deprecation]
### Deprecation
'consumerObjectArrayList' is deprecated
in `src/main/java/net/coreprotect/consumer/process/RollbackUpdateProcess.java`
#### Snippet
```java

    static void process(Statement statement, int processId, int id, int action, int table) {
        Map<Integer, List<Object[]>> updateLists = Consumer.consumerObjectArrayList.get(processId);
        if (updateLists.get(id) != null) {
            List<Object[]> list = updateLists.get(id);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/paper/PaperAdapter.java`
#### Snippet
```java
    @Override
    public String getLine(Sign sign, int line) {
        return sign.getLine(line);
    }

```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
        try {
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
```

### Deprecation
'TextComponent(net.md_5.bungee.api.chat.BaseComponent...)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
        try {
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
        try {
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
        try {
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
```

### Deprecation
'fromLegacyText(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
        try {
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
```

### Deprecation
'setHoverEvent(net.md_5.bungee.api.chat.HoverEvent)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action, net.md_5.bungee.api.chat.hover.content.Content...)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'net.md_5.bungee.api.chat.HoverEvent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'net.md_5.bungee.api.chat.HoverEvent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'net.md_5.bungee.api.chat.HoverEvent.Action' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'SHOW_TEXT' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'Text(net.md_5.bungee.api.chat.BaseComponent\[\])' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'net.md_5.bungee.api.chat.hover.content.Text' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'fromLegacyText(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
            if (Config.getGlobal().HOVER_EVENTS) {
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
            else {
```

### Deprecation
'addExtra(net.md_5.bungee.api.chat.BaseComponent)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
                TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(data[1]))));
                ((TextComponent) message).addExtra(component);
            }
            else {
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'setHoverEvent(net.md_5.bungee.api.chat.HoverEvent)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action, net.md_5.bungee.api.chat.hover.content.Content...)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'net.md_5.bungee.api.chat.HoverEvent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'net.md_5.bungee.api.chat.HoverEvent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'net.md_5.bungee.api.chat.HoverEvent.Action' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'SHOW_TEXT' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'Text(net.md_5.bungee.api.chat.BaseComponent\[\])' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'net.md_5.bungee.api.chat.hover.content.Text' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'fromLegacyText(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public void setHoverEvent(Object component, String text) {
        if (Config.getGlobal().HOVER_EVENTS) {
            ((TextComponent) component).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(TextComponent.fromLegacyText(text))));
        }
    }
```

### Deprecation
'net.md_5.bungee.api.ChatColor' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java

    public Spigot_v1_16() {
        SpigotHandler.DARK_AQUA = ChatColor.of("#31b0e8");
        Color.DARK_AQUA = SpigotHandler.DARK_AQUA.toString();
    }
```

### Deprecation
'of(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java

    public Spigot_v1_16() {
        SpigotHandler.DARK_AQUA = ChatColor.of("#31b0e8");
        Color.DARK_AQUA = SpigotHandler.DARK_AQUA.toString();
    }
```

### Deprecation
'toString()' is deprecated
in `src/main/java/net/coreprotect/spigot/Spigot_v1_16.java`
#### Snippet
```java
    public Spigot_v1_16() {
        SpigotHandler.DARK_AQUA = ChatColor.of("#31b0e8");
        Color.DARK_AQUA = SpigotHandler.DARK_AQUA.toString();
    }

```

### Deprecation
'consumerInventories' is deprecated
in `src/main/java/net/coreprotect/consumer/process/ContainerTransactionProcess.java`
#### Snippet
```java
        if (object instanceof Location) {
            Location location = (Location) object;
            Map<Integer, Object> inventories = Consumer.consumerInventories.get(processId);
            if (inventories.get(id) != null) {
                Object inventory = inventories.get(id);
```

### Deprecation
'consumerObjectArrayList' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, table, null, 0, null, 0, action, null });
        Consumer.consumerObjectArrayList.get(currentConsumer).put(consumerId, list);
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, location);
    }
```

### Deprecation
'CARPETS' is deprecated
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
        TRACK_TOP.addAll(DOORS);
        TRACK_TOP.addAll(PRESSURE_PLATES);
        TRACK_TOP.addAll(Tag.CARPETS.getValues());
        TRACK_TOP_BOTTOM.addAll(LANTERNS);
        LIGHTABLES.addAll(CANDLES);
```

### Deprecation
'consumerBlockList' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.NATURAL_BLOCK_BREAK, type, data, null, 0, 0, blockData });
        Consumer.consumerBlockList.get(currentConsumer).put(consumerId, blockStates);
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, block);
    }
```

### Deprecation
'consumerContainers' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.CONTAINER_BREAK, type, 0, null, 0, 0, null });
        Consumer.consumerContainers.get(currentConsumer).put(consumerId, oldInventory);
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, location);
    }
```

### Deprecation
'consumerStrings' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        String uuid = player.getUniqueId().toString();
        addConsumer(currentConsumer, new Object[] { consumerId, Process.PLAYER_LOGIN, null, configSessions, null, configUsernames, time, null });
        Consumer.consumerStrings.get(currentConsumer).put(consumerId, uuid);
        queueStandardData(consumerId, currentConsumer, new String[] { player.getName(), uuid }, player.getLocation().clone());
    }
```

### Deprecation
'consumerObjectList' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.ENTITY_KILL, null, 0, null, 0, 0 });
        Consumer.consumerObjectList.get(currentConsumer).put(consumerId, data);
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, new Object[] { location.getBlock().getState(), type, null });
    }
```

### Deprecation
'consumerInventories' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.CONTAINER_TRANSACTION, type, 0, null, 0, chestId, null });
        Consumer.consumerInventories.get(currentConsumer).put(consumerId, inventory);
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, location);
    }
```

### Deprecation
'consumerSigns' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.SIGN_TEXT, null, color, null, action, offset, null });
        Consumer.consumerSigns.get(currentConsumer).put(consumerId, new Object[] { (glowing == true ? 1 : 0), line1, line2, line3, line4 });
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, location);
    }
```

### Deprecation
'consumerStrings' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.PLAYER_COMMAND, null, 0, null, 0, 0, null });
        Consumer.consumerStrings.get(currentConsumer).put(consumerId, message);
        queueStandardData(consumerId, currentConsumer, new String[] { player.getName(), null }, new Object[] { timestamp, player.getLocation().clone() });
    }
```

### Deprecation
'consumerStrings' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.PLAYER_CHAT, null, 0, null, 0, 0, null });
        Consumer.consumerStrings.get(currentConsumer).put(consumerId, message);
        queueStandardData(consumerId, currentConsumer, new String[] { player.getName(), null }, new Object[] { timestamp, player.getLocation().clone() });
    }
```

### Deprecation
'consumerBlockList' is deprecated
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        int consumerId = Consumer.newConsumerId(currentConsumer);
        addConsumer(currentConsumer, new Object[] { consumerId, Process.STRUCTURE_GROWTH, null, 0, null, 0, replacedListSize, null });
        Consumer.consumerBlockList.get(currentConsumer).put(consumerId, blockList);
        queueStandardData(consumerId, currentConsumer, new String[] { user, null }, block);
    }
```

### Deprecation
'consumerContainers' is deprecated
in `src/main/java/net/coreprotect/consumer/process/ContainerBreakProcess.java`
#### Snippet
```java
        if (object instanceof Location) {
            Location location = (Location) object;
            Map<Integer, ItemStack[]> containers = Consumer.consumerContainers.get(processId);
            if (containers.get(id) != null) {
                ItemStack[] container = containers.get(id);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            Location location = blockState.getLocation();
                            Sign sign = (Sign) blockState;
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            Sign sign = (Sign) blockState;
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int color = sign.getColor().getColor().asRGB();
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockPlaceListener.java`
#### Snippet
```java
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int color = sign.getColor().getColor().asRGB();
                            boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
```

### Deprecation
'consumerBlockList' is deprecated
in `src/main/java/net/coreprotect/consumer/process/NaturalBlockBreakProcess.java`
#### Snippet
```java
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            Map<Integer, List<BlockState>> blockLists = Consumer.consumerBlockList.get(processId);
            if (blockLists.get(id) != null) {
                List<BlockState> blockStateList = blockLists.get(id);
```

### Deprecation
'getId()' is deprecated
in `src/main/java/net/coreprotect/patch/script/__2_11_0.java`
#### Snippet
```java

            for (Art artType : Art.values()) {
                Integer type = artType.getId();
                String name = artType.toString().toLowerCase(Locale.ROOT);
                statement.executeUpdate("INSERT INTO " + ConfigHandler.prefix + "art_map (id, art) VALUES ('" + type + "', '" + name + "')");
```

### Deprecation
'getTypeId()' is deprecated
in `src/main/java/net/coreprotect/patch/script/__2_11_0.java`
#### Snippet
```java

            for (EntityType entityType : EntityType.values()) {
                Integer type = (int) entityType.getTypeId();
                String name = entityType.toString().toLowerCase(Locale.ROOT);
                statement.executeUpdate("INSERT INTO " + ConfigHandler.prefix + "entity_map (id, entity) VALUES ('" + type + "', '" + name + "')");
```

### Deprecation
'getId()' is deprecated
in `src/main/java/net/coreprotect/patch/script/__2_11_0.java`
#### Snippet
```java

            for (Material material : Material.values()) {
                Integer type = material.getId();
                String name = material.toString().toLowerCase(Locale.ROOT);
                statement.executeUpdate("INSERT INTO " + ConfigHandler.prefix + "material_map (id, material) VALUES ('" + type + "', '" + name + "')");
```

### Deprecation
'sendSignChange(org.bukkit.@org.jetbrains.annotations.NotNull Location, java.lang.@org.jetbrains.annotations.Nullable String\[\], org.bukkit.@org.jetbrains.annotations.NotNull DyeColor)' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                Thread.sleep(1500);
                                Sign sign = (Sign) blockFinal;
                                player.sendSignChange(sign.getLocation(), sign.getLines(), sign.getColor());
                            }
                        }
```

### Deprecation
'getLines()' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                Thread.sleep(1500);
                                Sign sign = (Sign) blockFinal;
                                player.sendSignChange(sign.getLocation(), sign.getLines(), sign.getColor());
                            }
                        }
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            BlockState blockState = block.getState();
                            Sign sign = (Sign) blockState;
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Sign sign = (Sign) blockState;
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int oldColor = sign.getColor().getColor().asRGB();
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int oldColor = sign.getColor().getColor().asRGB();
                            int newColor = oldColor;
```

### Deprecation
'setCustomName(java.lang.@org.jetbrains.annotations.Nullable String)' is deprecated
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                if (list.size() >= 5) {
                    entity.setCustomNameVisible((Boolean) list.get(3));
                    entity.setCustomName((String) list.get(4));
                }

```

### Deprecation
'setAgeLock(boolean)' is deprecated
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        else if (count == 1) {
                            boolean set = (Boolean) value;
                            ageable.setAgeLock(set);
                        }
                        else if (count == 2) {
```

### Deprecation
'setBreed(boolean)' is deprecated
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        else if (count == 3) {
                            boolean set = (Boolean) value;
                            ageable.setBreed(set);
                        }
                        else if (count == 4 && value != null) {
```

### Deprecation
'setMaxHealth(double)' is deprecated
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                            // deprecated
                            double set = (Double) value;
                            ageable.setMaxHealth(set);
                        }
                        count++;
```

### Deprecation
'setBaby(boolean)' is deprecated
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        if (count == 0) {
                            boolean set = (Boolean) value;
                            zombieVillager.setBaby(set);
                        }
                        else if (count == 1) {
```

### Deprecation
'setBaby(boolean)' is deprecated
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                        if (count == 0) {
                            boolean set = (Boolean) value;
                            zombie.setBaby(set);
                        }
                    }
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                    Location location = blockState.getLocation();
                    Sign sign = (Sign) blockState;
                    String line1 = sign.getLine(0);
                    String line2 = sign.getLine(1);
                    String line3 = sign.getLine(2);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                    Sign sign = (Sign) blockState;
                    String line1 = sign.getLine(0);
                    String line2 = sign.getLine(1);
                    String line3 = sign.getLine(2);
                    String line4 = sign.getLine(3);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                    String line1 = sign.getLine(0);
                    String line2 = sign.getLine(1);
                    String line3 = sign.getLine(2);
                    String line4 = sign.getLine(3);
                    int color = sign.getColor().getColor().asRGB();
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                    String line2 = sign.getLine(1);
                    String line3 = sign.getLine(2);
                    String line4 = sign.getLine(3);
                    int color = sign.getColor().getColor().asRGB();
                    boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
```

### Deprecation
'consumerStrings' is deprecated
in `src/main/java/net/coreprotect/consumer/process/PlayerLoginProcess.java`
#### Snippet
```java
    static void process(Connection connection, PreparedStatement preparedStmt, int batchCount, int processId, int id, Object object, int configSessions, int configUsernames, int time, String user) {
        if (object instanceof Location) {
            Map<Integer, String> strings = Consumer.consumerStrings.get(processId);
            if (strings.get(id) != null) {
                String uuid = strings.get(id);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        Location location = block.getLocation();
        BlockState blockState = block.getState();
        String line1 = event.getLine(0);
        String line2 = event.getLine(1);
        String line3 = event.getLine(2);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        BlockState blockState = block.getState();
        String line1 = event.getLine(0);
        String line2 = event.getLine(1);
        String line3 = event.getLine(2);
        String line4 = event.getLine(3);
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        String line1 = event.getLine(0);
        String line2 = event.getLine(1);
        String line3 = event.getLine(2);
        String line4 = event.getLine(3);
        int color = (blockState instanceof Sign) ? ((Sign) blockState).getColor().getColor().asRGB() : 0;
```

### Deprecation
'getLine(int)' is deprecated
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        String line2 = event.getLine(1);
        String line3 = event.getLine(2);
        String line4 = event.getLine(3);
        int color = (blockState instanceof Sign) ? ((Sign) blockState).getColor().getColor().asRGB() : 0;
        boolean isGlowing = (blockState instanceof Sign) ? BukkitAdapter.ADAPTER.isGlowing((Sign) blockState) : false;
```

### Deprecation
'consumerBlockList' is deprecated
in `src/main/java/net/coreprotect/consumer/process/StructureGrowthProcess.java`
#### Snippet
```java
        if (object instanceof BlockState) {
            BlockState block = (BlockState) object;
            Map<Integer, List<BlockState>> blockLists = Consumer.consumerBlockList.get(processId);
            if (blockLists.get(id) != null) {
                List<BlockState> blockStates = blockLists.get(id);
```

### Deprecation
'consumerSigns' is deprecated
in `src/main/java/net/coreprotect/consumer/process/SignTextProcess.java`
#### Snippet
```java
        if (object instanceof Location) {
            Location location = (Location) object;
            Map<Integer, Object[]> signs = Consumer.consumerSigns.get(processId);
            if (signs.get(id) != null) {
                Object[] SIGN_DATA = signs.get(id);
```

### Deprecation
'org.bukkit.event.player.AsyncPlayerChatEvent' is deprecated
in `src/main/java/net/coreprotect/listener/player/PlayerChatListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        if (message == null) {
```

### Deprecation
'consumerStrings' is deprecated
in `src/main/java/net/coreprotect/consumer/process/PlayerCommandProcess.java`
#### Snippet
```java
        Object[] data = (Object[]) object;
        if (data[1] instanceof Location) {
            Map<Integer, String> strings = Consumer.consumerStrings.get(processId);
            if (strings.get(id) != null) {
                String message = strings.get(id);
```

### Deprecation
'getAgeLock()' is deprecated
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                Ageable ageable = (Ageable) entity;
                age.add(ageable.getAge());
                age.add(ageable.getAgeLock());
                age.add(ageable.isAdult());
                age.add(ageable.canBreed());
```

### Deprecation
'canBreed()' is deprecated
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                age.add(ageable.getAgeLock());
                age.add(ageable.isAdult());
                age.add(ageable.canBreed());
                age.add(null);
            }
```

### Deprecation
'isBaby()' is deprecated
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            else if (entity instanceof ZombieVillager) {
                ZombieVillager zombieVillager = (ZombieVillager) entity;
                info.add(zombieVillager.isBaby());
                info.add(zombieVillager.getVillagerProfession());
            }
```

### Deprecation
'isBaby()' is deprecated
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            else if (entity instanceof Zombie) {
                Zombie zombie = (Zombie) entity;
                info.add(zombie.isBaby());
                info.add(null);
                info.add(null);
```

### Deprecation
'getCustomName()' is deprecated
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            data.add(info);
            data.add(entity.isCustomNameVisible());
            data.add(entity.getCustomName());
            data.add(attributes);
            data.add(details);
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
    @Override
    public void sendComponent(CommandSender sender, String string, String bypass) {
        TextComponent message = new TextComponent();
        StringBuilder builder = new StringBuilder();

```

### Deprecation
'TextComponent()' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
    @Override
    public void sendComponent(CommandSender sender, String string, String bypass) {
        TextComponent message = new TextComponent();
        StringBuilder builder = new StringBuilder();

```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
    @Override
    public void sendComponent(CommandSender sender, String string, String bypass) {
        TextComponent message = new TextComponent();
        StringBuilder builder = new StringBuilder();

```

### Deprecation
'toString()' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

        if (sender instanceof ConsoleCommandSender) {
            string = string.replace(SpigotHandler.DARK_AQUA.toString(), ChatColor.DARK_AQUA.toString());
        }

```

### Deprecation
'net.md_5.bungee.api.ChatColor' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

        if (sender instanceof ConsoleCommandSender) {
            string = string.replace(SpigotHandler.DARK_AQUA.toString(), ChatColor.DARK_AQUA.toString());
        }

```

### Deprecation
'DARK_AQUA' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

        if (sender instanceof ConsoleCommandSender) {
            string = string.replace(SpigotHandler.DARK_AQUA.toString(), ChatColor.DARK_AQUA.toString());
        }

```

### Deprecation
'toString()' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

        if (sender instanceof ConsoleCommandSender) {
            string = string.replace(SpigotHandler.DARK_AQUA.toString(), ChatColor.DARK_AQUA.toString());
        }

```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                String[] data = value.split("\\|", 3);
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
```

### Deprecation
'TextComponent(net.md_5.bungee.api.chat.BaseComponent...)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                String[] data = value.split("\\|", 3);
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                String[] data = value.split("\\|", 3);
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                String[] data = value.split("\\|", 3);
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
```

### Deprecation
'fromLegacyText(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                String[] data = value.split("\\|", 3);
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
```

### Deprecation
'setClickEvent(net.md_5.bungee.api.chat.ClickEvent)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
```

### Deprecation
'ClickEvent(net.md_5.bungee.api.chat.ClickEvent.Action, java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
```

### Deprecation
'net.md_5.bungee.api.chat.ClickEvent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
```

### Deprecation
'net.md_5.bungee.api.chat.ClickEvent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
```

### Deprecation
'net.md_5.bungee.api.chat.ClickEvent.Action' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
```

### Deprecation
'RUN_COMMAND' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                if (data[0].equals(Chat.COMPONENT_COMMAND)) {
                    TextComponent component = new TextComponent(TextComponent.fromLegacyText(data[2]));
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
```

### Deprecation
'addExtra(net.md_5.bungee.api.chat.BaseComponent)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, data[1]));
                    SpigotAdapter.ADAPTER.setHoverEvent(component, Util.hoverCommandFilter(data[1]));
                    message.addExtra(component);
                }
                else if (data[0].equals(Chat.COMPONENT_POPUP)) {
```

### Deprecation
'addExtra(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

        if (bypass != null) {
            message.addExtra(bypass);
        }

```

### Deprecation
'sendMessage(net.md_5.bungee.api.chat.@org.jetbrains.annotations.NotNull BaseComponent)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
        }

        sender.spigot().sendMessage(message);
    }

```

### Deprecation
'net.md_5.bungee.api.ChatColor' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
public class SpigotHandler extends SpigotAdapter implements SpigotInterface {

    public static ChatColor DARK_AQUA = ChatColor.DARK_AQUA;

    @Override
```

### Deprecation
'net.md_5.bungee.api.ChatColor' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
public class SpigotHandler extends SpigotAdapter implements SpigotInterface {

    public static ChatColor DARK_AQUA = ChatColor.DARK_AQUA;

    @Override
```

### Deprecation
'DARK_AQUA' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
public class SpigotHandler extends SpigotAdapter implements SpigotInterface {

    public static ChatColor DARK_AQUA = ChatColor.DARK_AQUA;

    @Override
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
    }

    private static void addBuilder(TextComponent message, StringBuilder builder) {
        String[] splitBuilder = builder.toString().split(SpigotHandler.DARK_AQUA.toString());
        for (int i = 0; i < splitBuilder.length; i++) {
```

### Deprecation
'toString()' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java

    private static void addBuilder(TextComponent message, StringBuilder builder) {
        String[] splitBuilder = builder.toString().split(SpigotHandler.DARK_AQUA.toString());
        for (int i = 0; i < splitBuilder.length; i++) {
            if (i > 0) {
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
        for (int i = 0; i < splitBuilder.length; i++) {
            if (i > 0) {
                TextComponent textComponent = new TextComponent(splitBuilder[i]);
                textComponent.setColor(SpigotHandler.DARK_AQUA);
                message.addExtra(textComponent);
```

### Deprecation
'TextComponent(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
        for (int i = 0; i < splitBuilder.length; i++) {
            if (i > 0) {
                TextComponent textComponent = new TextComponent(splitBuilder[i]);
                textComponent.setColor(SpigotHandler.DARK_AQUA);
                message.addExtra(textComponent);
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
        for (int i = 0; i < splitBuilder.length; i++) {
            if (i > 0) {
                TextComponent textComponent = new TextComponent(splitBuilder[i]);
                textComponent.setColor(SpigotHandler.DARK_AQUA);
                message.addExtra(textComponent);
```

### Deprecation
'setColor(net.md_5.bungee.api.ChatColor)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
            if (i > 0) {
                TextComponent textComponent = new TextComponent(splitBuilder[i]);
                textComponent.setColor(SpigotHandler.DARK_AQUA);
                message.addExtra(textComponent);
            }
```

### Deprecation
'addExtra(net.md_5.bungee.api.chat.BaseComponent)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
                TextComponent textComponent = new TextComponent(splitBuilder[i]);
                textComponent.setColor(SpigotHandler.DARK_AQUA);
                message.addExtra(textComponent);
            }
            else {
```

### Deprecation
'addExtra(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
            }
            else {
                message.addExtra(splitBuilder[i]);
            }
        }
```

### Deprecation
'net.md_5.bungee.api.chat.TextComponent' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
    @Override
    public void addHoverComponent(Object message, String[] data) {
        ((TextComponent) message).addExtra(data[2]);
    }

```

### Deprecation
'addExtra(java.lang.String)' is deprecated
in `src/main/java/net/coreprotect/spigot/SpigotHandler.java`
#### Snippet
```java
    @Override
    public void addHoverComponent(Object message, String[] data) {
        ((TextComponent) message).addExtra(data[2]);
    }

```

### Deprecation
'setLine(int, java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java
                }

                sign.setLine(0, line1);
                sign.setLine(1, line2);
                sign.setLine(2, line3);
```

### Deprecation
'setLine(int, java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java

                sign.setLine(0, line1);
                sign.setLine(1, line2);
                sign.setLine(2, line3);
                sign.setLine(3, line4);
```

### Deprecation
'setLine(int, java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java
                sign.setLine(0, line1);
                sign.setLine(1, line2);
                sign.setLine(2, line3);
                sign.setLine(3, line4);
            }
```

### Deprecation
'setLine(int, java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java
                sign.setLine(1, line2);
                sign.setLine(2, line3);
                sign.setLine(3, line4);
            }

```

### Deprecation
'org.bukkit.material.MaterialData' is deprecated
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void setData(MaterialData data) {
        // TODO Auto-generated method stub

```

### Deprecation
'org.bukkit.material.MaterialData' is deprecated
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public MaterialData getData() {
        // TODO Auto-generated method stub
        return null;
```

### Deprecation
'setBaby(boolean)' is deprecated
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
            if (count == 0) {
                boolean set = (Boolean) value;
                piglin.setBaby(set);
            }
        }
```

### Deprecation
'setBaby(boolean)' is deprecated
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
            if (count == 0) {
                boolean set = (Boolean) value;
                zoglin.setBaby(set);
            }
        }
```

### Deprecation
'isBaby()' is deprecated
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        if (entity instanceof Piglin) {
            Piglin piglin = (Piglin) entity;
            info.add(piglin.isBaby());
        }
        else if (entity instanceof Zoglin) {
```

### Deprecation
'isBaby()' is deprecated
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
        else if (entity instanceof Zoglin) {
            Zoglin zoglin = (Zoglin) entity;
            info.add(zoglin.isBaby());
        }
        else if (super.getEntityMeta(entity, info)) {
```

### Deprecation
'consumerStrings' is deprecated
in `src/main/java/net/coreprotect/consumer/process/PlayerChatProcess.java`
#### Snippet
```java
        Object[] data = (Object[]) object;
        if (data[1] instanceof Location) {
            Map<Integer, String> strings = Consumer.consumerStrings.get(processId);
            if (strings.get(id) != null) {
                String message = strings.get(id);
```

### Deprecation
'consumerObjectList' is deprecated
in `src/main/java/net/coreprotect/consumer/process/EntityKillProcess.java`
#### Snippet
```java
            BlockState block = (BlockState) ((Object[]) object)[0];
            EntityType type = (EntityType) ((Object[]) object)[1];
            Map<Integer, List<Object>> objectLists = Consumer.consumerObjectList.get(processId);
            if (objectLists.get(id) != null) {
                List<Object> objectList = objectLists.get(id);
```

### Deprecation
'getUnsafe()' is deprecated
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                                BlockData newBlockData = null;
                                try {
                                    newBlockData = Bukkit.getUnsafe().fromLegacy(validatedMaterial, (byte) blockData);
                                }
                                catch (Exception e) {
```

### Deprecation
'getDisplayName()' is deprecated
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        ItemStack item = new ItemStack(Util.getType(type), amount);
        item = (ItemStack) Rollback.populateItemStack(item, metadata)[2];
        String displayName = item.hasItemMeta() && item.getItemMeta().hasDisplayName() ? item.getItemMeta().getDisplayName() : "";
        StringBuilder message = new StringBuilder(Color.ITALIC + displayName + Color.GREY);

```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java

        if (item.getType() == playerItem.getType()) {
            return;
        }
        else if (item.getType() != Material.AIR && playerItem.getType() == Material.AIR) {
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

## RuleId[id=ManualMinMaxCalculation]
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(blockState instanceof Sign) ? BukkitAdapter.ADAPTER.isGlowing((Sign) blockState) : false` can be simplified to 'blockState instanceof Sign \&\& BukkitAdapter.ADAPTER.isGlowing((Sign) blockState)'
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        String line4 = event.getLine(3);
        int color = (blockState instanceof Sign) ? ((Sign) blockState).getColor().getColor().asRGB() : 0;
        boolean isGlowing = (blockState instanceof Sign) ? BukkitAdapter.ADAPTER.isGlowing((Sign) blockState) : false;

        if (!event.isCancelled() && Config.getConfig(block.getWorld()).SIGN_TEXT) {
```

### SimplifiableConditionalExpression
`compoundTag.getInt("GlowingText") == 1 ? true : false` can be simplified to 'compoundTag.getInt("GlowingText") == 1'
in `src/main/java/net/coreprotect/worldedit/WorldEditLogger.java`
#### Snippet
```java
                        String line4 = getSignText(compoundTag.getString("Text4"));
                        int color = DyeColor.valueOf(baseBlock.getNbtData().getString("Color").toUpperCase()).getColor().asRGB();
                        boolean isGlowing = (compoundTag.getInt("GlowingText") == 1 ? true : false);

                        Queue.queueSignText(actor.getName(), location, 0, color, isGlowing, line1, line2, line3, line4, 5);
```

### SimplifiableConditionalExpression
`data == 1 ? true : false` can be simplified to 'data == 1'
in `src/main/java/net/coreprotect/database/statement/SignStatement.java`
#### Snippet
```java

                if (data > 0) {
                    BukkitAdapter.ADAPTER.setGlowing(sign, (data == 1 ? true : false));
                }

```

## RuleId[id=TrivialStringConcatenation]
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
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                }

                String database = "jdbc:sqlite:" + ConfigHandler.path + ConfigHandler.sqlite + "";
                connection = DriverManager.getConnection(database);

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
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
            int totalPages = (int) Math.ceil(count / (limit + 0.0));

            query = "SELECT time,user,action,type,data,amount,metadata,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + x + "' OR x = '" + x2 + "') AND (z = '" + z + "' OR z = '" + z2 + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            if (exact) {
                query = "SELECT time,user,action,type,data,amount,metadata,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + l.getBlockX() + "') AND (z = '" + l.getBlockZ() + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
            query = "SELECT time,user,action,type,data,amount,metadata,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + x + "' OR x = '" + x2 + "') AND (z = '" + z + "' OR z = '" + z2 + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
            if (exact) {
                query = "SELECT time,user,action,type,data,amount,metadata,rolled_back FROM " + ConfigHandler.prefix + "container " + Util.getWidIndex("container") + "WHERE wid = '" + worldId + "' AND (x = '" + l.getBlockX() + "') AND (z = '" + l.getBlockZ() + "') AND y = '" + y + "' ORDER BY rowid DESC LIMIT " + pageStart + ", " + limit + "";
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/net/coreprotect/event/CoreProtectPreLogEvent.java`
#### Snippet
```java

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player) || args.length == 0) {
            return null;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player) || args.length == 0) {
            return null;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player) || args.length == 0) {
            return null;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

    @Override
    public void onPluginMessageReceived(String s, Player player, byte[] bytes) {
        handleHandshake(s, player, bytes);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

    @Override
    public void onPluginMessageReceived(String s, Player player, byte[] bytes) {
        handleHandshake(s, player, bytes);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public World getWorld() {
        return location.getWorld();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void setType(Material type) {
        material = type;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        // TODO Auto-generated method stub

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        // TODO Auto-generated method stub

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        // TODO Auto-generated method stub

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        // TODO Auto-generated method stub

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
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public boolean hasMetadata(String metadataKey) {
        // TODO Auto-generated method stub
        return false;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public BlockData getBlockData() {
        return blockData;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public Material getType() {
        return material;
    }
```

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
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        // TODO Auto-generated method stub
        return null;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public Location getLocation() {
        return location;
    }
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

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void setData(MaterialData data) {
        // TODO Auto-generated method stub

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/worldedit/WorldEditBlockState.java`
#### Snippet
```java

    @Override
    public void setBlockData(BlockData data) {
        blockData = data;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java

    @Override
    public boolean onCommand(CommandSender user, Command command, String commandLabel, String[] argumentArray) {
        String commandName = command.getName().toLowerCase(Locale.ROOT);

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java

    @Override
    public boolean onCommand(CommandSender user, Command command, String commandLabel, String[] argumentArray) {
        String commandName = command.getName().toLowerCase(Locale.ROOT);

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

    public static final String pluginChannel = "coreprotect:handshake";
    private final int networkingProtocolVersion = 1;
    private final Set<UUID> pluginChannelPlayers;
    private static PluginChannelHandshakeListener instance;
```

## RuleId[id=IfStatementMissingBreakInLoop]
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

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/CacheHandler.java`
#### Snippet
```java
            try {
                for (int id = 0; id < 7; id++) {
                    Thread.sleep(1000);
                    int scanTime = 30;
                    Map cache = CacheHandler.lookupCache;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java

                        if (instance.getServer().getPluginManager().getPlugin("CoreEdit") == null) {
                            Thread.sleep(500);
                            /*
                            Functions.sendMessage(player, Color.WHITE + "----- " + Color.DARK_AQUA + "Recommended Plugin " + Color.WHITE + "-----");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                if (keyConfig.length() > 0) {
                    URL url = new URL("http://coreprotect.net/license/" + keyConfig);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Accept-Charset", "UTF-8");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    URL url = new URL("http://coreprotect.net/license/" + keyConfig);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Accept-Charset", "UTF-8");
                    connection.setRequestProperty("User-Agent", "CoreProtect");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    connection.setInstanceFollowRedirects(true);
                    connection.setConnectTimeout(5000);
                    connection.connect();
                    int status = connection.getResponseCode();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    connection.setConnectTimeout(5000);
                    connection.connect();
                    int status = connection.getResponseCode();

                    if (status == 200) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                    if (status == 200) {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String response = reader.readLine();
                        if (response != null && response.length() > 0) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    if (status == 200) {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String response = reader.readLine();
                        if (response != null && response.length() > 0) {
                            String[] remoteKey = response.replaceAll("[^a-zA-Z0-9;]", "").split(";");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            }
                        }
                        reader.close();
                    }
                    else {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            Chat.console(Phrase.build(Phrase.INVALID_DONATION_KEY) + " " + Phrase.build(Phrase.CHECK_CONFIG) + ".");
                        }
                        Files.write(licensePath, "".getBytes());
                    }
                    else if (keyValidated) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    }
                    else if (keyValidated) {
                        Files.write(licensePath, donationKey.getBytes());
                    }
                    else if (Files.isReadable(licensePath)) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    }
                    else if (Files.isReadable(licensePath)) {
                        List<String> licenseFile = Files.readAllLines(licensePath);
                        if (licenseFile.size() == 1) {
                            donationKey = licenseFile.get(0);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        // validate that a valid cache file exists
                        if (Files.isReadable(languagePath) && Files.isReadable(languageCachePath)) {
                            try (Stream<String> stream = Files.lines(languageCachePath)) {
                                Optional<String> languageHeader = stream.findFirst();
                                if (languageHeader.isPresent()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                                ConfigFile.resetCache(ConfigFile.LANGUAGE_CACHE, ConfigFile.LANGUAGE);
                                            }
                                            if (validCache && Files.getLastModifiedTime(languagePath).toMillis() >= Files.getLastModifiedTime(languageCachePath).toMillis()) {
                                                validCache = false;
                                            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                                ConfigFile.resetCache(ConfigFile.LANGUAGE_CACHE, ConfigFile.LANGUAGE);
                                            }
                                            if (validCache && Files.getLastModifiedTime(languagePath).toMillis() >= Files.getLastModifiedTime(languageCachePath).toMillis()) {
                                                validCache = false;
                                            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                            try {
                                URL url = new URL("http://coreprotect.net/translate/");
                                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                                connection.setRequestMethod("POST");
                                connection.setRequestProperty("Accept-Charset", "UTF-8");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                URL url = new URL("http://coreprotect.net/translate/");
                                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                                connection.setRequestMethod("POST");
                                connection.setRequestProperty("Accept-Charset", "UTF-8");
                                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                connection.setConnectTimeout(5000);

                                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
                                outputStream.write(postData);
                                outputStream.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
                                outputStream.write(postData);
                                outputStream.close();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
                                outputStream.write(postData);
                                outputStream.close();

                                int status = connection.getResponseCode();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                outputStream.close();

                                int status = connection.getResponseCode();
                                if (status == 200) {
                                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                int status = connection.getResponseCode();
                                if (status == 200) {
                                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                                    StringBuilder responseBuilder = new StringBuilder();
                                    String responseLine = null;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                    StringBuilder responseBuilder = new StringBuilder();
                                    String responseLine = null;
                                    while ((responseLine = reader.readLine()) != null) {
                                        responseBuilder.append(responseLine.trim());
                                    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                        responseBuilder.append(responseLine.trim());
                                    }
                                    reader.close();

                                    String response = responseBuilder.toString();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                        try (final FileOutputStream fout = new FileOutputStream(file, false)) {
                                            OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(fout), StandardCharsets.UTF_8);
                                            out.append("# CoreProtect v" + pluginVersion + " Language Cache (" + languageCode + ")");
                                            out.append(Config.LINE_SEPARATOR);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                            OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(fout), StandardCharsets.UTF_8);
                                            out.append("# CoreProtect v" + pluginVersion + " Language Cache (" + languageCode + ")");
                                            out.append(Config.LINE_SEPARATOR);

                                            for (final Entry<Phrase, String> entry : translatedPhrases.entrySet()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                                String value = entry.getValue().replaceAll("\"", "\\\\\"");

                                                out.append(Config.LINE_SEPARATOR);
                                                out.append(key);
                                                out.append(": ");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

                                                out.append(Config.LINE_SEPARATOR);
                                                out.append(key);
                                                out.append(": ");
                                                out.append("\"" + value + "\"");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                                out.append(Config.LINE_SEPARATOR);
                                                out.append(key);
                                                out.append(": ");
                                                out.append("\"" + value + "\"");
                                            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                                out.append(key);
                                                out.append(": ");
                                                out.append("\"" + value + "\"");
                                            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                                            }

                                            out.close();
                                        }
                                    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java

            if (startup) {
                Thread.sleep(1000);
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                try {
                    URL url = new URL("http://update.coreprotect.net/version/");
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Accept-Charset", "UTF-8");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    URL url = new URL("http://update.coreprotect.net/version/");
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Accept-Charset", "UTF-8");
                    connection.setRequestProperty("User-Agent", "CoreProtect/v" + version + " (by Intelli)");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    connection.setInstanceFollowRedirects(true);
                    connection.setConnectTimeout(5000);
                    connection.connect();
                    status = connection.getResponseCode();
                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    connection.setConnectTimeout(5000);
                    connection.connect();
                    status = connection.getResponseCode();
                }
                catch (Exception e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                if (status == 200) {
                    try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String response = reader.readLine();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String response = reader.readLine();

                        if (response.length() > 0 && response.length() < 10) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                        }

                        reader.close();
                    }
                    catch (Exception e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    String stats = port + ":" + (donationKey != null ? donationKey : "") + ":" + version + ConfigHandler.EDITION_BRANCH;
                    URL url = new URL("http://stats.coreprotect.net/u/?data=" + stats);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Accept-Charset", "UTF-8");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    URL url = new URL("http://stats.coreprotect.net/u/?data=" + stats);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Accept-Charset", "UTF-8");
                    connection.setRequestProperty("User-Agent", "CoreProtect");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    connection.setRequestProperty("User-Agent", "CoreProtect");
                    connection.setConnectTimeout(5000);
                    connection.connect();
                    connection.getResponseCode();
                    connection.disconnect();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    connection.setConnectTimeout(5000);
                    connection.connect();
                    connection.getResponseCode();
                    connection.disconnect();
                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/thread/NetworkHandler.java`
#### Snippet
```java
                    while (ConfigHandler.serverRunning && (time < sleepTime)) {
                        time = System.currentTimeMillis();
                        Thread.sleep(1000);
                    }
                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
                            if (Consumer.interrupt) {
                                commit(statement, preparedStmtSigns, preparedStmtBlocks, preparedStmtSkulls, preparedStmtContainers, preparedStmtItems, preparedStmtWorlds, preparedStmtChat, preparedStmtCommand, preparedStmtSession, preparedStmtEntities, preparedStmtMaterials, preparedStmtArt, preparedStmtEntity, preparedStmtBlockdata);
                                Thread.sleep(500);
                                Database.beginTransaction(statement);
                            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        DataOutputStream msgOut = new DataOutputStream(msgBytes);

        msgOut.writeInt(3);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        msgOut.writeInt(3);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(message);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(3);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(message);
        msgOut.writeBoolean(sign);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(message);
        msgOut.writeBoolean(sign);
        msgOut.writeInt(x);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(message);
        msgOut.writeBoolean(sign);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(message);
        msgOut.writeBoolean(sign);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeBoolean(sign);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        if (Config.getGlobal().NETWORK_DEBUG) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        if (Config.getGlobal().NETWORK_DEBUG) {
            Chat.console(String.valueOf(timeAgo * 1000));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        DataOutputStream msgOut = new DataOutputStream(msgBytes);

        msgOut.writeInt(4);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        msgOut.writeInt(4);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(4);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);

        if (Config.getGlobal().NETWORK_DEBUG) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);
        msgOut.writeInt(1);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        DataOutputStream msgOut = new DataOutputStream(msgBytes);
        msgOut.writeInt(1);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(1);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);
        msgOut.writeInt(amount);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(resultUser);
        msgOut.writeUTF(target);
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(target);
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        msgOut.writeBoolean(!rbFormat.isEmpty());
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        msgOut.writeBoolean(!rbFormat.isEmpty());
        msgOut.writeBoolean(isContainer);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        msgOut.writeBoolean(!rbFormat.isEmpty());
        msgOut.writeBoolean(isContainer);
        msgOut.writeBoolean(added);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(worldName);
        msgOut.writeBoolean(!rbFormat.isEmpty());
        msgOut.writeBoolean(isContainer);
        msgOut.writeBoolean(added);
        if (Config.getGlobal().NETWORK_DEBUG) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeBoolean(!rbFormat.isEmpty());
        msgOut.writeBoolean(isContainer);
        msgOut.writeBoolean(added);
        if (Config.getGlobal().NETWORK_DEBUG) {
            Chat.console(String.valueOf(timeAgo * 1000));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        DataOutputStream msgOut = new DataOutputStream(msgBytes);

        msgOut.writeInt(2);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java

        msgOut.writeInt(2);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(2);
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
        msgOut.writeInt(amount);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeLong(timeAgo * 1000);
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(phraseSelector);
        msgOut.writeUTF(resultUser);
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeUTF(resultUser);
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(amount);
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        if (Config.getGlobal().NETWORK_DEBUG) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        if (Config.getGlobal().NETWORK_DEBUG) {
            Chat.console(String.valueOf(timeAgo * 1000));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/ContainerRollback.java`
#### Snippet
```java
            while (next == 0) {
                sleepTime = sleepTime + 5;
                Thread.sleep(5);
                rollbackHashData = ConfigHandler.rollbackHash.get(finalUserString);
                next = rollbackHashData[3];
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                            break;
                        }
                        Thread.sleep(1000);
                    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    ConfigHandler.purgeRunning = true;
                    while (!Consumer.pausedSuccess) {
                        Thread.sleep(1);
                    }
                    Consumer.isPaused = true;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        try {
            Path path = Paths.get(ConfigHandler.path + fileName);
            List<String> lines = Files.readAllLines(path);

            for (int i = 0; i < lines.size(); i++) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        File file = new File(CoreProtect.getInstance().getDataFolder(), cacheName);
        if (file.length() > 0) {
            new FileOutputStream(file).close();
            init(fileName);
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(fout), StandardCharsets.UTF_8);
            if (writeHeader) {
                out.append(DEFAULT_FILE_HEADER);
                out.append(Config.LINE_SEPARATOR);
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            if (writeHeader) {
                out.append(DEFAULT_FILE_HEADER);
                out.append(Config.LINE_SEPARATOR);
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                }

                out.append(Config.LINE_SEPARATOR);
                out.append(key);
                out.append(": ");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java

                out.append(Config.LINE_SEPARATOR);
                out.append(key);
                out.append(": ");
                out.append("\"" + defaultValue + "\"");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                out.append(Config.LINE_SEPARATOR);
                out.append(key);
                out.append(": ");
                out.append("\"" + defaultValue + "\"");
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                out.append(key);
                out.append(": ");
                out.append("\"" + defaultValue + "\"");
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            }

            out.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        try {
            Path path = Paths.get(ConfigHandler.path + fileName);
            List<String> lines = Files.readAllLines(path);
            List<String> sort = lines.subList(2, lines.size());
            Collections.sort(sort);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        if (globalFile.exists()) {
            // we always add options to the global config
            final byte[] data = Files.readAllBytes(globalFile.toPath());
            map.put("config", data);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        try (final InputStream in0 = in) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                if (line.startsWith("#")) {
                    continue;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
        try (final InputStream in0 = in) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                if (line.startsWith("#")) {
                    continue;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            }

            reader.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                }

                Thread.sleep(100);
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
                long startTime = System.nanoTime();
                while (Consumer.isPaused && !force && (Consumer.transacting || !onlyCheckTransacting)) {
                    Thread.sleep(1);
                    long pauseTime = (System.nanoTime() - startTime) / 1000000;

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java
            catch (Exception e) {
                if (e.getMessage().startsWith("[SQLITE_BUSY]") && count < 30) {
                    Thread.sleep(1000);
                    count++;

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
                    currentConsumer = 0;
                }
                Thread.sleep(500);
                pauseConsumer(process_id);
                Process.processConsumer(process_id, lastRun);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
    private static void errorDelay() {
        try {
            Thread.sleep(30000); // 30 seconds
        }
        catch (Exception e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/consumer/Consumer.java`
#### Snippet
```java
            while ((ConfigHandler.serverRunning || ConfigHandler.converterRunning) && (Consumer.isPaused || ConfigHandler.pauseConsumer || ConfigHandler.purgeRunning || Consumer.consumer_id.get(process_id)[1] == 1)) {
                pausedSuccess = true;
                Thread.sleep(100);
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            int waitCount = 0;
            while (tasksCompleted.get() < (taskStarted - 1L) && waitCount++ <= 50) {
                Thread.sleep(1);
            }
            tasksCompleted.set(taskStarted);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                            if (blockFinal instanceof Sign && player.getGameMode() != GameMode.CREATIVE) {
                                Thread.sleep(1500);
                                Sign sign = (Sign) blockFinal;
                                player.sendSignChange(sign.getLocation(), sign.getLines(), sign.getColor());
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            BukkitObjectOutputStream oos = new BukkitObjectOutputStream(bos);
            oos.writeObject(data);
            oos.flush();
            oos.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
            BukkitObjectOutputStream oos = new BukkitObjectOutputStream(bos);
            oos.writeObject(data);
            oos.flush();
            oos.close();
            bos.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
            oos.writeObject(data);
            oos.flush();
            oos.close();
            bos.close();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
            oos.flush();
            oos.close();
            bos.close();

            byte[] byte_data = bos.toByteArray();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
                BukkitObjectInputStream ins = new BukkitObjectInputStream(bais);
                @SuppressWarnings("unchecked")
                List<Object> input = (List<Object>) ins.readObject();
                ins.close();
                bais.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
                @SuppressWarnings("unchecked")
                List<Object> input = (List<Object>) ins.readObject();
                ins.close();
                bais.close();
                result = input;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/statement/EntityStatement.java`
#### Snippet
```java
                List<Object> input = (List<Object>) ins.readObject();
                ins.close();
                bais.close();
                result = input;
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java
        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);
        msgOut.writeBoolean(true);

        return msgBytes.toByteArray();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java

        try {
            String modVersion = dis.readUTF();
            String modId = dis.readUTF();
            int protocolVersion = dis.readInt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java
        try {
            String modVersion = dis.readUTF();
            String modId = dis.readUTF();
            int protocolVersion = dis.readInt();
            if (Config.getGlobal().NETWORK_DEBUG) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/listener/channel/PluginChannelHandshakeListener.java`
#### Snippet
```java
            String modVersion = dis.readUTF();
            String modId = dis.readUTF();
            int protocolVersion = dis.readInt();
            if (Config.getGlobal().NETWORK_DEBUG) {
                Chat.console(new String(bytes));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        try {
            while (Consumer.isPaused) {
                Thread.sleep(1);
            }
            Consumer.isPaused = true;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
        try {
            while (Consumer.isPaused) {
                Thread.sleep(1);
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
        if (!Config.getGlobal().MYSQL) {
            try {
                File tempFile = File.createTempFile("CoreProtect_" + System.currentTimeMillis(), ".tmp");
                tempFile.setExecutable(true);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                                lockMessage = true;
                            }
                            Thread.sleep(1000);
                        }
                        else {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
            if (exists) {
                RandomAccessFile blfile = new RandomAccessFile(blacklist, "rw");
                long blc = blfile.length();
                if (blc > 0) {
                    while (blfile.getFilePointer() < blfile.length()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                long blc = blfile.length();
                if (blc > 0) {
                    while (blfile.getFilePointer() < blfile.length()) {
                        String blacklistUser = blfile.readLine().replaceAll(" ", "").toLowerCase(Locale.ROOT);
                        if (blacklistUser.length() > 0) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                long blc = blfile.length();
                if (blc > 0) {
                    while (blfile.getFilePointer() < blfile.length()) {
                        String blacklistUser = blfile.readLine().replaceAll(" ", "").toLowerCase(Locale.ROOT);
                        if (blacklistUser.length() > 0) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                if (blc > 0) {
                    while (blfile.getFilePointer() < blfile.length()) {
                        String blacklistUser = blfile.readLine().replaceAll(" ", "").toLowerCase(Locale.ROOT);
                        if (blacklistUser.length() > 0) {
                            ConfigHandler.blacklist.put(blacklistUser, true);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/ConfigHandler.java`
#### Snippet
```java
                    }
                }
                blfile.close();
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
        if (globalFile.exists()) {
            // we always add options to the global config
            final byte[] data = Files.readAllBytes(globalFile.toPath());
            map.put("config", data);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
            }

            map.put(name.substring(0, name.length() - ".yml".length()), Files.readAllBytes(worldConfigFile.toPath()));
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
            OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(fout), StandardCharsets.UTF_8);
            if (writeHeader) {
                out.append(DEFAULT_FILE_HEADER);
                out.append(LINE_SEPARATOR);
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
            if (writeHeader) {
                out.append(DEFAULT_FILE_HEADER);
                out.append(LINE_SEPARATOR);
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java

                if (header != null) {
                    out.append(LINE_SEPARATOR);
                    for (final String headerLine : header) {
                        out.append(headerLine);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
                    out.append(LINE_SEPARATOR);
                    for (final String headerLine : header) {
                        out.append(headerLine);
                        out.append(LINE_SEPARATOR);
                    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
                    for (final String headerLine : header) {
                        out.append(headerLine);
                        out.append(LINE_SEPARATOR);
                    }
                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
                }

                out.append(key);
                out.append(": ");
                out.append(defaultValue);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java

                out.append(key);
                out.append(": ");
                out.append(defaultValue);
                out.append(LINE_SEPARATOR);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
                out.append(key);
                out.append(": ");
                out.append(defaultValue);
                out.append(LINE_SEPARATOR);
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
                out.append(": ");
                out.append(defaultValue);
                out.append(LINE_SEPARATOR);
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
            }

            out.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/command/ReloadCommand.java`
#### Snippet
```java
                        }
                        while (Consumer.isPaused) {
                            Thread.sleep(1);
                        }
                        Consumer.isPaused = true;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                                    patchNotification = true;
                                }
                                Thread.sleep(1000);
                            }
                        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
            ConfigHandler.serverRunning = true;
            Consumer.isPaused = false;
            Thread.sleep(1000);
            while (Consumer.isPaused) {
                Thread.sleep(500);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
            Thread.sleep(1000);
            while (Consumer.isPaused) {
                Thread.sleep(500);
            }
            ConfigHandler.serverRunning = isRunning;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                JarInputStream jarInputStream = new JarInputStream(new FileInputStream(pluginFile));
                while (true) {
                    JarEntry jarEntry = jarInputStream.getNextJarEntry();
                    if (jarEntry == null) {
                        break;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/patch/Patch.java`
#### Snippet
```java
                    }
                }
                jarInputStream.close();
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                        public void run() {
                            try {
                                Thread.sleep(5000);
                                Chat.sendMessage(user, Color.WHITE + "----- " + Color.DARK_AQUA + Phrase.build(Phrase.UPDATE_HEADER, "CoreProtect") + Color.WHITE + " -----");
                                Chat.sendMessage(user, Color.DARK_AQUA + Phrase.build(Phrase.UPDATE_NOTICE, Color.WHITE, "CoreProtect v" + latestVersion));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            InputStreamReader reader = new InputStreamReader(CoreProtect.getInstance().getClass().getResourceAsStream("/plugin.yml"));
            branch = YamlConfiguration.loadConfiguration(reader).getString("branch");
            reader.close();

            if (branch == null || branch.equals("${project.branch}")) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            BukkitObjectOutputStream oos = new BukkitObjectOutputStream(bos);
            oos.writeObject(data);
            oos.flush();
            oos.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            BukkitObjectOutputStream oos = new BukkitObjectOutputStream(bos);
            oos.writeObject(data);
            oos.flush();
            oos.close();
            bos.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            oos.writeObject(data);
            oos.flush();
            oos.close();
            bos.close();
            result = bos.toByteArray();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            oos.flush();
            oos.close();
            bos.close();
            result = bos.toByteArray();
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                ByteArrayInputStream metaByteStream = new ByteArrayInputStream(metadata);
                BukkitObjectInputStream metaObjectStream = new BukkitObjectInputStream(metaByteStream);
                Object metaList = metaObjectStream.readObject();
                metaObjectStream.close();
                metaByteStream.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                BukkitObjectInputStream metaObjectStream = new BukkitObjectInputStream(metaByteStream);
                Object metaList = metaObjectStream.readObject();
                metaObjectStream.close();
                metaByteStream.close();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                Object metaList = metaObjectStream.readObject();
                metaObjectStream.close();
                metaByteStream.close();

                return populateItemStack(itemstack, metaList);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                    BukkitObjectInputStream metaObjectStream = new BukkitObjectInputStream(metaByteStream);
                                    @SuppressWarnings("unchecked")
                                    List<Object> metaList = (List<Object>) metaObjectStream.readObject();
                                    metaObjectStream.close();
                                    metaByteStream.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                    @SuppressWarnings("unchecked")
                                    List<Object> metaList = (List<Object>) metaObjectStream.readObject();
                                    metaObjectStream.close();
                                    metaByteStream.close();
                                    meta = metaList;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                    List<Object> metaList = (List<Object>) metaObjectStream.readObject();
                                    metaObjectStream.close();
                                    metaByteStream.close();
                                    meta = metaList;
                                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                        // Not actually changing blocks, so less intensive.
                        sleepTime = sleepTime + 1;
                        Thread.sleep(1);
                    }
                    else {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    else {
                        sleepTime = sleepTime + 5;
                        Thread.sleep(5);
                    }

```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=IfStatementWithIdenticalBranches]
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

## RuleId[id=ListRemoveInLoop]
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

## RuleId[id=ConditionalExpressionWithIdenticalBranches]
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                                }
                                else {
                                    columns = columns + "," + name;
                                }
                            }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                                }
                                                else {
                                                    users = users + ", " + value;
                                                }
                                            }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/net/coreprotect/utility/ChatMessage.java`
#### Snippet
```java
        }
        for (int i = 0; i < length; i++) {
            result += " ";
        }

```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    }
                    else {
                        list = list + ",'" + value + "'";
                    }
                }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/patch/script/__2_16_0.java`
#### Snippet
```java
                    }
                    else {
                        idList = idList + ", " + id;
                    }
                }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            m = new BigDecimal(0);
                            s = new BigDecimal(0);
                            time = time + " -";
                        }

```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                w = new BigDecimal(i4);
                                if (range) {
                                    time = time + " " + timeString(w) + "w";
                                }
                                else {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                }
                                else {
                                    time = time + " " + Phrase.build(Phrase.TIME_WEEKS, timeString(w), (w.doubleValue() == 1 ? Selector.FIRST : Selector.SECOND));
                                }
                            }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                d = new BigDecimal(i4);
                                if (range) {
                                    time = time + " " + timeString(d) + "d";
                                }
                                else {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                }
                                else {
                                    time = time + " " + Phrase.build(Phrase.TIME_DAYS, timeString(d), (d.doubleValue() == 1 ? Selector.FIRST : Selector.SECOND));
                                }
                            }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                h = new BigDecimal(i4);
                                if (range) {
                                    time = time + " " + timeString(h) + "h";
                                }
                                else {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                }
                                else {
                                    time = time + " " + Phrase.build(Phrase.TIME_HOURS, timeString(h), (h.doubleValue() == 1 ? Selector.FIRST : Selector.SECOND));
                                }
                            }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                m = new BigDecimal(i4);
                                if (range) {
                                    time = time + " " + timeString(m) + "m";
                                }
                                else {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                }
                                else {
                                    time = time + " " + Phrase.build(Phrase.TIME_MINUTES, timeString(m), (m.doubleValue() == 1 ? Selector.FIRST : Selector.SECOND));
                                }
                            }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                s = new BigDecimal(i4);
                                if (range) {
                                    time = time + " " + timeString(s) + "s";
                                }
                                else {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                                }
                                else {
                                    time = time + " " + Phrase.build(Phrase.TIME_SECONDS, timeString(s), (s.doubleValue() == 1 ? Selector.FIRST : Selector.SECOND));
                                }
                            }
```

## RuleId[id=UnusedAssignment]
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
Variable `slot` initializer `0` is redundant
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
        }

        int slot = 0;
        switch (event.getSlot()) {
            case LEGS:
```

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
Variable `inventory` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        if (inventoryAction != InventoryAction.MOVE_TO_OTHER_INVENTORY && inventoryAction != InventoryAction.COLLECT_TO_CURSOR && inventoryAction != InventoryAction.UNKNOWN) {
            // Perform this check to prevent triggering onInventoryInteractAsync when a user is just clicking items in their own inventory
            Inventory inventory = null;
            try {
                inventory = event.getView().getInventory(event.getRawSlot());
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
Variable `handItem` initializer `null` is redundant
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                            if (jukeboxRecord.getType() == Material.AIR) {
                                ItemStack handItem = null;
                                ItemStack mainHand = player.getInventory().getItemInMainHand();
                                ItemStack offHand = player.getInventory().getItemInOffHand();
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
Variable `filter` initializer `lastArg` is redundant
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            }
            else if ((lastArg.equals("t:") || lastArg.equals("time:") || currentArg.startsWith("t:") || currentArg.startsWith("time:")) && (sender.hasPermission("coreprotect.lookup") || sender.hasPermission("coreprotect.rollback") || sender.hasPermission("coreprotect.restore") || sender.hasPermission("coreprotect.purge"))) {
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
            else if ((lastArg.equals("page:") || currentArg.startsWith("page:")) && (sender.hasPermission("coreprotect.lookup") || sender.hasPermission("coreprotect.lookup.near") || sender.hasPermission("coreprotect.inspect"))) {
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
            else if ((lastArg.equals("r:") || lastArg.equals("radius:") || currentArg.startsWith("r:") || currentArg.startsWith("radius:")) && (sender.hasPermission("coreprotect.lookup") || sender.hasPermission("coreprotect.rollback") || sender.hasPermission("coreprotect.restore") || sender.hasPermission("coreprotect.purge"))) {
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
            else if ((sender.hasPermission("coreprotect.lookup") || sender.hasPermission("coreprotect.rollback") || sender.hasPermission("coreprotect.restore")) && (lastArg.equals("i:") || lastArg.equals("include:") || lastArg.equals("item:") || lastArg.equals("items:") || lastArg.equals("b:") || lastArg.equals("block:") || lastArg.equals("blocks:") || currentArg.startsWith("i:") || currentArg.startsWith("include:") || currentArg.startsWith("item:") || currentArg.startsWith("items:") || currentArg.startsWith("b:") || currentArg.startsWith("block:") || currentArg.startsWith("blocks:") || lastArg.equals("e:") || lastArg.equals("exclude:") || currentArg.startsWith("e:") || currentArg.startsWith("exclude:"))) {
                String filter = lastArg;
                String arg = "";
                if (currentArg.contains(":")) {
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
Variable `selector` initializer `Selector.FIRST` is redundant
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    String tooltip = Util.getEnchantments(metadata, dtype, amount);

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
                int scannedWorldData = 0;
```

### UnusedAssignment
Variable `entityCount` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                int itemCount = 0;
                int blockCount = 0;
                int entityCount = 0;
                int scannedWorldData = 0;
                int[] rollbackHashData = ConfigHandler.rollbackHash.get(finalUserString);
```

### UnusedAssignment
Variable `scannedWorldData` initializer `0` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                int blockCount = 0;
                int entityCount = 0;
                int scannedWorldData = 0;
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

## RuleId[id=ConstantValue]
### ConstantValue
Condition `damager != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
            String user = "#entity";

            if (damager != null) {
                final Entity entity = event.getEntity();
                Location entityLocation = entity.getLocation();
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `entity != null` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                            ItemStack[] contents = Util.getContainerContents(Material.ARMOR_STAND, entity, block.getLocation());
                            Scheduler.runTask(CoreProtect.getInstance(), () -> {
                                if (entity != null && entity.isDead()) {
                                    entityLocation.setY(entityLocation.getY() + 0.99);
                                    Database.containerBreakCheck(killer, Material.ARMOR_STAND, entity, contents, block.getLocation());
```

### ConstantValue
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

### ConstantValue
Condition `(replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(M...` is always `false`
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            replaceData = 0;

            if ((replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(Material.SUNFLOWER) || replaceType.equals(Material.LILAC) || replaceType.equals(Material.TALL_GRASS) || replaceType.equals(Material.LARGE_FERN) || replaceType.equals(Material.ROSE_BUSH) || replaceType.equals(Material.PEONY)) && replaceData >= 8) { // Double plant top half
                BlockState blockBelow = blockReplaced.getWorld().getBlockAt(blockReplaced.getX(), blockReplaced.getY() - 1, blockReplaced.getZ()).getState();
                Material belowType = blockBelow.getType();
```

### ConstantValue
Condition `replaceData >= 8` is always `false` when reached
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
            replaceData = 0;

            if ((replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(Material.SUNFLOWER) || replaceType.equals(Material.LILAC) || replaceType.equals(Material.TALL_GRASS) || replaceType.equals(Material.LARGE_FERN) || replaceType.equals(Material.ROSE_BUSH) || replaceType.equals(Material.PEONY)) && replaceData >= 8) { // Double plant top half
                BlockState blockBelow = blockReplaced.getWorld().getBlockAt(blockReplaced.getX(), blockReplaced.getY() - 1, blockReplaced.getZ()).getState();
                Material belowType = blockBelow.getType();
```

### ConstantValue
Condition `treeType == null` is always `false`
in `src/main/java/net/coreprotect/listener/world/StructureGrowListener.java`
#### Snippet
```java

        // Skip logging for bad event calls
        if (treeType == null || event.isFromBonemeal()) {
            return;
        }
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Value `connection` is always 'null'
in `src/main/java/net/coreprotect/database/Database.java`
#### Snippet
```java

                    if (pauseTime >= waitTime) {
                        return connection;
                    }
                }
```

### ConstantValue
Condition `argExclude == null` is always `false`
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
        String corecommand = args[0].toLowerCase(Locale.ROOT);

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantValue
Condition `argExcludeUsers == null` is always `false`
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
        String corecommand = args[0].toLowerCase(Locale.ROOT);

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantValue
Condition `argUsers.size() == 0` is always `true` when reached
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `!(entity instanceof Player)` is always `false`
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java

        Entity entity = event.getEntity();
        if (!(entity instanceof Player)) {
            return;
        }
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `mainHand != null` is always `true` when reached
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        ItemStack mainHand = player.getInventory().getItemInMainHand();
                        if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null) {
                            handType = mainHand.getType();
                        }
```

### ConstantValue
Condition `mainHand != null` is always `true`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                ItemStack offHand = player.getInventory().getItemInOffHand();

                                if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null && Tag.ITEMS_MUSIC_DISCS.isTagged(mainHand.getType())) {
                                    handItem = mainHand;
                                }
```

### ConstantValue
Condition `offHand != null` is always `true`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                    handItem = mainHand;
                                }
                                else if (event.getHand().equals(EquipmentSlot.OFF_HAND) && offHand != null && Tag.ITEMS_MUSIC_DISCS.isTagged(offHand.getType())) {
                                    handItem = offHand;
                                }
```

### ConstantValue
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

### ConstantValue
Condition `mainHand != null` is always `true`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                ItemStack offHand = player.getInventory().getItemInOffHand();

                if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null && entityBlockTypes.contains(mainHand.getType())) {
                    handItem = mainHand;
                }
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `entity instanceof Attributable` is always `true`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
            }

            if (entity instanceof Attributable) {
                Attributable attributable = entity;

```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            Material material = Util.getType(type);
            if (material == null) {
                return result;
            }

```

### ConstantValue
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

### ConstantValue
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }
            else {
                return result;
            }

```

### ConstantValue
Value `update` is always 'false'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        if (!update) {
            setTypeAndData(block, type, blockData, update);
            map.remove(block);
        }
```

### ConstantValue
Value `result` is always 'null'
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
        byte[] result = null;
        if (data == null) {
            return result;
        }

```

### ConstantValue
Condition `argExclude == null` is always `false`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        boolean pageLookup = false;

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantValue
Condition `argExcludeUsers == null` is always `false`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        boolean pageLookup = false;

        if (argBlocks == null || argExclude == null || argExcludeUsers == null) {
            return;
        }
```

### ConstantValue
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

### ConstantValue
Condition `type == 4` is always `true`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }

        if (startTime <= 0 && !pageLookup && type == 4 && (argBlocks.size() > 0 || argUsers.size() > 0)) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_LOOKUP_TIME, Selector.FIRST));
            return;
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `argUsers.size() == 0` is always `true` when reached
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            }

            if (g == 1 && (pageLookup || argBlocks.size() > 0 || argUsers.size() > 0 || (argUsers.size() == 0 && argRadius != null))) {
                Integer MAX_RADIUS = Config.getGlobal().MAX_RADIUS;
                if (argRadius != null) {
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currentConsumerSize`
in `src/main/java/net/coreprotect/consumer/process/Process.java`
#### Snippet
```java
                    }
                }
                currentConsumerSize--;
            }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                }

                resultTextBuilder.append(timeAgo + " " + tag + " ").append(Phrase.build(phrase, Color.DARK_AQUA + rbFormat + resultUser + Color.WHITE + rbFormat, Color.DARK_AQUA + rbFormat + target + Color.WHITE, selector)).append("\n");
                PluginChannelListener.getInstance().sendData(commandSender, resultTime, phrase, selector, resultUser, target, -1, x, y, z, worldId, rbFormat, false, tag.contains("+"));
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java

        // tooltip
        message.append("|" + tooltip + "|");

        // chat output
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

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/entity/HangingPlaceListener.java`
#### Snippet
```java

            int inspect = 0;
            if (ConfigHandler.inspecting.get(player.getName()) != null) {
                if (ConfigHandler.inspecting.get(player.getName())) {
                    inspect = 1;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/listener/player/ArmorStandManipulateListener.java`
#### Snippet
```java
                break;
            default:
                slot = 0;
        }
        // 0: BOOTS, 1: LEGGINGS, 2: CHESTPLATE, 3: HELMET, 4: MAINHAND, 5: OFFHAND
```

### DataFlowIssue
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

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/consumer/Queue.java`
#### Snippet
```java
        if (blockReplaced != null) {
            replaceType = blockReplaced.getType();
            replaceData = 0;

            if ((replaceType == Material.IRON_DOOR || BlockGroup.DOORS.contains(replaceType) || replaceType.equals(Material.SUNFLOWER) || replaceType.equals(Material.LILAC) || replaceType.equals(Material.TALL_GRASS) || replaceType.equals(Material.LARGE_FERN) || replaceType.equals(Material.ROSE_BUSH) || replaceType.equals(Material.PEONY)) && replaceData >= 8) { // Double plant top half
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `setExecutor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                getCommand("core").setExecutor(CommandHandler.getInstance());
                getCommand("core").setTabCompleter(new TabHandler());
                getCommand("co").setExecutor(CommandHandler.getInstance());
                getCommand("co").setTabCompleter(new TabHandler());

```

### DataFlowIssue
Method invocation `setTabCompleter` may produce `NullPointerException`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                getCommand("core").setTabCompleter(new TabHandler());
                getCommand("co").setExecutor(CommandHandler.getInstance());
                getCommand("co").setTabCompleter(new TabHandler());

                boolean exists = (new File(ConfigHandler.path)).exists();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                    }
                    levelled.setLevel(waterLevel);
                    blockData = levelled;
                }

```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/CraftItemListener.java`
#### Snippet
```java
        }

        if ((event.getClick() == ClickType.DROP || event.getClick() == ClickType.CONTROL_DROP) && event.getCursor().getType() != Material.AIR) {
            return;
        }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getState` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            BlockState checkBlock = event.getClickedBlock().getState();
            int x = checkBlock.getX();
            int y = checkBlock.getY();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        long timeSince = systemTime - lastTime;
                        if (timeSince < 50 && !eventHand.equals(lastHand)) {
                            performLookup = false;
                        }
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        if (event.hasItem()) {
                            Material eventItem = event.getItem().getType();
                            if (eventItem.isBlock() && (eventItem.createBlockData() instanceof Bisected)) {
                                int x = finalBlock.getX();
```

### DataFlowIssue
Argument `sign.getColor()` might be null
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                Thread.sleep(1500);
                                Sign sign = (Sign) blockFinal;
                                player.sendSignChange(sign.getLocation(), sign.getLines(), sign.getColor());
                            }
                        }
```

### DataFlowIssue
Method invocation `getWorld` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
        /* Logging for players punching out fire blocks. */
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            World world = event.getClickedBlock().getWorld();
            if (event.useInteractedBlock() != Event.Result.DENY) {
                Block block = event.getClickedBlock();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java

                        ItemStack mainHand = player.getInventory().getItemInMainHand();
                        if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null) {
                            handType = mainHand.getType();
                        }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getY` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Block interactBlock = event.getClickedBlock();
                            if (BlockGroup.DOORS.contains(type)) {
                                int y = interactBlock.getY() - 1;
                                Block blockUnder = interactBlock.getWorld().getBlockAt(interactBlock.getX(), y, interactBlock.getZ());

```

### DataFlowIssue
Method invocation `getState` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            }

                            Queue.queuePlayerInteraction(player.getName(), interactBlock.getState(), type);
                        }
                    }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                ItemStack offHand = player.getInventory().getItemInOffHand();

                                if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null && Tag.ITEMS_MUSIC_DISCS.isTagged(mainHand.getType())) {
                                    handItem = mainHand;
                                }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                ItemStack offHand = player.getInventory().getItemInOffHand();

                if (event.getHand().equals(EquipmentSlot.HAND) && mainHand != null && entityBlockTypes.contains(mainHand.getType())) {
                    handItem = mainHand;
                }
```

### DataFlowIssue
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
                        String line3 = PaperAdapter.ADAPTER.getLine(sign, 2);
                        String line4 = PaperAdapter.ADAPTER.getLine(sign, 3);
                        int color = sign.getColor().getColor().asRGB();
                        boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
                        Queue.queueSignText(user, location, 0, color, isGlowing, line1, line2, line3, line4, 5);
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `replaceAll` may produce `NullPointerException`
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        }

        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");
```

### DataFlowIssue
Method invocation `replaceAll` may produce `NullPointerException`
in `src/main/java/net/coreprotect/command/TeleportCommand.java`
#### Snippet
```java
        String xValidate = x.replaceAll("[^.\\-]", "");
        String yValidate = y.replaceAll("[^.\\-]", "");
        String zValidate = z.replaceAll("[^.\\-]", "");

        if ((x.length() == 0 || x.length() >= 12 || x.equals(xValidate)) || (y.length() == 0 || y.length() >= 12 || y.equals(yValidate)) || (z.length() == 0 || z.length() >= 12 || z.equals(zValidate))) {
```

### DataFlowIssue
Method invocation `getColor` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/SignChangeListener.java`
#### Snippet
```java
        String line3 = event.getLine(2);
        String line4 = event.getLine(3);
        int color = (blockState instanceof Sign) ? ((Sign) blockState).getColor().getColor().asRGB() : 0;
        boolean isGlowing = (blockState instanceof Sign) ? BukkitAdapter.ADAPTER.isGlowing((Sign) blockState) : false;

```

### DataFlowIssue
Dereference of `event_blocks` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/block/BlockPistonListener.java`
#### Snippet
```java
            List<Block> blocks = new ArrayList<>();

            for (Block block : event_blocks) {
                Block block_relative = block.getRelative(event.getDirection());
                nblocks.add(block_relative);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

                if (location == null) {
                    restrictWorld = false;
                }

```

### DataFlowIssue
Method invocation `getWorld` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java

                Location destinationLocation = destinationHolder.getInventory().getLocation();
                List<Object> list = ConfigHandler.transactingChest.get(destinationLocation.getWorld().getUID().toString() + "." + destinationLocation.getBlockX() + "." + destinationLocation.getBlockY() + "." + destinationLocation.getBlockZ());
                if (list != null) {
                    list.add(new ItemStack[] { null, movedItem });
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java

                        if (actionText.length() == 0) {
                            actionText = actionText.append(actionTarget);
                        }
                        else {
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `configFolder.listFiles((File file) -> file.getName().endsWith(".yml"))` may produce `NullPointerException`
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
        }

        for (final File worldConfigFile : configFolder.listFiles((File file) -> file.getName().endsWith(".yml"))) {
            final String name = worldConfigFile.getName();
            if (name.equals(ConfigFile.CONFIG) || name.equals(ConfigFile.LANGUAGE)) {
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getAsString` may produce `NullPointerException`
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

                try {
                    info.add(enderman.getCarriedBlock().getAsString());
                }
                catch (Exception endermanException) {
```

### DataFlowIssue
Method invocation `entries` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

            if (itemMeta.hasAttributeModifiers()) {
                for (Map.Entry<Attribute, AttributeModifier> entry : itemMeta.getAttributeModifiers().entries()) {
                    Map<Attribute, Map<String, Object>> attributeList = new HashMap<>();
                    Attribute attribute = entry.getKey();
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/serialize/ItemMetaHandler.java`
#### Snippet
```java

                if (subMeta.hasColor()) {
                    list.add(subMeta.getColor().serialize());
                }
                metadata.add(list);
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isBlock` may produce `NullPointerException`
in `src/main/java/net/coreprotect/patch/script/__2_18_0.java`
#### Snippet
```java
                            }

                            if (blockBlockData == null && validatedMaterial.isBlock()) {
                                BlockData newBlockData = null;
                                try {
```

### DataFlowIssue
Method invocation `getAsString` may produce `NullPointerException`
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            }

            if (material.isBlock() && !createBlockData(material).getAsString().equals(string) && string.startsWith(NAMESPACE + material.name().toLowerCase(Locale.ROOT) + "[") && string.endsWith("]")) {
                String substring = string.substring(material.name().length() + 11, string.length() - 1);
                String[] blockDataSplit = substring.split(",");
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getBlockAt` may produce `NullPointerException`
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java

            String world = Util.getWorldName(wid);
            final Block fblock = Bukkit.getServer().getWorld(world).getBlockAt(x, y, z);// .getLocation();
            final BlockState fblockstate = fblock.getState();
            final CommandSender player2 = player;
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (targetCount == 0) {
                        restrictTargets = restrictTargets.append("" + targetName + "");
                    }
                    else {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeTargets = excludeTargets.append("" + targetName + "");
                    }
                    else {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java

                    if (excludeCount == 0) {
                        excludeUsers = excludeUsers.append("" + excludeUser + "");
                    }
                    else {
```

### DataFlowIssue
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

### DataFlowIssue
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

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                else if ((sender.hasPermission("coreprotect.lookup") && (argument0.equals("l") || argument0.equals("lookup"))) || (sender.hasPermission("coreprotect.rollback") && (argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro"))) || (sender.hasPermission("coreprotect.restore") && (argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")))) {
                    List<String> completions = new ArrayList<>(filterParams(true, argument0, argument1, hasUser, hasAction, hasInclude, hasExclude, hasRadius, hasTime, hasContainer, hasCount, hasPreview, pageLookup, validContainer));
                    completions.addAll(Bukkit.getOnlinePlayers().stream().filter(player -> player.getName().toLowerCase(Locale.ROOT).startsWith(argument1)).map(Player::getName).collect(Collectors.toList()));
                    return StringUtil.copyPartialMatches(argument1, completions, new ArrayList<>(completions.size()));
                }
```

## RuleId[id=ParameterCanBeLocal]
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
in `src/main/java/net/coreprotect/command/CancelCommand.java`
#### Snippet
```java

public class CancelCommand {
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

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'getData' is still used
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java

        @Deprecated
        public int getData() {
            return Integer.parseInt(parse[6]);
        }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/net/coreprotect/listener/PlayerPickupArrowListener.java`
#### Snippet
```java
    public static ItemStack getArrowType(AbstractArrow arrow) {
        ItemStack itemStack = null;
        switch (arrow.getType()) {
            case SPECTRAL_ARROW:
                itemStack = new ItemStack(Material.SPECTRAL_ARROW);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    @Override
    public String parseLegacyName(String name) {
        switch (name) {
            case "GRASS_PATH":
                name = "DIRT_PATH";
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
    @Override
    public int getLegacyBlockId(Material material) {
        switch (material) {
            case DIRT_PATH:
                return Util.getBlockId("GRASS_PATH", false);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
                    int xMin = location.getBlockX() - radius;
                    int xMax = location.getBlockX() + radius;
                    int zMin = location.getBlockZ() - radius;
                    int zMax = location.getBlockZ() + radius;
                    argRadius = new Integer[] { radius, xMin, xMax, null, null, zMin, zMax, 0 };
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/api/BlockAPI.java`
#### Snippet
```java
            if (block == null) {
                return result;
            }

            int x = block.getX();
            int y = block.getY();
            int z = block.getZ();
            int time = (int) (System.currentTimeMillis() / 1000L);
            int worldId = Util.getWorldId(block.getWorld().getName());
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/api/QueueLookup.java`
#### Snippet
```java
            int consumerCount = 0;
            int currentConsumerSize = Process.getCurrentConsumerSize();
            if (currentConsumerSize == 0) {
                consumerCount = Consumer.getConsumerSize(0) + Consumer.getConsumerSize(1);
            }
            else {
                int consumerId = (Consumer.currentConsumer == 1) ? 1 : 0;
                consumerCount = Consumer.getConsumerSize(consumerId) + currentConsumerSize;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java
                List<Object> list = ConfigHandler.lastRollback.get(user.getName());
                long startTime = (Long) list.get(0);
                long endTime = (Long) list.get(1);
                args = (String[]) list.get(2);
                Location location = (Location) list.get(3);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/ApplyCommand.java`
#### Snippet
```java
                if (!valid) {
                    Chat.sendMessage(user, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.NO_ROLLBACK, Selector.FIRST));
                }
                else {
                    ConfigHandler.lastRollback.remove(user.getName());
                    RollbackRestoreCommand.runCommand(user, command, permission, args, location, startTime, endTime);
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            if (i3.equals("#natural")) {
                                for (Material block : naturalBlocks) {
                                    excluded.put(block, false);
                                }
                            }
                            else {
                                Material i3_material = Util.getType(i3);
                                if (i3_material != null && (i3_material.isBlock() || argAction.contains(4))) {
                                    excluded.put(i3_material, false);
                                }
                                else {
                                    EntityType i3_entity = Util.getEntityType(i3);
                                    if (i3_entity != null) {
                                        excluded.put(i3_entity, false);
                                    }
                                    else if (i3_material != null) {
                                        excluded.put(i3_material, false);
                                    }
                                }
                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            boolean isBlock = false;
                            if (i3.equals("#natural")) {
                                isBlock = true;
                            }
                            else {
                                Material i3_material = Util.getType(i3);
                                if (i3_material != null) {
                                    isBlock = true;
                                }
                                else {
                                    EntityType i3Entity = Util.getEntityType(i3);
                                    if (i3Entity != null) {
                                        isBlock = true;
                                    }
                                }
                            }
                            if (!isBlock) {
                                excluded.add(i3);
                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                            if (i3.equals("#natural")) {
                                restricted.addAll(naturalBlocks);
                            }
                            else {
                                Material i3_material = Util.getType(i3);
                                if (i3_material != null && (i3_material.isBlock() || argAction.contains(4))) {
                                    restricted.add(i3_material);
                                }
                                else {
                                    EntityType i3_entity = Util.getEntityType(i3);
                                    if (i3_entity != null) {
                                        restricted.add(i3_entity);
                                    }
                                    else if (i3_material != null) {
                                        restricted.add(i3_material);
                                    }
                                    else {
                                        Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_INCLUDE, i3));
                                        // Functions.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_PARAMETERS, "/co help include"));
                                        return null;
                                    }
                                }
                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
                    argument = argument.replaceAll("time:", "");
                    argument = argument.replaceAll("t:", "");
                    argument = argument.replaceAll("y", "y:");
                    argument = argument.replaceAll("m", "m:");
                    argument = argument.replaceAll("w", "w:");
                    argument = argument.replaceAll("d", "d:");
                    argument = argument.replaceAll("h", "h:");
                    argument = argument.replaceAll("s", "s:");
                    range = argument.contains("-");

                    int argCount = 0;
                    String[] i2 = argument.split(":");
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/ConsumerCommand.java`
#### Snippet
```java
        if (ConfigHandler.converterRunning) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.UPGRADE_IN_PROGRESS));
            return;
        }
        if (ConfigHandler.purgeRunning) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.PURGE_IN_PROGRESS));
            return;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        List<String> argUsers = CommandHandler.parseUsers(args);
        Integer[] argRadius = CommandHandler.parseRadius(args, player, lo);
        int argNoisy = CommandHandler.parseNoisy(args);
        List<Integer> argAction = CommandHandler.parseAction(args);
        List<Object> argBlocks = CommandHandler.parseRestricted(player, args, argAction);
        Map<Object, Boolean> argExclude = CommandHandler.parseExcluded(player, args, argAction);
        List<String> argExcludeUsers = CommandHandler.parseExcludedUsers(player, args);
        String ts = CommandHandler.parseTimeString(args);
        long[] argTime = CommandHandler.parseTime(args);
        long startTime = argTime[0];
        long endTime = argTime[1];
        int argWid = CommandHandler.parseWorld(args, true, true);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        boolean hasBlock = false;
        boolean hasEntity = false;
        for (Object arg : argBlocks) {
            if (arg instanceof Material) {
                hasBlock = true;
            }
            else if (arg instanceof EntityType) {
                hasEntity = true;
                if (argAction.size() == 0) {
                    argAction.add(3);
                }
                else if (!argAction.contains(3)) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_INCLUDE_COMBO));
                    return;
                }
            }
        }

        /* check for invalid block/entity combinations (exclude) */
        for (Object arg : argExclude.keySet()) {
            if (arg instanceof Material) {
                hasBlock = true;
            }
            else if (arg instanceof EntityType) {
                hasEntity = true;
                if (argAction.size() == 0) {
                    argAction.add(3);
                }
                else if (!argAction.contains(3)) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_INCLUDE_COMBO));
                    return;
                }
            }
        }

        if (hasBlock && hasEntity) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_INCLUDE_COMBO));
            return;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        if (argAction.contains(-1)) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_ACTION));
            return;
        }
        if (worldedit && argRadius == null) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_SELECTION, "WorldEdit"));
            return;
        }
        if (argRadius != null && argRadius[0] == -1) {
            Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.INVALID_RADIUS));
            return;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            if (argUsers.size() == 0) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.MISSING_ACTION_USER));
                return;
            }

            argExclude.put(Material.FIRE, false);
            argExclude.put(Material.WATER, false);
            argExclude.put(Material.FARMLAND, false);
            argExcludeUsers.add("#hopper");
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            int re = 7;
            if (parseRows > 0) {
                re = parseRows;
            }
            if (resultc > 1) {
                String pages = args[1];
                if (pages.contains(":")) {
                    String[] data = pages.split(":");
                    pages = data[0];
                    String results = "";
                    if (data.length > 1) {
                        results = data[1];
                    }
                    results = results.replaceAll("[^0-9]", "");
                    if (results.length() > 0 && results.length() < 10) {
                        int r = Integer.parseInt(results);
                        if (r > 0) {
                            re = r;
                            defaultRe = false;
                        }
                    }
                }
                pages = pages.replaceAll("[^0-9]", "");
                if (pages.length() > 0 && pages.length() < 10) {
                    int pa = Integer.parseInt(pages);
                    if (pa > 0) {
                        p = pa;
                    }
                }
            }

            if (re > 1000) {
                re = 1000;
            }
            if (re > 100 && !(player instanceof ConsoleCommandSender)) {
                re = 100;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                if (resultc > 1) {
                    String pages = args[1];
                    if (pages.contains(":")) {
                        String[] data = pages.split(":");
                        pages = data[0];
                        String results = "";
                        if (data.length > 1) {
                            results = data[1];
                        }
                        results = results.replaceAll("[^0-9]", "");
                        if (results.length() > 0 && results.length() < 10) {
                            int r = Integer.parseInt(results);
                            if (r > 0) {
                                re = r;
                                defaultRe = false;
                            }
                        }
                    }
                    pages = pages.replaceAll("[^0-9]", "");
                    if (pages.length() > 0 && pages.length() < 10) {
                        int p = Integer.parseInt(pages);
                        if (p > 0) {
                            pa = p;
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
            String lcommand = ConfigHandler.lookupCommand.get(player.getName());
            String[] data = lcommand.split("\\.");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            int z = Integer.parseInt(data[2]);
            int wid = Integer.parseInt(data[3]);
            int x2 = Integer.parseInt(data[4]);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                for (String signMessage : signData) {
                                    String bypass = null;

                                    if (signMessage.contains("\n")) {
                                        String[] split = signMessage.split("\n");
                                        signMessage = split[0];
                                        bypass = split[1];
                                    }

                                    if (signMessage.length() > 0) {
                                        Chat.sendComponent(player2, signMessage, bypass);
                                    }
                                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                    String lcommand = ConfigHandler.lookupCommand.get(player.getName());
                    String[] data = lcommand.split("\\.");
                    x = Integer.parseInt(data[0]);
                    y = Integer.parseInt(data[1]);
                    z = Integer.parseInt(data[2]);
                    wid = Integer.parseInt(data[3]);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                        boolean valid = false;
                        if (ConfigHandler.lookupType.get(player.getName()) != null) {
                            int lookupType = ConfigHandler.lookupType.get(player.getName());
                            if (lookupType == 1) {
                                valid = true;
                            }
                            else if (lookupType == 5) {
                                if (ConfigHandler.lookupUlist.get(player.getName()).contains("#container")) {
                                    valid = true;
                                }
                            }
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                if (ConfigHandler.lookupType.get(sender.getName()) != null) {
                    int lookupType = ConfigHandler.lookupType.get(sender.getName());
                    if (lookupType == 1) {
                        validContainer = true;
                    }
                    else if (lookupType == 5) {
                        if (ConfigHandler.lookupUlist.get(sender.getName()).contains("#container")) {
                            validContainer = true;
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                    if (exists) {
                                        for (String check : euserlist) {
                                            if (!check.equals("#global") && !check.equals("#hopper")) {
                                                exists = PlayerLookup.playerExists(connection, check);
                                                if (!exists) {
                                                    baduser = check;
                                                    break;
                                                }
                                            }
                                            else if (check.equals("#global")) {
                                                baduser = "#global";
                                                exists = false;
                                            }
                                        }
                                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    String time = data[0];
                                                    String dplayer = data[1];
                                                    int wid = Integer.parseInt(data[2]);
                                                    int x = Integer.parseInt(data[3]);
                                                    int y = Integer.parseInt(data[4]);
                                                    int z = Integer.parseInt(data[5]);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                                    String timeago = Util.getTimeSince(Integer.parseInt(time), unixtimestamp, true);
                                                    int timeLength = 50 + (Util.getTimeSince(Integer.parseInt(time), unixtimestamp, false).replaceAll("[^0-9]", "").length() * 6);
                                                    String leftPadding = Color.BOLD + Strings.padStart("", 10, ' ');
                                                    if (timeLength % 4 == 0) {
                                                        leftPadding = Strings.padStart("", timeLength / 4, ' ');
                                                    }
                                                    else {
                                                        leftPadding = leftPadding + Color.WHITE + Strings.padStart("", (timeLength - 50) / 4, ' ');
                                                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
        if (ConfigHandler.lookupThrottle.get(player.getName()) != null) {
            Object[] lookupThrottle = ConfigHandler.lookupThrottle.get(player.getName());
            if ((boolean) lookupThrottle[0] || ((System.currentTimeMillis() - (long) lookupThrottle[1])) < 100) {
                Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.DATABASE_BUSY));
                return;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                String filter = lastArg;
                String arg = "";
                if (currentArg.contains(":")) {
                    String[] split = currentArg.split(":", 2);
                    filter = split[0] + ":";
                    if (split.length > 1) {
                        arg = split[1];
                    }
                }
                else {
                    filter = "";
                    arg = currentArg;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                    List<String> completions = new ArrayList<>(params);
                    for (int index = 0; index < completions.size(); index++) {
                        completions.set(index, filter + completions.get(index));
                    }
                    return StringUtil.copyPartialMatches(filter + arg, completions, new ArrayList<>(completions.size()));
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/config/Config.java`
#### Snippet
```java
        final CoreProtect plugin = CoreProtect.getInstance();
        final File configFolder = plugin.getDataFolder();
        if (!configFolder.exists()) {
            configFolder.mkdirs();
        }

        final Map<String, byte[]> map = new HashMap<>();
        final File globalFile = new File(configFolder, fileName);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/config/ConfigFile.java`
#### Snippet
```java
            if (lines.size() > 0) {
                String lastLine = lines.get(lines.size() - 1); // append the final line to prevent a line separator from being added
                Files.write(path, (lines.remove(lines.size() - 1).isEmpty() ? lines : lines), StandardCharsets.UTF_8);
                Files.write(path, lastLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                lines.clear();
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/consumer/process/BlockPlaceProcess.java`
#### Snippet
```java
            if (blockType.equals(Material.SKELETON_SKULL) || blockType.equals(Material.SKELETON_WALL_SKULL) || blockType.equals(Material.WITHER_SKELETON_SKULL) || blockType.equals(Material.WITHER_SKELETON_WALL_SKULL) || blockType.equals(Material.ZOMBIE_HEAD) || blockType.equals(Material.ZOMBIE_WALL_HEAD) || blockType.equals(Material.PLAYER_HEAD) || blockType.equals(Material.PLAYER_WALL_HEAD) || blockType.equals(Material.CREEPER_HEAD) || blockType.equals(Material.CREEPER_WALL_HEAD) || blockType.equals(Material.DRAGON_HEAD) || blockType.equals(Material.DRAGON_WALL_HEAD)) {
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    long resultId = results.getLong("id");
                    int resultTime = results.getInt("time");
                    int resultUserId = results.getInt("user");
                    int resultWorldId = results.getInt("wid");
                    int resultX = results.getInt("x");
                    int resultY = results.getInt("y");
                    int resultZ = results.getInt("z");
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    String line1 = results.getString("line_1");
                    String line2 = results.getString("line_2");
                    String line3 = results.getString("line_3");
                    String line4 = results.getString("line_4");

                    StringBuilder message = new StringBuilder();
                    if (line1 != null && line1.length() > 0) {
                        message.append(line1);
                        if (!line1.endsWith(" ")) {
                            message.append(" ");
                        }
                    }
                    if (line2 != null && line2.length() > 0) {
                        message.append(line2);
                        if (!line2.endsWith(" ")) {
                            message.append(" ");
                        }
                    }
                    if (line3 != null && line3.length() > 0) {
                        message.append(line3);
                        if (!line3.endsWith(" ")) {
                            message.append(" ");
                        }
                    }
                    if (line4 != null && line4.length() > 0) {
                        message.append(line4);
                        if (!line4.endsWith(" ")) {
                            message.append(" ");
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                        if (ConfigHandler.playerIdCache.get(checkUser.toLowerCase(Locale.ROOT)) == null) {
                            UserStatement.loadId(statement.getConnection(), checkUser, null);
                        }

                        int userId = ConfigHandler.playerIdCache.get(checkUser.toLowerCase(Locale.ROOT));
                        if (checkUserText.length() == 0) {
                            checkUserText = checkUserText.append(userId);
                        }
                        else {
                            checkUserText.append(",").append(userId);
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                    String targetName = "";

                    if (restrictTarget instanceof Material) {
                        targetName = ((Material) restrictTarget).name();
                        if (includeListMaterial.length() == 0) {
                            includeListMaterial = includeListMaterial.append(Util.getBlockId(targetName, false));
                        }
                        else {
                            includeListMaterial.append(",").append(Util.getBlockId(targetName, false));
                        }

                        /* Include legacy IDs */
                        int legacyId = BukkitAdapter.ADAPTER.getLegacyBlockId((Material) restrictTarget);
                        if (legacyId > 0) {
                            includeListMaterial.append(",").append(legacyId);
                        }
                    }
                    else if (restrictTarget instanceof EntityType) {
                        targetName = ((EntityType) restrictTarget).name();
                        if (includeListEntity.length() == 0) {
                            includeListEntity = includeListEntity.append(Util.getEntityId(targetName, false));
                        }
                        else {
                            includeListEntity.append(",").append(Util.getEntityId(targetName, false));
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/Lookup.java`
#### Snippet
```java
                int x = block.getX();
                int y = block.getY();
                int z = block.getZ();
                int worldId = Util.getWorldId(block.getWorld().getName());

                String cords = "" + x + "." + y + "." + z + "." + worldId + "";
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/logger/BlockBreakLogger.java`
#### Snippet
```java
            CoreProtectPreLogEvent event = new CoreProtectPreLogEvent(user);
            CoreProtect.getInstance().getServer().getPluginManager().callEvent(event);

            int userId = UserStatement.getId(preparedStmt, event.getUser(), true);
            int wid = Util.getWorldId(location.getWorld().getName());
            int time = (int) (System.currentTimeMillis() / 1000L);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/logger/ChatLogger.java`
#### Snippet
```java
            if (ConfigHandler.blacklist.get(user.toLowerCase(Locale.ROOT)) != null) {
                return;
            }
            int x = location.getBlockX();
            int y = location.getBlockY();
            int z = location.getBlockZ();
            int wid = Util.getWorldId(location.getWorld().getName());
            int userId = ConfigHandler.playerIdCache.get(user.toLowerCase(Locale.ROOT));
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
                            if (addItem != null) {
                                newMerge[count] = addItem;
                                count++;
                            }

                            // item was added by hopper, remove from state
                            if (removeItem != null) {
                                for (ItemStack check : newMerge) {
                                    if (check != null && check.isSimilar(removeItem)) {
                                        check.setAmount(check.getAmount() - 1);
                                        break;
                                    }
                                }
                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/logger/ContainerLogger.java`
#### Snippet
```java
                        if (metadata.size() == 0) {
                            metadata = null;
                        }

                        CoreProtectPreLogEvent event = new CoreProtectPreLogEvent(user);
                        CoreProtect.getInstance().getServer().getPluginManager().callEvent(event);

                        int userId = UserStatement.getId(preparedStmt, event.getUser(), true);
                        int wid = Util.getWorldId(location.getWorld().getName());
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/logger/EntityKillLogger.java`
#### Snippet
```java
            if (ConfigHandler.blacklist.get(user.toLowerCase(Locale.ROOT)) != null) {
                return;
            }

            CoreProtectPreLogEvent event = new CoreProtectPreLogEvent(user);
            CoreProtect.getInstance().getServer().getPluginManager().callEvent(event);

            int userId = UserStatement.getId(preparedStmt, event.getUser(), true);
            int wid = Util.getWorldId(block.getWorld().getName());
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/logger/SkullBreakLogger.java`
#### Snippet
```java
            if (skull.hasOwner()) {
                skullOwner = skull.getOwningPlayer().getUniqueId().toString();
                SkullStatement.insert(preparedStmt2, time, skullOwner);
                ResultSet keys = preparedStmt2.getGeneratedKeys();
                keys.next();
                skullKey = keys.getInt(1);
                keys.close();
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
            if (block == null) {
                return resultText;
            }

            if (command == null) {
                if (commandSender.hasPermission("coreprotect.co")) {
                    command = "co";
                }
                else if (commandSender.hasPermission("coreprotect.core")) {
                    command = "core";
                }
                else if (commandSender.hasPermission("coreprotect.coreprotect")) {
                    command = "coreprotect";
                }
                else {
                    command = "co";
                }
            }

            boolean found = false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/lookup/BlockLookup.java`
#### Snippet
```java
                int resultUserId = results.getInt("user");
                int resultAction = results.getInt("action");
                int resultType = results.getInt("type");
                int resultData = results.getInt("data");
                long resultTime = results.getLong("time");
                int resultRolledBack = results.getInt("rolled_back");

                if (ConfigHandler.playerIdCacheReversed.get(resultUserId) == null) {
                    UserStatement.loadName(statement.getConnection(), resultUserId);
                }

                String resultUser = ConfigHandler.playerIdCacheReversed.get(resultUserId);
                String timeAgo = Util.getTimeSince(resultTime, time, true);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/lookup/ChestTransactionLookup.java`
#### Snippet
```java
                String rbFormat = "";
                if (resultRolledBack == 1 || resultRolledBack == 3) {
                    rbFormat = Color.STRIKETHROUGH;
                }

                Material resultMaterial = Util.getType(resultType);
                if (resultMaterial == null) {
                    resultMaterial = Material.AIR;
                }
                String target = resultMaterial.name().toLowerCase(Locale.ROOT);
                target = Util.nameFilter(target, resultData);
                if (target.length() > 0) {
                    target = "minecraft:" + target.toLowerCase(Locale.ROOT) + "";
                }

                // Hide "minecraft:" for now.
                if (target.startsWith("minecraft:")) {
                    target = target.split(":")[1];
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/statement/BlockStatement.java`
#### Snippet
```java
            preparedStmt.setInt(1, time);
            preparedStmt.setInt(2, id);
            preparedStmt.setInt(3, wid);
            preparedStmt.setInt(4, x);
            preparedStmt.setInt(5, y);
            preparedStmt.setInt(6, z);
            preparedStmt.setInt(7, type);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/statement/ChatStatement.java`
#### Snippet
```java
        try {
            preparedStmt.setLong(1, time);
            preparedStmt.setInt(2, user);
            preparedStmt.setInt(3, wid);
            preparedStmt.setInt(4, x);
            preparedStmt.setInt(5, y);
            preparedStmt.setInt(6, z);
            preparedStmt.setString(7, message);
            preparedStmt.addBatch();

            if (batchCount > 0 && batchCount % 1000 == 0) {
                preparedStmt.executeBatch();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/statement/ContainerStatement.java`
#### Snippet
```java
            byte[] byteData = Util.convertByteData(metadata);
            preparedStmt.setInt(1, time);
            preparedStmt.setInt(2, id);
            preparedStmt.setInt(3, wid);
            preparedStmt.setInt(4, x);
            preparedStmt.setInt(5, y);
            preparedStmt.setInt(6, z);
            preparedStmt.setInt(7, type);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/statement/MaterialStatement.java`
#### Snippet
```java
        try {
            preparedStmt.setInt(1, id);
            preparedStmt.setString(2, name);
            preparedStmt.addBatch();

            if (batchCount > 0 && batchCount % 1000 == 0) {
                preparedStmt.executeBatch();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/database/statement/UserStatement.java`
#### Snippet
```java
            ConfigHandler.playerIdCache.put(user.toLowerCase(Locale.ROOT), id);
            ConfigHandler.playerIdCacheReversed.put(id, user);
            if (uuid != null) {
                ConfigHandler.uuidCache.put(user.toLowerCase(Locale.ROOT), uuid);
                ConfigHandler.uuidCacheReversed.put(uuid, user);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java
                    Location location = blockState.getLocation();
                    Sign sign = (Sign) blockState;
                    String line1 = sign.getLine(0);
                    String line2 = sign.getLine(1);
                    String line3 = sign.getLine(2);
                    String line4 = sign.getLine(3);
                    int color = sign.getColor().getColor().asRGB();
                    boolean isGlowing = BukkitAdapter.ADAPTER.isGlowing(sign);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Sign sign = (Sign) blockState;
                            String line1 = sign.getLine(0);
                            String line2 = sign.getLine(1);
                            String line3 = sign.getLine(2);
                            String line4 = sign.getLine(3);
                            int oldColor = sign.getColor().getColor().asRGB();
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        if (!PluginChannelHandshakeListener.getInstance().isPluginChannelPlayer(commandSender)) {
            return;
        }

        String phraseSelector = Phrase.getPhraseSelector(phrase, selector);
        String worldName = Util.getWorldName(worldId);

        ByteArrayOutputStream msgBytes = new ByteArrayOutputStream();
        DataOutputStream msgOut = new DataOutputStream(msgBytes);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        msgOut.writeInt(x);
        msgOut.writeInt(y);
        msgOut.writeInt(z);
        msgOut.writeUTF(worldName);
        if (Config.getGlobal().NETWORK_DEBUG) {
            Chat.console(String.valueOf(timeAgo * 1000));
            Chat.console(resultUser);
            Chat.console(message);
            Chat.console(String.valueOf(sign));
            Chat.console(String.valueOf(x));
            Chat.console(String.valueOf(y));
            Chat.console(String.valueOf(z));
            Chat.console(worldName);
            Chat.console("");
        }

        send(commandSender, msgBytes.toByteArray());
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/channel/PluginChannelListener.java`
#### Snippet
```java
        if (Config.getGlobal().NETWORK_DEBUG) {
            Chat.console(String.valueOf(timeAgo * 1000));
            Chat.console(phraseSelector);
            Chat.console(resultUser);
            Chat.console(String.valueOf(amount));
            Chat.console(String.valueOf(x));
            Chat.console(String.valueOf(y));
            Chat.console(String.valueOf(z));
            Chat.console(worldName);
            Chat.console("");
        }

        send(commandSender, msgBytes.toByteArray());
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                    AbstractArrow arrow = (AbstractArrow) damager;
                    ProjectileSource source = arrow.getShooter();

                    if (source instanceof Player) {
                        Player player = (Player) source;
                        user = player.getName();
                    }
                    else if (source instanceof LivingEntity) {
                        EntityType entityType = ((LivingEntity) source).getType();
                        if (entityType != null) { // Check for MyPet plugin
                            String name = entityType.name().toLowerCase(Locale.ROOT);
                            user = "#" + name;
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
                ProjectileSource shooter = potion.getShooter();

                if (shooter instanceof Player) {
                    Player player = (Player) shooter;
                    e = player.getName();
                }
                else if (shooter instanceof LivingEntity) {
                    EntityType entityType = ((LivingEntity) shooter).getType();
                    if (entityType != null) { // Check for MyPet plugin
                        String name = entityType.name().toLowerCase(Locale.ROOT);
                        e = "#" + name;
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/entity/EntityDamageByEntityListener.java`
#### Snippet
```java
                        if (frame.getItem().getType() != Material.AIR) {
                            ItemStack[] oldState = new ItemStack[] { frame.getItem().clone() };
                            ItemStack[] newState = new ItemStack[] { new ItemStack(Material.AIR) };
                            PlayerInteractEntityListener.queueContainerSpecifiedItems(user, Material.ITEM_FRAME, new Object[] { oldState, newState, frame.getFacing() }, frame.getLocation(), logDrops);
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
                if (!player.hasPermission("coreprotect.inspect")) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.NO_PERMISSION));
                    ConfigHandler.inspecting.put(player.getName(), false);
                    return;
                }
                if (ConfigHandler.converterRunning) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.UPGRADE_IN_PROGRESS));
                    return;
                }
                if (ConfigHandler.purgeRunning) {
                    Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.PURGE_IN_PROGRESS));
                    return;
                }
                if (ConfigHandler.lookupThrottle.get(player.getName()) != null) {
                    Object[] lookupThrottle = ConfigHandler.lookupThrottle.get(player.getName());
                    if ((boolean) lookupThrottle[0] || ((System.currentTimeMillis() - (long) lookupThrottle[1])) < 100) {
                        Chat.sendMessage(player, Color.DARK_AQUA + "CoreProtect " + Color.WHITE + "- " + Phrase.build(Phrase.DATABASE_BUSY));
                        return;
                    }
                }
                ConfigHandler.lookupThrottle.put(player.getName(), new Object[] { true, System.currentTimeMillis() });
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/entity/HangingBreakByEntityListener.java`
#### Snippet
```java
                        Statement statement = connection.createStatement();
                        String blockData = BlockLookup.performLookup(null, statement, block, player, 0, 1, 7);

                        if (blockData.contains("\n")) {
                            for (String b : blockData.split("\n")) {
                                Chat.sendComponent(player, b);
                            }
                        }
                        else if (blockData.length() > 0) {
                            Chat.sendComponent(player, blockData);
                        }

                        statement.close();
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                                            String blockData = BlockLookup.performLookup(null, statement, finalBlock, finalPlayer, 0, 1, 7);

                                            if (blockData.contains("\n")) {
                                                for (String b : blockData.split("\n")) {
                                                    Chat.sendComponent(finalPlayer, b);
                                                }
                                            }
                                            else if (blockData.length() > 0) {
                                                Chat.sendComponent(finalPlayer, blockData);
                                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java
        Object[] lastAbort = ConfigHandler.hopperAbort.get(loggingChestId);
        if (lastAbort != null) {
            ItemStack[] destinationContents = destinationHolder.getInventory().getContents();
            if (((Set<?>) lastAbort[0]).contains(item) && Arrays.equals(destinationContents, (ItemStack[]) lastAbort[1])) {
                return;
            }
        }

        ItemStack[] containerState = null;
        if (!ConfigHandler.isPaper) {
            containerState = Util.getContainerState(sourceHolder.getInventory().getContents());
        }
        ItemStack[] sourceContainer = containerState;
        ItemStack movedItem = item.clone();

        final long taskStarted = InventoryChangeListener.tasksStarted.incrementAndGet();
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java
                    for (ItemStack itemStack : sourceHolder.getInventory().getContents()) {
                        if (itemStack != null && Util.getItemStackHashCode(itemStack) == itemHash) {
                            if (itemHash != Util.getItemStackHashCode(movedItem) || destinationHolder.getInventory().firstEmpty() == -1 || destinationHolder.getInventory() instanceof BrewerInventory || destinationHolder.getInventory() instanceof FurnaceInventory) {
                                abort = true;
                            }

                            break;
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/HopperPullListener.java`
#### Snippet
```java
                if (abort) {
                    Set<ItemStack> movedItems = new HashSet<>();
                    ItemStack[] destinationContents = destinationHolder.getInventory().getContents();
                    if (lastAbort != null && Arrays.equals(destinationContents, (ItemStack[]) lastAbort[1])) {
                        ((Set<?>) lastAbort[0]).forEach(itemStack -> movedItems.add((ItemStack) itemStack));
                    }
                    movedItems.add(movedItem);

                    ConfigHandler.hopperAbort.put(loggingChestId, new Object[] { movedItems, Util.getContainerState(destinationContents) });
                    return;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
                    int x = playerLocation.getBlockX();
                    int y = playerLocation.getBlockY();
                    int z = playerLocation.getBlockZ();

                    String transactingChestId = playerLocation.getWorld().getUID().toString() + "." + x + "." + y + "." + z;
                    String loggingChestId = user.toLowerCase(Locale.ROOT) + "." + x + "." + y + "." + z;
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
            if (inventory == null) {
                return;
            }

            InventoryHolder inventoryHolder = inventory.getHolder();
            enderChest = inventory.equals(event.getWhoClicked().getEnderChest());
            if ((inventoryHolder == null || !(inventoryHolder instanceof BlockInventoryHolder || inventoryHolder instanceof DoubleChest)) && !enderChest) {
                return;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/PlayerChatListener.java`
#### Snippet
```java
        Player player = event.getPlayer();
        if (event.isCancelled() && !Config.getConfig(player.getWorld()).LOG_CANCELLED_CHAT) {
            return;
        }

        if (!message.startsWith("/") && Config.getConfig(player.getWorld()).PLAYER_MESSAGES) {
            long timestamp = System.currentTimeMillis() / 1000L;
            Queue.queuePlayerChat(player, message, timestamp);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/PlayerInteractEntityListener.java`
#### Snippet
```java
            ItemStack handItem = new ItemStack(Material.AIR);
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            if (event.getHand().equals(EquipmentSlot.HAND) && mainHand.getType() != Material.AIR) {
                handItem = mainHand;
            }
            else if (event.getHand().equals(EquipmentSlot.OFF_HAND) && offHand.getType() != Material.AIR) {
                handItem = offHand;
            }
            else if (event.getHand().equals(EquipmentSlot.OFF_HAND)) {
                return;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                int worldMaxHeight = world.getMaxHeight();
                if (y < (worldMaxHeight - 1)) {
                    Block y1 = world.getBlockAt(x, y + 1, z);
                    player.sendBlockChange(y1.getLocation(), y1.getBlockData());
                }

                int worldMinHeight = BukkitAdapter.ADAPTER.getMinHeight(world);
                if (y > worldMinHeight) {
                    Block y2 = world.getBlockAt(x, y - 1, z);
                    player.sendBlockChange(y2.getLocation(), y2.getBlockData());
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/listener/player/PlayerInteractListener.java`
#### Snippet
```java
                            Location location = player.getLocation();
                            long time = System.currentTimeMillis();
                            int wid = Util.getWorldId(location.getWorld().getName());
                            int x = location.getBlockX();
                            int y = location.getBlockY();
                            int z = location.getBlockZ();
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/utility/entity/EntityUtil.java`
#### Snippet
```java
                                @SuppressWarnings("unchecked")
                                ItemStack result = ItemStack.deserialize((Map<String, Object>) itemMap.get(0));
                                @SuppressWarnings("unchecked")
                                List<List<Map<String, Object>>> metadata = (List<List<Map<String, Object>>>) itemMap.get(1);
```

### DuplicatedCode
Duplicated code
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
            BlockFace hangingFace = null;
            if (hangingData != null && !hangingData.contains(":") && hangingData.contains("=")) {
                try {
                    hangingFace = BlockFace.valueOf(hangingData.split("=")[1].toUpperCase(Locale.ROOT));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=ProtectedMemberInFinalClass]
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
public final class InventoryChangeListener extends Queue implements Listener {

    protected static AtomicLong tasksStarted = new AtomicLong();
    protected static AtomicLong tasksCompleted = new AtomicLong();

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
in `src/main/java/net/coreprotect/listener/block/BlockSpreadListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR)
    protected void onBlockSpread(BlockSpreadEvent event) {
        // mushrooms, fire

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
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java
    }

    protected static void logEntityDeath(LivingEntity entity, String e) {
        if (!Config.getConfig(entity.getWorld()).ENTITY_KILLS) {
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
in `src/main/java/net/coreprotect/listener/player/ProjectileLaunchListener.java`
#### Snippet
```java

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    protected void onProjectileLaunch(ProjectileLaunchEvent event) {
        Location location = event.getEntity().getLocation();
        String key = location.getWorld().getName() + "-" + location.getBlockX() + "-" + location.getBlockY() + "-" + location.getBlockZ();
```

## RuleId[id=UnnecessaryToStringCall]
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
in `src/main/java/net/coreprotect/listener/player/PlayerInteractEntityListener.java`
#### Snippet
```java
        int z = location.getBlockZ();

        String transactingChestId = location.getWorld().getUID().toString() + "." + x + "." + y + "." + z;
        String loggingChestId = user.toLowerCase(Locale.ROOT) + "." + x + "." + y + "." + z;
        int chestId = Queue.getChestId(loggingChestId);
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    if (target instanceof Material) {
                        if (!excludeList.containsKey(target)) {
                            if (BlockGroup.CONTAINERS.contains(target)) {
                                ROLLBACK_ITEMS = true;
                                itemRestrictList.clear();
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ParseResult` may be 'static'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
public class CoreProtectAPI extends Queue {

    public class ParseResult {
        String[] parse;

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                        if (exists) {
                                            boolean restrictWorld = false;
                                            if (radius != null) {
                                                restrictWorld = true;
                                            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/command/RollbackRestoreCommand.java`
#### Snippet
```java
                                            }
                                            boolean verbose = false;
                                            if (noisy == 1) {
                                                verbose = true;
                                            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            boolean pageLookup = false;

            if (ConfigHandler.lookupType.get(sender.getName()) != null && ConfigHandler.lookupPage.get(sender.getName()) != null) {
                pageLookup = true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/listener/block/BlockSpreadListener.java`
#### Snippet
```java
        Object[] cacheData = CacheHandler.spreadCache.get(location);
        CacheHandler.spreadCache.put(location, new Object[] { timestamp, type });
        if (cacheData != null && ((Material) cacheData[1]) == type) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/listener/block/BlockBreakListener.java`
#### Snippet
```java
            return scan;
        }
        else if (!BukkitAdapter.ADAPTER.isAttached(block, scanBlock, blockData, scanMin)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/listener/block/BlockExplodeListener.java`
#### Snippet
```java

        boolean log = false;
        if (Config.getConfig(world).EXPLOSIONS) {
            log = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_19.java`
#### Snippet
```java
            info.add(goat.hasRightHorn());
        }
        else if (super.getEntityMeta(entity, info)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_19.java`
#### Snippet
```java
            }
        }
        else if (super.setEntityMeta(entity, value, count)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            info.add(goat.isScreaming());
        }
        else if (super.getEntityMeta(entity, info)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            BlockFace blockFace = pointedDripstone.getVerticalDirection();
            boolean adjacent = scanBlock.getRelative(blockFace.getOppositeFace()).getLocation().equals(block.getLocation());
            if (!adjacent) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            }
        }
        else if (!super.isAttached(block, scanBlock, blockData, scanMin)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            }
        }
        else if (super.getItemMeta(itemMeta, list, metadata, slot)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            }
        }
        else if (super.setEntityMeta(entity, value, count)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
            itemstack.setItemMeta(meta);
        }
        else if (super.setItemMeta(rowType, itemstack, map)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
                boolean restrictWorld = false;

                if (radius > 0) {
                    restrictWorld = true;
                }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/listener/entity/EntityExplodeListener.java`
#### Snippet
```java

        boolean log = false;
        if (Config.getConfig(world).EXPLOSIONS) {
            log = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/consumer/process/BlockPlaceProcess.java`
#### Snippet
```java
                SkullPlaceLogger.log(preparedStmt, preparedStmtSkulls, batchCount, user, block, Util.getBlockId(replaceType), replaceData);
            }
            else if (forceData == 1) {
                BlockPlaceLogger.log(preparedStmt, batchCount, user, block, Util.getBlockId(replaceType), replaceData, blockType, blockData, true, meta, newBlockData, replacedBlockData);
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/listener/entity/EntityDeathListener.java`
#### Snippet
```java

        boolean skip = true;
        if (!Config.getConfig(entity.getWorld()).SKIP_GENERIC_DATA || (!(entity instanceof Zombie) && !(entity instanceof Skeleton))) {
            skip = false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
            }
        }
        else if (super.setEntityMeta(entity, value, count)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
            info.add(zoglin.isBaby());
        }
        else if (super.getEntityMeta(entity, info)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/utility/Util.java`
#### Snippet
```java
            return true;
        }
        else if (oldVersion.length >= 3 && currentVersion.length >= 3 && oldVersion[0].equals(currentVersion[0]) && oldVersion[1].equals(currentVersion[1]) && oldVersion[2] < currentVersion[2]) {
            // Revision version (#.#.# vs #.#.#)
            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
                                        int unixtimestamp = (int) (System.currentTimeMillis() / 1000L);
                                        boolean restrict_world = false;
                                        if (radius != null) {
                                            restrict_world = true;
                                        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/command/LookupCommand.java`
#### Snippet
```java
        }
        boolean allPermission = false;
        if (args[0].equals("near") && player.hasPermission("coreprotect.lookup.near")) {
            allPermission = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                        try {
                            boolean clearInventories = false;
                            if (Config.getGlobal().ROLLBACK_ITEMS) {
                                clearInventories = true;
                            }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
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

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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
Condition 'command.length() \> 0' covered by subsequent condition 'command.startsWith(...)'
in `src/main/java/net/coreprotect/CoreProtectAPI.java`
#### Snippet
```java
        if (Config.getGlobal().API_ENABLED && player != null && Config.getConfig(player.getWorld()).PLAYER_COMMANDS) {
            if (command != null) {
                if (command.length() > 0 && command.startsWith("/")) {
                    long timestamp = System.currentTimeMillis() / 1000L;

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

## RuleId[id=RegExpSingleCharAlternation]
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

## RuleId[id=ComparatorMethodParameterNotUsed]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `entity` to `Player` is redundant
in `src/main/java/net/coreprotect/listener/player/PlayerDeathListener.java`
#### Snippet
```java
        }

        String user = ((Player) entity).getName();
        List<ItemStack> items = event.getDrops();
        if (items == null || items.size() == 0) {
```

### RedundantCast
Casting `cacheData[1]` to `Material` is redundant
in `src/main/java/net/coreprotect/listener/block/BlockFromToListener.java`
#### Snippet
```java
                    Object[] cacheData = CacheHandler.spreadCache.get(location);
                    CacheHandler.spreadCache.put(location, new Object[] { timestamp, type });
                    if (toBlockState == null && cacheData != null && ((Material) cacheData[1]) == type) {
                        return;
                    }
```

### RedundantCast
Casting `cacheData[1]` to `Material` is redundant
in `src/main/java/net/coreprotect/listener/block/BlockSpreadListener.java`
#### Snippet
```java
        Object[] cacheData = CacheHandler.spreadCache.get(location);
        CacheHandler.spreadCache.put(location, new Object[] { timestamp, type });
        if (cacheData != null && ((Material) cacheData[1]) == type) {
            return true;
        }
```

### RedundantCast
Casting `e` to `Hanging` is redundant
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                    Location el = e.getLocation();
                    if (el.getBlockX() == block.getX() && el.getBlockY() == block.getY() && el.getBlockZ() == block.getZ()) {
                        if (hangingFace == null || ((Hanging) e).getFacing() == hangingFace) {
                            e.remove();
                        }
```

### RedundantCast
Casting `e` to `Hanging` is redundant
in `src/main/java/net/coreprotect/utility/entity/HangingUtil.java`
#### Snippet
```java
                    Location el = e.getLocation();
                    if (el.getBlockX() == x && el.getBlockY() == y && el.getBlockZ() == z) {
                        if (hangingFace == null || ((Hanging) e).getFacing() == hangingFace) {
                            e.remove();
                            break;
```

### RedundantCast
Casting `entity` to `ItemFrame` is redundant
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                                                            container = entity;
                                                            containerType = Material.ITEM_FRAME;
                                                            if (faceData.length() > 0 && (BlockFace.valueOf(faceData) == ((ItemFrame) entity).getFacing())) {
                                                                break;
                                                            }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `alert` may be 'final'
in `src/main/java/net/coreprotect/command/StatusCommand.java`
#### Snippet
```java

public class StatusCommand {
    private static ConcurrentHashMap<String, Boolean> alert = new ConcurrentHashMap<>();

    protected static void runCommand(CommandSender player, boolean permission, String[] args) {
```

### FieldMayBeFinal
Field `event` may be 'final'
in `src/main/java/net/coreprotect/worldedit/CoreProtectEditSessionEvent.java`
#### Snippet
```java
    private static boolean initialized = false;
    private static boolean isFAWE = false;
    private static CoreProtectEditSessionEvent event = new CoreProtectEditSessionEvent();

    public static boolean isInitialized() {
```

### FieldMayBeFinal
Field `userPhrases` may be 'final'
in `src/main/java/net/coreprotect/language/Language.java`
#### Snippet
```java

    private static ConcurrentHashMap<Phrase, String> phrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> userPhrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> translatedPhrases = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `phrases` may be 'final'
in `src/main/java/net/coreprotect/language/Language.java`
#### Snippet
```java
public class Language {

    private static ConcurrentHashMap<Phrase, String> phrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> userPhrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> translatedPhrases = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `translatedPhrases` may be 'final'
in `src/main/java/net/coreprotect/language/Language.java`
#### Snippet
```java
    private static ConcurrentHashMap<Phrase, String> phrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> userPhrases = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Phrase, String> translatedPhrases = new ConcurrentHashMap<>();

    protected static String getPhrase(Phrase phrase) {
```

### FieldMayBeFinal
Field `api` may be 'final'
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
    }

    private CoreProtectAPI api = new CoreProtectAPI();

    /**
```

### FieldMayBeFinal
Field `PARAMS` may be 'final'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
    // private static String[] COMMANDS = new String[] { "help", "inspect", "rollback", "restore", "lookup", "purge", "reload", "status", "near", "undo" }; // max 10!
    private static String[] HELP = new String[] { "inspect", "rollback", "restore", "lookup", "purge", "teleport", "status", "params", "users", "time", "radius", "action", "include", "exclude" };
    private static String[] PARAMS = new String[] { "user:", "time:", "radius:", "action:", "include:", "exclude:", "#container" };
    private static String[] ACTIONS = new String[] { "block", "+block", "-block", "click", "kill", "+container", "-container", "container", "chat", "command", "+inventory", "-inventory", "inventory", "item", "+item", "-item", "sign", "session", "+session", "-session", "username" };
    private static String[] NUMBERS = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
```

### FieldMayBeFinal
Field `ACTIONS` may be 'final'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
    private static String[] HELP = new String[] { "inspect", "rollback", "restore", "lookup", "purge", "teleport", "status", "params", "users", "time", "radius", "action", "include", "exclude" };
    private static String[] PARAMS = new String[] { "user:", "time:", "radius:", "action:", "include:", "exclude:", "#container" };
    private static String[] ACTIONS = new String[] { "block", "+block", "-block", "click", "kill", "+container", "-container", "container", "chat", "command", "+inventory", "-inventory", "inventory", "item", "+item", "-item", "sign", "session", "+session", "-session", "username" };
    private static String[] NUMBERS = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private static String[] TIMES = new String[] { "w", "d", "h", "m", "s" };
```

### FieldMayBeFinal
Field `HELP` may be 'final'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

    // private static String[] COMMANDS = new String[] { "help", "inspect", "rollback", "restore", "lookup", "purge", "reload", "status", "near", "undo" }; // max 10!
    private static String[] HELP = new String[] { "inspect", "rollback", "restore", "lookup", "purge", "teleport", "status", "params", "users", "time", "radius", "action", "include", "exclude" };
    private static String[] PARAMS = new String[] { "user:", "time:", "radius:", "action:", "include:", "exclude:", "#container" };
    private static String[] ACTIONS = new String[] { "block", "+block", "-block", "click", "kill", "+container", "-container", "container", "chat", "command", "+inventory", "-inventory", "inventory", "item", "+item", "-item", "sign", "session", "+session", "-session", "username" };
```

### FieldMayBeFinal
Field `TIMES` may be 'final'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
    private static String[] ACTIONS = new String[] { "block", "+block", "-block", "click", "kill", "+container", "-container", "container", "chat", "command", "+inventory", "-inventory", "inventory", "item", "+item", "-item", "sign", "session", "+session", "-session", "username" };
    private static String[] NUMBERS = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private static String[] TIMES = new String[] { "w", "d", "h", "m", "s" };
    private static ArrayList<String> materials = null;

```

### FieldMayBeFinal
Field `NUMBERS` may be 'final'
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
    private static String[] PARAMS = new String[] { "user:", "time:", "radius:", "action:", "include:", "exclude:", "#container" };
    private static String[] ACTIONS = new String[] { "block", "+block", "-block", "click", "kill", "+container", "-container", "container", "chat", "command", "+inventory", "-inventory", "inventory", "item", "+item", "-item", "sign", "session", "+session", "-session", "username" };
    private static String[] NUMBERS = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private static String[] TIMES = new String[] { "w", "d", "h", "m", "s" };
    private static ArrayList<String> materials = null;
```

### FieldMayBeFinal
Field `versionAlert` may be 'final'
in `src/main/java/net/coreprotect/command/CommandHandler.java`
#### Snippet
```java
public class CommandHandler implements CommandExecutor {
    private static CommandHandler instance;
    private static ConcurrentHashMap<String, Boolean> versionAlert = new ConcurrentHashMap<>();
    protected static Set<Material> naturalBlocks = BlockGroup.NATURAL_BLOCKS;

```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `ListenerHandler`
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
            try {
                Consumer.initialize(); // Prepare consumer (keep this here)
                new ListenerHandler(this);
                getCommand("coreprotect").setExecutor(CommandHandler.getInstance());
                getCommand("coreprotect").setTabCompleter(new TabHandler());
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=BusyWait]
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
in `src/main/java/net/coreprotect/CoreProtect.java`
#### Snippet
```java
                }

                Thread.sleep(100);
            }

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
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                        // Not actually changing blocks, so less intensive.
                        sleepTime = sleepTime + 1;
                        Thread.sleep(1);
                    }
                    else {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/net/coreprotect/database/Rollback.java`
#### Snippet
```java
                    else {
                        sleepTime = sleepTime + 5;
                        Thread.sleep(5);
                    }

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    /* blocks that support vertical scanning */
    public static Set<Material> VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL = new HashSet<>(Arrays.asList());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP));
    public static Set<Material> TRACK_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, M
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
    public static Set<Material> DIRECTIONAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STICKY_PISTON, Material.PISTON, Material.REPEATER, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.COMPARATOR));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java

    /* blocks that support vertical scanning */
    public static Set<Material> VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL = new HashSet<>(Arrays.asList());

    // These are blocks that an item frame or painting can't be attached to.
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
    public static Set<Material> LANTERNS = new HashSet<>(Arrays.asList(Material.LANTERN));
    public static Set<Material> SOUL_BLOCKS = new HashSet<>(Arrays.asList(Material.SOUL_SAND));
    public static Set<Material> DIRECTIONAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STICKY_PISTON, Material.PISTON, Material.REPEATER, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.COMPARATOR));
    public static Set<Material> INTERACT_BLOCKS = new HashSet<>(Arrays.asList(Material.SPRUCE_FENCE_GATE, Material.BIRCH_FENCE_GATE, Material.JUNGLE_FENCE_GATE, Material.DARK_OAK_FENCE_GATE, Material.ACACIA_FENCE_GATE, Material.DISPENSER, Material.NOTE_BLOCK, Material.CHEST, Material.FURNACE, Material.LEVER, Material.REPEATER, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR, Material.OAK_TRAPDOOR, Material.OAK_FENCE_GATE, Material.BREWING_STAND, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.COMPARATOR, Material.HOPPER, Material.DROPPER, Material.SHULKER_BOX, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PUR
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java

    public static Set<Material> TRACK_ANY = new HashSet<>(Arrays.asList(Material.PISTON_HEAD, Material.LEVER, Material.BELL));
    public static Set<Material> TRACK_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> TRACK_TOP = new HashSet<>(Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.SCAFFOLDING, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.WHEAT, Material.ACACIA_SIGN, Material.BIRCH_SIGN, Material.DARK_OAK_SIGN, Material.JUNGLE_SIGN, Material.OAK_SIGN, Material.SPRUCE_SIGN, Material.WHITE_BANNER, Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER, Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, M
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> BUTTONS = new HashSet<>(Arrays.asList(Material.STONE_BUTTON, Material.OAK_BUTTON, Material.ACACIA_BUTTON, Material.BIRCH_BUTTON, Material.DARK_OAK_BUTTON, Material.JUNGLE_BUTTON, Material.SPRUCE_BUTTON));
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
    public static Set<Material> FIRE = new HashSet<>(Arrays.asList(Material.FIRE));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> UPDATE_STATE = new HashSet<>(Arrays.asList(Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.FURNACE, Material.BLAST_FURNACE, Material.SMOKER, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.GLOWSTONE, Material.JACK_O_LANTERN, Material.REPEATER, Material.REDSTONE_LAMP, Material.BEACON, Material.COMPARATOR, Material.DAYLIGHT_DETECTOR, Material.REDSTONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL));
    public static Set<Material> NATURAL_BLOCKS = new HashSet<>(Arrays.asList(Material.STONE, Material.GOLD_ORE, Material.IRON_ORE, Material.COAL_ORE, Material.LAPIS_ORE, Material.SANDSTONE, Material.COBWEB, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.OBSIDIAN, Material.DIAMOND_ORE, Material.WHEAT, Material.REDSTONE_ORE, Material.SNOW, Material.ICE, Material.CACTUS, Material.CLAY, Material.SUGAR_CANE, Material.PUMPKIN, Material.NETHERRACK, Material.SOUL_SAND, Material.MELON, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.MYCELIUM, Material.LILY_PAD, Material.NETHER_WART, Material.END_STONE, Material.EMERALD_ORE, Material.CARROT, Material.POTATO, Material.KELP, Material.CHORUS_FLOWER, Material.CHORUS_PLANT, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH));
    public static Set<Material> SCULK = new HashSet<>(Arrays.asList());

    /* blocks that support vertical scanning */
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_TOP = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL_BOTTOM = new HashSet<>(Arrays.asList());
    public static Set<Material> VERTICAL = new HashSet<>(Arrays.asList());

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/model/BlockGroup.java`
#### Snippet
```java
    public static Set<Material> PRESSURE_PLATES = new HashSet<>(Arrays.asList(Material.STONE_PRESSURE_PLATE, Material.ACACIA_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.OAK_PRESSURE_PLATE, Material.SPRUCE_PRESSURE_PLATE));
    public static Set<Material> VINES = new HashSet<>(Arrays.asList(Material.VINE));
    public static Set<Material> AMETHYST = new HashSet<>(Arrays.asList());
    public static Set<Material> LIGHTABLES = new HashSet<>(Arrays.asList(Material.CAMPFIRE));
    public static Set<Material> CANDLES = new HashSet<>(Arrays.asList());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
        final int argWid = CommandHandler.parseWorld(args, false, false);
        final List<Integer> argAction = CommandHandler.parseAction(args);
        final List<Integer> supportedActions = Arrays.asList();
        long startTime = argTime[1] > 0 ? argTime[0] : 0;
        long endTime = argTime[1] > 0 ? argTime[1] : argTime[0];
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/PurgeCommand.java`
#### Snippet
```java
                    List<String> purgeTables = Arrays.asList("sign", "container", "item", "skull", "session", "chat", "command", "entity", "block");
                    List<String> worldTables = Arrays.asList("sign", "container", "item", "session", "chat", "command", "block");
                    List<String> excludeTables = Arrays.asList("database_lock"); // don't insert data into these tables
                    for (String table : ConfigHandler.databaseTables) {
                        String tableName = table.replaceAll("_", " ");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java

                if (materials == null) {
                    List<Material> addList = Arrays.asList(Material.ARMOR_STAND);
                    List<Material> excludeList = Arrays.asList(Material.GRASS);
                    Set<String> materialList = new HashSet<>();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                if (materials == null) {
                    List<Material> addList = Arrays.asList(Material.ARMOR_STAND);
                    List<Material> excludeList = Arrays.asList(Material.GRASS);
                    Set<String> materialList = new HashSet<>();

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
            else if (args.length == 3 && argument0.equals("purge") && sender.hasPermission("coreprotect.purge")) {
                if (argument1.startsWith("t:")) {
                    List<String> completions = new ArrayList<>(Arrays.asList("r:"));
                    return StringUtil.copyPartialMatches(args[2].toLowerCase(Locale.ROOT), completions, new ArrayList<>(completions.size()));
                }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                }
                else if (argument1.startsWith("r:")) {
                    List<String> completions = new ArrayList<>(Arrays.asList("t:"));
                    return StringUtil.copyPartialMatches(args[2].toLowerCase(Locale.ROOT), completions, new ArrayList<>(completions.size()));
                }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
                    return StringUtil.copyPartialMatches(args[2].toLowerCase(Locale.ROOT), completions, new ArrayList<>(completions.size()));
                }
                return Arrays.asList("");
            }
            else if ((sender.hasPermission("coreprotect.lookup") && (argument0.equals("l") || argument0.equals("lookup"))) || (sender.hasPermission("coreprotect.rollback") && (argument0.equals("rollback") || argument0.equals("rb") || argument0.equals("ro"))) || (sender.hasPermission("coreprotect.restore") && (argument0.equals("restore") || argument0.equals("rs") || argument0.equals("re")))) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/command/TabHandler.java`
#### Snippet
```java
        }

        return Arrays.asList("");
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_17.java`
#### Snippet
```java
STONE_BLOCK, Material.HOPPER, Material.CHEST, Material.TRAPPED_CHEST, Material.ACTIVATOR_RAIL, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.SHROOMLIGHT, Material.RESPAWN_ANCHOR, Material.CRYING_OBSIDIAN, Material.TARGET, Material.SMALL_AMETHYST_BUD, Material.MEDIUM_AMETHYST_BUD, Material.LARGE_AMETHYST_BUD, Material.AMETHYST_CLUSTER, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.GLOW_LICHEN, Material.LIGHT, Material.LAVA_CAULDRON));
        BlockGroup.NON_ATTACHABLE = new HashSet<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.BARRIER, Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY, Material.WITHER_ROSE, Material.SWEET_BERRY_BUSH, Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER, Material.LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.GRASS, Material.FERN, Material.DEAD_BUSH, Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.WALL_TORCH, Material.REDSTONE_WIRE, Material.LADDER, Material.RAIL, Material.LEVER, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SNOW, Material.SUGAR_CANE, Material.NETHER_PORTAL, Material.REPEATER, Material.KELP, Material.CHORUS_FLOWER, Material.CHORUS_PLANT, Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.LIGHT, Material.SMALL_DRIPLEAF, Material.BIG_DRIPLEAF, Material.BIG_DRIPLEAF_STEM, Material.GLOW_LICHEN, Material.HANGING_ROOTS));
        BlockGroup.VERTICAL_TOP_BOTTOM = new HashSet<>(Arrays.asList(Material.BIG_DRIPLEAF_STEM));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/utility/Teleport.java`
#### Snippet
```java
    public static void performSafeTeleport(Player player, Location location, boolean enforceTeleport) {
        try {
            Set<Material> unsafeBlocks = new HashSet<>(Arrays.asList(Material.LAVA));
            unsafeBlocks.addAll(BlockGroup.FIRE);

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/net/coreprotect/bukkit/Bukkit_v1_16.java`
#### Snippet
```java
GRAY_BANNER, Material.LIGHT_GRAY_BANNER, Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER, Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.RAIL, Material.IRON_DOOR, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE, Material.REPEATER, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.CARROT, Material.POTATO, Material.COMPARATOR, Material.ACTIVATOR_RAIL, Material.SUNFLOWER, Material.LILAC, Material.TALL_GRASS, Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY, Material.NETHER_WART, Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Material.KELP, Material.SOUL_TORCH, Material.TWISTING_VINES, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_SPROUTS, Material.CRIMSON_SIGN, Material.WARPED_SIGN));
        BlockGroup.TRACK_BOTTOM = new HashSet<>(Arrays.asList(Material.WEEPING_VINES));
        BlockGroup.TRACK_SIDE = new HashSet<>(Arrays.asList(Material.WALL_TORCH, Material.REDSTONE_WALL_TORCH, Material.RAIL, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WHITE_BED, Material.ORANGE_BED, Material.MAGENTA_BED, Material.LIGHT_BLUE_BED, Material.YELLOW_BED, Material.LIME_BED, Material.PINK_BED, Material.GRAY_BED, Material.LIGHT_GRAY_BED, Material.CYAN_BED, Material.PURPLE_BED, Material.BLUE_BED, Material.BROWN_BED, Material.GREEN_BED, Material.RED_BED, Material.BLACK_BED, Material.LADDER, Material.ACACIA_WALL_SIGN, Material.BIRCH_WALL_SIGN, Material.DARK_OAK_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.OAK_WALL_SIGN, Material.SPRUCE_WALL_SIGN, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER, Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_
```

## RuleId[id=PointlessBooleanExpression]
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
`enderChest != true` can be simplified to '!enderChest'
in `src/main/java/net/coreprotect/listener/player/InventoryChangeListener.java`
#### Snippet
```java
        Scheduler.runTaskAsynchronously(CoreProtect.getInstance(), () -> {
            try {
                Material containerType = (enderChest != true ? null : Material.ENDER_CHEST);
                InventoryChangeListener.checkTasks(taskStarted);
                onInventoryInteract(player.getName(), inventory, containerState, containerType, inventoryLocation, true);
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

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
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

