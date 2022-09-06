# Bad smells
I found 26 bad smells:
## SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/MultiManage.java`
### Snippet
```java
        List<IOwnedLand> lands = new ArrayList<>(mode.getLandsOf(radius, player.getLocation(), player.getUniqueId(), wg));

        if (lands.size() == 0) {
            lm.sendMessage(player, plugin.getLangManager().getString("Commands.ListLands.noLands"));
            return;
```
## SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/ManageAll.java`
### Snippet
```java
        List<IOwnedLand> lands = Lists.newArrayList(plugin.getWGManager().getRegions(player.getUniqueId()));

        if (lands.size() == 0) {
            lm.sendMessage(player, plugin.getLangManager().getString("Commands.ListLands.noLands"));
            return;
```
## SizeReplaceableByIsEmpty
`permissions.size() == 0` can be replaced with 'permissions.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/lib/command/SubCommand.java`
### Snippet
```java
     */
    public boolean hasPermission(CommandSender cs) {
        if (permissions.size() == 0) {
            return true;
        }
```
## SizeReplaceableByIsEmpty
`land.getFriends().size() > 0` can be replaced with '!land.getFriends().isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/friends/ListFriends.java`
### Snippet
```java
            return;
        }
        if (land.getFriends().size() > 0)
            lm.sendMessage(player, lm.getString(player, "Commands.Listfriends.friends")
                    .replace("%friends%", land.getMembersString()));
```
## SizeReplaceableByIsEmpty
`lands.size() > 0` can be replaced with '!lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/admin/AdminTeleport.java`
### Snippet
```java
                // Success
                Set<IOwnedLand> lands = plugin.getWGManager().getRegions(offline.getUuid());
                if (lands.size() > 0) {
                    MultiPagedGUI landGui = new MultiPagedGUI(plugin, sender, 5,
                            lm.getRawString("Commands.AdminTp.guiHeader").replace("%player%", target));
```
## SizeReplaceableByIsEmpty
`toClaim.size() == 0` can be replaced with 'toClaim.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/claiming/MultiClaim.java`
### Snippet
```java

        Set<Chunk> toClaim = mode.getFreeLands(radius, player.getLocation(), wg);
        if (toClaim.size() == 0) {
            lm.sendMessage(player, lm.getString(player, "Commands.MultiClaim.noLands"));
            return;
```
## SizeReplaceableByIsEmpty
`region.getFlags().size() == 0` can be replaced with 'region.getFlags().isEmpty()'
in `LandLord-latest/src/main/java/biz/princeps/landlord/OwnedLand.java`
### Snippet
```java

        // Insert default flags.
        if (region.getFlags().size() == 0) {
            initFlags(owner);
            initRegionPriority();
```
## SizeReplaceableByIsEmpty
`applicableRegions.getRegions().size() > 0` can be replaced with '!applicableRegions.getRegions().isEmpty()'
in `LandLord-latest/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
### Snippet
```java
        ApplicableRegionSet applicableRegions = getRegionManager(loc.getWorld())
                .getApplicableRegions(locationToVec(loc));
        if (applicableRegions.getRegions().size() > 0) { // check for other lands, that may not be handled by landlord
            for (ProtectedRegion protectedRegion : applicableRegions.getRegions()) {
                if (protectedRegion.isMember(localPlayer) || protectedRegion.isOwner(localPlayer)) {
```
## SizeReplaceableByIsEmpty
`applicableRegions.getRegions().size() > 0` can be replaced with '!applicableRegions.getRegions().isEmpty()'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/manager/WorldGuardManager.java`
### Snippet
```java
        ApplicableRegionSet applicableRegions = getRegionManager(loc.getWorld())
                .getApplicableRegions(locationToVec(loc));
        if (applicableRegions.getRegions().size() > 0) { // check for other lands, that may not be handled by landlord
            for (ProtectedRegion protectedRegion : applicableRegions.getRegions()) {
                if (protectedRegion.isMember(localPlayer) || protectedRegion.isOwner(localPlayer)) {
```
## SizeReplaceableByIsEmpty
`region.getFlags().size() == 0` can be replaced with 'region.getFlags().isEmpty()'
in `LandLord-legacy/src/main/java/biz/princeps/landlord/OwnedLand.java`
### Snippet
```java

        // Insert default flags.
        if (region.getFlags().size() == 0) {
            initFlags(owner);
            initRegionPriority();
```
## SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
### Snippet
```java

    private void setFarewell(Player player, String[] args, List<IOwnedLand> lands, int casy) {
        if (lands.size() == 0 || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
            return;
```
## SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/Manage.java`
### Snippet
```java

    private void setGreet(Player player, String[] args, List<IOwnedLand> lands, int casy) {
        if (lands.size() == 0 || lands.get(0) == null) {
            lm.sendMessage(player, lm.getString(player, "Commands.Manage.notOwnFreeLand"));
            return;
```
## SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/MultiListLands.java`
### Snippet
```java
                List<IOwnedLand> lands = new ArrayList<>(mode.getLandsOf(radius, sender.getLocation(), target.getUuid(), wg));

                if (lands.size() == 0) {
                    lm.sendMessage(sender, plugin.getLangManager().getString("Commands.MultiListLands.noLands"));
                    return;
```
## SizeReplaceableByIsEmpty
`lands.size() == 0` can be replaced with 'lands.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/management/ListLands.java`
### Snippet
```java
                List<IOwnedLand> lands = new ArrayList<>(plugin.getWGManager().getRegions(target.getUuid()));

                if (lands.size() == 0) {
                    lm.sendMessage(sender, plugin.getLangManager().getString("Commands.ListLands.noLands"));
                    return;
```
## SizeReplaceableByIsEmpty
`permissions.size() == 0` can be replaced with 'permissions.isEmpty()'
in `LandLord-core/src/main/java/biz/princeps/lib/command/MainCommand.java`
### Snippet
```java
     */
    public boolean hasPermission(CommandSender cs) {
        if (permissions.size() == 0) {
            return true;
        }
```
## NonProtectedConstructorInAbstractClass
Constructor `AOwnedLand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AOwnedLand.java`
### Snippet
```java
    protected final int chunkZ;

    public AOwnedLand(ILandLord plugin, World world, String name) {
        this.plugin = plugin;
        this.world = world;
```
## NonProtectedConstructorInAbstractClass
Constructor `AWorldGuardManager()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/protection/AWorldGuardManager.java`
### Snippet
```java
    protected final ILandLord plugin;

    public AWorldGuardManager(ILandLord plugin) {
        this.plugin = plugin;
    }
```
## NonProtectedConstructorInAbstractClass
Constructor `ACostManager()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/manager/cost/ACostManager.java`
### Snippet
```java
    protected final int free;

    public ACostManager(ILandLord plugin, int free, String namespace) {
        this.plugin = plugin;
        this.free = free;
```
## NonProtectedConstructorInAbstractClass
Constructor `AbstractGUI()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/gui/simple/AbstractGUI.java`
### Snippet
```java
     * @param mainMenu The superior menu
     */
    public AbstractGUI(Plugin plugin, Player player, int size, String title, AbstractGUI mainMenu) {
        this.plugin = plugin;
        this.player = player;
```
## NonProtectedConstructorInAbstractClass
Constructor `AbstractGUI()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/gui/simple/AbstractGUI.java`
### Snippet
```java
     * @param title  the name of the menu - ChatColor allowed!
     */
    public AbstractGUI(Plugin plugin, Player player, int size, String title) {
        this(plugin, player, size, title, null);
    }
```
## NonProtectedConstructorInAbstractClass
Constructor `AMultiTask()` of an abstract class should not be declared 'public'
in `LandLord-api/src/main/java/biz/princeps/landlord/api/AMultiTask.java`
### Snippet
```java
    protected final Deque<T> queue;

    public AMultiTask(ILandLord plugin, Collection<T> operations) {
        this.plugin = plugin;
        this.queue = new ArrayDeque<>(operations);
```
## NonProtectedConstructorInAbstractClass
Constructor `SubCommand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/command/SubCommand.java`
### Snippet
```java
    private final Set<String> aliases;

    public SubCommand(String name, String usage, Set<String> permissions, Set<String> aliases) {
        this.name = name;
        this.usage = usage;
```
## NonProtectedConstructorInAbstractClass
Constructor `AbstractItem()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/item/AbstractItem.java`
### Snippet
```java
     * @param glowing if the item should be glowing or not
     */
    public AbstractItem(String name, ItemStack stack, boolean glowing, boolean breakBlocks) {
        this.name = name;
        this.stack = PrincepsLib.crossVersion().addNBTTag(stack, "customItem", "true");
```
## NonProtectedConstructorInAbstractClass
Constructor `BasicListener()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/listener/BasicListener.java`
### Snippet
```java
    protected final ILandLord plugin;

    public BasicListener(ILandLord plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
```
## NonProtectedConstructorInAbstractClass
Constructor `MainCommand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/lib/command/MainCommand.java`
### Snippet
```java
     * @param aliases      the aliases which are also viable to trigger this command
     */
    public MainCommand(String name, String description, String usageMessage, Set<String> perms, String... aliases) {
        super(name, description, usageMessage, Arrays.asList(aliases));
        this.subCommandMap = new HashMap<>();
```
## NonProtectedConstructorInAbstractClass
Constructor `LandlordCommand()` of an abstract class should not be declared 'public'
in `LandLord-core/src/main/java/biz/princeps/landlord/commands/LandlordCommand.java`
### Snippet
```java
    protected final ILangManager lm;

    public LandlordCommand(ILandLord plugin, String name, String usage, Set<String> permissions, Set<String> aliases) {
        super(name, usage, permissions, aliases);
        this.plugin = plugin;
```
