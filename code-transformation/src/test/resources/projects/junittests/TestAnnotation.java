package projects.junittests;

import java.util.ArrayList;
import static org.junit.Assertions.assertSame;
import org.junit.Test;

public class TestAnnotation {

  @Test
  public void testAnnotation() {
    assertSame(new ArrayList<>(), 1);
  }
}
