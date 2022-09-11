# LandlordPlugin/LandLord# Bad smells
I found 207 bad smells with 41 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 33 | false |
| TrivialStringConcatenation | 29 | false |
| ThrowablePrintStackTrace | 19 | false |
| MethodMayBeStatic | 17 | true |
| SizeReplaceableByIsEmpty | 14 | true |
| EnhancedSwitchMigration | 13 | false |
| ConstantConditions | 11 | false |
| NonProtectedConstructorInAbstractClass | 10 | true |
| IgnoreResultOfCall | 6 | false |
| EmptyMethod | 5 | false |
| RedundantFieldInitialization | 5 | false |
| SuspiciousNameCombination | 4 | false |
| CommentedOutCode | 4 | false |
| AssignmentToMethodParameter | 4 | false |
| StaticCallOnSubclass | 3 | false |
| MissortedModifiers | 3 | false |
| RedundantMethodOverride | 3 | false |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| ClassCanBeRecord | 2 | false |
| UnusedAssignment | 2 | false |
| PatternVariableCanBeUsed | 1 | false |
| InnerClassMayBeStatic | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| UNUSED_IMPORT | 1 | false |
| NestedAssignment | 1 | false |
| ReplaceNullCheck | 1 | false |
| RedundantImplements | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
## Blame
Bad smells by person and commit(**DO NOT SEE THIS AS ANY ATTACK**):
| Person | Bad Smells | 
| --- | --- | 
| Alexander Daichendt | 41 | 
| Lilly Tempest | 2 | 
| SpatiumPrinceps | 1 | 
| Spatium Princeps | 1 | 
| Alexander Daichendt | 2 | 
| Aur?lien | 6 | 
| Spatium Princeps | 3 | 
| SpatiumPrinceps | 1 | 
| SpatiumPrinceps | 1 | 
| Alexander Daichendt | 7 | 
| Aur?lien | 14 | 
| Alexander Daichendt | 1 | 
| Aur?lien | 16 | 
| SpatiumPrinceps | 2 | 
| Aur?lien | 1 | 
| Aurelien30000 | 1 | 
| Alexander Daichendt | 4 | 
| SpatiumPrinceps | 1 | 
| Alexander Daichendt | 7 | 
| Aur?lien | 5 | 
| Alexander Daichendt | 2 | 
| Alexander Daichendt | 1 | 
| Alexander Daichendt | 2 | 
| Alexander Daichendt | 1 | 
| Aurelien30000 | 6 | 
| Alexander Daichendt | 2 | 
| Hannes Greule | 5 | 
| Alexander Daichendt | 1 | 
| SpatiumPrinceps | 2 | 
| SpatiumPrinceps | 1 | 
| SpatiumPrinceps | 1 | 
| Aurelien30000 | 1 | 
| Alexander Daichendt | 3 | 
| SpatiumPrinceps | 3 | 
| SirYwell | 1 | 
| Alexander Daichendt | 1 | 
| Alexander Daichendt | 10 | 
| Alexander Daichendt | 1 | 
| SpatiumPrinceps | 1 | 
| Florian F?lling | 1 | 
| Alexander Daichendt | 1 | 
| Alexander Daichendt | 3 | 
| Spatium Princeps | 1 | 
| BuildTools | 1 | 
| Aurelien30000 | 2 | 
| Alexander Daichendt | 4 | 
| Alexander Daichendt | 2 | 
| Alexander Daichendt | 4 | 
| Alexander Daichendt | 2 | 
| Alexander Daichendt | 2 | 
| Aurelien30000 | 2 | 
| Alexander Daichendt | 2 | 
| Hannes Greule | 1 | 
| Alexander Daichendt | 7 | 
| Alexander Daichendt | 6 | 
| Aur?lien | 2 | 
| Spatium Princeps | 1 | 
| Aur?lien | 1 | 

## EnumSwitchStatementWhichMissesCases
### EnumSwitchStatementWhichMissesCases
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

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### EnumSwitchStatementWhichMissesCases
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

#### Blame
AbbreviatedObjectId[5a0ab82] Aurelien30000
## SuspiciousNameCombination
### SuspiciousNameCombination
'minHeight' should probably not be passed as parameter 'left'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
        // This will claim the whole chunk.
        if (boundaryMethod == ClaimHeightDefinition.FULL) {
            return Pair.of(minHeight, maxHeight);
        }

```

#### Blame
AbbreviatedObjectId[36f2379] Aur?lien
### SuspiciousNameCombination
'maxHeight' should probably not be passed as parameter 'right'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
        // This will claim the whole chunk.
        if (boundaryMethod == ClaimHeightDefinition.FULL) {
            return Pair.of(minHeight, maxHeight);
        }

```

#### Blame
AbbreviatedObjectId[36f2379] Aur?lien
### SuspiciousNameCombination
'bottomY' should probably not be passed as parameter 'left'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
            topY = Math.min(topY, maxHeight);
        }
        return Pair.of(bottomY, topY);
    }

```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### SuspiciousNameCombination
'topY' should probably not be passed as parameter 'right'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
            topY = Math.min(topY, maxHeight);
        }
        return Pair.of(bottomY, topY);
    }

```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
## StaticCallOnSubclass
### StaticCallOnSubclass
Static method `toBlockPoint()` declared in class 'com.sk89q.worldedit.Vector' but referenced via subclass 'com.sk89q.worldedit.BlockVector'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        Vector v2 = new Location(world, x + 15, 255, z + 15).toVector();

        BlockVector b1 = BlockVector.toBlockPoint(v1.getX(), v1.getY(), v1.getZ());
        BlockVector b2 = BlockVector.toBlockPoint(v2.getX(), v2.getY(), v2.getZ());

```

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
### StaticCallOnSubclass
Static method `toBlockPoint()` declared in class 'com.sk89q.worldedit.Vector' but referenced via subclass 'com.sk89q.worldedit.BlockVector'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java

        BlockVector b1 = BlockVector.toBlockPoint(v1.getX(), v1.getY(), v1.getZ());
        BlockVector b2 = BlockVector.toBlockPoint(v2.getX(), v2.getY(), v2.getZ());

        CuboidRegion region = new CuboidRegion(weWorld, b1, b2);
```

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
### StaticCallOnSubclass
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

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
## CommentedOutCode
### CommentedOutCode
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

#### Blame
AbbreviatedObjectId[d5cc607] Spatium Princeps
### CommentedOutCode
Commented out code (16 lines)
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
    }

    /*
    public void sendCountdown(final Player p, final int delay) {
        new BukkitRunnable() {
```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### CommentedOutCode
Commented out code (2 lines)
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java

        String command = e.getMessage();
        //  command = command.substring(1, command.length());
        //   System.out.println("found command: " + command);
        if (this.isDelayedCommand(command.toLowerCase())) {
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### CommentedOutCode
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

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
## PatternVariableCanBeUsed
### PatternVariableCanBeUsed
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/MultiManage.java`
#### Snippet
```java
        List<IOwnedLand> lands = new ArrayList<>(mode.getLandsOf(radius, player.getLocation(), player.getUniqueId(), wg));

        if (lands.size() == 0) {
            lm.sendMessage(player, plugin.getLangManager().getString("Commands.ListLands.noLands"));
            return;
```

#### Blame
AbbreviatedObjectId[5a0ab82] Aurelien30000
### SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/ManageAll.java`
#### Snippet
```java
        List<IOwnedLand> lands = Lists.newArrayList(plugin.getWGManager().getRegions(player.getUniqueId()));

        if (lands.size() == 0) {
            lm.sendMessage(player, plugin.getLangManager().getString("Commands.ListLands.noLands"));
            return;
```

#### Blame
AbbreviatedObjectId[f34da31] SpatiumPrinceps
### SizeReplaceableByIsEmpty
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

#### Blame
AbbreviatedObjectId[e29605e] Aurelien30000
### SizeReplaceableByIsEmpty
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### SizeReplaceableByIsEmpty
`toClaim.size() == 0` can be replaced with 'toClaim.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java

        Set<Chunk> toClaim = mode.getFreeLands(radius, player.getLocation(), wg);
        if (toClaim.size() == 0) {
            lm.sendMessage(player, lm.getString(player, "Commands.MultiClaim.noLands"));
            return;
```

#### Blame
AbbreviatedObjectId[0df21ad] Alexander Daichendt
### SizeReplaceableByIsEmpty
`region.getFlags().size() == 0` can be replaced with 'region.getFlags().isEmpty()'
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java

        // Insert default flags.
        if (region.getFlags().size() == 0) {
            initFlags(owner);
            initRegionPriority();
```

#### Blame
AbbreviatedObjectId[30f9d53] Alexander Daichendt
### SizeReplaceableByIsEmpty
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

#### Blame
AbbreviatedObjectId[cb3a514] Alexander Daichendt
### SizeReplaceableByIsEmpty
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### SizeReplaceableByIsEmpty
`region.getFlags().size() == 0` can be replaced with 'region.getFlags().isEmpty()'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java

        // Insert default flags.
        if (region.getFlags().size() == 0) {
            initFlags(owner);
            initRegionPriority();
```

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
### SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java

    private void setGreet(Player player, String[] args, List<IOwnedLand> lands, int casy) {
        if (lands.size() == 0 || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
            return;
```

#### Blame
AbbreviatedObjectId[da3a031] Aurelien30000
### SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java

    private void setFarewell(Player player, String[] args, List<IOwnedLand> lands, int casy) {
        if (lands.size() == 0 || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
            return;
```

#### Blame
AbbreviatedObjectId[335a83a] SpatiumPrinceps
### SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/MultiListLands.java`
#### Snippet
```java
                List<IOwnedLand> lands = new ArrayList<>(mode.getLandsOf(radius, sender.getLocation(), target.getUuid(), wg));

                if (lands.size() == 0) {
                    lm.sendMessage(sender, plugin.getLangManager().getString("Commands.MultiListLands.noLands"));
                    return;
```

#### Blame
AbbreviatedObjectId[5a0ab82] Aurelien30000
### SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/ListLands.java`
#### Snippet
```java
                List<IOwnedLand> lands = new ArrayList<>(plugin.getWGManager().getRegions(target.getUuid()));

                if (lands.size() == 0) {
                    lm.sendMessage(sender, plugin.getLangManager().getString("Commands.ListLands.noLands"));
                    return;
```

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### SizeReplaceableByIsEmpty
`permissions.size() == 0` can be replaced with 'permissions.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/lib/command/MainCommand.java`
#### Snippet
```java
     */
    public boolean hasPermission(CommandSender cs) {
        if (permissions.size() == 0) {
            return true;
        }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
## EnhancedSwitchMigration
### EnhancedSwitchMigration
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

#### Blame
AbbreviatedObjectId[37e0398] Hannes Greule
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
                ComponentBuilder builder = new ComponentBuilder(lm.getString(player, "Commands.Manage.SetGreet.clickMsg"));

                switch (manageMode) {
                    case ALL:
                        builder.event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, managecmd + " setgreetall "));
```

#### Blame
AbbreviatedObjectId[52fec7d] Alexander Daichendt
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
                ComponentBuilder builder = new ComponentBuilder(lm.getString(player, "Commands.Manage.SetFarewell.clickMsg"));

                switch (manageMode) {
                    case ALL:
                        builder.event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, managecmd + " setfarewellall "));
```

#### Blame
AbbreviatedObjectId[52fec7d] Alexander Daichendt
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-api/src/main/java/biz/princeps/landlord/api/IMaterialsManager.java`
#### Snippet
```java

    default Material getWorldGrass(World world) {
        switch (world.getEnvironment()) {
            case NORMAL:
                return getGrass();
```

#### Blame
AbbreviatedObjectId[bfc0f7d] Alexander Daichendt
### EnhancedSwitchMigration
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

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/lib/manager/ConfirmationManager.java`
#### Snippet
```java

    public void draw(Player p, String guiMessage, String chatMessage, Action onAccept, Action onDeny, String confirmCommand, int timout, AbstractGUI main) {
        switch (state) {

            case GUI:
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### EnhancedSwitchMigration
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

#### Blame
AbbreviatedObjectId[f7fe6a2] Spatium Princeps
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java
                        IOwnedLand target = wg.getRegion(args[0]);

                        switch (args[1]) {
                            case "setgreet":
                                setGreet(player, args, Collections.singletonList(target), 2);
```

#### Blame
AbbreviatedObjectId[d178844] Alexander Daichendt
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/Update.java`
#### Snippet
```java
            String option = arguments.get(0);

            switch (option) {
                case "-u":
                    onUpdateLands(properties.getCommandSender());
```

#### Blame
AbbreviatedObjectId[521f4ef] SpatiumPrinceps
### EnhancedSwitchMigration
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

#### Blame
AbbreviatedObjectId[5a0ab82] Aurelien30000
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java

    private void executeAction(ItemClickAction clickAction, Player p, Location loc) {
        switch (clickAction.getResult()) {
            case INFO:
                plugin.getServer().dispatchCommand(p, "ll info");
```

#### Blame
AbbreviatedObjectId[79681fe] SpatiumPrinceps
### EnhancedSwitchMigration
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

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/GiveClaims.java`
#### Snippet
```java
        }

        switch (args.size()) {
            case 3:
                // ll giveclaims name price amount
```

#### Blame
AbbreviatedObjectId[d0fe1a0] Aurelien30000
## AssignmentToForLoopParameter
### AssignmentToForLoopParameter
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

#### Blame
AbbreviatedObjectId[666f5f9] Lilly Tempest
### AssignmentToForLoopParameter
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

#### Blame
AbbreviatedObjectId[08dc086] Aurelien30000
## ConstantConditions
### ConstantConditions
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

#### Blame
AbbreviatedObjectId[36f2379] Aur?lien
### ConstantConditions
Value `sourceFile` is always 'null'
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
        File sourceFile = null;
        //sourceFile = new File(PrincepsLib.getPluginInstance().getClass().getResource(source));
        List<Entry> entryList = generateEntries(sourceFile);


```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ConstantConditions
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### ConstantConditions
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### ConstantConditions
Method invocation `setHealth` may produce `NullPointerException`
in `LandLord-latest/src/main/java/biz/princeps/landlord/regenerators/WGRegenerator.java`
#### Snippet
```java
            for (Entity entity : chunk.getEntities()) {
                if (entity.getType() == EntityType.PLAYER) {
                    plugin.getServer().getPlayer(entity.getName()).setHealth(20);
                }
            }
```

#### Blame
AbbreviatedObjectId[b7b3a31] SirYwell
### ConstantConditions
Method invocation `setHealth` may produce `NullPointerException`
in `LandLord-latest/src/main/java/biz/princeps/landlord/regenerators/WGRegenerator.java`
#### Snippet
```java
                if (entity.getType() == EntityType.PLAYER) {
                    Player p = plugin.getServer().getPlayer(entity.getName());
                    p.setHealth(20);
                    PaperLib.teleportAsync(p, world.getHighestBlockAt(p.getLocation().add(0, 3, 0)).getLocation());
                }
```

#### Blame
AbbreviatedObjectId[60cdbc6] Alexander Daichendt
### ConstantConditions
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

#### Blame
AbbreviatedObjectId[666f5f9] Lilly Tempest
### ConstantConditions
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

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### ConstantConditions
Argument `flag` might be null
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
    }

```

#### Blame
AbbreviatedObjectId[30f9d53] Alexander Daichendt
### ConstantConditions
Argument `flag` might be null
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
    }

```

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
### ConstantConditions
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

#### Blame
AbbreviatedObjectId[bfc0f7d] Alexander Daichendt
## TrivialStringConcatenation
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java

        configString = configString.replace("%world%", chunk.getWorld().getName());
        configString = configString.replace("%x%", x + "");
        configString = configString.replace("%z%", z + "");

```

#### Blame
AbbreviatedObjectId[30f9d53] Alexander Daichendt
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
        configString = configString.replace("%world%", chunk.getWorld().getName());
        configString = configString.replace("%x%", x + "");
        configString = configString.replace("%z%", z + "");

        return ChatColor.translateAlternateColorCodes('&', configString);
```

#### Blame
AbbreviatedObjectId[30f9d53] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e7622bf] SpatiumPrinceps
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e7622bf] SpatiumPrinceps
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/chat/MultiPagedMessage.java`
#### Snippet
```java
    private void updateTitle() {
        this.header = this.header.replace("%site%", "" + (pointer + 1))
                .replace("%maxsite%", (int) Math.ceil((double) elements.size() / (double) perSite) + "");
    }

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
                        } else {
                            if (countdown % 4 == 0)
                                getStuffManager().sendActionBar(p, ChatColor.translateAlternateColorCodes('&', getCountdown()).replace("%countdown%", "" + countdown / 4));

                            if (spawnParticles) {
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
                int delay = this.getDelay(command.toLowerCase());
                e.setCancelled(true);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.getDontMove()).replace("%time%", "" + delay));
                // Utils.displayHelix(p, delay);

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[3221332] Aur?lien
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[3221332] Aur?lien
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Shop.java`
#### Snippet
```java

            ShopGUI gui = new ShopGUI(plugin, player, plugin.getLangManager().getRawString("Shop.title")
                    .replace("%regions%", regionCount + "")
                    .replace("%claims%", claims + ""));
            gui.display();
```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java

            if (claimcount > 0) {
                lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                        .replace("%claims%", claimcount + ""));
            } else {
```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[4bdd3cd] BuildTools
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[5b428d3] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[5b428d3] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[0df21ad] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e3218f0] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e3218f0] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[5c15215] Spatium Princeps
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[5a0ab82] Aurelien30000
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### TrivialStringConcatenation
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

#### Blame
AbbreviatedObjectId[8f69432] Alexander Daichendt
## InnerClassMayBeStatic
### InnerClassMayBeStatic
Inner class `Confirm` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/Landlordbase.java`
#### Snippet
```java
    }

    public class Confirm extends SubCommand {

        public Confirm() {
```

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
## MissortedModifiers
### MissortedModifiers
Missorted modifiers `synchronized static`
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ConfirmationDialog.java`
#### Snippet
```java
        }

        public synchronized static void removePlayer(UUID uniqueId) {
            openDialogs.remove(uniqueId);
        }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### MissortedModifiers
Missorted modifiers `synchronized static`
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ConfirmationDialog.java`
#### Snippet
```java
        }

        public synchronized static boolean contains(UUID uuid) {
            return openDialogs.containsKey(uuid);
        }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### MissortedModifiers
Missorted modifiers `synchronized static`
in `LandLord-core/src/main/java/biz/princeps/lib/chat/ConfirmationDialog.java`
#### Snippet
```java
        }

        public synchronized static void addPlayer(UUID uniqueId, ConfirmationDialog confirmationDialog) {
            openDialogs.put(uniqueId, confirmationDialog);
        }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
## IgnoreResultOfCall
### IgnoreResultOfCall
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

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
### IgnoreResultOfCall
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

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
### IgnoreResultOfCall
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### IgnoreResultOfCall
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### IgnoreResultOfCall
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

#### Blame
AbbreviatedObjectId[30f9d53] Alexander Daichendt
### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LangManager.java`
#### Snippet
```java
            File folder = new File(plugin.getDataFolder(), "messages");
            if (!folder.exists())
                folder.mkdir();

            if (!f.exists())
```

#### Blame
AbbreviatedObjectId[502c405] Alexander Daichendt
## ClassNameSameAsAncestorName
### ClassNameSameAsAncestorName
Class name `Factory` is the same as one of its superclass' names
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
    }

    public static final class Factory extends Handler.Factory<LandSessionHandler> {

        private final ILandLord plugin;
```

#### Blame
AbbreviatedObjectId[37e0398] Hannes Greule
### ClassNameSameAsAncestorName
Class name `Factory` is the same as one of its superclass' names
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
    }

    public static final class Factory extends Handler.Factory<LandSessionHandler> {

        private final ILandLord plugin;
```

#### Blame
AbbreviatedObjectId[37e0398] Hannes Greule
## RedundantMethodOverride
### RedundantMethodOverride
Method `getTitle()` is identical to its super method
in `LandLord-core/src/main/java/biz/princeps/lib/gui/MainMenuGUI.java`
#### Snippet
```java


    public String getTitle() {
        return title;
    }
```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### RedundantMethodOverride
Method `onDisable()` only delegates to its super method
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

#### Blame
AbbreviatedObjectId[f9b347b] Alexander Daichendt
### RedundantMethodOverride
Method `onDisable()` only delegates to its super method
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

#### Blame
AbbreviatedObjectId[dfb6f2f] Alexander Daichendt
## UnnecessarySuperQualifier
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        int minHeight = weWorld.getMinY();

        return super.calcClaimHeightBoundaries(boundaryMethod, world, chunk, minHeight, maxHeight);
    }

```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        int minHeight = 0;

        return super.calcClaimHeightBoundaries(boundaryMethod, world, chunk, minHeight, maxHeight);
    }

```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
## UNUSED_IMPORT
### UNUSED_IMPORT
Unused import `import java.util.logging.Level;`
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
```

#### Blame
AbbreviatedObjectId[b199a92] SpatiumPrinceps
## NestedAssignment
### NestedAssignment
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

#### Blame
AbbreviatedObjectId[f64b085] Aur?lien
## ThrowablePrintStackTrace
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[36f2379] Aur?lien
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
            config.load(f);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
            config.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

```

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/regenerators/WGRegenerator.java`
#### Snippet
```java

                } catch (IOException | WorldEditException e) {
                    e.printStackTrace();
                }
            }
```

#### Blame
AbbreviatedObjectId[60cdbc6] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/WGRegenListener.java`
#### Snippet
```java
            Operations.complete(forwardExtentCopy);
        } catch (WorldEditException worldEditException) {
            worldEditException.printStackTrace();
        }

```

#### Blame
AbbreviatedObjectId[60cdbc6] Alexander Daichendt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/WGRegenListener.java`
#### Snippet
```java
            writer.write(clipboard);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

```

#### Blame
AbbreviatedObjectId[60cdbc6] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[44483ae] Alexander Daichendt
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `LandLord-core/src/main/java/biz/princeps/landlord/util/Skulls.java`
#### Snippet
```java

        } catch (IllegalArgumentException | NoSuchFieldException | SecurityException | IllegalAccessException error) {
            error.printStackTrace();
        }
        head.setItemMeta(headMeta);
```

#### Blame
AbbreviatedObjectId[f7fe6a2] Spatium Princeps
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[da3a031] Aurelien30000
### ThrowablePrintStackTrace
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

#### Blame
AbbreviatedObjectId[3221332] Aur?lien
## ReplaceNullCheck
### ReplaceNullCheck
Replace condition with Objects.requireNonNullElseGet
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java
        for (Player onlinePlayer : getServer().getOnlinePlayers()) {
            getPlayerManager().getOffline(onlinePlayer.getUniqueId(), (offline) -> {
                if (offline == null) {
                    this.getPlayerManager().add(new LPlayer(onlinePlayer.getUniqueId()));
                } else {
```

#### Blame
AbbreviatedObjectId[3221332] Aur?lien
## NonProtectedConstructorInAbstractClass
### NonProtectedConstructorInAbstractClass
Constructor `AOwnedLand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AOwnedLand.java`
#### Snippet
```java
    protected final int chunkZ;

    public AOwnedLand(ILandLord plugin, World world, String name) {
        this.plugin = plugin;
        this.world = world;
```

#### Blame
AbbreviatedObjectId[30f9d53] Alexander Daichendt
### NonProtectedConstructorInAbstractClass
Constructor `AWorldGuardManager()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java
    protected final ILandLord plugin;

    public AWorldGuardManager(ILandLord plugin) {
        this.plugin = plugin;
    }
```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### NonProtectedConstructorInAbstractClass
Constructor `ACostManager()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/cost/ACostManager.java`
#### Snippet
```java
    protected final int free;

    public ACostManager(ILandLord plugin, int free, String namespace) {
        this.plugin = plugin;
        this.free = free;
```

#### Blame
AbbreviatedObjectId[d0cde0b] Spatium Princeps
### NonProtectedConstructorInAbstractClass
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### NonProtectedConstructorInAbstractClass
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### NonProtectedConstructorInAbstractClass
Constructor `AMultiTask()` of an abstract class should not be declared 'public'
in `LandLord-api/src/main/java/biz/princeps/landlord/api/AMultiTask.java`
#### Snippet
```java
    protected final Deque<T> queue;

    public AMultiTask(ILandLord plugin, Collection<T> operations) {
        this.plugin = plugin;
        this.queue = new ArrayDeque<>(operations);
```

#### Blame
AbbreviatedObjectId[3221332] Aur?lien
### NonProtectedConstructorInAbstractClass
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### NonProtectedConstructorInAbstractClass
Constructor `BasicListener()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/BasicListener.java`
#### Snippet
```java
    protected final ILandLord plugin;

    public BasicListener(ILandLord plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
```

#### Blame
AbbreviatedObjectId[e62014d] Alexander Daichendt
### NonProtectedConstructorInAbstractClass
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### NonProtectedConstructorInAbstractClass
Constructor `LandlordCommand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/LandlordCommand.java`
#### Snippet
```java
    protected final ILangManager lm;

    public LandlordCommand(ILandLord plugin, String name, String usage, Set<String> permissions, Set<String> aliases) {
        super(name, usage, permissions, aliases);
        this.plugin = plugin;
```

#### Blame
AbbreviatedObjectId[521f4ef] SpatiumPrinceps
## FieldAccessedSynchronizedAndUnsynchronized
### FieldAccessedSynchronizedAndUnsynchronized
Field `customConfigFile` is accessed in both synchronized and unsynchronized contexts
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
    private final Plugin plugin;

    private File customConfigFile;
    private FileConfiguration customConfig;

```

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
### FieldAccessedSynchronizedAndUnsynchronized
Field `customConfig` is accessed in both synchronized and unsynchronized contexts
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java

    private File customConfigFile;
    private FileConfiguration customConfig;

    public FlatFileStorage(Plugin plugin) {
```

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
## EmptyMethod
### EmptyMethod
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

#### Blame
AbbreviatedObjectId[502c405] Alexander Daichendt
### EmptyMethod
The method is empty
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemActionListener.java`
#### Snippet
```java

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
/*TODO reimplement

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### EmptyMethod
The method is empty
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemActionListener.java`
#### Snippet
```java

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        //TODO replace with new method. Dunno and to lazy to google it
        /* TODO reimplement
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### EmptyMethod
Method only calls its super
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

#### Blame
AbbreviatedObjectId[dfb6f2f] Alexander Daichendt
### EmptyMethod
Method only calls its super
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java

    @Override
    public void onDisable() {
        super.onDisable();
    }
```

#### Blame
AbbreviatedObjectId[f9b347b] Alexander Daichendt
## RedundantFieldInitialization
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
    private final MultiMode multiMode;
    private final int radius;
    private int flagPage = 0;

    AManage(ILandLord plugin, Player player, String header, List<IOwnedLand> land, ManageMode manageMode, MultiMode multiMode, int radius) {
```

#### Blame
AbbreviatedObjectId[7d32f5e] Alexander Daichendt
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/lib/util/CommandDelayManager.java`
#### Snippet
```java
                int taskid = new BukkitRunnable() {
                    int countdown = delay * 4;
                    int var = 0;

                    @Override
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/lib/gui/MultiPagedGUI.java`
#### Snippet
```java
    private final int rowsPerSite;

    private int siteNumber = 0;

    /**
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java
    private final IVaultManager vault;

    private int delta = 0;
    private double cost = 0;

```

#### Blame
AbbreviatedObjectId[b199a92] SpatiumPrinceps
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java

    private int delta = 0;
    private double cost = 0;

    public ShopGUI(ILandLord plugin, Player player, String title) {
```

#### Blame
AbbreviatedObjectId[b199a92] SpatiumPrinceps
## AssignmentToMethodParameter
### AssignmentToMethodParameter
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### AssignmentToMethodParameter
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### AssignmentToMethodParameter
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

#### Blame
AbbreviatedObjectId[fa70d1e] Aur?lien
### AssignmentToMethodParameter
Assignment to method parameter `location`
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java
    public void onClick(Action action, Player p, Location location) {
        if (location == null)
            location = p.getLocation();

        IOwnedLand landAtLoc = plugin.getWGManager().getRegion(location);
```

#### Blame
AbbreviatedObjectId[791ffd8] SpatiumPrinceps
## RedundantImplements
### RedundantImplements
Redundant interface declaration `Listener`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
 * Date: 06-05-19
 */
public class LandLord extends ALandLord implements Listener {

    @Override
```

#### Blame
AbbreviatedObjectId[45fbeb1] Hannes Greule
## ReturnNull
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java

        if (sec == null) {
            return null;
        }

```

#### Blame
AbbreviatedObjectId[7984f76] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AOwnedLand.java`
#### Snippet
```java
        World world = wg.getWorld(name);
        if (world == null)
            return null;

        return new Location(world, chunkX << 4, world.getHighestBlockYAt(chunkX << 4, chunkZ << 4) + 1, chunkZ << 4);
```

#### Blame
AbbreviatedObjectId[9162f73] Aur?lien
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AOwnedLand.java`
#### Snippet
```java
            return w.getChunkAt(chunkX, chunkZ);
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[7220d1b] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java

        if (splitted.length < 3) {
            return null;
        }

```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### ReturnNull
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

#### Blame
AbbreviatedObjectId[924da55] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[924da55] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LPlayerManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[502c405] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[212a8b0] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[212a8b0] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
        }
        // Connection should be closed via the result set
        return null;
    }

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[37e0398] Hannes Greule
### ReturnNull
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

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
            triplet.close();
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[0ee73ed] Florian F?lling
### ReturnNull
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

#### Blame
AbbreviatedObjectId[36f2379] Aur?lien
### ReturnNull
Return of `null`
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        return (rsp == null ? null : rsp.getProvider());
    }

```

#### Blame
AbbreviatedObjectId[502c405] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[f9b347b] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### ReturnNull
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### ReturnNull
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

#### Blame
AbbreviatedObjectId[44483ae] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            return land;
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[0c8e476] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[cb3a514] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
            return land;
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[9162f73] Aur?lien
### ReturnNull
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

#### Blame
AbbreviatedObjectId[a4e7481] Alexander Daichendt
### ReturnNull
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

#### Blame
AbbreviatedObjectId[36f2379] Aur?lien
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ReturnNull
Return of `null`
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

#### Blame
AbbreviatedObjectId[37e0398] Hannes Greule
### ReturnNull
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

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
## AssignmentToLambdaParameter
### AssignmentToLambdaParameter
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

#### Blame
AbbreviatedObjectId[0e39126] SpatiumPrinceps
## ClassCanBeRecord
### ClassCanBeRecord
Class can be a record
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
    }

    static class Entry {
        final Entry superior;

```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### ClassCanBeRecord
Class can be a record
in `LandLord-core/src/main/java/biz/princeps/landlord/items/Maitem.java`
#### Snippet
```java
    }

    static class ItemClickAction {

        private final ClickedAtCondition activation;
```

#### Blame
AbbreviatedObjectId[306a19e] SpatiumPrinceps
## NullArgumentToVariableArgMethod
### NullArgumentToVariableArgMethod
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

#### Blame
AbbreviatedObjectId[7c51520] Aur?lien
## NonExceptionNameEndsWithException
### NonExceptionNameEndsWithException
Non-exception class name `PlayerNotFoundException` ends with 'Exception'
in `LandLord-core/src/main/java/biz/princeps/lib/exception/PlayerNotFoundException.java`
#### Snippet
```java
 * Date: 2/4/18
 */
public class PlayerNotFoundException extends Throwable {

    public PlayerNotFoundException(String string) {
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
## UnusedAssignment
### UnusedAssignment
The value changed at `position++` is never used
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
                    }.runTaskAsynchronously(plugin));

            this.setIcon(position++, icon);
        }
    }
```

#### Blame
AbbreviatedObjectId[212a8b0] Alexander Daichendt
### UnusedAssignment
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

#### Blame
AbbreviatedObjectId[7321666] Alexander Daichendt
## MethodMayBeStatic
### MethodMayBeStatic
Method `registerPlaceholders()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLFeatherBoard.java`
#### Snippet
```java
    }

    private void registerPlaceholders(ILandLord plugin) {
        plugin.getLogger().warning("Featherboard Placeholders do not work. Please tell Maxim from Featherboard to take a look at the MVdWPlaceholderAPI repo.");
        /*
```

#### Blame
AbbreviatedObjectId[d0fe1a0] Aurelien30000
### MethodMayBeStatic
Method `format()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/lib/chat/MultiPagedComponentMessage.java`
#### Snippet
```java
    }

    private String format(String header) {
        return ChatColor.translateAlternateColorCodes('&', header);
    }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### MethodMayBeStatic
Method `format()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/lib/gui/simple/AbstractGUI.java`
#### Snippet
```java
     * @return a formatted string
     */
    private String format(String toFormat) {
        return ChatColor.translateAlternateColorCodes('&', toFormat);
    }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### MethodMayBeStatic
Method `format()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/lib/chat/MultiPagedMessage.java`
#### Snippet
```java
    }

    private String format(String header) {
        return ChatColor.translateAlternateColorCodes('&', header);
    }
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### MethodMayBeStatic
Method `setGlowing()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
    }

    private void setGlowing(ItemStack stack, boolean glowing) {
        ItemMeta itemMeta = stack.getItemMeta();
        if (glowing) {
```

#### Blame
AbbreviatedObjectId[ef39594] Alexander Daichendt
### MethodMayBeStatic
Method `formatList()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/AManage.java`
#### Snippet
```java
    }

    private List<String> formatList(List<String> list, String toReplace, String newValue) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
```

#### Blame
AbbreviatedObjectId[5a0ab82] Aurelien30000
### MethodMayBeStatic
Method `evalutePrepStmt()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/lib/storage/Datastorage.java`
#### Snippet
```java
    }

    private void evalutePrepStmt(PreparedStatement st, Object... args) throws SQLException {
        for (int i = 0; i < args.length; i++) {
            Object obj = args[i];
```

#### Blame
AbbreviatedObjectId[591b84f] Alexander Daichendt
### MethodMayBeStatic
Method `executeUpgrade()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
     * 4) Write some SQL statement that alters the table.
     */
    private void executeUpgrade(int localVersion) {
        switch (localVersion) {
            case 3:
```

#### Blame
AbbreviatedObjectId[049c381] Alexander Daichendt
### MethodMayBeStatic
Method `register1_14Entities()` may be 'static'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    }

    private void register1_14Entities() {
        // 1.14's entities
        Mob CAT = new Mob(EntityType.CAT, Material.CAT_SPAWN_EGG);
```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### MethodMayBeStatic
Method `register1_15Entities()` may be 'static'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    }

    private void register1_15Entities() {
        // 1.15's entities
        Mob BEE = new Mob(EntityType.BEE, Material.BEE_SPAWN_EGG);
```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### MethodMayBeStatic
Method `register1_16Entities()` may be 'static'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    }

    private void register1_16Entities() {
        // 1.16's entities
        Mob HOGLIN = new Mob(EntityType.HOGLIN, Material.HOGLIN_SPAWN_EGG);
```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### MethodMayBeStatic
Method `register1_16_2Entities()` may be 'static'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    }

    private void register1_16_2Entities() {
        // 1.16.2's entities
        Mob PIGLIN_BRUTE = new Mob(EntityType.PIGLIN_BRUTE, Material.PIGLIN_BRUTE_SPAWN_EGG);
```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### MethodMayBeStatic
Method `register1_17Entities()` may be 'static'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    }

    private void register1_17Entities() {
        // 1.17's entities
        Mob AXOLOTL = new Mob(EntityType.AXOLOTL, Material.AXOLOTL_SPAWN_EGG);
```

#### Blame
AbbreviatedObjectId[0669776] Aur?lien
### MethodMayBeStatic
Method `replaceLore()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/guis/ShopGUI.java`
#### Snippet
```java
    }

    private List<String> replaceLore(List<String> list, String toReplace, String newValue) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
```

#### Blame
AbbreviatedObjectId[f7fe6a2] Spatium Princeps
### MethodMayBeStatic
Method `locationToVec()` may be 'static'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
    }

    private BlockVector3 locationToVec(Location loc) {
        return BlockVector3.at(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
    }
```

#### Blame
AbbreviatedObjectId[cb3a514] Alexander Daichendt
### MethodMayBeStatic
Method `locationToVec()` may be 'static'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
    }

    private BlockVector locationToVec(Location loc) {
        return new BlockVector(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
    }
```

#### Blame
AbbreviatedObjectId[cb3a514] Alexander Daichendt
### MethodMayBeStatic
Method `replaceInMessage()` may be 'static'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Info.java`
#### Snippet
```java


    private String replaceInMessage(String original, String landID, String owner, String member, String lastseen,
                                    String price) {
        return original.replace("%landid%", landID)
```

#### Blame
AbbreviatedObjectId[2f4ce41] SpatiumPrinceps
