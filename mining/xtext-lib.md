# xtext-lib 
 
# Bad smells
I found 240 bad smells with 38 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 159 | false |
| UnnecessaryModifier | 22 | true |
| ProtectedMemberInFinalClass | 9 | true |
| ArrayHashCode | 9 | false |
| DanglingJavadoc | 9 | false |
| UnnecessaryLocalVariable | 4 | true |
| DefaultAnnotationParam | 3 | false |
| DataFlowIssue | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| TypeParameterExtendsObject | 3 | false |
| NullableProblems | 3 | false |
| EmptyStatementBody | 2 | false |
| FieldMayBeFinal | 2 | false |
| ConstantValue | 2 | false |
| TrivialIf | 2 | false |
| CommentedOutCode | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| DuplicatedCode | 1 | false |
| RedundantTypeArguments | 1 | false |
| SuspiciousMethodCalls | 1 | false |
## RuleId[id=DefaultAnnotationParam]
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

## RuleId[id=UnnecessaryModifier]
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
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableInterfaceDeclaration.java`
#### Snippet
```java
	 * @exception IllegalArgumentException if <code>superinterfaces</code> is <code>null</code> or contains <code>null</code>
	 */
	public void setExtendedInterfaces(Iterable<? extends TypeReference> superinterfaces);
}

```

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
	public boolean removeAnnotation(AnnotationReference annotationReference);

}
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
	 */
	@Override
	public String toString();
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
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableEnumerationValueDeclaration.java`
#### Snippet
```java
	public void setVisibility(Visibility visibility);
	
	public MutableEnumerationTypeDeclaration getDeclaringType();

}
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
				// go up
				result.remove(result.size()-1);
			} else if (segment.equals(".")) {
				// stay in current directory
			} else {
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
				result.remove(result.size()-1);
				canRemoveSegment = !result.isEmpty() && !result.get(0).equals("..");
			} else if (string.equals(".")) {
				// do nothing
			} else {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/VoidType.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeParameterDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableElement.java`
#### Snippet
```java
 * 
 * @author Anton Kosyakov
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableConstructorDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/CompilationUnit.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/Declaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/ValidationContext.java`
#### Snippet
```java
 *  
 * @see ValidationParticipant
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ValidationContext extends Tracability, ProblemSupport, TypeReferenceProvider, TypeLookup, FileSystemSupport, FileLocations, AnnotationReferenceProvider {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ClassDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ExecutableDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeParameterDeclarator.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableExecutableDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MemberDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableDeclaration.java`
#### Snippet
```java
 * @author Sven Efftinge
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param isStrictFloatingPoint` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableInterfaceDeclaration.java`
#### Snippet
```java

	/**
	 * @param isStrictFloatingPoint
	 */
	void setStrictFloatingPoint(boolean isStrictFloatingPoint);
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableInterfaceDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface MutableInterfaceDeclaration extends MutableTypeParameterDeclarator, MutableTypeDeclaration, InterfaceDeclaration {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationTypeDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param docComment` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
	/**
	 * Sets the JavaDoc comment for this member
	 * @param docComment
	 */
	public void setDocComment(String docComment);
```

### JavadocDeclaration
`@param visibility` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
	 * Sets the {@link Visibility} of this member.
	 * 
	 * @param visibility
	 */
	public void setVisibility(Visibility visibility);
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMemberDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeParameterDeclarator.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MethodDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedClass a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(ClassDeclaration annotatedClass, @Extension RegisterGlobalsContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedClass a mutable class representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableClassDeclaration annotatedClass, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedClass a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractClassProcessor.java`
#### Snippet
```java
	 * Invoked by the validator
	 * @param annotatedClass the generated class that should be validated 
	 * @param context 
	 * @see #doValidate(List, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/FieldDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/Type.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * (i.e. {@link Tracability#isExternal(Element)} returns <code>true</code>). 
	 * 
	 * @param name
	 * @return the expression
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationReference.java`
#### Snippet
```java
	 * will be returned.
	 * 
	 * @param name
	 * @return the value set on this annotation reference or the default value of the annotation type element.
	 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/CompilationStrategy.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	 * Invoked by the validator 
	 * @param annotatedMethod that generated method that should be validated
	 * @param context
	 * @see #doValidate(MethodDeclaration, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedMethod a source method annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doGenerateCode(MethodDeclaration annotatedMethod, @Extension CodeGenerationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedMethod a mutable method representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableMethodDeclaration annotatedMethod, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractMethodProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedMethod a source method annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(MethodDeclaration annotatedMethod, RegisterGlobalsContext context) {}
```

### JavadocDeclaration
`@param isFinal` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
	
	/**
	 * @param isFinal 
	 */
	void setFinal(boolean isFinal);
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param isAbstract` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
	 * Sets the <code>abstract</code> property
	 * 
	 * @param isAbstract 
	 */
	void setAbstract(boolean isAbstract);
```

### JavadocDeclaration
`@param isStrictFloatingPoint` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
	
	/**
	 * @param isStrictFloatingPoint
	 */
	void setStrictFloatingPoint(boolean isStrictFloatingPoint);
```

### JavadocDeclaration
`@param isStatic` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableClassDeclaration.java`
#### Snippet
```java
	
	/**
	 * @param isStatic
	 */
	void setStatic(boolean isStatic);
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/EnumerationValueDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `mavengroupid`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/UnmodifiableMergingMapView.java`
#### Snippet
```java
	 * @author $Author: sgalland$
	 * @version $FullVersion$
	 * @mavengroupid $GroupId$
	 * @mavenartifactid $ArtifactId$
	 */
```

### JavadocDeclaration
Wrong tag `mavenartifactid`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/UnmodifiableMergingMapView.java`
#### Snippet
```java
	 * @version $FullVersion$
	 * @mavengroupid $GroupId$
	 * @mavenartifactid $ArtifactId$
	 */
	@GwtCompatible
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/SourceTypeLookup.java`
#### Snippet
```java
 * processed {@link CompilationUnit}.
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedEnumerationType a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(EnumerationTypeDeclaration annotatedEnumerationType, @Extension RegisterGlobalsContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * Invoked by the validator
	 * @param annotatedEnumerationType the generated enumeration type that should be validated 
	 * @param context 
	 * @see #doValidate(List, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedEnumerationType a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractEnumerationTypeProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedEnumerationType a mutable enumeration type representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableEnumerationTypeDeclaration annotatedEnumerationType, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedConstructor a source method annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doGenerateCode(ConstructorDeclaration annotatedConstructor, @Extension CodeGenerationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedConstructor a mutable method representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableConstructorDeclaration annotatedConstructor, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	 * Invoked by the validator 
	 * @param annotatedConstructor that generated method that should be validated
	 * @param context
	 * @see #doValidate(ConstructorDeclaration, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractConstructorProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedConstructor a source method annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(ConstructorDeclaration annotatedConstructor, RegisterGlobalsContext context) {}
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ConstructorDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 * <p>
	 * One of the function parameters is an element of the iterator, and the other is the result of previous application
	 * of the function. The seed of the operation is explicitly passed to {@link #fold(Iterator, Object, org.eclipse.xtext.xbase.lib.Functions.Function2)
	 * fold}. The first computed value is the result of the applied function for {@code seed} and the first element of
	 * the iterator. This intermediate result together with the second element of the iterator produced the next result
```

### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IteratorExtensions.java`
#### Snippet
```java
	 * </p>
	 * <p>
	 * {@link #fold(Iterator, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold} is similar to {@link #reduce(Iterator, org.eclipse.xtext.xbase.lib.Functions.Function2) reduce} but
	 * allows a {@code seed} value and the combinator {@code function} may be asymmetric. It takes {@code T and R} and
	 * returns {@code R}.
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableMethodDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/Element.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface Element {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeParameterDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/ProblemSupport.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Problem.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Associator.java`
#### Snippet
```java
 * Associates generated Java elements with their source Xtend elements 
 * @since 2.7
 * @noimplement This interface is not intended to be implemented by clients.
 * @see Tracability
 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/UpstreamTypeLookup.java`
#### Snippet
```java
 * This means that types defined in the same project will not be found.
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 2.7
 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/AnnotationReferenceProvider.java`
#### Snippet
```java
 * @author Anton Kosyakov
 * @since 2.6
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 * @see Associator
 */
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
public interface Tracability {
	/**
	 * @param element
	 * @return whether the given element is a source (i.e Xtend) element.
	 * @since 2.7
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
	
	/**
	 * @param element
	 * @return whether the given element is a Java element <b>not</b> derived from the currently processed {@link CompilationUnit}
	 * @since 2.7
```

### JavadocDeclaration
`@param source` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
	
	/**
	 * @param source
	 * @return the primary generated element (Java) derived from the given source element (Xtend).
	 * @since 2.7
```

### JavadocDeclaration
`@param target` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
	
	/**
	 * @param target
	 * @return the source element (Xtend) the given target (Java) element is derived from
	 * @since 2.7
```

### JavadocDeclaration
`@param target` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
	/**
	 * @since 2.7
	 * @param target
	 * @return whether this element was already present in the Xtend source AST.
	 */
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/Tracability.java`
#### Snippet
```java
	
	/**
	 * @param element
	 * @return whether the given element is a Java element derived from the currently processed {@link CompilationUnit}
	 * @since 2.7
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/AnnotationReferenceBuildContext.java`
#### Snippet
```java
 * @author Anton Kosyakov
 * @since 2.6
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/TypeReferenceProvider.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableTypeDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/InterfaceDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationTarget.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param annotationType` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationTarget.java`
#### Snippet
```java

	/**
	 * @param annotationType
	 * @return the annotation reference for the given type, or <code>null</code>
	 *         if this element is not annotated with the given annotation type
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/expression/Expression.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableAnnotationTypeElementDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * One of the function parameters is an element of the iterable, and the other is the result of previous application
	 * of the function. The seed of the operation is explicitly passed to
	 * {@link #fold(Iterable, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold}. The first computed value
	 * is the result of the applied function for {@code seed} and the first element of the iterable. This intermediate
	 * result together with the second element of the iterable produced the next result and so on.
```

### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/IterableExtensions.java`
#### Snippet
```java
	 * </p>
	 * <p>
	 * {@link #fold(Iterable, Object, org.eclipse.xtext.xbase.lib.Functions.Function2) fold} is similar to
	 * {@link #reduce(Iterable, org.eclipse.xtext.xbase.lib.Functions.Function2) reduce} but allows a {@code seed} value
	 * and the combinator {@code function} may be asymmetric. It takes {@code T and R} and returns {@code R}.
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/CodeGenerationContext.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param path` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/FileSystemSupport.java`
#### Snippet
```java
	
	/**
	 * @param path
	 * @return  A <code>long</code> value representing the time the file was
     *          last modified, measured in milliseconds since the epoch
```

### JavadocDeclaration
`@param path` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/FileSystemSupport.java`
#### Snippet
```java
	
	/**
	 * @param path
	 * @return whether the given path points to an existent file
	 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/FileSystemSupport.java`
#### Snippet
```java
 * @author Anton Kosyakov
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param path` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/FileSystemSupport.java`
#### Snippet
```java
	
	/**
	 * @param path
	 * @return whether the given path points to an existent folder
	 */
```

### JavadocDeclaration
`@param path` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/FileSystemSupport.java`
#### Snippet
```java

	/**
	 * @param path
	 * @return the children of the folder the given path points to; 
	 * 		   empty iterable if the path points to a non existent file or folder
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/services/TypeLookup.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param obj` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
	 * identity of the underlying AST.
	 *  
	 * @param obj
	 * @return whether the given obj is the same instance
	 * @since 2.7
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param typeReference` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeReference.java`
#### Snippet
```java
	 * otherwise it returns <code>false</code>.
	 * 
	 * @param typeReference
	 * @return returns <code>true</code> is the specified type reference parameter can be assigned to this type reference.
	 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/RegisterGlobalsContext.java`
#### Snippet
```java
 * 
 * @see RegisterGlobalsParticipant
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param qualifiedName` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/RegisterGlobalsContext.java`
#### Snippet
```java
	 * </pre>
	 * 
	 * @param qualifiedName
	 * @throws IllegalArgumentException if the qualifiedName conflicts with any existing types.
	 * @exception IllegalArgumentException if the <code>qualifiedName</code> is not a valid qualified name
```

### JavadocDeclaration
`@param qualifiedName` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/RegisterGlobalsContext.java`
#### Snippet
```java
	 * </pre>
	 * 
	 * @param qualifiedName
	 * @throws IllegalArgumentException if the qualifiedName conflicts with any existing types.
	 * @exception IllegalArgumentException if the <code>qualifiedName</code> is not a valid qualified name
```

### JavadocDeclaration
`@param qualifiedName` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/RegisterGlobalsContext.java`
#### Snippet
```java
	 * </pre>
	 * 
	 * @param qualifiedName
	 * @throws IllegalArgumentException if the qualifiedName conflicts with any existing types.
	 * @exception IllegalArgumentException if the <code>qualifiedName</code> is not a valid qualified name
```

### JavadocDeclaration
`@param qualifiedName` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/RegisterGlobalsContext.java`
#### Snippet
```java
	 * </pre>
	 * 
	 * @param qualifiedName
	 * @throws IllegalArgumentException if the qualifiedName conflicts with any existing types.
	 * @exception IllegalArgumentException if the <code>qualifiedName</code> is not a valid qualified name
```

### JavadocDeclaration
`@param relativePath` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	
	/**
	 * @param relativePath
	 * @return the absolute path
	 */
```

### JavadocDeclaration
`@param relativePath` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java

	/**
	 * @param relativePath
	 * @return the absolute path
	 */
```

### JavadocDeclaration
`@param pathAsString` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
	 * the used file separator is '/' and a leading one indicates an absolute path.
	 * 
	 * @param pathAsString
	 */
	public Path(String pathAsString) {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableAnnotationTypeDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/PrimitiveType.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/TransformationContext.java`
#### Snippet
```java
 * 
 * @see TransformationParticipant
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedAnnotationType a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedAnnotationType a mutable annotation type representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableAnnotationTypeDeclaration annotatedAnnotationType, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * Invoked by the validator
	 * @param annotatedAnnotationType the generated annotation type that should be validated 
	 * @param context 
	 * @see #doValidate(List, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractAnnotationTypeProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedAnnotationType a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(AnnotationTypeDeclaration annotatedAnnotationType, @Extension RegisterGlobalsContext context) {}
```

### JavadocDeclaration
`@param isFinal` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableFieldDeclaration.java`
#### Snippet
```java
	 * sets the 'final' property
	 * 
	 * @param isFinal
	 */
	void setFinal(boolean isFinal);
```

### JavadocDeclaration
`@param isTransient` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableFieldDeclaration.java`
#### Snippet
```java
	 * sets the 'transient' property
	 * 
	 * @param isTransient
	 */
	void setTransient(boolean isTransient);
```

### JavadocDeclaration
`@param initializer` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableFieldDeclaration.java`
#### Snippet
```java
	 *  will be detached from there as well.
	 * 
	 * @param initializer
	 */
	void setInitializer(Expression initializer);
```

### JavadocDeclaration
`@param isVolatile` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableFieldDeclaration.java`
#### Snippet
```java
	 * sets the 'volatile' property
	 * 
	 * @param isVolatile
	 */
	void setVolatile(boolean isVolatile);
```

### JavadocDeclaration
`@param isStatic` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableFieldDeclaration.java`
#### Snippet
```java
	 * sets the 'static' property
	 * 
	 * @param isStatic
	 */
	void setStatic(boolean isStatic);
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableFieldDeclaration.java`
#### Snippet
```java
 * @author Sven Efftinge
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedField a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedField a source field annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(FieldDeclaration annotatedField, @Extension RegisterGlobalsContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedField a mutable field representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableFieldDeclaration annotatedField, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractFieldProcessor.java`
#### Snippet
```java
	 * Invoked by the validator
	 * @param annotatedField the generated field that should be validated 
	 * @param context 
	 * @see #doValidate(List, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableNamedElement.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableEnumerationTypeDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noextend`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 * It maintains the index at which new elements should inserted into the existing concatenation.
	 * 
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 */
```

### JavadocDeclaration
Wrong tag `noinstantiate`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 * 
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 */
	private static class SimpleTarget implements StringConcatenationClient.TargetStringConcatenation {
```

### JavadocDeclaration
Wrong tag `noextend`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 * the clients should write into the decorated {@link StringConcatenation}.
	 * 
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 */
```

### JavadocDeclaration
Wrong tag `noinstantiate`
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 * 
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 */
	private static class IndentedTarget extends SimpleTarget {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ParameterDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/AnnotationTypeElementDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/EnumerationTypeDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/MutableFileSystemSupport.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param path` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/MutableFileSystemSupport.java`
#### Snippet
```java
	 * Implementors may decide to perform this method asynchronously. Clients should not rely on invocation timing.
	 * 
	 * @param path
	 * @since 2.7
	 */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/NamedElement.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/FileLocations.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedInterface a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * Invoked by the validator
	 * @param annotatedInterface the generated interface that should be validated 
	 * @param context 
	 * @see #doValidate(List, ValidationContext)
	 * @since 2.7
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	/**
	 * @param annotatedInterface a mutable interface representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableInterfaceDeclaration annotatedInterface, @Extension TransformationContext context) {}
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/AbstractInterfaceProcessor.java`
#### Snippet
```java
	 * 
	 * @param annotatedInterface a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(InterfaceDeclaration annotatedInterface, @Extension RegisterGlobalsContext context) {}
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableAnnotationTarget.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableEnumerationValueDeclaration.java`
#### Snippet
```java
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MutableParameterDeclaration.java`
#### Snippet
```java
/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `toStringContext` may be 'final'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ToStringBuilder.java`
#### Snippet
```java
public final class ToStringBuilder {
	
	private static ToStringContext toStringContext = ToStringContext.INSTANCE;
	
	private final Object instance;
```

### FieldMayBeFinal
Field `array` may be 'final'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Conversions.java`
#### Snippet
```java
		}

		private T[] array;

		/**
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/util/ReflectExtensions.java`
#### Snippet
```java
		Preconditions.checkNotNull(receiver,"receiver");
		Preconditions.checkNotNull(fieldName,"fieldName");
		Class<? extends Object> clazz = receiver.getClass();
		Field f = getDeclaredField(clazz, fieldName);
		if (!f.canAccess(receiver))
			f.setAccessible(true);
```

## RuleId[id=ProtectedMemberInFinalClass]
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
		protected WrappedIntegerArray(int[] array) {
			this.array = array;
		}
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

## RuleId[id=ArrayHashCode]
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
	public static int hashCode(int[] array) {
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
	public static int hashCode(boolean[] array) {
		return array.hashCode();
	}
	
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/Exceptions.java`
#### Snippet
```java
		if (t == null)
			throw new NullPointerException("t");
		Exceptions.<RuntimeException> sneakyThrow0(t);
		return null;
	}
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/MapExtensions.java`
#### Snippet
```java
	public static <K, V> void operator_remove(Map<K, V> map, Iterable<? super K> keysToRemove) {
		for (final Object key : keysToRemove) {
			map.remove(key);
		}
	}
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeParameterDeclaration.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MemberDeclaration.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeDeclaration.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/TypeParameterDeclarator.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/MethodDeclaration.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/PrimitiveType.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/ParameterDeclaration.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/NamedElement.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/declaration/Visibility.java`
#### Snippet
```java
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
```

## RuleId[id=TypeParameterExtendsObject]
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
		Preconditions.checkNotNull(fieldName,"fieldName");
		
		Class<? extends Object> clazz = receiver.getClass();
		Field f = getDeclaredField(clazz, fieldName);
		if (!f.canAccess(receiver))
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/UnmodifiableMergingMapView.java`
#### Snippet
```java
			@SuppressWarnings({ "unchecked", "rawtypes" })
			@Override
			public Iterator<Entry<K, V>> iterator() {
				return Iterators.unmodifiableIterator((Iterator) Iterators.filter(left.entrySet().iterator(), notInSet));
			}
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtext/xbase/lib/internal/UnmodifiableMergingMapView.java`
#### Snippet
```java
			@SuppressWarnings({ "unchecked", "rawtypes", "synthetic-access" })
			@Override
			public Iterator<Entry<K, V>> iterator() {
				return Iterators.unmodifiableIterator((Iterator) Iterators.concat(
						UnmodifiableMergingMapView.this.right.entrySet().iterator(), diff.iterator()));
```

### NullableProblems
Non-annotated method 'toString' from 'Object' implements non-null method from 'CharSequence'
in `org.eclipse.xtext.xbase.lib/src/org/eclipse/xtend2/lib/StringConcatenation.java`
#### Snippet
```java
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 */
	private static class SimpleTarget implements StringConcatenationClient.TargetStringConcatenation {

		private final StringConcatenation target;
```

## RuleId[id=ConstantValue]
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
			return false;
		if (segments == null) {
			if (other.segments != null)
				return false;
		} else if (!segments.equals(other.segments))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtend.lib.macro/src/org/eclipse/xtend/lib/macro/file/Path.java`
#### Snippet
```java
			if (other.segments != null)
				return false;
		} else if (!segments.equals(other.segments))
			return false;
		return true;
```

