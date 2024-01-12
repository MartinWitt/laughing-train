package io.github.martinwitt.laughing_train.commons.cdi;

import jakarta.interceptor.InterceptorBinding;
import java.lang.annotation.*;

/**
 * This annotation is used to mark a method as an error handled. This means that if an exception is
 * thrown in the method, it will be caught and the method will return a {@link
 * io.github.martinwitt.laughing_train.commons.result.Result} with the error.
 */
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Inherited
public @interface ErrorHandler {}
