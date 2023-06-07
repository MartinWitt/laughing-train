# sisu.inject 
 
# Bad smells
I found 183 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 31 | false |
| PointlessBitwiseExpression | 27 | false |
| Deprecation | 12 | false |
| DuplicatedCode | 10 | false |
| ConstantValue | 10 | false |
| ToArrayCallWithZeroLengthArrayArgument | 9 | true |
| CdiInjectionPointsInspection | 7 | false |
| RedundantTypeArguments | 6 | false |
| ExtendsAnnotation | 6 | false |
| DeprecatedIsStillUsed | 5 | false |
| FinalStaticMethod | 5 | false |
| PointlessBooleanExpression | 5 | true |
| CharsetObjectCanBeUsed | 4 | false |
| JavadocDeclaration | 4 | false |
| UnnecessaryModifier | 3 | true |
| FinalMethodInFinalClass | 3 | false |
| SuspiciousMethodCalls | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| JUnitMixedFramework | 2 | false |
| CdiManagedBeanInconsistencyInspection | 2 | false |
| DataFlowIssue | 2 | false |
| RedundantClassCall | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| IOStreamConstructor | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| DoubleNegation | 1 | false |
| UnnecessarySemicolon | 1 | false |
| UnaryPlus | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| RedundantCollectionOperation | 1 | false |
| ContinueOrBreakFromFinallyBlock | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialIf | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UNUSED_IMPORT | 1 | false |
| FieldMayBeFinal | 1 | false |
| CdiInjectInspection | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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
Call to `toArray()` with pre-sized array argument 'new URL\[expandedPath.size()\]'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/URLClassSpace.java`
#### Snippet
```java
        }

        return expandedPath.toArray( new URL[expandedPath.size()] );
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

## RuleId[id=JUnitMixedFramework]
### JUnitMixedFramework
Method `tearDown()` annotated with '@After' inside class extending JUnit 5 TestCase
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTest.java`
#### Snippet
```java
    @AfterMethod
    @AfterEach
    public void tearDown()
        throws Exception
    {
```

### JUnitMixedFramework
Method `setUp()` annotated with '@Before' inside class extending JUnit 5 TestCase
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/InjectedTest.java`
#### Snippet
```java
    @BeforeMethod
    @BeforeEach
    public void setUp()
        throws Exception
    {
```

## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=CdiManagedBeanInconsistencyInspection]
### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
 * Provides a single bean; the name used to lookup/convert the bean is selected at runtime.
 */
final class PlaceholderBeanProvider<V>
    implements Provider<V>
{
```

### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/Main.java`
#### Snippet
```java
 * Bootstrap class that creates a static {@link Injector} by scanning the current class-path for beans.
 */
public final class Main
    implements Module
{
```

## RuleId[id=DoubleNegation]
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

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `computeAllFrames` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
 *   <li>After all instructions have been visited, a fix point algorithm is used in MethodWriter to
 *       compute the "input frame" of each basic block (i.e. the stack map frame at the beginning of
 *       the basic block). See {@link MethodWriter#computeAllFrames}.
 * </ul>
 *
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this field. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this field. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this field. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this field. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this record component. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this record component. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this record component. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this record component. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Cannot resolve symbol `toString()`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/QualifiedTypeVisitor.java`
#### Snippet
```java

    /**
     * Finds source of current class; detailed location or {@link ClassSpace#toString()}.
     */
    private String findSource()
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this class. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this class. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this class. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this class. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `computeMaxStackAndLocal` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Label.java`
#### Snippet
```java
   * several subroutines, this is the id of the "oldest" subroutine that contains it (with the
   * convention that a subroutine calling another one is "older" than the callee). This field is
   * computed in {@link MethodWriter#computeMaxStackAndLocal}, if the method contains JSR
   * instructions.
   */
```

### JavadocReference
Symbol `computeAllFrames` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Label.java`
#### Snippet
```java
   * this is not used in practice).
   *
   * <p>List of labels are used in {@link MethodWriter#computeAllFrames} and {@link
   * MethodWriter#computeMaxStackAndLocal} to compute stack map frames and the maximum stack size,
   * respectively, as well as in {@link #markSubroutine} and {@link #addSubroutineRetSuccessors} to
```

### JavadocReference
Symbol `computeMaxStackAndLocal` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Label.java`
#### Snippet
```java
   *
   * <p>List of labels are used in {@link MethodWriter#computeAllFrames} and {@link
   * MethodWriter#computeMaxStackAndLocal} to compute stack map frames and the maximum stack size,
   * respectively, as well as in {@link #markSubroutine} and {@link #addSubroutineRetSuccessors} to
   * compute the basic blocks belonging to subroutines and their outgoing edges. Outside of these
```

### JavadocReference
Symbol `computeMaxStackAndLocal` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Label.java`
#### Snippet
```java
  /**
   * The number of elements in the input stack of the basic block corresponding to this label. This
   * field is computed in {@link MethodWriter#computeMaxStackAndLocal}.
   */
  short inputStackSize;
```

### JavadocReference
Cannot resolve symbol `path`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/URLClassSpace.java`
#### Snippet
```java
     * Normalizes the given class path entry by removing any extraneous "jar:"..."!/" padding.
     * 
     * @param path The URL to normalize
     * @return Normalized class path entry
     */
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of the Code attribute. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this method. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `CONSTANT_KIND` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * operand stack elements. In summary frame[0] = offset, frame[1] = numLocal, frame[2] = numStack.
   * Local variables and operand stack entries contain abstract types, as defined in {@link Frame},
   * but restricted to {@link Frame#CONSTANT_KIND}, {@link Frame#REFERENCE_KIND} or {@link
   * Frame#UNINITIALIZED_KIND} abstract types. Long and double types use only one array entry.
   */
```

### JavadocReference
Symbol `REFERENCE_KIND` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * operand stack elements. In summary frame[0] = offset, frame[1] = numLocal, frame[2] = numStack.
   * Local variables and operand stack entries contain abstract types, as defined in {@link Frame},
   * but restricted to {@link Frame#CONSTANT_KIND}, {@link Frame#REFERENCE_KIND} or {@link
   * Frame#UNINITIALIZED_KIND} abstract types. Long and double types use only one array entry.
   */
```

### JavadocReference
Symbol `UNINITIALIZED_KIND` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * Local variables and operand stack entries contain abstract types, as defined in {@link Frame},
   * but restricted to {@link Frame#CONSTANT_KIND}, {@link Frame#REFERENCE_KIND} or {@link
   * Frame#UNINITIALIZED_KIND} abstract types. Long and double types use only one array entry.
   */
  private int[] currentFrame;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this method. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Cannot resolve symbol `COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES`
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * Indicates what must be computed. Must be one of {@link #COMPUTE_ALL_FRAMES}, {@link
   * #COMPUTE_INSERTED_FRAMES}, {@link COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES}, {@link
   * #COMPUTE_MAX_STACK_AND_LOCAL} or {@link #COMPUTE_NOTHING}.
   */
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * The runtime visible parameter annotations of this method. Each array element contains the last
   * annotation of a parameter (which can be {@literal null} - the previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field). May be {@literal null}.
   */
  private AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of the Code attribute. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * The runtime invisible parameter annotations of this method. Each array element contains the
   * last annotation of a parameter (which can be {@literal null} - the previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field). May be {@literal null}.
   */
  private AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this method. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this method. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=RedundantClassCall]
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

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java

  /** The constant to be added to an abstract type to get one with one more array dimension. */
  private static final int ARRAY_OF = +1 << DIM_SHIFT;

  /** The constant to be added to an abstract type to get one with one less array dimension. */
```

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=CStyleArrayDeclaration]
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
   * @param attributePrototypes a set of attribute prototypes.
   */
  final void collectAttributePrototypes(final Attribute.Set attributePrototypes) {
    attributePrototypes.addAttributes(firstAttribute);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentWriter.java`
#### Snippet
```java
   * @param attributePrototypes a set of attribute prototypes.
   */
  final void collectAttributePrototypes(final Attribute.Set attributePrototypes) {
    attributePrototypes.addAttributes(firstAttribute);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * @param attributePrototypes a set of attribute prototypes.
   */
  final void collectAttributePrototypes(final Attribute.Set attributePrototypes) {
    attributePrototypes.addAttributes(firstAttribute);
    attributePrototypes.addAttributes(firstCodeAttribute);
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/ResourceEnumeration.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private static final Iterator<String> NO_ENTRIES = Collections.<String> emptySet().iterator();

    // ----------------------------------------------------------------------
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildKeys.java`
#### Snippet
```java
        compact();

        return new AbstractSet<Entry<K, V>>()
        {
            @Override
            public Iterator<Entry<K, V>> iterator()
            {
                return new EntryItr();
            }

            @Override
            public int size()
            {
                return map.size();
            }
        };
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ByteVector.java`
#### Snippet
```java
    currentData[currentLength++] = (byte) (intValue >>> 24);
    currentData[currentLength++] = (byte) (intValue >>> 16);
    currentData[currentLength++] = (byte) (intValue >>> 8);
    currentData[currentLength++] = (byte) intValue;
    length = currentLength;
    return this;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldWriter.java`
#### Snippet
```java
    if ((accessFlags & Opcodes.ACC_SYNTHETIC) != 0 && useSyntheticAttribute) {
      ++attributesCount;
    }
    if (signatureIndex != 0) {
      ++attributesCount;
    }
    if ((accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
      ++attributesCount;
    }
    if (lastRuntimeVisibleAnnotation != null) {
      ++attributesCount;
    }
    if (lastRuntimeInvisibleAnnotation != null) {
      ++attributesCount;
    }
    if (lastRuntimeVisibleTypeAnnotation != null) {
      ++attributesCount;
    }
    if (lastRuntimeInvisibleTypeAnnotation != null) {
      ++attributesCount;
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
    if (lastRuntimeVisibleTypeAnnotation != null) {
      ++attributeCount;
    }
    if (lastRuntimeInvisibleTypeAnnotation != null) {
      ++attributeCount;
    }
    if (defaultValue != null) {
      ++attributeCount;
    }
    if (parameters != null) {
      ++attributeCount;
    }
    if (firstAttribute != null) {
      attributeCount += firstAttribute.getAttributeCount();
    }
    // For ease of reference, we use here the same attribute order as in Section 4.7 of the JVMS.
    output.putShort(attributeCount);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
    int inputLocalIndex = 0;
    for (int i = 0; i < numLocal; ++i) {
      inputLocals[inputLocalIndex++] = getAbstractTypeFromApiFormat(symbolTable, local[i]);
      if (local[i] == Opcodes.LONG || local[i] == Opcodes.DOUBLE) {
        inputLocals[inputLocalIndex++] = TOP;
      }
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
    if (outputLocals == null) {
      outputLocals = new int[10];
    }
    int outputLocalsLength = outputLocals.length;
    if (localIndex >= outputLocalsLength) {
      int[] newOutputLocals = new int[Math.max(localIndex + 1, 2 * outputLocalsLength)];
      System.arraycopy(outputLocals, 0, newOutputLocals, 0, outputLocalsLength);
      outputLocals = newOutputLocals;
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
    int initializationsLength = initializations.length;
    if (initializationCount >= initializationsLength) {
      int[] newInitializations =
          new int[Math.max(initializationCount + 1, 2 * initializationsLength)];
      System.arraycopy(initializations, 0, newInitializations, 0, initializationsLength);
      initializations = newInitializations;
    }
    // Store the abstract type.
    initializations[initializationCount++] = abstractType;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/Frame.java`
#### Snippet
```java
        if (arg > 0) {
          int previousLocalType = getLocal(arg - 1);
          if (previousLocalType == LONG || previousLocalType == DOUBLE) {
            setLocal(arg - 1, TOP);
          } else if ((previousLocalType & KIND_MASK) == LOCAL_KIND
              || (previousLocalType & KIND_MASK) == STACK_KIND) {
            // The type of the previous local variable is not known yet, but if it later appears
            // to be LONG or DOUBLE, we should then use TOP instead.
            setLocal(arg - 1, previousLocalType | TOP_IF_LONG_OR_DOUBLE_FLAG);
          }
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ModuleWriter.java`
#### Snippet
```java
    exports.putShort(symbolTable.addConstantPackage(packaze).index).putShort(access);
    if (modules == null) {
      exports.putShort(0);
    } else {
      exports.putShort(modules.length);
      for (String module : modules) {
        exports.putShort(symbolTable.addConstantModule(module).index);
      }
    }
    exportsCount++;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
    int hashCode = hash(tag, value);
    Entry entry = get(hashCode);
    while (entry != null) {
      if (entry.tag == tag && entry.hashCode == hashCode && entry.data == value) {
        return entry;
      }
      entry = entry.next;
    }
```

## RuleId[id=ContinueOrBreakFromFinallyBlock]
### ContinueOrBreakFromFinallyBlock
`continue` inside 'finally' block
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/BeanLifecycle.java`
#### Snippet
```java
                finally
                {
                    continue; // ignore any logging exceptions and continue stopping
                }
            }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
        throws IOException
    {
        return new InputStreamReader( new FileInputStream( new File( targetDirectory, path ) ), "UTF-8" );
    }

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndex.java`
#### Snippet
```java
        if ( parent.isDirectory() || parent.mkdirs() )
        {
            return new OutputStreamWriter( new FileOutputStream( index ), "UTF-8" );
        }
        throw new IOException( "Error creating: " + parent );
```

## RuleId[id=Deprecation]
### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/RecordComponentVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ModuleVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ModuleVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/FieldVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/AnnotationVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

## RuleId[id=UnnecessaryReturn]
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

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/TypeConverterCache.java`
#### Snippet
```java

    @Inject
    TypeConverterCache( final Injector injector )
    {
        this.injector = injector;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/PlaceholderBeanProvider.java`
#### Snippet
```java
    @Parameters
    @SuppressWarnings( "rawtypes" )
    private Map properties;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DefaultBeanLocator.java`
#### Snippet
```java
     */
    @Inject
    void autoPublish( final Injector injector )
    {
        add( InjectorBindings.findBindingPublisher( injector ) );
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DefaultBeanLocator.java`
#### Snippet
```java
     */
    @Inject
    static void autoPublishChild( final Injector childInjector )
    {
        // Child injectors cannot use the first 'autoPublish' trick because the locator binding is typically inherited
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/InjectorBindings.java`
#### Snippet
```java

    @Inject
    public InjectorBindings( final Injector injector )
    {
        this( injector, findRankingFunction( injector ) );
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/AbstractDeferredClass.java`
#### Snippet
```java

    @Inject
    private Injector injector;

    // ----------------------------------------------------------------------
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/StringProperties.java`
#### Snippet
```java
    @Inject
    @SuppressWarnings( "rawtypes" )
    StringProperties( @Parameters final Map delegate )
    {
        this.delegate = delegate;
```

## RuleId[id=FinalStaticMethod]
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

## RuleId[id=ManualMinMaxCalculation]
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'ConcurrentMap.remove()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildConcurrentValues.java`
#### Snippet
```java
        {
            // only remove this specific key-value mapping; thread-safe
            concurrentMap.remove( ( (InverseMapping) ref ).key(), ref );
        }
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
            // only remove this specific key-value mapping
            final Object key = ( (InverseMapping) ref ).key();
            if ( map.get( key ) == ref )
            {
                map.remove( key );
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/MildValues.java`
#### Snippet
```java
            if ( map.get( key ) == ref )
            {
                map.remove( key );
            }
        }
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuExtender.java`
#### Snippet
```java
    // track locators (per-extender-bundle) so they can be re-used when possible
    private static final Map<Long, MutableBeanLocator> locators =
        Collections.synchronizedMap( Weak.<Long, MutableBeanLocator> values() );

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/DependencyAnalyzer.java`
#### Snippet
```java
    {
        RESTRICTED_CLASSES =
            new HashSet<Class<?>>( Arrays.<Class<?>> asList( AbstractModule.class, Binder.class, Binding.class,
                                                             Injector.class, Key.class, Logger.class,
                                                             MembersInjector.class, Module.class, Provider.class,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/launch/SisuTracker.java`
#### Snippet
```java
    // attempt to track publishers across extender restarts
    private static final Map<Long, Object> bundlePublishers =
        Collections.synchronizedMap( Weak.<Long, Object> values() );

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/BundleClassSpace.java`
#### Snippet
```java
    private static final URL[] NO_URLS = {};

    private static final Enumeration<URL> NO_ENTRIES = Collections.enumeration( Collections.<URL> emptySet() );

    // ----------------------------------------------------------------------
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/URLClassSpace.java`
#### Snippet
```java
    private static final URL[] NO_URLS = {};

    private static final Enumeration<URL> NO_ENTRIES = Collections.enumeration( Collections.<URL> emptySet() );

    private static final String[] EMPTY_CLASSPATH = {};
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/Legacy.java`
#### Snippet
```java
    @SuppressWarnings( "rawtypes" )
    private static final Legacy<org.eclipse.sisu.BeanEntry<?, ?>> LEGACY_BEAN_ENTRY =
        Legacy.<org.eclipse.sisu.BeanEntry<?, ?>, BeanEntry> as( BeanEntry.class );

    // ----------------------------------------------------------------------
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
   *     is not required to correspond to the i'th parameter descriptor in the method
   *     descriptor</i>, in particular in case of synthetic parameters (see
   *     https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   * @param descriptor the class descriptor of the annotation class.
   * @param visible {@literal true} if the annotation is visible at runtime.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodVisitor.java`
#### Snippet
```java
   *     be strictly less when a method has synthetic parameters and when these parameters are
   *     ignored when computing parameter indices for the purpose of parameter annotations (see
   *     https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   * @param visible {@literal true} to define the number of method parameters that can have
   *     annotations visible at runtime, {@literal false} to define the number of method parameters
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
    }
    if (exceptionsOffset == 0) {
      if (numberOfExceptions != 0) {
        return false;
      }
```

## RuleId[id=CharsetObjectCanBeUsed]
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
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/SisuIndexAPT6.java`
#### Snippet
```java
    {
        final FileObject file = environment.getFiler().getResource( StandardLocation.CLASS_OUTPUT, "", path );
        return new InputStreamReader( file.openInputStream(), "UTF-8" );
    }

```

## RuleId[id=IfStatementWithIdenticalBranches]
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/ClassWriter.java`
#### Snippet
```java
   * map frames are recomputed from the methods bytecode. The arguments of the {@link
   * MethodVisitor#visitMaxs} method are also ignored and recomputed from the bytecode. In other
   * words, {@link #COMPUTE_FRAMES} implies {@link #COMPUTE_MAXS}.
   *
   * @see #ClassWriter(int)
```

### JavadocDeclaration
`@param clazz` tag description is missing
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/bean/LifecycleBuilder.java`
#### Snippet
```java
     * Ignores methods overridden in subclasses, as well as multiple declarations of each annotation.
     * 
     * @param clazz
     */
    private void addLifecycleMethods( final Class<?> clazz )
```

### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * the beginning of {@link #currentBasicBlock}, i.e. the true maximum stack size after the last
   * visited instruction is equal to the {@link Label#inputStackSize} of the current basic block
   * plus {@link #maxRelativeStackSize}.When {@link #compute} is equal to {@link
   * #COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES}, {@link #currentBasicBlock} is always the start of
   * the method, so this relative size is also equal to the absolute maximum stack size after the
```

### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/MethodWriter.java`
#### Snippet
```java
   * The relative stack size after the last visited instruction. This size is relative to the
   * beginning of {@link #currentBasicBlock}, i.e. the true stack size after the last visited
   * instruction is equal to the {@link Label#inputStackSize} of the current basic block plus {@link
   * #relativeStackSize}. When {@link #compute} is equal to {@link
   * #COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES}, {@link #currentBasicBlock} is always the start of
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `constantPool` may be 'final'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/space/asm/SymbolTable.java`
#### Snippet
```java
   * The ClassFile's constant_pool_count field is <i>not</i> included.
   */
  private ByteVector constantPool;

  /**
```

## RuleId[id=ExtendsAnnotation]
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

## RuleId[id=PointlessBitwiseExpression]
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
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
  int V21 = 0 << 16 | 65;
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
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
  int V21 = 0 << 16 | 65;

  /**
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
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
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
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
  int V21 = 0 << 16 | 65;

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
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
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
  int V16 = 0 << 16 | 60;
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
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
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

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=CdiInjectInspection]
### CdiInjectInspection
@Inject method cannot be static
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/inject/DefaultBeanLocator.java`
#### Snippet
```java
     */
    @Inject
    static void autoPublishChild( final Injector childInjector )
    {
        // Child injectors cannot use the first 'autoPublish' trick because the locator binding is typically inherited
```

## RuleId[id=PointlessBooleanExpression]
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
`false == iterator().hasNext()` can be simplified to '!iterator().hasNext()'
in `org.eclipse.sisu.inject/src/main/java/org/eclipse/sisu/wire/EntryMapAdapter.java`
#### Snippet
```java
        public boolean isEmpty()
        {
            return false == iterator().hasNext();
        }

```

## RuleId[id=ConstantValue]
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

