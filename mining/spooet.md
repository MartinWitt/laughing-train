# spooet 
 
# Bad smells
I found 16 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| ObsoleteCollection | 2 | false |
| RedundantImplements | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ConstantValue | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new TypeName\[bounds.size()\]'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
				}
			}
			return (T) TypeVariableName.get(reference.getSimpleName(), bounds.toArray(new TypeName[bounds.size()]));
		} else if (ref.getActualTypeArguments().isEmpty()) {
			return (T) ClassName.get(ref.getActualClass());
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new TypeName\[parameters.size()\]'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
				parameters.add(getTypeName(ctTypeReference));
			}
			return (T) ParameterizedTypeName.get(ClassName.get(ref.getActualClass()), parameters.toArray(new TypeName[parameters.size()]));
		}
		throw new UnsupportedOperationException();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Modifier\[result.size()\]'
in `src/main/java/spoon/reflect/visitor/internal/ModifiersUtils.java`
#### Snippet
```java
		}

		return result.toArray(new Modifier[result.size()]);
	}

```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `CtVisitor`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
import java.util.Stack;

public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
	@Override
	public Map<Integer, Integer> getLineNumberMapping() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
	@Override
	public String printModuleInfo(CtModule ctModule) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
	@Override
	public String printPackageInfo(CtPackage ctPackage) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/spoon/reflect/visitor/internal/PackageContext.java`
#### Snippet
```java
	public String toString() {
		if (type == null) {
			return null;
		}

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/spoon/reflect/visitor/internal/CodePrinter.java`
#### Snippet
```java
		defaultJavaPrettyPrinter.scan(element);
		//	defaultJavaPrettyPrinter.getContext().currentThis.pop();
		return defaultJavaPrettyPrinter.getResult().replaceAll("\\$", "\\$\\$");
	}

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
		String result = "null";
		if (defaultExpression !=null) {
			result = defaultExpression.toString().replaceAll("\\$", "\\$\\$");
		}
		field.initializer(result);
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import spoon.reflect.visitor.DefaultJavaPrettyPrinter;`
in `src/main/java/spoon/PoetLauncher.java`
#### Snippet
```java
package spoon;

import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.JavaPoetPrettyPrinter;
import spoon.reflect.visitor.PrettyPrinter;
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/spoon/reflect/visitor/internal/PackageContext.java`
#### Snippet
```java
			javaFile.writeTo(writer);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return writer.toString();
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `bounds.isEmpty()` is always `false`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java

			if ("?".equals(reference.getSimpleName())) {
				if (bounds.isEmpty()) {
					bounds.add(TypeName.get(Object.class));
				}
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `main()` tries to override a static method of a superclass
in `src/main/java/spoon/PoetLauncher.java`
#### Snippet
```java
 */
public class PoetLauncher extends Launcher {
	public static void main(String[] args) throws Exception {
		Launcher launcher = new PoetLauncher();
		launcher.setArgs(args);
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();

	Environment env;
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();

	Environment env;
```

