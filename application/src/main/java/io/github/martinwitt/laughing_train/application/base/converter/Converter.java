package io.github.martinwitt.laughing_train.application.base.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This defines a converter interface. A converter is used to convert an object of type {@code T} to an object of type {@code R}.
 * This is mostly used to convert entities to DTOs and vice versa.
 * @param <T> the source type
 * @param <R> the target type
 */
public interface Converter<T, R> {

    /**
     * Converts the given source object to a target object.
     * @param source the source object
     * @return the target object or {@code null} if the source object is {@code null}
     */
    R convert(T content);

    default List<R> convert(Collection<T> contents) {
        return contents.stream().map(this::convert).collect(Collectors.toList());
    }
}
