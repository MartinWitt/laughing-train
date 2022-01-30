# Change Log
The following bad smells are refactored:
## ArraysToString
`array.toString()` is not the best way to print an array. Use `Arrays.toString(array)` instead.
- https://rules.sonarsource.com/java/RSPEC-2116
## NonStaticAccess
Static methods should be access via the class name, not the instance variable.
## Static inner class
Inner classes should be static if possible
## String-ValueOf-Primitive
Primitive types are converted to String using concationation with `""``String.valueOf(primitive)` is the preferred way to convert a primitive to a String.

## The following has changed in the code:
### String-ValueOf-Primitive
- Replaced `spoon.support.StandardEnvironment.DEFAULT_CODE_COMPLIANCE_LEVEL + ""` with `String.valueOf(java.lang.String.valueOf(spoon.support.StandardEnvironment.DEFAULT_CODE_COMPLIANCE_LEVEL))`
- Replaced `index + ""` with `String.valueOf(java.lang.String.valueOf(index))`
### Static inner class
- Added static modifier to inner class `spoon.support.gui.SpoonObjectFieldsTable$SpoonObjectTableModel`
- Added static modifier to inner class `spoon.support.reflect.declaration.CtClassImpl$NewInstanceClassloader`
### ArraysToString
- Replaced `str.toString()` with `Arrays.toString(str)`.
### NonStaticAccess
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.
- Method `handleImplicit` was accessed via the instance variable `helper`.
- Method `handleImplicit` was accessed via the instance variable `jdtTreeBuilder.getHelper()`.
- Method `handleImplicit` was accessed via the instance variable `jdtTreeBuilder.getHelper()`.
