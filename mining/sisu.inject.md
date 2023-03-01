# sisu.inject 
 
# Bad smells
I found 390 bad smells with 33 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 79 | false |
| NestedAssignment | 57 | false |
| UnnecessaryFullyQualifiedName | 48 | false |
| BoundedWildcard | 26 | false |
| PointlessBitwiseExpression | 26 | false |
| UnnecessaryUnboxing | 14 | false |
| SizeReplaceableByIsEmpty | 12 | true |
| NonShortCircuitBoolean | 10 | false |
| ConstantValue | 10 | false |
| ToArrayCallWithZeroLengthArrayArgument | 9 | true |
| SystemOutErr | 8 | false |
| InstanceofCatchParameter | 7 | false |
| ZeroLengthArrayInitialization | 7 | false |
| ExtendsAnnotation | 6 | false |
| SynchronizeOnThis | 6 | false |
| DeprecatedIsStillUsed | 5 | false |
| FinalStaticMethod | 5 | false |
| UnnecessaryBoxing | 5 | false |
| PointlessBooleanExpression | 5 | true |
| CharsetObjectCanBeUsed | 4 | false |
| UnnecessaryModifier | 3 | true |
| ClassNameSameAsAncestorName | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| DataFlowIssue | 2 | false |
| RedundantClassCall | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| RedundantSuppression | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| DoubleNegation | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| RedundantCollectionOperation | 1 | false |
| UnnecessaryReturn | 1 | true |
| StringEqualsEmptyString | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UNUSED_IMPORT | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| Anonymous2MethodRef | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| EmptyMethod | 1 | false |
| UnnecessaryContinue | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[patterns.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBindings.java`
#### Snippet
```java
            patterns.add( GlobberStrategy.PATTERN.compile( glob ) );
        }
        return patterns.toArray( new String[patterns.size()] );
    }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[arguments.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/ElementAnalyzer.java`
#### Snippet
```java
            else if ( String[].class == clazz )
            {
                binder.bind( key ).toInstance( arguments.toArray( new String[arguments.size()] ) );
            }
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Method\[methods.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanLifecycle.java`
#### Snippet
```java
    private static Method[] toArray( final List<Method> methods )
    {
        return null != methods && !methods.isEmpty() ? methods.toArray( new Method[methods.size()] ) : NO_METHODS;
    }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Binding\[visible.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/InjectorBindings.java`
#### Snippet
```java
                        }
                    }
                    wildcards = visible.isEmpty() ? NO_BINDINGS : visible.toArray( new Binding[visible.size()] );
                }
            }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Map\[properties.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/MergedProperties.java`
#### Snippet
```java
    MergedProperties( final List<Map<?, ?>> properties )
    {
        this.properties = properties.toArray( new Map[properties.size()] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[expandedPath.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/URLClassSpace.java`
#### Snippet
```java
        }

        return expandedPath.toArray( new URL[expandedPath.size()] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[classPath.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/BundleClassSpace.java`
#### Snippet
```java
                }

                bundleClassPath = classPath.isEmpty() ? NO_URLS : classPath.toArray( new URL[classPath.size()] );
            }
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[indexPath.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java

        final ClassLoader parent = SisuIndex.class.getClassLoader();
        final URL[] urls = indexPath.toArray( new URL[indexPath.size()] );
        final ClassLoader loader = urls.length > 0 ? URLClassLoader.newInstance( urls, parent ) : parent;

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[names.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/ZipEntryIterator.java`
#### Snippet
```java
                names.add( e.getName() );
            }
            return names.toArray( new String[names.size()] );
        }
        finally
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/TypeArguments.java`
#### Snippet
```java
    @Qualifier
    @Retention( RetentionPolicy.RUNTIME )
    private static @interface Implicit
    {
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/WildcardKey.java`
#### Snippet
```java
    @Qualifier
    @Retention( RetentionPolicy.RUNTIME )
    private static @interface Qualified
    {
        Class<?> value();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/DeclaredMembers.java`
#### Snippet
```java
     * {@link Enum} implementation that provides different views of a class's members.
     */
    public static enum View
    {
        CONSTRUCTORS
```

## RuleId[ruleID=DoubleNegation]
### DoubleNegation
Double negation in `hasDeprecatedAttribute != ((accessFlags & Opcodes.ACC_DEPRECATED) != 0)`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
        || descriptorIndex != this.descriptorIndex
        || signatureIndex != this.signatureIndex
        || hasDeprecatedAttribute != ((accessFlags & Opcodes.ACC_DEPRECATED) != 0)) {
      return false;
    }
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Dereference of `listOfBlocksToProcess` may produce `NullPointerException`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
    // graph, and add these blocks to the list of blocks to process (if not already done).
    Label listOfBlocksToProcess = firstBasicBlock;
    listOfBlocksToProcess.nextListElement = Label.EMPTY_LIST;
    int maxStackSize = maxStack;
    while (listOfBlocksToProcess != Label.EMPTY_LIST) {
```

### DataFlowIssue
Method `readCode` is too complex to analyze by data flow algorithm
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
   *     its attribute_name_index and attribute_length fields.
   */
  private void readCode(
      final MethodVisitor methodVisitor, final Context context, final int codeOffset) {
    int currentOffset = codeOffset;
```

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
        try
        {
            hasGuiceServlet = BindingTargetVisitor.class.isInstance( ServletFinder.THIS );
        }
        catch ( final LinkageError e )
```

### RedundantClassCall
Redundant call to `cast()`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        }
        // this cast lets us load the 'Logs' class and log messages even if Guice is not available
        throw RuntimeException.class.cast( new ProvisionException( problem.toString(), problem ) );
    }

```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Constants.java`
#### Snippet
```java
    }
    int minorVersion;
    try (DataInputStream callerClassStream = new DataInputStream(classInputStream); ) {
      callerClassStream.readInt();
      minorVersion = callerClassStream.readUnsignedShort();
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        if ( --cursor > 0 )
        {
            buf.append( format.substring( 0, cursor ) );
        }
        try
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        if ( cursor < len )
        {
            buf.append( format.substring( cursor, len ) );
        }
        return buf.toString();
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `names`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/ZipEntryIterator.java`
#### Snippet
```java
        try
        {
            final String names[] = new String[zipFile.size()];
            final Enumeration<? extends ZipEntry> e = zipFile.entries(); // NOSONAR
            for ( int i = 0; i < names.length; i++ )
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'visitMethodInsn' is still used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
   */
  @Deprecated
  public void visitMethodInsn(
      final int opcode, final String owner, final String name, final String descriptor) {
    int opcodeAndSource = opcode | (api < Opcodes.ASM5 ? Opcodes.SOURCE_DEPRECATED : 0);
```

### DeprecatedIsStillUsed
Deprecated member 'Description' is still used
in `org.eclipse.sisu.inject/src/main/java/org/sonatype/inject/Description.java`
#### Snippet
```java
@Target( value = { ElementType.TYPE } )
@Retention( RetentionPolicy.RUNTIME )
public @interface Description
{
    String value();
```

### DeprecatedIsStillUsed
Deprecated member 'EagerSingleton' is still used
in `org.eclipse.sisu.inject/src/main/java/org/sonatype/inject/EagerSingleton.java`
#### Snippet
```java
@Target( value = { ElementType.TYPE } )
@Retention( RetentionPolicy.RUNTIME )
public @interface EagerSingleton
{
}
```

### DeprecatedIsStillUsed
Deprecated member 'ASM10_EXPERIMENTAL' is still used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
   * @deprecated This API is experimental.
   */
  @Deprecated int ASM10_EXPERIMENTAL = 1 << 24 | 10 << 16 | 0 << 8;

  /*
```

### DeprecatedIsStillUsed
Deprecated member 'Legacy' is still used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Legacy.java`
#### Snippet
```java
 */
@Deprecated
public final class Legacy<S>
{
    // ----------------------------------------------------------------------
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/ResourceEnumeration.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private static final Iterator<String> NO_ENTRIES = Collections.<String> emptySet().iterator();

    // ----------------------------------------------------------------------
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`( (String) name ).length() > 0` can be replaced with '!( (String) name ).isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBinding.java`
#### Snippet
```java
        final Class<T> clazz = (Class<T>) reference.getBundle().loadClass( clazzName );
        final Object name = reference.getProperty( "name" );
        if ( name instanceof String && ( (String) name ).length() > 0 )
        {
            key = Key.get( clazz, Names.named( (String) name ) );
```

### SizeReplaceableByIsEmpty
`qualifiers.length() > 0` can be replaced with '!qualifiers.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndexAPT6.java`
#### Snippet
```java
            return Collections.emptySet();
        }
        if ( qualifiers != null && qualifiers.length() > 0 )
        {
            final Set<String> annotationTypes = new HashSet<String>();
```

### SizeReplaceableByIsEmpty
`option.trim().length() == 0` can be replaced with 'option.trim().isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/BeanScanning.java`
#### Snippet
```java
    {
        final String option = (String) properties.get( BeanScanning.class.getName() );
        if ( null == option || option.trim().length() == 0 )
        {
            return BeanScanning.ON;
```

### SizeReplaceableByIsEmpty
`qualifiers.length() > 0` can be replaced with '!qualifiers.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifierCache.java`
#### Snippet
```java
        {
            final String qualifiers = System.getProperty( "sisu.qualifiers" );
            if ( qualifiers != null && qualifiers.length() > 0 )
            {
                final StringBuilder buf = new StringBuilder( "L" );
```

### SizeReplaceableByIsEmpty
`entryNames.size() > 0` can be replaced with '!entryNames.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/FileEntryIterator.java`
#### Snippet
```java
    public boolean hasNext()
    {
        return entryNames.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`authority.length() > 0` can be replaced with '!authority.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/FileEntryIterator.java`
#### Snippet
```java

        final String authority = url.getAuthority();
        if ( null != authority && authority.length() > 0 )
        {
            buf.append( File.separatorChar ).append( File.separatorChar ).append( authority );
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
            {
                final String name = jsr330.value();
                if ( name.length() > 0 )
                {
                    return "default".equals( name ) ? null : Names.named( name );
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
            {
                final String name = guice.value();
                if ( name.length() > 0 )
                {
                    return "default".equals( name ) ? null : guice;
```

### SizeReplaceableByIsEmpty
`( (Named) qualifier ).value().length() == 0` can be replaced with '( (Named) qualifier ).value().isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/LocatorWiring.java`
#### Snippet
```java
        if ( qualifier instanceof Named )
        {
            if ( ( (Named) qualifier ).value().length() == 0 )
            {
                // special case for wildcard @Named dependencies: match any @Named bean regardless of actual name
```

### SizeReplaceableByIsEmpty
`bindings.size() > 0` can be replaced with '!bindings.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanListener.java`
#### Snippet
```java
        }

        if ( bindings.size() > 0 )
        {
            encounter.register( new BeanInjector<B>( bindings ) );
```

### SizeReplaceableByIsEmpty
`requiredKeys.size() > 0` can be replaced with '!requiredKeys.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
    {
        final Set<Key<?>> missingKeys = new HashSet<Key<?>>();
        while ( requiredKeys.size() > 0 )
        {
            final List<Key<?>> candidateKeys = new ArrayList<Key<?>>( requiredKeys );
```

### SizeReplaceableByIsEmpty
`typePath.length() == 0` can be replaced with 'typePath.isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/TypePath.java`
#### Snippet
```java
   */
  public static TypePath fromString(final String typePath) {
    if (typePath == null || typePath.length() == 0) {
      return null;
    }
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
        if ( !TypeArguments.isConcrete( qualifiedType ) )
        {
            return;
        }
        else if ( Module.class.isAssignableFrom( qualifiedType ) )
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputLocals, i)`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
        concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
      }
      frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputLocals, i);
    }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, inputLocals[i], dstFrame.inputLocals, i)`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
    if (catchTypeIndex > 0) {
      for (int i = 0; i < numLocal; ++i) {
        frameChanged |= merge(symbolTable, inputLocals[i], dstFrame.inputLocals, i);
      }
      if (dstFrame.inputStack == null) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, catchTypeIndex, dstFrame.inputStack, 0)`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
        frameChanged = true;
      }
      frameChanged |= merge(symbolTable, catchTypeIndex, dstFrame.inputStack, 0);
      return frameChanged;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputStack, i)`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
        concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
      }
      frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputStack, i);
    }
    // Then, do this for the stack operands that have pushed in the basic block (this code is the
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputStack, numInputStack ...`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
        concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
      }
      frameChanged |=
          merge(symbolTable, concreteOutputType, dstFrame.inputStack, numInputStack + i);
    }
    return frameChanged;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isQualified |= QUALIFIER_DESC.equals( desc )`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifierCache.java`
#### Snippet
```java
    public AnnotationVisitor visitAnnotation( final String desc )
    {
        isQualified |= QUALIFIER_DESC.equals( desc );
        return null;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasAsmInstructions |= label.resolve(code.data, code.length)`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  public void visitLabel(final Label label) {
    // Resolve the forward references to this label, if any.
    hasAsmInstructions |= label.resolve(code.data, code.length);
    // visitLabel starts a new basic block (except for debug only labels), so we need to update the
    // previous and current block references and list of successors.
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `applyBinding &= analyzeDependencies( p.getDependencies() )`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
        for ( final InjectionPoint p : points )
        {
            applyBinding &= analyzeDependencies( p.getDependencies() );
        }
        return applyBinding;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFrames |= methodWriter.hasFrames()`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
    methodWriter = firstMethod;
    while (methodWriter != null) {
      hasFrames |= methodWriter.hasFrames();
      hasAsmInstructions |= methodWriter.hasAsmInstructions();
      methodWriter.putMethodInfo(result);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasAsmInstructions |= methodWriter.hasAsmInstructions()`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
    while (methodWriter != null) {
      hasFrames |= methodWriter.hasFrames();
      hasAsmInstructions |= methodWriter.hasAsmInstructions();
      methodWriter.putMethodInfo(result);
      methodWriter = (MethodWriter) methodWriter.mv;
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/FileEntryIterator.java`
#### Snippet
```java
                        }
                    }
                    i += 2;
                }
                else
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `currChar`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        for ( char prevChar = ' ', currChar; cursor < len; prevChar = currChar, cursor++ )
        {
            currChar = format.charAt( cursor );
            if ( prevChar == '{' && currChar == '}' )
            {
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
     * @return Temporary {@link Reference} for the given value; used in queries.
     */
    static final <V> Reference<V> tempValue( final V value )
    {
        return new Weak<V, V>( null, value, null );
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/GlobberStrategy.java`
#### Snippet
```java
     * @return Optimal globber strategy
     */
    public static final GlobberStrategy selectFor( final String glob )
    {
        if ( null == glob || "*".equals( glob ) )
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildKeys.java`
#### Snippet
```java
     * @return Temporary {@link Reference} for the given key; used in queries.
     */
    static final <K> Reference<K> tempKey( final K key )
    {
        return new Weak<K>( key, null );
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/QualifyingStrategy.java`
#### Snippet
```java
     * @return Qualifier for the key
     */
    static final Annotation qualify( final Key<?> key )
    {
        if ( null == key.getAnnotationType() )
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/QualifyingStrategy.java`
#### Snippet
```java
     * @return Qualifying strategy
     */
    static final QualifyingStrategy selectFor( final Key<?> key )
    {
        final Class<?> qualifierType = key.getAnnotationType();
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ByteVector.java`
#### Snippet
```java
    int doubleCapacity = 2 * data.length;
    int minimalCapacity = length + size;
    byte[] newData = new byte[doubleCapacity > minimalCapacity ? doubleCapacity : minimalCapacity];
    System.arraycopy(data, 0, newData, 0, length);
    data = newData;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBinding.java`
#### Snippet
```java
        {
            final int serviceRanking = getServiceRanking( reference );
            rank = serviceRanking < maxRank ? serviceRanking : maxRank;
        }
        else
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends K`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/ProviderIterableAdapter.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        ProviderEntry( final BeanEntry<K, V> entry )
        {
            this.entry = entry;
```

### BoundedWildcard
Can generalize to `? extends Module`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/MergedModule.java`
#### Snippet
```java
    }

    public MergedModule( final Iterable<Module> modules )
    {
        this.modules = modules;
```

### BoundedWildcard
Can generalize to `? extends Module`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/WireModule.java`
#### Snippet
```java
    }

    public WireModule( final Iterable<Module> modules )
    {
        this.modules = modules;
```

### BoundedWildcard
Can generalize to `? super Key`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/ElementAnalyzer.java`
#### Snippet
```java
    }

    private static void addLegacyKeyAlias( final Map<Key<?>, Key<?>> aliases, final Class<?> clazz )
        throws ClassNotFoundException
    {
```

### BoundedWildcard
Can generalize to `? super Key`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/ElementAnalyzer.java`
#### Snippet
```java
    }

    private static void addLegacyKeyAlias( final Map<Key<?>, Key<?>> aliases, final Class<?> clazz )
        throws ClassNotFoundException
    {
```

### BoundedWildcard
Can generalize to `? extends Key`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/ElementAnalyzer.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    public void ignoreKeys( final Set<Key<?>> keys )
    {
        localKeys.addAll( keys );
```

### BoundedWildcard
Can generalize to `? extends Named`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/NamedIterableAdapter.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        NamedEntry( final Entry<Named, V> entry )
        {
            this.entry = entry;
```

### BoundedWildcard
Can generalize to `? extends V`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/NamedIterableAdapter.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        NamedEntry( final Entry<Named, V> entry )
        {
            this.entry = entry;
```

### BoundedWildcard
Can generalize to `? extends K`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        StrongEntry( final Entry<K, Reference<V>> entry, final V value )
        {
            this.entry = entry;
```

### BoundedWildcard
Can generalize to `? super Reference`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        StrongEntry( final Entry<K, Reference<V>> entry, final V value )
        {
            this.entry = entry;
```

### BoundedWildcard
Can generalize to `? super Reference`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentKeys.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    MildConcurrentKeys( final ConcurrentMap<Reference<K>, V> map, final boolean soft )
    {
        super( map, soft );
```

### BoundedWildcard
Can generalize to `? extends Element`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SpaceModule.java`
#### Snippet
```java
    }

    private static void replayRecordedElements( final Binder binder, final List<Element> elements )
    {
        for ( final Element e : elements )
```

### BoundedWildcard
Can generalize to `? super W`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/WatchedBeans.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    WatchedBeans( final Key<T> key, final Mediator<Q, T, W> mediator, final W watcher )
    {
        this.key = key;
```

### BoundedWildcard
Can generalize to `? extends BindingPublisher`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/ImplicitBindings.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    ImplicitBindings( final Iterable<BindingPublisher> publishers )
    {
        this.publishers = publishers;
```

### BoundedWildcard
Can generalize to `? super Reference`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildKeys.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    MildKeys( final Map<Reference<K>, V> map, final boolean soft )
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? super K`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentValues.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    MildConcurrentValues( final ConcurrentMap<K, Reference<V>> map, final boolean soft )
    {
        super( map, soft );
```

### BoundedWildcard
Can generalize to `? super T`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildElements.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        Weak( final T value, final ReferenceQueue<T> queue, final int index )
        {
            super( value, queue );
```

### BoundedWildcard
Can generalize to `? super T`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildElements.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        Soft( final T value, final ReferenceQueue<T> queue, final int index )
        {
            super( value, queue );
```

### BoundedWildcard
Can generalize to `? extends Module`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
     * @param moduleType The module type
     */
    private void installModule( final Class<Module> moduleType )
    {
        final Module module = newInstance( moduleType );
```

### BoundedWildcard
Can generalize to `? extends org.sonatype.inject.Mediator`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java

    @SuppressWarnings( "deprecation" )
    private void registerLegacyMediator( final Class<org.sonatype.inject.Mediator> mediatorType )
    {
        final TypeLiteral<?>[] args = resolveTypeArguments( mediatorType, org.sonatype.inject.Mediator.class );
```

### BoundedWildcard
Can generalize to `? extends Mediator`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
     * @param mediatorType The mediator type
     */
    private void registerMediator( final Class<Mediator> mediatorType )
    {
        final TypeLiteral<?>[] args = resolveTypeArguments( mediatorType, Mediator.class );
```

### BoundedWildcard
Can generalize to `? extends Module`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/ChildWireModule.java`
#### Snippet
```java
    }

    public ChildWireModule( final Injector parent, final Iterable<Module> modules )
    {
        this.modules = modules;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuExtensions.java`
#### Snippet
```java
     * @return List of extension types
     */
    public <T> List<Class<? extends T>> load( final Class<T> spi )
    {
        final String index = "META-INF/services/" + spi.getName();
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuExtensions.java`
#### Snippet
```java
     * @return List of extensions
     */
    public <T, C> List<T> create( final Class<T> spi, final Class<C> contextType, final C context )
    {
        final List<T> extensions = new ArrayList<T>();
```

### BoundedWildcard
Can generalize to `? extends Iterable``>`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Legacy.java`
#### Snippet
```java
    }

    public static <Q extends Annotation, T> Provider<Iterable<BeanEntry<Q, T>>> adapt( final Provider<Iterable<? extends org.eclipse.sisu.BeanEntry<Q, T>>> delegate )
    {
        return new Provider<Iterable<BeanEntry<Q, T>>>()
```

### BoundedWildcard
Can generalize to `? super W`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Legacy.java`
#### Snippet
```java
    }

    public static <Q extends Annotation, T, W> org.eclipse.sisu.Mediator<Q, T, W> adapt( final Mediator<Q, T, W> delegate )
    {
        return null == delegate ? null : new org.eclipse.sisu.Mediator<Q, T, W>()
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
            newLine = System.getProperty( "line.separator", "\n" );
            final String debug = System.getProperty( "sisu.debug", "false" );
            toConsole = "".equals( debug ) || "true".equalsIgnoreCase( debug );
        }
        catch ( final RuntimeException e )
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java

        @SuppressWarnings( "hiding" )
        static final BindingTargetVisitor<Object, Class<?>> THIS = new ProviderFinder();

        // ----------------------------------------------------------------------
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java

        @SuppressWarnings( "hiding" )
        static final BindingTargetVisitor<Object, Class<?>> THIS = new ServletFinder();

        // ----------------------------------------------------------------------
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifierCache.java`
#### Snippet
```java
            final String name = desc.substring( 1, desc.length() - 1 );
            SpaceScanner.accept( this, space.getResource( name + ".class" ) );
            cachedResults.put( desc, Boolean.valueOf( isQualified ) );

            return isQualified;
```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
    public Boolean visit( final InjectionRequest<?> request )
    {
        return Boolean.valueOf( analyzeInjectionPoints( request.getInjectionPoints() ) );
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
        if ( binding instanceof HasDependencies )
        {
            return Boolean.valueOf( analyzeDependencies( ( (HasDependencies) binding ).getDependencies() ) );
        }
        return Boolean.TRUE;
```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
            return Boolean.TRUE;
        }
        return Boolean.valueOf( analyzeDependencies( binding.getDependencies() ) );
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
    public Boolean visit( final StaticInjectionRequest request )
    {
        return Boolean.valueOf( analyzeInjectionPoints( request.getInjectionPoints() ) );
    }

```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        public void debug( final String message, final Throwable cause )
        {
            System.out.println( DEBUG + message );
            if ( null != cause )
            {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
            if ( null != cause )
            {
                cause.printStackTrace( System.out );
            }
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        public void warn( final String message, final Throwable cause )
        {
            System.err.println( WARN + message );
            if ( null != cause )
            {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
            if ( null != cause )
            {
                cause.printStackTrace( System.err );
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        public void trace( final String message, final Throwable cause )
        {
            System.out.println( TRACE + message );
            if ( null != cause )
            {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
            if ( null != cause )
            {
                cause.printStackTrace( System.out );
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
    protected void info( final String message )
    {
        System.out.println( "[INFO] " + message );
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
    protected void warn( final String message )
    {
        System.out.println( "[WARN] " + message );
    }

```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndexAPT6.java`
#### Snippet
```java
    {
        final FileObject file = environment.getFiler().getResource( StandardLocation.CLASS_OUTPUT, "", path );
        return new InputStreamReader( file.openInputStream(), "UTF-8" );
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
        if ( parent.isDirectory() || parent.mkdirs() )
        {
            return new OutputStreamWriter( new FileOutputStream( index ), "UTF-8" );
        }
        throw new IOException( "Error creating: " + parent );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
        throws IOException
    {
        return new InputStreamReader( new FileInputStream( new File( targetDirectory, path ) ), "UTF-8" );
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/IndexedClassFinder.java`
#### Snippet
```java
            {
                final BufferedReader reader =
                    new BufferedReader( new InputStreamReader( Streams.open( url ), "UTF-8" ) );
                try
                {
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBinding.java`
#### Snippet
```java
    {
        final Object ranking = reference.getProperty( Constants.SERVICE_RANKING );
        return ranking instanceof Integer ? ( (Integer) ranking ).intValue() : 0;
    }
}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
  static int getAbstractTypeFromApiFormat(final SymbolTable symbolTable, final Object type) {
    if (type instanceof Integer) {
      return CONSTANT_KIND | ((Integer) type).intValue();
    } else if (type instanceof String) {
      String descriptor = Type.getObjectType((String) type).getDescriptor();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
  Symbol addConstant(final Object value) {
    if (value instanceof Integer) {
      return addConstantInteger(((Integer) value).intValue());
    } else if (value instanceof Byte) {
      return addConstantInteger(((Byte) value).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantInteger(((Byte) value).intValue());
    } else if (value instanceof Character) {
      return addConstantInteger(((Character) value).charValue());
    } else if (value instanceof Short) {
      return addConstantInteger(((Short) value).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantInteger(((Short) value).intValue());
    } else if (value instanceof Boolean) {
      return addConstantInteger(((Boolean) value).booleanValue() ? 1 : 0);
    } else if (value instanceof Float) {
      return addConstantFloat(((Float) value).floatValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantInteger(((Boolean) value).booleanValue() ? 1 : 0);
    } else if (value instanceof Float) {
      return addConstantFloat(((Float) value).floatValue());
    } else if (value instanceof Long) {
      return addConstantLong(((Long) value).longValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantFloat(((Float) value).floatValue());
    } else if (value instanceof Long) {
      return addConstantLong(((Long) value).longValue());
    } else if (value instanceof Double) {
      return addConstantDouble(((Double) value).doubleValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantLong(((Long) value).longValue());
    } else if (value instanceof Double) {
      return addConstantDouble(((Double) value).doubleValue());
    } else if (value instanceof String) {
      return addConstantString((String) value);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('s', symbolTable.addConstantUtf8((String) value));
    } else if (value instanceof Byte) {
      annotation.put12('B', symbolTable.addConstantInteger(((Byte) value).byteValue()).index);
    } else if (value instanceof Boolean) {
      int booleanValue = ((Boolean) value).booleanValue() ? 1 : 0;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('B', symbolTable.addConstantInteger(((Byte) value).byteValue()).index);
    } else if (value instanceof Boolean) {
      int booleanValue = ((Boolean) value).booleanValue() ? 1 : 0;
      annotation.put12('Z', symbolTable.addConstantInteger(booleanValue).index);
    } else if (value instanceof Character) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('Z', symbolTable.addConstantInteger(booleanValue).index);
    } else if (value instanceof Character) {
      annotation.put12('C', symbolTable.addConstantInteger(((Character) value).charValue()).index);
    } else if (value instanceof Short) {
      annotation.put12('S', symbolTable.addConstantInteger(((Short) value).shortValue()).index);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('C', symbolTable.addConstantInteger(((Character) value).charValue()).index);
    } else if (value instanceof Short) {
      annotation.put12('S', symbolTable.addConstantInteger(((Short) value).shortValue()).index);
    } else if (value instanceof Type) {
      annotation.put12('c', symbolTable.addConstantUtf8(((Type) value).getDescriptor()));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifierCache.java`
#### Snippet
```java
            return isQualified;
        }
        return result.booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  private void putFrameType(final Object type) {
    if (type instanceof Integer) {
      stackMapTableEntries.putByte(((Integer) type).intValue());
    } else if (type instanceof String) {
      stackMapTableEntries
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `BeanEntry` is the same as one of its superclass' names
in `org.eclipse.sisu.inject/src/main/java/org/sonatype/inject/BeanEntry.java`
#### Snippet
```java
 */
@Deprecated
public interface BeanEntry<Q extends Annotation, T>
    extends org.eclipse.sisu.BeanEntry<Q, T>
{
```

### ClassNameSameAsAncestorName
Class name `Soft` is the same as one of its superclass' names
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
     * Soft value with an {@link InverseMapping} back to its key.
     */
    private static final class Soft<K, V>
        extends MildKeys.Soft<V>
        implements InverseMapping
```

### ClassNameSameAsAncestorName
Class name `Weak` is the same as one of its superclass' names
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
     * Weak value with an {@link InverseMapping} back to its key.
     */
    private static final class Weak<K, V>
        extends MildKeys.Weak<V>
        implements InverseMapping
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Label.java`
#### Snippet
```java
      final int relativeOffset = bytecodeOffset - sourceInsnBytecodeOffset;
      int handle = reference & FORWARD_REFERENCE_HANDLE_MASK;
      if ((reference & FORWARD_REFERENCE_TYPE_MASK) == FORWARD_REFERENCE_TYPE_SHORT) {
        if (relativeOffset < Short.MIN_VALUE || relativeOffset > Short.MAX_VALUE) {
          // Change the opcode of the jump instruction, in order to be able to find it later in
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu.space.asm` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassTooLargeException.java`
#### Snippet
```java

  /**
   * Returns the internal name of the class (see {@link org.eclipse.sisu.space.asm.Type#getInternalName()}).
   *
   * @return the internal name of the class.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu.space.asm` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassTooLargeException.java`
#### Snippet
```java
   *
   * @param className the internal name of the class (see {@link
   *     org.eclipse.sisu.space.asm.Type#getInternalName()}).
   * @param constantPoolCount the number of constant pool items of the class.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndexAPT6.java`
#### Snippet
```java
        try
        {
            hasQualifier = javax.inject.Qualifier.class.isAnnotation();
        }
        catch ( final LinkageError e )
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndexAPT6.java`
#### Snippet
```java
        if ( HAS_QUALIFIER )
        {
            return null != anno.getAnnotation( javax.inject.Qualifier.class );
        }
        for ( final AnnotationMirror mirror : anno.getAnnotationMirrors() )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu.space` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/BeanScanning.java`
#### Snippet
```java
 * Common techniques for discovering bean implementations.
 * 
 * @see org.eclipse.sisu.space.SpaceModule
 */
public enum BeanScanning
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
    static final class ServletFinder
        extends ProviderFinder
        implements com.google.inject.servlet.ServletModuleTargetVisitor<Object, Class<?>>
    {
        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
        }

        public Class<?> visit( final com.google.inject.servlet.LinkedServletBinding binding )
        {
            // this assumes only one level of indirection: api-->impl
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
        }

        public Class<?> visit( final com.google.inject.servlet.InstanceServletBinding binding )
        {
            return binding.getServletInstance().getClass();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        public Class<?> visit( final com.google.inject.servlet.InstanceFilterBinding binding )
        {
            return binding.getFilterInstance().getClass();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
        }

        public Class<?> visit( final com.google.inject.servlet.LinkedFilterBinding binding )
        {
            // this assumes only one level of indirection: api-->impl
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger( SISU );

        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger( SISU );

        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger( SISU );

        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger( SISU );

        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.enterprise.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
            if ( HAS_JSR299_TYPED )
            {
                final javax.enterprise.inject.Typed typed = c.getAnnotation( javax.enterprise.inject.Typed.class );
                if ( null != typed )
                {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.enterprise.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
            if ( HAS_JSR299_TYPED )
            {
                final javax.enterprise.inject.Typed typed = c.getAnnotation( javax.enterprise.inject.Typed.class );
                if ( null != typed )
                {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
                }
            }
            final org.eclipse.sisu.Typed typed = c.getAnnotation( org.eclipse.sisu.Typed.class );
            if ( null != typed )
            {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
                }
            }
            final org.eclipse.sisu.Typed typed = c.getAnnotation( org.eclipse.sisu.Typed.class );
            if ( null != typed )
            {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
        else
        {
            final Mediator mediator = org.eclipse.sisu.inject.Legacy.adapt( newInstance( mediatorType ) );
            if ( null != mediator )
            {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
    private static boolean isEagerSingleton( final Class<?> type )
    {
        return type.isAnnotationPresent( org.eclipse.sisu.EagerSingleton.class )
            || type.isAnnotationPresent( org.sonatype.inject.EagerSingleton.class );
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.sonatype.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
    {
        return type.isAnnotationPresent( org.eclipse.sisu.EagerSingleton.class )
            || type.isAnnotationPresent( org.sonatype.inject.EagerSingleton.class );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
    private static boolean isSingleton( final Class<?> type )
    {
        return type.isAnnotationPresent( javax.inject.Singleton.class )
            || type.isAnnotationPresent( com.google.inject.Singleton.class );
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
    {
        return type.isAnnotationPresent( javax.inject.Singleton.class )
            || type.isAnnotationPresent( com.google.inject.Singleton.class );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.enterprise.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
        try
        {
            hasJsr299Typed = javax.enterprise.inject.Typed.class.isAnnotation();
        }
        catch ( final LinkageError e )
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
    private void bindProviderType( final Class<?> providerType )
    {
        final TypeLiteral[] args = resolveTypeArguments( providerType, javax.inject.Provider.class );
        if ( args.length != 1 )
        {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanScheduler.java`
#### Snippet
```java
        {
            // extra check in case we have both old and new versions of guice overlapping on the runtime classpath
            Binder.class.getMethod( "bindListener", Matcher.class, com.google.inject.spi.ProvisionListener[].class );

            // allow cycle detection to be turned off completely
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanScheduler.java`
#### Snippet
```java
     */
    static final class CycleActivator
        implements com.google.inject.spi.ProvisionListener
    {
        private static final BindingScopingVisitor<Boolean> IS_SCOPED = new DefaultBindingScopingVisitor<Boolean>()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanScheduler.java`
#### Snippet
```java
            if ( null != CYCLE_ACTIVATOR )
            {
                binder.bindListener( Matchers.any(), (com.google.inject.spi.ProvisionListener) CYCLE_ACTIVATOR );
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sisu.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/LocatorWiring.java`
#### Snippet
```java

            return BeanEntry.class == entryType.getRawType() ? beanEntries
                                                             : org.eclipse.sisu.inject.Legacy.adapt( beanEntries );
        }
        return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/DeclaredMembers.java`
#### Snippet
```java
                }

                if ( null == clazz || clazz == java.lang.Object.class )
                {
                    return false;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
    {
        final Object source = binding.getSource();
        if ( HAS_DECLARING_SOURCE && source instanceof com.google.inject.spi.ElementSource )
        {
            return ( (com.google.inject.spi.ElementSource) source ).getDeclaringSource();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
        if ( HAS_DECLARING_SOURCE && source instanceof com.google.inject.spi.ElementSource )
        {
            return ( (com.google.inject.spi.ElementSource) source ).getDeclaringSource();
        }
        return source;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
        {
            // in Guice4 binding.getSource() returns ElementSource and not the original declaring source
            hasDeclaringSource = com.google.inject.spi.ElementSource.class.getMethod( "getDeclaringSource" ) != null; // NOSONAR
        }
        catch ( final Exception e )
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanListener.java`
#### Snippet
```java
        for ( final BeanProperty<?> property : new BeanProperties( type.getRawType() ) )
        {
            if ( property.getAnnotation( javax.inject.Inject.class ) != null
                || property.getAnnotation( com.google.inject.Inject.class ) != null )
            {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanListener.java`
#### Snippet
```java
        {
            if ( property.getAnnotation( javax.inject.Inject.class ) != null
                || property.getAnnotation( com.google.inject.Inject.class ) != null )
            {
                continue; // these properties will have already been injected by Guice
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
        {
            final Class<?> clazz = key.getTypeLiteral().getRawType();
            if ( javax.inject.Provider.class == clazz || com.google.inject.Provider.class == clazz )
            {
                requireKey( key.ofType( TypeArguments.get( key.getTypeLiteral(), 0 ) ) );
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/BeanProviders.java`
#### Snippet
```java
        final TypeLiteral<V> type = key.getTypeLiteral();
        final Class<?> clazz = type.getRawType();
        if ( javax.inject.Provider.class != clazz && com.google.inject.Provider.class != clazz )
        {
            return beanEntriesOf( key );
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
     */
    private static final class JsrNamed
        implements com.google.inject.name.Named, javax.inject.Named
    {
        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
     */
    private static final class JsrNamed
        implements com.google.inject.name.Named, javax.inject.Named
    {
        // ----------------------------------------------------------------------
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
        public String toString()
        {
            return "@" + javax.inject.Named.class.getName() + "(value=" + value + ")";
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
        public Class<? extends Annotation> annotationType()
        {
            return javax.inject.Named.class;
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
    LazyBeanEntry( final Q qualifier, final Binding<T> binding, final int rank )
    {
        if ( null != qualifier && com.google.inject.name.Named.class == qualifier.annotationType() )
        {
            this.qualifier = (Q) new JsrNamed( (com.google.inject.name.Named) qualifier );
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
        if ( null != qualifier && com.google.inject.name.Named.class == qualifier.annotationType() )
        {
            this.qualifier = (Q) new JsrNamed( (com.google.inject.name.Named) qualifier );
        }
        else
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
                return true;
            }
            if ( rhs instanceof com.google.inject.name.Named )
            {
                return value.equals( ( (com.google.inject.name.Named) rhs ).value() );
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
            if ( rhs instanceof com.google.inject.name.Named )
            {
                return value.equals( ( (com.google.inject.name.Named) rhs ).value() );
            }
            if ( rhs instanceof javax.inject.Named )
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
                return value.equals( ( (com.google.inject.name.Named) rhs ).value() );
            }
            if ( rhs instanceof javax.inject.Named )
            {
                return value.equals( ( (javax.inject.Named) rhs ).value() );
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
            if ( rhs instanceof javax.inject.Named )
            {
                return value.equals( ( (javax.inject.Named) rhs ).value() );
            }
            return false;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary, and can be replaced with an import
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
        // ----------------------------------------------------------------------

        JsrNamed( final com.google.inject.name.Named named )
        {
            value = named.value();
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.eclipse.sisu.inject.Logs;`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBindings.java`
#### Snippet
```java
import org.eclipse.sisu.inject.BindingPublisher;
import org.eclipse.sisu.inject.BindingSubscriber;
import org.eclipse.sisu.inject.Logs;
import org.eclipse.sisu.space.GlobberStrategy;
import org.eclipse.sisu.space.Tokens;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
        // If this local has never been assigned in this basic block, so it is still equal to its
        // value in the input frame.
        abstractType = outputLocals[localIndex] = LOCAL_KIND | localIndex;
      }
      return abstractType;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LocatedBeans.java`
#### Snippet
```java
            {
                final Binding<T> binding = itr.next();
                if ( null != readCache && null != ( nextBean = readCache.get( binding ) ) )
                {
                    return true;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
    int index = entry.hashCode % entries.length;
    entry.next = entries[index];
    return entries[index] = entry;
  }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
    ByteVector bootstrapMethodsAttribute = bootstrapMethods;
    if (bootstrapMethodsAttribute == null) {
      bootstrapMethodsAttribute = bootstrapMethods = new ByteVector();
    }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/LifecycleManager.java`
#### Snippet
```java
    public boolean unmanage()
    {
        for ( Object bean; ( bean = popStoppable() ) != null; )
        {
            lifecycleFor( bean ).stop( bean );
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
            {
                // most common case: adding the one (and-only) entry
                n = newBean = new LazyBeanEntry( qualifier, binding, rank );
            }
            else if ( o instanceof LazyBeanEntry )
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
                    return oldBean;
                }
                n = createMap( oldBean, newBean = new LazyBeanEntry( qualifier, binding, rank ) );
            }
            else
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
                {
                    final Map<Binding, LazyBeanEntry> map = (Map) o;
                    if ( null == ( newBean = map.get( binding ) ) )
                    {
                        map.put( binding, newBean = new LazyBeanEntry( qualifier, binding, rank ) );
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
                    if ( null == ( newBean = map.get( binding ) ) )
                    {
                        map.put( binding, newBean = new LazyBeanEntry( qualifier, binding, rank ) );
                        mutated = true;
                    }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuExtender.java`
#### Snippet
```java
        if ( null == locator )
        {
            locators.put( extenderId, locator = createLocator( context ) );
        }
        return locator;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
    void compact()
    {
        for ( Reference<? extends V> ref; ( ref = queue.poll() ) != null; )
        {
            // only remove this specific key-value mapping
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildKeys.java`
#### Snippet
```java
    final void compact()
    {
        for ( Reference<? extends K> ref; ( ref = queue.poll() ) != null; )
        {
            map.remove( ref );
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentValues.java`
#### Snippet
```java
    void compact()
    {
        for ( Reference<? extends V> ref; ( ref = queue.poll() ) != null; )
        {
            // only remove this specific key-value mapping; thread-safe
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentValues.java`
#### Snippet
```java
         * We must either add our value to the map, or return a non-null existing value.
         */
        for ( Reference<V> oldRef; ( oldRef = concurrentMap.putIfAbsent( key, ref ) ) != null; )
        {
            final V oldValue = oldRef.get();
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
    typeAnnotation.putShort(symbolTable.addConstantUtf8(descriptor)).putShort(0);
    if (visible) {
      return lastCodeRuntimeVisibleTypeAnnotation =
          new AnnotationWriter(
              symbolTable,
              /* useNamedValues = */ true,
              typeAnnotation,
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
          new AnnotationWriter(
              symbolTable,
              /* useNamedValues = */ true,
              typeAnnotation,
              lastCodeRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastCodeRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastCodeRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
            new AnnotationWriter[Type.getArgumentTypes(descriptor).length];
      }
      return lastRuntimeVisibleParameterAnnotations[parameter] =
          AnnotationWriter.create(
              symbolTable, annotationDescriptor, lastRuntimeVisibleParameterAnnotations[parameter]);
    } else {
      if (lastRuntimeInvisibleParameterAnnotations == null) {
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
            new AnnotationWriter[Type.getArgumentTypes(descriptor).length];
      }
      return lastRuntimeInvisibleParameterAnnotations[parameter] =
          AnnotationWriter.create(
              symbolTable,
              annotationDescriptor,
              lastRuntimeInvisibleParameterAnnotations[parameter]);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
            || constantSymbol.tag == Symbol.CONSTANT_DOUBLE_TAG
            || (constantSymbol.tag == Symbol.CONSTANT_DYNAMIC_TAG
                && ((firstDescriptorChar = constantSymbol.value.charAt(0)) == 'J'
                    || firstDescriptorChar == 'D'));
    if (isLongOrDouble) {
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastCodeRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable,
              (typeRef & 0xFF0000FF) | (lastBytecodeOffset << 8),
              typePath,
              descriptor,
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable,
              (typeRef & 0xFF0000FF) | (lastBytecodeOffset << 8),
              typePath,
              descriptor,
              lastCodeRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildElements.java`
#### Snippet
```java
    private void compact()
    {
        for ( Reference<? extends T> ref; ( ref = queue.poll() ) != null; )
        {
            evict( ref );
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanScheduler.java`
#### Snippet
```java
                if ( null == holder )
                {
                    pendingHolder.set( holder = new Object[1] );
                }
                if ( null == holder[0] )
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
  public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DefaultBeanLocator.java`
#### Snippet
```java

        RankedBindings result;
        while ( null != ( result = cachedBindings.get( id ) ) && !type.equals( result.type() ) )
        {
            id++; // collision! (should be very rare) ... resort to linear scan from base id
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
  public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
        }
        int x = 0, y, expressionEnd = 0, expressionNum = 0;
        while ( ( x = buf.indexOf( "${", x ) ) >= 0 && ( y = buf.indexOf( "}", x ) + 1 ) > 0 )
        {
            if ( y > expressionEnd ) // making progress
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
        }
        int x = 0, y, expressionEnd = 0, expressionNum = 0;
        while ( ( x = buf.indexOf( "${", x ) ) >= 0 && ( y = buf.indexOf( "}", x ) + 1 ) > 0 )
        {
            if ( y > expressionEnd ) // making progress
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
        {
            final int index;
            if ( null == ( o = content ) || ( index = o.indexOfThis( element ) ) < 0 )
            {
                return false;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
        {
            final int index;
            if ( null == ( o = content ) || ( index = o.indexOfThis( element ) ) < 0 )
            {
                return false;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
        do
        {
            if ( null == ( o = content ) || ( index = o.indexOf( element ) ) < 0 )
            {
                return null;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
        do
        {
            if ( null == ( o = content ) || ( index = o.indexOf( element ) ) < 0 )
            {
                return null;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
        do
        {
            n = null != ( o = content ) ? o.insert( element, rank ) : new Content( element, rank );
        }
        while ( !CONTENT_UPDATER.compareAndSet( this, o, n ) );
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
      lastMethod.mv = methodWriter;
    }
    return lastMethod = methodWriter;
  }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
      lastField.fv = fieldWriter;
    }
    return lastField = fieldWriter;
  }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
  public final ModuleVisitor visitModule(
      final String name, final int access, final String version) {
    return moduleWriter =
        new ModuleWriter(
            symbolTable,
            symbolTable.addConstantModule(name).index,
            access,
            version == null ? 0 : symbolTable.addConstantUtf8(version));
  }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
      lastRecordComponent.delegate = recordComponentWriter;
    }
    return lastRecordComponent = recordComponentWriter;
  }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
  public final AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
    }
    int cpInfoOffset = cpInfoOffsets[constantPoolEntryIndex];
    return constantUtf8Values[constantPoolEntryIndex] =
        readUtf(cpInfoOffset + 2, readUnsignedShort(cpInfoOffset), charBuffer);
  }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
    final int bytecodeStartOffset = currentOffset;
    final int bytecodeEndOffset = currentOffset + codeLength;
    final Label[] labels = context.currentMethodLabels = new Label[codeLength + 1];
    while (currentOffset < bytecodeEndOffset) {
      final int bytecodeOffset = currentOffset - bytecodeStartOffset;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
      int bytesRead;
      int readCount = 0;
      while ((bytesRead = inputStream.read(data, 0, bufferSize)) != -1) {
        outputStream.write(data, 0, bytesRead);
        readCount++;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
      bootstrapMethodOffset += 2;
    }
    return constantDynamicValues[constantPoolEntryIndex] =
        new ConstantDynamic(name, descriptor, handle, bootstrapMethodArguments);
  }

```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`slot = slot + t.getSize()` could be simplified to 'slot += t.getSize()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DynamicGlue.java`
#### Snippet
```java
            {
                v.visitVarInsn( t.getOpcode( Opcodes.ILOAD ), slot );
                slot = slot + t.getSize();
            }

```

### ReplaceAssignmentWithOperatorAssignment
`slot = slot + t.getSize()` could be simplified to 'slot += t.getSize()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DynamicGlue.java`
#### Snippet
```java
            {
                v.visitVarInsn( t.getOpcode( Opcodes.ILOAD ), slot );
                slot = slot + t.getSize();
            }

```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `properties` are queried, but never updated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
    @Parameters
    @SuppressWarnings( "rawtypes" )
    private Map properties;

    @Inject
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Module() can be replaced with method reference
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SpaceModule.java`
#### Snippet
```java
        {
            // record results of scanning plus any custom module bindings
            final List<Element> recording = Elements.getElements( new Module()
            {
                public void configure( final Binder recorder )
                {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `readCache` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
    private volatile Object mapping; // NOSONAR

    private Map<Binding<T>, BeanEntry<Q, T>> readCache;

    private volatile boolean mutated;
```

## RuleId[ruleID=ExtendsAnnotation]
### ExtendsAnnotation
Class 'DescriptionSource' implements annotation interface `Description`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DescriptionSource.java`
#### Snippet
```java
 */
final class DescriptionSource
    implements Description, AnnotatedSource
{
    // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'QualifiedImpl' implements annotation interface `Qualified`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/WildcardKey.java`
#### Snippet
```java
     */
    private static final class QualifiedImpl
        implements Qualified, Provider<Annotation>
    {
        // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'PrioritySource' implements annotation interface `Priority`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/PrioritySource.java`
#### Snippet
```java
 */
final class PrioritySource
    implements Priority, AnnotatedSource
{
    // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'HiddenSource' implements annotation interface `Hidden`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/HiddenSource.java`
#### Snippet
```java
 */
final class HiddenSource
    implements Hidden, AnnotatedSource
{
    // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'JsrNamed' implements annotation interface `com.google.inject.name.Named`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
     */
    private static final class JsrNamed
        implements com.google.inject.name.Named, javax.inject.Named
    {
        // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'JsrNamed' implements annotation interface `javax.inject.Named`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
     */
    private static final class JsrNamed
        implements com.google.inject.name.Named, javax.inject.Named
    {
        // ----------------------------------------------------------------------
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTest.java`
#### Snippet
```java

            final Properties properties = new Properties();
            properties.put( "basedir", getBasedir() );
            InjectedTest.this.configure( properties );

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTestCase.java`
#### Snippet
```java

            final Properties properties = new Properties();
            properties.put( "basedir", getBasedir() );
            InjectedTestCase.this.configure( properties );

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTest.java`
#### Snippet
```java
     * @param properties The test properties
     */
    public void configure( final Properties properties )
    {
        // put any per-test properties here...
```

## RuleId[ruleID=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
  int ASM9 = 9 << 16 | 0 << 8;

```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
   * @deprecated This API is experimental.
   */
  @Deprecated int ASM10_EXPERIMENTAL = 1 << 24 | 10 << 16 | 0 << 8;

  /*
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
  int ASM9 = 9 << 16 | 0 << 8;

  /**
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;

```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;

  /**
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  // ASM API versions.

  int ASM4 = 4 << 16 | 0 << 8;
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java

  int V1_1 = 3 << 16 | 45;
  int V1_2 = 0 << 16 | 46;
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int ASM4 = 4 << 16 | 0 << 8;
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
  int ASM9 = 9 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_2 = 0 << 16 | 46;
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java

  int ASM4 = 4 << 16 | 0 << 8;
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V1_1 = 3 << 16 | 45;
  int V1_2 = 0 << 16 | 46;
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Opcodes.java`
#### Snippet
```java
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
```

## RuleId[ruleID=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanLifecycle.java`
#### Snippet
```java
                finally
                {
                    continue; // ignore any logging exceptions and continue stopping
                }
            }
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `publisher`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedBindings.java`
#### Snippet
```java
            while ( null != publisher && !itr.hasNext( publisher.maxBindingRank() ) )
            {
                synchronized ( publisher )
                {
                    // check in case subscribed by another thread
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `publisher`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedBindings.java`
#### Snippet
```java
         * Lock just to prevent subscription race condition.
         */
        synchronized ( publisher ) // NOSONAR
        {
            if ( !pendingPublishers.removeThis( publisher ) )
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-01-20-30-08.418.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/GlueLoader.java`
#### Snippet
```java
        catch ( final Exception e )
        {
            final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
            throw new ProvisionException( "Error proxying: " + type, cause );
        }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanLifecycle.java`
#### Snippet
```java
            catch ( final Throwable e ) // NOPMD see Logs.catchThrowable
            {
                final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
                Logs.catchThrowable( cause );
                try
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanLifecycle.java`
#### Snippet
```java
        catch ( final Throwable e ) // NOPMD see Logs.catchThrowable
        {
            final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
            Logs.catchThrowable( cause );
            try
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/InjectorBindings.java`
#### Snippet
```java
                catch ( final Exception e )
                {
                    final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
                    Logs.debug( "Problem creating: {}", impl, cause );
                }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
        catch ( final Exception e )
        {
            final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
            binder.addError( "Error creating instance of: " + type + " reason: " + cause );
            return null;
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanPropertySetter.java`
#### Snippet
```java
        catch ( final Exception e )
        {
            final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
            throw new ProvisionException( "Error injecting: " + method, cause );
        }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuExtensions.java`
#### Snippet
```java
            catch ( final Exception e )
            {
                final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
                Logs.debug( "Problem creating: {}", impl, cause );
            }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentVisitor.java`
#### Snippet
```java
      return delegate.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentVisitor.java`
#### Snippet
```java
      return delegate.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/StringProperties.java`
#### Snippet
```java
            return (String) value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldVisitor.java`
#### Snippet
```java
      return fv.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldVisitor.java`
#### Snippet
```java
      return fv.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationVisitor.java`
#### Snippet
```java
      return av.visitAnnotation(name, descriptor);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationVisitor.java`
#### Snippet
```java
      return av.visitArray(name);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitField(access, name, descriptor, signature, value);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitRecordComponent(name, descriptor, signature);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitMethod(access, name, descriptor, signature, exceptions);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitModule(name, access, version);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBinding.java`
#### Snippet
```java
    public <V> V acceptTargetVisitor( final BindingTargetVisitor<? super T, V> visitor )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTest.java`
#### Snippet
```java
    {
        final Iterator<? extends Entry<Annotation, T>> i = locator.locate( key ).iterator();
        return i.hasNext() ? i.next().getValue() : null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTestCase.java`
#### Snippet
```java
    {
        final Iterator<? extends Entry<Annotation, T>> i = locator.locate( key ).iterator();
        return i.hasNext() ? i.next().getValue() : null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuTracker.java`
#### Snippet
```java
        if ( SUPPORT_BUNDLE_NAMES.contains( bundle.getSymbolicName() ) )
        {
            return null; // ignore our main support bundles
        }
        if ( null != bundle.getHeaders().get( Constants.FRAGMENT_HOST ) )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuTracker.java`
#### Snippet
```java
        if ( null != bundle.getHeaders().get( Constants.FRAGMENT_HOST ) )
        {
            return null; // fragment, we'll scan it when we process the host
        }
        // check plans in reverse order
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/ServiceBindings.java`
#### Snippet
```java
    public <T> T adapt( final Class<T> type )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitAnnotationDefault();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
          typeRef, typePath, start, end, index, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitInsnAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitParameterAnnotation(parameter, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitTryCatchAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeVisitor.java`
#### Snippet
```java
            qualified = qualified || qualifierCache.qualify( space, desc );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DescriptionSource.java`
#### Snippet
```java
            return ( (AnnotatedSource) source ).getAnnotation( binding, annotationType );
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/osgi/BindingTracker.java`
#### Snippet
```java
        {
            Logs.warn( "Problem subscribing to service: {}", reference, e );
            return null;
        }
        synchronized ( subscribers )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/LifecycleManager.java`
#### Snippet
```java
    public PropertyBinding manage( final BeanProperty<?> property )
    {
        return null; // no custom property bindings
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/InjectorBindings.java`
#### Snippet
```java
    public <T> T adapt( final Class<T> type )
    {
        return Injector.class == type ? (T) injector : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
            if ( null == o )
            {
                return null;
            }
            else if ( o instanceof LazyBeanEntry )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
                if ( binding != oldBean.binding )
                {
                    return null;
                }
                n = null; // clear single entry
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/MergedProperties.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java

        final Reference<V> ref = map.get( key );
        return null != ref ? ref.get() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java

        final Reference<V> ref = map.remove( key );
        return null != ref ? ref.get() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java

        final Reference<V> ref = map.put( key, mildValue( key, value ) );
        return null != ref ? ref.get() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/AbstractDeferredClass.java`
#### Snippet
```java
            }
        }
        return null; // not used
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifierCache.java`
#### Snippet
```java
    {
        isQualified |= QUALIFIER_DESC.equals( desc );
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/ImplicitBindings.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/GlobberStrategy.java`
#### Snippet
```java
        public final String compile( final String glob )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/QualifyingStrategy.java`
#### Snippet
```java
            }

            return null;
        }
    },
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/QualifyingStrategy.java`
#### Snippet
```java
        {
            final Annotation qualifier = MARKED.qualifies( requirement, binding );
            return requirement.getAnnotation().equals( qualifier ) ? qualifier : null;
        }
    };
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/QualifyingStrategy.java`
#### Snippet
```java

            final Class<?> implementation = Implementations.find( binding );
            return null != implementation ? implementation.getAnnotation( markerType ) : null;
        }
    },
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/QualifyingStrategy.java`
#### Snippet
```java
        {
            final Annotation qualifier = qualify( binding.getKey() );
            return qualifier instanceof Named ? qualifier : null;
        }
    },
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
    {
        final org.sonatype.inject.Description legacy = clazz.getAnnotation( org.sonatype.inject.Description.class );
        return null != legacy ? (T) new DescriptionSource( binding.getSource(), legacy.value() ) : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
    {
        final javax.annotation.Priority jsr250 = clazz.getAnnotation( javax.annotation.Priority.class );
        return null != jsr250 ? (T) new PrioritySource( binding.getSource(), jsr250.value() ) : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SpaceScanner.java`
#### Snippet
```java
    private static org.eclipse.sisu.space.asm.ClassVisitor adapt( final ClassVisitor _cv )
    {
        return null == _cv ? null : new org.eclipse.sisu.space.asm.ClassVisitor( Opcodes.ASM9 )
        {
            @Override
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SpaceScanner.java`
#### Snippet
```java
            {
                final AnnotationVisitor _av = _cv.visitAnnotation( desc );
                return null == _av ? null : new org.eclipse.sisu.space.asm.AnnotationVisitor( Opcodes.ASM9 )
                {
                    {
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Logs.java`
#### Snippet
```java
    public static String identityToString( final Object object )
    {
        return null == object ? null : object.getClass().getName() + '@' //
            + Integer.toHexString( System.identityHashCode( object ) );
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentValues.java`
#### Snippet
```java

        final Reference<V> ref = concurrentMap.replace( key, mildValue( key, value ) );
        return null != ref ? ref.get() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentValues.java`
#### Snippet
```java
            concurrentMap.remove( key, oldRef ); // gone AWOL; remove entry and try again
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
                if ( name.length() > 0 )
                {
                    return "default".equals( name ) ? null : Names.named( name );
                }
            }
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
                if ( name.length() > 0 )
                {
                    return "default".equals( name ) ? null : guice;
                }
            }
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
        if ( qualifiedType.getSimpleName().startsWith( "Default" ) )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
            final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
            binder.addError( "Error creating instance of: " + type + " reason: " + cause );
            return null;
        }
        catch ( final LinkageError e )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeBinder.java`
#### Snippet
```java
        {
            binder.addError( "Error creating instance of: " + type + " reason: " + e );
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/PrioritySource.java`
#### Snippet
```java
            return ( (AnnotatedSource) source ).getAnnotation( binding, annotationType );
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/LocatorWiring.java`
#### Snippet
```java
                                                             : org.eclipse.sisu.inject.Legacy.adapt( beanEntries );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
                catch ( final Exception e )
                {
                    return null;
                }
                catch ( final LinkageError e )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
                catch ( final LinkageError e )
                {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
            return provider.get();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuBundlePlan.java`
#### Snippet
```java
    public BindingPublisher prepare( final Bundle bundle )
    {
        return appliesTo( bundle ) ? InjectorBindings.findBindingPublisher( inject( compose( bundle ) ) ) : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/HiddenSource.java`
#### Snippet
```java
            return ( (AnnotatedSource) source ).getAnnotation( binding, annotationType );
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
            addClassToIndex( NAMED, clazzName.replace( '/', '.' ) );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/TypePath.java`
#### Snippet
```java
  public static TypePath fromString(final String typePath) {
    if (typePath == null || typePath.length() == 0) {
      return null;
    }
    int typePathLength = typePath.length();
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/BeanProviders.java`
#### Snippet
```java
                }
                final Iterator<? extends BeanEntry<?, V>> itr = cachedLookup.iterator();
                return itr.hasNext() ? itr.next().getProvider().get() : null;
            }
        };
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
            return (V) converter.convert( (String) value, expectedType );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
    private static String nullify( final String value )
    {
        return "null".equals( value ) ? null : value;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/LazyBeanEntry.java`
#### Snippet
```java
    {
        final Description description = Sources.getAnnotation( binding, Description.class );
        return null != description ? description.value() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
            if ( objs.length == 1 )
            {
                return null;
            }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
            if ( null == ( o = content ) || ( index = o.indexOf( element ) ) < 0 )
            {
                return null;
            }
            n = o.remove( index );
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/RankedSequence.java`
#### Snippet
```java
    {
        final Content snapshot = content;
        return null != snapshot ? (T) snapshot.objs[0] : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Handler.java`
#### Snippet
```java
  static Handler removeRange(final Handler firstHandler, final Label start, final Label end) {
    if (firstHandler == null) {
      return null;
    } else {
      firstHandler.nextHandler = removeRange(firstHandler.nextHandler, start, end);
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Legacy.java`
#### Snippet
```java
        try
        {
            return null == delegate ? null : (T) proxyConstructor.newInstance( new InvocationHandler()
            {
                public Object invoke( final Object proxy, final Method method, final Object[] args )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Legacy.java`
#### Snippet
```java
    public static <Q extends Annotation, T, W> org.eclipse.sisu.Mediator<Q, T, W> adapt( final Mediator<Q, T, W> delegate )
    {
        return null == delegate ? null : new org.eclipse.sisu.Mediator<Q, T, W>()
        {
            public void add( final org.eclipse.sisu.BeanEntry<Q, T> entry, final W watcher )
```

### ReturnNull
Return of `null`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
    int constantPoolEntryIndex = readUnsignedShort(offset);
    if (offset == 0 || constantPoolEntryIndex == 0) {
      return null;
    }
    return readUtf(constantPoolEntryIndex, charBuffer);
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `injector` is redundant
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/Main.java`
#### Snippet
```java
        final BeanScanning scanning = BeanScanning.select( properties );
        final Module app = wire( scanning, modules );
        final Injector injector = Guice.createInjector( app );

        return injector;
```

### UnnecessaryLocalVariable
Local variable `end` is redundant
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Type.java`
#### Snippet
```java
    int hashCode = 13 * (sort == INTERNAL ? OBJECT : sort);
    if (sort >= ARRAY) {
      for (int i = valueBegin, end = valueEnd; i < end; i++) {
        hashCode = 17 * (hashCode + valueBuffer.charAt(i));
      }
```

### UnnecessaryLocalVariable
Local variable `otherEnd` is redundant
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Type.java`
#### Snippet
```java
    int end = valueEnd;
    int otherBegin = other.valueBegin;
    int otherEnd = other.valueEnd;
    // Compare the values.
    if (end - begin != otherEnd - otherBegin) {
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/InjectorBindings.java`
#### Snippet
```java
        if ( null == wildcards )
        {
            synchronized ( this )
            {
                if ( null == wildcards )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
        if ( mutated )
        {
            synchronized ( this )
            {
                if ( mutated )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
            return Collections.singleton( ( (LazyBeanEntry<?, T>) o ).binding );
        }
        synchronized ( this )
        {
            return new ArrayList( ( (Map<Binding, BeanEntry>) o ).keySet() );
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
            else
            {
                synchronized ( this )
                {
                    oldBean = ( (Map<?, LazyBeanEntry>) o ).remove( binding );
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
            else
            {
                synchronized ( this )
                {
                    final Map<Binding, LazyBeanEntry> map = (Map) o;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
                if ( NIL == value )
                {
                    synchronized ( this )
                    {
                        if ( NIL == value )
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/Main.java`
#### Snippet
```java
    public static Injector boot( final Map<?, ?> properties, final String... args )
    {
        return boot( properties, args, new Module[0] );
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
      final int maxLocals) {
    inputLocals = new int[maxLocals];
    inputStack = new int[0];
    int inputLocalIndex = 0;
    if ((access & Opcodes.ACC_STATIC) == 0) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Attribute.java`
#### Snippet
```java
   */
  protected Label[] getLabels() {
    return new Label[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DefaultBeanLocator.java`
#### Snippet
```java
            {
                // capture snapshot of current watchers while we hold the write-lock
                currentWatchers = cachedWatchers.keySet().toArray( new WatchedBeans[0] );
            }
            publisherLock.readLock().lock(); // begin downgrade to the read-lock
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DefaultBeanLocator.java`
#### Snippet
```java
            {
                // capture snapshot of current watchers while we hold the write-lock
                currentWatchers = cachedWatchers.keySet().toArray( new WatchedBeans[0] );
            }
            publisherLock.readLock().lock(); // begin downgrade to the read-lock
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/ZipEntryIterator.java`
#### Snippet
```java
        catch ( final IOException e )
        {
            entryNames = new String[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
   */
  public void accept(final ClassVisitor classVisitor, final int parsingOptions) {
    accept(classVisitor, new Attribute[0], parsingOptions);
  }

```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`false == iterator().hasNext()` can be simplified to '!iterator().hasNext()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/EntryMapAdapter.java`
#### Snippet
```java
        public boolean isEmpty()
        {
            return false == iterator().hasNext();
        }

```

### PointlessBooleanExpression
`false == iterator().hasNext()` can be simplified to '!iterator().hasNext()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/EntrySetAdapter.java`
#### Snippet
```java
    public boolean isEmpty()
    {
        return false == iterator().hasNext();
    }

```

### PointlessBooleanExpression
`false == iterator().hasNext()` can be simplified to '!iterator().hasNext()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/EntryListAdapter.java`
#### Snippet
```java
    public boolean isEmpty()
    {
        return false == iterator().hasNext();
    }

```

### PointlessBooleanExpression
`false == ( trimming && isWhitespace( c ) )` can be simplified to '!( trimming \&\& isWhitespace( c ) )'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/Tokens.java`
#### Snippet
```java
            {
                final char c = text.charAt( i );
                if ( c != separator && false == ( trimming && isWhitespace( c ) ) )
                {
                    return i;
```

### PointlessBooleanExpression
`false == value instanceof String` can be simplified to '!(value instanceof String)'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
        final Class<?> clazz = expectedType.getRawType();
        Object value = interpolate( template, clazz );
        if ( false == value instanceof String )
        {
            return (V) value; // found non-String mapping
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `code` is always 'null'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Attribute.java`
#### Snippet
```java
    final int maxStack = -1;
    final int maxLocals = -1;
    putAttributes(symbolTable, code, codeLength, maxStack, maxLocals, output);
  }

```

### ConstantValue
Value `code` is always 'null'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Attribute.java`
#### Snippet
```java
    final int maxStack = -1;
    final int maxLocals = -1;
    return computeAttributesSize(symbolTable, code, codeLength, maxStack, maxLocals);
  }

```

### ConstantValue
Value `n` is always 'null'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/BeanCache.java`
#### Snippet
```java
            }
        }
        while ( !MAPPING_UPDATER.compareAndSet( this, o, n ) );

        return oldBean;
```

### ConstantValue
Result of `BindingTargetVisitor.class.isInstance( ServletFinder.THIS )` is always 'true'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
        try
        {
            hasGuiceServlet = BindingTargetVisitor.class.isInstance( ServletFinder.THIS );
        }
        catch ( final LinkageError e )
```

### ConstantValue
Value `hasGuiceServlet` is always 'true'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Implementations.java`
#### Snippet
```java
            hasGuiceServlet = false;
        }
        HAS_GUICE_SERVLET = hasGuiceServlet;

        boolean hasJsr250Priority;
```

### ConstantValue
Condition `com.google.inject.spi.ElementSource.class.getMethod( "getDeclaringSource" ) != null` is always `true`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
        {
            // in Guice4 binding.getSource() returns ElementSource and not the original declaring source
            hasDeclaringSource = com.google.inject.spi.ElementSource.class.getMethod( "getDeclaringSource" ) != null; // NOSONAR
        }
        catch ( final Exception e )
```

### ConstantValue
Condition `ProviderInstanceBinding.class.getMethod( "getUserSuppliedProvider" ) != null` is always `true`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
        {
            // in Guice4 getProviderInstance() is deprecated in favour of getUserSuppliedProvider()
            hasUserSuppliedProvider = ProviderInstanceBinding.class.getMethod( "getUserSuppliedProvider" ) != null; // NOSONAR
        }
        catch ( final Exception e )
```

### ConstantValue
Condition `ProvidesMethodBinding.class instanceof Class` is always `true`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
        {
            // in Guice4 @Provides Method providers implement ProvidesMethodBinding
            hasProvidesMethodSpi = ProvidesMethodBinding.class instanceof Class<?>;
        }
        catch ( final Exception e )
```

### ConstantValue
Value `hasProvidesMethodSpi` is always 'true'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Guice4.java`
#### Snippet
```java
            hasProvidesMethodSpi = false;
        }
        HAS_PROVIDES_METHOD_SPI = hasProvidesMethodSpi;
    }

```

### ConstantValue
Condition `frameType >= Frame.CHOP_FRAME` is always `true`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassReader.java`
#### Snippet
```java
        context.currentFrameType = Opcodes.F_SAME1;
        context.currentFrameStackCount = 1;
      } else if (frameType >= Frame.CHOP_FRAME && frameType < Frame.SAME_FRAME_EXTENDED) {
        context.currentFrameType = Opcodes.F_CHOP;
        context.currentFrameLocalCountDelta = Frame.SAME_FRAME_EXTENDED - frameType;
```

