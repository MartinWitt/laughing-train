# salvage 
 
# Bad smells
I found 38 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 19 | false |
| UnstableApiUsage | 13 | false |
| NullableProblems | 5 | false |
| BusyWait | 1 | false |
## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
		if (verbose != null) {
			switch (verbose.toLowerCase(Locale.ROOT)) {
				case "true", "1", "yes" -> Configurator.reconfigure(SalvageMain.class.getClassLoader().getResource("log4j2-verbose.xml").toURI());
			}
			log.info("verbose logging enabled");
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
		
		// container might be part of compose project
		var project = Optional.ofNullable(labels.get(SalvageService.COMPOSE_LABEL_PROJECT));
		
		// parse user or fall back to container user
```

### DataFlowIssue
Dereference of `container.getMounts()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/entity/SalvageContainer.java`
#### Snippet
```java
		
		// note: not all used volumes might be part of tide
		for (var mount : container.getMounts()) {
			var volume = volumes.get(mount.getName());
			if (volume != null)
```

### DataFlowIssue
Argument `cl.getResourceAsStream("report-templates/discordVolumeSuccess.json")` might be null
in `src/main/java/de/chrisliebaer/salvage/reporting/WebhookReporter.java`
#### Snippet
```java
		try {
			var cl = WebhookReporter.class.getClassLoader();
			TEMPLATE_VOLUME_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeSuccess.json"));
			TEMPLATE_VOLUME_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeFailure.json"));
			TEMPLATE_TIDE_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideSuccess.json"));
```

### DataFlowIssue
Argument `cl.getResourceAsStream("report-templates/discordVolumeFailure.json")` might be null
in `src/main/java/de/chrisliebaer/salvage/reporting/WebhookReporter.java`
#### Snippet
```java
			var cl = WebhookReporter.class.getClassLoader();
			TEMPLATE_VOLUME_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeSuccess.json"));
			TEMPLATE_VOLUME_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeFailure.json"));
			TEMPLATE_TIDE_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideSuccess.json"));
			TEMPLATE_TIDE_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailure.json"));
```

### DataFlowIssue
Argument `cl.getResourceAsStream("report-templates/discordTideSuccess.json")` might be null
in `src/main/java/de/chrisliebaer/salvage/reporting/WebhookReporter.java`
#### Snippet
```java
			TEMPLATE_VOLUME_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeSuccess.json"));
			TEMPLATE_VOLUME_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeFailure.json"));
			TEMPLATE_TIDE_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideSuccess.json"));
			TEMPLATE_TIDE_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailure.json"));
			TEMPLATE_TIDE_FAILURE_WITH_VOLUMES = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailureWithVolumes.json"));
```

### DataFlowIssue
Argument `cl.getResourceAsStream("report-templates/discordTideFailure.json")` might be null
in `src/main/java/de/chrisliebaer/salvage/reporting/WebhookReporter.java`
#### Snippet
```java
			TEMPLATE_VOLUME_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordVolumeFailure.json"));
			TEMPLATE_TIDE_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideSuccess.json"));
			TEMPLATE_TIDE_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailure.json"));
			TEMPLATE_TIDE_FAILURE_WITH_VOLUMES = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailureWithVolumes.json"));
		} catch (IOException e) {
```

### DataFlowIssue
Argument `cl.getResourceAsStream("report-templates/discordTideFailureWithVolumes.json")` might be null
in `src/main/java/de/chrisliebaer/salvage/reporting/WebhookReporter.java`
#### Snippet
```java
			TEMPLATE_TIDE_SUCCESS = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideSuccess.json"));
			TEMPLATE_TIDE_FAILURE = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailure.json"));
			TEMPLATE_TIDE_FAILURE_WITH_VOLUMES = IOUtil.toString(cl.getResourceAsStream("report-templates/discordTideFailureWithVolumes.json"));
		} catch (IOException e) {
			throw new RuntimeException("Failed to load report templates", e);
```

### DataFlowIssue
Unboxing of `state.getRestarting()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			inspect = docker.inspectContainerCmd(container.id()).exec();
			var state = inspect.getState();
			if (state.getRestarting()) {
				log.debug("container {} is restarting, waiting {}ms ({} tries remaining)", container.name(), RETRY_DELAY, remainingRetries);
				Thread.sleep(RETRY_DELAY);
```

### DataFlowIssue
Unboxing of `inspect.getState().getRestarting()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			}
			
		} while (remainingRetries-- > 0 && (inspect.getState().getRestarting()));
		var state = inspect.getState();
		
```

### DataFlowIssue
Unboxing of `state.getRestarting()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		
		// abort, rather than perform backup with container in unknown state
		if (state.getRestarting()) {
			throw new IllegalStateException("container '" + container.name() + "' has not reached stable state after " + RETRY_COUNT + " retries");
		}
```

### DataFlowIssue
Unboxing of `state.getRunning()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		// run preperation command if container has one and is running (not paused)
		boolean preCommandRun = false;
		if (container.commandPre().isPresent() && state.getRunning() && !state.getPaused()) {
			var command = container.commandPre().get();
			log.debug("running preperation command '{}' on container {}", command, container.name());
```

### DataFlowIssue
Unboxing of `state.getPaused()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
		// run preperation command if container has one and is running (not paused)
		boolean preCommandRun = false;
		if (container.commandPre().isPresent() && state.getRunning() && !state.getPaused()) {
			var command = container.commandPre().get();
			log.debug("running preperation command '{}' on container {}", command, container.name());
```

### DataFlowIssue
Unboxing of `state.getRunning()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			case STOP -> {
				// container must be running and not paused, if it's not running at all, there is no need to stop it (but we must not start it again)
				if (state.getRunning()) {
					if (state.getPaused()) {
						throw new IllegalStateException("container '" + container.name() + "' is paused, cannot stop");
```

### DataFlowIssue
Unboxing of `state.getPaused()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
				// container must be running and not paused, if it's not running at all, there is no need to stop it (but we must not start it again)
				if (state.getRunning()) {
					if (state.getPaused()) {
						throw new IllegalStateException("container '" + container.name() + "' is paused, cannot stop");
					}
```

### DataFlowIssue
Unboxing of `state.getRunning()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			case PAUSE -> {
				// if container is running, we need to pause it (otherwise we don't need to do anything)
				if (state.getRunning() && !state.getPaused()) {
					log.debug("pausing container {}", container.name());
					docker.pauseContainerCmd(container.id()).exec();
```

### DataFlowIssue
Unboxing of `state.getPaused()` may produce `NullPointerException`
in `src/main/java/de/chrisliebaer/salvage/StateTransaction.java`
#### Snippet
```java
			case PAUSE -> {
				// if container is running, we need to pause it (otherwise we don't need to do anything)
				if (state.getRunning() && !state.getPaused()) {
					log.debug("pausing container {}", container.name());
					docker.pauseContainerCmd(container.id()).exec();
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/de/chrisliebaer/salvage/SalvageService.java`
#### Snippet
```java
			try {
				// to prevent double execution, we add 5 seconds to the duration
				Thread.sleep(Math.max(duration.toMillis(), 0) + TIDE_CLOCK_WAIT);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
			
			@Override
			public void failed(Service.State from, Throwable failure) {
				log.error("salvage service encountered error", failure);
				System.exit(-1);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
			
			@Override
			public void failed(Service.State from, Throwable failure) {
				log.error("salvage service encountered error", failure);
				System.exit(-1);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
			
			@Override
			public void terminated(Service.State from) {
				log.info("salvage service terminated (was: {})", from);
				System.exit(0);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/de/chrisliebaer/salvage/SalvageMain.java`
#### Snippet
```java
			
			@Override
			public void stopping(Service.State from) {
				log.info("salvage service stopping (was: {})", from);
			}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/de/chrisliebaer/salvage/BackupOperation.java`
#### Snippet
```java
			
			@Override
			public Thread newThread(Runnable r) {
				var t = new Thread(r, "CraneShip" + counter++);
				t.setDaemon(true);
```

## RuleId[id=UnstableApiUsage]
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

