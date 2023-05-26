# RxDogTag 
 
# Bad smells
I found 21 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 16 | false |
| UNCHECKED_WARNING | 3 | false |
| DifferentKotlinGradleVersion | 1 | false |
| DuplicatedCode | 1 | false |
## RuleId[id=DifferentKotlinGradleVersion]
### DifferentKotlinGradleVersion
Kotlin version that is used for building with Gradle (1.3.50) is not properly supported in the IDE plugin (1.9)
in `build.gradle`
#### Snippet
```java
      classpath "com.android.tools.build:gradle:3.5.0"
      classpath "androidx.benchmark:benchmark-gradle-plugin:${deps.versions.androidBenchmark}"
      classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50"
      classpath "net.ltgt.gradle:gradle-errorprone-plugin:${deps.versions.errorPronePlugin}"
      classpath "net.ltgt.gradle:gradle-nullaway-plugin:${deps.versions.nullawayPlugin}"
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `rxdogtag/src/main/java/rxdogtag2/DogTagCompletableObserver.java`
#### Snippet
```java
    if (delegate instanceof RxDogTagErrorReceiver) {
      if (delegate instanceof RxDogTagTaggedExceptionReceiver) {
        delegate.onError(createException(config, t, e, null));
      } else if (config.guardObserverCallbacks) {
        guardedDelegateCall(e2 -> reportError(config, t, e2, "onError"), () -> delegate.onError(e));
      } else {
        delegate.onError(e);
      }
    } else {
      reportError(config, t, e, null);
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'rxdogtag2.DogTagObserver' to 'io.reactivex.rxjava3.core.Observer'
in `rxdogtag/src/jmh/java/rxdogtag2/EventHandlingPerf.java`
#### Snippet
```java
    if (useRxDogTag) {
      RxDogTag.Configuration configuration = new RxDogTag.Configuration(new RxDogTag.Builder());
      observer = new DogTagObserver(configuration, bhObserver);
    } else {
      observer = bhObserver;
```

### UNCHECKED_WARNING
Unchecked call to 'DogTagObserver(Configuration, Observer)' as a member of raw type 'rxdogtag2.DogTagObserver'
in `rxdogtag/src/jmh/java/rxdogtag2/EventHandlingPerf.java`
#### Snippet
```java
    if (useRxDogTag) {
      RxDogTag.Configuration configuration = new RxDogTag.Configuration(new RxDogTag.Builder());
      observer = new DogTagObserver(configuration, bhObserver);
    } else {
      observer = bhObserver;
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.reactivex.rxjava3.observers.TestObserver' to 'io.reactivex.rxjava3.core.Observer'
in `rxdogtag/src/jmh/java/rxdogtag2/EventHandlingPerf.java`
#### Snippet
```java
  public boolean useRxDogTag;

  Observer<Object> observer = new TestObserver();

  @Setup
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `rxdogtag/src/main/java/rxdogtag2/RxDogTagErrorReceiver.java`
#### Snippet
```java
   * @param e the exception, not null.
   */
  void onError(@NonNull Throwable e);
}

```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagObserver.java`
#### Snippet
```java

  @Override
  public void onError(Throwable e) {
    if (delegate instanceof RxDogTagErrorReceiver) {
      if (delegate instanceof RxDogTagTaggedExceptionReceiver) {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagObserver.java`
#### Snippet
```java

  @Override
  public void onSubscribe(Disposable d) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagObserver.java`
#### Snippet
```java

  @Override
  public void onNext(T t) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(e -> reportError(config, this.t, e, "onNext"), () -> delegate.onNext(t));
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagCompletableObserver.java`
#### Snippet
```java

  @Override
  public void onSubscribe(Disposable d) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagCompletableObserver.java`
#### Snippet
```java

  @Override
  public void onError(Throwable e) {
    if (delegate instanceof RxDogTagErrorReceiver) {
      if (delegate instanceof RxDogTagTaggedExceptionReceiver) {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagSingleObserver.java`
#### Snippet
```java

  @Override
  public void onSubscribe(Disposable d) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagSingleObserver.java`
#### Snippet
```java

  @Override
  public void onSuccess(T t) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagSingleObserver.java`
#### Snippet
```java

  @Override
  public void onError(Throwable e) {
    if (delegate instanceof RxDogTagErrorReceiver) {
      if (delegate instanceof RxDogTagTaggedExceptionReceiver) {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagSubscriber.java`
#### Snippet
```java

  @Override
  public void onSubscribe(Subscription s) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagMaybeObserver.java`
#### Snippet
```java

  @Override
  public void onSuccess(T t) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagMaybeObserver.java`
#### Snippet
```java

  @Override
  public void onSubscribe(Disposable d) {
    if (config.guardObserverCallbacks) {
      guardedDelegateCall(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/main/java/rxdogtag2/DogTagMaybeObserver.java`
#### Snippet
```java

  @Override
  public void onError(Throwable e) {
    if (delegate instanceof RxDogTagErrorReceiver) {
      if (delegate instanceof RxDogTagTaggedExceptionReceiver) {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/jmh/java/rxdogtag2/util/PerfObserver.java`
#### Snippet
```java

  @Override
  public void onSubscribe(Disposable d) {
    bh.consume(d);
  }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/jmh/java/rxdogtag2/util/PerfObserver.java`
#### Snippet
```java

  @Override
  public void onError(Throwable e) {
    bh.consume(e);
  }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `rxdogtag/src/jmh/java/rxdogtag2/util/PerfObserver.java`
#### Snippet
```java

  @Override
  public void onNext(Object value) {
    bh.consume(value);
  }
```

