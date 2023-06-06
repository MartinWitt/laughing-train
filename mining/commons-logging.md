# commons-logging 
 
# Bad smells
I found 74 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 28 | false |
| CStyleArrayDeclaration | 6 | false |
| ConstantValue | 5 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| FinalStaticMethod | 4 | false |
| NonAtomicOperationOnVolatileField | 4 | false |
| JavadocDeclaration | 3 | false |
| FinalPrivateMethod | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| DanglingJavadoc | 3 | false |
| RedundantCast | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| SynchronizeOnNonFinalField | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| DuplicatedCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| DuplicateThrows | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `dateFormatter`
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
            final Date now = new Date();
            String dateText;
            synchronized(dateFormatter) {
                dateText = dateFormatter.format(now);
            }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
                    BufferedReader rd;
                    try {
                        rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    } catch (final java.io.UnsupportedEncodingException e) {
                        rd = new BufferedReader(new InputStreamReader(is));
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/apache/commons/logging/impl/ServletContextCleaner.java`
#### Snippet
```java
            try {
                final Class logFactoryClass = loader.loadClass("org.apache.commons.logging.LogFactory");
                final Method releaseMethod = logFactoryClass.getMethod("release", RELEASE_SIGNATURE);
                releaseMethod.invoke(null, params);
                loader = logFactoryClass.getClassLoader().getParent();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
    private static InputStream getResourceAsStream(final String name) {
        return (InputStream)AccessController.doPrivileged(
            new PrivilegedAction() {
                @Override
                public Object run() {
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
        final Class[] argtypes = new Class[1];
        argtypes[0] = "".getClass();
        logImplctor = logclass.getConstructor(argtypes);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Set'
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
     */
    static public String[] getLogNames() {
        return (String[]) logs.keySet().toArray(EMPTY_STRING_ARRAY);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Hashtable'
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
        if (null == log) {
            log = makeNewLogInstance(name);
            logs.put(name, log);
        }
        return log;
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
            final Class[] argtypes = new Class[1];
            argtypes[0] = "".getClass();
            logImplctor = logclass.getConstructor(argtypes);
        } catch (final Throwable t) {
            logImplctor = null;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/logging/impl/WeakHashtable.java`
#### Snippet
```java
            WeakKey key;
            while ((key = (WeakKey) queue.poll()) != null) {
                toRemove.add(key.getReferenced());
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'WeakReference(T, ReferenceQueue)' as a member of raw type 'java.lang.ref.WeakReference'
in `src/main/java/org/apache/commons/logging/impl/WeakHashtable.java`
#### Snippet
```java
                        final ReferenceQueue queue,
                        final Referenced referenced) {
            super(key, queue);
            this.referenced = referenced;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'WeakReference(T)' as a member of raw type 'java.lang.ref.WeakReference'
in `src/main/java/org/apache/commons/logging/impl/WeakHashtable.java`
#### Snippet
```java
         */
        private Referenced(final Object referant) {
            reference = new WeakReference(referant);
            // Calc a permanent hashCode so calls to Hashtable.remove()
            // work if the WeakReference has been cleared
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Hashtable'
in `src/main/java/org/apache/commons/logging/impl/WeakHashtable.java`
#### Snippet
```java

        final Referenced keyRef = new Referenced(key, queue);
        return super.put(keyRef, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `src/main/java/org/apache/commons/logging/impl/WeakHashtable.java`
#### Snippet
```java
            if (key != null) {
                final Entry dereferencedEntry = new Entry(key, value);
                unreferencedEntries.add(dereferencedEntry);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `src/main/java/org/apache/commons/logging/impl/WeakHashtable.java`
#### Snippet
```java
            final Object keyValue = referenceKey.getValue();
            if (keyValue != null) {
                unreferencedKeys.add(keyValue);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
                }
            };
        return (Properties) AccessController.doPrivileged(action);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
                }
            };
        final Object result = AccessController.doPrivileged(action);
        return (Enumeration) result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader)AccessController.doPrivileged(
            new PrivilegedAction() {
                @Override
                public Object run() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
    private static InputStream getResourceAsStream(final ClassLoader loader, final String name) {
        return (InputStream)AccessController.doPrivileged(
            new PrivilegedAction() {
                @Override
                public Object run() {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Hashtable'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
                nullClassLoaderFactory = factory;
            } else {
                factories.put(classLoader, factory);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
        throws SecurityException {
        return (String) AccessController.doPrivileged(
                new PrivilegedAction() {
                    @Override
                    public Object run() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
        // ClassCastException can be thrown.
        final Object result = AccessController.doPrivileged(
            new PrivilegedAction() {
                @Override
                public Object run() {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
                    final Class factoryFromCustomLoader
                        = Class.forName("org.apache.commons.logging.LogFactory", false, logFactoryClassLoader);
                    implementsLogFactory = factoryFromCustomLoader.isAssignableFrom(logFactoryClass);
                    if (implementsLogFactory) {
                        logDiagnostic("[CUSTOM LOG FACTORY] " + logFactoryClass.getName() +
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Hashtable'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
            attributes.remove(name);
        } else {
            attributes.put(name, value);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Hashtable'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
        if (instance == null) {
            instance = newInstance(name);
            instances.put(name, instance);
        }
        return instance;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
        try {
            return (ClassLoader)AccessController.doPrivileged(
                    new PrivilegedAction() {
                        @Override
                        public Object run() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
        throws LogConfigurationException {
        return (ClassLoader)AccessController.doPrivileged(
            new PrivilegedAction() {
                @Override
                public Object run() {
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
                }

                constructor = c.getConstructor(logConstructorSignature);
                final Object o = constructor.newInstance(params);

```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
            // Identify the {@code setLogFactory} method (if there is one)
            try {
                this.logMethod = logAdapterClass.getMethod("setLogFactory", logMethodSignature);
                logDiagnostic("Found method setLogFactory(LogFactory) in '" + logAdapterClassName + "'");
            } catch (final Throwable t) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedAction' to 'java.security.PrivilegedAction'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
        throws SecurityException {
        return (String) AccessController.doPrivileged(
                new PrivilegedAction() {
                    @Override
                    public Object run() {
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Set'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
    @Override
    public String[] getAttributeNames() {
        return (String[]) attributes.keySet().toArray(EMPTY_STRING_ARRAY);
    }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `logFactoryClass.newInstance()` to `LogFactory` is redundant
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
                    }

                    return (LogFactory) logFactoryClass.newInstance();

                } catch (final ClassNotFoundException ex) {
```

### RedundantCast
Casting `logFactoryClass.newInstance()` to `LogFactory` is redundant
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
            }
            logFactoryClass = Class.forName(factoryClass);
            return (LogFactory) logFactoryClass.newInstance();
        } catch (final Exception e) {
            // Check to see if we've got a bad configuration
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param prefix` tag description is missing
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * and it's hierarchy. The prefix is prepended to the message
     * and is intended to make it easier to understand the logs.
     * @param prefix
     * @param classLoader
     */
```

### JavadocDeclaration
`@param classLoader` tag description is missing
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * and is intended to make it easier to understand the logs.
     * @param prefix
     * @param classLoader
     */
    private static void logHierarchy(final String prefix, ClassLoader classLoader) {
```

### JavadocDeclaration
`@param factoryClass` tag description is missing
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * Implements the operations described in the javadoc for newFactory.
     *
     * @param factoryClass
     * @param classLoader used to load the specified factory class. This is
     *  expected to be either the TCCL or the classloader which loaded this
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'nullClassLoaderFactory' is still used
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     */
    @Deprecated
    protected static volatile LogFactory nullClassLoaderFactory;

    /**
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `locations`
in `src/main/java/org/apache/commons/logging/impl/Jdk14Logger.java`
#### Snippet
```java
            // Hack (?) to get the stack trace.
            final Throwable dummyException = new Throwable();
            final StackTraceElement locations[] = dummyException.getStackTrace();
            // LOGGING-132: use the provided logger name instead of the class name
            final String cname = name;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `interfaces`
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
        boolean implementsLog = false;
        final String logInterfaceName = Log.class.getName();
        final Class interfaces[] = badClass.getInterfaces();
        for (final Class element : interfaces) {
            if (logInterfaceName.equals(element.getName())) {
```

### CStyleArrayDeclaration
C-style array declaration of field `logMethodSignature`
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
     * The signature of the {@code setLogFactory} method to be used.
     */
    protected Class logMethodSignature[] = { LogFactory.class };

    /**
```

### CStyleArrayDeclaration
C-style array declaration of local variable `params`
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
            }
            else {
                final Object params[] = { name };
                instance = (Log) logConstructor.newInstance(params);
            }
```

### CStyleArrayDeclaration
C-style array declaration of local variable `params`
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java

            if (logMethod != null) {
                final Object params[] = { this };
                logMethod.invoke(instance, params);
            }
```

### CStyleArrayDeclaration
C-style array declaration of field `logConstructorSignature`
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
     * The signature of the Constructor to be used.
     */
    protected Class logConstructorSignature[] = { java.lang.String.class };

    /**
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
            name = name.substring(0,i);
            lvl = getStringProperty(systemPrefix + "log." + name);
            i = String.valueOf(name).lastIndexOf(".");
        }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
                shortLogName = slName.substring(slName.lastIndexOf("/") + 1);
            }
            buf.append(String.valueOf(shortLogName)).append(" - ");
        } else if(showLogName) {
            buf.append(String.valueOf(logName)).append(" - ");
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
            buf.append(String.valueOf(shortLogName)).append(" - ");
        } else if(showLogName) {
            buf.append(String.valueOf(logName)).append(" - ");
        }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java

        // Append the message
        buf.append(String.valueOf(message));

        // Append stack trace if not null
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * @param msg is the diagnostic message to be output.
     */
    private static final void logDiagnostic(final String msg) {
        if (DIAGNOSTICS_STREAM != null) {
            DIAGNOSTICS_STREAM.print(diagnosticPrefix);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * file in the shared classpath if needed.
     */
    private static final Properties getConfigurationFile(final ClassLoader classLoader, final String fileName) {
        Properties props = null;
        double priority = 0.0;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * webapp is undeployed.
     */
    private static final Hashtable createFactoryStore() {
        Hashtable result = null;
        String storeImplementationClass;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
        if (specifiedClass == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property '" +
                          LOG_PROPERTY + "'");
            }
            try {
                specifiedClass = getSystemProperty(LOG_PROPERTY, null);
            } catch (final SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("No access allowed to system property '" +
                        LOG_PROPERTY + "' - " + e.getMessage());
                }
            }
        }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
                name = System.getProperty("org.apache.commons.logging.Log");
            }
        } catch (final Throwable t) {
        }
        if (name != null) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder msg` can be replaced with 'String'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java

            if (isDiagnosticsEnabled()) {
                final StringBuilder msg = new StringBuilder();
                msg.append("Warning: bad log hierarchy. ");
                msg.append("You have more than one version of '");
```

### StringBufferReplaceableByString
`StringBuilder msg` can be replaced with 'String'
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java

            if (isDiagnosticsEnabled()) {
                final StringBuilder msg = new StringBuilder();
                msg.append("[WARNING] Log class '");
                msg.append(badClass.getName());
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.lang.LinkageError', in the throws list already.
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
     */
    static public void setLogImplementation(final Class logclass)
        throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException {
        final Class[] argtypes = new Class[1];
        argtypes[0] = "".getClass();
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * @since 1.1
     */
    protected static final void logRawDiagnostic(final String msg) {
        if (DIAGNOSTICS_STREAM != null) {
            DIAGNOSTICS_STREAM.println(msg);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * @param msg is the diagnostic message to be output.
     */
    private static final void logDiagnostic(final String msg) {
        if (DIAGNOSTICS_STREAM != null) {
            DIAGNOSTICS_STREAM.print(diagnosticPrefix);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * file in the shared classpath if needed.
     */
    private static final Properties getConfigurationFile(final ClassLoader classLoader, final String fileName) {
        Properties props = null;
        double priority = 0.0;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
     * webapp is undeployed.
     */
    private static final Hashtable createFactoryStore() {
        Hashtable result = null;
        String storeImplementationClass;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
        if(t != null) {
            buf.append(" <");
            buf.append(t.toString());
            buf.append(">");

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
            t.printStackTrace(pw);
            pw.close();
            buf.append(sw.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/logging/impl/LogFactoryImpl.java`
#### Snippet
```java
                            final StringWriter sw = new StringWriter();
                            cause2.printStackTrace(new PrintWriter(sw, true));
                            logDiagnostic("... ExceptionInInitializerError: " + sw.toString());
                        }
                    }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
                // ignore
            } catch (final InvocationTargetException e) {
                /**
                 * InvocationTargetException is thrown by 'invoke' when
                 * the method being invoked (getContextClassLoader) throws
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java

        if (factory != null) {
            /**
             * Always cache using context class loader.
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/logging/LogFactory.java`
#### Snippet
```java
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (final SecurityException ex) {
            /**
             * getContextClassLoader() throws SecurityException when
             * the context class loader isn't an ancestor of the
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `(Class[]) null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
            // Get the thread context class loader (if there is one)
            try {
                classLoader = (ClassLoader) method.invoke(Thread.currentThread(), (Class[]) null);
            } catch (final IllegalAccessException e) {
                // ignore
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `null != Class.forName("org.apache.log4j.Logger")` is always `true`
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
        // Is Log4J Available?
        try {
            log4jIsAvailable = null != Class.forName("org.apache.log4j.Logger");
        } catch (final Throwable t) {
            log4jIsAvailable = false;
```

### ConstantValue
Condition `null != Class.forName("java.util.logging.Logger")` is always `true`
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
        // Is JDK 1.4 Logging Available?
        try {
            jdk14IsAvailable = null != Class.forName("java.util.logging.Logger") &&
                               null != Class.forName("org.apache.commons.logging.impl.Jdk14Logger");
        } catch (final Throwable t) {
```

### ConstantValue
Condition `null != Class.forName("java.util.logging.Logger") && null != Class.fo...` is always `true`
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
        // Is JDK 1.4 Logging Available?
        try {
            jdk14IsAvailable = null != Class.forName("java.util.logging.Logger") &&
                               null != Class.forName("org.apache.commons.logging.impl.Jdk14Logger");
        } catch (final Throwable t) {
            jdk14IsAvailable = false;
```

### ConstantValue
Condition `null != Class.forName("org.apache.commons.logging.impl.Jdk14Logger")` is always `true` when reached
in `src/main/java/org/apache/commons/logging/LogSource.java`
#### Snippet
```java
        try {
            jdk14IsAvailable = null != Class.forName("java.util.logging.Logger") &&
                               null != Class.forName("org.apache.commons.logging.impl.Jdk14Logger");
        } catch (final Throwable t) {
            jdk14IsAvailable = false;
```

### ConstantValue
Condition `!Priority.class.isAssignableFrom(Level.class)` is always `false`
in `src/main/java/org/apache/commons/logging/impl/Log4JLogger.java`
#### Snippet
```java

    static {
        if (!Priority.class.isAssignableFrom(Level.class)) {
            // nope, this is log4j 1.3, so force an ExceptionInInitializerError
            throw new InstantiationError("Log4J 1.2 not available");
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `showLogName`
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
        }

        showLogName = getBooleanProperty(systemPrefix + "showlogname", showLogName);
        showShortName = getBooleanProperty(systemPrefix + "showShortLogname", showShortName);
        showDateTime = getBooleanProperty(systemPrefix + "showdatetime", showDateTime);
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `showShortName`
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java

        showLogName = getBooleanProperty(systemPrefix + "showlogname", showLogName);
        showShortName = getBooleanProperty(systemPrefix + "showShortLogname", showShortName);
        showDateTime = getBooleanProperty(systemPrefix + "showdatetime", showDateTime);

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `showDateTime`
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java
        showLogName = getBooleanProperty(systemPrefix + "showlogname", showLogName);
        showShortName = getBooleanProperty(systemPrefix + "showShortLogname", showShortName);
        showDateTime = getBooleanProperty(systemPrefix + "showdatetime", showDateTime);

        if(showDateTime) {
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `dateTimeFormat`
in `src/main/java/org/apache/commons/logging/impl/SimpleLog.java`
#### Snippet
```java

        if(showDateTime) {
            dateTimeFormat = getStringProperty(systemPrefix + "dateTimeFormat",
                                               dateTimeFormat);
            try {
```

