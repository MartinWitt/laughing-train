# concurrency-loadbalancer 
 
# Bad smells
I found 67 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 15 | false |
| ReturnNull | 12 | false |
| Convert2MethodRef | 8 | false |
| AssignmentToMethodParameter | 6 | false |
| RedundantFieldInitialization | 5 | false |
| ClassNameSameAsAncestorName | 4 | false |
| MissortedModifiers | 3 | false |
| PublicFieldAccessedInSynchronizedContext | 3 | false |
| MethodOverridesStaticMethod | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| DoubleCheckedLocking | 1 | false |
| Convert2Lambda | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| NullableProblems | 1 | false |
## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrencyImpl.java`
#### Snippet
```java
    }

    private static class Builder implements TaskConcurrency.Builder<TaskConcurrencyImpl.Builder> {
        private static final TaskConcurrency.Builder BUILDER = new Builder();

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/FrequencyTaskConcurrency.java`
#### Snippet
```java
    }

    public static class Builder implements TaskConcurrency.Builder<FrequencyTaskConcurrency.Builder>  {
        private WindowScheduledCounter.Builder scheduledCounterBuilder = WindowScheduledCounter.newBuilder();

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/WindowScheduledCounter.java`
#### Snippet
```java
     * Builder ScheduledCounter
     */
    public static class Builder implements ScheduledCounter.Builder<WindowScheduledCounter> {
        private Duration maxDelay = Duration.ofSeconds(30);
        private int numWindows = 100;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/LatencyTaskConcurrency.java`
#### Snippet
```java
    }

    private static class Builder implements TaskConcurrency.Builder<LatencyTaskConcurrency.Builder>  {
        private WindowScheduledCounter.Builder scheduledCounterBuilder = WindowScheduledCounter.newBuilder();

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MathUtils` has only 'static' members, and lacks a 'private' constructor
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/MathUtils.java`
#### Snippet
```java
 * MathUtils
 */
public final class MathUtils {
    /**
     * The constant EPSILON.
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

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`bits = bits >>> 1` could be simplified to 'bits \>\>\>= 1'
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/RandomBooleanGenerator.java`
#### Snippet
```java
        boolean result = (int)(bits % 2) == 0;
        nBits--;
        bits = bits >>> 1;
        return result;
    }
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/SubStrategy.java`
#### Snippet
```java
     * times being picked
     */
    LeastFrequency(() -> FrequencyTaskConcurrency.newBuilder()),
    /**
     * Least time sub strategy. among all least concurrency partitions pick the one with least aggregated latency
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/SubStrategy.java`
#### Snippet
```java
     * no sub strategy, load balancer will pick any one among all least concurrency partitions
     */
    Absent(() -> TaskConcurrencyImpl.newBuilder()),
    /**
     * Least frequency sub strategy. among all least concurrency partitions pick the one with least
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/WindowTimedCounter.java`
#### Snippet
```java
    public WindowTimedCounter(WindowScheduledCounter.Builder builder) {
        value = new AtomicLong();
        scheduledCounter = builder.of(o->value.addAndGet(o));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-tracing/src/main/java/com/uber/concurrency/loadbalancer/TracingTaskListener.java`
#### Snippet
```java
 */
public class TracingTaskListener<T> implements CompletableTask.Listener<T> {
    private static final Function<Object, String> DEFAULT_TASK_NAME_MAPPER = o->o.toString();

    public static class Builder<T> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        private double calcCOV(Collection<Meter> meters) {
            double[] rates = meters.stream()
                    .map(o->o.getRate())
                    .mapToDouble(d->d)
                    .toArray();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            @Override
            public void syncState() {
                syncUpdate(this, ()->super.syncState());
            }
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
            @Override
            public void acquire() {
                syncUpdate(this, ()->super.acquire());
            }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java
 */
public class TallyMetricsTaskListener<T> implements CompletableTask.Listener<T> {
    private static final Function<Object, String> DEFAULT_TASK_NAME_MAPPER = o->o.toString();

    public static class Builder<T> {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Consumer() can be replaced with lambda
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
            super(delegate);
            this.timeout = builder.getMaxDelay();
            this.scheduledCounter = builder.of(new Consumer<Long>() {
                @Override
                public void accept(Long n) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/LifespanTracker.java`
#### Snippet
```java
         * The windowId can be negative
         */
        long windowId = 0;

        /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/RandomBooleanGenerator.java`
#### Snippet
```java
public class RandomBooleanGenerator {
    private final PrimitiveIterator.OfLong longStream = new SplittableRandom().longs().iterator();
    private int nBits = 0;
    private long bits = 0L;
    
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/RandomBooleanGenerator.java`
#### Snippet
```java
    private final PrimitiveIterator.OfLong longStream = new SplittableRandom().longs().iterator();
    private int nBits = 0;
    private long bits = 0L;
    
    public boolean next() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        protected static class WeightedSelectorBuilder<T> {
            private TreeMap<Integer, T> weightMap = new TreeMap<>();
            private int totalWeight = 0;

            /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
    public static class Builder<T>
            extends AbstractBuilder<T, Builder<T>> {
        private volatile Function<T, TaskConcurrency<T>> taskConcurrencyMap = null;
        private int groupSize = Integer.MAX_VALUE;

```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `timeToLive`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/LifespanTracker.java`
#### Snippet
```java
    public long add(long n, Duration timeToLive) {
        if (maxAge.minus(timeToLive).isNegative()) {
            timeToLive = maxAge;
        }
        if (timeToLive.isNegative()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `timeToLive`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/LifespanTracker.java`
#### Snippet
```java
        }
        if (timeToLive.isNegative()) {
            timeToLive = Duration.ZERO;
        }
        long nowNanos = ticker.read();
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
            entityList.set(index, c);
            entityToIndex.put(c, index);
            index = cIndex;
        }
        if (oIndex == index)
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
            entityList.set(index, parent);
            entityToIndex.put(parent, index);
            index = pIndex;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `weight`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
            @VisibleForTesting
            WeightedSelectorBuilder<T> add(T t, int weight) {
                weight = Math.abs(weight);
                weightMap.put(totalWeight, t);
                totalWeight += weight;
```

### AssignmentToMethodParameter
Assignment to method parameter `groupSize`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
    private static <T> WeightedSelector<TaskGroup<T>> buildWeightedSelector(Collection<T> tasks, Function<T, TaskConcurrency<T>> taskConcurrencyMap, int groupSize) {
        if (groupSize <= 0) {
            groupSize = Integer.MAX_VALUE;
        }
        WeightedSelector.WeightedSelectorBuilder<TaskGroup<T>> builder = WeightedSelector.newBuilder();
```

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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-14-15-27-01.427.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/LeastConcurrencyLoadBalancer.java`
#### Snippet
```java
        @Override
        public CompletableTask<T> next() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrency.java`
#### Snippet
```java
        @Override
        public T getTask() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/RoundRobinLoadBalancer.java`
#### Snippet
```java
        int size = tasks.size();
        if (size == 0) {
            return null;
        }
        return tasks.get(((index.getAndIncrement() % size) + size) % size);
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/ReservoirSampler.java`
#### Snippet
```java
    public T getSample() {
        if (result.isEmpty()) {
            return null;
        }
        return result.get(0);
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
    public E peek() {
        if (entityList.isEmpty()) {
            return null;
        }
        return entityList.get(0);
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
        int size = entityList.size();
        if (index >= size) {
            return null;
        }
        E entity = entityList.get(index);
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
        public TaskConcurrency<T> peek() {
            if (size == 0) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
        TaskConcurrency<T> taskConcurrency = taskConcurrencyQueue.peek();
        if (taskConcurrency == null || Integer.compareUnsigned(Integer.MAX_VALUE, taskConcurrency.getConcurrency()) < 0) {
            return null; // no tasks or all tasks reached concurrency limits
        }
        return new ConcurrentTaskImpl(ticker.read(), taskConcurrency);
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        protected T select() {
            if (totalWeight == 0) {
                return null;
            }
            int selected = rand.nextInt(totalWeight);
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        TaskGroup<T> taskGroup = weightedSelector.select();
        if (taskGroup == null) {
            return null;
        }
        TaskConcurrency<T> leastTaskConcurrency = LEAST_TASK_CONCURRENCY;
```

### ReturnNull
Return of `null`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        TaskConcurrency<T> result = sampler.getSample();
        if (result == null) {
            return null; // no tasks or all tasks reached concurrency limits
        }
        return new ConcurrentTaskImpl(ticker.read(), result);
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
        public ArrayConcurrencyLoadBalancer<T> build() {
            if (taskConcurrencyMap == null) {
                synchronized (this) {
                    if (taskConcurrencyMap == null) {
                        TaskConcurrency.Builder taskConcurrencyBuilder = subStrategy.newTaskConcurrencyBuilder().withLookBackTime(lookBackTime);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Long`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/timedcounter/WindowScheduledCounter.java`
#### Snippet
```java
     * @param consumer         the count consumer
     */
    WindowScheduledCounter(LifespanTracker lifespanTracker, Consumer<Long> consumer) {
        this.lifespanTracker = lifespanTracker;
        this.consumer = consumer;
```

### BoundedWildcard
Can generalize to `? extends TaskConcurrency.Builder`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/SubStrategy.java`
#### Snippet
```java
    private Supplier<TaskConcurrency.Builder> newBuilder;

    SubStrategy(Supplier<TaskConcurrency.Builder> newBuilder) {
        this.newBuilder = newBuilder;
    }
```

### BoundedWildcard
Can generalize to `? super E`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/utils/HashIndexedPriorityQueue.java`
#### Snippet
```java
     * @param comparator the comparator
     */
    public HashIndexedPriorityQueue(Comparator<E> comparator) {
        this.entityToIndex = new HashMap<>();
        this.entityList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super T`
in `concurrency-loadbalancer-tracing/src/main/java/com/uber/concurrency/loadbalancer/TracingTaskListener.java`
#### Snippet
```java
    private final Function<T, String> taskNameMapper;

    private TracingTaskListener(Tracer tracer, String name, Function<T, String> taskNameMapper) {
        this.tracer = tracer;
        this.name = name;
```

### BoundedWildcard
Can generalize to `? extends T`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/TaskConcurrencyDelegator.java`
#### Snippet
```java
    private final TaskConcurrency<T> delegate;

    public TaskConcurrencyDelegator(TaskConcurrency<T> delegate) {
        this.delegate = delegate;
    }
```

### BoundedWildcard
Can generalize to `? extends Meter`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
        }

        private double calcCOV(Collection<Meter> meters) {
            double[] rates = meters.stream()
                    .map(o->o.getRate())
```

### BoundedWildcard
Can generalize to `? extends CompletableTask.Listener`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
     * @param ticker         the ticker
     */
    AbstractConcurrencyLoadBalancer(Collection<T> tasks, List<CompletableTask.Listener<T>> listeners, Ticker ticker) {
        this.listeners = listeners;
        this.ticker = ticker;
```

### BoundedWildcard
Can generalize to `? super EWMARates`
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java
    }

    private double calcStandardDeviation(Function<EWMARates, EWMA> mapper) {
        double[] rates = taskRates.values().stream()
                .map(mapper)
```

### BoundedWildcard
Can generalize to `? extends EWMA`
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java
    }

    private double calcStandardDeviation(Function<EWMARates, EWMA> mapper) {
        double[] rates = taskRates.values().stream()
                .map(mapper)
```

### BoundedWildcard
Can generalize to `? super T`
in `concurrency-loadbalancer-m3/src/main/java/com/uber/concurrency/loadbalancer/TallyMetricsTaskListener.java`
#### Snippet
```java
    private TallyMetricsTaskListener(String name,
                                     Scope rootScope,
                                     Function<T, String> taskNameMapper,
                                     Ticker ticker) {
        this.scope = rootScope.tagged(ImmutableMap.of(TAG_LOAD_BALANCER, name));
```

### BoundedWildcard
Can generalize to `? super Integer`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
         * @param rand        the rand
         */
        WeightedSelector(TreeMap<Integer, T> weightMap, int totalWeight, Random rand) {
            this.weightMap = weightMap;
            this.totalWeight = totalWeight;
```

### BoundedWildcard
Can generalize to `? extends T`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
         * @param rand        the rand
         */
        WeightedSelector(TreeMap<Integer, T> weightMap, int totalWeight, Random rand) {
            this.weightMap = weightMap;
            this.totalWeight = totalWeight;
```

### BoundedWildcard
Can generalize to `? extends T`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
    }

    private static <T> WeightedSelector<TaskGroup<T>> buildWeightedSelector(Collection<T> tasks, Function<T, TaskConcurrency<T>> taskConcurrencyMap, int groupSize) {
        if (groupSize <= 0) {
            groupSize = Integer.MAX_VALUE;
```

### BoundedWildcard
Can generalize to `? super T`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
    }

    private static <T> WeightedSelector<TaskGroup<T>> buildWeightedSelector(Collection<T> tasks, Function<T, TaskConcurrency<T>> taskConcurrencyMap, int groupSize) {
        if (groupSize <= 0) {
            groupSize = Integer.MAX_VALUE;
```

### BoundedWildcard
Can generalize to `? extends TaskConcurrency`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
    }

    private static <T> WeightedSelector<TaskGroup<T>> buildWeightedSelector(Collection<T> tasks, Function<T, TaskConcurrency<T>> taskConcurrencyMap, int groupSize) {
        if (groupSize <= 0) {
            groupSize = Integer.MAX_VALUE;
```

## RuleId[id=NullableProblems]
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

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `public @Nonnull`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/CompletableTask.java`
#### Snippet
```java

        @Override
        public @Nonnull T getTask() {
            return t;
        }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/AbstractConcurrencyLoadBalancer.java`
#### Snippet
```java
     * @param <B> the actual builder type being returned
     */
    public static abstract class AbstractBuilder<T, B extends AbstractBuilder> implements TaskBuilder<T,B> {

        SubStrategy subStrategy = SubStrategy.Absent;
```

### MissortedModifiers
Missorted modifiers `final static`
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/HeapConcurrencyLoadBalancer.java`
#### Snippet
```java
     * @param <T> the type parameter
     */
    public final static class Builder<T>
            extends AbstractBuilder<T, Builder<T>> {
        /**
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `subStrategy` accessed in synchronized context
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
                synchronized (this) {
                    if (taskConcurrencyMap == null) {
                        TaskConcurrency.Builder taskConcurrencyBuilder = subStrategy.newTaskConcurrencyBuilder().withLookBackTime(lookBackTime);
                        taskConcurrencyMap = new TaskConcurrencyMap<>(taskConcurrencyBuilder, scheduledCounterBuilder);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lookBackTime` accessed in synchronized context
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
                synchronized (this) {
                    if (taskConcurrencyMap == null) {
                        TaskConcurrency.Builder taskConcurrencyBuilder = subStrategy.newTaskConcurrencyBuilder().withLookBackTime(lookBackTime);
                        taskConcurrencyMap = new TaskConcurrencyMap<>(taskConcurrencyBuilder, scheduledCounterBuilder);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `scheduledCounterBuilder` accessed in synchronized context
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/ArrayConcurrencyLoadBalancer.java`
#### Snippet
```java
                    if (taskConcurrencyMap == null) {
                        TaskConcurrency.Builder taskConcurrencyBuilder = subStrategy.newTaskConcurrencyBuilder().withLookBackTime(lookBackTime);
                        taskConcurrencyMap = new TaskConcurrencyMap<>(taskConcurrencyBuilder, scheduledCounterBuilder);
                    }
                }
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `newBuilder()` tries to override a static method of a superclass
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/FrequencyTaskConcurrency.java`
#### Snippet
```java
    }

    public static Builder newBuilder() {
        return new Builder();
    }
```

### MethodOverridesStaticMethod
Method `newBuilder()` tries to override a static method of a superclass
in `concurrency-loadbalancer-core/src/main/java/com/uber/concurrency/loadbalancer/internal/LatencyTaskConcurrency.java`
#### Snippet
```java
    }

    public static Builder newBuilder() {
        return new Builder();
    }
```

