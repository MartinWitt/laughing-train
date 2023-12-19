package io.github.martinwitt.laughing_train.commons.result;

import static java.util.Objects.requireNonNull;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Error<T> implements Result<T> {

  private final Throwable throwable;

  Error(Throwable throwable) {
    this.throwable = throwable;
  }

  @SuppressWarnings("unchecked")
  private <E extends Throwable> T propagate(Throwable throwable) throws E {
    throw (E) throwable;
  }

  @Override
  public boolean isOk() {
    return false;
  }

  @Override
  public void ifOk(Consumer<? super T> consumer) {
    // Do nothing when trying to consume the value of an Error result.
  }

  @Override
  public boolean isError() {
    return true;
  }

  @Override
  public void ifError(Consumer<? super Throwable> consumer) {
    requireNonNull(consumer, "The error consumer cannot be null");
    consumer.accept(throwable);
  }

  @Override
  public Result<T> switchIfError(Function<? super Throwable, ? extends Result<T>> fallbackMethod) {
    requireNonNull(fallbackMethod, "The fallback method cannot be null");
    return fallbackMethod.apply(throwable);
  }

  @Override
  public <U> Result<U> map(Function<? super T, ? extends U> mapper) {
    return new Error<>(throwable);
  }

  @Override
  public <U> Result<U> flatMap(Function<? super T, ? extends Result<U>> mapper) {
    return new Error<>(throwable);
  }

  @Override
  public Result<T> mapError(Function<? super Throwable, ? extends Throwable> mapper) {
    requireNonNull(mapper, "The error mapper cannot be null");
    return new Error<>(mapper.apply(throwable));
  }

  @Override
  public T get() {
    return propagate(throwable);
  }

  @Override
  public T getOrElse(Supplier<? extends T> supplier) {
    requireNonNull(supplier);
    return supplier.get();
  }

  @Override
  public Throwable getError() {
    return throwable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (null == o || getClass() != o.getClass()) return false;
    Error<?> error = (Error<?>) o;
    return Objects.equals(throwable, error.throwable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(throwable);
  }

  @Override
  public String toString() {
    return "Error{" + "throwable=" + throwable + '}';
  }
}
