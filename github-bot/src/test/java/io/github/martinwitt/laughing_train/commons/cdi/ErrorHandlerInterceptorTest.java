package io.github.martinwitt.laughing_train.commons.cdi;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.martinwitt.laughing_train.commons.result.Result;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ErrorHandlerInterceptorTest {

  @Inject Foo foo;

  @Test
  void errorToResult() {
    var a = foo.bar();
    assertThat(a).isInstanceOf(Result.class);
  }

  @ApplicationScoped
  static class Foo {
    @ErrorHandler
    @Logged
    public Object bar() {
      throw new RuntimeException("Test");
    }
  }
}
