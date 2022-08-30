
public class Foo {

  public void bar(int x) {
    if (x >= 10) {
      if (x <= 10) { // can be replaced with 'x == 10'
      }
    }
  }
}
