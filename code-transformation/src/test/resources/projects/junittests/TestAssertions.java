package spoon.reflect.declaration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.CtScanner;

public class TestAssertions {

  private static class ExecutableReferenceVisitor extends CtScanner {

    int referenceCounter = 0;

    @Override
    public <T> void visitCtExecutableReference(final CtExecutableReference<T> reference) {
      final CtExecutable executable = reference.getDeclaration();
      assertNull(executable);

      referenceCounter++;
    }
  }

  @Test
  public void testUnknownCalls() {
    final Launcher runLaunch = new Launcher();
    runLaunch.getEnvironment().setNoClasspath(true);
    runLaunch.addInputResource("./src/test/resources/noclasspath/UnknownCalls.java");
    runLaunch.buildModel();

    final CtPackage rootPackage = runLaunch.getFactory().Package().getRootPackage();
    final ExecutableReferenceVisitor visitor = new ExecutableReferenceVisitor();
    visitor.scan(rootPackage);
    // super constructor to Object +
    // UnknownClass constructor +
    // UnknownClass method
    assertEquals(3, visitor.referenceCounter);
  }
}
