# spooet 
 
# Bad smells
I found 23 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 16 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| FieldMayBeFinal | 2 | false |
| UNUSED_IMPORT | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
		if (ref.isPrimitive()) {
			if ("void".equals(ref.getSimpleName())) {
				return (T) TypeName.VOID;
			}
			if ("boolean".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("boolean".equals(ref.getSimpleName())) {
				return (T) TypeName.BOOLEAN;
			}
			if ("byte".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("byte".equals(ref.getSimpleName())) {
				return (T) TypeName.BYTE;
			}
			if ("short".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("short".equals(ref.getSimpleName())) {
				return (T) TypeName.SHORT;
			}
			if ("int".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("int".equals(ref.getSimpleName())) {
				return (T) TypeName.INT;
			}
			if ("long".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("long".equals(ref.getSimpleName())) {
				return (T) TypeName.LONG;
			}
			if ("char".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("char".equals(ref.getSimpleName())) {
				return (T) TypeName.CHAR;
			}
			if ("float".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("float".equals(ref.getSimpleName())) {
				return (T) TypeName.FLOAT;
			}
			if ("double".equals(ref.getSimpleName())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
			if ("double".equals(ref.getSimpleName())) {
				return (T) TypeName.DOUBLE;
			}
		} else if (ref instanceof CtArrayTypeReference) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.ArrayTypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			}
		} else if (ref instanceof CtArrayTypeReference) {
			return (T) ArrayTypeName.of(getTypeName(((CtArrayTypeReference) ref).getComponentType()));
		} else if (ref instanceof CtTypeParameterReference) {
			List<TypeName> bounds = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.WildcardTypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
				// TODO add multiple bounds
				if (reference.isUpper()) {
					return (T) WildcardTypeName.subtypeOf(bounds.get(0));
				} else {
					return (T) WildcardTypeName.supertypeOf(bounds.get(0));
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.WildcardTypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
					return (T) WildcardTypeName.subtypeOf(bounds.get(0));
				} else {
					return (T) WildcardTypeName.supertypeOf(bounds.get(0));
				}
			}
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.TypeVariableName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
				}
			}
			return (T) TypeVariableName.get(reference.getSimpleName(), bounds.toArray(new TypeName[bounds.size()]));
		} else if (ref.getActualTypeArguments().isEmpty()) {
			return (T) ClassName.get(ref.getActualClass());
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.ClassName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
			return (T) TypeVariableName.get(reference.getSimpleName(), bounds.toArray(new TypeName[bounds.size()]));
		} else if (ref.getActualTypeArguments().isEmpty()) {
			return (T) ClassName.get(ref.getActualClass());
		} else {
			Collection<TypeName> parameters = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.squareup.javapoet.ParameterizedTypeName' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
				parameters.add(getTypeName(ctTypeReference));
			}
			return (T) ParameterizedTypeName.get(ClassName.get(ref.getActualClass()), parameters.toArray(new TypeName[parameters.size()]));
		}
		throw new UnsupportedOperationException();
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.visitor.internal.Context' to 'T'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java

	private <T extends Context> T exit() {
		return (T) contexts.pop();
	}

```

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `builder` may be 'final'
in `src/main/java/spoon/reflect/visitor/internal/TypeContext.java`
#### Snippet
```java
 */
public class TypeContext extends AbstractContext {
	private TypeSpec.Builder builder;

	public TypeContext(TypeSpec.Builder builder) {
```

### FieldMayBeFinal
Field `contexts` may be 'final'
in `src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
public class JavaPoetPrettyPrinter extends CtScanner implements CtVisitor, PrettyPrinter {

	private Stack<Context> contexts = new Stack<>();

	Environment env;
```

## RuleId[id=ConstantValue]
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

