# Change Log
## The following bad smells are found in the code:
### String-ValueOf-Primitive
- Replaced `spoon.support.StandardEnvironment.DEFAULT_CODE_COMPLIANCE_LEVEL + ""` with`java.lang.String.valueOf(spoon.support.StandardEnvironment.DEFAULT_CODE_COMPLIANCE_LEVEL)`in `spoon.Launcher`
- Replaced `index + ""` with`java.lang.String.valueOf(index)`in `spoon.reflect.path.CtElementPathBuilder`
### Static inner class
- Added static modifier to inner class `spoon.support.gui.SpoonObjectFieldsTable$SpoonObjectTableModel`in `spoon.support.gui.SpoonObjectFieldsTable`
- Added static modifier to inner class `spoon.support.reflect.declaration.CtClassImpl$NewInstanceClassloader`in `spoon.support.reflect.declaration.CtClassImpl`
### NonStaticAccess
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.in `spoon.support.compiler.jdt.ContextBuilder`
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.in `spoon.support.compiler.jdt.ContextBuilder`
- Method `getLogger` was accessed via the instance variable `this.jdtTreeBuilder`.in `spoon.support.compiler.jdt.ContextBuilder`
- Method `handleImplicit` was accessed via the instance variable `helper`.in `spoon.support.compiler.jdt.JDTTreeBuilder`
- Method `handleImplicit` was accessed via the instance variable `jdtTreeBuilder.getHelper()`.in `spoon.support.compiler.jdt.ReferenceBuilder`
- Method `handleImplicit` was accessed via the instance variable `jdtTreeBuilder.getHelper()`.in `spoon.support.compiler.jdt.ReferenceBuilder`
