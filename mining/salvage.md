# chrisliebaer/salvage
# Bad smells
I found 31 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantConditions | 13 | false |
| UnstableApiUsage | 13 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessarySemicolon | 1 | false |
| BusyWait | 1 | false |
| BoundedWildcard | 1 | false |
| RedundantSuppression | 1 | false |
## DynamicRegexReplaceableByCompiledPattern
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
		return duration.toString()
				.substring(2)
				.replaceAll("(\\d[HMS])(?!$)", "$1 ")
				.toLowerCase();
	}
```

## UnnecessarySemicolon
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			// instance worker pool for backup, which can be reused for all groups
			var hostMeta = new BackupMeta.HostMeta(System.currentTimeMillis(), configuration.hostname());
			try (var operation = new BackupOperation(docker, tide.maxConcurrent(), configuration.cranes().values(), hostMeta);) {
				// backup each group individually but in series
				for (int i = 0; i < groups.size(); i++) {
```

## BusyWait
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			log.info("waiting for next tide '{}' in '{}'", tide.name(), formatDuration(duration));
			try {
				Thread.sleep(duration.toMillis());
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
```

## ConstantConditions
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

## BoundedWildcard
### BoundedWildcard
Can generalize to `? super Frame`
in `src/main/java/de/chrisliebaer/salvage/entity/FrameCallback.java`
#### Snippet
```java
	private volatile Throwable error;
	
	public FrameCallback(Consumer<Frame> consumer) {
		this.consumer = consumer;
	}
```

## RedundantSuppression
### RedundantSuppression
Redundant suppression
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
	@ToString
	@SuppressWarnings("InnerClassFieldHidesOuterClassField") // really don't care about this
	public static class Group {
		
		@Getter private final List<SalvageContainer> containers = new ArrayList<>();
```

## UnstableApiUsage
### UnstableApiUsage
'com.google.common.graph.Traverser' is marked unstable with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
			var current = unvisited.remove(0);
```

### UnstableApiUsage
'forGraph(com.google.common.graph.SuccessorsFunction)' is declared in unstable class 'com.google.common.graph.Traverser' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
			var current = unvisited.remove(0);
```

### UnstableApiUsage
'com.google.common.graph.SuccessorsFunction' is marked unstable with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
			var current = unvisited.remove(0);
```

### UnstableApiUsage
'com.google.common.graph.SuccessorsFunction' is marked unstable with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		var unvisited = new ArrayList<>(graph.nodes());
		var groups = new ArrayList<Group>();
		var traversal = Traverser.forGraph((SuccessorsFunction<Node>) node -> graph.successors(node).stream().filter(successorFilter)::iterator);
		while (!unvisited.isEmpty()) {
			var current = unvisited.remove(0);
```

### UnstableApiUsage
'depthFirstPostOrder(N)' is declared in unstable class 'com.google.common.graph.Traverser' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
			
			var group = new Group();
			for (Node node : traversal.depthFirstPostOrder(current)) {
				node.add(group);
				unvisited.remove(node);
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
	}
	
	private ImmutableGraph<Node> buildGraph() {
		var builder = GraphBuilder.undirected().<Node>immutable();
		
```

### UnstableApiUsage
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
	
	private ImmutableGraph<Node> buildGraph() {
		var builder = GraphBuilder.undirected().<Node>immutable();
		
		// in project mode, nodes of same project will be connected via project node to force same group (in other modes, traversal will ignore edge)
```

### UnstableApiUsage
'undirected()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
	
	private ImmutableGraph<Node> buildGraph() {
		var builder = GraphBuilder.undirected().<Node>immutable();
		
		// in project mode, nodes of same project will be connected via project node to force same group (in other modes, traversal will ignore edge)
```

### UnstableApiUsage
'immutable()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
	
	private ImmutableGraph<Node> buildGraph() {
		var builder = GraphBuilder.undirected().<Node>immutable();
		
		// in project mode, nodes of same project will be connected via project node to force same group (in other modes, traversal will ignore edge)
```

### UnstableApiUsage
'putEdge(N, N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		// in project mode, nodes of same project will be connected via project node to force same group (in other modes, traversal will ignore edge)
		for (var container : containers) {
			container.project().ifPresent(s -> builder.putEdge(new ProjectNode(s), new ContainerNode(container)));
		}
		
```

### UnstableApiUsage
'putEdge(N, N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
			var containerNode = new ContainerNode(container);
			for (var volume : container.volumes()) {
				builder.putEdge(containerNode, new VolumeNode(volume));
			}
		}
```

### UnstableApiUsage
'addNode(N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
		// some volumes might not be used by any container, so we add them as well
		for (var volume : volumes.values())
			builder.addNode(new VolumeNode(volume));
		
		return builder.build();
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `src/main/java/de/chrisliebaer/salvage/grouping/BackupGrouping.java`
#### Snippet
```java
			builder.addNode(new VolumeNode(volume));
		
		return builder.build();
	}
	
```

