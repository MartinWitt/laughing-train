package projects.junittests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTrueEquals {

  @Test
  public void test() {
    assertTrue(Integer.valueOf("3").equals(3));
    assertTrue(Integer.valueOf("3").equals(3), "aaaa");
  }
}
