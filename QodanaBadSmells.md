# Qodana Rules
## Method-may-be-static
Method can be static. This increases the performance of the application.

## Non-Protected-Constructor-in-Abstract-Class
A non-protected constructor in an abstract class is not needed, because only subclasses can be instantiated

## ParameterNameDiffersFromOverriddenParameter
The parameter name differs from the overridden parameter.

## Unnecessary Return
`return` is unnecessary as the last statement in a `void` method

## Unnecessary-Interface-Modifier
An public modifier on methods is not needed, because all methods in interfaces are already public

## UnnecessaryLocalVariable
A local variable is declared and in the next line returned. This can be replaced by an instant return.

## UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion.

## UnusedImport
Unused imports have no effect on the code and should be removed.

