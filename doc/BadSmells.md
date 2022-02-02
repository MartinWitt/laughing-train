## ArraysToString
`array.toString()` is not the best way to print an array. Use `Arrays.toString(array)` instead.
[https://rules.sonarsource.com/java/RSPEC-2116]

## CollectionEmptyCheck
Checking if a collection is empty should be done by `Collection.isEmpty()`.

## EmptyStringCheck
Checking if a string is empty should be done by `String#isEmpty` instead of `String.equals("")`

## ExpectedException
The expected annotation value should be removed from test methods, and replaced with JUnit 5 `assertThrows`.

## JUnit4-@Test
The JUnit 4 `@Test` annotation should be replaced with JUnit 5 `@Test` annotation.

## JUnit4-AssertThat
`AssertThat` in Junit 4 is deprecated. Use `AssertThat` in Hamcrest instead.

## JUnit4Assertion
The JUnit4 assertion should be replaced with JUnit5 Assertions.

## Junit4-@After
The JUnit 4 `@After` annotation should be replaced with JUnit 5 `@AfterEach` annotation.

## Junit4-@AfterClass
The JUnit 4 `@AfterClass` annotation should be replaced with JUnit 5 `@AfterAll` annotation.

## Junit4-@Before
The JUnit 4 `@Before` annotation should be replaced with JUnit 5 `@BeforeEach` annotation.

## Junit4-@BeforeClass
The JUnit 4 `@BeforeClass` annotation should be replaced with JUnit 5 `@BeforeAll` annotation.

## Junit4-@Ignore
The JUnit 4 `@Ignore` annotation should be replaced with JUnit 5 `@Disabled` annotation.

## LambdaInsteadOfExecutableReference
Lambda is used instead of executable reference
[https://rules.sonarsource.com/java/RSPEC-1612]

## NonStaticAccess
Static methods should be access via the class name, not the instance variable.

## Protected-In-Final-Class
A protected member is used in a final class. Final classes are not allowed to be extended.

## RedundantFieldInitialization
Primitive types have default values and setting them to the same value is redundant.

## Static inner class
Inner classes should be static if possible

## String-ValueOf-Primitive
Primitive types are converted to String using concationation with `""`.  `String.valueOf(primitive)` is the preferred way to convert a primitive to a String.

## StringBuilderDirectUse
`StringBuilder` offers a lot of methods directly and `toString` is not everytime needed

## TempoaryFolderAsParameter
`@TempDir` can be used as a method parameter removing fields from test classes

## ThreadLocalWithInitialValue
`ThreadLocal` with initialValue override shall be replaced by `ThreadLocal.withInitialValue`
[https://rules.sonarsource.com/java/RSPEC-4065]

