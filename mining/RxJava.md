# Bad smells
I found 1390 bad smells with 58 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalIsPresent | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| ConditionalBreakInInfiniteLoop | 99 | false |
| EmptyStatementBody | 20 | false |
| CommentedOutCode | 4 | false |
| UnnecessaryQualifierForThis | 3 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| ProtectedMemberInFinalClass | 2 | true |
| SizeReplaceableByIsEmpty | 2 | true |
| StringBufferReplaceableByString | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| ConstantConditions | 19 | false |
| NumberEquality | 23 | false |
| PublicFieldAccessedInSynchronizedContext | 260 | false |
| IgnoreResultOfCall | 2 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| SystemOutErr | 10 | false |
| ClassNameSameAsAncestorName | 1 | false |
| DefaultAnnotationParam | 46 | false |
| UnnecessarySuperQualifier | 2 | false |
| UnnecessaryFullyQualifiedName | 201 | false |
| NestedAssignment | 4 | false |
| ThrowablePrintStackTrace | 7 | false |
| SuspiciousToArrayCall | 1 | false |
| NonProtectedConstructorInAbstractClass | 13 | true |
| Anonymous2MethodRef | 62 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| Convert2Lambda | 206 | false |
| EmptyMethod | 3 | false |
| AssignmentToMethodParameter | 97 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 16 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ReturnNull | 98 | false |
| UnnecessaryLocalVariable | 41 | true |
| SynchronizeOnThis | 110 | false |
| BusyWait | 1 | false |
| ArrayHashCode | 1 | false |
| UnusedAssignment | 12 | false |
| AssignmentToCatchBlockParameter | 7 | false |
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
            long e = consumed;

            for (;;) {

                long r = requested.get();
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableSwitchMapSingle.java`
#### Snippet
```java
            AtomicReference<SwitchMapSingleObserver<R>> inner = this.inner;

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
in `src/main/java/io/reactivex/rxjava3/internal/operators/mixed/ObservableConcatMapSingle.java`
#### Snippet
```java
            AtomicThrowable errors = this.errors;

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
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableScanSeed.java`
#### Snippet
```java
            int c = consumed;

            for (;;) {

                long r = requested.get();
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableZip.java`
#### Snippet
```java
            int missed = 1;

            for (;;) {

                long r = requested.get();
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableSwitchMap.java`
#### Snippet
```java
            int missing = 1;

            for (;;) {

                if (cancelled) {
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSwitchMap.java`
#### Snippet
```java
            int missing = 1;

            for (;;) {

                if (cancelled) {
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableThrottleLatest.java`
#### Snippet
```java
            Observer<? super T> downstream = this.downstream;

            for (;;) {

                for (;;) {
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableSequenceEqual.java`
#### Snippet
```java
            final SpscLinkedArrayQueue<T> q2 = observer2.queue;

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

            if (cancelled) {
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
in `src/jmh/java/io/reactivex/rxjava3/core/TakeUntilPerf.java`
#### Snippet
```java
        });

        while (cdl.getCount() != 0) { }
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
        else if (currConsumerNode != lvProducerNode()) {
            // spin, we are no longer wait free
            while ((nextNode = currConsumerNode.lvNext()) == null) { } // NOPMD
            // got the next node...

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
in `src/main/java/io/reactivex/rxjava3/operators/SpscLinkedArrayQueue.java`
#### Snippet
```java
    @Override
    public void clear() {
        while (poll() != null || !isEmpty()) { } // NOPMD
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
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
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
## PublicFieldAccessedInSynchronizedContext
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
            DisposableHelper.dispose(timer);
            synchronized (this) {
                buffer = null;
            }
            downstream.onError(t);
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
                buffer = null;
            }
            queue.offer(b);
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
                observers.dispose();
                synchronized (this) {
                    buffers = null;
                }
                if (getAndIncrement() != 0) {
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
## IgnoreResultOfCall
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
## OptionalUsedAsFieldOrParameterType
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
in `src/main/java/io/reactivex/rxjava3/core/Maybe.java`
#### Snippet
```java
    @SchedulerSupport(SchedulerSupport.NONE)
    @NonNull
    public static <@NonNull T> Maybe<@NonNull T> fromOptional(@NonNull Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return optional.map(Maybe::just).orElseGet(Maybe::empty);
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
    public static void main(String[] args) throws Exception {

        System.out.println("Benchmark  (lib-type)   Mode  Cnt       Score       Error  Units");

        // ---------------------------------------------------------------------------------------------------------------------
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
                return io.reactivex.rxjava3.processors.ReplayProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Replay+consumer", "Rx2Flowable");
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
                return io.reactivex.rxjava3.processors.UnicastProcessor.create().subscribeWith(new MyRx2Subscriber());
            }
        }, "Unicast+consumer", "Rx2Flowable");
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
                return io.reactivex.rxjava3.core.Observable.fromCallable(new Callable<Object>() {
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
                return io.reactivex.rxjava3.processors.UnicastProcessor.create();
            }
        }, "Unicast", "Rx2Flowable");
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
                return io.reactivex.rxjava3.processors.ReplayProcessor.create();
            }
        }, "Replay", "Rx2Flowable");
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
                return io.reactivex.rxjava3.core.Observable.empty();
            }
        }, "empty", "Rx2Observable");
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
                return io.reactivex.rxjava3.core.Observable.range(1, 10).map(new Function<Integer, Object>() {
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
                return io.reactivex.rxjava3.core.Flowable.just(1).subscribeWith(new MyRx2Subscriber());
            }
        }, "just+consumer", "Rx2Flowable");
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
Qualifier `org.reactivestreams` is unnecessary and can be removed
in `src/jmh/java/io/reactivex/rxjava3/core/MemoryPerf.java`
#### Snippet
```java
    static final class MyRx2Subscriber implements FlowableSubscriber<Object> {

        org.reactivestreams.Subscription upstream;

        @Override
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
                return io.reactivex.rxjava3.core.Observable.range(1, 10);
            }
        }, "range", "Rx2Observable");
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
                return io.reactivex.rxjava3.core.Flowable.range(1, 10);
            }
        }, "range", "Rx2Flowable");
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
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * Using the overloads {@link #blockingSubscribe(Consumer, Consumer)}
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
     * <p>
     * If the {@code Flowable} emits an error, it is wrapped into an
     * {@link io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
     * and routed to the {@link RxJavaPlugins#onError(Throwable)} handler.
     * <dl>
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
     * Using the overloads {@link #blockingSubscribe(Consumer, Consumer)}
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
     * <dl>
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
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
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
     * Use {@link #fromArray(Object...)} to emit an arbitrary number of items that are known upfront.
     * <p>
     * To emit the items of an {@link Iterable} sequence (such as a {@link java.util.List}), use {@link #fromIterable(Iterable)}.
     * <dl>
     *  <dt><b>Scheduler:</b></dt>
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
     * <dt><b>Scheduler:</b></dt>
     * <dd>{@code concat} does not operate by default on a particular {@link Scheduler}.</dd>
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
     *  <dd>Backpressure is honored towards the downstream and the outer {@code Publisher} is
     *  expected to support backpressure. Violating this assumption, the operator will
     *  signal {@link io.reactivex.rxjava3.exceptions.MissingBackpressureException}.</dd>
     *  <dt><b>Scheduler:</b></dt>
     *  <dd>This method does not operate by default on a particular {@link Scheduler}.</dd>
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
in `src/main/java/io/reactivex/rxjava3/internal/schedulers/SchedulerMultiWorkerSupport.java`
#### Snippet
```java

    /**
     * Creates the given number of {@link io.reactivex.rxjava3.core.Scheduler.Worker} instances
     * that are possibly backed by distinct threads
     * and calls the specified {@code Consumer} with them.
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
        Disposable upstream;

        U buffer;

        final AtomicReference<Disposable> timer = new AtomicReference<>();
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
## Convert2Lambda
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
in `src/jmh/java/io/reactivex/rxjava3/core/BinaryFlatMapPerf.java`
#### Snippet
```java
        });

        maybeFlattenAsObservable = Maybe.just(1).flattenAsObservable(new Function<Integer, Iterable<? extends Integer>>() {
            @Override
            public Iterable<? extends Integer> apply(Integer v) {
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
    public void flatMapIntPassthruAsync(Input input) throws InterruptedException {
        PerfSubscriber latchedObserver = input.newLatchedObserver();
        input.flowable.flatMap(new Function<Integer, Publisher<Integer>>() {
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
    public void oneStreamOfNthatMergesIn1(final InputMillion input) throws InterruptedException {
        Flowable<Flowable<Integer>> os = Flowable.range(1, input.size)
                .map(new Function<Integer, Flowable<Integer>>() {
                    @Override
                    public Flowable<Integer> apply(Integer v) {
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
in `src/jmh/java/io/reactivex/rxjava3/xmapz/FlowableConcatMapSinglePerf.java`
#### Snippet
```java
        });

        flowableConvert = source.concatMap(new Function<Integer, Publisher<? extends Integer>>() {
            @Override
            public Publisher<? extends Integer> apply(Integer v) {
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
in `src/jmh/java/io/reactivex/rxjava3/xmapz/ObservableConcatMapCompletablePerf.java`
#### Snippet
```java
        Observable<Integer> source = Observable.fromArray(sourceArray);

        observablePlain = source.concatMap(new Function<Integer, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> apply(Integer v) {
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
in `src/main/java/io/reactivex/rxjava3/core/Observable.java`
#### Snippet
```java
        Objects.requireNonNull(observer, "observer is null");
        try {
            observer = RxJavaPlugins.onSubscribe(this, observer);

            Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
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
Assignment to method parameter `observer`
in `src/main/java/io/reactivex/rxjava3/core/Completable.java`
#### Snippet
```java
        try {

            observer = RxJavaPlugins.onSubscribe(this, observer);

            Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelDoOnNextTry.java`
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelMapTry.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/parallel/ParallelFromPublisher.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super T>[] subscribers) {
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
            }
            if (t == null) {
                t = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (errors.tryAddThrowable(t)) {
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
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            } else {
                if (array.length < s) {
                    array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
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

            if (array.length < s) {
                array = (T[])Array.newInstance(array.getClass().getComponentType(), s);
            }
            for (int i = 0; i < s; i++) {
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
## SynchronizationOnLocalVariableOrMethodParameter
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
            return NotificationLite.getError(o);
        }
        return null;
    }

```
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
            return get(ci);
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
in `src/main/java/io/reactivex/rxjava3/operators/SpscLinkedArrayQueue.java`
#### Snippet
```java
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
in `src/main/java/io/reactivex/rxjava3/processors/ReplayProcessor.java`
#### Snippet
```java
            return b.getError();
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
in `src/main/java/io/reactivex/rxjava3/processors/PublishProcessor.java`
#### Snippet
```java
            return error;
        }
        return null;
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
        @Override
        public void clear() {
            SpscLinkedArrayQueue<T> q = queue;
            // queue.clear() would drop submitted items and not replenish, possibly hanging other groups
            while (q.poll() != null) {
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
            ConditionalSubscriber<? super Integer> a = downstream;

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
Local variable `f` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableGenerate.java`
#### Snippet
```java
            }

            final BiFunction<S, ? super Emitter<T>, S> f = generator;

            for (;;) {
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
Local variable `a` is redundant
in `src/main/java/io/reactivex/rxjava3/internal/operators/observable/ObservableFlattenIterable.java`
#### Snippet
```java
            }

            Observer<? super R> a = downstream;

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
## SynchronizeOnThis
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
in `src/main/java/io/reactivex/rxjava3/internal/operators/flowable/FlowableCombineLatest.java`
#### Snippet
```java
            boolean replenishInsteadOfDrain;

            synchronized (this) {
                Object[] os = latest;

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

    void timeout(RefConnection rc) {
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
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
        public void onError(Throwable t) {
            DisposableHelper.dispose(timer);
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
        @Override
        public void onNext(T t) {
            synchronized (this) {
                for (U b : buffers) {
                    b.add(t);
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
        public void onComplete() {
            U b;
            synchronized (this) {
                b = buffer;
                if (b == null) {
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
                cancelled = true;
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
                DisposableHelper.dispose(upstream);
            }
            synchronized (this) {
                Map<Long, C> bufs = buffers;
                if (bufs == null) {
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
                U b = buffer;
                if (b == null) {
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

    void timeout(RefConnection rc) {
        synchronized (this) {
            if (rc.subscriberCount == 0 && rc == connection) {
                connection = null;
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
                AppendOnlyLinkedArrayList<Object> q;
                synchronized (this) {
                    q = queue;
                    if (q == null) {
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
            return false;
        }
        synchronized (this) {
            if (disposed) {
                return false;
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
        }
        OpenHashSet<Disposable> set;
        synchronized (this) {
            if (disposed) {
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
        }
        boolean reportError;
        synchronized (this) {
            if (done) {
                reportError = true;
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
            return;
        }
        synchronized (this) {
            if (done) {
                return;
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
