| Bad Smell | Description |
| --- | --- |
| IndexOfReplaceableByContains | The indexOf method returns -1 if the substring is not found. This can be replaced by the contains method. | 
| AccessStaticViaInstance | Accessing static methods should be done via the class name, not via an instance. | 
| ArrayCanBeReplacedWithEnumValues | Instead of listing all enum values in an array, you can use the `Enum.values() directly. This makes the code more readable and less error prone. There are no updates needed if there is a new enum value. | 
| CharsetObjectCanBeUsed | The Charset object can be used instead of the String object. | 
| EqualsHashcode | This class does not override equals() and hashcode() methods together. | 
| FinalStaticMethod | A final method is a method that cannot be overridden in a subclass. As static methods are bound to the class the cant be overridden only hidden. | 
| InnerClassMayBeStatic | This class is an inner class and may be static. Static inner classes dont need the reference to the outer class. | 
| NonProtectedConstructorInAbstractClass | A non-protected constructor in an abstract class is not accessible from outside the package. Adding the modifier public is not needed, as only subclasses can call the constructor. | 
| PrivateFinalMethod | Private method cant be overridden, so there is no reason for the final. Less modifiers are easier to read. | 
| SizeReplaceableByIsEmpty | Checking if an collection is empty by comparing its size to 0 is redundant. Use isEmpty() instead. | 
| UnnecessaryImplements | This class has 1 or more interfaces which are already implemented. | 
| UnnecessaryTostring | Calling to String on a String object is unnecessary. | 
