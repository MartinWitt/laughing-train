# LandLord 
 
# Bad smells
I found 128 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| TrivialStringConcatenation | 29 | false |
| DuplicatedCode | 26 | false |
| Deprecation | 23 | false |
| DataFlowIssue | 8 | false |
| NullableProblems | 6 | false |
| IgnoreResultOfCall | 6 | false |
| FieldCanBeLocal | 5 | false |
| SuspiciousNameCombination | 4 | false |
| UNCHECKED_WARNING | 4 | false |
| CommentedOutCode | 4 | false |
| BlockingMethodInNonBlockingContext | 3 | false |
| UnusedAssignment | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| RedundantMethodOverride | 1 | false |
| UNUSED_IMPORT | 1 | false |
| EmptyStatementBody | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=SuspiciousNameCombination]
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getTitle()` is identical to its super method
in `LandLord-core/src/main/java/biz/princeps/lib/gui/MainMenuGUI.java`
#### Snippet
```java


    public String getTitle() {
        return title;
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set\>' to 'java.util.Set'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        for (World world : plugin.getServer().getWorlds()) {
            Set<?> allWGRegions = getAllWGRegions(world);
            set.addAll(((Set<ProtectedRegion>) allWGRegions));
        }
        return set;
```

### UNCHECKED_WARNING
Unchecked cast: 'com.sk89q.worldguard.protection.flags.Flag\>' to 'com.sk89q.worldguard.protection.flags.Flag'
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java

    private Flag<StateFlag.State> getWGFlag(String flagName) {
        return FLAGS_CACHE.computeIfAbsent(flagName, name -> (Flag<StateFlag.State>) Flags.fuzzyMatchFlag(flagRegistry, name));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set\>' to 'java.util.Set'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        for (World world : plugin.getServer().getWorlds()) {
            Set<?> allWGRegions = getAllWGRegions(world);
            set.addAll(((Set<ProtectedRegion>) allWGRegions));
        }
        return set;
```

### UNCHECKED_WARNING
Unchecked cast: 'com.sk89q.worldguard.protection.flags.Flag\>' to 'com.sk89q.worldguard.protection.flags.Flag'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java

    private Flag<StateFlag.State> getWGFlag(String flagName) {
        return FLAGS_CACHE.computeIfAbsent(flagName, name -> (Flag<StateFlag.State>) DefaultFlag.fuzzyMatchFlag(flagRegistry, name));
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `flag` might be null
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
    }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `flag` might be null
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
    }

```

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `LandLord-legacy/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
        this.mobManager = new MobsManager(this);

        if (getConfig().getString("Regeneration.provider", "default").equalsIgnoreCase("wg")) {
            // there is only the default method available for 1.12.2
        }
```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/SQLStorage.java`
#### Snippet
```java
     */
    private void executeUpgrade(int localVersion) {
        switch (localVersion) {
            case 3:
                // TODO Handle upgrade from old scheme before this patch to v4
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/AdminClaim.java`
#### Snippet
```java
        if (properties.isConsole()) {
            return;
        }

        Player sender = properties.getPlayer();

        String target;
        try {
            target = arguments.get(0);
        } catch (ArgumentsOutOfBoundsException e) {
            properties.sendUsage();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java
        if (properties.isConsole()) {
            properties.sendMessage("Player command only!");
            return;
        }
        if (arguments.size() != 2) {
            properties.sendUsage();
            return;
        }

        Player player = properties.getPlayer();
        if (isDisabledWorld(player)) {
            return;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
#### Snippet
```java
        MultiMode mode;
        int radius;
        try {
            mode = MultiMode.valueOf(arguments.get(0).toUpperCase());
            radius = arguments.getInt(1);
        } catch (IllegalArgumentException | ArgumentsOutOfBoundsException ex) {
            properties.sendUsage();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Unclaim.java`
#### Snippet
```java
        if (lPlayer != null) {
            Location home = lPlayer.getHome();
            if (home != null) {
                if (ol.contains(home.getBlockX(), home.getBlockY(), home.getBlockZ())) {
                    lm.sendMessage(player, lm.getString(player, "Commands.SetHome.removed"));
                    plugin.getPlayerManager().get(ol.getOwner()).setHome(null);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/adv/Advertise.java`
#### Snippet
```java
        IOwnedLand iOwnedLand;
        if (landname.equals("this")) {
            iOwnedLand = wg.getRegion(player.getLocation());
        } else {
            iOwnedLand = wg.getRegion(landname);
        }

        if (iOwnedLand == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Advertise.notOwnFreeLand"));
            return;
        }

        if (isDisabledWorld(player, iOwnedLand.getWorld())) {
            return;
        }

        if (!iOwnedLand.isOwner(player.getUniqueId())) {
            lm.sendMessage(player, lm.getString(player, "Commands.Advertise.notOwn").replace("%owner%",
                    iOwnedLand.getOwnersString()));
            return;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/friends/AddfriendAll.java`
#### Snippet
```java
                            if (!ol.isFriend(offline.getUuid())) {
                                String oldfriends = ol.getMembersString();
                                ol.addFriend(offline.getUuid());
                                count++;
                                new BukkitRunnable() {
                                    @Override
                                    public void run() {
                                        LandManageEvent landManageEvent = new LandManageEvent(player, ol,
                                                "FRIENDS", oldfriends, ol.getMembersString());
                                        plugin.getServer().getPluginManager().callEvent(landManageEvent);
                                    }
                                }.runTask(plugin);
                            }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/friends/MultiAddfriend.java`
#### Snippet
```java
        if (properties.isConsole()) {
            properties.sendMessage("Player command only!");
            return;
        }
        if (arguments.size() != 3) {
            properties.sendUsage();
            return;
        }
        MultiMode mode;
        int radius;
        String name;
        try {
            mode = MultiMode.valueOf(arguments.get(0).toUpperCase());
            radius = arguments.getInt(1);
            name = arguments.get(2);
        } catch (IllegalArgumentException | ArgumentsOutOfBoundsException ex) {
            properties.sendUsage();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/friends/MultiRemovefriend.java`
#### Snippet
```java
                            if (ol.isFriend(offline.getUuid())) {
                                String oldvalue = ol.getMembersString();
                                ol.removeFriend(offline.getUuid());
                                count++;
                                new BukkitRunnable() {
                                    @Override
                                    public void run() {
                                        LandManageEvent landManageEvent = new LandManageEvent(player, ol,
                                                "FRIENDS", oldvalue, ol.getMembersString());
                                        plugin.getServer().getPluginManager().callEvent(landManageEvent);
                                    }
                                }.runTask(plugin);
                            }
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/ListLands.java`
#### Snippet
```java
                        icon.setLore(lore);
                        icon.addClickAction((p) -> {
                            boolean hasPerm = false;
                            for (String s : Sets.newHashSet(plugin.getConfig().getStringList("CommandSettings.Manage.permissions"))) {
                                if (p.hasPermission(s)) {
                                    hasPerm = true;
                                    break;
                                }
                            }
                            if (hasPerm) {
                                ManageGui manageGUI = new ManageGui(plugin, sender, landGui, land);
                                manageGUI.display();
                            }
                        });

                        landGui.addIcon(icon);
```

### DuplicatedCode
Duplicated code
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
#### Snippet
```java
        if (lands.isEmpty() || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = casy; i < args.length; i++) {
            sb.append(args[i]).append(" ");
        }
        String newmsg = ChatColor.translateAlternateColorCodes('&', sb.toString());
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/LLFlag.java`
#### Snippet
```java
        if (grp == RegionGroup.MEMBERS && state == StateFlag.State.ALLOW ||
                grp == RegionGroup.NON_MEMBERS && state == StateFlag.State.DENY) {
            friendStatus = true;
            allStatus = false;
        }
        if (grp == RegionGroup.ALL && state == StateFlag.State.ALLOW) {
            friendStatus = true;
            allStatus = true;
        }
        if (grp == RegionGroup.NON_OWNERS && state == StateFlag.State.DENY) {
            friendStatus = false;
            allStatus = false;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/LLFlag.java`
#### Snippet
```java
        if (friendStatus) {
            this.friendStatus = false;
            // deny everyone
            if (allStatus) {
                return false;
            } else {
                pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.NON_OWNERS);
                pr.setFlag(flag, StateFlag.State.DENY);
                return true;
            }

        } else {
            // allow friends now
            if (allStatus) {
                // now: 11
                this.friendStatus = true;
                pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.ALL);
                pr.setFlag(flag, StateFlag.State.ALLOW);
            } else {
                // now 10
                this.friendStatus = true;
                if (flag.getRegionGroupFlag().getDefault() != RegionGroup.NON_MEMBERS) {
                    pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.MEMBERS);
                    pr.setFlag(flag, StateFlag.State.ALLOW);
                } else {
                    pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.NON_MEMBERS);
                    pr.setFlag(flag, StateFlag.State.DENY);
                }
            }

            return true;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/LLFlag.java`
#### Snippet
```java
        if (allStatus) {
            // deny nonmbers now
            this.allStatus = false;
            if (friendStatus) {
                // still allow friends
                if (flag.getRegionGroupFlag().getDefault() != RegionGroup.NON_MEMBERS) {
                    pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.MEMBERS);
                    pr.setFlag(flag, StateFlag.State.ALLOW);
                } else {
                    pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.NON_MEMBERS);
                    pr.setFlag(flag, StateFlag.State.DENY);
                }
            } else {
                // deny everyone
                pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.NON_OWNERS);
                pr.setFlag(flag, StateFlag.State.DENY);
            }
            return true;
        } else {
            if (friendStatus) {
                this.allStatus = true;
                pr.setFlag(flag.getRegionGroupFlag(), RegionGroup.ALL);
                pr.setFlag(flag, StateFlag.State.ALLOW);
                return true;
            } else {
                return false;
            }
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandSessionHandler.java`
#### Snippet
```java
        if (entered.isEmpty() && exited.isEmpty()) {
            // for whatever reason, ON CROSS BOUNDARY is triggered when not crossing boundaries
            // even worse, the toSet isn't empty and will return greeting/farewell messages to WG
            // yes, it even finds the farewell message... ???
            // from my testings, it still works as expected by just using entered/exited
            return true;
        }
        IOwnedLand enteredLand = getFirstOwnedLand(entered);
        IOwnedLand exitedLand = getFirstOwnedLand(exited);
        if (enteredLand == null && exitedLand == null) {
            // neither entered nor exited a LL land, let WG handle it
            return this.greeting.onCrossBoundary(player, from, to, toSet, entered, exited, moveType)
                    && this.farewell.onCrossBoundary(player, from, to, toSet, entered, exited, moveType);
        }
        if (enteredLand != null && exitedLand != null) {
            if (enteredLand.getOwner().equals(exitedLand.getOwner())) {
                return true; // switched between two lands of the same owner
            }
        }
        if (enteredLand == null && !entered.isEmpty()) {
            // entered a non-ll region, needs to be handled by WG
            this.greeting.onCrossBoundary(player, from, to, toSet, entered, exited, moveType);
        }
        if (exitedLand == null && !exited.isEmpty()) {
            // exited a non-ll region, needs to be handled by WG
            this.farewell.onCrossBoundary(player, from, to, toSet, entered, exited, moveType);
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
        Flag<StateFlag.State> flag = getWGFlag(s.toLowerCase());
        if (flag == null) {
            plugin.getLogger().warning("Invalid worldguard flag found: " + s);

        }
        Material mat = Material.valueOf(plugin.getConfig()
                .getString("Manage." + s.toLowerCase() + ".item"));

        return new LLFlag(region, flag, mat);
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
            if (!(flag instanceof StateFlag)) {
                plugin.getLogger().warning("Only stateflags are supported!");
                return;
            }
            region.setFlag(flag.getRegionGroupFlag(), RegionGroup.MEMBERS);
            region.setFlag(flag, StateFlag.State.ALLOW);

            // some combinations are illegal (all true, friends false)
            if (!plugin.getConfig().getBoolean("Manage." + s + ".default.friends", true)) {
                ILLFlag flag1 = getFlag(s);
                flag1.toggleFriends();
            }

            if (plugin.getConfig().getBoolean("Manage." + s + ".default.everyone", false)) {
                ILLFlag flag1 = getFlag(s);
                flag1.toggleAll();
            }
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
        for (String s : rawList) {
            Flag<StateFlag.State> flag = getWGFlag(s.toLowerCase());
            if (!region.getFlags().containsKey(flag)) {
                region.setFlag(flag.getRegionGroupFlag(), RegionGroup.MEMBERS);
                region.setFlag(flag, StateFlag.State.ALLOW);

                // some combinations are illegal (all true, friends false)
                if (!plugin.getConfig().getBoolean("Manage." + s + ".default.friends", true)) {
                    ILLFlag flag1 = getFlag(s);
                    flag1.toggleFriends();
                }

                if (plugin.getConfig().getBoolean("Manage." + s + ".default.everyone", false)) {
                    ILLFlag flag1 = getFlag(s);
                    flag1.toggleAll();
                }
            }
        }
        // add other flags
        OfflinePlayer p = plugin.getServer().getOfflinePlayer(owner);
        if (p.getName() == null) {
            return;
        }
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/PistonOverwriter.java`
#### Snippet
```java
        if (origin == null) {
            return false;
        }

        if (wg.getRegion(origin.getLocation()) == null) {
            return false;
        }

        Set<IOwnedLand> lands = new HashSet<>();
        for (Block block : blocks) {
            lands.add(wg.getRegion(block.getLocation()));
        }

        UUID onlyOwner = wg.getRegion(origin.getLocation()).getOwner();
        // plugin.getLogger().log(Level.INFO, "original owner" + onlyOwner);
        for (IOwnedLand land : lands) {
            // plugin.getLogger().log(Level.INFO, String.valueOf(land));
            if (land == null) {
                return false;
            }
            if (!onlyOwner.equals(land.getOwner())) {
                return false;
            }
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
            String s = type.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '_') {
                    sb.append(' ');
                    sb.append(Character.toUpperCase(s.charAt(++i)));
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        World world = chunk.getWorld();
        int x = chunk.getX() << 4;
        int z = chunk.getZ() << 4;
        Pair<Integer, Integer> boundaries = calcClaimHeightBoundaries(chunk);
        Location down = new Location(world, x, boundaries.getLeft(), z);
        Location upper = new Location(world, x + 15, boundaries.getRight(), z + 15);
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        ProtectedCuboidRegion pr = new ProtectedCuboidRegion(getLandName(chunk), vec1, vec2);

        RegionManager manager = getRegionManager(chunk.getWorld());
        if (manager != null) {
            IOwnedLand land;
            if (manager.hasRegion(pr.getId())) {
                // Don't init flags and data for an existing land, old data will be copied out later during reclaim.
                land = OwnedLand.of(plugin, pr);
            } else {
                land = OwnedLand.create(plugin, pr, owner);
            }
            manager.addRegion(pr);
            pr.getOwners().addPlayer(owner);
            cache.add(land);
            return land;
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        Map<String, ProtectedRegion> regions = new HashMap<>(getRegionManager(world).getRegions());
        for (String r : getRegionManager(world).getRegions().keySet()) {
            if (isLLRegion(r)) {
                regions.remove(r);
            }
        }
        return new HashSet<>(regions.values());
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        Set<ProtectedRegion> set = new HashSet<>();
        for (World world : plugin.getServer().getWorlds()) {
            Set<?> allWGRegions = getAllWGRegions(world);
            set.addAll(((Set<ProtectedRegion>) allWGRegions));
        }
        return set;
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        RegionManager regionManager = getRegionManager(player.getWorld());
        if (regionManager == null) {
            return false;
        }
        World world = currChunk.getWorld();
        int x = currChunk.getX() << 4;
        int z = currChunk.getZ() << 4;
        Pair<Integer, Integer> boundaries = calcClaimHeightBoundaries(currChunk);
        Vector v1 = new Location(world, x, boundaries.getLeft(), z).toVector();
        Vector v2 = new Location(world, x + 15, boundaries.getRight(), z + 15).toVector();
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        List<ProtectedRegion> intersects = check
                .getIntersectingRegions(new ArrayList<>(regionManager.getRegions().values()));
        for (ProtectedRegion intersect : intersects) {
            // check this out, might not work. canBuild was removed in 1.13.1 and Im not sure if isMemberOfAll is
            // equivalent
            // 10/26/18 looks like its working:
            if (!regionManager.getApplicableRegions(intersect).isMemberOfAll(wgPlugin.wrapPlayer(player))) {
                return false;
            }
        }

        return true;
```

### DuplicatedCode
Duplicated code
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
#### Snippet
```java
        LocalPlayer localPlayer = wgPlugin.wrapPlayer(p);
        ApplicableRegionSet applicableRegions = getRegionManager(loc.getWorld())
                .getApplicableRegions(locationToVec(loc));
        if (applicableRegions.getRegions().size() > 0) { // check for other lands, that may not be handled by landlord
            for (ProtectedRegion protectedRegion : applicableRegions.getRegions()) {
                if (protectedRegion.isMember(localPlayer) || protectedRegion.isOwner(localPlayer)) {
                    return true;
                }
            }
        }
        return false;
```

## RuleId[id=Deprecation]
### Deprecation
'getName()' is deprecated
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
        @Override
        public String getNiceName() {
            String s = t.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(s.charAt(0)));
```

### Deprecation
'getName()' is deprecated
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
        @Override
        public String getName() {
            return t.getName().toUpperCase();
        }
    }
```

### Deprecation
'getEditSessionFactory()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/regenerators/WGRegenerator.java`
#### Snippet
```java
                ClipboardFormat format = BuiltInClipboardFormat.SPONGE_SCHEMATIC;

                try (EditSession editSession = worldEdit.getEditSessionFactory().getEditSession(weWorld, -1);
                     ClipboardReader reader = format.getReader(Files.newInputStream(path))) {

```

### Deprecation
'getEditSessionFactory()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/listener/WGRegenListener.java`
#### Snippet
```java
        WorldEdit worldEdit = WorldEdit.getInstance();
        com.sk89q.worldedit.world.World weWorld = BukkitAdapter.adapt(world);
        EditSession editSession = worldEdit.getEditSessionFactory().getEditSession(weWorld, -1);

        BlockArrayClipboard clipboard = new BlockArrayClipboard(region);
```

### Deprecation
'getOfflinePlayer(java.lang.String)' is deprecated
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/LPlayerManager.java`
#### Snippet
```java
    @Override
    public void getOffline(String name, Consumer<IPlayer> consumer) {
        getOffline(plugin.getServer().getOfflinePlayer(name).getUniqueId(), consumer);
    }

```

### Deprecation
'sendBlockChange(org.bukkit.Location, org.bukkit.Material, byte)' is deprecated
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/UtilsManager.java`
#### Snippet
```java
    @Override
    public void sendFakeBlockPacket(Player p, Location loc, Material mat) {
        p.sendBlockChange(loc, mat, (byte) 0);
    }
}
```

### Deprecation
'GREET_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
            return;
        }
        region.setFlag(Flags.GREET_MESSAGE, plugin.getLangManager()
                .getRawString("Alerts.defaultGreeting").replace("%owner%", p.getName()));
        region.setFlag(Flags.FAREWELL_MESSAGE, plugin.getLangManager()
```

### Deprecation
'FAREWELL_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
        region.setFlag(Flags.GREET_MESSAGE, plugin.getLangManager()
                .getRawString("Alerts.defaultGreeting").replace("%owner%", p.getName()));
        region.setFlag(Flags.FAREWELL_MESSAGE, plugin.getLangManager()
                .getRawString("Alerts.defaultFarewell").replace("%owner%", p.getName()));
    }
```

### Deprecation
'FAREWELL_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
    @Override
    public String getFarewellMessage() {
        String farewellMessage = region.getFlag(Flags.FAREWELL_MESSAGE);
        return farewellMessage == null ? "" : farewellMessage;
    }
```

### Deprecation
'GREET_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
            String flagname = iWrapperFlag.getName().toLowerCase().replace("-group", "");
            if (!rawList.contains(flagname) &&
                    !flagname.equals(Flags.GREET_MESSAGE.getName().toLowerCase()) &&
                    !flagname.equals(Flags.FAREWELL_MESSAGE.getName().toLowerCase())) {

```

### Deprecation
'FAREWELL_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
            if (!rawList.contains(flagname) &&
                    !flagname.equals(Flags.GREET_MESSAGE.getName().toLowerCase()) &&
                    !flagname.equals(Flags.FAREWELL_MESSAGE.getName().toLowerCase())) {

                region.setFlag(iWrapperFlag, null);
```

### Deprecation
'GREET_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
            return;
        }
        if (!region.getFlags().containsKey(Flags.GREET_MESSAGE)) {
            region.setFlag(Flags.GREET_MESSAGE,
                    plugin.getLangManager().getRawString("Alerts.defaultGreeting").replace("%owner%", p.getName()));
```

### Deprecation
'GREET_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
        }
        if (!region.getFlags().containsKey(Flags.GREET_MESSAGE)) {
            region.setFlag(Flags.GREET_MESSAGE,
                    plugin.getLangManager().getRawString("Alerts.defaultGreeting").replace("%owner%", p.getName()));
        } else if (!region.getFlags().containsKey(Flags.FAREWELL_MESSAGE)) {
```

### Deprecation
'FAREWELL_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
            region.setFlag(Flags.GREET_MESSAGE,
                    plugin.getLangManager().getRawString("Alerts.defaultGreeting").replace("%owner%", p.getName()));
        } else if (!region.getFlags().containsKey(Flags.FAREWELL_MESSAGE)) {
            region.setFlag(Flags.FAREWELL_MESSAGE,
                    plugin.getLangManager().getRawString("Alerts.defaultFarewell").replace("%owner%", p.getName()));
```

### Deprecation
'FAREWELL_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
                    plugin.getLangManager().getRawString("Alerts.defaultGreeting").replace("%owner%", p.getName()));
        } else if (!region.getFlags().containsKey(Flags.FAREWELL_MESSAGE)) {
            region.setFlag(Flags.FAREWELL_MESSAGE,
                    plugin.getLangManager().getRawString("Alerts.defaultFarewell").replace("%owner%", p.getName()));
        }
```

### Deprecation
'GREET_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
    @Override
    public void setGreetMessage(String newmsg) {
        region.setFlag(Flags.GREET_MESSAGE, newmsg);
    }

```

### Deprecation
'GREET_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
    @Override
    public String getGreetMessage() {
        String greetMessage = region.getFlag(Flags.GREET_MESSAGE);
        return greetMessage == null ? "" : greetMessage;
    }
```

### Deprecation
'FAREWELL_MESSAGE' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
#### Snippet
```java
    @Override
    public void setFarewellMessage(String newmsg) {
        region.setFlag(Flags.FAREWELL_MESSAGE, newmsg);
    }

```

### Deprecation
'getUnsafe()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/LandLord.java`
#### Snippet
```java
        // Handle 1.18 auto-migration.
        // https://minecraft.fandom.com/wiki/Data_version
        int currentDataVersion = getServer().getUnsafe().getDataVersion();
        if (currentDataVersion > 2858 && getConfig().getBoolean("check-1-18-world-heights")) {
            getLogger().warning("It appears that Landlord is not fully ready to run Minecraft 1.18+. " +
```

### Deprecation
'getEditSessionFactory()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/regenerators/RegenerationManager.java`
#### Snippet
```java
                BlockVector3.at((x << 4) + 15, weWorld.getMaxY(), (z << 4) + 15));
        WorldEdit worldEdit = WorldEdit.getInstance();
        EditSession editSession = worldEdit.getEditSessionFactory().getEditSession(weWorld, -1);
        weWorld.regenerate(region, editSession);
        editSession.close();
```

### Deprecation
'getName()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
        @Override
        public String getName() {
            return type.getName().toUpperCase();
        }
    }
```

### Deprecation
'getName()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
        @Override
        public String getNiceName() {
            String s = type.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(s.charAt(0)));
```

### Deprecation
'getUnsafe()' is deprecated
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
        this.plugin = plugin;
        // https://minecraft.fandom.com/wiki/Data_version
        this.currentDataVersion = plugin.getServer().getUnsafe().getDataVersion();

        registerDefaultEntities();
```

## RuleId[id=TrivialStringConcatenation]
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

### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java
            int highestAllowedLandCount = plugin.getPlayerManager().getMaxClaimPermission(player);
            int regionCount = plugin.getWGManager().getRegionCount(player.getUniqueId());
            lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                    .replace("%claims%", (highestAllowedLandCount == Integer.MAX_VALUE ? "∞" : highestAllowedLandCount <= 0 ? "∅" : highestAllowedLandCount + "")));
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/Claims.java`
#### Snippet
```java
            int regionCount = plugin.getWGManager().getRegionCount(player.getUniqueId());
            lm.sendMessage(player, lm.getString(player, "Commands.Claims.message").replace("%regions%", regionCount + "")
                    .replace("%claims%", (highestAllowedLandCount == Integer.MAX_VALUE ? "∞" : highestAllowedLandCount <= 0 ? "∅" : highestAllowedLandCount + "")));
        }
    }
```

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

### TrivialStringConcatenation
Empty string used in concatenation
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
#### Snippet
```java

        configString = configString.replace("%world%", chunk.getWorld().getName());
        configString = configString.replace("%x%", x + "");
        configString = configString.replace("%z%", z + "");

```

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

## RuleId[id=NullArgumentToVariableArgMethod]
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLExpansion.java`
#### Snippet
```java

    @Override
    public String getVersion() {
        return plugin.getDescription().getVersion();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLExpansion.java`
#### Snippet
```java

    @Override
    public String getAuthor() {
        return String.valueOf(plugin.getDescription().getAuthors());
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLExpansion.java`
#### Snippet
```java

    @Override
    public String getIdentifier() {
        return "landlord";
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLExpansion.java`
#### Snippet
```java

    @Override
    public String onPlaceholderRequest(Player player, String placeholder) {
        if (player == null) {
            return null;
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `LandLord-core/src/main/java/biz/princeps/landlord/integrations/LLLuckPerms.java`
#### Snippet
```java

        @Override
        public ContextSet estimatePotentialContexts() {
            ImmutableContextSet.Builder builder = ImmutableContextSet.builder();
            builder.add("land", "wilderness");
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `LandLord-core/src/main/java/biz/princeps/landlord/integrations/LLLuckPerms.java`
#### Snippet
```java

        @Override
        public void calculate(Player p, ContextConsumer contextConsumer) {
            IOwnedLand region = plugin.getWGManager().getRegion(p.getLocation());
            if (region == null) {
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=ConstantValue]
### ConstantValue
Value `sourceFile` is always 'null'
in `LandLord-core/src/main/java/biz/princeps/lib/ConfigUpdater.java`
#### Snippet
```java
        File sourceFile = null;
        //sourceFile = new File(PrincepsLib.getPluginInstance().getClass().getResource(source));
        List<Entry> entryList = generateEntries(sourceFile);


```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `LandLord-core/src/main/java/biz/princeps/landlord/util/JavaUtils.java`
#### Snippet
```java

    /**
     * Original link : https://github.com/bergerhealer/BKCommonLib/blob/master/src/main/java/com/bergerkiller/bukkit/common/utils/FaceUtil.java
     * <p>
     * Gets the horizontal Block Face from a given yaw angle
```

### JavadocLinkAsPlainText
Link specified as plain text
in `LandLord-core/src/main/java/biz/princeps/landlord/ALandLord.java`
#### Snippet
```java

    /**
     * Register bStats metrics https://bstats.org/plugin/bukkit/Landlord
     */
    private void setupMetrics() {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    public static final Mob VILLAGER = new Mob(EntityType.VILLAGER, 120);

    private final ILandLord plugin;

    public MobsManager(ILandLord plugin) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `LandLord-core/src/main/java/biz/princeps/landlord/placeholderapi/LLFeatherBoard.java`
#### Snippet
```java
public class LLFeatherBoard {

    private final IWorldGuardManager wg;

    public LLFeatherBoard(ILandLord plugin) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `LandLord-core/src/main/java/biz/princeps/lib/item/ItemActionListener.java`
#### Snippet
```java
public class ItemActionListener implements Listener {

    private final ItemManager itemManager;

    public ItemActionListener(ItemManager manager) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/MobsManager.java`
#### Snippet
```java
    final int currentDataVersion;

    private final ILandLord plugin;

    public MobsManager(ILandLord plugin) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `LandLord-core/src/main/java/biz/princeps/lib/item/AbstractItem.java`
#### Snippet
```java
    private final boolean breakBlocks;
    private ItemStack stack;
    private boolean glowing;

    /**
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `LandLord-core/src/main/java/biz/princeps/landlord/persistent/FlatFileStorage.java`
#### Snippet
```java
            customConfigFile.getParentFile().mkdirs();
            try {
                customConfigFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/ConfigurationManager.java`
#### Snippet
```java
            if (i > version) {
                try (InputStream a = plugin.getClass().getResourceAsStream(pathInJar)) {
                    Files.copy(a, Paths.get(pathToExisting + ".v" + i), StandardCopyOption.REPLACE_EXISTING);
                }
                plugin.getLogger().warning(pathToExisting + " config file is not up-to-date! " +
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `LandLord-core/src/main/java/biz/princeps/lib/PrincepsLib.java`
#### Snippet
```java
            try {
                INSTANCE.getDataFolder().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
```

## RuleId[id=IgnoreResultOfCall]
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

