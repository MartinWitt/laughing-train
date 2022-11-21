# spooet 
 
# Bad smells
I found 16 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 4 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 3 | true |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=ObsoleteCollection] | 2 | false |
| RuleId[ruleID=RedundantImplements] | 1 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 1 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 1 | false |
| RuleId[ruleID=ConstantValue] | 1 | false |
| RuleId[ruleID=MethodOverridesStaticMethod] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Modifier\[result.size()\]'
in `src/main/java/spoon/reflect/visitor/internal/ModifiersUtils.java`
#### Snippet
```java
		}

		return result.toArray(new Modifier[result.size()]);
	}

```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
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

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `CtVisitor`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
import java.util.Stack;

public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/spoon/reflect/visitor/internal/PackageContext.java`
#### Snippet
```java
	public String toString() {
		if (type == null) {
			return null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
	@Override
	public String printPackageInfo(CtPackage ctPackage) {
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
	@Override
	public Map<Integer, Integer> getLineNumberMapping() {
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
	@Override
	public String printModuleInfo(CtModule ctModule) {
		return null;
	}

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/spoon/reflect/visitor/internal/CodePrinter.java`
#### Snippet
```java
		defaultJavaPrettyPrinter.scan(element);
		//	defaultJavaPrettyPrinter.getContext().currentThis.pop();
		return defaultJavaPrettyPrinter.getResult().replaceAll("\\$", "\\$\\$");
	}

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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
### RuleId[ruleID=UNUSED_IMPORT]
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
### RuleId[ruleID=ThrowablePrintStackTrace]
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
### RuleId[ruleID=ConstantValue]
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
### RuleId[ruleID=MethodOverridesStaticMethod]
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
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();

	Environment env;
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack<>` used
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();

	Environment env;
```

