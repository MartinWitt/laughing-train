package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import spoon.Launcher;
import spoon.reflect.reference.CtTypeReference;

/**
 * The CommonTypes enum represents common types in Java. It is used to provide a convenient way to
 * reference common types and their corresponding Class objects. Each enum value represents a
 * specific common type, such as STRING, INTEGER, or BOOLEAN. <br>
 * Each enum value is associated with a Class object representing the corresponding common type. The
 * CommonTypes enum should be used whenever you need to refer to a common type in Java.
 */
public enum CommonTypes {
  STRING(String.class),
  INTEGER(Integer.class),
  LONG(Long.class),
  DOUBLE(Double.class),
  FLOAT(Float.class),
  BOOLEAN(Boolean.class),
  BYTE(Byte.class),
  CHARACTER(Character.class),
  SHORT(Short.class),
  VOID(Void.class),
  OBJECT(Object.class);

  private final CtTypeReference<?> clazz;

  CommonTypes(Class<?> clazz) {
    this.clazz = new Launcher().getFactory().Type().createReference(clazz);
  }

  public CtTypeReference<?> getClazz() {
    return clazz;
  }

  @Override
  public String toString() {
    return "CommonTypes{" + "clazz=" + clazz.getQualifiedName() + '}';
  }
}
