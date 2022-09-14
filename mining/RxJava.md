# ReactiveX/RxJava
# Bad smells
I found 1956 bad smells with 58 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 381 | false |
| PublicFieldAccessedInSynchronizedContext | 260 | false |
| Convert2Lambda | 206 | false |
| UnnecessaryFullyQualifiedName | 201 | false |
| SynchronizeOnThis | 110 | false |
| ConditionalBreakInInfiniteLoop | 99 | false |
| ReturnNull | 98 | false |
| AssignmentToMethodParameter | 97 | false |
| NonSerializableFieldInSerializableClass | 93 | false |
| ArrayEquality | 91 | false |
| Anonymous2MethodRef | 62 | false |
| DefaultAnnotationParam | 46 | false |
| UnnecessaryLocalVariable | 41 | true |
| NumberEquality | 23 | false |
| EmptyStatementBody | 20 | false |
| ConstantConditions | 19 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 16 | false |
| NonProtectedConstructorInAbstractClass | 13 | true |
| UnusedAssignment | 12 | false |
| SystemOutErr | 10 | false |
| ThrowablePrintStackTrace | 7 | false |
| AssignmentToCatchBlockParameter | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| CommentedOutCode | 4 | false |
| NestedAssignment | 4 | false |
| UnnecessaryQualifierForThis | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| EmptyMethod | 3 | false |
| OptionalIsPresent | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| SizeReplaceableByIsEmpty | 2 | true |
| IgnoreResultOfCall | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| InstanceofCatchParameter | 1 | false |
| NonFinalFieldOfException | 1 | false |
| BusyWait | 1 | false |
| ArrayHashCode | 1 | false |
## OptionalIsPresent
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableMapOptional.java`
#### Snippet
```java
            }

            if (result.isPresent()) {
                return downstream.tryOnNext(result.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableMapOptional.java`
#### Snippet
```java
            }

            if (result.isPresent()) {
                downstream.onNext(result.get());
            }
```

## MismatchedArrayReadWrite
### MismatchedArrayReadWrite
Contents of array `array` are written to, but never read
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        item.call();

        Object[] array = new Object[n];

        Thread.sleep(100);
```

## ConditionalBreakInInfiniteLoop
### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/util/OpenHashSet.java`
#### Snippet
```java
            int pos = mix(a[i].hashCode()) & m;
            if (b[pos] != null) {
                for (;;) {
                    pos = (pos + 1) & m;
                    if (b[pos] == null) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
        int missed = 1;

        for (;;) {
            for (;;) {
                boolean d = qd.done();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
        int missed = 1;

        for (;;) {
            if (checkTerminated(qd.done(), q.isEmpty(), a, delayError, q, dispose, qd)) {
                return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeConcatArrayDelayError.java`
#### Snippet
```java
            Disposable cancelled = disposables;

            for (;;) {
                if (cancelled.isDisposed()) {
                    c.lazySet(null);
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
            SimpleQueueWithConsumerIndex<Object> q = queue;

            for (;;) {
                if (cancelled) {
                    q.clear();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
            long e = consumed;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeConcatIterable.java`
#### Snippet
```java
            Disposable cancelled = disposables;

            for (;;) {
                if (cancelled.isDisposed()) {
                    c.lazySet(null);
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeConcatArray.java`
#### Snippet
```java
            Disposable cancelled = disposables;

            for (;;) {
                if (cancelled.isDisposed()) {
                    c.lazySet(null);
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapSingle.java`
#### Snippet
```java
            AtomicReference<SwitchMapSingleObserver<R>> inner = this.inner;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapMaybe.java`
#### Snippet
```java
            AtomicReference<SwitchMapMaybeObserver<R>> inner = this.inner;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapMaybe.java`
#### Snippet
```java
            long emitted = this.emitted;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapMaybe.java`
#### Snippet
```java
            boolean syncFused = this.syncFused;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapSingle.java`
#### Snippet
```java
            long emitted = this.emitted;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapSingle.java`
#### Snippet
```java
            AtomicThrowable errors = this.errors;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapMaybe.java`
#### Snippet
```java
            AtomicThrowable errors = this.errors;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapSingle.java`
#### Snippet
```java
            boolean syncFused = this.syncFused;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureBuffer.java`
#### Snippet
```java
                final SimplePlainQueue<T> q = queue;
                final Subscriber<? super T> a = downstream;
                for (;;) {

                    if (checkTerminated(done, q.isEmpty(), a)) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {

                if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
            Subscriber<? super R> a = downstream;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMergeWithMaybe.java`
#### Snippet
```java
            int c = consumed;
            int lim = limit;
            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRepeat.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (sa.isCancelled()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSequenceEqual.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {
                SimpleQueue<T> q1 = first.queue;
                SimpleQueue<T> q2 = second.queue;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScanSeed.java`
#### Snippet
```java
            int c = consumed;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableThrottleLatest.java`
#### Snippet
```java
            Subscriber<? super T> downstream = this.downstream;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRetryBiPredicate.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (sa.isCancelled()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMap.java`
#### Snippet
```java
            final Subscriber<? super U> child = this.downstream;
            int missed = 1;
            for (;;) {
                if (checkTerminate()) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapMaybe.java`
#### Snippet
```java
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

            for (;;) {
                long r = requested.get();
                long e = 0L;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
            final SpscLinkedArrayQueue<T> q = queue;

            for (;;) {
                long r = get();
                long e = 0L;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
            final AtomicReference<T> q = queue;

            for (;;) {
                long r = get();
                long e = 0L;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
            AtomicThrowable errors = this.errors;
            int missed = 1;
            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSkipLastTimed.java`
#### Snippet
```java
            final long time = this.time;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableZip.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMap.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {

                for (;;) {
                    if (cancelled) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMap.java`
#### Snippet
```java
        void drain() {
            if (wip.getAndIncrement() == 0) {
                for (;;) {
                    if (cancelled) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMergeWithSingle.java`
#### Snippet
```java
            int c = consumed;
            int lim = limit;
            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRepeatWhen.java`
#### Snippet
```java
        public void onNext(Object t) {
            if (getAndIncrement() == 0) {
                for (;;) {
                    if (upstream.get() == SubscriptionHelper.CANCELLED) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
            SpscLinkedArrayQueue<C> q = queue;

            for (;;) {
                long r = requested.get();

```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureBufferStrategy.java`
#### Snippet
```java
            Deque<T> dq = deque;
            Subscriber<? super T> a = downstream;
            for (;;) {
                long r = requested.get();
                long e = 0L;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapSingle.java`
#### Snippet
```java
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

            for (;;) {
                long r = requested.get();
                long e = 0L;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSequenceEqualSingle.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {
                SimpleQueue<T> q1 = first.queue;
                SimpleQueue<T> q2 = second.queue;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSwitchMap.java`
#### Snippet
```java
            int missing = 1;

            for (;;) {

                if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRepeatUntil.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (sa.isCancelled()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn.java`
#### Snippet
```java
            long e = produced;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {

                if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {

                if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn.java`
#### Snippet
```java
            long polled = consumed;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn.java`
#### Snippet
```java
            long e = produced;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
            Subscriber<? super R> a = downstream;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/AbstractBackpressureThrottlingSubscriber.java`
#### Snippet
```java
        final AtomicReference<R> q = current;

        for (;;) {
            long e = 0L;

```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableTakeLastTimed.java`
#### Snippet
```java
            final boolean delayError = this.delayError;

            for (;;) {

                if (done) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRetryPredicate.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (sa.isCancelled()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMapScheduler.java`
#### Snippet
```java
        @Override
        public void run() {
            for (;;) {
                if (cancelled) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMapScheduler.java`
#### Snippet
```java
        public void run() {

            for (;;) {
                if (cancelled) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundary.java`
#### Snippet
```java
            long emitted = this.emitted;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelSortedJoin.java`
#### Snippet
```java
            int n = indexes.length;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelJoin.java`
#### Snippet
```java
            Subscriber<? super T> a = this.downstream;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelJoin.java`
#### Snippet
```java
            Subscriber<? super T> a = this.downstream;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
            }
            int missed = 1;
            for (;;) {
                // if the upstream has completed, no more requesting is possible
                if (isDisposed()) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelRunOn.java`
#### Snippet
```java
            int lim = limit;

            for (;;) {

                long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFromPublisher.java`
#### Snippet
```java
                int notReady = 0;

                for (;;) {
                    if (cancelled) {
                        q.clear();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRepeatUntil.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    source.subscribe(this);

```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableMergeWithMaybe.java`
#### Snippet
```java
            Observer<? super T> actual = this.downstream;
            int missed = 1;
            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSkipLastTimed.java`
#### Snippet
```java
            final long time = this.time;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRetryBiPredicate.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (upstream.isDisposed()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSequenceEqualSingle.java`
#### Snippet
```java
            final SpscLinkedArrayQueue<T> q2 = observer2.queue;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
            final Observer<? super U> child = this.downstream;
            int missed = 1;
            for (;;) {
                if (checkTerminate()) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRepeat.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (sd.isDisposed()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableObserveOn.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {
                if (disposed) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableObserveOn.java`
#### Snippet
```java
            final Observer<? super T> a = downstream;

            for (;;) {
                if (checkTerminated(done, q.isEmpty(), a)) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSwitchMap.java`
#### Snippet
```java
            int missing = 1;

            for (;;) {

                if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
            Observer<? super R> a = downstream;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java

            int missed = 1;
            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableThrottleLatest.java`
#### Snippet
```java
            Observer<? super T> downstream = this.downstream;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSequenceEqual.java`
#### Snippet
```java
            final SpscLinkedArrayQueue<T> q2 = observer2.queue;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableMergeWithSingle.java`
#### Snippet
```java
            Observer<? super T> actual = this.downstream;
            int missed = 1;
            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
            SpscLinkedArrayQueue<C> q = queue;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableConcatMapScheduler.java`
#### Snippet
```java
        @Override
        public void run() {
            for (;;) {
                if (disposed) {
                    queue.clear();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCreate.java`
#### Snippet
```java
            AtomicThrowable errors = this.errors;
            int missed = 1;
            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRetryPredicate.java`
#### Snippet
```java
            if (getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    if (upstream.isDisposed()) {
                        return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableConcatMap.java`
#### Snippet
```java
            }

            for (;;) {
                if (disposed) {
                    queue.clear();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
            Observer<? super R> a = downstream;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapSingle.java`
#### Snippet
```java
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapMaybe.java`
#### Snippet
```java
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

            for (;;) {
                for (;;) {
                    if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundary.java`
#### Snippet
```java
            AtomicThrowable errors = this.errors;

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableConcat.java`
#### Snippet
```java
            }

            for (;;) {
                if (isDisposed()) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/ScheduledRunnable.java`
#### Snippet
```java
            }

            for (;;) {
                o = get(FUTURE_INDEX);
                if (o == SYNC_DISPOSED || o == ASYNC_DISPOSED || compareAndSet(FUTURE_INDEX, o, DONE)) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/TrampolineScheduler.java`
#### Snippet
```java
            if (wip.getAndIncrement() == 0) {
                int missed = 1;
                for (;;) {
                    for (;;) {
                        if (disposed) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/ExecutorScheduler.java`
#### Snippet
```java
            int missed = 1;
            final MpscLinkedQueue<Runnable> q = queue;
            for (;;) {

                if (disposed) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {
                Node node = output.index();
                if (node == null) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {
                if (output.isDisposed()) {
                    return;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/subjects/UnicastSubject.java`
#### Snippet
```java
        final boolean failFast = !delayError;

        for (;;) {

            if (disposed) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/subjects/UnicastSubject.java`
#### Snippet
```java
        boolean failFast = !this.delayError;
        boolean canBeError = true;
        for (;;) {
            for (;;) {

```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            }

            for (;;) {

                for (;;) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/processors/UnicastProcessor.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<T> q = queue;
        final boolean failFast = !delayError;
        for (;;) {

            long r = requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/processors/UnicastProcessor.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<T> q = queue;
        final boolean failFast = !delayError;
        for (;;) {

            if (cancelled) {
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            long e = rs.emitted;

            for (;;) {

                long r = rs.requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            long e = rs.emitted;

            for (;;) {

                long r = rs.requested.get();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside infinite loop
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            long e = rs.emitted;

            for (;;) {

                long r = rs.requested.get();
```

## EmptyStatementBody
### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java

        if (input.size == 1) {
            while (o.latch.getCount() != 0) { }
        } else {
            o.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
        Flowable.merge(os).subscribe(o);
        if (input.size == 1) {
            while (o.latch.getCount() != 0) { }
        } else {
            o.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
        Flowable.merge(input.observables).subscribe(o);
        if (input.size == 1) {
            while (o.latch.getCount() != 0) { }
        } else {
            o.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java

        if (input.size == 1) {
            while (o.latch.getCount() != 0) { }
        } else {
            o.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
        Flowable.merge(os).subscribe(o);
        if (input.size == 1) {
            while (o.latch.getCount() != 0) { }
        } else {
            o.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
        Flowable.merge(ob, ob).subscribe(o);
        if (input.size == 1) {
            while (o.latch.getCount() != 0) { }
        } else {
            o.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
            public Object call() {
                int c = count;
                while (items < c) { }
                return 1;
            }
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        });

        while (cdl.getCount() != 0) { }
    }
}
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
            public Object call() {
                int c = count;
                while (items < c) { }
                return 1;
            }
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        });

        while (cdl.getCount() != 0) { }
    }

```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/RangePerf.java`
#### Snippet
```java

        if (times == 1) {
            while (lo.latch.getCount() != 0) { }
        } else {
            lo.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/RangePerf.java`
#### Snippet
```java

        if (times == 1) {
            while (lo.latch.getCount() != 0) { }
        } else {
            lo.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/PerfAsyncConsumer.java`
#### Snippet
```java
    public PerfAsyncConsumer await(int count) {
        if (count <= 1000) {
            while (getCount() != 0) { }
        } else {
            try {
```

### EmptyStatementBody
`while` statement has empty body
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorFlatMapPerf.java`
#### Snippet
```java
        }).subscribe(latchedObserver);
        if (input.size == 1) {
            while (latchedObserver.latch.getCount() != 0) { }
        } else {
            latchedObserver.latch.await();
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/io/reactivex/rxjava3/internal/util/OpenHashSet.java`
#### Snippet
```java

        for (int j = size; j-- != 0; ) {
            while (a[--i] == null) { } // NOPMD
            int pos = mix(a[i].hashCode()) & m;
            if (b[pos] != null) {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/io/reactivex/rxjava3/internal/queue/MpscLinkedQueue.java`
#### Snippet
```java
    @Override
    public void clear() {
        while (poll() != null && !isEmpty()) { } // NOPMD
    }
    LinkedQueueNode<T> lvProducerNode() {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/io/reactivex/rxjava3/internal/queue/MpscLinkedQueue.java`
#### Snippet
```java
        else if (currConsumerNode != lvProducerNode()) {
            // spin, we are no longer wait free
            while ((nextNode = currConsumerNode.lvNext()) == null) { } // NOPMD
            // got the next node...

```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
        @Override
        public void clear() {
            while (poll() != null && !isEmpty()) { }
        }

```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/io/reactivex/rxjava3/operators/SpscArrayQueue.java`
#### Snippet
```java
    public void clear() {
        // we have to test isEmpty because of the weaker poll() guarantee
        while (poll() != null || !isEmpty()) { } // NOPMD
    }

```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/io/reactivex/rxjava3/operators/SpscLinkedArrayQueue.java`
#### Snippet
```java
    @Override
    public void clear() {
        while (poll() != null || !isEmpty()) { } // NOPMD
    }

```

## CommentedOutCode
### CommentedOutCode
Commented out code (11 lines)
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorFlatMapPerf.java`
#### Snippet
```java

    // this runs out of memory currently
    //    @Benchmark
    //    public void flatMapTwoNestedAsync(final Input input) throws InterruptedException {
    //        Observable.range(1, 2).flatMap(new Func1<Integer, Observable<Integer>>() {
```

### CommentedOutCode
Commented out code (18 lines)
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java

// TODO enable fast-path
//        if (n == -1 || n == Long.MAX_VALUE) {
//            for (;;) {
//                if (isCancelled.getAsBoolean()) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
        public int requestFusion(int mode) {
            // FIXME fusion mode causes hangs
            /*
            if ((mode & ASYNC) != 0) {
                outputFused = true;
```

### CommentedOutCode
Commented out code (19 lines)
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/RxThreadFactory.java`
#### Snippet
```java
        StringBuilder nameBuilder = new StringBuilder(prefix).append('-').append(incrementAndGet());

//        if (CREATE_TRACE) {
//            nameBuilder.append("\r\n");
//            for (StackTraceElement se :Thread.currentThread().getStackTrace()) {
```

## UnnecessaryQualifierForThis
### UnnecessaryQualifierForThis
Qualifier `SkipUntilMainSubscriber` on 'this' is unnecessary in this context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSkipUntil.java`
#### Snippet
```java
        public void onError(Throwable t) {
            SubscriptionHelper.cancel(other);
            HalfSerializer.onError(downstream, t, SkipUntilMainSubscriber.this, error);
        }

```

### UnnecessaryQualifierForThis
Qualifier `ReplaySubscriber` on 'this' is unnecessary in this context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
        public void dispose() {
            subscribers.set(TERMINATED);
            current.compareAndSet(ReplaySubscriber.this, null);
            // we don't care if it fails because it means the current has
            // been replaced in the meantime
```

### UnnecessaryQualifierForThis
Qualifier `ReplayObserver` on 'this' is unnecessary in this context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
        public void dispose() {
            observers.set(TERMINATED);
            current.compareAndSet(ReplayObserver.this, null);
            // we don't care if it fails because it means the current has
            // been replaced in the meantime
```

## NonSerializableFieldInSerializableClass
### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
        final Subscriber<? super T> downstream;

        final CompositeDisposable set;

        final AtomicLong requested;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'values' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeZipArray.java`
#### Snippet
```java
        final ZipMaybeObserver<T>[] observers;

        Object[] values;

        @SuppressWarnings("unchecked")
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeEqualSingle.java`
#### Snippet
```java
        final EqualCoordinator<T> parent;

        Object value;

        EqualObserver(EqualCoordinator<T> parent) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapCompletable.java`
#### Snippet
```java
            private static final long serialVersionUID = -8003404460084760287L;

            final SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> parent) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapCompletable.java`
#### Snippet
```java
            private static final long serialVersionUID = -8003404460084760287L;

            final SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> parent) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'values' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleZipArray.java`
#### Snippet
```java
        final ZipSingleObserver<T>[] observers;

        Object[] values;

        @SuppressWarnings("unchecked")
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleCache.java`
#### Snippet
```java
        final SingleObserver<? super T> downstream;

        final SingleCache<T> parent;

        CacheDisposable(SingleObserver<? super T> actual, SingleCache<T> parent) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
        final CombineLatestInnerSubscriber<T>[] subscribers;

        final SpscLinkedArrayQueue<Object> queue;

        final Object[] latest;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'latest' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<Object> queue;

        final Object[] latest;

        final boolean delayErrors;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
        final AtomicLong requested;

        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'disposables' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;

        final Map<Integer, TLeft> lefts;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCache.java`
#### Snippet
```java
        final Subscriber<? super T> downstream;

        final FlowableCache<T> parent;

        final AtomicLong requested;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'node' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCache.java`
#### Snippet
```java
        final AtomicLong requested;

        Node<T> node;

        int offset;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'resources' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundarySelector.java`
#### Snippet
```java
        final Function<? super B, ? extends Publisher<V>> closingIndicator;
        final int bufferSize;
        final CompositeDisposable resources;

        final WindowStartSubscriber<B> startSubscriber;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindow.java`
#### Snippet
```java
        final Subscriber<? super Flowable<T>> downstream;

        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;

        final long size;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindow.java`
#### Snippet
```java
        Subscription upstream;

        UnicastProcessor<T> window;

        WindowExactSubscriber(Subscriber<? super Flowable<T>> actual, long size, int bufferSize) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindow.java`
#### Snippet
```java
        Subscription upstream;

        UnicastProcessor<T> window;

        WindowSkipSubscriber(Subscriber<? super Flowable<T>> actual, long size, long skip, int bufferSize) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapMaybe.java`
#### Snippet
```java
        final AtomicLong requested;

        final CompositeDisposable set;

        final AtomicInteger active;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
        private static final long serialVersionUID = 2427151001689639875L;

        final SpscLinkedArrayQueue<T> queue;

        Throwable error;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSkipLastTimed.java`
#### Snippet
```java
        final TimeUnit unit;
        final Scheduler scheduler;
        final SpscLinkedArrayQueue<Object> queue;
        final boolean delayError;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'current' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableZip.java`
#### Snippet
```java
        volatile boolean cancelled;

        final Object[] current;

        ZipCoordinator(Subscriber<? super R> actual,
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
        private static final long serialVersionUID = -4552101107598366241L;

        final FlowableRefCount<?> parent;

        Disposable timer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
        final Subscriber<? super T> downstream;

        final FlowableRefCount<T> parent;

        final RefConnection connection;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
        volatile boolean done;

        final SpscLinkedArrayQueue<C> queue;

        volatile boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'subscribers' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
        final Function<? super Open, ? extends Publisher<? extends Close>> bufferClose;

        final CompositeDisposable subscribers;

        final AtomicLong requested;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowTimed.java`
#### Snippet
```java
        long count;

        UnicastProcessor<T> window;

        final SequentialDisposable timer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowTimed.java`
#### Snippet
```java
        final Scheduler scheduler;

        UnicastProcessor<T> window;

        final SequentialDisposable timer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java

        final K key;
        final SpscLinkedArrayQueue<T> queue;
        final GroupBySubscriber<?, K, T> parent;
        final boolean delayError;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapSingle.java`
#### Snippet
```java
        final AtomicLong requested;

        final CompositeDisposable set;

        final AtomicInteger active;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableAmb.java`
#### Snippet
```java

        private static final long serialVersionUID = -1185974347409665484L;
        final AmbCoordinator<T> parent;
        final int index;
        final Subscriber<? super T> downstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapCompletable.java`
#### Snippet
```java
        final boolean delayErrors;

        final CompositeDisposable set;

        final int maxConcurrency;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublishMulticast.java`
#### Snippet
```java
        final Subscriber<? super T> downstream;

        final MulticastProcessor<T> parent;

        long emitted;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
        final AtomicLong requested;

        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'disposables' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;

        final Map<Integer, UnicastProcessor<TRight>> lefts;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'subscribers' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMapEager.java`
#### Snippet
```java
        final AtomicLong requested;

        final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;

        Subscription upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableTakeLastTimed.java`
#### Snippet
```java
        final TimeUnit unit;
        final Scheduler scheduler;
        final SpscLinkedArrayQueue<Object> queue;
        final boolean delayError;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundary.java`
#### Snippet
```java
        volatile boolean done;

        UnicastProcessor<T> window;

        long emitted;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'boundarySubscriber' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundary.java`
#### Snippet
```java
        final int capacityHint;

        final WindowBoundaryInnerSubscriber<T, B> boundarySubscriber;

        final AtomicReference<Subscription> upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundary.java`
#### Snippet
```java
        final AtomicInteger windows;

        final MpscLinkedQueue<Object> queue;

        final AtomicThrowable errors;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapCompletableCompletable.java`
#### Snippet
```java
        final boolean delayErrors;

        final CompositeDisposable set;

        final int maxConcurrency;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'index' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
         * Guarded by the emitter loop.
         */
        Object index;
        /**
         * Keeps the sum of all requested amounts.
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java

        private static final long serialVersionUID = 245354315435971818L;
        final Object value;
        final long index;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupBy.java`
#### Snippet
```java

        final K key;
        final SpscLinkedArrayQueue<T> queue;
        final GroupByObserver<?, K, T> parent;
        final boolean delayError;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSkipLastTimed.java`
#### Snippet
```java
        final TimeUnit unit;
        final Scheduler scheduler;
        final SpscLinkedArrayQueue<Object> queue;
        final boolean delayError;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'resources' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundarySelector.java`
#### Snippet
```java
        final Function<? super B, ? extends ObservableSource<V>> closingIndicator;
        final int bufferSize;
        final CompositeDisposable resources;

        final WindowStartObserver<B> startObserver;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapCompletableCompletable.java`
#### Snippet
```java
        final boolean delayErrors;

        final CompositeDisposable set;

        Disposable upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'observers' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSequenceEqualSingle.java`
#### Snippet
```java
        final ObservableSource<? extends T> first;
        final ObservableSource<? extends T> second;
        final EqualObserver<T>[] observers;

        volatile boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'disposables' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;

        final Map<Integer, UnicastSubject<TRight>> lefts;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
        final Observer<? super R> downstream;

        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
        final CombinerObserver<T, R>[] observers;
        Object[] latest;
        final SpscLinkedArrayQueue<Object[]> queue;
        final boolean delayError;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'latest' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
        final Function<? super Object[], ? extends R> combiner;
        final CombinerObserver<T, R>[] observers;
        Object[] latest;
        final SpscLinkedArrayQueue<Object[]> queue;
        final boolean delayError;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'observers' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSequenceEqual.java`
#### Snippet
```java
        final ObservableSource<? extends T> first;
        final ObservableSource<? extends T> second;
        final EqualObserver<T>[] observers;

        volatile boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDebounceTimed.java`
#### Snippet
```java
        final T value;
        final long idx;
        final DebounceTimedObserver<T> parent;

        final AtomicBoolean once = new AtomicBoolean();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
        volatile boolean done;

        final SpscLinkedArrayQueue<C> queue;

        volatile boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'observers' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
        final Function<? super Open, ? extends ObservableSource<? extends Close>> bufferClose;

        final CompositeDisposable observers;

        final AtomicReference<Disposable> upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableAmb.java`
#### Snippet
```java

        private static final long serialVersionUID = -1185974347409665484L;
        final AmbCoordinator<T> parent;
        final int index;
        final Observer<? super T> downstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowTimed.java`
#### Snippet
```java
        long count;

        UnicastSubject<T> window;

        final SequentialDisposable timer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowTimed.java`
#### Snippet
```java
        final Scheduler scheduler;

        UnicastSubject<T> window;

        final SequentialDisposable timer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindow.java`
#### Snippet
```java
        Disposable upstream;

        UnicastSubject<T> window;

        WindowExactObserver(Observer<? super Observable<T>> actual, long count, int capacityHint) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableTakeLastTimed.java`
#### Snippet
```java
        final TimeUnit unit;
        final Scheduler scheduler;
        final SpscLinkedArrayQueue<Object> queue;
        final boolean delayError;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCreate.java`
#### Snippet
```java
        final AtomicThrowable errors;

        final SpscLinkedArrayQueue<T> queue;

        volatile boolean done;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/BlockingObservableIterable.java`
#### Snippet
```java
        private static final long serialVersionUID = 6695226475494099826L;

        final SpscLinkedArrayQueue<T> queue;

        final Lock lock;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'observers' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableZip.java`
#### Snippet
```java
        final Observer<? super R> downstream;
        final Function<? super Object[], ? extends R> zipper;
        final ZipObserver<T, R>[] observers;
        final T[] row;
        final boolean delayError;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCache.java`
#### Snippet
```java
        final Observer<? super T> downstream;

        final ObservableCache<T> parent;

        Node<T> node;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'node' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCache.java`
#### Snippet
```java
        final ObservableCache<T> parent;

        Node<T> node;

        int offset;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
        final Observer<? super R> downstream;

        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'disposables' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
        final SpscLinkedArrayQueue<Object> queue;

        final CompositeDisposable disposables;

        final Map<Integer, TLeft> lefts;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapCompletable.java`
#### Snippet
```java
        final boolean delayErrors;

        final CompositeDisposable set;

        Disposable upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapSingle.java`
#### Snippet
```java
        final boolean delayErrors;

        final CompositeDisposable set;

        final AtomicInteger active;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapMaybe.java`
#### Snippet
```java
        final boolean delayErrors;

        final CompositeDisposable set;

        final AtomicInteger active;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundary.java`
#### Snippet
```java
        final AtomicInteger windows;

        final MpscLinkedQueue<Object> queue;

        final AtomicThrowable errors;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'window' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundary.java`
#### Snippet
```java
        volatile boolean done;

        UnicastSubject<T> window;

        WindowBoundaryMainObserver(Observer<? super Observable<T>> downstream, int capacityHint) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'boundaryObserver' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundary.java`
#### Snippet
```java
        final int capacityHint;

        final WindowBoundaryInnerObserver<T, B> boundaryObserver;

        final AtomicReference<Disposable> upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableMergeIterable.java`
#### Snippet
```java
        private static final long serialVersionUID = -7730517613164279224L;

        final CompositeDisposable set;

        final CompletableObserver downstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
        final Observer<? super T> downstream;

        final ObservableRefCount<T> parent;

        final RefConnection connection;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
        private static final long serialVersionUID = -4552101107598366241L;

        final ObservableRefCount<?> parent;

        Disposable timer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableMergeArray.java`
#### Snippet
```java
        final AtomicBoolean once;

        final CompositeDisposable set;

        InnerCompletableObserver(CompletableObserver actual, AtomicBoolean once, CompositeDisposable set, int n) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'set' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableMerge.java`
#### Snippet
```java
        final AtomicThrowable errors;

        final CompositeDisposable set;

        Subscription upstream;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'runner' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/AbstractDirectTask.java`
#### Snippet
```java
    protected final boolean interruptOnCancel;

    protected Thread runner;

    protected static final FutureTask<Void> FINISHED = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'thread' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/ExecutorScheduler.java`
#### Snippet
```java
            final DisposableContainer tasks;

            volatile Thread thread;

            static final int READY = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
        final Observer<? super T> downstream;
        /** The subject state. */
        final PublishSubject<T> parent;

        /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
        private static final long serialVersionUID = 5629876084736248016L;

        final AsyncSubject<T> parent;

        AsyncDisposable(Observer<? super T> actual, AsyncSubject<T> parent) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java

        private static final long serialVersionUID = 245354315435971818L;
        final Object value;
        Node(Object value) {
            this.value = value;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'index' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
         * Guarded by the emitter loop.
         */
        Object index;

        volatile boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
        final Subscriber<? super T> downstream;

        final MulticastProcessor<T> parent;

        long emitted;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'index' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        final ReplaySubject<T> state;

        Object index;

        volatile boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'state' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        private static final long serialVersionUID = 466549804534799122L;
        final Observer<? super T> downstream;
        final ReplaySubject<T> state;

        Object index;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
        private static final long serialVersionUID = 5629876084736248016L;

        final AsyncProcessor<T> parent;

        AsyncSubscription(Subscriber<? super T> actual, AsyncProcessor<T> parent) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'state' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java

        final Subscriber<? super T> downstream;
        final BehaviorProcessor<T> state;

        boolean next;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queue' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
        boolean next;
        boolean emitting;
        AppendOnlyLinkedArrayList<Object> queue;

        boolean fastPath;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parent' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
        final Subscriber<? super T> downstream;
        /** The parent processor servicing this subscriber. */
        final PublishProcessor<T> parent;

        /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'index' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        final ReplayProcessor<T> state;

        Object index;

        final AtomicLong requested;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'state' in a Serializable class
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        private static final long serialVersionUID = 466549804534799122L;
        final Subscriber<? super T> downstream;
        final ReplayProcessor<T> state;

        Object index;
```

## NonSynchronizedMethodOverridesSynchronizedMethod
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `fillInStackTrace()` overrides synchronized method
in `src/main/java/io/reactivex/rxjava3/internal/util/ExceptionHelper.java`
#### Snippet
```java

        @Override
        public Throwable fillInStackTrace() {
            return this;
        }
```

## ProtectedMemberInFinalClass
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
        }

        protected GroupedUnicast(K key, State<T, K> state) {
            super(key);
            this.state = state;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupBy.java`
#### Snippet
```java
        }

        protected GroupedUnicast(K key, State<T, K> state) {
            super(key);
            this.state = state;
```

## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`windows.size() == 0` can be replaced with 'windows.isEmpty()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundarySelector.java`
#### Snippet
```java
                        continue;
                    }
                    else if (openDone && windows.size() == 0) {
                        upstream.cancel();
                        startSubscriber.cancel();
```

### SizeReplaceableByIsEmpty
`windows.size() == 0` can be replaced with 'windows.isEmpty()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundarySelector.java`
#### Snippet
```java
                        continue;
                    }
                    else if (openDone && windows.size() == 0) {
                        upstream.dispose();
                        startObserver.dispose();
```

## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder nameBuilder` can be replaced with 'String'
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/RxThreadFactory.java`
#### Snippet
```java
    @Override
    public Thread newThread(@NonNull Runnable r) {
        StringBuilder nameBuilder = new StringBuilder(prefix).append('-').append(incrementAndGet());

//        if (CREATE_TRACE) {
```

## AssignmentToForLoopParameter
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMap.java`
#### Snippet
```java
                                    removeInner(is);
                                    innerCompleted = true;
                                    i++;
                                    continue sourceLoop;
                                }
```

## ConstantConditions
### ConstantConditions
Dereference of `iterable` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java

            try {
                for (Publisher<? extends T> p : iterable) {
                    if (count == sources.length) {
                        Publisher<? extends T>[] b = new Publisher[count + (count >> 2)];
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
                        LeftRightEndSubscriber end = (LeftRightEndSubscriber)val;

                        lefts.remove(end.index);
                        disposables.remove(end);
                    }
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
                        LeftRightEndSubscriber end = (LeftRightEndSubscriber)val;

                        rights.remove(end.index);
                        disposables.remove(end);
                    }
```

### ConstantConditions
Method invocation `onComplete` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindow.java`
#### Snippet
```java
            if (i == size) {
                window = null;
                w.onComplete();
            }

```

### ConstantConditions
Value `conn` is always 'null'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublish.java`
#### Snippet
```java
            if (conn == null) {
                PublishConnection<T> fresh = new PublishConnection<>(current, bufferSize);
                if (!current.compareAndSet(conn, fresh)) {
                    continue;
                }
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
                        LeftRightEndSubscriber end = (LeftRightEndSubscriber)val;

                        UnicastProcessor<TRight> up = lefts.remove(end.index);
                        disposables.remove(end);
                        if (up != null) {
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
                        LeftRightEndSubscriber end = (LeftRightEndSubscriber)val;

                        rights.remove(end.index);
                        disposables.remove(end);
                    }
```

### ConstantConditions
Method invocation `size` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBuffer.java`
#### Snippet
```java
            C b = bs.peek();

            if (b.size() + 1 == size) {
                bs.poll();

```

### ConstantConditions
Dereference of `otherIterable` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWithLatestFromMany.java`
#### Snippet
```java

            try {
                for (Publisher<?> p : otherIterable) {
                    if (n == others.length) {
                        others = Arrays.copyOf(others, n + (n >> 1));
```

### ConstantConditions
Value `conn` is always 'null'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservablePublish.java`
#### Snippet
```java
            if (conn == null) {
                PublishConnection<T> fresh = new PublishConnection<>(current);
                if (!current.compareAndSet(conn, fresh)) {
                    continue;
                }
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
                        LeftRightEndObserver end = (LeftRightEndObserver)val;

                        UnicastSubject<TRight> up = lefts.remove(end.index);
                        disposables.remove(end);
                        if (up != null) {
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
                        LeftRightEndObserver end = (LeftRightEndObserver)val;

                        rights.remove(end.index);
                        disposables.remove(end);
                    }
```

### ConstantConditions
Method invocation `onComplete` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindow.java`
#### Snippet
```java

            if (c >= count) {
                ws.poll().onComplete();
                if (ws.isEmpty() && cancelled.get()) {
                    return;
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
                        LeftRightEndObserver end = (LeftRightEndObserver)val;

                        lefts.remove(end.index);
                        disposables.remove(end);
                    } else {
```

### ConstantConditions
Dereference of `end` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
                        LeftRightEndObserver end = (LeftRightEndObserver)val;

                        rights.remove(end.index);
                        disposables.remove(end);
                    }
```

### ConstantConditions
Dereference of `otherIterable` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWithLatestFromMany.java`
#### Snippet
```java

            try {
                for (ObservableSource<?> p : otherIterable) {
                    if (n == others.length) {
                        others = Arrays.copyOf(others, n + (n >> 1));
```

### ConstantConditions
Method invocation `run` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/ExecutorScheduler.java`
#### Snippet
```java

            Runnable run = q.poll();
            run.run(); // never null because of offer + increment happens first

            if (disposed) {
```

### ConstantConditions
Dereference of `prev` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            }
            if (NotificationLite.isComplete(v) || NotificationLite.isError(v)) {
                return (T)prev.value;
            }

```

### ConstantConditions
Dereference of `prev` may produce `NullPointerException`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            }
            if (NotificationLite.isComplete(v) || NotificationLite.isError(v)) {
                return (T)prev.value;
            }

```

## NumberEquality
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
                    Object val = q.poll();

                    if (mode == LEFT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TLeft left = (TLeft)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == RIGHT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TRight right = (TRight)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == LEFT_CLOSE) {
                        LeftRightEndSubscriber end = (LeftRightEndSubscriber)val;

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCache.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (current[i] == consumer) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublishMulticast.java`
#### Snippet
```java

                for (int i = 0; i < n; i++) {
                    if (current[i] == s) {
                        j = i;
                        break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublish.java`
#### Snippet
```java
                int j = -1;
                for (int i = 0; i < len; i++) {
                    if (c[i] == inner) {
                        j = i;
                        break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
                    Object val = q.poll();

                    if (mode == LEFT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TLeft left = (TLeft)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == RIGHT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TRight right = (TRight)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == LEFT_CLOSE) {
                        LeftRightEndSubscriber end = (LeftRightEndSubscriber)val;

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
                    Object val = q.poll();

                    if (mode == LEFT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TLeft left = (TLeft)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == RIGHT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TRight right = (TRight)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == LEFT_CLOSE) {
                        LeftRightEndObserver end = (LeftRightEndObserver)val;

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCache.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (current[i] == consumer) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
                    Object val = q.poll();

                    if (mode == LEFT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TLeft left = (TLeft)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == RIGHT_VALUE) {
                        @SuppressWarnings("unchecked")
                        TRight right = (TRight)val;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
                        }
                    }
                    else if (mode == LEFT_CLOSE) {
                        LeftRightEndObserver end = (LeftRightEndObserver)val;

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == ps) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == inner) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < len; i++) {
                if (a[i] == rs) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == ps) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < len; i++) {
                if (a[i] == rs) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == ps) {
                    j = i;
                    break;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            int j = -1;
            for (int i = 0; i < len; i++) {
                if (a[i] == rs) {
                    j = i;
                    break;
```

## BoundedWildcard
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableFromCompletionStage.java`
#### Snippet
```java
    final CompletionStage<T> stage;

    public ObservableFromCompletionStage(CompletionStage<T> stage) {
        this.stage = stage;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeMapOptional.java`
#### Snippet
```java
    final Function<? super T, Optional<? extends R>> mapper;

    public MaybeMapOptional(Maybe<T> source, Function<? super T, Optional<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromCompletionStage.java`
#### Snippet
```java
    final CompletionStage<T> stage;

    public FlowableFromCompletionStage(CompletionStage<T> stage) {
        this.stage = stage;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFromCompletionStage.java`
#### Snippet
```java
    final CompletionStage<T> stage;

    public MaybeFromCompletionStage(CompletionStage<T> stage) {
        this.stage = stage;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/SingleFromCompletionStage.java`
#### Snippet
```java
    final CompletionStage<T> stage;

    public SingleFromCompletionStage(CompletionStage<T> stage) {
        this.stage = stage;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelFlatMapStream.java`
#### Snippet
```java

    public ParallelFlatMapStream(
            ParallelFlowable<T> source,
            Function<? super T, ? extends Stream<? extends R>> mapper,
            int prefetch) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/SingleFlattenStreamAsFlowable.java`
#### Snippet
```java
    final Function<? super T, ? extends Stream<? extends R>> mapper;

    public SingleFlattenStreamAsFlowable(Single<T> source, Function<? super T, ? extends Stream<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollectorSingle.java`
#### Snippet
```java
    final Collector<? super T, A, R> collector;

    public ObservableCollectWithCollectorSingle(Observable<T> source, Collector<? super T, A, R> collector) {
        this.source = source;
        this.collector = collector;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableMapOptional.java`
#### Snippet
```java
    final Function<? super T, Optional<? extends R>> mapper;

    public FlowableMapOptional(Flowable<T> source, Function<? super T, Optional<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelMapTryOptional.java`
#### Snippet
```java

    public ParallelMapTryOptional(
            ParallelFlowable<T> source,
            Function<? super T, Optional<? extends R>> mapper,
            BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsObservable.java`
#### Snippet
```java
    final Function<? super T, ? extends Stream<? extends R>> mapper;

    public MaybeFlattenStreamAsObservable(Maybe<T> source, Function<? super T, ? extends Stream<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/SingleMapOptional.java`
#### Snippet
```java
    final Function<? super T, Optional<? extends R>> mapper;

    public SingleMapOptional(Single<T> source, Function<? super T, Optional<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollectorSingle.java`
#### Snippet
```java
    final Collector<? super T, A, R> collector;

    public FlowableCollectWithCollectorSingle(Flowable<T> source, Collector<? super T, A, R> collector) {
        this.source = source;
        this.collector = collector;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollectorSingle.java`
#### Snippet
```java
        A container;

        CollectorSingleObserver(SingleObserver<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.downstream = downstream;
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableMapOptional.java`
#### Snippet
```java
    final Function<? super T, Optional<? extends R>> mapper;

    public ObservableMapOptional(Observable<T> source, Function<? super T, Optional<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelCollector.java`
#### Snippet
```java
        boolean done;

        ParallelCollectorInnerSubscriber(ParallelCollectorSubscriber<T, A, R> parent, A container, BiConsumer<A, T> accumulator, BinaryOperator<A> combiner) {
            this.parent = parent;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelCollector.java`
#### Snippet
```java
        boolean done;

        ParallelCollectorInnerSubscriber(ParallelCollectorSubscriber<T, A, R> parent, A container, BiConsumer<A, T> accumulator, BinaryOperator<A> combiner) {
            this.parent = parent;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableFromStream.java`
#### Snippet
```java
    final Stream<T> stream;

    public ObservableFromStream(Stream<T> stream) {
        this.stream = stream;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsFlowable.java`
#### Snippet
```java
    final Function<? super T, ? extends Stream<? extends R>> mapper;

    public MaybeFlattenStreamAsFlowable(Maybe<T> source, Function<? super T, ? extends Stream<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollector.java`
#### Snippet
```java
    final Collector<? super T, A, R> collector;

    public ObservableCollectWithCollector(Observable<T> source, Collector<? super T, A, R> collector) {
        this.source = source;
        this.collector = collector;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorObserver(Observer<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorObserver(Observer<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorObserver(Observer<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorObserver(Observer<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorSubscriber(Subscriber<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorSubscriber(Subscriber<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? super A`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorSubscriber(Subscriber<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollector.java`
#### Snippet
```java
        A container;

        CollectorSubscriber(Subscriber<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.container = container;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableCollectWithCollector.java`
#### Snippet
```java
    final Collector<? super T, A, R> collector;

    public FlowableCollectWithCollector(Flowable<T> source, Collector<? super T, A, R> collector) {
        this.source = source;
        this.collector = collector;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelMapOptional.java`
#### Snippet
```java
    final Function<? super T, Optional<? extends R>> mapper;

    public ParallelMapOptional(ParallelFlowable<T> source, Function<? super T, Optional<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
    final Stream<T> stream;

    public FlowableFromStream(Stream<T> stream) {
        this.stream = stream;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/SingleFlattenStreamAsObservable.java`
#### Snippet
```java
    final Function<? super T, ? extends Stream<? extends R>> mapper;

    public SingleFlattenStreamAsObservable(Single<T> source, Function<? super T, ? extends Stream<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableFlatMapStream.java`
#### Snippet
```java
    final Function<? super T, ? extends Stream<? extends R>> mapper;

    public ObservableFlatMapStream(Observable<T> source, Function<? super T, ? extends Stream<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFlatMapStream.java`
#### Snippet
```java
    final int prefetch;

    public FlowableFlatMapStream(Flowable<T> source, Function<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super @NonNull MaybeObserver`
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
     */
    @SuppressWarnings("rawtypes")
    public static void setOnMaybeSubscribe(@Nullable BiFunction<? super Maybe, @NonNull MaybeObserver, @NonNull ? extends MaybeObserver> onMaybeSubscribe) {
        if (lockdown) {
            throw new IllegalStateException("Plugins can't be changed anymore");
```

### BoundedWildcard
Can generalize to `? extends Scheduler`
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
     */
    @NonNull
    static Scheduler callRequireNonNull(@NonNull Supplier<Scheduler> s) {
        try {
            return Objects.requireNonNull(s.get(), "Scheduler Supplier result can't be null");
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
     * @param qd the QueueDrain instance that gives status information to the drain logic
     */
    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> q, Subscriber<? super U> a, boolean delayError,
            Disposable dispose, QueueDrain<T, U> qd) {
        int missed = 1;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
     */
    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> q, Subscriber<? super U> a, boolean delayError,
            Disposable dispose, QueueDrain<T, U> qd) {
        int missed = 1;

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> q, Observer<? super U> a, boolean delayError, Disposable dispose, ObservableQueueDrain<T, U> qd) {

        int missed = 1;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> q, Observer<? super U> a, boolean delayError, Disposable dispose, ObservableQueueDrain<T, U> qd) {

        int missed = 1;
```

### BoundedWildcard
Can generalize to `? super Subscription`
in `src/main/java/io/reactivex/rxjava3/internal/util/EndConsumerHelper.java`
#### Snippet
```java
     * @return true if successful, false if the content of the AtomicReference was non null
     */
    public static boolean setOnce(AtomicReference<Subscription> upstream, Subscription next, Class<?> subscriber) {
        Objects.requireNonNull(next, "next is null");
        if (!upstream.compareAndSet(null, next)) {
```

### BoundedWildcard
Can generalize to `? super Disposable`
in `src/main/java/io/reactivex/rxjava3/internal/util/EndConsumerHelper.java`
#### Snippet
```java
     * @return true if successful, false if the content of the AtomicReference was non null
     */
    public static boolean setOnce(AtomicReference<Disposable> upstream, Disposable next, Class<?> observer) {
        Objects.requireNonNull(next, "next is null");
        if (!upstream.compareAndSet(null, next)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFlatMapCompletable.java`
#### Snippet
```java
    final Function<? super T, ? extends CompletableSource> mapper;

    public MaybeFlatMapCompletable(MaybeSource<T> source, Function<? super T, ? extends CompletableSource> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFlatMapIterableFlowable.java`
#### Snippet
```java
    final Function<? super T, ? extends Iterable<? extends R>> mapper;

    public MaybeFlatMapIterableFlowable(MaybeSource<T> source,
            Function<? super T, ? extends Iterable<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFlatMapSingle.java`
#### Snippet
```java
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;

    public MaybeFlatMapSingle(MaybeSource<T> source, Function<? super T, ? extends SingleSource<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFilterSingle.java`
#### Snippet
```java
    final Predicate<? super T> predicate;

    public MaybeFilterSingle(SingleSource<T> source, Predicate<? super T> predicate) {
        this.source = source;
        this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMaterialize.java`
#### Snippet
```java
    final Maybe<T> source;

    public MaybeMaterialize(Maybe<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeZipArray.java`
#### Snippet
```java
        final int index;

        ZipMaybeObserver(ZipCoordinator<T, ?> parent, int index) {
            this.parent = parent;
            this.index = index;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeTimeInterval.java`
#### Snippet
```java
    final boolean start;

    public MaybeTimeInterval(MaybeSource<T> source, TimeUnit unit, Scheduler scheduler, boolean start) {
        this.source = source;
        this.unit = unit;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeSubscribeOn.java`
#### Snippet
```java
        final MaybeSource<T> source;

        SubscribeTask(MaybeObserver<? super T> observer, MaybeSource<T> source) {
            this.observer = observer;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeTakeUntilPublisher.java`
#### Snippet
```java
    final Publisher<U> other;

    public MaybeTakeUntilPublisher(MaybeSource<T> source, Publisher<U> other) {
        super(source);
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final <@NonNull T> Flowable<T> startWith(@NonNull MaybeSource<T> other) {
        Objects.requireNonNull(other, "other is null");
        return Flowable.concat(Maybe.wrap(other).toFlowable(), toFlowable());
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull T> Flowable<T> startWith(@NonNull Publisher<T> other) {
        Objects.requireNonNull(other, "other is null");
        return this.<T>toFlowable().startWith(other);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull T> Flowable<T> andThen(@NonNull Publisher<T> next) {
        Objects.requireNonNull(next, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenPublisher<>(this, next));
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
    @NonNull
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull T> Observable<T> andThen(@NonNull ObservableSource<T> next) {
        Objects.requireNonNull(next, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenObservable<>(this, next));
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final <@NonNull T> Flowable<T> startWith(@NonNull SingleSource<T> other) {
        Objects.requireNonNull(other, "other is null");
        return Flowable.concat(Single.wrap(other).toFlowable(), toFlowable());
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybePeek.java`
#### Snippet
```java
        Disposable upstream;

        MaybePeekObserver(MaybeObserver<? super T> actual, MaybePeek<T> parent) {
            this.downstream = actual;
            this.parent = parent;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeTakeUntilMaybe.java`
#### Snippet
```java
    final MaybeSource<U> other;

    public MaybeTakeUntilMaybe(MaybeSource<T> source, MaybeSource<U> other) {
        super(source);
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeDelayWithCompletable.java`
#### Snippet
```java
        final MaybeSource<T> source;

        OtherObserver(MaybeObserver<? super T> actual, MaybeSource<T> source) {
            this.downstream = actual;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeDelayWithCompletable.java`
#### Snippet
```java
    final CompletableSource other;

    public MaybeDelayWithCompletable(MaybeSource<T> source, CompletableSource other) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFlatMapIterableObservable.java`
#### Snippet
```java
    final Function<? super T, ? extends Iterable<? extends R>> mapper;

    public MaybeFlatMapIterableObservable(MaybeSource<T> source,
            Function<? super T, ? extends Iterable<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/SingleFlatMapObservable.java`
#### Snippet
```java
    final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

    public SingleFlatMapObservable(SingleSource<T> source,
            Function<? super T, ? extends ObservableSource<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapMaybePublisher.java`
#### Snippet
```java
    final int prefetch;

    public FlowableConcatMapMaybePublisher(Publisher<T> source,
            Function<? super T, ? extends MaybeSource<? extends R>> mapper,
                    ErrorMode errorMode, int prefetch) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapSinglePublisher.java`
#### Snippet
```java
    final boolean delayErrors;

    public FlowableSwitchMapSinglePublisher(Publisher<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> mapper,
            boolean delayErrors) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/MaybeFlatMapObservable.java`
#### Snippet
```java
    final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

    public MaybeFlatMapObservable(MaybeSource<T> source,
            Function<? super T, ? extends ObservableSource<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/MaybeFlatMapPublisher.java`
#### Snippet
```java
    final Function<? super T, ? extends Publisher<? extends R>> mapper;

    public MaybeFlatMapPublisher(MaybeSource<T> source,
            Function<? super T, ? extends Publisher<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapCompletable.java`
#### Snippet
```java
    final int prefetch;

    public FlowableConcatMapCompletable(Flowable<T> source,
            Function<? super T, ? extends CompletableSource> mapper,
            ErrorMode errorMode,
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapSingle.java`
#### Snippet
```java
    final boolean delayErrors;

    public ObservableSwitchMapSingle(Observable<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> mapper,
            boolean delayErrors) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapMaybe.java`
#### Snippet
```java
    final boolean delayErrors;

    public ObservableSwitchMapMaybe(Observable<T> source,
            Function<? super T, ? extends MaybeSource<? extends R>> mapper,
            boolean delayErrors) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapCompletable.java`
#### Snippet
```java
    final boolean delayErrors;

    public FlowableSwitchMapCompletable(Flowable<T> source,
            Function<? super T, ? extends CompletableSource> mapper, boolean delayErrors) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapMaybe.java`
#### Snippet
```java
    final boolean delayErrors;

    public FlowableSwitchMapMaybe(Flowable<T> source,
            Function<? super T, ? extends MaybeSource<? extends R>> mapper,
            boolean delayErrors) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapSinglePublisher.java`
#### Snippet
```java
    final int prefetch;

    public FlowableConcatMapSinglePublisher(Publisher<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> mapper,
                    ErrorMode errorMode, int prefetch) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapCompletable.java`
#### Snippet
```java
    final int prefetch;

    public ObservableConcatMapCompletable(Observable<T> source,
            Function<? super T, ? extends CompletableSource> mapper,
            ErrorMode errorMode,
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapMaybe.java`
#### Snippet
```java
    final int prefetch;

    public FlowableConcatMapMaybe(Flowable<T> source,
            Function<? super T, ? extends MaybeSource<? extends R>> mapper,
                    ErrorMode errorMode, int prefetch) {
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapMaybe.java`
#### Snippet
```java
            final ConcatMapMaybeSubscriber<?, R> parent;

            ConcatMapMaybeObserver(ConcatMapMaybeSubscriber<?, R> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapSingle.java`
#### Snippet
```java
    final boolean delayErrors;

    public FlowableSwitchMapSingle(Flowable<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> mapper,
            boolean delayErrors) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapCompletablePublisher.java`
#### Snippet
```java
    final boolean delayErrors;

    public FlowableSwitchMapCompletablePublisher(Publisher<T> source,
            Function<? super T, ? extends CompletableSource> mapper, boolean delayErrors) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableSwitchMapMaybePublisher.java`
#### Snippet
```java
    final boolean delayErrors;

    public FlowableSwitchMapMaybePublisher(Publisher<T> source,
            Function<? super T, ? extends MaybeSource<? extends R>> mapper,
            boolean delayErrors) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapCompletable.java`
#### Snippet
```java
    final boolean delayErrors;

    public ObservableSwitchMapCompletable(Observable<T> source,
            Function<? super T, ? extends CompletableSource> mapper, boolean delayErrors) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleTimeout.java`
#### Snippet
```java
    final SingleSource<? extends T> other;

    public SingleTimeout(SingleSource<T> source, long timeout, TimeUnit unit, Scheduler scheduler,
                         SingleSource<? extends T> other) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFromUnsafeSource.java`
#### Snippet
```java
    final SingleSource<T> source;

    public SingleFromUnsafeSource(SingleSource<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapSingle.java`
#### Snippet
```java
    final int prefetch;

    public ObservableConcatMapSingle(ObservableSource<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> mapper,
                    ErrorMode errorMode, int prefetch) {
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapSingle.java`
#### Snippet
```java
            final ConcatMapSingleMainObserver<?, R> parent;

            ConcatMapSingleObserver(ConcatMapSingleMainObserver<?, R> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapMaybe.java`
#### Snippet
```java
            final ConcatMapMaybeMainObserver<?, R> parent;

            ConcatMapMaybeObserver(ConcatMapMaybeMainObserver<?, R> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapMaybe.java`
#### Snippet
```java
    final int prefetch;

    public ObservableConcatMapMaybe(Observable<T> source,
            Function<? super T, ? extends MaybeSource<? extends R>> mapper,
                    ErrorMode errorMode, int prefetch) {
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapSingle.java`
#### Snippet
```java
            final ConcatMapSingleSubscriber<?, R> parent;

            ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/FlowableConcatMapSingle.java`
#### Snippet
```java
    final int prefetch;

    public FlowableConcatMapSingle(Flowable<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> mapper,
                    ErrorMode errorMode, int prefetch) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoFinally.java`
#### Snippet
```java
    final Action onFinally;

    public SingleDoFinally(SingleSource<T> source, Action onFinally) {
        this.source = source;
        this.onFinally = onFinally;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapCompletable.java`
#### Snippet
```java
    final Function<? super T, ? extends CompletableSource> mapper;

    public SingleFlatMapCompletable(SingleSource<T> source, Function<? super T, ? extends CompletableSource> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleTakeUntil.java`
#### Snippet
```java
    final Publisher<U> other;

    public SingleTakeUntil(SingleSource<T> source, Publisher<U> other) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDetach.java`
#### Snippet
```java
    final SingleSource<T> source;

    public SingleDetach(SingleSource<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithObservable.java`
#### Snippet
```java
        boolean done;

        OtherSubscriber(SingleObserver<? super T> actual, SingleSource<T> source) {
            this.downstream = actual;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithObservable.java`
#### Snippet
```java
    final ObservableSource<U> other;

    public SingleDelayWithObservable(SingleSource<T> source, ObservableSource<U> other) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleMaterialize.java`
#### Snippet
```java
    final Single<T> source;

    public SingleMaterialize(Single<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapIterableObservable.java`
#### Snippet
```java
    final Function<? super T, ? extends Iterable<? extends R>> mapper;

    public SingleFlatMapIterableObservable(SingleSource<T> source,
            Function<? super T, ? extends Iterable<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithSingle.java`
#### Snippet
```java
        final SingleSource<T> source;

        OtherObserver(SingleObserver<? super T> actual, SingleSource<T> source) {
            this.downstream = actual;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithSingle.java`
#### Snippet
```java
    final SingleSource<U> other;

    public SingleDelayWithSingle(SingleSource<T> source, SingleSource<U> other) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleObserveOn.java`
#### Snippet
```java
    final Scheduler scheduler;

    public SingleObserveOn(SingleSource<T> source, Scheduler scheduler) {
        this.source = source;
        this.scheduler = scheduler;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapIterableFlowable.java`
#### Snippet
```java
    final Function<? super T, ? extends Iterable<? extends R>> mapper;

    public SingleFlatMapIterableFlowable(SingleSource<T> source,
            Function<? super T, ? extends Iterable<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleZipArray.java`
#### Snippet
```java
        final int index;

        ZipSingleObserver(ZipCoordinator<T, ?> parent, int index) {
            this.parent = parent;
            this.index = index;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoOnLifecycle.java`
#### Snippet
```java
    final Action onDispose;

    public SingleDoOnLifecycle(Single<T> upstream, Consumer<? super Disposable> onSubscribe,
            Action onDispose) {
        this.source = upstream;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleUsing.java`
#### Snippet
```java
    final boolean eager;

    public SingleUsing(Supplier<U> resourceSupplier,
                       Function<? super U, ? extends SingleSource<? extends T>> singleFunction,
                       Consumer<? super U> disposer,
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoOnSubscribe.java`
#### Snippet
```java
    final Consumer<? super Disposable> onSubscribe;

    public SingleDoOnSubscribe(SingleSource<T> source, Consumer<? super Disposable> onSubscribe) {
        this.source = source;
        this.onSubscribe = onSubscribe;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapNotification.java`
#### Snippet
```java
    final Function<? super Throwable, ? extends SingleSource<? extends R>> onErrorMapper;

    public SingleFlatMapNotification(SingleSource<T> source,
            Function<? super T, ? extends SingleSource<? extends R>> onSuccessMapper,
            Function<? super Throwable, ? extends SingleSource<? extends R>> onErrorMapper) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithPublisher.java`
#### Snippet
```java
    final Publisher<U> other;

    public SingleDelayWithPublisher(SingleSource<T> source, Publisher<U> other) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithPublisher.java`
#### Snippet
```java
        Subscription upstream;

        OtherSubscriber(SingleObserver<? super T> actual, SingleSource<T> source) {
            this.downstream = actual;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleOnErrorComplete.java`
#### Snippet
```java
    final Predicate<? super Throwable> predicate;

    public SingleOnErrorComplete(Single<T> source,
            Predicate<? super Throwable> predicate) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleUnsubscribeOn.java`
#### Snippet
```java
    final Scheduler scheduler;

    public SingleUnsubscribeOn(SingleSource<T> source, Scheduler scheduler) {
        this.source = source;
        this.scheduler = scheduler;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithCompletable.java`
#### Snippet
```java
        final SingleSource<T> source;

        OtherObserver(SingleObserver<? super T> actual, SingleSource<T> source) {
            this.downstream = actual;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDelayWithCompletable.java`
#### Snippet
```java
    final CompletableSource other;

    public SingleDelayWithCompletable(SingleSource<T> source, CompletableSource other) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapBiSelector.java`
#### Snippet
```java
    final BiFunction<? super T, ? super U, ? extends R> resultSelector;

    public SingleFlatMapBiSelector(SingleSource<T> source,
            Function<? super T, ? extends SingleSource<? extends U>> mapper,
            BiFunction<? super T, ? super U, ? extends R> resultSelector) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleTimeInterval.java`
#### Snippet
```java
    final boolean start;

    public SingleTimeInterval(SingleSource<T> source, TimeUnit unit, Scheduler scheduler, boolean start) {
        this.source = source;
        this.unit = unit;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoAfterSuccess.java`
#### Snippet
```java
    final Consumer<? super T> onAfterSuccess;

    public SingleDoAfterSuccess(SingleSource<T> source, Consumer<? super T> onAfterSuccess) {
        this.source = source;
        this.onAfterSuccess = onAfterSuccess;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoAfterTerminate.java`
#### Snippet
```java
    final Action onAfterTerminate;

    public SingleDoAfterTerminate(SingleSource<T> source, Action onAfterTerminate) {
        this.source = source;
        this.onAfterTerminate = onAfterTerminate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoOnDispose.java`
#### Snippet
```java
    final Action onDispose;

    public SingleDoOnDispose(SingleSource<T> source, Action onDispose) {
        this.source = source;
        this.onDispose = onDispose;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleLift.java`
#### Snippet
```java
    final SingleOperator<? extends R, ? super T> onLift;

    public SingleLift(SingleSource<T> source, SingleOperator<? extends R, ? super T> onLift) {
        this.source = source;
        this.onLift = onLift;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapPublisher.java`
#### Snippet
```java
    final Function<? super T, ? extends Publisher<? extends R>> mapper;

    public SingleFlatMapPublisher(SingleSource<T> source,
            Function<? super T, ? extends Publisher<? extends R>> mapper) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDematerialize.java`
#### Snippet
```java
    final Function<? super T, Notification<R>> selector;

    public SingleDematerialize(Single<T> source, Function<? super T, Notification<R>> selector) {
        this.source = source;
        this.selector = selector;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
        int produced;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> parent, int index, int prefetch) {
            this.parent = parent;
            this.index = index;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCollectSingle.java`
#### Snippet
```java
    final BiConsumer<? super U, ? super T> collector;

    public FlowableCollectSingle(Flowable<T> source, Supplier<? extends U> initialSupplier, BiConsumer<? super U, ? super T> collector) {
        this.source = source;
        this.initialSupplier = initialSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableToListSingle.java`
#### Snippet
```java
    }

    public FlowableToListSingle(Flowable<T> source, Supplier<U> collectionSupplier) {
        this.source = source;
        this.collectionSupplier = collectionSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/BlockingFlowableMostRecent.java`
#### Snippet
```java
    final T initialValue;

    public BlockingFlowableMostRecent(Flowable<T> source, T initialValue) {
        this.source = source;
        this.initialValue = initialValue;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMergeWithMaybe.java`
#### Snippet
```java
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableTakePublisher.java`
#### Snippet
```java
    final Publisher<T> source;
    final long limit;
    public FlowableTakePublisher(Publisher<T> source, long limit) {
        this.source = source;
        this.limit = limit;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapSinglePublisher.java`
#### Snippet
```java
    final int maxConcurrency;

    public FlowableFlatMapSinglePublisher(Publisher<T> source, Function<? super T, ? extends SingleSource<? extends R>> mapper,
            boolean delayError, int maxConcurrency) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapMaybePublisher.java`
#### Snippet
```java
    final int maxConcurrency;

    public FlowableFlatMapMaybePublisher(Publisher<T> source, Function<? super T, ? extends MaybeSource<? extends R>> mapper,
            boolean delayError, int maxConcurrency) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScanSeed.java`
#### Snippet
```java
        int consumed;

        ScanSeedSubscriber(Subscriber<? super R> actual, BiFunction<R, ? super T, R> accumulator, R value, int prefetch) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScanSeed.java`
#### Snippet
```java
        int consumed;

        ScanSeedSubscriber(Subscriber<? super R> actual, BiFunction<R, ? super T, R> accumulator, R value, int prefetch) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScanSeed.java`
#### Snippet
```java
    final Supplier<R> seedSupplier;

    public FlowableScanSeed(Flowable<T> source, Supplier<R> seedSupplier, BiFunction<R, ? super T, R> accumulator) {
        super(source);
        this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableElementAtMaybePublisher.java`
#### Snippet
```java
    final long index;

    public FlowableElementAtMaybePublisher(Publisher<T> source, long index) {
        this.source = source;
        this.index = index;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/BlockingFlowableIterable.java`
#### Snippet
```java
    final int bufferSize;

    public BlockingFlowableIterable(Flowable<T> source, int bufferSize) {
        this.source = source;
        this.bufferSize = bufferSize;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMapEagerPublisher.java`
#### Snippet
```java
    final ErrorMode errorMode;

    public FlowableConcatMapEagerPublisher(Publisher<T> source,
            Function<? super T, ? extends Publisher<? extends R>> mapper,
            int maxConcurrency,
```

### BoundedWildcard
Can generalize to `? super B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundarySelector.java`
#### Snippet
```java
            final WindowBoundaryMainSubscriber<?, B, ?> parent;

            WindowStartSubscriber(WindowBoundaryMainSubscriber<?, B, ?> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundarySelector.java`
#### Snippet
```java

        WindowBoundaryMainSubscriber(Subscriber<? super Flowable<T>> actual,
                Publisher<B> open, Function<? super B, ? extends Publisher<V>> closingIndicator, int bufferSize) {
            this.downstream = actual;
            this.queue = new MpscLinkedQueue<>();
```

### BoundedWildcard
Can generalize to `? extends B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundarySelector.java`
#### Snippet
```java
    public FlowableWindowBoundarySelector(
            Flowable<T> source,
            Publisher<B> open, Function<? super B, ? extends Publisher<V>> closingIndicator,
            int bufferSize) {
        super(source);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundarySelector.java`
#### Snippet
```java
            final AtomicBoolean once;

            WindowEndSubscriberIntercept(WindowBoundaryMainSubscriber<T, ?, V> parent, UnicastProcessor<T> window) {
                this.parent = parent;
                this.window = window;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinct.java`
#### Snippet
```java
        final Function<? super T, K> keySelector;

        DistinctSubscriber(Subscriber<? super T> actual, Function<? super T, K> keySelector, Collection<? super K> collection) {
            super(actual);
            this.keySelector = keySelector;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinct.java`
#### Snippet
```java
    final Supplier<? extends Collection<? super K>> collectionSupplier;

    public FlowableDistinct(Flowable<T> source, Function<? super T, K> keySelector, Supplier<? extends Collection<? super K>> collectionSupplier) {
        super(source);
        this.keySelector = keySelector;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceMaybe.java`
#### Snippet
```java
        boolean done;

        ReduceSubscriber(MaybeObserver<? super T> actual, BiFunction<T, T, T> reducer) {
            this.downstream = actual;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceMaybe.java`
#### Snippet
```java
        boolean done;

        ReduceSubscriber(MaybeObserver<? super T> actual, BiFunction<T, T, T> reducer) {
            this.downstream = actual;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceMaybe.java`
#### Snippet
```java
        boolean done;

        ReduceSubscriber(MaybeObserver<? super T> actual, BiFunction<T, T, T> reducer) {
            this.downstream = actual;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduce.java`
#### Snippet
```java
        Subscription upstream;

        ReduceSubscriber(Subscriber<? super T> actual, BiFunction<T, T, T> reducer) {
            super(actual);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduce.java`
#### Snippet
```java
        Subscription upstream;

        ReduceSubscriber(Subscriber<? super T> actual, BiFunction<T, T, T> reducer) {
            super(actual);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduce.java`
#### Snippet
```java
        Subscription upstream;

        ReduceSubscriber(Subscriber<? super T> actual, BiFunction<T, T, T> reducer) {
            super(actual);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport(SchedulerSupport.NONE)
    public final Flowable<T> startWith(@NonNull Publisher<T> other) {
        Objects.requireNonNull(other, "other is null");
        return toFlowable().startWith(other);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final Flowable<T> startWith(@NonNull MaybeSource<T> other) {
        Objects.requireNonNull(other, "other is null");
        return Flowable.concat(Maybe.wrap(other).toFlowable(), toFlowable());
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
    @NonNull
    @SchedulerSupport(SchedulerSupport.NONE)
    public final Single<T> onErrorReturn(@NonNull Function<Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return RxJavaPlugins.onAssembly(new SingleOnErrorReturn<>(this, itemSupplier, null));
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
    @NonNull
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull U> Maybe<U> ofType(@NonNull Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return filter(Functions.isInstanceOf(clazz)).cast(clazz);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final Flowable<T> startWith(@NonNull SingleSource<T> other) {
        Objects.requireNonNull(other, "other is null");
        return Flowable.concat(Single.wrap(other).toFlowable(), toFlowable());
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMap.java`
#### Snippet
```java
        long produced;

        ConcatMapInner(ConcatMapSupport<R> parent) {
            super(false);
            this.parent = parent;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMergeWithSingle.java`
#### Snippet
```java
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRepeatWhen.java`
#### Snippet
```java
        WhenSourceSubscriber<T, U> subscriber;

        WhenReceiver(Publisher<T> source) {
            this.source = source;
            this.upstream = new AtomicReference<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport(SchedulerSupport.NONE)
    public final Flowable<T> startWith(@NonNull Publisher<T> other) {
        Objects.requireNonNull(other, "other is null");
        return toFlowable().startWith(other);
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
    @NonNull
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull U> Maybe<U> ofType(@NonNull Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return filter(Functions.isInstanceOf(clazz)).cast(clazz);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final Flowable<T> startWith(@NonNull MaybeSource<T> other) {
        Objects.requireNonNull(other, "other is null");
        return Flowable.concat(Maybe.wrap(other).toFlowable(), toFlowable());
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final Flowable<T> startWith(@NonNull SingleSource<T> other) {
        Objects.requireNonNull(other, "other is null");
        return Flowable.concat(Single.wrap(other).toFlowable(), toFlowable());
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScan.java`
#### Snippet
```java
        boolean done;

        ScanSubscriber(Subscriber<? super T> actual, BiFunction<T, T, T> accumulator) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScan.java`
#### Snippet
```java
        boolean done;

        ScanSubscriber(Subscriber<? super T> actual, BiFunction<T, T, T> accumulator) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScan.java`
#### Snippet
```java
        boolean done;

        ScanSubscriber(Subscriber<? super T> actual, BiFunction<T, T, T> accumulator) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceSeedSingle.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public FlowableReduceSeedSingle(Publisher<T> source, R seed, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.seed = seed;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceSeedSingle.java`
#### Snippet
```java
        Subscription upstream;

        ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
            this.downstream = actual;
            this.value = value;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceSeedSingle.java`
#### Snippet
```java
        Subscription upstream;

        ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
            this.downstream = actual;
            this.value = value;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
    final Supplier<U> bufferSupplier;

    public FlowableBufferExactBoundary(Flowable<T> source, Publisher<B> boundary, Supplier<U> bufferSupplier) {
        super(source);
        this.boundary = boundary;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableAllSingle.java`
#### Snippet
```java
    final Predicate<? super T> predicate;

    public FlowableAllSingle(Flowable<T> source, Predicate<? super T> predicate) {
        this.source = source;
        this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableLastMaybe.java`
#### Snippet
```java
    final Publisher<T> source;

    public FlowableLastMaybe(Publisher<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
        final AtomicBoolean evictOnce = new AtomicBoolean();

        State(int bufferSize, GroupBySubscriber<?, K, T> parent, K key, boolean delayError) {
            this.queue = new SpscLinkedArrayQueue<>(bufferSize);
            this.parent = parent;
```

### BoundedWildcard
Can generalize to `? super GroupedUnicast`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
        final Queue<GroupedUnicast<K, V>> evictedGroups;

        EvictionAction(Queue<GroupedUnicast<K, V>> evictedGroups) {
            this.evictedGroups = evictedGroups;
        }
```

### BoundedWildcard
Can generalize to `? super Emitter`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableInternalHelper.java`
#### Snippet
```java
        final Consumer<Emitter<T>> consumer;

        SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }
```

### BoundedWildcard
Can generalize to `? super S`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableInternalHelper.java`
#### Snippet
```java
        final BiConsumer<S, Emitter<T>> consumer;

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
            this.consumer = consumer;
        }
```

### BoundedWildcard
Can generalize to `? super Emitter`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableInternalHelper.java`
#### Snippet
```java
        final BiConsumer<S, Emitter<T>> consumer;

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
            this.consumer = consumer;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableInternalHelper.java`
#### Snippet
```java
        final Subscriber<T> subscriber;

        SubscriberOnNext(Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDebounce.java`
#### Snippet
```java
            final AtomicBoolean once = new AtomicBoolean();

            DebounceInnerSubscriber(DebounceSubscriber<T, U> parent, long index, T value) {
                this.parent = parent;
                this.index = index;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableAnySingle.java`
#### Snippet
```java
    final Predicate<? super T> predicate;

    public FlowableAnySingle(Flowable<T> source, Predicate<? super T> predicate) {
        this.source = source;
        this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged.java`
#### Snippet
```java

        DistinctUntilChangedSubscriber(Subscriber<? super T> actual,
                Function<? super T, K> keySelector,
                BiPredicate<? super K, ? super K> comparer) {
            super(actual);
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged.java`
#### Snippet
```java

        DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber<? super T> actual,
                Function<? super T, K> keySelector,
                BiPredicate<? super K, ? super K> comparer) {
            super(actual);
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged.java`
#### Snippet
```java
    final BiPredicate<? super K, ? super K> comparer;

    public FlowableDistinctUntilChanged(Flowable<T> source, Function<? super T, K> keySelector, BiPredicate<? super K, ? super K> comparer) {
        super(source);
        this.keySelector = keySelector;
```

### BoundedWildcard
Can generalize to `? super U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWithLatestFrom.java`
#### Snippet
```java
        private final WithLatestFromSubscriber<T, U, R> wlf;

        FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> wlf) {
            this.wlf = wlf;
        }
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        BufferExactBoundedSubscriber(
                Subscriber<? super U> actual,
                Supplier<U> bufferSupplier,
                long timespan, TimeUnit unit, int maxSize,
                boolean restartOnMaxSize, Worker w) {
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

        BufferExactUnboundedSubscriber(
                Subscriber<? super U> actual, Supplier<U> bufferSupplier,
                long timespan, TimeUnit unit, Scheduler scheduler) {
            super(actual, new MpscLinkedQueue<>());
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
    final boolean restartTimerOnMaxSize;

    public FlowableBufferTimed(Flowable<T> source, long timespan, long timeskip, TimeUnit unit, Scheduler scheduler, Supplier<U> bufferSupplier, int maxSize,
            boolean restartTimerOnMaxSize) {
        super(source);
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableZipIterable.java`
#### Snippet
```java
        boolean done;

        ZipIterableSubscriber(Subscriber<? super V> actual, Iterator<U> iterator,
                BiFunction<? super T, ? super U, ? extends V> zipper) {
            this.downstream = actual;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableToList.java`
#### Snippet
```java
    final Supplier<U> collectionSupplier;

    public FlowableToList(Flowable<T> source, Supplier<U> collectionSupplier) {
        super(source);
        this.collectionSupplier = collectionSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowSubscribeIntercept.java`
#### Snippet
```java
    final AtomicBoolean once;

    FlowableWindowSubscribeIntercept(FlowableProcessor<T> source) {
        this.window = source;
        this.once = new AtomicBoolean();
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T4`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T5`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T6`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T7`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T8`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T9`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Class<U> clazz;

        CastToClass(Class<U> clazz) {
            this.clazz = clazz;
        }
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T4`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T5`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T6`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T7`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T8`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T4`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T5`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T6`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T4`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T5`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T6`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T7`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function4<T1, T2, T3, T4, R> f;

        Array4Func(Function4<T1, T2, T3, T4, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function4<T1, T2, T3, T4, R> f;

        Array4Func(Function4<T1, T2, T3, T4, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function4<T1, T2, T3, T4, R> f;

        Array4Func(Function4<T1, T2, T3, T4, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T4`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function4<T1, T2, T3, T4, R> f;

        Array4Func(Function4<T1, T2, T3, T4, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function4<T1, T2, T3, T4, R> f;

        Array4Func(Function4<T1, T2, T3, T4, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        private final Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        private final Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        private final Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T4`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        private final Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T5`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        private final Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        private final Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T1`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function3<T1, T2, T3, R> f;

        Array3Func(Function3<T1, T2, T3, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T2`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function3<T1, T2, T3, R> f;

        Array3Func(Function3<T1, T2, T3, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? super T3`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function3<T1, T2, T3, R> f;

        Array3Func(Function3<T1, T2, T3, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        final Function3<T1, T2, T3, R> f;

        Array3Func(Function3<T1, T2, T3, R> f) {
            this.f = f;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMapPublisher.java`
#### Snippet
```java

    final Function<? super T, ? extends U> mapper;
    public FlowableMapPublisher(Publisher<T> source, Function<? super T, ? extends U> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromObservable.java`
#### Snippet
```java
    private final ObservableSource<T> upstream;

    public FlowableFromObservable(ObservableSource<T> upstream) {
        this.upstream = upstream;
    }
```

### BoundedWildcard
Can generalize to `? extends C`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBuffer.java`
#### Snippet
```java
    final Supplier<C> bufferSupplier;

    public FlowableBuffer(Flowable<T> source, int size, int skip, Supplier<C> bufferSupplier) {
        super(source);
        this.size = size;
```

### BoundedWildcard
Can generalize to `? extends C`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBuffer.java`
#### Snippet
```java
        int index;

        PublisherBufferExactSubscriber(Subscriber<? super C> actual, int size, Supplier<C> bufferSupplier) {
            this.downstream = actual;
            this.size = size;
```

### BoundedWildcard
Can generalize to `? extends C`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBuffer.java`
#### Snippet
```java

        PublisherBufferSkipSubscriber(Subscriber<? super C> actual, int size, int skip,
                Supplier<C> bufferSupplier) {
            this.downstream = actual;
            this.size = size;
```

### BoundedWildcard
Can generalize to `? extends C`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBuffer.java`
#### Snippet
```java

        PublisherBufferOverlappingSubscriber(Subscriber<? super C> actual, int size, int skip,
                Supplier<C> bufferSupplier) {
            this.downstream = actual;
            this.size = size;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWithLatestFromMany.java`
#### Snippet
```java
        volatile boolean done;

        WithLatestFromSubscriber(Subscriber<? super R> actual, Function<? super Object[], R> combiner, int n) {
            this.downstream = actual;
            this.combiner = combiner;
```

### BoundedWildcard
Can generalize to `? extends S`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGenerate.java`
#### Snippet
```java
    final Consumer<? super S> disposeState;

    public FlowableGenerate(Supplier<S> stateSupplier, BiFunction<S, Emitter<T>, S> generator,
            Consumer<? super S> disposeState) {
        this.stateSupplier = stateSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSamplePublisher.java`
#### Snippet
```java
    final boolean emitLast;

    public FlowableSamplePublisher(Publisher<T> source, Publisher<?> other, boolean emitLast) {
        this.source = source;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableLastSingle.java`
#### Snippet
```java
    final T defaultItem;

    public FlowableLastSingle(Publisher<T> source, T defaultItem) {
        this.source = source;
        this.defaultItem = defaultItem;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureReduce.java`
#### Snippet
```java
        final BiFunction<T, T, T> reducer;

        BackpressureReduceSubscriber(@NonNull Subscriber<? super T> downstream, @NonNull BiFunction<T, T, T> reducer) {
            super(downstream);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureReduce.java`
#### Snippet
```java
        final BiFunction<T, T, T> reducer;

        BackpressureReduceSubscriber(@NonNull Subscriber<? super T> downstream, @NonNull BiFunction<T, T, T> reducer) {
            super(downstream);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureReduce.java`
#### Snippet
```java
        final BiFunction<T, T, T> reducer;

        BackpressureReduceSubscriber(@NonNull Subscriber<? super T> downstream, @NonNull BiFunction<T, T, T> reducer) {
            super(downstream);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceWithSingle.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public FlowableReduceWithSingle(Publisher<T> source, Supplier<R> seedSupplier, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.seedSupplier = seedSupplier;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReduceWithSingle.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public FlowableReduceWithSingle(Publisher<T> source, Supplier<R> seedSupplier, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.seedSupplier = seedSupplier;
```

### BoundedWildcard
Can generalize to `? extends B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowBoundary.java`
#### Snippet
```java
    final int capacityHint;

    public FlowableWindowBoundary(Flowable<T> source, Publisher<B> other, int capacityHint) {
        super(source);
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFilter.java`
#### Snippet
```java
    final Predicate<? super T> predicate;

    public ParallelFilter(ParallelFlowable<T> source, Predicate<? super T> predicate) {
        this.source = source;
        this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFlatMapIterable.java`
#### Snippet
```java

    public ParallelFlatMapIterable(
            ParallelFlowable<T> source,
            Function<? super T, ? extends Iterable<? extends R>> mapper,
            int prefetch) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelPeek.java`
#### Snippet
```java
        boolean done;

        ParallelPeekSubscriber(Subscriber<? super T> actual, ParallelPeek<T> parent) {
            this.downstream = actual;
            this.parent = parent;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelMap.java`
#### Snippet
```java
    final Function<? super T, ? extends R> mapper;

    public ParallelMap(ParallelFlowable<T> source, Function<? super T, ? extends R> mapper) {
        this.source = source;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelSortedJoin.java`
#### Snippet
```java
    final Comparator<? super T> comparator;

    public ParallelSortedJoin(ParallelFlowable<List<T>> source, Comparator<? super T> comparator) {
        this.source = source;
        this.comparator = comparator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelDoOnNextTry.java`
#### Snippet
```java
    final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;

    public ParallelDoOnNextTry(ParallelFlowable<T> source, Consumer<? super T> onNext,
            BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java

        @Override
        public void replay(InnerSubscription<T> output) {
            synchronized (output) {
                if (output.emitting) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
    }

    private FlowableReplay(Publisher<T> onSubscribe, Flowable<T> source,
            final AtomicReference<ReplaySubscriber<T>> current,
            final Supplier<? extends ReplayBuffer<T>> bufferFactory) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFilterTry.java`
#### Snippet
```java
    final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;

    public ParallelFilterTry(ParallelFlowable<T> source, Predicate<? super T> predicate,
            BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelRunOn.java`
#### Snippet
```java
        int consumed;

        BaseRunOnSubscriber(int prefetch, SpscArrayQueue<T> queue, Worker worker) {
            this.prefetch = prefetch;
            this.queue = queue;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelConcatMap.java`
#### Snippet
```java

    public ParallelConcatMap(
            ParallelFlowable<T> source,
            Function<? super T, ? extends Publisher<? extends R>> mapper,
                    int prefetch, ErrorMode errorMode) {
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduce.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public ParallelReduce(ParallelFlowable<? extends T> source, Supplier<R> initialSupplier, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.initialSupplier = initialSupplier;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduce.java`
#### Snippet
```java
        boolean done;

        ParallelReduceSubscriber(Subscriber<? super R> subscriber, R initialValue, BiFunction<R, ? super T, R> reducer) {
            super(subscriber);
            this.accumulator = initialValue;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduce.java`
#### Snippet
```java
        boolean done;

        ParallelReduceSubscriber(Subscriber<? super R> subscriber, R initialValue, BiFunction<R, ? super T, R> reducer) {
            super(subscriber);
            this.accumulator = initialValue;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFlatMap.java`
#### Snippet
```java

    public ParallelFlatMap(
            ParallelFlowable<T> source,
            Function<? super T, ? extends Publisher<? extends R>> mapper,
            boolean delayError,
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureReduceWith.java`
#### Snippet
```java

        BackpressureReduceWithSubscriber(@NonNull Subscriber<? super R> downstream,
                                         @NonNull Supplier<R> supplier,
                                         @NonNull BiFunction<R, ? super T, R> reducer) {
            super(downstream);
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureReduceWith.java`
#### Snippet
```java
        BackpressureReduceWithSubscriber(@NonNull Subscriber<? super R> downstream,
                                         @NonNull Supplier<R> supplier,
                                         @NonNull BiFunction<R, ? super T, R> reducer) {
            super(downstream);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureReduceWith.java`
#### Snippet
```java
        BackpressureReduceWithSubscriber(@NonNull Subscriber<? super R> downstream,
                                         @NonNull Supplier<R> supplier,
                                         @NonNull BiFunction<R, ? super T, R> reducer) {
            super(downstream);
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableAllSingle.java`
#### Snippet
```java

    final Predicate<? super T> predicate;
    public ObservableAllSingle(ObservableSource<T> source, Predicate<? super T> predicate) {
        this.source = source;
        this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableConcatMapEager.java`
#### Snippet
```java

        @Override
        public void innerNext(InnerQueuedObserver<R> inner, R value) {
            inner.queue().offer(value);
            drain();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelMapTry.java`
#### Snippet
```java
    final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;

    public ParallelMapTry(ParallelFlowable<T> source, Function<? super T, ? extends R> mapper,
            BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableMergeWithMaybe.java`
#### Snippet
```java
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupBy.java`
#### Snippet
```java
        static final int ABANDONED_HAS_SUBSCRIBER = ABANDONED | HAS_SUBSCRIBER;

        State(int bufferSize, GroupByObserver<?, K, T> parent, K key, boolean delayError) {
            this.queue = new SpscLinkedArrayQueue<>(bufferSize);
            this.parent = parent;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableLastMaybe.java`
#### Snippet
```java
    final ObservableSource<T> source;

    public ObservableLastMaybe(ObservableSource<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        final AtomicThrowable error = new AtomicThrowable();

        ParallelReduceFullMainSubscriber(Subscriber<? super T> subscriber, int n, BiFunction<T, T, T> reducer) {
            super(subscriber);
            @SuppressWarnings("unchecked")
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        final AtomicThrowable error = new AtomicThrowable();

        ParallelReduceFullMainSubscriber(Subscriber<? super T> subscriber, int n, BiFunction<T, T, T> reducer) {
            super(subscriber);
            @SuppressWarnings("unchecked")
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        final AtomicThrowable error = new AtomicThrowable();

        ParallelReduceFullMainSubscriber(Subscriber<? super T> subscriber, int n, BiFunction<T, T, T> reducer) {
            super(subscriber);
            @SuppressWarnings("unchecked")
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        boolean done;

        ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parent, BiFunction<T, T, T> reducer) {
            this.parent = parent;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        boolean done;

        ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parent, BiFunction<T, T, T> reducer) {
            this.parent = parent;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        boolean done;

        ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parent, BiFunction<T, T, T> reducer) {
            this.parent = parent;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
        boolean done;

        ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parent, BiFunction<T, T, T> reducer) {
            this.parent = parent;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundarySelector.java`
#### Snippet
```java
            final AtomicBoolean once;

            WindowEndObserverIntercept(WindowBoundaryMainObserver<T, ?, V> parent, UnicastSubject<T> window) {
                this.parent = parent;
                this.window = window;
```

### BoundedWildcard
Can generalize to `? super B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundarySelector.java`
#### Snippet
```java
            final WindowBoundaryMainObserver<?, B, ?> parent;

            WindowStartObserver(WindowBoundaryMainObserver<?, B, ?> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? extends B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundarySelector.java`
#### Snippet
```java
    public ObservableWindowBoundarySelector(
            ObservableSource<T> source,
            ObservableSource<B> open, Function<? super B, ? extends ObservableSource<V>> closingIndicator,
            int bufferSize) {
        super(source);
```

### BoundedWildcard
Can generalize to `? extends B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundarySelector.java`
#### Snippet
```java

        WindowBoundaryMainObserver(Observer<? super Observable<T>> downstream,
                ObservableSource<B> open, Function<? super B, ? extends ObservableSource<V>> closingIndicator, int bufferSize) {
            this.downstream = downstream;
            this.queue = new MpscLinkedQueue<>();
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceMaybe.java`
#### Snippet
```java
        Disposable upstream;

        ReduceObserver(MaybeObserver<? super T> observer, BiFunction<T, T, T> reducer) {
            this.downstream = observer;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceMaybe.java`
#### Snippet
```java
        Disposable upstream;

        ReduceObserver(MaybeObserver<? super T> observer, BiFunction<T, T, T> reducer) {
            this.downstream = observer;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceMaybe.java`
#### Snippet
```java
        Disposable upstream;

        ReduceObserver(MaybeObserver<? super T> observer, BiFunction<T, T, T> reducer) {
            this.downstream = observer;
            this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceMaybe.java`
#### Snippet
```java
    final BiFunction<T, T, T> reducer;

    public ObservableReduceMaybe(ObservableSource<T> source, BiFunction<T, T, T> reducer) {
        this.source = source;
        this.reducer = reducer;
```

### BoundedWildcard
Can generalize to `? extends S`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGenerate.java`
#### Snippet
```java
    final Consumer<? super S> disposeState;

    public ObservableGenerate(Supplier<S> stateSupplier, BiFunction<S, Emitter<T>, S> generator,
            Consumer<? super S> disposeState) {
        this.stateSupplier = stateSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/BlockingObservableMostRecent.java`
#### Snippet
```java
    final T initialValue;

    public BlockingObservableMostRecent(ObservableSource<T> source, T initialValue) {
        this.source = source;
        this.initialValue = initialValue;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSubscribeOn.java`
#### Snippet
```java
        private final SubscribeOnObserver<T> parent;

        SubscribeTask(SubscribeOnObserver<T> parent) {
            this.parent = parent;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservablePublishSelector.java`
#### Snippet
```java
        final AtomicReference<Disposable> target;

        SourceObserver(PublishSubject<T> subject, AtomicReference<Disposable> target) {
            this.subject = subject;
            this.target = target;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowSubscribeIntercept.java`
#### Snippet
```java
    final AtomicBoolean once;

    ObservableWindowSubscribeIntercept(Subject<T> source) {
        this.window = source;
        this.once = new AtomicBoolean();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableAnySingle.java`
#### Snippet
```java
    final Predicate<? super T> predicate;

    public ObservableAnySingle(ObservableSource<T> source, Predicate<? super T> predicate) {
        this.source = source;
        this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceSeedSingle.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public ObservableReduceSeedSingle(ObservableSource<T> source, R seed, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.seed = seed;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceSeedSingle.java`
#### Snippet
```java
        Disposable upstream;

        ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
            this.downstream = actual;
            this.value = value;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceSeedSingle.java`
#### Snippet
```java
        Disposable upstream;

        ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
            this.downstream = actual;
            this.value = value;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableLastSingle.java`
#### Snippet
```java
    final T defaultItem;

    public ObservableLastSingle(ObservableSource<T> source, T defaultItem) {
        this.source = source;
        this.defaultItem = defaultItem;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
        final int index;

        CombinerObserver(LatestCoordinator<T, R> parent, int index) {
            this.parent = parent;
            this.index = index;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
    final Supplier<U> bufferSupplier;

    public ObservableBufferExactBoundary(ObservableSource<T> source, ObservableSource<B> boundary, Supplier<U> bufferSupplier) {
        super(source);
        this.boundary = boundary;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableZipIterable.java`
#### Snippet
```java
        boolean done;

        ZipIterableObserver(Observer<? super V> actual, Iterator<U> iterator,
                BiFunction<? super T, ? super U, ? extends V> zipper) {
            this.downstream = actual;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableMergeWithSingle.java`
#### Snippet
```java
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> parent) {
                this.parent = parent;
            }
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRetryWhen.java`
#### Snippet
```java
        volatile boolean active;

        RepeatWhenObserver(Observer<? super T> actual, Subject<Throwable> signaller, ObservableSource<T> source) {
            this.downstream = actual;
            this.signaller = signaller;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRetryWhen.java`
#### Snippet
```java
        volatile boolean active;

        RepeatWhenObserver(Observer<? super T> actual, Subject<Throwable> signaller, ObservableSource<T> source) {
            this.downstream = actual;
            this.signaller = signaller;
```

### BoundedWildcard
Can generalize to `? super U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWithLatestFrom.java`
#### Snippet
```java
        private final WithLatestFromObserver<T, U, R> parent;

        WithLatestFromOtherObserver(WithLatestFromObserver<T, U, R> parent) {
            this.parent = parent;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceWithSingle.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public ObservableReduceWithSingle(ObservableSource<T> source, Supplier<R> seedSupplier, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.seedSupplier = seedSupplier;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReduceWithSingle.java`
#### Snippet
```java
    final BiFunction<R, ? super T, R> reducer;

    public ObservableReduceWithSingle(ObservableSource<T> source, Supplier<R> seedSupplier, BiFunction<R, ? super T, R> reducer) {
        this.source = source;
        this.seedSupplier = seedSupplier;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBuffer.java`
#### Snippet
```java
        long index;

        BufferSkipObserver(Observer<? super U> actual, int count, int skip, Supplier<U> bufferSupplier) {
            this.downstream = actual;
            this.count = count;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBuffer.java`
#### Snippet
```java
        Disposable upstream;

        BufferExactObserver(Observer<? super U> actual, int count, Supplier<U> bufferSupplier) {
            this.downstream = actual;
            this.count = count;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDistinctUntilChanged.java`
#### Snippet
```java

        DistinctUntilChangedObserver(Observer<? super T> actual,
                Function<? super T, K> keySelector,
                BiPredicate<? super K, ? super K> comparer) {
            super(actual);
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDistinctUntilChanged.java`
#### Snippet
```java
    final BiPredicate<? super K, ? super K> comparer;

    public ObservableDistinctUntilChanged(ObservableSource<T> source, Function<? super T, K> keySelector, BiPredicate<? super K, ? super K> comparer) {
        super(source);
        this.keySelector = keySelector;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScan.java`
#### Snippet
```java
        boolean done;

        ScanObserver(Observer<? super T> actual, BiFunction<T, T, T> accumulator) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDistinct.java`
#### Snippet
```java
    final Supplier<? extends Collection<? super K>> collectionSupplier;

    public ObservableDistinct(ObservableSource<T> source, Function<? super T, K> keySelector, Supplier<? extends Collection<? super K>> collectionSupplier) {
        super(source);
        this.keySelector = keySelector;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDistinct.java`
#### Snippet
```java
        final Function<? super T, K> keySelector;

        DistinctObserver(Observer<? super T> actual, Function<? super T, K> keySelector, Collection<? super K> collection) {
            super(actual);
            this.keySelector = keySelector;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScan.java`
#### Snippet
```java
        boolean done;

        ScanObserver(Observer<? super T> actual, BiFunction<T, T, T> accumulator) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScan.java`
#### Snippet
```java
        boolean done;

        ScanObserver(Observer<? super T> actual, BiFunction<T, T, T> accumulator) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? super Emitter`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableInternalHelper.java`
#### Snippet
```java
        final Consumer<Emitter<T>> consumer;

        SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableInternalHelper.java`
#### Snippet
```java
        final Observer<T> observer;

        ObserverOnNext(Observer<T> observer) {
            this.observer = observer;
        }
```

### BoundedWildcard
Can generalize to `? super S`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableInternalHelper.java`
#### Snippet
```java
        final BiConsumer<S, Emitter<T>> consumer;

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
            this.consumer = consumer;
        }
```

### BoundedWildcard
Can generalize to `? super Emitter`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableInternalHelper.java`
#### Snippet
```java
        final BiConsumer<S, Emitter<T>> consumer;

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
            this.consumer = consumer;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFromUnsafeSource.java`
#### Snippet
```java
    final ObservableSource<T> source;

    public ObservableFromUnsafeSource(ObservableSource<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCollectSingle.java`
#### Snippet
```java
    final BiConsumer<? super U, ? super T> collector;

    public ObservableCollectSingle(ObservableSource<T> source,
            Supplier<? extends U> initialSupplier, BiConsumer<? super U, ? super T> collector) {
        this.source = source;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScanSeed.java`
#### Snippet
```java
        boolean done;

        ScanSeedObserver(Observer<? super R> actual, BiFunction<R, ? super T, R> accumulator, R value) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScanSeed.java`
#### Snippet
```java
        boolean done;

        ScanSeedObserver(Observer<? super R> actual, BiFunction<R, ? super T, R> accumulator, R value) {
            this.downstream = actual;
            this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScanSeed.java`
#### Snippet
```java
    final Supplier<R> seedSupplier;

    public ObservableScanSeed(ObservableSource<T> source, Supplier<R> seedSupplier, BiFunction<R, ? super T, R> accumulator) {
        super(source);
        this.accumulator = accumulator;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

        BufferExactUnboundedObserver(
                Observer<? super U> actual, Supplier<U> bufferSupplier,
                long timespan, TimeUnit unit, Scheduler scheduler) {
            super(actual, new MpscLinkedQueue<>());
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        BufferExactBoundedObserver(
                Observer<? super U> actual,
                Supplier<U> bufferSupplier,
                long timespan, TimeUnit unit, int maxSize,
                boolean restartOnMaxSize, Worker w) {
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
    final boolean restartTimerOnMaxSize;

    public ObservableBufferTimed(ObservableSource<T> source, long timespan, long timeskip, TimeUnit unit, Scheduler scheduler, Supplier<U> bufferSupplier, int maxSize,
                                 boolean restartTimerOnMaxSize) {
        super(source);
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDebounce.java`
#### Snippet
```java
            final AtomicBoolean once = new AtomicBoolean();

            DebounceInnerObserver(DebounceObserver<T, U> parent, long index, T value) {
                this.parent = parent;
                this.index = index;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableToList.java`
#### Snippet
```java
    final Supplier<U> collectionSupplier;

    public ObservableToList(ObservableSource<T> source, Supplier<U> collectionSupplier) {
        super(source);
        this.collectionSupplier = collectionSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRepeatWhen.java`
#### Snippet
```java
        volatile boolean active;

        RepeatWhenObserver(Observer<? super T> actual, Subject<Object> signaller, ObservableSource<T> source) {
            this.downstream = actual;
            this.signaller = signaller;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSingleMaybe.java`
#### Snippet
```java
    final ObservableSource<T> source;

    public ObservableSingleMaybe(ObservableSource<T> source) {
        this.source = source;
    }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWithLatestFromMany.java`
#### Snippet
```java
        volatile boolean done;

        WithLatestFromObserver(Observer<? super R> actual, Function<? super Object[], R> combiner, int n) {
            this.downstream = actual;
            this.combiner = combiner;
```

### BoundedWildcard
Can generalize to `? extends B`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowBoundary.java`
#### Snippet
```java
    final int capacityHint;

    public ObservableWindowBoundary(ObservableSource<T> source, ObservableSource<B> other, int capacityHint) {
        super(source);
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableToListSingle.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public ObservableToListSingle(ObservableSource<T> source, final int defaultCapacityHint) {
        this.source = source;
        this.collectionSupplier = (Supplier)Functions.createArrayList(defaultCapacityHint);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableToListSingle.java`
#### Snippet
```java
    }

    public ObservableToListSingle(ObservableSource<T> source, Supplier<U> collectionSupplier) {
        this.source = source;
        this.collectionSupplier = collectionSupplier;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDelaySubscriptionOther.java`
#### Snippet
```java
    final ObservableSource<U> other;

    public ObservableDelaySubscriptionOther(ObservableSource<? extends T> main, ObservableSource<U> other) {
        this.main = main;
        this.other = other;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableUsing.java`
#### Snippet
```java
    final boolean eager;

    public CompletableUsing(Supplier<R> resourceSupplier,
                            Function<? super R, ? extends CompletableSource> completableFunction, Consumer<? super R> disposer,
                            boolean eager) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerPoolFactory.java`
#### Snippet
```java
    }

    static boolean getBooleanProperty(boolean enabled, String key, boolean defaultNotFound, boolean defaultNotEnabled, Function<String, String> propertyAccessor) {
        if (enabled) {
            try {
```

### BoundedWildcard
Can generalize to `? super ScheduledAction`
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerWhen.java`
#### Snippet
```java
        private final Worker actualWorker;

        QueueWorker(FlowableProcessor<ScheduledAction> actionProcessor, Worker actualWorker) {
            this.actionProcessor = actionProcessor;
            this.actualWorker = actualWorker;
```

### BoundedWildcard
Can generalize to `? super Disposable`
in `src/main/java/io/reactivex/rxjava3/internal/disposables/DisposableHelper.java`
#### Snippet
```java
     * @return true if successful, false otherwise
     */
    public static boolean trySet(AtomicReference<Disposable> field, Disposable d) {
        if (!field.compareAndSet(null, d)) {
            if (field.get() == DISPOSED) {
```

### BoundedWildcard
Can generalize to `? super Disposable`
in `src/main/java/io/reactivex/rxjava3/internal/disposables/DisposableHelper.java`
#### Snippet
```java
     * @return true if the operation succeeded, false
     */
    public static boolean setOnce(AtomicReference<Disposable> field, Disposable d) {
        Objects.requireNonNull(d, "d is null");
        if (!field.compareAndSet(null, d)) {
```

### BoundedWildcard
Can generalize to `? extends Disposable`
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
    }

    void dispose(List<Disposable> set) {
        if (set == null) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Subscription`
in `src/main/java/io/reactivex/rxjava3/internal/subscriptions/SubscriptionHelper.java`
#### Snippet
```java
     * @param n the request amount, positive (verified)
     */
    public static void deferredRequest(AtomicReference<Subscription> field, AtomicLong requested, long n) {
        Subscription s = field.get();
        if (s != null) {
```

### BoundedWildcard
Can generalize to `? super Subscription`
in `src/main/java/io/reactivex/rxjava3/internal/subscriptions/SubscriptionHelper.java`
#### Snippet
```java
     * @return true if the operation succeeded, false if the target field was not null.
     */
    public static boolean setOnce(AtomicReference<Subscription> field, Subscription s) {
        Objects.requireNonNull(s, "s is null");
        if (!field.compareAndSet(null, s)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
    }

    private ObservableReplay(ObservableSource<T> onSubscribe, ObservableSource<T> source,
                             final AtomicReference<ReplayObserver<T>> current,
                             final BufferSupplier<T> bufferFactory) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java

        @Override
        public void replay(InnerDisposable<T> output) {
            if (output.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/io/reactivex/rxjava3/observers/BaseTestConsumer.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @NonNull
    private U assertError(@NonNull Predicate<Throwable> errorPredicate, boolean exact) {
        int s = errors.size();
        if (s == 0) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/observers/BaseTestConsumer.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @NonNull
    public final U assertValueAt(int index, @NonNull Predicate<T> valuePredicate) {
        int s = values.size();
        if (s == 0) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void replay(ReplayDisposable<T> rs) {
            if (rs.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void replay(ReplayDisposable<T> rs) {
            if (rs.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void replay(ReplayDisposable<T> rs) {
            if (rs.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void replay(ReplaySubscription<T> rs) {
            if (rs.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void replay(ReplaySubscription<T> rs) {
            if (rs.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java

        @Override
        public void replay(ReplaySubscription<T> rs) {
            if (rs.getAndIncrement() != 0) {
                return;
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public final <@NonNull U extends Collection<? super T>> Single<U> toList(@NonNull Supplier<U> collectionSupplier) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle<>(this, collectionSupplier));
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
            long timespan, @NonNull TimeUnit unit,
            @NonNull Scheduler scheduler, int count,
            @NonNull Supplier<U> bufferSupplier,
            boolean restartTimerOnMaxSize) {
        Objects.requireNonNull(unit, "unit is null");
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @NonNull
    @SchedulerSupport(SchedulerSupport.NONE)
    public static <@NonNull T> Observable<T> fromSingle(@NonNull SingleSource<T> source) {
        Objects.requireNonNull(source, "source is null");
        return RxJavaPlugins.onAssembly(new SingleToObservable<>(source));
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    public final <@NonNull R> Observable<R> flatMap(
            @NonNull Function<? super T, ? extends ObservableSource<? extends R>> onNextMapper,
            @NonNull Function<Throwable, ? extends ObservableSource<? extends R>> onErrorMapper,
            @NonNull Supplier<? extends ObservableSource<? extends R>> onCompleteSupplier,
            int maxConcurrency) {
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public final <@NonNull U> Observable<U> cast(@NonNull Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return map(Functions.castFunction(clazz));
```

### BoundedWildcard
Can generalize to `? extends Map`>
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
            @NonNull Function<? super T, ? extends K> keySelector,
            @NonNull Function<? super T, ? extends V> valueSelector,
            @NonNull Supplier<Map<K, Collection<V>>> mapSupplier
    ) {
        return toMultimap(keySelector, valueSelector, mapSupplier, ArrayListSupplier.asFunction());
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @NonNull
    public final <@NonNull U extends Collection<? super T>> Observable<U> buffer(long timespan, long timeskip, @NonNull TimeUnit unit, @NonNull Scheduler scheduler, @NonNull Supplier<U> bufferSupplier) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public final <@NonNull B, @NonNull U extends Collection<? super T>> Observable<U> buffer(@NonNull ObservableSource<B> boundaryIndicator, @NonNull Supplier<U> bufferSupplier) {
        Objects.requireNonNull(boundaryIndicator, "boundaryIndicator is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public final <@NonNull U extends Collection<? super T>> Observable<U> buffer(int count, int skip, @NonNull Supplier<U> bufferSupplier) {
        ObjectHelper.verifyPositive(count, "count");
        ObjectHelper.verifyPositive(skip, "skip");
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    public final <@NonNull R> Flowable<R> flatMap(
            @NonNull Function<? super T, @NonNull ? extends Publisher<? extends R>> onNextMapper,
            @NonNull Function<Throwable, @NonNull ? extends Publisher<? extends R>> onErrorMapper,
            @NonNull Supplier<? extends Publisher<? extends R>> onCompleteSupplier,
            int maxConcurrency) {
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public final <@NonNull U extends Collection<? super T>> Single<U> toList(@NonNull Supplier<U> collectionSupplier) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle<>(this, collectionSupplier));
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public final <@NonNull B, @NonNull U extends Collection<? super T>> Flowable<U> buffer(@NonNull Publisher<B> boundaryIndicator, @NonNull Supplier<U> bufferSupplier) {
        Objects.requireNonNull(boundaryIndicator, "boundaryIndicator is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.CUSTOM)
    public final <@NonNull U extends Collection<? super T>> Flowable<U> buffer(long timespan, long timeskip, @NonNull TimeUnit unit,
            @NonNull Scheduler scheduler, @NonNull Supplier<U> bufferSupplier) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull U extends Collection<? super T>> Flowable<U> buffer(int count, int skip, @NonNull Supplier<U> bufferSupplier) {
        ObjectHelper.verifyPositive(count, "count");
        ObjectHelper.verifyPositive(skip, "skip");
```

### BoundedWildcard
Can generalize to `? extends Map`>
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
            @NonNull Function<? super T, ? extends K> keySelector,
            @NonNull Function<? super T, ? extends V> valueSelector,
            @NonNull Supplier<Map<K, Collection<V>>> mapSupplier
            ) {
        return toMultimap(keySelector, valueSelector, mapSupplier, ArrayListSupplier.asFunction());
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public static <@NonNull T> Flowable<T> fromSingle(@NonNull SingleSource<T> source) {
        Objects.requireNonNull(source, "source is null");
        return RxJavaPlugins.onAssembly(new SingleToFlowable<>(source));
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <@NonNull U> Flowable<U> cast(@NonNull Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return map(Functions.castFunction(clazz));
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport(SchedulerSupport.NONE)
    public static <@NonNull T> Flowable<T> unsafeCreate(@NonNull Publisher<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (onSubscribe instanceof Flowable) {
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
            long timespan, @NonNull TimeUnit unit,
            @NonNull Scheduler scheduler, int count,
            @NonNull Supplier<U> bufferSupplier,
            boolean restartTimerOnMaxSize) {
        Objects.requireNonNull(unit, "unit is null");
```

## PublicFieldAccessedInSynchronizedContext
### PublicFieldAccessedInSynchronizedContext
Non-private field `nonEmptySources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
                Object[] os = latest;

                int localNonEmptySources = nonEmptySources;

                if (os[index] == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `nonEmptySources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
                if (os[index] == null) {
                    localNonEmptySources++;
                    nonEmptySources = localNonEmptySources;
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `completedSources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java

                if (os[index] != null) {
                    int localCompletedSources = completedSources + 1;

                    if (localCompletedSources == os.length) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java

                    if (localCompletedSources == os.length) {
                        done = true;
                    } else {
                        completedSources = localCompletedSources;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `completedSources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
                        done = true;
                    } else {
                        completedSources = localCompletedSources;
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
                    }
                } else {
                    done = true;
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disconnectedEarly` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
            DisposableHelper.replace(this, t);
            synchronized (parent) {
                if (disconnectedEarly) {
                    parent.source.reset();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
    void terminated(RefConnection rc) {
        synchronized (this) {
            if (connection == rc) {
                if (rc.timer != null) {
                    rc.timer.dispose();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
                }
                if (--rc.subscriberCount == 0) {
                    connection = null;
                    source.reset();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
        SequentialDisposable sd;
        synchronized (this) {
            if (connection == null || connection != rc) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
        SequentialDisposable sd;
        synchronized (this) {
            if (connection == null || connection != rc) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
        boolean connect = false;
        synchronized (this) {
            conn = connection;
            if (conn == null) {
                conn = new RefConnection(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
            if (conn == null) {
                conn = new RefConnection(this);
                connection = conn;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
    void timeout(RefConnection rc) {
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
                Disposable connectionObject = rc.get();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
                Disposable connectionObject = rc.get();
                DisposableHelper.dispose(rc);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
                subscribers.dispose();
                synchronized (this) {
                    buffers = null;
                }
                if (getAndIncrement() != 0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
                subscribers.dispose();
                synchronized (this) {
                    buffers = null;
                }
                done = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
            index = idx + 1;
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
            }
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
                    return;
                }
                queue.offer(buffers.remove(idx));
            }
            if (makeDone) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
            subscribers.dispose();
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
                    queue.offer(b);
                }
                buffers = null;
            }
            done = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
                    return;
                }
                buffer = next;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
                    return;
                }
                buffer = null;
            }
            queue.offer(b);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b != null) {
                    b.add(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void onError(Throwable t) {
            synchronized (this) {
                buffer = null;
            }
            downstream.onError(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                buffer = null;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                b = buffer;
                buffer = null;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `cancelled` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                if (cancelled) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void dispose() {
            synchronized (this) {
                buffer = null;
            }
            upstream.cancel();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                current = buffer;
                if (current == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
                    return;
                }
                buffer = next;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `consumerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
                    return;
                }
                buffer = next;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
                    return;
                }
                buffer = null;
            }
            queue.offer(b);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
                }

                buffer = null;
                producerIndex++;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

                buffer = null;
                producerIndex++;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                buffer = b;
                consumerIndex++;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `consumerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                buffer = b;
                consumerIndex++;
            }
            if (restartTimerOnMaxSize) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            DisposableHelper.dispose(timer);
            synchronized (this) {
                buffer = null;
            }
            downstream.onError(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `wip` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
            if (maxConcurrency != Integer.MAX_VALUE) {
                synchronized (this) {
                    if (wip == maxConcurrency) {
                        sources.offer(p);
                        return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                synchronized (this) {
                    if (wip == maxConcurrency) {
                        sources.offer(p);
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `wip` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                        return;
                    }
                    wip++;
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                if (maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        nSources = sources.size();
                    }
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                ObservableSource<? extends U> p;
                synchronized (this) {
                    p = sources.poll();
                    if (p == null) {
                        wip--;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `wip` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                    p = sources.poll();
                    if (p == null) {
                        wip--;
                        continue;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                        boolean empty = false;
                        synchronized (this) {
                            p = sources.poll();
                            if (p == null) {
                                wip--;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `wip` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                            p = sources.poll();
                            if (p == null) {
                                wip--;
                                empty = true;
                            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.latest` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
            boolean cancelOthers = false;
            synchronized (this) {
                Object[] latest = this.latest;
                if (latest == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `complete` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java

                cancelOthers = latest[index] == null;
                if (cancelOthers || ++complete == latest.length) {
                    done = true;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                cancelOthers = latest[index] == null;
                if (cancelOthers || ++complete == latest.length) {
                    done = true;
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.latest` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                if (delayError) {
                    synchronized (this) {
                        Object[] latest = this.latest;
                        if (latest == null) {
                            return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `complete` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                        }
                        cancelOthers = latest[index] == null;
                        if (cancelOthers || ++complete == latest.length) {
                            done = true;
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                        cancelOthers = latest[index] == null;
                        if (cancelOthers || ++complete == latest.length) {
                            done = true;
                        }
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `latest` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
        void clear(SpscLinkedArrayQueue<?> q) {
            synchronized (this) {
                latest = null;
            }
            q.clear();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.latest` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
            boolean shouldDrain = false;
            synchronized (this) {
                Object[] latest = this.latest;
                if (latest == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `active` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                }
                Object o = latest[index];
                int a = active;
                if (o == null) {
                    active = ++a;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `active` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                int a = active;
                if (o == null) {
                    active = ++a;
                }
                latest[index] = item;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
                    return;
                }
                buffer = null;
            }
            queue.offer(b);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
                    return;
                }
                buffer = next;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
            index = idx + 1;
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
            observers.dispose();
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
                    queue.offer(b);
                }
                buffers = null;
            }
            done = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
                observers.dispose();
                synchronized (this) {
                    buffers = null;
                }
                done = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
            }
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
                    return;
                }
                queue.offer(buffers.remove(idx));
            }
            if (makeDone) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
                observers.dispose();
                synchronized (this) {
                    buffers = null;
                }
                if (getAndIncrement() != 0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                buffer = null;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                b = buffer;
                buffer = null;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                current = buffer;
                if (current != null) {
                    buffer = next;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
                current = buffer;
                if (current != null) {
                    buffer = next;
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `consumerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
                    return;
                }
                buffer = next;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
                w.dispose();
                synchronized (this) {
                    buffer = null;
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                buffer = null;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                b = buffer;
                buffer = null;
            }
            if (b != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
                    return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
                    return;
                }
                buffer = null;
                producerIndex++;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
                }
                buffer = null;
                producerIndex++;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                buffer = b;
                consumerIndex++;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `consumerIndex` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            synchronized (this) {
                buffer = b;
                consumerIndex++;
            }
            if (restartTimerOnMaxSize) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `cancelled` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

            synchronized (this) {
                if (cancelled) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        public void onError(Throwable t) {
            synchronized (this) {
                buffer = null;
            }
            downstream.onError(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffer` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        public void onError(Throwable t) {
            synchronized (this) {
                buffer = null;
            }
            downstream.onError(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disconnectedEarly` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
            DisposableHelper.replace(this, t);
            synchronized (parent) {
                if (disconnectedEarly) {
                    parent.source.reset();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
        boolean connect = false;
        synchronized (this) {
            conn = connection;
            if (conn == null) {
                conn = new RefConnection(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
            if (conn == null) {
                conn = new RefConnection(this);
                connection = conn;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
        SequentialDisposable sd;
        synchronized (this) {
            if (connection == null || connection != rc) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
        SequentialDisposable sd;
        synchronized (this) {
            if (connection == null || connection != rc) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
    void terminated(RefConnection rc) {
        synchronized (this) {
            if (connection == rc) {
                if (rc.timer != null) {
                    rc.timer.dispose();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
                }
                if (--rc.subscriberCount == 0) {
                    connection = null;
                    source.reset();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
    void timeout(RefConnection rc) {
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
                Disposable connectionObject = rc.get();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connection` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
                Disposable connectionObject = rc.get();
                DisposableHelper.dispose(rc);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (disposed) {
                return false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            }

            List<Disposable> set = resources;
            if (set == null || !set.remove(d)) {
                return false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        List<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
                return;
            }
            disposed = true;
            set = resources;
            resources = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            }
            disposed = true;
            set = resources;
            resources = null;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            disposed = true;
            set = resources;
            resources = null;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        List<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            }

            set = resources;
            resources = null;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java

            set = resources;
            resources = null;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    List<Disposable> set = resources;
                    if (set == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            synchronized (this) {
                if (!disposed) {
                    List<Disposable> set = resources;
                    if (set == null) {
                        set = new LinkedList<>();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
                    if (set == null) {
                        set = new LinkedList<>();
                        resources = set;
                    }
                    for (Disposable d : ds) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    List<Disposable> set = resources;
                    if (set == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            synchronized (this) {
                if (!disposed) {
                    List<Disposable> set = resources;
                    if (set == null) {
                        set = new LinkedList<>();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
                    if (set == null) {
                        set = new LinkedList<>();
                        resources = set;
                    }
                    set.add(d);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        if (!done) {
            synchronized (this) {
                if (done) {
                    cancel = true;
                } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                    cancel = true;
                } else {
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                } else {
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
                            queue = q;
                        }
                        q.add(NotificationLite.disposable(d));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                        return;
                    }
                    emitting = true;
                    cancel = false;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                return;
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
                    queue = q;
                }
                q.add(NotificationLite.next(t));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                return;
            }
            emitting = true;
        }
        actual.onNext(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
                    emitting = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                q = queue;
                if (q == null) {
                    emitting = false;
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                    return;
                }
                queue = null;
            }
            q.forEachWhile(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                reportError = true;
            } else {
                done = true;
                if (emitting) {
                    AppendOnlyLinkedArrayList<Object> q = queue;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            } else {
                done = true;
                if (emitting) {
                    AppendOnlyLinkedArrayList<Object> q = queue;
                    if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                done = true;
                if (emitting) {
                    AppendOnlyLinkedArrayList<Object> q = queue;
                    if (q == null) {
                        q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                    if (q == null) {
                        q = new AppendOnlyLinkedArrayList<>(4);
                        queue = q;
                    }
                    q.setFirst(NotificationLite.error(t));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                }
                reportError = false;
                emitting = true;
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                return;
            }
            done = true;
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            }
            done = true;
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            done = true;
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
                    queue = q;
                }
                q.add(NotificationLite.complete());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
                return;
            }
            emitting = true;
        }
        actual.onComplete();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `cancelled` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
            Object o;
            synchronized (this) {
                if (cancelled) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `next` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                    return;
                }
                if (next) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `index` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java

                lock.lock();
                index = s.index;
                o = s.value.get();
                lock.unlock();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                lock.unlock();

                emitting = o != null;
                next = true;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `next` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java

                emitting = o != null;
                next = true;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `cancelled` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
            if (!fastPath) {
                synchronized (this) {
                    if (cancelled) {
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `index` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                        return;
                    }
                    if (index == stateIndex) {
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                        return;
                    }
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                    }
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
                            queue = q;
                        }
                        q.add(value);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `next` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                        return;
                    }
                    next = true;
                }
                fastPath = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                AppendOnlyLinkedArrayList<Object> q;
                synchronized (this) {
                    q = queue;
                    if (q == null) {
                        emitting = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                    q = queue;
                    if (q == null) {
                        emitting = false;
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                        return;
                    }
                    queue = null;
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                return;
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
                    queue = q;
                }
                q.add(NotificationLite.complete());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                return;
            }
            done = true;
            emitting = true;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            }
            done = true;
            emitting = true;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
            } else
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                reportError = true;
            } else
            if (emitting) {
                done = true;
                AppendOnlyLinkedArrayList<Object> q = queue;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            } else
            if (emitting) {
                done = true;
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            if (emitting) {
                done = true;
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
                    queue = q;
                }
                Object err = NotificationLite.error(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                return;
            } else {
                done = true;
                emitting = true;
                reportError = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            } else {
                done = true;
                emitting = true;
                reportError = false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
                    emitting = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                q = queue;
                if (q == null) {
                    emitting = false;
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                    return;
                }
                queue = null;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                return;
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
                    queue = q;
                }
                q.add(NotificationLite.next(t));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
                return;
            }
            emitting = true;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
                    emitting = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                q = queue;
                if (q == null) {
                    emitting = false;
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                    return;
                }
                queue = null;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                return;
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
                    queue = q;
                }
                q.add(NotificationLite.next(t));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                return;
            }
            emitting = true;
        }
        actual.onNext(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                return;
            }
            done = true;
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            }
            done = true;
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            done = true;
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(4);
                    queue = q;
                }
                q.add(NotificationLite.complete());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                return;
            }
            emitting = true;
        }
        actual.onComplete();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                reportError = true;
            } else {
                done = true;
                if (emitting) {
                    AppendOnlyLinkedArrayList<Object> q = queue;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            } else {
                done = true;
                if (emitting) {
                    AppendOnlyLinkedArrayList<Object> q = queue;
                    if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                done = true;
                if (emitting) {
                    AppendOnlyLinkedArrayList<Object> q = queue;
                    if (q == null) {
                        q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                    if (q == null) {
                        q = new AppendOnlyLinkedArrayList<>(4);
                        queue = q;
                    }
                    q.setFirst(NotificationLite.error(t));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                }
                reportError = false;
                emitting = true;
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        if (!done) {
            synchronized (this) {
                if (done) {
                    cancel = true;
                } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                    cancel = true;
                } else {
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                } else {
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
                            queue = q;
                        }
                        q.add(NotificationLite.subscription(s));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
                        return;
                    }
                    emitting = true;
                    cancel = false;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `cancelled` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
            if (!fastPath) {
                synchronized (this) {
                    if (cancelled) {
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `index` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                        return;
                    }
                    if (index == stateIndex) {
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                        return;
                    }
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                    }
                    if (emitting) {
                        AppendOnlyLinkedArrayList<Object> q = queue;
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                        if (q == null) {
                            q = new AppendOnlyLinkedArrayList<>(4);
                            queue = q;
                        }
                        q.add(value);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `next` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                        return;
                    }
                    next = true;
                }
                fastPath = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `cancelled` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
            Object o;
            synchronized (this) {
                if (cancelled) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `next` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                    return;
                }
                if (next) {
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `index` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                Lock readLock = s.readLock;
                readLock.lock();
                index = s.index;
                o = s.value.get();
                readLock.unlock();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                readLock.unlock();

                emitting = o != null;
                next = true;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `next` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java

                emitting = o != null;
                next = true;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                AppendOnlyLinkedArrayList<Object> q;
                synchronized (this) {
                    q = queue;
                    if (q == null) {
                        emitting = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                    q = queue;
                    if (q == null) {
                        emitting = false;
                        return;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                        return;
                    }
                    queue = null;
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                return;
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
                    queue = q;
                }
                q.add(NotificationLite.complete());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                return;
            }
            done = true;
            emitting = true;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            }
            done = true;
            emitting = true;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
                    emitting = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                q = queue;
                if (q == null) {
                    emitting = false;
                    return;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                    return;
                }
                queue = null;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (done) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                return;
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            }
            if (emitting) {
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
                    queue = q;
                }
                q.add(NotificationLite.next(t));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                return;
            }
            emitting = true;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
            } else
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                reportError = true;
            } else
            if (emitting) {
                done = true;
                AppendOnlyLinkedArrayList<Object> q = queue;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            } else
            if (emitting) {
                done = true;
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            if (emitting) {
                done = true;
                AppendOnlyLinkedArrayList<Object> q = queue;
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queue` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                if (q == null) {
                    q = new AppendOnlyLinkedArrayList<>(QUEUE_LINK_SIZE);
                    queue = q;
                }
                Object err = NotificationLite.error(t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `done` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
                return;
            } else {
                done = true;
                emitting = true;
                reportError = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `emitting` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            } else {
                done = true;
                emitting = true;
                reportError = false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        OpenHashSet<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
                return;
            }
            disposed = true;
            set = resources;
            resources = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            }
            disposed = true;
            set = resources;
            resources = null;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            disposed = true;
            set = resources;
            resources = null;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (disposed) {
                return 0;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
                return 0;
            }
            OpenHashSet<Disposable> set = resources;
            return set != null ? set.size() : 0;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    OpenHashSet<Disposable> set = resources;
                    if (set == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            synchronized (this) {
                if (!disposed) {
                    OpenHashSet<Disposable> set = resources;
                    if (set == null) {
                        set = new OpenHashSet<>(disposables.length + 1);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
                    if (set == null) {
                        set = new OpenHashSet<>(disposables.length + 1);
                        resources = set;
                    }
                    for (Disposable d : disposables) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    OpenHashSet<Disposable> set = resources;
                    if (set == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            synchronized (this) {
                if (!disposed) {
                    OpenHashSet<Disposable> set = resources;
                    if (set == null) {
                        set = new OpenHashSet<>();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
                    if (set == null) {
                        set = new OpenHashSet<>();
                        resources = set;
                    }
                    set.add(disposable);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        OpenHashSet<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            }

            set = resources;
            resources = null;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java

            set = resources;
            resources = null;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disposed` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        }
        synchronized (this) {
            if (disposed) {
                return false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `resources` accessed in synchronized context
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            }

            OpenHashSet<Disposable> set = resources;
            if (set == null || !set.remove(disposable)) {
                return false;
```

## IgnoreResultOfCall
### IgnoreResultOfCall
Result of `Observable.subscribe()` is ignored
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        final CountDownLatch cdl = new CountDownLatch(1);

        observable.subscribe(this, Functions.emptyConsumer(), new Action() {
            @Override
            public void run() {
```

### IgnoreResultOfCall
Result of `Flowable.subscribe()` is ignored
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        final CountDownLatch cdl = new CountDownLatch(1);

        flowable.subscribe(this, Functions.emptyConsumer(), new Action() {
            @Override
            public void run() {
```

## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public static <@NonNull T> Maybe<@NonNull T> fromOptional(@NonNull Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return optional.map(Maybe::just).orElseGet(Maybe::empty);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public static <@NonNull T> Observable<@NonNull T> fromOptional(@NonNull Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return optional.map(Observable::just).orElseGet(Observable::empty);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public static <@NonNull T> Flowable<@NonNull T> fromOptional(@NonNull Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return optional.map(Flowable::just).orElseGet(Flowable::empty);
```

## SystemOutErr
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/ToFlowablePerf.java`
#### Snippet
```java
                o = p.flowable();
            }
            System.out.println("--- " + j);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        double use = Math.max(0.0, (after - before) / 1024.0 / 1024.0);

        System.out.print(name);
        System.out.print(" ");
        System.out.print(typeLib);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java

        System.out.print(name);
        System.out.print(" ");
        System.out.print(typeLib);
        System.out.print("     thrpt ");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        System.out.print(name);
        System.out.print(" ");
        System.out.print(typeLib);
        System.out.print("     thrpt ");
        System.out.print(n);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        System.out.print(" ");
        System.out.print(typeLib);
        System.out.print("     thrpt ");
        System.out.print(n);
        System.out.printf("           %.3f  0.000 MB%n", use);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        System.out.print(typeLib);
        System.out.print("     thrpt ");
        System.out.print(n);
        System.out.printf("           %.3f  0.000 MB%n", use);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        System.out.print("     thrpt ");
        System.out.print(n);
        System.out.printf("           %.3f  0.000 MB%n", use);

        if (array.hashCode() == 1) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java

        if (array.hashCode() == 1) {
            System.out.print("");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {

        System.out.println("Benchmark  (lib-type)   Mode  Cnt       Score       Error  Units");

        // ---------------------------------------------------------------------------------------------------------------------
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/io/reactivex/rxjava3/exceptions/CompositeException.java`
#### Snippet
```java
    @Override
    public void printStackTrace() {
        printStackTrace(System.err);
    }

```

## ClassNameSameAsAncestorName
### ClassNameSameAsAncestorName
Class name `Iterator` is the same as one of its superclass' names
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/BlockingFlowableMostRecent.java`
#### Snippet
```java
        }

        final class Iterator implements java.util.Iterator<T> {
            /**
             * buffer to make sure that the state of the iterator doesn't change between calling hasNext() and next().
```

## DefaultAnnotationParam
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/FlowableFlatMapCompletableSyncPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/ObservableFlatMapPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/ReducePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1, jvmArgsAppend = { "-XX:MaxInlineLevel=20" })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenCrossMapPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenJustPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/BlockingPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/JustAsyncPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/ToFlowablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenRangePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/CallableAsyncPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/StrictPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/BlockingGetPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/FlowableFlatMapCompletableAsyncPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/RangePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/FlatMapJustPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/PublishProcessorPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapSinglePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapCompletablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapCompletablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapCompletablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapSinglePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapSinglePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapSinglePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapCompletablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapCompletablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapSinglePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapCompletablePerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jmh/java/io/reactivex/rxjava3/parallel/ParallelPerf.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1, jvmArgsAppend = { "-XX:MaxInlineLevel=20" })
@OutputTimeUnit(TimeUnit.SECONDS)
```

## UnnecessarySuperQualifier
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
        @Override
        public void dispose() {
            if (super.tryDispose()) {
                parent.remove(this);
            }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
        @Override
        public void cancel() {
            if (super.tryCancel()) {
                parent.remove(this);
            }
```

## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.UnicastProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Unicast+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.BehaviorProcessor.create();
            }
        }, "Behavior", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.empty();
            }
        }, "empty", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.PublishSubject.create().subscribeWith(new MyRx2Observer());
            }
        }, "Publish+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.PublishProcessor.create();
            }
        }, "Publish", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.ReplaySubject.create().subscribeWith(new MyRx2Observer());
            }
        }, "Replay+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.just(1);
            }
        }, "just", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
    }

    static final class MyRx2Observer implements io.reactivex.rxjava3.core.Observer<Object>, io.reactivex.rxjava3.core.SingleObserver<Object>,
    io.reactivex.rxjava3.core.MaybeObserver<Object>, io.reactivex.rxjava3.core.CompletableObserver {

```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
    }

    static final class MyRx2Observer implements io.reactivex.rxjava3.core.Observer<Object>, io.reactivex.rxjava3.core.SingleObserver<Object>,
    io.reactivex.rxjava3.core.MaybeObserver<Object>, io.reactivex.rxjava3.core.CompletableObserver {

```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java

    static final class MyRx2Observer implements io.reactivex.rxjava3.core.Observer<Object>, io.reactivex.rxjava3.core.SingleObserver<Object>,
    io.reactivex.rxjava3.core.MaybeObserver<Object>, io.reactivex.rxjava3.core.CompletableObserver {

        Disposable upstream;
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java

    static final class MyRx2Observer implements io.reactivex.rxjava3.core.Observer<Object>, io.reactivex.rxjava3.core.SingleObserver<Object>,
    io.reactivex.rxjava3.core.MaybeObserver<Object>, io.reactivex.rxjava3.core.CompletableObserver {

        Disposable upstream;
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.ReplayProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Replay+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+subscribeOn+observeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+subscribeOn+observeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+subscribeOn+observeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+subscribeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+subscribeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.fromCallable(new Callable<Object>() {
                    @Override
                    public Object call() {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.just(1).subscribeWith(new MyRx2Subscriber());
            }
        }, "just+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.just(1);
            }
        }, "just", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.observers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return new io.reactivex.rxjava3.observers.TestObserver<>();
            }
        }, "test-consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.BehaviorSubject.create();
            }
        }, "Behavior", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.reactivestreams` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
    static final class MyRx2Subscriber implements FlowableSubscriber<Object> {

        org.reactivestreams.Subscription upstream;

        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.ReplayProcessor.create();
            }
        }, "Replay", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.UnicastSubject.create();
            }
        }, "Unicast", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.AsyncProcessor.create();
            }
        }, "Async", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+observeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+observeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).subscribeWith(new MyRx2Observer());
            }
        }, "range+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.empty();
            }
        }, "empty", "Rx2Flowable", 10000000);
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.just(1).subscribeWith(new MyRx2Observer());
            }
        }, "just+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.BehaviorProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Behavior+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.UnicastProcessor.create();
            }
        }, "Unicast", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.ReplaySubject.create();
            }
        }, "Replay", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10);
            }
        }, "range", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.observers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return new io.reactivex.rxjava3.observers.TestObserver<>();
            }
        }, "test-consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.AsyncSubject.create();
            }
        }, "Async", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.fromCallable(new Callable<Object>() {
                    @Override
                    public Object call() {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.AsyncProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Async+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.AsyncSubject.create().subscribeWith(new MyRx2Observer());
            }
        }, "Async+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+subscribeOn+observeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+subscribeOn+observeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+subscribeOn+observeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.processors` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.processors.PublishProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Publish+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+subscribeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Subscriber());
            }
        }, "range+subscribeOn+consumer", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.UnicastSubject.create().subscribeWith(new MyRx2Observer());
            }
        }, "Unicast+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.BehaviorSubject.create().subscribeWith(new MyRx2Observer());
            }
        }, "Behavior+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.empty();
            }
        }, "empty", "Rx2Flowable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subjects` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.subjects.PublishSubject.create();
            }
        }, "Publish", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+observeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary, and can be replaced with an import
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).observeOn(io.reactivex.rxjava3.schedulers.Schedulers.computation()).subscribeWith(new MyRx2Observer());
            }
        }, "range+observeOn+consumer", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10);
            }
        }, "range", "Rx2Observable");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observer.java`
#### Snippet
```java
 * providing the asynchronous boundary the code is running and either routes the exception to the global
 * {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} handler or the current thread's
 * {@link java.lang.Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable)} handler.</li>
 * </ul>
 * From the {@code Observable}'s perspective, an {@code Observer} is the end consumer thus it is the {@code Observer}'s
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Scheduler.java`
#### Snippet
```java
 * {@link Worker#dispose()} without affecting any other {@code Worker} instances of the same {@code Scheduler}.
 * <p>
 * Implementations of the {@link #scheduleDirect} and {@link Worker#schedule} methods are encouraged to call the {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onSchedule(Runnable)}
 * method to allow a scheduler hook to manipulate (wrap or replace) the original {@code Runnable} task before it is submitted to the
 * underlying task-execution scheme.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.schedulers` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Scheduler.java`
#### Snippet
```java
 * {@code Worker.schedule} method. Note that this can lead to multiple {@code RxJavaPlugins.onSchedule} calls and potentially
 * multiple hooks applied. Therefore, the default implementations of {@code scheduleDirect} (and the {@link Worker#schedulePeriodically(Runnable, long, long, TimeUnit)})
 * wrap the incoming {@code Runnable} into a class that implements the {@link io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection}
 * interface which can grant access to the original or hooked {@code Runnable}, thus, a repeated {@code RxJavaPlugins.onSchedule}
 * can detect the earlier hook and not apply a new one over again.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
     * <p>
     * By default, this global error handler prints the stacktrace via {@link Throwable#printStackTrace()}
     * and calls {@link java.lang.Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable)}
     * on the current thread.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
     *
     * @param executor the {@code Executor} to wrap and turn into a {@code Scheduler}.
     * @param interruptibleWorker if {@code true}, the tasks submitted to the {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} will
     * be interrupted when the task is disposed.
     * @param fair if {@code true}, tasks submitted to the {@code Scheduler} or {@code Worker} will be executed by the underlying {@code Executor} one after the other, still
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/queue/MpscLinkedQueue.java`
#### Snippet
```java
     * get the same producer node as part of XCHG guarantee.
     *
     * @see java.util.Queue#offer(java.lang.Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/observers/AbstractDisposableAutoRelease.java`
#### Snippet
```java
/**
 * Wraps lambda callbacks and when the upstream terminates or the observer gets disposed,
 * removes itself from a {@link io.reactivex.rxjava3.disposables.CompositeDisposable}.
 * <p>History: 0.18.0 @ RxJavaExtensions
 * @since 3.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
     *  except when the downstream has disposed this {@code Completable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
     *  except when the downstream has disposed this {@code Completable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
     *  except when the downstream has disposed this {@code Completable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
     *  except when the downstream has disposed this {@code Completable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     * <p>
     * If the {@code Single} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     *   except when the downstream has disposed this {@code Single} source.
     *   In this latter case, the {@code Throwable} is delivered to the global error handler via
     *   {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     *   except when the downstream has disposed this {@code Single} source.
     *   In this latter case, the {@code Throwable} is delivered to the global error handler via
     *   {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
     * <p>
     * If the {@code Single} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  except when the downstream has disposed the resulting {@code Maybe} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     * <p>
     * If the {@code Maybe} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  <dd>The returned {@code Flowable} honors the backpressure of the downstream consumer and
     *  expects the {@code Publisher} to honor backpressure as well. If the sources {@code Publisher}
     *  violates this, a {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException} is signaled.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>{@code concat} does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *   except if the {@code MaybeObserver} disposed the subscription in the meantime. In this latter case,
     *   the exception is forwarded to the global error handler via
     *   {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} wrapped into a
     *   {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   Fatal exceptions are rethrown and usually will end up in the executing thread's
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *   the exception is forwarded to the global error handler via
     *   {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} wrapped into a
     *   {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   Fatal exceptions are rethrown and usually will end up in the executing thread's
     *   {@link java.lang.Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable)} handler.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *   {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   Fatal exceptions are rethrown and usually will end up in the executing thread's
     *   {@link java.lang.Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable)} handler.</dd>
     * </dl>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *   except if the {@code MaybeObserver} disposed the subscription in the meantime. In this latter case,
     *   the exception is forwarded to the global error handler via
     *   {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} wrapped into a
     *   {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   Fatal exceptions are rethrown and usually will end up in the executing thread's
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *   the exception is forwarded to the global error handler via
     *   {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} wrapped into a
     *   {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   Fatal exceptions are rethrown and usually will end up in the executing thread's
     *   {@link java.lang.Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable)} handler.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *   {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   Fatal exceptions are rethrown and usually will end up in the executing thread's
     *   {@link java.lang.Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable)} handler.</dd>
     * </dl>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  except when the downstream has disposed this {@code Maybe} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     * <p>
     * If the {@code Maybe} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  <dd>The returned {@code Flowable} honors the backpressure of the downstream consumer and
     *  expects the {@code Publisher} to honor backpressure as well. If the sources {@code Publisher}
     *  violates this, a {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException} is signaled.</dd>
     * <dt><b>Scheduler:</b></dt>
     * <dd>{@code concat} does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/BlockingObservableMostRecent.java`
#### Snippet
```java
        }

        final class MostRecentIterator implements java.util.Iterator<T> {
            /**
             * buffer to make sure that the state of the iterator doesn't change between calling hasNext() and next().
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary, and can be replaced with an import
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/BlockingObservableIterable.java`
#### Snippet
```java
    static final class BlockingObservableIterator<T>
    extends AtomicReference<Disposable>
    implements io.reactivex.rxjava3.core.Observer<T>, Iterator<T>, Disposable {

        private static final long serialVersionUID = 6695226475494099826L;
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerMultiWorkerSupport.java`
#### Snippet
```java

    /**
     * Creates the given number of {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances
     * that are possibly backed by distinct threads
     * and calls the specified {@code Consumer} with them.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerMultiWorkerSupport.java`
#### Snippet
```java
/**
 * Allows retrieving multiple workers from the implementing
 * {@link io.reactivex.rxjava3.core.Scheduler} in a way that when asking for
 * at most the parallelism level of the Scheduler, those
 * {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances will be running
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerMultiWorkerSupport.java`
#### Snippet
```java
 * {@link io.reactivex.rxjava3.core.Scheduler} in a way that when asking for
 * at most the parallelism level of the Scheduler, those
 * {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances will be running
 * with different backing threads.
 * <p>History: 2.1.8 - experimental
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerWhen.java`
#### Snippet
```java
 * most {@link Completable}s are subscribed to.
 * <p>
 * When the {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker} is unsubscribed the {@link Completable} emits an
 * onComplete and triggers any behavior in the flattening operator. The
 * {@link Observable} and all {@link Completable}s give to the flattening
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerWhen.java`
#### Snippet
```java
 * This is a slightly different way to limit the concurrency but it has some
 * interesting benefits and drawbacks to the method above. It works by limited
 * the number of concurrent {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker}s rather than individual actions.
 * Generally each {@link Observable} uses its own {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker}. This means
 * that this will essentially limit the number of concurrent subscribes. The
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerWhen.java`
#### Snippet
```java
 * interesting benefits and drawbacks to the method above. It works by limited
 * the number of concurrent {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker}s rather than individual actions.
 * Generally each {@link Observable} uses its own {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker}. This means
 * that this will essentially limit the number of concurrent subscribes. The
 * danger comes from using operators like
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/DisposableAutoReleaseSubscriber.java`
#### Snippet
```java
/**
 * Wraps lambda callbacks and when the upstream terminates or this subscriber gets disposed,
 * removes itself from a {@link io.reactivex.rxjava3.disposables.CompositeDisposable}.
 * <p>History: 0.18.0 @ RxJavaExtensions
 * @param <T> the element type consumed
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
 * {@link NullPointerException} being thrown and the subject's state is not changed.
 * <p>
 * Since a {@code SingleSubject} is a {@link io.reactivex.rxjava3.core.Single}, calling {@code onSuccess} or {@code onError}
 * will move this {@code SingleSubject} into its terminal state atomically.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
 * All methods are thread safe. Calling {@link #onSuccess(Object)} multiple
 * times has no effect. Calling {@link #onError(Throwable)} multiple times relays the {@code Throwable} to
 * the {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} global error handler.
 * <p>
 * Even though {@code SingleSubject} implements the {@code SingleObserver} interface, calling
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
 * <dl>
 *  <dt><b>Scheduler:</b></dt>
 *  <dd>{@code SingleSubject} does not operate by default on a particular {@link io.reactivex.rxjava3.core.Scheduler} and
 *  the {@code SingleObserver}s get notified on the thread where the terminating {@code onSuccess} or {@code onError}
 *  methods were invoked.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
 *  if one or more {@code SingleObserver}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code SingleObserver}s
 *  cancel at once).
 *  If there were no {@code SingleObserver}s subscribed to this {@code SingleSubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
 * <p>
 * When this {@code PublishSubject} is terminated via {@link #onError(Throwable)} or {@link #onComplete()},
 * late {@link io.reactivex.rxjava3.core.Observer}s only receive the respective terminal event.
 * <p>
 * Unlike a {@link BehaviorSubject}, a {@code PublishSubject} doesn't retain/cache items, therefore, a new
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
 *  if one or more {@code Observer}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Observer}s
 *  cancel at once).
 *  If there were no {@code Observer}s subscribed to this {@code PublishSubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
 * <p>
 * When this {@code AsyncSubject} is terminated via {@link #onError(Throwable)}, the
 * last observed item (if any) is cleared and late {@link io.reactivex.rxjava3.core.Observer}s only receive
 * the {@code onError} event.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
 *  if one or more {@code Observer}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Observer}s
 *  cancel at once).
 *  If there were no {@code Observer}s subscribed to this {@code AsyncSubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
 * {@link NullPointerException} being thrown and the subject's state is not changed.
 * <p>
 * Since a {@code MaybeSubject} is a {@link io.reactivex.rxjava3.core.Maybe}, calling {@code onSuccess}, {@code onError}
 * or {@code onComplete} will move this {@code MaybeSubject} into its terminal state atomically.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
 * All methods are thread safe. Calling {@link #onSuccess(Object)} or {@link #onComplete()} multiple
 * times has no effect. Calling {@link #onError(Throwable)} multiple times relays the {@code Throwable} to
 * the {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} global error handler.
 * <p>
 * Even though {@code MaybeSubject} implements the {@code MaybeObserver} interface, calling
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
 * <dl>
 *  <dt><b>Scheduler:</b></dt>
 *  <dd>{@code MaybeSubject} does not operate by default on a particular {@link io.reactivex.rxjava3.core.Scheduler} and
 *  the {@code MaybeObserver}s get notified on the thread where the terminating {@code onSuccess}, {@code onError} or {@code onComplete}
 *  methods were invoked.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
 *  if one or more {@code MaybeObserver}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code MaybeObserver}s
 *  cancel at once).
 *  If there were no {@code MaybeObserver}s subscribed to this {@code MaybeSubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/UnicastSubject.java`
#### Snippet
```java
 *  if the single {@code Observer}s disposes its respective {@code Disposable}, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)}.
 *  If there were no {@code Observer}s subscribed to this {@code UnicastSubject} when the {@code onError()}
 *  was called, the global error handler is not invoked.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
 * <p>
 * When this {@code BehaviorSubject} is terminated via {@link #onError(Throwable)} or {@link #onComplete()}, the
 * last observed item (if any) is cleared and late {@link io.reactivex.rxjava3.core.Observer}s only receive
 * the respective terminal event.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
 *  if one or more {@code Observer}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Observer}s
 *  cancel at once).
 *  If there were no {@code Observer}s subscribed to this {@code BehaviorSubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
 * All methods are thread safe. Calling {@link #onComplete()} multiple
 * times has no effect. Calling {@link #onError(Throwable)} multiple times relays the {@code Throwable} to
 * the {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} global error handler.
 * <p>
 * This {@code CompletableSubject} supports the standard state-peeking methods {@link #hasComplete()},
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
 * <dl>
 *  <dt><b>Scheduler:</b></dt>
 *  <dd>{@code CompletableSubject} does not operate by default on a particular {@link io.reactivex.rxjava3.core.Scheduler} and
 *  the {@code CompletableObserver}s get notified on the thread where the terminating {@code onError} or {@code onComplete}
 *  methods were invoked.</dd>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
 *  if one or more {@code CompletableObserver}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code CompletableObserver}s
 *  cancel at once).
 *  If there were no {@code CompletableObserver}s subscribed to this {@code CompletableSubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.functions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/flowables/ConnectableFlowable.java`
#### Snippet
```java
     * {@link Flowable} to its {@link Subscriber}s.
     * <p>
     * To disconnect from a synchronous source, use the {@link #connect(io.reactivex.rxjava3.functions.Consumer)} method.
     * <dl>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/ResourceCompletableObserver.java`
#### Snippet
```java
 * in {@code onError()} and {@code onComplete()} explicitly.
 *
 * <p>Use {@link #add(Disposable)} to associate resources (as {@link io.reactivex.rxjava3.disposables.Disposable Disposable}s)
 * with this {@code ResourceCompletableObserver} that will be cleaned up when {@link #dispose()} is called.
 * Removing previously associated resources is not possible but one can create a
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/DisposableObserver.java`
#### Snippet
```java
 * <p>Implementation of {@link #onStart()}, {@link #onNext(Object)}, {@link #onError(Throwable)}
 * and {@link #onComplete()} are not allowed to throw any unchecked exceptions.
 * If for some reason this can't be avoided, use {@link io.reactivex.rxjava3.core.Observable#safeSubscribe(io.reactivex.rxjava3.core.Observer)}
 * instead of the standard {@code subscribe()} method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/ResourceSingleObserver.java`
#### Snippet
```java
 * in {@code onSuccess()} and {@code onError()} explicitly.
 *
 * <p>Use {@link #add(Disposable)} to associate resources (as {@link io.reactivex.rxjava3.disposables.Disposable Disposable}s)
 * with this {@code ResourceSingleObserver} that will be cleaned up when {@link #dispose()} is called.
 * Removing previously associated resources is not possible but one can create a
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/DefaultObserver.java`
#### Snippet
```java

/**
 * Abstract base implementation of an {@link io.reactivex.rxjava3.core.Observer Observer} with support for cancelling a
 * subscription via {@link #cancel()} (synchronously) and calls {@link #onStart()}
 * when the subscription happens.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/DefaultObserver.java`
#### Snippet
```java
 * <p>Implementation of {@link #onStart()}, {@link #onNext(Object)}, {@link #onError(Throwable)}
 * and {@link #onComplete()} are not allowed to throw any unchecked exceptions.
 * If for some reason this can't be avoided, use {@link io.reactivex.rxjava3.core.Observable#safeSubscribe(io.reactivex.rxjava3.core.Observer)}
 * instead of the standard {@code subscribe()} method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/ResourceObserver.java`
#### Snippet
```java
 * in {@code onError()} and {@code onComplete()} explicitly.
 *
 * <p>Use {@link #add(Disposable)} to associate resources (as {@link io.reactivex.rxjava3.disposables.Disposable Disposable}s)
 * with this {@code ResourceObserver} that will be cleaned up when {@link #dispose()} is called.
 * Removing previously associated resources is not possible but one can create a
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/ResourceObserver.java`
#### Snippet
```java
 * <p>Implementation of {@link #onStart()}, {@link #onNext(Object)}, {@link #onError(Throwable)}
 * and {@link #onComplete()} are not allowed to throw any unchecked exceptions.
 * If for some reason this can't be avoided, use {@link io.reactivex.rxjava3.core.Observable#safeSubscribe(io.reactivex.rxjava3.core.Observer)}
 * instead of the standard {@code subscribe()} method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/observers/ResourceMaybeObserver.java`
#### Snippet
```java
 * in {@code onSuccess()}, {@code onError()} and {@code onComplete()} explicitly.
 *
 * <p>Use {@link #add(Disposable)} to associate resources (as {@link io.reactivex.rxjava3.disposables.Disposable Disposable}s)
 * with this {@code ResourceMaybeObserver} that will be cleaned up when {@link #dispose()} is called.
 * Removing previously associated resources is not possible but one can create a
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
 * <dl>
 *  <dt><b>Scheduler:</b></dt>
 *  <dd>{@code ReplaySubject} does not operate by default on a particular {@link io.reactivex.rxjava3.core.Scheduler} and
 *  the {@code Observer}s get notified on the thread the respective {@code onXXX} methods were invoked.
 *  Time-bound {@code ReplaySubject}s use the given {@code Scheduler} in their {@code create} methods
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
 *  if one or more {@code Observer}s dispose their respective {@code Disposable}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Observer}s
 *  cancel at once).
 *  If there were no {@code Observer}s subscribed to this {@code ReplaySubject} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
 *  if one or more {@code Subscriber}s dispose their respective {@code Subscription}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Subscriber}s
 *  cancel at once).
 *  If there were no {@code Subscriber}s subscribed to this {@code AsyncProcessor} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/UnicastProcessor.java`
#### Snippet
```java
 *  if the single {@code Subscriber}s cancels its respective {@code Subscription}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)}.
 *  If there were no {@code Subscriber}s subscribed to this {@code UnicastProcessor} when the {@code onError()}
 *  was called, the global error handler is not invoked.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.reactivestreams` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
 * <p>
 * When this {@code BehaviorProcessor} is terminated via {@link #onError(Throwable)} or {@link #onComplete()}, the
 * last observed item (if any) is cleared and late {@link org.reactivestreams.Subscriber}s only receive
 * the respective terminal event.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
 *  if one or more {@code Subscriber}s cancel their respective {@code Subscription}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Subscriber}s
 *  cancel at once).
 *  If there were no {@code Subscriber}s subscribed to this {@code BehaviorProcessor} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
 *  if one or more {@code Subscriber}s cancel their respective {@code Subscription}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Subscriber}s
 *  cancel at once).
 *  If there were no {@code Subscriber}s subscribed to this {@code PublishProcessor} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * before posting the actual task to the given executor.
     * <p>
     * Tasks submitted to the {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} of this {@code Scheduler} are also not interruptible. Use the
     * {@link #from(Executor, boolean)} overload to enable task interruption via this wrapper.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * it is recommended to rephrase the flow to utilize backpressure as the means to limit outstanding work.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} instances, although
     * not disposing a worker that has timed/delayed tasks not cancelled by other means may leak resources and/or
     * execute those tasks "unexpectedly".
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * calls to it.
     * <p>
     * The tasks scheduled by the returned {@code Scheduler} and its {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker}
     * can be optionally interrupted.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * it is recommended to rephrase the flow to utilize backpressure as the means to limit outstanding work.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} instances, although
     * not disposing a worker that has timed/delayed tasks not cancelled by other means may leak resources and/or
     * execute those tasks "unexpectedly".
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * @param executor
     *          the executor to wrap
     * @param interruptibleWorker if {@code true}, the tasks submitted to the {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} will
     * be interrupted when the task is disposed.
     * @return the new {@code Scheduler} wrapping the {@code Executor}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * methods, thus an unbounded number of worker threads may be created that can
     * result in system slowdowns or {@link OutOfMemoryError}. Therefore, for casual uses or when implementing an operator,
     * the Worker instances must be disposed via {@link io.reactivex.rxjava3.core.Scheduler.Worker#dispose()}.
     * <p>
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * the Worker instances must be disposed via {@link io.reactivex.rxjava3.core.Scheduler.Worker#dispose()}.
     * <p>
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
     * <p>
     * You can control certain properties of this standard scheduler via system properties that have to be set
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * calls to it.
     * <p>
     * The tasks scheduled by the returned {@code Scheduler} and its {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker}
     * can be optionally interrupted.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * it is recommended to rephrase the flow to utilize backpressure as the means to limit outstanding work.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} instances, although
     * not disposing a worker that has timed/delayed tasks not cancelled by other means may leak resources and/or
     * execute those tasks "unexpectedly".
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * @param executor
     *          the executor to wrap
     * @param interruptibleWorker if {@code true}, the tasks submitted to the {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} will
     * be interrupted when the task is disposed.
     * @param fair if {@code true}, tasks submitted to the {@code Scheduler} or {@code Worker} will be executed by the underlying {@code Executor} one after the other, still
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * <p>
     * The default instance has a backing pool of single-threaded {@link ScheduledExecutorService} instances equal to
     * the number of available processors ({@link java.lang.Runtime#availableProcessors()}) to the Java VM.
     * <p>
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * the number of available processors ({@link java.lang.Runtime#availableProcessors()}) to the Java VM.
     * <p>
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances, although
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances, although
     * not disposing a worker that has timed/delayed tasks not cancelled by other means may leak resources and/or
     * execute those tasks "unexpectedly".
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java

    /**
     * Returns a default, shared {@link Scheduler} instance whose {@link io.reactivex.rxjava3.core.Scheduler.Worker}
     * instances queue work and execute them in a FIFO manner on one of the participating threads.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * The implementation is backed by a pool of single-threaded {@link ScheduledExecutorService} instances
     * that will try to reuse previously started instances used by the worker
     * returned by {@link io.reactivex.rxjava3.core.Scheduler#createWorker()} but otherwise will start a new backing
     * {@link ScheduledExecutorService} instance. Note that this scheduler may create an unbounded number
     * of worker threads that can result in system slowdowns or {@link OutOfMemoryError}. Therefore, for casual uses
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * {@link ScheduledExecutorService} instance. Note that this scheduler may create an unbounded number
     * of worker threads that can result in system slowdowns or {@link OutOfMemoryError}. Therefore, for casual uses
     * or when implementing an operator, the Worker instances must be disposed via {@link io.reactivex.rxjava3.core.Scheduler.Worker#dispose()}.
     * <p>
     * It is not recommended to perform computational work on this scheduler. Use {@link #computation()} instead.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * It is not recommended to perform computational work on this scheduler. Use {@link #computation()} instead.
     * <p>
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
     * <p>
     * You can control certain properties of this standard scheduler via system properties that have to be set
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * annotation.
     * <p>
     * When the {@link io.reactivex.rxjava3.core.Scheduler.Worker Scheduler.Worker} is disposed,
     * the underlying worker can be released to the cached worker pool in two modes:
     * <ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * </ul>
     * <p>
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances, although
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/schedulers/Schedulers.java`
#### Snippet
```java
     * Unhandled errors will be delivered to the scheduler Thread's {@link java.lang.Thread.UncaughtExceptionHandler}.
     * <p>
     * This type of scheduler is less sensitive to leaking {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances, although
     * not disposing a worker that has timed/delayed tasks not cancelled by other means may leak resources and/or
     * execute those tasks "unexpectedly".
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.disposables` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/subscribers/ResourceSubscriber.java`
#### Snippet
```java
 * in {@code onError()} and {@code onComplete()} explicitly.
 *
 * <p>Use {@link #add(Disposable)} to associate resources (as {@link io.reactivex.rxjava3.disposables.Disposable Disposable}s)
 * with this {@code ResourceSubscriber} that will be cleaned up when {@link #dispose()} is called.
 * Removing previously associated resources is not possible but one can create a
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
 *  if an individual item gets delayed due to backpressure.</dd>
 *  <dt><b>Scheduler:</b></dt>
 *  <dd>{@code ReplayProcessor} does not operate by default on a particular {@link io.reactivex.rxjava3.core.Scheduler} and
 *  the {@code Subscriber}s get notified on the thread the respective {@code onXXX} methods were invoked.
 *  Time-bound {@code ReplayProcessor}s use the given {@code Scheduler} in their {@code create} methods
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
 *  if one or more {@code Subscriber}s cancel their respective {@code Subscription}s, the
 *  {@code Throwable} is delivered to the global error handler via
 *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} (multiple times if multiple {@code Subscriber}s
 *  cancel at once).
 *  If there were no {@code Subscriber}s subscribed to this {@code ReplayProcessor} when the {@code onError()}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/parallel/ParallelFlowable.java`
#### Snippet
```java
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>{@code runOn} drains the upstream rails on the specified {@code Scheduler}'s
     *  {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker}s.</dd>
     * </dl>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.core` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/parallel/ParallelFlowable.java`
#### Snippet
```java
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>{@code runOn} drains the upstream rails on the specified {@code Scheduler}'s
     *  {@link io.reactivex.rxjava3.core.Scheduler.Worker Worker}s.</dd>
     * </dl>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.observers` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
 *            the type of the items emitted by the {@code Observable}
 * @see Flowable
 * @see io.reactivex.rxjava3.observers.DisposableObserver
 */
public abstract class Observable<@NonNull T> implements ObservableSource<T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     * Use {@link #fromArray(Object...)} to emit an arbitrary number of items that are known upfront.
     * <p>
     * To emit the items of an {@link Iterable} sequence (such as a {@link java.util.List}), use {@link #fromIterable(Iterable)}.
     * <dl>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     * <p>
     * By default, {@code distinct()} uses an internal {@link HashSet} per {@link Observer} to remember
     * previously seen keys and uses {@link java.util.Set#add(Object)} returning {@code false} as the
     * indicator for duplicates.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     * to {@link OutOfMemoryError}.
     * <p>
     * Customizing the retention policy can happen only by providing a custom {@link java.util.Collection} implementation
     * to the {@link #distinct(Function, Supplier)} overload.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     *  except when the downstream has canceled the resulting {@code Observable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     * <p>
     * By default, {@code distinct()} uses an internal {@link HashSet} per {@link Observer} to remember
     * previously seen items and uses {@link java.util.Set#add(Object)} returning {@code false} as the
     * indicator for duplicates.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     * to {@link OutOfMemoryError}.
     * <p>
     * Customizing the retention policy can happen only by providing a custom {@link java.util.Collection} implementation
     * to the {@link #distinct(Function, Supplier)} overload.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
     *  except when the downstream has canceled the resulting {@code Observable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  <dd>This operator does not support backpressure as it uses time to control data flow.
     *  If the downstream is not ready to receive items, a
     *  {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException MissingBackpressureException}
     *  will be signaled.</dd>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  <dd>This operator does not support backpressure as it uses time to control data flow.
     *  If the downstream is not ready to receive items, a
     *  {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException MissingBackpressureException}
     *  will be signaled.</dd>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <img width="640" height="311" src="https://github.com/ReactiveX/RxJava/wiki/images/rx-operators/Flowable.toFuture.png" alt="">
     * <p>
     * If the {@code Flowable} emits more than one item, {@link java.util.concurrent.Future} will receive an
     * {@link java.lang.IndexOutOfBoundsException}. If the {@code Flowable} is empty, {@link java.util.concurrent.Future}
     * will receive a {@link java.util.NoSuchElementException}. The {@code Flowable} source has to terminate in order
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits more than one item, {@link java.util.concurrent.Future} will receive an
     * {@link java.lang.IndexOutOfBoundsException}. If the {@code Flowable} is empty, {@link java.util.concurrent.Future}
     * will receive a {@link java.util.NoSuchElementException}. The {@code Flowable} source has to terminate in order
     * for the returned {@code Future} to terminate as well.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits more than one item, {@link java.util.concurrent.Future} will receive an
     * {@link java.lang.IndexOutOfBoundsException}. If the {@code Flowable} is empty, {@link java.util.concurrent.Future}
     * will receive a {@link java.util.NoSuchElementException}. The {@code Flowable} source has to terminate in order
     * for the returned {@code Future} to terminate as well.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * If the {@code Flowable} emits more than one item, {@link java.util.concurrent.Future} will receive an
     * {@link java.lang.IndexOutOfBoundsException}. If the {@code Flowable} is empty, {@link java.util.concurrent.Future}
     * will receive a {@link java.util.NoSuchElementException}. The {@code Flowable} source has to terminate in order
     * for the returned {@code Future} to terminate as well.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  <dd>This operator does not support backpressure as it uses time to control data flow.
     *  If the downstream is not ready to receive items, a
     *  {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException MissingBackpressureException}
     *  will be signaled.</dd>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  (i.e., inactive or switched out) {@code onError} from this {@code Flowable} or from any of
     *  the inner {@code MaybeSource}s will be forwarded to the global error handler via
     *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} as
     *  {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}</dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  the inner {@code MaybeSource}s will be forwarded to the global error handler via
     *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} as
     *  {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}</dd>
     * </dl>
     * <p>History: 2.1.11 - experimental
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  <dd>This operator does not support backpressure as it uses time to control data flow.
     *  If the downstream is not ready to receive items, a
     *  {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException MissingBackpressureException}
     *  will be signaled.</dd>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * a meaningful comparison between the key objects as the default Java implementation only considers reference equivalence.
     * <p>
     * By default, {@code distinct()} uses an internal {@link java.util.HashSet} per {@link Subscriber} to remember
     * previously seen keys and uses {@link java.util.Set#add(Object)} returning {@code false} as the
     * indicator for duplicates.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * By default, {@code distinct()} uses an internal {@link java.util.HashSet} per {@link Subscriber} to remember
     * previously seen keys and uses {@link java.util.Set#add(Object)} returning {@code false} as the
     * indicator for duplicates.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * to {@link OutOfMemoryError}.
     * <p>
     * Customizing the retention policy can happen only by providing a custom {@link java.util.Collection} implementation
     * to the {@link #distinct(Function, Supplier)} overload.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  except when the downstream has canceled the resulting {@code Flowable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  except when the downstream has canceled the resulting {@code Flowable} source.
     *  In this latter case, the {@code Throwable} is delivered to the global error handler via
     *  {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *  </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *   except when the downstream has canceled this {@code Flowable} source.
     *   In this latter case, the {@code Throwable} is delivered to the global error handler via
     *   {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.subscribers` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
 * @see Observable
 * @see ParallelFlowable
 * @see io.reactivex.rxjava3.subscribers.DisposableSubscriber
 */
public abstract class Flowable<@NonNull T> implements Publisher<T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * a meaningful comparison between items as the default Java implementation only considers reference equivalence.
     * <p>
     * By default, {@code distinct()} uses an internal {@link java.util.HashSet} per {@link Subscriber} to remember
     * previously seen items and uses {@link java.util.Set#add(Object)} returning {@code false} as the
     * indicator for duplicates.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * By default, {@code distinct()} uses an internal {@link java.util.HashSet} per {@link Subscriber} to remember
     * previously seen items and uses {@link java.util.Set#add(Object)} returning {@code false} as the
     * indicator for duplicates.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * to {@link OutOfMemoryError}.
     * <p>
     * Customizing the retention policy can happen only by providing a custom {@link java.util.Collection} implementation
     * to the {@link #distinct(Function, Supplier)} overload.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * Use {@link #fromArray(Object...)} to emit an arbitrary number of items that are known upfront.
     * <p>
     * To emit the items of an {@link Iterable} sequence (such as a {@link java.util.List}), use {@link #fromIterable(Iterable)}.
     * <dl>
     *  <dt><b>Backpressure:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *   except when the downstream has canceled this {@code Flowable} source.
     *   In this latter case, the {@code Throwable} is delivered to the global error handler via
     *   {@link RxJavaPlugins#onError(Throwable)} as an {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}.
     *   </dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * Using the overloads {@link #blockingSubscribe(Consumer, Consumer)}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.plugins` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  (i.e., inactive or switched out) {@code onError} from this {@code Flowable} or from any of
     *  the inner {@code SingleSource}s will be forwarded to the global error handler via
     *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} as
     *  {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}</dd>
     * </dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  the inner {@code SingleSource}s will be forwarded to the global error handler via
     *  {@link io.reactivex.rxjava3.plugins.RxJavaPlugins#onError(Throwable)} as
     *  {@link io.reactivex.rxjava3.exceptions.UndeliverableException UndeliverableException}</dd>
     * </dl>
     * <p>History: 2.1.11 - experimental
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  <dd>This operator does not support backpressure as it uses time to control data flow.
     *  If the downstream is not ready to receive items, a
     *  {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException MissingBackpressureException}
     *  will be signaled.</dd>
     *  <dt><b>Scheduler:</b></dt>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  all of them terminate in some fashion. At this point, if there was only one failure, the respective
     *  {@link Throwable} is emitted to the downstream. If there was more than one failure, the
     *  operator combines all {@code Throwable}s into a {@link io.reactivex.rxjava3.exceptions.CompositeException CompositeException}
     *  and signals that to the downstream.
     *  If any inactivated (switched out) {@code CompletableSource}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     *  every inner {@code CompletableSource}s and the main {@code Flowable} terminates in some fashion.
     *  If they fail concurrently, the operator may combine the {@code Throwable}s into a
     *  {@link io.reactivex.rxjava3.exceptions.CompositeException CompositeException}
     *  and signal it to the downstream instead. If any inactivated (switched out) {@code CompletableSource}
     *  signals an {@code onError} late, the {@code Throwable}s will be signaled to the global error handler via
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.rxjava3.exceptions` is unnecessary and can be removed
in `src/main/java/io/reactivex/rxjava3/core/Flowable.java`
#### Snippet
```java
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * Using the overloads {@link #blockingSubscribe(Consumer, Consumer)}
```

## NestedAssignment
### NestedAssignment
Result of assignment expression used
in `src/main/java/io/reactivex/rxjava3/internal/queue/MpscLinkedQueue.java`
#### Snippet
```java
        else if (currConsumerNode != lvProducerNode()) {
            // spin, we are no longer wait free
            while ((nextNode = currConsumerNode.lvNext()) == null) { } // NOPMD
            // got the next node...

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindow.java`
#### Snippet
```java
                if (cancelled) {
                    UnicastProcessor<T> up = null;
                    while ((up = q.poll()) != null) {
                        up.onComplete();
                    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
                int count = 0;
                GroupedUnicast<K, V> evictedGroup;
                while ((evictedGroup = evictedGroups.poll()) != null) {
                    if (evictedGroup.state.tryComplete()) {
                        count++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableConcatMapEager.java`
#### Snippet
```java
            }

            while ((inner = subscribers.poll()) != null) {
                inner.cancel();
            }
```

## ThrowablePrintStackTrace
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/PerfInteropConsumer.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/PerfObserver.java`
#### Snippet
```java
    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        cdl.countDown();
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/PerfConsumer.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/PerfAsyncConsumer.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
        countDown();
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/jmh/java/io/reactivex/rxjava3/core/LatchedSingleObserver.java`
#### Snippet
```java
    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        cdl.countDown();
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
            } catch (Throwable e) {
                // Exceptions.throwIfFatal(e); TODO decide
                e.printStackTrace(); // NOPMD
                uncaught(e);
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
        }

        error.printStackTrace(); // NOPMD
        uncaught(error);
    }
```

## SuspiciousToArrayCall
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'E\[\]' found
in `src/main/java/io/reactivex/rxjava3/internal/util/VolatileSizeArrayList.java`
#### Snippet
```java
    @Override
    public <E> E[] toArray(@NonNull E[] a) {
        return list.toArray(a);
    }

```

## NonProtectedConstructorInAbstractClass
### NonProtectedConstructorInAbstractClass
Constructor `BasicFuseableObserver()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/observers/BasicFuseableObserver.java`
#### Snippet
```java
     * @param downstream the subscriber, not null (not verified)
     */
    public BasicFuseableObserver(Observer<? super R> downstream) {
        this.downstream = downstream;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DeferredScalarObserver()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/observers/DeferredScalarObserver.java`
#### Snippet
```java
     * @param downstream the downstream subscriber, not null (not verified)
     */
    public DeferredScalarObserver(Observer<? super R> downstream) {
        super(downstream);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BlockingBaseObserver()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/observers/BlockingBaseObserver.java`
#### Snippet
```java
    volatile boolean cancelled;

    public BlockingBaseObserver() {
        super(1);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `QueueDrainObserver()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/observers/QueueDrainObserver.java`
#### Snippet
```java
    protected Throwable error;

    public QueueDrainObserver(Observer<? super V> actual, SimplePlainQueue<U> queue) {
        this.downstream = actual;
        this.queue = queue;
```

### NonProtectedConstructorInAbstractClass
Constructor `ConcatMapXMainSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ConcatMapXMainSubscriber.java`
#### Snippet
```java
    boolean syncFused;

    public ConcatMapXMainSubscriber(int prefetch, ErrorMode errorMode) {
        this.errorMode = errorMode;
        this.errors = new AtomicThrowable();
```

### NonProtectedConstructorInAbstractClass
Constructor `ConcatMapXMainObserver()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ConcatMapXMainObserver.java`
#### Snippet
```java
    volatile boolean disposed;

    public ConcatMapXMainObserver(int prefetch, ErrorMode errorMode) {
        this.errorMode = errorMode;
        this.errors = new AtomicThrowable();
```

### NonProtectedConstructorInAbstractClass
Constructor `BasicFuseableSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/BasicFuseableSubscriber.java`
#### Snippet
```java
     * @param downstream the subscriber, not null (not verified)
     */
    public BasicFuseableSubscriber(Subscriber<? super R> downstream) {
        this.downstream = downstream;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DeferredScalarSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/DeferredScalarSubscriber.java`
#### Snippet
```java
     * @param downstream the downstream subscriber, not null (not verified)
     */
    public DeferredScalarSubscriber(Subscriber<? super R> downstream) {
        super(downstream);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BasicFuseableConditionalSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/BasicFuseableConditionalSubscriber.java`
#### Snippet
```java
     * @param downstream the subscriber, not null (not verified)
     */
    public BasicFuseableConditionalSubscriber(ConditionalSubscriber<? super R> downstream) {
        this.downstream = downstream;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BlockingBaseSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/BlockingBaseSubscriber.java`
#### Snippet
```java
    volatile boolean cancelled;

    public BlockingBaseSubscriber() {
        super(1);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SinglePostCompleteSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/SinglePostCompleteSubscriber.java`
#### Snippet
```java
    static final long REQUEST_MASK = Long.MAX_VALUE;

    public SinglePostCompleteSubscriber(Subscriber<? super R> downstream) {
        this.downstream = downstream;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `QueueDrainSubscriber()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/QueueDrainSubscriber.java`
#### Snippet
```java
    protected Throwable error;

    public QueueDrainSubscriber(Subscriber<? super V> actual, SimplePlainQueue<U> queue) {
        this.downstream = actual;
        this.queue = queue;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseTestConsumer()` of an abstract class should not be declared 'public'
in `src/main/java/io/reactivex/rxjava3/observers/BaseTestConsumer.java`
#### Snippet
```java
     * Constructs a {@code BaseTestConsumer} with {@code CountDownLatch} set to 1.
     */
    public BaseTestConsumer() {
        this.values = new VolatileSizeArrayList<>();
        this.errors = new VolatileSizeArrayList<>();
```

## Anonymous2MethodRef
### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
        range = Flowable.range(1, times);

        rangeFlatMapJust = range.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
        rangeObservable = Observable.range(1, times);

        rangeObservableFlatMapJust = rangeObservable.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.switchMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
    public void oneStreamOfNthatMergesIn1(final InputMillion input) throws InterruptedException {
        Flowable<Flowable<Integer>> os = Flowable.range(1, input.size)
                .map(new Function<Integer, Flowable<Integer>>() {
                    @Override
                    public Flowable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Action() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        final CountDownLatch cdl = new CountDownLatch(1);

        observable.subscribe(this, Functions.emptyConsumer(), new Action() {
            @Override
            public void run() {
```

### Anonymous2MethodRef
Anonymous new Action() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        final CountDownLatch cdl = new CountDownLatch(1);

        flowable.subscribe(this, Functions.emptyConsumer(), new Action() {
            @Override
            public void run() {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
        nbpRange = Observable.range(1, times);

        bpRangeMapJust = bpRange.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
            }
        });
        nbpRangeMapJust = nbpRange.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java

        singleJust = Single.just(1);
        singleJustMapJust = singleJust.flatMap(new Function<Integer, Single<Integer>>() {
            @Override
            public Single<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorFlatMapPerf.java`
#### Snippet
```java
    @Benchmark
    public void flatMapIntPassthruSync(Input input) {
        input.flowable.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/FlatMapJustPerf.java`
#### Snippet
```java
        Integer[] array = new Integer[times];

        flowable = Flowable.fromArray(array).flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/FlatMapJustPerf.java`
#### Snippet
```java
        });

        observable = Observable.fromArray(array).flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapSinglePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.concatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        Flowable<Integer> fsource = Flowable.fromArray(values);

        flowFlatMapFlowable1 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapSingle1 = fsource.flatMapSingle(new Function<Integer, SingleSource<Integer>>() {
            @Override
            public SingleSource<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybe1 = fsource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapIterable1 = fsource.flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapSingle1 = fsource.flatMapSingle(new Function<Integer, SingleSource<Integer>>() {
            @Override
            public SingleSource<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybe1 = fsource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        Observable<Integer> osource = Observable.fromArray(values);

        obsFlatMapObservable1 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapSingle1 = osource.flatMapSingle(new Function<Integer, SingleSource<Integer>>() {
            @Override
            public SingleSource<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapMaybe1 = osource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapIterable1 = osource.flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.concatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.concatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapSinglePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.flatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "fromCallable", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+subscribeOn+observeOn+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Async", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Publish", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Replay", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Behavior", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "empty", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "fromCallable", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+subscribeOn+observeOn+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Async", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Publish", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Replay", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Behavior", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapSinglePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapSinglePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.flatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.concatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapSinglePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapSinglePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.switchMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.switchMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.flatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapSinglePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapSinglePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.switchMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.flatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

## FieldAccessedSynchronizedAndUnsynchronized
### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
        Disposable other;

        U buffer;

        BufferExactBoundarySubscriber(Subscriber<? super U> actual, Supplier<U> bufferSupplier,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        final Worker w;

        U buffer;

        Disposable timer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        Subscription upstream;

        U buffer;

        final AtomicReference<Disposable> timer = new AtomicReference<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
        Disposable other;

        U buffer;

        BufferExactBoundaryObserver(Observer<? super U> actual, Supplier<U> bufferSupplier,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        final Worker w;

        U buffer;

        Disposable timer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        Disposable upstream;

        U buffer;

        final AtomicReference<Disposable> timer = new AtomicReference<>();
```

## Convert2Lambda
### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/ObservableFlatMapPerf.java`
#### Snippet
```java
        final Observable<Integer> inner = Observable.fromArray(innerArray);

        source = outer.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer t) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
        range = Flowable.range(1, times);

        rangeFlatMapJust = range.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
        });

        rangeFlatMap = range.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
        rangeObservable = Observable.range(1, times);

        rangeObservableFlatMapJust = rangeObservable.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/RxVsStreamPerf.java`
#### Snippet
```java
        });

        rangeObservableFlatMap = rangeObservable.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenCrossMapPerf.java`
#### Snippet
```java
        final Iterable<Integer> list = Arrays.asList(arrayInner);

        flowable = Flowable.fromArray(array).flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenCrossMapPerf.java`
#### Snippet
```java
        });

        observable = Observable.fromArray(array).flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenJustPerf.java`
#### Snippet
```java
        final Iterable<Integer> singletonList = Collections.singletonList(1);

        flowable = Flowable.fromArray(array).flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenJustPerf.java`
#### Snippet
```java
        });

        observable = Observable.fromArray(array).flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybePerf.java`
#### Snippet
```java
        });

        observableConvert = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.switchMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
    @Benchmark
    public void merge1SyncStreamOfN(final InputMillion input) throws InterruptedException {
        Flowable<Flowable<Integer>> os = Flowable.just(1).map(new Function<Integer, Flowable<Integer>>() {
            @Override
            public Flowable<Integer> apply(Integer i) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
    @Benchmark
    public void mergeNSyncStreamsOfN(final InputThousand input) throws InterruptedException {
        Flowable<Flowable<Integer>> os = input.flowable.map(new Function<Integer, Flowable<Integer>>() {
            @Override
            public Flowable<Integer> apply(Integer i) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
    public void oneStreamOfNthatMergesIn1(final InputMillion input) throws InterruptedException {
        Flowable<Flowable<Integer>> os = Flowable.range(1, input.size)
                .map(new Function<Integer, Flowable<Integer>>() {
                    @Override
                    public Flowable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorMergePerf.java`
#### Snippet
```java
    @Benchmark
    public void mergeNAsyncStreamsOfN(final InputThousand input) throws InterruptedException {
        Flowable<Flowable<Integer>> os = input.flowable.map(new Function<Integer, Flowable<Integer>>() {
            @Override
            public Flowable<Integer> apply(Integer i) {
```

### Convert2Lambda
Anonymous new BiFunction() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/ToFlowablePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(array);

        final BiFunction<Integer, Integer, Integer> second = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/ToFlowablePerf.java`
#### Snippet
```java
        flowable = source.reduce(second);

        flowableInner = source.concatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/ToFlowablePerf.java`
#### Snippet
```java
        observable = sourceObs.reduce(second).toObservable();

        observableInner = sourceObs.concatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenRangePerf.java`
#### Snippet
```java
        final Iterable<Integer> list = Arrays.asList(1, 2);

        flowable = Flowable.fromArray(array).flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlattenRangePerf.java`
#### Snippet
```java
        });

        observable = Observable.fromArray(array).flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/CallableAsyncPerf.java`
#### Snippet
```java
        Scheduler s2 = new SingleScheduler();

        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
    public void setup() {

        flowable = Flowable.range(1, 1000 * 1000).takeUntil(Flowable.fromCallable(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        }).subscribeOn(Schedulers.single()));

        observable = Observable.range(1, 1000 * 1000).takeUntil(Observable.fromCallable(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Action() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        final CountDownLatch cdl = new CountDownLatch(1);

        observable.subscribe(this, Functions.emptyConsumer(), new Action() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Action() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        final CountDownLatch cdl = new CountDownLatch(1);

        flowable.subscribe(this, Functions.emptyConsumer(), new Action() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        // --------------------------------------------------------------------------

        singleFlatMapPublisher = Single.just(1).flatMapPublisher(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        singleFlatMapHidePublisher = Single.just(1).flatMapPublisher(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        singleFlattenAsPublisher = Single.just(1).flattenAsFlowable(new Function<Integer, Iterable<? extends Integer>>() {
            @Override
            public Iterable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlatMapPublisher = Maybe.just(1).flatMapPublisher(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlatMapHidePublisher = Maybe.just(1).flatMapPublisher(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlattenAsPublisher = Maybe.just(1).flattenAsFlowable(new Function<Integer, Iterable<? extends Integer>>() {
            @Override
            public Iterable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        // --------------------------------------------------------------------------

        singleFlatMapObservable = Single.just(1).flatMapObservable(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        singleFlatMapHideObservable = Single.just(1).flatMapObservable(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        singleFlattenAsObservable = Single.just(1).flattenAsObservable(new Function<Integer, Iterable<? extends Integer>>() {
            @Override
            public Iterable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlatMapObservable = Maybe.just(1).flatMapObservable(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlatMapHideObservable = Maybe.just(1).flatMapObservable(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
        nbpRange = Observable.range(1, times);

        bpRangeMapJust = bpRange.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
            }
        });
        nbpRangeMapJust = nbpRange.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
        });

        bpRangeMapRange = bpRange.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java
            }
        });
        nbpRangeMapRange = nbpRange.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/EachTypeFlatMapPerf.java`
#### Snippet
```java

        singleJust = Single.just(1);
        singleJustMapJust = singleJust.flatMap(new Function<Integer, Single<Integer>>() {
            @Override
            public Single<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlattenAsObservable = Maybe.just(1).flattenAsObservable(new Function<Integer, Iterable<? extends Integer>>() {
            @Override
            public Iterable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorFlatMapPerf.java`
#### Snippet
```java
    public void flatMapIntPassthruAsync(Input input) throws InterruptedException {
        PerfSubscriber latchedObserver = input.newLatchedObserver();
        input.flowable.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer i) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorFlatMapPerf.java`
#### Snippet
```java
    @Benchmark
    public void flatMapIntPassthruSync(Input input) {
        input.flowable.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/OperatorFlatMapPerf.java`
#### Snippet
```java
    @Benchmark
    public void flatMapTwoNestedSync(final Input input) {
        Flowable.range(1, 2).flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer i) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlatMapJustPerf.java`
#### Snippet
```java
        Integer[] array = new Integer[times];

        flowable = Flowable.fromArray(array).flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/FlatMapJustPerf.java`
#### Snippet
```java
        });

        observable = Observable.fromArray(array).flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        flowableConvert = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.switchMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapSinglePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        observableConvert = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.concatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        Flowable<Integer> fsource = Flowable.fromArray(values);

        flowFlatMapFlowable1 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapFlowable0 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapSingle1 = fsource.flatMapSingle(new Function<Integer, SingleSource<Integer>>() {
            @Override
            public SingleSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybe1 = fsource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybe0 = fsource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapCompletable0 = fsource.flatMapCompletable(new Function<Integer, CompletableSource>() {
            @Override
            public CompletableSource apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapIterable1 = fsource.flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapIterable0 = fsource.flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapSingle1 = fsource.flatMapSingle(new Function<Integer, SingleSource<Integer>>() {
            @Override
            public SingleSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybe1 = fsource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        observableConvert = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        observableDedicated = source.switchMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybe0 = fsource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapCompletable0 = fsource.flatMapCompletable(new Function<Integer, CompletableSource>() {
            @Override
            public CompletableSource apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        // ooooooooooooooooooooooooo

        flowFlatMapSingleAsFlow1 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybeAsFlow1 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapMaybeAsFlow0 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapCompletableAsFlow0 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapIterableAsFlow1 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        flowFlatMapIterableAsFlow0 = fsource.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        Observable<Integer> osource = Observable.fromArray(values);

        obsFlatMapObservable1 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapObservable0 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapSingle1 = osource.flatMapSingle(new Function<Integer, SingleSource<Integer>>() {
            @Override
            public SingleSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapMaybe1 = osource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapMaybe0 = osource.flatMapMaybe(new Function<Integer, MaybeSource<Integer>>() {
            @Override
            public MaybeSource<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapCompletablePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapCompletable0 = osource.flatMapCompletable(new Function<Integer, CompletableSource>() {
            @Override
            public CompletableSource apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapIterable1 = osource.flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapCompletablePerf.java`
#### Snippet
```java
        });

        observableConvert = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapIterable0 = osource.flatMapIterable(new Function<Integer, Iterable<Integer>>() {
            @Override
            public Iterable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        // ooooooooooooooooooooooooo

        obsFlatMapSingleAsObs1 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapMaybeAsObs1 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapMaybeAsObs0 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapCompletableAsObs0 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapIterableAsObs1 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/XMapYPerf.java`
#### Snippet
```java
        });

        obsFlatMapIterableAsObs0 = osource.flatMap(new Function<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapCompletablePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.concatMapCompletable(new Function<Integer, Completable>() {
            @Override
            public Completable apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.concatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapCompletablePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapCompletablePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapCompletablePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.concatMapCompletable(new Function<Integer, Completable>() {
            @Override
            public Completable apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybePerf.java`
#### Snippet
```java
        });

        observableConvert = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.concatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapCompletablePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapCompletablePerf.java`
#### Snippet
```java
        });

        observableConvert = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapCompletablePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.switchMapCompletable(new Function<Integer, Completable>() {
            @Override
            public Completable apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapSinglePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.flatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
                        return v;
                    }
                }).filter(new Predicate<Object>() {
                    @Override
                    public boolean test(Object v) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.fromCallable(new Callable<Object>() {
                    @Override
                    public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        // ---------------------------------------------------------------------------------------------------------------------

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapSinglePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapSinglePerf.java`
#### Snippet
```java
        });

        observableConvert = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapSinglePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.flatMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "just", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "empty", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "fromCallable", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "test-consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "just+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+map+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+map+filter+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+subscribeOn+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+observeOn+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+subscribeOn+observeOn+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Async", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Publish", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Replay", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Behavior", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Unicast", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Async+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Publish+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Replay+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Behavior+consumer", "Rx2Observable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        // ---------------------------------------------------------------------------------------------------------------------

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "just", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "empty", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "empty", "Rx2Flowable", 10000000);

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "fromCallable", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "test-consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "just+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+map+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+map+filter+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+subscribeOn+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+observeOn+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "range+subscribeOn+observeOn+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Async", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        concatMapToFlowableEmpty = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.concatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Publish", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Replay", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Behavior", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Unicast", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Async+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Publish+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Replay+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }, "Behavior+consumer", "Rx2Flowable");

        checkMemory(new Callable<Object>() {
            @Override
            public Object call() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
                        return v;
                    }
                }).filter(new Predicate<Object>() {
                    @Override
                    public boolean test(Object v) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Flowable.fromCallable(new Callable<Object>() {
                    @Override
                    public Object call() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                return io.reactivex.rxjava3.core.Observable.range(1, 10).map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapMaybePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.concatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        concatMapToObservableEmpty = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        observableDedicated = source.concatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        observableConvert = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        observableDedicated = source.flatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        flowableConvert = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybeEmptyPerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.flatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapSinglePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapSinglePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapSinglePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.switchMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapCompletablePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapCompletablePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapCompletablePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.switchMapCompletable(new Function<Integer, Completable>() {
            @Override
            public Completable apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.switchMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableSwitchMapMaybePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.switchMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapCompletablePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapCompletablePerf.java`
#### Snippet
```java
        });

        observableConvert = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapCompletablePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.flatMapCompletable(new Function<Integer, Completable>() {
            @Override
            public Completable apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybePerf.java`
#### Snippet
```java
        });

        observableConvert = source.flatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableFlatMapMaybePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.flatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapSinglePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapSinglePerf.java`
#### Snippet
```java
        });

        observableConvert = source.switchMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableSwitchMapSinglePerf.java`
#### Snippet
```java
        });

        observableDedicated = source.switchMapSingle(new Function<Integer, Single<? extends Integer>>() {
            @Override
            public Single<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapMaybePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.flatMapMaybe(new Function<Integer, Maybe<? extends Integer>>() {
            @Override
            public Maybe<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapCompletablePerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(sourceArray);

        flowablePlain = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapCompletablePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.flatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableFlatMapCompletablePerf.java`
#### Snippet
```java
        });

        flowableDedicated = source.flatMapCompletable(new Function<Integer, Completable>() {
            @Override
            public Completable apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/parallel/ParallelPerf.java`
#### Snippet
```java
        Flowable<Integer> source = Flowable.fromArray(ints);

        flatMap = source.flatMap(new Function<Integer, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(Integer v) {
```

### Convert2Lambda
Anonymous new Function, Publisher\>() can be replaced with lambda
in `src/jmh/java/io/reactivex/rxjava3/parallel/ParallelPerf.java`
#### Snippet
```java
            }
        })
        .flatMap(new Function<GroupedFlowable<Integer, Integer>, Publisher<Integer>>() {
            @Override
            public Publisher<Integer> apply(GroupedFlowable<Integer, Integer> g) {
```

## EmptyMethod
### EmptyMethod
The method is empty
in `src/main/java/io/reactivex/rxjava3/internal/observers/BasicFuseableObserver.java`
#### Snippet
```java
     * Override this to perform actions after the call to {@code actual.onSubscribe(this)} happened.
     */
    protected void afterDownstream() {
        // default no-op
    }
```

### EmptyMethod
The method is empty
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/BasicFuseableConditionalSubscriber.java`
#### Snippet
```java
     * Override this to perform actions after the call to {@code actual.onSubscribe(this)} happened.
     */
    protected void afterDownstream() {
        // default no-op
    }
```

### EmptyMethod
The method is empty
in `src/main/java/io/reactivex/rxjava3/internal/subscribers/BasicFuseableSubscriber.java`
#### Snippet
```java
     * Override this to perform actions after the call to {@code actual.onSubscribe(this)} happened.
     */
    protected void afterDownstream() {
        // default no-op
    }
```

## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `item`
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java

        array = null;
        item = null;

        Thread.sleep(100);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelCollector.java`
#### Snippet
```java

                    try {
                        value = combiner.apply(sp.first, sp.second);
                    } catch (Throwable ex) {
                        Exceptions.throwIfFatal(ex);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
                }

                n = get();
                if (emitted == n) {
                    if (compareAndSet(n, 0L)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
                        break;
                    }
                    n = get();
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
                }

                n = get();
                if (emitted == n) {
                    if (compareAndSet(n, 0L)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
                        break;
                    }
                    n = get();
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `error`
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java

        if (error == null) {
            error = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
        } else {
            if (!isBug(error)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `error`
in `src/main/java/io/reactivex/rxjava3/plugins/RxJavaPlugins.java`
#### Snippet
```java
        } else {
            if (!isBug(error)) {
                error = new UndeliverableException(error);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `src/main/java/io/reactivex/rxjava3/internal/util/OpenHashSet.java`
#### Snippet
```java
        for (;;) {
            last = pos;
            pos = (pos + 1) & m;
            for (;;) {
                curr = a[pos];
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `src/main/java/io/reactivex/rxjava3/internal/util/OpenHashSet.java`
#### Snippet
```java
                }

                pos = (pos + 1) & m;
            }
            a[last] = curr;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
            }

            n = state.get();

            if (n == e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/util/QueueDrainHelper.java`
#### Snippet
```java
            if (n == e) {

                n = state.addAndGet(-(e & REQUESTED_MASK));

                if ((n & REQUESTED_MASK) == 0L) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeDoOnEvent.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeDoOnTerminate.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeUsing.java`
#### Snippet
```java
                    } catch (Throwable ex) {
                        Exceptions.throwIfFatal(ex);
                        e = new CompositeException(e, ex);
                    }
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeCreate.java`
#### Snippet
```java
        public boolean tryOnError(Throwable t) {
            if (t == null) {
                t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (get() != DisposableHelper.DISPOSED) {
```

### AssignmentToMethodParameter
Assignment to method parameter `observer`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
        try {

            observer = RxJavaPlugins.onSubscribe(this, observer);

            Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybePeek.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleUsing.java`
#### Snippet
```java
                    } catch (Throwable ex) {
                        Exceptions.throwIfFatal(ex);
                        e = new CompositeException(e, ex);
                    }
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoOnTerminate.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleCreate.java`
#### Snippet
```java
        public boolean tryOnError(Throwable t) {
            if (t == null) {
                t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (get() != DisposableHelper.DISPOSED) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoOnError.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }
            downstream.onError(e);
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleDoOnEvent.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }
            downstream.onError(e);
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    index = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
                if (e == r) {
                    index = i;
                    r = addAndGet(-e);
                    if (r == 0L) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    index = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
                if (e == r) {
                    index = i;
                    r = addAndGet(-e);
                    if (r == 0) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromIterable.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    r = addAndGet(-e);
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromIterable.java`
#### Snippet
```java
                r = get();
                if (e == r) {
                    r = addAndGet(-e);
                    if (r == 0L) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromIterable.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    r = addAndGet(-e);
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromIterable.java`
#### Snippet
```java
                r = get();
                if (e == r) {
                    r = addAndGet(-e);
                    if (r == 0L) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
           }
           if (t == null) {
               t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
           }
           if (errors.tryAddThrowable(t)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
        public final void onError(Throwable e) {
            if (e == null) {
                e = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (!signalError(e)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
        public final boolean tryOnError(Throwable e) {
            if (e == null) {
                e = ExceptionHelper.createNullPointerException("tryOnError called with a null Throwable.");
            }
            return signalError(e);
```

### AssignmentToMethodParameter
Assignment to method parameter `observer`
in `src/main/java/io/reactivex/rxjava3/core/Single.java`
#### Snippet
```java
        Objects.requireNonNull(observer, "observer is null");

        observer = RxJavaPlugins.onSubscribe(this, observer);

        Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
```

### AssignmentToMethodParameter
Assignment to method parameter `observer`
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
        Objects.requireNonNull(observer, "observer is null");

        observer = RxJavaPlugins.onSubscribe(this, observer);

        Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
```

### AssignmentToMethodParameter
Assignment to method parameter `window`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowTimed.java`
#### Snippet
```java
            if (window != null) {
                window.onComplete();
                window = null;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `window`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindowTimed.java`
#### Snippet
```java

                    windowCount.getAndIncrement();
                    window = UnicastProcessor.create(bufferSize, this);
                    this.window = window;

```

### AssignmentToMethodParameter
Assignment to method parameter `emitted`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
            // so that other groups can proceed
            while (queue.poll() != null) {
                emitted++;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `emitted`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
        void replenishParent(long emitted, boolean polled) {
            if (polled) {
                emitted++;
            }
            if (emitted != 0L) {
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromArray.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    index = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromArray.java`
#### Snippet
```java
                if (e == r) {
                    index = i;
                    r = addAndGet(-e);
                    if (r == 0L) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromArray.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    index = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromArray.java`
#### Snippet
```java
                if (e == r) {
                    index = i;
                    r = addAndGet(-e);
                    if (r == 0L) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGenerate.java`
#### Snippet
```java
                }

                n = get();
                if (e == n) {
                    state = s;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGenerate.java`
#### Snippet
```java
                if (e == n) {
                    state = s;
                    n = addAndGet(-e);
                    if (n == 0L) {
                        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGenerate.java`
#### Snippet
```java
            } else {
                if (t == null) {
                    t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
                }
                terminate = true;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    index = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
                if (e == r) {
                    index = i;
                    r = addAndGet(-e);
                    if (r == 0L) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
                }

                r = get();
                if (e == r) {
                    index = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
                if (e == r) {
                    index = i;
                    r = addAndGet(-e);
                    if (r == 0) {
                        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFromArray.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelCollect.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super C>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFilter.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFlatMapIterable.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelPeek.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                t = new CompositeException(t, ex);
            }
            downstream.onError(t);
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelPeek.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelMap.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelDoOnNextTry.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
                Node m = new Node(null, n.index);
                m.lazySet(n.get());
                n = m;
            }
            set(n);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
            while (n > 0) {
                head = head.get();
                n--;
                size--;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFilterTry.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelRunOn.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelConcatMap.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduce.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFlatMap.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFromPublisher.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `subscribers`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelMapTry.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        subscribers = RxJavaPlugins.onSubscribe(this, subscribers);

        if (!validate(subscribers)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java

                        try {
                            value = Objects.requireNonNull(reducer.apply(sp.first, sp.second), "The reducer returned a null value");
                        } catch (Throwable ex) {
                            Exceptions.throwIfFatal(ex);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableUsing.java`
#### Snippet
```java
                    } catch (Throwable e) {
                        Exceptions.throwIfFatal(e);
                        t = new CompositeException(t, e);
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGenerate.java`
#### Snippet
```java
            } else {
                if (t == null) {
                    t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
                }
                terminate = true;
```

### AssignmentToMethodParameter
Assignment to method parameter `innerCompleted`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java

        void subscribeMore(int innerCompleted) {
            while (innerCompleted-- != 0) {
                ObservableSource<? extends U> p;
                synchronized (this) {
```

### AssignmentToMethodParameter
Assignment to method parameter `p`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                        boolean empty = false;
                        synchronized (this) {
                            p = sources.poll();
                            if (p == null) {
                                wip--;
```

### AssignmentToMethodParameter
Assignment to method parameter `window`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowTimed.java`
#### Snippet
```java
            if (window != null) {
                window.onComplete();
                window = null;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `window`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindowTimed.java`
#### Snippet
```java

                windowCount.getAndIncrement();
                window = UnicastSubject.create(bufferSize, this);
                this.window = window;

```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCreate.java`
#### Snippet
```java
        public boolean tryOnError(Throwable t) {
            if (t == null) {
                t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (!isDisposed()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCreate.java`
#### Snippet
```java
            }
            if (t == null) {
                t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (errors.tryAddThrowable(t)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDoOnEach.java`
#### Snippet
```java
            } catch (Throwable e) {
                Exceptions.throwIfFatal(e);
                t = new CompositeException(t, e);
            }
            downstream.onError(t);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableCreate.java`
#### Snippet
```java
        public boolean tryOnError(Throwable t) {
            if (t == null) {
                t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (get() != DisposableHelper.DISPOSED) {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableDoOnEvent.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableUsing.java`
#### Snippet
```java
                    } catch (Throwable ex) {
                        Exceptions.throwIfFatal(ex);
                        e = new CompositeException(e, ex);
                    }
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletablePeek.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                e = new CompositeException(e, ex);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
            while (n > 0) {
                head = head.get();
                n--;
                size--;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
                Node m = new Node(null);
                m.lazySet(n.get());
                n = m;
            }
            set(n);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/observers/SafeObserver.java`
#### Snippet
```java

        if (t == null) {
            t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java

            if (array.length < s) {
                array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
            }
            for (int i = 0; i < s; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `h`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
                }
                s++;
                h = next;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            } else {
                if (array.length < s) {
                    array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            } else {
                if (array.length < s) {
                    array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `run`
in `src/main/java/io/reactivex/rxjava3/schedulers/TestScheduler.java`
#### Snippet
```java
            }
            if (useOnScheduleHook) {
                run = RxJavaPlugins.onSchedule(run);
            }
            final TimedRunnable timedAction = new TimedRunnable(this, 0, run, counter++);
```

### AssignmentToMethodParameter
Assignment to method parameter `run`
in `src/main/java/io/reactivex/rxjava3/schedulers/TestScheduler.java`
#### Snippet
```java
            }
            if (useOnScheduleHook) {
                run = RxJavaPlugins.onSchedule(run);
            }
            final TimedRunnable timedAction = new TimedRunnable(this, time + unit.toNanos(delayTime), run, counter++);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/io/reactivex/rxjava3/subscribers/SafeSubscriber.java`
#### Snippet
```java

        if (t == null) {
            t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `h`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
                }
                s++;
                h = next;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            } else {
                if (array.length < s) {
                    array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            }
            if (array.length < s) {
                array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java

            if (array.length < s) {
                array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
            }
            for (int i = 0; i < s; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `observer`
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
        Objects.requireNonNull(observer, "observer is null");
        try {
            observer = RxJavaPlugins.onSubscribe(this, observer);

            Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
```

## SynchronizationOnLocalVariableOrMethodParameter
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapMaybe.java`
#### Snippet
```java
                } else {
                    SpscLinkedArrayQueue<R> q = getOrCreateQueue();
                    synchronized (q) {
                        q.offer(value);
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapMaybe.java`
#### Snippet
```java
            } else {
                SpscLinkedArrayQueue<R> q = getOrCreateQueue();
                synchronized (q) {
                    q.offer(value);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java
            } else {
                SimplePlainQueue<T> q = queue;
                synchronized (q) {
                    q.offer(t);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureBufferStrategy.java`
#### Snippet
```java
                    T v;

                    synchronized (dq) {
                        v = dq.poll();
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureBufferStrategy.java`
#### Snippet
```java
                    boolean empty;

                    synchronized (dq) {
                        empty = dq.isEmpty();
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `dq`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureBufferStrategy.java`
#### Snippet
```java

        void clear(Deque<T> dq) {
            synchronized (dq) {
                dq.clear();
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableOnBackpressureBufferStrategy.java`
#### Snippet
```java
            boolean callError = false;
            Deque<T> dq = deque;
            synchronized (dq) {
               if (dq.size() == bufferSize) {
                   switch (strategy) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapSingle.java`
#### Snippet
```java
                } else {
                    SpscLinkedArrayQueue<R> q = getOrCreateQueue();
                    synchronized (q) {
                        q.offer(value);
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapSingle.java`
#### Snippet
```java
            } else {
                SpscLinkedArrayQueue<R> q = getOrCreateQueue();
                synchronized (q) {
                    q.offer(value);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `output`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
        @Override
        public void replay(InnerSubscription<T> output) {
            synchronized (output) {
                if (output.emitting) {
                    output.missed = true;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `output`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
                }

                synchronized (output) {
                    if (!output.missed) {
                        output.emitting = false;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `output`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
        @Override
        public final void replay(InnerSubscription<T> output) {
            synchronized (output) {
                if (output.emitting) {
                    output.missed = true;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `output`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
                }

                synchronized (output) {
                    if (!output.missed) {
                        output.emitting = false;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCreate.java`
#### Snippet
```java
            } else {
                SimpleQueue<T> q = queue;
                synchronized (q) {
                    q.offer(t);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapSingle.java`
#### Snippet
```java
            } else {
                SpscLinkedArrayQueue<R> q = getOrCreateQueue();
                synchronized (q) {
                    q.offer(value);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `q`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapMaybe.java`
#### Snippet
```java
            } else {
                SpscLinkedArrayQueue<R> q = getOrCreateQueue();
                synchronized (q) {
                    q.offer(value);
                }
```

## ExceptionNameDoesntEndWithException
### ExceptionNameDoesntEndWithException
Exception class name `ExceptionOverview` does not end with 'Exception'
in `src/main/java/io/reactivex/rxjava3/exceptions/CompositeException.java`
#### Snippet
```java
     * contained within the CompositeException.
     */
    static final class ExceptionOverview extends RuntimeException {

        private static final long serialVersionUID = 3875212506787802066L;
```

## InstanceofCatchParameter
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFromFuture.java`
#### Snippet
```java
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                if (ex instanceof ExecutionException) {
                    ex = ex.getCause();
                }
```

## ReturnNull
### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/core/Notification.java`
#### Snippet
```java
            return (T)value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/core/Notification.java`
#### Snippet
```java
            return NotificationLite.getError(o);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableMapOptional.java`
#### Snippet
```java
                T item = qs.poll();
                if (item == null) {
                    return null;
                }
                Optional<? extends R> result = Objects.requireNonNull(mapper.apply(item), "The mapper returned a null Optional");
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableMapOptional.java`
#### Snippet
```java
                T item = qs.poll();
                if (item == null) {
                    return null;
                }
                Optional<? extends R> result = Objects.requireNonNull(mapper.apply(item), "The mapper returned a null Optional");
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsObservable.java`
#### Snippet
```java
                    if (!it.hasNext()) {
                        clear();
                        return null;
                    }
                } else {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsObservable.java`
#### Snippet
```java
                return it.next();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableMapOptional.java`
#### Snippet
```java
                T item = qd.poll();
                if (item == null) {
                    return null;
                }
                Optional<? extends R> result = Objects.requireNonNull(mapper.apply(item), "The mapper returned a null Optional");
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ParallelCollector.java`
#### Snippet
```java
                    return curr;
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableFromStream.java`
#### Snippet
```java
        public T poll() {
            if (iterator == null) {
                return null;
            }
            if (!once) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/ObservableFromStream.java`
#### Snippet
```java
                if (!iterator.hasNext()) {
                    clear();
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsFlowable.java`
#### Snippet
```java
                    if (!it.hasNext()) {
                        clear();
                        return null;
                    }
                } else {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsFlowable.java`
#### Snippet
```java
                return it.next();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
        public T poll() {
            if (iterator == null) {
                return null;
            }
            if (!once) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/FlowableFromStream.java`
#### Snippet
```java
                if (!iterator.hasNext()) {
                    clear();
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/queue/MpscLinkedQueue.java`
#### Snippet
```java
            return nextValue;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/fuseable/AbstractEmptyQueueFuseable.java`
#### Snippet
```java
    @Override
    public final T poll() throws Throwable {
        return null; // always empty
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/observers/DeferredScalarDisposable.java`
#### Snippet
```java
            return v;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFlatMapIterableFlowable.java`
#### Snippet
```java
                return v;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeEmpty.java`
#### Snippet
```java
    @Override
    public Object get() {
        return null; // nulls of ScalarCallable are considered empty sources
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
            int ci = consumerIndex;
            if (ci == length()) {
                return null;
            }
            AtomicInteger pi = producerIndex;
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
                }
                if (pi.get() == ci) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
            int ci = consumerIndex;
            if (ci == length()) {
                return null;
            }
            return get(ci);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFromRunnable.java`
#### Snippet
```java
    public T get() {
        runnable.run();
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFromAction.java`
#### Snippet
```java
    public T get() throws Throwable {
        action.run();
        return null; // considered as onComplete()
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFlatMapIterableObservable.java`
#### Snippet
```java
                return v;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapIterableObservable.java`
#### Snippet
```java
                return v;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleFlatMapIterableFlowable.java`
#### Snippet
```java
                return v;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
            Object e = queue.poll();
            if (e == null) {
                return null;
            }
            T[] a = (T[])queue.poll();
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMap.java`
#### Snippet
```java
        public U poll() throws Throwable {
            T t = qs.poll();
            return t != null ? Objects.requireNonNull(mapper.apply(t), "The mapper function returned a null value.") : null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMap.java`
#### Snippet
```java
        public U poll() throws Throwable {
            T t = qs.poll();
            return t != null ? Objects.requireNonNull(mapper.apply(t), "The mapper function returned a null value.") : null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
            long i = index;
            if (i == end) {
                return null;
            }
            index = i + 1;
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromRunnable.java`
#### Snippet
```java
    public T get() throws Throwable {
        run.run();
        return null; // considered as onComplete()
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromIterable.java`
#### Snippet
```java
        public final T poll() {
            if (iterator == null) {
                return null;
            }
            if (!once) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromIterable.java`
#### Snippet
```java
            } else {
                if (!iterator.hasNext()) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableIgnoreElements.java`
#### Snippet
```java
        @Override
        public T poll() {
            return null; // empty, always
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromAction.java`
#### Snippet
```java
    public T get() throws Throwable {
        action.run();
        return null; // considered as onComplete()
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlattenIterable.java`
#### Snippet
```java
                    T v = queue.poll();
                    if (v == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
            }
            tryReplenish();
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged.java`
#### Snippet
```java
                T v = qs.poll();
                if (v == null) {
                    return null;
                }
                K key = keySelector.apply(v);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapCompletable.java`
#### Snippet
```java
        @Override
        public T poll() {
            return null; // always empty
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged.java`
#### Snippet
```java
                T v = qs.poll();
                if (v == null) {
                    return null;
                }
                K key = keySelector.apply(v);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFromArray.java`
#### Snippet
```java
            T[] arr = array;
            if (i == arr.length) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFilter.java`
#### Snippet
```java
                T t = qs.poll();
                if (t == null) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFilter.java`
#### Snippet
```java
                T t = qs.poll();
                if (t == null) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableEmpty.java`
#### Snippet
```java
    @Override
    public Object get() {
        return null; // null scalar is interpreted as being empty
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/functions/Functions.java`
#### Snippet
```java
        @Override
        public Object get() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
            int i = index;
            if (i == end) {
                return null;
            }
            index = i + 1;
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableMap.java`
#### Snippet
```java
        public U poll() throws Throwable {
            T t = qd.poll();
            return t != null ? Objects.requireNonNull(mapper.apply(t), "The mapper function returned a null value.") : null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFromArray.java`
#### Snippet
```java
                return Objects.requireNonNull(a[i], "The array element is null");
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelReduceFull.java`
#### Snippet
```java
                    return curr;
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFromRunnable.java`
#### Snippet
```java
    public T get() throws Throwable {
        run.run();
        return null; // considered as onComplete()
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableScalarXMap.java`
#### Snippet
```java
                return value;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRangeLong.java`
#### Snippet
```java
            }
            lazySet(1);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableDistinctUntilChanged.java`
#### Snippet
```java
                T v = qd.poll();
                if (v == null) {
                    return null;
                }
                K key = keySelector.apply(v);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFromAction.java`
#### Snippet
```java
    public T get() throws Throwable {
        action.run();
        return null; // considered as onComplete()
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableEmpty.java`
#### Snippet
```java
    @Override
    public Object get() {
        return null; // null scalar is interpreted as being empty
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFromIterable.java`
#### Snippet
```java
        public T poll() {
            if (done) {
                return null;
            }
            if (checkNext) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFromIterable.java`
#### Snippet
```java
                if (!it.hasNext()) {
                    done = true;
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapCompletable.java`
#### Snippet
```java
        @Override
        public T poll() {
            return null; // always empty
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRange.java`
#### Snippet
```java
            }
            lazySet(1);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/DisposeOnCancel.java`
#### Snippet
```java
    @Override
    public Object get() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/DisposeOnCancel.java`
#### Snippet
```java
    @Override
    public Object get(long timeout, @NonNull TimeUnit unit) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/ScheduledRunnable.java`
#### Snippet
```java
        // Being Callable saves an allocation in ThreadPoolExecutor
        run();
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/disposables/EmptyDisposable.java`
#### Snippet
```java
    @Override
    public Object poll() {
        return null; // always empty
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ArrayCompositeDisposable.java`
#### Snippet
```java
            if (o == DisposableHelper.DISPOSED) {
                resource.dispose();
                return null;
            }
            if (compareAndSet(index, o, resource)) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/subscriptions/EmptySubscription.java`
#### Snippet
```java
    @Override
    public Object poll() {
        return null; // always empty
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/subscriptions/DeferredScalarSubscription.java`
#### Snippet
```java
            return v;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/subscriptions/ScalarSubscription.java`
#### Snippet
```java
            return value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/internal/subscriptions/ArrayCompositeSubscription.java`
#### Snippet
```java
                    resource.cancel();
                }
                return null;
            }
            if (compareAndSet(index, o, resource)) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
            return value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public T getValue() {
        return subscribers.get() == TERMINATED ? value : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        return subscribers.get() == TERMINATED ? error : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
            return value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/UnicastSubject.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
            return NotificationLite.getError(o);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
        Object o = value.get();
        if (NotificationLite.isComplete(o) || NotificationLite.isError(o)) {
            return null;
        }
        return NotificationLite.getValue(o);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/operators/SpscArrayQueue.java`
#### Snippet
```java
        final E e = lvElement(offset); // LoadLoad
        if (null == e) {
            return null;
        }
        soConsumerIndex(index + 1); // ordered store -> atomic and ordered for size()
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/operators/SpscLinkedArrayQueue.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        return done ? error : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            Object v = h.value;
            if (v == null) {
                return null;
            }
            if (NotificationLite.isComplete(v) || NotificationLite.isError(v)) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            long limit = scheduler.now(unit) - maxAge;
            if (h.time < limit) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            Object v = h.value;
            if (v == null) {
                return null;
            }
            if (NotificationLite.isComplete(v) || NotificationLite.isError(v)) {
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
                if (NotificationLite.isComplete(o) || NotificationLite.isError(o)) {
                    if (s == 1) {
                        return null;
                    }
                    return (T)b.get(s - 2);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
                return (T)o;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
            return NotificationLite.getError(o);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public T getValue() {
        return subscribers.get() == TERMINATED ? value : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        return subscribers.get() == TERMINATED ? error : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/UnicastProcessor.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
            return NotificationLite.getError(o);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
        Object o = value.get();
        if (NotificationLite.isComplete(o) || NotificationLite.isError(o)) {
            return null;
        }
        return NotificationLite.getValue(o);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
            return error;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            long limit = scheduler.now(unit) - maxAge;
            if (h.time < limit) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            int s = size;
            if (s == 0) {
                return null;
            }
            return buffer.get(s - 1);
```

### ReturnNull
Return of `null`
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            return b.getError();
        }
        return null;
    }

```

## ArrayEquality
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeCache.java`
#### Snippet
```java
        for (;;) {
            CacheDisposable<T>[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleCache.java`
#### Snippet
```java
        for (;;) {
            CacheDisposable<T>[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCache.java`
#### Snippet
```java
        for (;;) {
            CacheSubscription<T>[] current = subscribers.get();
            if (current == TERMINATED) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMap.java`
#### Snippet
```java
        void disposeAll() {
            InnerSubscriber<?, ?>[] a = subscribers.getAndSet(CANCELLED);
            if (a != CANCELLED) {
                for (InnerSubscriber<?, ?> inner : a) {
                    inner.dispose();
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMap.java`
#### Snippet
```java
            for (;;) {
                InnerSubscriber<?, ?>[] a = subscribers.get();
                if (a == CANCELLED) {
                    inner.dispose();
                    return false;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublishMulticast.java`
#### Snippet
```java
            for (;;) {
                MulticastSubscription<T>[] current = subscribers.get();
                if (current == TERMINATED) {
                    return false;
                }
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublishMulticast.java`
#### Snippet
```java

                        MulticastSubscription<T>[] freshArray = subs.get();
                        if (subscribersChange || freshArray != array) {
                            array = freshArray;
                            continue outer;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublish.java`
#### Snippet
```java
                // if this subscriber-to-source reached a terminal state by receiving
                // an onError or onComplete, just refuse to add the new producer
                if (c == TERMINATED) {
                    return false;
                }
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublish.java`
#### Snippet
```java
                        minDemand--;

                        if (consumers != subscribers.get()) {
                            continue outer;
                        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublish.java`
#### Snippet
```java
        @Override
        public boolean isDisposed() {
            return subscribers.get() == TERMINATED;
        }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
                // if this subscriber-to-source reached a terminal state by receiving
                // an onError or onComplete, just refuse to add the new producer
                if (c == TERMINATED) {
                    return false;
                }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableReplay.java`
#### Snippet
```java
        @Override
        public boolean isDisposed() {
            return subscribers.get() == TERMINATED;
        }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservablePublish.java`
#### Snippet
```java
            for (;;) {
                InnerDisposable<T>[] a = get();
                if (a == TERMINATED) {
                    return false;
                }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservablePublish.java`
#### Snippet
```java
        @Override
        public boolean isDisposed() {
            return get() == TERMINATED;
        }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
            for (;;) {
                InnerObserver<?, ?>[] a = observers.get();
                if (a == CANCELLED) {
                    inner.dispose();
                    return false;
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
            upstream.dispose();
            InnerObserver<?, ?>[] a = observers.getAndSet(CANCELLED);
            if (a != CANCELLED) {
                for (InnerObserver<?, ?> inner : a) {
                    inner.dispose();
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCache.java`
#### Snippet
```java
        for (;;) {
            CacheDisposable<T>[] current = observers.get();
            if (current == TERMINATED) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/completable/CompletableCache.java`
#### Snippet
```java
        for (;;) {
            InnerCompletableCache[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
    @Nullable
    public T getValue() {
        if (observers.get() == TERMINATED) {
            return value;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
        for (;;) {
            SingleDisposable<T>[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
    @Nullable
    public Throwable getThrowable() {
        if (observers.get() == TERMINATED) {
            return error;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
     */
    public boolean hasThrowable() {
        return observers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
     */
    public boolean hasValue() {
        return observers.get() == TERMINATED && value != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/SingleSubject.java`
#### Snippet
```java
    @Override
    public void onSubscribe(@NonNull Disposable d) {
        if (observers.get() == TERMINATED) {
            d.dispose();
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
    @Override
    public void onSubscribe(Disposable d) {
        if (subscribers.get() == TERMINATED) {
            d.dispose();
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
        for (;;) {
            PublishDisposable<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        if (subscribers.get() == TERMINATED) {
            return error;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasThrowable() {
        return subscribers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
    @Override
    public void onComplete() {
        if (subscribers.get() == TERMINATED) {
            return;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasComplete() {
        return subscribers.get() == TERMINATED && error == null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
    public void onError(Throwable t) {
        ExceptionHelper.nullCheck(t, "onError called with a null Throwable.");
        if (subscribers.get() == TERMINATED) {
            RxJavaPlugins.onError(t);
            return;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
        for (;;) {
            PublishDisposable<T>[] a = subscribers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/PublishSubject.java`
#### Snippet
```java
        for (;;) {
            PublishDisposable<T>[] a = subscribers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @Override
    public void onComplete() {
        if (subscribers.get() == TERMINATED) {
            return;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasThrowable() {
        return subscribers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasComplete() {
        return subscribers.get() == TERMINATED && error == null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public T getValue() {
        return subscribers.get() == TERMINATED ? value : null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasValue() {
        return subscribers.get() == TERMINATED && value != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        return subscribers.get() == TERMINATED ? error : null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    public void onError(Throwable t) {
        ExceptionHelper.nullCheck(t, "onError called with a null Throwable.");
        if (subscribers.get() == TERMINATED) {
            RxJavaPlugins.onError(t);
            return;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    @Override
    public void onSubscribe(Disposable d) {
        if (subscribers.get() == TERMINATED) {
            d.dispose();
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
        for (;;) {
            AsyncDisposable<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/AsyncSubject.java`
#### Snippet
```java
    public void onNext(T t) {
        ExceptionHelper.nullCheck(t, "onNext called with a null value.");
        if (subscribers.get() == TERMINATED) {
            return;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
    @Override
    public void onSubscribe(Disposable d) {
        if (observers.get() == TERMINATED) {
            d.dispose();
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
        for (;;) {
            MaybeDisposable<T>[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
     */
    public boolean hasThrowable() {
        return observers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
     */
    public boolean hasComplete() {
        return observers.get() == TERMINATED && value == null && error == null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
    @Nullable
    public Throwable getThrowable() {
        if (observers.get() == TERMINATED) {
            return error;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
    @Nullable
    public T getValue() {
        if (observers.get() == TERMINATED) {
            return value;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/MaybeSubject.java`
#### Snippet
```java
     */
    public boolean hasValue() {
        return observers.get() == TERMINATED && value != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
        @Override
        public boolean isDisposed() {
            return observers.get() == TERMINATED;
        }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableReplay.java`
#### Snippet
```java
                // if this subscriber-to-source reached a terminal state by receiving
                // an onError or onComplete, just refuse to add the new producer
                if (c == TERMINATED) {
                    return false;
                }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
        for (;;) {
            BehaviorDisposable<T>[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
     */
    public boolean hasComplete() {
        return observers.get() == TERMINATED && error == null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
     */
    public boolean hasThrowable() {
        return observers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
    @Nullable
    public Throwable getThrowable() {
        if (observers.get() == TERMINATED) {
            return error;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
        for (;;) {
            CompletableDisposable[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/CompletableSubject.java`
#### Snippet
```java
    @Override
    public void onSubscribe(Disposable d) {
        if (observers.get() == TERMINATED) {
            d.dispose();
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
                        MulticastSubscription<T>[] bs = subs.get();

                        if (bs == TERMINATED) {
                            q.clear();
                            return;
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
                        }

                        if (as != bs) {
                            continue outer;
                        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
                        MulticastSubscription<T>[] bs = subs.get();

                        if (bs == TERMINATED) {
                            q.clear();
                            return;
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
                        }

                        if (as != bs) {
                            continue;
                        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/MulticastProcessor.java`
#### Snippet
```java
        for (;;) {
            MulticastSubscription<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        for (;;) {
            ReplayDisposable<T>[] a = observers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        for (;;) {
            ReplayDisposable<T>[] a = observers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        for (;;) {
            ReplayDisposable<T>[] a = observers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java
        T[] a = (T[])EMPTY_ARRAY;
        T[] b = getValues(a);
        if (b == EMPTY_ARRAY) {
            return new Object[0];
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @Override
    public void onComplete() {
        if (subscribers.get() == TERMINATED) {
            return;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasThrowable() {
        return subscribers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    public void onNext(@NonNull T t) {
        ExceptionHelper.nullCheck(t, "onNext called with a null value.");
        if (subscribers.get() == TERMINATED) {
            return;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public T getValue() {
        return subscribers.get() == TERMINATED ? value : null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @Override
    public void onSubscribe(@NonNull Subscription s) {
        if (subscribers.get() == TERMINATED) {
            s.cancel();
            return;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasValue() {
        return subscribers.get() == TERMINATED && value != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    public void onError(@NonNull Throwable t) {
        ExceptionHelper.nullCheck(t, "onError called with a null Throwable.");
        if (subscribers.get() == TERMINATED) {
            RxJavaPlugins.onError(t);
            return;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
        for (;;) {
            AsyncSubscription<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        return subscribers.get() == TERMINATED ? error : null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/AsyncProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasComplete() {
        return subscribers.get() == TERMINATED && error == null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
        for (;;) {
            BehaviorSubscription<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasThrowable() {
        return subscribers.get() == TERMINATED && error != null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
    public void onError(@NonNull Throwable t) {
        ExceptionHelper.nullCheck(t, "onError called with a null Throwable.");
        if (subscribers.get() == TERMINATED) {
            RxJavaPlugins.onError(t);
            return;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public boolean hasComplete() {
        return subscribers.get() == TERMINATED && error == null;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
    @Override
    public void onComplete() {
        if (subscribers.get() == TERMINATED) {
            return;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
    @CheckReturnValue
    public Throwable getThrowable() {
        if (subscribers.get() == TERMINATED) {
            return error;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
    @Override
    public void onSubscribe(@NonNull Subscription s) {
        if (subscribers.get() == TERMINATED) {
            s.cancel();
            return;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
        for (;;) {
            PublishSubscription<T>[] a = subscribers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
        for (;;) {
            PublishSubscription<T>[] a = subscribers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
        for (;;) {
            PublishSubscription<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        T[] a = (T[])EMPTY_ARRAY;
        T[] b = getValues(a);
        if (b == EMPTY_ARRAY) {
            return new Object[0];
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        for (;;) {
            ReplaySubscription<T>[] a = subscribers.get();
            if (a == TERMINATED) {
                return false;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        for (;;) {
            ReplaySubscription<T>[] a = subscribers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
        for (;;) {
            ReplaySubscription<T>[] a = subscribers.get();
            if (a == TERMINATED || a == EMPTY) {
                return;
            }
```

## UnnecessaryLocalVariable
### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                int c = count;
                while (items < c) { }
                return 1;
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
            @Override
            public Object call() {
                int c = count;
                while (items < c) { }
                return 1;
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsObservable.java`
#### Snippet
```java
                Stream<? extends R> stream = Objects.requireNonNull(mapper.apply(t), "The mapper returned a null Stream");
                Iterator<? extends R> iterator = stream.iterator();
                AutoCloseable c = stream;

                if (!iterator.hasNext()) {
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/jdk8/MaybeFlattenStreamAsFlowable.java`
#### Snippet
```java
                Stream<? extends R> stream = Objects.requireNonNull(mapper.apply(t), "The mapper returned a null Stream");
                Iterator<? extends R> iterator = stream.iterator();
                AutoCloseable c = stream;

                if (!iterator.hasNext()) {
```

### UnnecessaryLocalVariable
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeConcatArrayDelayError.java`
#### Snippet
```java

            AtomicReference<Object> c = current;
            Subscriber<? super T> a = downstream;
            Disposable cancelled = disposables;

```

### UnnecessaryLocalVariable
Local variable `pi` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeMergeArray.java`
#### Snippet
```java
                return null;
            }
            AtomicInteger pi = producerIndex;
            for (;;) {
                T v = get(ci);
```

### UnnecessaryLocalVariable
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java

        void subscribe(Publisher<? extends T>[] sources, int n) {
            CombineLatestInnerSubscriber<T>[] a = subscribers;

            for (int i = 0; i < n; i++) {
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
        @Override
        void fastPath() {
            long f = end;
            ConditionalSubscriber<? super Long> a = downstream;

```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRangeLong.java`
#### Snippet
```java
        @Override
        void fastPath() {
            long f = end;
            Subscriber<? super Long> a = downstream;

```

### UnnecessaryLocalVariable
Local variable `capacity` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCache.java`
#### Snippet
```java
        AtomicLong requested = consumer.requested;
        Subscriber<? super T> downstream = consumer.downstream;
        int capacity = capacityHint;

        for (;;) {
```

### UnnecessaryLocalVariable
Local variable `m` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapMaybe.java`
#### Snippet
```java
                downstream.onSubscribe(this);

                int m = maxConcurrency;
                if (m == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
```

### UnnecessaryLocalVariable
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java

            int missed = 1;
            final Subscriber<? super T> a = downstream;
            final SpscLinkedArrayQueue<T> q = queue;

```

### UnnecessaryLocalVariable
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCreate.java`
#### Snippet
```java

            int missed = 1;
            final Subscriber<? super T> a = downstream;
            final AtomicReference<T> q = queue;

```

### UnnecessaryLocalVariable
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableZip.java`
#### Snippet
```java

        void subscribe(Publisher<? extends T>[] sources, int n) {
            ZipSubscriber<T, R>[] a = subscribers;
            for (int i = 0; i < n; i++) {
                if (cancelled || (!delayErrors && errors.get() != null)) {
```

### UnnecessaryLocalVariable
Local variable `q` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
            int missed = 1;

            final SpscLinkedArrayQueue<T> q = this.queue;
            Subscriber<? super T> a = this.actual.get();

```

### UnnecessaryLocalVariable
Local variable `q` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupBy.java`
#### Snippet
```java
        @Override
        public void clear() {
            SpscLinkedArrayQueue<T> q = queue;
            // queue.clear() would drop submitted items and not replenish, possibly hanging other groups
            while (q.poll() != null) {
```

### UnnecessaryLocalVariable
Local variable `m` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMapSingle.java`
#### Snippet
```java
                downstream.onSubscribe(this);

                int m = maxConcurrency;
                if (m == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFilter.java`
#### Snippet
```java
        public T poll() throws Throwable {
            QueueSubscription<T> qs = this.qs;
            Predicate<? super T> f = filter;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFilter.java`
#### Snippet
```java
        public T poll() throws Throwable {
            QueueSubscription<T> qs = this.qs;
            Predicate<? super T> f = filter;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGenerate.java`
#### Snippet
```java
            S s = state;

            final BiFunction<S, ? super Emitter<T>, S> f = generator;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
        @Override
        void fastPath() {
            int f = end;
            Subscriber<? super Integer> a = downstream;

```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRange.java`
#### Snippet
```java
        @Override
        void fastPath() {
            int f = end;
            ConditionalSubscriber<? super Integer> a = downstream;

```

### UnnecessaryLocalVariable
Local variable `lim` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelRunOn.java`
#### Snippet
```java
            SpscArrayQueue<T> q = queue;
            ConditionalSubscriber<? super T> a = downstream;
            int lim = limit;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `lim` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelRunOn.java`
#### Snippet
```java
            SpscArrayQueue<T> q = queue;
            Subscriber<? super T> a = downstream;
            int lim = limit;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `q` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupBy.java`
#### Snippet
```java
            int missed = 1;

            final SpscLinkedArrayQueue<T> q = queue;
            final boolean delayError = this.delayError;
            Observer<? super T> a = actual.get();
```

### UnnecessaryLocalVariable
Local variable `q` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSkipLastTimed.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            final SpscLinkedArrayQueue<Object> q = queue;

            long now = scheduler.now(unit);
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGenerate.java`
#### Snippet
```java
            }

            final BiFunction<S, ? super Emitter<T>, S> f = generator;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `e` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRangeLong.java`
#### Snippet
```java
            }
            Observer<? super Long> actual = this.downstream;
            long e = end;
            for (long i = index; i != e && get() == 0; i++) {
                actual.onNext(i);
```

### UnnecessaryLocalVariable
Local variable `zs` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableZip.java`
#### Snippet
```java
            int missing = 1;

            final ZipObserver<T, R>[] zs = observers;
            final Observer<? super R> a = downstream;
            final T[] os = row;
```

### UnnecessaryLocalVariable
Local variable `capacity` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCache.java`
#### Snippet
```java
        Node<T> node = consumer.node;
        Observer<? super T> downstream = consumer.downstream;
        int capacity = capacityHint;

        for (;;) {
```

### UnnecessaryLocalVariable
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlattenIterable.java`
#### Snippet
```java
            }

            Observer<? super R> a = downstream;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `n` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapSingle.java`
#### Snippet
```java
            int missed = 1;
            Observer<? super R> a = downstream;
            AtomicInteger n = active;
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

```

### UnnecessaryLocalVariable
Local variable `qr` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapSingle.java`
#### Snippet
```java
            Observer<? super R> a = downstream;
            AtomicInteger n = active;
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `e` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRange.java`
#### Snippet
```java
            }
            Observer<? super Integer> actual = this.downstream;
            long e = end;
            for (long i = index; i != e && get() == 0; i++) {
                actual.onNext((int)i);
```

### UnnecessaryLocalVariable
Local variable `n` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapMaybe.java`
#### Snippet
```java
            int missed = 1;
            Observer<? super R> a = downstream;
            AtomicInteger n = active;
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

```

### UnnecessaryLocalVariable
Local variable `qr` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMapMaybe.java`
#### Snippet
```java
            Observer<? super R> a = downstream;
            AtomicInteger n = active;
            AtomicReference<SpscLinkedArrayQueue<R>> qr = queue;

            for (;;) {
```

### UnnecessaryLocalVariable
Local variable `q` is redundant
in `src/main/java/io/reactivex/rxjava3/subjects/UnicastSubject.java`
#### Snippet
```java
        int missed = 1;

        final SpscLinkedArrayQueue<T> q = queue;
        final boolean failFast = !delayError;

```

### UnnecessaryLocalVariable
Local variable `b` is redundant
in `src/main/java/io/reactivex/rxjava3/subjects/ReplaySubject.java`
#### Snippet
```java

            int missed = 1;
            final List<Object> b = buffer;
            final Observer<? super T> a = rs.downstream;

```

### UnnecessaryLocalVariable
Local variable `q` is redundant
in `src/main/java/io/reactivex/rxjava3/processors/UnicastProcessor.java`
#### Snippet
```java
        int missed = 1;

        final SpscLinkedArrayQueue<T> q = queue;
        final boolean failFast = !delayError;
        for (;;) {
```

### UnnecessaryLocalVariable
Local variable `b` is redundant
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
                return array;
            }
            List<T> b = buffer;

            if (array.length < s) {
```

### UnnecessaryLocalVariable
Local variable `b` is redundant
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java

            int missed = 1;
            final List<T> b = buffer;
            final Subscriber<? super T> a = rs.downstream;

```

## NonFinalFieldOfException
### NonFinalFieldOfException
Non-final field `cause` of exception class
in `src/main/java/io/reactivex/rxjava3/exceptions/CompositeException.java`
#### Snippet
```java
    private final List<Throwable> exceptions;
    private final String message;
    private Throwable cause;

    /**
```

## SynchronizeOnThis
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
            boolean replenishInsteadOfDrain;

            synchronized (this) {
                Object[] os = latest;

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java

        void innerComplete(int index) {
            synchronized (this) {
                Object[] os = latest;

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
        @Override
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_VALUE : RIGHT_VALUE, o);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableJoin.java`
#### Snippet
```java
        @Override
        public void innerClose(boolean isLeft, LeftRightEndSubscriber index) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_CLOSE : RIGHT_CLOSE, index);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java

    void terminated(RefConnection rc) {
        synchronized (this) {
            if (connection == rc) {
                if (rc.timer != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java
    void cancel(RefConnection rc) {
        SequentialDisposable sd;
        synchronized (this) {
            if (connection == null || connection != rc) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java

        boolean connect = false;
        synchronized (this) {
            conn = connection;
            if (conn == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableRefCount.java`
#### Snippet
```java

    void timeout(RefConnection rc) {
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
                cancelled = true;
                subscribers.dispose();
                synchronized (this) {
                    buffers = null;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
            if (errors.tryAddThrowableOrReport(t)) {
                subscribers.dispose();
                synchronized (this) {
                    buffers = null;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
            long idx = index;
            index = idx + 1;
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
                SubscriptionHelper.cancel(upstream);
            }
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferBoundary.java`
#### Snippet
```java
        public void onComplete() {
            subscribers.dispose();
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java

            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferExactBoundary.java`
#### Snippet
```java
        public void onComplete() {
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java

        void clear() {
            synchronized (this) {
                buffers.clear();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onError(Throwable t) {
            synchronized (this) {
                buffer = null;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            }

            synchronized (this) {
                if (cancelled) {
                    return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void onComplete() {
            List<U> bs;
            synchronized (this) {
                bs = new ArrayList<>(buffers);
                buffers.clear();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        @Override
        public void dispose() {
            synchronized (this) {
                buffer = null;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            DisposableHelper.dispose(timer);
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void onNext(T t) {
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            }

            synchronized (this) {
                buffer = b;
                consumerIndex++;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                for (U b : buffers) {
                    b.add(t);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void onComplete() {
            U b;
            synchronized (this) {
                b = buffer;
                buffer = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            U current;

            synchronized (this) {
                current = buffer;
                if (current == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            U current;

            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
            @Override
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    buffers.remove(buffer);
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableBufferTimed.java`
#### Snippet
```java
        public void onError(Throwable t) {
            DisposableHelper.dispose(timer);
            synchronized (this) {
                buffer = null;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
        @Override
        public void innerClose(boolean isLeft, LeftRightEndSubscriber index) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_CLOSE : RIGHT_CLOSE, index);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableGroupJoin.java`
#### Snippet
```java
        @Override
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_VALUE : RIGHT_VALUE, o);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java

            if (maxConcurrency != Integer.MAX_VALUE) {
                synchronized (this) {
                    if (wip == maxConcurrency) {
                        sources.offer(p);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                int nSources = 0;
                if (maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        nSources = sources.size();
                    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
            while (innerCompleted-- != 0) {
                ObservableSource<? extends U> p;
                synchronized (this) {
                    p = sources.poll();
                    if (p == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                    if (tryEmitScalar(((Supplier<? extends U>)p)) && maxConcurrency != Integer.MAX_VALUE) {
                        boolean empty = false;
                        synchronized (this) {
                            p = sources.poll();
                            if (p == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
        @Override
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_VALUE : RIGHT_VALUE, o);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGroupJoin.java`
#### Snippet
```java
        @Override
        public void innerClose(boolean isLeft, LeftRightEndObserver index) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_CLOSE : RIGHT_CLOSE, index);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
        void innerComplete(int index) {
            boolean cancelOthers = false;
            synchronized (this) {
                Object[] latest = this.latest;
                if (latest == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
                boolean cancelOthers = true;
                if (delayError) {
                    synchronized (this) {
                        Object[] latest = this.latest;
                        if (latest == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java

        void clear(SpscLinkedArrayQueue<?> q) {
            synchronized (this) {
                latest = null;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java
        void innerNext(int index, T item) {
            boolean shouldDrain = false;
            synchronized (this) {
                Object[] latest = this.latest;
                if (latest == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
        public void onComplete() {
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferExactBoundary.java`
#### Snippet
```java

            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
            long idx = index;
            index = idx + 1;
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
        public void onComplete() {
            observers.dispose();
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
            if (errors.tryAddThrowableOrReport(t)) {
                observers.dispose();
                synchronized (this) {
                    buffers = null;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
                DisposableHelper.dispose(upstream);
            }
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferBoundary.java`
#### Snippet
```java
                cancelled = true;
                observers.dispose();
                synchronized (this) {
                    buffers = null;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

            U b;
            synchronized (this) {
                b = buffer;
                buffer = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                for (U b : buffers) {
                    b.add(t);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            @Override
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    buffers.remove(buffer);
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java

        void clear() {
            synchronized (this) {
                buffers.clear();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            @Override
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    buffers.remove(b);
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            U current;

            synchronized (this) {
                current = buffer;
                if (current != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onNext(T t) {
            synchronized (this) {
                U b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        public void onComplete() {
            U b;
            synchronized (this) {
                b = buffer;
                buffer = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            }

            synchronized (this) {
                if (cancelled) {
                    return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onError(Throwable t) {
            synchronized (this) {
                buffer = null;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        public void onComplete() {
            List<U> bs;
            synchronized (this) {
                bs = new ArrayList<>(buffers);
                buffers.clear();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            U current;

            synchronized (this) {
                current = buffer;
                if (current == null || producerIndex != consumerIndex) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
                upstream.dispose();
                w.dispose();
                synchronized (this) {
                    buffer = null;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        public void onNext(T t) {
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
            }

            synchronized (this) {
                buffer = b;
                consumerIndex++;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableBufferTimed.java`
#### Snippet
```java
        @Override
        public void onError(Throwable t) {
            synchronized (this) {
                buffer = null;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
        @Override
        public void innerClose(boolean isLeft, LeftRightEndObserver index) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_CLOSE : RIGHT_CLOSE, index);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableJoin.java`
#### Snippet
```java
        @Override
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                queue.offer(isLeft ? LEFT_VALUE : RIGHT_VALUE, o);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java

        boolean connect = false;
        synchronized (this) {
            conn = connection;
            if (conn == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java
    void cancel(RefConnection rc) {
        SequentialDisposable sd;
        synchronized (this) {
            if (connection == null || connection != rc) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java

    void terminated(RefConnection rc) {
        synchronized (this) {
            if (connection == rc) {
                if (rc.timer != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableRefCount.java`
#### Snippet
```java

    void timeout(RefConnection rc) {
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
            return false;
        }
        synchronized (this) {
            if (disposed) {
                return false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        }
        List<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        }
        List<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        Objects.requireNonNull(ds, "ds is null");
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    List<Disposable> set = resources;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/internal/disposables/ListCompositeDisposable.java`
#### Snippet
```java
        Objects.requireNonNull(d, "d is null");
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    List<Disposable> set = resources;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        boolean cancel;
        if (!done) {
            synchronized (this) {
                if (done) {
                    cancel = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        for (;;) {
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
        }
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/SerializedSubject.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
            }
            Object o;
            synchronized (this) {
                if (cancelled) {
                    return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
            }
            if (!fastPath) {
                synchronized (this) {
                    if (cancelled) {
                        return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subjects/BehaviorSubject.java`
#### Snippet
```java
                }
                AppendOnlyLinkedArrayList<Object> q;
                synchronized (this) {
                    q = queue;
                    if (q == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
        }
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
        for (;;) {
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/observers/SerializedObserver.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        for (;;) {
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        }
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/SerializedProcessor.java`
#### Snippet
```java
        boolean cancel;
        if (!done) {
            synchronized (this) {
                if (done) {
                    cancel = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
            }
            if (!fastPath) {
                synchronized (this) {
                    if (cancelled) {
                        return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
            }
            Object o;
            synchronized (this) {
                if (cancelled) {
                    return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/processors/BehaviorProcessor.java`
#### Snippet
```java
                }
                AppendOnlyLinkedArrayList<Object> q;
                synchronized (this) {
                    q = queue;
                    if (q == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
        for (;;) {
            AppendOnlyLinkedArrayList<Object> q;
            synchronized (this) {
                q = queue;
                if (q == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (done) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/subscribers/SerializedSubscriber.java`
#### Snippet
```java
        }
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        }
        OpenHashSet<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            return 0;
        }
        synchronized (this) {
            if (disposed) {
                return 0;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        Objects.requireNonNull(disposables, "disposables is null");
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    OpenHashSet<Disposable> set = resources;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        Objects.requireNonNull(disposable, "disposable is null");
        if (!disposed) {
            synchronized (this) {
                if (!disposed) {
                    OpenHashSet<Disposable> set = resources;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
        }
        OpenHashSet<Disposable> set;
        synchronized (this) {
            if (disposed) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/reactivex/rxjava3/disposables/CompositeDisposable.java`
#### Snippet
```java
            return false;
        }
        synchronized (this) {
            if (disposed) {
                return false;
```

## BusyWait
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/io/reactivex/rxjava3/observers/BaseTestConsumer.java`
#### Snippet
```java

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
```

## ArrayHashCode
### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        System.out.printf("           %.3f  0.000 MB%n", use);

        if (array.hashCode() == 1) {
            System.out.print("");
        }
```

## UnusedAssignment
### UnusedAssignment
The value `null` assigned to `array` is never used
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
        }

        array = null;
        item = null;

```

### UnusedAssignment
The value `null` assigned to `item` is never used
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java

        array = null;
        item = null;

        Thread.sleep(100);
```

### UnusedAssignment
The value `OTHER_STATE_CONSUMED_OR_EMPTY` assigned to `os` is never used
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMergeWithMaybe.java`
#### Snippet
```java
                        singleItem = null;
                        otherState = OTHER_STATE_CONSUMED_OR_EMPTY;
                        os = OTHER_STATE_CONSUMED_OR_EMPTY;
                        actual.onNext(v);

```

### UnusedAssignment
Variable `o` initializer `null` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlatMap.java`
#### Snippet
```java
                if (svq != null) {
                    long scalarEmission = 0;
                    U o = null;
                    while (r != 0L) {
                        o = svq.poll();
```

### UnusedAssignment
Variable `up` initializer `null` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableWindow.java`
#### Snippet
```java

                if (cancelled) {
                    UnicastProcessor<T> up = null;
                    while ((up = q.poll()) != null) {
                        up.onComplete();
```

### UnusedAssignment
The value `OTHER_STATE_CONSUMED_OR_EMPTY` assigned to `os` is never used
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableMergeWithSingle.java`
#### Snippet
```java
                        singleItem = null;
                        otherState = OTHER_STATE_CONSUMED_OR_EMPTY;
                        os = OTHER_STATE_CONSUMED_OR_EMPTY;
                        actual.onNext(v);

```

### UnusedAssignment
Variable `doConnect` initializer `false` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowablePublish.java`
#### Snippet
```java
    public void connect(Consumer<? super Disposable> connection) {
        PublishConnection<T> conn;
        boolean doConnect = false;

        for (;;) {
```

### UnusedAssignment
Variable `doConnect` initializer `false` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservablePublish.java`
#### Snippet
```java
    @Override
    public void connect(Consumer<? super Disposable> connection) {
        boolean doConnect = false;
        PublishConnection<T> conn;

```

### UnusedAssignment
The value `0` assigned to `innerCompleted` is never used
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                    if (maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(innerCompleted);
                        innerCompleted = 0;
                    }
                    continue;
```

### UnusedAssignment
The value `0` assigned to `innerCompleted` is never used
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlatMap.java`
#### Snippet
```java
                    if (maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(innerCompleted);
                        innerCompleted = 0;
                    }
                    continue;
```

### UnusedAssignment
Variable `cancelOthers` initializer `false` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableCombineLatest.java`
#### Snippet
```java

        void innerComplete(int index) {
            boolean cancelOthers = false;
            synchronized (this) {
                Object[] latest = this.latest;
```

### UnusedAssignment
The value `null` assigned to `w` is never used
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableWindow.java`
#### Snippet
```java
                    window = null;
                    w.onComplete();
                    w = null;
                }
            }
```

## AssignmentToCatchBlockParameter
### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/maybe/MaybeFromFuture.java`
#### Snippet
```java
                Exceptions.throwIfFatal(ex);
                if (ex instanceof ExecutionException) {
                    ex = ex.getCause();
                }
                Exceptions.throwIfFatal(ex);
```

### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/single/SingleUsing.java`
#### Snippet
```java
                } catch (Throwable exc) {
                    Exceptions.throwIfFatal(exc);
                    ex = new CompositeException(ex, exc);
                }
            }
```

### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
                        cancelAll();
                        ExceptionHelper.addThrowable(error, ex);
                        ex = ExceptionHelper.terminate(error);

                        a.onError(ex);
```

### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlattenIterable.java`
#### Snippet
```java
                        upstream.cancel();
                        ExceptionHelper.addThrowable(error, ex);
                        ex = ExceptionHelper.terminate(error);

                        current = null;
```

### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlattenIterable.java`
#### Snippet
```java
                            upstream.cancel();
                            ExceptionHelper.addThrowable(error, ex);
                            ex = ExceptionHelper.terminate(error);
                            a.onError(ex);
                            return;
```

### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlattenIterable.java`
#### Snippet
```java
                            upstream.cancel();
                            ExceptionHelper.addThrowable(error, ex);
                            ex = ExceptionHelper.terminate(error);
                            a.onError(ex);
                            return;
```

### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `ex`
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableFlattenIterable.java`
#### Snippet
```java
                            upstream.cancel();
                            ExceptionHelper.addThrowable(error, ex);
                            ex = ExceptionHelper.terminate(error);
                            a.onError(ex);
                            return;
```

