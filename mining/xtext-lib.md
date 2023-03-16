# xtext-lib 
 
# Bad smells
I found 313 bad smells with 73 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| EmptyMethod | 54 | false |
| UnnecessaryUnboxing | 34 | false |
| UtilityClassWithoutPrivateConstructor | 27 | true |
| UnnecessaryModifier | 22 | true |
| UnnecessaryBoxing | 17 | false |
| UnnecessaryFullyQualifiedName | 16 | false |
| BoundedWildcard | 14 | false |
| UnstableTypeUsedInSignature | 13 | false |
| ReturnNull | 12 | false |
| ProtectedMemberInFinalClass | 9 | true |
| AssignmentToMethodParameter | 9 | false |
| ArrayHashCode | 9 | false |
| SizeReplaceableByIsEmpty | 8 | true |
| ComparisonOfShortAndChar | 8 | false |
| Convert2Lambda | 7 | false |
| RedundantFieldInitialization | 6 | false |
| AbstractClassNeverImplemented | 5 | false |
| SamePackageImport | 5 | false |
| StaticPseudoFunctionalStyleMethod | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| DataFlowIssue | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| MissortedModifiers | 3 | false |
| SystemOutErr | 3 | false |
| DefaultAnnotationParam | 3 | false |
| TypeParameterExtendsObject | 3 | false |
| FieldMayBeStatic | 2 | false |
| NestedAssignment | 2 | false |
| ConstantValue | 2 | false |
| CommentedOutCode | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| Java8MapApi | 1 | false |
| GroovyUnusedAssignment | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
	 * @param docComment
	 */
	public void setDocComment(String docComment);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
	 * @param visibility
	 */
	public void setVisibility(Visibility visibility);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
	 * @return the type declaring this member
	 */
	public MutableTypeDeclaration getDeclaringType();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableParameterDeclaration.java`
#### Snippet
```java
@Beta
public interface MutableParameterDeclaration extends MutableDeclaration, ParameterDeclaration {
	public MutableExecutableDeclaration getDeclaringExecutable();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableAnnotationTypeDeclaration.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if the <code>name</code> is not a valid java identifier or the <code>initializer</code> is <code>null</code>
	 */
	public MutableAnnotationTypeElementDeclaration addAnnotationTypeElement(String name,
			Procedures.Procedure1<MutableAnnotationTypeElementDeclaration> initializer);
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeParameterDeclaration.java`
#### Snippet
```java
@Beta
public interface MutableTypeParameterDeclaration extends MutableDeclaration, TypeParameterDeclaration {
	public MutableTypeParameterDeclarator getTypeParameterDeclarator();

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeParameterDeclaration.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if <code>upperBounds</code> is <code>null</code> or contains <code>null</code>
	 */
	public void setUpperBounds(Iterable<? extends TypeReference> upperBounds);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeParameterDeclaration.java`
#### Snippet
```java
	 * @exception UnsupportedOperationException always 
	 */
	public AnnotationReference addAnnotation(AnnotationReference annotationReference);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeParameterDeclaration.java`
#### Snippet
```java
	 * @exception UnsupportedOperationException always 
	 */
	public boolean removeAnnotation(AnnotationReference annotationReference);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableEnumerationValueDeclaration.java`
#### Snippet
```java
	public void setVisibility(Visibility visibility);
	
	public MutableEnumerationTypeDeclaration getDeclaringType();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableEnumerationValueDeclaration.java`
#### Snippet
```java
	 * @exception UnsupportedOperationException always
	 */
	public void setVisibility(Visibility visibility);
	
	public MutableEnumerationTypeDeclaration getDeclaringType();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableElement.java`
#### Snippet
```java
	 * @throws IllegalStateException if this element has already been removed or it was not possible to remove
	 */
	public void remove();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
	 * @param superclass the type reference to the super type. <code>null</code> resets the extended class to java.lang.Object (the default).
	 */
	public void setExtendedClass(TypeReference superclass);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if <code>superinterfaces</code> is <code>null</code> or contains <code>null</code>
	 */
	public void setImplementedInterfaces(Iterable<? extends TypeReference> superinterfaces);
	
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/EnumerationValueDeclaration.java`
#### Snippet
```java
	 * @return the enumeration type declaring this value
	 */
	public EnumerationTypeDeclaration getDeclaringType();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
	 */
	@Override
	public String toString();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public int hashCode();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public boolean equals(Object obj);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/CompilationStrategy.java`
#### Snippet
```java
	 * A strategy provided during compilation.
	 */
	public interface CompilationContext {
		
		/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeDeclaration.java`
#### Snippet
```java
	 * @exception UnsupportedOperationException always
	 */
	public void setSimpleName(String simpleName);
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeDeclaration.java`
#### Snippet
```java
	 * @throws UnsupportedOperationException always
	 */
	public void remove();
	
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableInterfaceDeclaration.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if <code>superinterfaces</code> is <code>null</code> or contains <code>null</code>
	 */
	public void setExtendedInterfaces(Iterable<? extends TypeReference> superinterfaces);
}

```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `indentationString` may be 'static'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
		private final StringBuilder builder = new StringBuilder();

		private final String indentationString = "  ";

		private final String newLineString = "\n";
```

### FieldMayBeStatic
Field `newLineString` may be 'static'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
		private final String indentationString = "  ";

		private final String newLineString = "\n";

		private int indentation = 0;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `BigIntegerExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/BigIntegerExtensions.java`
#### Snippet
```java
 * @author Jan Koehnlein - Initial contribution and API
 */
@GwtCompatible public class BigIntegerExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `FunctionExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/FunctionExtensions.java`
#### Snippet
```java
 * @see Functions
 */
@GwtCompatible public class FunctionExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `IntegerExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IntegerExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class IntegerExtensions {
	
	/**
```

### UtilityClassWithoutPrivateConstructor
Class `ListExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ListExtensions.java`
#### Snippet
```java
 * List#drop -> List
 */
@GwtCompatible public class ListExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `Exceptions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Exceptions.java`
#### Snippet
```java
 * @author Sven Efftinge - Initial contribution and API
 */
@GwtCompatible public class Exceptions {

	/*
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
 */
@GwtCompatible
public class ArrayExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayLiterals` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayLiterals.java`
#### Snippet
```java
 */
@GwtCompatible
public class ArrayLiterals {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `LongExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/LongExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class LongExtensions {
	
	/**
```

### UtilityClassWithoutPrivateConstructor
Class `ComparableExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ComparableExtensions.java`
#### Snippet
```java
 * @author Sven Efftinge - Initial contribution and API
 */
@GwtCompatible public class ComparableExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `BooleanExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/BooleanExtensions.java`
#### Snippet
```java
 * @author Sven Efftinge - Initial contribution and API
 */
@GwtCompatible public class BooleanExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `BigDecimalExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/BigDecimalExtensions.java`
#### Snippet
```java
 * @author Jan Koehnlein - Initial contribution and API
 */
@GwtCompatible public class BigDecimalExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `DoubleExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/DoubleExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class DoubleExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `CharacterExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CharacterExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class CharacterExtensions {
	// BEGIN generated code
	/**
```

### UtilityClassWithoutPrivateConstructor
Class `InputOutput` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/InputOutput.java`
#### Snippet
```java
 * @author Sven Efftinge - Initial contribution and API
 */
@GwtCompatible public class InputOutput {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `StringExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/StringExtensions.java`
#### Snippet
```java
 * @author Sven Efftinge - Initial contribution and API
 */
@GwtCompatible public class StringExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `WhitespaceMatcher` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/WhitespaceMatcher.java`
#### Snippet
```java
 */
@GwtCompatible(emulated = true)
class WhitespaceMatcher {
	public static boolean isWhitespace(char c) {
		return Character.isWhitespace(c);
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CollectionExtensions.java`
#### Snippet
```java
 * @author Sebastian Zarnekow
 */
@GwtCompatible public class CollectionExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `ProcedureExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ProcedureExtensions.java`
#### Snippet
```java
 * @see Procedures
 */
@GwtCompatible public class ProcedureExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ObjectExtensions.java`
#### Snippet
```java
 * This is an extension library for all {@link Object objects}.
 */
@GwtCompatible public class ObjectExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionLiterals` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CollectionLiterals.java`
#### Snippet
```java
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@GwtCompatible public class CollectionLiterals {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `DefaultLineDelimiter` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/DefaultLineDelimiter.java`
#### Snippet
```java
 */
@GwtCompatible(emulated = true)
class DefaultLineDelimiter {
	public static String get() {
		return System.getProperty("line.separator");
```

### UtilityClassWithoutPrivateConstructor
Class `ByteExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ByteExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class ByteExtensions {
	// BEGIN generated code
	/**
```

### UtilityClassWithoutPrivateConstructor
Class `FloatExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/FloatExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class FloatExtensions {
	// BEGIN generated code
	/**
```

### UtilityClassWithoutPrivateConstructor
Class `MapExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
 * @author Stephane Galland - Add operators on map structures.
 */
@GwtCompatible public class MapExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `ShortExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ShortExtensions.java`
#### Snippet
```java
 * @since 2.3
 */
@GwtCompatible public class ShortExtensions {
	// BEGIN generated code
	/**
```

### UtilityClassWithoutPrivateConstructor
Class `IteratorExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
 * @author Sebastian Zarnekow
 */
@GwtCompatible public class IteratorExtensions {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `IterableExtensions` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
 */
@GwtCompatible
public class IterableExtensions {

	/**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `lastIndexOf` may produce `NullPointerException`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	public String getFileExtension() {
		String lastSegment = getLastSegment();
		int idx = lastSegment.lastIndexOf('.');
		if (idx == -1) {
			return null;
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/KeyComparator.java`
#### Snippet
```java
			return c1.compareTo(c2);
		} else {
			return -c2.compareTo(c1);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` may produce `NullPointerException`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
				add(field.getName(), field.get(instance));
			} catch(IllegalAccessException e) {
				throw Exceptions.sneakyThrow(e);
			}
		}
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
	Iterable<? extends ResolvedMethod> getAllResolvedMethods();
	
//	/**
//	 * Checks whether this {@link TypeReference} refers to the same type as the other one.
//	 * @param other the type to test equivalence against
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ToStringHelper' is still used
in `org.eclipse.xtext.xbase.lib/deprecated/org/eclipse/xtext/xbase/lib/util/ToStringHelper.java`
#### Snippet
```java
	 */
	@Deprecated
	public ToStringHelper() {
	}

```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
		this.absolute = iterable.iterator().next().length() == 0;
		
		Iterable<String> withoutEmptySegments = Iterables.filter(iterable, new Predicate<String>() {

			public boolean apply(String input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	@Pure
	public static <T> Iterable<T> reject(Iterable<T> unfiltered, Function1<? super T, Boolean> predicate) {
		return Iterables.filter(unfiltered, Predicates.not(new BooleanFunctionDelegate<T>(predicate)));
	}

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	@Pure
	public static <T> Iterable<T> filterNull(Iterable<T> unfiltered) {
		return Iterables.filter(unfiltered, Predicates.notNull());
	}

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	@Inline(value="$3.$4filter($1, $2)", imported=Iterables.class)
	public static <T> Iterable<T> filter(Iterable<?> unfiltered, Class<T> type) {
		return Iterables.filter(unfiltered, type);
	}
	
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedCharacterArray(char[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedFloatArray(float[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedShortArray(short[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedIntegerArray(int[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedByteArray(byte[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedBooleanArray(boolean[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedDoubleArray(double[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedLongArray(long[] array) {
			this.array = array;
		}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		 *            object to fail with a {@link NullPointerException}.
		 */
		protected WrappedArray(T[] array) {
			this.array = array;
		}
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`pathAsString.trim().length() == 0` can be replaced with 'pathAsString.trim().isEmpty()'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
		if (pathAsString == null)
			throw new NullPointerException();
		if (pathAsString.trim().length() == 0)
			throw new IllegalArgumentException("empty path");
		pathAsString = pathAsString.replace('\\', SEGMENT_SEPARATOR ); //replace windows separators
```

### SizeReplaceableByIsEmpty
`iterable.iterator().next().length() == 0` can be replaced with 'iterable.iterator().next().isEmpty()'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
		
		// if the first element is empty it has a leading separator;
		this.absolute = iterable.iterator().next().length() == 0;
		
		Iterable<String> withoutEmptySegments = Iterables.filter(iterable, new Predicate<String>() {
```

### SizeReplaceableByIsEmpty
`input.trim().length() > 0` can be replaced with '!input.trim().isEmpty()'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java

			public boolean apply(String input) {
				return input != null && input.trim().length() > 0;
			}
		});
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/StringExtensions.java`
#### Snippet
```java
	@Pure
	public static String toFirstUpper(String s) {
		if (s == null || s.length() == 0)
			return s;
		if (Character.isUpperCase(s.charAt(0)))
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/StringExtensions.java`
#### Snippet
```java
	@Pure
	public static String toFirstLower(String s) {
		if (s == null || s.length() == 0)
			return s;
		if (Character.isLowerCase(s.charAt(0)))
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/StringExtensions.java`
#### Snippet
```java
	@Pure
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}

```

### SizeReplaceableByIsEmpty
`lineDelimiter.length() == 0` can be replaced with 'lineDelimiter.isEmpty()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 */
	public StringConcatenation(String lineDelimiter) {
		if (lineDelimiter == null || lineDelimiter.length() == 0)
			throw new IllegalArgumentException("lineDelimiter must not be null or empty");
		this.lineDelimiter = lineDelimiter;
```

### SizeReplaceableByIsEmpty
`indentation.length() == 0` can be replaced with 'indentation.isEmpty()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 */
	protected void append(Object object, String indentation, int index) {
		if (indentation.length() == 0) {
			append(object, index);
			return;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	public Path relativize(Path other) {
		if (other.isAbsolute() != isAbsolute())
			throw new IllegalArgumentException("This path and the given path are not both absolute or both relative: " + toString() + " | " + other.toString());
		if (startsWith(other)) {
			return internalRelativize(this, other);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	public Path relativize(Path other) {
		if (other.isAbsolute() != isAbsolute())
			throw new IllegalArgumentException("This path and the given path are not both absolute or both relative: " + toString() + " | " + other.toString());
		if (startsWith(other)) {
			return internalRelativize(this, other);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	public Path getParent() {
		if (!isAbsolute())
			throw new IllegalStateException("path is not absolute: " + toString());
		if (segments.isEmpty())
			return null;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends K`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Pure
	@Inline(value = "$3.union($1, $2)", imported = MapExtensions.class)
	public static <K, V> Map<K, V> operator_plus(Map<K, V> left, Map<? extends K, ? extends V> right) {
		return union(left, right);
	}
```

### BoundedWildcard
Can generalize to `? extends V`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Pure
	@Inline(value = "$3.union($1, $2)", imported = MapExtensions.class)
	public static <K, V> Map<K, V> operator_plus(Map<K, V> left, Map<? extends K, ? extends V> right) {
		return union(left, right);
	}
```

### BoundedWildcard
Can generalize to `? extends K`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Inline(value = "$3.union($1, $4.singletonMap($2.getKey(), $2.getValue()))",
			imported = { MapExtensions.class, Collections.class })
	public static <K, V> Map<K, V> operator_plus(Map<K, V> left, final Pair<? extends K, ? extends V> right) {
		return union(left, Collections.singletonMap(right.getKey(), right.getValue()));
	}
```

### BoundedWildcard
Can generalize to `? extends V`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Inline(value = "$3.union($1, $4.singletonMap($2.getKey(), $2.getValue()))",
			imported = { MapExtensions.class, Collections.class })
	public static <K, V> Map<K, V> operator_plus(Map<K, V> left, final Pair<? extends K, ? extends V> right) {
		return union(left, Collections.singletonMap(right.getKey(), right.getValue()));
	}
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 */
	@Pure
	public static <T> Iterator<T> take(final Iterator<T> iterator, final int count) {
		if (iterator == null)
			throw new NullPointerException("iterator");
```

### BoundedWildcard
Can generalize to `? extends K`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 *         iterator to that value
	 */
	public static <K, V> Map<K, V> toMap(Iterator<? extends V> values, Function1<? super V, K> computeKeys) {
		if (computeKeys == null)
			throw new NullPointerException("computeKeys");
```

### BoundedWildcard
Can generalize to `? extends V`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 *         {@code computeValues}.
	 */
	public static <K, V> Map<K, V> toInvertedMap(Iterator<? extends K> keys, Function1<? super K, V> computeValues) {
		Map<K, V> result = Maps.newLinkedHashMap();
		while(keys.hasNext()) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 *         iterator to that value
	 */
	public static <T, K, V> Map<K, V> toMap(Iterator<? extends T> inputs, Function1<? super T, K> computeKeys, Function1<? super T, V> computeValues) {
        if (computeKeys == null)
            throw new NullPointerException("computeKeys");
```

### BoundedWildcard
Can generalize to `? extends V`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 *         iterator to that value
	 */
	public static <T, K, V> Map<K, V> toMap(Iterator<? extends T> inputs, Function1<? super T, K> computeKeys, Function1<? super T, V> computeValues) {
        if (computeKeys == null)
            throw new NullPointerException("computeKeys");
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public static <T> List<T> sortWith(Iterable<T> iterable, Comparator<? super T> comparator) {
		return ListExtensions.sortInplace(Lists.newArrayList(iterable), comparator);
	}
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * @see ListExtensions#sortInplaceBy(List, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static <T, C extends Comparable<? super C>> List<T> sortBy(Iterable<T> iterable,
			final Functions.Function1<? super T, C> key) {
		return ListExtensions.sortInplaceBy(Lists.newArrayList(iterable), key);
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 */
	@Beta
	public static <T> Set<T> toSet(Iterable<T> iterable) {
		if (iterable instanceof Set<?>) {
			Set<T> result = (Set<T>) iterable;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 */
	@Beta
	public static <T> List<T> toList(Iterable<T> iterable) {
		if (iterable instanceof List<?>) {
			List<T> result = (List<T>) iterable;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * @see ListExtensions#sortInplace(List)
	 */
	public static <T extends Comparable<? super T>> List<T> sort(Iterable<T> iterable) {
		List<T> asList = Lists.newArrayList(iterable);
		if (iterable instanceof SortedSet<?>) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractInterfaceProcessor` has no concrete subclass
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
 */
@Beta
public abstract class AbstractInterfaceProcessor implements RegisterGlobalsParticipant<InterfaceDeclaration>, TransformationParticipant<MutableInterfaceDeclaration>, CodeGenerationParticipant<InterfaceDeclaration>, ValidationParticipant<InterfaceDeclaration> {

	public void doRegisterGlobals(List<? extends InterfaceDeclaration> annotatedInterfaces, @Extension RegisterGlobalsContext context) {
```

### AbstractClassNeverImplemented
Abstract class `AbstractMethodProcessor` has no concrete subclass
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
 */
@Beta
public abstract class AbstractMethodProcessor implements RegisterGlobalsParticipant<MethodDeclaration>, TransformationParticipant<MutableMethodDeclaration>, CodeGenerationParticipant<MethodDeclaration>, ValidationParticipant<MethodDeclaration> {
	
	public void doRegisterGlobals(List<? extends MethodDeclaration> annotatedMethods, RegisterGlobalsContext context) {
```

### AbstractClassNeverImplemented
Abstract class `AbstractAnnotationTypeProcessor` has no concrete subclass
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
 */
@Beta
public abstract class AbstractAnnotationTypeProcessor implements RegisterGlobalsParticipant<AnnotationTypeDeclaration>, TransformationParticipant<MutableAnnotationTypeDeclaration>, CodeGenerationParticipant<AnnotationTypeDeclaration>, ValidationParticipant<AnnotationTypeDeclaration> {

	public void doRegisterGlobals(List<? extends AnnotationTypeDeclaration> annotatedAnnotationTypes, @Extension RegisterGlobalsContext context) {
```

### AbstractClassNeverImplemented
Abstract class `AbstractConstructorProcessor` has no concrete subclass
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
 */
@Beta
public abstract class AbstractConstructorProcessor implements RegisterGlobalsParticipant<ConstructorDeclaration>, TransformationParticipant<MutableConstructorDeclaration>, CodeGenerationParticipant<ConstructorDeclaration>, ValidationParticipant<ConstructorDeclaration> {
	
	public void doRegisterGlobals(List<? extends ConstructorDeclaration> annotatedConstructors, RegisterGlobalsContext context) {
```

### AbstractClassNeverImplemented
Abstract class `AbstractEnumerationTypeProcessor` has no concrete subclass
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
 */
@Beta
public abstract class AbstractEnumerationTypeProcessor implements RegisterGlobalsParticipant<EnumerationTypeDeclaration>, TransformationParticipant<MutableEnumerationTypeDeclaration>, CodeGenerationParticipant<EnumerationTypeDeclaration>, ValidationParticipant<EnumerationTypeDeclaration> {

	public void doRegisterGlobals(List<? extends EnumerationTypeDeclaration> annotatedEnumerationTypes, @Extension RegisterGlobalsContext context) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	 */
	public static final char SEGMENT_SEPARATOR = '/';
	private final static Splitter splitter = Splitter.on(SEGMENT_SEPARATOR );
	/**
	 * the root path
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringContext.java`
#### Snippet
```java
	public final static ToStringContext INSTANCE = new ToStringContext();

	private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
		@Override
		public IdentityHashMap<Object, Boolean> initialValue() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringContext.java`
#### Snippet
```java
class ToStringContext {

	public final static ToStringContext INSTANCE = new ToStringContext();

	private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringContext.java`
#### Snippet
```java
	public final static ToStringContext INSTANCE = new ToStringContext();

	private final static ThreadLocal<IdentityHashMap<Object, Boolean>> currentlyProcessed = new ThreadLocal<IdentityHashMap<Object, Boolean>>() {
		@Override
		public IdentityHashMap<Object, Boolean> initialValue() {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
		String simpleName = obj.getClass().getSimpleName();
		int identityHashCode = System.identityHashCode(obj);
		return simpleName + "@" + Integer.valueOf(identityHashCode);
	}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			short old = array[index];
			array[index] = element.shortValue();
			return Short.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Double get(int index) {
			return Double.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Long get(int index) {
			return Long.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			int old = array[index];
			array[index] = element.intValue();
			return Integer.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			float old = array[index];
			array[index] = element.floatValue();
			return Float.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Integer get(int index) {
			return Integer.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			double old = array[index];
			array[index] = element.doubleValue();
			return Double.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Byte get(int index) {
			return Byte.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			boolean old = array[index];
			array[index] = element.booleanValue();
			return Boolean.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Boolean get(int index) {
			return Boolean.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Short get(int index) {
			return Short.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Float get(int index) {
			return Float.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			long old = array[index];
			array[index] = element.longValue();
			return Long.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			byte old = array[index];
			array[index] = element.byteValue();
			return Byte.valueOf(old);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		@Override
		public Character get(int index) {
			return Character.valueOf(array[index]);
		}

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			char old = array[index];
			array[index] = element.charValue();
			return Character.valueOf(old);
		}

```

## RuleId[id=ComparisonOfShortAndChar]
### ComparisonOfShortAndChar
Equality comparison `a == b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CharacterExtensions.java`
#### Snippet
```java
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(char a, short b) {
		return a == b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a != b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CharacterExtensions.java`
#### Snippet
```java
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(char a, short b) {
		return a != b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a == b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CharacterExtensions.java`
#### Snippet
```java
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(char a, short b) {
		return a == b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a != b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/CharacterExtensions.java`
#### Snippet
```java
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(char a, short b) {
		return a != b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a != b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ShortExtensions.java`
#### Snippet
```java
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(short a, char b) {
		return a != b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a == b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ShortExtensions.java`
#### Snippet
```java
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(short a, char b) {
		return a == b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a != b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ShortExtensions.java`
#### Snippet
```java
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(short a, char b) {
		return a != b;
	}
	
```

### ComparisonOfShortAndChar
Equality comparison `a == b` of short and char values
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ShortExtensions.java`
#### Snippet
```java
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(short a, char b) {
		return a == b;
	}
	
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/InputOutput.java`
#### Snippet
```java
	 */
	public static void println() {
		System.out.println();
	}
	/**
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/InputOutput.java`
#### Snippet
```java
	 */
	public static <T> T print(T o) {
		System.out.print(o);
		return o;
	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/InputOutput.java`
#### Snippet
```java
	 */
	public static <T> T println(T object) {
		System.out.println(object);
		return object;
	}
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/BooleanFunctionDelegate.java`
#### Snippet
```java
	public boolean apply(T input) {
		Boolean result = delegate.apply(input);
		return result.booleanValue();
	}

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Float) {
				return Floats.indexOf(array, ((Float) o).floatValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Integer) {
				return Ints.lastIndexOf(array, ((Integer) o).intValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Short) {
				return Shorts.contains(array, ((Short) o).shortValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Character) {
				return Chars.contains(array, ((Character) o).charValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Integer) {
				return Ints.contains(array, ((Integer) o).intValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Character) {
				return Chars.indexOf(array, ((Character) o).charValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			boolean old = array[index];
			array[index] = element.booleanValue();
			return Boolean.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Float) {
				return Floats.contains(array, ((Float) o).floatValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Double) {
				return Doubles.indexOf(array, ((Double) o).doubleValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Short) {
				return Shorts.indexOf(array, ((Short) o).shortValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Byte) {
				return Bytes.lastIndexOf(array, ((Byte) o).byteValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Boolean) {
				return Booleans.indexOf(array, ((Boolean) o).booleanValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Long) {
				return Longs.lastIndexOf(array, ((Long) o).longValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Boolean) {
				return Booleans.lastIndexOf(array, ((Boolean) o).booleanValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Boolean) {
				return Booleans.contains(array, ((Boolean) o).booleanValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			short old = array[index];
			array[index] = element.shortValue();
			return Short.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Byte) {
				return Bytes.contains(array, ((Byte) o).byteValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			int old = array[index];
			array[index] = element.intValue();
			return Integer.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Short) {
				return Shorts.lastIndexOf(array, ((Short) o).shortValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Float) {
				return Floats.lastIndexOf(array, ((Float) o).floatValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			float old = array[index];
			array[index] = element.floatValue();
			return Float.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Double) {
				return Doubles.contains(array, ((Double) o).doubleValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Long) {
				return Longs.indexOf(array, ((Long) o).longValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			double old = array[index];
			array[index] = element.doubleValue();
			return Double.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Integer) {
				return Ints.indexOf(array, ((Integer) o).intValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Long) {
				return Longs.contains(array, ((Long) o).longValue());
			}
			return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Byte) {
				return Bytes.indexOf(array, ((Byte) o).byteValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			long old = array[index];
			array[index] = element.longValue();
			return Long.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			byte old = array[index];
			array[index] = element.byteValue();
			return Byte.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			modCount++;
			char old = array[index];
			array[index] = element.charValue();
			return Character.valueOf(old);
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Character) {
				return Chars.lastIndexOf(array, ((Character) o).charValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
			}
			if (o instanceof Double) {
				return Doubles.lastIndexOf(array, ((Double) o).doubleValue());
			}
			return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
			public boolean apply(Map.Entry<K, V> input) {
				Boolean result = predicate.apply(input.getKey(), input.getValue());
				return result.booleanValue();
			}
		});
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `ToStringHelper` is the same as one of its superclass' names
in `org.eclipse.xtext.xbase.lib/deprecated/org/eclipse/xtext/xbase/lib/internal/ToStringHelper.java`
#### Snippet
```java
 */
@Deprecated
public class ToStringHelper extends org.eclipse.xtext.xbase.lib.util.ToStringHelper {

}
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IntegerExtensions.java`
#### Snippet
```java
	 */
	@Pure
	@Inline(value="new $3($1, $2, true)", imported=ExclusiveRange.class, statementExpression=false)
	public static ExclusiveRange operator_doubleDotLessThan(final int a, final int b) {
		return new ExclusiveRange(a, b, true);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IntegerExtensions.java`
#### Snippet
```java
	 */
	@Pure
	@Inline(value="new $3($1, $2, false)", imported=ExclusiveRange.class, statementExpression=false)
	public static ExclusiveRange operator_greaterThanDoubleDot(final int a, final int b) {
		return new ExclusiveRange(a, b, false);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IntegerExtensions.java`
#### Snippet
```java
	 */
	@Pure
	@Inline(value="new $3($1, $2)", imported=IntegerRange.class, statementExpression=false)
	public static IntegerRange operator_upTo(final int a, final int b) {
		return new IntegerRange(a, b);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ListExtensions.java`
#### Snippet
```java
	 * @see Collections#sort(List, Comparator)
	 * @see #sortInplace(List)
	 * @see #sortInplaceBy(List, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static <T> List<T> sortInplace(List<T> list, Comparator<? super T> comparator) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	
	/**
	 * Applies the given {@code procedure} for each {@link java.util.Map.Entry key value pair} of the given {@code map}. 
	 * The procedure takes the key, the value and a loop counter. If the counter would overflow, {@link Integer#MAX_VALUE}
	 * is returned for all subsequent pairs. The first pair is at index zero.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java

	/**
	 * Applies the given {@code procedure} for each {@link java.util.Map.Entry key value pair} of the given {@code map}. 
	 * 
	 * @param map
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 *            the separator. May not be <code>null</code>.
	 * @return the string representation of the iterator's elements. Never <code>null</code>.
	 * @see #join(Iterator, CharSequence, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static String join(Iterator<?> iterator, CharSequence separator) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 * <p>
	 * One of the function parameters is an element of the iterator, and the other is the result of previous application
	 * of the function. The seed of the operation is explicitly passed to {@link #fold(Iterator, Object, org.eclipse.xtext.xbase.lib.Functions.Function2)
	 * fold}. The first computed value is the result of the applied function for {@code seed} and the first element of
	 * the iterator. This intermediate result together with the second element of the iterator produced the next result
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 * </p>
	 * <p>
	 * {@link #fold(Iterator, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold} is similar to {@link #reduce(Iterator, org.eclipse.xtext.xbase.lib.Functions.Function2) reduce} but
	 * allows a {@code seed} value and the combinator {@code function} may be asymmetric. It takes {@code T and R} and
	 * returns {@code R}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 * </p>
	 * <p>
	 * {@link #fold(Iterator, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold} is similar to {@link #reduce(Iterator, org.eclipse.xtext.xbase.lib.Functions.Function2) reduce} but
	 * allows a {@code seed} value and the combinator {@code function} may be asymmetric. It takes {@code T and R} and
	 * returns {@code R}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 *            the iterator. May not be <code>null</code>.
	 * @return the string representation of the iterator's elements. Never <code>null</code>.
	 * @see #join(Iterator, CharSequence, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static String join(Iterator<?> iterator) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * @see Collections#sort(List, Comparator)
	 * @see #sort(Iterable)
	 * @see #sortBy(Iterable, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 * @see ListExtensions#sortInplace(List, Comparator)
	 * @since 2.7
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * @see #sort(Iterable)
	 * @see #sort(Iterable, Comparator)
	 * @see ListExtensions#sortInplaceBy(List, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static <T, C extends Comparable<? super C>> List<T> sortBy(Iterable<T> iterable,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * @see Collections#sort(List)
	 * @see #sort(Iterable, Comparator)
	 * @see #sortBy(Iterable, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 * @see ListExtensions#sortInplace(List)
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 *            the iterable. May not be <code>null</code>.
	 * @return the string representation of the iterable's elements. Never <code>null</code>.
	 * @see #join(Iterable, CharSequence, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static String join(Iterable<?> iterable) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * One of the function parameters is an element of the iterable, and the other is the result of previous application
	 * of the function. The seed of the operation is explicitly passed to
	 * {@link #fold(Iterable, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold}. The first computed value
	 * is the result of the applied function for {@code seed} and the first element of the iterable. This intermediate
	 * result together with the second element of the iterable produced the next result and so on.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * </p>
	 * <p>
	 * {@link #fold(Iterable, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold} is similar to
	 * {@link #reduce(Iterable, org.eclipse.xtext.xbase.lib.Functions.Function2) reduce} but allows a {@code seed} value
	 * and the combinator {@code function} may be asymmetric. It takes {@code T and R} and returns {@code R}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * <p>
	 * {@link #fold(Iterable, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold} is similar to
	 * {@link #reduce(Iterable, org.eclipse.xtext.xbase.lib.Functions.Function2) reduce} but allows a {@code seed} value
	 * and the combinator {@code function} may be asymmetric. It takes {@code T and R} and returns {@code R}.
	 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.lib` is unnecessary and can be removed
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 *            the separator. May not be <code>null</code>.
	 * @return the string representation of the iterable's elements. Never <code>null</code>.
	 * @see #join(Iterable, CharSequence, org.eclipse.xtext.xbase.lib.Functions.Function1)
	 */
	public static String join(Iterable<?> iterable, CharSequence separator) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
				}
			}
		} while(compatible == null && (clazz = clazz.getSuperclass()) != null);
		if (compatible != null) {
			boolean isStatic = Modifier.isStatic(compatible.getModifiers());
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
				}
			}
		} while((clazz = clazz.getSuperclass()) != null);
		throw initialException;
	}
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;`
in `org.eclipse.xtend.lib/xtend-gen/org/eclipse/xtend/lib/annotations/AccessorsProcessor.java`
#### Snippet
```java
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.TransformationParticipant;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.xtend.lib.annotations.AccessorsProcessor;`
in `org.eclipse.xtend.lib/xtend-gen/org/eclipse/xtend/lib/annotations/DataProcessor.java`
#### Snippet
```java
import com.google.common.annotations.Beta;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.AccessorsProcessor;
import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor;`
in `org.eclipse.xtend.lib/xtend-gen/org/eclipse/xtend/lib/annotations/DataProcessor.java`
#### Snippet
```java
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.AccessorsProcessor;
import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;
import org.eclipse.xtend.lib.annotations.ToStringProcessor;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;`
in `org.eclipse.xtend.lib/xtend-gen/org/eclipse/xtend/lib/annotations/DataProcessor.java`
#### Snippet
```java
import org.eclipse.xtend.lib.annotations.AccessorsProcessor;
import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;
import org.eclipse.xtend.lib.annotations.ToStringProcessor;
import org.eclipse.xtend.lib.macro.AbstractClassProcessor;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.xtend.lib.annotations.ToStringProcessor;`
in `org.eclipse.xtend.lib/xtend-gen/org/eclipse/xtend/lib/annotations/DataProcessor.java`
#### Snippet
```java
import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructorProcessor;
import org.eclipse.xtend.lib.annotations.ToStringProcessor;
import org.eclipse.xtend.lib.macro.AbstractClassProcessor;
import org.eclipse.xtend.lib.macro.TransformationContext;
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
			K key = computeKeys.apply(v);
			List<V> grouped = result.get(key);
			if (grouped == null) {
				grouped = new ArrayList<V>();
				result.put(key, grouped);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
		this.absolute = iterable.iterator().next().length() == 0;
		
		Iterable<String> withoutEmptySegments = Iterables.filter(iterable, new Predicate<String>() {

			public boolean apply(String input) {
```

### Convert2Lambda
Anonymous new Predicate\>() can be replaced with lambda
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/UnmodifiableMergingMapView.java`
#### Snippet
```java

	private static <K, V> Set<Entry<K, V>> difference(final Map<? extends K, ? extends V> left, final Map<? extends K, ? extends V> right) {
		final Predicate<Entry<? extends K, ? extends V>> notInSet = new Predicate<Map.Entry<? extends K, ? extends V>>() {
			@Override
			public boolean apply(Entry<? extends K, ? extends V> it) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Pure
	public static <K, V> Map<K, V> operator_minus(Map<K, V> map, final Iterable<?> keys) {
		return Maps.filterKeys(map, new Predicate<K>() {
			@Override
			public boolean apply(K input) {
```

### Convert2Lambda
Anonymous new Predicate\>() can be replaced with lambda
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Pure
	public static <K, V> Map<K, V> operator_minus(Map<K, V> left, final Map<? extends K, ? extends V> right) {
		return Maps.filterEntries(left, new Predicate<Entry<K, V>>() {
			@Override
			public boolean apply(Entry<K, V> input) {
```

### Convert2Lambda
Anonymous new Predicate\>() can be replaced with lambda
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
		if (predicate == null)
			throw new NullPointerException("predicate");
		return Maps.filterEntries(original, new Predicate<Map.Entry<K, V>>() {
			@Override
			public boolean apply(Map.Entry<K, V> input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Pure
	public static <K, V> Map<K, V> operator_minus(Map<K, V> map, final K key) {
		return Maps.filterKeys(map, new Predicate<K>() {
			@Override
			public boolean apply(K input) {
```

### Convert2Lambda
Anonymous new Predicate\>() can be replaced with lambda
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	@Pure
	public static <K, V> Map<K, V> operator_minus(Map<K, V> left, final Pair<? extends K, ? extends V> right) {
		return Maps.filterEntries(left, new Predicate<Entry<K, V>>() {
			@Override
			public boolean apply(Entry<K, V> input) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(AnnotationTypeDeclaration annotatedAnnotationType, @Extension RegisterGlobalsContext context) {}
	
	public void doTransform(List<? extends MutableAnnotationTypeDeclaration> annotatedAnnotationTypes, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doTransform(MutableAnnotationTypeDeclaration annotatedAnnotationType, @Extension TransformationContext context) {}

	public void doGenerateCode(List<? extends AnnotationTypeDeclaration> annotatedSourceElements, @Extension CodeGenerationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
	public void doGenerateCode(AnnotationTypeDeclaration annotatedAnnotationType, @Extension CodeGenerationContext context) {}
	
	public void doValidate(List<? extends AnnotationTypeDeclaration> annotatedAnnotationTypes, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(AnnotationTypeDeclaration annotatedAnnotationType, @Extension ValidationContext context) {}

}
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(ClassDeclaration annotatedClass, @Extension RegisterGlobalsContext context) {}
	
	public void doTransform(List<? extends MutableClassDeclaration> annotatedClasses, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
	public void doGenerateCode(ClassDeclaration annotatedClass, @Extension CodeGenerationContext context) {}
	
	public void doValidate(List<? extends ClassDeclaration> annotatedClasses, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(ClassDeclaration annotatedClass, @Extension ValidationContext context) {}

}
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(ConstructorDeclaration annotatedConstructor, RegisterGlobalsContext context) {}

	public void doTransform(List<? extends MutableConstructorDeclaration> annotatedConstructors, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doTransform(MutableConstructorDeclaration annotatedConstructor, @Extension TransformationContext context) {}

	public void doGenerateCode(List<? extends ConstructorDeclaration> annotatedConstructors, @Extension CodeGenerationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doGenerateCode(ConstructorDeclaration annotatedConstructor, @Extension CodeGenerationContext context) {}

	public void doValidate(List<? extends ConstructorDeclaration> annotatedConstructors, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(ConstructorDeclaration annotatedConstructor, ValidationContext context) {
	}
}
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(EnumerationTypeDeclaration annotatedEnumerationType, @Extension RegisterGlobalsContext context) {}
	
	public void doTransform(List<? extends MutableEnumerationTypeDeclaration> annotatedEnumerationTypes, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doTransform(MutableEnumerationTypeDeclaration annotatedEnumerationType, @Extension TransformationContext context) {}

	public void doGenerateCode(List<? extends EnumerationTypeDeclaration> annotatedSourceElements, @Extension CodeGenerationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
	public void doGenerateCode(EnumerationTypeDeclaration annotatedEnumerationType, @Extension CodeGenerationContext context) {}
	
	public void doValidate(List<? extends EnumerationTypeDeclaration> annotatedEnumerationTypes, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(EnumerationTypeDeclaration annotatedEnumerationType, @Extension ValidationContext context) {}

}
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(FieldDeclaration annotatedField, @Extension RegisterGlobalsContext context) {}

	public void doTransform(List<? extends MutableFieldDeclaration> annotatedfields, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
	public void doGenerateCode(FieldDeclaration annotatedField, @Extension CodeGenerationContext context) {}
	
	public void doValidate(List<? extends FieldDeclaration> annotatedFields, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(FieldDeclaration annotatedField, @Extension ValidationContext context) {}
}

```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(InterfaceDeclaration annotatedInterface, @Extension RegisterGlobalsContext context) {}
	
	public void doTransform(List<? extends MutableInterfaceDeclaration> annotatedInterfaces, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doTransform(MutableInterfaceDeclaration annotatedInterface, @Extension TransformationContext context) {}

	public void doGenerateCode(List<? extends InterfaceDeclaration> annotatedSourceElements, @Extension CodeGenerationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
	public void doGenerateCode(InterfaceDeclaration annotatedInterface, @Extension CodeGenerationContext context) {}
	
	public void doValidate(List<? extends InterfaceDeclaration> annotatedInterfaces, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(InterfaceDeclaration annotatedInterface, @Extension ValidationContext context) {}

}
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doRegisterGlobals(MethodDeclaration annotatedMethod, RegisterGlobalsContext context) {}

	public void doTransform(List<? extends MutableMethodDeclaration> annotatedMethods, @Extension TransformationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doTransform(MutableMethodDeclaration annotatedMethod, @Extension TransformationContext context) {}

	public void doGenerateCode(List<? extends MethodDeclaration> annotatedMethods, @Extension CodeGenerationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	 * @param context
	 */
	public void doGenerateCode(MethodDeclaration annotatedMethod, @Extension CodeGenerationContext context) {}

	public void doValidate(List<? extends MethodDeclaration> annotatedMethods, @Extension ValidationContext context) {
```

### EmptyMethod
The method is empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	 * @since 2.7
	 */
	public void doValidate(MethodDeclaration annotatedMethod, ValidationContext context) {
	}
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationTypeDeclaration.java`
#### Snippet
```java
	 * @return the annotation type element with the given name, declared by this annotation type declaration or <code>null</code> if no such annotation type element exists
	 */
	AnnotationTypeElementDeclaration findDeclaredAnnotationTypeElement(String name);
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationTypeDeclaration.java`
#### Snippet
```java
	 * @return the annotation type elements declared by this annotation type declaration
	 */
	Iterable<? extends AnnotationTypeElementDeclaration> getDeclaredAnnotationTypeElements();
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/EnumerationTypeDeclaration.java`
#### Snippet
```java
	 * @return the values directly declared and contained in the enumeration type declaration
	 */
	Iterable<? extends EnumerationValueDeclaration> getDeclaredValues();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/EnumerationTypeDeclaration.java`
#### Snippet
```java
	 * @return the declared value with the given name or <code>null</code> of no such value exists.
	 */
	EnumerationValueDeclaration findDeclaredValue(String name);
	
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ExecutableDeclaration.java`
#### Snippet
```java
	 * @return the declared parameters
	 */
	Iterable<? extends ParameterDeclaration> getParameters();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MemberDeclaration.java`
#### Snippet
```java
	 * @return the type declaring this member or <code>null</code> if this is a top level element
	 */
	TypeDeclaration getDeclaringType();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableAnnotationTarget.java`
#### Snippet
```java
	 * @since 2.6
	 */
	AnnotationReference addAnnotation(AnnotationReference annotationReference);
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableAnnotationTarget.java`
#### Snippet
```java
	 * @since 2.6
	 */
	boolean removeAnnotation(AnnotationReference annotationReference);

}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableElement.java`
#### Snippet
```java
	 * @throws IllegalStateException if this element has already been removed or it was not possible to remove
	 */
	public void remove();

}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
	 * @param visibility
	 */
	public void setVisibility(Visibility visibility);
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableNamedElement.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if the <code>simpleName</code> is <code>null</code>
	 */
	void setSimpleName(String simpleName);
}

```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ParameterDeclaration.java`
#### Snippet
```java
	 * @return the {@link ExecutableDeclaration} this parameter is contained in
	 */
	ExecutableDeclaration getDeclaringExecutable();
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedExecutable.java`
#### Snippet
```java
	 * @return the executable that is {@link ResolvedExecutable resolved}
	 */
	ExecutableDeclaration getDeclaration();

	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the members directly declared and contained in the type declaration
	 */
	Iterable<? extends MemberDeclaration> getDeclaredMembers();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the methods directly declared and contained in the type declaration
	 */
	Iterable<? extends MethodDeclaration> getDeclaredMethods();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the fields directly declared and contained in the type declaration
	 */
	Iterable<? extends FieldDeclaration> getDeclaredFields();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the constructors directly declared and contained in the type declaration
	 */
	Iterable<? extends ConstructorDeclaration> getDeclaredConstructors();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the classes directly declared and contained in the type declaration
	 */
	Iterable<? extends ClassDeclaration> getDeclaredClasses();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the interfaces directly declared and contained in the type declaration
	 */
	Iterable<? extends InterfaceDeclaration> getDeclaredInterfaces();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @since 2.8
	 */
	Iterable<? extends EnumerationTypeDeclaration> getDeclaredEnumerationTypes();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @since 2.8
	 */
	Iterable<? extends AnnotationTypeDeclaration> getDeclaredAnnotationTypes();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @since 2.8
	 */
	Iterable<? extends TypeDeclaration> getDeclaredTypes();
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the declared field with the given name or <code>null</code> of no such field exists.
	 */
	FieldDeclaration findDeclaredField(String name);
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @since 2.8
	 */
	TypeDeclaration findDeclaredType(String name);
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the declared method with the given name and the specified parameter types or <code>null</code> if no such method exists.
	 */
	MethodDeclaration findDeclaredMethod(String name, TypeReference... parameterTypes);
	
	/**
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
	 * @return the declared constructor with the exact same parameter types or <code>null</code> if no such constructors exists.
	 */
	ConstructorDeclaration findDeclaredConstructor(TypeReference... parameterTypes);
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeParameterDeclaration.java`
#### Snippet
```java
	 * @return the {@link TypeParameterDeclarator} declaring the type parameter
	 */
	TypeParameterDeclarator getTypeParameterDeclarator();
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeParameterDeclarator.java`
#### Snippet
```java
	 * @return the declared type parameters
	 */
	Iterable<? extends TypeParameterDeclaration> getTypeParameters();
}
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `gradle/java-compiler-settings.gradle`
#### Snippet
```java
 */

sourceCompatibility = '11'

tasks.withType(JavaCompile) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ExclusiveRange.java`
#### Snippet
```java

		private int next = first;
		private int nextIndex = 0;

		@Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
	private boolean multiLine = true;

	private boolean skipNulls = false;

	private boolean showFieldNames = true;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
		private final String newLineString = "\n";

		private int indentation = 0;

		public IndentationAwareStringBuilder increaseIndent() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IntegerRange.java`
#### Snippet
```java

		private int next = start;
		private int nextIndex = 0;

		@Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
			throw new NullPointerException("predicate");
		return new AbstractIterator<T>() {
			private boolean headFound = false;

			@Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
			throw new NullPointerException("iterator");
		return new AbstractIterator<Pair<Integer, A>>() {
			int i = 0;
			@Override
			protected Pair<Integer, A> computeNext() {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `pathAsString`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
		if (pathAsString.trim().length() == 0)
			throw new IllegalArgumentException("empty path");
		pathAsString = pathAsString.replace('\\', SEGMENT_SEPARATOR ); //replace windows separators
		Iterable<String> iterable = splitter.split(pathAsString);
		
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
				}
			}
		} while((clazz = clazz.getSuperclass()) != null);
		throw initialException;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
		for (String otherSegment : otherSegments) {
			if (otherDelimiter.equals(otherSegment)) {
				segments.add(index++, lineDelimiter);
				segments.add(index++, indentation);
			} else {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
			if (otherDelimiter.equals(otherSegment)) {
				segments.add(index++, lineDelimiter);
				segments.add(index++, indentation);
			} else {
				segments.add(index++, otherSegment);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
				segments.add(index++, indentation);
			} else {
				segments.add(index++, otherSegment);
			}
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `idx`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
				if (idx + 1 < length && text.charAt(idx + 1) == '\n') {
					delimiterLength++;
					idx++;
				}
				int lineLength = idx - delimiterLength - nextLineOffset + 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `idx`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
				nextLineOffset = idx + 1;
			}
			idx++;
		}
		if (nextLineOffset != length) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
			for (String otherSegment : otherSegments) {
				if (otherDelimiter.equals(otherSegment)) {
					segments.add(index++, lineDelimiter);
				} else {
					segments.add(index++, otherSegment);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
					segments.add(index++, lineDelimiter);
				} else {
					segments.add(index++, otherSegment);
				}
			}
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Exceptions.java`
#### Snippet
```java
			throw new NullPointerException("t");
		Exceptions.<RuntimeException> sneakyThrow0(t);
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
			return internalRelativize(other, this);
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
			throw new IllegalStateException("path is not absolute: " + toString());
		if (segments.isEmpty())
			return null;
		return new Path(segments.subList(0, segments.size()-1), true);
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	 */
	public String getLastSegment() {
		return segments.isEmpty() ? null : segments.get(segments.size()-1);
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
		int idx = lastSegment.lastIndexOf('.');
		if (idx == -1) {
			return null;
		}
		return lastSegment.substring(idx+1);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		if (object == null) {
			// Nothing to wrap.
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
		if (iterator.hasNext())
			return iterator.next();
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
			return result;
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
				return t;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
					return t;
			}
			return null;
		} else {
			return IteratorExtensions.findLast(iterable.iterator(), predicate);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
			List<T> list = (List<T>) iterable;
			if (list.isEmpty())
				return null;
			return list.get(list.size() - 1);
		} else if (iterable instanceof SortedSet) {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
			SortedSet<T> sortedSet = (SortedSet<T>) iterable;
			if (sortedSet.isEmpty())
				return null;
			return sortedSet.last();
		} else {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/FunctionDelegate.java`
#### Snippet
```java
	@Override
	public R apply(P input) {
		R result = delegate.apply(input);
		return result;
	}
```

### UnnecessaryLocalVariable
Local variable `f` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
		do {
			try {
				Field f = clazz.getDeclaredField(name);
				return f;
			} catch(NoSuchFieldException noSuchField) {
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	public static <T> Set<T> toSet(Iterable<T> iterable) {
		if (iterable instanceof Set<?>) {
			Set<T> result = (Set<T>) iterable;
			return result;
		}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	public static <T> List<T> toList(Iterable<T> iterable) {
		if (iterable instanceof List<?>) {
			List<T> result = (List<T>) iterable;
			return result;
		}
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(double[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(short[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(byte[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(boolean[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(Object[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(float[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(char[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(long[] array) {
		return array.hashCode();
	}
	
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/ArrayExtensions.java`
#### Snippet
```java
	@Inline("$1.hashCode()")
	public static int hashCode(int[] array) {
		return array.hashCode();
	}
	
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.TypeReference'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedMethod.java`
#### Snippet
```java
	 * @return the {@link ResolvedExecutable resolved} return type
	 */
	TypeReference getResolvedReturnType();

	/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.MethodDeclaration'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedMethod.java`
#### Snippet
```java
public interface ResolvedMethod extends ResolvedExecutable {

	MethodDeclaration getDeclaration();

	/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.TypeReference'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedExecutable.java`
#### Snippet
```java
	 * @return the {@link ResolvedExecutable resolved} exceptions
	 */
	Iterable<? extends TypeReference> getResolvedExceptionTypes();

	/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.ExecutableDeclaration'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedExecutable.java`
#### Snippet
```java
	 * @return the executable that is {@link ResolvedExecutable resolved}
	 */
	ExecutableDeclaration getDeclaration();

	/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.TypeReference'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedParameter.java`
#### Snippet
```java
	 * @return the {@link ResolvedParameter resolved} type of the parameter
	 */
	TypeReference getResolvedType();
}

```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.ParameterDeclaration'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedParameter.java`
#### Snippet
```java
	 * @return the declaration being {@link ResolvedParameter resolved}
	 */
	ParameterDeclaration getDeclaration();

	/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.MutableElement'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Associator.java`
#### Snippet
```java
	 * @param javaElement the generated Java element 
	 */
	void setPrimarySourceElement(MutableElement javaElement, Element sourceElement);
}

```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.Type'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/GlobalTypeLookup.java`
#### Snippet
```java
	 *         couldn't be found on the compilation units classpath.
	 */
	Type findTypeGlobally(String typeName);

}
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.Type'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/GlobalTypeLookup.java`
#### Snippet
```java
	 *         couldn't be found on the compilation units classpath.
	 */
	Type findTypeGlobally(Class<?> clazz);

	/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.TypeReference'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableInterfaceDeclaration.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if <code>superinterfaces</code> is <code>null</code> or contains <code>null</code>
	 */
	public void setExtendedInterfaces(Iterable<? extends TypeReference> superinterfaces);
}

```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.ConstructorDeclaration'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedConstructor.java`
#### Snippet
```java
 */
public interface ResolvedConstructor extends ResolvedExecutable {
	ConstructorDeclaration getDeclaration();
}

```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.TypeReference'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedTypeParameter.java`
#### Snippet
```java
	 * @return the {@link ResolvedTypeParameter resolved} upper bounds
	 */
	Iterable<? extends TypeReference> getResolvedUpperBounds();
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.TypeParameterDeclaration'
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ResolvedTypeParameter.java`
#### Snippet
```java
	 * @return the declaration that is {@link ResolvedTypeParameter resolved}
	 */
	TypeParameterDeclaration getDeclaration();

	/**
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
		Preconditions.checkNotNull(receiver,"receiver");
		Preconditions.checkNotNull(fieldName,"fieldName");
		Class<? extends Object> clazz = receiver.getClass();
		Field f = getDeclaredField(clazz, fieldName);
		if (!f.canAccess(receiver))
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
		final Object[] arguments = args==null ? new Object[]{null}:args;
		
		Class<? extends Object> clazz = receiver.getClass();
		Method compatible = null;
		do {
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
		Preconditions.checkNotNull(fieldName,"fieldName");
		
		Class<? extends Object> clazz = receiver.getClass();
		Field f = getDeclaredField(clazz, fieldName);
		if (!f.canAccess(receiver))
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `demo == null` is always `true`
in `org.eclipse.xtend.lib.gwt.test/src/org/eclipse/xtend/lib/test/TestEntryPoint.java`
#### Snippet
```java
  public void onModuleLoad() {
	  StringConcatenation demo = null;
	  assert demo == null;
  }
}
```

### ConstantValue
Value `c1` is always 'null'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/KeyComparator.java`
#### Snippet
```java
			return c1.compareTo(c2);
		} else {
			return -c2.compareTo(c1);
		}
	}
```

