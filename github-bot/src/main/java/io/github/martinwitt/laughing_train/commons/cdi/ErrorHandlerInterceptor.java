package io.github.martinwitt.laughing_train.commons.cdi;

import io.github.martinwitt.laughing_train.commons.result.Result;
import io.quarkus.logging.Log;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@ErrorHandler
@Interceptor
public class ErrorHandlerInterceptor {
  @AroundInvoke
  Object errorToResult(InvocationContext context) {
    try {
      return context.proceed();
    } catch (Exception e) {
      Log.error("Error in method " + context.getMethod().getName() + ": " + e.getMessage());
      return Result.error(e);
    }
  }
}
