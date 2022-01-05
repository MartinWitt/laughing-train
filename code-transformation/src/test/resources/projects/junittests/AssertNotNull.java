package projects.junittests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertNotNull {

  @Test
  public void test() {
    assertTrue(Integer.valueOf("3") != null);
    assertTrue(Integer.valueOf("3") != null, "String Test");
    assertTrue(true);
    assertTrue(Integer.valueOf("3") == null);
    assertTrue(Integer.valueOf("3") == null, "String Test");
  }
}
