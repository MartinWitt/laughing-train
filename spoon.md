# Change Log
## The following bad smells are found in the code:
### String-ValueOf-Primitive
- Replaced `spoon.support.StandardEnvironment.DEFAULT_CODE_COMPLIANCE_LEVEL + ""` with`java.lang.String.valueOf(spoon.support.StandardEnvironment.DEFAULT_CODE_COMPLIANCE_LEVEL)``spoon.Launcher`
- Replaced `index + ""` with`java.lang.String.valueOf(index)``spoon.reflect.path.CtElementPathBuilder`
### Static inner class
- Added static modifier to inner class `spoon.support.gui.SpoonObjectFieldsTable$SpoonObjectTableModel``spoon.support.gui.SpoonObjectFieldsTable`
- Added static modifier to inner class `spoon.support.reflect.declaration.CtClassImpl$NewInstanceClassloader``spoon.support.reflect.declaration.CtClassImpl`
### ArraysToString
- Replaced `str.toString()` with `Arrays.toString(str)`.`spoon.support.sniper.internal.ElementSourceFragment`
### NonStaticAccess
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.`spoon.support.compiler.jdt.ContextBuilder`
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.`spoon.support.compiler.jdt.ContextBuilder`
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.`spoon.support.compiler.jdt.ContextBuilder`
- Method `handleImplicit` was accessed via the instance variable `helper`.`spoon.support.compiler.jdt.JDTTreeBuilder`
- Method `handleImplicit` was accessed via the instance variable `jdtTreeBuilder.getHelper()`.`spoon.support.compiler.jdt.ReferenceBuilder`
- Method `handleImplicit` was accessed via the instance variable `jdtTreeBuilder.getHelper()`.`spoon.support.compiler.jdt.ReferenceBuilder`
