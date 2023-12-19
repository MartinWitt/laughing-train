package io.github.martinwitt.laughing_train.commons.result;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Result<T> {

  static <T> Result<T> ok(T value) {
    requireNonNull(value, "The value of a Result cannot be null");
    return new Ok<>(value);
  }

  static <T, E extends Throwable> Result<T> error(E throwable) {
    requireNonNull(throwable, "The error of a Result cannot be null");
    return new Error<>(throwable);
  }

  static <T> Result<T> of(Supplier<T> supplier) {
    requireNonNull(supplier, "The value supplier cannot be null");

    try {
      return ok(supplier.get());
    } catch (Exception error) {
      return error(error);
    }
  }

  @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
  static <T> Result<T> of(Optional<T> optional) {
    requireNonNull(optional, "The optional value cannot be null");

    return optional
        .map(Result::ok)
        .orElseGet(
            () ->
                error(new NoSuchElementException("No value present when unwrapping the optional")));
  }

  static <T> Result<T> ofNullable(T value) {
    return ofNullable(
        value, () -> new NullPointerException("The result was initialized with a null value"));
  }

  static <T> Result<T> ofNullable(T value, Supplier<? extends Throwable> errorSupplier) {
    requireNonNull(errorSupplier, "The error supplier cannot be null");

    return nonNull(value) ? ok(value) : error(errorSupplier.get());
  }

  boolean isOk();

  void ifOk(Consumer<? super T> consumer);

  boolean isError();

  void ifError(Consumer<? super Throwable> consumer);

  Result<T> switchIfError(Function<? super Throwable, ? extends Result<T>> fallbackMethod);

  <U> Result<U> map(Function<? super T, ? extends U> mapper);

  <U> Result<U> flatMap(Function<? super T, ? extends Result<U>> mapper);

  Result<T> mapError(Function<? super Throwable, ? extends Throwable> mapper);

  T get();

  T getOrElse(Supplier<? extends T> supplier);

  Throwable getError();
}
