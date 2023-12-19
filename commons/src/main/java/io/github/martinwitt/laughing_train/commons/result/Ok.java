package io.github.martinwitt.laughing_train.commons.result;

import static java.util.Objects.requireNonNull;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Ok<T> implements Result<T> {

  private final T value;

  Ok(T value) {
    this.value = value;
  }

  @Override
  public boolean isOk() {
    return true;
  }

  @Override
  public void ifOk(Consumer<? super T> consumer) {
    requireNonNull(consumer, "The value consumer cannot be null");
    consumer.accept(value);
  }

  @Override
  public boolean isError() {
    return false;
  }

  @Override
  public void ifError(Consumer<? super Throwable> consumer) {
    // Do nothing when trying to consume the error of an Ok result.
  }

  @Override
  public Result<T> switchIfError(Function<? super Throwable, ? extends Result<T>> fallbackMethod) {
    return new Ok<>(value);
  }

  @Override
  public <U> Result<U> map(Function<? super T, ? extends U> mapper) {
    requireNonNull(mapper, "The value mapper cannot be null");
    return new Ok<>(mapper.apply(value));
  }

  @Override
  public <U> Result<U> flatMap(Function<? super T, ? extends Result<U>> mapper) {
    requireNonNull(mapper, "The value flat-mapper cannot be null");
    return mapper.apply(value);
  }

  @Override
  public Result<T> mapError(Function<? super Throwable, ? extends Throwable> mapper) {
    return new Ok<>(value);
  }

  @Override
  public T get() {
    return value;
  }

  @Override
  public T getOrElse(Supplier<? extends T> supplier) {
    return value;
  }

  @Override
  public Throwable getError() {
    throw new NoSuchElementException("Result contains a value: " + value.toString());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (null == obj || getClass() != obj.getClass()) return false;
    Ok<?> ok = (Ok<?>) obj;
    return Objects.equals(value, ok.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
