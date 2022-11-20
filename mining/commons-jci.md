# commons-jci 
 
# Bad smells
I found 137 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=AccessStaticViaInstance] | 23 | false |
| RuleId[ruleID=ReturnNull] | 14 | false |
| RuleId[ruleID=MissortedModifiers] | 13 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 11 | true |
| RuleId[ruleID=SystemOutErr] | 10 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 8 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 7 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 6 | false |
| RuleId[ruleID=DataFlowIssue] | 5 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 3 | true |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 3 | false |
| RuleId[ruleID=ArrayEquality] | 3 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 3 | true |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 2 | false |
| RuleId[ruleID=CommentedOutCode] | 2 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 2 | false |
| RuleId[ruleID=BoundedWildcard] | 2 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 2 | false |
| RuleId[ruleID=BusyWait] | 2 | false |
| RuleId[ruleID=ConstantValue] | 2 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=TrivialStringConcatenation] | 1 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 1 | false |
| RuleId[ruleID=JavaLangImport] | 1 | false |
| RuleId[ruleID=NestedAssignment] | 1 | false |
| RuleId[ruleID=InfiniteLoopStatement] | 1 | false |
| RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=SynchronizeOnThis] | 1 | false |
| RuleId[ruleID=CopyConstructorMissesField] | 1 | false |
| RuleId[ruleID=UnusedAssignment] | 1 | false |
| RuleId[ruleID=UseBulkOperation] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[resources.size()\]'
in `core/src/main/java/org/apache/commons/jci2/readers/MemoryResourceReader.java`
#### Snippet
```java
            return new String[0];
        }
        return resources.keySet().toArray(new String[resources.size()]);
    }
}
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[files.size()\]'
in `core/src/main/java/org/apache/commons/jci2/readers/FileResourceReader.java`
#### Snippet
```java
        final List<String> files = new ArrayList<String>();
        list(root, files);
        return files.toArray(new String[files.size()]);
    }

```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[files.size()\]'
in `core/src/main/java/org/apache/commons/jci2/stores/FileResourceStore.java`
#### Snippet
```java
        final List<String> files = new ArrayList<String>();
        list(root, files);
        return files.toArray(new String[files.size()]);
    }

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConversionUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/commons/jci2/utils/ConversionUtils.java`
#### Snippet
```java
 * @author tcurdt
 */
public final class ConversionUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommandlineCompiler` has only 'static' members, and lacks a 'private' constructor
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java
 * @author tcurdt
 */
public final class CommandlineCompiler {

    public static void main( final String[] args ) throws Exception {
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Dereference of `directoryFiles` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jci2/readers/FileResourceReader.java`
#### Snippet
```java
        if (pFile.isDirectory()) {
            final File[] directoryFiles = pFile.listFiles();
            for (final File directoryFile : directoryFiles) {
                list(directoryFile, pFiles);
            }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `directoryFiles` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jci2/stores/FileResourceStore.java`
#### Snippet
```java
        if (pFile.isDirectory()) {
            final File[] directoryFiles = pFile.listFiles();
            for (final File directoryFile : directoryFiles) {
                list(directoryFile, pFiles);
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `close` may produce `NullPointerException`
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
                    } finally {
                    	try {
							is.close();
						} catch (final IOException e) {
						}
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerFactory.java`
#### Snippet
```java
                classCache.put(className, clazz);
            } catch (final ClassNotFoundException e) {
                clazz = null;
            }
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `createDefaultSettings` may produce `NullPointerException`
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        final JavaCompiler compiler = new JavaCompilerFactory().createCompiler("eclipse");
        final JavaCompilerSettings settings = compiler.createDefaultSettings();


```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (8 lines)
in `core/src/main/java/org/apache/commons/jci2/utils/ConversionUtils.java`
#### Snippet
```java
    }

/*
    public static String clazzName( final File base, final File file ) {
        final int rootLength = base.getAbsolutePath().length();
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java
                    .create( "nowarn" ));

//        final HelpFormatter formatter = new HelpFormatter();
//        formatter.printHelp("jci2", options);

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'classloader' in a Serializable class
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/ServerPageServlet.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final ReloadingClassLoader classloader = new ReloadingClassLoader(ServerPageServlet.class.getClassLoader());
    private FilesystemAlterationMonitor fam;
    private CompilingListener jspListener;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'fam' in a Serializable class
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/ServerPageServlet.java`
#### Snippet
```java

    private final ReloadingClassLoader classloader = new ReloadingClassLoader(ServerPageServlet.class.getClassLoader());
    private FilesystemAlterationMonitor fam;
    private CompilingListener jspListener;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'jspListener' in a Serializable class
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/ServerPageServlet.java`
#### Snippet
```java
    private final ReloadingClassLoader classloader = new ReloadingClassLoader(ServerPageServlet.class.getClassLoader());
    private FilesystemAlterationMonitor fam;
    private CompilingListener jspListener;

    private Map<String, HttpServlet> servletsByClassname = new HashMap<String, HttpServlet>();
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java
                    try {
                        pSignal.wait(1000);
                    } catch (final InterruptedException e) {
                    }

```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationMonitor.java`
#### Snippet
```java
            try {
                thread.join(delay);
            } catch (final InterruptedException e) {
            }
        }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationMonitor.java`
#### Snippet
```java
            try {
                Thread.sleep(delay);
            } catch (final InterruptedException e) {
            }
        }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `compilers/rhino/src/main/java/org/apache/commons/jci2/compilers/RhinoJavaCompiler.java`
#### Snippet
```java
            try {
                cl.loadClass(clazzName);
            } catch (final ClassNotFoundException e) {
            }
        }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
                    	try {
							is.close();
						} catch (final IOException e) {
						}
                    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
            }
        }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java
            try {
				output.close();
			} catch (final IOException e) {
			}
        }
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`createdFiles.size() > 0` can be replaced with '!createdFiles.isEmpty()'
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java

    protected void signals() {
        if (createdFiles.size() > 0 || createdDirectories.size() > 0 ||
            changedFiles.size() > 0 || changedDirectories.size() > 0 ||
            deletedFiles.size() > 0 || deletedDirectories.size() > 0) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`createdDirectories.size() > 0` can be replaced with '!createdDirectories.isEmpty()'
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java

    protected void signals() {
        if (createdFiles.size() > 0 || createdDirectories.size() > 0 ||
            changedFiles.size() > 0 || changedDirectories.size() > 0 ||
            deletedFiles.size() > 0 || deletedDirectories.size() > 0) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`changedFiles.size() > 0` can be replaced with '!changedFiles.isEmpty()'
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java
    protected void signals() {
        if (createdFiles.size() > 0 || createdDirectories.size() > 0 ||
            changedFiles.size() > 0 || changedDirectories.size() > 0 ||
            deletedFiles.size() > 0 || deletedDirectories.size() > 0) {

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`changedDirectories.size() > 0` can be replaced with '!changedDirectories.isEmpty()'
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java
    protected void signals() {
        if (createdFiles.size() > 0 || createdDirectories.size() > 0 ||
            changedFiles.size() > 0 || changedDirectories.size() > 0 ||
            deletedFiles.size() > 0 || deletedDirectories.size() > 0) {

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`deletedFiles.size() > 0` can be replaced with '!deletedFiles.isEmpty()'
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java
        if (createdFiles.size() > 0 || createdDirectories.size() > 0 ||
            changedFiles.size() > 0 || changedDirectories.size() > 0 ||
            deletedFiles.size() > 0 || deletedDirectories.size() > 0) {

            log.debug("event signal");
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`deletedDirectories.size() > 0` can be replaced with '!deletedDirectories.isEmpty()'
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java
        if (createdFiles.size() > 0 || createdDirectories.size() > 0 ||
            changedFiles.size() > 0 || changedDirectories.size() > 0 ||
            deletedFiles.size() > 0 || deletedDirectories.size() > 0) {

            log.debug("event signal");
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`deleted.size() > 0` can be replaced with '!deleted.isEmpty()'
in `core/src/main/java/org/apache/commons/jci2/listeners/ReloadingListener.java`
#### Snippet
```java
        log.debug("created:" + created.size() + " changed:" + changed.size() + " deleted:" + deleted.size() + " resources");

        if (deleted.size() > 0) {
            for (final File file : deleted) {
                final String resourceName = ConversionUtils.getResourceNameFromFileName(ConversionUtils.relative(pObserver.getRootDirectory(), file));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`created.size() > 0` can be replaced with '!created.isEmpty()'
in `core/src/main/java/org/apache/commons/jci2/listeners/ReloadingListener.java`
#### Snippet
```java
        }

        if (created.size() > 0) {
            for (final File file : created) {
                FileInputStream is = null;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`changed.size() > 0` can be replaced with '!changed.isEmpty()'
in `core/src/main/java/org/apache/commons/jci2/listeners/ReloadingListener.java`
#### Snippet
```java
        }

        if (changed.size() > 0) {
            for (final File file : changed) {
                FileInputStream is = null;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`deleted.size() > 0` can be replaced with '!deleted.isEmpty()'
in `core/src/main/java/org/apache/commons/jci2/listeners/CompilingListener.java`
#### Snippet
```java
        log.debug("created:" + created.size() + " changed:" + changed.size() + " deleted:" + deleted.size() + " resources");

        if (deleted.size() > 0) {
            for (final File deletedFile : deleted) {
                final String resourceName = ConversionUtils.getResourceNameFromFileName(ConversionUtils.relative(pObserver.getRootDirectory(), deletedFile));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`problems.size() > 0` can be replaced with '!problems.isEmpty()'
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
        }

        if (problems.size() > 0) {
            final CompilationProblem[] result = new CompilationProblem[problems.size()];
            problems.toArray(result);
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder sb` can be replaced with 'String'
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseCompilationProblem.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getFileName()).append(" (");
        sb.append(getStartLine());
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder sb` can be replaced with 'String'
in `compilers/janino/src/main/java/org/apache/commons/jci2/compilers/JaninoCompilationProblem.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getFileName()).append(" (");
        sb.append(getStartLine());
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `core/src/main/java/org/apache/commons/jci2/stores/MemoryResourceStore.java`
#### Snippet
```java
    @Override
    public String toString() {
        return this.getClass().getName() + store.toString();
    }
}
```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `core/src/main/java/org/apache/commons/jci2/stores/ResourceStoreClassLoader.java`
#### Snippet
```java

    private String getId() {
        return "" + this + "[" + this.getClass().getClassLoader() + "]";
    }
}
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/org/apache/commons/jci2/readers/FileResourceReader.java`
#### Snippet
```java
     */
    @Deprecated
    private void list( final File pFile, final List<String> pFiles ) {
        if (pFile.isDirectory()) {
            final File[] directoryFiles = pFile.listFiles();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/org/apache/commons/jci2/stores/FileResourceStore.java`
#### Snippet
```java
     */
    @Deprecated
    private void list(final File pFile, final List<String> pFiles) {
        if (pFile.isDirectory()) {
            final File[] directoryFiles = pFile.listFiles();
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java


    private final static class Signal {
        public boolean triggered;
    }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `compilers/janino/src/main/java/org/apache/commons/jci2/compilers/JaninoJavaCompiler.java`
#### Snippet
```java
    }

    private final static class JciResource implements Resource {

    	private final String name;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `compilers/janino/src/main/java/org/apache/commons/jci2/compilers/JaninoJavaCompiler.java`
#### Snippet
```java
    }

    private final static class JciOutputStream extends ByteArrayOutputStream {

    	private final String name;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final private`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompilerSettings.java`
#### Snippet
```java
public final class EclipseJavaCompilerSettings extends JavaCompilerSettings {

    final private Map<String, String> defaultEclipseSettings = new HashMap<String, String>();

    public EclipseJavaCompilerSettings() {
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java

        private final static int TYPE_UNKNOWN = 0;
        private final static int TYPE_FILE = 1;
        private final static int TYPE_DIRECTORY = 2;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
    private final class Entry {

        private final static int TYPE_UNKNOWN = 0;
        private final static int TYPE_FILE = 1;
        private final static int TYPE_DIRECTORY = 2;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
        private final static int TYPE_UNKNOWN = 0;
        private final static int TYPE_FILE = 1;
        private final static int TYPE_DIRECTORY = 2;

        private final MonitorFile file;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
    }

    private final static class MonitorFileImpl implements MonitorFile {

        private final File file;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final private`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
        final private String clazzName;
        final private String fileName;
        final private char[] typeName;
        final private char[][] packageName;
        final private ResourceReader reader;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final private`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
    final class CompilationUnit implements ICompilationUnit {

        final private String clazzName;
        final private String fileName;
        final private char[] typeName;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final private`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java

        final private String clazzName;
        final private String fileName;
        final private char[] typeName;
        final private char[][] packageName;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final private`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
        final private char[] typeName;
        final private char[][] packageName;
        final private ResourceReader reader;

        CompilationUnit( final ResourceReader pReader, final String pSourceFile ) {
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final private`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
        final private String fileName;
        final private char[] typeName;
        final private char[][] packageName;
        final private ResourceReader reader;

```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `core/src/main/java/org/apache/commons/jci2/stores/FileResourceStore.java`
#### Snippet
```java

    public void remove( final String pResourceName ) {
        getFile(pResourceName).delete();
    }

```

## RuleId[ruleID=AccessStaticViaInstance]
### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("a.jar:b.jar")
                    .hasArg()
                    .withValueSeparator( ':' )
                    .withDescription("Specify where to find user class files")
                    .create( "classpath" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("a.jar:b.jar")
                    .hasArg()
                    .withValueSeparator( ':' )
                    .withDescription("Specify where to find user class files")
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("a.jar:b.jar")
                    .hasArg()
                    .withValueSeparator( ':' )
                    .withDescription("Specify where to find user class files")
                    .create( "classpath" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withValueSeparator(char)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("a.jar:b.jar")
                    .hasArg()
                    .withValueSeparator( ':' )
                    .withDescription("Specify where to find user class files")
                    .create( "classpath" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("release")
                    .hasArg()
                    .withDescription("Provide source compatibility with specified release")
                    .create( "source" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("release")
                    .hasArg()
                    .withDescription("Provide source compatibility with specified release")
                    .create( "source" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("release")
                    .hasArg()
                    .withDescription("Provide source compatibility with specified release")
                    .create( "source" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("release")
                    .hasArg()
                    .withDescription("Generate class files for specific VM version")
                    .create( "target" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("release")
                    .hasArg()
                    .withDescription("Generate class files for specific VM version")
                    .create( "target" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("release")
                    .hasArg()
                    .withDescription("Generate class files for specific VM version")
                    .create( "target" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("path")
                    .hasArg()
                    .withDescription("Specify where to find input source files")
                    .create( "sourcepath" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("path")
                    .hasArg()
                    .withDescription("Specify where to find input source files")
                    .create( "sourcepath" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("path")
                    .hasArg()
                    .withDescription("Specify where to find input source files")
                    .create( "sourcepath" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("directory")
                    .hasArg()
                    .withDescription("Specify where to place generated class files")
                    .create( "d" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("directory")
                    .hasArg()
                    .withDescription("Specify where to place generated class files")
                    .create( "d" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("directory")
                    .hasArg()
                    .withDescription("Specify where to place generated class files")
                    .create( "d" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("num")
                    .hasArg()
                    .withDescription("Stop compilation after these number of errors")
                    .create( "Xmaxerrs" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("num")
                    .hasArg()
                    .withDescription("Stop compilation after these number of errors")
                    .create( "Xmaxerrs" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("num")
                    .hasArg()
                    .withDescription("Stop compilation after these number of errors")
                    .create( "Xmaxerrs" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("num")
                    .hasArg()
                    .withDescription("Stop compilation after these number of warning")
                    .create( "Xmaxwarns" ));

        options.addOption(
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.hasArg()' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("num")
                    .hasArg()
                    .withDescription("Stop compilation after these number of warning")
                    .create( "Xmaxwarns" ));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withArgName("num")
                    .hasArg()
                    .withDescription("Stop compilation after these number of warning")
                    .create( "Xmaxwarns" ));

```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.commons.cli.OptionBuilder.create(java.lang.String)' accessed via instance reference
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        options.addOption(
                OptionBuilder.withDescription("Generate no warnings")
                    .create( "nowarn" ));

//        final HelpFormatter formatter = new HelpFormatter();
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java

                if (hasChanged()) {
                    System.out.println("Configuration change detected " + configFile);

                    final Properties props = new Properties();
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
                        props.load(is);

                        System.out.println("Notifying about configuration change " + configFile);

                        for (final Configurable configurable : configurables) {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java

                    } catch (final Exception e) {
                        System.err.println("Failed to load configuration " + configFile);
                    } finally {
                    	try {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
        final File configFile = new File("some.properties");

        System.out.println("Watching " + configFile.getAbsolutePath());

        final Collection<Configurable> configurables = new ArrayList<Configurable>();
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/Something.java`
#### Snippet
```java

    public void configure( final Properties properties ) throws ConfigurationException {
        System.out.println("Configuration changed");
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

                if (pProblem.isError()) {
                    System.err.println(pProblem);

                    errors++;
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java
                } else {
                    if (!nowarn) {
                        System.err.println(pProblem);
                    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        for (final String element : resource) {
            System.out.println("compiling " + element);
        }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java
        final CompilationResult result = compiler.compile(resource, reader, store, classloader);

        System.out.println( result.getErrors().length + " errors");
        System.out.println( result.getWarnings().length + " warnings");

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java

        System.out.println( result.getErrors().length + " errors");
        System.out.println( result.getWarnings().length + " warnings");

    }
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `onStop()` only delegates to its super method
in `core/src/main/java/org/apache/commons/jci2/listeners/FileChangeListener.java`
#### Snippet
```java

    @Override
    public void onStop( final FilesystemAlterationObserver pObserver ) {
        super.onStop(pObserver);
    }
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common part can be extracted from 'if'
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
                final long currentModified = file.lastModified();

                if (currentModified != lastModified) {
                    // last modified has changed
                    lastModified = currentModified;
```

## RuleId[ruleID=JavaLangImport]
### RuleId[ruleID=JavaLangImport]
Unnecessary import from the 'java.lang' package
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/ServerPageServlet.java`
#### Snippet
```java
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
                int count;
                try {
                    while ((count = is.read(buffer, 0, buffer.length)) > 0) {
                        baos.write(buffer, 0, count);
                    }
```

## RuleId[ruleID=InfiniteLoopStatement]
### RuleId[ruleID=InfiniteLoopStatement]
`while` statement cannot complete without throwing an exception
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
		configurables.add(new Something());

        while(true) {
            try {
                Thread.sleep(1000);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `observers` is accessed in both synchronized and unsynchronized contexts
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationMonitor.java`
#### Snippet
```java

    private final Object observersLock = new Object();
    private Map<File, FilesystemAlterationObserver> observers = Collections.unmodifiableMap(new HashMap<File, FilesystemAlterationObserver>());

    /** delay between calls to {@link FilesystemAlterationObserver#checkAndNotify()}, default 3000 ms */
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `listeners` is accessed in both synchronized and unsynchronized contexts
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
    private final Entry rootEntry;

    private FilesystemAlterationListener[] listeners = new FilesystemAlterationListener[0];
    private final Set<FilesystemAlterationListener> listenersSet = new HashSet<FilesystemAlterationListener>();

```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerSettings.java`
#### Snippet
```java
    /** @deprecated */
    @Deprecated
    private boolean verbose = false;

    public JavaCompilerSettings() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerSettings.java`
#### Snippet
```java
    private String sourceEncoding = "UTF-8";
    private boolean warnings = false;
    private boolean deprecations = false;
    private boolean debug = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerSettings.java`
#### Snippet
```java
    private boolean warnings = false;
    private boolean deprecations = false;
    private boolean debug = false;

    /** @deprecated */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerSettings.java`
#### Snippet
```java
    private String sourceVersion = "1.4";
    private String sourceEncoding = "UTF-8";
    private boolean warnings = false;
    private boolean deprecations = false;
    private boolean debug = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jci2/readers/MemoryResourceReader.java`
#### Snippet
```java
public class MemoryResourceReader implements ResourceReader {

    private Map<String, byte[]> resources = null;

    public boolean isAvailable( final String pResourceName ) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationMonitor.java`
#### Snippet
```java
    /** delay between calls to {@link FilesystemAlterationObserver#checkAndNotify()}, default 3000 ms */
    private volatile long delay = 3000; // volatile because shared with daemon thread
    private Thread thread = null;

    private volatile boolean running = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java
        final int maxWarnings = maxwarns;
        compiler.setCompilationProblemHandler(new CompilationProblemHandler() {
            int errors = 0;
            int warnings = 0;
            public boolean handle(final CompilationProblem pProblem) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `examples/src/main/java/org/apache/commons/jci2/examples/commandline/CommandlineCompiler.java`
#### Snippet
```java
        compiler.setCompilationProblemHandler(new CompilationProblemHandler() {
            int errors = 0;
            int warnings = 0;
            public boolean handle(final CompilationProblem pProblem) {

```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `pSignal`
in `fam/src/main/java/org/apache/commons/jci2/listeners/AbstractFilesystemAlterationListener.java`
#### Snippet
```java
        int i = 0;
        while(true) {
            synchronized(pSignal) {
                if (!pSignal.triggered) {
                    try {
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-20-02-25-33.486.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/commons/jci2/stores/ResourceStoreClassLoader.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/commons/jci2/readers/FileResourceReader.java`
#### Snippet
```java
            return FileUtils.readFileToString(new File(root, pResourceName), "UTF-8").getBytes();
        } catch(final Exception e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/commons/jci2/stores/FileResourceStore.java`
#### Snippet
```java
            return data;
        } catch (final Exception e) {
            return null;
        } finally {
            IOUtils.closeQuietly(is);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/janino/src/main/java/org/apache/commons/jci2/compilers/JaninoJavaCompiler.java`
#### Snippet
```java
						if (bytes == null) {
							log.debug("failed to find " + pResourceName);
							return null;
						}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/janino/src/main/java/org/apache/commons/jci2/compilers/JaninoJavaCompiler.java`
#### Snippet
```java
						if (bytes == null) {
							log.debug("failed to find source " + pSourceName);
							return null;
						}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerFactory.java`
#### Snippet
```java

        if (clazz == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerFactory.java`
#### Snippet
```java
            return (JavaCompiler) clazz.newInstance();
        } catch (final Throwable t) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java

        } catch (final IOException e) {
            return null;
        } finally {
            try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java

            if (content == null) {
                return null;
                //throw new RuntimeException("resource " + fileName + " could not be found");
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java

                if (isPackage(pClazzName)) {
                    return null;
                }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
                    } catch (final ClassFormatException e) {
                        log.error("wrong class format", e);
                        return null;
                    }
                }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
                if (is == null) {
                    log.debug("class " + pClazzName + " not found");
                    return null;
                }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
                } catch (final IOException e) {
                    log.error("could not read class", e);
                    return null;
                } catch (final ClassFormatException e) {
                    log.error("wrong class format", e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `compilers/eclipse/src/main/java/org/apache/commons/jci2/compilers/EclipseJavaCompiler.java`
#### Snippet
```java
                } catch (final ClassFormatException e) {
                    log.error("wrong class format", e);
                    return null;
                } finally {
                    try {
```

## RuleId[ruleID=ArrayEquality]
### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java
                    w++;
                    if (watch.length == w) {
                        if (watch == open) {
                            // found open

```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java
                            sb = new StringBuilder();
                            watch = close;
                        } else if (watch == close) {
                            // found close

```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java
            }

            if (watch == open) {
                wrap(sb, output);
            }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `withoutExtension` is redundant
in `core/src/main/java/org/apache/commons/jci2/utils/ConversionUtils.java`
#### Snippet
```java
            return pResourceName;
        }
        final String withoutExtension = pResourceName.substring(0, i);
        return withoutExtension;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `relFileName` is redundant
in `core/src/main/java/org/apache/commons/jci2/utils/ConversionUtils.java`
#### Snippet
```java
        final int rootLength = base.getAbsolutePath().length();
        final String absFileName = file.getAbsolutePath();
        final String relFileName = absFileName.substring(rootLength + 1);
        return relFileName;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `data` is redundant
in `core/src/main/java/org/apache/commons/jci2/stores/FileResourceStore.java`
#### Snippet
```java
        try {
            is = new FileInputStream(getFile(pResourceName));
            final byte[] data = IOUtils.toByteArray(is);
            return data;
        } catch (final Exception e) {
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `core/src/main/java/org/apache/commons/jci2/listeners/CompilingListener.java`
#### Snippet
```java
            final CompilationResult result = compiler.compile(resourcesToCompile, reader, transactionalStore);

            synchronized(this) {
                lastResult = result;
            }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/commons/jci2/readers/MemoryResourceReader.java`
#### Snippet
```java
    public String[] list() {
        if (resources == null) {
            return new String[0];
        }
        return resources.keySet().toArray(new String[resources.size()]);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/commons/jci2/ReloadingClassLoader.java`
#### Snippet
```java

    private final ClassLoader parent;
    private ResourceStore[] stores = new ResourceStore[0];
    private ClassLoader delegate;

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationMonitor.java`
#### Snippet
```java

        if (observer == null) {
            return new FilesystemAlterationListener[0];
        }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/commons/jci2/stores/MemoryResourceStore.java`
#### Snippet
```java
    public String[] list() {
        if (store == null) {
            return new String[0];
        }
        final List<String> names = new ArrayList<String>();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
            final File[] children = file.listFiles();
            if (children == null) { // not a directory or IOError (e.g. protection issue)
                return new MonitorFile[0];
            }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationObserverImpl.java`
#### Snippet
```java
    private final Entry rootEntry;

    private FilesystemAlterationListener[] listeners = new FilesystemAlterationListener[0];
    private final Set<FilesystemAlterationListener> listenersSet = new HashSet<FilesystemAlterationListener>();

```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `fam/src/main/java/org/apache/commons/jci2/monitor/FilesystemAlterationMonitor.java`
#### Snippet
```java

            try {
                Thread.sleep(delay);
            } catch (final InterruptedException e) {
            }
```

### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `examples/src/main/java/org/apache/commons/jci2/examples/configuration/ConfigurationReloading.java`
#### Snippet
```java
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
            }
```

## RuleId[ruleID=CopyConstructorMissesField]
### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'verbose'
in `core/src/main/java/org/apache/commons/jci2/compilers/JavaCompilerSettings.java`
#### Snippet
```java
    }

    public JavaCompilerSettings( final JavaCompilerSettings pSettings ) {
    	targetVersion = pSettings.targetVersion;
    	sourceVersion = pSettings.sourceVersion;
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
The value `""` assigned to `packageName` is never used
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java
            if (p < 0) {
                className = ConversionUtils.stripExtension(pResourceName);
                packageName = "";
            } else {
                className = ConversionUtils.stripExtension(pResourceName.substring(p+1));
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `store == null` is always `false`
in `core/src/main/java/org/apache/commons/jci2/stores/MemoryResourceStore.java`
#### Snippet
```java
    @Deprecated
    public String[] list() {
        if (store == null) {
            return new String[0];
        }
```

### RuleId[ruleID=ConstantValue]
Condition `watch == close` is always `true`
in `examples/src/main/java/org/apache/commons/jci2/examples/serverpages/JspGenerator.java`
#### Snippet
```java
                            sb = new StringBuilder();
                            watch = close;
                        } else if (watch == close) {
                            // found close

```

## RuleId[ruleID=UseBulkOperation]
### RuleId[ruleID=UseBulkOperation]
Iteration can be replaced with bulk 'Collection.addAll()' call
in `core/src/main/java/org/apache/commons/jci2/stores/MemoryResourceStore.java`
#### Snippet
```java

        for (final String name : store.keySet()) {
            names.add(name);
        }

```

