# sisu.plexus 
 
# Bad smells
I found 47 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CdiInjectionPointsInspection | 8 | false |
| ToArrayCallWithZeroLengthArrayArgument | 5 | true |
| FinalPrivateMethod | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| SimplifiableConditionalExpression | 4 | false |
| FinalStaticMethod | 4 | false |
| ExtendsAnnotation | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| ReturnFromFinallyBlock | 2 | false |
| CdiManagedBeanInconsistencyInspection | 1 | false |
| AutoCloseableResource | 1 | false |
| JavadocReference | 1 | false |
| DataFlowIssue | 1 | false |
| FieldMayBeFinal | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| UnnecessaryContinue | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PlexusBeanSource\[sources.size()\]'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusBeanBinder.java`
#### Snippet
```java
    {
        this.manager = manager;
        this.sources = sources.toArray( new PlexusBeanSource[sources.size()] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PlexusConfiguration\[children.size()\]'
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/configuration/DefaultPlexusConfiguration.java`
#### Snippet
```java
        if ( null != children )
        {
            return children.toArray( new PlexusConfiguration[children.size()] );
        }
        return NO_CHILDREN;
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PlexusConfiguration\[childIndex.size()\]'
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/configuration/DefaultPlexusConfiguration.java`
#### Snippet
```java
    public final PlexusConfiguration[] getChildren()
    {
        return childIndex.toArray( new PlexusConfiguration[childIndex.size()] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[attributeMap.size()\]'
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/configuration/DefaultPlexusConfiguration.java`
#### Snippet
```java
    public final String[] getAttributeNames()
    {
        return attributeMap.keySet().toArray( new String[attributeMap.size()] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PlexusBeanModule\[modules.size()\]'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusBindingModule.java`
#### Snippet
```java
    {
        this.manager = manager;
        this.modules = modules.toArray( new PlexusBeanModule[modules.size()] );
    }

```

## RuleId[id=CdiManagedBeanInconsistencyInspection]
### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/ComponentDescriptorBeanModule.java`
#### Snippet
```java
     * {@link DeferredClass} backed by a {@link ComponentDescriptor} and {@link ComponentFactory} hint.
     */
    private static final class DeferredFactoryClass
        implements DeferredClass<Object>, DeferredProvider<Object>
    {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ClassRealm' used without 'try'-with-resources statement
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/configurator/converters/special/ClassRealmConverter.java`
#### Snippet
```java
            else
            {
                stack.removeFirst();
            }
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusAnnotatedMetadata.java`
#### Snippet
```java
        }
        // use same interpolation method as XML for sake of consistency
        final Reader r = new InterpolationFilterReader( new StringReader( text ), variables );
        try
        {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusXmlScanner.java`
#### Snippet
```java
        if ( null != variables )
        {
            return new InterpolationFilterReader( reader, variables );
        }
        return reader;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `BeanPropertyBinder`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusPropertyBinder.java`
#### Snippet
```java

/**
 * {@link BeanPropertyBinder} that auto-binds properties according to Plexus metadata.
 */
final class PlexusPropertyBinder
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusAnnotatedBeanModule.java`
#### Snippet
```java
        if ( spaceModule instanceof SpaceModule )
        {
            spaceModule = ( (SpaceModule) spaceModule ).with( _strategy );
        }
        return this;
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
            finally
            {
                return; // ignore any logging exceptions and continue with shutdown
            }
        }
```

### ReturnFromFinallyBlock
'return' inside 'finally' block
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
            finally
            {
                return; // ignore any logging exceptions and continue with shutdown
            }
        }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `context` may be 'final'
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/configurator/converters/special/ClassRealmConverter.java`
#### Snippet
```java
    extends AbstractConfigurationConverter
{
    private static ThreadLocal<Object> context = new ThreadLocal<Object>();

    private final ClassRealm realm;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'RequirementImpl' is still used
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/RequirementImpl.java`
#### Snippet
```java
     */
    @Deprecated
    public RequirementImpl( final Class<?> role, final boolean optional, final String... hints )
    {
        this( new LoadedClass<Object>( role ), optional, Arrays.asList( hints ) );
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'ComponentImpl' implements annotation interface `Component`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/ComponentImpl.java`
#### Snippet
```java
 */
public final class ComponentImpl
    implements Component
{
    // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'RequirementImpl' implements annotation interface `Requirement`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/RequirementImpl.java`
#### Snippet
```java
 */
public final class RequirementImpl
    implements Requirement
{
    // ----------------------------------------------------------------------
```

### ExtendsAnnotation
Class 'ConfigurationImpl' implements annotation interface `Configuration`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/ConfigurationImpl.java`
#### Snippet
```java
 */
public final class ConfigurationImpl
    implements Configuration
{
    // ----------------------------------------------------------------------
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusDateTypeConverter.java`
#### Snippet
```java
            catch ( final ParseException e )
            {
                continue; // try another format
            }
        }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `f`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusDateTypeConverter.java`
#### Snippet
```java
            try
            {
                synchronized ( f ) // formats are not thread-safe!
                {
                    return f.parse( value );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `deque`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
    private static <T> void synchronizedPush( final Deque<T> deque, final T element )
    {
        synchronized ( deque ) // NOSONAR
        {
            deque.addLast( element );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `deque`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
    private static boolean synchronizedRemove( final Deque<?> deque, final Object element )
    {
        synchronized ( deque ) // NOSONAR
        {
            return deque.remove( element );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `deque`
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
    private static <T> T synchronizedPop( final Deque<T> deque )
    {
        synchronized ( deque ) // NOSONAR
        {
            return deque.pollLast();
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/PlexusTestCase.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private final ContainerConfiguration config()
    {
        final ContainerConfiguration config = new DefaultContainerConfiguration();
```

### FinalPrivateMethod
'private' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/PlexusTestCase.java`
#### Snippet
```java
    }

    private final Map<Object, Object> context()
    {
        final Context context = new DefaultContext();
```

### FinalPrivateMethod
'private' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/repository/ComponentRequirement.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private final String id()
    {
        return role + ':' + hint;
```

### FinalPrivateMethod
'private' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/repository/ComponentDescriptor.java`
#### Snippet
```java
    }

    private static final int hash( final Object obj )
    {
        return null != obj ? obj.hashCode() : 0;
```

### FinalPrivateMethod
'private' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/repository/ComponentDescriptor.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private static final <T> boolean equals( final T lhs, final T rhs )
    {
        return null != lhs ? lhs.equals( rhs ) : null == rhs;
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusSpaceModule.java`
#### Snippet
```java
        @Inject
        @SuppressWarnings( { "rawtypes", "unchecked" } )
        protected void setParameters( @Parameters final Map parameters, final PlexusContainer container )
        {
            contextData.putAll( parameters );
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PseudoPlexusContainer.java`
#### Snippet
```java

    @Inject
    PseudoPlexusContainer( final PlexusBeanLocator locator, final BeanManager manager, final Context context )
    {
        this.locator = locator;
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PseudoPlexusContainer.java`
#### Snippet
```java

    @Inject
    PseudoPlexusContainer( final PlexusBeanLocator locator, final BeanManager manager, final Context context )
    {
        this.locator = locator;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java

    @Inject
    PlexusXmlBeanConverter( final Injector injector )
    {
        typeConverterBindings = injector.getTypeConverterBindings();
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusSpaceModule.java`
#### Snippet
```java
        @Inject
        @SuppressWarnings( { "rawtypes", "unchecked" } )
        protected void setParameters( @Parameters final Map parameters, final PlexusContainer container )
        {
            contextData.putAll( parameters );
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusSpaceModule.java`
#### Snippet
```java
        @Inject
        @SuppressWarnings( { "rawtypes", "unchecked" } )
        protected void setParameters( @Parameters final Map parameters, final PlexusContainer container )
        {
            contextData.putAll( parameters );
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/ComponentDescriptorBeanModule.java`
#### Snippet
```java

        @Inject
        private PlexusContainer container;

        @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/ComponentDescriptorBeanModule.java`
#### Snippet
```java

        @Inject
        private Injector injector;

        private final ComponentDescriptor<?> cd;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/DefaultPlexusBeanLocator.java`
#### Snippet
```java

    @Inject
    public DefaultPlexusBeanLocator( final BeanLocator beanLocator )
    {
        this( beanLocator, null, null );
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`null != delegate ? delegate.manage( bean ) : true` can be simplified to 'null==delegate \|\| delegate.manage( bean )'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
            schedule( bean );
        }
        return null != delegate ? delegate.manage( bean ) : true;
    }

```

### SimplifiableConditionalExpression
`null != delegate ? delegate.manage( clazz ) : false` can be simplified to 'null != delegate \&\& delegate.manage( clazz )'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
            }
        }
        return null != delegate ? delegate.manage( clazz ) : false;
    }

```

### SimplifiableConditionalExpression
`null != delegate ? delegate.unmanage( bean ) : true` can be simplified to 'null==delegate \|\| delegate.unmanage( bean )'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
            dispose( (Disposable) bean );
        }
        return null != delegate ? delegate.unmanage( bean ) : true;
    }

```

### SimplifiableConditionalExpression
`null != delegate ? delegate.unmanage() : true` can be simplified to 'null==delegate \|\| delegate.unmanage()'
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusLifecycleManager.java`
#### Snippet
```java
            dispose( bean );
        }
        return null != delegate ? delegate.unmanage() : true;
    }

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/configurator/converters/composite/AbstractCollectionConverter.java`
#### Snippet
```java
    }

    protected final static PlexusConfiguration csvToXml( final PlexusConfiguration configuration, final String csv )
    {
        final PlexusConfiguration xml = new XmlPlexusConfiguration( configuration.getName() );
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/logging/BaseLoggerManager.java`
#### Snippet
```java
    }

    public static final int parseThreshold( final String text )
    {
        if ( "DEBUG".equalsIgnoreCase( text ) )
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/repository/ComponentDescriptor.java`
#### Snippet
```java
    }

    private static final int hash( final Object obj )
    {
        return null != obj ? obj.hashCode() : 0;
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/component/repository/ComponentDescriptor.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private static final <T> boolean equals( final T lhs, final T rhs )
    {
        return null != lhs ? lhs.equals( rhs ) : null == rhs;
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `org.eclipse.sisu.plexus/src/main/java/org/eclipse/sisu/plexus/PlexusXmlScanner.java`
#### Snippet
```java
            {
                // follow up with basic footer
                buf.append( "</" + name + '>' );
            }
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `org.eclipse.sisu.plexus/src/main/java/org/codehaus/plexus/PlexusTestCase.java`
#### Snippet
```java
        if ( !home.isDirectory() )
        {
            home.mkdirs();
        }
        return home.getAbsolutePath();
```

