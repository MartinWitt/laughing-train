# concurrency-loadbalancer 
 
# Bad smells
I found 69 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 42 | false |
| JavadocDeclaration | 8 | false |
| FieldMayBeFinal | 7 | false |
| NullableProblems | 3 | false |
| SuspiciousMethodCalls | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DoubleCheckedLocking | 1 | false |
| DanglingJavadoc | 1 | false |
## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `window`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/LifespanTracker.java`
#### Snippet
```java

        if (window.windowId < windowId) {
            synchronized (window) {
                if (window.windowId < windowId) {
                    toBePurged.addAndGet(window.count.getAndSet(n));
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `newBuilder` in enum 'SubStrategy'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/SubStrategy.java`
#### Snippet
```java
    LeastTime(() -> LatencyTaskConcurrency.newBuilder());

    private Supplier<TaskConcurrency.Builder> newBuilder;

    SubStrategy(Supplier<TaskConcurrency.Builder> newBuilder) {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.ArrayConcurrencyLoadBalancer' to 'com.uber.concurrency.loadbalancer.ArrayConcurrencyLoadBalancer'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
                }
            }
            return new ArrayConcurrencyLoadBalancer(tasks, taskConcurrencyMap, groupSize, listeners, scheduledCounterBuilder.getTicker());
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayConcurrencyLoadBalancer(Collection, Function\>, int, List\>, Ticker)' as a member of raw type 'com.uber.concurrency.loadbalancer.ArrayConcurrencyLoadBalancer'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
                }
            }
            return new ArrayConcurrencyLoadBalancer(tasks, taskConcurrencyMap, groupSize, listeners, scheduledCounterBuilder.getTicker());
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.ArrayConcurrencyLoadBalancer.TaskGroup\[\]' to 'com.uber.concurrency.loadbalancer.ArrayConcurrencyLoadBalancer.TaskGroup\[\]'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        WeightedSelector.WeightedSelectorBuilder<TaskGroup<T>> builder = WeightedSelector.newBuilder();
        int numTaskGroups = tasks.size() / groupSize + ( tasks.size() % groupSize == 0 ? 0 : 1 );
        TaskGroup<T>[] taskGroups = new TaskGroup[numTaskGroups];
        for (int i = 0 ; i < numTaskGroups ; ++i) {
            taskGroups[i] = new TaskGroup<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
            return null;
        }
        TaskConcurrency<T> leastTaskConcurrency = LEAST_TASK_CONCURRENCY;
        ReservoirSampler<TaskConcurrency<T>> sampler = new ReservoirSampler<>();
        for(TaskConcurrency<T> taskConcurrency : taskGroup) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ConcurrentTaskImpl' to 'com.uber.concurrency.loadbalancer.CompletableTask'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
            return null; // no tasks or all tasks reached concurrency limits
        }
        return new ConcurrentTaskImpl(ticker.read(), result);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        public TaskConcurrency<T> apply(T t) {
            Objects.requireNonNull(t);
            return taskToTaskConcurrency.computeIfAbsent(t, o -> new ScheduledTaskConcurrency<>(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ScheduledTaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        public TaskConcurrency<T> apply(T t) {
            Objects.requireNonNull(t);
            return taskToTaskConcurrency.computeIfAbsent(t, o -> new ScheduledTaskConcurrency<>(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ScheduledTaskConcurrency(TaskConcurrency, Builder)' as a member of raw type 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ScheduledTaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        public TaskConcurrency<T> apply(T t) {
            Objects.requireNonNull(t);
            return taskToTaskConcurrency.computeIfAbsent(t, o -> new ScheduledTaskConcurrency<>(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'build(T)' as a member of raw type 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency.Builder'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        public TaskConcurrency<T> apply(T t) {
            Objects.requireNonNull(t);
            return taskToTaskConcurrency.computeIfAbsent(t, o -> new ScheduledTaskConcurrency<>(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer.TaskConcurrencyQueue.HeapTaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            @Override
            public void acquire() {
                syncUpdate(this, ()->super.acquire());
            }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ConcurrentTaskImpl' to 'com.uber.concurrency.loadbalancer.CompletableTask'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            return null; // no tasks or all tasks reached concurrency limits
        }
        return new ConcurrentTaskImpl(ticker.read(), taskConcurrency);
    };

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer.TaskConcurrencyQueue.HeapTaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            @Override
            public void complete(boolean succeed, Duration latency) {
                syncUpdate(this, ()->super.complete(succeed, latency));
            }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer.TaskConcurrencyQueue.HeapTaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            @Override
            public void syncState() {
                syncUpdate(this, ()->super.syncState());
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer.TaskConcurrencyQueue.HeapTaskConcurrency' to 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            this.tasks = ImmutableList.copyOf(tasks);
            for (T t : tasks) {
                TaskConcurrency<T> task = new HeapTaskConcurrency(new ScheduledTaskConcurrency(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
                queue.offer(task);
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ScheduledTaskConcurrency' to 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ScheduledTaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            this.tasks = ImmutableList.copyOf(tasks);
            for (T t : tasks) {
                TaskConcurrency<T> task = new HeapTaskConcurrency(new ScheduledTaskConcurrency(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
                queue.offer(task);
            }
```

### UNCHECKED_WARNING
Unchecked call to 'ScheduledTaskConcurrency(TaskConcurrency, Builder)' as a member of raw type 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.ScheduledTaskConcurrency'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            this.tasks = ImmutableList.copyOf(tasks);
            for (T t : tasks) {
                TaskConcurrency<T> task = new HeapTaskConcurrency(new ScheduledTaskConcurrency(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
                queue.offer(task);
            }
```

### UNCHECKED_WARNING
Unchecked call to 'build(T)' as a member of raw type 'com.uber.concurrency.loadbalancer.internal.TaskConcurrency.Builder'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            this.tasks = ImmutableList.copyOf(tasks);
            for (T t : tasks) {
                TaskConcurrency<T> task = new HeapTaskConcurrency(new ScheduledTaskConcurrency(taskConcurrencyBuilder.build(t), scheduledCounterBuilder));
                queue.offer(task);
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer' to 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java

            TaskConcurrencyQueue<T> taskConcurrencyRepo = new TaskConcurrencyQueue<>(tasks, taskConcurrencyBuilder, scheduledCounterBuilder);
            return new HeapConcurrencyLoadBalancer(taskConcurrencyRepo, listeners, scheduledCounterBuilder.getTicker());
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'HeapConcurrencyLoadBalancer(TaskConcurrencyQueue, List\>, Ticker)' as a member of raw type 'com.uber.concurrency.loadbalancer.HeapConcurrencyLoadBalancer'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java

            TaskConcurrencyQueue<T> taskConcurrencyRepo = new TaskConcurrencyQueue<>(tasks, taskConcurrencyBuilder, scheduledCounterBuilder);
            return new HeapConcurrencyLoadBalancer(taskConcurrencyRepo, listeners, scheduledCounterBuilder.getTicker());
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'TaskConcurrencyDelegator(TaskConcurrency)' as a member of raw type 'com.uber.concurrency.loadbalancer.internal.TaskConcurrencyDelegator'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
             */
            HeapTaskConcurrency(ScheduledTaskConcurrency<T> delegate) {
                super(delegate);
            }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        public B withTaskListener(CompletableTask.Listener<T> listener) {
            listeners.add(listener);
            return (B)this;
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.google.common.collect.ImmutableMap.Builder'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            for (T task : tasks) {
                builder.put(task, new Meter(ticker));
            }
            this.taskRequestRate = builder.build();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.google.common.collect.ImmutableMap' to 'java.util.Map'. Reason: 'builder' has raw type, so result of build is erased
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
                builder.put(task, new Meter(ticker));
            }
            this.taskRequestRate = builder.build();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        public B withSubStrategy(SubStrategy subStrategy) {
            this.subStrategy = subStrategy;
            return (B)this;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
            }
            this.scheduledCounterBuilder.withMaxDelay(latency);
            return (B)this;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
            withSubStrategy(subStrategy);
            this.lookBackTime = lookBackTime;
            return (B)this;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'markCompletion(T, boolean)' as a member of raw type 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.MetricsImpl'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
     */
    void onTaskCompleted(T t, boolean succeed) {
        metrics.markCompletion(t, succeed);
        for (CompletableTask.Listener<T> listener : listeners) {
            listener.onComplete(t, succeed);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        protected B withTicker(Ticker ticker) {
            this.scheduledCounterBuilder.withTicker(ticker);
            return (B)this;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
            }
            this.scheduledCounterBuilder.withNumWindow(windowCount);
            return (B)this;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.AbstractBuilder' to 'B'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        public B withTasks(Collection<T> tasks) {
            this.tasks = tasks;
            return (B)this;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'of(Consumer)' as a member of raw type 'com.uber.concurrency.loadbalancer.timedcounter.ScheduledCounter.Builder'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
            super(delegate);
            this.timeout = builder.getMaxDelay();
            this.scheduledCounter = builder.of(new Consumer<Long>() {
                @Override
                public void accept(Long n) {
```

### UNCHECKED_WARNING
Unchecked call to 'markSelection(T)' as a member of raw type 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.MetricsImpl'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
     */
    void onTaskSelected(T t) {
        metrics.markSelection(t);
        for (CompletableTask.Listener<T> listener : listeners) {
            listener.onCreate(t);
```

### UNCHECKED_WARNING
Unchecked call to 'MetricsImpl(Collection, Ticker)' as a member of raw type 'com.uber.concurrency.loadbalancer.AbstractConcurrencyLoadBalancer.MetricsImpl'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        this.listeners = listeners;
        this.ticker = ticker;
        this.metrics = new MetricsImpl(tasks, ticker);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Comparable' to 'java.lang.Comparable'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
        if (comparator == null) {
            this.comparator = (o1, o2) -> {
                Comparable<E> c1 = (Comparable)o1;
                return c1.compareTo(o2);
            };
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.CompletableTask.NoopCompletableTask' to 'com.uber.concurrency.loadbalancer.CompletableTask'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/CompletableTask.java`
#### Snippet
```java
     */
    static <T> CompletableTask<T> ofNoop(@Nonnull T t) {
        return new NoopCompletableTask(t);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'NoopCompletableTask(T)' as a member of raw type 'com.uber.concurrency.loadbalancer.CompletableTask.NoopCompletableTask'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/CompletableTask.java`
#### Snippet
```java
     */
    static <T> CompletableTask<T> ofNoop(@Nonnull T t) {
        return new NoopCompletableTask(t);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.TallyMetricsTaskListener' to 'com.uber.concurrency.loadbalancer.TallyMetricsTaskListener'
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java

        TallyMetricsTaskListener<T> build(Scope scope) {
            return new TallyMetricsTaskListener(name, scope, taskNameMapper, ticker);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'TallyMetricsTaskListener(String, Scope, Function, Ticker)' as a member of raw type 'com.uber.concurrency.loadbalancer.TallyMetricsTaskListener'
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java

        TallyMetricsTaskListener<T> build(Scope scope) {
            return new TallyMetricsTaskListener(name, scope, taskNameMapper, ticker);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.function.Function' to 'java.util.function.Function'
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java

    public static class Builder<T> {
        private Function<T, String> taskNameMapper = (Function<T, String>) DEFAULT_TASK_NAME_MAPPER;
        private String name = "unnamed";
        private Ticker ticker = Ticker.systemTicker();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.concurrency.loadbalancer.TracingTaskListener' to 'com.uber.concurrency.loadbalancer.TracingTaskListener'
in `concurrency-loadbalancer-tracing/src/main/java/com/uber/concurrency/loadbalancer/TracingTaskListener.java`
#### Snippet
```java

        public TracingTaskListener<T> build(Tracer tracer) {
            return new TracingTaskListener(tracer, name, taskNameMapper);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'TracingTaskListener(Tracer, String, Function)' as a member of raw type 'com.uber.concurrency.loadbalancer.TracingTaskListener'
in `concurrency-loadbalancer-tracing/src/main/java/com/uber/concurrency/loadbalancer/TracingTaskListener.java`
#### Snippet
```java

        public TracingTaskListener<T> build(Tracer tracer) {
            return new TracingTaskListener(tracer, name, taskNameMapper);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.base.Function' to 'com.google.common.base.Function'
in `concurrency-loadbalancer-tracing/src/main/java/com/uber/concurrency/loadbalancer/TracingTaskListener.java`
#### Snippet
```java

    public static class Builder<T> {
        private Function<T, String> taskNameMapper = (Function<T, String>) DEFAULT_TASK_NAME_MAPPER;
        private String name = "unnamed";

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
        }
        return new ConcurrentTaskImpl(ticker.read(), taskConcurrency);
    };

    @VisibleForTesting
```

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/LifespanTracker.java`
#### Snippet
```java
        Window window = windows[index];

        if (window.windowId < windowId) {
            synchronized (window) {
                if (window.windowId < windowId) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'HashMap.containsKey()'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
    @Override
    public boolean contains(Object o) {
        return entityToIndex.containsKey(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'HashMap.get()'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
     */
    private int indexOf(Object e) {
        Integer index = entityToIndex.get(e);
        if (index == null) {
            return INDEX_NOT_FOUND;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            }

            /**
             * on completion of failed requests, instead of reducing task concurrency right away
             * we reduce concurrency with delay to avoid more number of requests assigned to failed task
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Tag `return` is not allowed here
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrency.java`
#### Snippet
```java
     * @param n        number of requests
     * @param latency total duration
     * @return concurrency
     */
    void complete(int n, Duration latency);
```

### JavadocDeclaration
Tag `return` is not allowed here
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrency.java`
#### Snippet
```java
     *
     * @param n number of requests processed
     * @return the int
     */
    void acquire(int n);
```

### JavadocDeclaration
Tag `return` is not allowed here
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrency.java`
#### Snippet
```java
     * @param succeed the result
     * @param latency the latency
     * @return concurrency
     */
    default void complete(boolean succeed, Duration latency) {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrency.java`
#### Snippet
```java
     * Acquire task
     *
     * @return concurrency
     */
    default void acquire() {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/LifespanTracker.java`
#### Snippet
```java
 * </pre>
 *
 * @ThreadSafe
 */
class LifespanTracker {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/RoundRobinLoadBalancer.java`
#### Snippet
```java
 * return lb.next();
 *
 * @ThreadSafe
 *
 * @param <T> the type parameter
```

### JavadocDeclaration
`@return` tag description is missing
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
     *
     * @param e entity to add or update order
     * @return
     */
    @Override
```

### JavadocDeclaration
Wrong tag `TheadSafe`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/WindowScheduledCounter.java`
#### Snippet
```java
 * </p>
 *
 * @TheadSafe
 */
public class WindowScheduledCounter implements ScheduledCounter {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java

        @Override
        public T getTask() {
            return task;
        }
```

### NullableProblems
Non-annotated parameter 'c' in method 'addAll' from 'AbstractQueue' should not override non-null parameter from 'Set'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
 * @param <E> the type parameter
 */
public class HashIndexedPriorityQueue<E> extends AbstractQueue<E> implements Set<E> {
    private static final int INDEX_NOT_FOUND = -1;
    private final HashMap<E, Integer> entityToIndex;
```

### NullableProblems
Overridden methods are not annotated
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/CompletableTask.java`
#### Snippet
```java
     * @return the entity
     */
    @Nonnull
    T getTask();

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `scheduledCounterBuilder` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/LatencyTaskConcurrency.java`
#### Snippet
```java

    private static class Builder implements TaskConcurrency.Builder<LatencyTaskConcurrency.Builder>  {
        private WindowScheduledCounter.Builder scheduledCounterBuilder = WindowScheduledCounter.newBuilder();

        @Override
```

### FieldMayBeFinal
Field `scheduledCounterBuilder` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/FrequencyTaskConcurrency.java`
#### Snippet
```java

    public static class Builder implements TaskConcurrency.Builder<FrequencyTaskConcurrency.Builder>  {
        private WindowScheduledCounter.Builder scheduledCounterBuilder = WindowScheduledCounter.newBuilder();

        @Override
```

### FieldMayBeFinal
Field `concurrency` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrency.java`
#### Snippet
```java
    class Noop<T> implements TaskConcurrency<T> {
        public static final Noop INSTANCE = new Noop(0);
        private int concurrency;

        public Noop(int init) {
```

### FieldMayBeFinal
Field `NOOP_METRICS` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/LeastConcurrencyLoadBalancer.java`
#### Snippet
```java

    class NoopLeastConcurrencyLoadBalancer<T> implements LeastConcurrencyLoadBalancer<T> {
        private static Metrics NOOP_METRICS = new Metrics() {

            @Override
```

### FieldMayBeFinal
Field `newBuilder` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/SubStrategy.java`
#### Snippet
```java
    LeastTime(() -> LatencyTaskConcurrency.newBuilder());

    private Supplier<TaskConcurrency.Builder> newBuilder;

    SubStrategy(Supplier<TaskConcurrency.Builder> newBuilder) {
```

### FieldMayBeFinal
Field `weightMap` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        @VisibleForTesting
        protected static class WeightedSelectorBuilder<T> {
            private TreeMap<Integer, T> weightMap = new TreeMap<>();
            private int totalWeight = 0;

```

### FieldMayBeFinal
Field `impl` may be 'final'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
     */
    private class IteratorImpl implements Iterator<E> {
        private Iterator<E> impl;

        /**
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
 * Example:
 * <pre>
 * ArrayList<String> urls = new ArrayList<String>() {{add("http://192.168.0.1:80"); add("http://192.168.0.2:80");}};
 *
 * HeapConcurrencyLoadBalancer<String> loadBalancer = HeapConcurrencyLoadBalancer.newBuilder()
```

### JavadocLinkAsPlainText
Link specified as plain text
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
 * Example:
 * <pre>
 * ArrayList<String> urls = new ArrayList<String>() {{add("http://192.168.0.1:80"); add("http://192.168.0.2:80");}};
 *
 * HeapConcurrencyLoadBalancer<String> loadBalancer = HeapConcurrencyLoadBalancer.newBuilder()
```

