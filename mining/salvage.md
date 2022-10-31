# chrisliebaer/salvage
# Bad smells
I found 98 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicateStringLiteralInspection | 20 | false |
| CollectionsMustHaveInitialCapacity | 15 | false |
| TypeMayBeWeakened | 15 | false |
| ConstantConditions | 13 | false |
| LengthOneStringsInConcatenation | 8 | false |
| ClassWithoutLogger | 8 | false |
| MethodCallInLoopCondition | 7 | false |
| ImplicitNumericConversion | 4 | false |
| DeclareCollectionAsInterface | 3 | false |
| CallToSuspiciousStringMethod | 3 | false |
| UnusedReturnValue | 1 | false |
| AnonymousClassComplexity | 1 | false |
## DuplicateStringLiteralInspection
### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageTide'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
		var cronExpression = labels.get(prefix + LABEL_TIDE_CRON_SUFFIX);
		if (cronExpression == null)
			throw new IllegalArgumentException("tried to construct tide '" + name + "', but no cron expression was found");
		var cron = UNIX_CRONTAB_PARSER.parse(cronExpression).validate();
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageTide'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
		var craneName = labels.get(prefix + LABEL_TIDE_CRANE_SUFFIX);
		if (craneName == null)
			throw new IllegalArgumentException("tried to construct tide '" + name + "', but no crane image was specified");
		
		var crane = cranes.get(craneName);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageTide'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
		var crane = cranes.get(craneName);
		if (crane == null)
			throw new IllegalArgumentException("tried to construct tide '" + name + "', but crane '" + craneName + "' is not known");
		
		var grouping = labels.get(prefix + LABEL_TIDE_GROUPING_SUFFIX);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageTide'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
		var grouping = labels.get(prefix + LABEL_TIDE_GROUPING_SUFFIX);
		if (grouping == null)
			throw new IllegalArgumentException("tried to construct tide '" + name + "', but no grouping mode was specified");
		
		int maxConcurrent = Integer.MAX_VALUE;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageTide'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
				maxConcurrent = Integer.parseInt(s);
		} catch (NumberFormatException ignore) {
			throw new IllegalArgumentException("tried to construct tide '" + name + "', but maxConcurrent is not a number");
		}
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageCrane'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
	private static final String LABEL_TIDE_GROUPING_SUFFIX = ".grouping";
	private static final String LABEL_TIDE_CRANE_SUFFIX = ".crane";
	private static final String LABEL_TIDE_MAX_CONCURRENT_SUFFIX = ".maxConcurrent";
	
	public static SalvageTide fromLabels(String name, String prefix, Map<String, String> labels, HashMap<String, SalvageCrane> cranes) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageVessel'
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
			// if we succeeded to remove the container, we rethrow the original exception
			log.debug("backup of '{}' failed but we still managed to remove crane container '{}'", volume.name(), container.getId());
			throw new RuntimeException("backup of volume '" + volume.name() + "' failed", e);
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageVessel'
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
		var statusCode = waitCallback.awaitStatusCode();
		if (statusCode != 0) {
			throw new RuntimeException("backup of volume '" + volume + "' failed with exit code " + statusCode);
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.BackupOperation', 'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
							try {
								log.info("starting backup for volume '{}' on crane '{}'", volume.name(), crane.name());
								ThreadContext.put("volume", volume.name());
								backupVolume(volume, crane);
							} finally {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.BackupOperation', 'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
									lock.notifyAll();
								}
								ThreadContext.remove("volume");
							}
							return null;
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.entity.SalvageTide'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageCrane.java`
#### Snippet
```java
	private static final String LABEL_SALVAGE_ENV = ".env.";
	private static final String LABEL_SALVAGE_MOUNT = ".mount.";
	private static final String LABEL_SALVAGE_MAX_CONCURRENT = ".maxConcurrent";
	
	public static SalvageCrane fromLabels(String name, String prefix, Map<String, String> labels) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.StateTransaction'
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		// abort, rather than perform backup with container in unknown state
		if (state.getRestarting()) {
			throw new IllegalStateException("container '" + container.id() + "' has not reached stable state after " + RETRY_COUNT + " retries");
		}
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.StateTransaction'
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
				if (state.getRunning()) {
					if (state.getPaused()) {
						throw new IllegalStateException("container '" + container.id() + "' is paused, cannot stop");
					}
					log.debug("stopping container {}", container.id());
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
		try {
			for (var container : containers) {
				ThreadContext.put("container", container.id());
				log.debug("preparing container {} for backup", container.id());
				transaction.prepare(container);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} catch (Throwable e) {
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} catch (Throwable e) {
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} finally {
			ThreadContext.remove("container");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} finally {
			ThreadContext.remove("container");
		}
		
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
		for (var container : containers) {
			try {
				ThreadContext.put("container", container.id());
				log.debug("restoring container {} to previous state", container.id());
				transaction.restore(container);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.SalvageService'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
				log.warn("failed to restore post backup state for tide '{}' and container '{}'", tide.name(), container.id(), e);
			} finally {
				ThreadContext.remove("container");
			}
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'de.chrisliebaer.salvage.BackupOperation'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			// identify container depending to these volumes
			var containers = docker.listContainersCmd()
					.withFilter("volume", volumes.keySet()).exec().stream()
					.map(c -> docker.inspectContainerCmd(c.getId()).exec())
					.map(c -> SalvageContainer.fromContainer(c, volumes))
```

## UnusedReturnValue
### UnusedReturnValue
Return value of the method is never used
in `src/main/java/de/chrisliebaer/salvage/entity/ContainerCommand.java`
#### Snippet
```java
public record ContainerCommand(List<String> command, String user) {
	
	public long run(DockerClient client, SalvageContainer container) throws Throwable {
		// check container config to see how to run command
		var dockerContainer = client.inspectContainerCmd(container.id()).exec();
```

## AnonymousClassComplexity
### AnonymousClassComplexity
Overly complex anonymous class (cyclomatic complexity = 5)
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
		
		var service = new SalvageService();
		service.addListener(new Service.Listener() {
			@Override
			public void starting() {
```

## DeclareCollectionAsInterface
### DeclareCollectionAsInterface
Declaration of `HashMap` should probably be weakened to 'java.util.Map'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
	private static final String LABEL_TIDE_MAX_CONCURRENT_SUFFIX = ".maxConcurrent";
	
	public static SalvageTide fromLabels(String name, String prefix, Map<String, String> labels, HashMap<String, SalvageCrane> cranes) {
		var cronExpression = labels.get(prefix + LABEL_TIDE_CRON_SUFFIX);
		if (cronExpression == null)
```

### DeclareCollectionAsInterface
Declaration of `ArrayList` should probably be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
	public void backupVolumes(SalvageCrane crane, Collection<SalvageVolume> volumes) {
		var remaining = new ArrayList<>(volumes);
		ArrayList<Future<Void>> futures = new ArrayList<>();
		var completionService = new ExecutorCompletionService<Void>(executor);
		var taskCounter = 0;
```

### DeclareCollectionAsInterface
Declaration of `HashMap` should probably be weakened to 'java.util.Map'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java

@Slf4j
public record SalvageConfiguration(String hostname, String ownContainerId, List<SalvageTide> tides, HashMap<String, SalvageCrane> cranes) {
	
	private static final String ENV_HOSTNAME = "MACHINE";
```

## CollectionsMustHaveInitialCapacity
### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
		
		// WARNING: docker-java is a dumpsterfire and completly misunderstands how volumes and binds work, the following code is correct
		var binds = new ArrayList<Bind>();
		
		// mount volume as ro for backup
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
	
	private static List<String> prepareEnv(Map<String, String> env) {
		var result = new ArrayList<String>();
		for (var entry : env.entrySet())
			result.add(entry.getKey() + "=" + entry.getValue());
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
	public void backupVolumes(SalvageCrane crane, Collection<SalvageVolume> volumes) {
		var remaining = new ArrayList<>(volumes);
		ArrayList<Future<Void>> futures = new ArrayList<>();
		var completionService = new ExecutorCompletionService<Void>(executor);
		var taskCounter = 0;
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
	
	public static SalvageContainer fromContainer(InspectContainerResponse container, Map<String, SalvageVolume> volumes) {
		var usedVolumes = new ArrayList<SalvageVolume>();
		var labels = container.getConfig().getLabels();
		
```

### CollectionsMustHaveInitialCapacity
`new IdentityHashMap<>()` without initial capacity
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
	
	private final DockerClient docker;
	private final Map<SalvageContainer, AffectedContainer> affectedContainers = new IdentityHashMap<>();
	
	@Override
```

### CollectionsMustHaveInitialCapacity
`new HashMap`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageCrane.java`
#### Snippet
```java
			throw new IllegalArgumentException("tried to construct crane '" + name + "', but no image was specified");
		
		var env = new HashMap<String, String>();
		var mounts = new HashMap<String, String>();
		
```

### CollectionsMustHaveInitialCapacity
`new HashMap`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageCrane.java`
#### Snippet
```java
		
		var env = new HashMap<String, String>();
		var mounts = new HashMap<String, String>();
		
		for (var entry : labels.entrySet()) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
	public static class Group {
		
		@Getter private final List<SalvageContainer> containers = new ArrayList<>();
		@Getter private final List<SalvageVolume> volumes = new ArrayList<>();
		
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		// traverse graph starting at volume nodes
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		
		@Getter private final List<SalvageContainer> containers = new ArrayList<>();
		@Getter private final List<SalvageVolume> volumes = new ArrayList<>();
		
		private void addContainer(SalvageContainer container) {
```

### CollectionsMustHaveInitialCapacity
`new HashSet`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		
		// index labels
		var tideNames = new HashSet<String>();
		var craneNames = new HashSet<String>();
		for (var key : labels.keySet()) {
```

### CollectionsMustHaveInitialCapacity
`new HashSet`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		// index labels
		var tideNames = new HashSet<String>();
		var craneNames = new HashSet<String>();
		for (var key : labels.keySet()) {
			if (key.startsWith(LABEL_SALVAGE_TIDE_PREFIX)) {
```

### CollectionsMustHaveInitialCapacity
`new HashMap`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		
		// load crane configs
		var cranes = new HashMap<String, SalvageCrane>();
		for (var craneName : craneNames) {
			var crane = SalvageCrane.fromLabels(craneName, LABEL_SALVAGE_CRANE_PREFIX + craneName, labels);
```

### CollectionsMustHaveInitialCapacity
`new ArrayList`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		
		// load tide configs
		var tides = new ArrayList<SalvageTide>();
		for (var tideName : tideNames) {
			var tide = SalvageTide.fromLabels(tideName, LABEL_SALVAGE_TIDE_PREFIX + tideName, labels, cranes);
```

### CollectionsMustHaveInitialCapacity
`new HashMap`() without initial capacity
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
	private static Map<String, SalvageVolume> getVolumeNamesForTide(DockerClient docker, SalvageTide tide) {
		var tideLabel = LABEL_CONTAINER_TIDE_MAP_PREFIX + tide.name();
		var map = new HashMap<String, SalvageVolume>();
		
		// check for volumes that are mapped to tide via container labels
```

## ConstantConditions
### ConstantConditions
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
		
		// container might be part of compose project
		var project = Optional.ofNullable(labels.get(SalvageService.COMPOSE_LABEL_PROJECT));
		
		// parse user or fall back to container user
```

### ConstantConditions
Dereference of `container.getMounts()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
		
		// note: not all used volumes might be part of tide
		for (var mount : container.getMounts()) {
			var volume = volumes.get(mount.getName());
			if (volume != null)
```

### ConstantConditions
Argument `config.getEnv()` might be null
in `src/main/java/de/chrisliebaer/salvage/entity/ContainerCommand.java`
#### Snippet
```java
				.withAttachStderr(true)
				.withAttachStdin(false)
				.withEnv(Arrays.asList(config.getEnv()))
				.withUser(user)
				.withPrivileged(dockerContainer.getHostConfig().getPrivileged())
```

### ConstantConditions
Unboxing of `state.getRestarting()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			inspect = docker.inspectContainerCmd(container.id()).exec();
			var state = inspect.getState();
			if (state.getRestarting()) {
				log.debug("container {} is restarting, waiting {}ms ({} tries remaining)", container.id(), RETRY_DELAY, remainingRetries);
				Thread.sleep(RETRY_DELAY);
```

### ConstantConditions
Unboxing of `inspect.getState().getRestarting()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			}
			
		} while (remainingRetries-- > 0 && (inspect.getState().getRestarting()));
		var state = inspect.getState();
		
```

### ConstantConditions
Unboxing of `state.getRestarting()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		
		// abort, rather than perform backup with container in unknown state
		if (state.getRestarting()) {
			throw new IllegalStateException("container '" + container.id() + "' has not reached stable state after " + RETRY_COUNT + " retries");
		}
```

### ConstantConditions
Unboxing of `state.getRunning()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		// run preperation command if container has one and is running (not paused)
		boolean preCommandRun = false;
		if (container.commandPre().isPresent() && state.getRunning() && !state.getPaused()) {
			var command = container.commandPre().get();
			log.debug("running preperation command '{}' on container {}", command, container.id());
```

### ConstantConditions
Unboxing of `state.getPaused()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		// run preperation command if container has one and is running (not paused)
		boolean preCommandRun = false;
		if (container.commandPre().isPresent() && state.getRunning() && !state.getPaused()) {
			var command = container.commandPre().get();
			log.debug("running preperation command '{}' on container {}", command, container.id());
```

### ConstantConditions
Unboxing of `state.getRunning()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			case STOP -> {
				// container must ne running and not paused, if it's not running at all, there is no need to stop it (but we must not start it again)
				if (state.getRunning()) {
					if (state.getPaused()) {
						throw new IllegalStateException("container '" + container.id() + "' is paused, cannot stop");
```

### ConstantConditions
Unboxing of `state.getPaused()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
				// container must ne running and not paused, if it's not running at all, there is no need to stop it (but we must not start it again)
				if (state.getRunning()) {
					if (state.getPaused()) {
						throw new IllegalStateException("container '" + container.id() + "' is paused, cannot stop");
					}
```

### ConstantConditions
Unboxing of `state.getRunning()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			case PAUSE -> {
				// if container is running, we need to pause it (otherwise we don't need to do anything)
				if (state.getRunning() && !state.getPaused()) {
					log.debug("pausing container {}", container.id());
					docker.pauseContainerCmd(container.id()).exec();
```

### ConstantConditions
Unboxing of `state.getPaused()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			case PAUSE -> {
				// if container is running, we need to pause it (otherwise we don't need to do anything)
				if (state.getRunning() && !state.getPaused()) {
					log.debug("pausing container {}", container.id());
					docker.pauseContainerCmd(container.id()).exec();
```

### ConstantConditions
Method invocation `keySet` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		var tideNames = new HashSet<String>();
		var craneNames = new HashSet<String>();
		for (var key : labels.keySet()) {
			if (key.startsWith(LABEL_SALVAGE_TIDE_PREFIX)) {
				var tide = key.substring(LABEL_SALVAGE_TIDE_PREFIX.length());
```

## LengthOneStringsInConcatenation
### LengthOneStringsInConcatenation
`"="` can be replaced with '='
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
		var result = new ArrayList<String>();
		for (var entry : env.entrySet())
			result.add(entry.getKey() + "=" + entry.getValue());
		return result;
	}
```

### LengthOneStringsInConcatenation
`"'"` can be replaced with '''
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
			return CommandLineUtils.translateCommandline(command);
		} catch (Exception e) {
			throw new RuntimeException("failed to parse arguments in '" + command + "'", e);
		}
	}
```

### LengthOneStringsInConcatenation
`"'"` can be replaced with '''
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
				command.run(docker, container);
			} catch (Throwable e) {
				throw new IllegalStateException("preperation command '" + command + "' failed on container '" + container.id() + "'", e);
			}
			
```

### LengthOneStringsInConcatenation
`"="` can be replaced with '='
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
					var volumes = docker.listVolumesCmd()
							.withFilter("label", List.of(
									COMPOSE_LABEL_PROJECT + "=" + project,
									COMPOSE_LABEL_VOLUME + "=" + volumeName
							))
```

### LengthOneStringsInConcatenation
`"="` can be replaced with '='
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
							.withFilter("label", List.of(
									COMPOSE_LABEL_PROJECT + "=" + project,
									COMPOSE_LABEL_VOLUME + "=" + volumeName
							))
							.exec().getVolumes();
```

### LengthOneStringsInConcatenation
`"'"` can be replaced with '''
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} catch (Throwable e) {
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
```

### LengthOneStringsInConcatenation
`"'"` can be replaced with '''
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} catch (Throwable e) {
			throw new IllegalStateException("failed to establish pre backup state for tide '" + tide.name() + "'", e);
		} finally {
			ThreadContext.remove("container");
```

### LengthOneStringsInConcatenation
`"'"` can be replaced with '''
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			callback.awaitCompletion();
		} catch (NotFoundException e) {
			throw new IllegalStateException("failed to pull image '" + crane.image() + "' for crane '" + crane.name() + "'", e);
		}
	}
```

## ImplicitNumericConversion
### ImplicitNumericConversion
Implicit numeric conversion of `jsonBytes.length` from 'int' to 'long'
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
			entry.setGroupId(ROOT_GID);
			entry.setMode(MODE_WORLD_READABLE);
			entry.setSize(jsonBytes.length);
			tar.putArchiveEntry(entry);
			tar.write(jsonBytes);
```

### ImplicitNumericConversion
Implicit numeric conversion of `RETRY_DELAY` from 'int' to 'long'
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			if (state.getRestarting()) {
				log.debug("container {} is restarting, waiting {}ms ({} tries remaining)", container.id(), RETRY_DELAY, remainingRetries);
				Thread.sleep(RETRY_DELAY);
			} else {
				break;
```

### ImplicitNumericConversion
Implicit numeric conversion of `'.'` from 'char' to 'int'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
			if (key.startsWith(LABEL_SALVAGE_TIDE_PREFIX)) {
				var tide = key.substring(LABEL_SALVAGE_TIDE_PREFIX.length());
				tide = tide.substring(0, tide.indexOf('.'));
				tideNames.add(tide);
			} else if (key.startsWith(LABEL_SALVAGE_CRANE_PREFIX)) {
```

### ImplicitNumericConversion
Implicit numeric conversion of `'.'` from 'char' to 'int'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
			} else if (key.startsWith(LABEL_SALVAGE_CRANE_PREFIX)) {
				var crane = key.substring(LABEL_SALVAGE_CRANE_PREFIX.length());
				crane = crane.substring(0, crane.indexOf('.'));
				craneNames.add(crane);
			}
```

## TypeMayBeWeakened
### TypeMayBeWeakened
Type of parameter `cranes` may be weakened to 'java.util.Map'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
	private static final String LABEL_TIDE_MAX_CONCURRENT_SUFFIX = ".maxConcurrent";
	
	public static SalvageTide fromLabels(String name, String prefix, Map<String, String> labels, HashMap<String, SalvageCrane> cranes) {
		var cronExpression = labels.get(prefix + LABEL_TIDE_CRON_SUFFIX);
		if (cronExpression == null)
```

### TypeMayBeWeakened
Type of variable `binds` may be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
		
		// WARNING: docker-java is a dumpsterfire and completly misunderstands how volumes and binds work, the following code is correct
		var binds = new ArrayList<Bind>();
		
		// mount volume as ro for backup
```

### TypeMayBeWeakened
Type of variable `env` may be weakened to 'java.util.Map'
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
	
	public void start() {
		var env = new HashMap<>(crane.env());
		env.put(CRANE_ENV_MACHINE_NAME, meta.hostMeta().host());
		env.put(CRANE_ENV_CRANE_NAME, meta.crane());
```

### TypeMayBeWeakened
Type of variable `result` may be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
	
	private static List<String> prepareEnv(Map<String, String> env) {
		var result = new ArrayList<String>();
		for (var entry : env.entrySet())
			result.add(entry.getKey() + "=" + entry.getValue());
```

### TypeMayBeWeakened
Type of variable `remaining` may be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
	
	public void backupVolumes(SalvageCrane crane, Collection<SalvageVolume> volumes) {
		var remaining = new ArrayList<>(volumes);
		ArrayList<Future<Void>> futures = new ArrayList<>();
		var completionService = new ExecutorCompletionService<Void>(executor);
```

### TypeMayBeWeakened
Type of variable `futures` may be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
	public void backupVolumes(SalvageCrane crane, Collection<SalvageVolume> volumes) {
		var remaining = new ArrayList<>(volumes);
		ArrayList<Future<Void>> futures = new ArrayList<>();
		var completionService = new ExecutorCompletionService<Void>(executor);
		var taskCounter = 0;
```

### TypeMayBeWeakened
Type of variable `completionService` may be weakened to 'java.util.concurrent.CompletionService'
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
		var remaining = new ArrayList<>(volumes);
		ArrayList<Future<Void>> futures = new ArrayList<>();
		var completionService = new ExecutorCompletionService<Void>(executor);
		var taskCounter = 0;
		while (!remaining.isEmpty()) {
```

### TypeMayBeWeakened
Type of variable `service` may be weakened to 'com.google.common.util.concurrent.Service'
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
	public static void main(String[] args) {
		
		var service = new SalvageService();
		service.addListener(new Service.Listener() {
			@Override
```

### TypeMayBeWeakened
Type of parameter `prefix` may be weakened to 'java.lang.CharSequence'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageCrane.java`
#### Snippet
```java
	private static final String LABEL_SALVAGE_MAX_CONCURRENT = ".maxConcurrent";
	
	public static SalvageCrane fromLabels(String name, String prefix, Map<String, String> labels) {
		var image = labels.get(prefix + LABEL_SALVAGE_IMAGE_SUFFIX);
		if (image == null)
```

### TypeMayBeWeakened
Type of variable `containerNode` may be weakened to 'de.chrisliebaer.salvage.grouping.BackupGrouping.Node'
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		// add volume dependencies between containers and volumes
		for (var container : containers) {
			var containerNode = new ContainerNode(container);
			for (var volume : container.volumes()) {
				builder.putEdge(containerNode, new VolumeNode(volume));
```

### TypeMayBeWeakened
Type of variable `unvisited` may be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		
		// traverse graph starting at volume nodes
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
```

### TypeMayBeWeakened
Type of variable `groups` may be weakened to 'java.util.List'
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		// traverse graph starting at volume nodes
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
```

### TypeMayBeWeakened
Type of variable `tideNames` may be weakened to 'java.util.Set'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		
		// index labels
		var tideNames = new HashSet<String>();
		var craneNames = new HashSet<String>();
		for (var key : labels.keySet()) {
```

### TypeMayBeWeakened
Type of variable `craneNames` may be weakened to 'java.util.Set'
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageConfiguration.java`
#### Snippet
```java
		// index labels
		var tideNames = new HashSet<String>();
		var craneNames = new HashSet<String>();
		for (var key : labels.keySet()) {
			if (key.startsWith(LABEL_SALVAGE_TIDE_PREFIX)) {
```

### TypeMayBeWeakened
Type of variable `map` may be weakened to 'java.util.Map'
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
	private static Map<String, SalvageVolume> getVolumeNamesForTide(DockerClient docker, SalvageTide tide) {
		var tideLabel = LABEL_CONTAINER_TIDE_MAP_PREFIX + tide.name();
		var map = new HashMap<String, SalvageVolume>();
		
		// check for volumes that are mapped to tide via container labels
```

## MethodCallInLoopCondition
### MethodCallInLoopCondition
Call to method `isEmpty()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
		var completionService = new ExecutorCompletionService<Void>(executor);
		var taskCounter = 0;
		while (!remaining.isEmpty()) {
			
			boolean craneFound = false;
```

### MethodCallInLoopCondition
Call to method `getState()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			}
			
		} while (remainingRetries-- > 0 && (inspect.getState().getRestarting()));
		var state = inspect.getState();
		
```

### MethodCallInLoopCondition
Call to method `getRestarting()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			}
			
		} while (remainingRetries-- > 0 && (inspect.getState().getRestarting()));
		var state = inspect.getState();
		
```

### MethodCallInLoopCondition
Call to method `isEmpty()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
			var current = unvisited.remove(0);
			if (!(current instanceof VolumeNode))
```

### MethodCallInLoopCondition
Call to method `interrupted()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
	private void loop() {
		
		while (!Thread.interrupted()) {
			
			var maybeTide = getNextExecutionTide();
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			log.info("grouping tide into {} waves", groups.size());
			if (log.isDebugEnabled()) {
				for (int i = 0; i < groups.size(); i++) {
					var group = groups.get(i);
					log.debug("\t- group no. {} with {} containers and {} volumes:", i, group.containers().size(), group.volumes().size());
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			try (var operation = new BackupOperation(docker, tide.maxConcurrent(), configuration.cranes().values(), hostMeta);) {
				// backup each group individually but in series
				for (int i = 0; i < groups.size(); i++) {
					BackupGrouping.Group group = groups.get(i);
					log.info("starting backup of group no. {} with {} containers and {} volumes", i, group.containers().size(), group.volumes().size());
```

## CallToSuspiciousStringMethod
### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/de/chrisliebaer/salvage/SalvageVessel.java`
#### Snippet
```java
				.withFollowStream(true)
				.exec(new FrameCallback(frame -> {
					var line = new String(frame.getPayload(), StandardCharsets.UTF_8).trim();
					log.debug("[{}@{}] {}", volume.name(), crane.name(), line);
				}));
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/de/chrisliebaer/salvage/entity/ContainerCommand.java`
#### Snippet
```java
				.withDetach(false) // always stay attached so we get to know when process exits
				.exec(new FrameCallback(frame -> {
					var line = new String(frame.getPayload(), StandardCharsets.UTF_8).trim();
					log.trace("[exec] {}", line);
				}));
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			
			// remove ourself, since we never want to touch our own container (only happens if user is actually stupid)
			containers.removeIf(c -> c.id().equals(ownContainerId));
			
			log.info("found {} containers depending on tide '{}'", containers.size(), tide.name());
```

## ClassWithoutLogger
### ClassWithoutLogger
Class `FrameCallback` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/FrameCallback.java`
#### Snippet
```java
 * Callback handler for consuming log frames. Allows to perform blocking operations on the started execution.
 */
public class FrameCallback implements ResultCallback<Frame> {
	
	private final Consumer<Frame> consumer;
```

### ClassWithoutLogger
Class `SalvageTide` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageTide.java`
#### Snippet
```java
 * @param maxConcurrent Maximum number of backups that will be executed at the same time, regardless of crane capacities.
 */
public record SalvageTide(String name, SalvageCrane crane, GroupingMode groupingMode, Cron cron, int maxConcurrent) {
	
	private static final CronParser UNIX_CRONTAB_PARSER = new CronParser(CronDefinitionBuilder.instanceDefinitionFor(CronType.UNIX));
```

### ClassWithoutLogger
Class `SalvageContainer` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
import java.util.Optional;

public record SalvageContainer(String id, Optional<String> project, List<SalvageVolume> volumes,
							   ContainerAction action, Optional<ContainerCommand> commandPre, Optional<ContainerCommand> commandPost) {
	
```

### ClassWithoutLogger
Class `SalvageVolume` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageVolume.java`
#### Snippet
```java
import com.github.dockerjava.api.command.InspectVolumeResponse;

public record SalvageVolume(String name, BackupMeta.VolumeMeta meta) {
	
	private static final String LABEL_VOLUME_TIDE_NAME = "salvage.tide";
```

### ClassWithoutLogger
Class `BackupMeta` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/BackupMeta.java`
#### Snippet
```java
 */

public record BackupMeta(HostMeta hostMeta, VolumeMeta volumeMeta, String crane, String image) {
	
	public record HostMeta(long timestamp, String host) {
```

### ClassWithoutLogger
Class `ContainerCommand` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/ContainerCommand.java`
#### Snippet
```java
 */
@Log4j2
public record ContainerCommand(List<String> command, String user) {
	
	public long run(DockerClient client, SalvageContainer container) throws Throwable {
```

### ClassWithoutLogger
Class `SalvageCrane` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageCrane.java`
#### Snippet
```java
import java.util.Map;

public record SalvageCrane(String name, String image, Map<String, String> env, Map<String, String> mounts, int maxConcurrent) {
	
	private static final String LABEL_SALVAGE_IMAGE_SUFFIX = ".image";
```

### ClassWithoutLogger
Class `SalvageService` does not declare a logger
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java

@Log4j2
public class SalvageService extends AbstractService {
	
	public static final String SALVAGE_ENTITY_LABEL = "salvage.entity";
```

