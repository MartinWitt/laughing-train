# maven-integration-testing 
 
# Bad smells
I found 377 bad smells with 87 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 100 | false |
| UnnecessaryFullyQualifiedName | 57 | false |
| NonStrictComparisonCanBeEquality | 33 | true |
| UnnecessaryStringEscape | 20 | true |
| MismatchedCollectionQueryUpdate | 19 | false |
| CharsetObjectCanBeUsed | 17 | false |
| UseOfPropertiesAsHashtable | 13 | false |
| EmptyMethod | 13 | false |
| ReturnNull | 13 | false |
| SizeReplaceableByIsEmpty | 12 | true |
| UtilityClassWithoutPrivateConstructor | 11 | true |
| NonFinalFieldOfException | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| UnusedAssignment | 5 | false |
| RedundantArrayCreation | 4 | true |
| TrivialStringConcatenation | 4 | false |
| SystemOutErr | 4 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| IOResource | 2 | false |
| ObsoleteCollection | 2 | false |
| UnnecessaryReturn | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| MissingDeprecatedAnnotation | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| ConstantValue | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| RedundantSuppression | 1 | false |
| EqualsHashCodeCalledOnUrl | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| NestedAssignment | 1 | false |
| RedundantFieldInitialization | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
| TestCaseWithNoTestMethods | 1 | false |
## RuleId[id=IOResource]
### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
         * increasing test coverage for its implementation.
         */
        ClassLoader childClassLoader = new URLClassLoader( new URL[0], classLoader );

        Properties loaderProperties = new Properties();
```

### IOResource
'DigestInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        try ( FileInputStream is = new FileInputStream( jarFile ) )
        {
            DigestInputStream dis = new DigestInputStream( is, digester );

            for ( byte[] buffer = new byte[1024 * 4]; dis.read( buffer ) >= 0; )
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `serverIds` are read, but never written to
in `core-it-support/core-it-plugins/maven-it-plugin-uses-wagon/src/main/java/org/apache/maven/plugin/coreit/DumpAuthMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] serverIds;

    /**
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PropertiesUtil` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/PropertiesUtil.java`
#### Snippet
```java
 *
 */
class PropertiesUtil
{

```

### UtilityClassWithoutPrivateConstructor
Class `ClassB` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/dep-b/src/main/java/org/apache/maven/plugin/coreit/ClassB.java`
#### Snippet
```java
 *
 */
public class ClassB
{

```

### UtilityClassWithoutPrivateConstructor
Class `SomeClass` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/dep-b/src/main/java/org/apache/maven/plugin/coreit/SomeClass.java`
#### Snippet
```java
 *
 */
public class SomeClass
{

```

### UtilityClassWithoutPrivateConstructor
Class `SomeClass` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/dep-a/src/main/java/org/apache/maven/plugin/coreit/SomeClass.java`
#### Snippet
```java
 *
 */
public class SomeClass
{

```

### UtilityClassWithoutPrivateConstructor
Class `ClassA` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/dep-a/src/main/java/org/apache/maven/plugin/coreit/ClassA.java`
#### Snippet
```java
 *
 */
public class ClassA
{

```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionUtil` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
 *
 */
class ExpressionUtil
{

```

### UtilityClassWithoutPrivateConstructor
Class `AnsiSupport` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AnsiSupport.java`
#### Snippet
```java
 * Basic Ansi support: can't use Ansi because IT is executed in separate classloader.
 */
class AnsiSupport
{
    private static final String ESC = String.valueOf( (char) 27 ) + '[';
```

### UtilityClassWithoutPrivateConstructor
Class `Premain` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-javaagent/src/main/java/org/apache/maven/coreits/javaagent/mng5669/Premain.java`
#### Snippet
```java
 *
 */
public class Premain
{
    public static void premain( String agentArgs, Instrumentation inst )
```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionUtil` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
 *
 */
class ExpressionUtil
{

```

### UtilityClassWithoutPrivateConstructor
Class `PropertyUtil` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
 *
 */
class PropertyUtil
{

```

### UtilityClassWithoutPrivateConstructor
Class `PropertiesUtil` has only 'static' members, and lacks a 'private' constructor
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/PropertiesUtil.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
class PropertiesUtil
{

```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "Unexpected result, final name of executed project is "
                + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME + "\')." );
        }

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "Unexpected result, final name of executed project is "
                + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME + "\')." );
        }

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleMojo.java`
#### Snippet
```java
        if ( project.getBuild().getFinalName().equals( TouchMojo.FINAL_NAME ) )
        {
            throw new MojoExecutionException( "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME
                + "\')." );
        }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME
                + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalAggregatorMojo.java`
#### Snippet
```java
                throw new MojoExecutionException(
                    "Unexpected result, final name of executed project " + executedProject + " is "
                        + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME
                        + "\')." );
            }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalAggregatorMojo.java`
#### Snippet
```java
                    "Unexpected result, final name of executed project " + executedProject + " is "
                        + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME
                        + "\')." );
            }
        }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalAggregatorMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException(
                "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalAggregatorMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException(
                "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleNoProjectMojo.java`
#### Snippet
```java
        if ( TouchMojo.FINAL_NAME.equals( finalName ) )
        {
            throw new MojoExecutionException( "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME
                + "\')." );
        }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleNoProjectMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME
                + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "Unexpected result, final name of executed project is "
                + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME + "\')." );
        }

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "Unexpected result, final name of executed project is "
                + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME + "\')." );
        }

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalMojo.java`
#### Snippet
```java
        if ( project.getBuild().getFinalName().equals( TouchMojo.FINAL_NAME ) )
        {
            throw new MojoExecutionException( "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME
                + "\')." );
        }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException( "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME
                + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleAggregatorMojo.java`
#### Snippet
```java
                throw new MojoExecutionException(
                    "Unexpected result, final name of executed project " + executedProject + " is "
                        + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME
                        + "\')." );
            }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleAggregatorMojo.java`
#### Snippet
```java
                    "Unexpected result, final name of executed project " + executedProject + " is "
                        + executedProject.getBuild().getFinalName() + " (should be \'" + TouchMojo.FINAL_NAME
                        + "\')." );
            }
        }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleAggregatorMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException(
                "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleAggregatorMojo.java`
#### Snippet
```java
        {
            throw new MojoExecutionException(
                "forked project was polluted. (should NOT be \'" + TouchMojo.FINAL_NAME + "\')." );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CoreItTouchMojo.java`
#### Snippet
```java
        if ( fail )
        {
            throw new MojoExecutionException( "Failing per \'fail\' parameter"
                + " (specified in pom or system properties)" );
        }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CoreItTouchMojo.java`
#### Snippet
```java
        if ( fail )
        {
            throw new MojoExecutionException( "Failing per \'fail\' parameter"
                + " (specified in pom or system properties)" );
        }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `children`
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/PropertiesUtil.java`
#### Snippet
```java
            }

            PlexusConfiguration children[] = config.getChildren();
            props.setProperty( key + ".children", Integer.toString( children.length ) );
            Map<String, Integer> indices = new HashMap<>();
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `javaVersion` from instance context
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
                version = matcher.group( 1 );
            }
            javaVersion = new DefaultArtifactVersion( version );
        }
        return javaVersion;
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckThreadSafetyMojo.java`
#### Snippet
```java
        final Map map = componentMap;
        final List list = componentList;
        final List go = new Vector();
        final List exceptions = new Vector();

```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckThreadSafetyMojo.java`
#### Snippet
```java
        final List list = componentList;
        final List go = new Vector();
        final List exceptions = new Vector();

        Thread[] threads = new Thread[2];
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `targets.keySet()` may be replaced with 'entrySet()' iteration
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java

            values = new LinkedHashMap();
            for ( Object key : targets.keySet() )
            {
                Object target = targets.get( key );
```

### KeySetIterationMayUseEntrySet
Iteration over `values.keySet()` may be replaced with 'entrySet()' iteration
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/EvalMojo.java`
#### Snippet
```java
            {
                Map values = ExpressionUtil.evaluate( expression, contexts );
                for ( Object key : values.keySet() )
                {
                    Object value = values.get( key );
```

### KeySetIterationMayUseEntrySet
Iteration over `targets.keySet()` may be replaced with 'entrySet()' iteration
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java

            values = new LinkedHashMap();
            for ( Object key : targets.keySet() )
            {
                Object target = targets.get( key );
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `core-it-support/core-it-plugins/maven-it-plugin-toolchain/src/main/java/org/apache/maven/plugin/coreit/CoreItMojo.java`
#### Snippet
```java
            {
                // try 2.x style API
                Method oldMethod = managerClass.getMethod( "getToolchainsForType", new Class[]{ String.class } );

                return (ToolchainPrivate[]) oldMethod.invoke( toolchainManager, new Object[]{ type } );
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `core-it-support/core-it-plugins/maven-it-plugin-toolchain/src/main/java/org/apache/maven/plugin/coreit/CoreItMojo.java`
#### Snippet
```java
                // try 3.x style API
                Method newMethod =
                    managerClass.getMethod( "getToolchainsForType", new Class[]{ String.class, MavenSession.class } );

                return (ToolchainPrivate[]) newMethod.invoke( toolchainManager, new Object[]{ type, session } );
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
                            }
                            method.setAccessible( true );
                            value = method.invoke( context, new Object[]{ property } );
                        }
                        catch ( NoSuchMethodException e3 )
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
                            }
                            method.setAccessible( true );
                            value = method.invoke( context, new Object[]{ property } );
                        }
                        catch ( NoSuchMethodException e3 )
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'supportedRange' in a Serializable class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public VersionRange supportedRange;

        private UnsupportedJavaVersionException( ArtifactVersion javaVersion, VersionRange supportedRange )
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'supportedRange' in a Serializable class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public VersionRange supportedRange;

        private UnsupportedMavenVersionException( ArtifactVersion mavenVersion, VersionRange supportedRange )
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'supportedRange' in a Serializable class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public VersionRange supportedRange;

        private BrokenMavenVersionException( ArtifactVersion mavenVersion, VersionRange supportedRange )
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/ResourcesMojo.java`
#### Snippet
```java
            outputFile.getParentFile().mkdirs();

            if ( message != null && message.length() > 0 )
            {
                getLog().info( "[MAVEN-CORE-IT-LOG]   " + message );
```

### SizeReplaceableByIsEmpty
`classNames.length() > 0` can be replaced with '!classNames.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
        Properties loaderProperties = new Properties();

        if ( classNames != null && classNames.length() > 0 )
        {
            String[] names = classNames.split( "," );
```

### SizeReplaceableByIsEmpty
`resourcePaths.length() > 0` can be replaced with '!resourcePaths.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
        }

        if ( resourcePaths != null && resourcePaths.length() > 0 )
        {
            String[] paths = resourcePaths.split( "," );
```

### SizeReplaceableByIsEmpty
`expression.length() > 0` can be replaced with '!expression.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
        Map values = Collections.EMPTY_MAP;

        if ( expression != null && expression.length() > 0 )
        {
            List segments = Arrays.asList( expression.split( "/", 0 ) );
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
            for ( int i = 0; i < significantPathLevels && file != null; i++ )
            {
                if ( result.length() > 0 )
                {
                    // NOTE: Always use forward slash here to ease platform-independent testing
```

### SizeReplaceableByIsEmpty
`artifactHandler.getExtension().length() > 0` can be replaced with '!artifactHandler.getExtension().isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/CustomRepositoryLayout.java`
#### Snippet
```java
        }

        if ( artifactHandler.getExtension() != null && artifactHandler.getExtension().length() > 0 )
        {
            path.append( '.' ).append( artifactHandler.getExtension() );
```

### SizeReplaceableByIsEmpty
`artifactHandler.getExtension().length() > 0` can be replaced with '!artifactHandler.getExtension().isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/InstallArtifactsMojo.java`
#### Snippet
```java
            }

            if ( artifactHandler.getExtension() != null && artifactHandler.getExtension().length() > 0 )
            {
                path.append( GROUP_SEPARATOR ).append( artifactHandler.getExtension() );
```

### SizeReplaceableByIsEmpty
`expressionList.length() > 0` can be replaced with '!expressionList.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/EvalMojo.java`
#### Snippet
```java
        Properties expressionProperties = new Properties();

        if ( expressionList != null && expressionList.length() > 0 )
        {
            expressions = expressionList.split( "," );
```

### SizeReplaceableByIsEmpty
`expression.length() > 0` can be replaced with '!expression.isEmpty()'
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
        Map values = Collections.EMPTY_MAP;

        if ( expression != null && expression.length() > 0 )
        {
            List segments = Arrays.asList( expression.split( "/", 0 ) );
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

            // NOTE: If the version looks like "${...}" it has been configured from an undefined expression
            if ( version != null && version.length() > 0 && !version.startsWith( "${" ) )
            {
                mavenVersion = new DefaultArtifactVersion( version );
```

### SizeReplaceableByIsEmpty
`settings.length() > 0` can be replaced with '!settings.isEmpty()'
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
        {
            File settingsFile;
            if ( settings.length() > 0 )
            {
                settingsFile = new File( "settings-" + settings + ".xml" );
```

### SizeReplaceableByIsEmpty
`settingsDir.length() > 0` can be replaced with '!settingsDir.isEmpty()'
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            {
                String settingsDir = System.getProperty( "maven.it.global-settings.dir", "" );
                if ( settingsDir.length() > 0 )
                {
                    settingsFile = new File( settingsDir, settingsFile.getPath() );
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder path` can be replaced with 'String'
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/InstallArtifactsMojo.java`
#### Snippet
```java
        private String pathOfRepositoryMetadata( String filename )
        {
            StringBuilder path = new StringBuilder();

            path.append( filename );
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            out.println( AnsiSupport.warning( "SKIPPED" ) + " - Java version " + e.javaVersion + " not in range "
                + e.supportedRange );
            return;
        }
        catch ( UnsupportedMavenVersionException e )
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            out.println( AnsiSupport.warning( "SKIPPED" ) + " - Maven version " + e.mavenVersion + " not in range "
                + e.supportedRange );
            return;
        }
        catch ( BrokenMavenVersionException e )
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/ResolveOneDependencyMojo.java`
#### Snippet
```java
                    if ( file == null )
                    {
                        getLog().info( " RESOLVE-ONE-DEPENDENCY " + a.toString() + " $ NO-FILE" );
                    }
                    else
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/ResolveOneDependencyMojo.java`
#### Snippet
```java
                    else
                    {
                        getLog().info( " RESOLVE-ONE-DEPENDENCY " + a.toString() + " $ " + file.getAbsolutePath() );
                    }
                    return;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
                        throw cnfe;
                    }
                    loaderProperties.setProperty( name, "" + type.hashCode() );

                    Method[] methods = type.getDeclaredMethods();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
                        urls = Collections.EMPTY_LIST;
                    }
                    loaderProperties.setProperty( path + ".count", "" + urls.size() );
                    for ( int j = 0; j < urls.size(); j++ )
                    {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core-it-support/core-it-plugins/maven-it-plugin-uses-wagon/src/main/java/org/apache/maven/plugin/coreit/LoadResourceMojo.java`
#### Snippet
```java
                {
                    List urls = Collections.list( classLoader.getResources( path ) );
                    loaderProperties.setProperty( path + ".count", "" + urls.size() );
                    for ( int j = 0; j < urls.size(); j++ )
                    {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/ListMojo.java`
#### Snippet
```java
        Properties reportProperties = new Properties();

        reportProperties.setProperty( "reports", "" + reports.size() );

        for ( int i = 0; i < reports.size(); i++ )
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `UnsupportedMavenVersionException` may be 'static'
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    }

    private class UnsupportedMavenVersionException
            extends TestAbortedException
    {
```

### InnerClassMayBeStatic
Inner class `BrokenMavenVersionException` may be 'static'
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    }

    private class BrokenMavenVersionException
        extends RuntimeException
    {
```

### InnerClassMayBeStatic
Inner class `UnsupportedJavaVersionException` may be 'static'
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    }

    private class UnsupportedJavaVersionException
        extends TestAbortedException
    {
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Method is never used in 'invoke': it's unlikely that 'hashCode', 'equals' and 'toString' are implemented correctly
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/GenerateMojo.java`
#### Snippet
```java
        {

            public Object invoke( Object proxy, Method method, Object[] args )
                throws Throwable
            {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/DeprecatedConfigMojo.java`
#### Snippet
```java
     */
    @SuppressWarnings( "deprecation" )
    private void dumpConfiguration( Properties props )
    {
        PropertiesUtil.serialize( props, "deprecatedParam", deprecatedParam );
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-optional-mojos/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java
        try
        {
            touchFile.getParentFile().mkdirs();
            touchFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-optional-mojos/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java
        {
            touchFile.getParentFile().mkdirs();
            touchFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-settings/src/main/java/org/apache/maven/plugin/coreit/SettingsReadItMojo.java`
#### Snippet
```java
        if ( dumpFile.exists() )
        {
            dumpFile.delete();
        }
        dumpFile.getParentFile().mkdirs();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-settings/src/main/java/org/apache/maven/plugin/coreit/SettingsReadItMojo.java`
#### Snippet
```java
            dumpFile.delete();
        }
        dumpFile.getParentFile().mkdirs();
        try ( FileWriter fw = new FileWriter( dumpFile ) )
        {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/coreit/EjbMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/coreit/EjbMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/TestResourcesMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/TestResourcesMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-source-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-source-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-component/src/main/java/org/apache/maven/coreit/component/DefaultStatefulSingleton.java`
#### Snippet
```java
        throws IOException
    {
        propertiesFile.getParentFile().mkdirs();

        try ( FileOutputStream os = new FileOutputStream( propertiesFile ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/ResourcesMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();

            if ( message != null && message.length() > 0 )
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/ResourcesMojo.java`
#### Snippet
```java
            else
            {
                outputFile.createNewFile();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-uses-properties/src/main/java/org/apache/maven/plugin/coreit/UsesPropertiesMojo.java`
#### Snippet
```java
        {
            File file = new File( basedir, "target/project.properties" );
            file.getParentFile().mkdirs();
            FileOutputStream fos = new FileOutputStream( file );

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-no-default-comp/src/main/java/org/apache/maven/plugin/coreit/ItMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            try ( FileOutputStream os = new FileOutputStream( outputFile ) )
            {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-context-passing/src/main/java/org/apache/maven/plugin/coreit/CatchMojo.java`
#### Snippet
```java
        if ( !outDir.exists() )
        {
            outDir.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/PropertiesUtil.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            props.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-toolchain/src/main/java/org/apache/maven/plugin/coreit/FindToolMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            properties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ear-plugin/src/main/java/org/apache/maven/plugin/coreit/GenerateApplicationXmlMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ear-plugin/src/main/java/org/apache/maven/plugin/coreit/GenerateApplicationXmlMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-javadoc-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-javadoc-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ear-plugin/src/main/java/org/apache/maven/plugin/coreit/EarMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ear-plugin/src/main/java/org/apache/maven/plugin/coreit/EarMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-log-file/src/main/java/org/apache/maven/plugin/coreit/AbstractLogMojo.java`
#### Snippet
```java
             * NOTE: Intentionally don't delete the file but create a new empty one to check the plugin was executed.
             */
            file.getParentFile().mkdirs();
            OutputStream out = new FileOutputStream( file );
            try
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-log-file/src/main/java/org/apache/maven/plugin/coreit/AbstractLogMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();
            OutputStream out = new FileOutputStream( file, true );
            try
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-online/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-online/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java
        {
            outputFile.getParentFile().mkdirs();
            outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-toolchain/src/main/java/org/apache/maven/plugin/coreit/CoreItMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            properties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/DumpRepoLayoutsMojo.java`
#### Snippet
```java
        try
        {
            layoutsFile.getParentFile().mkdirs();
            out = new FileOutputStream( layoutsFile );
            layoutProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            componentProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckThreadSafetyMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            componentProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `Object.toString()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckThreadSafetyMojo.java`
#### Snippet
```java
                            for ( Object o : map.values() )
                            {
                                o.toString();
                            }
                            for ( Object aList : list )
```

### IgnoreResultOfCall
Result of `Object.toString()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckThreadSafetyMojo.java`
#### Snippet
```java
                            for ( Object aList : list )
                            {
                                aList.toString();
                            }
                        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/AddPluginArtifactMetadataMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/AddPluginArtifactMetadataMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/DescriptorMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/DescriptorMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/UpdateRegistryMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-install-plugin/src/main/java/org/apache/maven/plugin/coreit/InstallMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-install-plugin/src/main/java/org/apache/maven/plugin/coreit/InstallMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/UpdateRegistryMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-no-project/src/main/java/org/apache/maven/plugin/coreit/NoProjectMojo.java`
#### Snippet
```java
             if ( !dir.exists() )
             {
                 dir.mkdirs();
             }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-jar-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-jar-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java
             if ( !dir.exists() )
             {
                 dir.mkdirs();
             }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();

            os = new FileOutputStream( file );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();

            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();

            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
        try
        {
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
        {
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
        try
        {
            new File( "target" ).mkdirs();

            try ( OutputStream os = new FileOutputStream( "target/wagon.properties" ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/coreit/CompileMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/coreit/CompileMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/coreit/TestCompileMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/coreit/TestCompileMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-war-plugin/src/main/java/org/apache/maven/plugin/coreit/WarMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-war-plugin/src/main/java/org/apache/maven/plugin/coreit/WarMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
        {
            File file = new File( System.getProperty( "user.dir" ), "target/wagon.properties" ).getAbsoluteFile();
            file.getParentFile().mkdirs();

            try ( OutputStream os = new FileOutputStream( file ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
        try
        {
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
        {
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/AttachDescriptorMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/AttachDescriptorMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/DeployMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/DeployMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/SiteMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/SiteMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/ResolveTransitiveMojo.java`
#### Snippet
```java
            try
            {
                propertiesFile.getParentFile().mkdirs();

                try ( FileOutputStream fos = new FileOutputStream( propertiesFile ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/ResolveMojo.java`
#### Snippet
```java
            try
            {
                propertiesFile.getParentFile().mkdirs();

                try ( FileOutputStream fos = new FileOutputStream( propertiesFile ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-uses-wagon/src/main/java/org/apache/maven/plugin/coreit/DumpVersionMojo.java`
#### Snippet
```java
        try
        {
            propertiesFile.getParentFile().mkdirs();
            out = new FileOutputStream( propertiesFile );
            wagonProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-uses-wagon/src/main/java/org/apache/maven/plugin/coreit/DumpAuthMojo.java`
#### Snippet
```java
        try
        {
            propertiesFile.getParentFile().mkdirs();
            out = new FileOutputStream( propertiesFile );
            authProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-all/src/main/java/org/apache/maven/plugin/coreit/AggregatorDependenciesMojo.java`
#### Snippet
```java
            try
            {
                touchFile.getParentFile().mkdirs();
                touchFile.createNewFile();
            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-all/src/main/java/org/apache/maven/plugin/coreit/AggregatorDependenciesMojo.java`
#### Snippet
```java
            {
                touchFile.getParentFile().mkdirs();
                touchFile.createNewFile();
            }
            catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-uses-wagon/src/main/java/org/apache/maven/plugin/coreit/LookupWagonMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            loaderProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-clean-plugin/src/main/java/org/apache/maven/plugin/coreit/CleanMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-clean-plugin/src/main/java/org/apache/maven/plugin/coreit/CleanMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-uses-wagon/src/main/java/org/apache/maven/plugin/coreit/LoadResourceMojo.java`
#### Snippet
```java
        try
        {
            wagonClassLoaderOutput.getParentFile().mkdirs();
            out = new FileOutputStream( wagonClassLoaderOutput );
            loaderProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-11/src/main/java/org/apache/maven/its/plugins/SerializeMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();
            writer = new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" );
            s.setOutput( writer );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-project/src/main/java/org/apache/maven/plugin/coreit/AbstractPomMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();

            try ( FileOutputStream os = new FileOutputStream( file ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-packaging/src/main/java/org/apache/maven/plugin/coreit/AppendMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();

            getLog().info( "[MAVEN-CORE-IT-LOG]   " + message );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-packaging/src/main/java/org/apache/maven/plugin/coreit/PackagingMojo.java`
#### Snippet
```java
        try
        {
            jarFile.getParentFile().mkdirs();
            jarFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-packaging/src/main/java/org/apache/maven/plugin/coreit/PackagingMojo.java`
#### Snippet
```java
        {
            jarFile.getParentFile().mkdirs();
            jarFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-singleton-component/src/main/java/org/apache/maven/plugin/coreit/ItMojo.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            try ( FileOutputStream os = new FileOutputStream( outputFile ) )
            {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-deploy-plugin/src/main/java/org/apache/maven/plugin/coreit/DeployMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-deploy-plugin/src/main/java/org/apache/maven/plugin/coreit/DeployMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-rar-plugin/src/main/java/org/apache/maven/plugin/coreit/RarMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-rar-plugin/src/main/java/org/apache/maven/plugin/coreit/RarMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CopyPomMojo.java`
#### Snippet
```java
            if ( !dir.exists() )
            {
                dir.mkdirs();
            }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-collection/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();

            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-surefire-plugin/src/main/java/org/apache/maven/plugin/coreit/TestMojo.java`
#### Snippet
```java
        try
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-surefire-plugin/src/main/java/org/apache/maven/plugin/coreit/TestMojo.java`
#### Snippet
```java
        {
             outputFile.getParentFile().mkdirs();
             outputFile.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/ListMojo.java`
#### Snippet
```java
        try
        {
            reportsFile.getParentFile().mkdirs();
            out = new FileOutputStream( reportsFile );
            reportProperties.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CoreItTouchMojo.java`
#### Snippet
```java
             if ( !dir.exists() )
             {
                 dir.mkdirs();
             }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/InfoReport.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            out = new FileOutputStream( outputFile );
            props.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-setter/src/main/java/org/apache/maven/plugin/coreit/CoreItMojoWithSetters.java`
#### Snippet
```java
             if ( !dir.exists() )
             {
                 dir.mkdirs();
             }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/apache/maven/its/plugins/SerializeMojo.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();
            writer = new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" );
            s.setOutput( writer );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java
            if ( !dir.exists() )
            {
                dir.mkdirs();
            }

```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java

            File touch = new File( dir, file );
            touch.createNewFile();
        }
        catch ( IOException e )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
        try
        {
            file.getParentFile().mkdirs();
            out = new FileOutputStream( file );
            props.store( out, "MAVEN-CORE-IT-LOG" );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/PropertiesUtil.java`
#### Snippet
```java
        try
        {
            outputFile.getParentFile().mkdirs();
            os = new FileOutputStream( outputFile );
            props.store( os, "MAVEN-CORE-IT-LOG" );
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/coreit/EjbMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/TestResourcesMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-source-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/ResourcesMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ear-plugin/src/main/java/org/apache/maven/plugin/coreit/GenerateApplicationXmlMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-javadoc-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-ear-plugin/src/main/java/org/apache/maven/plugin/coreit/EarMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/AddPluginArtifactMetadataMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/DescriptorMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-install-plugin/src/main/java/org/apache/maven/plugin/coreit/InstallMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-plugin-plugin/src/main/java/org/apache/maven/plugin/coreit/UpdateRegistryMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-jar-plugin/src/main/java/org/apache/maven/plugin/coreit/JarMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
    private static String concat( String prefix, String segment )
    {
        return ( prefix == null || prefix.length() <= 0 ) ? segment : ( prefix + '/' + segment );
    }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        throws MojoExecutionException
    {
        if ( pathname == null || pathname.length() <= 0 )
        {
            return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        throws MojoExecutionException
    {
        if ( pathname == null || pathname.length() <= 0 )
        {
            return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        throws MojoExecutionException
    {
        if ( pathname == null || pathname.length() <= 0 )
        {
            return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/coreit/CompileMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/coreit/TestCompileMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-war-plugin/src/main/java/org/apache/maven/plugin/coreit/WarMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/SetMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Setting main artifact file: " + mainFile );

        if ( mainFile == null || mainFile.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for main artifact file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/AttachPomMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Attaching POM to main artifact: " + pomFile );

        if ( pomFile == null || pomFile.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for POM file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/AttachDescriptorMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/DeployMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-site-plugin/src/main/java/org/apache/maven/plugin/coreit/SiteMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/AttachMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] type=" + artifactType + ", classifier=" + artifactClassifier );

        if ( attachedFile == null || attachedFile.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for attached artifact file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-clean-plugin/src/main/java/org/apache/maven/plugin/coreit/CleanMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-deploy-plugin/src/main/java/org/apache/maven/plugin/coreit/DeployMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-rar-plugin/src/main/java/org/apache/maven/plugin/coreit/RarMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-collection/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        throws MojoExecutionException
    {
        if ( pathname == null || pathname.length() <= 0 )
        {
            return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-surefire-plugin/src/main/java/org/apache/maven/plugin/coreit/TestMojo.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + pathname );

        if ( pathname == null || pathname.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/InfoReport.java`
#### Snippet
```java
        getLog().info( "[MAVEN-CORE-IT-LOG] Using output file path: " + infoFile );

        if ( infoFile == null || infoFile.length() <= 0 )
        {
            throw new MojoFailureException( "Path name for output file has not been specified" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/ExpressionUtil.java`
#### Snippet
```java
    private static String concat( String prefix, String segment )
    {
        return ( prefix == null || prefix.length() <= 0 ) ? segment : ( prefix + '/' + segment );
    }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            String version = System.getProperty( "maven.version", "" );

            if ( version.length() <= 0 || version.startsWith( "${" ) )
            {
                try
```

## RuleId[id=EqualsHashCodeCalledOnUrl]
### EqualsHashCodeCalledOnUrl
Call to `equals()` on URL object
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
                URL url = classLoader.getResource( path );
                getLog().info( "[MAVEN-CORE-IT-LOG]   Loaded resource from " + url );
                if ( url != null && !url.equals( childClassLoader.getResource( path ) ) )
                {
                    getLog().error( "[MAVEN-CORE-IT-LOG] Detected class loader defect while getting " + path );
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core-it-support/maven-it-plugin-bootstrap/src/main/java/org/apache/maven/its/bootstrap/DownloadMojo.java`
#### Snippet
```java
        if ( file != null && file.exists() )
        {
            System.out.println( "Collecting artifacts from file: " + file );
            try ( BufferedReader reader = new BufferedReader( new FileReader( file ) ) )
            {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core-it-support/maven-it-plugin-bootstrap/src/main/java/org/apache/maven/its/bootstrap/DownloadMojo.java`
#### Snippet
```java
        {
            MavenProject project = session.getCurrentProject();
            System.out.println( "Collecting build plugins from packaging: " + project.getPackaging() );
            for ( Plugin plugin : project.getBuildPlugins() )
            {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core-it-support/maven-it-plugin-bootstrap/src/main/java/org/apache/maven/its/bootstrap/DownloadMojo.java`
#### Snippet
```java
                collectRequest.setRequestContext( "bootstrap" );
                DependencyRequest request = new DependencyRequest( collectRequest, null ) ;
                System.out.println( "Resolving: " + root.getArtifact() );
                repositorySystem.resolveDependencies( repositorySystemSession, request );
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
     * Save System.out for progress reports etc.
     */
    private static PrintStream out = System.out;

    /**
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-core-stubs/maven-resources-plugin/src/main/java/org/apache/maven/plugin/coreit/ResourcesMojo.java`
#### Snippet
```java

                try ( OutputStreamWriter writer = new OutputStreamWriter( new FileOutputStream( outputFile, true ),
                                                                          "UTF-8" ) )
                {
                    writer.write( message );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/TouchMojo.java`
#### Snippet
```java

             // NOTE: Using append mode to track execution count
             OutputStreamWriter w = new OutputStreamWriter( new FileOutputStream( touch, true ), "UTF-8" );

             w.write( file );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
            file.getParentFile().mkdirs();

            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );

            if ( classPath != null )
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
            file.getParentFile().mkdirs();

            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );

            if ( artifacts != null )
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/ssh/external/ScpExternalWagon.java`
#### Snippet
```java
            if ( resName.endsWith( ".sha1" ) )
            {
                is = new ByteArrayInputStream( "c96e29be962f9d8123b584b8f51d66b347d268d4".getBytes( "UTF-8" ) );
            }
            else if ( resName.endsWith( ".md5" ) )
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/ssh/external/ScpExternalWagon.java`
#### Snippet
```java
            else if ( resName.endsWith( ".md5" ) )
            {
                is = new ByteArrayInputStream( "d2b637ab8965308490bc6482c860dfc5".getBytes( "UTF-8" ) );
            }
            else
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/ssh/external/ScpExternalWagon.java`
#### Snippet
```java
            else
            {
                is = new ByteArrayInputStream( "<metadata />".getBytes( "UTF-8" ) );
            }
            inputData.setInputStream( is );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
            if ( resName.endsWith( ".sha1" ) )
            {
                is = new ByteArrayInputStream( "c96e29be962f9d8123b584b8f51d66b347d268d4".getBytes( "UTF-8" ) );
            }
            else if ( resName.endsWith( ".md5" ) )
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
            else if ( resName.endsWith( ".md5" ) )
            {
                is = new ByteArrayInputStream( "d2b637ab8965308490bc6482c860dfc5".getBytes( "UTF-8" ) );
            }
            else
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
            else
            {
                is = new ByteArrayInputStream( "<metadata />".getBytes( "UTF-8" ) );
            }
            inputData.setInputStream( is );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
            if ( resName.endsWith( ".sha1" ) )
            {
                is = new ByteArrayInputStream( "c96e29be962f9d8123b584b8f51d66b347d268d4".getBytes( "UTF-8" ) );
            }
            else if ( resName.endsWith( ".md5" ) )
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
            else if ( resName.endsWith( ".md5" ) )
            {
                is = new ByteArrayInputStream( "d2b637ab8965308490bc6482c860dfc5".getBytes( "UTF-8" ) );
            }
            else
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
            else
            {
                is = new ByteArrayInputStream( "<metadata />".getBytes( "UTF-8" ) );
            }
            inputData.setInputStream( is );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-11/src/main/java/org/apache/maven/its/plugins/SerializeMojo.java`
#### Snippet
```java
        {
            file.getParentFile().mkdirs();
            writer = new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" );
            s.setOutput( writer );

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-packaging/src/main/java/org/apache/maven/plugin/coreit/AppendMojo.java`
#### Snippet
```java

            try ( OutputStreamWriter writer = new OutputStreamWriter( new FileOutputStream( outputFile, true ),
                                                                      "UTF-8" ) )
            {
                writer.write( message );
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-collection/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
            file.getParentFile().mkdirs();

            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );

            if ( artifacts != null )
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/apache/maven/its/plugins/SerializeMojo.java`
#### Snippet
```java
        {
            file.getParentFile().mkdirs();
            writer = new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" );
            s.setOutput( writer );

```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/DeprecatedConfigMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${project.artifact}" )
    private Artifact deprecatedBean;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/DeprecatedConfigMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${project.artifact}", readonly = true )
    private Artifact deprecatedBeanReadOnly;

    /**
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AggregateTestMojo.java`
#### Snippet
```java
        if ( filename != null )
        {
            result = result.replaceAll( "@artifactId@", project.getArtifactId() );
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
            {
                // helps to distinguished forked executions of the same mojo
                pathname = pathname.replaceAll( "@idx@", String.valueOf( nextCounter() ) );
            }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-collection/src/main/java/org/apache/maven/plugin/coreit/AggregateTestMojo.java`
#### Snippet
```java
        if ( filename != null )
        {
            result = result.replaceAll( "@artifactId@", project.getArtifactId() );
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
        {
            String version = System.getProperty( "java.version" );
            version = version.replaceAll( "[_-]", "." );
            Matcher matcher = Pattern.compile( "(?s).*?(([0-9]+\\.[0-9]+)(\\.[0-9]+)?).*" ).matcher( version );
            if ( matcher.matches() )
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
                {
                    if ( Modifier.isStatic( method.getModifiers() ) || method.getParameterTypes().length > 0
                        || !method.getName().matches( "(get|is)\\p{Lu}.*" ) || method.getName().endsWith( "AsMap" )
                        || Class.class.isAssignableFrom( method.getReturnType() ) || Object.class.equals(
                        method.getReturnType() ) )
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core-it-support/core-it-plugins/maven-it-plugin-plugin-dependency/src/main/java/org/apache/maven/plugin/coreit/DerivedItMojo.java`
#### Snippet
```java
        if ( file != null )
        {
            super.setOutputFile( file );
        }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.wagon` is unnecessary, and can be replaced with an import
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/ssh/external/ScpExternalWagon.java`
#### Snippet
```java
 * because the core component descriptor is read, but the class is read from the latter JAR.
 */
@Component( role = org.apache.maven.wagon.Wagon.class,  hint = "scpexe", instantiationStrategy = "per-lookup" )
public class ScpExternalWagon
    extends AbstractWagon
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.wagon` is unnecessary, and can be replaced with an import
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
 * Shamelessly copied from ScpExternalWagon in this same project...
 */
@Component( role = org.apache.maven.wagon.Wagon.class,  hint = "http-coreit", instantiationStrategy = "per-lookup" )
public class CoreItHttpWagon
    extends AbstractWagon
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.wagon` is unnecessary, and can be replaced with an import
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
 * Shamelessly copied from ScpExternalWagon in this same project...
 */
@Component( role = org.apache.maven.wagon.Wagon.class,  hint = "coreit", instantiationStrategy = "per-lookup" )
public class CoreItWagon
    extends AbstractWagon
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `core-it-support/core-it-javaagent/src/main/java/org/apache/maven/coreits/javaagent/mng5669/Premain.java`
#### Snippet
```java
        extends ClassVisitor
    {
        DefaultModelReaderVisitor( int api, org.objectweb.asm.ClassVisitor cv )
        {
            super( api, cv );
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.its.plugins.plexuslifecycle` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-lifecycle/src/main/java/org/apache/maven/its/plugins/plexuslifecycle/DefaultFakeComponent.java`
#### Snippet
```java
 * @author Olivier Lamy
 */
@Component ( role = org.apache.maven.its.plugins.plexuslifecycle.FakeComponent.class )
public class DefaultFakeComponent
    implements FakeComponent, Contextualizable, Disposable, LogEnabled
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CliConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.io.File}.
     */
    @Parameter( property = "config.fileParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CliConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.List}.
     */
    @Parameter( property = "config.listParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CliConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.String}.
     */
    @Parameter( property = "config.stringParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CliConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Set}.
     */
    @Parameter( property = "config.setParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CliConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.io.File}.
     */
    @Parameter( property = "config.fileParams" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CliConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.lang.String}.
     */
    @Parameter( property = "config.stringParams" )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void assertTrue( String message, boolean test )
    {
        org.junit.jupiter.api.Assertions.assertTrue( test, message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void assertNotEquals( String message, Object o1, Object o2 )
    {
        org.junit.jupiter.api.Assertions.assertNotEquals( o1, o2, message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void fail( String message )
    {
        org.junit.jupiter.api.Assertions.fail( message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void assertNotNull( String message, Object o )
    {
        org.junit.jupiter.api.Assertions.assertNotNull( o, message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void assertFalse( String message, boolean test )
    {
        org.junit.jupiter.api.Assertions.assertFalse( test, message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void assertEquals( String message, Object o1, Object o2 )
    {
        org.junit.jupiter.api.Assertions.assertEquals( o1, o2, message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    public static void assertNull( String message, Object o )
    {
        org.junit.jupiter.api.Assertions.assertNull( o, message );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Set}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.net.URL}.
     */
    @Parameter( property = "config.urlParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.lang.String}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Map}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.io.File}.
     */
    @Parameter( property = "config.fileParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Integer}.
     */
    @Parameter( property = "config.integerParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Integer#TYPE}.
     */
    @Parameter( property = "config.primitiveIntegerParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Short}.
     */
    @Parameter( property = "config.shortParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Double}.
     */
    @Parameter( property = "config.doubleParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.coreit` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A complex parameter of type {@link org.apache.maven.plugin.coreit.Bean}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.String}.
     */
    @Parameter( property = "config.stringParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Boolean}.
     */
    @Parameter( property = "config.booleanParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Float}.
     */
    @Parameter( property = "config.floatParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Byte}.
     */
    @Parameter( property = "config.byteParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Properties}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.io.File}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.util.Date}.
     */
    @Parameter( property = "config.dateParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Boolean#TYPE}.
     */
    @Parameter( property = "config.primitiveBooleanParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.List}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.net.URI} (requires Maven 3.x).
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Character}.
     */
    @Parameter( property = "config.characterParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.Long}.
     */
    @Parameter( property = "config.longParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Map}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.io.File}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.io.File}.
     */
    @Parameter( property = "config.fileParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.String}.
     */
    @Parameter( property = "config.stringParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Set}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Properties}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.List}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/AppendConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.lang.String}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.lang.String}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.io.File}.
     */
    @Parameter( property = "config.fileParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Properties}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Set}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.List}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * A collection parameter of type {@link java.util.Map}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * An array parameter of component type {@link java.io.File}.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomConfigMojo.java`
#### Snippet
```java

    /**
     * A simple parameter of type {@link java.lang.String}.
     */
    @Parameter( property = "config.stringParam" )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.component.configurator` is unnecessary, and can be replaced with an import
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/CustomComponentConfigurator.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
@Component ( role = org.codehaus.plexus.component.configurator.ComponentConfigurator.class, hint = "coreit" )
public class CustomComponentConfigurator
    extends AbstractComponentConfigurator
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CopyPomMojo.java`
#### Snippet
```java
            int read = -1;
            byte[] buf = new byte[4 * 1024];
            while ( ( read = in.read( buf ) ) > -1 )
            {
                out.write( buf, 0, read );
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/ResolveTransitiveMojo.java`
#### Snippet
```java
            catch ( InterruptedException e )
            {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
                catch ( VerificationException e )
                {
                    e.printStackTrace();
                }
            }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `properties` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-uses-properties/src/main/java/org/apache/maven/plugin/coreit/UsesPropertiesMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${project.properties}" )
    private Properties properties;

    public void execute()
```

### MismatchedCollectionQueryUpdate
Contents of collection `classPath` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/LoadDependenciesMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${project.compileClasspathElements}", readonly = true )
    private List classPath;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `components` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/InstanceofMojo.java`
#### Snippet
```java
     */
    @Component
    private List<TestComponent> components;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `repoLayouts` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/DumpRepoLayoutsMojo.java`
#### Snippet
```java
     */
    @Component
    private List<ArtifactRepositoryLayout> repoLayouts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `repositoryLayouts` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/DumpRepoLayoutsMojo.java`
#### Snippet
```java
     */
    @Component
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `componentMap` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckMojo.java`
#### Snippet
```java
     */
    @Component
    private Map<String, TestComponent> componentMap;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `componentList` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/CheckMojo.java`
#### Snippet
```java
     */
    @Component
    private List<TestComponent> componentList;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AggregateTestMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reactorProjects}", readonly = true )
    private List<MavenProject> reactorProjects;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `pluginArtifacts` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/InjectMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${plugin.artifacts}", readonly = true )
    private Collection pluginArtifacts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkGoalAggregatorMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reactorProjects}" )
    private List<MavenProject> reactorProjects;

    public void execute()
```

### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-fork/src/main/java/org/apache/maven/plugin/coreit/ForkLifecycleAggregatorMojo.java`
#### Snippet
```java

    @Parameter( defaultValue = "${reactorProjects}" )
    private List reactorProjects;

    public void execute()
```

### MismatchedCollectionQueryUpdate
Contents of collection `artifacts` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-artifact/src/main/java/org/apache/maven/plugin/coreit/InstallArtifactsMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${project.runtimeArtifacts}", readonly = true )
    private List<Artifact> artifacts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `properties` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-project-interpolation/src/main/java/org/apache/maven/plugin/coreit/PropertyInterpolationVerifierMojo.java`
#### Snippet
```java
     */
    @Parameter( property = "clsldr.pluginClassLoaderOutput" )
    private Properties properties;

    public void execute()
```

### MismatchedCollectionQueryUpdate
Contents of collection `componentMap` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-singleton-component/src/main/java/org/apache/maven/plugin/coreit/ItMojo.java`
#### Snippet
```java
     */
    @Component
    private Map<String, TestComponent> componentMap;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `componentList` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-singleton-component/src/main/java/org/apache/maven/plugin/coreit/ItMojo.java`
#### Snippet
```java
     */
    @Component
    private List<TestComponent> componentList;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-collection/src/main/java/org/apache/maven/plugin/coreit/AggregateTestMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reactorProjects}", readonly = true )
    private List<MavenProject> reactorProjects;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `reports` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/ListMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reports}", required = true, readonly = true )
    private List<?> reports;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `pluginArtifacts` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CoreItTouchMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${plugin.artifactMap}", required = true )
    private Map<String, Artifact> pluginArtifacts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `reports` are queried, but never updated
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/GenerateMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reports}", required = true, readonly = true )
    private List reports;

    /**
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            else
            {
                verifier.getSystemProperties().put( "org.apache.maven.global-settings", path );
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            if ( VersionRange.createFromVersionSpec( "[9,12)" ).containsVersion( getJavaVersion() ) )
            {
                verifier.getSystemProperties().put( "maven.compiler.source", "1.8" );
                verifier.getSystemProperties().put( "maven.compiler.target", "1.8" );
                verifier.getSystemProperties().put( "maven.compiler.release", "8" );
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            {
                verifier.getSystemProperties().put( "maven.compiler.source", "1.8" );
                verifier.getSystemProperties().put( "maven.compiler.target", "1.8" );
                verifier.getSystemProperties().put( "maven.compiler.release", "8" );
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
                verifier.getSystemProperties().put( "maven.compiler.source", "1.8" );
                verifier.getSystemProperties().put( "maven.compiler.target", "1.8" );
                verifier.getSystemProperties().put( "maven.compiler.release", "8" );
            }
            // Java12 requires at least 7
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            if ( VersionRange.createFromVersionSpec( "[12,)" ).containsVersion( getJavaVersion() ) )
            {
                verifier.getSystemProperties().put( "maven.compiler.source", "8" );
                verifier.getSystemProperties().put( "maven.compiler.target", "8" );
                verifier.getSystemProperties().put( "maven.compiler.release", "8" );
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
            {
                verifier.getSystemProperties().put( "maven.compiler.source", "8" );
                verifier.getSystemProperties().put( "maven.compiler.target", "8" );
                verifier.getSystemProperties().put( "maven.compiler.release", "8" );
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
                verifier.getSystemProperties().put( "maven.compiler.source", "8" );
                verifier.getSystemProperties().put( "maven.compiler.target", "8" );
                verifier.getSystemProperties().put( "maven.compiler.release", "8" );
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
                || ( obj instanceof File ) || ( obj instanceof Path ) )
            {
                props.put( key, obj.toString() );
            }
            else if ( obj instanceof Collection )
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
            {
                Collection coll = (Collection) obj;
                props.put( key, Integer.toString( coll.size() ) );
                int index = 0;
                for ( Iterator it = coll.iterator(); it.hasNext(); index++ )
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
            {
                Map map = (Map) obj;
                props.put( key, Integer.toString( map.size() ) );
                int index = 0;
                for ( Iterator it = map.entrySet().iterator(); it.hasNext(); index++ )
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
            {
                int length = Array.getLength( obj );
                props.put( key, Integer.toString( length ) );
                for ( int index = 0; index < length; index++ )
                {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
                    if ( value != null )
                    {
                        props.put( key + ".value", value );
                    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core-it-support/core-it-plugins/maven-it-plugin-expression/src/main/java/org/apache/maven/plugin/coreit/PropertyUtil.java`
#### Snippet
```java
                    Object[] children = (Object[]) getChildren.invoke( obj, NO_ARGS );

                    props.put( key + ".children", Integer.toString( children.length ) );

                    Map indices = new HashMap();
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
{

    void setFeature( String name, boolean state )
        throws IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
    boolean getFeature( String name );

    void setProperty( String name, Object value )
        throws IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
    Object getProperty( String name );

    void setOutput( OutputStream os, String encoding )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void startDocument( String encoding, Boolean standalone )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void endDocument()
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void setPrefix( String prefix, String namespace )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void cdsect( String text )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void entityRef( String text )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void processingInstruction( String text )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void comment( String text )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void docdecl( String text )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void ignorableWhitespace( String text )
        throws IOException, IllegalArgumentException, IllegalStateException;

```

### EmptyMethod
All implementations of this method are empty
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/XmlSerializer.java`
#### Snippet
```java
        throws IOException, IllegalArgumentException, IllegalStateException;

    void flush()
        throws IOException;
}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CoreItTouchMojo.java`
#### Snippet
```java
     */
    @Parameter( property = "fail" )
    private boolean fail = false;

    public void execute()
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `pathname`
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
            {
                // helps to distinguished forked executions of the same mojo
                pathname = pathname.replaceAll( "@idx@", String.valueOf( nextCounter() ) );
            }

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Toolchain`
in `core-it-support/core-it-toolchain/src/main/java/org/apache/maven/coreit/toolchain/CoreItToolchain.java`
#### Snippet
```java
 */
public class CoreItToolchain
    implements Toolchain, ToolchainPrivate
{

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-24-18-30-51.487.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `core-it-support/core-it-toolchain/src/main/java/org/apache/maven/coreit/toolchain/CoreItToolchainFactory.java`
#### Snippet
```java
    public ToolchainPrivate createDefaultToolchain()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-toolchain/src/main/java/org/apache/maven/coreit/toolchain/CoreItToolchainFactory.java`
#### Snippet
```java
        if ( model == null )
        {
            return null;
        }
        return new CoreItToolchain( model );
```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/mng5958-extension/src/main/java/org/apache/maven/its/mng5958/AbstractLifecycleMapping.java`
#### Snippet
```java
    public List<String> getOptionalMojos( String lifecycle )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/mng5958-extension/src/main/java/org/apache/maven/its/mng5958/AbstractLifecycleMapping.java`
#### Snippet
```java
            return lifecycleMapping.getPhases();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-site/src/main/java/org/apache/maven/plugin/coreit/GenerateMojo.java`
#### Snippet
```java
                throws Throwable
            {
                return null;
            }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public Object getProperty( String name )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public XmlSerializer endTag( String namespace, String name )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public XmlSerializer text( char[] buf, int start, int len )
    {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public String getPrefix( String namespace, boolean generatePrefix )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public String getName()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public String getNamespace()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public XmlSerializer attribute( String namespace, String name, String value )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core-it-support/core-it-plugins/maven-it-plugin-plexus-utils-new/src/main/java/org/codehaus/plexus/util/xml/pull/MXSerializer.java`
#### Snippet
```java
    public XmlSerializer text( String text )
    {
        return null;
    }

```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `supportedRange` of exception class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public VersionRange supportedRange;

        private UnsupportedJavaVersionException( ArtifactVersion javaVersion, VersionRange supportedRange )
```

### NonFinalFieldOfException
Non-final field `mavenVersion` of exception class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    {
        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public ArtifactVersion mavenVersion;

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
```

### NonFinalFieldOfException
Non-final field `mavenVersion` of exception class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    {
        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public ArtifactVersion mavenVersion;

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
```

### NonFinalFieldOfException
Non-final field `supportedRange` of exception class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public VersionRange supportedRange;

        private UnsupportedMavenVersionException( ArtifactVersion mavenVersion, VersionRange supportedRange )
```

### NonFinalFieldOfException
Non-final field `supportedRange` of exception class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public VersionRange supportedRange;

        private BrokenMavenVersionException( ArtifactVersion mavenVersion, VersionRange supportedRange )
```

### NonFinalFieldOfException
Non-final field `javaVersion` of exception class
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    {
        @SuppressWarnings( "checkstyle:visibilitymodifier" )
        public ArtifactVersion javaVersion;

        @SuppressWarnings( "checkstyle:visibilitymodifier" )
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
        String key = getClass().getName();

        synchronized ( System.class )
        {
            counter = Integer.getInteger( key, 0 );
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `core-it-support/core-it-plugins/maven-it-plugin-class-loader/maven-it-plugin-class-loader/src/main/java/org/apache/maven/plugin/coreit/AbstractLoadMojo.java`
#### Snippet
```java
         * increasing test coverage for its implementation.
         */
        ClassLoader childClassLoader = new URLClassLoader( new URL[0], classLoader );

        Properties loaderProperties = new Properties();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `counter` initializer `0` is redundant
in `core-it-support/core-it-plugins/maven-it-plugin-dependency-resolution/src/main/java/org/apache/maven/plugin/coreit/AbstractDependencyMojo.java`
#### Snippet
```java
    private int nextCounter()
    {
        int counter = 0;

        String key = getClass().getName();
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/ssh/external/ScpExternalWagon.java`
#### Snippet
```java
        {
            String resName = inputData.getResource().getName();
            InputStream is = null;
            if ( resName.endsWith( ".sha1" ) )
            {
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItHttpWagon.java`
#### Snippet
```java
        {
            String resName = inputData.getResource().getName();
            InputStream is = null;
            if ( resName.endsWith( ".sha1" ) )
            {
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `core-it-support/core-it-wagon/src/main/java/org/apache/maven/wagon/providers/coreit/CoreItWagon.java`
#### Snippet
```java
        {
            String resName = inputData.getResource().getName();
            InputStream is = null;
            if ( resName.endsWith( ".sha1" ) )
            {
```

### UnusedAssignment
Variable `read` initializer `-1` is redundant
in `core-it-support/core-it-plugins/maven-it-plugin-touch/src/main/java/org/apache/maven/plugin/coreit/CopyPomMojo.java`
#### Snippet
```java
            FileOutputStream out = new FileOutputStream( dest );

            int read = -1;
            byte[] buf = new byte[4 * 1024];
            while ( ( read = in.read( buf ) ) > -1 )
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `version != null` is always `true`
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java

            // NOTE: If the version looks like "${...}" it has been configured from an undefined expression
            if ( version != null && version.length() > 0 && !version.startsWith( "${" ) )
            {
                mavenVersion = new DefaultArtifactVersion( version );
```

### ConstantValue
Value `primitiveBooleanParam` is always 'true'
in `core-it-support/core-it-plugins/maven-it-plugin-configuration/src/main/java/org/apache/maven/plugin/coreit/ConfigMojo.java`
#### Snippet
```java
        if ( primitiveBooleanParam )
        {
            PropertiesUtil.serialize( props, "primitiveBooleanParam", primitiveBooleanParam );
        }
        PropertiesUtil.serialize( props, "byteParam", byteParam );
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core-it-support/maven-it-helper/src/main/java/org/apache/maven/it/AbstractMavenIntegrationTestCase.java`
#### Snippet
```java
    void setupContext( TestInfo testInfo )
    {
        testName = testInfo.getTestMethod().get().getName();
    }

```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'String'
in `core-it-support/core-it-plugins/maven-it-plugin-active-collection/src/main/java/org/apache/maven/plugin/coreit/DumpRepoLayoutsMojo.java`
#### Snippet
```java
        for ( Object o : repositoryLayouts.keySet() )
        {
            String roleHint = (String) o;
            Object repoLayout = repositoryLayouts.get( roleHint );
            if ( repoLayout != null )
```

## RuleId[id=TestCaseWithNoTestMethods]
### TestCaseWithNoTestMethods
Test class `NoClassDefFoundErrorInterfaceMojo` has no tests
in `core-it-support/core-it-plugins/maven-it-plugin-error/src/main/java/org/apache/maven/plugin/coreit/NoClassDefFoundErrorInterfaceMojo.java`
#### Snippet
```java
 */
@Mojo( name = "no-class-def-found-error-mojo", requiresProject = false )
public class NoClassDefFoundErrorInterfaceMojo
        extends TestCase
        implements org.apache.maven.plugin.Mojo
```

