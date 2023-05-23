# maven-verifier 
 
# Bad smells
I found 16 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantArrayCreation | 5 | true |
| DeprecatedIsStillUsed | 3 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| AutoCloseableResource | 1 | false |
| IOStreamConstructor | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| DataFlowIssue | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| UnnecessaryInitCause | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
            try
            {
                Object result = doMain.invoke( mavenCli, new Object[] { cliArgs, workingDirectory, out, out } );

                return ( (Number) result ).intValue();
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
            Object launcher = launcherClass.newInstance();

            Method configure = launcherClass.getMethod( "configure", new Class[] { InputStream.class } );

            configure.invoke( launcher, new Object[] { new FileInputStream( config ) } );
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
            Method configure = launcherClass.getMethod( "configure", new Class[] { InputStream.class } );

            configure.invoke( launcher, new Object[] { new FileInputStream( config ) } );

            Method getWorld = launcherClass.getMethod( "getWorld" );
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
            Class<?> cliClass = (Class<?>) getMainClass.invoke( launcher );

            Constructor<?> newMavenCli = cliClass.getConstructor( new Class[] { classWorld.getClass() } );
            Object mavenCli = newMavenCli.newInstance( new Object[] { classWorld } );

```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java

            Constructor<?> newMavenCli = cliClass.getConstructor( new Class[] { classWorld.getClass() } );
            Object mavenCli = newMavenCli.newInstance( new Object[] { classWorld } );

            Class<?>[] parameterTypes = { String[].class, String.class, PrintStream.class, PrintStream.class };
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
        throws LauncherException
    {
        if ( mavenHome == null || mavenHome.length() <= 0 )
        {
            throw new LauncherException( "Invalid Maven home directory " + mavenHome );
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
            Method configure = launcherClass.getMethod( "configure", new Class[] { InputStream.class } );

            configure.invoke( launcher, new Object[] { new FileInputStream( config ) } );

            Method getWorld = launcherClass.getMethod( "getWorld" );
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
            Method configure = launcherClass.getMethod( "configure", new Class[] { InputStream.class } );

            configure.invoke( launcher, new Object[] { new FileInputStream( config ) } );

            Method getWorld = launcherClass.getMethod( "getWorld" );
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `jarFile` is redundant
in `src/main/java/org/apache/maven/shared/verifier/util/ResourceExtractor.java`
#### Snippet
```java
        try
        {
            File jarFile = new File( new URI( jarFileURI ) );
            return jarFile;
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/org/apache/maven/shared/verifier/Verifier.java`
#### Snippet
```java
            } );

            for ( String file : files )
            {
                if ( hasCommand )
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/shared/verifier/util/ResourceExtractor.java`
#### Snippet
```java
        if ( !"jar".equalsIgnoreCase( url.getProtocol() ) )
        {
            throw new IllegalArgumentException( "This is not a Jar URL:" + url.toString() );
        }
        String resourceFilePath = url.getFile();
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'resetStreams' is still used
in `src/main/java/org/apache/maven/shared/verifier/Verifier.java`
#### Snippet
```java
     */
    @Deprecated
    public void resetStreams()
    {
    }
```

### DeprecatedIsStillUsed
Deprecated member 'executeGoal' is still used
in `src/main/java/org/apache/maven/shared/verifier/Verifier.java`
#### Snippet
```java
     */
    @Deprecated
    public void executeGoal( String goal )
        throws VerificationException
    {
```

### DeprecatedIsStillUsed
Deprecated member 'Verifier' is still used
in `src/main/java/org/apache/maven/shared/verifier/Verifier.java`
#### Snippet
```java
     */
    @Deprecated
    public Verifier( String basedir, String settingsFile, boolean debug, String mavenHome )
            throws VerificationException
    {
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/maven/shared/verifier/Embedded3xLauncher.java`
#### Snippet
```java
                    catch ( MalformedURLException e )
                    {
                        throw (RuntimeException) new IllegalStateException().initCause( e );
                    }
                }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/shared/verifier/util/ResourceExtractor.java`
#### Snippet
```java
                    if ( ze.isDirectory() )
                    {
                        destFile.mkdirs();
                    }
                    else
```

