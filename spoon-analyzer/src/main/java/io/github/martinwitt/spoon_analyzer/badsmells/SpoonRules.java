package io.github.martinwitt.spoon_analyzer.badsmells;

/** This enum contains all bad smells that can be found by the spoon analyzer. */
public enum SpoonRules {
  INDEX_OF_REPLACEABLE_BY_CONTAINS(
      "IndexOfReplaceableByContains",
      "The indexOf method returns -1 if the substring is not found. This can be replaced by the contains method."),
  ACCESS_STATIC_VIA_INSTANCE(
      "AccessStaticViaInstance",
      "Accessing static methods should be done via the class name, not via an instance."),
  ARRAY_CAN_BE_REPLACED_WITH_ENUM_VALUES(
      "ArrayCanBeReplacedWithEnumValues",
      "Instead of listing all enum values in an array, you can use the Enum.values() directly. This makes the code more readable and less error prone. There are no updates needed if there is a new enum value."),
  CHARSET_OBJECT_CAN_BE_USED(
      "CharsetObjectCanBeUsed", "The Charset object can be used instead of the String object."),
  EQUALS_HASHCODE(
      "EqualsHashcode", "This class does not override equals() and hashcode() methods together."),
  FINAL_STATIC_METHOD(
      "FinalStaticMethod",
      "A final method is a method that cannot be overridden in a subclass. As static methods are bound to the class the cant be overridden only hidden."),
  INNER_CLASS_MAY_BE_STATIC(
      "InnerClassMayBeStatic",
      "This class is an inner class and may be static. Static inner classes dont need the reference to the outer class."),
  NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS(
      "NonProtectedConstructorInAbstractClass",
      "A non-protected constructor in an abstract class is not accessible from outside the package. Adding the modifier public is not needed, as only subclasses can call the constructor."),
  PRIVATE_FINAL_METHOD(
      "PrivateFinalMethod",
      "Private method cant be overridden, so there is no reason for the final. Less modifiers are easier to read."),
  SIZE_REPLACEABLE_BY_IS_EMPTY(
      "SizeReplaceableByIsEmpty",
      "Checking if an collection is empty by comparing its size to 0 is redundant. Use isEmpty() instead."),
  IMPLICIT_ARRAY_TO_STRING(
      "ImplicitArrayToString",
      "Calling toString() on an array returns not the content but the toString from the array object itself."),
  UNNECESSARY_IMPLEMENTS(
      "UnnecessaryImplements",
      "This class has 1 or more interfaces which are already implemented."),
  UNNECESSARY_TOSTRING(
      "UnnecessaryTostring", "Calling to String on a String object is unnecessary.");

  private final String ruleID;
  private final String description;

  SpoonRules(String ruleID, String description) {
    this.ruleID = ruleID;
    this.description = description;
  }

  public String getRuleID() {
    return ruleID;
  }

  public String getDescription() {
    return description;
  }
}
