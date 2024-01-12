package io.github.martinwitt.laughing_train.commons.cdi;

import io.quarkus.logging.Log;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.lang.reflect.Method;

@Logged
@Interceptor
public class LoggingInterceptor {

  @AroundInvoke
  Object logInvocation(InvocationContext context) throws Exception {
    Method method = context.getMethod();
    if (!method.isAnnotationPresent(Logged.class)) {
      return context.proceed();
    }
    String value = method.getAnnotation(Logged.class).value();
    if (value.isEmpty()) {
      value = "Invoking: " + method.getName();
    }
    Log.info(value);
    return context.proceed();
  }
}
