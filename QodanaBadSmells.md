# Qodana Rules
## Non-Protected-Constructor-in-Abstract-Class
A non-protected constructor in an abstract class is not needed, because only subclasses can be instantiated

## ParameterNameDiffersFromOverriddenParameter
The parameter name differs from the overridden parameter.

## Unnecessary Return
`return` is unnecessary as the last statement in a `void` method

## Unnecessary-Interface-Modifier
An public modifier on methods is not needed, because all methods in interfaces are already public

## UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion.

