# RxDogTag 
 
# Bad smells
I found 9 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 7 | false |
| RedundantFieldInitialization | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rxdogtag/src/main/java/rxdogtag2/RxDogTag.java`
#### Snippet
```java
  public static final class Builder {
    boolean guardObserverCallbacks = true;
    boolean disableAnnotations = false;
    List<ObserverHandler> observerHandlers = new ArrayList<>();
    Set<String> ignoredPackages = new LinkedHashSet<>();
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `rxdogtag/src/main/java/rxdogtag2/RxDogTag.java`
#### Snippet
```java
      }
      error = new OnErrorNotImplementedException(message, varOriginalCause);
      error.setStackTrace(new StackTraceElement[0]);
      cause = varOriginalCause;
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `rxdogtag/src/main/java/rxdogtag2/DogTagSingleObserver.java`
#### Snippet
```java
  private final SingleObserver<T> delegate;

  DogTagSingleObserver(RxDogTag.Configuration config, SingleObserver<T> delegate) {
    this.config = config;
    this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super T`
in `rxdogtag/src/main/java/rxdogtag2/DogTagObserver.java`
#### Snippet
```java
  private final Observer<T> delegate;

  DogTagObserver(RxDogTag.Configuration config, Observer<T> delegate) {
    this.config = config;
    this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super T`
in `rxdogtag/src/main/java/rxdogtag2/DogTagSubscriber.java`
#### Snippet
```java
  private final Subscriber<T> delegate;

  DogTagSubscriber(RxDogTag.Configuration config, Subscriber<T> delegate) {
    this.config = config;
    this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super T`
in `rxdogtag/src/main/java/rxdogtag2/DogTagMaybeObserver.java`
#### Snippet
```java
  private final MaybeObserver<T> delegate;

  DogTagMaybeObserver(RxDogTag.Configuration config, MaybeObserver<T> delegate) {
    this.config = config;
    this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `rxdogtag/src/main/java/rxdogtag2/RxDogTag.java`
#### Snippet
```java
   * @param runnable the runnable to execute the underlying action that may throw
   */
  static void guardedDelegateCall(NonCheckingConsumer<Throwable> errorConsumer, Runnable runnable) {
    final Thread.UncaughtExceptionHandler h = Thread.currentThread().getUncaughtExceptionHandler();
    try {
```

### BoundedWildcard
Can generalize to `? extends ObserverHandler`
in `rxdogtag/src/main/java/rxdogtag2/RxDogTag.java`
#### Snippet
```java
     * @return this builder for fluent chaining.
     */
    public Builder addObserverHandlers(Collection<ObserverHandler> handlers) {
      observerHandlers.addAll(handlers);
      return this;
```

### BoundedWildcard
Can generalize to `? super T`
in `rxdogtag/src/main/java/rxdogtag2/RxDogTag.java`
#### Snippet
```java
   * not contain such element.
   */
  private static <T> int indexOfLast(T[] array, NonCheckingPredicate<T> predicate) {
    for (int index = array.length - 1; index >= 0; --index) {
      if (predicate.test(array[index])) {
```

